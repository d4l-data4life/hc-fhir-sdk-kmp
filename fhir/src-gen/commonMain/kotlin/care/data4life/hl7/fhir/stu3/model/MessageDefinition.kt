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

import care.data4life.hl7.fhir.stu3.codesystem.MessageSignificanceCategory
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMessageDefinition
 *
 * Defines the characteristics of a message that can be shared between systems, including the type of
 * event that initiates the message, the content to be transmitted and what response(s), if any, are
 * permitted.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageDefinition">MessageDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageDefinition)
 */
interface FhirMessageDefinition : FhirDomainResource {

    /**
     * Logical URI to reference this message definition (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the message definition.
     */
    val identifier: Identifier?

    /**
     * Business version of the message definition.
     */
    val version: String?

    /**
     * Name for this message definition (computer friendly).
     */
    val name: String?

    /**
     * Name for this message definition (human friendly).
     */
    val title: String?

    /**
     * The status of this message definition. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date this was last changed.
     */
    val date: DateTime

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Natural language description of the message definition.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for message definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this message definition is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Definition this one is based on.
     */
    val base: Reference?

    /**
     * Protocol/workflow this is part of.
     */
    val parent: kotlin.collections.List<Reference>?

    /**
     * Takes the place of.
     */
    val replaces: kotlin.collections.List<Reference>?

    /**
     * Event type.
     */
    val event: Coding

    /**
     * The impact of the content of the message.
     */
    val category: MessageSignificanceCategory?

    /**
     * Resource(s) that are the subject of the event.
     */
    val focus: kotlin.collections.List<MessageDefinitionFocus>?

    /**
     * Is a response required?.
     */
    val responseRequired: Bool?

    /**
     * Responses to this message.
     */
    val allowedResponse: kotlin.collections.List<MessageDefinitionAllowedResponse>?
}

/**
 * MessageDefinition
 *
 * Defines the characteristics of a message that can be shared between systems, including the type of
 * event that initiates the message, the content to be transmitted and what response(s), if any, are
 * permitted.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageDefinition">MessageDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageDefinition)
 */
@Serializable
@SerialName("MessageDefinition")
data class MessageDefinition(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("base")
    override val base: Reference? = null,

    @SerialName("parent")
    override val parent: kotlin.collections.List<Reference>? = null,

    @SerialName("replaces")
    override val replaces: kotlin.collections.List<Reference>? = null,

    @SerialName("event")
    override val event: Coding,

    @SerialName("category")
    override val category: MessageSignificanceCategory? = null,

    @SerialName("focus")
    override val focus: kotlin.collections.List<MessageDefinitionFocus>? = null,

    @SerialName("responseRequired")
    override val responseRequired: Bool? = null,

    @SerialName("allowedResponse")
    override val allowedResponse: kotlin.collections.List<MessageDefinitionAllowedResponse>? = null,

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
) : FhirMessageDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MessageDefinition"
    }
}

/**
 * FhirMessageDefinitionAllowedResponse
 *
 * Indicates what types of messages may be sent as an application-level response to this message.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageDefinition">MessageDefinitionAllowedResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageDefinition)
 */
interface FhirMessageDefinitionAllowedResponse : FhirBackboneElement {

    /**
     * Reference to allowed message definition response.
     */
    val message: Reference

    /**
     * When should this response be used.
     */
    val situation: String?
}

/**
 * MessageDefinitionAllowedResponse
 *
 * Indicates what types of messages may be sent as an application-level response to this message.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageDefinition">MessageDefinitionAllowedResponse</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageDefinition)
 */
@Serializable
@SerialName("MessageDefinitionAllowedResponse")
data class MessageDefinitionAllowedResponse(

    @SerialName("message")
    override val message: Reference,

    @SerialName("situation")
    override val situation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMessageDefinitionAllowedResponse {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MessageDefinitionAllowedResponse"
    }
}

/**
 * FhirMessageDefinitionFocus
 *
 * Identifies the resource (or resources) that are being addressed by the event. For example, the
 * Encounter for an admit message or two Account records for a merge.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageDefinition">MessageDefinitionFocus</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageDefinition)
 */
interface FhirMessageDefinitionFocus : FhirBackboneElement {

    /**
     * The kind of resource that must be the focus for this message.
     */
    val code: ResourceType

    /**
     * Profile that must be adhered to by focus.
     */
    val profile: Reference?

    /**
     * Minimum number of focuses of this type.
     */
    val min: UnsignedInteger?

    /**
     * Maximum number of focuses of this type.
     */
    val max: String?
}

/**
 * MessageDefinitionFocus
 *
 * Identifies the resource (or resources) that are being addressed by the event. For example, the
 * Encounter for an admit message or two Account records for a merge.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MessageDefinition">MessageDefinitionFocus</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/MessageDefinition)
 */
@Serializable
@SerialName("MessageDefinitionFocus")
data class MessageDefinitionFocus(

    @SerialName("code")
    override val code: ResourceType,

    @SerialName("profile")
    override val profile: Reference? = null,

    @SerialName("min")
    override val min: UnsignedInteger? = null,

    @SerialName("max")
    override val max: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMessageDefinitionFocus {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "MessageDefinitionFocus"
    }
}