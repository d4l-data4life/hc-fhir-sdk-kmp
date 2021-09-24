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

package care.data4life.hl7.fhir.stu3.test.data

import care.data4life.hl7.fhir.stu3.model.FhirResource
import care.data4life.hl7.fhir.stu3.model.Meta
import care.data4life.hl7.fhir.stu3.primitive.Date
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("FhirDateTestObject")
data class FhirDateTestObject(
    val value: Date,

    // FhirResource
    override val id: String? = null,
    override val meta: Meta? = null,
    override val implicitRules: String? = null,
    override val language: String? = null
) : FhirResource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "FhirDateTestObject"

        fun jsonData(
            value: Date
        ) = FhirPrimitiveTestObjectHelper.formatFhirJson(
            resourceType(),
            { "\"${value.value}\"" },
            value.extension,
            value.id
        )

        fun testData(value: Date): FhirDateTestObject {
            return FhirDateTestObject(value)
        }
    }
}
