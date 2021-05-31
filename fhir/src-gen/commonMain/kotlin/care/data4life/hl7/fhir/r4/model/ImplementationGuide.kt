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

import care.data4life.hl7.fhir.r4.codesystem.GuidePageGeneration
import care.data4life.hl7.fhir.r4.codesystem.GuideParameterCode
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirImplementationGuide
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically
 * through the use of FHIR resources. This resource is used to gather all the parts of an
 * implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuide</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuide : FhirDomainResource {

    /**
     * Canonical identifier for this implementation guide, represented as a URI
     * (globally unique).
     */
    val url: String

    /**
     * Business version of the implementation guide.
     */
    val version: String?

    /**
     * Name for this implementation guide (computer friendly).
     */
    val name: String

    /**
     * Name for this implementation guide (human friendly).
     */
    val title: String?

    /**
     * The status of this implementation guide. Enables tracking the life-cycle of the
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
     * Natural language description of the implementation guide.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for implementation guide (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * NPM Package name for IG.
     */
    val packageId: String

    /**
     * SPDX license code for this IG (or not-open-source).
     */
    val license: String?

    /**
     * FHIR Version(s) this Implementation Guide targets.
     */
    val fhirVer: kotlin.collections.List<String>

    /**
     * Another Implementation guide this depends on.
     */
    val dependsOn: kotlin.collections.List<ImplementationGuideDependsOn>?

    /**
     * Profiles that apply globally.
     */
    val global: kotlin.collections.List<ImplementationGuideGlobal>?

    /**
     * Information needed to build the IG.
     */
    val definition: ImplementationGuideDefinition?

    /**
     * Information about an assembled IG.
     */
    val manifest: ImplementationGuideManifest?
}

/**
 * ImplementationGuide
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically
 * through the use of FHIR resources. This resource is used to gather all the parts of an
 * implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuide</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuide")
data class ImplementationGuide(

    @SerialName("url")
    override val url: String,

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

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("packageId")
    override val packageId: String,

    @SerialName("license")
    override val license: String? = null,

    @SerialName("fhirVersion")
    override val fhirVer: kotlin.collections.List<String>,

    @SerialName("dependsOn")
    override val dependsOn: kotlin.collections.List<ImplementationGuideDependsOn>? = null,

    @SerialName("global")
    override val global: kotlin.collections.List<ImplementationGuideGlobal>? = null,

    @SerialName("definition")
    override val definition: ImplementationGuideDefinition? = null,

    @SerialName("manifest")
    override val manifest: ImplementationGuideManifest? = null,

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
) : FhirImplementationGuide {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuide"
    }
}

/**
 * FhirImplementationGuideDefinition
 *
 * The information needed by an IG publisher tool to publish the whole implementation guide.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDefinition : FhirBackboneElement {

    /**
     * Grouping used to present related resources in the IG.
     */
    val grouping: kotlin.collections.List<ImplementationGuideDefinitionGrouping>?

    /**
     * Resource in the implementation guide.
     */
    val resource: kotlin.collections.List<ImplementationGuideDefinitionResource>

    /**
     * Page/Section in the Guide.
     */
    val page: ImplementationGuideDefinitionPage?

    /**
     * Defines how IG is built by tools.
     */
    val parameter: kotlin.collections.List<ImplementationGuideDefinitionParameter>?

    /**
     * A template for building resources.
     */
    val template: kotlin.collections.List<ImplementationGuideDefinitionTemplate>?
}

/**
 * ImplementationGuideDefinition
 *
 * The information needed by an IG publisher tool to publish the whole implementation guide.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDefinition")
data class ImplementationGuideDefinition(

    @SerialName("grouping")
    override val grouping: kotlin.collections.List<ImplementationGuideDefinitionGrouping>? = null,

    @SerialName("resource")
    override val resource: kotlin.collections.List<ImplementationGuideDefinitionResource>,

    @SerialName("page")
    override val page: ImplementationGuideDefinitionPage? = null,

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<ImplementationGuideDefinitionParameter>? = null,

    @SerialName("template")
    override val template: kotlin.collections.List<ImplementationGuideDefinitionTemplate>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideDefinition"
    }
}

/**
 * FhirImplementationGuideDefinitionGrouping
 *
 * A logical group of resources. Logical groups can be used when building pages.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionGrouping</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDefinitionGrouping : FhirBackboneElement {

    /**
     * Descriptive name for the package.
     */
    val name: String

    /**
     * Human readable text describing the package.
     */
    val description: String?
}

