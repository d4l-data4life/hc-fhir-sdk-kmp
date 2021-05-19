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
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedicationAdministration
 *
 * Describes the event of a patient consuming or otherwise being administered a medication. This may be
 * as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this
 * event to the authorizing prescription, and the specific encounter between patient and health care
 * practitioner.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministration</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
interface FhirMedicationAdministration : FhirDomainResource {

    /**
     * External identifier.
     */
    val identifier: List<Identifier>?

    /**
     * Instantiates protocol or definition.
     */
    val definition: List<Reference>?

    /**
     * Part of referenced event.
     */
    val partOf: List<Reference>?

    /**
     * Will generally be set to show that the administration has been completed. For
     * some long running administrations such as infusions it is possible for an
     * administration to be started but not completed or it may be paused while some
     * other process is under way.
     */
    val status: MedicationAdministrationStatus

    /**
     * Type of medication usage.
     */
    val category: CodeableConcept?

    /**
     * What was administered.
     */
    val medicationCodeableConcept: CodeableConcept?

    /**
     * What was administered.
     */
    val medicationReference: Reference?

    /**
     * Who received medication.
     */
    val subject: Reference

    /**
     * Encounter or Episode of Care administered as part of.
     */
    val context: Reference?

    /**
     * Additional information to support administration.
     */
    val supportingInformation: List<Reference>?

    /**
     * Start and end time of administration.
     */
    val effectiveDateTime: DateTime?

    /**
     * Start and end time of administration.
     */
    val effectivePeriod: Period?

    /**
     * Who administered substance.
     */
    val performer: List<MedicationAdministrationPerformer>?

    /**
     * True if medication not administered.
     */
    val notGiven: Bool?

    /**
     * Reason administration not performed.
     */
    val reasonNotGiven: List<CodeableConcept>?

    /**
     * Reason administration performed.
     */
    val reasonCode: List<CodeableConcept>?

    /**
     * Condition or Observation that supports why the medication was administered.
     */
    val reasonReference: List<Reference>?

    /**
     * Request administration performed against.
     */
    val prescription: Reference?

    /**
     * Device used to administer.
     */
    val device: List<Reference>?

    /**
     * Information about the administration.
     */
    val note: List<Annotation>?

    /**
     * Details of how medication was taken.
     */
    val dosage: MedicationAdministrationDosage?

    /**
     * A list of events of interest in the lifecycle.
     */
    val eventHistory: List<Reference>?
}

/**
 * MedicationAdministration
 *
 * SourceFileName: MedicationAdministration.kt
 *
 * Describes the event of a patient consuming or otherwise being administered a medication. This may be
 * as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this
 * event to the authorizing prescription, and the specific encounter between patient and health care
 * practitioner.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministration</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
@Serializable
@SerialName("MedicationAdministration")
data class MedicationAdministration(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("definition")
    override val definition: List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: List<Reference>? = null,

    @SerialName("status")
    override val status: MedicationAdministrationStatus,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("medicationCodeableConcept")
    override val medicationCodeableConcept: CodeableConcept? = null,

    @SerialName("medicationReference")
    override val medicationReference: Reference? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("supportingInformation")
    override val supportingInformation: List<Reference>? = null,

    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("performer")
    override val performer: List<MedicationAdministrationPerformer>? = null,

    @SerialName("notGiven")
    override val notGiven: Bool? = null,

    @SerialName("reasonNotGiven")
    override val reasonNotGiven: List<CodeableConcept>? = null,

    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    @SerialName("prescription")
    override val prescription: Reference? = null,

    @SerialName("device")
    override val device: List<Reference>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("dosage")
    override val dosage: MedicationAdministrationDosage? = null,

    @SerialName("eventHistory")
    override val eventHistory: List<Reference>? = null,

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
) : FhirMedicationAdministration {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationAdministration"
    }
}

/**
 * FhirMedicationAdministrationDosage
 *
 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationDosage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
interface FhirMedicationAdministrationDosage : FhirBackboneElement {

    /**
     * Free text dosage instructions e.g. SIG.
     */
    val text: String?

    /**
     * Body site administered to.
     */
    val site: CodeableConcept?

    /**
     * Path of substance into body.
     */
    val route: CodeableConcept?

    /**
     * How drug was administered.
     */
    val method: CodeableConcept?

    /**
     * Amount of medication per dose.
     */
    val dose: Quantity?

    /**
     * Dose quantity per unit of time.
     */
    val rateRatio: Ratio?

    /**
     * Dose quantity per unit of time.
     */
    val rateQuantity: Quantity?
}

/**
 * MedicationAdministrationDosage
 *
 * SourceFileName: MedicationAdministration.kt
 *
 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationDosage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
@Serializable
@SerialName("MedicationAdministrationDosage")
data class MedicationAdministrationDosage(

    @SerialName("text")
    override val text: String? = null,

    @SerialName("site")
    override val site: CodeableConcept? = null,

    @SerialName("route")
    override val route: CodeableConcept? = null,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("dose")
    override val dose: Quantity? = null,

    @SerialName("rateRatio")
    override val rateRatio: Ratio? = null,

    @SerialName("rateQuantity")
    override val rateQuantity: Quantity? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationAdministrationDosage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationAdministrationDosage"
    }
}

/**
 * FhirMedicationAdministrationPerformer
 *
 * The individual who was responsible for giving the medication to the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationPerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
interface FhirMedicationAdministrationPerformer : FhirBackboneElement {

    /**
     * Individual who was performing.
     */
    val actor: Reference

    /**
     * Organization organization was acting for.
     */
    val onBehalfOf: Reference?
}

/**
 * MedicationAdministrationPerformer
 *
 * SourceFileName: MedicationAdministration.kt
 *
 * The individual who was responsible for giving the medication to the patient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationPerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
@Serializable
@SerialName("MedicationAdministrationPerformer")
data class MedicationAdministrationPerformer(

    @SerialName("actor")
    override val actor: Reference,

    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationAdministrationPerformer {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationAdministrationPerformer"
    }
}
