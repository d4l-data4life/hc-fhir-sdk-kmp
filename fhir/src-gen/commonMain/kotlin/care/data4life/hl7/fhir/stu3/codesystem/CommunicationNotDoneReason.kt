/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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
 * Codes for the reason why a communication was not done.
 *
 * @see <a href="http://hl7.org/fhir/communication-not-done-reason">CommunicationNotDoneReason</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/communication-not-done-reason">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class CommunicationNotDoneReason {
    /**
     * The communication was not done due to an unknown reason.
     */
    @SerialName("unknown")
    UNKNOWN,

    /**
     * The communication was not done due to a system error.
     */
    @SerialName("system-error")
    SYSTEM_ERROR,

    /**
     * The communication was not done due to an invalid phone number.
     */
    @SerialName("invalid-phone-number")
    INVALID_PHONE_NUMBER,

    /**
     * The communication was not done due to the recipient being unavailable.
     */
    @SerialName("recipient-unavailable")
    RECIPIENT_UNAVAILABLE,

    /**
     * The communication was not done due to a family objection.
     */
    @SerialName("family-objection")
    FAMILY_OBJECTION,

    /**
     * The communication was not done due to a patient objection.
     */
    @SerialName("patient-objection")
    PATIENT_OBJECTION
}
