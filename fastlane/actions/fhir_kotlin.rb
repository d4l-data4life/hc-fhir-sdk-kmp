require "fileutils"

module Fastlane
  module Actions
    class FhirKotlinAction < Action
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
          FileUtils.copy("#{resources_path}/config/mappings.py", "#{fhir_parser}/mappings.py")
          FileUtils.copy("#{resources_path}/config/settings.py", "#{fhir_parser}/settings.py")
          FileUtils.copy_entry("#{resources_path}/templates", "#{fhir_parser}/templates")

          # Create a cache for the FHIR JSON models
          cache_src = File.join('.', 'fhir-spec', 'hl7.org','fhir','STU3')
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

          UI.success "Done generating FHIR models ✅"
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

      def self.integrate_fhir_models
          fhir_parser = './fhir-spec-parser'
          file_type = ".kt"

          modelSource = "#{fhir_parser}/models/*"
          testSource = "#{fhir_parser}/tests/*"

          modelTarget = "./fhir/src-gen/commonMain/kotlin/care/data4life/fhir/stu3/model"
          testTarget = "./fhir/src-gen/jvmTest/kotlin/care/data4life/fhir/stu3/model"
          testJsonTarget = "./fhir/src-gen/jvmTest/resources/"


          # Define filenames to include
          base = ["FhirElementFactory"]
          complex = ["Ratio", "Period", "Range", "Attachment", "Identifier", "HumanName", "Annotation", "Address", "ContactPoint", "SampledData", "Money", "Count", "Duration", "Quantity", "Distance", "Age", "CodeableConcept", "Signature", "Coding", "Timing", "Element"]
          special = ["Reference", "Narrative", "Extension", "Resource", "Meta"]
          enum = ["CodeSystems"]
          model = [
              "BackboneElement",
              "DocumentReference",
              "DomainResource",
              "Observation",
              "DiagnosticReport",
              "Organization",
              "Practitioner",
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
              "Dosage",
              "CareTeam",
              "Goal",
              "Questionnaire",
              "QuestionnaireResponse",
              "ContactDetail",
              "UsageContext",
              "ReferralRequest",
              "ValueSet",
              "Procedure"
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
          movefiles(modelSource, "#{modelTarget}", enum, file_type)
          movefiles(modelSource, "#{modelTarget}", model, file_type)

          # Move tests
          movefiles(testSource, "#{testTarget}", complexTest, file_type)
          movefiles(testSource, "#{testTarget}", specialTest, file_type)
          movefiles(testSource, "#{testTarget}", enumTest, file_type)
          movefiles(testSource, "#{testTarget}", modelTest, file_type)

          # Move test example jsons
          FileUtils.mkdir_p(testJsonTarget)
          sh "find #{fhir_parser}/downloads -name '*example*' -exec cp {} #{testJsonTarget} \\;"

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

      def self.fetch_group(main_group, group)
          return main_group.find_subpath(group, true) || main_group.new_group(group)
      end

      #####################################################
      # @!group Documentation
      ####################################################

      def self.description
          "Generates and integrates custom FHIR models for Swift from the JSON examples"
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
