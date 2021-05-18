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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.codesystem.EnableWhenBehavior
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.QuestionnaireItemOperator
import care.data4life.hl7.fhir.r4.codesystem.QuestionnaireItemType
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import care.data4life.hl7.fhir.r4.primitive.Time
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirQuestionnaire
 *
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow
 * coherent, consistent data collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaire : FhirDomainResource {

    /**
     * Canonical identifier for this questionnaire, represented as a URI (globally
     * unique).
     */
    val url: String?

    /**
     * Additional identifier for the questionnaire.
     */
    val identifier: List<Identifier>?

    /**
     * Business version of the questionnaire.
     */
    val version: String?

    /**
     * Name for this questionnaire (computer friendly).
     */
    val name: String?

    /**
     * Name for this questionnaire (human friendly).
     */
    val title: String?

    /**
     * Instantiates protocol or definition.
     */
    val derivedFrom: List<String>?

    /**
     * The status of this questionnaire. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * The types of subjects that can be the subject of responses created for the
     * questionnaire.
     */
    val subjectType: List<ResourceType>?

    /**
     * Date last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: List<ContactDetail>?

    /**
     * Natural language description of the questionnaire.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: List<UsageContext>?

    /**
     * Intended jurisdiction for questionnaire (if applicable).
     */
    val jurisdiction: List<CodeableConcept>?

    /**
     * Why this questionnaire is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the questionnaire was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the questionnaire was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the questionnaire is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * Concept that represents the overall questionnaire.
     */
    val code: List<Coding>?

    /**
     * Questions and sections within the Questionnaire.
     */
    val item: List<QuestionnaireItem>?
}

/**
 * Questionnaire
 *
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow
 * coherent, consistent data collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("Questionnaire")
data class Questionnaire(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("derivedFrom")
    override val derivedFrom: List<String>? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("subjectType")
    override val subjectType: List<ResourceType>? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("approvalDate")
    override val approvalDate: Date? = null,

    @SerialName("lastReviewDate")
    override val lastReviewDate: Date? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("code")
    override val code: List<Coding>? = null,

    @SerialName("item")
    override val item: List<QuestionnaireItem>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirQuestionnaire {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Questionnaire"
    }
}

/**
 * FhirQuestionnaireItem
 *
 * A particular question, question grouping or display text that is part of the questionnaire.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaireItem : FhirBackboneElement {

    /**
     * Unique id for item in questionnaire.
     */
    val linkId: String

    /**
     * ElementDefinition - details for the item.
     */
    val definition: String?

    /**
     * Corresponding concept for this item in a terminology.
     */
    val code: List<Coding>?

    /**
     * E.g. "1(a)", "2.5.3".
     */
    val prefix: String?

    /**
     * Primary text for the item.
     */
    val text: String?

    /**
     * The type of questionnaire item this is - whether text for display, a grouping of
     * other items or a particular type of data to be captured (string, integer, coded
     * choice, etc.).
     */
    val type: QuestionnaireItemType

    /**
     * Only allow data when.
     */
    val enableWhen: List<QuestionnaireItemEnableWhen>?

    /**
     * Controls how multiple enableWhen values are interpreted - whether all or any
     * must be true.
     */
    val enableBehavior: EnableWhenBehavior?

    /**
     * Whether the item must be included in data results.
     */
    val required: Bool?

    /**
     * Whether the item may repeat.
     */
    val repeats: Bool?

    /**
     * Don't allow human editing.
     */
    val readOnly: Bool?

    /**
     * No more than this many characters.
     */
    val maxLength: Integer?

    /**
     * Valueset containing permitted answers.
     */
    val answerValueSet: String?

    /**
     * Permitted answer.
     */
    val answerOption: List<QuestionnaireItemAnswerOption>?

    /**
     * Initial value(s) when item is first rendered.
     */
    val initial: List<QuestionnaireItemInitial>?

    /**
     * Nested questionnaire items.
     */
    val item: List<QuestionnaireItem>?
}

/**
 * QuestionnaireItem
 *
 * A particular question, question grouping or display text that is part of the questionnaire.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItem")
data class QuestionnaireItem(

    @SerialName("linkId")
    override val linkId: String,

    @SerialName("definition")
    override val definition: String? = null,

    @SerialName("code")
    override val code: List<Coding>? = null,

    @SerialName("prefix")
    override val prefix: String? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("type")
    override val type: QuestionnaireItemType,

    @SerialName("enableWhen")
    override val enableWhen: List<QuestionnaireItemEnableWhen>? = null,

    @SerialName("enableBehavior")
    override val enableBehavior: EnableWhenBehavior? = null,

    @SerialName("required")
    override val required: Bool? = null,

    @SerialName("repeats")
    override val repeats: Bool? = null,

    @SerialName("readOnly")
    override val readOnly: Bool? = null,

    @SerialName("maxLength")
    override val maxLength: Integer? = null,

    @SerialName("answerValueSet")
    override val answerValueSet: String? = null,

    @SerialName("answerOption")
    override val answerOption: List<QuestionnaireItemAnswerOption>? = null,

    @SerialName("initial")
    override val initial: List<QuestionnaireItemInitial>? = null,

    @SerialName("item")
    override val item: List<QuestionnaireItem>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirQuestionnaireItem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "QuestionnaireItem"
    }
}

/**
 * FhirQuestionnaireItemAnswerOption
 *
 * One of the permitted answers for a "choice" or "open-choice" question.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemAnswerOption</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaireItemAnswerOption : FhirBackboneElement {

    /**
     * Answer value.
     */
    val valueInteger: Integer?

    /**
     * Answer value.
     */
    val valueDate: Date?

    /**
     * Answer value.
     */
    val valueTime: Time?

    /**
     * Answer value.
     */
    val valueString: String?

    /**
     * Answer value.
     */
    val valueCoding: Coding?

    /**
     * Answer value.
     */
    val valueReference: Reference?

    /**
     * Whether option is selected by default.
     */
    val initialSelected: Bool?
}

