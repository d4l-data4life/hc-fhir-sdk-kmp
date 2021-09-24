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

package care.data4life.hl7.fhir.r4.test.data

import care.data4life.hl7.fhir.r4.model.Extension
import care.data4life.hl7.fhir.r4.model.FhirDomainResource
import care.data4life.hl7.fhir.r4.model.FhirResource
import care.data4life.hl7.fhir.r4.model.Meta
import care.data4life.hl7.fhir.r4.model.Narrative
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("FhirContainedTestObject")
data class FhirContainedTestObject(
    override val text: Narrative? = null,
    override val contained: List<FhirResource>? = null,
    override val extension: List<Extension>? = null,
    override val modifierExtension: List<Extension>? = null,
    override val id: String? = null,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null
) : FhirDomainResource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "FhirContainedTestObject"

        const val jsonData =
            """{"resourceType":"FhirContainedTestObject","contained":[${FhirResourceTestObject.jsonData}]}"""

        val testData = FhirContainedTestObject(contained = listOf(FhirResourceTestObject.testData))
    }
}
