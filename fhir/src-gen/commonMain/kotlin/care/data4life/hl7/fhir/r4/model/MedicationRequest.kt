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

interface FhirMedicationRequest : FhirDomainResource {

    // External ids for this request.
    val identifier: List<Identifier>?

    // A code specifying the current state of the order.  Generally, this will be active or completed state.
    val status: MedicationrequestStatus

    // Reason for current status.
    val statusReason: CodeableConcept?

    // Whether the request is a proposal, plan, or an original order.
    val intent: MedicationRequestIntent

    // Type of medication usage.
    val category: List<CodeableConcept>?

    // Indicates how quickly the Medication Request should be addressed with respect to other requests.
    val priority: RequestPriority?

    // True if request is prohibiting action.
    val doNotPerform: Bool?

    // Reported rather than primary record.
    val reportedBoolean: Bool?

    // Reported rather than primary record.
    val reportedReference: Reference?

    // Medication to be taken.
    val medicationCodeableConcept: CodeableConcept?

    // Medication to be taken.
    val medicationReference: Reference?

    // Who or group medication request is for.
    val subject: Reference

    // Encounter created as part of encounter/admission/stay.
    val encounter: Reference?

    // Information to support ordering of the medication.
    val supportingInformation: List<Reference>?

    // When request was initially authored.
    val authoredOn: DateTime?

    // Who/What requested the Request.
    val requester: Reference?

    // Intended performer of administration.
    val performer: Reference?

    // Desired kind of performer of the medication administration.
    val performerType: CodeableConcept?

    // Person who entered the request.
    val recorder: Reference?

    // Reason or indication for ordering or not ordering the medication.
    val reasonCode: List<CodeableConcept>?

    // Condition or observation that supports why the prescription is being written.
    val reasonReference: List<Reference>?

    // Instantiates FHIR protocol or definition.
    val instantiatesCanonical: List<String>?

    // Instantiates external protocol or definition.
    val instantiatesUri: List<String>?

    // What request fulfills.
    val basedOn: List<Reference>?

    // Composite request this is part of.
    val groupIdentifier: Identifier?

    // Overall pattern of medication administration.
    val courseOfTherapyType: CodeableConcept?

    // Associated insurance coverage.
    val insurance: List<Reference>?

    // Information about the prescription.
    val note: List<Annotation>?

    // How the medication should be taken.
    val dosageInstruction: List<Dosage>?

    // Medication supply authorization.
    val dispenseRequest: MedicationRequestDispenseRequest?

    // Any restrictions on medication substitution.
    val substitution: MedicationRequestSubstitution?

    // An order/prescription that is being replaced.
    val priorPrescription: Reference?

    // Clinical Issue with action.
    val detectedIssue: List<Reference>?

    // A list of events of interest in the lifecycle.
    val eventHistory: List<Reference>?
}

