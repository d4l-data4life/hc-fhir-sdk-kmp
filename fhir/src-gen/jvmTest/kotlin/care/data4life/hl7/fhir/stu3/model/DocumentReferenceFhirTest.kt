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
import care.data4life.hl7.fhir.stu3.codesystem.CompositionStatus
import care.data4life.hl7.fhir.stu3.codesystem.DocumentReferenceStatus
import care.data4life.hl7.fhir.stu3.codesystem.DocumentRelationshipType
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * DocumentReferenceTest.java
 *
 * A reference to a document
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DocumentReferenceFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDocumentReference01() {
        // Given
        val sourceJson = loadAsString("stu3/documentreference-example.json")

        // When
        val data = parser.toFhir(DocumentReference::class, sourceJson)

        // Then
        assertDocumentReference01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDocumentReference01Step01(data: DocumentReference) {
        assertEquals(
            expected = "Organization/f001",
            actual = data.authenticator?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda1",
            actual = data.author?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#a2",
            actual = data.author?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "History and Physical",
            actual = data.clazz?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "History and Physical",
            actual = data.clazz?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ihe.net/xds/connectathon/classCodes",
            actual = data.clazz?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a2",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/hl7-v3+xml",
            actual = data.content?.get(0)?.attachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2jmj7l5rSw0yVb/vlWAYkK/YBwk=",
            actual = data.content?.get(0)?.attachment?.hash
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-US",
            actual = data.content?.get(0)?.attachment?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3654".toLong(),
            actual = data.content?.get(0)?.attachment?.size?.value
        )

        assertEquals(
            expected = "http://example.org/xds/mhd/Binary/07a6483f-732b-461e-86b6-edb665c45510",
            actual = data.content?.get(0)?.attachment?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ihe:pcc:handp:2008",
            actual = data.content?.get(0)?.format?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "History and Physical Specification",
            actual = data.content?.get(0)?.format?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.19376.1.2.3",
            actual = data.content?.get(0)?.format?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/xcda",
            actual = data.context?.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T-D8200",
            actual = data.context?.event?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Arm",
            actual = data.context?.event?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ihe.net/xds/connectathon/eventCodes",
            actual = data.context?.event?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Outpatient",
            actual = data.context?.facilityType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Outpatient",
            actual = data.context?.facilityType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ihe.net/xds/connectathon/healthcareFacilityTypeCodes",
            actual = data.context?.facilityType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2004-12-23T08:01:00+11:00",
            actual = data.context?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2004-12-23T08:00:00+11:00",
            actual = data.context?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "General Medicine",
            actual = data.context?.practiceSetting?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Medicine",
            actual = data.context?.practiceSetting?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ihe.net/xds/connectathon/practiceSettingCodes",
            actual = data.context?.practiceSetting?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.context?.related?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.2345",
            actual = data.context?.related?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.context?.related?.get(0)?.ref?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.context?.sourcePatientInfo?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2005-12-24T09:35:00+11:00",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.custodian?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Physical",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CompositionStatus.PRELIMINARY,
            actual = data.docStatus
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2005-12-24T09:43:41+11:00",
            actual = data.indexed?.value.toString()
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.masterIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7",
            actual = data.masterIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DocumentRelationshipType.APPENDS,
            actual = data.relatesTo?.get(0)?.code
        )

        assertEquals(
            expected = "DocumentReference/example",
            actual = data.relatesTo?.get(0)?.target?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "V",
            actual = data.securityLabel?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "very restricted",
            actual = data.securityLabel?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/Confidentiality",
            actual = data.securityLabel?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DocumentReferenceStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "34108-1",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Outpatient Note",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
