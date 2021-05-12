/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DocumentReferenceTest.java
 *
 * A reference to a document.
 *
 * A reference to a document of any kind for any purpose. Provides metadata about the document so that the document can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DocumentReferenceTest {

    val parser = FhirR4Parser()

    @Test
    fun testDocumentReference1() {
        val sourceJson = loadAsString("r4/documentreference-example.json")

        val data = parser.toFhir(DocumentReference::class, sourceJson)

        assertEquals("Organization/f001", data.authenticator?.reference)
        assertEquals("Practitioner/xcda1", data.author?.get(0)?.reference)
        assertEquals("#a2", data.author?.get(1)?.reference)
        assertEquals("History and Physical", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("History and Physical", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://ihe.net/xds/connectathon/classCodes", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("a2", data.contained?.get(0)?.id)
        assertEquals("application/hl7-v3+xml", data.content?.get(0)?.attachment?.contentType)
        assertEquals("2005-12-24T09:35:00+11:00", data.content?.get(0)?.attachment?.creation?.value.toString(),)
        assertEquals("2jmj7l5rSw0yVb/vlWAYkK/YBwk=", data.content?.get(0)?.attachment?.hash)
        assertEquals("en-US", data.content?.get(0)?.attachment?.language)
        assertEquals("3654".toLong(), data.content?.get(0)?.attachment?.size?.value)
        assertEquals("Physical", data.content?.get(0)?.attachment?.title)
        assertEquals("http://example.org/xds/mhd/Binary/07a6483f-732b-461e-86b6-edb665c45510", data.content?.get(0)?.attachment?.url)
        assertEquals("urn:ihe:pcc:handp:2008", data.content?.get(0)?.format?.code)
        assertEquals("History and Physical Specification", data.content?.get(0)?.format?.display)
        assertEquals("urn:oid:1.3.6.1.4.1.19376.1.2.3", data.content?.get(0)?.format?.system)
        assertEquals("Encounter/xcda", data.context?.encounter?.get(0)?.reference)
        assertEquals("T-D8200", data.context?.event?.get(0)?.coding?.get(0)?.code)
        assertEquals("Arm", data.context?.event?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://ihe.net/xds/connectathon/eventCodes", data.context?.event?.get(0)?.coding?.get(0)?.system)
        assertEquals("Outpatient", data.context?.facilityType?.coding?.get(0)?.code)
        assertEquals("Outpatient", data.context?.facilityType?.coding?.get(0)?.display)
        assertEquals("http://www.ihe.net/xds/connectathon/healthcareFacilityTypeCodes", data.context?.facilityType?.coding?.get(0)?.system)
        assertEquals("2004-12-23T08:01:00+11:00", data.context?.period?.end?.value.toString(),)
        assertEquals("2004-12-23T08:00:00+11:00", data.context?.period?.start?.value.toString(),)
        assertEquals("General Medicine", data.context?.practiceSetting?.coding?.get(0)?.code)
        assertEquals("General Medicine", data.context?.practiceSetting?.coding?.get(0)?.display)
        assertEquals("http://www.ihe.net/xds/connectathon/practiceSettingCodes", data.context?.practiceSetting?.coding?.get(0)?.system)
        assertEquals("urn:ietf:rfc:3986", data.context?.related?.get(0)?.identifier?.system)
        assertEquals("urn:oid:1.3.6.1.4.1.21367.2005.3.7.2345", data.context?.related?.get(0)?.identifier?.value)
        assertEquals("Patient/xcda", data.context?.related?.get(0)?.reference)
        assertEquals("Patient/xcda", data.context?.sourcePatientInfo?.reference)
        assertEquals("Organization/f001", data.custodian?.reference)
        assertEquals("2005-12-24T09:43:41+11:00", data.date?.value.toString(),)
        assertEquals("Physical", data.description)
        assertEquals(CompositionStatus.PRELIMINARY, data.docStatus)
        assertEquals("example", data.id)
        assertEquals("urn:ietf:rfc:3986", data.identifier?.get(0)?.system)
        assertEquals("urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234", data.identifier?.get(0)?.value)
        assertEquals("urn:ietf:rfc:3986", data.masterIdentifier?.system)
        assertEquals("urn:oid:1.3.6.1.4.1.21367.2005.3.7", data.masterIdentifier?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(DocumentRelationshipType.APPENDS, data.relatesTo?.get(0)?.code)
        assertEquals("DocumentReference/example", data.relatesTo?.get(0)?.target?.reference)
        assertEquals("V", data.securityLabel?.get(0)?.coding?.get(0)?.code)
        assertEquals("very restricted", data.securityLabel?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-Confidentiality", data.securityLabel?.get(0)?.coding?.get(0)?.system)
        assertEquals(DocumentReferenceStatus.CURRENT, data.status)
        assertEquals("Patient/xcda", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("34108-1", data.type?.coding?.get(0)?.code)
        assertEquals("Outpatient Note", data.type?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.type?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
