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
 * Codes that convey the current status of the research study.
 *
 * @see <a href="http://hl7.org/fhir/research-study-status">ResearchStudyStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/research-study-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ResearchStudyStatus {

    /**
     * Study is opened for accrual.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * Study is completed prematurely and will not resume; patients are no longer examined nor treated.
     */
    @SerialName("administratively-completed")
    ADMINISTRATIVELY_COMPLETED,

    /**
     * Protocol is approved by the review board.
     */
    @SerialName("approved")
    APPROVED,

    /**
     * Study is closed for accrual; patients can be examined and treated.
     */
    @SerialName("closed-to-accrual")
    CLOSED_TO_ACCRUAL,

    /**
     * Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all study subjects have completed treatment or intervention but are still being followed according to the primary objective of the study.
     */
    @SerialName("closed-to-accrual-and-intervention")
    CLOSED_TO_ACCRUAL_AND_INTERVENTION,

    /**
     * Study is closed to accrual and intervention, i.e. the study is closed to enrollment, all study subjects have completed treatment
or intervention but are still being followed according to the primary objective of the study.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * Protocol was disapproved by the review board.
     */
    @SerialName("disapproved")
    DISAPPROVED,

    /**
     * Protocol is submitted to the review board for approval.
     */
    @SerialName("in-review")
    IN_REVIEW,

    /**
     * Study is temporarily closed for accrual; can be potentially resumed in the future; patients can be examined and treated.
     */
    @SerialName("temporarily-closed-to-accrual")
    TEMPORARILY_CLOSED_TO_ACCRUAL,

    /**
     * Study is temporarily closed for accrual and intervention and potentially can be resumed in the future.
     */
    @SerialName("temporarily-closed-to-accrual-and-intervention")
    TEMPORARILY_CLOSED_TO_ACCRUAL_AND_INTERVENTION,

    /**
     * Protocol was withdrawn by the lead organization.
     */
    @SerialName("withdrawn")
    WITHDRAWN
}
