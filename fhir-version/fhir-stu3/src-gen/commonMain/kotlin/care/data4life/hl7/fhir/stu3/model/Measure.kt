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
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMeasure
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">Measure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasure : FhirDomainResource {

    /**
     * Logical URI to reference this measure (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the measure.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the measure.
     */
    val version: String?

    /**
     * Name for this measure (computer friendly).
     */
    val name: String?

    /**
     * Name for this measure (human friendly).
     */
    val title: String?

    /**
     * The status of this measure. Enables tracking the life-cycle of the content.
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
     * Natural language description of the measure.
     */
    val description: String?

    /**
     * Why this measure is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the measure.
     */
    val usage: String?

    /**
     * When the measure was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the measure was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the measure is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for measure (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * E.g. Education, Treatment, Assessment, etc.
     */
    val topic: kotlin.collections.List<CodeableConcept>?

    /**
     * A content contributor.
     */
    val contributor: kotlin.collections.List<Contributor>?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Additional documentation, citations, etc.
     */
    val relatedArtifact: kotlin.collections.List<RelatedArtifact>?

    /**
     * Logic used by the measure.
     */
    val library: kotlin.collections.List<Reference>?

    /**
     * Disclaimer for use of the measure or its referenced content.
     */
    val disclaimer: String?

    /**
     * proportion | ratio | continuous-variable | cohort.
     */
    val scoring: CodeableConcept?

    /**
     * opportunity | all-or-nothing | linear | weighted.
     */
    val compositeScoring: CodeableConcept?

    /**
     * process | outcome | structure | patient-reported-outcome | composite.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * How is risk adjustment applied for this measure.
     */
    val riskAdjustment: String?

    /**
     * How is rate aggregation performed for this measure.
     */
    val rateAggregation: String?

    /**
     * Why does this measure exist.
     */
    val rationale: String?

    /**
     * Summary of clinical guidelines.
     */
    val clinicalRecommendationStatement: String?

    /**
     * Improvement notation for the measure, e.g. higher score indicates better quality.
     */
    val improvementNotation: String?

    /**
     * Defined terms used in the measure documentation.
     */
    val definition: kotlin.collections.List<String>?

    /**
     * Additional guidance for implementers.
     */
    val guidance: String?

    /**
     * The measure set, e.g. Preventive Care and Screening.
     */
    val set: String?

    /**
     * Population criteria group.
     */
    val group: kotlin.collections.List<MeasureGroup>?

    /**
     * What other data should be reported with the measure.
     */
    val supplementalData: kotlin.collections.List<MeasureSupplementalData>?
}

/**
 * Measure
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">Measure</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("Measure")
data class Measure(

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

    @SerialName("usage")
    override val usage: String? = null,

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

    @SerialName("topic")
    override val topic: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("contributor")
    override val contributor: kotlin.collections.List<Contributor>? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("relatedArtifact")
    override val relatedArtifact: kotlin.collections.List<RelatedArtifact>? = null,

    @SerialName("library")
    override val library: kotlin.collections.List<Reference>? = null,

    @SerialName("disclaimer")
    override val disclaimer: String? = null,

    @SerialName("scoring")
    override val scoring: CodeableConcept? = null,

    @SerialName("compositeScoring")
    override val compositeScoring: CodeableConcept? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("riskAdjustment")
    override val riskAdjustment: String? = null,

    @SerialName("rateAggregation")
    override val rateAggregation: String? = null,

    @SerialName("rationale")
    override val rationale: String? = null,

    @SerialName("clinicalRecommendationStatement")
    override val clinicalRecommendationStatement: String? = null,

    @SerialName("improvementNotation")
    override val improvementNotation: String? = null,

    @SerialName("definition")
    override val definition: kotlin.collections.List<String>? = null,

    @SerialName("guidance")
    override val guidance: String? = null,

    @SerialName("set")
    override val set: String? = null,

    @SerialName("group")
    override val group: kotlin.collections.List<MeasureGroup>? = null,

    @SerialName("supplementalData")
    override val supplementalData: kotlin.collections.List<MeasureSupplementalData>? = null,

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
) : FhirMeasure {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Measure"
    }
}

/**
 * FhirMeasureGroup
 *
 * A group of population criteria for the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureGroup : FhirBackboneElement {

    /**
     * Unique identifier.
     */
    val identifier: Identifier

    /**
     * Short name.
     */
    val name: String?

    /**
     * Summary description.
     */
    val description: String?

    /**
     * Population criteria.
     */
    val population: kotlin.collections.List<MeasureGroupPopulation>?

    /**
     * Stratifier criteria for the measure.
     */
    val stratifier: kotlin.collections.List<MeasureGroupStratifier>?
}

