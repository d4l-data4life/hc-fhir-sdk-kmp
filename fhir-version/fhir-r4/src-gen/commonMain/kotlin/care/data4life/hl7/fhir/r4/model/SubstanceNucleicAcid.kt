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

import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirSubstanceNucleicAcid
 *
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual
 * substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be
 * always entered in the 5’-3’ direction
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcid</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
interface FhirSubstanceNucleicAcid : FhirDomainResource {

    /**
     * The type of the sequence shall be specified based on a controlled vocabulary.
     */
    val sequenceType: CodeableConcept?

    /**
     * The number of linear sequences of nucleotides linked through phosphodiester
     * bonds shall be described. Subunits would be strands of nucleic acids that are
     * tightly associated typically through Watson-Crick base pairing. NOTE: If not
     * specified in the reference source, the assumption is that there is 1 subunit.
     */
    val numberOfSubunits: Integer?

    /**
     * The area of hybridisation shall be described if applicable for double stranded
     * RNA or DNA. The number associated with the subunit followed by the number
     * associated to the residue shall be specified in increasing order. The underscore
     * “” shall be used as separator as follows: “Subunitnumber Residue”.
     */
    val areaOfHybridisation: String?

    /**
     * (TBC).
     */
    val oligoNucleotideType: CodeableConcept?

    /**
     * Subunits are listed in order of decreasing length; sequences of the same length
     * will be ordered by molecular weight; subunits that have identical sequences will
     * be repeated multiple times.
     */
    val subunit: kotlin.collections.List<SubstanceNucleicAcidSubunit>?
}

/**
 * SubstanceNucleicAcid
 *
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual
 * substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be
 * always entered in the 5’-3’ direction
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcid</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
@Serializable
@SerialName("SubstanceNucleicAcid")
data class SubstanceNucleicAcid(

    @SerialName("sequenceType")
    override val sequenceType: CodeableConcept? = null,

    @SerialName("numberOfSubunits")
    override val numberOfSubunits: Integer? = null,

    @SerialName("areaOfHybridisation")
    override val areaOfHybridisation: String? = null,

    @SerialName("oligoNucleotideType")
    override val oligoNucleotideType: CodeableConcept? = null,

    @SerialName("subunit")
    override val subunit: kotlin.collections.List<SubstanceNucleicAcidSubunit>? = null,

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
) : FhirSubstanceNucleicAcid {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceNucleicAcid"
    }
}

/**
 * FhirSubstanceNucleicAcidSubunit
 *
 * Subunits are listed in order of decreasing length; sequences of the same length will be ordered by
 * molecular weight; subunits that have identical sequences will be repeated multiple times
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcidSubunit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
interface FhirSubstanceNucleicAcidSubunit : FhirBackboneElement {

    /**
     * Index of linear sequences of nucleic acids in order of decreasing length.
     * Sequences of the same length will be ordered by molecular weight. Subunits that
     * have identical sequences will be repeated and have sequential subscripts.
     */
    val subunit: Integer?

    /**
     * Actual nucleotide sequence notation from 5' to 3' end using standard single
     * letter codes. In addition to the base sequence, sugar and type of phosphate or
     * non-phosphate linkage should also be captured.
     */
    val sequence: String?

    /**
     * The length of the sequence shall be captured.
     */
    val length: Integer?

    /**
     * (TBC).
     */
    val sequenceAttachment: Attachment?

    /**
     * The nucleotide present at the 5’ terminal shall be specified based on a
     * controlled vocabulary. Since the sequence is represented from the 5' to the 3'
     * end, the 5’ prime nucleotide is the letter at the first position in the
     * sequence. A separate representation would be redundant.
     */
    val fivePrime: CodeableConcept?

    /**
     * The nucleotide present at the 3’ terminal shall be specified based on a
     * controlled vocabulary. Since the sequence is represented from the 5' to the 3'
     * end, the 5’ prime nucleotide is the letter at the last position in the sequence.
     * A separate representation would be redundant.
     */
    val threePrime: CodeableConcept?

    /**
     * The linkages between sugar residues will also be captured.
     */
    val linkage: kotlin.collections.List<SubstanceNucleicAcidSubunitLinkage>?

    /**
     * 5.3.6.8.1 Sugar ID (Mandatory).
     */
    val sugar: kotlin.collections.List<SubstanceNucleicAcidSubunitSugar>?
}

