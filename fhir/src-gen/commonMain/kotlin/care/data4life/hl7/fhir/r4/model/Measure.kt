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
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMeasure
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">Measure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasure : FhirDomainResource {

    /**
     * Canonical identifier for this measure, represented as a URI (globally unique).
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
     * Subordinate title of the measure.
     */
    val subtitle: String?

    /**
     * The status of this measure. Enables tracking the life-cycle of the content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
     */
    val subjectCodeableConcept: CodeableConcept?

    /**
     * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
     */
    val subjectReference: Reference?

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
     * Natural language description of the measure.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for measure (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this measure is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the measure.
     */
    val usage: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

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
     * The category of the measure, such as Education, Treatment, Assessment, etc..
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
     * Logic used by the measure.
     */
    val library: kotlin.collections.List<String>?

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
     * How risk adjustment is applied for this measure.
     */
    val riskAdjustment: String?

    /**
     * How is rate aggregation performed for this measure.
     */
    val rateAggregation: String?

    /**
     * Detailed description of why the measure exists.
     */
    val rationale: String?

    /**
     * Summary of clinical guidelines.
     */
    val clinicalRecommendationStatement: String?

    /**
     * increase | decrease.
     */
    val improvementNotation: CodeableConcept?

    /**
     * Defined terms used in the measure documentation.
     */
    val definition: kotlin.collections.List<String>?

    /**
     * Additional guidance for implementers.
     */
    val guidance: String?

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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
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

    @SerialName("subtitle")
    override val subtitle: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("subjectCodeableConcept")
    override val subjectCodeableConcept: CodeableConcept? = null,

    @SerialName("subjectReference")
    override val subjectReference: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("usage")
    override val usage: String? = null,

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

    @SerialName("library")
    override val library: kotlin.collections.List<String>? = null,

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
    override val improvementNotation: CodeableConcept? = null,

    @SerialName("definition")
    override val definition: kotlin.collections.List<String>? = null,

    @SerialName("guidance")
    override val guidance: String? = null,

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

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Measure"
    }
}

/**
 * FhirMeasureGroup
 *
 * A group of population criteria for the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureGroup : FhirBackboneElement {

    /**
     * Meaning of the group.
     */
    val code: CodeableConcept?

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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureGroup")
data class MeasureGroup(

    @SerialName("code")
    override val code: CodeableConcept? = null,

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

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureGroup"
    }
}

/**
 * FhirMeasureGroupPopulation
 *
 * A population criteria for the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupPopulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureGroupPopulation : FhirBackboneElement {

    /**
     * initial-population | numerator | numerator-exclusion | denominator |
     * denominator-exclusion | denominator-exception | measure-population | measure-
     * population-exclusion | measure-observation.
     */
    val code: CodeableConcept?

    /**
     * The human readable description of this population criteria.
     */
    val description: String?

    /**
     * The criteria that defines this population.
     */
    val criteria: Expression
}

/**
 * MeasureGroupPopulation
 *
 * A population criteria for the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupPopulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureGroupPopulation")
data class MeasureGroupPopulation(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("criteria")
    override val criteria: Expression,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureGroupPopulation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureGroupPopulation"
    }
}

/**
 * FhirMeasureGroupStratifier
 *
 * The stratifier criteria for the measure report, specified as either the name of a valid CQL
 * expression defined within a referenced library or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupStratifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureGroupStratifier : FhirBackboneElement {

    /**
     * Meaning of the stratifier.
     */
    val code: CodeableConcept?

    /**
     * The human readable description of this stratifier.
     */
    val description: String?

    /**
     * How the measure should be stratified.
     */
    val criteria: Expression?

    /**
     * Stratifier criteria component for the measure.
     */
    val component: kotlin.collections.List<MeasureGroupStratifierComponent>?
}

/**
 * MeasureGroupStratifier
 *
 * The stratifier criteria for the measure report, specified as either the name of a valid CQL
 * expression defined within a referenced library or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupStratifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureGroupStratifier")
data class MeasureGroupStratifier(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("criteria")
    override val criteria: Expression? = null,

    @SerialName("component")
    override val component: kotlin.collections.List<MeasureGroupStratifierComponent>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureGroupStratifier {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureGroupStratifier"
    }
}

/**
 * FhirMeasureGroupStratifierComponent
 *
 * A component of the stratifier criteria for the measure report, specified as either the name of a
 * valid CQL expression defined within a referenced library or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupStratifierComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureGroupStratifierComponent : FhirBackboneElement {

    /**
     * Meaning of the stratifier component.
     */
    val code: CodeableConcept?

    /**
     * The human readable description of this stratifier component.
     */
    val description: String?

    /**
     * Component of how the measure should be stratified.
     */
    val criteria: Expression
}

/**
 * MeasureGroupStratifierComponent
 *
 * A component of the stratifier criteria for the measure report, specified as either the name of a
 * valid CQL expression defined within a referenced library or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureGroupStratifierComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureGroupStratifierComponent")
data class MeasureGroupStratifierComponent(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("criteria")
    override val criteria: Expression,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureGroupStratifierComponent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureGroupStratifierComponent"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
interface FhirMeasureSupplementalData : FhirBackboneElement {

    /**
     * Meaning of the supplemental data.
     */
    val code: CodeableConcept?

    /**
     * supplemental-data | risk-adjustment-factor.
     */
    val usage: kotlin.collections.List<CodeableConcept>?

    /**
     * The human readable description of this supplemental data.
     */
    val description: String?

    /**
     * Expression describing additional data to be reported.
     */
    val criteria: Expression
}

/**
 * MeasureSupplementalData
 *
 * The supplemental data criteria for the measure report, specified as either the name of a valid CQL
 * expression within a referenced library, or a valid FHIR Resource Path.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Measure">MeasureSupplementalData</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Measure)
 */
@Serializable
@SerialName("MeasureSupplementalData")
data class MeasureSupplementalData(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("usage")
    override val usage: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("criteria")
    override val criteria: Expression,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureSupplementalData {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureSupplementalData"
    }
}
