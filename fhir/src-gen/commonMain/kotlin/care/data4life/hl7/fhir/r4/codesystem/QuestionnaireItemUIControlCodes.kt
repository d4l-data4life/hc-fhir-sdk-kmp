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
 * Starter set of user interface control/display mechanisms that might be used when rendering an item in a questionnaire.
 *
 * @see <a href="http://hl7.org/fhir/questionnaire-item-control">QuestionnaireItemUIControlCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/questionnaire-item-control">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class QuestionnaireItemUIControlCodes {
    /**
     * UI controls relevant to organizing groups of questions
     */
    @SerialName("group")
    GROUP,

    /**
     * Questions within the group should be listed sequentially
     */
    @SerialName("list")
    LIST,

    /**
     * Questions within the group are rows in the table with possible answers as columns.  Used for 'choice' questions.
     */
    @SerialName("table")
    TABLE,

    /**
     * Questions within the group are columns in the table with possible answers as rows.  Used for 'choice' questions.
     */
    @SerialName("htable")
    HTABLE,

    /**
     * Questions within the group are columns in the table with each group repetition as a row.  Used for single-answer questions.
     */
    @SerialName("gtable")
    GTABLE,

    /**
     * This table has one row - for the question.  Permitted answers are columns.  Used for choice questions.
     */
    @SerialName("atable")
    ATABLE,

    /**
     * The group is to be continuously visible at the top of the questionnaire
     */
    @SerialName("header")
    HEADER,

    /**
     * The group is to be continuously visible at the bottom of the questionnaire
     */
    @SerialName("footer")
    FOOTER,

    /**
     * UI controls relevant to rendering questionnaire text items
     */
    @SerialName("text")
    TEXT,

    /**
     * Text is displayed as a paragraph in a sequential position between sibling items (default behavior)
     */
    @SerialName("inline")
    INLINE,

    /**
     * Text is displayed immediately below or within the answer-entry area of the containing question item (typically as a guide for what to enter)
     */
    @SerialName("prompt")
    PROMPT,

    /**
     * Text is displayed adjacent (horizontally or vertically) to the answer space for the parent question, typically to indicate a unit of measure
     */
    @SerialName("unit")
    UNIT,

    /**
     * Text is displayed to the left of the set of answer choices or a scaling control for the parent question item to indicate the meaning of the 'lower' bound.  E.g. 'Strongly disagree'
     */
    @SerialName("lower")
    LOWER,

    /**
     * Text is displayed to the right of the set of answer choices or a scaling control for the parent question item to indicate the meaning of the 'upper' bound.  E.g. 'Strongly agree'
     */
    @SerialName("upper")
    UPPER,

    /**
     * Text is temporarily visible over top of an item if the mouse is positioned over top of the text for the containing item
     */
    @SerialName("flyover")
    FLYOVER,

    /**
     * Text is displayed in a dialog box or similar control if invoked by pushing a button or some other UI-appropriate action to request 'help' for a question, group or the questionnaire as a whole (depending what the text is nested within)
     */
    @SerialName("help")
    HELP,

    /**
     * UI controls relevant to capturing question data
     */
    @SerialName("question")
    QUESTION,

    /**
     * A control which provides a list of potential matches based on text entered into a control.  Used for large choice sets where text-matching is an appropriate discovery mechanism.
     */
    @SerialName("autocomplete")
    AUTOCOMPLETE,

    /**
     * A control where an item (or multiple items) can be selected from a list that is only displayed when the user is editing the field.
     */
    @SerialName("drop-down")
    DROP_DOWN,

    /**
     * A control where choices are listed with a box beside them.  The box can be toggled to select or de-select a given choice.  Multiple selections may be possible.
     */
    @SerialName("check-box")
    CHECK_BOX,

    /**
     * A control where editing an item spawns a separate dialog box or screen permitting a user to navigate, filter or otherwise discover an appropriate match.  Useful for large choice sets where text matching is not an appropriate discovery mechanism.  Such screens must generally be tuned for the specific choice list structure.
     */
    @SerialName("lookup")
    LOOKUP,

    /**
     * A control where choices are listed with a button beside them.  The button can be toggled to select or de-select a given choice.  Selecting one item deselects all others.
     */
    @SerialName("radio-button")
    RADIO_BUTTON,

    /**
     * A control where an axis is displayed between the high and low values and the control can be visually manipulated to select a value anywhere on the axis.
     */
    @SerialName("slider")
    SLIDER,

    /**
     * A control where a list of numeric or other ordered values can be scrolled through via arrows.
     */
    @SerialName("spinner")
    SPINNER,

    /**
     * A control where a user can type in their answer freely.
     */
    @SerialName("text-box")
    TEXT_BOX
}
