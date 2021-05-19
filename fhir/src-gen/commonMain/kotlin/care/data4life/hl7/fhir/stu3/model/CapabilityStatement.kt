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

import care.data4life.hl7.fhir.stu3.codesystem.CapabilityStatementKind
import care.data4life.hl7.fhir.stu3.codesystem.ConditionalDeleteStatus
import care.data4life.hl7.fhir.stu3.codesystem.ConditionalReadStatus
import care.data4life.hl7.fhir.stu3.codesystem.DocumentMode
import care.data4life.hl7.fhir.stu3.codesystem.EventCapabilityMode
import care.data4life.hl7.fhir.stu3.codesystem.FHIRRestfulInteractions
import care.data4life.hl7.fhir.stu3.codesystem.MessageSignificanceCategory
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ReferenceHandlingPolicy
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.codesystem.ResourceVersionPolicy
import care.data4life.hl7.fhir.stu3.codesystem.RestfulCapabilityMode
import care.data4life.hl7.fhir.stu3.codesystem.SearchParamType
import care.data4life.hl7.fhir.stu3.codesystem.UnknownContentCode
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirCapabilityStatement
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used
 * as a statement of actual server functionality or a statement of required or desired server
 * implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatement : FhirDomainResource {

    /**
     * Logical URI to reference this capability statement (globally unique).
     */
    val url: String?

    /**
     * Business version of the capability statement.
     */
    val version: String?

    /**
     * Name for this capability statement (computer friendly).
     */
    val name: String?

    /**
     * Name for this capability statement (human friendly).
     */
    val title: String?

    /**
     * The status of this capability statement. Enables tracking the life-cycle of the
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
    val contact: List<ContactDetail>?

    /**
     * Natural language description of the capability statement.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: List<UsageContext>?

    /**
     * Intended jurisdiction for capability statement (if applicable).
     */
    val jurisdiction: List<CodeableConcept>?

    /**
     * Why this capability statement is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * The way that this statement is intended to be used, to describe an actual
     * running instance of software, a particular product (kind not instance of
     * software) or a class of implementation (e.g. a desired purchase).
     */
    val kind: CapabilityStatementKind

    /**
     * Canonical URL of another capability statement this implements.
     */
    val instantiates: List<String>?

    /**
     * Software that is covered by this capability statement.
     */
    val software: CapabilityStatementSoftware?

    /**
     * If this describes a specific instance.
     */
    val implementation: CapabilityStatementImplementation?

    /**
     * FHIR Version the system uses.
     */
    val fhirVersion: String

    /**
     * A code that indicates whether the application accepts unknown elements or
     * extensions when reading resources.
     */
    val acceptUnknown: UnknownContentCode

    /**
     * formats supported (xml | json | ttl | mime type).
     */
    val format: List<String>

    /**
     * Patch formats supported.
     */
    val patchFormat: List<String>?

    /**
     * Implementation guides supported.
     */
    val implementationGuide: List<String>?

    /**
     * Profiles for use cases supported.
     */
    val profile: List<Reference>?

    /**
     * If the endpoint is a RESTful one.
     */
    val rest: List<CapabilityStatementRest>?

    /**
     * If messaging is supported.
     */
    val messaging: List<CapabilityStatementMessaging>?

    /**
     * Document definition.
     */
    val document: List<CapabilityStatementDocument>?
}

/**
 * CapabilityStatement
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used
 * as a statement of actual server functionality or a statement of required or desired server
 * implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatement")
data class CapabilityStatement(

    @SerialName("url")
    override val url: String? = null,

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
    override val contact: List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("kind")
    override val kind: CapabilityStatementKind,

    @SerialName("instantiates")
    override val instantiates: List<String>? = null,

    @SerialName("software")
    override val software: CapabilityStatementSoftware? = null,

    @SerialName("implementation")
    override val implementation: CapabilityStatementImplementation? = null,

    @SerialName("fhirVersion")
    override val fhirVersion: String,

    @SerialName("acceptUnknown")
    override val acceptUnknown: UnknownContentCode,

    @SerialName("format")
    override val format: List<String>,

    @SerialName("patchFormat")
    override val patchFormat: List<String>? = null,

    @SerialName("implementationGuide")
    override val implementationGuide: List<String>? = null,

    @SerialName("profile")
    override val profile: List<Reference>? = null,

    @SerialName("rest")
    override val rest: List<CapabilityStatementRest>? = null,

    @SerialName("messaging")
    override val messaging: List<CapabilityStatementMessaging>? = null,

    @SerialName("document")
    override val document: List<CapabilityStatementDocument>? = null,

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
) : FhirCapabilityStatement {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatement"
    }
}

/**
 * FhirCapabilityStatementDocument
 *
 * A document definition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementDocument</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementDocument : FhirBackboneElement {

    /**
     * Mode of this document declaration - whether an application is a producer or
     * consumer.
     */
    val mode: DocumentMode

    /**
     * Description of document support.
     */
    val documentation: String?

    /**
     * Constraint on a resource used in the document.
     */
    val profile: Reference
}