/**
 * MeasureGroup
 *
 * A group of population criteria for the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureGroup")
data class MeasureGroup(

    @SerialName("identifier")
    override val identifier: Identifier,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("population")
    override val population: kotlin.collections.List<MeasureGroupPopulation>? = null,

    @SerialName("stratifier")
    override val stratifier: kotlin.collections.List<MeasureGroupStratifier>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureGroup {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureGroup"
    }
}

/**
 * FhirMeasureGroupPopulation
 *
 * A population criteria for the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupPopulation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureGroupPopulation : FhirBackboneElement {

    /**
     * Unique identifier.
     */
    val identifier: Identifier?

    /**
     * initial-population | numerator | numerator-exclusion | denominator |
     * denominator-exclusion | denominator-exception | measure-population | measure-
     * population-exclusion | measure-observation.
     */
    val code: CodeableConcept?

    /**
     * Short name.
     */
    val name: String?

    /**
     * The human readable description of this population criteria.
     */
    val description: String?

    /**
     * The name of a valid referenced CQL expression (may be namespaced) that defines
     * this population criteria.
     */
    val criteria: String
}

/**
 * MeasureGroupPopulation
 *
 * A population criteria for the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupPopulation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureGroupPopulation")
data class MeasureGroupPopulation(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("criteria")
    override val criteria: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureGroupPopulation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureGroupPopulation"
    }
}

/**
 * FhirMeasureGroupStratifier
 *
 * The stratifier criteria for the measure report, specified as either the name of a valid CQL
 * expression defined within a referenced library, or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupStratifier</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureGroupStratifier : FhirBackboneElement {

    /**
     * The identifier for the stratifier used to coordinate the reported data back to
     * this stratifier.
     */
    val identifier: Identifier?

    /**
     * How the measure should be stratified.
     */
    val criteria: String?

    /**
     * Path to the stratifier.
     */
    val path: String?
}

/**
 * MeasureGroupStratifier
 *
 * The stratifier criteria for the measure report, specified as either the name of a valid CQL
 * expression defined within a referenced library, or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupStratifier</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureGroupStratifier")
data class MeasureGroupStratifier(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("criteria")
    override val criteria: String? = null,

    @SerialName("path")
    override val path: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureGroupStratifier {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureGroupStratifier"
    }
}

/**
 * FhirMeasureSupplementalData
 *
 * The supplemental data criteria for the measure report, specified as either the name of a valid CQL
 * expression within a referenced library, or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureSupplementalData</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureSupplementalData : FhirBackboneElement {

    /**
     * Identifier, unique within the measure.
     */
    val identifier: Identifier?

    /**
     * supplemental-data | risk-adjustment-factor.
     */
    val usage: kotlin.collections.List<CodeableConcept>?

    /**
     * Expression describing additional data to be reported.
     */
    val criteria: String?

    /**
     * Path to the supplemental data element.
     */
    val path: String?
}

/**
 * MeasureSupplementalData
 *
 * The supplemental data criteria for the measure report, specified as either the name of a valid CQL
 * expression within a referenced library, or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureSupplementalData</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureSupplementalData")
data class MeasureSupplementalData(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("usage")
    override val usage: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("criteria")
    override val criteria: String? = null,

    @SerialName("path")
    override val path: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureSupplementalData {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureSupplementalData"
    }
}
