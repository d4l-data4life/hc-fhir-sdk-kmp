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

import care.data4life.hl7.fhir.stu3.codesystem.DigitalMediaType
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMedia
 *
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline
 * or provided by direct reference
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Media">Media</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Media)
 */
interface FhirMedia : FhirDomainResource {

    /**
     * Identifier(s) for the image.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Procedure that caused this media to be created.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Whether the media is a photo (still image), an audio recording, or a video
     * recording.
     */
    val type: DigitalMediaType

    /**
     * The type of acquisition equipment/process.
     */
    val subtype: CodeableConcept?

    /**
     * Imaging view, e.g. Lateral or Antero-posterior.
     */
    val view: CodeableConcept?

    /**
     * Who/What this Media is a record of.
     */
    val subject: Reference?

    /**
     * Encounter / Episode associated with media.
     */
    val context: Reference?

    /**
     * When Media was collected.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When Media was collected.
     */
    val occurrencePeriod: Period?

    /**
     * The person who generated the image.
     */
    val operator: Reference?

    /**
     * Why was event performed?.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Body part in media.
     */
    val bodySite: CodeableConcept?

    /**
     * Observing Device.
     */
    val device: Reference?

    /**
     * Height of the image in pixels (photo/video).
     */
    val height: PositiveInteger?

    /**
     * Width of the image in pixels (photo/video).
     */
    val width: PositiveInteger?

    /**
     * Number of frames if > 1 (photo).
     */
    val frames: PositiveInteger?

    /**
     * Length in seconds (audio / video).
     */
    val duration: UnsignedInteger?

    /**
     * Actual Media - reference or data.
     */
    val content: Attachment

    /**
     * Comments made about the media.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * Media
 *
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline
 * or provided by direct reference
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Media">Media</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Media)
 */
@Serializable
@SerialName("Media")
data class Media(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("type")
    override val type: DigitalMediaType,

    @SerialName("subtype")
    override val subtype: CodeableConcept? = null,

    @SerialName("view")
    override val view: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("operator")
    override val operator: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,

    @SerialName("device")
    override val device: Reference? = null,

    @SerialName("height")
    override val height: PositiveInteger? = null,

    @SerialName("width")
    override val width: PositiveInteger? = null,

    @SerialName("frames")
    override val frames: PositiveInteger? = null,

    @SerialName("duration")
    override val duration: UnsignedInteger? = null,

    @SerialName("content")
    override val content: Attachment,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirMedia {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Media"
    }
}
