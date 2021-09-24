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
import care.data4life.hl7.fhir.stu3.codesystem.SystemVersionProcessingMode
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirExpansionProfile
 *
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfile</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfile : FhirDomainResource {

    /**
     * Logical URI to reference this expansion profile (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the expansion profile.
     */
    val identifier: Identifier?

    /**
     * Business version of the expansion profile.
     */
    val version: String?

    /**
     * Name for this expansion profile (computer friendly).
     */
    val name: String?

    /**
     * The status of this expansion profile. Enables tracking the life-cycle of the
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
     * Natural language description of the expansion profile.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for expansion profile (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Fix use of a code system to a particular version.
     */
    val fixedVersion: kotlin.collections.List<ExpansionProfileFixedVersion>?

    /**
     * Systems/Versions to be exclude.
     */
    val excludedSystem: ExpansionProfileExcludedSystem?

    /**
     * Whether the expansion should include concept designations.
     */
    val includeDesignations: Bool?

    /**
     * When the expansion profile imposes designation contraints.
     */
    val designation: ExpansionProfileDesignation?

    /**
     * Include or exclude the value set definition in the expansion.
     */
    val includeDefinition: Bool?

    /**
     * Include or exclude inactive concepts in the expansion.
     */
    val activeOnly: Bool?

    /**
     * Nested codes in the expansion or not.
     */
    val excludeNested: Bool?

    /**
     * Include or exclude codes which cannot be rendered in user interfaces in the
     * value set expansion.
     */
    val excludeNotForUI: Bool?

    /**
     * Include or exclude codes which are post coordinated expressions in the value set
     * expansion.
     */
    val excludePostCoordinated: Bool?

    /**
     * Specify the language for the display element of codes in the value set expansion.
     */
    val displayLanguage: String?

    /**
     * Controls behaviour of the value set expand operation when value sets are too
     * large to be completely expanded.
     */
    val limitedExpansion: Bool?
}

/**
 * ExpansionProfile
 *
 * Resource to define constraints on the Expansion of a FHIR ValueSet.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfile</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfile")
data class ExpansionProfile(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String? = null,

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

    @SerialName("fixedVersion")
    override val fixedVersion: kotlin.collections.List<ExpansionProfileFixedVersion>? = null,

    @SerialName("excludedSystem")
    override val excludedSystem: ExpansionProfileExcludedSystem? = null,

    @SerialName("includeDesignations")
    override val includeDesignations: Bool? = null,

    @SerialName("designation")
    override val designation: ExpansionProfileDesignation? = null,

    @SerialName("includeDefinition")
    override val includeDefinition: Bool? = null,

    @SerialName("activeOnly")
    override val activeOnly: Bool? = null,

    @SerialName("excludeNested")
    override val excludeNested: Bool? = null,

    @SerialName("excludeNotForUI")
    override val excludeNotForUI: Bool? = null,

    @SerialName("excludePostCoordinated")
    override val excludePostCoordinated: Bool? = null,

    @SerialName("displayLanguage")
    override val displayLanguage: String? = null,

    @SerialName("limitedExpansion")
    override val limitedExpansion: Bool? = null,

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
) : FhirExpansionProfile {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfile"
    }
}

/**
 * FhirExpansionProfileDesignation
 *
 * A set of criteria that provide the constraints imposed on the value set expansion by including or
 * excluding designations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfileDesignation : FhirBackboneElement {

    /**
     * Designations to be included.
     */
    val include: ExpansionProfileDesignationInclude?

    /**
     * Designations to be excluded.
     */
    val exclude: ExpansionProfileDesignationExclude?
}

/**
 * ExpansionProfileDesignation
 *
 * A set of criteria that provide the constraints imposed on the value set expansion by including or
 * excluding designations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfileDesignation")
data class ExpansionProfileDesignation(

    @SerialName("include")
    override val include: ExpansionProfileDesignationInclude? = null,

    @SerialName("exclude")
    override val exclude: ExpansionProfileDesignationExclude? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExpansionProfileDesignation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfileDesignation"
    }
}

/**
 * FhirExpansionProfileDesignationExclude
 *
 * Designations to be excluded
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationExclude</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfileDesignationExclude : FhirBackboneElement {

    /**
     * The designation to be excluded.
     */
    val designation: kotlin.collections.List<ExpansionProfileDesignationExcludeDesignation>?
}

