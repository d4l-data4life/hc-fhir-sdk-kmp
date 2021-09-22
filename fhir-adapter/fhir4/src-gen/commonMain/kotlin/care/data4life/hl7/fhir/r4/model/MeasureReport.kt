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

import care.data4life.hl7.fhir.r4.codesystem.MeasureReportStatus
import care.data4life.hl7.fhir.r4.codesystem.MeasureReportType
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMeasureReport
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a
 * reference to the resources involved in that calculation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReport</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReport : FhirDomainResource {

    /**
     * Additional identifier for the MeasureReport.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The MeasureReport status. No data will be available until the MeasureReport
     * status is complete.
     */
    val status: MeasureReportStatus

    /**
     * The type of measure report. This may be an individual report, which provides the
     * score for the measure for an individual member of the population; a subject-
     * listing, which returns the list of members that meet the various criteria in the
     * measure; a summary report, which returns a population count for each of the
     * criteria in the measure; or a data-collection, which enables the MeasureReport
     * to be used to exchange the data-of-interest for a quality measure.
     */
    val type: MeasureReportType

    /**
     * What measure was calculated.
     */
    val measure: String

    /**
     * What individual(s) the report is for.
     */
    val subject: Reference?

    /**
     * When the report was generated.
     */
    val date: DateTime?

    /**
     * Who is reporting the data.
     */
    val reporter: Reference?

    /**
     * What period the report covers.
     */
    val period: Period

    /**
     * increase | decrease.
     */
    val improvementNotation: CodeableConcept?

    /**
     * Measure results for each group.
     */
    val group: kotlin.collections.List<MeasureReportGroup>?

    /**
     * What data was used to calculate the measure score.
     */
    val evaluatedResource: kotlin.collections.List<Reference>?
}

/**
 * MeasureReport
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a
 * reference to the resources involved in that calculation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReport</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReport")
data class MeasureReport(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: MeasureReportStatus,

    @SerialName("type")
    override val type: MeasureReportType,

    @SerialName("measure")
    override val measure: String,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("reporter")
    override val reporter: Reference? = null,

    @SerialName("period")
    override val period: Period,

    @SerialName("improvementNotation")
    override val improvementNotation: CodeableConcept? = null,

    @SerialName("group")
    override val group: kotlin.collections.List<MeasureReportGroup>? = null,

    @SerialName("evaluatedResource")
    override val evaluatedResource: kotlin.collections.List<Reference>? = null,

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
) : FhirMeasureReport {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureReport"
    }
}

/**
 * FhirMeasureReportGroup
 *
 * The results of the calculation, one for each population group in the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroup : FhirBackboneElement {

    /**
     * Meaning of the group.
     */
    val code: CodeableConcept?

    /**
     * The populations in the group.
     */
    val population: kotlin.collections.List<MeasureReportGroupPopulation>?

    /**
     * What score this group achieved.
     */
    val measureScore: Quantity?

    /**
     * Stratification results.
     */
    val stratifier: kotlin.collections.List<MeasureReportGroupStratifier>?
}

/**
 * MeasureReportGroup
 *
 * The results of the calculation, one for each population group in the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroup")
data class MeasureReportGroup(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("population")
    override val population: kotlin.collections.List<MeasureReportGroupPopulation>? = null,

    @SerialName("measureScore")
    override val measureScore: Quantity? = null,

    @SerialName("stratifier")
    override val stratifier: kotlin.collections.List<MeasureReportGroupStratifier>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroup {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureReportGroup"
    }
}

/**
 * FhirMeasureReportGroupPopulation
 *
 * The populations that make up the population group, one for each type of population appropriate for
 * the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupPopulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupPopulation : FhirBackboneElement {

    /**
     * initial-population | numerator | numerator-exclusion | denominator |
     * denominator-exclusion | denominator-exception | measure-population | measure-
     * population-exclusion | measure-observation.
     */
    val code: CodeableConcept?

    /**
     * Size of the population.
     */
    val count: Integer?

    /**
     * For subject-list reports, the subject results in this population.
     */
    val subjectResults: Reference?
}

