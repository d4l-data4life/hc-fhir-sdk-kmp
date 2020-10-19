/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model

import care.data4life.fhir.stu3.codesystem.FilterOperator
import care.data4life.fhir.stu3.codesystem.PublicationStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic


interface FhirValueSet : FhirDomainResource {

    // Logical URI to reference this value set (globally unique).
    val url: String?

    // Additional identifier for the value set.
    val identifier: List<Identifier>?

    // Business version of the value set.
    val version: String?

    // Name for this value set (computer friendly).
    val name: String?

    // Name for this value set (human friendly).
    val title: String?

    // The status of this value set. Enables tracking the life-cycle of the content.
    val status: PublicationStatus

    // For testing purposes, not real usage.
    val experimental: String?

    // Date this was last changed.
    val date: String?

    // Name of the publisher (organization or individual).
    val publisher: String?

    // Contact details for the publisher.
    val contact: List<ContactDetail>?

    // Natural language description of the value set.
    val description: String?

    // Context the content is intended to support.
    val useContext: List<UsageContext>?

    // Intended jurisdiction for value set (if applicable).
    val jurisdiction: List<CodeableConcept>?

    // Indicates whether or not any change to the content logical definition may occur.
    val immutable: String?

    // Why this value set is defined.
    val purpose: String?

    // Use and/or publishing restrictions.
    val copyright: String?

    // Whether this is intended to be used with an extensible binding.
    val extensible: String?

    // Definition of the content of the value set (CLD).
    val compose: ValueSetCompose?

    // Used when the value set is "expanded".
    val expansion: ValueSetExpansion?
}


