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

import care.data4life.hl7.fhir.stu3.codesystem.RequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.RequestStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirReferralRequest
 *
 * Used to record and send details about a request for referral service or transfer of a patient to the
 * care of another provider or provider organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ReferralRequest">ReferralRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ReferralRequest)
 */
interface FhirReferralRequest : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Instantiates protocol or definition.
     */
    val definition: kotlin.collections.List<Reference>?

    /**
     * Request fulfilled by this request.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Request(s) replaced by this request.
     */
    val replaces: kotlin.collections.List<Reference>?

    /**
     * Composite request this is part of.
     */
    val groupIdentifier: Identifier?

    /**
     * The status of the authorization/intention reflected by the referral request
     * record.
     */
    val status: RequestStatus

    /**
     * Distinguishes the "level" of authorization/demand implicit in this request.
     */
    val intent: RequestIntent

    /**
     * Referral/Transition of care request type.
     */
    val type: CodeableConcept?

    /**
     * An indication of the urgency of referral (or where applicable the type of
     * transfer of care) request.
     */
    val priority: RequestPriority?

    /**
     * Actions requested as part of the referral.
     */
    val serviceRequested: kotlin.collections.List<CodeableConcept>?

    /**
     * Patient referred to care or transfer.
     */
    val subject: Reference

    /**
     * Originating encounter.
     */
    val context: Reference?

    /**
     * When the service(s) requested in the referral should occur.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When the service(s) requested in the referral should occur.
     */
    val occurrencePeriod: Period?

    /**
     * Date of creation/activation.
     */
    val authoredOn: DateTime?

    /**
     * Who/what is requesting service.
     */
    val requester: ReferralRequestRequester?

    /**
     * The clinical specialty (discipline) that the referral is requested for.
     */
    val specialty: CodeableConcept?

    /**
     * Receiver of referral / transfer of care request.
     */
    val recipient: kotlin.collections.List<Reference>?

    /**
     * Reason for referral / transfer of care request.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why is service needed?.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * A textual description of the referral.
     */
    val description: String?

    /**
     * Additonal information to support referral or transfer of care request.
     */
    val supportingInfo: kotlin.collections.List<Reference>?

    /**
     * Comments made about referral request.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Key events in history of request.
     */
    val relevantHistory: kotlin.collections.List<Reference>?
}

/**
 * ReferralRequest
 *
 * Used to record and send details about a request for referral service or transfer of a patient to the
 * care of another provider or provider organization.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ReferralRequest">ReferralRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ReferralRequest)
 */
@Serializable
@SerialName("ReferralRequest")
data class ReferralRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("definition")
    override val definition: kotlin.collections.List<Reference>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("replaces")
    override val replaces: kotlin.collections.List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("status")
    override val status: RequestStatus,

    @SerialName("intent")
    override val intent: RequestIntent,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("serviceRequested")
    override val serviceRequested: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("subject")
    override val subject: Reference,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("requester")
    override val requester: ReferralRequestRequester? = null,

    @SerialName("specialty")
    override val specialty: CodeableConcept? = null,

    @SerialName("recipient")
    override val recipient: kotlin.collections.List<Reference>? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("supportingInfo")
    override val supportingInfo: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("relevantHistory")
    override val relevantHistory: kotlin.collections.List<Reference>? = null,

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
) : FhirReferralRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ReferralRequest"
    }
}

/**
 * FhirReferralRequestRequester
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ReferralRequest">ReferralRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ReferralRequest)
 */
interface FhirReferralRequestRequester : FhirBackboneElement {

    /**
     * Individual making the request.
     */
    val agent: Reference

    /**
     * Organization agent is acting for.
     */
    val onBehalfOf: Reference?
}

/**
 * ReferralRequestRequester
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
) : FhirReferralRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ReferralRequestRequester"
    }
}
