/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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
import care.data4life.hl7.fhir.stu3.primitive.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirQuestionnaire : FhirDomainResource {

    // Logical URI to reference this questionnaire (globally unique).
    val url: String?

    // Additional identifier for the questionnaire.
    val identifier: List<Identifier>?

    // Business version of the questionnaire.
    val version: String?

    // Name for this questionnaire (computer friendly).
    val name: String?

    // Name for this questionnaire (human friendly).
    val title: String?

    // The status of this questionnaire. Enables tracking the life-cycle of the content.
    val status: PublicationStatus

    // For testing purposes, not real usage.
    val experimental: Bool?

    // Date this was last changed.
    val date: DateTime?

    // Name of the publisher (organization or individual).
    val publisher: String?

    // Natural language description of the questionnaire.
    val description: String?

    // Why this questionnaire is defined.
    val purpose: String?

    // When the questionnaire was approved by publisher.
    val approvalDate: Date?

    // When the questionnaire was last reviewed.
    val lastReviewDate: Date?

    // When the questionnaire is expected to be used.
    val effectivePeriod: Period?

    // Context the content is intended to support.
    val useContext: List<UsageContext>?

    // Intended jurisdiction for questionnaire (if applicable).
    val jurisdiction: List<CodeableConcept>?

    // Contact details for the publisher.
    val contact: List<ContactDetail>?

    // Use and/or publishing restrictions.
    val copyright: String?

    // Concept that represents the overall questionnaire.
    val code: List<Coding>?

    // The types of subjects that can be the subject of responses created for the questionnaire.
    val subjectType: List<ResourceType>?

    // Questions and sections within the Questionnaire.
    val item: List<QuestionnaireItem>?
}

