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
 * Lifecycle status of the questionnaire response.
 *
 * @see <a href="http://hl7.org/fhir/questionnaire-answers-status">QuestionnaireResponseStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/questionnaire-answers-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class QuestionnaireResponseStatus {
    /**
     * This QuestionnaireResponse has been partially filled out with answers, but changes or additions are still expected to be made to it.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * This QuestionnaireResponse has been filled out with answers, and the current content is regarded as definitive.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * This QuestionnaireResponse has been filled out with answers, then marked as complete, yet changes or additions have been made to it afterwards.
     */
    @SerialName("amended")
    AMENDED,

    /**
     * This QuestionnaireResponse was entered in error and voided.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * This QuestionnaireResponse has been partially filled out with answers, but has been abandoned. It is unknown whether changes or additions are expected to be made to it.
     */
    @SerialName("stopped")
    STOPPED
}
