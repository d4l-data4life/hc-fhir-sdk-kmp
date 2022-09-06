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

import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSubstanceSpecification
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecification : FhirDomainResource {

    /**
     * Identifier by which this substance is known.
     */
    val identifier: Identifier?

    /**
     * High level categorization, e.g. polymer or nucleic acid.
     */
    val type: CodeableConcept?

    /**
     * Status of substance within the catalogue e.g. approved.
     */
    val status: CodeableConcept?

    /**
     * If the substance applies to only human or veterinary use.
     */
    val domain: CodeableConcept?

    /**
     * Textual description of the substance.
     */
    val description: String?

    /**
     * Supporting literature.
     */
    val source: kotlin.collections.List<Reference>?

    /**
     * Textual comment about this record of a substance.
     */
    val comment: String?

    /**
     * Moiety, for structural modifications.
     */
    val moiety: kotlin.collections.List<SubstanceSpecificationMoiety>?

    /**
     * General specifications for this substance, including how it is related to other
     * substances.
     */
    val property: kotlin.collections.List<SubstanceSpecificationProperty>?

    /**
     * General information detailing this substance.
     */
    val referenceInformation: Reference?

    /**
     * Structural information.
     */
    val structure: SubstanceSpecificationStructure?

    /**
     * Codes associated with the substance.
     */
    val code: kotlin.collections.List<SubstanceSpecificationString>?

    /**
     * Names applicable to this substance.
     */
    val name: kotlin.collections.List<SubstanceSpecificationName>?

    /**
     * The molecular weight or weight range (for proteins, polymers or nucleic acids).
     */
    val molecularWeight: kotlin.collections.List<SubstanceSpecificationStructureIsotopeMolecularWeight>?

    /**
     * A link between this substance and another, with details of the relationship.
     */
    val relationship: kotlin.collections.List<SubstanceSpecificationRelationship>?

    /**
     * Data items specific to nucleic acids.
     */
    val nucleicAcid: Reference?

    /**
     * Data items specific to polymers.
     */
    val polymer: Reference?

    /**
     * Data items specific to proteins.
     */
    val protein: Reference?

    /**
     * Material or taxonomic/anatomical source for the substance.
     */
    val sourceMaterial: Reference?
}

/**
 * SubstanceSpecification
 *
 * The detailed description of a substance, typically at a level beyond what is used for prescribing
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecification</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecification")
data class SubstanceSpecification(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("status")
    override val status: CodeableConcept? = null,

    @SerialName("domain")
    override val domain: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("moiety")
    override val moiety: kotlin.collections.List<SubstanceSpecificationMoiety>? = null,

    @SerialName("property")
    override val property: kotlin.collections.List<SubstanceSpecificationProperty>? = null,

    @SerialName("referenceInformation")
    override val referenceInformation: Reference? = null,

    @SerialName("structure")
    override val structure: SubstanceSpecificationStructure? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<SubstanceSpecificationString>? = null,

    @SerialName("name")
    override val name: kotlin.collections.List<SubstanceSpecificationName>? = null,

    @SerialName("molecularWeight")
    override val molecularWeight: kotlin.collections.List<SubstanceSpecificationStructureIsotopeMolecularWeight>? = null,

    @SerialName("relationship")
    override val relationship: kotlin.collections.List<SubstanceSpecificationRelationship>? = null,

    @SerialName("nucleicAcid")
    override val nucleicAcid: Reference? = null,

    @SerialName("polymer")
    override val polymer: Reference? = null,

    @SerialName("protein")
    override val protein: Reference? = null,

    @SerialName("sourceMaterial")
    override val sourceMaterial: Reference? = null,

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
) : FhirSubstanceSpecification {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecification"
    }
}

/**
 * FhirSubstanceSpecificationMoiety
 *
 * Moiety, for structural modifications
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationMoiety</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationMoiety : FhirBackboneElement {

    /**
     * Role that the moiety is playing.
     */
    val role: CodeableConcept?

    /**
     * Identifier by which this moiety substance is known.
     */
    val identifier: Identifier?

    /**
     * Textual name for this moiety substance.
     */
    val name: String?

    /**
     * Stereochemistry type.
     */
    val stereochemistry: CodeableConcept?

    /**
     * Optical activity type.
     */
    val opticalActivity: CodeableConcept?

    /**
     * Molecular formula.
     */
    val molecularFormula: String?

    /**
     * Quantitative value for this moiety.
     */
    val amountQuantity: Quantity?

    /**
     * Quantitative value for this moiety.
     */
    val amountString: String?
}