/**
 * ClassName: Questionnaire
 *
 * SourceFileName: Questionnaire.kt
 *
 *
 * A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">Questionnaire</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("Questionnaire")
data class Questionnaire(

    // Logical URI to reference this questionnaire (globally unique).
    @SerialName("url")
    override val url: String? = null,
    // Additional identifier for the questionnaire.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Business version of the questionnaire.
    @SerialName("version")
    override val version: String? = null,
    // Name for this questionnaire (computer friendly).
    @SerialName("name")
    override val name: String? = null,
    // Name for this questionnaire (human friendly).
    @SerialName("title")
    override val title: String? = null,
    // The status of this questionnaire. Enables tracking the life-cycle of the content.
    @SerialName("status")
    override val status: PublicationStatus,
    // For testing purposes, not real usage.
    @SerialName("experimental")
    override val experimental: Bool? = null,
    // Date this was last changed.
    @SerialName("date")
    override val date: DateTime? = null,
    // Name of the publisher (organization or individual).
    @SerialName("publisher")
    override val publisher: String? = null,
    // Natural language description of the questionnaire.
    @SerialName("description")
    override val description: String? = null,
    // Why this questionnaire is defined.
    @SerialName("purpose")
    override val purpose: String? = null,
    // When the questionnaire was approved by publisher.
    @SerialName("approvalDate")
    override val approvalDate: Date? = null,
    // When the questionnaire was last reviewed.
    @SerialName("lastReviewDate")
    override val lastReviewDate: Date? = null,
    // When the questionnaire is expected to be used.
    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,
    // Context the content is intended to support.
    @SerialName("useContext")
    override val useContext: List<UsageContext>? = null,
    // Intended jurisdiction for questionnaire (if applicable).
    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,
    // Contact details for the publisher.
    @SerialName("contact")
    override val contact: List<ContactDetail>? = null,
    // Use and/or publishing restrictions.
    @SerialName("copyright")
    override val copyright: String? = null,
    // Concept that represents the overall questionnaire.
    @SerialName("code")
    override val code: List<Coding>? = null,
    // The types of subjects that can be the subject of responses created for the questionnaire.
    @SerialName("subjectType")
    override val subjectType: List<ResourceType>? = null,
    // Questions and sections within the Questionnaire.
    @SerialName("item")
    override val item: List<QuestionnaireItem>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource
    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,
    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,
    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    // Language of the resource content.
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

interface FhirQuestionnaireItem : FhirBackboneElement {

    // Unique id for item in questionnaire.
    val linkId: String

    // ElementDefinition - details for the item.
    val definition: String?

    // Corresponding concept for this item in a terminology.
    val code: List<Coding>?

    // E.g. "1(a)", "2.5.3".
    val prefix: String?

    // Primary text for the item.
    val text: String?

    // The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
    val type: QuestionnaireItemType

    // Only allow data when.
    val enableWhen: List<QuestionnaireItemEnableWhen>?

    // Whether the item must be included in data results.
    val required: Bool?

    // Whether the item may repeat.
    val repeats: Bool?

    // Don't allow human editing.
    val readOnly: Bool?

    // No more than this many characters.
    val maxLength: Integer?

    // Valueset containing permitted answers.
    val options: Reference?

    // Permitted answer.
    val option: List<QuestionnaireItemOption>?

    // Default value when item is first rendered.
    val initialBoolean: Bool?

    // Default value when item is first rendered.
    val initialDecimal: Decimal?

    // Default value when item is first rendered.
    val initialInteger: Integer?

    // Default value when item is first rendered.
    val initialDate: Date?

    // Default value when item is first rendered.
    val initialDateTime: DateTime?

    // Default value when item is first rendered.
    val initialTime: Time?

    // Default value when item is first rendered.
    val initialString: String?

    // Default value when item is first rendered.
    val initialUri: String?

    // Default value when item is first rendered.
    val initialAttachment: Attachment?

    // Default value when item is first rendered.
    val initialCoding: Coding?

    // Default value when item is first rendered.
    val initialQuantity: Quantity?

    // Default value when item is first rendered.
    val initialReference: Reference?

    // Nested questionnaire items.
    val item: List<QuestionnaireItem>?
}

/**
 * ClassName: QuestionnaireItem
 *
 * SourceFileName: Questionnaire.kt
 *
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

    // Unique id for item in questionnaire.
    @SerialName("linkId")
    override val linkId: String,
    // ElementDefinition - details for the item.
    @SerialName("definition")
    override val definition: String? = null,
    // Corresponding concept for this item in a terminology.
    @SerialName("code")
    override val code: List<Coding>? = null,
    // E.g. "1(a)", "2.5.3".
    @SerialName("prefix")
    override val prefix: String? = null,
    // Primary text for the item.
    @SerialName("text")
    override val text: String? = null,
    // The type of questionnaire item this is - whether text for display, a grouping of other items or a particular type of data to be captured (string, integer, coded choice, etc.).
    @SerialName("type")
    override val type: QuestionnaireItemType,
    // Only allow data when.
    @SerialName("enableWhen")
    override val enableWhen: List<QuestionnaireItemEnableWhen>? = null,
    // Whether the item must be included in data results.
    @SerialName("required")
    override val required: Bool? = null,
    // Whether the item may repeat.
    @SerialName("repeats")
    override val repeats: Bool? = null,
    // Don't allow human editing.
    @SerialName("readOnly")
    override val readOnly: Bool? = null,
    // No more than this many characters.
    @SerialName("maxLength")
    override val maxLength: Integer? = null,
    // Valueset containing permitted answers.
    @SerialName("options")
    override val options: Reference? = null,
    // Permitted answer.
    @SerialName("option")
    override val option: List<QuestionnaireItemOption>? = null,
    // Default value when item is first rendered.
    @SerialName("initialBoolean")
    override val initialBoolean: Bool? = null,
    // Default value when item is first rendered.
    @SerialName("initialDecimal")
    override val initialDecimal: Decimal? = null,
    // Default value when item is first rendered.
    @SerialName("initialInteger")
    override val initialInteger: Integer? = null,
    // Default value when item is first rendered.
    @SerialName("initialDate")
    override val initialDate: Date? = null,
    // Default value when item is first rendered.
    @SerialName("initialDateTime")
    override val initialDateTime: DateTime? = null,
    // Default value when item is first rendered.
    @SerialName("initialTime")
    override val initialTime: Time? = null,
    // Default value when item is first rendered.
    @SerialName("initialString")
    override val initialString: String? = null,
    // Default value when item is first rendered.
    @SerialName("initialUri")
    override val initialUri: String? = null,
    // Default value when item is first rendered.
    @SerialName("initialAttachment")
    override val initialAttachment: Attachment? = null,
    // Default value when item is first rendered.
    @SerialName("initialCoding")
    override val initialCoding: Coding? = null,
    // Default value when item is first rendered.
    @SerialName("initialQuantity")
    override val initialQuantity: Quantity? = null,
    // Default value when item is first rendered.
    @SerialName("initialReference")
    override val initialReference: Reference? = null,
    // Nested questionnaire items.
    @SerialName("item")
    override val item: List<QuestionnaireItem>? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirQuestionnaireItem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireItem"
    }
}

interface FhirQuestionnaireItemEnableWhen : FhirBackboneElement {

    // Question that determines whether item is enabled.
    val question: String

    // Enable when answered or not.
    val hasAnswer: Bool?

    // Value question must have.
    val answerBoolean: Bool?

    // Value question must have.
    val answerDecimal: Decimal?

    // Value question must have.
    val answerInteger: Integer?

    // Value question must have.
    val answerDate: Date?

    // Value question must have.
    val answerDateTime: DateTime?

    // Value question must have.
    val answerTime: Time?

    // Value question must have.
    val answerString: String?

    // Value question must have.
    val answerUri: String?

    // Value question must have.
    val answerAttachment: Attachment?

    // Value question must have.
    val answerCoding: Coding?

    // Value question must have.
    val answerQuantity: Quantity?

    // Value question must have.
    val answerReference: Reference?
}

/**
 * ClassName: QuestionnaireItemEnableWhen
 *
 * SourceFileName: Questionnaire.kt
 *
 *
 * A constraint indicating that this item should only be enabled (displayed/allow answers to be captured) when the specified condition is true.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Questionnaire">QuestionnaireItemEnableWhen</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Questionnaire)
 */
