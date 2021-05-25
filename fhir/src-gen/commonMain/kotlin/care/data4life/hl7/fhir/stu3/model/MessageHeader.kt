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

import care.data4life.hl7.fhir.stu3.codesystem.ResponseType
import care.data4life.hl7.fhir.stu3.primitive.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMessageHeader
 *
 * The header for a message exchange that is either requesting or responding to an action. The
 * reference(s) that are the subject of the action as well as other information related to the action
 * are typically transmitted in a bundle in which the MessageHeader resource instance is the first
 * resource in the bundle.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeader</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
interface FhirMessageHeader : FhirDomainResource {

    /**
     * Code for the event this message represents.
     */
    val event: Coding

    /**
     * Message destination application(s).
     */
    val destination: kotlin.collections.List<MessageHeaderDestination>?

    /**
     * Intended "real-world" recipient for the data.
     */
    val receiver: Reference?

    /**
     * Real world sender of the message.
     */
    val sender: Reference?

    /**
     * Time that the message was sent.
     */
    val timestamp: Instant

    /**
     * The source of the data entry.
     */
    val enterer: Reference?

    /**
     * The source of the decision.
     */
    val author: Reference?

    /**
     * Message source application.
     */
    val source: MessageHeaderSource

    /**
     * Final responsibility for event.
     */
    val responsible: Reference?

    /**
     * Cause of event.
     */
    val reason: CodeableConcept?

    /**
     * If this is a reply to prior message.
     */
    val response: MessageHeaderResponse?

    /**
     * The actual content of the message.
     */
    val focus: kotlin.collections.List<Reference>?
}

/**
 * MessageHeader
 *
 * The header for a message exchange that is either requesting or responding to an action. The
 * reference(s) that are the subject of the action as well as other information related to the action
 * are typically transmitted in a bundle in which the MessageHeader resource instance is the first
 * resource in the bundle.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeader</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
@Serializable
@SerialName("MessageHeader")
data class MessageHeader(

    @SerialName("event")
    override val event: Coding,

    @SerialName("destination")
    override val destination: kotlin.collections.List<MessageHeaderDestination>? = null,

    @SerialName("receiver")
    override val receiver: Reference? = null,

    @SerialName("sender")
    override val sender: Reference? = null,

    @SerialName("timestamp")
    override val timestamp: Instant,

    @SerialName("enterer")
    override val enterer: Reference? = null,

    @SerialName("author")
    override val author: Reference? = null,

    @SerialName("source")
    override val source: MessageHeaderSource,

    @SerialName("responsible")
    override val responsible: Reference? = null,

    @SerialName("reason")
    override val reason: CodeableConcept? = null,

    @SerialName("response")
    override val response: MessageHeaderResponse? = null,

    @SerialName("focus")
    override val focus: kotlin.collections.List<Reference>? = null,

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
) : FhirMessageHeader {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MessageHeader"
    }
}

/**
 * FhirMessageHeaderDestination
 *
 * The destination application which the message is intended for.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeaderDestination</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
interface FhirMessageHeaderDestination : FhirBackboneElement {

    /**
     * Name of system.
     */
    val name: String?

    /**
     * Particular delivery destination within the destination.
     */
    val target: Reference?

    /**
     * Actual destination address or id.
     */
    val endpoint: String
}

/**
 * MessageHeaderDestination
 *
 * The destination application which the message is intended for.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeaderDestination</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
@Serializable
@SerialName("MessageHeaderDestination")
data class MessageHeaderDestination(

    @SerialName("name")
    override val name: String? = null,

    @SerialName("target")
    override val target: Reference? = null,

    @SerialName("endpoint")
    override val endpoint: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMessageHeaderDestination {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MessageHeaderDestination"
    }
}

/**
 * FhirMessageHeaderResponse
 *
 * Information about the message that this message is a response to. Only present if this message is a
 * response.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeaderResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
interface FhirMessageHeaderResponse : FhirBackboneElement {

    /**
     * Id of original message.
     */
    val identifier: String

    /**
     * Code that identifies the type of response to the message - whether it was
     * successful or not, and whether it should be resent or not.
     */
    val code: ResponseType

    /**
     * Specific list of hints/warnings/errors.
     */
    val details: Reference?
}

/**
 * MessageHeaderResponse
 *
 * Information about the message that this message is a response to. Only present if this message is a
 * response.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeaderResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
@Serializable
@SerialName("MessageHeaderResponse")
data class MessageHeaderResponse(

    @SerialName("identifier")
    override val identifier: String,

    @SerialName("code")
    override val code: ResponseType,

    @SerialName("details")
    override val details: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMessageHeaderResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MessageHeaderResponse"
    }
}

/**
 * FhirMessageHeaderSource
 *
 * The source application from which this message originated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeaderSource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
interface FhirMessageHeaderSource : FhirBackboneElement {

    /**
     * Name of system.
     */
    val name: String?

    /**
     * Name of software running the system.
     */
    val software: String?

    /**
     * Version of software running.
     */
    val version: String?

    /**
     * Human contact for problems.
     */
    val contact: ContactPoint?

    /**
     * Actual message source address or id.
     */
    val endpoint: String
}

/**
 * MessageHeaderSource
 *
 * The source application from which this message originated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageHeader">MessageHeaderSource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageHeader)
 */
@Serializable
@SerialName("MessageHeaderSource")
data class MessageHeaderSource(

    @SerialName("name")
    override val name: String? = null,

    @SerialName("software")
    override val software: String? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("contact")
    override val contact: ContactPoint? = null,

    @SerialName("endpoint")
    override val endpoint: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMessageHeaderSource {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MessageHeaderSource"
    }
}
