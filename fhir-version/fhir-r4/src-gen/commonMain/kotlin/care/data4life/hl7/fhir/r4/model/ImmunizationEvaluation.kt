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

import care.data4life.hl7.fhir.r4.codesystem.MedicationAdministrationStatusCodes
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirImmunizationEvaluation
 *
 * Describes a comparison of an immunization event against published recommendations to determine if
 * the administration is "valid" in relation to those recommendations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation">ImmunizationEvaluation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation)
 */
interface FhirImmunizationEvaluation : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates the current status of the evaluation of the vaccination administration
     * event.
     *
     * Only use: ['completed', 'entered-in-error']
     */
    val status: MedicationAdministrationStatusCodes

    /**
     * Who this evaluation is for.
     */
    val patient: Reference

    /**
     * Date evaluation was performed.
     */
    val date: DateTime?

    /**
     * Who is responsible for publishing the recommendations.
     */
    val authority: Reference?

    /**
     * Evaluation target disease.
     */
    val targetDisease: CodeableConcept

    /**
     * Immunization being evaluated.
     */
    val immunizationEvent: Reference

    /**
     * Status of the dose relative to published recommendations.
     */
    val doseStatus: CodeableConcept

    /**
     * Reason for the dose status.
     */
    val doseStatusReason: kotlin.collections.List<CodeableConcept>?

    /**
     * Evaluation notes.
     */
    val description: String?

    /**
     * Name of vaccine series.
     */
    val series: String?

    /**
     * Dose number within series.
     */
    val doseNumberPositiveInt: PositiveInteger?

    /**
     * Dose number within series.
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
}

/**
 * ImmunizationEvaluation
 *
 * Describes a comparison of an immunization event against published recommendations to determine if
 * the administration is "valid" in relation to those recommendations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation">ImmunizationEvaluation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImmunizationEvaluation)
 */
@Serializable
@SerialName("ImmunizationEvaluation")
data class ImmunizationEvaluation(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: MedicationAdministrationStatusCodes,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("authority")
    override val authority: Reference? = null,

    @SerialName("targetDisease")
    override val targetDisease: CodeableConcept,

    @SerialName("immunizationEvent")
    override val immunizationEvent: Reference,

    @SerialName("doseStatus")
    override val doseStatus: CodeableConcept,

    @SerialName("doseStatusReason")
    override val doseStatusReason: kotlin.collections.List<CodeableConcept>? = null,

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
) : FhirImmunizationEvaluation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImmunizationEvaluation"
    }
}
