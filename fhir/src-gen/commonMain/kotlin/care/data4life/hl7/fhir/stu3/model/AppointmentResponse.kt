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

import care.data4life.hl7.fhir.stu3.codesystem.ParticipationStatus
import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirAppointmentResponse
 *
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or
 * rejection
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AppointmentResponse">AppointmentResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AppointmentResponse)
 */
interface FhirAppointmentResponse : FhirDomainResource {

    /**
     * External Ids for this item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Appointment this response relates to.
     */
    val appointment: Reference

    /**
     * Time from appointment, or requested new start time.
     */
    val start: Instant?

    /**
     * Time from appointment, or requested new end time.
     */
    val end: Instant?

    /**
     * Role of participant in the appointment.
     */
    val participantType: kotlin.collections.List<CodeableConcept>?

    /**
     * Person, Location/HealthcareService or Device.
     */
    val actor: Reference?

    /**
     * Participation status of the participant. When the status is declined or
     * tentative if the start/end times are different to the appointment, then these
     * times should be interpreted as a requested time change. When the status is
     * accepted, the times can either be the time of the appointment (as a confirmation
     * of the time) or can be empty.
     */
    val participantStatus: ParticipationStatus

    /**
     * Additional comments.
     */
    val comment: String?
}

/**
 * AppointmentResponse
 *
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or
 * rejection
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AppointmentResponse">AppointmentResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AppointmentResponse)
 */
@Serializable
@SerialName("AppointmentResponse")
data class AppointmentResponse(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("appointment")
    override val appointment: Reference,

    @SerialName("start")
    override val start: Instant? = null,

    @SerialName("end")
    override val end: Instant? = null,

    @SerialName("participantType")
    override val participantType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("actor")
    override val actor: Reference? = null,

    @SerialName("participantStatus")
    override val participantStatus: ParticipationStatus,

    @SerialName("comment")
    override val comment: String? = null,

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
) : FhirAppointmentResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AppointmentResponse"
    }
}
