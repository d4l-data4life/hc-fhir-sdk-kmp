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

import care.data4life.hl7.fhir.stu3.codesystem.MeasureReportStatus
import care.data4life.hl7.fhir.stu3.codesystem.MeasureReportType
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMeasureReport
 *
 * The MeasureReport resource contains the results of evaluating a measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReport</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReport : FhirDomainResource {

    /**
     * Additional identifier for the Report.
     */
    val identifier: Identifier?

    /**
     * The report status. No data will be available until the report status is
     * complete.
     */
    val status: MeasureReportStatus

    /**
     * The type of measure report. This may be an individual report, which provides a
     * single patient's score for the measure; a patient listing, which returns the
     * list of patients that meet the various criteria in the measure; or a summary
     * report, which returns a population count for each of the criteria in the
     * measure.
     */
    val type: MeasureReportType

    /**
     * What measure was evaluated.
     */
    val measure: Reference

    /**
     * What patient the report is for.
     */
    val patient: Reference?

    /**
     * When the report was generated.
     */
    val date: DateTime?

    /**
     * Who is reporting the data.
     */
    val reportingOrganization: Reference?

    /**
     * What period the report covers.
     */
    val period: Period

    /**
     * Measure results for each group.
     */
    val group: kotlin.collections.List<MeasureReportGroup>?

    /**
     * What data was evaluated to produce the measure score.
     */
    val evaluatedResources: Reference?
}

/**
 * MeasureReport
 *
 * The MeasureReport resource contains the results of evaluating a measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReport</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReport")
data class MeasureReport(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("status")
    override val status: MeasureReportStatus,

    @SerialName("type")
    override val type: MeasureReportType,

    @SerialName("measure")
    override val measure: Reference,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("reportingOrganization")
    override val reportingOrganization: Reference? = null,

    @SerialName("period")
    override val period: Period,

    @SerialName("group")
    override val group: kotlin.collections.List<MeasureReportGroup>? = null,

    @SerialName("evaluatedResources")
    override val evaluatedResources: Reference? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureReport"
    }
}

/**
 * FhirMeasureReportGroup
 *
 * The results of the calculation, one for each population group in the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroup : FhirBackboneElement {

    /**
     * What group of the measure.
     */
    val identifier: Identifier

    /**
     * The populations in the group.
     */
    val population: kotlin.collections.List<MeasureReportGroupPopulation>?

    /**
     * What score this group achieved.
     */
    val measureScore: Decimal?

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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroup")
data class MeasureReportGroup(

    @SerialName("identifier")
    override val identifier: Identifier,

    @SerialName("population")
    override val population: kotlin.collections.List<MeasureReportGroupPopulation>? = null,

    @SerialName("measureScore")
    override val measureScore: Decimal? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureReportGroup"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupPopulation : FhirBackboneElement {

    /**
     * Population identifier as defined in the measure.
     */
    val identifier: Identifier?

    /**
     * initial-population | numerator | numerator-exclusion | denominator |
     * denominator-exclusion | denominator-exception | measure-population | measure-
     * population-exclusion | measure-score.
     */
    val code: CodeableConcept?

    /**
     * Size of the population.
     */
    val count: Integer?

    /**
     * For patient-list reports, the patients in this population.
     */
    val patients: Reference?
}

/**
 * MeasureReportGroupPopulation
 *
 * The populations that make up the population group, one for each type of population appropriate for
 * the measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupPopulation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupPopulation")
data class MeasureReportGroupPopulation(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("count")
    override val count: Integer? = null,

    @SerialName("patients")
    override val patients: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupPopulation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureReportGroupPopulation"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupStratifier : FhirBackboneElement {

    /**
     * What stratifier of the group.
     */
    val identifier: Identifier?

    /**
     * Stratum results, one for each unique value in the stratifier.
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupStratifier")
data class MeasureReportGroupStratifier(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureReportGroupStratifier"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupStratifierStratum : FhirBackboneElement {

    /**
     * The stratum value, e.g. male.
     */
    val value: String

    /**
     * Population results in this stratum.
     */
    val population: kotlin.collections.List<MeasureReportGroupStratifierStratumPopulation>?

    /**
     * What score this stratum achieved.
     */
    val measureScore: Decimal?
}

/**
 * MeasureReportGroupStratifierStratum
 *
 * This element contains the results for a single stratum within the stratifier. For example, when
 * stratifying on administrative gender, there will be four strata, one for each possible gender value.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratum</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupStratifierStratum")
data class MeasureReportGroupStratifierStratum(

    @SerialName("value")
    override val value: String,

    @SerialName("population")
    override val population: kotlin.collections.List<MeasureReportGroupStratifierStratumPopulation>? = null,

    @SerialName("measureScore")
    override val measureScore: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupStratifierStratum {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureReportGroupStratifierStratum"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
interface FhirMeasureReportGroupStratifierStratumPopulation : FhirBackboneElement {

    /**
     * Population identifier as defined in the measure.
     */
    val identifier: Identifier?

    /**
     * initial-population | numerator | numerator-exclusion | denominator |
     * denominator-exclusion | denominator-exception | measure-population | measure-
     * population-exclusion | measure-score.
     */
    val code: CodeableConcept?

    /**
     * Size of the population.
     */
    val count: Integer?

    /**
     * For patient-list reports, the patients in this population.
     */
    val patients: Reference?
}

/**
 * MeasureReportGroupStratifierStratumPopulation
 *
 * The populations that make up the stratum, one for each type of population appropriate to the
 * measure.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MeasureReport">MeasureReportGroupStratifierStratumPopulation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MeasureReport)
 */
@Serializable
@SerialName("MeasureReportGroupStratifierStratumPopulation")
data class MeasureReportGroupStratifierStratumPopulation(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("count")
    override val count: Integer? = null,

    @SerialName("patients")
    override val patients: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMeasureReportGroupStratifierStratumPopulation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MeasureReportGroupStratifierStratumPopulation"
    }
}
