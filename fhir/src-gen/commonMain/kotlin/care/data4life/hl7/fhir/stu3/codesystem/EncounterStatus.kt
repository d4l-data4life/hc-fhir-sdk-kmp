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
 * Current state of the encounter
 *
 * @see <a href="http://hl7.org/fhir/encounter-status">EncounterStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/encounter-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class EncounterStatus {

    /**
     * The Encounter has not yet started.
     */
    @SerialName("planned")
    PLANNED,

    /**
     * The Patient is present for the encounter, however is not currently meeting with a practitioner.
     */
    @SerialName("arrived")
    ARRIVED,

    /**
     * The patient has been assessed for the priority of their treatment based on the severity of their condition.
     */
    @SerialName("triaged")
    TRIAGED,

    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are meeting.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * The Encounter has begun, but the patient is temporarily on leave.
     */
    @SerialName("onleave")
    ONLEAVE,

    /**
     * The Encounter has ended.
     */
    @SerialName("finished")
    FINISHED,

    /**
     * The Encounter has ended before it has begun.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The encounter status is unknown. Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
     */
    @SerialName("unknown")
    UNKNOWN
}
