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

import care.data4life.hl7.fhir.r4.codesystem.OrientationType
import care.data4life.hl7.fhir.r4.codesystem.QualityType
import care.data4life.hl7.fhir.r4.codesystem.RepositoryType
import care.data4life.hl7.fhir.r4.codesystem.SequenceType
import care.data4life.hl7.fhir.r4.codesystem.StrandType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Integer
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMolecularSequence
 *
 * Raw data describing a biological sequence.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequence</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequence : FhirDomainResource {

    /**
     * Unique ID for this particular sequence. This is a FHIR-defined id.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
     */
    val type: SequenceType?

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
     * The number of copies of the sequence of interest. (RNASeq).
     */
    val quantity: Quantity?

    /**
     * A sequence used as reference.
     */
    val referenceSeq: MolecularSequenceReferenceSeq?

    /**
     * Variant in sequence.
     */
    val variant: kotlin.collections.List<MolecularSequenceVariant>?

    /**
     * Sequence that was observed.
     */
    val observedSeq: String?

    /**
     * An set of value as quality of sequence.
     */
    val quality: kotlin.collections.List<MolecularSequenceQuality>?

    /**
     * Average number of reads representing a given nucleotide in the reconstructed
     * sequence.
     */
    val readCoverage: Integer?

    /**
     * External repository which contains detailed report related with observedSeq in
     * this resource.
     */
    val repository: kotlin.collections.List<MolecularSequenceRepository>?

    /**
     * Pointer to next atomic sequence.
     */
    val pointer: kotlin.collections.List<Reference>?

    /**
     * Structural variant.
     */
    val structureVariant: kotlin.collections.List<MolecularSequenceStructureVariant>?
}

/**
 * MolecularSequence
 *
 * Raw data describing a biological sequence.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequence</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequence")
data class MolecularSequence(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("type")
    override val type: SequenceType? = null,

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
    override val referenceSeq: MolecularSequenceReferenceSeq? = null,

    @SerialName("variant")
    override val variant: kotlin.collections.List<MolecularSequenceVariant>? = null,

    @SerialName("observedSeq")
    override val observedSeq: String? = null,

    @SerialName("quality")
    override val quality: kotlin.collections.List<MolecularSequenceQuality>? = null,

    @SerialName("readCoverage")
    override val readCoverage: Integer? = null,

    @SerialName("repository")
    override val repository: kotlin.collections.List<MolecularSequenceRepository>? = null,

    @SerialName("pointer")
    override val pointer: kotlin.collections.List<Reference>? = null,

    @SerialName("structureVariant")
    override val structureVariant: kotlin.collections.List<MolecularSequenceStructureVariant>? = null,

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
) : FhirMolecularSequence {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequence"
    }
}

/**
 * FhirMolecularSequenceQuality
 *
 * An experimental feature attribute that defines the quality of the feature in a quantitative way,
 * such as a phred quality score
 * ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceQuality</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceQuality : FhirBackboneElement {

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

    /**
     * Receiver Operator Characteristic (ROC) Curve.
     */
    val roc: MolecularSequenceQualityRoc?
}

/**
 * MolecularSequenceQuality
 *
 * An experimental feature attribute that defines the quality of the feature in a quantitative way,
 * such as a phred quality score
 * ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceQuality</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceQuality")
data class MolecularSequenceQuality(

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

    @SerialName("roc")
    override val roc: MolecularSequenceQualityRoc? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMolecularSequenceQuality {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceQuality"
    }
}

/**
 * FhirMolecularSequenceQualityRoc
 *
 * Receiver Operator Characteristic (ROC) Curve to give sensitivity/specificity tradeoff.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceQualityRoc</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceQualityRoc : FhirBackboneElement {

    /**
     * Genotype quality score.
     */
    val score: kotlin.collections.List<Integer>?

    /**
     * Roc score true positive numbers.
     */
    val numTP: kotlin.collections.List<Integer>?

    /**
     * Roc score false positive numbers.
     */
    val numFP: kotlin.collections.List<Integer>?

    /**
     * Roc score false negative numbers.
     */
    val numFN: kotlin.collections.List<Integer>?

    /**
     * Precision of the GQ score.
     */
    val precision: kotlin.collections.List<Decimal>?

    /**
     * Sensitivity of the GQ score.
     */
    val sensitivity: kotlin.collections.List<Decimal>?

    /**
     * FScore of the GQ score.
     */
    val fMeasure: kotlin.collections.List<Decimal>?
}

