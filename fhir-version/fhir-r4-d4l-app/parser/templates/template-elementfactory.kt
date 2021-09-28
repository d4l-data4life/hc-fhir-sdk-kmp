/*
 * Copyright (c) 2021 D4L data4life gGmbH / All rights reserved.
 *
 * D4L owns all legal rights, title and interest in and to the Software Development Kit ("SDK"),
 * including any intellectual property rights that subsist in the SDK.
 *
 * The SDK and its documentation may be accessed and used for viewing/review purposes only.
 * Any usage of the SDK for other purposes, including usage for the development of
 * applications/third-party applications shall require the conclusion of a license agreement
 * between you and D4L.
 *
 * If you are interested in licensing the SDK for your own applications/third-party
 * applications and/or if you’d like to contribute to the development of the SDK, please
 * contact D4L by email to help@data4life.care.
 */

package care.data4life.hl7.fhir.r4.model

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlin.reflect.KClass

{#- this exclude_resources need to be in sync with the generateFhir.main.kts script #}
{%- set exclude_resources = [
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
    "Communication",
    "CommunicationRequest",
    "CompartmentDefinition",
    "Composition",
    "ConceptMap",
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
    "PaymentNotice",
    "PaymentReconciliation",
    "Person",
    "PlanDefinition",
    "PractitionerRole",
    "Procedure",
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
    "Slot",
    "SpecimenDefinition",
    "StructureDefinition",
    "StructureMap",
    "Subscription",
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
    "VerificationResult",
    "VisionPrescription",
] %}
{%- set force_include_resources = [
    "PLACEHOLDER_INCLUDE_RESOURCE",
] %}

{%- set exclusions = [] %}
{%- for klass in classes %}
{%- for exclude in exclude_resources %}
{%- for include in force_include_resources %}
{%- if (exclude in klass.name) and not (include in klass.name) %}
{%- set _ = exclusions.append( klass.name ) %}
{%- endif %}
{%- endfor %}
{%- endfor %}
{%- endfor %}

object FhirHelper {

    object FhirSerializationModule {
        fun module(): SerializersModule {
            return SerializersModule {
                polymorphic(FhirR4::class) {
{%- for klass in classes %}
{%- if not klass.name in exclusions %}
                    subclass({{ klass.name }}::class)
{%- endif %}
{%- endfor %}
                }
                polymorphic(FhirResource::class) {
{%- for klass in classes %}
{%- if klass.resource_type %}
{%- if not klass.name in exclusions %}
                    subclass({{ klass.name }}::class)
{%- endif %}
{%- endif %}
{%- endfor %}
                }
            }
        }
    }

    object FhirElementFactory {

        fun <T : FhirR4> getFhirResourceType(klass: KClass<T>): String? {
            return when (klass) {
{%- for klass in classes %}
{%- if klass.resource_type %}
{%- if not klass.name in exclusions %}
                {{ klass.name }}::class -> {{ klass.name}}.resourceType()
{%- endif %}
{%- endif %}
{%- endfor %}
                else -> null
            }
        }

        fun getFhirClass(resourceType: String): KClass<*>? {
            return when (resourceType.lowercase()) {
{%- for klass in classes %}
{%- if klass.resource_type %}
{%- if not klass.name in exclusions %}
                "{{ klass.name.lower() }}" -> {{ klass.name}}::class
{%- endif %}
{%- endif %}
{%- endfor %}
                else -> null
            }
        }
    }
}
{% if True %}{# ensure empty line at end of file #}{% endif %}
