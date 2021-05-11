/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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

import care.data4life.hl7.fhir.stu3.codesystem.RequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.RequestStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirReferralRequest : FhirDomainResource {

    // Business identifier.
    val identifier: List<Identifier>?

    // Instantiates protocol or definition.
    val definition: List<Reference>?

    // Request fulfilled by this request.
    val basedOn: List<Reference>?

    // Request(s) replaced by this request.
    val replaces: List<Reference>?

    // Composite request this is part of.
    val groupIdentifier: Identifier?

    // The status of the authorization/intention reflected by the referral request record.
    val status: RequestStatus

    // Distinguishes the "level" of authorization/demand implicit in this request.
    val intent: RequestIntent

    // Referral/Transition of care request type.
    val type: CodeableConcept?

    // An indication of the urgency of referral (or where applicable the type of transfer of care) request.
    val priority: RequestPriority?

    // Actions requested as part of the referral.
    val serviceRequested: List<CodeableConcept>?

    // Patient referred to care or transfer.
    val subject: Reference

    // Originating encounter.
    val context: Reference?

    // When the service(s) requested in the referral should occur.
    val occurrenceDateTime: DateTime?

    // When the service(s) requested in the referral should occur.
    val occurrencePeriod: Period?

    // Date of creation/activation.
    val authoredOn: DateTime?

    // Who/what is requesting service.
    val requester: ReferralRequestRequester?

    // The clinical specialty (discipline) that the referral is requested for.
    val specialty: CodeableConcept?

    // Receiver of referral / transfer of care request.
    val recipient: List<Reference>?

    // Reason for referral / transfer of care request.
    val reasonCode: List<CodeableConcept>?

    // Why is service needed?.
    val reasonReference: List<Reference>?

    // A textual description of the referral.
    val description: String?

    // Additonal information to support referral or transfer of care request.
    val supportingInfo: List<Reference>?

    // Comments made about referral request.
    val note: List<Annotation>?

    // Key events in history of request.
    val relevantHistory: List<Reference>?
}


/**
 * ClassName: ReferralRequest
 *
 * SourceFileName: ReferralRequest.kt
 *
 *
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ReferralRequest">ReferralRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ReferralRequest)
 */
@Serializable
@SerialName("ReferralRequest")
data class ReferralRequest(

    // Business identifier.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Instantiates protocol or definition.
    @SerialName("definition")
    override val definition: List<Reference>? = null,
    // Request fulfilled by this request.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,
    // Request(s) replaced by this request.
    @SerialName("replaces")
    override val replaces: List<Reference>? = null,
    // Composite request this is part of.
    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,
    // The status of the authorization/intention reflected by the referral request record.
    @SerialName("status")
    override val status: RequestStatus,
    // Distinguishes the "level" of authorization/demand implicit in this request.
    @SerialName("intent")
    override val intent: RequestIntent,
    // Referral/Transition of care request type.
    @SerialName("type")
    override val type: CodeableConcept? = null,
    // An indication of the urgency of referral (or where applicable the type of transfer of care) request.
    @SerialName("priority")
    override val priority: RequestPriority? = null,
    // Actions requested as part of the referral.
    @SerialName("serviceRequested")
    override val serviceRequested: List<CodeableConcept>? = null,
    // Patient referred to care or transfer.
    @SerialName("subject")
    override val subject: Reference,
    // Originating encounter.
    @SerialName("context")
    override val context: Reference? = null,
    // When the service(s) requested in the referral should occur.
    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,
    // When the service(s) requested in the referral should occur.
    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,
    // Date of creation/activation.
    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,
    // Who/what is requesting service.
    @SerialName("requester")
    override val requester: ReferralRequestRequester? = null,
    // The clinical specialty (discipline) that the referral is requested for.
    @SerialName("specialty")
    override val specialty: CodeableConcept? = null,
    // Receiver of referral / transfer of care request.
    @SerialName("recipient")
    override val recipient: List<Reference>? = null,
    // Reason for referral / transfer of care request.
    @SerialName("reasonCode")
    override val reasonCode: List<CodeableConcept>? = null,
    // Why is service needed?.
    @SerialName("reasonReference")
    override val reasonReference: List<Reference>? = null,
    // A textual description of the referral.
    @SerialName("description")
    override val description: String? = null,
    // Additonal information to support referral or transfer of care request.
    @SerialName("supportingInfo")
    override val supportingInfo: List<Reference>? = null,
    // Comments made about referral request.
    @SerialName("note")
    override val note: List<Annotation>? = null,
    // Key events in history of request.
    @SerialName("relevantHistory")
    override val relevantHistory: List<Reference>? = null,


    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional Content defined by implementations.
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
) : FhirReferralRequest {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ReferralRequest"
    }
}


interface FhirReferralRequestRequester : FhirBackboneElement {

    // Individual making the request.
    val agent: Reference

    // Organization agent is acting for.
    val onBehalfOf: Reference?
}


/**
 * ClassName: ReferralRequestRequester
 *
 * SourceFileName: ReferralRequest.kt
 *
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ReferralRequest">ReferralRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ReferralRequest)
 */
@Serializable
@SerialName("ReferralRequestRequester")
data class ReferralRequestRequester(

    // Individual making the request.
    @SerialName("agent")
    override val agent: Reference,
    // Organization agent is acting for.
    @SerialName("onBehalfOf")
    override val onBehalfOf: Reference? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirReferralRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ReferralRequestRequester"
    }
}

