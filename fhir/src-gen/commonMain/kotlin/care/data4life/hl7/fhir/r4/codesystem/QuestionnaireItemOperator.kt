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
 * The criteria by which a question is enabled.
 *
 * @see <a href="http://hl7.org/fhir/questionnaire-enable-operator">QuestionnaireItemOperator</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/questionnaire-enable-operator">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class QuestionnaireItemOperator {
    /**
     * True if whether an answer exists is equal to the enableWhen answer (which must be a boolean).
     */
    @SerialName("exists")
    EXISTS,

    /**
     * True if whether at least one answer has a value that is equal to the enableWhen answer.
     */
    @SerialName("=")
    EQUAL,

    /**
     * True if whether at least no answer has a value that is equal to the enableWhen answer.
     */
    @SerialName("!=")
    NOT_EQUAL,

    /**
     * True if whether at least no answer has a value that is greater than the enableWhen answer.
     */
    @SerialName(">")
    GREATER_THAN,

    /**
     * True if whether at least no answer has a value that is less than the enableWhen answer.
     */
    @SerialName("<")
    LESS_THAN,

    /**
     * True if whether at least no answer has a value that is greater or equal to the enableWhen answer.
     */
    @SerialName(">=")
    GREATER_OR_EQUAL,

    /**
     * True if whether at least no answer has a value that is less or equal to the enableWhen answer.
     */
    @SerialName("<=")
    LESS_OR_EQUAL,
}