/**
 * SubstanceSpecificationMoiety
 *
 * Moiety, for structural modifications
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationMoiety</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationMoiety")
data class SubstanceSpecificationMoiety(

    @SerialName("role")
    override val role: CodeableConcept? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("stereochemistry")
    override val stereochemistry: CodeableConcept? = null,

    @SerialName("opticalActivity")
    override val opticalActivity: CodeableConcept? = null,

    @SerialName("molecularFormula")
    override val molecularFormula: String? = null,

    @SerialName("amountQuantity")
    override val amountQuantity: Quantity? = null,

    @SerialName("amountString")
    override val amountString: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationMoiety {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationMoiety"
    }
}

/**
 * FhirSubstanceSpecificationName
 *
 * Names applicable to this substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationName : FhirBackboneElement {

    /**
     * The actual name.
     */
    val name: String

    /**
     * Name type.
     */
    val type: CodeableConcept?

    /**
     * The status of the name.
     */
    val status: CodeableConcept?

    /**
     * If this is the preferred name for this substance.
     */
    val preferred: Bool?

    /**
     * Language of the name.
     */
    val language: kotlin.collections.List<CodeableConcept>?

    /**
     * The use context of this name for example if there is a different name a drug
     * active ingredient as opposed to a food colour additive.
     */
    val domain: kotlin.collections.List<CodeableConcept>?

    /**
     * The jurisdiction where this name applies.
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * A synonym of this name.
     */
    val synonym: kotlin.collections.List<SubstanceSpecificationName>?

    /**
     * A translation for this name.
     */
    val translation: kotlin.collections.List<SubstanceSpecificationName>?

    /**
     * Details of the official nature of this name.
     */
    val official: kotlin.collections.List<SubstanceSpecificationNameOfficial>?

    /**
     * Supporting literature.
     */
    val source: kotlin.collections.List<Reference>?
}

/**
 * SubstanceSpecificationName
 *
 * Names applicable to this substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationName</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationName")
data class SubstanceSpecificationName(

    @SerialName("name")
    override val name: String,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("status")
    override val status: CodeableConcept? = null,

    @SerialName("preferred")
    override val preferred: Bool? = null,

    @SerialName("language")
    override val language: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("domain")
    override val domain: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("synonym")
    override val synonym: kotlin.collections.List<SubstanceSpecificationName>? = null,

    @SerialName("translation")
    override val translation: kotlin.collections.List<SubstanceSpecificationName>? = null,

    @SerialName("official")
    override val official: kotlin.collections.List<SubstanceSpecificationNameOfficial>? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationName {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationName"
    }
}

/**
 * FhirSubstanceSpecificationNameOfficial
 *
 * Details of the official nature of this name
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationNameOfficial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationNameOfficial : FhirBackboneElement {

    /**
     * Which authority uses this official name.
     */
    val authority: CodeableConcept?

    /**
     * The status of the official name.
     */
    val status: CodeableConcept?

    /**
     * Date of official name change.
     */
    val date: DateTime?
}

/**
 * SubstanceSpecificationNameOfficial
 *
 * Details of the official nature of this name
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationNameOfficial</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationNameOfficial")
data class SubstanceSpecificationNameOfficial(

    @SerialName("authority")
    override val authority: CodeableConcept? = null,

    @SerialName("status")
    override val status: CodeableConcept? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationNameOfficial {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationNameOfficial"
    }
}

/**
 * FhirSubstanceSpecificationProperty
 *
 * General specifications for this substance, including how it is related to other substances
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationProperty : FhirBackboneElement {

    /**
     * A category for this property, e.g. Physical, Chemical, Enzymatic.
     */
    val category: CodeableConcept?

    /**
     * Property type e.g. viscosity, pH, isoelectric point.
     */
    val code: CodeableConcept?

    /**
     * Parameters that were used in the measurement of a property (e.g. for viscosity:
     * measured at 20C with a pH of 7.1).
     */
    val parameters: String?

    /**
     * A substance upon which a defining property depends (e.g. for solubility: in
     * water, in alcohol).
     */
    val definingSubstanceReference: Reference?

    /**
     * A substance upon which a defining property depends (e.g. for solubility: in
     * water, in alcohol).
     */
    val definingSubstanceCodeableConcept: CodeableConcept?

    /**
     * Quantitative value for this property.
     */
    val amountQuantity: Quantity?

    /**
     * Quantitative value for this property.
     */
    val amountString: String?
}

