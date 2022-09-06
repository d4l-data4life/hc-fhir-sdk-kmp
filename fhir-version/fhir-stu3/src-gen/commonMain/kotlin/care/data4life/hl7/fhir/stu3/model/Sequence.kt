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

import care.data4life.hl7.fhir.stu3.codesystem.QualityType
import care.data4life.hl7.fhir.stu3.codesystem.RepositoryType
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSequence
 *
 * Raw data describing a biological sequence.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">Sequence</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
interface FhirSequence : FhirDomainResource {

    /**
     * Unique ID for this particular sequence. This is a FHIR-defined id.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * aa | dna | rna.
     */
    val type: String?

    /**
     * Base number of coordinate system (0 for 0-based numbering or coordinates,
     * inclusive start, exclusive end, 1 for 1-based numbering, inclusive start,
     * inclusive end).
     */
    val coordinateSystem: Integer

    /**
     * Who and/or what this is about.
     */
    val patient: Reference?

    /**
     * Specimen used for sequencing.
     */
    val specimen: Reference?

    /**
     * The method for sequencing.
     */
    val device: Reference?

    /**
     * Who should be responsible for test result.
     */
    val performer: Reference?

    /**
     * The number of copies of the seqeunce of interest. (RNASeq).
     */
    val quantity: Quantity?

    /**
     * A sequence used as reference.
     */
    val referenceSeq: SequenceReferenceSeq?

    /**
     * Variant in sequence.
     */
    val variant: kotlin.collections.List<SequenceVariant>?

    /**
     * Sequence that was observed.
     */
    val observedSeq: String?

    /**
     * An set of value as quality of sequence.
     */
    val quality: kotlin.collections.List<SequenceQuality>?

    /**
     * Average number of reads representing a given nucleotide in the reconstructed
     * sequence.
     */
    val readCoverage: Integer?

    /**
     * External repository which contains detailed report related with observedSeq in
     * this resource.
     */
    val repository: kotlin.collections.List<SequenceRepository>?

    /**
     * Pointer to next atomic sequence.
     */
    val pointer: kotlin.collections.List<Reference>?
}

/**
 * Sequence
 *
 * Raw data describing a biological sequence.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">Sequence</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
@Serializable
@SerialName("Sequence")
data class Sequence(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("type")
    override val type: String? = null,

    @SerialName("coordinateSystem")
    override val coordinateSystem: Integer,

    @SerialName("patient")
    override val patient: Reference? = null,

    @SerialName("specimen")
    override val specimen: Reference? = null,

    @SerialName("device")
    override val device: Reference? = null,

    @SerialName("performer")
    override val performer: Reference? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("referenceSeq")
    override val referenceSeq: SequenceReferenceSeq? = null,

    @SerialName("variant")
    override val variant: kotlin.collections.List<SequenceVariant>? = null,

    @SerialName("observedSeq")
    override val observedSeq: String? = null,

    @SerialName("quality")
    override val quality: kotlin.collections.List<SequenceQuality>? = null,

    @SerialName("readCoverage")
    override val readCoverage: Integer? = null,

    @SerialName("repository")
    override val repository: kotlin.collections.List<SequenceRepository>? = null,

    @SerialName("pointer")
    override val pointer: kotlin.collections.List<Reference>? = null,

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
) : FhirSequence {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Sequence"
    }
}

/**
 * FhirSequenceQuality
 *
 * An experimental feature attribute that defines the quality of the feature in a quantitative way,
 * such as a phred quality score
 * ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceQuality</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
interface FhirSequenceQuality : FhirBackboneElement {

    /**
     * INDEL / SNP / Undefined variant.
     */
    val type: QualityType

    /**
     * Standard sequence for comparison.
     */
    val standardSequence: CodeableConcept?

    /**
     * Start position of the sequence.
     */
    val start: Integer?

    /**
     * End position of the sequence.
     */
    val end: Integer?

    /**
     * Quality score for the comparison.
     */
    val score: Quantity?

    /**
     * Method to get quality.
     */
    val method: CodeableConcept?

    /**
     * True positives from the perspective of the truth data.
     */
    val truthTP: Decimal?

    /**
     * True positives from the perspective of the query data.
     */
    val queryTP: Decimal?

    /**
     * False negatives.
     */
    val truthFN: Decimal?

    /**
     * False positives.
     */
    val queryFP: Decimal?

    /**
     * False positives where the non-REF alleles in the Truth and Query Call Sets match.
     */
    val gtFP: Decimal?

    /**
     * Precision of comparison.
     */
    val precision: Decimal?

    /**
     * Recall of comparison.
     */
    val recall: Decimal?

    /**
     * F-score.
     */
    val fScore: Decimal?
}

