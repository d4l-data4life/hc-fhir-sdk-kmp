/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Codes indicating whether the goal has been accepted by a stakeholder
 *
 * @see <a href="http://hl7.org/fhir/goal-acceptance-status">GoalAcceptanceStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/goal-acceptance-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class GoalAcceptanceStatus {
    /**
     * Stakeholder supports pursuit of the goal
     */
    @SerialName("agree")
    AGREE,

    /**
     * Stakeholder is not in support of the pursuit of the goal
     */
    @SerialName("disagree")
    DISAGREE,

    /**
     * Stakeholder has not yet made a decision on whether they support the goal
     */
    @SerialName("pending")
    PENDING
}
