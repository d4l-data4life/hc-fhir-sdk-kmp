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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirCodeSystem : FhirDomainResource {

    // Canonical identifier for this code system, represented as a URI (globally unique) (Coding.system).
    val url: String?

    // Additional identifier for the code system (business identifier).
    val identifier: List<Identifier>?

    // Business version of the code system (Coding.version).
    val version: String?

    // Name for this code system (computer friendly).
    val name: String?

    // Name for this code system (human friendly).
    val title: String?

    // The date (and optionally time) when the code system resource was created or revised.
    val status: PublicationStatus

    // For testing purposes, not real usage.
    val experimental: Bool?

    // Date last changed.
    val date: DateTime?

    // Name of the publisher (organization or individual).
    val publisher: String?

    // Contact details for the publisher.
    val contact: List<ContactDetail>?

    // Natural language description of the code system.
    val description: String?

    // The context that the content is intended to support.
    val useContext: List<UsageContext>?

    // Intended jurisdiction for code system (if applicable).
    val jurisdiction: List<CodeableConcept>?

    // Why this code system is defined.
    val purpose: String?

    // Use and/or publishing restrictions.
    val copyright: String?

    // If code comparison is case sensitive.
    val caseSensitive: Bool?

    // Canonical reference to the value set with entire code system.
    val valueSet: String?

    // The meaning of the hierarchy of concepts as represented in this resource.
    val hierarchyMeaning: CodeSystemHierarchyMeaning?

    // If code system defines a compositional grammar.
    val compositional: Bool?

    // If definitions are not stable.
    val versionNeeded: Bool?

    // The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
    val content: CodeSystemContentMode

    // Canonical URL of Code System this adds designations and properties to.
    val supplements: String?

    // Total concepts in the code system.
    val count: UnsignedInteger?

    // Filter that can be used in a value set.
    val filter: List<CodeSystemFilter>?

    // Additional information supplied about each concept.
    val property: List<CodeSystemProperty>?

    // Concepts in the code system.
    val concept: List<CodeSystemConcept>?
}

