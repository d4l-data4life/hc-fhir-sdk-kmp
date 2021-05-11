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
 * Indicates the level of importance associated with reaching or sustaining a goal.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/goal-priority">GoalPriority</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/goal-priority">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class GoalPriority {
    /**
     * Indicates that the goal is of considerable importance and should be a primary focus of care delivery.
     */
    @SerialName("high-priority")
    HIGH_PRIORITY,

    /**
     * Indicates that the goal has a reasonable degree of importance and that concrete action should be taken towards the goal.  Attainment is not as critical as high-priority goals.
     */
    @SerialName("medium-priority")
    MEDIUM_PRIORITY,

    /**
     * The goal is desirable but is not sufficiently important to devote significant resources to.  Achievement of the goal may be sought when incidental to achieving other goals.
     */
    @SerialName("low-priority")
    LOW_PRIORITY
}