/**
 * QuestionnaireItemAnswerOption
 *
 * One of the permitted answers for a "choice" or "open-choice" question.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemAnswerOption</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItemAnswerOption")
data class QuestionnaireItemAnswerOption(

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueDate")
    override val valueDate: Date? = null,

    @SerialName("valueTime")
    override val valueTime: Time? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,

    @SerialName("valueReference")
    override val valueReference: Reference? = null,

    @SerialName("initialSelected")
    override val initialSelected: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirQuestionnaireItemAnswerOption {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "QuestionnaireItemAnswerOption"
    }
}

/**
 * FhirQuestionnaireItemEnableWhen
 *
 * A constraint indicating that this item should only be enabled (displayed/allow answers to be
 * captured) when the specified condition is true.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemEnableWhen</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaireItemEnableWhen : FhirBackboneElement {

    /**
     * Question that determines whether item is enabled.
     */
    val question: String

    /**
     * Specifies the criteria by which the question is enabled.
     */
    val operator: QuestionnaireItemOperator

    /**
     * Value for question comparison based on operator.
     */
    val answerBoolean: Bool?

    /**
     * Value for question comparison based on operator.
     */
    val answerDecimal: Decimal?

    /**
     * Value for question comparison based on operator.
     */
    val answerInteger: Integer?

    /**
     * Value for question comparison based on operator.
     */
    val answerDate: Date?

    /**
     * Value for question comparison based on operator.
     */
    val answerDateTime: DateTime?

    /**
     * Value for question comparison based on operator.
     */
    val answerTime: Time?

    /**
     * Value for question comparison based on operator.
     */
    val answerString: String?

    /**
     * Value for question comparison based on operator.
     */
    val answerCoding: Coding?

    /**
     * Value for question comparison based on operator.
     */
    val answerQuantity: Quantity?

    /**
     * Value for question comparison based on operator.
     */
    val answerReference: Reference?
}

/**
 * QuestionnaireItemEnableWhen
 *
 * A constraint indicating that this item should only be enabled (displayed/allow answers to be
 * captured) when the specified condition is true.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemEnableWhen</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItemEnableWhen")
data class QuestionnaireItemEnableWhen(

    @SerialName("question")
    override val question: String,

    @SerialName("operator")
    override val operator: QuestionnaireItemOperator,

    @SerialName("answerBoolean")
    override val answerBoolean: Bool? = null,

    @SerialName("answerDecimal")
    override val answerDecimal: Decimal? = null,

    @SerialName("answerInteger")
    override val answerInteger: Integer? = null,

    @SerialName("answerDate")
    override val answerDate: Date? = null,

    @SerialName("answerDateTime")
    override val answerDateTime: DateTime? = null,

    @SerialName("answerTime")
    override val answerTime: Time? = null,

    @SerialName("answerString")
    override val answerString: String? = null,

    @SerialName("answerCoding")
    override val answerCoding: Coding? = null,

    @SerialName("answerQuantity")
    override val answerQuantity: Quantity? = null,

    @SerialName("answerReference")
    override val answerReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirQuestionnaireItemEnableWhen {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "QuestionnaireItemEnableWhen"
    }
}

/**
 * FhirQuestionnaireItemInitial
 *
 * One or more values that should be pre-populated in the answer when initially rendering the
 * questionnaire for user input.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemInitial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaireItemInitial : FhirBackboneElement {

    /**
     * Actual value for initializing the question.
     */
    val valueBoolean: Bool?

    /**
     * Actual value for initializing the question.
     */
    val valueDecimal: Decimal?

    /**
     * Actual value for initializing the question.
     */
    val valueInteger: Integer?

    /**
     * Actual value for initializing the question.
     */
    val valueDate: Date?

    /**
     * Actual value for initializing the question.
     */
    val valueDateTime: DateTime?

    /**
     * Actual value for initializing the question.
     */
    val valueTime: Time?

    /**
     * Actual value for initializing the question.
     */
    val valueString: String?

    /**
     * Actual value for initializing the question.
     */
    val valueUri: String?

    /**
     * Actual value for initializing the question.
     */
    val valueAttachment: Attachment?

    /**
     * Actual value for initializing the question.
     */
    val valueCoding: Coding?

    /**
     * Actual value for initializing the question.
     */
    val valueQuantity: Quantity?

    /**
     * Actual value for initializing the question.
     */
    val valueReference: Reference?
}

/**
 * QuestionnaireItemInitial
 *
 * One or more values that should be pre-populated in the answer when initially rendering the
 * questionnaire for user input.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemInitial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItemInitial")
data class QuestionnaireItemInitial(

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueDate")
    override val valueDate: Date? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valueTime")
    override val valueTime: Time? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueUri")
    override val valueUri: String? = null,

    @SerialName("valueAttachment")
    override val valueAttachment: Attachment? = null,

    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueReference")
    override val valueReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirQuestionnaireItemInitial {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "QuestionnaireItemInitial"
    }
}