@Serializable
@SerialName("QuestionnaireItemEnableWhen")
data class QuestionnaireItemEnableWhen(

    // Question that determines whether item is enabled.
    @SerialName("question")
    override val question: String,
    // Enable when answered or not.
    @SerialName("hasAnswer")
    override val hasAnswer: Bool? = null,
    // Value question must have.
    @SerialName("answerBoolean")
    override val answerBoolean: Bool? = null,
    // Value question must have.
    @SerialName("answerDecimal")
    override val answerDecimal: Decimal? = null,
    // Value question must have.
    @SerialName("answerInteger")
    override val answerInteger: Integer? = null,
    // Value question must have.
    @SerialName("answerDate")
    override val answerDate: Date? = null,
    // Value question must have.
    @SerialName("answerDateTime")
    override val answerDateTime: DateTime? = null,
    // Value question must have.
    @SerialName("answerTime")
    override val answerTime: Time? = null,
    // Value question must have.
    @SerialName("answerString")
    override val answerString: String? = null,
    // Value question must have.
    @SerialName("answerUri")
    override val answerUri: String? = null,
    // Value question must have.
    @SerialName("answerAttachment")
    override val answerAttachment: Attachment? = null,
    // Value question must have.
    @SerialName("answerCoding")
    override val answerCoding: Coding? = null,
    // Value question must have.
    @SerialName("answerQuantity")
    override val answerQuantity: Quantity? = null,
    // Value question must have.
    @SerialName("answerReference")
    override val answerReference: Reference? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirQuestionnaireItemEnableWhen {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireItemEnableWhen"
    }
}

interface FhirQuestionnaireItemOption : FhirBackboneElement {

    // Answer value.
    val valueInteger: Integer?

    // Answer value.
    val valueDate: Date?

    // Answer value.
    val valueTime: Time?

    // Answer value.
    val valueString: String?

    // Answer value.
    val valueCoding: Coding?
}

/**
 * ClassName: QuestionnaireItemOption
 *
 * SourceFileName: Questionnaire.kt
 *
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

    // Answer value.
    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,
    // Answer value.
    @SerialName("valueDate")
    override val valueDate: Date? = null,
    // Answer value.
    @SerialName("valueTime")
    override val valueTime: Time? = null,
    // Answer value.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Answer value.
    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,

    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirQuestionnaireItemOption {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireItemOption"
    }
}
