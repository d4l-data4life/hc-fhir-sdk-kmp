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
import care.data4life.hl7.fhir.r4.codesystem.CodeSearchSupport
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirTerminologyCapabilities
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology
 * Server that may be used as a statement of actual server functionality or a statement of required or
 * desired server implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilities</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilities : FhirDomainResource {

    /**
     * Canonical identifier for this terminology capabilities, represented as a URI
     * (globally unique).
     */
    val url: String?

    /**
     * Business version of the terminology capabilities.
     */
    val version: String?

    /**
     * Name for this terminology capabilities (computer friendly).
     */
    val name: String?

    /**
     * Name for this terminology capabilities (human friendly).
     */
    val title: String?

    /**
     * The status of this terminology capabilities. Enables tracking the life-cycle of
     * the content.
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
     * Natural language description of the terminology capabilities.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for terminology capabilities (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this terminology capabilities is defined.
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
     * Software that is covered by this terminology capability statement.
     */
    val software: TerminologyCapabilitiesSoftware?

    /**
     * If this describes a specific instance.
     */
    val implementation: TerminologyCapabilitiesImplementation?

    /**
     * Whether lockedDate is supported.
     */
    val lockedDate: Bool?

    /**
     * A code system supported by the server.
     */
    val codeSystem: kotlin.collections.List<TerminologyCapabilitiesCodeSystem>?

    /**
     * Information about the [ValueSet/$expand](valueset-operation-expand.html)
     * operation.
     */
    val expansion: TerminologyCapabilitiesExpansion?

    /**
     * The degree to which the server supports the code search parameter on ValueSet,
     * if it is supported.
     */
    val codeSearch: CodeSearchSupport?

    /**
     * Information about the [ValueSet/$validate-code](valueset-operation-validate-
     * code.html) operation.
     */
    val validateCode: TerminologyCapabilitiesValidateCode?

    /**
     * Information about the [ConceptMap/$translate](conceptmap-operation-
     * translate.html) operation.
     */
    val translation: TerminologyCapabilitiesTranslation?

    /**
     * Information about the [ConceptMap/$closure](conceptmap-operation-closure.html)
     * operation.
     */
    val closure: TerminologyCapabilitiesClosure?
}

/**
 * TerminologyCapabilities
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology
 * Server that may be used as a statement of actual server functionality or a statement of required or
 * desired server implementation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilities</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilities")
data class TerminologyCapabilities(

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

    @SerialName("software")
    override val software: TerminologyCapabilitiesSoftware? = null,

    @SerialName("implementation")
    override val implementation: TerminologyCapabilitiesImplementation? = null,

    @SerialName("lockedDate")
    override val lockedDate: Bool? = null,

    @SerialName("codeSystem")
    override val codeSystem: kotlin.collections.List<TerminologyCapabilitiesCodeSystem>? = null,

    @SerialName("expansion")
    override val expansion: TerminologyCapabilitiesExpansion? = null,

    @SerialName("codeSearch")
    override val codeSearch: CodeSearchSupport? = null,

    @SerialName("validateCode")
    override val validateCode: TerminologyCapabilitiesValidateCode? = null,

    @SerialName("translation")
    override val translation: TerminologyCapabilitiesTranslation? = null,

    @SerialName("closure")
    override val closure: TerminologyCapabilitiesClosure? = null,

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
) : FhirTerminologyCapabilities {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilities"
    }
}

/**
 * FhirTerminologyCapabilitiesClosure
 *
 * Whether the $closure operation is supported.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesClosure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesClosure : FhirBackboneElement {

    /**
     * If cross-system closure is supported.
     */
    val translation: Bool?
}

/**
 * TerminologyCapabilitiesClosure
 *
 * Whether the $closure operation is supported.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesClosure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesClosure")
data class TerminologyCapabilitiesClosure(

    @SerialName("translation")
    override val translation: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesClosure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesClosure"
    }
}

/**
 * FhirTerminologyCapabilitiesCodeSystem
 *
 * Identifies a code system that is supported by the server. If there is a no code system URL, then
 * this declares the general assumptions a client can make about support for any CodeSystem resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesCodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesCodeSystem : FhirBackboneElement {

    /**
     * URI for the Code System.
     */
    val uri: String?

    /**
     * Version of Code System supported.
     */
    val version: kotlin.collections.List<TerminologyCapabilitiesCodeSystemVersion>?

    /**
     * Whether subsumption is supported.
     */
    val subsumption: Bool?
}

