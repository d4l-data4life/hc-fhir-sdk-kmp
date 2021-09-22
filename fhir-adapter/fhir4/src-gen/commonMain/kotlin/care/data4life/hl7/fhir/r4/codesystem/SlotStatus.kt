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
 * Code System: SlotStatus
 *
 * The free/busy status of the slot.
 *
 * @see <a href="http://hl7.org/fhir/slotstatus">SlotStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/slotstatus">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class SlotStatus {

    /**
     * Indicates that the time interval is busy because one or more events have been
     * scheduled for that interval.
     */
    @SerialName("busy")
    BUSY,

    /**
     * Indicates that the time interval is free for scheduling.
     */
    @SerialName("free")
    FREE,

    /**
     * Indicates that the time interval is busy and that the interval cannot be
     * scheduled.
     */
    @SerialName("busy-unavailable")
    BUSY_UNAVAILABLE,

    /**
     * Indicates that the time interval is busy because one or more events have been
     * tentatively scheduled for that interval.
     */
    @SerialName("busy-tentative")
    BUSY_TENTATIVE,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,
}
