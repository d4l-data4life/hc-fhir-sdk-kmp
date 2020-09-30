/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model


import care.data4life.fhir.stu3.FhirStu3Parser
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.stu3.codesystem.ProvenanceEntityRole
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * ProvenanceTest.java
 *
 * Who, What, When for a set of resources.
 *
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class ProvenanceTest {

    val parser = FhirStu3Parser()


    @Test
    fun testProvenance1() {
        val sourceJson = loadAsString("provenance-example-sig.json")

        val data = parser.toFhir(Provenance::class, sourceJson)


        assertEquals(data.activity?.code, "AU")
        assertEquals(data.activity?.display, "authenticated")
        assertEquals(data.activity?.system, "http://hl7.org/fhir/v3/DocumentCompletion")
        assertEquals(data.agent.get(0).role?.get(0)?.coding?.get(0)?.code, "VERF")
        assertEquals(
            data.agent.get(0).role?.get(0)?.coding?.get(0)?.system,
            "http://www.hl7.org/fhir/contractsignertypecodes"
        )
        assertEquals(data.agent.get(0).whoUri, "mailto://hhd@ssa.gov")
        assertEquals(data.id, "signature")
        assertEquals(data.reason?.get(0)?.code, "TREAT")
        assertEquals(data.reason?.get(0)?.display, "treatment")
        assertEquals(data.reason?.get(0)?.system, "http://hl7.org/fhir/v3/ActReason")
        assertEquals(data.recorded, "2015-08-27T08:39:24+10:00")
        assertEquals(data.signature?.get(0)?.`when`, "2015-08-27T08:39:24+10:00")
        assertEquals(data.signature?.get(0)?.blob, "Li4u")
        assertEquals(data.signature?.get(0)?.contentType, "application/signature+xml")
        assertEquals(data.signature?.get(0)?.type?.get(0)?.code, "1.2.840.10065.1.12.1.5")
        assertEquals(data.signature?.get(0)?.type?.get(0)?.display, "Verification Signature")
        assertEquals(data.signature?.get(0)?.type?.get(0)?.system, "urn:iso-astm:E1762-95:2013")
        assertEquals(data.signature?.get(0)?.whoReference?.reference, "Practitioner/xcda-author")
        assertEquals(data.target.get(0).reference, "DocumentReference/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">procedure record authored on 27-June 2015 by Harold Hippocrates, MD Content extracted from Referral received 26-June</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProvenance2() {
        val sourceJson = loadAsString("provenance-example-cwl.json")

        val data = parser.toFhir(Provenance::class, sourceJson)


        assertEquals(data.agent.get(0).role?.get(0)?.coding?.get(0)?.code, "AUT")
        assertEquals(
            data.agent.get(0).role?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/v3/ParticipationType"
        )
        assertEquals(data.agent.get(0).whoReference?.reference, "Patient/example")
        assertEquals(data.entity?.get(0)?.role, ProvenanceEntityRole.SOURCE)
        assertEquals(data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.code, "CWL")
        assertEquals(data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.display, "lobSTR")
        assertEquals(
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.system,
            "https://github.com/common-workflow-language/workflows"
        )
        assertEquals(
            data.entity?.get(0)?.whatIdentifier?.value,
            "https://github.com/common-workflow-language/workflows/blob/master/workflows/lobSTR/lobSTR-workflow.cwl"
        )
        assertEquals(data.id, "example-cwl")
        assertEquals(data.period?.start, "2016-11-30")
        assertEquals(
            data.reason?.get(0)?.display,
            "profiling Short Tandem Repeats (STRs) from high throughput sequencing data."
        )
        assertEquals(data.recorded, "2016-12-01T08:12:14+10:00")
        assertEquals(data.target.get(0).reference, "Sequence/example-pgx-1")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProvenance3() {
        val sourceJson = loadAsString("provenance-example-biocompute-object.json")

        val data = parser.toFhir(Provenance::class, sourceJson)


        assertEquals(data.agent.get(0).role?.get(0)?.coding?.get(0)?.code, "AUT")
        assertEquals(
            data.agent.get(0).role?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/v3/ParticipationType"
        )
        assertEquals(data.agent.get(0).whoReference?.reference, "Practitioner/example")
        assertEquals(data.entity?.get(0)?.role, ProvenanceEntityRole.SOURCE)
        assertEquals(data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.code, "biocompute")
        assertEquals(data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.display, "obj.1001")
        assertEquals(
            data.entity?.get(0)?.whatIdentifier?.type?.coding?.get(0)?.system,
            "https://hive.biochemistry.gwu.edu"
        )
        assertEquals(
            data.entity?.get(0)?.whatIdentifier?.value,
            "https://hive.biochemistry.gwu.edu/cgi-bin/prd/htscsrs/servlet.cgi?pageid=bcoexample_1"
        )
        assertEquals(data.id, "example-biocompute-object")
        assertEquals(data.period?.start, "2017-06-06")
        assertEquals(data.reason?.get(0)?.display, "antiviral resistance detection")
        assertEquals(data.recorded, "2016-06-09T08:12:14+10:00")
        assertEquals(data.target.get(0).reference, "Sequence/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProvenance4() {
        val sourceJson = loadAsString("provenance-example.json")

        val data = parser.toFhir(Provenance::class, sourceJson)


        assertEquals(data.agent.get(0).onBehalfOfUri, "#a1")
        assertEquals(data.agent.get(0).relatedAgentType?.text, "used")
        assertEquals(data.agent.get(0).role?.get(0)?.coding?.get(0)?.code, "AUT")
        assertEquals(
            data.agent.get(0).role?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/v3/ParticipationType"
        )
        assertEquals(data.agent.get(0).whoReference?.reference, "Practitioner/xcda-author")
        assertEquals(data.agent.get(1).id, "a1")
        assertEquals(data.agent.get(1).role?.get(0)?.coding?.get(0)?.code, "DEV")
        assertEquals(
            data.agent.get(1).role?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/v3/ParticipationType"
        )
        assertEquals(data.agent.get(1).whoReference?.reference, "Device/software")
        assertEquals(data.entity?.get(0)?.role, ProvenanceEntityRole.SOURCE)
        assertEquals(data.entity?.get(0)?.whatReference?.display, "CDA Document in XDS repository")
        assertEquals(data.entity?.get(0)?.whatReference?.reference, "DocumentReference/example")
        assertEquals(data.id, "example")
        assertEquals(data.location?.reference, "Location/1")
        assertEquals(data.period?.end, "2015-06-28")
        assertEquals(data.period?.start, "2015-06-27")
        assertEquals(data.policy?.get(0), "http://acme.com/fhir/Consent/25")
        assertEquals(data.reason?.get(0)?.code, "3457005")
        assertEquals(data.reason?.get(0)?.display, "Referral")
        assertEquals(data.reason?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.recorded, "2015-06-27T08:39:24+10:00")
        assertEquals(data.target.get(0).reference, "Procedure/example/_history/1")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">procedure record authored on 27-June 2015 by Harold Hippocrates, MD Content extracted from XDS managed CDA Referral received 26-June</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


