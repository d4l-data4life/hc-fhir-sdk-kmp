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

import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.codesystem.SearchComparator
import care.data4life.hl7.fhir.stu3.codesystem.SearchModifierCode
import care.data4life.hl7.fhir.stu3.codesystem.SearchParamType
import care.data4life.hl7.fhir.stu3.codesystem.XPathUsageType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirSearchParameter
 *
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SearchParameter">SearchParameter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SearchParameter)
 */
interface FhirSearchParameter : FhirDomainResource {

    /**
     * Logical URI to reference this search parameter (globally unique).
     */
    val url: String

    /**
     * Business version of the search parameter.
     */
    val version: String?

    /**
     * Name for this search parameter (computer friendly).
     */
    val name: String

    /**
     * The status of this search parameter. Enables tracking the life-cycle of the
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
    val contact: List<ContactDetail>?

    /**
     * Context the content is intended to support.
     */
    val useContext: List<UsageContext>?

    /**
     * Intended jurisdiction for search parameter (if applicable).
     */
    val jurisdiction: List<CodeableConcept>?

    /**
     * Why this search parameter is defined.
     */
    val purpose: String?

    /**
     * Code used in URL.
     */
    val code: String

    /**
     * The base resource type(s) that this search parameter can be used against.
     */
    val base: List<ResourceType>

    /**
     * The type of value a search parameter refers to, and how the content is
     * interpreted.
     */
    val type: SearchParamType

    /**
     * Original Definition for the search parameter.
     */
    val derivedFrom: String?

    /**
     * Natural language description of the search parameter.
     */
    val description: String

    /**
     * FHIRPath expression that extracts the values.
     */
    val expression: String?

    /**
     * XPath that extracts the values.
     */
    val xpath: String?

    /**
     * How the search parameter relates to the set of elements returned by evaluating
     * the xpath query.
     */
    val xpathUsage: XPathUsageType?

    /**
     * Types of resource (if a resource is referenced).
     */
    val target: List<ResourceType>?

    /**
     * Comparators supported for the search parameter.
     */
    val comparator: List<SearchComparator>?

    /**
     * A modifier supported for the search parameter.
     */
    val modifier: List<SearchModifierCode>?

    /**
     * Chained names supported.
     */
    val chain: List<String>?

    /**
     * For Composite resources to define the parts.
     */
    val component: List<SearchParameterComponent>?
}

/**
 * SearchParameter
 *
 * SourceFileName: SearchParameter.kt
 *
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SearchParameter">SearchParameter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SearchParameter)
 */
@Serializable
@SerialName("SearchParameter")
data class SearchParameter(

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
    override val contact: List<ContactDetail>? = null,

    @SerialName("useContext")
    override val useContext: List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("code")
    override val code: String,

    @SerialName("base")
    override val base: List<ResourceType>,

    @SerialName("type")
    override val type: SearchParamType,

    @SerialName("derivedFrom")
    override val derivedFrom: String? = null,

    @SerialName("description")
    override val description: String,

    @SerialName("expression")
    override val expression: String? = null,

    @SerialName("xpath")
    override val xpath: String? = null,

    @SerialName("xpathUsage")
    override val xpathUsage: XPathUsageType? = null,

    @SerialName("target")
    override val target: List<ResourceType>? = null,

    @SerialName("comparator")
    override val comparator: List<SearchComparator>? = null,

    @SerialName("modifier")
    override val modifier: List<SearchModifierCode>? = null,

    @SerialName("chain")
    override val chain: List<String>? = null,

    @SerialName("component")
    override val component: List<SearchParameterComponent>? = null,

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
) : FhirSearchParameter {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SearchParameter"
    }
}

/**
 * FhirSearchParameterComponent
 *
 * Used to define the parts of a composite search parameter.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SearchParameter">SearchParameterComponent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SearchParameter)
 */
interface FhirSearchParameterComponent : FhirBackboneElement {

    /**
     * Defines how the part works.
     */
    val definition: Reference

    /**
     * Subexpression relative to main expression.
     */
    val expression: String
}

/**
 * SearchParameterComponent
 *
 * SourceFileName: SearchParameter.kt
 *
 * Used to define the parts of a composite search parameter.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SearchParameter">SearchParameterComponent</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/SearchParameter)
 */
@Serializable
@SerialName("SearchParameterComponent")
data class SearchParameterComponent(

    @SerialName("definition")
    override val definition: Reference,

    @SerialName("expression")
    override val expression: String,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSearchParameterComponent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SearchParameterComponent"
    }
}
