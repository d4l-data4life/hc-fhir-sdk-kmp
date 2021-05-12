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
 * The master set of status codes used throughout FHIR. All status codes are mapped to one of these
 * codes.
 *
 * @see <a href="http://hl7.org/fhir/resource-status">CanonicalStatusCodesForFHIRResources</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/resource-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class CanonicalStatusCodesForFHIRResources {

    /**
     * The resource was created in error, and should not be treated as valid (note: in many cases, for various data integrity related reasons, the information cannot be removed from the record)
     */
    @SerialName("error")
    ERROR,

    /**
     * The resource describes an action or plan that is proposed, and not yet approved by the participants
     */
    @SerialName("proposed")
    PROPOSED,

    /**
     * The resource describes a course of action that is planned and agreed/approved, but at the time of recording was still future
     */
    @SerialName("planned")
    PLANNED,

    /**
     * The information in the resource is still being prepared and edited
     */
    @SerialName("draft")
    DRAFT,

    /**
     * A fulfiller has been asked to perform this action, but it has not yet occurred
     */
    @SerialName("requested")
    REQUESTED,

    /**
     * The fulfiller has received the request, but not yet agreed to carry out the action
     */
    @SerialName("received")
    RECEIVED,

    /**
     * The fulfiller chose not to perform the action
     */
    @SerialName("declined")
    DECLINED,

    /**
     * The fulfiller has decided to perform the action, and plans are in train to do this in the future
     */
    @SerialName("accepted")
    ACCEPTED,

    /**
     * The pre-conditions for the action are all fulfilled, and it is imminent
     */
    @SerialName("arrived")
    ARRIVED,

    /**
     * The resource describes information that is currently valid or a process that is presently occuring
     */
    @SerialName("active")
    ACTIVE,

    /**
     * The process described/requested in this resource has been halted for some reason
     */
    @SerialName("suspended")
    SUSPENDED,

    /**
     * The process described/requested in the resource could not be completed, and no further action is planned
     */
    @SerialName("failed")
    FAILED,

    /**
     * The information in this resource has been replaced by information in another resource
     */
    @SerialName("replaced")
    REPLACED,

    /**
     * The process described/requested in the resource has been completed, and no further action is planned
     */
    @SerialName("complete")
    COMPLETE,

    /**
     * The resource describes information that is no longer valid or a process that is stopped occurring
     */
    @SerialName("inactive")
    INACTIVE,

    /**
     * The process described/requested in the resource did not complete - usually due to some workflow error, and no further action is planned
     */
    @SerialName("abandoned")
    ABANDONED,

    /**
     * Authoring system does not know the status
     */
    @SerialName("unknown")
    UNKNOWN,

    /**
     * The information in this resource is not yet approved
     */
    @SerialName("unconfirmed")
    UNCONFIRMED,

    /**
     * The information in this resource is approved
     */
    @SerialName("confirmed")
    CONFIRMED,

    /**
     * The issue identified by this resource is no longer of concern
     */
    @SerialName("resolved")
    RESOLVED,

    /**
     * This information has been ruled out by testing and evaluation
     */
    @SerialName("refuted")
    REFUTED,

    /**
     * Potentially true?
     */
    @SerialName("differential")
    DIFFERENTIAL,

    /**
     * This information is still being assembled
     */
    @SerialName("partial")
    PARTIAL,

    /**
     * not available at this time/location
     */
    @SerialName("busy-unavailable")
    BUSY_UNAVAILABLE,

    /**
     * Free for scheduling
     */
    @SerialName("free")
    FREE,

    /**
     * Ready to act
     */
    @SerialName("on-target")
    ON_TARGET,

    /**
     * Ahead of the planned timelines
     */
    @SerialName("ahead-of-target")
    AHEAD_OF_TARGET,

    /**
     * behindTarget
     */
    @SerialName("behind-target")
    BEHIND_TARGET,

    /**
     * Behind the planned timelines
     */
    @SerialName("not-ready")
    NOT_READY,

    /**
     * The device transducer is disconnected
     */
    @SerialName("transduc-discon")
    TRANSDUC_DISCON,

    /**
     * The hardware is disconnected
     */
    @SerialName("hw-discon")
    HW_DISCON
}
