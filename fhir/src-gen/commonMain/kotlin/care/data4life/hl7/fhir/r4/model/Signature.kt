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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirSignature : FhirElement {

    // Indication of the reason the entity signed the object(s).
    val type: List<Coding>

    // When the signature was created.
    val `when`: Instant

    // Who signed.
    val who: Reference

    // The party represented.
    val onBehalfOf: Reference?

    // The technical format of the signed resources.
    val targetFormat: String?

    // The technical format of the signature.
    val sigFormat: String?

    // The actual signature content (XML DigSig. JWS, picture, etc.).
    val data: String?
}

/**
 * ClassName: Signature
 *
 * SourceFileName: Signature.kt
 *
 * A signature along with supporting context. The signature may be a digital signature that is
 * cryptographic in nature, or some other signature acceptable to the domain. This other signature may
 * be as simple as a graphical image representing a hand-written signature, or a signature ceremony
 * Different signature approaches have different utilities.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Signature">Signature</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Signature)
 */
@Serializable
@SerialName("Signature")
data class Signature(

    // Indication of the reason the entity signed the object(s).
    @SerialName("type")
    override val type: List<Coding>,

    // When the signature was created.
    @SerialName("when")
    override val `when`: Instant,

    // Who signed.
    @SerialName("who")
    override val who: Reference,

    // The party represented.
    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    // The technical format of the signed resources.
    @SerialName("targetFormat")
    override val targetFormat: String? = null,

    // The technical format of the signature.
    @SerialName("sigFormat")
    override val sigFormat: String? = null,

    // The actual signature content (XML DigSig. JWS, picture, etc.).
    @SerialName("data")
    override val data: String? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
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
