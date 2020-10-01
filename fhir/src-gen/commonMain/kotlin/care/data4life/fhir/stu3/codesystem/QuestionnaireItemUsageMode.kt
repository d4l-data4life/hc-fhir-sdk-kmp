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
 * Identifies the modes of usage of a questionnaire that should enable a particular questionnaire item
 *
 * @see <a href="http://hl7.org/fhir/questionnaire-usage-mode">QuestionnaireItemUsageMode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/questionnaire-usage-mode">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class QuestionnaireItemUsageMode {
    /**
     * Render the item regardless of usage mode
     */
    @SerialName("capture-display")
    CAPTURE_DISPLAY,

    /**
     * Render the item only when capturing data
     */
    @SerialName("capture")
    CAPTURE,

    /**
     * Render the item only when displaying a completed form
     */
    @SerialName("display")
    DISPLAY,

    /**
     * Render the item only when displaying a completed form and the item has been answered (or has child items that have been answered)
     */
    @SerialName("display-non-empty")
    DISPLAY_NON_EMPTY,

    /**
     * Render the item when capturing data or when displaying a completed form and the item has been answered (or has child items that have been answered)
     */
    @SerialName("capture-display-non-empty")
    CAPTURE_DISPLAY_NON_EMPTY
}
