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
 * Code System: GoalAchievementStatus
 *
 * Describes the progression, or lack thereof, towards the goal against the target.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/goal-achievement">GoalAchievementStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/goal-achievement">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class GoalAchievementStatus {

    /**
     * The goal is being sought but has not yet been reached. (Also applies if the goal
     * was reached in the past but there has been regression and the goal is again
     * being sought).
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * The goal is being sought, and is progressing.
     */
    @SerialName("improving")
    IMPROVING,

    /**
     * The goal is being sought, but is regressing.
     */
    @SerialName("worsening")
    WORSENING,

    /**
     * The goal is being sought, but the trend is flat.
     */
    @SerialName("no-change")
    NO_CHANGE,

    /**
     * The goal has been met.
     */
    @SerialName("achieved")
    ACHIEVED,

    /**
     * The goal has been met, but ongoing activity is needed to sustain the goal
     * objective.
     */
    @SerialName("sustaining")
    SUSTAINING,

    /**
     * The goal has not been met and there might or might not have been progress
     * towards target.
     */
    @SerialName("not-achieved")
    NOT_ACHIEVED,

    /**
     * The goal has not been met and little to no progress towards target.
     */
    @SerialName("no-progress")
    NO_PROGRESS,

    /**
     * The goal is not possible to be met.
     */
    @SerialName("not-attainable")
    NOT_ATTAINABLE,
}
