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

import care.data4life.hl7.fhir.r4.codesystem.FilterOperator
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirValueSet
 *
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended
 * for use in a particular context. Value sets link between [CodeSystem](codesystem.html) definitions
 * and their use in [coded elements](terminologies.html).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSet : FhirDomainResource {

    /**
     * Canonical identifier for this value set, represented as a URI (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the value set (business identifier).
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the value set.
     */
    val version: String?

    /**
     * Name for this value set (computer friendly).
     */
    val name: String?

    /**
     * Name for this value set (human friendly).
     */
    val title: String?

    /**
     * The status of this value set. Enables tracking the life-cycle of the content.
     * The status of the value set applies to the value set definition
     * (ValueSet.compose) and the associated ValueSet metadata. Expansions do not have
     * a state.
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
     * Natural language description of the value set.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for value set (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Indicates whether or not any change to the content logical definition may occur.
     */
    val immutable: Bool?

    /**
     * Why this value set is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Content logical definition of the value set (CLD).
     */
    val compose: ValueSetCompose?

    /**
     * Used when the value set is "expanded".
     */
    val expansion: ValueSetExpansion?
}

/**
 * ValueSet
 *
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended
 * for use in a particular context. Value sets link between [CodeSystem](codesystem.html) definitions
 * and their use in [coded elements](terminologies.html).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSet")
data class ValueSet(

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

    @SerialName("immutable")
    override val immutable: Bool? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("compose")
    override val compose: ValueSetCompose? = null,

    @SerialName("expansion")
    override val expansion: ValueSetExpansion? = null,

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
) : FhirValueSet {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSet"
    }
}

/**
 * FhirValueSetCompose
 *
 * A set of criteria that define the contents of the value set by including or excluding codes selected
 * from the specified code system(s) that the value set draws from. This is also known as the Content
 * Logical Definition (CLD).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetCompose</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetCompose : FhirBackboneElement {

    /**
     * Fixed date for references with no specified version (transitive).
     */
    val lockedDate: Date?

    /**
     * Whether inactive codes are in the value set.
     */
    val inactive: Bool?

    /**
     * Include one or more codes from a code system or other value set(s).
     */
    val include: kotlin.collections.List<ValueSetComposeInclude>

    /**
     * Explicitly exclude codes from a code system or other value sets.
     */
    val exclude: kotlin.collections.List<ValueSetComposeInclude>?
}

/**
 * ValueSetCompose
 *
 * A set of criteria that define the contents of the value set by including or excluding codes selected
 * from the specified code system(s) that the value set draws from. This is also known as the Content
 * Logical Definition (CLD).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetCompose</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetCompose")
data class ValueSetCompose(

    @SerialName("lockedDate")
    override val lockedDate: Date? = null,

    @SerialName("inactive")
    override val inactive: Bool? = null,

    @SerialName("include")
    override val include: kotlin.collections.List<ValueSetComposeInclude>,

    @SerialName("exclude")
    override val exclude: kotlin.collections.List<ValueSetComposeInclude>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirValueSetCompose {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetCompose"
    }
}

/**
 * FhirValueSetComposeInclude
 *
 * Include one or more codes from a code system or other value set(s)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeInclude</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetComposeInclude : FhirBackboneElement {

    /**
     * The system the codes come from.
     */
    val system: String?

    /**
     * Specific version of the code system referred to.
     */
    val version: String?

    /**
     * A concept defined in the system.
     */
    val concept: kotlin.collections.List<ValueSetComposeIncludeConcept>?

    /**
     * Select codes/concepts by their properties (including relationships).
     */
    val filter: kotlin.collections.List<ValueSetComposeIncludeFilter>?

    /**
     * Select the contents included in this value set.
     */
    val valueSet: kotlin.collections.List<String>?
}

