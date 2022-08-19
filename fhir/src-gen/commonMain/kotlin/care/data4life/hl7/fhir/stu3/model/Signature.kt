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

import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSignature
 *
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in
 * nature, or a graphical image representing a hand-written signature, or a signature process.
 * Different signature approaches have different utilities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Signature">Signature</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Signature)
 */
interface FhirSignature : FhirElement {

    /**
     * Indication of the reason the entity signed the object(s).
     */
    val type: kotlin.collections.List<Coding>

    /**
     * When the signature was created.
     */
    val whenn: Instant

    /**
     * Who signed.
     */
    val whoUri: String?

    /**
     * Who signed.
     */
    val whoReference: Reference?

    /**
     * The party represented.
     */
    val onBehalfOfUri: String?

    /**
     * The party represented.
     */
    val onBehalfOfReference: Reference?

    /**
     * The technical format of the signature.
     */
    val contentType: String?

    /**
     * The actual signature content (XML DigSig. JWT, picture, etc.).
     */
    val blob: String?
}

/**
 * Signature
 *
 * A digital signature along with supporting context. The signature may be electronic/cryptographic in
 * nature, or a graphical image representing a hand-written signature, or a signature process.
 * Different signature approaches have different utilities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Signature">Signature</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Signature)
 */
@Serializable
@SerialName("Signature")
data class Signature(

    @SerialName("type")
    override val type: kotlin.collections.List<Coding>,

    @SerialName("when")
    override val whenn: Instant,

    @SerialName("whoUri")
    override val whoUri: String? = null,

    @SerialName("whoReference")
    override val whoReference: Reference? = null,

    @SerialName("onBehalfOfUri")
    override val onBehalfOfUri: String? = null,

    @SerialName("onBehalfOfReference")
    override val onBehalfOfReference: Reference? = null,

    @SerialName("contentType")
    override val contentType: String? = null,

    @SerialName("blob")
    override val blob: String? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSignature {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Signature"
    }
}
