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

import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.RequestStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCommunicationRequest
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible
 * provider, the CDS system proposes that the public health agency be notified about a reportable
 * condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CommunicationRequest">CommunicationRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CommunicationRequest)
 */
interface FhirCommunicationRequest : FhirDomainResource {

    /**
     * Unique identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Fulfills plan or proposal.
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
     * The status of the proposal or order.
     */
    val status: RequestStatus

    /**
     * Message category.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * Characterizes how quickly the proposed act must be initiated. Includes concepts
     * such as stat, urgent, routine.
     */
    val priority: RequestPriority?

    /**
     * A channel of communication.
     */
    val medium: kotlin.collections.List<CodeableConcept>?

    /**
     * Focus of message.
     */
    val subject: Reference?

    /**
     * Message recipient.
     */
    val recipient: kotlin.collections.List<Reference>?

    /**
     * Focal resources.
     */
    val topic: kotlin.collections.List<Reference>?

    /**
     * Encounter or episode leading to message.
     */
    val context: Reference?

    /**
     * Message payload.
     */
    val payload: kotlin.collections.List<CommunicationRequestPayload>?

    /**
     * When scheduled.
     */
    val occurrenceDateTime: DateTime?

    /**
     * When scheduled.
     */
    val occurrencePeriod: Period?

    /**
     * When request transitioned to being actionable.
     */
    val authoredOn: DateTime?

    /**
     * Message sender.
     */
    val sender: Reference?

    /**
     * Who/what is requesting service.
     */
    val requester: CommunicationRequestRequester?

    /**
     * Why is communication needed?.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why is communication needed?.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Comments made about communication request.
     */
    val note: kotlin.collections.List<Annotation>?
}

/**
 * CommunicationRequest
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible
 * provider, the CDS system proposes that the public health agency be notified about a reportable
 * condition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CommunicationRequest">CommunicationRequest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CommunicationRequest)
 */
@Serializable
@SerialName("CommunicationRequest")
data class CommunicationRequest(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("replaces")
    override val replaces: kotlin.collections.List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("status")
    override val status: RequestStatus,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("medium")
    override val medium: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("recipient")
    override val recipient: kotlin.collections.List<Reference>? = null,

    @SerialName("topic")
    override val topic: kotlin.collections.List<Reference>? = null,

    @SerialName("context")
    override val context: Reference? = null,

    @SerialName("payload")
    override val payload: kotlin.collections.List<CommunicationRequestPayload>? = null,

    @SerialName("occurrenceDateTime")
    override val occurrenceDateTime: DateTime? = null,

    @SerialName("occurrencePeriod")
    override val occurrencePeriod: Period? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("sender")
    override val sender: Reference? = null,

    @SerialName("requester")
    override val requester: CommunicationRequestRequester? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

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
) : FhirCommunicationRequest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CommunicationRequest"
    }
}

/**
 * FhirCommunicationRequestPayload
 *
 * Text, attachment(s), or resource(s) to be communicated to the recipient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CommunicationRequest">CommunicationRequestPayload</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CommunicationRequest)
 */
interface FhirCommunicationRequestPayload : FhirBackboneElement {

    /**
     * Message part content.
     */
    val contentString: String?

    /**
     * Message part content.
     */
    val contentAttachment: Attachment?

    /**
     * Message part content.
     */
    val contentReference: Reference?
}

/**
 * CommunicationRequestPayload
 *
 * Text, attachment(s), or resource(s) to be communicated to the recipient.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CommunicationRequest">CommunicationRequestPayload</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CommunicationRequest)
 */
@Serializable
@SerialName("CommunicationRequestPayload")
data class CommunicationRequestPayload(

    @SerialName("contentString")
    override val contentString: String? = null,

    @SerialName("contentAttachment")
    override val contentAttachment: Attachment? = null,

    @SerialName("contentReference")
    override val contentReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCommunicationRequestPayload {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CommunicationRequestPayload"
    }
}

/**
 * FhirCommunicationRequestRequester
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CommunicationRequest">CommunicationRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CommunicationRequest)
 */
interface FhirCommunicationRequestRequester : FhirBackboneElement {

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
 * CommunicationRequestRequester
 *
 * The individual who initiated the request and has responsibility for its activation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CommunicationRequest">CommunicationRequestRequester</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CommunicationRequest)
 */
@Serializable
@SerialName("CommunicationRequestRequester")
data class CommunicationRequestRequester(

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
) : FhirCommunicationRequestRequester {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CommunicationRequestRequester"
    }
}
