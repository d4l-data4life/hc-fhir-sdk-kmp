/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.hl7.fhir.test.data

import care.data4life.hl7.fhir.stu3.model.Extension

object FhirPrimitiveTestObjectHelper {

    fun formatFhirJson(
        resourceType: kotlin.String,
        value: () -> kotlin.String,
        extension: List<Extension>?,
        id: kotlin.String?
    ): kotlin.String {
        //language=JSON
        return """{"resourceType":"$resourceType","value":${value()}${
            if (extension != null || id != null) formatSiblingJsonObject(extension, id) else ""
        }}""".trimMargin()
    }

    private fun formatSiblingJsonObject(
        extension: List<Extension>? = null,
        id: kotlin.String? = null
    ): kotlin.String {
        //language=JSON
        return ""","value_": {${if (extension == null) "" else "$extension"}${if (extension != null && id != null) "," else ""}${if (id == null) "" else """"id":"$id""""}}""".trimIndent()
    }
}
