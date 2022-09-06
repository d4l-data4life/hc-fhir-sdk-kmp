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

import care.data4life.hl7.fhir.r4.codesystem.ObservationStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirRiskAssessment
 *
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of
 * each outcome.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskAssessment">RiskAssessment</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskAssessment)
 */
interface FhirRiskAssessment : FhirDomainResource {

    /**
     * Unique identifier for the assessment.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Request fulfilled by this assessment.
     */
    val basedOn: Reference?

    /**
     * Part of this occurrence.
     */
    val parent: Reference?

    /**
     * The status of the RiskAssessment, using the same statuses as an Observation.
     */
    val status: ObservationStatus

    /**
     * Evaluation mechanism.
     */
    val method: CodeableConcept?

    /**
     * Type of assessment.
     */
    val code: CodeableConcept?

    /**
     * Who/what does assessment apply to?.
     */
    val subject: Reference

    /**
     * Where was assessment performed?.
     */
    val encounter: Reference?

    /**
     * When was assessment made?.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When was assessment made?.
     */
    val occurrencePeriod: Period?

    /**
     * Condition assessed.
     */
    val condition: Reference?

    /**
     * Who did assessment?.
     */
    val performer: Reference?

    /**
     * Why the assessment was necessary?.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why the assessment was necessary?.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Information used in assessment.
     */
    val basis: kotlin.collections.List<Reference>?

    /**
     * Outcome predicted.
     */
    val prediction: kotlin.collections.List<RiskAssessmentPrediction>?

    /**
     * How to reduce risk.
     */
    val mitigation: String?

    /**
     * Comments on the risk assessment.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * RiskAssessment
 *
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of
 * each outcome.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskAssessment">RiskAssessment</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskAssessment)
 */
@Serializable
@SerialName("RiskAssessment")
data class RiskAssessment(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: Reference? = null,

    @SerialName("parent")
    override val parent: Reference? = null,

    @SerialName("status")
    override val status: ObservationStatus,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("condition")
    override val condition: Reference? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("basis")
    override val basis: kotlin.collections.List<Reference>? = null,

    @SerialName("prediction")
    override val prediction: kotlin.collections.List<RiskAssessmentPrediction>? = null,

    @SerialName("mitigation")
    override val mitigation: String? = null,

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
) : FhirRiskAssessment {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskAssessment"
    }
}

/**
 * FhirRiskAssessmentPrediction
 *
 * Describes the expected outcome for the subject.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskAssessment">RiskAssessmentPrediction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskAssessment)
 */
interface FhirRiskAssessmentPrediction : FhirBackboneElement {

    /**
     * Possible outcome for the subject.
     */
    val outcome: CodeableConcept?

    /**
     * Likelihood of specified outcome.
     */
    val probabilityDecimal: Decimal?

    /**
     * Likelihood of specified outcome.
     */
    val probabilityRange: Range?

    /**
     * Likelihood of specified outcome as a qualitative value.
     */
    val qualitativeRisk: CodeableConcept?

    /**
     * Relative likelihood.
     */
    val relativeRisk: Decimal?

    /**
     * Timeframe or age range.
     */
    val whenPeriod: Period?

    /**
     * Timeframe or age range.
     */
    val whenRange: Range?

    /**
     * Explanation of prediction.
     */
    val rationale: String?
}

/**
 * RiskAssessmentPrediction
 *
 * Describes the expected outcome for the subject.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskAssessment">RiskAssessmentPrediction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskAssessment)
 */
@Serializable
@SerialName("RiskAssessmentPrediction")
data class RiskAssessmentPrediction(

    @SerialName("outcome")
    override val outcome: CodeableConcept? = null,

    @SerialName("probabilityDecimal")
    override val probabilityDecimal: Decimal? = null,

    @SerialName("probabilityRange")
    override val probabilityRange: Range? = null,

    @SerialName("qualitativeRisk")
    override val qualitativeRisk: CodeableConcept? = null,

    @SerialName("relativeRisk")
    override val relativeRisk: Decimal? = null,

    @SerialName("whenPeriod")
    override val whenPeriod: Period? = null,

    @SerialName("whenRange")
    override val whenRange: Range? = null,

    @SerialName("rationale")
    override val rationale: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRiskAssessmentPrediction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskAssessmentPrediction"
    }
}
