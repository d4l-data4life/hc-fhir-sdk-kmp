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
import care.data4life.hl7.fhir.r4.codesystem.ProvenanceEntityRole
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ProvenanceTest.java
 *
 * Who, What, When for a set of resources
 *
 * Provenance of a resource is a record that describes entities and processes involved in producing and
 * delivering or otherwise influencing that resource. Provenance provides a critical foundation for
 * assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a
 * form of contextual metadata and can themselves become important records with their own provenance.
 * Provenance statement indicates clinical significance in terms of confidence in authenticity,
 * reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has
 * the artifact been legally authenticated), all of which may impact security, privacy, and trust
 * policies.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ProvenanceFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testProvenance01() {
        // Given
        val sourceJson = loadAsString("r4/provenance-example-sig.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then
        assertProvenance01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProvenance01Step01(data: Provenance) {
        assertEquals(
            expected = "AU",
            actual = data.activity?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "authenticated",
            actual = data.activity?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-DocumentCompletion",
            actual = data.activity?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "VERF",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contractsignertypecodes",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.agent?.get(0)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mailto://hhd@ssa.gov",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "signature",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TREAT",
            actual = data.reason?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "treatment",
            actual = data.reason?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.reason?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-27T08:39:24+10:00",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "Li4u",
            actual = data.signature?.get(0)?.data
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/signature+xml",
            actual = data.signature?.get(0)?.sigFormat
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/fhir+xml",
            actual = data.signature?.get(0)?.targetFormat
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.2.840.10065.1.12.1.5",
            actual = data.signature?.get(0)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Verification Signature",
            actual = data.signature?.get(0)?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso-astm:E1762-95:2013",
            actual = data.signature?.get(0)?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-27T08:39:24+10:00",
            actual = data.signature?.get(0)?.whenn?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.signature?.get(0)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DocumentReference/example",
            actual = data.target?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">procedure record authored on 27-June 2015 by Harold Hippocrates, MD Content extracted from Referral received 26-June</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProvenance02() {
        // Given
        val sourceJson = loadAsString("r4/provenance-example-cwl.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then
        assertProvenance02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProvenance02Step01(data: Provenance) {
        assertEquals(
            expected = "AUT",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.agent?.get(0)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ProvenanceEntityRole.SOURCE,
            actual = data.entity?.get(0)?.role
        )

        assertEquals(
            expected = "CWL",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lobSTR",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://github.com/common-workflow-language/workflows",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://github.com/common-workflow-language/workflows/blob/master/workflows/lobSTR/lobSTR-workflow.cwl",
            actual = data.entity?.get(0)?.what?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-cwl",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-30",
            actual = data.occurredPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "profiling Short Tandem Repeats (STRs) from high throughput sequencing data.",
            actual = data.reason?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-12-01T08:12:14+10:00",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "MolecularSequence/example-pgx-1",
            actual = data.target?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProvenance03() {
        // Given
        val sourceJson = loadAsString("r4/provenance-example-biocompute-object.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then
        assertProvenance03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProvenance03Step01(data: Provenance) {
        assertEquals(
            expected = "AUT",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.agent?.get(0)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ProvenanceEntityRole.SOURCE,
            actual = data.entity?.get(0)?.role
        )

        assertEquals(
            expected = "biocompute",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "obj.1001",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://hive.biochemistry.gwu.edu",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://hive.biochemistry.gwu.edu/cgi-bin/prd/htscsrs/servlet.cgi?pageid=bcoexample_1",
            actual = data.entity?.get(0)?.what?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-biocompute-object",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-06-06",
            actual = data.occurredPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "antiviral resistance detection",
            actual = data.reason?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-09T08:12:14+10:00",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "MolecularSequence/example",
            actual = data.target?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProvenance04() {
        // Given
        val sourceJson = loadAsString("r4/provenance-example.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then
        assertProvenance04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProvenance04Step01(data: Provenance) {
        assertEquals(
            expected = "AUT",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda-author",
            actual = data.agent?.get(0)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a1",
            actual = data.agent?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DEV",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/software",
            actual = data.agent?.get(1)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ProvenanceEntityRole.SOURCE,
            actual = data.entity?.get(0)?.role
        )

        assertEquals(
            expected = "CDA Document in XDS repository",
            actual = data.entity?.get(0)?.what?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DocumentReference/example",
            actual = data.entity?.get(0)?.what?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-28",
            actual = data.occurredPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-06-27",
            actual = data.occurredPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "http://acme.com/fhir/Consent/25",
            actual = data.policy?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3457005",
            actual = data.reason?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Referral",
            actual = data.reason?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reason?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-06-27T08:39:24+10:00",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "Procedure/example/_history/1",
            actual = data.target?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
