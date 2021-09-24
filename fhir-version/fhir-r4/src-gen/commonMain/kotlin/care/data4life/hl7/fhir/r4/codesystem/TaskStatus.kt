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
 * Code System: TaskStatus
 *
 * The current status of the task.
 *
 * @see <a href="http://hl7.org/fhir/task-status">TaskStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/task-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class TaskStatus {

    /**
     * The task is not yet ready to be acted upon.
     */
    @SerialName("draft")
    DRAFT,

    /**
     * The task is ready to be acted upon and action is sought.
     */
    @SerialName("requested")
    REQUESTED,

    /**
     * A potential performer has claimed ownership of the task and is evaluating
     * whether to perform it.
     */
    @SerialName("received")
    RECEIVED,

    /**
     * The potential performer has agreed to execute the task but has not yet started
     * work.
     */
    @SerialName("accepted")
    ACCEPTED,

    /**
     * The potential performer who claimed ownership of the task has decided not to
     * execute it prior to performing any action.
     */
    @SerialName("rejected")
    REJECTED,

    /**
     * The task is ready to be performed, but no action has yet been taken. Used in
     * place of requested/received/accepted/rejected when request assignment and
     * acceptance is a given.
     */
    @SerialName("ready")
    READY,

    /**
     * The task was not completed.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The task has been started but is not yet complete.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * The task has been started but work has been paused.
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * The task was attempted but could not be completed due to some error.
     */
    @SerialName("failed")
    FAILED,

    /**
     * The task has been completed.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The task should never have existed and is retained only because of the
     * possibility it may have used.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,
}
