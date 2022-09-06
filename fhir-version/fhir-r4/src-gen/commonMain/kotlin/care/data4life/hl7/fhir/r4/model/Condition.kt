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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirCondition
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that
 * has risen to a level of concern.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
interface FhirCondition : FhirDomainResource {

    /**
     * External Ids for this condition.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * active | recurrence | relapse | inactive | remission | resolved.
     */
    val clinicalStatus: CodeableConcept?

    /**
     * unconfirmed | provisional | differential | confirmed | refuted | entered-in-
     * error.
     */
    val verificationStatus: CodeableConcept?

    /**
     * problem-list-item | encounter-diagnosis.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Subjective severity of condition.
     */
    val severity: CodeableConcept?

    /**
     * Identification of the condition, problem or diagnosis.
     */
    val code: CodeableConcept?

    /**
     * Anatomical location, if relevant.
     */
    val bodySite: kotlin.collections.List<CodeableConcept>?

    /**
     * Who has the condition?.
     */
    val subject: Reference

    /**
     * Encounter created as part of.
     */
    val encounter: Reference?

    /**
     * Estimated or actual date, date-time, or age.
     */
    val onsetDateTime: DateTime?

    /**
     * Estimated or actual date, date-time, or age.
     */
    val onsetAge: Age?

    /**
     * Estimated or actual date, date-time, or age.
     */
    val onsetPeriod: Period?

    /**
     * Estimated or actual date, date-time, or age.
     */
    val onsetRange: Range?

    /**
     * Estimated or actual date, date-time, or age.
     */
    val onsetString: String?

    /**
     * When in resolution/remission.
     */
    val abatementDateTime: DateTime?

    /**
     * When in resolution/remission.
     */
    val abatementAge: Age?

    /**
     * When in resolution/remission.
     */
    val abatementPeriod: Period?

    /**
     * When in resolution/remission.
     */
    val abatementRange: Range?

    /**
     * When in resolution/remission.
     */
    val abatementString: String?

    /**
     * Date record was first recorded.
     */
    val recordedDate: DateTime?

    /**
     * Who recorded the condition.
     */
    val recorder: Reference?

    /**
     * Person who asserts this condition.
     */
    val asserter: Reference?

    /**
     * Stage/grade, usually assessed formally.
     */
    val stage: kotlin.collections.List<ConditionStage>?

    /**
     * Supporting evidence.
     */
    val evidence: kotlin.collections.List<ConditionEvidence>?

    /**
     * Additional information about the Condition.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * Condition
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that
 * has risen to a level of concern.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("Condition")
data class Condition(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("clinicalStatus")
    override val clinicalStatus: CodeableConcept? = null,

    @SerialName("verificationStatus")
    override val verificationStatus: CodeableConcept? = null,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("severity")
    override val severity: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("bodySite")
    override val bodySite: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("onsetDateTime")
    override val onsetDateTime: DateTime? = null,

    @SerialName("onsetAge")
    override val onsetAge: Age? = null,

    @SerialName("onsetPeriod")
    override val onsetPeriod: Period? = null,

    @SerialName("onsetRange")
    override val onsetRange: Range? = null,

    @SerialName("onsetString")
    override val onsetString: String? = null,

    @SerialName("abatementDateTime")
    override val abatementDateTime: DateTime? = null,

    @SerialName("abatementAge")
    override val abatementAge: Age? = null,

    @SerialName("abatementPeriod")
    override val abatementPeriod: Period? = null,

    @SerialName("abatementRange")
    override val abatementRange: Range? = null,

    @SerialName("abatementString")
    override val abatementString: String? = null,

    @SerialName("recordedDate")
    override val recordedDate: DateTime? = null,

    @SerialName("recorder")
    override val recorder: Reference? = null,

    @SerialName("asserter")
    override val asserter: Reference? = null,

    @SerialName("stage")
    override val stage: kotlin.collections.List<ConditionStage>? = null,

    @SerialName("evidence")
    override val evidence: kotlin.collections.List<ConditionEvidence>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

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
) : FhirCondition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Condition"
    }
}

/**
 * FhirConditionEvidence
 *
 * Supporting evidence / manifestations that are the basis of the Condition's verification status, such
 * as evidence that confirmed or refuted the condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionEvidence</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
interface FhirConditionEvidence : FhirBackboneElement {

    /**
     * Manifestation/symptom.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Supporting information found elsewhere.
     */
    val detail: kotlin.collections.List<Reference>?
}

/**
 * ConditionEvidence
 *
 * Supporting evidence / manifestations that are the basis of the Condition's verification status, such
 * as evidence that confirmed or refuted the condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionEvidence</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("ConditionEvidence")
data class ConditionEvidence(

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("detail")
    override val detail: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConditionEvidence {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ConditionEvidence"
    }
}

/**
 * FhirConditionStage
 *
 * Clinical stage or grade of a condition. May include formal severity assessments.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionStage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
interface FhirConditionStage : FhirBackboneElement {

    /**
     * Simple summary (disease specific).
     */
    val summary: CodeableConcept?

    /**
     * Formal record of assessment.
     */
    val assessment: kotlin.collections.List<Reference>?

    /**
     * Kind of staging.
     */
    val type: CodeableConcept?
}

/**
 * ConditionStage
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

    @SerialName("summary")
    override val summary: CodeableConcept? = null,

    @SerialName("assessment")
    override val assessment: kotlin.collections.List<Reference>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConditionStage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ConditionStage"
    }
}