/**
 * CapabilityStatementDocument
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * A document definition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementDocument</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementDocument")
data class CapabilityStatementDocument(

    @SerialName("mode")
    override val mode: DocumentMode,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("profile")
    override val profile: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementDocument {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementDocument"
    }
}

/**
 * FhirCapabilityStatementImplementation
 *
 * Identifies a specific implementation instance that is described by the capability statement - i.e. a
 * particular installation, rather than the capabilities of a software program.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementImplementation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementImplementation : FhirBackboneElement {

    /**
     * Describes this specific instance.
     */
    val description: String

    /**
     * Base URL for the installation.
     */
    val url: String?
}

/**
 * CapabilityStatementImplementation
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * Identifies a specific implementation instance that is described by the capability statement - i.e. a
 * particular installation, rather than the capabilities of a software program.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementImplementation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementImplementation")
data class CapabilityStatementImplementation(

    @SerialName("description")
    override val description: String,

    @SerialName("url")
    override val url: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementImplementation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementImplementation"
    }
}

/**
 * FhirCapabilityStatementMessaging
 *
 * A description of the messaging capabilities of the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessaging</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementMessaging : FhirBackboneElement {

    /**
     * Where messages should be sent.
     */
    val endpoint: List<CapabilityStatementMessagingEndpoint>?

    /**
     * Reliable Message Cache Length (min).
     */
    val reliableCache: UnsignedInteger?

    /**
     * Messaging interface behavior details.
     */
    val documentation: String?

    /**
     * Messages supported by this system.
     */
    val supportedMessage: List<CapabilityStatementMessagingSupportedMessage>?

    /**
     * Declare support for this event.
     */
    val event: List<CapabilityStatementMessagingEvent>?
}

/**
 * CapabilityStatementMessaging
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * A description of the messaging capabilities of the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessaging</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementMessaging")
data class CapabilityStatementMessaging(

    @SerialName("endpoint")
    override val endpoint: List<CapabilityStatementMessagingEndpoint>? = null,

    @SerialName("reliableCache")
    override val reliableCache: UnsignedInteger? = null,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("supportedMessage")
    override val supportedMessage: List<CapabilityStatementMessagingSupportedMessage>? = null,

    @SerialName("event")
    override val event: List<CapabilityStatementMessagingEvent>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementMessaging {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementMessaging"
    }
}

/**
 * FhirCapabilityStatementMessagingEndpoint
 *
 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingEndpoint</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementMessagingEndpoint : FhirBackboneElement {

    /**
     * http | ftp | mllp +.
     */
    val protocol: Coding

    /**
     * Network address or identifier of the end-point.
     */
    val address: String
}

/**
 * CapabilityStatementMessagingEndpoint
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingEndpoint</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementMessagingEndpoint")
data class CapabilityStatementMessagingEndpoint(

    @SerialName("protocol")
    override val protocol: Coding,

    @SerialName("address")
    override val address: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementMessagingEndpoint {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementMessagingEndpoint"
    }
}

/**
 * FhirCapabilityStatementMessagingEvent
 *
 * A description of the solution's support for an event at this end-point.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingEvent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementMessagingEvent : FhirBackboneElement {

    /**
     * Event type.
     */
    val code: Coding

    /**
     * The impact of the content of the message.
     */
    val category: MessageSignificanceCategory?

    /**
     * The mode of this event declaration - whether an application is a sender or
     * receiver.
     */
    val mode: EventCapabilityMode

    /**
     * A resource associated with the event. This is the resource that defines the
     * event.
     */
    val focus: ResourceType

    /**
     * Profile that describes the request.
     */
    val request: Reference

    /**
     * Profile that describes the response.
     */
    val response: Reference

    /**
     * Endpoint-specific event documentation.
     */
    val documentation: String?
}

