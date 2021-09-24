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
 * Code System: GoalStatusReason
 *
 * Example codes indicating the reason for a current status. Note that these are in no way complete and
 * might not even be appropriate for some uses.
 *
 * @see <a href="http://hl7.org/fhir/goal-status-reason">GoalStatusReason</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/goal-status-reason">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class GoalStatusReason {

    /**
     * Goal suspended or ended because of a surgical procedure.
     */
    @SerialName("surgery")
    SURGERY,

    /**
     * Goal suspended or ended because of a significant life event (marital change,
     * bereavement, etc.).
     */
    @SerialName("life-event")
    LIFE_EVENT,

    /**
     * Goal has been superseded by a new goal.
     */
    @SerialName("replaced")
    REPLACED,

    /**
     * Patient wishes the goal to be set aside, at least temporarily.
     */
    @SerialName("patient-request")
    PATIENT_REQUEST,

    /**
     * Goal cannot be reached temporarily.
     */
    @SerialName("temp-not-attainable")
    TEMP_NOT_ATTAINABLE,

    /**
     * Goal cannot be reached permanently.
     */
    @SerialName("permanent-not-attainable")
    PERMANENT_NOT_ATTAINABLE,

    /**
     * Goal cannot be reached due to financial barrier or reason.
     */
    @SerialName("financial-barrier")
    FINANCIAL_BARRIER,

    /**
     * Goal cannot be reached due to a lack of transportation.
     */
    @SerialName("lack-of-transportation")
    LACK_OF_TRANSPORTATION,

    /**
     * Goal cannot be reached due to a lack of social support.
     */
    @SerialName("lack-of-social-support")
    LACK_OF_SOCIAL_SUPPORT,
}
