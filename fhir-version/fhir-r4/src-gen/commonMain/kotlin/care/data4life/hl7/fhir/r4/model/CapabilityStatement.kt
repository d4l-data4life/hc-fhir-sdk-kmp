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

import care.data4life.hl7.fhir.r4.codesystem.CapabilityStatementKind
import care.data4life.hl7.fhir.r4.codesystem.ConditionalDeleteStatus
import care.data4life.hl7.fhir.r4.codesystem.ConditionalReadStatus
import care.data4life.hl7.fhir.r4.codesystem.DocumentMode
import care.data4life.hl7.fhir.r4.codesystem.EventCapabilityMode
import care.data4life.hl7.fhir.r4.codesystem.FHIRRestfulInteractions
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ReferenceHandlingPolicy
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.r4.codesystem.ResourceVersionPolicy
import care.data4life.hl7.fhir.r4.codesystem.RestfulCapabilityMode
import care.data4life.hl7.fhir.r4.codesystem.SearchParamType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirCapabilityStatement
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular
 * version of FHIR that may be used as a statement of actual server functionality or a statement of
 * required or desired server implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatement : FhirDomainResource {

    /**
     * Canonical identifier for this capability statement, represented as a URI
     * (globally unique).
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
     * Date last changed.
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
     * Natural language description of the capability statement.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for capability statement (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

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
     * running instance of software, a particular product (kind, not instance of
     * software) or a class of implementation (e.g. a desired purchase).
     */
    val kind: CapabilityStatementKind

    /**
     * Canonical URL of another capability statement this implements.
     */
    val instantiates: kotlin.collections.List<String>?

    /**
     * Canonical URL of another capability statement this adds to.
     */
    val imports: kotlin.collections.List<String>?

    /**
     * Software that is covered by this capability statement.
     */
    val software: CapabilityStatementSoftware?

    /**
     * If this describes a specific instance.
     */
    val implementation: CapabilityStatementImplementation?

    /**
     * FHIR Version the system supports.
     */
    val fhirVer: String

    /**
     * formats supported (xml | json | ttl | mime type).
     */
    val format: kotlin.collections.List<String>

    /**
     * Patch formats supported.
     */
    val patchFormat: kotlin.collections.List<String>?

    /**
     * Implementation guides supported.
     */
    val implementationGuide: kotlin.collections.List<String>?

    /**
     * If the endpoint is a RESTful one.
     */
    val rest: kotlin.collections.List<CapabilityStatementRest>?

    /**
     * If messaging is supported.
     */
    val messaging: kotlin.collections.List<CapabilityStatementMessaging>?

    /**
     * Document definition.
     */
    val document: kotlin.collections.List<CapabilityStatementDocument>?
}

/**
 * CapabilityStatement
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular
 * version of FHIR that may be used as a statement of actual server functionality or a statement of
 * required or desired server implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatement</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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

    @SerialName("kind")
    override val kind: CapabilityStatementKind,

    @SerialName("instantiates")
    override val instantiates: kotlin.collections.List<String>? = null,

    @SerialName("imports")
    override val imports: kotlin.collections.List<String>? = null,

    @SerialName("software")
    override val software: CapabilityStatementSoftware? = null,

    @SerialName("implementation")
    override val implementation: CapabilityStatementImplementation? = null,

    @SerialName("fhirVersion")
    override val fhirVer: String,

    @SerialName("format")
    override val format: kotlin.collections.List<String>,

    @SerialName("patchFormat")
    override val patchFormat: kotlin.collections.List<String>? = null,

    @SerialName("implementationGuide")
    override val implementationGuide: kotlin.collections.List<String>? = null,

    @SerialName("rest")
    override val rest: kotlin.collections.List<CapabilityStatementRest>? = null,

    @SerialName("messaging")
    override val messaging: kotlin.collections.List<CapabilityStatementMessaging>? = null,

    @SerialName("document")
    override val document: kotlin.collections.List<CapabilityStatementDocument>? = null,

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
) : FhirCapabilityStatement {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatement"
    }
}

/**
 * FhirCapabilityStatementDocument
 *
 * A document definition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementDocument</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
     * Constraint on the resources used in the document.
     */
    val profile: String
}

/**
 * CapabilityStatementDocument
 *
 * A document definition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementDocument</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementDocument")
data class CapabilityStatementDocument(

    @SerialName("mode")
    override val mode: DocumentMode,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("profile")
    override val profile: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementDocument {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementDocument"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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

    /**
     * Organization that manages the data.
     */
    val custodian: Reference?
}

