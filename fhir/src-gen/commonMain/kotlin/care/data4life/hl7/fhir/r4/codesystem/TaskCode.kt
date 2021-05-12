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
 * Codes indicating the type of action that is expected to be performed
 *
 * @see <a href="http://hl7.org/fhir/CodeSystem/task-code">TaskCode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/task-code">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class TaskCode {

    /**
     * Take what actions are needed to transition the focus resource from 'draft' to 'active' or 'in-progress', as appropriate for the resource type.  This may involve additing additional content, approval, validation, etc.
     */
    @SerialName("approve")
    APPROVE,

    /**
     * Act to perform the actions defined in the focus request.  This might result in a 'more assertive' request (order for a plan or proposal, filler order for a placer order), but is intend to eventually result in events.  The degree of fulfillment requested might be limited by Task.restriction.
     */
    @SerialName("fulfill")
    FULFILL,

    /**
     * Abort, cancel or withdraw the focal resource, as appropriate for the type of resource.
     */
    @SerialName("abort")
    ABORT,

    /**
     * Replace the focal resource with the specified input resource
     */
    @SerialName("replace")
    REPLACE,

    /**
     * Update the focal resource of the owning system to reflect the content specified as the Task.focus
     */
    @SerialName("change")
    CHANGE,

    /**
     * Transition the focal resource from 'active' or 'in-progress' to 'suspended'
     */
    @SerialName("suspend")
    SUSPEND,

    /**
     * Transition the focal resource from 'suspended' to 'active' or 'in-progress' as appropriate for the resource type.
     */
    @SerialName("resume")
    RESUME
}
