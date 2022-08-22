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

import care.data4life.hl7.fhir.stu3.codesystem.AllergyIntoleranceCategory
import care.data4life.hl7.fhir.stu3.codesystem.AllergyIntoleranceClinicalStatus
import care.data4life.hl7.fhir.stu3.codesystem.AllergyIntoleranceCriticality
import care.data4life.hl7.fhir.stu3.codesystem.AllergyIntoleranceSeverity
import care.data4life.hl7.fhir.stu3.codesystem.AllergyIntoleranceType
import care.data4life.hl7.fhir.stu3.codesystem.AllergyIntoleranceVerificationStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirAllergyIntolerance
 *
 * Risk of harmful or undesirable, physiological response which is unique to an individual and
 * associated with exposure to a substance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AllergyIntolerance">AllergyIntolerance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AllergyIntolerance)
 */
interface FhirAllergyIntolerance : FhirDomainResource {

    /**
     * External ids for this item.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The clinical status of the allergy or intolerance.
     */
    val clinicalStatus: AllergyIntoleranceClinicalStatus?

    /**
     * Assertion about certainty associated with the propensity, or potential risk, of
     * a reaction to the identified substance (including pharmaceutical product).
     */
    val verificationStatus: AllergyIntoleranceVerificationStatus

    /**
     * Identification of the underlying physiological mechanism for the reaction risk.
     */
    val type: AllergyIntoleranceType?

    /**
     * Category of the identified substance.
     */
    val category: kotlin.collections.List<AllergyIntoleranceCategory>?

    /**
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the
     * identified substance.
     */
    val criticality: AllergyIntoleranceCriticality?

    /**
     * Code that identifies the allergy or intolerance.
     */
    val code: CodeableConcept?

    /**
     * Who the sensitivity is for.
     */
    val patient: Reference

    /**
     * When allergy or intolerance was identified.
     */
    val onsetDateTime: DateTime?

    /**
     * When allergy or intolerance was identified.
     */
    val onsetAge: Age?

    /**
     * When allergy or intolerance was identified.
     */
    val onsetPeriod: Period?

    /**
     * When allergy or intolerance was identified.
     */
    val onsetRange: Range?

    /**
     * When allergy or intolerance was identified.
     */
    val onsetString: String?

    /**
     * Date record was believed accurate.
     */
    val assertedDate: DateTime?

    /**
     * Who recorded the sensitivity.
     */
    val recorder: Reference?

    /**
     * Source of the information about the allergy.
     */
    val asserter: Reference?

    /**
     * Date(/time) of last known occurrence of a reaction.
     */
    val lastOccurrence: DateTime?

    /**
     * Additional text not captured in other fields.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Adverse Reaction Events linked to exposure to substance.
     */
    val reaction: kotlin.collections.List<AllergyIntoleranceReaction>?
}

/**
 * AllergyIntolerance
 *
 * Risk of harmful or undesirable, physiological response which is unique to an individual and
 * associated with exposure to a substance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AllergyIntolerance">AllergyIntolerance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AllergyIntolerance)
 */
@Serializable
@SerialName("AllergyIntolerance")
data class AllergyIntolerance(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("clinicalStatus")
    override val clinicalStatus: AllergyIntoleranceClinicalStatus? = null,

    @SerialName("verificationStatus")
    override val verificationStatus: AllergyIntoleranceVerificationStatus,

    @SerialName("type")
    override val type: AllergyIntoleranceType? = null,

    @SerialName("category")
    override val category: kotlin.collections.List<AllergyIntoleranceCategory>? = null,

    @SerialName("criticality")
    override val criticality: AllergyIntoleranceCriticality? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("onsetDateTime")
    override val onsetDateTime: DateTime? = null,

    @SerialName("onsetAge")
    override val onsetAge: Age? = null,

    @SerialName("onsetPeriod")
    override val onsetPeriod: Period? = null,

    @SerialName("onsetRange")
    override val onsetRange: Range? = null,

    @SerialName("onsetString")
    override val onsetString: String? = null,

    @SerialName("assertedDate")
    override val assertedDate: DateTime? = null,

    @SerialName("recorder")
    override val recorder: Reference? = null,

    @SerialName("asserter")
    override val asserter: Reference? = null,

    @SerialName("lastOccurrence")
    override val lastOccurrence: DateTime? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("reaction")
    override val reaction: kotlin.collections.List<AllergyIntoleranceReaction>? = null,

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
) : FhirAllergyIntolerance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AllergyIntolerance"
    }
}

/**
 * FhirAllergyIntoleranceReaction
 *
 * Details about each adverse reaction event linked to exposure to the identified substance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AllergyIntolerance">AllergyIntoleranceReaction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AllergyIntolerance)
 */
interface FhirAllergyIntoleranceReaction : FhirBackboneElement {

    /**
     * Specific substance or pharmaceutical product considered to be responsible for
     * event.
     */
    val substance: CodeableConcept?

    /**
     * Clinical symptoms/signs associated with the Event.
     */
    val manifestation: kotlin.collections.List<CodeableConcept>

    /**
     * Description of the event as a whole.
     */
    val description: String?

    /**
     * Date(/time) when manifestations showed.
     */
    val onset: DateTime?

    /**
     * Clinical assessment of the severity of the reaction event as a whole,
     * potentially considering multiple different manifestations.
     */
    val severity: AllergyIntoleranceSeverity?

    /**
     * How the subject was exposed to the substance.
     */
    val exposureRoute: CodeableConcept?

    /**
     * Text about event not captured in other fields.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * AllergyIntoleranceReaction
 *
 * Details about each adverse reaction event linked to exposure to the identified substance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/AllergyIntolerance">AllergyIntoleranceReaction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/AllergyIntolerance)
 */
@Serializable
@SerialName("AllergyIntoleranceReaction")
data class AllergyIntoleranceReaction(

    @SerialName("substance")
    override val substance: CodeableConcept? = null,

    @SerialName("manifestation")
    override val manifestation: kotlin.collections.List<CodeableConcept>,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("onset")
    override val onset: DateTime? = null,

    @SerialName("severity")
    override val severity: AllergyIntoleranceSeverity? = null,

    @SerialName("exposureRoute")
    override val exposureRoute: CodeableConcept? = null,

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
) : FhirAllergyIntoleranceReaction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "AllergyIntoleranceReaction"
    }
}
