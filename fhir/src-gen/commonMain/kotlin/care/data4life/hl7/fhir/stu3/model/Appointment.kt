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

import care.data4life.hl7.fhir.stu3.codesystem.AppointmentStatus
import care.data4life.hl7.fhir.stu3.codesystem.ParticipantRequired
import care.data4life.hl7.fhir.stu3.codesystem.ParticipationStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Instant
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirAppointment
 *
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
 * device(s) for a specific date/time. This may result in one or more Encounter(s)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Appointment">Appointment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Appointment)
 */
interface FhirAppointment : FhirDomainResource {

    /**
     * External Ids for this item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The overall status of the Appointment. Each of the participants has their own
     * participation status which indicates their involvement in the process, however
     * this status indicates the shared status.
     */
    val status: AppointmentStatus

    /**
     * A broad categorisation of the service that is to be performed during this
     * appointment.
     */
    val serviceCategory: CodeableConcept?

    /**
     * The specific service that is to be performed during this appointment.
     */
    val serviceType: kotlin.collections.List<CodeableConcept>?

    /**
     * The specialty of a practitioner that would be required to perform the service
     * requested in this appointment.
     */
    val specialty: kotlin.collections.List<CodeableConcept>?

    /**
     * The style of appointment or patient that has been booked in the slot (not
     * service type).
     */
    val appointmentType: CodeableConcept?

    /**
     * Reason this appointment is scheduled.
     */
    val reason: kotlin.collections.List<CodeableConcept>?

    /**
     * Reason the appointment is to takes place (resource).
     */
    val indication: kotlin.collections.List<Reference>?

    /**
     * Used to make informed decisions if needing to re-prioritize.
     */
    val priority: UnsignedInteger?

    /**
     * Shown on a subject line in a meeting request, or appointment list.
     */
    val description: String?

    /**
     * Additional information to support the appointment.
     */
    val supportingInformation: kotlin.collections.List<Reference>?

    /**
     * When appointment is to take place.
     */
    val start: Instant?

    /**
     * When appointment is to conclude.
     */
    val end: Instant?

    /**
     * Can be less than start/end (e.g. estimate).
     */
    val minutesDuration: PositiveInteger?

    /**
     * The slots that this appointment is filling.
     */
    val slot: kotlin.collections.List<Reference>?

    /**
     * The date that this appointment was initially created.
     */
    val created: DateTime?

    /**
     * Additional comments.
     */
    val comment: String?

    /**
     * The ReferralRequest provided as information to allocate to the Encounter.
     */
    val incomingReferral: kotlin.collections.List<Reference>?

    /**
     * Participants involved in appointment.
     */
    val participant: kotlin.collections.List<AppointmentParticipant>

    /**
     * Potential date/time interval(s) requested to allocate the appointment within.
     */
    val requestedPeriod: kotlin.collections.List<Period>?
}

/**
 * Appointment
 *
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
 * device(s) for a specific date/time. This may result in one or more Encounter(s)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Appointment">Appointment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Appointment)
 */
@Serializable
@SerialName("Appointment")
data class Appointment(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: AppointmentStatus,

    @SerialName("serviceCategory")
    override val serviceCategory: CodeableConcept? = null,

    @SerialName("serviceType")
    override val serviceType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specialty")
    override val specialty: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("appointmentType")
    override val appointmentType: CodeableConcept? = null,

    @SerialName("reason")
    override val reason: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("indication")
    override val indication: kotlin.collections.List<Reference>? = null,

    @SerialName("priority")
    override val priority: UnsignedInteger? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("supportingInformation")
    override val supportingInformation: kotlin.collections.List<Reference>? = null,

    @SerialName("start")
    override val start: Instant? = null,

    @SerialName("end")
    override val end: Instant? = null,

    @SerialName("minutesDuration")
    override val minutesDuration: PositiveInteger? = null,

    @SerialName("slot")
    override val slot: kotlin.collections.List<Reference>? = null,

    @SerialName("created")
    override val created: DateTime? = null,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("incomingReferral")
    override val incomingReferral: kotlin.collections.List<Reference>? = null,

    @SerialName("participant")
    override val participant: kotlin.collections.List<AppointmentParticipant>,

    @SerialName("requestedPeriod")
    override val requestedPeriod: kotlin.collections.List<Period>? = null,

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
) : FhirAppointment {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Appointment"
    }
}

/**
 * FhirAppointmentParticipant
 *
 * List of participants involved in the appointment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Appointment">AppointmentParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Appointment)
 */
interface FhirAppointmentParticipant : FhirBackboneElement {

    /**
     * Role of participant in the appointment.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Person, Location/HealthcareService or Device.
     */
    val actor: Reference?

    /**
     * Is this participant required to be present at the meeting. This covers a use-
     * case where 2 doctors need to meet to discuss the results for a specific patient,
     * and the patient is not required to be present.
     */
    val required: ParticipantRequired?

    /**
     * Participation status of the actor.
     */
    val status: ParticipationStatus
}

/**
 * AppointmentParticipant
 *
 * List of participants involved in the appointment.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Appointment">AppointmentParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Appointment)
 */
@Serializable
@SerialName("AppointmentParticipant")
data class AppointmentParticipant(

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("actor")
    override val actor: Reference? = null,

    @SerialName("required")
    override val required: ParticipantRequired? = null,

    @SerialName("status")
    override val status: ParticipationStatus,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirAppointmentParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AppointmentParticipant"
    }
}
