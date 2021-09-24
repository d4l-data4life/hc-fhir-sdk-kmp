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

import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirRiskEvidenceSynthesis
 *
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus
 * exposure state where the risk estimate is derived from a combination of research studies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
interface FhirRiskEvidenceSynthesis : FhirDomainResource {

    /**
     * Canonical identifier for this risk evidence synthesis, represented as a URI
     * (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the risk evidence synthesis.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the risk evidence synthesis.
     */
    val version: String?

    /**
     * Name for this risk evidence synthesis (computer friendly).
     */
    val name: String?

    /**
     * Name for this risk evidence synthesis (human friendly).
     */
    val title: String?

    /**
     * The status of this risk evidence synthesis. Enables tracking the life-cycle of
     * the content.
     */
    val status: PublicationStatus

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
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Natural language description of the risk evidence synthesis.
     */
    val description: String?

    /**
     * Used for footnotes or explanatory notes.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for risk evidence synthesis (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the risk evidence synthesis was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the risk evidence synthesis was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the risk evidence synthesis is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * The category of the EffectEvidenceSynthesis, such as Education, Treatment,
     * Assessment, etc..
     */
    val topic: kotlin.collections.List<CodeableConcept>?

    /**
     * Who authored the content.
     */
    val author: kotlin.collections.List<ContactDetail>?

    /**
     * Who edited the content.
     */
    val editor: kotlin.collections.List<ContactDetail>?

    /**
     * Who reviewed the content.
     */
    val reviewer: kotlin.collections.List<ContactDetail>?

    /**
     * Who endorsed the content.
     */
    val endorser: kotlin.collections.List<ContactDetail>?

    /**
     * Additional documentation, citations, etc..
     */
    val relatedArtifact: kotlin.collections.List<RelatedArtifact>?

    /**
     * Type of synthesis.
     */
    val synthesisType: CodeableConcept?

    /**
     * Type of study.
     */
    val studyType: CodeableConcept?

    /**
     * What population?.
     */
    val population: Reference

    /**
     * What exposure?.
     */
    val exposure: Reference?

    /**
     * What outcome?.
     */
    val outcome: Reference

    /**
     * What sample size was involved?.
     */
    val sampleSize: RiskEvidenceSynthesisSampleSize?

    /**
     * What was the estimated risk.
     */
    val riskEstimate: RiskEvidenceSynthesisRiskEstimate?

    /**
     * How certain is the risk.
     */
    val certainty: kotlin.collections.List<RiskEvidenceSynthesisCertainty>?
}

/**
 * RiskEvidenceSynthesis
 *
 * The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus
 * exposure state where the risk estimate is derived from a combination of research studies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
@Serializable
@SerialName("RiskEvidenceSynthesis")
data class RiskEvidenceSynthesis(

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

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("approvalDate")
    override val approvalDate: Date? = null,

    @SerialName("lastReviewDate")
    override val lastReviewDate: Date? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("topic")
    override val topic: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("author")
    override val author: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("editor")
    override val editor: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("reviewer")
    override val reviewer: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("endorser")
    override val endorser: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("relatedArtifact")
    override val relatedArtifact: kotlin.collections.List<RelatedArtifact>? = null,

    @SerialName("synthesisType")
    override val synthesisType: CodeableConcept? = null,

    @SerialName("studyType")
    override val studyType: CodeableConcept? = null,

    @SerialName("population")
    override val population: Reference,

    @SerialName("exposure")
    override val exposure: Reference? = null,

    @SerialName("outcome")
    override val outcome: Reference,

    @SerialName("sampleSize")
    override val sampleSize: RiskEvidenceSynthesisSampleSize? = null,

    @SerialName("riskEstimate")
    override val riskEstimate: RiskEvidenceSynthesisRiskEstimate? = null,

    @SerialName("certainty")
    override val certainty: kotlin.collections.List<RiskEvidenceSynthesisCertainty>? = null,

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
) : FhirRiskEvidenceSynthesis {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskEvidenceSynthesis"
    }
}

/**
 * FhirRiskEvidenceSynthesisCertainty
 *
 * A description of the certainty of the risk estimate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisCertainty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
interface FhirRiskEvidenceSynthesisCertainty : FhirBackboneElement {

    /**
     * Certainty rating.
     */
    val rating: kotlin.collections.List<CodeableConcept>?

    /**
     * Used for footnotes or explanatory notes.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * A component that contributes to the overall certainty.
     */
    val certaintySubcomponent: kotlin.collections.List<RiskEvidenceSynthesisCertaintyCertaintySubcomponent>?
}

