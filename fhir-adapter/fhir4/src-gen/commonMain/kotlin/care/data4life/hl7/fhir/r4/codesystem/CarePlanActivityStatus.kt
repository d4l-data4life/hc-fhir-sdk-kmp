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
 * Code System: CarePlanActivityStatus
 *
 * Codes that reflect the current state of a care plan activity within its overall life cycle.
 *
 * @see <a href="http://hl7.org/fhir/care-plan-activity-status">CarePlanActivityStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/care-plan-activity-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class CarePlanActivityStatus {

    /**
     * Care plan activity is planned but no action has yet been taken.
     */
    @SerialName("not-started")
    NOT_STARTED,

    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     */
    @SerialName("scheduled")
    SCHEDULED,

    /**
     * Care plan activity has been started but is not yet complete.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * Care plan activity was started but has temporarily ceased with an expectation of
     * resumption at a future time.
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * Care plan activity has been completed (more or less) as planned.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The planned care plan activity has been withdrawn.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The planned care plan activity has been ended prior to completion after the
     * activity was started.
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * The current state of the care plan activity is not known. Note: This concept is
     * not to be used for "other" - one of the listed statuses is presumed to apply,
     * but the authoring/source system does not know which one.
     */
    @SerialName("unknown")
    UNKNOWN,

    /**
     * Care plan activity was entered in error and voided.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,
}
