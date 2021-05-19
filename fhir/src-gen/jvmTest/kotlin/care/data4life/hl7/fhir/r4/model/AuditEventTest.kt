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
import care.data4life.hl7.fhir.r4.codesystem.AuditEventAction
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * AuditEventTest.java
 *
 * Event record kept for security purposes
 *
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection
 * of intrusion attempts and monitoring for inappropriate usage.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AuditEventTest {

    val parser = FhirR4Parser()

    @Test
    fun testAuditEvent01() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-search.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent01Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.E,
            actual = data.action
        )

        assertEquals(
            expected = "601847123",
            actual = data.agent?.get(0)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.agent?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "95",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6580",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Workstation1.ehr.familyclinic.com",
            actual = data.agent?.get(1)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(1)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "aHR0cDovL2ZoaXItZGV2LmhlYWx0aGludGVyc2VjdGlvbnMuY29tLmF1L29wZW4vRW5jb3VudGVyP3BhcnRpY2lwYW50PTEz",
            actual = data.entity?.get(0)?.query
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24",
            actual = data.entity?.get(0)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Query",
            actual = data.entity?.get(0)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(0)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entity?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Object",
            actual = data.entity?.get(0)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-search",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-22T23:42:24Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "hl7connect.healthintersections.com.au",
            actual = data.source?.observer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cloud",
            actual = data.source?.site
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.source?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Web Server",
            actual = data.source?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/security-source-type",
            actual = data.source?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "search",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "search",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/restful-interaction",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "rest",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Restful Operation",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-event-type",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent02() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-logout.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent02Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.E,
            actual = data.action
        )

        assertEquals(
            expected = "601847123",
            actual = data.agent?.get(0)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.agent?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "127.0.0.1",
            actual = data.agent?.get(0)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.agent?.get(0)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "95",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6580",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Workstation1.ehr.familyclinic.com",
            actual = data.agent?.get(1)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(1)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-logout",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-06-20T23:46:41Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "hl7connect.healthintersections.com.au",
            actual = data.source?.observer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cloud",
            actual = data.source?.site
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.source?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Web Server",
            actual = data.source?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/security-source-type",
            actual = data.source?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110123",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Logout",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "110114",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "User Authentication",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent03() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-vread.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent03Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.R,
            actual = data.action
        )

        assertEquals(
            expected = "601847123",
            actual = data.agent?.get(0)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.agent?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "95",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6580",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Workstation1.ehr.familyclinic.com",
            actual = data.agent?.get(1)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(1)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6",
            actual = data.entity?.get(0)?.lifecycle?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Access / Use",
            actual = data.entity?.get(0)?.lifecycle?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/dicom-audit-lifecycle",
            actual = data.entity?.get(0)?.lifecycle?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entity?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Object",
            actual = data.entity?.get(0)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example/_history/1",
            actual = data.entity?.get(0)?.what?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-rest",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-06-20T23:42:24Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "hl7connect.healthintersections.com.au",
            actual = data.source?.observer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cloud",
            actual = data.source?.site
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.source?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Web Server",
            actual = data.source?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/security-source-type",
            actual = data.source?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vread",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vread",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/restful-interaction",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "rest",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Restful Operation",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-event-type",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent04() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-media.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent04Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.R,
            actual = data.action
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ExportToMedia.app",
            actual = data.agent?.get(0)?.who?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "601847123",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.agent?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "95",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110033",
            actual = data.agent?.get(2)?.media?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DVD",
            actual = data.agent?.get(2)?.media?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(2)?.media?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Media title: Hello World",
            actual = data.agent?.get(2)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(2)?.requestor?.value
        )

        assertEquals(
            expected = "110154",
            actual = data.agent?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Destination Media",
            actual = data.agent?.get(2)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(2)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.entity?.get(0)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.entity?.get(0)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(0)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.entity?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Person",
            actual = data.entity?.get(0)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "e3cdfc81a0d24bd^^^&2.16.840.1.113883.4.2&ISO",
            actual = data.entity?.get(0)?.what?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20",
            actual = data.entity?.get(1)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Job",
            actual = data.entity?.get(1)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(1)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entity?.get(1)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Object",
            actual = data.entity?.get(1)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(1)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IHE XDS Metadata",
            actual = data.entity?.get(1)?.what?.identifier?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "submission set classificationNode",
            actual = data.entity?.get(1)?.what?.identifier?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd",
            actual = data.entity?.get(1)?.what?.identifier?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "e3cdfc81a0d24bd^^^&2.16.840.1.113883.4.2&ISO",
            actual = data.entity?.get(1)?.what?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entity?.get(2)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Object",
            actual = data.entity?.get(2)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(2)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DocumentManifest/example",
            actual = data.entity?.get(2)?.what?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-media",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-27T23:42:24Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "hl7connect.healthintersections.com.au",
            actual = data.source?.observer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ITI-32",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Distribute Document Set on Media",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.19376.1.2",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "110106",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Export",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent05() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-login.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent05Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.E,
            actual = data.action
        )

        assertEquals(
            expected = "601847123",
            actual = data.agent?.get(0)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.agent?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "127.0.0.1",
            actual = data.agent?.get(0)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.agent?.get(0)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "95",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6580",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Workstation1.ehr.familyclinic.com",
            actual = data.agent?.get(1)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(1)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-login",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-06-20T23:41:23Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "hl7connect.healthintersections.com.au",
            actual = data.source?.observer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cloud",
            actual = data.source?.site
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.source?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Web Server",
            actual = data.source?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/security-source-type",
            actual = data.source?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110122",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Login",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "110114",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "User Authentication",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent06() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-pixQuery.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent06Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.E,
            actual = data.action
        )

        assertEquals(
            expected = "6580",
            actual = data.agent?.get(0)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Workstation1.ehr.familyclinic.com",
            actual = data.agent?.get(0)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(0)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.2",
            actual = data.agent?.get(0)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.4.2",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "601847123",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.agent?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "95",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.entity?.get(0)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.entity?.get(0)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(0)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.entity?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Person",
            actual = data.entity?.get(0)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "e3cdfc81a0d24bd^^^&2.16.840.1.113883.4.2&ISO",
            actual = data.entity?.get(0)?.what?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MSH-10",
            actual = data.entity?.get(1)?.detail?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MS4yLjg0MC4xMTQzNTAuMS4xMy4wLjEuNy4xLjE=",
            actual = data.entity?.get(1)?.detail?.get(0)?.valueBase64Binary
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24",
            actual = data.entity?.get(1)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Query",
            actual = data.entity?.get(1)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(1)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entity?.get(1)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Object",
            actual = data.entity?.get(1)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(1)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-pixQuery",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-26T23:42:24Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "hl7connect.healthintersections.com.au",
            actual = data.source?.observer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ITI-9",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PIX Query",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.19376.1.2",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "110112",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Query",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent07() {
        // Given
        val sourceJson = loadAsString("r4/auditevent-example.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent07Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.E,
            actual = data.action
        )

        assertEquals(
            expected = "127.0.0.1",
            actual = data.agent?.get(0)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.agent?.get(0)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "Service User (Logon)",
            actual = data.agent?.get(0)?.role?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6580",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Workstation1.ehr.familyclinic.com",
            actual = data.agent?.get(1)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(1)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6",
            actual = data.entity?.get(0)?.lifecycle?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Access / Use",
            actual = data.entity?.get(0)?.lifecycle?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/dicom-audit-lifecycle",
            actual = data.entity?.get(0)?.lifecycle?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame's Laptop",
            actual = data.entity?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4",
            actual = data.entity?.get(0)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Domain Resource",
            actual = data.entity?.get(0)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(0)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4",
            actual = data.entity?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Other",
            actual = data.entity?.get(0)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SNO",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0203",
            actual = data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dell Serial Number",
            actual = data.entity?.get(0)?.what?.identifier?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ABCDEF",
            actual = data.entity?.get(0)?.what?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-10-25T22:04:27+11:00",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "Grahame's Laptop",
            actual = data.source?.observer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Development",
            actual = data.source?.site
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110122",
            actual = data.source?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Login",
            actual = data.source?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.source?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110120",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Application Start",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Application Start for under service login &quot;Grahame&quot; (id: Grahame's Test HL7Connect)</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "110100",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Application Activity",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent08() {
        // Given
        val sourceJson = loadAsString("r4/auditevent-example-disclosure.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent08Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.R,
            actual = data.action
        )

        assertEquals(
            expected = "notMe",
            actual = data.agent?.get(0)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.agent?.get(0)?.location?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "That guy everyone wishes would be caught",
            actual = data.agent?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "custodian.net",
            actual = data.agent?.get(0)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(0)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://consent.com/yes",
            actual = data.agent?.get(0)?.policy?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SomeIdiot@nowhere",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "marketing.land",
            actual = data.agent?.get(1)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(1)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HMARKT",
            actual = data.agent?.get(1)?.purposeOfUse?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "healthcare marketing",
            actual = data.agent?.get(1)?.purposeOfUse?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.agent?.get(1)?.purposeOfUse?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "110152",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Destination Role ID",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Where",
            actual = data.agent?.get(1)?.who?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.agent?.get(1)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.entity?.get(0)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.entity?.get(0)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(0)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.entity?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Person",
            actual = data.entity?.get(0)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.entity?.get(0)?.what?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "data about Everthing important",
            actual = data.entity?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "11",
            actual = data.entity?.get(1)?.lifecycle?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Disclosure",
            actual = data.entity?.get(1)?.lifecycle?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/dicom-audit-lifecycle",
            actual = data.entity?.get(1)?.lifecycle?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Namne of What",
            actual = data.entity?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4",
            actual = data.entity?.get(1)?.role?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Domain Resource",
            actual = data.entity?.get(1)?.role?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/object-role",
            actual = data.entity?.get(1)?.role?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "V",
            actual = data.entity?.get(1)?.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "very restricted",
            actual = data.entity?.get(1)?.securityLabel?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            actual = data.entity?.get(1)?.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "STD",
            actual = data.entity?.get(1)?.securityLabel?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "sexually transmitted disease information sensitivity",
            actual = data.entity?.get(1)?.securityLabel?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.entity?.get(1)?.securityLabel?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DELAU",
            actual = data.entity?.get(1)?.securityLabel?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "delete after use",
            actual = data.entity?.get(1)?.securityLabel?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.entity?.get(1)?.securityLabel?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entity?.get(1)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Object",
            actual = data.entity?.get(1)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(1)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "What.id",
            actual = data.entity?.get(1)?.what?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example/_history/1",
            actual = data.entity?.get(1)?.what?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-disclosure",
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
            expected = "0",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Successful  Disclosure",
            actual = data.outcomeDesc
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HMARKT",
            actual = data.purposeOfEvent?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "healthcare marketing",
            actual = data.purposeOfEvent?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.purposeOfEvent?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-09-22T00:08:00Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "Watchers Accounting of Disclosures Application",
            actual = data.source?.observer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Watcher",
            actual = data.source?.site
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4",
            actual = data.source?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Application Server",
            actual = data.source?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/security-source-type",
            actual = data.source?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Disclosure",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HIPAA disclosure",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Disclosure by some idiot, for marketing reasons, to places unknown, of a Poor Sap, data about Everthing important.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "110106",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Export",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAuditEvent09() {
        // Given
        val sourceJson = loadAsString("r4/auditevent-example-error.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertAuditEvent09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAuditEvent09Step01(data: AuditEvent) {

        assertEquals(
            expected = AuditEventAction.C,
            actual = data.action
        )

        assertEquals(
            expected = "601847123",
            actual = data.agent?.get(0)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Grahame Grieve",
            actual = data.agent?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.agent?.get(0)?.requestor?.value
        )

        assertEquals(
            expected = "humanuser",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "human user",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            actual = data.agent?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "95",
            actual = data.agent?.get(0)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6580",
            actual = data.agent?.get(1)?.altId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Workstation1.ehr.familyclinic.com",
            actual = data.agent?.get(1)?.network?.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.agent?.get(1)?.network?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.agent?.get(1)?.requestor?.value
        )

        assertEquals(
            expected = "110153",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source Role ID",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://dicom.nema.org/resources/ontology/DCM",
            actual = data.agent?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.4.2",
            actual = data.agent?.get(1)?.who?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "o1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "requested transaction",
            actual = data.entity?.get(0)?.detail?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http POST ..... ",
            actual = data.entity?.get(0)?.detail?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entity?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Object",
            actual = data.entity?.get(0)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            actual = data.entity?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "transaction failed",
            actual = data.entity?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OperationOutcome",
            actual = data.entity?.get(1)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OperationOutcome",
            actual = data.entity?.get(1)?.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.entity?.get(1)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#o1",
            actual = data.entity?.get(1)?.what?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-error",
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
            expected = "8",
            actual = data.outcome
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Invalid request to create an Operation resource on the Patient endpoint.",
            actual = data.outcomeDesc
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-09-07T23:42:24Z",
            actual = data.recorded?.value.toString()
        )

        assertEquals(
            expected = "hl7connect.healthintersections.com.au",
            actual = data.source?.observer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cloud",
            actual = data.source?.site
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.source?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Web Server",
            actual = data.source?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/security-source-type",
            actual = data.source?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "create",
            actual = data.subtype?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "create",
            actual = data.subtype?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/restful-interaction",
            actual = data.subtype?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "rest",
            actual = data.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Restful Operation",
            actual = data.type?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/audit-event-type",
            actual = data.type?.system
                ?.replace("\\n", " ")
        )
    }
}
