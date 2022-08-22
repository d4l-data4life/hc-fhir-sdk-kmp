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

import care.data4life.hl7.fhir.r4.codesystem.ExposureState
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirEffectEvidenceSynthesis
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states
 * in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
interface FhirEffectEvidenceSynthesis : FhirDomainResource {

    /**
     * Canonical identifier for this effect evidence synthesis, represented as a URI
     * (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the effect evidence synthesis.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the effect evidence synthesis.
     */
    val version: String?

    /**
     * Name for this effect evidence synthesis (computer friendly).
     */
    val name: String?

    /**
     * Name for this effect evidence synthesis (human friendly).
     */
    val title: String?

    /**
     * The status of this effect evidence synthesis. Enables tracking the life-cycle of
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
     * Natural language description of the effect evidence synthesis.
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
     * Intended jurisdiction for effect evidence synthesis (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the effect evidence synthesis was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the effect evidence synthesis was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the effect evidence synthesis is expected to be used.
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
    val exposure: Reference

    /**
     * What comparison exposure?.
     */
    val exposureAlternative: Reference

    /**
     * What outcome?.
     */
    val outcome: Reference

    /**
     * What sample size was involved?.
     */
    val sampleSize: EffectEvidenceSynthesisSampleSize?

    /**
     * What was the result per exposure?.
     */
    val resultsByExposure: kotlin.collections.List<EffectEvidenceSynthesisResultsByExposure>?

    /**
     * What was the estimated effect.
     */
    val effectEstimate: kotlin.collections.List<EffectEvidenceSynthesisEffectEstimate>?

    /**
     * How certain is the effect.
     */
    val certainty: kotlin.collections.List<EffectEvidenceSynthesisCertainty>?
}

/**
 * EffectEvidenceSynthesis
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states
 * in a population where the effect estimate is derived from a combination of research studies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesis</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
@Serializable
@SerialName("EffectEvidenceSynthesis")
data class EffectEvidenceSynthesis(

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
    override val exposure: Reference,

    @SerialName("exposureAlternative")
    override val exposureAlternative: Reference,

    @SerialName("outcome")
    override val outcome: Reference,

    @SerialName("sampleSize")
    override val sampleSize: EffectEvidenceSynthesisSampleSize? = null,

    @SerialName("resultsByExposure")
    override val resultsByExposure: kotlin.collections.List<EffectEvidenceSynthesisResultsByExposure>? = null,

    @SerialName("effectEstimate")
    override val effectEstimate: kotlin.collections.List<EffectEvidenceSynthesisEffectEstimate>? = null,

    @SerialName("certainty")
    override val certainty: kotlin.collections.List<EffectEvidenceSynthesisCertainty>? = null,

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
) : FhirEffectEvidenceSynthesis {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EffectEvidenceSynthesis"
    }
}

/**
 * FhirEffectEvidenceSynthesisCertainty
 *
 * A description of the certainty of the effect estimate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisCertainty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
interface FhirEffectEvidenceSynthesisCertainty : FhirBackboneElement {

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
    val certaintySubcomponent: kotlin.collections.List<EffectEvidenceSynthesisCertaintyCertaintySubcomponent>?
}

/**
 * EffectEvidenceSynthesisCertainty
 *
 * A description of the certainty of the effect estimate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisCertainty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
@Serializable
@SerialName("EffectEvidenceSynthesisCertainty")
data class EffectEvidenceSynthesisCertainty(

    @SerialName("rating")
    override val rating: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("certaintySubcomponent")
    override val certaintySubcomponent: kotlin.collections.List<EffectEvidenceSynthesisCertaintyCertaintySubcomponent>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEffectEvidenceSynthesisCertainty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EffectEvidenceSynthesisCertainty"
    }
}

/**
 * FhirEffectEvidenceSynthesisCertaintyCertaintySubcomponent
 *
 * A description of a component of the overall certainty.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisCertaintyCertaintySubcomponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
interface FhirEffectEvidenceSynthesisCertaintyCertaintySubcomponent : FhirBackboneElement {

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
 * EffectEvidenceSynthesisCertaintyCertaintySubcomponent
 *
 * A description of a component of the overall certainty.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisCertaintyCertaintySubcomponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
@Serializable
@SerialName("EffectEvidenceSynthesisCertaintyCertaintySubcomponent")
data class EffectEvidenceSynthesisCertaintyCertaintySubcomponent(

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
) : FhirEffectEvidenceSynthesisCertaintyCertaintySubcomponent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EffectEvidenceSynthesisCertaintyCertaintySubcomponent"
    }
}

/**
 * FhirEffectEvidenceSynthesisEffectEstimate
 *
 * The estimated effect of the exposure variant.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisEffectEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
interface FhirEffectEvidenceSynthesisEffectEstimate : FhirBackboneElement {

    /**
     * Description of effect estimate.
     */
    val description: String?

    /**
     * Type of efffect estimate.
     */
    val type: CodeableConcept?

    /**
     * Variant exposure states.
     */
    val variantState: CodeableConcept?

    /**
     * Point estimate.
     */
    val value: Decimal?

    /**
     * What unit is the outcome described in?.
     */
    val unitOfMeasure: CodeableConcept?

    /**
     * How precise the estimate is.
     */
    val precisionEstimate: kotlin.collections.List<EffectEvidenceSynthesisEffectEstimatePrecisionEstimate>?
}