/**
 * TerminologyCapabilitiesCodeSystem
 *
 * Identifies a code system that is supported by the server. If there is a no code system URL, then
 * this declares the general assumptions a client can make about support for any CodeSystem resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesCodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesCodeSystem")
data class TerminologyCapabilitiesCodeSystem(

    @SerialName("uri")
    override val uri: String? = null,

    @SerialName("version")
    override val version: kotlin.collections.List<TerminologyCapabilitiesCodeSystemVersion>? = null,

    @SerialName("subsumption")
    override val subsumption: Bool? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesCodeSystem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesCodeSystem"
    }
}

/**
 * FhirTerminologyCapabilitiesCodeSystemVersion
 *
 * For the code system, a list of versions that are supported by the server.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesCodeSystemVersion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesCodeSystemVersion : FhirBackboneElement {

    /**
     * Version identifier for this version.
     */
    val code: String?

    /**
     * If this is the default version for this code system.
     */
    val isDefault: Bool?

    /**
     * If compositional grammar is supported.
     */
    val compositional: Bool?

    /**
     * Language Displays supported.
     */
    val language: kotlin.collections.List<String>?

    /**
     * Filter Properties supported.
     */
    val filter: kotlin.collections.List<TerminologyCapabilitiesCodeSystemVersionFilter>?

    /**
     * Properties supported for $lookup.
     */
    val property: kotlin.collections.List<String>?
}

/**
 * TerminologyCapabilitiesCodeSystemVersion
 *
 * For the code system, a list of versions that are supported by the server.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesCodeSystemVersion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesCodeSystemVersion")
data class TerminologyCapabilitiesCodeSystemVersion(

    @SerialName("code")
    override val code: String? = null,

    @SerialName("isDefault")
    override val isDefault: Bool? = null,

    @SerialName("compositional")
    override val compositional: Bool? = null,

    @SerialName("language")
    override val language: kotlin.collections.List<String>? = null,

    @SerialName("filter")
    override val filter: kotlin.collections.List<TerminologyCapabilitiesCodeSystemVersionFilter>? = null,

    @SerialName("property")
    override val property: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesCodeSystemVersion {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesCodeSystemVersion"
    }
}

/**
 * FhirTerminologyCapabilitiesCodeSystemVersionFilter
 *
 * Filter Properties supported
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesCodeSystemVersionFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesCodeSystemVersionFilter : FhirBackboneElement {

    /**
     * Code of the property supported.
     */
    val code: String

    /**
     * Operations supported for the property.
     */
    val op: kotlin.collections.List<String>
}

/**
 * TerminologyCapabilitiesCodeSystemVersionFilter
 *
 * Filter Properties supported
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesCodeSystemVersionFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesCodeSystemVersionFilter")
data class TerminologyCapabilitiesCodeSystemVersionFilter(

    @SerialName("code")
    override val code: String,

    @SerialName("op")
    override val op: kotlin.collections.List<String>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesCodeSystemVersionFilter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesCodeSystemVersionFilter"
    }
}

/**
 * FhirTerminologyCapabilitiesExpansion
 *
 * Information about the [ValueSet/$expand](valueset-operation-expand.html) operation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesExpansion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesExpansion : FhirBackboneElement {

    /**
     * Whether the server can return nested value sets.
     */
    val hierarchical: Bool?

    /**
     * Whether the server supports paging on expansion.
     */
    val paging: Bool?

    /**
     * Allow request for incomplete expansions?.
     */
    val incomplete: Bool?

    /**
     * Supported expansion parameter.
     */
    val parameter: kotlin.collections.List<TerminologyCapabilitiesExpansionParameter>?

    /**
     * Documentation about text searching works.
     */
    val textFilter: String?
}

