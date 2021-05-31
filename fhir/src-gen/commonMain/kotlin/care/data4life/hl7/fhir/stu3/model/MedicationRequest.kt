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

import care.data4life.hl7.fhir.stu3.codesystem.MedicationRequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.MedicationRequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.MedicationRequestStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequest : FhirDomainResource {

    /**
     * External ids for this request.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Protocol or definition.
     */
    val definition: kotlin.collections.List<Reference>?

    /**
     * What request fulfills.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Composite request this is part of.
     */
    val groupIdentifier: Identifier?

    /**
     * A code specifying the current state of the order. Generally this will be active
     * or completed state.
     */
    val status: MedicationRequestStatus?

    /**
     * Whether the request is a proposal, plan, or an original order.
     */
    val intent: MedicationRequestIntent

    /**
     * Type of medication usage.
     */
    val category: CodeableConcept?

    /**
     * Indicates how quickly the Medication Request should be addressed with respect to
     * other requests.
     */
    val priority: MedicationRequestPriority?

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
     * Created during encounter/admission/stay.
     */
    val context: Reference?

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
    val requester: MedicationRequestRequester?

    /**
     * Person who entered the request.
     */
    val recorder: Reference?

    /**
     * Reason or indication for writing the prescription.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Condition or Observation that supports why the prescription is being written.
     */
    val reasonReference: kotlin.collections.List<Reference>?

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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequest")
data class MedicationRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("definition")
    override val definition: kotlin.collections.List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("status")
    override val status: MedicationRequestStatus? = null,

    @SerialName("intent")
    override val intent: MedicationRequestIntent,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("priority")
    override val priority: MedicationRequestPriority? = null,

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

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: MedicationRequestRequester? = null,

    @SerialName("recorder")
    override val recorder: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationRequest"
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequestDispenseRequest : FhirBackboneElement {

    /**
     * Time period supply is authorized for.
     */
    val validityPeriod: Period?

    /**
     * Number of refills authorized.
     */
    val numberOfRepeatsAllowed: PositiveInteger?

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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequestDispenseRequest")
data class MedicationRequestDispenseRequest(

    @SerialName("validityPeriod")
    override val validityPeriod: Period? = null,

    @SerialName("numberOfRepeatsAllowed")
    override val numberOfRepeatsAllowed: PositiveInteger? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationRequestDispenseRequest"
    }
}

/**
 * FhirMedicationRequestRequester
 *
 * The individual, organization or device that initiated the request and has responsibility for its
 * activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequestRequester : FhirBackboneElement {

    /**
     * Who ordered the initial medication(s).
     */
    val agent: Reference

    /**
     * Organization agent is acting for.
     */
    val onBehalfOf: Reference?
}

/**
 * MedicationRequestRequester
 *
 * The individual, organization or device that initiated the request and has responsibility for its
 * activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequestRequester")
data class MedicationRequestRequester(

    @SerialName("agent")
    override val agent: Reference,

    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicationRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationRequestRequester"
    }
}

/**
 * FhirMedicationRequestSubstitution
 *
 * Indicates whether or not substitution can or should be part of the dispense. In some cases
 * substitution must happen, in other cases substitution must not happen. This block explains the
 * prescriber's intent. If nothing is specified substitution may be done.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestSubstitution</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
interface FhirMedicationRequestSubstitution : FhirBackboneElement {

    /**
     * Whether substitution is allowed or not.
     */
    val allowed: Bool

    /**
     * Why should (not) substitution be made.
     */
    val reason: CodeableConcept?
}

/**
 * MedicationRequestSubstitution
 *
 * Indicates whether or not substitution can or should be part of the dispense. In some cases
 * substitution must happen, in other cases substitution must not happen. This block explains the
 * prescriber's intent. If nothing is specified substitution may be done.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicationRequest">MedicationRequestSubstitution</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MedicationRequest)
 */
@Serializable
@SerialName("MedicationRequestSubstitution")
data class MedicationRequestSubstitution(

    @SerialName("allowed")
    override val allowed: Bool,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationRequestSubstitution"
    }
}