/**
 * SubstanceNucleicAcidSubunit
 *
 * Subunits are listed in order of decreasing length; sequences of the same length will be ordered by
 * molecular weight; subunits that have identical sequences will be repeated multiple times
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcidSubunit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
@Serializable
@SerialName("SubstanceNucleicAcidSubunit")
data class SubstanceNucleicAcidSubunit(

    @SerialName("subunit")
    override val subunit: Integer? = null,

    @SerialName("sequence")
    override val sequence: String? = null,

    @SerialName("length")
    override val length: Integer? = null,

    @SerialName("sequenceAttachment")
    override val sequenceAttachment: Attachment? = null,

    @SerialName("fivePrime")
    override val fivePrime: CodeableConcept? = null,

    @SerialName("threePrime")
    override val threePrime: CodeableConcept? = null,

    @SerialName("linkage")
    override val linkage: kotlin.collections.List<SubstanceNucleicAcidSubunitLinkage>? = null,

    @SerialName("sugar")
    override val sugar: kotlin.collections.List<SubstanceNucleicAcidSubunitSugar>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceNucleicAcidSubunit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceNucleicAcidSubunit"
    }
}

/**
 * FhirSubstanceNucleicAcidSubunitLinkage
 *
 * The linkages between sugar residues will also be captured
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcidSubunitLinkage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
interface FhirSubstanceNucleicAcidSubunitLinkage : FhirBackboneElement {

    /**
     * The entity that links the sugar residues together should also be captured for
     * nearly all naturally occurring nucleic acid the linkage is a phosphate group.
     * For many synthetic oligonucleotides phosphorothioate linkages are often seen.
     * Linkage connectivity is assumed to be 3’-5’. If the linkage is either 3’-3’ or
     * 5’-5’ this should be specified.
     */
    val connectivity: String?

    /**
     * Each linkage will be registered as a fragment and have an ID.
     */
    val identifier: Identifier?

    /**
     * Each linkage will be registered as a fragment and have at least one name. A
     * single name shall be assigned to each linkage.
     */
    val name: String?

    /**
     * Residues shall be captured as described in 5.3.6.8.3.
     */
    val residueSite: String?
}

/**
 * SubstanceNucleicAcidSubunitLinkage
 *
 * The linkages between sugar residues will also be captured
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcidSubunitLinkage</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
@Serializable
@SerialName("SubstanceNucleicAcidSubunitLinkage")
data class SubstanceNucleicAcidSubunitLinkage(

    @SerialName("connectivity")
    override val connectivity: String? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("residueSite")
    override val residueSite: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceNucleicAcidSubunitLinkage {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceNucleicAcidSubunitLinkage"
    }
}

/**
 * FhirSubstanceNucleicAcidSubunitSugar
 *
 * 5.3.6.8.1 Sugar ID (Mandatory)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcidSubunitSugar</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
interface FhirSubstanceNucleicAcidSubunitSugar : FhirBackboneElement {

    /**
     * The Substance ID of the sugar or sugar-like component that make up the
     * nucleotide.
     */
    val identifier: Identifier?

    /**
     * The name of the sugar or sugar-like component that make up the nucleotide.
     */
    val name: String?

    /**
     * The residues that contain a given sugar will be captured. The order of given
     * residues will be captured in the 5‘-3‘direction consistent with the base
     * sequences listed above.
     */
    val residueSite: String?
}

/**
 * SubstanceNucleicAcidSubunitSugar
 *
 * 5.3.6.8.1 Sugar ID (Mandatory)
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid">SubstanceNucleicAcidSubunitSugar</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceNucleicAcid)
 */
@Serializable
@SerialName("SubstanceNucleicAcidSubunitSugar")
data class SubstanceNucleicAcidSubunitSugar(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("residueSite")
    override val residueSite: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceNucleicAcidSubunitSugar {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceNucleicAcidSubunitSugar"
    }
}
