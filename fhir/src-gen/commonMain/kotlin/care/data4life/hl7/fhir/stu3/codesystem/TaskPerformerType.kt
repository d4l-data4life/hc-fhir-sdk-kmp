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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * The type(s) of task performers allowed
 *
 * @see <a href="http://hl7.org/fhir/task-performer-type">TaskPerformerType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/task-performer-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class TaskPerformerType {
    /**
     * A workflow participant that requests services.
     */
    @SerialName("requester")
    REQUESTER,

    /**
     * A workflow participant that dispatches services (assigns another task to a participant).
     */
    @SerialName("dispatcher")
    DISPATCHER,

    /**
     * A workflow participant that schedules (dispatches and sets the time or date for performance of) services.
     */
    @SerialName("scheduler")
    SCHEDULER,

    /**
     * A workflow participant that performs services.
     */
    @SerialName("performer")
    PERFORMER,

    /**
     * A workflow participant that monitors task activity.
     */
    @SerialName("monitor")
    MONITOR,

    /**
     * A workflow participant that manages task activity.
     */
    @SerialName("manager")
    MANAGER,

    /**
     * A workflow participant that acquires resources (specimens, images, etc) necessary to perform the task.
     */
    @SerialName("acquirer")
    ACQUIRER,

    /**
     * A workflow participant that reviews task inputs or outputs.
     */
    @SerialName("reviewer")
    REVIEWER
}