/**
 * ClassName: ValueSet
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * A value set specifies a set of codes drawn from one or more code systems.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSet")
data class ValueSet(

    // Logical URI to reference this value set (globally unique).
    @SerialName("url")
    override val url: String? = null,
    // Additional identifier for the value set.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Business version of the value set.
    @SerialName("version")
    override val version: String? = null,
    // Name for this value set (computer friendly).
    @SerialName("name")
    override val name: String? = null,
    // Name for this value set (human friendly).
    @SerialName("title")
    override val title: String? = null,
    // The status of this value set. Enables tracking the life-cycle of the content.
    @SerialName("status")
    override val status: PublicationStatus,
    // For testing purposes, not real usage.
    @SerialName("experimental")
    override val experimental: String? = null,
    // Date this was last changed.
    @SerialName("date")
    override val date: String? = null,
    // Name of the publisher (organization or individual).
    @SerialName("publisher")
    override val publisher: String? = null,
    // Contact details for the publisher.
    @SerialName("contact")
    override val contact: List<ContactDetail>? = null,
    // Natural language description of the value set.
    @SerialName("description")
    override val description: String? = null,
    // Context the content is intended to support.
    @SerialName("useContext")
    override val useContext: List<UsageContext>? = null,
    // Intended jurisdiction for value set (if applicable).
    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,
    // Indicates whether or not any change to the content logical definition may occur.
    @SerialName("immutable")
    override val immutable: String? = null,
    // Why this value set is defined.
    @SerialName("purpose")
    override val purpose: String? = null,
    // Use and/or publishing restrictions.
    @SerialName("copyright")
    override val copyright: String? = null,
    // Whether this is intended to be used with an extensible binding.
    @SerialName("extensible")
    override val extensible: String? = null,
    // Definition of the content of the value set (CLD).
    @SerialName("compose")
    override val compose: ValueSetCompose? = null,
    // Used when the value set is "expanded".
    @SerialName("expansion")
    override val expansion: ValueSetExpansion? = null,


    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional Content defined by implementations.
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
) : FhirValueSet {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSet"
    }
}


interface FhirValueSetCompose : FhirBackboneElement {

    // Fixed date for version-less references (transitive).
    val lockedDate: String?

    // Whether inactive codes are in the value set.
    val inactive: String?

    // Include one or more codes from a code system or other value set(s).
    val include: List<ValueSetComposeInclude>

    // Explicitly exclude codes from a code system or other value sets.
    val exclude: List<ValueSetComposeInclude>?
}


/**
 * ClassName: ValueSetCompose
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * A set of criteria that define the content logical definition of the value set by including or excluding codes from outside this value set. This I also known as the "Content Logical Definition" (CLD).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetCompose</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetCompose")
data class ValueSetCompose(

    // Fixed date for version-less references (transitive).
    @SerialName("lockedDate")
    override val lockedDate: String? = null,
    // Whether inactive codes are in the value set.
    @SerialName("inactive")
    override val inactive: String? = null,
    // Include one or more codes from a code system or other value set(s).
    @SerialName("include")
    override val include: List<ValueSetComposeInclude>,
    // Explicitly exclude codes from a code system or other value sets.
    @SerialName("exclude")
    override val exclude: List<ValueSetComposeInclude>? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetCompose {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetCompose"
    }
}


interface FhirValueSetComposeInclude : FhirBackboneElement {

    // The system the codes come from.
    val system: String?

    // Specific version of the code system referred to.
    val version: String?

    // A concept defined in the system.
    val concept: List<ValueSetComposeIncludeConcept>?

    // Select codes/concepts by their properties (including relationships).
    val filter: List<ValueSetComposeIncludeFilter>?

    // Select only contents included in this value set.
    val valueSet: List<String>?
}


/**
 * ClassName: ValueSetComposeInclude
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * Include one or more codes from a code system or other value set(s)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeInclude</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetComposeInclude")
data class ValueSetComposeInclude(

    // The system the codes come from.
    @SerialName("system")
    override val system: String? = null,
    // Specific version of the code system referred to.
    @SerialName("version")
    override val version: String? = null,
    // A concept defined in the system.
    @SerialName("concept")
    override val concept: List<ValueSetComposeIncludeConcept>? = null,
    // Select codes/concepts by their properties (including relationships).
    @SerialName("filter")
    override val filter: List<ValueSetComposeIncludeFilter>? = null,
    // Select only contents included in this value set.
    @SerialName("valueSet")
    override val valueSet: List<String>? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetComposeInclude {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetComposeInclude"
    }
}


interface FhirValueSetComposeIncludeConcept : FhirBackboneElement {

    // Code or expression from system.
    val code: String

    // Text to display for this code for this value set in this valueset.
    val display: String?

    // Additional representations for this concept.
    val designation: List<ValueSetComposeIncludeConceptDesignation>?
}


/**
 * ClassName: ValueSetComposeIncludeConcept
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * Specifies a concept to be included or excluded.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeConcept</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetComposeIncludeConcept")
data class ValueSetComposeIncludeConcept(

    // Code or expression from system.
    @SerialName("code")
    override val code: String,
    // Text to display for this code for this value set in this valueset.
    @SerialName("display")
    override val display: String? = null,
    // Additional representations for this concept.
    @SerialName("designation")
    override val designation: List<ValueSetComposeIncludeConceptDesignation>? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetComposeIncludeConcept {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetComposeIncludeConcept"
    }
}


interface FhirValueSetComposeIncludeConceptDesignation : FhirBackboneElement {

    // Human language of the designation.
    val language: String?

    // Details how this designation would be used.
    val use: Coding?

    // The text value for this designation.
    val value: String
}


/**
 * ClassName: ValueSetComposeIncludeConceptDesignation
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeConceptDesignation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetComposeIncludeConceptDesignation")
data class ValueSetComposeIncludeConceptDesignation(

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
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetComposeIncludeConceptDesignation {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetComposeIncludeConceptDesignation"
    }
}


interface FhirValueSetComposeIncludeFilter : FhirBackboneElement {

    // A property defined by the code system.
    val property: String

    // The kind of operation to perform as a part of the filter criteria.
    val op: FilterOperator

    // Code from the system, or regex criteria, or boolean value for exists.
    val value: String
}


/**
 * ClassName: ValueSetComposeIncludeFilter
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeFilter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetComposeIncludeFilter")
data class ValueSetComposeIncludeFilter(

    // A property defined by the code system.
    @SerialName("property")
    override val property: String,
    // The kind of operation to perform as a part of the filter criteria.
    @SerialName("op")
    override val op: FilterOperator,
    // Code from the system, or regex criteria, or boolean value for exists.
    @SerialName("value")
    override val value: String,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetComposeIncludeFilter {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetComposeIncludeFilter"
    }
}


interface FhirValueSetExpansion : FhirBackboneElement {

    // Uniquely identifies this expansion.
    val identifier: String

    // Time ValueSet expansion happened.
    val timestamp: String

    // Total number of codes in the expansion.
    val total: String?

    // Offset at which this resource starts.
    val offset: String?

    // Parameter that controlled the expansion process.
    val parameter: List<ValueSetExpansionParameter>?

    // Codes in the value set.
    val contains: List<ValueSetExpansionContains>?
}


/**
 * ClassName: ValueSetExpansion
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * A value set can also be "expanded", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansion</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetExpansion")
data class ValueSetExpansion(

    // Uniquely identifies this expansion.
    @SerialName("identifier")
    override val identifier: String,
    // Time ValueSet expansion happened.
    @SerialName("timestamp")
    override val timestamp: String,
    // Total number of codes in the expansion.
    @SerialName("total")
    override val total: String? = null,
    // Offset at which this resource starts.
    @SerialName("offset")
    override val offset: String? = null,
    // Parameter that controlled the expansion process.
    @SerialName("parameter")
    override val parameter: List<ValueSetExpansionParameter>? = null,
    // Codes in the value set.
    @SerialName("contains")
    override val contains: List<ValueSetExpansionContains>? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetExpansion {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetExpansion"
    }
}


interface FhirValueSetExpansionContains : FhirBackboneElement {

    // System value for the code.
    val system: String?

    // If user cannot select this entry.
    val `abstract`: String?

    // If concept is inactive in the code system.
    val inactive: String?

    // Version in which this code/display is defined.
    val version: String?

    // Code - if blank, this is not a selectable code.
    val code: String?

    // User display for the concept.
    val display: String?

    // Additional representations for this item.
    val designation: List<ValueSetComposeIncludeConceptDesignation>?

    // Codes contained under this entry.
    val contains: List<ValueSetExpansionContains>?
}


/**
 * ClassName: ValueSetExpansionContains
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * The codes that are contained in the value set expansion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansionContains</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetExpansionContains")
data class ValueSetExpansionContains(

    // System value for the code.
    @SerialName("system")
    override val system: String? = null,
    // If user cannot select this entry.
    @SerialName("abstract")
    override val `abstract`: String? = null,
    // If concept is inactive in the code system.
    @SerialName("inactive")
    override val inactive: String? = null,
    // Version in which this code/display is defined.
    @SerialName("version")
    override val version: String? = null,
    // Code - if blank, this is not a selectable code.
    @SerialName("code")
    override val code: String? = null,
    // User display for the concept.
    @SerialName("display")
    override val display: String? = null,
    // Additional representations for this item.
    @SerialName("designation")
    override val designation: List<ValueSetComposeIncludeConceptDesignation>? = null,
    // Codes contained under this entry.
    @SerialName("contains")
    override val contains: List<ValueSetExpansionContains>? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetExpansionContains {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetExpansionContains"
    }
}


interface FhirValueSetExpansionParameter : FhirBackboneElement {

    // Name as assigned by the server.
    val name: String

    // Value of the named parameter.
    val valueString: String?

    // Value of the named parameter.
    val valueBoolean: String?

    // Value of the named parameter.
    val valueInteger: String?

    // Value of the named parameter.
    val valueDecimal: String?

    // Value of the named parameter.
    val valueUri: String?

    // Value of the named parameter.
    val valueCode: String?
}


/**
 * ClassName: ValueSetExpansionParameter
 *
 * SourceFileName: ValueSet.kt
 *
 *
 * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansionParameter</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ValueSet) on 2020-10-01
 */
@Serializable
@SerialName("ValueSetExpansionParameter")
data class ValueSetExpansionParameter(

    // Name as assigned by the server.
    @SerialName("name")
    override val name: String,
    // Value of the named parameter.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Value of the named parameter.
    @SerialName("valueBoolean")
    override val valueBoolean: String? = null,
    // Value of the named parameter.
    @SerialName("valueInteger")
    override val valueInteger: String? = null,
    // Value of the named parameter.
    @SerialName("valueDecimal")
    override val valueDecimal: String? = null,
    // Value of the named parameter.
    @SerialName("valueUri")
    override val valueUri: String? = null,
    // Value of the named parameter.
    @SerialName("valueCode")
    override val valueCode: String? = null,


    // # BackboneElement
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,


    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirValueSetExpansionParameter {

    override val resourceType: kotlin.String
        get() = resourceType()


    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ValueSetExpansionParameter"
    }
}

