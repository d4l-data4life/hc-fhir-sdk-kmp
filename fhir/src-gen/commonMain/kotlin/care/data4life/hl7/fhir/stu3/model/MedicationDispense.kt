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

import care.data4life.hl7.fhir.stu3.codesystem.MedicationDispenseStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedicationDispense
 *
 * Indicates that a medication product is to be or has been dispensed for a named person/patient. This
 * includes a description of the medication product (supply) provided and the instructions for
 * administering the medication. The medication dispense is the result of a pharmacy system responding
 * to a medication order.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationDispense">MedicationDispense</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationDispense)
 */
interface FhirMedicationDispense : FhirDomainResource {

    /**
     * External identifier.
     */
    val identifier: List<Identifier>?

    /**
     * Event that dispense is part of.
     */
    val partOf: List<Reference>?

    /**
     * A code specifying the state of the set of dispense events.
     */
    val status: MedicationDispenseStatus?

    /**
     * Type of medication dispense.
     */
    val category: CodeableConcept?

    /**
     * What medication was supplied.
     */
    val medicationCodeableConcept: CodeableConcept?

    /**
     * What medication was supplied.
     */
    val medicationReference: Reference?

    /**
     * Who the dispense is for.
     */
    val subject: Reference?

    /**
     * Encounter / Episode associated with event.
     */
    val context: Reference?

    /**
     * Information that supports the dispensing of the medication.
     */
    val supportingInformation: List<Reference>?

    /**
     * Who performed event.
     */
    val performer: List<MedicationDispensePerformer>?

    /**
     * Medication order that authorizes the dispense.
     */
    val authorizingPrescription: List<Reference>?

    /**
     * Trial fill, partial fill, emergency fill, etc..
     */
    val type: CodeableConcept?

    /**
     * Amount dispensed.
     */
    val quantity: Quantity?

    /**
     * Amount of medication expressed as a timing amount.
     */
    val daysSupply: Quantity?

    /**
     * When product was packaged and reviewed.
     */
    val whenPrepared: DateTime?

    /**
     * When product was given out.
     */
    val whenHandedOver: DateTime?

    /**
     * Where the medication was sent.
     */
    val destination: Reference?

    /**
     * Who collected the medication.
     */
    val receiver: List<Reference>?

    /**
     * Information about the dispense.
     */
    val note: List<Annotation>?

    /**
     * How the medication is to be used by the patient or administered by the caregiver.
     */
    val dosageInstruction: List<Dosage>?

    /**
     * Whether a substitution was performed on the dispense.
     */
    val substitution: MedicationDispenseSubstitution?

    /**
     * Clinical issue with action.
     */
    val detectedIssue: List<Reference>?

    /**
     * Whether the dispense was or was not performed.
     */
    val notDone: Bool?

    /**
     * Why a dispense was not performed.
     */
    val notDoneReasonCodeableConcept: CodeableConcept?

    /**
     * Why a dispense was not performed.
     */
    val notDoneReasonReference: Reference?

    /**
     * A list of releveant lifecycle events.
     */
    val eventHistory: List<Reference>?
}

/**
 * MedicationDispense
 *
 * SourceFileName: MedicationDispense.kt
 *
 * Indicates that a medication product is to be or has been dispensed for a named person/patient. This
 * includes a description of the medication product (supply) provided and the instructions for
 * administering the medication. The medication dispense is the result of a pharmacy system responding
 * to a medication order.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationDispense">MedicationDispense</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationDispense)
 */
@Serializable
@SerialName("MedicationDispense")
data class MedicationDispense(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("partOf")
    override val partOf: List<Reference>? = null,

    @SerialName("status")
    override val status: MedicationDispenseStatus? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("medicationCodeableConcept")
    override val medicationCodeableConcept: CodeableConcept? = null,

    @SerialName("medicationReference")
    override val medicationReference: Reference? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("supportingInformation")
    override val supportingInformation: List<Reference>? = null,

    @SerialName("performer")
    override val performer: List<MedicationDispensePerformer>? = null,

    @SerialName("authorizingPrescription")
    override val authorizingPrescription: List<Reference>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("daysSupply")
    override val daysSupply: Quantity? = null,

    @SerialName("whenPrepared")
    override val whenPrepared: DateTime? = null,

    @SerialName("whenHandedOver")
    override val whenHandedOver: DateTime? = null,

    @SerialName("destination")
    override val destination: Reference? = null,

    @SerialName("receiver")
    override val receiver: List<Reference>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("dosageInstruction")
    override val dosageInstruction: List<Dosage>? = null,

    @SerialName("substitution")
    override val substitution: MedicationDispenseSubstitution? = null,

    @SerialName("detectedIssue")
    override val detectedIssue: List<Reference>? = null,

    @SerialName("notDone")
    override val notDone: Bool? = null,

    @SerialName("notDoneReasonCodeableConcept")
    override val notDoneReasonCodeableConcept: CodeableConcept? = null,

    @SerialName("notDoneReasonReference")
    override val notDoneReasonReference: Reference? = null,

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
) : FhirMedicationDispense {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationDispense"
    }
}

/**
 * FhirMedicationDispensePerformer
 *
 * Indicates who or what performed the event. It should be assumed that the performer is the dispenser
 * of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationDispense">MedicationDispensePerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationDispense)
 */
interface FhirMedicationDispensePerformer : FhirBackboneElement {

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
 * MedicationDispensePerformer
 *
 * SourceFileName: MedicationDispense.kt
 *
 * Indicates who or what performed the event. It should be assumed that the performer is the dispenser
 * of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationDispense">MedicationDispensePerformer</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationDispense)
 */
@Serializable
@SerialName("MedicationDispensePerformer")
data class MedicationDispensePerformer(

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
) : FhirMedicationDispensePerformer {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationDispensePerformer"
    }
}

/**
 * FhirMedicationDispenseSubstitution
 *
 * Indicates whether or not substitution was made as part of the dispense. In some cases substitution
 * will be expected but does not happen, in other cases substitution is not expected but does happen.
 * This block explains what substitution did or did not happen and why. If nothing is specified,
 * substitution was not done.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationDispense">MedicationDispenseSubstitution</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationDispense)
 */
interface FhirMedicationDispenseSubstitution : FhirBackboneElement {

    /**
     * Whether a substitution was or was not performed on the dispense.
     */
    val wasSubstituted: Bool

    /**
     * Code signifying whether a different drug was dispensed from what was prescribed.
     */
    val type: CodeableConcept?

    /**
     * Why was substitution made.
     */
    val reason: List<CodeableConcept>?

    /**
     * Who is responsible for the substitution.
     */
    val responsibleParty: List<Reference>?
}

/**
 * MedicationDispenseSubstitution
 *
 * SourceFileName: MedicationDispense.kt
 *
 * Indicates whether or not substitution was made as part of the dispense. In some cases substitution
 * will be expected but does not happen, in other cases substitution is not expected but does happen.
 * This block explains what substitution did or did not happen and why. If nothing is specified,
 * substitution was not done.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationDispense">MedicationDispenseSubstitution</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationDispense)
 */
@Serializable
@SerialName("MedicationDispenseSubstitution")
data class MedicationDispenseSubstitution(

    @SerialName("wasSubstituted")
    override val wasSubstituted: Bool,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("reason")
    override val reason: List<CodeableConcept>? = null,

    @SerialName("responsibleParty")
    override val responsibleParty: List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationDispenseSubstitution {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationDispenseSubstitution"
    }
}
