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

import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Instant
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Media)
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
     * Part of referenced event.
     */
    val partOf: kotlin.collections.List<Reference>?

    /**
     * The current state of the {{title}}.
     */
    val status: EventStatus

    /**
     * Classification of media as image, video, or audio.
     */
    val type: CodeableConcept?

    /**
     * The type of acquisition equipment/process.
     */
    val modality: CodeableConcept?

    /**
     * Imaging view, e.g. Lateral or Antero-posterior.
     */
    val view: CodeableConcept?

    /**
     * Who/What this Media is a record of.
     */
    val subject: Reference?

    /**
     * Encounter associated with media.
     */
    val encounter: Reference?

    /**
     * When Media was collected.
     */
    val createdDateTime: DateTime?

    /**
     * When Media was collected.
     */
    val createdPeriod: Period?

    /**
     * Date/Time this version was made available.
     */
    val issued: Instant?

    /**
     * The person who generated the image.
     */
    val operator: Reference?

    /**
     * Why was event performed?.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Observed body part.
     */
    val bodySite: CodeableConcept?

    /**
     * Name of the device/manufacturer.
     */
    val deviceName: String?

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
    val duration: Decimal?

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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Media)
 */
@Serializable
@SerialName("Media")
data class Media(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: EventStatus,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("modality")
    override val modality: CodeableConcept? = null,

    @SerialName("view")
    override val view: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("createdDateTime")
    override val createdDateTime: DateTime? = null,

    @SerialName("createdPeriod")
    override val createdPeriod: Period? = null,

    @SerialName("issued")
    override val issued: Instant? = null,

    @SerialName("operator")
    override val operator: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,

    @SerialName("deviceName")
    override val deviceName: String? = null,

    @SerialName("device")
    override val device: Reference? = null,

    @SerialName("height")
    override val height: PositiveInteger? = null,

    @SerialName("width")
    override val width: PositiveInteger? = null,

    @SerialName("frames")
    override val frames: PositiveInteger? = null,

    @SerialName("duration")
    override val duration: Decimal? = null,

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

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Media"
    }
}
