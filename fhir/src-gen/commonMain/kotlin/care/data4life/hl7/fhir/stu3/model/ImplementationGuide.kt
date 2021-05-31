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

import care.data4life.hl7.fhir.stu3.codesystem.GuideDependencyType
import care.data4life.hl7.fhir.stu3.codesystem.GuidePageKind
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirImplementationGuide
 *
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather
 * all the parts of an implementation guide into a logical whole and to publish a computable definition
 * of all the parts.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuide</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuide : FhirDomainResource {

    /**
     * Logical URI to reference this implementation guide (globally unique).
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
     * The status of this implementation guide. Enables tracking the life-cycle of the
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
     * Natural language description of the implementation guide.
     */
    val description: String?

    /**
     * Context the content is intended to support.
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
     * FHIR Version this Implementation Guide targets.
     */
    val fhirVer: String?

    /**
     * Another Implementation guide this depends on.
     */
    val dependency: kotlin.collections.List<ImplementationGuideDependency>?

    /**
     * Group of resources as used in .page.package.
     */
    val pakkage: kotlin.collections.List<ImplementationGuidePackage>?

    /**
     * Profiles that apply globally.
     */
    val global: kotlin.collections.List<ImplementationGuideGlobal>?

    /**
     * Image, css, script, etc..
     */
    val binary: kotlin.collections.List<String>?

    /**
     * Page/Section in the Guide.
     */
    val page: ImplementationGuidePage?
}

/**
 * ImplementationGuide
 *
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather
 * all the parts of an implementation guide into a logical whole and to publish a computable definition
 * of all the parts.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuide</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
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

    @SerialName("fhirVersion")
    override val fhirVer: String? = null,

    @SerialName("dependency")
    override val dependency: kotlin.collections.List<ImplementationGuideDependency>? = null,

    @SerialName("package")
    override val pakkage: kotlin.collections.List<ImplementationGuidePackage>? = null,

    @SerialName("global")
    override val global: kotlin.collections.List<ImplementationGuideGlobal>? = null,

    @SerialName("binary")
    override val binary: kotlin.collections.List<String>? = null,

    @SerialName("page")
    override val page: ImplementationGuidePage? = null,

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

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImplementationGuide"
    }
}

/**
 * FhirImplementationGuideDependency
 *
 * Another implementation guide that this implementation depends on. Typically, an implementation guide
 * uses value sets, profiles etc.defined in other implementation guides.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDependency</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideDependency : FhirBackboneElement {

    /**
     * How the dependency is represented when the guide is published.
     */
    val type: GuideDependencyType

    /**
     * Where to find dependency.
     */
    val uri: String
}

/**
 * ImplementationGuideDependency
 *
 * Another implementation guide that this implementation depends on. Typically, an implementation guide
 * uses value sets, profiles etc.defined in other implementation guides.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideDependency</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideDependency")
data class ImplementationGuideDependency(

    @SerialName("type")
    override val type: GuideDependencyType,

    @SerialName("uri")
    override val uri: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideDependency {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImplementationGuideDependency"
    }
}

/**
 * FhirImplementationGuideGlobal
 *
 * A set of profiles that all resources covered by this implementation guide must conform to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideGlobal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuideGlobal : FhirBackboneElement {

    /**
     * The type of resource that all instances must conform to.
     */
    val type: ResourceType

    /**
     * Profile that all resources must conform to.
     */
    val profile: Reference
}

/**
 * ImplementationGuideGlobal
 *
 * A set of profiles that all resources covered by this implementation guide must conform to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuideGlobal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuideGlobal")
data class ImplementationGuideGlobal(

    @SerialName("type")
    override val type: ResourceType,

    @SerialName("profile")
    override val profile: Reference,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuideGlobal {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImplementationGuideGlobal"
    }
}

/**
 * FhirImplementationGuidePackage
 *
 * A logical group of resources. Logical groups can be used when building pages.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuidePackage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuidePackage : FhirBackboneElement {

    /**
     * Name used .page.package.
     */
    val name: String

    /**
     * Human readable text describing the package.
     */
    val description: String?

    /**
     * Resource in the implementation guide.
     */
    val resource: kotlin.collections.List<ImplementationGuidePackageResource>
}

