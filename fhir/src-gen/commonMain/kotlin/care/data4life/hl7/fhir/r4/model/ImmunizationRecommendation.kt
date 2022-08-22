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
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirImmunizationRecommendation
 *
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
 * schedule with optional supporting justification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
interface FhirImmunizationRecommendation : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Who this profile is for.
     */
    val patient: Reference

    /**
     * Date recommendation(s) created.
     */
    val date: DateTime

    /**
     * Who is responsible for protocol.
     */
    val authority: Reference?

    /**
     * Vaccine administration recommendations.
     */
    val recommendation: kotlin.collections.List<ImmunizationRecommendationRecommendation>
}

/**
 * ImmunizationRecommendation
 *
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
 * schedule with optional supporting justification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
@Serializable
@SerialName("ImmunizationRecommendation")
data class ImmunizationRecommendation(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("date")
    override val date: DateTime,

    @SerialName("authority")
    override val authority: Reference? = null,

    @SerialName("recommendation")
    override val recommendation: kotlin.collections.List<ImmunizationRecommendationRecommendation>,

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
) : FhirImmunizationRecommendation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationRecommendation"
    }
}

/**
 * FhirImmunizationRecommendationRecommendation
 *
 * Vaccine administration recommendations
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
interface FhirImmunizationRecommendationRecommendation : FhirBackboneElement {

    /**
     * Vaccine or vaccine group recommendation applies to.
     */
    val vaccineCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Disease to be immunized against.
     */
    val targetDisease: CodeableConcept?

    /**
     * Vaccine which is contraindicated to fulfill the recommendation.
     */
    val contraindicatedVaccineCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Vaccine recommendation status.
     */
    val forecastStatus: CodeableConcept

    /**
     * Vaccine administration status reason.
     */
    val forecastReason: kotlin.collections.List<CodeableConcept>?

    /**
     * Dates governing proposed immunization.
     */
    val dateCriterion: kotlin.collections.List<ImmunizationRecommendationRecommendationDateCriterion>?

    /**
     * Protocol details.
     */
    val description: String?

    /**
     * Name of vaccination series.
     */
    val series: String?

    /**
     * Recommended dose number within series.
     */
    val doseNumberPositiveInt: PositiveInteger?

    /**
     * Recommended dose number within series.
     */
    val doseNumberString: String?

    /**
     * Recommended number of doses for immunity.
     */
    val seriesDosesPositiveInt: PositiveInteger?

    /**
     * Recommended number of doses for immunity.
     */
    val seriesDosesString: String?

    /**
     * Past immunizations supporting recommendation.
     */
    val supportingImmunization: kotlin.collections.List<Reference>?

    /**
     * Patient observations supporting recommendation.
     */
    val supportingPatientInformation: kotlin.collections.List<Reference>?
}

/**
 * ImmunizationRecommendationRecommendation
 *
 * Vaccine administration recommendations
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
@Serializable
@SerialName("ImmunizationRecommendationRecommendation")
data class ImmunizationRecommendationRecommendation(

    @SerialName("vaccineCode")
    override val vaccineCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("targetDisease")
    override val targetDisease: CodeableConcept? = null,

    @SerialName("contraindicatedVaccineCode")
    override val contraindicatedVaccineCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("forecastStatus")
    override val forecastStatus: CodeableConcept,

    @SerialName("forecastReason")
    override val forecastReason: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("dateCriterion")
    override val dateCriterion: kotlin.collections.List<ImmunizationRecommendationRecommendationDateCriterion>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("series")
    override val series: String? = null,

    @SerialName("doseNumberPositiveInt")
    override val doseNumberPositiveInt: PositiveInteger? = null,

    @SerialName("doseNumberString")
    override val doseNumberString: String? = null,

    @SerialName("seriesDosesPositiveInt")
    override val seriesDosesPositiveInt: PositiveInteger? = null,

    @SerialName("seriesDosesString")
    override val seriesDosesString: String? = null,

    @SerialName("supportingImmunization")
    override val supportingImmunization: kotlin.collections.List<Reference>? = null,

    @SerialName("supportingPatientInformation")
    override val supportingPatientInformation: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationRecommendationRecommendation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationRecommendationRecommendation"
    }
}

/**
 * FhirImmunizationRecommendationRecommendationDateCriterion
 *
 * Vaccine date recommendations. For example, earliest date to administer, latest date to administer,
 * etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendationDateCriterion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
interface FhirImmunizationRecommendationRecommendationDateCriterion : FhirBackboneElement {

    /**
     * Type of date.
     */
    val code: CodeableConcept

    /**
     * Recommended date.
     */
    val value: DateTime
}

/**
 * ImmunizationRecommendationRecommendationDateCriterion
 *
 * Vaccine date recommendations. For example, earliest date to administer, latest date to administer,
 * etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendationDateCriterion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
@Serializable
@SerialName("ImmunizationRecommendationRecommendationDateCriterion")
data class ImmunizationRecommendationRecommendationDateCriterion(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("value")
    override val value: DateTime,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationRecommendationRecommendationDateCriterion {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationRecommendationRecommendationDateCriterion"
    }
}
