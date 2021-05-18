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

{%- set resource_list = [
    "Address",
    "Age",
    "Annotation",
    "Attachment",
    "BackboneElement",
    "CarePlan",
    "CareTeam",
    "CodeableConcept",
    "CodeSystem",
    "Coding",
    "Condition",
    "ContactDetail",
    "ContactPoint",
    "Count",
    "DiagnosticReport",
    "Distance",
    "DocumentReference",
    "DomainResource",
    "Dosage",
    "Duration",
    "Element",
    "Encounter",
    "Extension",
    "FamilyMemberHistory",
    "FhirElementFact",
    "Goal",
    "HumanName",
    "Identifier",
    "Location",
    "Medication",
    "MedicationRequest",
    "MedicationStatement",
    "Meta",
    "Money",
    "Narrative",
    "Observation",
    "Organization",
    "Patient",
    "Period",
    "Practitioner",
    "PractitionerRole",
    "Procedure",
    "ProcedureRequest",
    "Provenance",
    "Quantity",
    "Questionnaire",
    "QuestionnaireResponse",
    "Range",
    "Ratio",
    "Reference",
    "ReferralRequest",
    "Resource",
    "SampledData",
    "ServiceRequest",
    "Signature",
    "Specimen",
    "Substance",
    "Timing",
    "UsageContext",
    "ValueSet"
] %}

object FhirHelper {

    object FhirSerializationModule {
        fun module(): SerializersModule {
            return SerializersModule {
                polymorphic(FhirR4::class) {
{%- for klass in classes %}
                    subclass({{ klass.name }}::class)
{%- endfor %}
                }
                polymorphic(FhirResource::class) {
{%- for klass in classes %}
{%- if klass.resource_type %}
                    subclass({{ klass.name }}::class)
{%-endif %}
{%-endfor %}
                }
            }
        }
    }

    object FhirElementFactory {

        fun <T : FhirR4> getFhirResourceType(klass: KClass<T>): String {
            return when (klass) {
{%- for klass in classes %}
{%- if klass.resource_type %}
                {{ klass.name }}::class -> {{ klass.name}}.resourceType()
{%- endif %}
{%- endfor %}
                else -> throw IllegalArgumentException("FHIR class unknown: $klass")
            }
        }

        fun getFhirClass(resourceType: String): KClass<*> {
            return when (resourceType) {
{%- for klass in classes %}
{%- if klass.resource_type %}
                "{{ klass.name }}" -> {{ klass.name}}::class
{%- endif %}
{%- endfor %}
                else -> throw IllegalArgumentException("FHIR resourceType unknown: $resourceType")
            }
        }
    }
}
{% if True %}{# ensure empty line at end of file #}{% endif %}
