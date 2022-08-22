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

import care.data4life.hl7.fhir.stu3.codesystem.CompartmentType
import care.data4life.hl7.fhir.stu3.codesystem.GraphCompartmentRule
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirGraphDefinition
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that
 * form a graph by following references. The Graph Definition resource defines a set and makes rules
 * about the set.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
interface FhirGraphDefinition : FhirDomainResource {

    /**
     * Logical URI to reference this graph definition (globally unique).
     */
    val url: String?

    /**
     * Business version of the graph definition.
     */
    val version: String?

    /**
     * Name for this graph definition (computer friendly).
     */
    val name: String

    /**
     * The status of this graph definition. Enables tracking the life-cycle of the
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
     * Natural language description of the graph definition.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for graph definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this graph definition is defined.
     */
    val purpose: String?

    /**
     * The type of FHIR resource at which instances of this graph start.
     */
    val start: ResourceType

    /**
     * Profile on base resource.
     */
    val profile: String?

    /**
     * Links this graph makes rules about.
     */
    val link: kotlin.collections.List<GraphDefinitionLink>?
}

/**
 * GraphDefinition
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that
 * form a graph by following references. The Graph Definition resource defines a set and makes rules
 * about the set.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
@Serializable
@SerialName("GraphDefinition")
data class GraphDefinition(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String,

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

    @SerialName("start")
    override val start: ResourceType,

    @SerialName("profile")
    override val profile: String? = null,

    @SerialName("link")
    override val link: kotlin.collections.List<GraphDefinitionLink>? = null,

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
) : FhirGraphDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GraphDefinition"
    }
}

/**
 * FhirGraphDefinitionLink
 *
 * Links this graph makes rules about
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinitionLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
interface FhirGraphDefinitionLink : FhirBackboneElement {

    /**
     * Path in the resource that contains the link.
     */
    val path: String

    /**
     * Which slice (if profiled).
     */
    val sliceName: String?

    /**
     * Minimum occurrences for this link.
     */
    val min: Integer?

    /**
     * Maximum occurrences for this link.
     */
    val max: String?

    /**
     * Why this link is specified.
     */
    val description: String?

    /**
     * Potential target for the link.
     */
    val target: kotlin.collections.List<GraphDefinitionLinkTarget>
}

/**
 * GraphDefinitionLink
 *
 * Links this graph makes rules about
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinitionLink</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
@Serializable
@SerialName("GraphDefinitionLink")
data class GraphDefinitionLink(

    @SerialName("path")
    override val path: String,

    @SerialName("sliceName")
    override val sliceName: String? = null,

    @SerialName("min")
    override val min: Integer? = null,

    @SerialName("max")
    override val max: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("target")
    override val target: kotlin.collections.List<GraphDefinitionLinkTarget>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirGraphDefinitionLink {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GraphDefinitionLink"
    }
}

/**
 * FhirGraphDefinitionLinkTarget
 *
 * Potential target for the link
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinitionLinkTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
interface FhirGraphDefinitionLinkTarget : FhirBackboneElement {

    /**
     * None
     */
    val type: ResourceType

    /**
     * Profile for the target resource.
     */
    val profile: String?

    /**
     * Compartment Consistency Rules.
     */
    val compartment: kotlin.collections.List<GraphDefinitionLinkTargetCompartment>?

    /**
     * Additional links from target resource.
     */
    val link: kotlin.collections.List<GraphDefinitionLink>?
}

/**
 * GraphDefinitionLinkTarget
 *
 * Potential target for the link
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinitionLinkTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
@Serializable
@SerialName("GraphDefinitionLinkTarget")
data class GraphDefinitionLinkTarget(

    @SerialName("type")
    override val type: ResourceType,

    @SerialName("profile")
    override val profile: String? = null,

    @SerialName("compartment")
    override val compartment: kotlin.collections.List<GraphDefinitionLinkTargetCompartment>? = null,

    @SerialName("link")
    override val link: kotlin.collections.List<GraphDefinitionLink>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirGraphDefinitionLinkTarget {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GraphDefinitionLinkTarget"
    }
}

/**
 * FhirGraphDefinitionLinkTargetCompartment
 *
 * Compartment Consistency Rules
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinitionLinkTargetCompartment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
interface FhirGraphDefinitionLinkTargetCompartment : FhirBackboneElement {

    /**
     * None
     */
    val code: CompartmentType

    /**
     * identical | matching | different | no-rule | custom.
     */
    val rule: GraphCompartmentRule

    /**
     * Custom rule, as a FHIRPath expression.
     */
    val expression: String?

    /**
     * Documentation for FHIRPath expression.
     */
    val description: String?
}

/**
 * GraphDefinitionLinkTargetCompartment
 *
 * Compartment Consistency Rules
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/GraphDefinition">GraphDefinitionLinkTargetCompartment</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/GraphDefinition)
 */
@Serializable
@SerialName("GraphDefinitionLinkTargetCompartment")
data class GraphDefinitionLinkTargetCompartment(

    @SerialName("code")
    override val code: CompartmentType,

    @SerialName("rule")
    override val rule: GraphCompartmentRule,

    @SerialName("expression")
    override val expression: String? = null,

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
) : FhirGraphDefinitionLinkTargetCompartment {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "GraphDefinitionLinkTargetCompartment"
    }
}
