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
 * FhirSubstanceProtein
 *
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of
 * subunits that are either covalently linked or have a defined invariant stoichiometric relationship.
 * This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether
 * the use is therapeutic or prophylactic. This set of elements will be used to describe albumins,
 * coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins,
 * toxoids, recombinant vaccines, and immunomodulators
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceProtein">SubstanceProtein</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceProtein)
 */
interface FhirSubstanceProtein : FhirDomainResource {

    /**
     * The SubstanceProtein descriptive elements will only be used when a complete or
     * partial amino acid sequence is available or derivable from a nucleic acid
     * sequence.
     */
    val sequenceType: CodeableConcept?

    /**
     * Number of linear sequences of amino acids linked through peptide bonds. The
     * number of subunits constituting the SubstanceProtein shall be described. It is
     * possible that the number of subunits can be variable.
     */
    val numberOfSubunits: Integer?

    /**
     * The disulphide bond between two cysteine residues either on the same subunit or
     * on two different subunits shall be described. The position of the disulfide
     * bonds in the SubstanceProtein shall be listed in increasing order of subunit
     * number and position within subunit followed by the abbreviation of the amino
     * acids involved. The disulfide linkage positions shall actually contain the amino
     * acid Cysteine at the respective positions.
     */
    val disulfideLinkage: kotlin.collections.List<String>?

    /**
     * This subclause refers to the description of each subunit constituting the
     * SubstanceProtein. A subunit is a linear sequence of amino acids linked through
     * peptide bonds. The Subunit information shall be provided when the finished
     * SubstanceProtein is a complex of multiple sequences; subunits are not used to
     * delineate domains within a single sequence. Subunits are listed in order of
     * decreasing length; sequences of the same length will be ordered by decreasing
     * molecular weight; subunits that have identical sequences will be repeated
     * multiple times.
     */
    val subunit: kotlin.collections.List<SubstanceProteinSubunit>?
}

/**
 * SubstanceProtein
 *
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of
 * subunits that are either covalently linked or have a defined invariant stoichiometric relationship.
 * This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether
 * the use is therapeutic or prophylactic. This set of elements will be used to describe albumins,
 * coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins,
 * toxoids, recombinant vaccines, and immunomodulators
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceProtein">SubstanceProtein</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceProtein)
 */
@Serializable
@SerialName("SubstanceProtein")
data class SubstanceProtein(

    @SerialName("sequenceType")
    override val sequenceType: CodeableConcept? = null,

    @SerialName("numberOfSubunits")
    override val numberOfSubunits: Integer? = null,

    @SerialName("disulfideLinkage")
    override val disulfideLinkage: kotlin.collections.List<String>? = null,

    @SerialName("subunit")
    override val subunit: kotlin.collections.List<SubstanceProteinSubunit>? = null,

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
) : FhirSubstanceProtein {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceProtein"
    }
}

/**
 * FhirSubstanceProteinSubunit
 *
 * This subclause refers to the description of each subunit constituting the SubstanceProtein. A
 * subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information
 * shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits
 * are not used to delineate domains within a single sequence. Subunits are listed in order of
 * decreasing length; sequences of the same length will be ordered by decreasing molecular weight;
 * subunits that have identical sequences will be repeated multiple times
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceProtein">SubstanceProteinSubunit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceProtein)
 */
interface FhirSubstanceProteinSubunit : FhirBackboneElement {

    /**
     * Index of primary sequences of amino acids linked through peptide bonds in order
     * of decreasing length. Sequences of the same length will be ordered by molecular
     * weight. Subunits that have identical sequences will be repeated and have
     * sequential subscripts.
     */
    val subunit: Integer?

    /**
     * The sequence information shall be provided enumerating the amino acids from N-
     * to C-terminal end using standard single-letter amino acid codes. Uppercase shall
     * be used for L-amino acids and lowercase for D-amino acids. Transcribed
     * SubstanceProteins will always be described using the translated sequence; for
     * synthetic peptide containing amino acids that are not represented with a single
     * letter code an X should be used within the sequence. The modified amino acids
     * will be distinguished by their position in the sequence.
     */
    val sequence: String?

    /**
     * Length of linear sequences of amino acids contained in the subunit.
     */
    val length: Integer?

    /**
     * The sequence information shall be provided enumerating the amino acids from N-
     * to C-terminal end using standard single-letter amino acid codes. Uppercase shall
     * be used for L-amino acids and lowercase for D-amino acids. Transcribed
     * SubstanceProteins will always be described using the translated sequence; for
     * synthetic peptide containing amino acids that are not represented with a single
     * letter code an X should be used within the sequence. The modified amino acids
     * will be distinguished by their position in the sequence.
     */
    val sequenceAttachment: Attachment?

    /**
     * Unique identifier for molecular fragment modification based on the ISO 11238
     * Substance ID.
     */
    val nTerminalModificationId: Identifier?

    /**
     * The name of the fragment modified at the N-terminal of the SubstanceProtein
     * shall be specified.
     */
    val nTerminalModification: String?

    /**
     * Unique identifier for molecular fragment modification based on the ISO 11238
     * Substance ID.
     */
    val cTerminalModificationId: Identifier?

    /**
     * The modification at the C-terminal shall be specified.
     */
    val cTerminalModification: String?
}

/**
 * SubstanceProteinSubunit
 *
 * This subclause refers to the description of each subunit constituting the SubstanceProtein. A
 * subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information
 * shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits
 * are not used to delineate domains within a single sequence. Subunits are listed in order of
 * decreasing length; sequences of the same length will be ordered by decreasing molecular weight;
 * subunits that have identical sequences will be repeated multiple times
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceProtein">SubstanceProteinSubunit</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceProtein)
 */
@Serializable
@SerialName("SubstanceProteinSubunit")
data class SubstanceProteinSubunit(

    @SerialName("subunit")
    override val subunit: Integer? = null,

    @SerialName("sequence")
    override val sequence: String? = null,

    @SerialName("length")
    override val length: Integer? = null,

    @SerialName("sequenceAttachment")
    override val sequenceAttachment: Attachment? = null,

    @SerialName("nTerminalModificationId")
    override val nTerminalModificationId: Identifier? = null,

    @SerialName("nTerminalModification")
    override val nTerminalModification: String? = null,

    @SerialName("cTerminalModificationId")
    override val cTerminalModificationId: Identifier? = null,

    @SerialName("cTerminalModification")
    override val cTerminalModification: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceProteinSubunit {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceProteinSubunit"
    }
}
