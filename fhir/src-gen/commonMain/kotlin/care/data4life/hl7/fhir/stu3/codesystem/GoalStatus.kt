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
 * Indicates whether the goal has been met and is still being targeted
 *
 * @see <a href="http://hl7.org/fhir/goal-status">GoalStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/goal-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class GoalStatus {
    /**
     * A goal is proposed for this patient
     */
    @SerialName("proposed")
    PROPOSED,

    /**
     * A proposed goal was accepted or acknowledged
     */
    @SerialName("accepted")
    ACCEPTED,

    /**
     * A goal is planned for this patient
     */
    @SerialName("planned")
    PLANNED,

    /**
     * The goal is being sought but has not yet been reached.  (Also applies if goal was reached in the past but there has been regression and goal is being sought again)
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * The goal is on schedule for the planned timelines
     */
    @SerialName("on-target")
    ON_TARGET,

    /**
     * The goal is ahead of the planned timelines
     */
    @SerialName("ahead-of-target")
    AHEAD_OF_TARGET,

    /**
     * The goal is behind the planned timelines
     */
    @SerialName("behind-target")
    BEHIND_TARGET,

    /**
     * The goal has been met, but ongoing activity is needed to sustain the goal objective
     */
    @SerialName("sustaining")
    SUSTAINING,

    /**
     * The goal has been met and no further action is needed
     */
    @SerialName("achieved")
    ACHIEVED,

    /**
     * The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * The previously accepted goal is no longer being sought
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The goal was entered in error and voided.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * A proposed goal was rejected
     */
    @SerialName("rejected")
    REJECTED
}
