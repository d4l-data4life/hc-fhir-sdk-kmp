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

import care.data4life.hl7.fhir.r4.codesystem.CodeSystemContentMode
import care.data4life.hl7.fhir.r4.codesystem.CodeSystemHierarchyMeaning
import care.data4life.hl7.fhir.r4.codesystem.FilterOperator
import care.data4life.hl7.fhir.r4.codesystem.PropertyType
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirCodeSystem
 *
 * The CodeSystem resource is used to declare the existence of and describe a code system or code
 * system supplement and its key properties, and optionally define a part or all of its content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
interface FhirCodeSystem : FhirDomainResource {

    /**
     * Canonical identifier for this code system, represented as a URI (globally
     * unique) (Coding.system).
     */
    val url: String?

    /**
     * Additional identifier for the code system (business identifier).
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the code system (Coding.version).
     */
    val version: String?

    /**
     * Name for this code system (computer friendly).
     */
    val name: String?

    /**
     * Name for this code system (human friendly).
     */
    val title: String?

    /**
     * The date (and optionally time) when the code system resource was created or
     * revised.
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
     * Natural language description of the code system.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for code system (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this code system is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * If code comparison is case sensitive.
     */
    val caseSensitive: Bool?

    /**
     * Canonical reference to the value set with entire code system.
     */
    val valueSet: String?

    /**
     * The meaning of the hierarchy of concepts as represented in this resource.
     */
    val hierarchyMeaning: CodeSystemHierarchyMeaning?

    /**
     * If code system defines a compositional grammar.
     */
    val compositional: Bool?

    /**
     * If definitions are not stable.
     */
    val versionNeeded: Bool?

    /**
     * The extent of the content of the code system (the concepts and codes it defines)
     * are represented in this resource instance.
     */
    val content: CodeSystemContentMode

    /**
     * Canonical URL of Code System this adds designations and properties to.
     */
    val supplements: String?

    /**
     * Total concepts in the code system.
     */
    val count: UnsignedInteger?

    /**
     * Filter that can be used in a value set.
     */
    val filter: kotlin.collections.List<CodeSystemFilter>?

    /**
     * Additional information supplied about each concept.
     */
    val property: kotlin.collections.List<CodeSystemProperty>?

    /**
     * Concepts in the code system.
     */
    val concept: kotlin.collections.List<CodeSystemConcept>?
}

/**
 * CodeSystem
 *
 * The CodeSystem resource is used to declare the existence of and describe a code system or code
 * system supplement and its key properties, and optionally define a part or all of its content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystem")
data class CodeSystem(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

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

    @SerialName("caseSensitive")
    override val caseSensitive: Bool? = null,

    @SerialName("valueSet")
    override val valueSet: String? = null,

    @SerialName("hierarchyMeaning")
    override val hierarchyMeaning: CodeSystemHierarchyMeaning? = null,

    @SerialName("compositional")
    override val compositional: Bool? = null,

    @SerialName("versionNeeded")
    override val versionNeeded: Bool? = null,

    @SerialName("content")
    override val content: CodeSystemContentMode,

    @SerialName("supplements")
    override val supplements: String? = null,

    @SerialName("count")
    override val count: UnsignedInteger? = null,

    @SerialName("filter")
    override val filter: kotlin.collections.List<CodeSystemFilter>? = null,

    @SerialName("property")
    override val property: kotlin.collections.List<CodeSystemProperty>? = null,

    @SerialName("concept")
    override val concept: kotlin.collections.List<CodeSystemConcept>? = null,

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
) : FhirCodeSystem {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CodeSystem"
    }
}

/**
 * FhirCodeSystemConcept
 *
 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the
 * definitions must be consulted to determine what the meanings of the hierarchical relationships are.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConcept</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
interface FhirCodeSystemConcept : FhirBackboneElement {

    /**
     * Code that identifies concept.
     */
    val code: String

    /**
     * Text to display to the user.
     */
    val display: String?

    /**
     * Formal definition.
     */
    val definition: String?

    /**
     * Additional representations for the concept.
     */
    val designation: kotlin.collections.List<CodeSystemConceptDesignation>?

    /**
     * Property value for the concept.
     */
    val property: kotlin.collections.List<CodeSystemConceptProperty>?

    /**
     * Child Concepts (is-a/contains/categorizes).
     */
    val concept: kotlin.collections.List<CodeSystemConcept>?
}

