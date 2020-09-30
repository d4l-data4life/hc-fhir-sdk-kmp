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
import care.data4life.fhir.stu3.codesystem.CompositionStatus
import care.data4life.fhir.stu3.codesystem.DocumentReferenceStatus
import care.data4life.fhir.stu3.codesystem.DocumentRelationshipType
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * DocumentReferenceTest.java
 *
 * A reference to a document.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class DocumentReferenceTest {

    val parser = FhirStu3Parser()


    @Test
    fun testDocumentReference1() {
        val sourceJson = loadAsString("documentreference-example.json")

        val data = parser.toFhir(DocumentReference::class, sourceJson)


        assertEquals(data.authenticator?.reference, "Organization/f001")
        assertEquals(data.author?.get(0)?.reference, "Practitioner/xcda1")
        assertEquals(data.author?.get(1)?.reference, "#a2")
        assertEquals(data.clazz?.coding?.get(0)?.code, "History and Physical")
        assertEquals(data.clazz?.coding?.get(0)?.display, "History and Physical")
        assertEquals(
            data.clazz?.coding?.get(0)?.system,
            "http://ihe.net/xds/connectathon/classCodes"
        )
        assertEquals(data.contained?.get(0)?.id, "a2")
        assertEquals(data.content.get(0).attachment.contentType, "application/hl7-v3+xml")
        assertEquals(data.content.get(0).attachment.hash, "2jmj7l5rSw0yVb/vlWAYkK/YBwk=")
        assertEquals(data.content.get(0).attachment.language, "en-US")
        assertEquals(data.content.get(0).attachment.size, "3654")
        assertEquals(
            data.content.get(0).attachment.url,
            "http://example.org/xds/mhd/Binary/07a6483f-732b-461e-86b6-edb665c45510"
        )
        assertEquals(data.content.get(0).format?.code, "urn:ihe:pcc:handp:2008")
        assertEquals(data.content.get(0).format?.display, "History and Physical Specification")
        assertEquals(data.content.get(0).format?.system, "urn:oid:1.3.6.1.4.1.19376.1.2.3")
        assertEquals(data.context?.encounter?.reference, "Encounter/xcda")
        assertEquals(data.context?.event?.get(0)?.coding?.get(0)?.code, "T-D8200")
        assertEquals(data.context?.event?.get(0)?.coding?.get(0)?.display, "Arm")
        assertEquals(
            data.context?.event?.get(0)?.coding?.get(0)?.system,
            "http://ihe.net/xds/connectathon/eventCodes"
        )
        assertEquals(data.context?.facilityType?.coding?.get(0)?.code, "Outpatient")
        assertEquals(data.context?.facilityType?.coding?.get(0)?.display, "Outpatient")
        assertEquals(
            data.context?.facilityType?.coding?.get(0)?.system,
            "http://www.ihe.net/xds/connectathon/healthcareFacilityTypeCodes"
        )
        assertEquals(data.context?.period?.end, "2004-12-23T08:01:00+11:00")
        assertEquals(data.context?.period?.start, "2004-12-23T08:00:00+11:00")
        assertEquals(data.context?.practiceSetting?.coding?.get(0)?.code, "General Medicine")
        assertEquals(data.context?.practiceSetting?.coding?.get(0)?.display, "General Medicine")
        assertEquals(
            data.context?.practiceSetting?.coding?.get(0)?.system,
            "http://www.ihe.net/xds/connectathon/practiceSettingCodes"
        )
        assertEquals(data.context?.related?.get(0)?.identifier?.system, "urn:ietf:rfc:3986")
        assertEquals(
            data.context?.related?.get(0)?.identifier?.value,
            "urn:oid:1.3.6.1.4.1.21367.2005.3.7.2345"
        )
        assertEquals(data.context?.related?.get(0)?.ref?.reference, "Patient/xcda")
        assertEquals(data.context?.sourcePatientInfo?.reference, "Patient/xcda")
        assertEquals(data.created, "2005-12-24T09:35:00+11:00")
        assertEquals(data.custodian?.reference, "Organization/f001")
        assertEquals(data.description, "Physical")
        assertEquals(data.docStatus, CompositionStatus.PRELIMINARY)
        assertEquals(data.id, "example")
        assertEquals(data.identifier?.get(0)?.system, "urn:ietf:rfc:3986")
        assertEquals(data.identifier?.get(0)?.value, "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234")
        assertEquals(data.indexed, "2005-12-24T09:43:41+11:00")
        assertEquals(data.masterIdentifier?.system, "urn:ietf:rfc:3986")
        assertEquals(data.masterIdentifier?.value, "urn:oid:1.3.6.1.4.1.21367.2005.3.7")
        assertEquals(data.relatesTo?.get(0)?.code, DocumentRelationshipType.APPENDS)
        assertEquals(data.relatesTo?.get(0)?.target?.reference, "DocumentReference/example")
        assertEquals(data.securityLabel?.get(0)?.coding?.get(0)?.code, "V")
        assertEquals(data.securityLabel?.get(0)?.coding?.get(0)?.display, "very restricted")
        assertEquals(
            data.securityLabel?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/v3/Confidentiality"
        )
        assertEquals(data.status, DocumentReferenceStatus.CURRENT)
        assertEquals(data.subject?.reference, "Patient/xcda")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type.coding?.get(0)?.code, "34108-1")
        assertEquals(data.type.coding?.get(0)?.display, "Outpatient Note")
        assertEquals(data.type.coding?.get(0)?.system, "http://loinc.org")

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