/**
 * ImplementationGuideDefinitionGrouping
 *
 * A logical group of resources. Logical groups can be used when building pages.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionGrouping</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDefinitionGrouping")
data class ImplementationGuideDefinitionGrouping(

    @SerialName("name")
    override val name: String,

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
) : FhirImplementationGuideDefinitionGrouping {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideDefinitionGrouping"
    }
}

/**
 * FhirImplementationGuideDefinitionPage
 *
 * A page / section in the implementation guide. The root page is the implementation guide home page.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionPage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDefinitionPage : FhirBackboneElement {

    /**
     * Where to find that page.
     */
    val nameUrl: String?

    /**
     * Where to find that page.
     */
    val nameReference: Reference?

    /**
     * Short title shown for navigational assistance.
     */
    val title: String

    /**
     * A code that indicates how the page is generated.
     */
    val generation: GuidePageGeneration

    /**
     * Nested Pages / Sections.
     */
    val page: kotlin.collections.List<ImplementationGuideDefinitionPage>?
}

/**
 * ImplementationGuideDefinitionPage
 *
 * A page / section in the implementation guide. The root page is the implementation guide home page.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionPage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDefinitionPage")
data class ImplementationGuideDefinitionPage(

    @SerialName("nameUrl")
    override val nameUrl: String? = null,

    @SerialName("nameReference")
    override val nameReference: Reference? = null,

    @SerialName("title")
    override val title: String,

    @SerialName("generation")
    override val generation: GuidePageGeneration,

    @SerialName("page")
    override val page: kotlin.collections.List<ImplementationGuideDefinitionPage>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideDefinitionPage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideDefinitionPage"
    }
}

/**
 * FhirImplementationGuideDefinitionParameter
 *
 * Defines how IG is built by tools
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDefinitionParameter : FhirBackboneElement {

    /**
     * None
     */
    val code: GuideParameterCode

    /**
     * Value for named type.
     */
    val value: String
}

/**
 * ImplementationGuideDefinitionParameter
 *
 * Defines how IG is built by tools
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDefinitionParameter")
data class ImplementationGuideDefinitionParameter(

    @SerialName("code")
    override val code: GuideParameterCode,

    @SerialName("value")
    override val value: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideDefinitionParameter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideDefinitionParameter"
    }
}

/**
 * FhirImplementationGuideDefinitionResource
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure
 * definition, capability statements etc.) are obvious candidates for inclusion, but any kind of
 * resource can be included as an example resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDefinitionResource : FhirBackboneElement {

    /**
     * Location of the resource.
     */
    val reference: Reference

    /**
     * Versions this applies to (if different to IG).
     */
    val fhirVer: kotlin.collections.List<String>?

    /**
     * Human Name for the resource.
     */
    val name: String?

    /**
     * Reason why included in guide.
     */
    val description: String?

    /**
     * Is an example/What is this an example of?.
     */
    val exampleBoolean: Bool?

    /**
     * Is an example/What is this an example of?.
     */
    val exampleCanonical: String?

    /**
     * Grouping this is part of.
     */
    val groupingId: String?
}

/**
 * ImplementationGuideDefinitionResource
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure
 * definition, capability statements etc.) are obvious candidates for inclusion, but any kind of
 * resource can be included as an example resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDefinitionResource")
data class ImplementationGuideDefinitionResource(

    @SerialName("reference")
    override val reference: Reference,

    @SerialName("fhirVersion")
    override val fhirVer: kotlin.collections.List<String>? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("exampleBoolean")
    override val exampleBoolean: Bool? = null,

    @SerialName("exampleCanonical")
    override val exampleCanonical: String? = null,

    @SerialName("groupingId")
    override val groupingId: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideDefinitionResource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideDefinitionResource"
    }
}

/**
 * FhirImplementationGuideDefinitionTemplate
 *
 * A template for building resources
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionTemplate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDefinitionTemplate : FhirBackboneElement {

    /**
     * Type of template specified.
     */
    val code: String

    /**
     * The source location for the template.
     */
    val source: String

    /**
     * The scope in which the template applies.
     */
    val scope: String?
}

/**
 * ImplementationGuideDefinitionTemplate
 *
 * A template for building resources
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDefinitionTemplate</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDefinitionTemplate")
data class ImplementationGuideDefinitionTemplate(

    @SerialName("code")
    override val code: String,

    @SerialName("source")
    override val source: String,

    @SerialName("scope")
    override val scope: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideDefinitionTemplate {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideDefinitionTemplate"
    }
}

/**
 * FhirImplementationGuideDependsOn
 *
 * Another implementation guide that this implementation depends on. Typically, an implementation guide
 * uses value sets, profiles etc.defined in other implementation guides.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDependsOn</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDependsOn : FhirBackboneElement {

    /**
     * Identity of the IG that this depends on.
     */
    val uri: String

    /**
     * NPM Package name for IG this depends on.
     */
    val packageId: String?

    /**
     * Version of the IG.
     */
    val version: String?
}

