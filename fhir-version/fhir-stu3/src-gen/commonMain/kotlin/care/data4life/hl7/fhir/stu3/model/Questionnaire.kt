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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.QuestionnaireItemType
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Integer
import care.data4life.hl7.fhir.stu3.primitive.Time
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirQuestionnaire
 *
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow
 * coherent, consistent data collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaire : FhirDomainResource {

    /**
     * Logical URI to reference this questionnaire (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the questionnaire.
     */
    val identifier: kotlin.collections.List<Identifier>?

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
     * The status of this questionnaire. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date this was last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Natural language description of the questionnaire.
     */
    val description: String?

    /**
     * Why this questionnaire is defined.
     */
    val purpose: String?

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
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for questionnaire (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Concept that represents the overall questionnaire.
     */
    val code: kotlin.collections.List<Coding>?

    /**
     * The types of subjects that can be the subject of responses created for the
     * questionnaire.
     */
    val subjectType: kotlin.collections.List<ResourceType>?

    /**
     * Questions and sections within the Questionnaire.
     */
    val item: kotlin.collections.List<QuestionnaireItem>?
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("Questionnaire")
data class Questionnaire(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("approvalDate")
    override val approvalDate: Date? = null,

    @SerialName("lastReviewDate")
    override val lastReviewDate: Date? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<Coding>? = null,

    @SerialName("subjectType")
    override val subjectType: kotlin.collections.List<ResourceType>? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<QuestionnaireItem>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Questionnaire"
    }
}

/**
 * FhirQuestionnaireItem
 *
 * A particular question, question grouping or display text that is part of the questionnaire.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
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
    val code: kotlin.collections.List<Coding>?

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
    val enableWhen: kotlin.collections.List<QuestionnaireItemEnableWhen>?

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
    val options: Reference?

    /**
     * Permitted answer.
     */
    val option: kotlin.collections.List<QuestionnaireItemOption>?

    /**
     * Default value when item is first rendered.
     */
    val initialBoolean: Bool?

    /**
     * Default value when item is first rendered.
     */
    val initialDecimal: Decimal?

    /**
     * Default value when item is first rendered.
     */
    val initialInteger: Integer?

    /**
     * Default value when item is first rendered.
     */
    val initialDate: Date?

    /**
     * Default value when item is first rendered.
     */
    val initialDateTime: DateTime?

    /**
     * Default value when item is first rendered.
     */
    val initialTime: Time?

    /**
     * Default value when item is first rendered.
     */
    val initialString: String?

    /**
     * Default value when item is first rendered.
     */
    val initialUri: String?

    /**
     * Default value when item is first rendered.
     */
    val initialAttachment: Attachment?

    /**
     * Default value when item is first rendered.
     */
    val initialCoding: Coding?

    /**
     * Default value when item is first rendered.
     */
    val initialQuantity: Quantity?

    /**
     * Default value when item is first rendered.
     */
    val initialReference: Reference?

    /**
     * Nested questionnaire items.
     */
    val item: kotlin.collections.List<QuestionnaireItem>?
}

/**
 * QuestionnaireItem
 *
 * A particular question, question grouping or display text that is part of the questionnaire.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItem")
data class QuestionnaireItem(

    @SerialName("linkId")
    override val linkId: String,

    @SerialName("definition")
    override val definition: String? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<Coding>? = null,

    @SerialName("prefix")
    override val prefix: String? = null,

    @SerialName("text")
    override val text: String? = null,

    @SerialName("type")
    override val type: QuestionnaireItemType,

    @SerialName("enableWhen")
    override val enableWhen: kotlin.collections.List<QuestionnaireItemEnableWhen>? = null,

    @SerialName("required")
    override val required: Bool? = null,

    @SerialName("repeats")
    override val repeats: Bool? = null,

    @SerialName("readOnly")
    override val readOnly: Bool? = null,

    @SerialName("maxLength")
    override val maxLength: Integer? = null,

    @SerialName("options")
    override val options: Reference? = null,

    @SerialName("option")
    override val option: kotlin.collections.List<QuestionnaireItemOption>? = null,

    @SerialName("initialBoolean")
    override val initialBoolean: Bool? = null,

    @SerialName("initialDecimal")
    override val initialDecimal: Decimal? = null,

    @SerialName("initialInteger")
    override val initialInteger: Integer? = null,

    @SerialName("initialDate")
    override val initialDate: Date? = null,

    @SerialName("initialDateTime")
    override val initialDateTime: DateTime? = null,

    @SerialName("initialTime")
    override val initialTime: Time? = null,

    @SerialName("initialString")
    override val initialString: String? = null,

    @SerialName("initialUri")
    override val initialUri: String? = null,

    @SerialName("initialAttachment")
    override val initialAttachment: Attachment? = null,

    @SerialName("initialCoding")
    override val initialCoding: Coding? = null,

    @SerialName("initialQuantity")
    override val initialQuantity: Quantity? = null,

    @SerialName("initialReference")
    override val initialReference: Reference? = null,

    @SerialName("item")
    override val item: kotlin.collections.List<QuestionnaireItem>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirQuestionnaireItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireItem"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaireItemEnableWhen : FhirBackboneElement {

    /**
     * Question that determines whether item is enabled.
     */
    val question: String

    /**
     * Enable when answered or not.
     */
    val hasAnswer: Bool?

    /**
     * Value question must have.
     */
    val answerBoolean: Bool?

    /**
     * Value question must have.
     */
    val answerDecimal: Decimal?

    /**
     * Value question must have.
     */
    val answerInteger: Integer?

    /**
     * Value question must have.
     */
    val answerDate: Date?

    /**
     * Value question must have.
     */
    val answerDateTime: DateTime?

    /**
     * Value question must have.
     */
    val answerTime: Time?

    /**
     * Value question must have.
     */
    val answerString: String?

    /**
     * Value question must have.
     */
    val answerUri: String?

    /**
     * Value question must have.
     */
    val answerAttachment: Attachment?

    /**
     * Value question must have.
     */
    val answerCoding: Coding?

    /**
     * Value question must have.
     */
    val answerQuantity: Quantity?

    /**
     * Value question must have.
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItemEnableWhen")
data class QuestionnaireItemEnableWhen(

    @SerialName("question")
    override val question: String,

    @SerialName("hasAnswer")
    override val hasAnswer: Bool? = null,

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

    @SerialName("answerUri")
    override val answerUri: String? = null,

    @SerialName("answerAttachment")
    override val answerAttachment: Attachment? = null,

    @SerialName("answerCoding")
    override val answerCoding: Coding? = null,

    @SerialName("answerQuantity")
    override val answerQuantity: Quantity? = null,

    @SerialName("answerReference")
    override val answerReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirQuestionnaireItemEnableWhen {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireItemEnableWhen"
    }
}

/**
 * FhirQuestionnaireItemOption
 *
 * One of the permitted answers for a "choice" or "open-choice" question.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemOption</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
interface FhirQuestionnaireItemOption : FhirBackboneElement {

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
}

/**
 * QuestionnaireItemOption
 *
 * One of the permitted answers for a "choice" or "open-choice" question.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemOption</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItemOption")
data class QuestionnaireItemOption(

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

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirQuestionnaireItemOption {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireItemOption"
    }
}
