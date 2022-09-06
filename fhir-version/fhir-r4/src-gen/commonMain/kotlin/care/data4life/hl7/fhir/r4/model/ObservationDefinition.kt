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

import care.data4life.hl7.fhir.r4.codesystem.AdministrativeGender
import care.data4life.hl7.fhir.r4.codesystem.ObservationDataType
import care.data4life.hl7.fhir.r4.codesystem.ObservationRangeCategory
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirObservationDefinition
 *
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by
 * an orderable health care service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ObservationDefinition">ObservationDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ObservationDefinition)
 */
interface FhirObservationDefinition : FhirDomainResource {

    /**
     * Category of observation.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Type of observation (code / type).
     */
    val code: CodeableConcept

    /**
     * Business identifier for this ObservationDefinition instance.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The data types allowed for the value element of the instance observations
     * conforming to this ObservationDefinition.
     */
    val permittedDataType: kotlin.collections.List<ObservationDataType>?

    /**
     * Multiple results allowed.
     */
    val multipleResultsAllowed: Bool?

    /**
     * Method used to produce the observation.
     */
    val method: CodeableConcept?

    /**
     * Preferred report name.
     */
    val preferredReportName: String?

    /**
     * Characteristics of quantitative results.
     */
    val quantitativeDetails: ObservationDefinitionQuantitativeDetails?

    /**
     * Qualified range for continuous and ordinal observation results.
     */
    val qualifiedInterval: kotlin.collections.List<ObservationDefinitionQualifiedInterval>?

    /**
     * Value set of valid coded values for the observations conforming to this
     * ObservationDefinition.
     */
    val validCodedValueSet: Reference?

    /**
     * Value set of normal coded values for the observations conforming to this
     * ObservationDefinition.
     */
    val normalCodedValueSet: Reference?

    /**
     * Value set of abnormal coded values for the observations conforming to this
     * ObservationDefinition.
     */
    val abnormalCodedValueSet: Reference?

    /**
     * Value set of critical coded values for the observations conforming to this
     * ObservationDefinition.
     */
    val criticalCodedValueSet: Reference?
}

/**
 * ObservationDefinition
 *
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed by
 * an orderable health care service.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ObservationDefinition">ObservationDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ObservationDefinition)
 */
@Serializable
@SerialName("ObservationDefinition")
data class ObservationDefinition(

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("permittedDataType")
    override val permittedDataType: kotlin.collections.List<ObservationDataType>? = null,

    @SerialName("multipleResultsAllowed")
    override val multipleResultsAllowed: Bool? = null,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("preferredReportName")
    override val preferredReportName: String? = null,

    @SerialName("quantitativeDetails")
    override val quantitativeDetails: ObservationDefinitionQuantitativeDetails? = null,

    @SerialName("qualifiedInterval")
    override val qualifiedInterval: kotlin.collections.List<ObservationDefinitionQualifiedInterval>? = null,

    @SerialName("validCodedValueSet")
    override val validCodedValueSet: Reference? = null,

    @SerialName("normalCodedValueSet")
    override val normalCodedValueSet: Reference? = null,

    @SerialName("abnormalCodedValueSet")
    override val abnormalCodedValueSet: Reference? = null,

    @SerialName("criticalCodedValueSet")
    override val criticalCodedValueSet: Reference? = null,

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
) : FhirObservationDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ObservationDefinition"
    }
}

/**
 * FhirObservationDefinitionQualifiedInterval
 *
 * Multiple ranges of results qualified by different contexts for ordinal or continuous observations
 * conforming to this ObservationDefinition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ObservationDefinition">ObservationDefinitionQualifiedInterval</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ObservationDefinition)
 */
interface FhirObservationDefinitionQualifiedInterval : FhirBackboneElement {

    /**
     * The category of interval of values for continuous or ordinal observations
     * conforming to this ObservationDefinition.
     */
    val category: ObservationRangeCategory?

    /**
     * The interval itself, for continuous or ordinal observations.
     */
    val range: Range?

    /**
     * Range context qualifier.
     */
    val context: CodeableConcept?

    /**
     * Targetted population of the range.
     */
    val appliesTo: kotlin.collections.List<CodeableConcept>?

    /**
     * Sex of the population the range applies to.
     */
    val gender: AdministrativeGender?

    /**
     * Applicable age range, if relevant.
     */
    val age: Range?

    /**
     * Applicable gestational age range, if relevant.
     */
    val gestationalAge: Range?

    /**
     * Condition associated with the reference range.
     */
    val condition: String?
}

/**
 * ObservationDefinitionQualifiedInterval
 *
 * Multiple ranges of results qualified by different contexts for ordinal or continuous observations
 * conforming to this ObservationDefinition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ObservationDefinition">ObservationDefinitionQualifiedInterval</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ObservationDefinition)
 */
@Serializable
@SerialName("ObservationDefinitionQualifiedInterval")
data class ObservationDefinitionQualifiedInterval(

    @SerialName("category")
    override val category: ObservationRangeCategory? = null,

    @SerialName("range")
    override val range: Range? = null,

    @SerialName("context")
    override val context: CodeableConcept? = null,

    @SerialName("appliesTo")
    override val appliesTo: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("gender")
    override val gender: AdministrativeGender? = null,

    @SerialName("age")
    override val age: Range? = null,

    @SerialName("gestationalAge")
    override val gestationalAge: Range? = null,

    @SerialName("condition")
    override val condition: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirObservationDefinitionQualifiedInterval {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ObservationDefinitionQualifiedInterval"
    }
}

/**
 * FhirObservationDefinitionQuantitativeDetails
 *
 * Characteristics for quantitative results of this observation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ObservationDefinition">ObservationDefinitionQuantitativeDetails</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ObservationDefinition)
 */
interface FhirObservationDefinitionQuantitativeDetails : FhirBackboneElement {

    /**
     * Customary unit for quantitative results.
     */
    val customaryUnit: CodeableConcept?

    /**
     * SI unit for quantitative results.
     */
    val unit: CodeableConcept?

    /**
     * SI to Customary unit conversion factor.
     */
    val conversionFactor: Decimal?

    /**
     * Decimal precision of observation quantitative results.
     */
    val decimalPrecision: Integer?
}

/**
 * ObservationDefinitionQuantitativeDetails
 *
 * Characteristics for quantitative results of this observation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ObservationDefinition">ObservationDefinitionQuantitativeDetails</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ObservationDefinition)
 */
@Serializable
@SerialName("ObservationDefinitionQuantitativeDetails")
data class ObservationDefinitionQuantitativeDetails(

    @SerialName("customaryUnit")
    override val customaryUnit: CodeableConcept? = null,

    @SerialName("unit")
    override val unit: CodeableConcept? = null,

    @SerialName("conversionFactor")
    override val conversionFactor: Decimal? = null,

    @SerialName("decimalPrecision")
    override val decimalPrecision: Integer? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirObservationDefinitionQuantitativeDetails {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ObservationDefinitionQuantitativeDetails"
    }
}