/**
 * CapabilityStatementImplementation
 *
 * Identifies a specific implementation instance that is described by the capability statement - i.e. a
 * particular installation, rather than the capabilities of a software program.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementImplementation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementImplementation")
data class CapabilityStatementImplementation(

    @SerialName("description")
    override val description: String,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("custodian")
    override val custodian: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementImplementation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementImplementation"
    }
}

/**
 * FhirCapabilityStatementMessaging
 *
 * A description of the messaging capabilities of the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessaging</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementMessaging : FhirBackboneElement {

    /**
     * Where messages should be sent.
     */
    val endpoint: kotlin.collections.List<CapabilityStatementMessagingEndpoint>?

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
    val supportedMessage: kotlin.collections.List<CapabilityStatementMessagingSupportedMessage>?
}

/**
 * CapabilityStatementMessaging
 *
 * A description of the messaging capabilities of the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessaging</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementMessaging")
data class CapabilityStatementMessaging(

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<CapabilityStatementMessagingEndpoint>? = null,

    @SerialName("reliableCache")
    override val reliableCache: UnsignedInteger? = null,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("supportedMessage")
    override val supportedMessage: kotlin.collections.List<CapabilityStatementMessagingSupportedMessage>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementMessaging {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementMessaging"
    }
}

/**
 * FhirCapabilityStatementMessagingEndpoint
 *
 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingEndpoint</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingEndpoint</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementMessagingEndpoint {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementMessagingEndpoint"
    }
}

/**
 * FhirCapabilityStatementMessagingSupportedMessage
 *
 * References to message definitions for messages this system can send or receive.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingSupportedMessage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementMessagingSupportedMessage : FhirBackboneElement {

    /**
     * The mode of this event declaration - whether application is sender or receiver.
     */
    val mode: EventCapabilityMode

    /**
     * Message supported by this system.
     */
    val definition: String
}

/**
 * CapabilityStatementMessagingSupportedMessage
 *
 * References to message definitions for messages this system can send or receive.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementMessagingSupportedMessage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementMessagingSupportedMessage")
data class CapabilityStatementMessagingSupportedMessage(

    @SerialName("mode")
    override val mode: EventCapabilityMode,

    @SerialName("definition")
    override val definition: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementMessagingSupportedMessage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementMessagingSupportedMessage"
    }
}

/**
 * FhirCapabilityStatementRest
 *
 * A definition of the restful capabilities of the solution, if any.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
    val resource: kotlin.collections.List<CapabilityStatementRestResource>?

    /**
     * What operations are supported?.
     */
    val interaction: kotlin.collections.List<CapabilityStatementRestInteraction>?

    /**
     * Search parameters for searching all resources.
     */
    val searchParam: kotlin.collections.List<CapabilityStatementRestResourceSearchParam>?

    /**
     * Definition of a system level operation.
     */
    val operation: kotlin.collections.List<CapabilityStatementRestResourceOperation>?

    /**
     * Compartments served/used by system.
     */
    val compartment: kotlin.collections.List<String>?
}

/**
 * CapabilityStatementRest
 *
 * A definition of the restful capabilities of the solution, if any.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
    override val resource: kotlin.collections.List<CapabilityStatementRestResource>? = null,

    @SerialName("interaction")
    override val interaction: kotlin.collections.List<CapabilityStatementRestInteraction>? = null,

    @SerialName("searchParam")
    override val searchParam: kotlin.collections.List<CapabilityStatementRestResourceSearchParam>? = null,

    @SerialName("operation")
    override val operation: kotlin.collections.List<CapabilityStatementRestResourceOperation>? = null,

    @SerialName("compartment")
    override val compartment: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementRest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementRest"
    }
}

/**
 * FhirCapabilityStatementRestInteraction
 *
 * A specification of restful operations supported by the system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestInteraction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
 * A specification of restful operations supported by the system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestInteraction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementRestInteraction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementRestInteraction"
    }
}

/**
 * FhirCapabilityStatementRestResource
 *
 * A specification of the restful capabilities of the solution for a specific resource type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestResource : FhirBackboneElement {

    /**
     * A type of resource exposed via the restful interface.
     */
    val type: ResourceType

    /**
     * Base System profile for all uses of resource.
     */
    val profile: String?

    /**
     * Profiles for use cases supported.
     */
    val supportedProfile: kotlin.collections.List<String>?

    /**
     * Additional information about the use of the resource type.
     */
    val documentation: String?

    /**
     * What operations are supported?.
     */
    val interaction: kotlin.collections.List<CapabilityStatementRestResourceInteraction>?

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
    val referencePolicy: kotlin.collections.List<ReferenceHandlingPolicy>?

    /**
     * _include values supported by the server.
     */
    val searchInclude: kotlin.collections.List<String>?

    /**
     * _revinclude values supported by the server.
     */
    val searchRevInclude: kotlin.collections.List<String>?

    /**
     * Search parameters supported by implementation.
     */
    val searchParam: kotlin.collections.List<CapabilityStatementRestResourceSearchParam>?

    /**
     * Definition of a resource operation.
     */
    val operation: kotlin.collections.List<CapabilityStatementRestResourceOperation>?
}

