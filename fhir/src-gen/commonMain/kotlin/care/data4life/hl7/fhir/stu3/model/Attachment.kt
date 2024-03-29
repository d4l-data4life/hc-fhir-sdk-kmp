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

import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirAttachment
 *
 * For referring to data content defined in other formats.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Attachment">Attachment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Attachment)
 */
interface FhirAttachment : FhirElement {

    /**
     * Mime type of the content, with charset etc..
     */
    val contentType: String?

    /**
     * Human language of the content (BCP-47).
     */
    val language: String?

    /**
     * Data inline, base64ed.
     */
    val data: String?

    /**
     * Uri where the data can be found.
     */
    val url: String?

    /**
     * Number of bytes of content (if url provided).
     */
    val size: UnsignedInteger?

    /**
     * Hash of the data (sha-1, base64ed).
     */
    val hash: String?

    /**
     * Label to display in place of the data.
     */
    val title: String?

    /**
     * Date attachment was first created.
     */
    val creation: DateTime?
}

/**
 * Attachment
 *
 * For referring to data content defined in other formats.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Attachment">Attachment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Attachment)
 */
@Serializable
@SerialName("Attachment")
data class Attachment(

    @SerialName("contentType")
    override val contentType: String? = null,

    @SerialName("language")
    override val language: String? = null,

    @SerialName("data")
    override val data: String? = null,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("size")
    override val size: UnsignedInteger? = null,

    @SerialName("hash")
    override val hash: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("creation")
    override val creation: DateTime? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirAttachment {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Attachment"
    }
}
