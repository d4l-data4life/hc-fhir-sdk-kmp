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

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.OrientationType
import care.data4life.hl7.fhir.r4.codesystem.QualityType
import care.data4life.hl7.fhir.r4.codesystem.RepositoryType
import care.data4life.hl7.fhir.r4.codesystem.SequenceType
import care.data4life.hl7.fhir.r4.codesystem.StrandType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MolecularSequenceTest.java
 *
 * Information about a biological sequence
 *
 * Raw data describing a biological sequence.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MolecularSequenceTest {

    val parser = FhirR4Parser()

    @Test
    fun testMolecularSequence01() {
        // Given
        val sourceJson = loadAsString("r4/sequence-genetics-example-breastcancer.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "0".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "breastcancer",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Patient/brcapat",
            data.patient?.reference
        )
        assertEquals(
            "NM_000059.3",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "Homo sapiens BRCA2, DNA repair associated (BRCA2), mRNA",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore/",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            "101499444".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "101488058".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.RNA,
            data.type
        )
        assertEquals(
            "32316187".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "A",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "C",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "32316186".toInt(),
            data.variant?.get(0)?.start?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence02() {
        // Given
        val sourceJson = loadAsString("r4/sequence-graphic-example-1.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "0".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "graphic-example-1",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "MolecularSequence/graphic-example-2",
            data.pointer?.get(0)?.reference
        )
        assertEquals(
            "NC_000002.12",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "128273732".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "128273724".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )
        assertEquals(
            "1M",
            data.variant?.get(0)?.cigar
        )
        assertEquals(
            "128273726".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "G",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "T",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "128273725".toInt(),
            data.variant?.get(0)?.start?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence03() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-fda-vcfeval.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "1".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "fda-vcfeval-comparison",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "101770080".toInt(),
            data.quality?.get(0)?.end?.value
        )
        assertEquals(
            "2186".toDouble(),
            data.quality?.get(0)?.gtFP?.value
        )
        assertEquals(
            "app-BxfGF8j02pBZzZxbzZxP725P",
            data.quality?.get(0)?.method?.coding?.get(0)?.code
        )
        assertEquals(
            "https://precision.fda.gov/apps/",
            data.quality?.get(0)?.method?.coding?.get(0)?.system
        )
        assertEquals(
            "Vcfeval + Hap.py Comparison",
            data.quality?.get(0)?.method?.text
        )
        assertEquals(
            "0.428005".toDouble(),
            data.quality?.get(0)?.precision?.value
        )
        assertEquals(
            "10670".toDouble(),
            data.quality?.get(0)?.queryFP?.value
        )
        assertEquals(
            "0.752111".toDouble(),
            data.quality?.get(0)?.recall?.value
        )
        assertEquals(
            "file-BkZxBZ00bpJVk2q6x43b1YBx",
            data.quality?.get(0)?.standardSequence?.coding?.get(0)?.code
        )
        assertEquals(
            "https://precision.fda.gov/files/",
            data.quality?.get(0)?.standardSequence?.coding?.get(0)?.system
        )
        assertEquals(
            "10453".toInt(),
            data.quality?.get(0)?.start?.value
        )
        assertEquals(
            "2554".toDouble(),
            data.quality?.get(0)?.truthFN?.value
        )
        assertEquals(
            "7749".toDouble(),
            data.quality?.get(0)?.truthTP?.value
        )
        assertEquals(
            QualityType.INDEL,
            data.quality?.get(0)?.type
        )
        assertEquals(
            "101770080".toInt(),
            data.quality?.get(1)?.end?.value
        )
        assertEquals(
            "493".toDouble(),
            data.quality?.get(1)?.gtFP?.value
        )
        assertEquals(
            "app-BxfGF8j02pBZzZxbzZxP725P",
            data.quality?.get(1)?.method?.coding?.get(0)?.code
        )
        assertEquals(
            "https://precision.fda.gov/apps/",
            data.quality?.get(1)?.method?.coding?.get(0)?.system
        )
        assertEquals(
            "Vcfeval + Hap.py Comparison",
            data.quality?.get(1)?.method?.text
        )
        assertEquals(
            "0.808602".toDouble(),
            data.quality?.get(1)?.precision?.value
        )
        assertEquals(
            "21744".toDouble(),
            data.quality?.get(1)?.queryFP?.value
        )
        assertEquals(
            "0.986642".toDouble(),
            data.quality?.get(1)?.recall?.value
        )
        assertEquals(
            "file-BkZxBZ00bpJVk2q6x43b1YBx",
            data.quality?.get(1)?.standardSequence?.coding?.get(0)?.code
        )
        assertEquals(
            "https://precision.fda.gov/files/",
            data.quality?.get(1)?.standardSequence?.coding?.get(0)?.system
        )
        assertEquals(
            "10453".toInt(),
            data.quality?.get(1)?.start?.value
        )
        assertEquals(
            "1247".toDouble(),
            data.quality?.get(1)?.truthFN?.value
        )
        assertEquals(
            "92106".toDouble(),
            data.quality?.get(1)?.truthTP?.value
        )
        assertEquals(
            QualityType.SNP,
            data.quality?.get(1)?.type
        )
        assertEquals(
            "NC_000001.11",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "101770080".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "10453".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            "FDA",
            data.repository?.get(0)?.name
        )
        assertEquals(
            RepositoryType.LOGIN,
            data.repository?.get(0)?.type
        )
        assertEquals(
            "https://precision.fda.gov/jobs/job-ByxYPx809jFVy21KJG74Jg3Y",
            data.repository?.get(0)?.url
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "13117".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "T",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "G",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "13116".toInt(),
            data.variant?.get(0)?.start?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence04() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-TPMT-one.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "1".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "example-TPMT-one",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "T-C-C-C-A-C-C-C",
            data.observedSeq
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "NT_007592.15",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "18143955".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "18130918".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )
        assertEquals(
            "18139214".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "A",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "G",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "18139214".toInt(),
            data.variant?.get(0)?.start?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence05() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-pgx-2.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "0".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "example-pgx-2",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            OrientationType.SENSE,
            data.referenceSeq?.orientation
        )
        assertEquals(
            "NG_007726.3",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "55227980".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "55227970".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )
        assertEquals(
            "55227979".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "G",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "T",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "55227978".toInt(),
            data.variant?.get(0)?.start?.value
        )
        assertEquals(
            "Target Haplotype Observation",
            data.variant?.get(0)?.variantPointer?.display
        )
        assertEquals(
            "Observation/example-haplotype2",
            data.variant?.get(0)?.variantPointer?.reference
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence06() {
        // Given
        val sourceJson = loadAsString("r4/molecularsequence-example.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "0".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "NC_000009.11",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "22125510".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "22125500".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            "GA4GH API",
            data.repository?.get(0)?.name
        )
        assertEquals(
            RepositoryType.OPENAPI,
            data.repository?.get(0)?.type
        )
        assertEquals(
            "http://grch37.rest.ensembl.org/ga4gh/variants/3:rs1333049?content-type=application/json",
            data.repository?.get(0)?.url
        )
        assertEquals(
            "3:rs1333049",
            data.repository?.get(0)?.variantsetId
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )
        assertEquals(
            "22125504".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "C",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "G",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "22125503".toInt(),
            data.variant?.get(0)?.start?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence07() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-fda.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "1".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "fda-example",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "101770080".toInt(),
            data.quality?.get(0)?.end?.value
        )
        assertEquals(
            "0.545551".toDouble(),
            data.quality?.get(0)?.fScore?.value
        )
        assertEquals(
            "2186".toDouble(),
            data.quality?.get(0)?.gtFP?.value
        )
        assertEquals(
            "job-ByxYPx809jFVy21KJG74Jg3Y",
            data.quality?.get(0)?.method?.coding?.get(0)?.code
        )
        assertEquals(
            "https://precision.fda.gov/jobs/",
            data.quality?.get(0)?.method?.coding?.get(0)?.system
        )
        assertEquals(
            "Vcfeval + Hap.py Comparison",
            data.quality?.get(0)?.method?.text
        )
        assertEquals(
            "0.428005".toDouble(),
            data.quality?.get(0)?.precision?.value
        )
        assertEquals(
            "10670".toDouble(),
            data.quality?.get(0)?.queryFP?.value
        )
        assertEquals(
            "7984".toDouble(),
            data.quality?.get(0)?.queryTP?.value
        )
        assertEquals(
            "0.752111".toDouble(),
            data.quality?.get(0)?.recall?.value
        )
        assertEquals(
            "file-Bk50V4Q0qVb65P0v2VPbfYPZ",
            data.quality?.get(0)?.standardSequence?.coding?.get(0)?.code
        )
        assertEquals(
            "https://precision.fda.gov/files/",
            data.quality?.get(0)?.standardSequence?.coding?.get(0)?.system
        )
        assertEquals(
            "10453".toInt(),
            data.quality?.get(0)?.start?.value
        )
        assertEquals(
            "2554".toDouble(),
            data.quality?.get(0)?.truthFN?.value
        )
        assertEquals(
            "7749".toDouble(),
            data.quality?.get(0)?.truthTP?.value
        )
        assertEquals(
            QualityType.SNP,
            data.quality?.get(0)?.type
        )
        assertEquals(
            "NC_000001.11",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "101770080".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "10453".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            "FDA",
            data.repository?.get(0)?.name
        )
        assertEquals(
            RepositoryType.LOGIN,
            data.repository?.get(0)?.type
        )
        assertEquals(
            "https://precision.fda.gov/files/file-Bx37ZK009P4bX5g3qjkFZV38",
            data.repository?.get(0)?.url
        )
        assertEquals(
            "file-Bx37ZK009P4bX5g3qjkFZV38",
            data.repository?.get(0)?.variantsetId
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )
        assertEquals(
            "13117".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "T",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "G",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "13116".toInt(),
            data.variant?.get(0)?.start?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence08() {
        // Given
        val sourceJson = loadAsString("r4/coord-1base-example.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "1".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "coord-1-base",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "ACATGGTAGC",
            data.observedSeq
        )
        assertEquals(
            "ACGTAGTC",
            data.referenceSeq?.referenceSeqString
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "8".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "1".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )
        assertEquals(
            "3I",
            data.variant?.get(0)?.cigar
        )
        assertEquals(
            "3".toInt(),
            data.variant?.get(0)?.end?.value
        )
        assertEquals(
            "ATG",
            data.variant?.get(0)?.observedAllele
        )
        assertEquals(
            "-",
            data.variant?.get(0)?.referenceAllele
        )
        assertEquals(
            "2".toInt(),
            data.variant?.get(0)?.start?.value
        )
        assertEquals(
            "3I",
            data.variant?.get(1)?.cigar
        )
        assertEquals(
            "5".toInt(),
            data.variant?.get(1)?.end?.value
        )
        assertEquals(
            "T",
            data.variant?.get(1)?.observedAllele
        )
        assertEquals(
            "A",
            data.variant?.get(1)?.referenceAllele
        )
        assertEquals(
            "5".toInt(),
            data.variant?.get(1)?.start?.value
        )
        assertEquals(
            "1D",
            data.variant?.get(2)?.cigar
        )
        assertEquals(
            "7".toInt(),
            data.variant?.get(2)?.end?.value
        )
        assertEquals(
            "-",
            data.variant?.get(2)?.observedAllele
        )
        assertEquals(
            "T",
            data.variant?.get(2)?.referenceAllele
        )
        assertEquals(
            "7".toInt(),
            data.variant?.get(2)?.start?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence09() {
        // Given
        val sourceJson = loadAsString("r4/sequence-graphic-example-4.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "0".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "graphic-example-4",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2",
            data.referenceSeq?.chromosome?.coding?.get(0)?.code
        )
        assertEquals(
            "chromosome 2",
            data.referenceSeq?.chromosome?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/chromosome-human",
            data.referenceSeq?.chromosome?.coding?.get(0)?.system
        )
        assertEquals(
            "GRCh 38",
            data.referenceSeq?.genomeBuild
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "128273740".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "128273736".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMolecularSequence10() {
        // Given
        val sourceJson = loadAsString("r4/sequence-graphic-example-5.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertEquals(
            "0".toInt(),
            data.coordinateSystem?.value
        )
        assertEquals(
            "graphic-example-5",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "NC_000002.12",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/nuccore",
            data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
        )
        assertEquals(
            StrandType.WATSON,
            data.referenceSeq?.strand
        )
        assertEquals(
            "128273736".toInt(),
            data.referenceSeq?.windowEnd?.value
        )
        assertEquals(
            "128273732".toInt(),
            data.referenceSeq?.windowStart?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SequenceType.DNA,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
