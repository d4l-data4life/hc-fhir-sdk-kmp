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
import care.data4life.hl7.fhir.stu3.codesystem.ProvenanceEntityRole
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

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
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ProvenanceTest {

    val parser = FhirStu3Parser()

    @Test
    fun testProvenance01() {
        // Given
        val sourceJson = loadAsString("stu3/provenance-example-sig.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then

        assertEquals(
            "AU",
            data.activity?.code
        )
        assertEquals(
            "authenticated",
            data.activity?.display
        )
        assertEquals(
            "http://hl7.org/fhir/v3/DocumentCompletion",
            data.activity?.system
        )
        assertEquals(
            "VERF",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://www.hl7.org/fhir/contractsignertypecodes",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "mailto://hhd@ssa.gov",
            data.agent?.get(0)?.whoUri
        )
        assertEquals(
            "signature",
            data.id
        )
        assertEquals(
            "TREAT",
            data.reason?.get(0)?.code
        )
        assertEquals(
            "treatment",
            data.reason?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/v3/ActReason",
            data.reason?.get(0)?.system
        )
        assertEquals(
            "2015-08-27T08:39:24+10:00",
            data.recorded?.value.toString()
        )
        assertEquals(
            "Li4u",
            data.signature?.get(0)?.blob
        )
        assertEquals(
            "application/signature+xml",
            data.signature?.get(0)?.contentType
        )
        assertEquals(
            "1.2.840.10065.1.12.1.5",
            data.signature?.get(0)?.type?.get(0)?.code
        )
        assertEquals(
            "Verification Signature",
            data.signature?.get(0)?.type?.get(0)?.display
        )
        assertEquals(
            "urn:iso-astm:E1762-95:2013",
            data.signature?.get(0)?.type?.get(0)?.system
        )
        assertEquals(
            "2015-08-27T08:39:24+10:00",
            data.signature?.get(0)?.whenn?.value.toString()
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.signature?.get(0)?.whoReference?.reference
        )
        assertEquals(
            "DocumentReference/example",
            data.target?.get(0)?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">procedure record authored on 27-June 2015 by Harold Hippocrates, MD Content extracted from Referral received 26-June</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProvenance02() {
        // Given
        val sourceJson = loadAsString("stu3/provenance-example-cwl.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then

        assertEquals(
            "AUT",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/ParticipationType",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Patient/example",
            data.agent?.get(0)?.whoReference?.reference
        )
        assertEquals(
            ProvenanceEntityRole.SOURCE,
            data.entity?.get(0)?.role
        )
        assertEquals(
            "CWL",
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "lobSTR",
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "https://github.com/common-workflow-language/workflows",
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "https://github.com/common-workflow-language/workflows/blob/master/workflows/lobSTR/lobSTR-workflow.cwl",
            data.entity?.get(0)?.whatIdentifier?.value
        )
        assertEquals(
            "example-cwl",
            data.id
        )
        assertEquals(
            "2016-11-30",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "profiling Short Tandem Repeats (STRs) from high throughput sequencing data.",
            data.reason?.get(0)?.display
        )
        assertEquals(
            "2016-12-01T08:12:14+10:00",
            data.recorded?.value.toString()
        )
        assertEquals(
            "Sequence/example-pgx-1",
            data.target?.get(0)?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProvenance03() {
        // Given
        val sourceJson = loadAsString("stu3/provenance-example-biocompute-object.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then

        assertEquals(
            "AUT",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/ParticipationType",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.agent?.get(0)?.whoReference?.reference
        )
        assertEquals(
            ProvenanceEntityRole.SOURCE,
            data.entity?.get(0)?.role
        )
        assertEquals(
            "biocompute",
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "obj.1001",
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "https://hive.biochemistry.gwu.edu",
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "https://hive.biochemistry.gwu.edu/cgi-bin/prd/htscsrs/servlet.cgi?pageid=bcoexample_1",
            data.entity?.get(0)?.whatIdentifier?.value
        )
        assertEquals(
            "example-biocompute-object",
            data.id
        )
        assertEquals(
            "2017-06-06",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "antiviral resistance detection",
            data.reason?.get(0)?.display
        )
        assertEquals(
            "2016-06-09T08:12:14+10:00",
            data.recorded?.value.toString()
        )
        assertEquals(
            "Sequence/example",
            data.target?.get(0)?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProvenance04() {
        // Given
        val sourceJson = loadAsString("stu3/provenance-example.json")

        // When
        val data = parser.toFhir(Provenance::class, sourceJson)

        // Then

        assertEquals(
            "#a1",
            data.agent?.get(0)?.onBehalfOfUri
        )
        assertEquals(
            "used",
            data.agent?.get(0)?.relatedAgentType?.text
        )
        assertEquals(
            "AUT",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/ParticipationType",
            data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/xcda-author",
            data.agent?.get(0)?.whoReference?.reference
        )
        assertEquals(
            "a1",
            data.agent?.get(1)?.id
        )
        assertEquals(
            "DEV",
            data.agent?.get(1)?.role?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/ParticipationType",
            data.agent?.get(1)?.role?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Device/software",
            data.agent?.get(1)?.whoReference?.reference
        )
        assertEquals(
            ProvenanceEntityRole.SOURCE,
            data.entity?.get(0)?.role
        )
        assertEquals(
            "CDA Document in XDS repository",
            data.entity?.get(0)?.whatReference?.display
        )
        assertEquals(
            "DocumentReference/example",
            data.entity?.get(0)?.whatReference?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "Location/1",
            data.location?.reference
        )
        assertEquals(
            "2015-06-28",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2015-06-27",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "http://acme.com/fhir/Consent/25",
            data.policy?.get(0)
        )
        assertEquals(
            "3457005",
            data.reason?.get(0)?.code
        )
        assertEquals(
            "Referral",
            data.reason?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.reason?.get(0)?.system
        )
        assertEquals(
            "2015-06-27T08:39:24+10:00",
            data.recorded?.value.toString()
        )
        assertEquals(
            "Procedure/example/_history/1",
            data.target?.get(0)?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">procedure record authored on 27-June 2015 by Harold Hippocrates, MD Content extracted from XDS managed CDA Referral received 26-June</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
