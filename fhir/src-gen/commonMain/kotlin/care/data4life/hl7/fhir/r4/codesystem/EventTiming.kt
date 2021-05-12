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
 * Real world event relating to the schedule.
 *
 * @see <a href="http://hl7.org/fhir/event-timing">EventTiming</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class EventTiming {

    /**
     * Event occurs during the morning. The exact time is unspecified and established
     * by institution convention or patient interpretation.
     */
    @SerialName("MORN")
    MORN,

    /**
     * Event occurs during the early morning. The exact time is unspecified and
     * established by institution convention or patient interpretation.
     */
    @SerialName("MORN.early")
    MORN_EARLY,

    /**
     * Event occurs during the late morning. The exact time is unspecified and
     * established by institution convention or patient interpretation.
     */
    @SerialName("MORN.late")
    MORN_LATE,

    /**
     * Event occurs around 12:00pm. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    @SerialName("NOON")
    NOON,

    /**
     * Event occurs during the afternoon. The exact time is unspecified and established
     * by institution convention or patient interpretation.
     */
    @SerialName("AFT")
    AFT,

    /**
     * Event occurs during the early afternoon. The exact time is unspecified and
     * established by institution convention or patient interpretation.
     */
    @SerialName("AFT.early")
    AFT_EARLY,

    /**
     * Event occurs during the late afternoon. The exact time is unspecified and
     * established by institution convention or patient interpretation.
     */
    @SerialName("AFT.late")
    AFT_LATE,

    /**
     * Event occurs during the evening. The exact time is unspecified and established
     * by institution convention or patient interpretation.
     */
    @SerialName("EVE")
    EVE,

    /**
     * Event occurs during the early evening. The exact time is unspecified and
     * established by institution convention or patient interpretation.
     */
    @SerialName("EVE.early")
    EVE_EARLY,

    /**
     * Event occurs during the late evening. The exact time is unspecified and
     * established by institution convention or patient interpretation.
     */
    @SerialName("EVE.late")
    EVE_LATE,

    /**
     * Event occurs during the night. The exact time is unspecified and established by
     * institution convention or patient interpretation.
     */
    @SerialName("NIGHT")
    NIGHT,

    /**
     * Event occurs [offset] after subject goes to sleep. The exact time is unspecified
     * and established by institution convention or patient interpretation.
     */
    @SerialName("PHS")
    PHS
}