/**
 * CapabilityStatementMessagingEvent
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * A description of the solution's support for an event at this end-point.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingEvent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementMessagingEvent")
data class CapabilityStatementMessagingEvent(

    @SerialName("code")
    override val code: Coding,

    @SerialName("category")
    override val category: MessageSignificanceCategory? = null,

    @SerialName("mode")
    override val mode: EventCapabilityMode,

    @SerialName("focus")
    override val focus: ResourceType,

    @SerialName("request")
    override val request: Reference,

    @SerialName("response")
    override val response: Reference,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementMessagingEvent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementMessagingEvent"
    }
}

/**
 * FhirCapabilityStatementMessagingSupportedMessage
 *
 * References to message definitions for messages this system can send or receive.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingSupportedMessage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementMessagingSupportedMessage : FhirBackboneElement {

    /**
     * The mode of this event declaration - whether application is sender or receiver.
     */
    val mode: EventCapabilityMode

    /**
     * Message supported by this system.
     */
    val definition: Reference
}

/**
 * CapabilityStatementMessagingSupportedMessage
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * References to message definitions for messages this system can send or receive.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingSupportedMessage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementMessagingSupportedMessage")
data class CapabilityStatementMessagingSupportedMessage(

    @SerialName("mode")
    override val mode: EventCapabilityMode,

    @SerialName("definition")
    override val definition: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementMessagingSupportedMessage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementMessagingSupportedMessage"
    }
}

/**
 * FhirCapabilityStatementRest
 *
 * A definition of the restful capabilities of the solution, if any.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRest : FhirBackboneElement {

    /**
     * Identifies whether this portion of the statement is describing the ability to
     * initiate or receive restful operations.
     */
    val mode: RestfulCapabilityMode

    /**
     * General description of implementation.
     */
    val documentation: String?

    /**
     * Information about security of implementation.
     */
    val security: CapabilityStatementRestSecurity?

    /**
     * Resource served on the REST interface.
     */
    val resource: List<CapabilityStatementRestResource>?

    /**
     * What operations are supported?.
     */
    val interaction: List<CapabilityStatementRestInteraction>?

    /**
     * Search parameters for searching all resources.
     */
    val searchParam: List<CapabilityStatementRestResourceSearchParam>?

    /**
     * Definition of an operation or a custom query.
     */
    val operation: List<CapabilityStatementRestOperation>?

    /**
     * Compartments served/used by system.
     */
    val compartment: List<String>?
}

/**
 * CapabilityStatementRest
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * A definition of the restful capabilities of the solution, if any.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRest</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRest")
data class CapabilityStatementRest(

    @SerialName("mode")
    override val mode: RestfulCapabilityMode,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("security")
    override val security: CapabilityStatementRestSecurity? = null,

    @SerialName("resource")
    override val resource: List<CapabilityStatementRestResource>? = null,

    @SerialName("interaction")
    override val interaction: List<CapabilityStatementRestInteraction>? = null,

    @SerialName("searchParam")
    override val searchParam: List<CapabilityStatementRestResourceSearchParam>? = null,

    @SerialName("operation")
    override val operation: List<CapabilityStatementRestOperation>? = null,

    @SerialName("compartment")
    override val compartment: List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRest {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRest"
    }
}

/**
 * FhirCapabilityStatementRestInteraction
 *
 * A specification of restful operations supported by the system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestInteraction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestInteraction : FhirBackboneElement {

    /**
     * A coded identifier of the operation, supported by the system.
     *
     * Only use: ['transaction', 'batch', 'search-system', 'history-system']
     */
    val code: FHIRRestfulInteractions

    /**
     * Anything special about operation behavior.
     */
    val documentation: String?
}

/**
 * CapabilityStatementRestInteraction
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * A specification of restful operations supported by the system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestInteraction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestInteraction")
data class CapabilityStatementRestInteraction(

    @SerialName("code")
    override val code: FHIRRestfulInteractions,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRestInteraction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRestInteraction"
    }
}

/**
 * FhirCapabilityStatementRestOperation
 *
 * Definition of an operation or a named query together with its parameters and their meaning and type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestOperation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestOperation : FhirBackboneElement {

    /**
     * Name by which the operation/query is invoked.
     */
    val name: String

    /**
     * The defined operation/query.
     */
    val definition: Reference
}

