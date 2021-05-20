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

import care.data4life.hl7.fhir.r4.codesystem.MedicationRequestIntent
import care.data4life.hl7.fhir.r4.codesystem.MedicationrequestStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedicationRequest
 *
 * An order or request for both supply of the medication and the instructions for administration of the
 * medication to a patient. The resource is called "MedicationRequest" rather than
 * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient
 * settings, including care plans, etc., and to harmonize with workflow patterns.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequest : FhirDomainResource {

    /**
     * External ids for this request.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * A code specifying the current state of the order. Generally, this will be active
     * or completed state.
     */
    val status: MedicationrequestStatus

    /**
     * Reason for current status.
     */
    val statusReason: CodeableConcept?

    /**
     * Whether the request is a proposal, plan, or an original order.
     */
    val intent: MedicationRequestIntent

    /**
     * Type of medication usage.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Indicates how quickly the Medication Request should be addressed with respect to
     * other requests.
     */
    val priority: RequestPriority?

    /**
     * True if request is prohibiting action.
     */
    val doNotPerform: Bool?

    /**
     * Reported rather than primary record.
     */
    val reportedBoolean: Bool?

    /**
     * Reported rather than primary record.
     */
    val reportedReference: Reference?

    /**
     * Medication to be taken.
     */
    val medicationCodeableConcept: CodeableConcept?

    /**
     * Medication to be taken.
     */
    val medicationReference: Reference?

    /**
     * Who or group medication request is for.
     */
    val subject: Reference

    /**
     * Encounter created as part of encounter/admission/stay.
     */
    val encounter: Reference?

    /**
     * Information to support ordering of the medication.
     */
    val supportingInformation: kotlin.collections.List<Reference>?

    /**
     * When request was initially authored.
     */
    val authoredOn: DateTime?

    /**
     * Who/What requested the Request.
     */
    val requester: Reference?

    /**
     * Intended performer of administration.
     */
    val performer: Reference?

    /**
     * Desired kind of performer of the medication administration.
     */
    val performerType: CodeableConcept?

    /**
     * Person who entered the request.
     */
    val recorder: Reference?

    /**
     * Reason or indication for ordering or not ordering the medication.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Condition or observation that supports why the prescription is being written.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Instantiates FHIR protocol or definition.
     */
    val instantiatesCanonical: kotlin.collections.List<String>?

    /**
     * Instantiates external protocol or definition.
     */
    val instantiatesUri: kotlin.collections.List<String>?

    /**
     * What request fulfills.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Composite request this is part of.
     */
    val groupIdentifier: Identifier?

    /**
     * Overall pattern of medication administration.
     */
    val courseOfTherapyType: CodeableConcept?

    /**
     * Associated insurance coverage.
     */
    val insurance: kotlin.collections.List<Reference>?

    /**
     * Information about the prescription.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * How the medication should be taken.
     */
    val dosageInstruction: kotlin.collections.List<Dosage>?

    /**
     * Medication supply authorization.
     */
    val dispenseRequest: MedicationRequestDispenseRequest?

    /**
     * Any restrictions on medication substitution.
     */
    val substitution: MedicationRequestSubstitution?

    /**
     * An order/prescription that is being replaced.
     */
    val priorPrescription: Reference?

    /**
     * Clinical Issue with action.
     */
    val detectedIssue: kotlin.collections.List<Reference>?

    /**
     * A list of events of interest in the lifecycle.
     */
    val eventHistory: kotlin.collections.List<Reference>?
}

