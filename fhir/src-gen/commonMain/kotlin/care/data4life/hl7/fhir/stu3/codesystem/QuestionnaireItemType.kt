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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Distinguishes groups from questions and display text and indicates data type for questions
 *
 * @see <a href="http://hl7.org/fhir/item-type">QuestionnaireItemType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/item-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class QuestionnaireItemType {
    /**
     * An item with no direct answer but should have at least one child item.
     */
    @SerialName("group")
    GROUP,

    /**
     * Text for display that will not capture an answer or have child items.
     */
    @SerialName("display")
    DISPLAY,

    /**
     * An item that defines a specific answer to be captured, and may have child items.
    (the answer provided in the QuestionnaireResponse should be of the defined datatype)
     */
    @SerialName("question")
    QUESTION,

    /**
     * Question with a yes/no answer (valueBoolean)
     */
    @SerialName("boolean")
    BOOLEAN,

    /**
     * Question with is a real number answer (valueDecimal)
     */
    @SerialName("decimal")
    DECIMAL,

    /**
     * Question with an integer answer (valueInteger)
     */
    @SerialName("integer")
    INTEGER,

    /**
     * Question with a date answer (valueDate)
     */
    @SerialName("date")
    DATE,

    /**
     * Question with a date and time answer (valueDateTime)
     */
    @SerialName("dateTime")
    DATETIME,

    /**
     * Question with a time (hour:minute:second) answer independent of date. (valueTime)
     */
    @SerialName("time")
    TIME,

    /**
     * Question with a short (few words to short sentence) free-text entry answer (valueString)
     */
    @SerialName("string")
    STRING,

    /**
     * Question with a long (potentially multi-paragraph) free-text entry answer (valueString)
     */
    @SerialName("text")
    TEXT,

    /**
     * Question with a URL (website, FTP site, etc.) answer (valueUri)
     */
    @SerialName("url")
    URL,

    /**
     * Question with a Coding drawn from a list of options (specified in either the option property, or via the valueset referenced in the options property) as an answer (valueCoding)
     */
    @SerialName("choice")
    CHOICE,

    /**
     * Answer is a Coding drawn from a list of options (as with the choice type) or a free-text entry in a string (valueCoding or valueString)
     */
    @SerialName("open-choice")
    OPEN_CHOICE,

    /**
     * Question with binary content such as a image, PDF, etc. as an answer (valueAttachment)
     */
    @SerialName("attachment")
    ATTACHMENT,

    /**
     * Question with a reference to another resource (practitioner, organization, etc.) as an answer (valueReference)
     */
    @SerialName("reference")
    REFERENCE,

    /**
     * Question with a combination of a numeric value and unit, potentially with a comparator (<, >, etc.) as an answer. (valueQuantity)
    There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to define what unit whould be captured (or the a unit that has a ucum conversion from the provided unit)
     */
    @SerialName("quantity")
    QUANTITY
}