/**
 * CapabilityStatementRestOperation
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * Definition of an operation or a named query together with its parameters and their meaning and type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestOperation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestOperation")
data class CapabilityStatementRestOperation(

    @SerialName("name")
    override val name: String,

    @SerialName("definition")
    override val definition: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRestOperation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRestOperation"
    }
}

/**
 * FhirCapabilityStatementRestResource
 *
 * A specification of the restful capabilities of the solution for a specific resource type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestResource : FhirBackboneElement {

    /**
     * A type of resource exposed via the restful interface.
     */
    val type: ResourceType

    /**
     * Base System profile for all uses of resource.
     */
    val profile: Reference?

    /**
     * Additional information about the use of the resource type.
     */
    val documentation: String?

    /**
     * What operations are supported?.
     */
    val interaction: List<CapabilityStatementRestResourceInteraction>

    /**
     * This field is set to no-version to specify that the system does not support
     * (server) or use (client) versioning for this resource type. If this has some
     * other value, the server must at least correctly track and populate the versionId
     * meta-property on resources. If the value is 'versioned-update', then the server
     * supports all the versioning features, including using e-tags for version
     * integrity in the API.
     */
    val versioning: ResourceVersionPolicy?

    /**
     * Whether vRead can return past versions.
     */
    val readHistory: Bool?

    /**
     * If update can commit to a new identity.
     */
    val updateCreate: Bool?

    /**
     * If allows/uses conditional create.
     */
    val conditionalCreate: Bool?

    /**
     * A code that indicates how the server supports conditional read.
     */
    val conditionalRead: ConditionalReadStatus?

    /**
     * If allows/uses conditional update.
     */
    val conditionalUpdate: Bool?

    /**
     * A code that indicates how the server supports conditional delete.
     */
    val conditionalDelete: ConditionalDeleteStatus?

    /**
     * A set of flags that defines how references are supported.
     */
    val referencePolicy: List<ReferenceHandlingPolicy>?

    /**
     * _include values supported by the server.
     */
    val searchInclude: List<String>?

    /**
     * _revinclude values supported by the server.
     */
    val searchRevInclude: List<String>?

    /**
     * Search parameters supported by implementation.
     */
    val searchParam: List<CapabilityStatementRestResourceSearchParam>?
}

/**
 * CapabilityStatementRestResource
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * A specification of the restful capabilities of the solution for a specific resource type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestResource")
data class CapabilityStatementRestResource(

    @SerialName("type")
    override val type: ResourceType,

    @SerialName("profile")
    override val profile: Reference? = null,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("interaction")
    override val interaction: List<CapabilityStatementRestResourceInteraction>,

    @SerialName("versioning")
    override val versioning: ResourceVersionPolicy? = null,

    @SerialName("readHistory")
    override val readHistory: Bool? = null,

    @SerialName("updateCreate")
    override val updateCreate: Bool? = null,

    @SerialName("conditionalCreate")
    override val conditionalCreate: Bool? = null,

    @SerialName("conditionalRead")
    override val conditionalRead: ConditionalReadStatus? = null,

    @SerialName("conditionalUpdate")
    override val conditionalUpdate: Bool? = null,

    @SerialName("conditionalDelete")
    override val conditionalDelete: ConditionalDeleteStatus? = null,

    @SerialName("referencePolicy")
    override val referencePolicy: List<ReferenceHandlingPolicy>? = null,

    @SerialName("searchInclude")
    override val searchInclude: List<String>? = null,

    @SerialName("searchRevInclude")
    override val searchRevInclude: List<String>? = null,

    @SerialName("searchParam")
    override val searchParam: List<CapabilityStatementRestResourceSearchParam>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRestResource {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRestResource"
    }
}

/**
 * FhirCapabilityStatementRestResourceInteraction
 *
 * Identifies a restful operation supported by the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceInteraction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestResourceInteraction : FhirBackboneElement {

    /**
     * Coded identifier of the operation, supported by the system resource.
     *
     * Only use: ['read', 'vread', 'update', 'patch', 'delete', 'history-instance', 'history-type', 'create', 'search-type']
     */
    val code: FHIRRestfulInteractions

    /**
     * Anything special about operation behavior.
     */
    val documentation: String?
}

