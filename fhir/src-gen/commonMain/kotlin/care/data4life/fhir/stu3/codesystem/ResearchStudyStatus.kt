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

package care.data4life.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Codes that convey the current status of the research study
 *
 * @see <a href="http://hl7.org/fhir/research-study-status">ResearchStudyStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/research-study-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class ResearchStudyStatus {
    /**
     * The study is undergoing design but the process of selecting study subjects and capturing data has not yet begun.
     */
    @SerialName("draft")
    DRAFT,

    /**
     * The study is currently being executed
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * Execution of the study has been temporarily paused
     */
    @SerialName("suspended")
    SUSPENDED,

    /**
     * The study was terminated prior to the final determination of results
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * The information sought by the study has been gathered and compiled and no further work is being performed
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * This study never actually existed.  The record is retained for tracking purposes in the event decisions may have been made based on this erroneous information.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR
}
