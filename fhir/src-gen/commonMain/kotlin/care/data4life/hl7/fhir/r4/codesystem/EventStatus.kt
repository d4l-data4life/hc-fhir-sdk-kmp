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
 * Codes identifying the lifecycle stage of an event.
 *
 * @see <a href="http://hl7.org/fhir/event-status">EventStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/event-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class EventStatus {

    /**
     * The core event has not started yet, but some staging activities have begun (e.g.
     * surgical suite preparation).  Preparation stages may be tracked for billing
     * purposes.
     */
    @SerialName("preparation")
    PREPARATION,

    /**
     * The event is currently occurring.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * The event was terminated prior to any activity beyond preparation.  I.e. The
     * 'main' activity has not yet begun.  The boundary between preparatory and the
     * 'main' activity is context-specific.
     */
    @SerialName("not-done")
    NOT_DONE,

    /**
     * The event has been temporarily stopped but is expected to resume in the future.
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * The event was terminated prior to the full completion of the intended activity
     * but after at least some of the 'main' activity (beyond preparation) has
     * occurred.
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * The event has now concluded.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * This electronic record should never have existed, though it is possible that
     * real-world decisions were based on it.  (If real-world activity has occurred,
     * the status should be "stopped" rather than "entered-in-error".).
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The authoring/source system does not know which of the status values currently
     * applies for this event.  Note: This concept is not to be used for "other" - one
     * of the listed statuses is presumed to apply,  but the authoring/source system
     * does not know which.
     */
    @SerialName("unknown")
    UNKNOWN
}
