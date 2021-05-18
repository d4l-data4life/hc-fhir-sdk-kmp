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

import care.data4life.hl7.fhir.stu3.codesystem.ConditionVerificationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCondition
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that
 * has risen to a level of concern.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
interface FhirCondition : FhirDomainResource {

    /**
     * External Ids for this condition.
     */
    val identifier: List<Identifier>?

    /**
     * active | recurrence | inactive | remission | resolved.
     */
    val clinicalStatus: String?

    /**
     * The verification status to support the clinical status of the condition.
     */
    val verificationStatus: ConditionVerificationStatus?

    /**
     * problem-list-item | encounter-diagnosis.
     */
    val category: List<CodeableConcept>?

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
    val bodySite: List<CodeableConcept>?

    /**
     * Who has the condition?.
     */
    val subject: Reference

    /**
     * Encounter or episode when condition first asserted.
     */
    val context: Reference?

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
     * If/when in resolution/remission.
     */
    val abatementDateTime: DateTime?

    /**
     * If/when in resolution/remission.
     */
    val abatementAge: Age?

    /**
     * If/when in resolution/remission.
     */
    val abatementBoolean: Bool?

    /**
     * If/when in resolution/remission.
     */
    val abatementPeriod: Period?

    /**
     * If/when in resolution/remission.
     */
    val abatementRange: Range?

    /**
     * If/when in resolution/remission.
     */
    val abatementString: String?

    /**
     * Date record was believed accurate.
     */
    val assertedDate: DateTime?

    /**
     * Person who asserts this condition.
     */
    val asserter: Reference?

    /**
     * Stage/grade, usually assessed formally.
     */
    val stage: ConditionStage?

    /**
     * Supporting evidence.
     */
    val evidence: List<ConditionEvidence>?

    /**
     * Additional information about the Condition.
     */
    val note: List<Annotation>?
}

/**
 * Condition
 *
 * SourceFileName: Condition.kt
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that
 * has risen to a level of concern.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">Condition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("Condition")
data class Condition(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("clinicalStatus")
    override val clinicalStatus: String? = null,

    @SerialName("verificationStatus")
    override val verificationStatus: ConditionVerificationStatus? = null,

    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    @SerialName("severity")
    override val severity: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

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

    @SerialName("abatementBoolean")
    override val abatementBoolean: Bool? = null,

    @SerialName("abatementPeriod")
    override val abatementPeriod: Period? = null,

    @SerialName("abatementRange")
    override val abatementRange: Range? = null,

    @SerialName("abatementString")
    override val abatementString: String? = null,

    @SerialName("assertedDate")
    override val assertedDate: DateTime? = null,

    @SerialName("asserter")
    override val asserter: Reference? = null,

    @SerialName("stage")
    override val stage: ConditionStage? = null,

    @SerialName("evidence")
    override val evidence: List<ConditionEvidence>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    // # DomainResource@SerialName("text")
    override val text: Narrative? = null,
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource@SerialName("id")
    override val id: String? = null,
    @SerialName("meta")
    override val meta: Meta? = null,
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
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

/**
 * FhirConditionEvidence
 *
 * Supporting Evidence / manifestations that are the basis on which this condition is suspected or
 * confirmed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionEvidence</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
interface FhirConditionEvidence : FhirBackboneElement {

    /**
     * Manifestation/symptom.
     */
    val code: List<CodeableConcept>?

    /**
     * Supporting information found elsewhere.
     */
    val detail: List<Reference>?
}

/**
 * ConditionEvidence
 *
 * SourceFileName: Condition.kt
 *
 * Supporting Evidence / manifestations that are the basis on which this condition is suspected or
 * confirmed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionEvidence</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("ConditionEvidence")
data class ConditionEvidence(

    @SerialName("code")
    override val code: List<CodeableConcept>? = null,

    @SerialName("detail")
    override val detail: List<Reference>? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
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

/**
 * FhirConditionStage
 *
 * Clinical stage or grade of a condition. May include formal severity assessments.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionStage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
interface FhirConditionStage : FhirBackboneElement {

    /**
     * Simple summary (disease specific).
     */
    val summary: CodeableConcept?

    /**
     * Formal record of assessment.
     */
    val assessment: List<Reference>?
}

/**
 * ConditionStage
 *
 * SourceFileName: Condition.kt
 *
 * Clinical stage or grade of a condition. May include formal severity assessments.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Condition">ConditionStage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Condition)
 */
@Serializable
@SerialName("ConditionStage")
data class ConditionStage(

    @SerialName("summary")
    override val summary: CodeableConcept? = null,

    @SerialName("assessment")
    override val assessment: List<Reference>? = null,

    // # BackboneElement@SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element@SerialName("id")
    override val id: String? = null,
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
