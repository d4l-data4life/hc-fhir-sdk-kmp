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

package care.data4life.fhir.test.data

import care.data4life.fhir.stu3.model.Extension
import care.data4life.fhir.stu3.model.FhirStu3
import care.data4life.fhir.stu3.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("FhirPositiveIntegerTestObject")
data class FhirPositiveIntegerTestObject(
    val value: PositiveInteger
) : FhirStu3 {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "FhirTestObject"

        fun jsonData(
            value: PositiveInteger
        ): kotlin.String {
            return """{"resourceType":"FhirPositiveIntegerTestObject","value":1${if (value.extension != null || value.id != null) siblingProperty(value.extension, value.id) else "" }}""".trimMargin()
        }

        private fun siblingProperty(
            extension: List<Extension>? = null,
            id: kotlin.String? = null
        ): String {
            return ""","value_": {${if (extension == null) "" else "$extension"}${if(extension !=null && id != null) "," else ""}${if (id == null) "" else """"id":"$id""""}}""".trimIndent()
        }

        fun testData(value: PositiveInteger): FhirPositiveIntegerTestObject {
            return FhirPositiveIntegerTestObject(value)
        }
    }
}