/**
 * RiskEvidenceSynthesisCertainty
 *
 * A description of the certainty of the risk estimate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisCertainty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
@Serializable
@SerialName("RiskEvidenceSynthesisCertainty")
data class RiskEvidenceSynthesisCertainty(

    @SerialName("rating")
    override val rating: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("certaintySubcomponent")
    override val certaintySubcomponent: kotlin.collections.List<RiskEvidenceSynthesisCertaintyCertaintySubcomponent>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRiskEvidenceSynthesisCertainty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskEvidenceSynthesisCertainty"
    }
}

/**
 * FhirRiskEvidenceSynthesisCertaintyCertaintySubcomponent
 *
 * A description of a component of the overall certainty.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisCertaintyCertaintySubcomponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
interface FhirRiskEvidenceSynthesisCertaintyCertaintySubcomponent : FhirBackboneElement {

    /**
     * Type of subcomponent of certainty rating.
     */
    val type: CodeableConcept?

    /**
     * Subcomponent certainty rating.
     */
    val rating: kotlin.collections.List<CodeableConcept>?

    /**
     * Used for footnotes or explanatory notes.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * RiskEvidenceSynthesisCertaintyCertaintySubcomponent
 *
 * A description of a component of the overall certainty.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisCertaintyCertaintySubcomponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
@Serializable
@SerialName("RiskEvidenceSynthesisCertaintyCertaintySubcomponent")
data class RiskEvidenceSynthesisCertaintyCertaintySubcomponent(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("rating")
    override val rating: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRiskEvidenceSynthesisCertaintyCertaintySubcomponent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskEvidenceSynthesisCertaintyCertaintySubcomponent"
    }
}

/**
 * FhirRiskEvidenceSynthesisRiskEstimate
 *
 * The estimated risk of the outcome.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisRiskEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
interface FhirRiskEvidenceSynthesisRiskEstimate : FhirBackboneElement {

    /**
     * Description of risk estimate.
     */
    val description: String?

    /**
     * Type of risk estimate.
     */
    val type: CodeableConcept?

    /**
     * Point estimate.
     */
    val value: Decimal?

    /**
     * What unit is the outcome described in?.
     */
    val unitOfMeasure: CodeableConcept?

    /**
     * Sample size for group measured.
     */
    val denominatorCount: Integer?

    /**
     * Number with the outcome.
     */
    val numeratorCount: Integer?

    /**
     * How precise the estimate is.
     */
    val precisionEstimate: kotlin.collections.List<RiskEvidenceSynthesisRiskEstimatePrecisionEstimate>?
}

/**
 * RiskEvidenceSynthesisRiskEstimate
 *
 * The estimated risk of the outcome.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisRiskEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
@Serializable
@SerialName("RiskEvidenceSynthesisRiskEstimate")
data class RiskEvidenceSynthesisRiskEstimate(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("value")
    override val value: Decimal? = null,

    @SerialName("unitOfMeasure")
    override val unitOfMeasure: CodeableConcept? = null,

    @SerialName("denominatorCount")
    override val denominatorCount: Integer? = null,

    @SerialName("numeratorCount")
    override val numeratorCount: Integer? = null,

    @SerialName("precisionEstimate")
    override val precisionEstimate: kotlin.collections.List<RiskEvidenceSynthesisRiskEstimatePrecisionEstimate>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRiskEvidenceSynthesisRiskEstimate {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskEvidenceSynthesisRiskEstimate"
    }
}

/**
 * FhirRiskEvidenceSynthesisRiskEstimatePrecisionEstimate
 *
 * A description of the precision of the estimate for the effect.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisRiskEstimatePrecisionEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
interface FhirRiskEvidenceSynthesisRiskEstimatePrecisionEstimate : FhirBackboneElement {

    /**
     * Type of precision estimate.
     */
    val type: CodeableConcept?

    /**
     * Level of confidence interval.
     */
    val level: Decimal?

    /**
     * Lower bound.
     */
    val from: Decimal?

    /**
     * Upper bound.
     */
    val to: Decimal?
}

/**
 * RiskEvidenceSynthesisRiskEstimatePrecisionEstimate
 *
 * A description of the precision of the estimate for the effect.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisRiskEstimatePrecisionEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
@Serializable
@SerialName("RiskEvidenceSynthesisRiskEstimatePrecisionEstimate")
data class RiskEvidenceSynthesisRiskEstimatePrecisionEstimate(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("level")
    override val level: Decimal? = null,

    @SerialName("from")
    override val from: Decimal? = null,

    @SerialName("to")
    override val to: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRiskEvidenceSynthesisRiskEstimatePrecisionEstimate {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskEvidenceSynthesisRiskEstimatePrecisionEstimate"
    }
}

/**
 * FhirRiskEvidenceSynthesisSampleSize
 *
 * A description of the size of the sample involved in the synthesis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisSampleSize</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
interface FhirRiskEvidenceSynthesisSampleSize : FhirBackboneElement {

    /**
     * Description of sample size.
     */
    val description: String?

    /**
     * How many studies?.
     */
    val numberOfStudies: Integer?

    /**
     * How many participants?.
     */
    val numberOfParticipants: Integer?
}

/**
 * RiskEvidenceSynthesisSampleSize
 *
 * A description of the size of the sample involved in the synthesis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis">RiskEvidenceSynthesisSampleSize</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RiskEvidenceSynthesis)
 */
@Serializable
@SerialName("RiskEvidenceSynthesisSampleSize")
data class RiskEvidenceSynthesisSampleSize(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("numberOfStudies")
    override val numberOfStudies: Integer? = null,

    @SerialName("numberOfParticipants")
    override val numberOfParticipants: Integer? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRiskEvidenceSynthesisSampleSize {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RiskEvidenceSynthesisSampleSize"
    }
}
