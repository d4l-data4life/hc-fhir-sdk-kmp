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

package care.data4life.hl7.fhir.r4.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Code System: AppointmentStatus
 *
 * The free/busy status of an appointment.
 *
 * @see <a href="http://hl7.org/fhir/appointmentstatus">AppointmentStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/appointmentstatus">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class AppointmentStatus {

    /**
     * None of the participant(s) have finalized their acceptance of the appointment
     * request, and the start/end time might not be set yet.
     */
    @SerialName("proposed")
    PROPOSED,

    /**
     * Some or all of the participant(s) have not finalized their acceptance of the
     * appointment request.
     */
    @SerialName("pending")
    PENDING,

    /**
     * All participant(s) have been considered and the appointment is confirmed to go
     * ahead at the date/times specified.
     */
    @SerialName("booked")
    BOOKED,

    /**
     * The patient/patients has/have arrived and is/are waiting to be seen.
     */
    @SerialName("arrived")
    ARRIVED,

    /**
     * The planning stages of the appointment are now complete, the encounter resource
     * will exist and will track further status changes. Note that an encounter may
     * exist before the appointment status is fulfilled for many reasons.
     */
    @SerialName("fulfilled")
    FULFILLED,

    /**
     * The appointment has been cancelled.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * Some or all of the participant(s) have not/did not appear for the appointment
     * (usually the patient).
     */
    @SerialName("noshow")
    NOSHOW,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * When checked in, all pre-encounter administrative work is complete, and the
     * encounter may begin. (where multiple patients are involved, they are all
     * present).
     */
    @SerialName("checked-in")
    CHECKED_IN,

    /**
     * The appointment has been placed on a waitlist, to be scheduled/confirmed in the
     * future when a slot/service is available. A specific time might or might not be
     * pre-allocated.
     */
    @SerialName("waitlist")
    WAITLIST,
}
