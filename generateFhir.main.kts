#!/usr/bin/env kotlin

import java.io.File
import kotlin.system.exitProcess

val fhirSpecPath = "fhir-spec"

enum class FhirVersion(
    val versionName: String,
    val targetName: String,
    /**
     * modelExclusions need to be in sync with 'fhir-version/fhir-$targetName/parser/templates/template-elementfactory.kt' -> 'exclude_resources
     */
    val modelExclusions: List<String>,
) {
    FHIR3(
        versionName = "stu3",
        targetName = "stu3",
        modelExclusions = listOf(
            "ExplanationOfBenefit",
            "Claim",
        ),
    ),
    FHIR3_D4L_APP(
        versionName = "stu3",
        targetName = "stu3-d4l-app",
        modelExclusions = listOf(
            "Account",
            "ActivityDefinition",
            "AdverseEvent",
            "AllergyIntolerance",
            "Appointment",
            "AppointmentResponse",
            "AuditEvent",
            "Basic",
            "Binary",
            "BodySite",
            "Bundle",
            "CapabilityStatement",
            "CarePlan",
            "CareTeam",
            "ChargeItem",
            "Claim",
            "ClaimResponse",
            "ClinicalImpression",
            "CodeSystem",
            "Communication",
            "CommunicationRequest",
            "CompartmentDefinition",
            "Composition",
            "ConceptMap",
            "Condition",
            "Consent",
            "Contract",
            "Coverage",
            "DataElement",
            "DetectedIssue",
            "Device",
            "DeviceComponent",
            "DeviceMetric",
            "DeviceRequest",
            "DeviceUseStatement",
            "DiagnosticReport",
            "DocumentManifest",
            "DocumentReference",
            "EligibilityRequest",
            "EligibilityResponse",
            "Encounter",
            "Endpoint",
            "EnrollmentRequest",
            "EnrollmentResponse",
            "EpisodeOfCare",
            "ExpansionProfile",
            "ExplanationOfBenefit",
            "FamilyMemberHistory",
            "Flag",
            "Goal",
            "GraphDefinition",
            "Group",
            "GuidanceResponse",
            "HealthcareService",
            "ImagingManifest",
            "ImagingStudy",
            "Immunization",
            "ImmunizationRecommendation",
            "ImplementationGuide",
            "Library",
            "Linkage",
            "List",
            "Location",
            "Measure",
            "MeasureReport",
            "Media",
            "Medication",
            "MedicationAdministration",
            "MedicationDispense",
            "MedicationRequest",
            "MedicationStatement",
            "MessageDefinition",
            "MessageHeader",
            "NamingSystem",
            "NutritionOrder",
            "Observation",
            "OperationDefinition",
            "OperationOutcome",
            "Organization",
            "Parameters",
            "Patient",
            "PaymentNotice",
            "PaymentReconciliation",
            "Person",
            "PlanDefinition",
            "Practitioner",
            "PractitionerRole",
            "Procedure",
            "ProcedureRequest",
            "ProcessRequest",
            "ProcessResponse",
            "Provenance",
            "Questionnaire",
            "QuestionnaireResponse",
            "ReferralRequest",
            "RelatedPerson",
            "RequestGroup",
            "ResearchStudy",
            "ResearchSubject",
            "RiskAssessment",
            "Schedule",
            "SearchParameter",
            "Sequence",
            "ServiceDefinition",
            "Slot",
            "Specimen",
            "StructureDefinition",
            "StructureMap",
            "Subscription",
            "Substance",
            "SupplyDelivery",
            "SupplyRequest",
            "Task",
            "TestReport",
            "TestScript",
            "ValueSet",
            "VisionPrescription",
        ),
    ),
    FHIR4(
        versionName = "r4",
        targetName = "r4",
        modelExclusions = listOf(
            "ExampleScenario",
        ),
    ),
    FHIR4_D4L_APP(
        versionName = "r4",
        targetName = "r4-d4l-app",
        modelExclusions = listOf(
            "Account",
            "ActivityDefinition",
            "AdverseEvent",
            "AllergyIntolerance",
            "Appointment",
            "AppointmentResponse",
            "AuditEvent",
            "Basic",
            "Binary",
            "BiologicallyDerivedProduct",
            "BodyStructure",
            "Bundle",
            "CapabilityStatement",
            "CarePlan",
            "CareTeam",
            "CatalogEntry",
            "ChargeItem",
            "ChargeItemDefinition",
            "Claim",
            "ClaimResponse",
            "ClinicalImpression",
            "CodeSystem",
            "Communication",
            "CommunicationRequest",
            "CompartmentDefinition",
            "Composition",
            "ConceptMap",
            "Condition",
            "Consent",
            "Contract",
            "Coverage",
            "CoverageEligibilityRequest",
            "CoverageEligibilityResponse",
            "DetectedIssue",
            "DeviceDefinition",
            "DeviceMetric",
            "DeviceRequest",
            "DeviceUseStatement",
            "DiagnosticReport",
            "DocumentManifest",
            "DocumentReference",
            "EffectEvidenceSynthesis",
            "Encounter",
            "Endpoint",
            "EnrollmentRequest",
            "EnrollmentResponse",
            "EpisodeOfCare",
            "EventDefinition",
            "Evidence",
            "EvidenceVariable",
            "ExampleScenario",
            "ExplanationOfBenefit",
            "FamilyMemberHistory",
            "Flag",
            "Goal",
            "GraphDefinition",
            "Group",
            "GuidanceResponse",
            "HealthcareService",
            "ImagingStudy",
            "Immunization",
            "ImmunizationEvaluation",
            "ImmunizationRecommendation",
            "ImplementationGuide",
            "InsurancePlan",
            "Invoice",
            "Library",
            "Linkage",
            "List",
            "Location",
            "Measure",
            "MeasureReport",
            "Media",
            "Medication",
            "MedicationAdministration",
            "MedicationDispense",
            "MedicationKnowledge",
            "MedicationRequest",
            "MedicationStatement",
            "MedicinalProduct",
            "MedicinalProductAuthorization",
            "MedicinalProductContraindication",
            "MedicinalProductIndication",
            "MedicinalProductIngredient",
            "MedicinalProductInteraction",
            "MedicinalProductManufactured",
            "MedicinalProductPackaged",
            "MedicinalProductPharmaceutical",
            "MedicinalProductUndesirableEffect",
            "MessageDefinition",
            "MessageHeader",
            "MolecularSequence",
            "NamingSystem",
            "NutritionOrder",
            "ObservationDefinition",
            "OperationDefinition",
            "OperationOutcome",
            "Organization",
            "OrganizationAffiliation",
            "Parameters",
            "Patient",
            "PaymentNotice",
            "PaymentReconciliation",
            "Person",
            "PlanDefinition",
            "Practitioner",
            "PractitionerRole",
            "Procedure",
            "Provenance",
            "RelatedPerson",
            "RequestGroup",
            "ResearchDefinition",
            "ResearchElementDefinition",
            "ResearchStudy",
            "ResearchSubject",
            "RiskAssessment",
            "RiskEvidenceSynthesis",
            "Schedule",
            "SearchParameter",
            "ServiceRequest",
            "Slot",
            "Specimen",
            "SpecimenDefinition",
            "StructureDefinition",
            "StructureMap",
            "Subscription",
            "Substance",
            "SubstanceNucleicAcid",
            "SubstancePolymer",
            "SubstanceProtein",
            "SubstanceReferenceInformation",
            "SubstanceSourceMaterial",
            "SubstanceSpecification",
            "SupplyDelivery",
            "SupplyRequest",
            "Task",
            "TerminologyCapabilities",
            "TestReport",
            "TestScript",
            "ValueSet",
            "VerificationResult",
            "VisionPrescription",
        ),
    ),
}

