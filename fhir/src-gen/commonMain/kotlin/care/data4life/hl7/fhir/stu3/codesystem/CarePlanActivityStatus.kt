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
 * Indicates where the activity is at in its overall life cycle.
 *
 * @see <a href="http://hl7.org/fhir/care-plan-activity-status">CarePlanActivityStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/care-plan-activity-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class CarePlanActivityStatus {
    /**
     * Activity is planned but no action has yet been taken.
     */
    @SerialName("not-started")
    NOT_STARTED,

    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     */
    @SerialName("scheduled")
    SCHEDULED,

    /**
     * Activity has been started but is not yet complete.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * Activity was started but has temporarily ceased with an expectation of resumption at a future time.
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * The activities have been completed (more or less) as planned.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The activities have been ended prior to completion (perhaps even before they were started).
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The authoring system doesn't know the current state of the activity.
     */
    @SerialName("unknown")
    UNKNOWN
}