/**
 * ValueSetComposeInclude
 *
 * Include one or more codes from a code system or other value set(s)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeInclude</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetComposeInclude")
data class ValueSetComposeInclude(

    @SerialName("system")
    override val system: String? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("concept")
    override val concept: kotlin.collections.List<ValueSetComposeIncludeConcept>? = null,

    @SerialName("filter")
    override val filter: kotlin.collections.List<ValueSetComposeIncludeFilter>? = null,

    @SerialName("valueSet")
    override val valueSet: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirValueSetComposeInclude {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetComposeInclude"
    }
}

/**
 * FhirValueSetComposeIncludeConcept
 *
 * Specifies a concept to be included or excluded.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeConcept</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetComposeIncludeConcept : FhirBackboneElement {

    /**
     * Code or expression from system.
     */
    val code: String

    /**
     * Text to display for this code for this value set in this valueset.
     */
    val display: String?

    /**
     * Additional representations for this concept.
     */
    val designation: kotlin.collections.List<ValueSetComposeIncludeConceptDesignation>?
}

/**
 * ValueSetComposeIncludeConcept
 *
 * Specifies a concept to be included or excluded.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeConcept</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetComposeIncludeConcept")
data class ValueSetComposeIncludeConcept(

    @SerialName("code")
    override val code: String,

    @SerialName("display")
    override val display: String? = null,

    @SerialName("designation")
    override val designation: kotlin.collections.List<ValueSetComposeIncludeConceptDesignation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirValueSetComposeIncludeConcept {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetComposeIncludeConcept"
    }
}

/**
 * FhirValueSetComposeIncludeConceptDesignation
 *
 * Additional representations for this concept when used in this value set - other languages, aliases,
 * specialized purposes, used for particular purposes, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeConceptDesignation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetComposeIncludeConceptDesignation : FhirBackboneElement {

    /**
     * Human language of the designation.
     */
    val language: String?

    /**
     * Types of uses of designations.
     */
    val use: Coding?

    /**
     * The text value for this designation.
     */
    val value: String
}

/**
 * ValueSetComposeIncludeConceptDesignation
 *
 * Additional representations for this concept when used in this value set - other languages, aliases,
 * specialized purposes, used for particular purposes, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeConceptDesignation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetComposeIncludeConceptDesignation")
data class ValueSetComposeIncludeConceptDesignation(

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
) : FhirValueSetComposeIncludeConceptDesignation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetComposeIncludeConceptDesignation"
    }
}

/**
 * FhirValueSetComposeIncludeFilter
 *
 * Select concepts by specify a matching criterion based on the properties (including relationships)
 * defined by the system, or on filters defined by the system. If multiple filters are specified, they
 * SHALL all be true.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetComposeIncludeFilter : FhirBackboneElement {

    /**
     * A property/filter defined by the code system.
     */
    val property: String

    /**
     * The kind of operation to perform as a part of the filter criteria.
     */
    val op: FilterOperator

    /**
     * Code from the system, or regex criteria, or boolean value for exists.
     */
    val value: String
}

/**
 * ValueSetComposeIncludeFilter
 *
 * Select concepts by specify a matching criterion based on the properties (including relationships)
 * defined by the system, or on filters defined by the system. If multiple filters are specified, they
 * SHALL all be true.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetComposeIncludeFilter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetComposeIncludeFilter")
data class ValueSetComposeIncludeFilter(

    @SerialName("property")
    override val property: String,

    @SerialName("op")
    override val op: FilterOperator,

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
) : FhirValueSetComposeIncludeFilter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetComposeIncludeFilter"
    }
}

/**
 * FhirValueSetExpansion
 *
 * A value set can also be "expanded", where the value set is turned into a simple collection of
 * enumerated codes. This element holds the expansion, if it has been performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetExpansion : FhirBackboneElement {

    /**
     * Identifies the value set expansion (business identifier).
     */
    val identifier: String?

    /**
     * Time ValueSet expansion happened.
     */
    val timestamp: DateTime

    /**
     * Total number of codes in the expansion.
     */
    val total: Integer?

    /**
     * Offset at which this resource starts.
     */
    val offset: Integer?

    /**
     * Parameter that controlled the expansion process.
     */
    val parameter: kotlin.collections.List<ValueSetExpansionParameter>?

    /**
     * Codes in the value set.
     */
    val contains: kotlin.collections.List<ValueSetExpansionContains>?
}

