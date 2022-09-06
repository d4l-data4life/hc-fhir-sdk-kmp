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

import care.data4life.hl7.fhir.stu3.codesystem.MedicationAdministrationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirImmunization
 *
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as
 * reported by a patient, a clinician or another party and may include vaccine reaction information and
 * what vaccination protocol was followed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunization : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Indicates the current status of the vaccination event.
     *
     * Only use: ['completed', 'entered-in-error']
     */
    val status: MedicationAdministrationStatus

    /**
     * Flag for whether immunization was given.
     */
    val notGiven: Bool

    /**
     * Vaccine product administered.
     */
    val vaccineCode: CodeableConcept

    /**
     * Who was immunized.
     */
    val patient: Reference

    /**
     * Encounter administered as part of.
     */
    val encounter: Reference?

    /**
     * Vaccination administration date.
     */
    val date: DateTime?

    /**
     * Indicates context the data was recorded in.
     */
    val primarySource: Bool

    /**
     * Indicates the source of a secondarily reported record.
     */
    val reportOrigin: CodeableConcept?

    /**
     * Where vaccination occurred.
     */
    val location: Reference?

    /**
     * Vaccine manufacturer.
     */
    val manufacturer: Reference?

    /**
     * Vaccine lot number.
     */
    val lotNumber: String?

    /**
     * Vaccine expiration date.
     */
    val expirationDate: Date?

    /**
     * Body site vaccine was administered.
     */
    val site: CodeableConcept?

    /**
     * How vaccine entered body.
     */
    val route: CodeableConcept?

    /**
     * Amount of vaccine administered.
     */
    val doseQuantity: Quantity?

    /**
     * Who performed event.
     */
    val practitioner: kotlin.collections.List<ImmunizationPractitioner>?

    /**
     * Vaccination notes.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Administration/non-administration reasons.
     */
    val explanation: ImmunizationExplanation?

    /**
     * Details of a reaction that follows immunization.
     */
    val reaction: kotlin.collections.List<ImmunizationReaction>?

    /**
     * What protocol was followed.
     */
    val vaccinationProtocol: kotlin.collections.List<ImmunizationVaccinationProtocol>?
}

/**
 * Immunization
 *
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as
 * reported by a patient, a clinician or another party and may include vaccine reaction information and
 * what vaccination protocol was followed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">Immunization</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("Immunization")
data class Immunization(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: MedicationAdministrationStatus,

    @SerialName("notGiven")
    override val notGiven: Bool,

    @SerialName("vaccineCode")
    override val vaccineCode: CodeableConcept,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("primarySource")
    override val primarySource: Bool,

    @SerialName("reportOrigin")
    override val reportOrigin: CodeableConcept? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("manufacturer")
    override val manufacturer: Reference? = null,

    @SerialName("lotNumber")
    override val lotNumber: String? = null,

    @SerialName("expirationDate")
    override val expirationDate: Date? = null,

    @SerialName("site")
    override val site: CodeableConcept? = null,

    @SerialName("route")
    override val route: CodeableConcept? = null,

    @SerialName("doseQuantity")
    override val doseQuantity: Quantity? = null,

    @SerialName("practitioner")
    override val practitioner: kotlin.collections.List<ImmunizationPractitioner>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("explanation")
    override val explanation: ImmunizationExplanation? = null,

    @SerialName("reaction")
    override val reaction: kotlin.collections.List<ImmunizationReaction>? = null,

    @SerialName("vaccinationProtocol")
    override val vaccinationProtocol: kotlin.collections.List<ImmunizationVaccinationProtocol>? = null,

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
) : FhirImmunization {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Immunization"
    }
}

/**
 * FhirImmunizationExplanation
 *
 * Reasons why a vaccine was or was not administered.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationExplanation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationExplanation : FhirBackboneElement {

    /**
     * Why immunization occurred.
     */
    val reason: kotlin.collections.List<CodeableConcept>?

    /**
     * Why immunization did not occur.
     */
    val reasonNotGiven: kotlin.collections.List<CodeableConcept>?
}

/**
 * ImmunizationExplanation
 *
 * Reasons why a vaccine was or was not administered.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationExplanation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationExplanation")
data class ImmunizationExplanation(

    @SerialName("reason")
    override val reason: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonNotGiven")
    override val reasonNotGiven: kotlin.collections.List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationExplanation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationExplanation"
    }
}

/**
 * FhirImmunizationPractitioner
 *
 * Indicates who or what performed the event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationPractitioner</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationPractitioner : FhirBackboneElement {

    /**
     * What type of performance was done.
     */
    val role: CodeableConcept?

    /**
     * Individual who was performing.
     */
    val actor: Reference
}

/**
 * ImmunizationPractitioner
 *
 * Indicates who or what performed the event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationPractitioner</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationPractitioner")
data class ImmunizationPractitioner(

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("actor")
    override val actor: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationPractitioner {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationPractitioner"
    }
}

/**
 * FhirImmunizationReaction
 *
 * Categorical data indicating that an adverse event is associated in time to an immunization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationReaction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationReaction : FhirBackboneElement {

    /**
     * When reaction started.
     */
    val date: DateTime?

    /**
     * Additional information on reaction.
     */
    val detail: Reference?

    /**
     * Indicates self-reported reaction.
     */
    val reported: Bool?
}

/**
 * ImmunizationReaction
 *
 * Categorical data indicating that an adverse event is associated in time to an immunization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationReaction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationReaction")
data class ImmunizationReaction(

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("detail")
    override val detail: Reference? = null,

    @SerialName("reported")
    override val reported: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationReaction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationReaction"
    }
}

/**
 * FhirImmunizationVaccinationProtocol
 *
 * Contains information about the protocol(s) under which the vaccine was administered.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationVaccinationProtocol</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
interface FhirImmunizationVaccinationProtocol : FhirBackboneElement {

    /**
     * Dose number within series.
     */
    val doseSequence: PositiveInteger?

    /**
     * Details of vaccine protocol.
     */
    val description: String?

    /**
     * Who is responsible for protocol.
     */
    val authority: Reference?

    /**
     * Name of vaccine series.
     */
    val series: String?

    /**
     * Recommended number of doses for immunity.
     */
    val seriesDoses: PositiveInteger?

    /**
     * Disease immunized against.
     */
    val targetDisease: kotlin.collections.List<CodeableConcept>

    /**
     * Indicates if dose counts towards immunity.
     */
    val doseStatus: CodeableConcept

    /**
     * Why dose does (not) count.
     */
    val doseStatusReason: CodeableConcept?
}

/**
 * ImmunizationVaccinationProtocol
 *
 * Contains information about the protocol(s) under which the vaccine was administered.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Immunization">ImmunizationVaccinationProtocol</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Immunization)
 */
@Serializable
@SerialName("ImmunizationVaccinationProtocol")
data class ImmunizationVaccinationProtocol(

    @SerialName("doseSequence")
    override val doseSequence: PositiveInteger? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("authority")
    override val authority: Reference? = null,

    @SerialName("series")
    override val series: String? = null,

    @SerialName("seriesDoses")
    override val seriesDoses: PositiveInteger? = null,

    @SerialName("targetDisease")
    override val targetDisease: kotlin.collections.List<CodeableConcept>,

    @SerialName("doseStatus")
    override val doseStatus: CodeableConcept,

    @SerialName("doseStatusReason")
    override val doseStatusReason: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImmunizationVaccinationProtocol {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImmunizationVaccinationProtocol"
    }
}
