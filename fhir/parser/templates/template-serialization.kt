/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model

import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

object FhirSerializationModule {

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
			"Extension",
			"FamilyMemberHistory",
			"Goal",
			"HumanName",
			"Identifier",
			"Medication",
			"MedicationRequest",
			"Meta",
			"Money",
			"Narrative",
			"Observation",
			"Organization",
			"Patient",
			"Period",
			"Practitioner",
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
			"Signature",
			"Specimen",
			"Substance",
			"Timing",
			"UsageContext",
			"ValueSet"
	] %}

	{%- set fhir_resource_list = [
			"CarePlan",
			"CareTeam",
			"CodeSystem",
			"Condition",
			"DiagnosticReport",
			"DocumentReference",
			"DomainResource",
			"FamilyMemberHistory",
			"Goal",
			"Medication",
			"MedicationRequest",
			"Observation",
			"Organization",
			"Patient",
			"Practitioner",
			"Procedure",
			"ProcedureRequest",
			"Provenance",
			"Questionnaire",
			"QuestionnaireResponse",
			"ReferralRequest",
			"Resource",
			"Specimen",
			"Substance",
			"ValueSet",
	] %}

	fun module(): SerializersModule {
		return SerializersModule {
			polymorphic(FhirStu3::class) {
				{%- for resource in resources %}
				{%- if resource.name in resource_list %}
				subclass({{ resource.name }}::class)
				{%- endif %}
				{%- endfor %}
			}
			polymorphic(FhirResource::class) {
				{%- for resource in resources %}
				{%- if resource.name in fhir_resource_list %}
				subclass({{ resource.name }}::class)
				{%- endif %}
				{%- endfor %}
			}
		}
	}
}