/**
 * ExpansionProfileDesignationExclude
 *
 * Designations to be excluded
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationExclude</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfileDesignationExclude")
data class ExpansionProfileDesignationExclude(

    @SerialName("designation")
    override val designation: kotlin.collections.List<ExpansionProfileDesignationExcludeDesignation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExpansionProfileDesignationExclude {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfileDesignationExclude"
    }
}

/**
 * FhirExpansionProfileDesignationExcludeDesignation
 *
 * A data group for each designation to be excluded.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationExcludeDesignation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfileDesignationExcludeDesignation : FhirBackboneElement {

    /**
     * Human language of the designation to be excluded.
     */
    val language: String?

    /**
     * What kind of Designation to exclude.
     */
    val use: Coding?
}

/**
 * ExpansionProfileDesignationExcludeDesignation
 *
 * A data group for each designation to be excluded.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationExcludeDesignation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfileDesignationExcludeDesignation")
data class ExpansionProfileDesignationExcludeDesignation(

    @SerialName("language")
    override val language: String? = null,

    @SerialName("use")
    override val use: Coding? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExpansionProfileDesignationExcludeDesignation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfileDesignationExcludeDesignation"
    }
}

/**
 * FhirExpansionProfileDesignationInclude
 *
 * Designations to be included
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationInclude</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfileDesignationInclude : FhirBackboneElement {

    /**
     * The designation to be included.
     */
    val designation: kotlin.collections.List<ExpansionProfileDesignationIncludeDesignation>?
}

/**
 * ExpansionProfileDesignationInclude
 *
 * Designations to be included
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationInclude</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfileDesignationInclude")
data class ExpansionProfileDesignationInclude(

    @SerialName("designation")
    override val designation: kotlin.collections.List<ExpansionProfileDesignationIncludeDesignation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExpansionProfileDesignationInclude {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfileDesignationInclude"
    }
}

/**
 * FhirExpansionProfileDesignationIncludeDesignation
 *
 * A data group for each designation to be included.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationIncludeDesignation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfileDesignationIncludeDesignation : FhirBackboneElement {

    /**
     * Human language of the designation to be included.
     */
    val language: String?

    /**
     * What kind of Designation to include.
     */
    val use: Coding?
}

/**
 * ExpansionProfileDesignationIncludeDesignation
 *
 * A data group for each designation to be included.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileDesignationIncludeDesignation</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfileDesignationIncludeDesignation")
data class ExpansionProfileDesignationIncludeDesignation(

    @SerialName("language")
    override val language: String? = null,

    @SerialName("use")
    override val use: Coding? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExpansionProfileDesignationIncludeDesignation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfileDesignationIncludeDesignation"
    }
}

/**
 * FhirExpansionProfileExcludedSystem
 *
 * Code system, or a particular version of a code system to be excluded from value set expansions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileExcludedSystem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfileExcludedSystem : FhirBackboneElement {

    /**
     * The specific code system to be excluded.
     */
    val system: String

    /**
     * Specific version of the code system referred to.
     */
    val version: String?
}

/**
 * ExpansionProfileExcludedSystem
 *
 * Code system, or a particular version of a code system to be excluded from value set expansions.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileExcludedSystem</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfileExcludedSystem")
data class ExpansionProfileExcludedSystem(

    @SerialName("system")
    override val system: String,

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
) : FhirExpansionProfileExcludedSystem {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfileExcludedSystem"
    }
}

/**
 * FhirExpansionProfileFixedVersion
 *
 * Fix use of a particular code system to a particular version.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileFixedVersion</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
interface FhirExpansionProfileFixedVersion : FhirBackboneElement {

    /**
     * System to have its version fixed.
     */
    val system: String

    /**
     * Specific version of the code system referred to.
     */
    val version: String

    /**
     * How to manage the intersection between a fixed version in a value set, and this
     * fixed version of the system in the expansion profile.
     */
    val mode: SystemVersionProcessingMode
}

/**
 * ExpansionProfileFixedVersion
 *
 * Fix use of a particular code system to a particular version.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ExpansionProfile">ExpansionProfileFixedVersion</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ExpansionProfile)
 */
@Serializable
@SerialName("ExpansionProfileFixedVersion")
data class ExpansionProfileFixedVersion(

    @SerialName("system")
    override val system: String,

    @SerialName("version")
    override val version: String,

    @SerialName("mode")
    override val mode: SystemVersionProcessingMode,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirExpansionProfileFixedVersion {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ExpansionProfileFixedVersion"
    }
}
