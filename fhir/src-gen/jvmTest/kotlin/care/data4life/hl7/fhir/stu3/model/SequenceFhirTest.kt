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

import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.QualityType
import care.data4life.hl7.fhir.stu3.codesystem.RepositoryType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * SequenceTest.java
 *
 * Information about a biological sequence
 *
 * Raw data describing a biological sequence.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SequenceFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testSequence01() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-graphic-example-1.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence01Step01(data: Sequence) {
        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "graphic-example-1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sequence/graphic-example-2",
            actual = data.pointer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NC_000002.12",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "128273732".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "128273724".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1M",
            actual = data.variant?.get(0)?.cigar
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "128273726".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "128273725".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testSequence02() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-example-fda-vcfeval.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence02Step01(data: Sequence) {
        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "fda-vcfeval-comparison",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "101770080".toInt(),
            actual = data.quality?.get(0)?.end?.value
        )

        assertEquals(
            expected = "2186".toDouble(),
            actual = data.quality?.get(0)?.gtFP?.value
        )

        assertEquals(
            expected = "app-BxfGF8j02pBZzZxbzZxP725P",
            actual = data.quality?.get(0)?.method?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/apps/",
            actual = data.quality?.get(0)?.method?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vcfeval + Hap.py Comparison",
            actual = data.quality?.get(0)?.method?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.428005".toDouble(),
            actual = data.quality?.get(0)?.precision?.value
        )

        assertEquals(
            expected = "10670".toDouble(),
            actual = data.quality?.get(0)?.queryFP?.value
        )

        assertEquals(
            expected = "0.752111".toDouble(),
            actual = data.quality?.get(0)?.recall?.value
        )

        assertEquals(
            expected = "file-BkZxBZ00bpJVk2q6x43b1YBx",
            actual = data.quality?.get(0)?.standardSequence?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/",
            actual = data.quality?.get(0)?.standardSequence?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10453".toInt(),
            actual = data.quality?.get(0)?.start?.value
        )

        assertEquals(
            expected = "2554".toDouble(),
            actual = data.quality?.get(0)?.truthFN?.value
        )

        assertEquals(
            expected = "7749".toDouble(),
            actual = data.quality?.get(0)?.truthTP?.value
        )

        assertEquals(
            expected = QualityType.INDEL,
            actual = data.quality?.get(0)?.type
        )

        assertEquals(
            expected = "101770080".toInt(),
            actual = data.quality?.get(1)?.end?.value
        )

        assertEquals(
            expected = "493".toDouble(),
            actual = data.quality?.get(1)?.gtFP?.value
        )

        assertEquals(
            expected = "app-BxfGF8j02pBZzZxbzZxP725P",
            actual = data.quality?.get(1)?.method?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/apps/",
            actual = data.quality?.get(1)?.method?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vcfeval + Hap.py Comparison",
            actual = data.quality?.get(1)?.method?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.808602".toDouble(),
            actual = data.quality?.get(1)?.precision?.value
        )

        assertEquals(
            expected = "21744".toDouble(),
            actual = data.quality?.get(1)?.queryFP?.value
        )

        assertEquals(
            expected = "0.986642".toDouble(),
            actual = data.quality?.get(1)?.recall?.value
        )

        assertEquals(
            expected = "file-BkZxBZ00bpJVk2q6x43b1YBx",
            actual = data.quality?.get(1)?.standardSequence?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/",
            actual = data.quality?.get(1)?.standardSequence?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10453".toInt(),
            actual = data.quality?.get(1)?.start?.value
        )

        assertEquals(
            expected = "1247".toDouble(),
            actual = data.quality?.get(1)?.truthFN?.value
        )

        assertEquals(
            expected = "92106".toDouble(),
            actual = data.quality?.get(1)?.truthTP?.value
        )

        assertEquals(
            expected = QualityType.SNP,
            actual = data.quality?.get(1)?.type
        )

        assertEquals(
            expected = "NC_000001.11",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "101770080".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "10453".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = "FDA",
            actual = data.repository?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RepositoryType.LOGIN,
            actual = data.repository?.get(0)?.type
        )

        assertEquals(
            expected = "https://precision.fda.gov/jobs/job-ByxYPx809jFVy21KJG74Jg3Y",
            actual = data.repository?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "13117".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "13116".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testSequence03() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-example-TPMT-one.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence03Step01(data: Sequence) {
        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "example-TPMT-one",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T-C-C-C-A-C-C-C",
            actual = data.observedSeq
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NT_007592.15",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "18143955".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "18130918".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18139214".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "A",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18139214".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testSequence04() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-example-pgx-2.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence04Step01(data: Sequence) {
        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "example-pgx-2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NG_007726.3",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "55227980".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "55227970".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "55227979".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "55227978".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )

        assertEquals(
            expected = "Target Haplotype Observation",
            actual = data.variant?.get(0)?.variantPointer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/example-haplotype2",
            actual = data.variant?.get(0)?.variantPointer?.reference
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testSequence05() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-example.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence05Step01(data: Sequence) {
        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NC_000009.11",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "22125510".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "22125500".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = "GA4GH API",
            actual = data.repository?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RepositoryType.OPENAPI,
            actual = data.repository?.get(0)?.type
        )

        assertEquals(
            expected = "http://grch37.rest.ensembl.org/ga4gh/variants/3:rs1333049?content-type=application/json",
            actual = data.repository?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3:rs1333049",
            actual = data.repository?.get(0)?.variantsetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "22125504".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "C",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "22125503".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testSequence06() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-example-fda.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence06Step01(data: Sequence) {
        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "fda-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "101770080".toInt(),
            actual = data.quality?.get(0)?.end?.value
        )

        assertEquals(
            expected = "0.545551".toDouble(),
            actual = data.quality?.get(0)?.fScore?.value
        )

        assertEquals(
            expected = "2186".toDouble(),
            actual = data.quality?.get(0)?.gtFP?.value
        )

        assertEquals(
            expected = "job-ByxYPx809jFVy21KJG74Jg3Y",
            actual = data.quality?.get(0)?.method?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/jobs/",
            actual = data.quality?.get(0)?.method?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vcfeval + Hap.py Comparison",
            actual = data.quality?.get(0)?.method?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.428005".toDouble(),
            actual = data.quality?.get(0)?.precision?.value
        )

        assertEquals(
            expected = "10670".toDouble(),
            actual = data.quality?.get(0)?.queryFP?.value
        )

        assertEquals(
            expected = "7984".toDouble(),
            actual = data.quality?.get(0)?.queryTP?.value
        )

        assertEquals(
            expected = "0.752111".toDouble(),
            actual = data.quality?.get(0)?.recall?.value
        )

        assertEquals(
            expected = "file-Bk50V4Q0qVb65P0v2VPbfYPZ",
            actual = data.quality?.get(0)?.standardSequence?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/",
            actual = data.quality?.get(0)?.standardSequence?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10453".toInt(),
            actual = data.quality?.get(0)?.start?.value
        )

        assertEquals(
            expected = "2554".toDouble(),
            actual = data.quality?.get(0)?.truthFN?.value
        )

        assertEquals(
            expected = "7749".toDouble(),
            actual = data.quality?.get(0)?.truthTP?.value
        )

        assertEquals(
            expected = QualityType.SNP,
            actual = data.quality?.get(0)?.type
        )

        assertEquals(
            expected = "NC_000001.11",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "101770080".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "10453".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = "FDA",
            actual = data.repository?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RepositoryType.LOGIN,
            actual = data.repository?.get(0)?.type
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/file-Bx37ZK009P4bX5g3qjkFZV38",
            actual = data.repository?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "file-Bx37ZK009P4bX5g3qjkFZV38",
            actual = data.repository?.get(0)?.variantsetId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "13117".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "13116".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testSequence07() {
        // Given
        val sourceJson = loadAsString("stu3/coord-1base-example.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence07Step01(data: Sequence) {
        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "coord-1-base",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACATGGTAGC",
            actual = data.observedSeq
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACGTAGTC",
            actual = data.referenceSeq?.referenceSeqString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "8".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3I",
            actual = data.variant?.get(0)?.cigar
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "ATG",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "-",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )

        assertEquals(
            expected = "3I",
            actual = data.variant?.get(1)?.cigar
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5".toInt(),
            actual = data.variant?.get(1)?.end?.value
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(1)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A",
            actual = data.variant?.get(1)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5".toInt(),
            actual = data.variant?.get(1)?.start?.value
        )

        assertEquals(
            expected = "1D",
            actual = data.variant?.get(2)?.cigar
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7".toInt(),
            actual = data.variant?.get(2)?.end?.value
        )

        assertEquals(
            expected = "-",
            actual = data.variant?.get(2)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(2)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7".toInt(),
            actual = data.variant?.get(2)?.start?.value
        )
    }

    @Test
    fun testSequence08() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-graphic-example-4.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence08Step01(data: Sequence) {
        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "graphic-example-4",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.referenceSeq?.chromosome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "chromosome 2",
            actual = data.referenceSeq?.chromosome?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/chromosome-human",
            actual = data.referenceSeq?.chromosome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "GRCh 38",
            actual = data.referenceSeq?.genomeBuild
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "128273740".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "128273736".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testSequence09() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-graphic-example-5.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence09Step01(data: Sequence) {
        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "graphic-example-5",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NC_000002.12",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "128273736".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "128273732".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testSequence10() {
        // Given
        val sourceJson = loadAsString("stu3/sequence-example-TPMT-two.json")

        // When
        val data = parser.toFhir(Sequence::class, sourceJson)

        // Then
        assertSequence10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSequence10Step01(data: Sequence) {
        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "example-TPMT-two",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T-C-T-C-G-C-C-C",
            actual = data.observedSeq
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NT_007592.15",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.referenceSeq?.strand?.value
        )

        assertEquals(
            expected = "18143955".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "18130918".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dna",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18131012".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "C",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18131012".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }
}
