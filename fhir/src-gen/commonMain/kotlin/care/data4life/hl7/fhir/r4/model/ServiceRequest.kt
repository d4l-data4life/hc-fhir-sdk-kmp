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

import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirServiceRequest
 *
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be
 * performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ServiceRequest">ServiceRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ServiceRequest)
 */
interface FhirServiceRequest : FhirDomainResource {

    /**
     * Identifiers assigned to this order.
     */
    val identifier: List<Identifier>?

    /**
     * Instantiates FHIR protocol or definition.
     */
    val instantiatesCanonical: List<String>?

    /**
     * Instantiates external protocol or definition.
     */
    val instantiatesUri: List<String>?

    /**
     * What request fulfills.
     */
    val basedOn: List<Reference>?

    /**
     * What request replaces.
     */
    val replaces: List<Reference>?

    /**
     * Composite Request ID.
     */
    val requisition: Identifier?

    /**
     * The status of the order.
     */
    val status: RequestStatus

    /**
     * Whether the request is a proposal, plan, an original order or a reflex order.
     */
    val intent: RequestIntent

    /**
     * Classification of service.
     */
    val category: List<CodeableConcept>?

    /**
     * Indicates how quickly the ServiceRequest should be addressed with respect to
     * other requests.
     */
    val priority: RequestPriority?

    /**
     * True if service/procedure should not be performed.
     */
    val doNotPerform: Bool?

    /**
     * What is being requested/ordered.
     */
    val code: CodeableConcept?

    /**
     * Additional order information.
     */
    val orderDetail: List<CodeableConcept>?

    /**
     * Service amount.
     */
    val quantityQuantity: Quantity?

    /**
     * Service amount.
     */
    val quantityRatio: Ratio?

    /**
     * Service amount.
     */
    val quantityRange: Range?

    /**
     * Individual or Entity the service is ordered for.
     */
    val subject: Reference

    /**
     * Encounter in which the request was created.
     */
    val encounter: Reference?

    /**
     * When service should occur.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When service should occur.
     */
    val occurrencePeriod: Period?

    /**
     * When service should occur.
     */
    val occurrenceTiming: Timing?

    /**
     * Preconditions for service.
     */
    val asNeededBoolean: Bool?

    /**
     * Preconditions for service.
     */
    val asNeededCodeableConcept: CodeableConcept?

    /**
     * Date request signed.
     */
    val authoredOn: DateTime?

    /**
     * Who/what is requesting service.
     */
    val requester: Reference?

    /**
     * Performer role.
     */
    val performerType: CodeableConcept?

    /**
     * Requested performer.
     */
    val performer: List<Reference>?

    /**
     * Requested location.
     */
    val locationCode: List<CodeableConcept>?

    /**
     * Requested location.
     */
    val locationReference: List<Reference>?

    /**
     * Explanation/Justification for procedure or service.
     */
    val reasonCode: List<CodeableConcept>?

    /**
     * Explanation/Justification for service or service.
     */
    val reasonReference: List<Reference>?

    /**
     * Associated insurance coverage.
     */
    val insurance: List<Reference>?

    /**
     * Additional clinical information.
     */
    val supportingInfo: List<Reference>?

    /**
     * Procedure Samples.
     */
    val specimen: List<Reference>?

    /**
     * Location on Body.
     */
    val bodySite: List<CodeableConcept>?

    /**
     * Comments.
     */
    val note: List<Annotation>?

    /**
     * Patient or consumer-oriented instructions.
     */
    val patientInstruction: String?

    /**
     * Request provenance.
     */
    val relevantHistory: List<Reference>?
}

/**
 * ServiceRequest
 *
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be
 * performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ServiceRequest">ServiceRequest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ServiceRequest)
 */
@Serializable
@SerialName("ServiceRequest")
data class ServiceRequest(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: List<String>? = null,

    @SerialName("instantiatesUri")
    override val instantiatesUri: List<String>? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("replaces")
    override val replaces: List<Reference>? = null,

    @SerialName("requisition")
    override val requisition: Identifier? = null,

    @SerialName("status")
    override val status: RequestStatus,

    @SerialName("intent")
    override val intent: RequestIntent,

    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("orderDetail")
    override val orderDetail: List<CodeableConcept>? = null,

    @SerialName("quantityQuantity")
    override val quantityQuantity: Quantity? = null,

    @SerialName("quantityRatio")
    override val quantityRatio: Ratio? = null,

    @SerialName("quantityRange")
    override val quantityRange: Range? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    @SerialName("asNeededBoolean")
    override val asNeededBoolean: Bool? = null,

    @SerialName("asNeededCodeableConcept")
    override val asNeededCodeableConcept: CodeableConcept? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: Reference? = null,

    @SerialName("performerType")
    override val performerType: CodeableConcept? = null,

    @SerialName("performer")
    override val performer: List<Reference>? = null,

    @SerialName("locationCode")
    override val locationCode: List<CodeableConcept>? = null,

    @SerialName("locationReference")
    override val locationReference: List<Reference>? = null,

    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    @SerialName("insurance")
    override val insurance: List<Reference>? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: List<Reference>? = null,

    @SerialName("specimen")
    override val specimen: List<Reference>? = null,

    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("patientInstruction")
    override val patientInstruction: String? = null,

    @SerialName("relevantHistory")
    override val relevantHistory: List<Reference>? = null,

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
) : FhirServiceRequest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ServiceRequest"
    }
}
