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

package care.data4life.hl7.fhir.stu3.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirBinary
 *
 * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Binary">Binary</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Binary)
 */
interface FhirBinary : FhirResource {

    /**
     * MimeType of the binary content.
     */
    val contentType: String

    /**
     * Access Control Management.
     */
    val securityContext: Reference?

    /**
     * The actual content.
     */
    val content: String
}

/**
 * Binary
 *
 * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Binary">Binary</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Binary)
 */
@Serializable
@SerialName("Binary")
data class Binary(

    @SerialName("contentType")
    override val contentType: String,

    @SerialName("securityContext")
    override val securityContext: Reference? = null,

    @SerialName("content")
    override val content: String,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirBinary {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Binary"
    }
}
