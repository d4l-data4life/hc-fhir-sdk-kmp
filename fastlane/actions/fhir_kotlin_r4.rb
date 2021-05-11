require "fileutils"

module Fastlane
  module Actions
    class FhirKotlinR4Action < Action
      def self.run(params)
        cleanup
        generate_fhir_models
        integrate_fhir_models
        cleanup
      end

      def self.generate_fhir_models
          fhir_parser = './fhir-spec-parser'
          resources_path = './fhir/parser'

          # Configure our mappings
          FileUtils.copy("#{resources_path}/r4/config/mappings.py", "#{fhir_parser}/mappings.py")
          FileUtils.copy("#{resources_path}/r4/config/settings.py", "#{fhir_parser}/settings.py")
          FileUtils.copy_entry("#{resources_path}/r4/templates", "#{fhir_parser}/templates")

          # Create a cache for the FHIR JSON models
          cache_src = File.join('.', 'fhir-spec', 'hl7.org','fhir','r4')
          cache_dst = File.join(fhir_parser, "downloads")
          FileUtils.mkdir(cache_dst)
          FileUtils.copy(File.join(cache_src, "version.info"), cache_dst)
          Zip::File.open(File.join(cache_src, "examples-json.zip")) do |zipfile|
            zipfile.each do |f|
              zipfile.extract(f, File.join(cache_dst, f.name))
            end
          end

          # Generate files
          Dir.chdir("#{fhir_parser}") do
            sh "test -d venv || python3 -m venv venv"
            sh "venv/bin/pip install -Ur requirements.txt"
            sh "venv/bin/python generate.py --cache-only"
          end

          UI.success "Done generating FHIR R4 models ✅"
      end

      def self.cleanup
          fhir_parser = './fhir-spec-parser'

          # Remove tmp files
          sh "rm -rf #{fhir_parser}/templates"
          sh "rm -rf #{fhir_parser}/models"
          sh "rm -rf #{fhir_parser}/tests"
          sh "rm -rf #{fhir_parser}/dependencies.json"
          sh "rm -rf #{fhir_parser}/mappings.py"
          sh "rm -rf #{fhir_parser}/settings.py"
          sh "rm -rf #{fhir_parser}/downloads"

          UI.success "Done cleanup ✅"
      end

      # Hotfix for https://gesundheitscloud.atlassian.net/browse/SDK-576
	  # TODO Remove once the Spec is fixed
      def self.includeStatics
          modelSource = "./fhir-java/parser/r4/statics"
          modelTarget = "./fhir-java/src-gen/main/java/care/data4life/fhir/r4/model"
          modelTestTarget = "./fhir-java/src-gen/test/java/care/data4life/fhir/r4/model"

          sh "cp #{modelSource}/CodeSystemMedicationStatementStatusCodes.java #{modelTarget}"
          sh "cp #{modelSource}/MedicationStatement.java #{modelTarget}"
          sh "cp #{modelSource}/MedicationStatementTest.java #{modelTestTarget}"
      end

      def self.integrate_fhir_models
          fhir_parser = './fhir-spec-parser'
          file_type = ".kt"

          modelSource = "#{fhir_parser}/models/*"
          codeSystemSource = "#{fhir_parser}/codesystems/*"
          testSource = "#{fhir_parser}/tests/*"

          modelTarget = "./fhir/src-gen/commonMain/kotlin/care/data4life/hl7/fhir/r4/model"
          codeSystemTarget = "./fhir/src-gen/commonMain/kotlin/care/data4life/hl7/fhir/r4/codesystem"
          testTarget = "./fhir/src-gen/jvmTest/kotlin/care/data4life/hl7/fhir/r4/model"
          testJsonTarget = "./fhir/src-gen/jvmTest/resources/r4"


          # Define filenames to include
          base = ["Element", "Resource", "FhirElementFactory","FhirSerializationModule"]
          complex = ["Ratio", "Period", "Range", "Attachment", "Identifier", "HumanName", "Annotation", "Address", "ContactPoint", "SampledData", "Money", "Count", "Duration", "Quantity", "Distance", "Age", "CodeableConcept", "Signature", "Coding", "Timing"]
          special = ["Reference", "Narrative", "Extension", "Meta", "Dosage"]
          enum = ["CodeSystems"]
          model = [
              "BackboneElement",
              "CodeSystem",
              "DocumentReference",
              "DomainResource",
              "Observation",
              "DiagnosticReport",
              "Organization",
              "Practitioner",
              "PractitionerRole",
              "ProcedureRequest",
              "Specimen",
              "FamilyMemberHistory",
              "Provenance",
              "Substance",
              "Condition",
              "CarePlan",
              "Patient",
              "Medication",
              "MedicationRequest",
              "MedicationStatement",
              "Dosage",
              "CareTeam",
              "Goal",
              "Questionnaire",
              "QuestionnaireResponse",
              "ContactDetail",
              "UsageContext",
              "ReferralRequest",
              "ValueSet",
              "Procedure",
              "Encounter",
              "Contributor",
              "DataRequirement",
              "Expression",
              "ParameterDefinition",
              "RelatedArtifact",
              "TriggerDefinition",
              "Location",
              "ServiceRequest"
          ]

          # Create test groups
          complexTest = genTestList(complex)
          specialTest = genTestList(special)
          enumTest = genTestList(enum)
          modelTest = genTestList(model)


          # Remove old models
          sh "rm -rf #{modelTarget}"
          sh "rm -rf #{testTarget}"


          # Move models
          movefiles(modelSource, "#{modelTarget}", base, file_type)
          movefiles(modelSource, "#{modelTarget}", complex, file_type)
          movefiles(modelSource, "#{modelTarget}", special, file_type)
          moveCodeSystems(codeSystemSource, "#{codeSystemTarget}")
          movefiles(modelSource, "#{modelTarget}", model, file_type)

          # Move tests
          movefiles(testSource, "#{testTarget}", complexTest, file_type)
          movefiles(testSource, "#{testTarget}", specialTest, file_type)
          movefiles(testSource, "#{testTarget}", enumTest, file_type)
          movefiles(testSource, "#{testTarget}", modelTest, file_type)

          # Move test example jsons
          FileUtils.mkdir_p(testJsonTarget)
          sh "find #{fhir_parser}/downloads -name '*example*' -exec cp {} #{testJsonTarget} \\;"

          # Static fixes
          includeStatics()

          UI.success "Done integrating generated models ✅"
      end

      def self.genTestList(list)
          tests = []
          for item in list
              tests.push("#{item}Test")
          end
          return tests
      end

      def self.movefiles (source, target, whitelist, file_type)
          #Ui.message("Moving files into " + target + " folder")
          FileUtils.mkdir_p(target)

          Dir.glob(source) do |item|
            if item.include? file_type
              classname = File.basename(item, file_type)
              UI.message "#{classname}"
              if whitelist.include? classname
                FileUtils.mv(item, target, force: true)
              end
            end
          end
      end

      def self.moveCodeSystems (source, target)
          # Ui.message("Moving files into " + target + " folder")
          FileUtils.mkdir_p(target)

          file_type = ".kt"

          Dir.glob(source) do |item|
            if item.include? file_type
              classname = File.basename(item, file_type)
              UI.message "#{classname}"
              FileUtils.mv(item, target, force: true)
            end
          end
       end

      def self.fetch_group(main_group, group)
          return main_group.find_subpath(group, true) || main_group.new_group(group)
      end

      #####################################################
      # @!group Documentation
      ####################################################

      def self.description
          "Generates and integrates custom FHIR R4 models for Kotlin from the JSON examples"
      end

      def self.output
          []
      end

      def self.is_supported?(platform)
          true
      end

    end
  end
end
