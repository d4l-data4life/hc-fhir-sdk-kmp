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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.QuestionnaireResponseStatus
import care.data4life.hl7.fhir.stu3.primitive.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirQuestionnaireResponse : FhirDomainResource {

    // Unique id for this set of answers.
    val identifier: Identifier?

    // Request fulfilled by this QuestionnaireResponse.
    val basedOn: List<Reference>?

    // Part of this action.
    val parent: List<Reference>?

    // Form being answered.
    val questionnaire: Reference?

    // The position of the questionnaire response within its overall lifecycle.
    val status: QuestionnaireResponseStatus

    // The subject of the questions.
    val subject: Reference?

    // Encounter or Episode during which questionnaire was completed.
    val context: Reference?

    // Date the answers were gathered.
    val authored: DateTime?

    // Person who received and recorded the answers.
    val author: Reference?

    // The person who answered the questions.
    val source: Reference?

    // Groups and questions.
    val item: List<QuestionnaireResponseItem>?
}


/**
 * ClassName: QuestionnaireResponse
 *
 * SourceFileName: QuestionnaireResponse.kt
 *
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse">QuestionnaireResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse)
 */
@Serializable
@SerialName("QuestionnaireResponse")
data class QuestionnaireResponse(

    // Unique id for this set of answers.
    @SerialName("identifier")
    override val identifier: Identifier? = null,
    // Request fulfilled by this QuestionnaireResponse.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,
    // Part of this action.
    @SerialName("parent")
    override val parent: List<Reference>? = null,
    // Form being answered.
    @SerialName("questionnaire")
    override val questionnaire: Reference? = null,
    // The position of the questionnaire response within its overall lifecycle.
    @SerialName("status")
    override val status: QuestionnaireResponseStatus,
    // The subject of the questions.
    @SerialName("subject")
    override val subject: Reference? = null,
    // Encounter or Episode during which questionnaire was completed.
    @SerialName("context")
    override val context: Reference? = null,
    // Date the answers were gathered.
    @SerialName("authored")
    override val authored: DateTime? = null,
    // Person who received and recorded the answers.
    @SerialName("author")
    override val author: Reference? = null,
    // The person who answered the questions.
    @SerialName("source")
    override val source: Reference? = null,
    // Groups and questions.
    @SerialName("item")
    override val item: List<QuestionnaireResponseItem>? = null,


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
) : FhirQuestionnaireResponse {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireResponse"
    }
}


interface FhirQuestionnaireResponseItem : FhirBackboneElement {

    // Pointer to specific item from Questionnaire.
    val linkId: String

    // ElementDefinition - details for the item.
    val definition: String?

    // Name for group or question text.
    val text: String?

    // The subject this group's answers are about.
    val subject: Reference?

    // The response(s) to the question.
    val answer: List<QuestionnaireResponseItemAnswer>?

    // Nested questionnaire response items.
    val item: List<QuestionnaireResponseItem>?
}


/**
 * ClassName: QuestionnaireResponseItem
 *
 * SourceFileName: QuestionnaireResponse.kt
 *
 *
 * A group or question item from the original questionnaire for which answers are provided.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse">QuestionnaireResponseItem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse)
 */
@Serializable
@SerialName("QuestionnaireResponseItem")
data class QuestionnaireResponseItem(

    // Pointer to specific item from Questionnaire.
    @SerialName("linkId")
    override val linkId: String,
    // ElementDefinition - details for the item.
    @SerialName("definition")
    override val definition: String? = null,
    // Name for group or question text.
    @SerialName("text")
    override val text: String? = null,
    // The subject this group's answers are about.
    @SerialName("subject")
    override val subject: Reference? = null,
    // The response(s) to the question.
    @SerialName("answer")
    override val answer: List<QuestionnaireResponseItemAnswer>? = null,
    // Nested questionnaire response items.
    @SerialName("item")
    override val item: List<QuestionnaireResponseItem>? = null,


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
) : FhirQuestionnaireResponseItem {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireResponseItem"
    }
}


interface FhirQuestionnaireResponseItemAnswer : FhirBackboneElement {

    // Single-valued answer to the question.
    val valueBoolean: Bool?

    // Single-valued answer to the question.
    val valueDecimal: Decimal?

    // Single-valued answer to the question.
    val valueInteger: Integer?

    // Single-valued answer to the question.
    val valueDate: Date?

    // Single-valued answer to the question.
    val valueDateTime: DateTime?

    // Single-valued answer to the question.
    val valueTime: Time?

    // Single-valued answer to the question.
    val valueString: String?

    // Single-valued answer to the question.
    val valueUri: String?

    // Single-valued answer to the question.
    val valueAttachment: Attachment?

    // Single-valued answer to the question.
    val valueCoding: Coding?

    // Single-valued answer to the question.
    val valueQuantity: Quantity?

    // Single-valued answer to the question.
    val valueReference: Reference?

    // Nested groups and questions.
    val item: List<QuestionnaireResponseItem>?
}


/**
 * ClassName: QuestionnaireResponseItemAnswer
 *
 * SourceFileName: QuestionnaireResponse.kt
 *
 *
 * The respondent's answer(s) to the question.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse">QuestionnaireResponseItemAnswer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/QuestionnaireResponse)
 */
@Serializable
@SerialName("QuestionnaireResponseItemAnswer")
data class QuestionnaireResponseItemAnswer(

    // Single-valued answer to the question.
    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,
    // Single-valued answer to the question.
    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,
    // Single-valued answer to the question.
    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,
    // Single-valued answer to the question.
    @SerialName("valueDate")
    override val valueDate: Date? = null,
    // Single-valued answer to the question.
    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,
    // Single-valued answer to the question.
    @SerialName("valueTime")
    override val valueTime: Time? = null,
    // Single-valued answer to the question.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Single-valued answer to the question.
    @SerialName("valueUri")
    override val valueUri: String? = null,
    // Single-valued answer to the question.
    @SerialName("valueAttachment")
    override val valueAttachment: Attachment? = null,
    // Single-valued answer to the question.
    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,
    // Single-valued answer to the question.
    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,
    // Single-valued answer to the question.
    @SerialName("valueReference")
    override val valueReference: Reference? = null,
    // Nested groups and questions.
    @SerialName("item")
    override val item: List<QuestionnaireResponseItem>? = null,


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
) : FhirQuestionnaireResponseItemAnswer {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "QuestionnaireResponseItemAnswer"
    }
}