/**
 * ClassName: CodeSystem
 *
 * SourceFileName: CodeSystem.kt
 *
 *
 * The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystem</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystem")
data class CodeSystem(

    // Canonical identifier for this code system, represented as a URI (globally unique) (Coding.system).
    @SerialName("url")
    override val url: String? = null,
    // Additional identifier for the code system (business identifier).
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Business version of the code system (Coding.version).
    @SerialName("version")
    override val version: String? = null,
    // Name for this code system (computer friendly).
    @SerialName("name")
    override val name: String? = null,
    // Name for this code system (human friendly).
    @SerialName("title")
    override val title: String? = null,
    // The date (and optionally time) when the code system resource was created or revised.
    @SerialName("status")
    override val status: PublicationStatus,
    // For testing purposes, not real usage.
    @SerialName("experimental")
    override val experimental: Bool? = null,
    // Date last changed.
    @SerialName("date")
    override val date: DateTime? = null,
    // Name of the publisher (organization or individual).
    @SerialName("publisher")
    override val publisher: String? = null,
    // Contact details for the publisher.
    @SerialName("contact")
    override val contact: List<ContactDetail>? = null,
    // Natural language description of the code system.
    @SerialName("description")
    override val description: String? = null,
    // The context that the content is intended to support.
    @SerialName("useContext")
    override val useContext: List<UsageContext>? = null,
    // Intended jurisdiction for code system (if applicable).
    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,
    // Why this code system is defined.
    @SerialName("purpose")
    override val purpose: String? = null,
    // Use and/or publishing restrictions.
    @SerialName("copyright")
    override val copyright: String? = null,
    // If code comparison is case sensitive.
    @SerialName("caseSensitive")
    override val caseSensitive: Bool? = null,
    // Canonical reference to the value set with entire code system.
    @SerialName("valueSet")
    override val valueSet: String? = null,
    // The meaning of the hierarchy of concepts as represented in this resource.
    @SerialName("hierarchyMeaning")
    override val hierarchyMeaning: CodeSystemHierarchyMeaning? = null,
    // If code system defines a compositional grammar.
    @SerialName("compositional")
    override val compositional: Bool? = null,
    // If definitions are not stable.
    @SerialName("versionNeeded")
    override val versionNeeded: Bool? = null,
    // The extent of the content of the code system (the concepts and codes it defines) are represented in this resource instance.
    @SerialName("content")
    override val content: CodeSystemContentMode,
    // Canonical URL of Code System this adds designations and properties to.
    @SerialName("supplements")
    override val supplements: String? = null,
    // Total concepts in the code system.
    @SerialName("count")
    override val count: UnsignedInteger? = null,
    // Filter that can be used in a value set.
    @SerialName("filter")
    override val filter: List<CodeSystemFilter>? = null,
    // Additional information supplied about each concept.
    @SerialName("property")
    override val property: List<CodeSystemProperty>? = null,
    // Concepts in the code system.
    @SerialName("concept")
    override val concept: List<CodeSystemConcept>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource
    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,
    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,
    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    // Language of the resource content.
    @SerialName("language")
    override val language: String? = null
) : FhirCodeSystem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CodeSystem"
    }
}

interface FhirCodeSystemConcept : FhirBackboneElement {

    // Code that identifies concept.
    val code: String

    // Text to display to the user.
    val display: String?

    // Formal definition.
    val definition: String?

    // Additional representations for the concept.
    val designation: List<CodeSystemConceptDesignation>?

    // Property value for the concept.
    val property: List<CodeSystemConceptProperty>?

    // Child Concepts (is-a/contains/categorizes).
    val concept: List<CodeSystemConcept>?
}

/**
 * ClassName: CodeSystemConcept
 *
 * SourceFileName: CodeSystem.kt
 *
 *
 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meanings of the hierarchical relationships are.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConcept</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemConcept")
data class CodeSystemConcept(

    // Code that identifies concept.
    @SerialName("code")
    override val code: String,
    // Text to display to the user.
    @SerialName("display")
    override val display: String? = null,
    // Formal definition.
    @SerialName("definition")
    override val definition: String? = null,
    // Additional representations for the concept.
    @SerialName("designation")
    override val designation: List<CodeSystemConceptDesignation>? = null,
    // Property value for the concept.
    @SerialName("property")
    override val property: List<CodeSystemConceptProperty>? = null,
    // Child Concepts (is-a/contains/categorizes).
    @SerialName("concept")
    override val concept: List<CodeSystemConcept>? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCodeSystemConcept {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CodeSystemConcept"
    }
}

interface FhirCodeSystemConceptDesignation : FhirBackboneElement {

    // Human language of the designation.
    val language: String?

    // Details how this designation would be used.
    val use: Coding?

    // The text value for this designation.
    val value: String
}

/**
 * ClassName: CodeSystemConceptDesignation
 *
 * SourceFileName: CodeSystem.kt
 *
 *
 * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemConceptDesignation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemConceptDesignation")
data class CodeSystemConceptDesignation(

    // Human language of the designation.
    @SerialName("language")
    override val language: String? = null,
    // Details how this designation would be used.
    @SerialName("use")
    override val use: Coding? = null,
    // The text value for this designation.
    @SerialName("value")
    override val value: String,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCodeSystemConceptDesignation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CodeSystemConceptDesignation"
    }
}

interface FhirCodeSystemConceptProperty : FhirBackboneElement {

    // Reference to CodeSystem.property.code.
    val code: String

    // Value of the property for this concept.
    val valueCode: String?

    // Value of the property for this concept.
    val valueCoding: Coding?

    // Value of the property for this concept.
    val valueString: String?

    // Value of the property for this concept.
    val valueInteger: Integer?

    // Value of the property for this concept.
    val valueBoolean: Bool?

    // Value of the property for this concept.
    val valueDateTime: DateTime?

    // Value of the property for this concept.
    val valueDecimal: Decimal?
}

/**
 * ClassName: CodeSystemConceptProperty
 *
 * SourceFileName: CodeSystem.kt
 *
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

    // Reference to CodeSystem.property.code.
    @SerialName("code")
    override val code: String,
    // Value of the property for this concept.
    @SerialName("valueCode")
    override val valueCode: String? = null,
    // Value of the property for this concept.
    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,
    // Value of the property for this concept.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Value of the property for this concept.
    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,
    // Value of the property for this concept.
    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,
    // Value of the property for this concept.
    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,
    // Value of the property for this concept.
    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCodeSystemConceptProperty {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CodeSystemConceptProperty"
    }
}

interface FhirCodeSystemFilter : FhirBackboneElement {

    // Code that identifies the filter.
    val code: String

    // How or why the filter is used.
    val description: String?

    // A list of operators that can be used with the filter.
    val operator: List<FilterOperator>

    // What to use for the value.
    val value: String
}

/**
 * ClassName: CodeSystemFilter
 *
 * SourceFileName: CodeSystem.kt
 *
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

    // Code that identifies the filter.
    @SerialName("code")
    override val code: String,
    // How or why the filter is used.
    @SerialName("description")
    override val description: String? = null,
    // A list of operators that can be used with the filter.
    @SerialName("operator")
    override val operator: List<FilterOperator>,
    // What to use for the value.
    @SerialName("value")
    override val value: String,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCodeSystemFilter {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CodeSystemFilter"
    }
}

interface FhirCodeSystemProperty : FhirBackboneElement {

    // Identifies the property on the concepts, and when referred to in operations.
    val code: String

    // Formal identifier for the property.
    val uri: String?

    // Why the property is defined, and/or what it conveys.
    val description: String?

    // The type of the property value. Properties of type "code" contain a code defined by the code system (e.g. a reference to another defined concept).
    val type: PropertyType
}

/**
 * ClassName: CodeSystemProperty
 *
 * SourceFileName: CodeSystem.kt
 *
 *
 * A property defines an additional slot through which additional information can be provided about a concept.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/CodeSystem">CodeSystemProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/CodeSystem)
 */
@Serializable
@SerialName("CodeSystemProperty")
data class CodeSystemProperty(

    // Identifies the property on the concepts, and when referred to in operations.
    @SerialName("code")
    override val code: String,
    // Formal identifier for the property.
    @SerialName("uri")
    override val uri: String? = null,
    // Why the property is defined, and/or what it conveys.
    @SerialName("description")
    override val description: String? = null,
    // The type of the property value. Properties of type "code" contain a code defined by the code system (e.g. a reference to another defined concept).
    @SerialName("type")
    override val type: PropertyType,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCodeSystemProperty {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "CodeSystemProperty"
    }
}