/**
 * CapabilityStatementRestResource
 *
 * A specification of the restful capabilities of the solution for a specific resource type.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestResource")
data class CapabilityStatementRestResource(

    @SerialName("type")
    override val type: ResourceType,

    @SerialName("profile")
    override val profile: String? = null,

    @SerialName("supportedProfile")
    override val supportedProfile: kotlin.collections.List<String>? = null,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("interaction")
    override val interaction: kotlin.collections.List<CapabilityStatementRestResourceInteraction>? = null,

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
    override val referencePolicy: kotlin.collections.List<ReferenceHandlingPolicy>? = null,

    @SerialName("searchInclude")
    override val searchInclude: kotlin.collections.List<String>? = null,

    @SerialName("searchRevInclude")
    override val searchRevInclude: kotlin.collections.List<String>? = null,

    @SerialName("searchParam")
    override val searchParam: kotlin.collections.List<CapabilityStatementRestResourceSearchParam>? = null,

    @SerialName("operation")
    override val operation: kotlin.collections.List<CapabilityStatementRestResourceOperation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementRestResource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementRestResource"
    }
}

/**
 * FhirCapabilityStatementRestResourceInteraction
 *
 * Identifies a restful operation supported by the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceInteraction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
 * Identifies a restful operation supported by the solution.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceInteraction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementRestResourceInteraction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementRestResourceInteraction"
    }
}

/**
 * FhirCapabilityStatementRestResourceOperation
 *
 * Definition of an operation or a named query together with its parameters and their meaning and type.
 * Consult the definition of the operation for details about how to invoke the operation, and the
 * parameters.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceOperation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestResourceOperation : FhirBackboneElement {

    /**
     * Name by which the operation/query is invoked.
     */
    val name: String

    /**
     * The defined operation/query.
     */
    val definition: String

    /**
     * Specific details about operation behavior.
     */
    val documentation: String?
}

/**
 * CapabilityStatementRestResourceOperation
 *
 * Definition of an operation or a named query together with its parameters and their meaning and type.
 * Consult the definition of the operation for details about how to invoke the operation, and the
 * parameters.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceOperation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestResourceOperation")
data class CapabilityStatementRestResourceOperation(

    @SerialName("name")
    override val name: String,

    @SerialName("definition")
    override val definition: String,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementRestResourceOperation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementRestResourceOperation"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
 * Search parameters for implementations to support and/or make use of - either references to ones
 * defined in the specification, or additional ones defined for/by the implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestResourceSearchParam</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementRestResourceSearchParam {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementRestResourceSearchParam"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
interface FhirCapabilityStatementRestSecurity : FhirBackboneElement {

    /**
     * Adds CORS Headers (http://enable-cors.org/).
     */
    val cors: Bool?

    /**
     * OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates.
     */
    val service: kotlin.collections.List<CodeableConcept>?

    /**
     * General description of how security works.
     */
    val description: String?
}

/**
 * CapabilityStatementRestSecurity
 *
 * Information about security implementation from an interface perspective - what a client needs to
 * know.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementRestSecurity</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
 */
@Serializable
@SerialName("CapabilityStatementRestSecurity")
data class CapabilityStatementRestSecurity(

    @SerialName("cors")
    override val cors: Bool? = null,

    @SerialName("service")
    override val service: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("description")
    override val description: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementRestSecurity {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementRestSecurity"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
     * Date this version was released.
     */
    val releaseDate: DateTime?
}

/**
 * CapabilityStatementSoftware
 *
 * Software that is covered by this capability statement. It is used when the capability statement
 * describes the capabilities of a particular software version, independent of an installation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CapabilityStatement">CapabilityStatementSoftware</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CapabilityStatement)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCapabilityStatementSoftware {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CapabilityStatementSoftware"
    }
}