/**
 * CapabilityStatementRestResourceInteraction
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * Identifies a restful operation supported by the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceInteraction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestResourceInteraction")
data class CapabilityStatementRestResourceInteraction(

    @SerialName("code")
    override val code: FHIRRestfulInteractions,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRestResourceInteraction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRestResourceInteraction"
    }
}

/**
 * FhirCapabilityStatementRestResourceSearchParam
 *
 * Search parameters for implementations to support and/or make use of - either references to ones
 * defined in the specification, or additional ones defined for/by the implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceSearchParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestResourceSearchParam : FhirBackboneElement {

    /**
     * Name of search parameter.
     */
    val name: String

    /**
     * Source of definition for parameter.
     */
    val definition: String?

    /**
     * The type of value a search parameter refers to, and how the content is
     * interpreted.
     */
    val type: SearchParamType

    /**
     * Server-specific usage.
     */
    val documentation: String?
}

/**
 * CapabilityStatementRestResourceSearchParam
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * Search parameters for implementations to support and/or make use of - either references to ones
 * defined in the specification, or additional ones defined for/by the implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceSearchParam</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestResourceSearchParam")
data class CapabilityStatementRestResourceSearchParam(

    @SerialName("name")
    override val name: String,

    @SerialName("definition")
    override val definition: String? = null,

    @SerialName("type")
    override val type: SearchParamType,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRestResourceSearchParam {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRestResourceSearchParam"
    }
}

/**
 * FhirCapabilityStatementRestSecurity
 *
 * Information about security implementation from an interface perspective - what a client needs to
 * know.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestSecurity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestSecurity : FhirBackboneElement {

    /**
     * Adds CORS Headers (http://enable-cors.org/).
     */
    val cors: Bool?

    /**
     * OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates.
     */
    val service: List<CodeableConcept>?

    /**
     * General description of how security works.
     */
    val description: String?

    /**
     * Certificates associated with security profiles.
     */
    val certificate: List<CapabilityStatementRestSecurityCertificate>?
}

/**
 * CapabilityStatementRestSecurity
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * Information about security implementation from an interface perspective - what a client needs to
 * know.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestSecurity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestSecurity")
data class CapabilityStatementRestSecurity(

    @SerialName("cors")
    override val cors: Bool? = null,

    @SerialName("service")
    override val service: List<CodeableConcept>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("certificate")
    override val certificate: List<CapabilityStatementRestSecurityCertificate>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRestSecurity {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRestSecurity"
    }
}

/**
 * FhirCapabilityStatementRestSecurityCertificate
 *
 * Certificates associated with security profiles
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestSecurityCertificate</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestSecurityCertificate : FhirBackboneElement {

    /**
     * Mime type for certificates.
     */
    val type: String?

    /**
     * Actual certificate.
     */
    val blob: String?
}

/**
 * CapabilityStatementRestSecurityCertificate
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * Certificates associated with security profiles
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestSecurityCertificate</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestSecurityCertificate")
data class CapabilityStatementRestSecurityCertificate(

    @SerialName("type")
    override val type: String? = null,

    @SerialName("blob")
    override val blob: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementRestSecurityCertificate {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementRestSecurityCertificate"
    }
}

/**
 * FhirCapabilityStatementSoftware
 *
 * Software that is covered by this capability statement. It is used when the capability statement
 * describes the capabilities of a particular software version, independent of an installation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementSoftware</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementSoftware : FhirBackboneElement {

    /**
     * A name the software is known by.
     */
    val name: String

    /**
     * Version covered by this statement.
     */
    val version: String?

    /**
     * Date this version released.
     */
    val releaseDate: DateTime?
}

/**
 * CapabilityStatementSoftware
 *
 * SourceFileName: CapabilityStatement.kt
 *
 * Software that is covered by this capability statement. It is used when the capability statement
 * describes the capabilities of a particular software version, independent of an installation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementSoftware</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementSoftware")
data class CapabilityStatementSoftware(

    @SerialName("name")
    override val name: String,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("releaseDate")
    override val releaseDate: DateTime? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCapabilityStatementSoftware {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CapabilityStatementSoftware"
    }
}
