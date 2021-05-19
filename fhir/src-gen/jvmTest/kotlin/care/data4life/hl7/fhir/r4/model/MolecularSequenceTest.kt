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
        assertMolecularSequence01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence01Step01(data: MolecularSequence) {

        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "breastcancer",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/brcapat",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NM_000059.3",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Homo sapiens BRCA2, DNA repair associated (BRCA2), mRNA",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore/",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "101499444".toInt(),
            actual = data.referenceSeq?.windowEnd?.value
        )

        assertEquals(
            expected = "101488058".toInt(),
            actual = data.referenceSeq?.windowStart?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = SequenceType.RNA,
            actual = data.type
        )

        assertEquals(
            expected = "32316187".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "A",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "C",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "32316186".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testMolecularSequence02() {
        // Given
        val sourceJson = loadAsString("r4/sequence-graphic-example-1.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence02Step01(data: MolecularSequence) {

        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "graphic-example-1",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "MolecularSequence/graphic-example-2",
            actual = data.pointer?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NC_000002.12",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
            expected = SequenceType.DNA,
            actual = data.type
        )

        assertEquals(
            expected = "1M",
            actual = data.variant?.get(0)?.cigar
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "128273726".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "128273725".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testMolecularSequence03() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-fda-vcfeval.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence03Step01(data: MolecularSequence) {

        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "fda-vcfeval-comparison",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/apps/",
            actual = data.quality?.get(0)?.method?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vcfeval + Hap.py Comparison",
            actual = data.quality?.get(0)?.method?.text
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/",
            actual = data.quality?.get(0)?.standardSequence?.coding?.get(0)?.system
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/apps/",
            actual = data.quality?.get(1)?.method?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vcfeval + Hap.py Comparison",
            actual = data.quality?.get(1)?.method?.text
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/",
            actual = data.quality?.get(1)?.standardSequence?.coding?.get(0)?.system
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RepositoryType.LOGIN,
            actual = data.repository?.get(0)?.type
        )

        assertEquals(
            expected = "https://precision.fda.gov/jobs/job-ByxYPx809jFVy21KJG74Jg3Y",
            actual = data.repository?.get(0)?.url
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "13116".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testMolecularSequence04() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-TPMT-one.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence04Step01(data: MolecularSequence) {

        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "example-TPMT-one",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "T-C-C-C-A-C-C-C",
            actual = data.observedSeq
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NT_007592.15",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
            expected = SequenceType.DNA,
            actual = data.type
        )

        assertEquals(
            expected = "18139214".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "A",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "18139214".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testMolecularSequence05() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-pgx-2.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence05Step01(data: MolecularSequence) {

        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "example-pgx-2",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = OrientationType.SENSE,
            actual = data.referenceSeq?.orientation
        )

        assertEquals(
            expected = "NG_007726.3",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
            expected = SequenceType.DNA,
            actual = data.type
        )

        assertEquals(
            expected = "55227979".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "55227978".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )

        assertEquals(
            expected = "Target Haplotype Observation",
            actual = data.variant?.get(0)?.variantPointer?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Observation/example-haplotype2",
            actual = data.variant?.get(0)?.variantPointer?.reference
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testMolecularSequence06() {
        // Given
        val sourceJson = loadAsString("r4/molecularsequence-example.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence06Step01(data: MolecularSequence) {

        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NC_000009.11",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RepositoryType.OPENAPI,
            actual = data.repository?.get(0)?.type
        )

        assertEquals(
            expected = "http://grch37.rest.ensembl.org/ga4gh/variants/3:rs1333049?content-type=application/json",
            actual = data.repository?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3:rs1333049",
            actual = data.repository?.get(0)?.variantsetId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = SequenceType.DNA,
            actual = data.type
        )

        assertEquals(
            expected = "22125504".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "C",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "22125503".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testMolecularSequence07() {
        // Given
        val sourceJson = loadAsString("r4/sequence-example-fda.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence07Step01(data: MolecularSequence) {

        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "fda-example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/jobs/",
            actual = data.quality?.get(0)?.method?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vcfeval + Hap.py Comparison",
            actual = data.quality?.get(0)?.method?.text
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/",
            actual = data.quality?.get(0)?.standardSequence?.coding?.get(0)?.system
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RepositoryType.LOGIN,
            actual = data.repository?.get(0)?.type
        )

        assertEquals(
            expected = "https://precision.fda.gov/files/file-Bx37ZK009P4bX5g3qjkFZV38",
            actual = data.repository?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "file-Bx37ZK009P4bX5g3qjkFZV38",
            actual = data.repository?.get(0)?.variantsetId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = SequenceType.DNA,
            actual = data.type
        )

        assertEquals(
            expected = "13117".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "G",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "13116".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )
    }

    @Test
    fun testMolecularSequence08() {
        // Given
        val sourceJson = loadAsString("r4/coord-1base-example.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence08Step01(data: MolecularSequence) {

        assertEquals(
            expected = "1".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "coord-1-base",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ACATGGTAGC",
            actual = data.observedSeq
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ACGTAGTC",
            actual = data.referenceSeq?.referenceSeqString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
            expected = SequenceType.DNA,
            actual = data.type
        )

        assertEquals(
            expected = "3I",
            actual = data.variant?.get(0)?.cigar
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3".toInt(),
            actual = data.variant?.get(0)?.end?.value
        )

        assertEquals(
            expected = "ATG",
            actual = data.variant?.get(0)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-",
            actual = data.variant?.get(0)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2".toInt(),
            actual = data.variant?.get(0)?.start?.value
        )

        assertEquals(
            expected = "3I",
            actual = data.variant?.get(1)?.cigar
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "5".toInt(),
            actual = data.variant?.get(1)?.end?.value
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(1)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A",
            actual = data.variant?.get(1)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "5".toInt(),
            actual = data.variant?.get(1)?.start?.value
        )

        assertEquals(
            expected = "1D",
            actual = data.variant?.get(2)?.cigar
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "7".toInt(),
            actual = data.variant?.get(2)?.end?.value
        )

        assertEquals(
            expected = "-",
            actual = data.variant?.get(2)?.observedAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "T",
            actual = data.variant?.get(2)?.referenceAllele
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "7".toInt(),
            actual = data.variant?.get(2)?.start?.value
        )
    }

    @Test
    fun testMolecularSequence09() {
        // Given
        val sourceJson = loadAsString("r4/sequence-graphic-example-4.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence09Step01(data: MolecularSequence) {

        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "graphic-example-4",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.referenceSeq?.chromosome?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "chromosome 2",
            actual = data.referenceSeq?.chromosome?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/chromosome-human",
            actual = data.referenceSeq?.chromosome?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "GRCh 38",
            actual = data.referenceSeq?.genomeBuild
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
            expected = SequenceType.DNA,
            actual = data.type
        )
    }

    @Test
    fun testMolecularSequence10() {
        // Given
        val sourceJson = loadAsString("r4/sequence-graphic-example-5.json")

        // When
        val data = parser.toFhir(MolecularSequence::class, sourceJson)

        // Then
        assertMolecularSequence10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMolecularSequence10Step01(data: MolecularSequence) {

        assertEquals(
            expected = "0".toInt(),
            actual = data.coordinateSystem?.value
        )

        assertEquals(
            expected = "graphic-example-5",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NC_000002.12",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/nuccore",
            actual = data.referenceSeq?.referenceSeqId?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StrandType.WATSON,
            actual = data.referenceSeq?.strand
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
            expected = SequenceType.DNA,
            actual = data.type
        )
    }
}