/**
 * SequenceQuality
 *
 * An experimental feature attribute that defines the quality of the feature in a quantitative way,
 * such as a phred quality score
 * ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceQuality</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
@Serializable
@SerialName("SequenceQuality")
data class SequenceQuality(

    @SerialName("type")
    override val type: QualityType,

    @SerialName("standardSequence")
    override val standardSequence: CodeableConcept? = null,

    @SerialName("start")
    override val start: Integer? = null,

    @SerialName("end")
    override val end: Integer? = null,

    @SerialName("score")
    override val score: Quantity? = null,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("truthTP")
    override val truthTP: Decimal? = null,

    @SerialName("queryTP")
    override val queryTP: Decimal? = null,

    @SerialName("truthFN")
    override val truthFN: Decimal? = null,

    @SerialName("queryFP")
    override val queryFP: Decimal? = null,

    @SerialName("gtFP")
    override val gtFP: Decimal? = null,

    @SerialName("precision")
    override val precision: Decimal? = null,

    @SerialName("recall")
    override val recall: Decimal? = null,

    @SerialName("fScore")
    override val fScore: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSequenceQuality {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SequenceQuality"
    }
}

/**
 * FhirSequenceReferenceSeq
 *
 * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceReferenceSeq</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
interface FhirSequenceReferenceSeq : FhirBackboneElement {

    /**
     * Chromosome containing genetic finding.
     */
    val chromosome: CodeableConcept?

    /**
     * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh
     * 37'.
     */
    val genomeBuild: String?

    /**
     * Reference identifier.
     */
    val referenceSeqId: CodeableConcept?

    /**
     * A Pointer to another Sequence entity as reference sequence.
     */
    val referenceSeqPointer: Reference?

    /**
     * A string to represent reference sequence.
     */
    val referenceSeqString: String?

    /**
     * Directionality of DNA ( +1/-1).
     */
    val strand: Integer?

    /**
     * Start position of the window on the reference sequence.
     */
    val windowStart: Integer

    /**
     * End position of the window on the reference sequence.
     */
    val windowEnd: Integer
}

/**
 * SequenceReferenceSeq
 *
 * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceReferenceSeq</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
@Serializable
@SerialName("SequenceReferenceSeq")
data class SequenceReferenceSeq(

    @SerialName("chromosome")
    override val chromosome: CodeableConcept? = null,

    @SerialName("genomeBuild")
    override val genomeBuild: String? = null,

    @SerialName("referenceSeqId")
    override val referenceSeqId: CodeableConcept? = null,

    @SerialName("referenceSeqPointer")
    override val referenceSeqPointer: Reference? = null,

    @SerialName("referenceSeqString")
    override val referenceSeqString: String? = null,

    @SerialName("strand")
    override val strand: Integer? = null,

    @SerialName("windowStart")
    override val windowStart: Integer,

    @SerialName("windowEnd")
    override val windowEnd: Integer,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSequenceReferenceSeq {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SequenceReferenceSeq"
    }
}

/**
 * FhirSequenceRepository
 *
 * Configurations of the external repository. The repository shall store target's observedSeq or
 * records related with target's observedSeq.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceRepository</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
interface FhirSequenceRepository : FhirBackboneElement {

    /**
     * Click and see / RESTful API / Need login to see / RESTful API with
     * authentication / Other ways to see resource.
     */
    val type: RepositoryType

    /**
     * URI of the repository.
     */
    val url: String?

    /**
     * Repository's name.
     */
    val name: String?

    /**
     * Id of the dataset that used to call for dataset in repository.
     */
    val datasetId: String?

    /**
     * Id of the variantset that used to call for variantset in repository.
     */
    val variantsetId: String?

    /**
     * Id of the read.
     */
    val readsetId: String?
}

/**
 * SequenceRepository
 *
 * Configurations of the external repository. The repository shall store target's observedSeq or
 * records related with target's observedSeq.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceRepository</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
@Serializable
@SerialName("SequenceRepository")
data class SequenceRepository(

    @SerialName("type")
    override val type: RepositoryType,

    @SerialName("url")
    override val url: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("datasetId")
    override val datasetId: String? = null,

    @SerialName("variantsetId")
    override val variantsetId: String? = null,

    @SerialName("readsetId")
    override val readsetId: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSequenceRepository {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SequenceRepository"
    }
}

/**
 * FhirSequenceVariant
 *
 * The definition of variant here originates from Sequence ontology
 * ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element
 * can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.) It can
 * represent some complex mutation or segment variation with the assist of CIGAR string.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceVariant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
interface FhirSequenceVariant : FhirBackboneElement {

    /**
     * Start position of the variant on the reference sequence.
     */
    val start: Integer?

    /**
     * End position of the variant on the reference sequence.
     */
    val end: Integer?

    /**
     * Allele that was observed.
     */
    val observedAllele: String?

    /**
     * Allele in the reference sequence.
     */
    val referenceAllele: String?

    /**
     * Extended CIGAR string for aligning the sequence with reference bases.
     */
    val cigar: String?

    /**
     * Pointer to observed variant information.
     */
    val variantPointer: Reference?
}

/**
 * SequenceVariant
 *
 * The definition of variant here originates from Sequence ontology
 * ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element
 * can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.) It can
 * represent some complex mutation or segment variation with the assist of CIGAR string.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Sequence">SequenceVariant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Sequence)
 */
@Serializable
@SerialName("SequenceVariant")
data class SequenceVariant(

    @SerialName("start")
    override val start: Integer? = null,

    @SerialName("end")
    override val end: Integer? = null,

    @SerialName("observedAllele")
    override val observedAllele: String? = null,

    @SerialName("referenceAllele")
    override val referenceAllele: String? = null,

    @SerialName("cigar")
    override val cigar: String? = null,

    @SerialName("variantPointer")
    override val variantPointer: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSequenceVariant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SequenceVariant"
    }
}