/**
 * TerminologyCapabilitiesExpansion
 *
 * Information about the [ValueSet/$expand](valueset-operation-expand.html) operation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesExpansion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesExpansion")
data class TerminologyCapabilitiesExpansion(

    @SerialName("hierarchical")
    override val hierarchical: Bool? = null,

    @SerialName("paging")
    override val paging: Bool? = null,

    @SerialName("incomplete")
    override val incomplete: Bool? = null,

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<TerminologyCapabilitiesExpansionParameter>? = null,

    @SerialName("textFilter")
    override val textFilter: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesExpansion {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesExpansion"
    }
}

/**
 * FhirTerminologyCapabilitiesExpansionParameter
 *
 * Supported expansion parameter
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesExpansionParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesExpansionParameter : FhirBackboneElement {

    /**
     * Expansion Parameter name.
     */
    val name: String

    /**
     * Description of support for parameter.
     */
    val documentation: String?
}

/**
 * TerminologyCapabilitiesExpansionParameter
 *
 * Supported expansion parameter
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesExpansionParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesExpansionParameter")
data class TerminologyCapabilitiesExpansionParameter(

    @SerialName("name")
    override val name: String,

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
) : FhirTerminologyCapabilitiesExpansionParameter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesExpansionParameter"
    }
}

/**
 * FhirTerminologyCapabilitiesImplementation
 *
 * Identifies a specific implementation instance that is described by the terminology capability
 * statement - i.e. a particular installation, rather than the capabilities of a software program.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesImplementation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesImplementation : FhirBackboneElement {

    /**
     * Describes this specific instance.
     */
    val description: String

    /**
     * Base URL for the implementation.
     */
    val url: String?
}

/**
 * TerminologyCapabilitiesImplementation
 *
 * Identifies a specific implementation instance that is described by the terminology capability
 * statement - i.e. a particular installation, rather than the capabilities of a software program.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesImplementation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesImplementation")
data class TerminologyCapabilitiesImplementation(

    @SerialName("description")
    override val description: String,

    @SerialName("url")
    override val url: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesImplementation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesImplementation"
    }
}

/**
 * FhirTerminologyCapabilitiesSoftware
 *
 * Software that is covered by this terminology capability statement. It is used when the statement
 * describes the capabilities of a particular software version, independent of an installation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesSoftware</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesSoftware : FhirBackboneElement {

    /**
     * A name the software is known by.
     */
    val name: String

    /**
     * Version covered by this statement.
     */
    val version: String?
}

/**
 * TerminologyCapabilitiesSoftware
 *
 * Software that is covered by this terminology capability statement. It is used when the statement
 * describes the capabilities of a particular software version, independent of an installation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesSoftware</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesSoftware")
data class TerminologyCapabilitiesSoftware(

    @SerialName("name")
    override val name: String,

    @SerialName("version")
    override val version: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesSoftware {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesSoftware"
    }
}

/**
 * FhirTerminologyCapabilitiesTranslation
 *
 * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesTranslation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesTranslation : FhirBackboneElement {

    /**
     * Whether the client must identify the map.
     */
    val needsMap: Bool
}

/**
 * TerminologyCapabilitiesTranslation
 *
 * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesTranslation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesTranslation")
data class TerminologyCapabilitiesTranslation(

    @SerialName("needsMap")
    override val needsMap: Bool,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesTranslation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesTranslation"
    }
}

/**
 * FhirTerminologyCapabilitiesValidateCode
 *
 * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html) operation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesValidateCode</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
interface FhirTerminologyCapabilitiesValidateCode : FhirBackboneElement {

    /**
     * Whether translations are validated.
     */
    val translations: Bool
}

/**
 * TerminologyCapabilitiesValidateCode
 *
 * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html) operation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities">TerminologyCapabilitiesValidateCode</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TerminologyCapabilities)
 */
@Serializable
@SerialName("TerminologyCapabilitiesValidateCode")
data class TerminologyCapabilitiesValidateCode(

    @SerialName("translations")
    override val translations: Bool,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTerminologyCapabilitiesValidateCode {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TerminologyCapabilitiesValidateCode"
    }
}