/**
 * ImplementationGuidePackage
 *
 * A logical group of resources. Logical groups can be used when building pages.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuidePackage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuidePackage")
data class ImplementationGuidePackage(

    @SerialName("name")
    override val name: String,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("resource")
    override val resource: kotlin.collections.List<ImplementationGuidePackageResource>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuidePackage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImplementationGuidePackage"
    }
}

/**
 * FhirImplementationGuidePackageResource
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure
 * definition, capability statements etc.) are obvious candidates for inclusion, but any kind of
 * resource can be included as an example resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuidePackageResource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuidePackageResource : FhirBackboneElement {

    /**
     * If not an example, has its normal meaning.
     */
    val example: Bool

    /**
     * Human Name for the resource.
     */
    val name: String?

    /**
     * Reason why included in guide.
     */
    val description: String?

    /**
     * Short code to identify the resource.
     */
    val acronym: String?

    /**
     * Location of the resource.
     */
    val sourceUri: String?

    /**
     * Location of the resource.
     */
    val sourceReference: Reference?

    /**
     * Resource this is an example of (if applicable).
     */
    val exampleFor: Reference?
}

/**
 * ImplementationGuidePackageResource
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure
 * definition, capability statements etc.) are obvious candidates for inclusion, but any kind of
 * resource can be included as an example resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuidePackageResource</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuidePackageResource")
data class ImplementationGuidePackageResource(

    @SerialName("example")
    override val example: Bool,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("acronym")
    override val acronym: String? = null,

    @SerialName("sourceUri")
    override val sourceUri: String? = null,

    @SerialName("sourceReference")
    override val sourceReference: Reference? = null,

    @SerialName("exampleFor")
    override val exampleFor: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuidePackageResource {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImplementationGuidePackageResource"
    }
}

/**
 * FhirImplementationGuidePage
 *
 * A page / section in the implementation guide. The root page is the implementation guide home page.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuidePage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
interface FhirImplementationGuidePage : FhirBackboneElement {

    /**
     * Where to find that page.
     */
    val source: String

    /**
     * Short title shown for navigational assistance.
     */
    val title: String

    /**
     * The kind of page that this is. Some pages are autogenerated (list, example), and
     * other kinds are of interest so that tools can navigate the user to the page of
     * interest.
     */
    val kind: GuidePageKind

    /**
     * For constructed pages, what kind of resources to include in the list.
     */
    val type: kotlin.collections.List<ResourceType>?

    /**
     * Name of package to include.
     */
    val pakkage: kotlin.collections.List<String>?

    /**
     * Format of the page (e.g. html, markdown, etc.).
     */
    val format: String?

    /**
     * Nested Pages / Sections.
     */
    val page: kotlin.collections.List<ImplementationGuidePage>?
}

/**
 * ImplementationGuidePage
 *
 * A page / section in the implementation guide. The root page is the implementation guide home page.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ImplementationGuide">ImplementationGuidePage</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ImplementationGuide)
 */
@Serializable
@SerialName("ImplementationGuidePage")
data class ImplementationGuidePage(

    @SerialName("source")
    override val source: String,

    @SerialName("title")
    override val title: String,

    @SerialName("kind")
    override val kind: GuidePageKind,

    @SerialName("type")
    override val type: kotlin.collections.List<ResourceType>? = null,

    @SerialName("package")
    override val pakkage: kotlin.collections.List<String>? = null,

    @SerialName("format")
    override val format: String? = null,

    @SerialName("page")
    override val page: kotlin.collections.List<ImplementationGuidePage>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirImplementationGuidePage {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ImplementationGuidePage"
    }
}
