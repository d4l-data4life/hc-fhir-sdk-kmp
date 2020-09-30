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
			"CodeableConcept",
			"Coding",
			"ContactPoint",
			"Count",
			"Distance",
			"Dosage",
			"Duration",
			"Element",
			"Extension",
			"HumanName",
			"Identifier",
			"Meta",
			"Money",
			"Narrative",
			"Period",
			"Quantity",
			"Range",
			"Ratio",
			"Reference",
			"Resource",
			"SampledData",
			"Signature",
			"Timing",
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
		}
	}
}