/**
 * EffectEvidenceSynthesisEffectEstimate
 *
 * The estimated effect of the exposure variant.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisEffectEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
@Serializable
@SerialName("EffectEvidenceSynthesisEffectEstimate")
data class EffectEvidenceSynthesisEffectEstimate(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("variantState")
    override val variantState: CodeableConcept? = null,

    @SerialName("value")
    override val value: Decimal? = null,

    @SerialName("unitOfMeasure")
    override val unitOfMeasure: CodeableConcept? = null,

    @SerialName("precisionEstimate")
    override val precisionEstimate: kotlin.collections.List<EffectEvidenceSynthesisEffectEstimatePrecisionEstimate>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEffectEvidenceSynthesisEffectEstimate {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EffectEvidenceSynthesisEffectEstimate"
    }
}

/**
 * FhirEffectEvidenceSynthesisEffectEstimatePrecisionEstimate
 *
 * A description of the precision of the estimate for the effect.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisEffectEstimatePrecisionEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
interface FhirEffectEvidenceSynthesisEffectEstimatePrecisionEstimate : FhirBackboneElement {

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
 * EffectEvidenceSynthesisEffectEstimatePrecisionEstimate
 *
 * A description of the precision of the estimate for the effect.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisEffectEstimatePrecisionEstimate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
@Serializable
@SerialName("EffectEvidenceSynthesisEffectEstimatePrecisionEstimate")
data class EffectEvidenceSynthesisEffectEstimatePrecisionEstimate(

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
) : FhirEffectEvidenceSynthesisEffectEstimatePrecisionEstimate {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EffectEvidenceSynthesisEffectEstimatePrecisionEstimate"
    }
}

/**
 * FhirEffectEvidenceSynthesisResultsByExposure
 *
 * A description of the results for each exposure considered in the effect estimate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisResultsByExposure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
interface FhirEffectEvidenceSynthesisResultsByExposure : FhirBackboneElement {

    /**
     * Description of results by exposure.
     */
    val description: String?

    /**
     * Whether these results are for the exposure state or alternative exposure state.
     */
    val exposureState: ExposureState?

    /**
     * Variant exposure states.
     */
    val variantState: CodeableConcept?

    /**
     * Risk evidence synthesis.
     */
    val riskEvidenceSynthesis: Reference
}

/**
 * EffectEvidenceSynthesisResultsByExposure
 *
 * A description of the results for each exposure considered in the effect estimate.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisResultsByExposure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
@Serializable
@SerialName("EffectEvidenceSynthesisResultsByExposure")
data class EffectEvidenceSynthesisResultsByExposure(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("exposureState")
    override val exposureState: ExposureState? = null,

    @SerialName("variantState")
    override val variantState: CodeableConcept? = null,

    @SerialName("riskEvidenceSynthesis")
    override val riskEvidenceSynthesis: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirEffectEvidenceSynthesisResultsByExposure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EffectEvidenceSynthesisResultsByExposure"
    }
}

/**
 * FhirEffectEvidenceSynthesisSampleSize
 *
 * A description of the size of the sample involved in the synthesis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisSampleSize</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
interface FhirEffectEvidenceSynthesisSampleSize : FhirBackboneElement {

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
 * EffectEvidenceSynthesisSampleSize
 *
 * A description of the size of the sample involved in the synthesis.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis">EffectEvidenceSynthesisSampleSize</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/EffectEvidenceSynthesis)
 */
@Serializable
@SerialName("EffectEvidenceSynthesisSampleSize")
data class EffectEvidenceSynthesisSampleSize(

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
) : FhirEffectEvidenceSynthesisSampleSize {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "EffectEvidenceSynthesisSampleSize"
    }
}
