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

package care.data4life.hl7.fhir.stu3.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirSignature : FhirElement {

    // Indication of the reason the entity signed the object(s).
    val type: List<Coding>

    // When the signature was created.
    val `when`: String

    // Who signed.
    val whoUri: String?

    // Who signed.
    val whoReference: Reference?

    // The party represented.
    val onBehalfOfUri: String?

    // The party represented.
    val onBehalfOfReference: Reference?

    // The technical format of the signature.
    val contentType: String?

    // The actual signature content (XML DigSig. JWT, picture, etc.).
    val blob: String?
}


/**
 * ClassName: Signature
 *
 * SourceFileName: Signature.kt
 *
 *
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in nature, or a graphical image representing a hand-written signature, or a signature process. Different signature approaches have different utilities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Signature">Signature</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Signature) on 2020-10-01
 */
@Serializable
@SerialName("Signature")
data class Signature(

    // Indication of the reason the entity signed the object(s).
    @SerialName("type")
    override val type: List<Coding>,
    // When the signature was created.
    @SerialName("when")
    override val `when`: String,
    // Who signed.
    @SerialName("whoUri")
    override val whoUri: String? = null,
    // Who signed.
    @SerialName("whoReference")
    override val whoReference: Reference? = null,
    // The party represented.
    @SerialName("onBehalfOfUri")
    override val onBehalfOfUri: String? = null,
    // The party represented.
    @SerialName("onBehalfOfReference")
    override val onBehalfOfReference: Reference? = null,
    // The technical format of the signature.
    @SerialName("contentType")
    override val contentType: String? = null,
    // The actual signature content (XML DigSig. JWT, picture, etc.).
    @SerialName("blob")
    override val blob: String? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSignature {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Signature"
    }
}