/**
 * MedicationRequest
 *
 * An order or request for both supply of the medication and the instructions for administration of the
 * medication to a patient. The resource is called "MedicationRequest" rather than
 * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient
 * settings, including care plans, etc., and to harmonize with workflow patterns.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequest")
data class MedicationRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: MedicationrequestStatus,

    @SerialName("statusReason")
    override val statusReason: CodeableConcept? = null,

    @SerialName("intent")
    override val intent: MedicationRequestIntent,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,

    @SerialName("reportedBoolean")
    override val reportedBoolean: Bool? = null,

    @SerialName("reportedReference")
    override val reportedReference: Reference? = null,

    @SerialName("medicationCodeableConcept")
    override val medicationCodeableConcept: CodeableConcept? = null,

    @SerialName("medicationReference")
    override val medicationReference: Reference? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("supportingInformation")
    override val supportingInformation: kotlin.collections.List<Reference>? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: Reference? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    @SerialName("performerType")
    override val performerType: CodeableConcept? = null,

    @SerialName("recorder")
    override val recorder: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: kotlin.collections.List<String>? = null,

    @SerialName("instantiatesUri")
    override val instantiatesUri: kotlin.collections.List<String>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("courseOfTherapyType")
    override val courseOfTherapyType: CodeableConcept? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("dosageInstruction")
    override val dosageInstruction: kotlin.collections.List<Dosage>? = null,

    @SerialName("dispenseRequest")
    override val dispenseRequest: MedicationRequestDispenseRequest? = null,

    @SerialName("substitution")
    override val substitution: MedicationRequestSubstitution? = null,

    @SerialName("priorPrescription")
    override val priorPrescription: Reference? = null,

    @SerialName("detectedIssue")
    override val detectedIssue: kotlin.collections.List<Reference>? = null,

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
) : FhirMedicationRequest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationRequest"
    }
}

/**
 * FhirMedicationRequestDispenseRequest
 *
 * Indicates the specific details for the dispense or medication supply part of a medication request
 * (also known as a Medication Prescription or Medication Order). Note that this information is not
 * always sent with the order. There may be in some settings (e.g. hospitals) institutional or system
 * support for completing the dispense details in the pharmacy department.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestDispenseRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequestDispenseRequest : FhirBackboneElement {

    /**
     * First fill details.
     */
    val initialFill: MedicationRequestDispenseRequestInitialFill?

    /**
     * Minimum period of time between dispenses.
     */
    val dispenseInterval: Duration?

    /**
     * Time period supply is authorized for.
     */
    val validityPeriod: Period?

    /**
     * Number of refills authorized.
     */
    val numberOfRepeatsAllowed: UnsignedInteger?

    /**
     * Amount of medication to supply per dispense.
     */
    val quantity: Quantity?

    /**
     * Number of days supply per dispense.
     */
    val expectedSupplyDuration: Duration?

    /**
     * Intended dispenser.
     */
    val performer: Reference?
}

/**
 * MedicationRequestDispenseRequest
 *
 * Indicates the specific details for the dispense or medication supply part of a medication request
 * (also known as a Medication Prescription or Medication Order). Note that this information is not
 * always sent with the order. There may be in some settings (e.g. hospitals) institutional or system
 * support for completing the dispense details in the pharmacy department.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestDispenseRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequestDispenseRequest")
data class MedicationRequestDispenseRequest(

    @SerialName("initialFill")
    override val initialFill: MedicationRequestDispenseRequestInitialFill? = null,

    @SerialName("dispenseInterval")
    override val dispenseInterval: Duration? = null,

    @SerialName("validityPeriod")
    override val validityPeriod: Period? = null,

    @SerialName("numberOfRepeatsAllowed")
    override val numberOfRepeatsAllowed: UnsignedInteger? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("expectedSupplyDuration")
    override val expectedSupplyDuration: Duration? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationRequestDispenseRequest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationRequestDispenseRequest"
    }
}

/**
 * FhirMedicationRequestDispenseRequestInitialFill
 *
 * Indicates the quantity or duration for the first dispense of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestDispenseRequestInitialFill</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequestDispenseRequestInitialFill : FhirBackboneElement {

    /**
     * First fill quantity.
     */
    val quantity: Quantity?

    /**
     * First fill duration.
     */
    val duration: Duration?
}

/**
 * MedicationRequestDispenseRequestInitialFill
 *
 * Indicates the quantity or duration for the first dispense of the medication.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestDispenseRequestInitialFill</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequestDispenseRequestInitialFill")
data class MedicationRequestDispenseRequestInitialFill(

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("duration")
    override val duration: Duration? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationRequestDispenseRequestInitialFill {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationRequestDispenseRequestInitialFill"
    }
}

/**
 * FhirMedicationRequestSubstitution
 *
 * Indicates whether or not substitution can or should be part of the dispense. In some cases,
 * substitution must happen, in other cases substitution must not happen. This block explains the
 * prescriber's intent. If nothing is specified substitution may be done.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestSubstitution</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequestSubstitution : FhirBackboneElement {

    /**
     * Whether substitution is allowed or not.
     */
    val allowedBoolean: Bool?

    /**
     * Whether substitution is allowed or not.
     */
    val allowedCodeableConcept: CodeableConcept?

    /**
     * Why should (not) substitution be made.
     */
    val reason: CodeableConcept?
}

/**
 * MedicationRequestSubstitution
 *
 * Indicates whether or not substitution can or should be part of the dispense. In some cases,
 * substitution must happen, in other cases substitution must not happen. This block explains the
 * prescriber's intent. If nothing is specified substitution may be done.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestSubstitution</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequestSubstitution")
data class MedicationRequestSubstitution(

    @SerialName("allowedBoolean")
    override val allowedBoolean: Bool? = null,

    @SerialName("allowedCodeableConcept")
    override val allowedCodeableConcept: CodeableConcept? = null,

    @SerialName("reason")
    override val reason: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationRequestSubstitution {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicationRequestSubstitution"
    }
}