/**
 * ImplementationGuideDependsOn
 *
 * Another implementation guide that this implementation depends on. Typically, an implementation guide
 * uses value sets, profiles etc.defined in other implementation guides.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDependsOn</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDependsOn")
data class ImplementationGuideDependsOn(

    @SerialName("uri")
    override val uri: String,

    @SerialName("packageId")
    override val packageId: String? = null,

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
) : FhirImplementationGuideDependsOn {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideDependsOn"
    }
}

/**
 * FhirImplementationGuideGlobal
 *
 * A set of profiles that all resources covered by this implementation guide must conform to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideGlobal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideGlobal : FhirBackboneElement {

    /**
     * The type of resource that all instances must conform to.
     */
    val type: ResourceType

    /**
     * Profile that all resources must conform to.
     */
    val profile: String
}

/**
 * ImplementationGuideGlobal
 *
 * A set of profiles that all resources covered by this implementation guide must conform to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideGlobal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideGlobal")
data class ImplementationGuideGlobal(

    @SerialName("type")
    override val type: ResourceType,

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
) : FhirImplementationGuideGlobal {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideGlobal"
    }
}

/**
 * FhirImplementationGuideManifest
 *
 * Information about an assembled implementation guide, created by the publication tooling.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideManifest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideManifest : FhirBackboneElement {

    /**
     * Location of rendered implementation guide.
     */
    val rendering: String?

    /**
     * Resource in the implementation guide.
     */
    val resource: kotlin.collections.List<ImplementationGuideManifestResource>

    /**
     * HTML page within the parent IG.
     */
    val page: kotlin.collections.List<ImplementationGuideManifestPage>?

    /**
     * Image within the IG.
     */
    val image: kotlin.collections.List<String>?

    /**
     * Additional linkable file in IG.
     */
    val other: kotlin.collections.List<String>?
}

/**
 * ImplementationGuideManifest
 *
 * Information about an assembled implementation guide, created by the publication tooling.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideManifest</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideManifest")
data class ImplementationGuideManifest(

    @SerialName("rendering")
    override val rendering: String? = null,

    @SerialName("resource")
    override val resource: kotlin.collections.List<ImplementationGuideManifestResource>,

    @SerialName("page")
    override val page: kotlin.collections.List<ImplementationGuideManifestPage>? = null,

    @SerialName("image")
    override val image: kotlin.collections.List<String>? = null,

    @SerialName("other")
    override val other: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideManifest {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideManifest"
    }
}

/**
 * FhirImplementationGuideManifestPage
 *
 * Information about a page within the IG.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideManifestPage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideManifestPage : FhirBackboneElement {

    /**
     * HTML page name.
     */
    val name: String

    /**
     * Title of the page, for references.
     */
    val title: String?

    /**
     * Anchor available on the page.
     */
    val anchor: kotlin.collections.List<String>?
}

/**
 * ImplementationGuideManifestPage
 *
 * Information about a page within the IG.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideManifestPage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideManifestPage")
data class ImplementationGuideManifestPage(

    @SerialName("name")
    override val name: String,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("anchor")
    override val anchor: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideManifestPage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideManifestPage"
    }
}

/**
 * FhirImplementationGuideManifestResource
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure
 * definition, capability statements etc.) are obvious candidates for inclusion, but any kind of
 * resource can be included as an example resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideManifestResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideManifestResource : FhirBackboneElement {

    /**
     * Location of the resource.
     */
    val reference: Reference

    /**
     * Is an example/What is this an example of?.
     */
    val exampleBoolean: Bool?

    /**
     * Is an example/What is this an example of?.
     */
    val exampleCanonical: String?

    /**
     * Relative path for page in IG.
     */
    val relativePath: String?
}

/**
 * ImplementationGuideManifestResource
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure
 * definition, capability statements etc.) are obvious candidates for inclusion, but any kind of
 * resource can be included as an example resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideManifestResource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideManifestResource")
data class ImplementationGuideManifestResource(

    @SerialName("reference")
    override val reference: Reference,

    @SerialName("exampleBoolean")
    override val exampleBoolean: Bool? = null,

    @SerialName("exampleCanonical")
    override val exampleCanonical: String? = null,

    @SerialName("relativePath")
    override val relativePath: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideManifestResource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ImplementationGuideManifestResource"
    }
}
