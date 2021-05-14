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

package care.data4life.hl7.fhir.stu3.codesystem

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
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class AppointmentStatus {

    /**
     * None of the participant(s) have finalized their acceptance of the appointment
     * request, and the start/end time may not be set yet.
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
     * Some of the patients have arrived.
     */
    @SerialName("arrived")
    ARRIVED,

    /**
     * This appointment has completed and may have resulted in an encounter.
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
}