/**
 * SubstanceSpecificationProperty
 *
 * General specifications for this substance, including how it is related to other substances
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationProperty</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationProperty")
data class SubstanceSpecificationProperty(

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("parameters")
    override val parameters: String? = null,

    @SerialName("definingSubstanceReference")
    override val definingSubstanceReference: Reference? = null,

    @SerialName("definingSubstanceCodeableConcept")
    override val definingSubstanceCodeableConcept: CodeableConcept? = null,

    @SerialName("amountQuantity")
    override val amountQuantity: Quantity? = null,

    @SerialName("amountString")
    override val amountString: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationProperty {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationProperty"
    }
}

/**
 * FhirSubstanceSpecificationRelationship
 *
 * A link between this substance and another, with details of the relationship
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationRelationship</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationRelationship : FhirBackboneElement {

    /**
     * A pointer to another substance, as a resource or just a representational code.
     */
    val substanceReference: Reference?

    /**
     * A pointer to another substance, as a resource or just a representational code.
     */
    val substanceCodeableConcept: CodeableConcept?

    /**
     * For example "salt to parent", "active moiety", "starting material".
     */
    val relationship: CodeableConcept?

    /**
     * For example where an enzyme strongly bonds with a particular substance, this is
     * a defining relationship for that enzyme, out of several possible substance
     * relationships.
     */
    val isDefining: Bool?

    /**
     * A numeric factor for the relationship, for instance to express that the salt of
     * a substance has some percentage of the active substance in relation to some
     * other.
     */
    val amountQuantity: Quantity?

    /**
     * A numeric factor for the relationship, for instance to express that the salt of
     * a substance has some percentage of the active substance in relation to some
     * other.
     */
    val amountRange: Range?

    /**
     * A numeric factor for the relationship, for instance to express that the salt of
     * a substance has some percentage of the active substance in relation to some
     * other.
     */
    val amountRatio: Ratio?

    /**
     * A numeric factor for the relationship, for instance to express that the salt of
     * a substance has some percentage of the active substance in relation to some
     * other.
     */
    val amountString: String?

    /**
     * For use when the numeric.
     */
    val amountRatioLowLimit: Ratio?

    /**
     * An operator for the amount, for example "average", "approximately", "less than".
     */
    val amountType: CodeableConcept?

    /**
     * Supporting literature.
     */
    val source: kotlin.collections.List<Reference>?
}

/**
 * SubstanceSpecificationRelationship
 *
 * A link between this substance and another, with details of the relationship
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationRelationship</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationRelationship")
data class SubstanceSpecificationRelationship(

    @SerialName("substanceReference")
    override val substanceReference: Reference? = null,

    @SerialName("substanceCodeableConcept")
    override val substanceCodeableConcept: CodeableConcept? = null,

    @SerialName("relationship")
    override val relationship: CodeableConcept? = null,

    @SerialName("isDefining")
    override val isDefining: Bool? = null,

    @SerialName("amountQuantity")
    override val amountQuantity: Quantity? = null,

    @SerialName("amountRange")
    override val amountRange: Range? = null,

    @SerialName("amountRatio")
    override val amountRatio: Ratio? = null,

    @SerialName("amountString")
    override val amountString: String? = null,

    @SerialName("amountRatioLowLimit")
    override val amountRatioLowLimit: Ratio? = null,

    @SerialName("amountType")
    override val amountType: CodeableConcept? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationRelationship {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationRelationship"
    }
}

/**
 * FhirSubstanceSpecificationString
 *
 * Codes associated with the substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationString</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationString : FhirBackboneElement {

    /**
     * The specific code.
     */
    val code: CodeableConcept?

    /**
     * Status of the code assignment.
     */
    val status: CodeableConcept?

    /**
     * The date at which the code status is changed as part of the terminology
     * maintenance.
     */
    val statusDate: DateTime?

    /**
     * Any comment can be provided in this field, if necessary.
     */
    val comment: String?

    /**
     * Supporting literature.
     */
    val source: kotlin.collections.List<Reference>?
}

/**
 * SubstanceSpecificationString
 *
 * Codes associated with the substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationString</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationString")
data class SubstanceSpecificationString(

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("status")
    override val status: CodeableConcept? = null,

    @SerialName("statusDate")
    override val statusDate: DateTime? = null,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationString {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationString"
    }
}

/**
 * FhirSubstanceSpecificationStructure
 *
 * Structural information
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationStructure : FhirBackboneElement {

    /**
     * Stereochemistry type.
     */
    val stereochemistry: CodeableConcept?

    /**
     * Optical activity type.
     */
    val opticalActivity: CodeableConcept?

    /**
     * Molecular formula.
     */
    val molecularFormula: String?

    /**
     * Specified per moiety according to the Hill system, i.e. first C, then H, then
     * alphabetical, each moiety separated by a dot.
     */
    val molecularFormulaByMoiety: String?

    /**
     * Applicable for single substances that contain a radionuclide or a non-natural
     * isotopic ratio.
     */
    val isotope: kotlin.collections.List<SubstanceSpecificationStructureIsotope>?

    /**
     * The molecular weight or weight range (for proteins, polymers or nucleic acids).
     */
    val molecularWeight: SubstanceSpecificationStructureIsotopeMolecularWeight?

    /**
     * Supporting literature.
     */
    val source: kotlin.collections.List<Reference>?

    /**
     * Molecular structural representation.
     */
    val representation: kotlin.collections.List<SubstanceSpecificationStructureRepresentation>?
}