/**
 * CodeSystemConcept
 *
 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the
 * definitions must be consulted to determine what the meanings of the hierarchical relationships are.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConcept</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemConcept")
data class CodeSystemConcept(

    @SerialName("code")
    override val code: String,

    @SerialName("display")
    override val display: String? = null,

    @SerialName("definition")
    override val definition: String? = null,

    @SerialName("designation")
    override val designation: kotlin.collections.List<CodeSystemConceptDesignation>? = null,

    @SerialName("property")
    override val property: kotlin.collections.List<CodeSystemConceptProperty>? = null,

    @SerialName("concept")
    override val concept: kotlin.collections.List<CodeSystemConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCodeSystemConcept {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CodeSystemConcept"
    }
}

/**
 * FhirCodeSystemConceptDesignation
 *
 * Additional representations for the concept - other languages, aliases, specialized purposes, used
 * for particular purposes, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConceptDesignation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
interface FhirCodeSystemConceptDesignation : FhirBackboneElement {

    /**
     * Human language of the designation.
     */
    val language: String?

    /**
     * Details how this designation would be used.
     */
    val use: Coding?

    /**
     * The text value for this designation.
     */
    val value: String
}

/**
 * CodeSystemConceptDesignation
 *
 * Additional representations for the concept - other languages, aliases, specialized purposes, used
 * for particular purposes, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConceptDesignation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemConceptDesignation")
data class CodeSystemConceptDesignation(

    @SerialName("language")
    override val language: String? = null,

    @SerialName("use")
    override val use: Coding? = null,

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
) : FhirCodeSystemConceptDesignation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CodeSystemConceptDesignation"
    }
}

/**
 * FhirCodeSystemConceptProperty
 *
 * A property value for this concept.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConceptProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
interface FhirCodeSystemConceptProperty : FhirBackboneElement {

    /**
     * Reference to CodeSystem.property.code.
     */
    val code: String

    /**
     * Value of the property for this concept.
     */
    val valueCode: String?

    /**
     * Value of the property for this concept.
     */
    val valueCoding: Coding?

    /**
     * Value of the property for this concept.
     */
    val valueString: String?

    /**
     * Value of the property for this concept.
     */
    val valueInteger: Integer?

    /**
     * Value of the property for this concept.
     */
    val valueBoolean: Bool?

    /**
     * Value of the property for this concept.
     */
    val valueDateTime: DateTime?

    /**
     * Value of the property for this concept.
     */
    val valueDecimal: Decimal?
}

/**
 * CodeSystemConceptProperty
 *
 * A property value for this concept.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConceptProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemConceptProperty")
data class CodeSystemConceptProperty(

    @SerialName("code")
    override val code: String,

    @SerialName("valueCode")
    override val valueCode: String? = null,

    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCodeSystemConceptProperty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CodeSystemConceptProperty"
    }
}

/**
 * FhirCodeSystemFilter
 *
 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
interface FhirCodeSystemFilter : FhirBackboneElement {

    /**
     * Code that identifies the filter.
     */
    val code: String

    /**
     * How or why the filter is used.
     */
    val description: String?

    /**
     * A list of operators that can be used with the filter.
     */
    val operator: kotlin.collections.List<FilterOperator>

    /**
     * What to use for the value.
     */
    val value: String
}

/**
 * CodeSystemFilter
 *
 * A filter that can be used in a value set compose statement when selecting concepts using a filter.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemFilter")
data class CodeSystemFilter(

    @SerialName("code")
    override val code: String,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("operator")
    override val operator: kotlin.collections.List<FilterOperator>,

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
) : FhirCodeSystemFilter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CodeSystemFilter"
    }
}

/**
 * FhirCodeSystemProperty
 *
 * A property defines an additional slot through which additional information can be provided about a
 * concept.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
interface FhirCodeSystemProperty : FhirBackboneElement {

    /**
     * Identifies the property on the concepts, and when referred to in operations.
     */
    val code: String

    /**
     * Formal identifier for the property.
     */
    val uri: String?

    /**
     * Why the property is defined, and/or what it conveys.
     */
    val description: String?

    /**
     * The type of the property value. Properties of type "code" contain a code defined
     * by the code system (e.g. a reference to another defined concept).
     */
    val type: PropertyType
}

/**
 * CodeSystemProperty
 *
 * A property defines an additional slot through which additional information can be provided about a
 * concept.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemProperty")
data class CodeSystemProperty(

    @SerialName("code")
    override val code: String,

    @SerialName("uri")
    override val uri: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("type")
    override val type: PropertyType,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirCodeSystemProperty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "CodeSystemProperty"
    }
}