/**
 * ClassName: MedicationRequest
 *
 * SourceFileName: MedicationRequest.kt
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

    // External ids for this request.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // A code specifying the current state of the order.  Generally, this will be active or completed state.
    @SerialName("status")
    override val status: MedicationrequestStatus,

    // Reason for current status.
    @SerialName("statusReason")
    override val statusReason: CodeableConcept? = null,

    // Whether the request is a proposal, plan, or an original order.
    @SerialName("intent")
    override val intent: MedicationRequestIntent,

    // Type of medication usage.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    // Indicates how quickly the Medication Request should be addressed with respect to other requests.
    @SerialName("priority")
    override val priority: RequestPriority? = null,

    // True if request is prohibiting action.
    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,

    // Reported rather than primary record.
    @SerialName("reportedBoolean")
    override val reportedBoolean: Bool? = null,

    // Reported rather than primary record.
    @SerialName("reportedReference")
    override val reportedReference: Reference? = null,

    // Medication to be taken.
    @SerialName("medicationCodeableConcept")
    override val medicationCodeableConcept: CodeableConcept? = null,

    // Medication to be taken.
    @SerialName("medicationReference")
    override val medicationReference: Reference? = null,

    // Who or group medication request is for.
    @SerialName("subject")
    override val subject: Reference,

    // Encounter created as part of encounter/admission/stay.
    @SerialName("encounter")
    override val encounter: Reference? = null,

    // Information to support ordering of the medication.
    @SerialName("supportingInformation")
    override val supportingInformation: List<Reference>? = null,

    // When request was initially authored.
    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    // Who/What requested the Request.
    @SerialName("requester")
    override val requester: Reference? = null,

    // Intended performer of administration.
    @SerialName("performer")
    override val performer: Reference? = null,

    // Desired kind of performer of the medication administration.
    @SerialName("performerType")
    override val performerType: CodeableConcept? = null,

    // Person who entered the request.
    @SerialName("recorder")
    override val recorder: Reference? = null,

    // Reason or indication for ordering or not ordering the medication.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    // Condition or observation that supports why the prescription is being written.
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    // Instantiates FHIR protocol or definition.
    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: List<String>? = null,

    // Instantiates external protocol or definition.
    @SerialName("instantiatesUri")
    override val instantiatesUri: List<String>? = null,

    // What request fulfills.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    // Composite request this is part of.
    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    // Overall pattern of medication administration.
    @SerialName("courseOfTherapyType")
    override val courseOfTherapyType: CodeableConcept? = null,

    // Associated insurance coverage.
    @SerialName("insurance")
    override val insurance: List<Reference>? = null,

    // Information about the prescription.
    @SerialName("note")
    override val note: List<Annotation>? = null,

    // How the medication should be taken.
    @SerialName("dosageInstruction")
    override val dosageInstruction: List<Dosage>? = null,

    // Medication supply authorization.
    @SerialName("dispenseRequest")
    override val dispenseRequest: MedicationRequestDispenseRequest? = null,

    // Any restrictions on medication substitution.
    @SerialName("substitution")
    override val substitution: MedicationRequestSubstitution? = null,

    // An order/prescription that is being replaced.
    @SerialName("priorPrescription")
    override val priorPrescription: Reference? = null,

    // Clinical Issue with action.
    @SerialName("detectedIssue")
    override val detectedIssue: List<Reference>? = null,

    // A list of events of interest in the lifecycle.
    @SerialName("eventHistory")
    override val eventHistory: List<Reference>? = null,

    // # DomainResource

    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,

    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,

    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,

    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,

    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    // Language of the resource content.
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

interface FhirMedicationRequestDispenseRequest : FhirBackboneElement {

    // First fill details.
    val initialFill: MedicationRequestDispenseRequestInitialFill?

    // Minimum period of time between dispenses.
    val dispenseInterval: Duration?

    // Time period supply is authorized for.
    val validityPeriod: Period?

    // Number of refills authorized.
    val numberOfRepeatsAllowed: UnsignedInteger?

    // Amount of medication to supply per dispense.
    val quantity: Quantity?

    // Number of days supply per dispense.
    val expectedSupplyDuration: Duration?

    // Intended dispenser.
    val performer: Reference?
}

/**
 * ClassName: MedicationRequestDispenseRequest
 *
 * SourceFileName: MedicationRequest.kt
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

    // First fill details.
    @SerialName("initialFill")
    override val initialFill: MedicationRequestDispenseRequestInitialFill? = null,

    // Minimum period of time between dispenses.
    @SerialName("dispenseInterval")
    override val dispenseInterval: Duration? = null,

    // Time period supply is authorized for.
    @SerialName("validityPeriod")
    override val validityPeriod: Period? = null,

    // Number of refills authorized.
    @SerialName("numberOfRepeatsAllowed")
    override val numberOfRepeatsAllowed: UnsignedInteger? = null,

    // Amount of medication to supply per dispense.
    @SerialName("quantity")
    override val quantity: Quantity? = null,

    // Number of days supply per dispense.
    @SerialName("expectedSupplyDuration")
    override val expectedSupplyDuration: Duration? = null,

    // Intended dispenser.
    @SerialName("performer")
    override val performer: Reference? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationRequestDispenseRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationRequestDispenseRequest"
    }
}

interface FhirMedicationRequestDispenseRequestInitialFill : FhirBackboneElement {

    // First fill quantity.
    val quantity: Quantity?

    // First fill duration.
    val duration: Duration?
}

/**
 * ClassName: MedicationRequestDispenseRequestInitialFill
 *
 * SourceFileName: MedicationRequest.kt
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

    // First fill quantity.
    @SerialName("quantity")
    override val quantity: Quantity? = null,

    // First fill duration.
    @SerialName("duration")
    override val duration: Duration? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationRequestDispenseRequestInitialFill {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationRequestDispenseRequestInitialFill"
    }
}

interface FhirMedicationRequestSubstitution : FhirBackboneElement {

    // Whether substitution is allowed or not.
    val allowedBoolean: Bool?

    // Whether substitution is allowed or not.
    val allowedCodeableConcept: CodeableConcept?

    // Why should (not) substitution be made.
    val reason: CodeableConcept?
}

/**
 * ClassName: MedicationRequestSubstitution
 *
 * SourceFileName: MedicationRequest.kt
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

    // Whether substitution is allowed or not.
    @SerialName("allowedBoolean")
    override val allowedBoolean: Bool? = null,

    // Whether substitution is allowed or not.
    @SerialName("allowedCodeableConcept")
    override val allowedCodeableConcept: CodeableConcept? = null,

    // Why should (not) substitution be made.
    @SerialName("reason")
    override val reason: CodeableConcept? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMedicationRequestSubstitution {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MedicationRequestSubstitution"
    }
}