/**
 * SubstanceSpecificationStructure
 *
 * Structural information
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationStructure")
data class SubstanceSpecificationStructure(

    @SerialName("stereochemistry")
    override val stereochemistry: CodeableConcept? = null,

    @SerialName("opticalActivity")
    override val opticalActivity: CodeableConcept? = null,

    @SerialName("molecularFormula")
    override val molecularFormula: String? = null,

    @SerialName("molecularFormulaByMoiety")
    override val molecularFormulaByMoiety: String? = null,

    @SerialName("isotope")
    override val isotope: kotlin.collections.List<SubstanceSpecificationStructureIsotope>? = null,

    @SerialName("molecularWeight")
    override val molecularWeight: SubstanceSpecificationStructureIsotopeMolecularWeight? = null,

    @SerialName("source")
    override val source: kotlin.collections.List<Reference>? = null,

    @SerialName("representation")
    override val representation: kotlin.collections.List<SubstanceSpecificationStructureRepresentation>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationStructure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationStructure"
    }
}

/**
 * FhirSubstanceSpecificationStructureIsotope
 *
 * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructureIsotope</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationStructureIsotope : FhirBackboneElement {

    /**
     * Substance identifier for each non-natural or radioisotope.
     */
    val identifier: Identifier?

    /**
     * Substance name for each non-natural or radioisotope.
     */
    val name: CodeableConcept?

    /**
     * The type of isotopic substitution present in a single substance.
     */
    val substitution: CodeableConcept?

    /**
     * Half life - for a non-natural nuclide.
     */
    val halfLife: Quantity?

    /**
     * The molecular weight or weight range (for proteins, polymers or nucleic acids).
     */
    val molecularWeight: SubstanceSpecificationStructureIsotopeMolecularWeight?
}

/**
 * SubstanceSpecificationStructureIsotope
 *
 * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructureIsotope</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationStructureIsotope")
data class SubstanceSpecificationStructureIsotope(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("name")
    override val name: CodeableConcept? = null,

    @SerialName("substitution")
    override val substitution: CodeableConcept? = null,

    @SerialName("halfLife")
    override val halfLife: Quantity? = null,

    @SerialName("molecularWeight")
    override val molecularWeight: SubstanceSpecificationStructureIsotopeMolecularWeight? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationStructureIsotope {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationStructureIsotope"
    }
}

/**
 * FhirSubstanceSpecificationStructureIsotopeMolecularWeight
 *
 * The molecular weight or weight range (for proteins, polymers or nucleic acids)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructureIsotopeMolecularWeight</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationStructureIsotopeMolecularWeight : FhirBackboneElement {

    /**
     * The method by which the molecular weight was determined.
     */
    val method: CodeableConcept?

    /**
     * Type of molecular weight such as exact, average (also known as. number average),
     * weight average.
     */
    val type: CodeableConcept?

    /**
     * Used to capture quantitative values for a variety of elements. If only limits
     * are given, the arithmetic mean would be the average. If only a single definite
     * value for a given element is given, it would be captured in this field.
     */
    val amount: Quantity?
}

/**
 * SubstanceSpecificationStructureIsotopeMolecularWeight
 *
 * The molecular weight or weight range (for proteins, polymers or nucleic acids)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructureIsotopeMolecularWeight</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationStructureIsotopeMolecularWeight")
data class SubstanceSpecificationStructureIsotopeMolecularWeight(

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("amount")
    override val amount: Quantity? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationStructureIsotopeMolecularWeight {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationStructureIsotopeMolecularWeight"
    }
}

/**
 * FhirSubstanceSpecificationStructureRepresentation
 *
 * Molecular structural representation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructureRepresentation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
interface FhirSubstanceSpecificationStructureRepresentation : FhirBackboneElement {

    /**
     * The type of structure (e.g. Full, Partial, Representative).
     */
    val type: CodeableConcept?

    /**
     * The structural representation as text string in a format e.g. InChI, SMILES,
     * MOLFILE, CDX.
     */
    val representation: String?

    /**
     * An attached file with the structural representation.
     */
    val attachment: Attachment?
}

/**
 * SubstanceSpecificationStructureRepresentation
 *
 * Molecular structural representation
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceSpecification">SubstanceSpecificationStructureRepresentation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceSpecification)
 */
@Serializable
@SerialName("SubstanceSpecificationStructureRepresentation")
data class SubstanceSpecificationStructureRepresentation(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("representation")
    override val representation: String? = null,

    @SerialName("attachment")
    override val attachment: Attachment? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceSpecificationStructureRepresentation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceSpecificationStructureRepresentation"
    }
}