/**
 * MolecularSequenceQualityRoc
 *
 * Receiver Operator Characteristic (ROC) Curve to give sensitivity/specificity tradeoff.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceQualityRoc</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceQualityRoc")
data class MolecularSequenceQualityRoc(

    @SerialName("score")
    override val score: kotlin.collections.List<Integer>? = null,

    @SerialName("numTP")
    override val numTP: kotlin.collections.List<Integer>? = null,

    @SerialName("numFP")
    override val numFP: kotlin.collections.List<Integer>? = null,

    @SerialName("numFN")
    override val numFN: kotlin.collections.List<Integer>? = null,

    @SerialName("precision")
    override val precision: kotlin.collections.List<Decimal>? = null,

    @SerialName("sensitivity")
    override val sensitivity: kotlin.collections.List<Decimal>? = null,

    @SerialName("fMeasure")
    override val fMeasure: kotlin.collections.List<Decimal>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMolecularSequenceQualityRoc {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceQualityRoc"
    }
}

/**
 * FhirMolecularSequenceReferenceSeq
 *
 * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceReferenceSeq</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceReferenceSeq : FhirBackboneElement {

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
     * A relative reference to a DNA strand based on gene orientation. The strand that
     * contains the open reading frame of the gene is the "sense" strand, and the
     * opposite complementary strand is the "antisense" strand.
     */
    val orientation: OrientationType?

    /**
     * Reference identifier.
     */
    val referenceSeqId: CodeableConcept?

    /**
     * A pointer to another MolecularSequence entity as reference sequence.
     */
    val referenceSeqPointer: Reference?

    /**
     * A string to represent reference sequence.
     */
    val referenceSeqString: String?

    /**
     * An absolute reference to a strand. The Watson strand is the strand whose 5'-end
     * is on the short arm of the chromosome, and the Crick strand as the one whose
     * 5'-end is on the long arm.
     */
    val strand: StrandType?

    /**
     * Start position of the window on the reference sequence.
     */
    val windowStart: Integer?

    /**
     * End position of the window on the reference sequence.
     */
    val windowEnd: Integer?
}

/**
 * MolecularSequenceReferenceSeq
 *
 * A sequence that is used as a reference to describe variants that are present in a sequence analyzed.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceReferenceSeq</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceReferenceSeq")
data class MolecularSequenceReferenceSeq(

    @SerialName("chromosome")
    override val chromosome: CodeableConcept? = null,

    @SerialName("genomeBuild")
    override val genomeBuild: String? = null,

    @SerialName("orientation")
    override val orientation: OrientationType? = null,

    @SerialName("referenceSeqId")
    override val referenceSeqId: CodeableConcept? = null,

    @SerialName("referenceSeqPointer")
    override val referenceSeqPointer: Reference? = null,

    @SerialName("referenceSeqString")
    override val referenceSeqString: String? = null,

    @SerialName("strand")
    override val strand: StrandType? = null,

    @SerialName("windowStart")
    override val windowStart: Integer? = null,

    @SerialName("windowEnd")
    override val windowEnd: Integer? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMolecularSequenceReferenceSeq {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceReferenceSeq"
    }
}

/**
 * FhirMolecularSequenceRepository
 *
 * Configurations of the external repository. The repository shall store target's observedSeq or
 * records related with target's observedSeq.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceRepository</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceRepository : FhirBackboneElement {

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
 * MolecularSequenceRepository
 *
 * Configurations of the external repository. The repository shall store target's observedSeq or
 * records related with target's observedSeq.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceRepository</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceRepository")
data class MolecularSequenceRepository(

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
) : FhirMolecularSequenceRepository {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceRepository"
    }
}

/**
 * FhirMolecularSequenceStructureVariant
 *
 * Information about chromosome structure variation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceStructureVariant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceStructureVariant : FhirBackboneElement {

    /**
     * Structural variant change type.
     */
    val variantType: CodeableConcept?

    /**
     * Does the structural variant have base pair resolution breakpoints?.
     */
    val exact: Bool?

    /**
     * Structural variant length.
     */
    val length: Integer?

    /**
     * Structural variant outer.
     */
    val outer: MolecularSequenceStructureVariantOuter?

    /**
     * Structural variant inner.
     */
    val inner: MolecularSequenceStructureVariantInner?
}

