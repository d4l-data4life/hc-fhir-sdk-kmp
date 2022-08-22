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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
interface FhirMedicationAdministration : FhirDomainResource {

    /**
     * External identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Instantiates protocol or definition.
     */
    val instantiates: kotlin.collections.List<String>?

    /**
     * Part of referenced event.
     */
    val partOf: kotlin.collections.List<Reference>?

    /**
     * Will generally be set to show that the administration has been completed. For
     * some long running administrations such as infusions, it is possible for an
     * administration to be started but not completed or it may be paused while some
     * other process is under way.
     */
    val status: MedicationAdministrationStatusCodes

    /**
     * Reason administration not performed.
     */
    val statusReason: kotlin.collections.List<CodeableConcept>?

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
    val supportingInformation: kotlin.collections.List<Reference>?

    /**
     * Start and end time of administration.
     */
    val effectiveDateTime: DateTime?

    /**
     * Start and end time of administration.
     */
    val effectivePeriod: Period?

    /**
     * Who performed the medication administration and what they did.
     */
    val performer: kotlin.collections.List<MedicationAdministrationPerformer>?

    /**
     * Reason administration performed.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Condition or observation that supports why the medication was administered.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Request administration performed against.
     */
    val request: Reference?

    /**
     * Device used to administer.
     */
    val device: kotlin.collections.List<Reference>?

    /**
     * Information about the administration.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Details of how medication was taken.
     */
    val dosage: MedicationAdministrationDosage?

    /**
     * A list of events of interest in the lifecycle.
     */
    val eventHistory: kotlin.collections.List<Reference>?
}

/**
 * MedicationAdministration
 *
 * Describes the event of a patient consuming or otherwise being administered a medication. This may be
 * as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this
 * event to the authorizing prescription, and the specific encounter between patient and health care
 * practitioner.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministration</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
@Serializable
@SerialName("MedicationAdministration")
data class MedicationAdministration(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("instantiates")
    override val instantiates: kotlin.collections.List<String>? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: MedicationAdministrationStatusCodes,

    @SerialName("statusReason")
    override val statusReason: kotlin.collections.List<CodeableConcept>? = null,

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
    override val supportingInformation: kotlin.collections.List<Reference>? = null,

    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("performer")
    override val performer: kotlin.collections.List<MedicationAdministrationPerformer>? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("request")
    override val request: Reference? = null,

    @SerialName("device")
    override val device: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("dosage")
    override val dosage: MedicationAdministrationDosage? = null,

    @SerialName("eventHistory")
    override val eventHistory: kotlin.collections.List<Reference>? = null,

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
) : FhirMedicationAdministration {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationAdministration"
    }
}

/**
 * FhirMedicationAdministrationDosage
 *
 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationDosage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
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
 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationDosage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationAdministrationDosage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationAdministrationDosage"
    }
}

/**
 * FhirMedicationAdministrationPerformer
 *
 * Indicates who or what performed the medication administration and how they were involved.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationPerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
interface FhirMedicationAdministrationPerformer : FhirBackboneElement {

    /**
     * Type of performance.
     */
    val function: CodeableConcept?

    /**
     * Who performed the medication administration.
     */
    val actor: Reference
}

/**
 * MedicationAdministrationPerformer
 *
 * Indicates who or what performed the medication administration and how they were involved.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationAdministration">MedicationAdministrationPerformer</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationAdministration)
 */
@Serializable
@SerialName("MedicationAdministrationPerformer")
data class MedicationAdministrationPerformer(

    @SerialName("function")
    override val function: CodeableConcept? = null,

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
) : FhirMedicationAdministrationPerformer {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationAdministrationPerformer"
    }
}
