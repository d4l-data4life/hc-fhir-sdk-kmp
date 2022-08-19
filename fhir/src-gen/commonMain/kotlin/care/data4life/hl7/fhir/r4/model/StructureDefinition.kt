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

import care.data4life.hl7.fhir.r4.codesystem.ExtensionContextType
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.StructureDefinitionKind
import care.data4life.hl7.fhir.r4.codesystem.TypeDerivationRule
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirStructureDefinition
 *
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data
 * types defined in FHIR, and also for describing extensions and constraints on resources and data
 * types.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
interface FhirStructureDefinition : FhirDomainResource {

    /**
     * Canonical identifier for this structure definition, represented as a URI
     * (globally unique).
     */
    val url: String

    /**
     * Additional identifier for the structure definition.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the structure definition.
     */
    val version: String?

    /**
     * Name for this structure definition (computer friendly).
     */
    val name: String

    /**
     * Name for this structure definition (human friendly).
     */
    val title: String?

    /**
     * The status of this structure definition. Enables tracking the life-cycle of the
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
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Natural language description of the structure definition.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for structure definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this structure definition is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Assist with indexing and finding.
     */
    val keyword: kotlin.collections.List<Coding>?

    /**
     * FHIR Version this StructureDefinition targets.
     */
    val fhirVer: String?

    /**
     * External specification that the content is mapped to.
     */
    val mapping: kotlin.collections.List<StructureDefinitionMapping>?

    /**
     * Defines the kind of structure that this definition is describing.
     */
    val kind: StructureDefinitionKind

    /**
     * Whether the structure is abstract.
     */
    val abstrakt: Bool

    /**
     * If an extension, where it can be used in instances.
     */
    val context: kotlin.collections.List<StructureDefinitionContext>?

    /**
     * FHIRPath invariants - when the extension can be used.
     */
    val contextInvariant: kotlin.collections.List<String>?

    /**
     * Type defined or constrained by this structure.
     */
    val type: String

    /**
     * Definition that this type is constrained/specialized from.
     */
    val baseDefinition: String?

    /**
     * How the type relates to the baseDefinition.
     */
    val derivation: TypeDerivationRule?

    /**
     * Snapshot view of the structure.
     */
    val snapshot: StructureDefinitionSnapshot?

    /**
     * Differential view of the structure.
     */
    val differential: StructureDefinitionDifferential?
}

/**
 * StructureDefinition
 *
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data
 * types defined in FHIR, and also for describing extensions and constraints on resources and data
 * types.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
@Serializable
@SerialName("StructureDefinition")
data class StructureDefinition(

    @SerialName("url")
    override val url: String,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

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

    @SerialName("keyword")
    override val keyword: kotlin.collections.List<Coding>? = null,

    @SerialName("fhirVersion")
    override val fhirVer: String? = null,

    @SerialName("mapping")
    override val mapping: kotlin.collections.List<StructureDefinitionMapping>? = null,

    @SerialName("kind")
    override val kind: StructureDefinitionKind,

    @SerialName("abstract")
    override val abstrakt: Bool,

    @SerialName("context")
    override val context: kotlin.collections.List<StructureDefinitionContext>? = null,

    @SerialName("contextInvariant")
    override val contextInvariant: kotlin.collections.List<String>? = null,

    @SerialName("type")
    override val type: String,

    @SerialName("baseDefinition")
    override val baseDefinition: String? = null,

    @SerialName("derivation")
    override val derivation: TypeDerivationRule? = null,

    @SerialName("snapshot")
    override val snapshot: StructureDefinitionSnapshot? = null,

    @SerialName("differential")
    override val differential: StructureDefinitionDifferential? = null,

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
) : FhirStructureDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureDefinition"
    }
}

/**
 * FhirStructureDefinitionContext
 *
 * Identifies the types of resource or data type elements to which the extension can be applied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionContext</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
interface FhirStructureDefinitionContext : FhirBackboneElement {

    /**
     * Defines how to interpret the expression that defines what the context of the
     * extension is.
     */
    val type: ExtensionContextType

    /**
     * Where the extension can be used in instances.
     */
    val expression: String
}

/**
 * StructureDefinitionContext
 *
 * Identifies the types of resource or data type elements to which the extension can be applied.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionContext</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
@Serializable
@SerialName("StructureDefinitionContext")
data class StructureDefinitionContext(

    @SerialName("type")
    override val type: ExtensionContextType,

    @SerialName("expression")
    override val expression: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureDefinitionContext {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureDefinitionContext"
    }
}

/**
 * FhirStructureDefinitionDifferential
 *
 * A differential view is expressed relative to the base StructureDefinition - a statement of
 * differences that it applies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionDifferential</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
interface FhirStructureDefinitionDifferential : FhirBackboneElement {

    /**
     * Definition of elements in the resource (if no StructureDefinition).
     */
    val element: kotlin.collections.List<ElementDefinition>
}

/**
 * StructureDefinitionDifferential
 *
 * A differential view is expressed relative to the base StructureDefinition - a statement of
 * differences that it applies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionDifferential</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
@Serializable
@SerialName("StructureDefinitionDifferential")
data class StructureDefinitionDifferential(

    @SerialName("element")
    override val element: kotlin.collections.List<ElementDefinition>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureDefinitionDifferential {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureDefinitionDifferential"
    }
}

/**
 * FhirStructureDefinitionMapping
 *
 * An external specification that the content is mapped to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionMapping</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
interface FhirStructureDefinitionMapping : FhirBackboneElement {

    /**
     * Internal id when this mapping is used.
     */
    val identity: String

    /**
     * Identifies what this mapping refers to.
     */
    val uri: String?

    /**
     * Names what this mapping refers to.
     */
    val name: String?

    /**
     * Versions, Issues, Scope limitations etc..
     */
    val comment: String?
}

/**
 * StructureDefinitionMapping
 *
 * An external specification that the content is mapped to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionMapping</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
@Serializable
@SerialName("StructureDefinitionMapping")
data class StructureDefinitionMapping(

    @SerialName("identity")
    override val identity: String,

    @SerialName("uri")
    override val uri: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("comment")
    override val comment: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureDefinitionMapping {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureDefinitionMapping"
    }
}

/**
 * FhirStructureDefinitionSnapshot
 *
 * A snapshot view is expressed in a standalone form that can be used and interpreted without
 * considering the base StructureDefinition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionSnapshot</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
interface FhirStructureDefinitionSnapshot : FhirBackboneElement {

    /**
     * Definition of elements in the resource (if no StructureDefinition).
     */
    val element: kotlin.collections.List<ElementDefinition>
}

/**
 * StructureDefinitionSnapshot
 *
 * A snapshot view is expressed in a standalone form that can be used and interpreted without
 * considering the base StructureDefinition.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureDefinition">StructureDefinitionSnapshot</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureDefinition)
 */
@Serializable
@SerialName("StructureDefinitionSnapshot")
data class StructureDefinitionSnapshot(

    @SerialName("element")
    override val element: kotlin.collections.List<ElementDefinition>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureDefinitionSnapshot {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureDefinitionSnapshot"
    }
}