/**
 * MolecularSequenceStructureVariant
 *
 * Information about chromosome structure variation.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceStructureVariant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceStructureVariant")
data class MolecularSequenceStructureVariant(

    @SerialName("variantType")
    override val variantType: CodeableConcept? = null,

    @SerialName("exact")
    override val exact: Bool? = null,

    @SerialName("length")
    override val length: Integer? = null,

    @SerialName("outer")
    override val outer: MolecularSequenceStructureVariantOuter? = null,

    @SerialName("inner")
    override val inner: MolecularSequenceStructureVariantInner? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMolecularSequenceStructureVariant {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceStructureVariant"
    }
}

/**
 * FhirMolecularSequenceStructureVariantInner
 *
 * Structural variant inner
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceStructureVariantInner</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceStructureVariantInner : FhirBackboneElement {

    /**
     * Structural variant inner start.
     */
    val start: Integer?

    /**
     * Structural variant inner end.
     */
    val end: Integer?
}

/**
 * MolecularSequenceStructureVariantInner
 *
 * Structural variant inner
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceStructureVariantInner</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceStructureVariantInner")
data class MolecularSequenceStructureVariantInner(

    @SerialName("start")
    override val start: Integer? = null,

    @SerialName("end")
    override val end: Integer? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMolecularSequenceStructureVariantInner {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceStructureVariantInner"
    }
}

/**
 * FhirMolecularSequenceStructureVariantOuter
 *
 * Structural variant outer
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceStructureVariantOuter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceStructureVariantOuter : FhirBackboneElement {

    /**
     * Structural variant outer start.
     */
    val start: Integer?

    /**
     * Structural variant outer end.
     */
    val end: Integer?
}

/**
 * MolecularSequenceStructureVariantOuter
 *
 * Structural variant outer
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceStructureVariantOuter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceStructureVariantOuter")
data class MolecularSequenceStructureVariantOuter(

    @SerialName("start")
    override val start: Integer? = null,

    @SerialName("end")
    override val end: Integer? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMolecularSequenceStructureVariantOuter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceStructureVariantOuter"
    }
}

/**
 * FhirMolecularSequenceVariant
 *
 * The definition of variant here originates from Sequence ontology
 * ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element
 * can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.) It can
 * represent some complex mutation or segment variation with the assist of CIGAR string.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceVariant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
interface FhirMolecularSequenceVariant : FhirBackboneElement {

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
 * MolecularSequenceVariant
 *
 * The definition of variant here originates from Sequence ontology
 * ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element
 * can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.) It can
 * represent some complex mutation or segment variation with the assist of CIGAR string.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MolecularSequence">MolecularSequenceVariant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MolecularSequence)
 */
@Serializable
@SerialName("MolecularSequenceVariant")
data class MolecularSequenceVariant(

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
) : FhirMolecularSequenceVariant {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MolecularSequenceVariant"
    }
}
