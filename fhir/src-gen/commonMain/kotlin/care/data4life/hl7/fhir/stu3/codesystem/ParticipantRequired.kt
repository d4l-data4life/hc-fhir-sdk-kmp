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
 * Is the Participant required to attend the appointment.
 *
 * @see <a href="http://hl7.org/fhir/participantrequired">ParticipantRequired</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/participantrequired">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class ParticipantRequired {

    /**
     * The participant is required to attend the appointment.
     */
    @SerialName("required")
    REQUIRED,

    /**
     * The participant may optionally attend the appointment.
     */
    @SerialName("optional")
    OPTIONAL,

    /**
     * The participant is excluded from the appointment, and may not be informed of the
     * appointment taking place. (Appointment is about them, not for them - such as 2
     * doctors discussing results about a patient's test).
     */
    @SerialName("information-only")
    INFORMATION_ONLY
}