/**
 * ValueSetExpansion
 *
 * A value set can also be "expanded", where the value set is turned into a simple collection of
 * enumerated codes. This element holds the expansion, if it has been performed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansion</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetExpansion")
data class ValueSetExpansion(

    @SerialName("identifier")
    override val identifier: String? = null,

    @SerialName("timestamp")
    override val timestamp: DateTime,

    @SerialName("total")
    override val total: Integer? = null,

    @SerialName("offset")
    override val offset: Integer? = null,

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<ValueSetExpansionParameter>? = null,

    @SerialName("contains")
    override val contains: kotlin.collections.List<ValueSetExpansionContains>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirValueSetExpansion {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetExpansion"
    }
}

/**
 * FhirValueSetExpansionContains
 *
 * The codes that are contained in the value set expansion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansionContains</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetExpansionContains : FhirBackboneElement {

    /**
     * System value for the code.
     */
    val system: String?

    /**
     * If user cannot select this entry.
     */
    val abstrakt: Bool?

    /**
     * If concept is inactive in the code system.
     */
    val inactive: Bool?

    /**
     * Version in which this code/display is defined.
     */
    val version: String?

    /**
     * Code - if blank, this is not a selectable code.
     */
    val code: String?

    /**
     * User display for the concept.
     */
    val display: String?

    /**
     * Additional representations for this item.
     */
    val designation: kotlin.collections.List<ValueSetComposeIncludeConceptDesignation>?

    /**
     * Codes contained under this entry.
     */
    val contains: kotlin.collections.List<ValueSetExpansionContains>?
}

/**
 * ValueSetExpansionContains
 *
 * The codes that are contained in the value set expansion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansionContains</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetExpansionContains")
data class ValueSetExpansionContains(

    @SerialName("system")
    override val system: String? = null,

    @SerialName("abstract")
    override val abstrakt: Bool? = null,

    @SerialName("inactive")
    override val inactive: Bool? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("code")
    override val code: String? = null,

    @SerialName("display")
    override val display: String? = null,

    @SerialName("designation")
    override val designation: kotlin.collections.List<ValueSetComposeIncludeConceptDesignation>? = null,

    @SerialName("contains")
    override val contains: kotlin.collections.List<ValueSetExpansionContains>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirValueSetExpansionContains {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetExpansionContains"
    }
}

/**
 * FhirValueSetExpansionParameter
 *
 * A parameter that controlled the expansion process. These parameters may be used by users of expanded
 * value sets to check whether the expansion is suitable for a particular purpose, or to pick the
 * correct expansion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansionParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
interface FhirValueSetExpansionParameter : FhirBackboneElement {

    /**
     * Name as assigned by the client or server.
     */
    val name: String

    /**
     * Value of the named parameter.
     */
    val valueString: String?

    /**
     * Value of the named parameter.
     */
    val valueBoolean: Bool?

    /**
     * Value of the named parameter.
     */
    val valueInteger: Integer?

    /**
     * Value of the named parameter.
     */
    val valueDecimal: Decimal?

    /**
     * Value of the named parameter.
     */
    val valueUri: String?

    /**
     * Value of the named parameter.
     */
    val valueCode: String?

    /**
     * Value of the named parameter.
     */
    val valueDateTime: DateTime?
}

/**
 * ValueSetExpansionParameter
 *
 * A parameter that controlled the expansion process. These parameters may be used by users of expanded
 * value sets to check whether the expansion is suitable for a particular purpose, or to pick the
 * correct expansion.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ValueSet">ValueSetExpansionParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ValueSet)
 */
@Serializable
@SerialName("ValueSetExpansionParameter")
data class ValueSetExpansionParameter(

    @SerialName("name")
    override val name: String,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    @SerialName("valueUri")
    override val valueUri: String? = null,

    @SerialName("valueCode")
    override val valueCode: String? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirValueSetExpansionParameter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ValueSetExpansionParameter"
    }
}
