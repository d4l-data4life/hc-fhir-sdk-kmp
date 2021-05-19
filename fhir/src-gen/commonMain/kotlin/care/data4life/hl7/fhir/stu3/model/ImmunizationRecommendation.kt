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

import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirImmunizationRecommendation
 *
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization
 * eligibility according to a published schedule) with optional supporting justification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
interface FhirImmunizationRecommendation : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: List<Identifier>?

    /**
     * Who this profile is for.
     */
    val patient: Reference

    /**
     * Vaccine administration recommendations.
     */
    val recommendation: List<ImmunizationRecommendationRecommendation>
}

/**
 * ImmunizationRecommendation
 *
 * SourceFileName: ImmunizationRecommendation.kt
 *
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization
 * eligibility according to a published schedule) with optional supporting justification.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
@Serializable
@SerialName("ImmunizationRecommendation")
data class ImmunizationRecommendation(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("recommendation")
    override val recommendation: List<ImmunizationRecommendationRecommendation>,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationRecommendation"
    }
}

/**
 * FhirImmunizationRecommendationRecommendation
 *
 * Vaccine administration recommendations
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
interface FhirImmunizationRecommendationRecommendation : FhirBackboneElement {

    /**
     * Date recommendation created.
     */
    val date: DateTime

    /**
     * Vaccine recommendation applies to.
     */
    val vaccineCode: CodeableConcept?

    /**
     * Disease to be immunized against.
     */
    val targetDisease: CodeableConcept?

    /**
     * Recommended dose number.
     */
    val doseNumber: PositiveInteger?

    /**
     * Vaccine administration status.
     */
    val forecastStatus: CodeableConcept

    /**
     * Dates governing proposed immunization.
     */
    val dateCriterion: List<ImmunizationRecommendationRecommendationDateCriterion>?

    /**
     * Protocol used by recommendation.
     */
    val protocol: ImmunizationRecommendationRecommendationProtocol?

    /**
     * Past immunizations supporting recommendation.
     */
    val supportingImmunization: List<Reference>?

    /**
     * Patient observations supporting recommendation.
     */
    val supportingPatientInformation: List<Reference>?
}

/**
 * ImmunizationRecommendationRecommendation
 *
 * SourceFileName: ImmunizationRecommendation.kt
 *
 * Vaccine administration recommendations
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
@Serializable
@SerialName("ImmunizationRecommendationRecommendation")
data class ImmunizationRecommendationRecommendation(

    @SerialName("date")
    override val date: DateTime,

    @SerialName("vaccineCode")
    override val vaccineCode: CodeableConcept? = null,

    @SerialName("targetDisease")
    override val targetDisease: CodeableConcept? = null,

    @SerialName("doseNumber")
    override val doseNumber: PositiveInteger? = null,

    @SerialName("forecastStatus")
    override val forecastStatus: CodeableConcept,

    @SerialName("dateCriterion")
    override val dateCriterion: List<ImmunizationRecommendationRecommendationDateCriterion>? = null,

    @SerialName("protocol")
    override val protocol: ImmunizationRecommendationRecommendationProtocol? = null,

    @SerialName("supportingImmunization")
    override val supportingImmunization: List<Reference>? = null,

    @SerialName("supportingPatientInformation")
    override val supportingPatientInformation: List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirImmunizationRecommendationRecommendation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationRecommendationRecommendation"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
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
 * SourceFileName: ImmunizationRecommendation.kt
 *
 * Vaccine date recommendations. For example, earliest date to administer, latest date to administer,
 * etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendationDateCriterion</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
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
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirImmunizationRecommendationRecommendationDateCriterion {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationRecommendationRecommendationDateCriterion"
    }
}

/**
 * FhirImmunizationRecommendationRecommendationProtocol
 *
 * Contains information about the protocol under which the vaccine was administered.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendationProtocol</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
interface FhirImmunizationRecommendationRecommendationProtocol : FhirBackboneElement {

    /**
     * Dose number within sequence.
     */
    val doseSequence: PositiveInteger?

    /**
     * Protocol details.
     */
    val description: String?

    /**
     * Who is responsible for protocol.
     */
    val authority: Reference?

    /**
     * Name of vaccination series.
     */
    val series: String?
}

/**
 * ImmunizationRecommendationRecommendationProtocol
 *
 * SourceFileName: ImmunizationRecommendation.kt
 *
 * Contains information about the protocol under which the vaccine was administered.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation">ImmunizationRecommendationRecommendationProtocol</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImmunizationRecommendation)
 */
@Serializable
@SerialName("ImmunizationRecommendationRecommendationProtocol")
data class ImmunizationRecommendationRecommendationProtocol(

    @SerialName("doseSequence")
    override val doseSequence: PositiveInteger? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("authority")
    override val authority: Reference? = null,

    @SerialName("series")
    override val series: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirImmunizationRecommendationRecommendationProtocol {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationRecommendationRecommendationProtocol"
    }
}
