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

import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirCondition : FhirDomainResource {

    // External Ids for this condition.
    val identifier: List<Identifier>?

    // active | recurrence | relapse | inactive | remission | resolved.
    val clinicalStatus: CodeableConcept?

    // unconfirmed | provisional | differential | confirmed | refuted | entered-in-error.
    val verificationStatus: CodeableConcept?

    // problem-list-item | encounter-diagnosis.
    val category: List<CodeableConcept>?

    // Subjective severity of condition.
    val severity: CodeableConcept?

    // Identification of the condition, problem or diagnosis.
    val code: CodeableConcept?

    // Anatomical location, if relevant.
    val bodySite: List<CodeableConcept>?

    // Who has the condition?.
    val subject: Reference

    // Encounter created as part of.
    val encounter: Reference?

    // Estimated or actual date,  date-time, or age.
    val onsetDateTime: DateTime?

    // Estimated or actual date,  date-time, or age.
    val onsetAge: Age?

    // Estimated or actual date,  date-time, or age.
    val onsetPeriod: Period?

    // Estimated or actual date,  date-time, or age.
    val onsetRange: Range?

    // Estimated or actual date,  date-time, or age.
    val onsetString: String?

    // When in resolution/remission.
    val abatementDateTime: DateTime?

    // When in resolution/remission.
    val abatementAge: Age?

    // When in resolution/remission.
    val abatementPeriod: Period?

    // When in resolution/remission.
    val abatementRange: Range?

    // When in resolution/remission.
    val abatementString: String?

    // Date record was first recorded.
    val recordedDate: DateTime?

    // Who recorded the condition.
    val recorder: Reference?

    // Person who asserts this condition.
    val asserter: Reference?

    // Stage/grade, usually assessed formally.
    val stage: List<ConditionStage>?

    // Supporting evidence.
    val evidence: List<ConditionEvidence>?

    // Additional information about the Condition.
    val note: List<Annotation>?
}

/**
 * ClassName: Condition
 *
 * SourceFileName: Condition.kt
 *
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("Condition")
data class Condition(

    // External Ids for this condition.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // active | recurrence | relapse | inactive | remission | resolved.
    @SerialName("clinicalStatus")
    override val clinicalStatus: CodeableConcept? = null,
    // unconfirmed | provisional | differential | confirmed | refuted | entered-in-error.
    @SerialName("verificationStatus")
    override val verificationStatus: CodeableConcept? = null,
    // problem-list-item | encounter-diagnosis.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,
    // Subjective severity of condition.
    @SerialName("severity")
    override val severity: CodeableConcept? = null,
    // Identification of the condition, problem or diagnosis.
    @SerialName("code")
    override val code: CodeableConcept? = null,
    // Anatomical location, if relevant.
    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,
    // Who has the condition?.
    @SerialName("subject")
    override val subject: Reference,
    // Encounter created as part of.
    @SerialName("encounter")
    override val encounter: Reference? = null,
    // Estimated or actual date,  date-time, or age.
    @SerialName("onsetDateTime")
    override val onsetDateTime: DateTime? = null,
    // Estimated or actual date,  date-time, or age.
    @SerialName("onsetAge")
    override val onsetAge: Age? = null,
    // Estimated or actual date,  date-time, or age.
    @SerialName("onsetPeriod")
    override val onsetPeriod: Period? = null,
    // Estimated or actual date,  date-time, or age.
    @SerialName("onsetRange")
    override val onsetRange: Range? = null,
    // Estimated or actual date,  date-time, or age.
    @SerialName("onsetString")
    override val onsetString: String? = null,
    // When in resolution/remission.
    @SerialName("abatementDateTime")
    override val abatementDateTime: DateTime? = null,
    // When in resolution/remission.
    @SerialName("abatementAge")
    override val abatementAge: Age? = null,
    // When in resolution/remission.
    @SerialName("abatementPeriod")
    override val abatementPeriod: Period? = null,
    // When in resolution/remission.
    @SerialName("abatementRange")
    override val abatementRange: Range? = null,
    // When in resolution/remission.
    @SerialName("abatementString")
    override val abatementString: String? = null,
    // Date record was first recorded.
    @SerialName("recordedDate")
    override val recordedDate: DateTime? = null,
    // Who recorded the condition.
    @SerialName("recorder")
    override val recorder: Reference? = null,
    // Person who asserts this condition.
    @SerialName("asserter")
    override val asserter: Reference? = null,
    // Stage/grade, usually assessed formally.
    @SerialName("stage")
    override val stage: List<ConditionStage>? = null,
    // Supporting evidence.
    @SerialName("evidence")
    override val evidence: List<ConditionEvidence>? = null,
    // Additional information about the Condition.
    @SerialName("note")
    override val note: List<Annotation>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional content defined by implementations.
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
) : FhirCondition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Condition"
    }
}

interface FhirConditionEvidence : FhirBackboneElement {

    // Manifestation/symptom.
    val code: List<CodeableConcept>?

    // Supporting information found elsewhere.
    val detail: List<Reference>?
}

/**
 * ClassName: ConditionEvidence
 *
 * SourceFileName: Condition.kt
 *
 *
 * Supporting evidence / manifestations that are the basis of the Condition's verification status, such as evidence that confirmed or refuted the condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionEvidence</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("ConditionEvidence")
data class ConditionEvidence(

    // Manifestation/symptom.
    @SerialName("code")
    override val code: List<CodeableConcept>? = null,
    // Supporting information found elsewhere.
    @SerialName("detail")
    override val detail: List<Reference>? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirConditionEvidence {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConditionEvidence"
    }
}

interface FhirConditionStage : FhirBackboneElement {

    // Simple summary (disease specific).
    val summary: CodeableConcept?

    // Formal record of assessment.
    val assessment: List<Reference>?

    // Kind of staging.
    val type: CodeableConcept?
}

/**
 * ClassName: ConditionStage
 *
 * SourceFileName: Condition.kt
 *
 *
 * Clinical stage or grade of a condition. May include formal severity assessments.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionStage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("ConditionStage")
data class ConditionStage(

    // Simple summary (disease specific).
    @SerialName("summary")
    override val summary: CodeableConcept? = null,
    // Formal record of assessment.
    @SerialName("assessment")
    override val assessment: List<Reference>? = null,
    // Kind of staging.
    @SerialName("type")
    override val type: CodeableConcept? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirConditionStage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConditionStage"
    }
}