fun staticReplacementMap(fhirVersion: FhirVersion) = when (fhirVersion) {
    FhirVersion.FHIR4 -> mapOf(
        "MedicationStatementStatusCodes.kt" to targetCodesystems(fhirVersion),
        "MedicationStatementFhirTest.kt" to targetTests(fhirVersion),
        "MedicationStatement.kt" to targetModels(fhirVersion),
    )
    FhirVersion.FHIR4_D4L_APP -> mapOf(
        "MedicationStatementStatusCodes.kt" to targetCodesystems(fhirVersion),
    )
    FhirVersion.FHIR3 -> mapOf()
    FhirVersion.FHIR3_D4L_APP -> mapOf()
}

fun sourceParserConfig(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/parser/config"

fun sourceParserTemplates(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/parser/templates"

fun sourceParserStatics(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/parser/statics"

val parserPath = "fhir-spec-parser"
val sourceCodesystems = "$parserPath/codesystems"
val sourceModels = "$parserPath/models"
val sourceTests = "$parserPath/tests"
val sourceTestJsons = "$parserPath/downloads"

fun targetCodesystems(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/commonMain/kotlin/care/data4life/hl7/fhir/${fhirVersion.versionName}/codesystem"

fun targetModels(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/commonMain/kotlin/care/data4life/hl7/fhir/${fhirVersion.versionName}/model"

fun targetTests(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/jvmTest/kotlin/care/data4life/hl7/fhir/${fhirVersion.versionName}/model"

fun targetTestJsons(fhirVersion: FhirVersion) =
    "fhir-version/fhir-${fhirVersion.targetName}/src-gen/jvmTest/resources/${fhirVersion.versionName}"

var fhirVersions = listOf(
    FhirVersion.FHIR4,
    FhirVersion.FHIR4_D4L_APP,
    FhirVersion.FHIR3,
    FhirVersion.FHIR3_D4L_APP,
)

if (args.isNotEmpty()) {
    when (args[0]) {
        "fhir4" -> fhirVersions = listOf(FhirVersion.FHIR4)
        "fhir4-d4l-app" -> fhirVersions = listOf(FhirVersion.FHIR4_D4L_APP)
        "fhir3" -> fhirVersions = listOf(FhirVersion.FHIR3)
        "fhir3-d4l-app" -> fhirVersions = listOf(FhirVersion.FHIR3_D4L_APP)
        "all" -> {
        }
        "-h", "--help" -> printUsage()
        else -> {
            println("Sorry I didn't understand ${args[0]}")
            printUsage()
            exitProcess(1)
        }
    }
}

fun printUsage() {
    println(
        """
            Usage: ./generateFhir.main.kts [<option>]
                all             Generates all FHIR versions. Default is <all>.
                fhir3           Generate FHIR3 sources and tests
                fhir4           Generate FHIR4 sources and tests
                fhir4-d4l-app   Generate FHIR4 sources and tests for the D4L App
        """.trimIndent()
    )
}

if (!File(parserPath).exists()) {
    println(
        """
        This script depends on the fhir parser: https://github.com/gesundheitscloud/fhir-parser/
        
        Please call git submodule update --init --recursive to ensure it's available.
        """.trimIndent()
    )
    exitProcess(1)
}

for (fhirVersion in fhirVersions) {
    println("Start to generate ${fhirVersion.versionName}")
    cleanup()
    generateFhirModels(fhirVersion)
    integrateFhirModels(fhirVersion)
    integrateStatics(fhirVersion)
    cleanup()
    formatCode()
}

fun generateFhirModels(fhirVersion: FhirVersion) {
    println("Copy FHIR parser configuration")

    File(sourceParserConfig(fhirVersion)).walk()
        .filter { !it.isDirectory }
        .forEach { it.copyTo(File("$parserPath/${it.name}")) }
    File(sourceParserTemplates(fhirVersion)).walk()
        .filter { !it.isDirectory }
        .forEach { it.copyTo(File("$parserPath/templates/${it.name}")) }

    println("Copy FHIR specification")
    cmd("mkdir $parserPath/downloads")
    cmd("cp -a $fhirSpecPath/hl7.org/fhir/${fhirVersion.versionName}/version.info $parserPath/downloads/")
    cmd("unzip -o $fhirSpecPath/hl7.org/fhir/${fhirVersion.versionName}/examples-json.zip -d $parserPath/downloads/")

    println("Generate FHIR files")
    if (!cmd("test -d venv", parserPath)) {
        if (!cmd("python3 -m venv venv", parserPath)) {
            println("Python virtual environment not present and couldn't be created")
            exitProcess(1)
        }
    }

    cmd("venv/bin/pip install --upgrade pip", parserPath)
    cmd("venv/bin/pip install -Ur requirements.txt", parserPath)
    cmd("venv/bin/python generate.py --cache-only", parserPath)

    println(" ✅ Done generating ${fhirVersion.versionName} model")
}

fun integrateFhirModels(fhirVersion: FhirVersion) {
    val targetCodesystems = targetCodesystems(fhirVersion)
    val targetModels = targetModels(fhirVersion)
    val targetTests = targetTests(fhirVersion)
    val targetTestJsons = targetTestJsons(fhirVersion)

    // Remove old models
    cmd("rm -rf $targetCodesystems")
    cmd("rm -rf $targetModels")
    cmd("rm -rf $targetTests")
    cmd("rm -rf $targetTestJsons")

    // Move codesystems
    cmd("mkdir $targetCodesystems")
    cmd("cp -a $sourceCodesystems/. $targetCodesystems")

    // Move models
    cmd("mkdir $targetModels")
    File(sourceModels)
        .walk()
        .filter { !it.isDirectory }
        .forEach { file ->
            if (!fhirVersion.modelExclusions.contains(
                    file.name.replace(".kt", "")
                )
            ) {
                file.copyTo(File("$targetModels/${file.name}"))
            }
        }

    // Move tests
    cmd("mkdir $targetTests")
    File(sourceTests)
        .walk()
        .filter { !it.isDirectory }
        .forEach { file ->
            if (!fhirVersion.modelExclusions.contains(
                    file.name.replace("FhirTest", "")
                        .replace(".kt", "")
                )
            ) {
                file.copyTo(File("$targetTests/${file.name}"))
            }
        }

    // Move JSON
    cmd("mkdir $targetTestJsons")
    File(sourceTestJsons)
        .walk()
        .filter { !it.isDirectory }
        .forEach { file ->
            if (file.name.contains("example")) {
                file.copyTo(File("$targetTestJsons/${file.name}"))
            }
        }

    println(" ✅ Done integrating $fhirVersion generated codesystems, models and tests")
}

/**
 * Hotfix for https://gesundheitscloud.atlassian.net/browse/SDK-576
 * TODO Remove once the Spec is fixed
 */
fun integrateStatics(fhirVersion: FhirVersion) {
    println("Include static FHIR replacements")

    val source = sourceParserStatics(fhirVersion)

    for ((file, target) in staticReplacementMap(fhirVersion)) {
        cmd("cp $source/$file $target")
    }

    println(" ✅ Done including static FHIR replacements")
}

fun formatCode() {
    cmd("./gradlew spotlessApply")
    println(" ✅ Done formatting generated FHIR code")
}

fun cleanup() {
    println("Start cleanup")

    cmd("rm -rf ${parserPath}/codesystems")
    cmd("rm -rf ${parserPath}/dependencies.json")
    cmd("rm -rf ${parserPath}/downloads")
    cmd("rm -rf ${parserPath}/mappings.py")
    cmd("rm -rf ${parserPath}/models")
    cmd("rm -rf ${parserPath}/settings.py")
    cmd("rm -rf ${parserPath}/templates")
    cmd("rm -rf ${parserPath}/tests")

    println(" ✅ Done cleanup")
}

fun cmd(command: String, path: String = "./"): Boolean {
    val commands = command.split(" ")
    val arguments = commands.subList(1, commands.size)
    val result = ProcessBuilder()
        .directory(File(path))
        .command(commands[0], *arguments.toTypedArray())
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .redirectOutput(ProcessBuilder.Redirect.INHERIT)
        .start()
        .waitFor()
    return result == 0
}
