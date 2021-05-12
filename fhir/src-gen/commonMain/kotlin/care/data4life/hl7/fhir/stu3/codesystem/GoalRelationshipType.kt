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
 * Types of relationships between two goals
 *
 * @see <a href="http://hl7.org/fhir/goal-relationship-type">GoalRelationshipType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/goal-relationship-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class GoalRelationshipType {

    /**
     * Indicates that the target goal is one which must be met before striving for the current goal
     */
    @SerialName("predecessor")
    PREDECESSOR,

    /**
     * Indicates that the target goal is a desired objective once the current goal is met
     */
    @SerialName("successor")
    SUCCESSOR,

    /**
     * Indicates that this goal has been replaced by the target goal
     */
    @SerialName("replacement")
    REPLACEMENT,

    /**
     * Indicates that the target goal is considered to be a "piece" of attaining this goal.
     */
    @SerialName("milestone")
    MILESTONE,

    /**
     * Indicates that the relationship is not covered by one of the pre-defined codes.  (An extension may convey more information about the meaning of the relationship.)
     */
    @SerialName("other")
    OTHER
}
