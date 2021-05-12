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

interface FhirServiceRequest : FhirDomainResource {

    // Identifiers assigned to this order.
    val identifier: List<Identifier>?

    // Instantiates FHIR protocol or definition.
    val instantiatesCanonical: List<String>?

    // Instantiates external protocol or definition.
    val instantiatesUri: List<String>?

    // What request fulfills.
    val basedOn: List<Reference>?

    // What request replaces.
    val replaces: List<Reference>?

    // Composite Request ID.
    val requisition: Identifier?

    // The status of the order.
    val status: RequestStatus

    // Whether the request is a proposal, plan, an original order or a reflex order.
    val intent: RequestIntent

    // Classification of service.
    val category: List<CodeableConcept>?

    // Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
    val priority: RequestPriority?

    // True if service/procedure should not be performed.
    val doNotPerform: Bool?

    // What is being requested/ordered.
    val code: CodeableConcept?

    // Additional order information.
    val orderDetail: List<CodeableConcept>?

    // Service amount.
    val quantityQuantity: Quantity?

    // Service amount.
    val quantityRatio: Ratio?

    // Service amount.
    val quantityRange: Range?

    // Individual or Entity the service is ordered for.
    val subject: Reference

    // Encounter in which the request was created.
    val encounter: Reference?

    // When service should occur.
    val occurrenceDateTime: DateTime?

    // When service should occur.
    val occurrencePeriod: Period?

    // When service should occur.
    val occurrenceTiming: Timing?

    // Preconditions for service.
    val asNeededBoolean: Bool?

    // Preconditions for service.
    val asNeededCodeableConcept: CodeableConcept?

    // Date request signed.
    val authoredOn: DateTime?

    // Who/what is requesting service.
    val requester: Reference?

    // Performer role.
    val performerType: CodeableConcept?

    // Requested performer.
    val performer: List<Reference>?

    // Requested location.
    val locationCode: List<CodeableConcept>?

    // Requested location.
    val locationReference: List<Reference>?

    // Explanation/Justification for procedure or service.
    val reasonCode: List<CodeableConcept>?

    // Explanation/Justification for service or service.
    val reasonReference: List<Reference>?

    // Associated insurance coverage.
    val insurance: List<Reference>?

    // Additional clinical information.
    val supportingInfo: List<Reference>?

    // Procedure Samples.
    val specimen: List<Reference>?

    // Location on Body.
    val bodySite: List<CodeableConcept>?

    // Comments.
    val note: List<Annotation>?

    // Patient or consumer-oriented instructions.
    val patientInstruction: String?

    // Request provenance.
    val relevantHistory: List<Reference>?
}

/**
 * ClassName: ServiceRequest
 *
 * SourceFileName: ServiceRequest.kt
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

    // Identifiers assigned to this order.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // Instantiates FHIR protocol or definition.
    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: List<String>? = null,

    // Instantiates external protocol or definition.
    @SerialName("instantiatesUri")
    override val instantiatesUri: List<String>? = null,

    // What request fulfills.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    // What request replaces.
    @SerialName("replaces")
    override val replaces: List<Reference>? = null,

    // Composite Request ID.
    @SerialName("requisition")
    override val requisition: Identifier? = null,

    // The status of the order.
    @SerialName("status")
    override val status: RequestStatus,

    // Whether the request is a proposal, plan, an original order or a reflex order.
    @SerialName("intent")
    override val intent: RequestIntent,

    // Classification of service.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    // Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
    @SerialName("priority")
    override val priority: RequestPriority? = null,

    // True if service/procedure should not be performed.
    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,

    // What is being requested/ordered.
    @SerialName("code")
    override val code: CodeableConcept? = null,

    // Additional order information.
    @SerialName("orderDetail")
    override val orderDetail: List<CodeableConcept>? = null,

    // Service amount.
    @SerialName("quantityQuantity")
    override val quantityQuantity: Quantity? = null,

    // Service amount.
    @SerialName("quantityRatio")
    override val quantityRatio: Ratio? = null,

    // Service amount.
    @SerialName("quantityRange")
    override val quantityRange: Range? = null,

    // Individual or Entity the service is ordered for.
    @SerialName("subject")
    override val subject: Reference,

    // Encounter in which the request was created.
    @SerialName("encounter")
    override val encounter: Reference? = null,

    // When service should occur.
    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    // When service should occur.
    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    // When service should occur.
    @SerialName("occurrenceTiming")
    override val occurrenceTiming: Timing? = null,

    // Preconditions for service.
    @SerialName("asNeededBoolean")
    override val asNeededBoolean: Bool? = null,

    // Preconditions for service.
    @SerialName("asNeededCodeableConcept")
    override val asNeededCodeableConcept: CodeableConcept? = null,

    // Date request signed.
    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    // Who/what is requesting service.
    @SerialName("requester")
    override val requester: Reference? = null,

    // Performer role.
    @SerialName("performerType")
    override val performerType: CodeableConcept? = null,

    // Requested performer.
    @SerialName("performer")
    override val performer: List<Reference>? = null,

    // Requested location.
    @SerialName("locationCode")
    override val locationCode: List<CodeableConcept>? = null,

    // Requested location.
    @SerialName("locationReference")
    override val locationReference: List<Reference>? = null,

    // Explanation/Justification for procedure or service.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,

    // Explanation/Justification for service or service.
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,

    // Associated insurance coverage.
    @SerialName("insurance")
    override val insurance: List<Reference>? = null,

    // Additional clinical information.
    @SerialName("supportingInfo")
    override val supportingInfo: List<Reference>? = null,

    // Procedure Samples.
    @SerialName("specimen")
    override val specimen: List<Reference>? = null,

    // Location on Body.
    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,

    // Comments.
    @SerialName("note")
    override val note: List<Annotation>? = null,

    // Patient or consumer-oriented instructions.
    @SerialName("patientInstruction")
    override val patientInstruction: String? = null,

    // Request provenance.
    @SerialName("relevantHistory")
    override val relevantHistory: List<Reference>? = null,

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
) : FhirServiceRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ServiceRequest"
    }
}