/**
 * MeasureReportGroupPopulation
 *
 * The populations that make up the population group, one for each type of population appropriate for
 * the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupPopulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupPopulation")
data class MeasureReportGroupPopulation(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("count")
    override val count: Integer? = null,

    @SerialName("subjectResults")
    override val subjectResults: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupPopulation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureReportGroupPopulation"
    }
}

/**
 * FhirMeasureReportGroupStratifier
 *
 * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier
 * defined by the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupStratifier : FhirBackboneElement {

    /**
     * What stratifier of the group.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Stratum results, one for each unique value, or set of values, in the stratifier,
     * or stratifier components.
     */
    val stratum: kotlin.collections.List<MeasureReportGroupStratifierStratum>?
}

/**
 * MeasureReportGroupStratifier
 *
 * When a measure includes multiple stratifiers, there will be a stratifier group for each stratifier
 * defined by the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifier</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupStratifier")
data class MeasureReportGroupStratifier(

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("stratum")
    override val stratum: kotlin.collections.List<MeasureReportGroupStratifierStratum>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupStratifier {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureReportGroupStratifier"
    }
}

/**
 * FhirMeasureReportGroupStratifierStratum
 *
 * This element contains the results for a single stratum within the stratifier. For example, when
 * stratifying on administrative gender, there will be four strata, one for each possible gender value.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratum</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupStratifierStratum : FhirBackboneElement {

    /**
     * The stratum value, e.g. male.
     */
    val value: CodeableConcept?

    /**
     * Stratifier component values.
     */
    val component: kotlin.collections.List<MeasureReportGroupStratifierStratumComponent>?

    /**
     * Population results in this stratum.
     */
    val population: kotlin.collections.List<MeasureReportGroupStratifierStratumPopulation>?

    /**
     * What score this stratum achieved.
     */
    val measureScore: Quantity?
}

/**
 * MeasureReportGroupStratifierStratum
 *
 * This element contains the results for a single stratum within the stratifier. For example, when
 * stratifying on administrative gender, there will be four strata, one for each possible gender value.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratum</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupStratifierStratum")
data class MeasureReportGroupStratifierStratum(

    @SerialName("value")
    override val value: CodeableConcept? = null,

    @SerialName("component")
    override val component: kotlin.collections.List<MeasureReportGroupStratifierStratumComponent>? = null,

    @SerialName("population")
    override val population: kotlin.collections.List<MeasureReportGroupStratifierStratumPopulation>? = null,

    @SerialName("measureScore")
    override val measureScore: Quantity? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupStratifierStratum {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureReportGroupStratifierStratum"
    }
}

/**
 * FhirMeasureReportGroupStratifierStratumComponent
 *
 * A stratifier component value.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratumComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupStratifierStratumComponent : FhirBackboneElement {

    /**
     * What stratifier component of the group.
     */
    val code: CodeableConcept

    /**
     * The stratum component value, e.g. male.
     */
    val value: CodeableConcept
}

/**
 * MeasureReportGroupStratifierStratumComponent
 *
 * A stratifier component value.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratumComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupStratifierStratumComponent")
data class MeasureReportGroupStratifierStratumComponent(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("value")
    override val value: CodeableConcept,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupStratifierStratumComponent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureReportGroupStratifierStratumComponent"
    }
}

/**
 * FhirMeasureReportGroupStratifierStratumPopulation
 *
 * The populations that make up the stratum, one for each type of population appropriate to the
 * measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratumPopulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupStratifierStratumPopulation : FhirBackboneElement {

    /**
     * initial-population | numerator | numerator-exclusion | denominator |
     * denominator-exclusion | denominator-exception | measure-population | measure-
     * population-exclusion | measure-observation.
     */
    val code: CodeableConcept?

    /**
     * Size of the population.
     */
    val count: Integer?

    /**
     * For subject-list reports, the subject results in this population.
     */
    val subjectResults: Reference?
}

/**
 * MeasureReportGroupStratifierStratumPopulation
 *
 * The populations that make up the stratum, one for each type of population appropriate to the
 * measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratumPopulation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupStratifierStratumPopulation")
data class MeasureReportGroupStratifierStratumPopulation(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("count")
    override val count: Integer? = null,

    @SerialName("subjectResults")
    override val subjectResults: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupStratifierStratumPopulation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MeasureReportGroupStratifierStratumPopulation"
    }
}
