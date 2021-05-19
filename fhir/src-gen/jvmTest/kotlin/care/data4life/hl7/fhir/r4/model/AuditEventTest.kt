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
        assertEquals(
            AuditEventAction.E,
            data.action
        )
        assertEquals(
            "601847123",
            data.agent?.get(0)?.altId
        )
        assertEquals(
            "Grahame Grieve",
            data.agent?.get(0)?.name
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "humanuser",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "95",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "6580",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Workstation1.ehr.familyclinic.com",
            data.agent?.get(1)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(1)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.system
        )
        assertEquals(
            "2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "aHR0cDovL2ZoaXItZGV2LmhlYWx0aGludGVyc2VjdGlvbnMuY29tLmF1L29wZW4vRW5jb3VudGVyP3BhcnRpY2lwYW50PTEz",
            data.entity?.get(0)?.query
        )
        assertEquals(
            "24",
            data.entity?.get(0)?.role?.code
        )
        assertEquals(
            "Query",
            data.entity?.get(0)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(0)?.role?.system
        )
        assertEquals(
            "2",
            data.entity?.get(0)?.type?.code
        )
        assertEquals(
            "System Object",
            data.entity?.get(0)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(0)?.type?.system
        )
        assertEquals(
            "example-search",
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
            "0",
            data.outcome
        )
        assertEquals(
            "2015-08-22T23:42:24Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "hl7connect.healthintersections.com.au",
            data.source?.observer?.display
        )
        assertEquals(
            "Cloud",
            data.source?.site
        )
        assertEquals(
            "3",
            data.source?.type?.get(0)?.code
        )
        assertEquals(
            "Web Server",
            data.source?.type?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/security-source-type",
            data.source?.type?.get(0)?.system
        )
        assertEquals(
            "search",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "search",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/restful-interaction",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "rest",
            data.type?.code
        )
        assertEquals(
            "Restful Operation",
            data.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-event-type",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent02() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-logout.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.E,
            data.action
        )
        assertEquals(
            "601847123",
            data.agent?.get(0)?.altId
        )
        assertEquals(
            "Grahame Grieve",
            data.agent?.get(0)?.name
        )
        assertEquals(
            "127.0.0.1",
            data.agent?.get(0)?.network?.address
        )
        assertEquals(
            "2",
            data.agent?.get(0)?.network?.type
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "humanuser",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "95",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "6580",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Workstation1.ehr.familyclinic.com",
            data.agent?.get(1)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(1)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.system
        )
        assertEquals(
            "2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "example-logout",
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
            "0",
            data.outcome
        )
        assertEquals(
            "2013-06-20T23:46:41Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "hl7connect.healthintersections.com.au",
            data.source?.observer?.identifier?.value
        )
        assertEquals(
            "Cloud",
            data.source?.site
        )
        assertEquals(
            "3",
            data.source?.type?.get(0)?.code
        )
        assertEquals(
            "Web Server",
            data.source?.type?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/security-source-type",
            data.source?.type?.get(0)?.system
        )
        assertEquals(
            "110123",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "Logout",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "110114",
            data.type?.code
        )
        assertEquals(
            "User Authentication",
            data.type?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent03() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-vread.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.R,
            data.action
        )
        assertEquals(
            "601847123",
            data.agent?.get(0)?.altId
        )
        assertEquals(
            "Grahame Grieve",
            data.agent?.get(0)?.name
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "humanuser",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "95",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "6580",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Workstation1.ehr.familyclinic.com",
            data.agent?.get(1)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(1)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.system
        )
        assertEquals(
            "2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "6",
            data.entity?.get(0)?.lifecycle?.code
        )
        assertEquals(
            "Access / Use",
            data.entity?.get(0)?.lifecycle?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/dicom-audit-lifecycle",
            data.entity?.get(0)?.lifecycle?.system
        )
        assertEquals(
            "2",
            data.entity?.get(0)?.type?.code
        )
        assertEquals(
            "System Object",
            data.entity?.get(0)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(0)?.type?.system
        )
        assertEquals(
            "Patient/example/_history/1",
            data.entity?.get(0)?.what?.reference
        )
        assertEquals(
            "example-rest",
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
            "0",
            data.outcome
        )
        assertEquals(
            "2013-06-20T23:42:24Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "hl7connect.healthintersections.com.au",
            data.source?.observer?.identifier?.value
        )
        assertEquals(
            "Cloud",
            data.source?.site
        )
        assertEquals(
            "3",
            data.source?.type?.get(0)?.code
        )
        assertEquals(
            "Web Server",
            data.source?.type?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/security-source-type",
            data.source?.type?.get(0)?.system
        )
        assertEquals(
            "vread",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "vread",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/restful-interaction",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "rest",
            data.type?.code
        )
        assertEquals(
            "Restful Operation",
            data.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-event-type",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent04() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-media.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.R,
            data.action
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "ExportToMedia.app",
            data.agent?.get(0)?.who?.display
        )
        assertEquals(
            "601847123",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Grahame Grieve",
            data.agent?.get(1)?.name
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "humanuser",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "95",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "110033",
            data.agent?.get(2)?.media?.code
        )
        assertEquals(
            "DVD",
            data.agent?.get(2)?.media?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(2)?.media?.system
        )
        assertEquals(
            "Media title: Hello World",
            data.agent?.get(2)?.name
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(2)?.requestor?.value
        )
        assertEquals(
            "110154",
            data.agent?.get(2)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Destination Media",
            data.agent?.get(2)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(2)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "1",
            data.entity?.get(0)?.role?.code
        )
        assertEquals(
            "Patient",
            data.entity?.get(0)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(0)?.role?.system
        )
        assertEquals(
            "1",
            data.entity?.get(0)?.type?.code
        )
        assertEquals(
            "Person",
            data.entity?.get(0)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(0)?.type?.system
        )
        assertEquals(
            "e3cdfc81a0d24bd^^^&2.16.840.1.113883.4.2&ISO",
            data.entity?.get(0)?.what?.identifier?.value
        )
        assertEquals(
            "20",
            data.entity?.get(1)?.role?.code
        )
        assertEquals(
            "Job",
            data.entity?.get(1)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(1)?.role?.system
        )
        assertEquals(
            "2",
            data.entity?.get(1)?.type?.code
        )
        assertEquals(
            "System Object",
            data.entity?.get(1)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(1)?.type?.system
        )
        assertEquals(
            "IHE XDS Metadata",
            data.entity?.get(1)?.what?.identifier?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "submission set classificationNode",
            data.entity?.get(1)?.what?.identifier?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd",
            data.entity?.get(1)?.what?.identifier?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "e3cdfc81a0d24bd^^^&2.16.840.1.113883.4.2&ISO",
            data.entity?.get(1)?.what?.identifier?.value
        )
        assertEquals(
            "2",
            data.entity?.get(2)?.type?.code
        )
        assertEquals(
            "System Object",
            data.entity?.get(2)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(2)?.type?.system
        )
        assertEquals(
            "DocumentManifest/example",
            data.entity?.get(2)?.what?.reference
        )
        assertEquals(
            "example-media",
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
            "0",
            data.outcome
        )
        assertEquals(
            "2015-08-27T23:42:24Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "hl7connect.healthintersections.com.au",
            data.source?.observer?.display
        )
        assertEquals(
            "ITI-32",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "Distribute Document Set on Media",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.19376.1.2",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "110106",
            data.type?.code
        )
        assertEquals(
            "Export",
            data.type?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent05() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-login.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.E,
            data.action
        )
        assertEquals(
            "601847123",
            data.agent?.get(0)?.altId
        )
        assertEquals(
            "Grahame Grieve",
            data.agent?.get(0)?.name
        )
        assertEquals(
            "127.0.0.1",
            data.agent?.get(0)?.network?.address
        )
        assertEquals(
            "2",
            data.agent?.get(0)?.network?.type
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "humanuser",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "95",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "6580",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Workstation1.ehr.familyclinic.com",
            data.agent?.get(1)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(1)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.system
        )
        assertEquals(
            "2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "example-login",
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
            "0",
            data.outcome
        )
        assertEquals(
            "2013-06-20T23:41:23Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "hl7connect.healthintersections.com.au",
            data.source?.observer?.identifier?.value
        )
        assertEquals(
            "Cloud",
            data.source?.site
        )
        assertEquals(
            "3",
            data.source?.type?.get(0)?.code
        )
        assertEquals(
            "Web Server",
            data.source?.type?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/security-source-type",
            data.source?.type?.get(0)?.system
        )
        assertEquals(
            "110122",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "Login",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "110114",
            data.type?.code
        )
        assertEquals(
            "User Authentication",
            data.type?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent06() {
        // Given
        val sourceJson = loadAsString("r4/audit-event-example-pixQuery.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.E,
            data.action
        )
        assertEquals(
            "6580",
            data.agent?.get(0)?.altId
        )
        assertEquals(
            "Workstation1.ehr.familyclinic.com",
            data.agent?.get(0)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(0)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.2",
            data.agent?.get(0)?.who?.identifier?.system
        )
        assertEquals(
            "2.16.840.1.113883.4.2",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "601847123",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Grahame Grieve",
            data.agent?.get(1)?.name
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "humanuser",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "95",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "1",
            data.entity?.get(0)?.role?.code
        )
        assertEquals(
            "Patient",
            data.entity?.get(0)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(0)?.role?.system
        )
        assertEquals(
            "1",
            data.entity?.get(0)?.type?.code
        )
        assertEquals(
            "Person",
            data.entity?.get(0)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(0)?.type?.system
        )
        assertEquals(
            "e3cdfc81a0d24bd^^^&2.16.840.1.113883.4.2&ISO",
            data.entity?.get(0)?.what?.identifier?.value
        )
        assertEquals(
            "MSH-10",
            data.entity?.get(1)?.detail?.get(0)?.type
        )
        assertEquals(
            "MS4yLjg0MC4xMTQzNTAuMS4xMy4wLjEuNy4xLjE=",
            data.entity?.get(1)?.detail?.get(0)?.valueBase64Binary
        )
        assertEquals(
            "24",
            data.entity?.get(1)?.role?.code
        )
        assertEquals(
            "Query",
            data.entity?.get(1)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(1)?.role?.system
        )
        assertEquals(
            "2",
            data.entity?.get(1)?.type?.code
        )
        assertEquals(
            "System Object",
            data.entity?.get(1)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(1)?.type?.system
        )
        assertEquals(
            "example-pixQuery",
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
            "0",
            data.outcome
        )
        assertEquals(
            "2015-08-26T23:42:24Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "hl7connect.healthintersections.com.au",
            data.source?.observer?.display
        )
        assertEquals(
            "ITI-9",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "PIX Query",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.19376.1.2",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "110112",
            data.type?.code
        )
        assertEquals(
            "Query",
            data.type?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent07() {
        // Given
        val sourceJson = loadAsString("r4/auditevent-example.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.E,
            data.action
        )
        assertEquals(
            "127.0.0.1",
            data.agent?.get(0)?.network?.address
        )
        assertEquals(
            "2",
            data.agent?.get(0)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "Service User (Logon)",
            data.agent?.get(0)?.role?.get(0)?.text
        )
        assertEquals(
            "humanuser",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Grahame",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "6580",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Workstation1.ehr.familyclinic.com",
            data.agent?.get(1)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(1)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.system
        )
        assertEquals(
            "2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "6",
            data.entity?.get(0)?.lifecycle?.code
        )
        assertEquals(
            "Access / Use",
            data.entity?.get(0)?.lifecycle?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/dicom-audit-lifecycle",
            data.entity?.get(0)?.lifecycle?.system
        )
        assertEquals(
            "Grahame's Laptop",
            data.entity?.get(0)?.name
        )
        assertEquals(
            "4",
            data.entity?.get(0)?.role?.code
        )
        assertEquals(
            "Domain Resource",
            data.entity?.get(0)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(0)?.role?.system
        )
        assertEquals(
            "4",
            data.entity?.get(0)?.type?.code
        )
        assertEquals(
            "Other",
            data.entity?.get(0)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(0)?.type?.system
        )
        assertEquals(
            "SNO",
            data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.entity?.get(0)?.what?.identifier?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Dell Serial Number",
            data.entity?.get(0)?.what?.identifier?.type?.text
        )
        assertEquals(
            "ABCDEF",
            data.entity?.get(0)?.what?.identifier?.value
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
            "0",
            data.outcome
        )
        assertEquals(
            "2012-10-25T22:04:27+11:00",
            data.recorded?.value.toString()
        )
        assertEquals(
            "Grahame's Laptop",
            data.source?.observer?.display
        )
        assertEquals(
            "Development",
            data.source?.site
        )
        assertEquals(
            "110122",
            data.source?.type?.get(0)?.code
        )
        assertEquals(
            "Login",
            data.source?.type?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.source?.type?.get(0)?.system
        )
        assertEquals(
            "110120",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "Application Start",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Application Start for under service login &quot;Grahame&quot; (id: Grahame's Test HL7Connect)</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "110100",
            data.type?.code
        )
        assertEquals(
            "Application Activity",
            data.type?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent08() {
        // Given
        val sourceJson = loadAsString("r4/auditevent-example-disclosure.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.R,
            data.action
        )
        assertEquals(
            "notMe",
            data.agent?.get(0)?.altId
        )
        assertEquals(
            "Location/1",
            data.agent?.get(0)?.location?.reference
        )
        assertEquals(
            "That guy everyone wishes would be caught",
            data.agent?.get(0)?.name
        )
        assertEquals(
            "custodian.net",
            data.agent?.get(0)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(0)?.network?.type
        )
        assertEquals(
            "http://consent.com/yes",
            data.agent?.get(0)?.policy?.get(0)
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "SomeIdiot@nowhere",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "marketing.land",
            data.agent?.get(1)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(1)?.network?.type
        )
        assertEquals(
            "HMARKT",
            data.agent?.get(1)?.purposeOfUse?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "healthcare marketing",
            data.agent?.get(1)?.purposeOfUse?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.agent?.get(1)?.purposeOfUse?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "110152",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Destination Role ID",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Where",
            data.agent?.get(1)?.who?.display
        )
        assertEquals(
            "Practitioner/example",
            data.agent?.get(1)?.who?.reference
        )
        assertEquals(
            "1",
            data.entity?.get(0)?.role?.code
        )
        assertEquals(
            "Patient",
            data.entity?.get(0)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(0)?.role?.system
        )
        assertEquals(
            "1",
            data.entity?.get(0)?.type?.code
        )
        assertEquals(
            "Person",
            data.entity?.get(0)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(0)?.type?.system
        )
        assertEquals(
            "Patient/example",
            data.entity?.get(0)?.what?.reference
        )
        assertEquals(
            "data about Everthing important",
            data.entity?.get(1)?.description
        )
        assertEquals(
            "11",
            data.entity?.get(1)?.lifecycle?.code
        )
        assertEquals(
            "Disclosure",
            data.entity?.get(1)?.lifecycle?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/dicom-audit-lifecycle",
            data.entity?.get(1)?.lifecycle?.system
        )
        assertEquals(
            "Namne of What",
            data.entity?.get(1)?.name
        )
        assertEquals(
            "4",
            data.entity?.get(1)?.role?.code
        )
        assertEquals(
            "Domain Resource",
            data.entity?.get(1)?.role?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/object-role",
            data.entity?.get(1)?.role?.system
        )
        assertEquals(
            "V",
            data.entity?.get(1)?.securityLabel?.get(0)?.code
        )
        assertEquals(
            "very restricted",
            data.entity?.get(1)?.securityLabel?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-Confidentiality",
            data.entity?.get(1)?.securityLabel?.get(0)?.system
        )
        assertEquals(
            "STD",
            data.entity?.get(1)?.securityLabel?.get(1)?.code
        )
        assertEquals(
            "sexually transmitted disease information sensitivity",
            data.entity?.get(1)?.securityLabel?.get(1)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.entity?.get(1)?.securityLabel?.get(1)?.system
        )
        assertEquals(
            "DELAU",
            data.entity?.get(1)?.securityLabel?.get(2)?.code
        )
        assertEquals(
            "delete after use",
            data.entity?.get(1)?.securityLabel?.get(2)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.entity?.get(1)?.securityLabel?.get(2)?.system
        )
        assertEquals(
            "2",
            data.entity?.get(1)?.type?.code
        )
        assertEquals(
            "System Object",
            data.entity?.get(1)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(1)?.type?.system
        )
        assertEquals(
            "What.id",
            data.entity?.get(1)?.what?.identifier?.value
        )
        assertEquals(
            "Patient/example/_history/1",
            data.entity?.get(1)?.what?.reference
        )
        assertEquals(
            "example-disclosure",
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
            "0",
            data.outcome
        )
        assertEquals(
            "Successful  Disclosure",
            data.outcomeDesc
        )
        assertEquals(
            "HMARKT",
            data.purposeOfEvent?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "healthcare marketing",
            data.purposeOfEvent?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.purposeOfEvent?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2013-09-22T00:08:00Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "Watchers Accounting of Disclosures Application",
            data.source?.observer?.display
        )
        assertEquals(
            "Watcher",
            data.source?.site
        )
        assertEquals(
            "4",
            data.source?.type?.get(0)?.code
        )
        assertEquals(
            "Application Server",
            data.source?.type?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/security-source-type",
            data.source?.type?.get(0)?.system
        )
        assertEquals(
            "Disclosure",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "HIPAA disclosure",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Disclosure by some idiot, for marketing reasons, to places unknown, of a Poor Sap, data about Everthing important.</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "110106",
            data.type?.code
        )
        assertEquals(
            "Export",
            data.type?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAuditEvent09() {
        // Given
        val sourceJson = loadAsString("r4/auditevent-example-error.json")

        // When
        val data = parser.toFhir(AuditEvent::class, sourceJson)

        // Then
        assertEquals(
            AuditEventAction.C,
            data.action
        )
        assertEquals(
            "601847123",
            data.agent?.get(0)?.altId
        )
        assertEquals(
            "Grahame Grieve",
            data.agent?.get(0)?.name
        )
        assertEquals(
            "True".toBoolean(),
            data.agent?.get(0)?.requestor?.value
        )
        assertEquals(
            "humanuser",
            data.agent?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "human user",
            data.agent?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/extra-security-role-type",
            data.agent?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "95",
            data.agent?.get(0)?.who?.identifier?.value
        )
        assertEquals(
            "6580",
            data.agent?.get(1)?.altId
        )
        assertEquals(
            "Workstation1.ehr.familyclinic.com",
            data.agent?.get(1)?.network?.address
        )
        assertEquals(
            "1",
            data.agent?.get(1)?.network?.type
        )
        assertEquals(
            "False".toBoolean(),
            data.agent?.get(1)?.requestor?.value
        )
        assertEquals(
            "110153",
            data.agent?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Source Role ID",
            data.agent?.get(1)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://dicom.nema.org/resources/ontology/DCM",
            data.agent?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.system
        )
        assertEquals(
            "2.16.840.1.113883.4.2",
            data.agent?.get(1)?.who?.identifier?.value
        )
        assertEquals(
            "o1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "requested transaction",
            data.entity?.get(0)?.detail?.get(0)?.type
        )
        assertEquals(
            "http POST ..... ",
            data.entity?.get(0)?.detail?.get(0)?.valueString
        )
        assertEquals(
            "2",
            data.entity?.get(0)?.type?.code
        )
        assertEquals(
            "System Object",
            data.entity?.get(0)?.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-entity-type",
            data.entity?.get(0)?.type?.system
        )
        assertEquals(
            "transaction failed",
            data.entity?.get(1)?.description
        )
        assertEquals(
            "OperationOutcome",
            data.entity?.get(1)?.type?.code
        )
        assertEquals(
            "OperationOutcome",
            data.entity?.get(1)?.type?.display
        )
        assertEquals(
            "http://hl7.org/fhir/resource-types",
            data.entity?.get(1)?.type?.system
        )
        assertEquals(
            "#o1",
            data.entity?.get(1)?.what?.reference
        )
        assertEquals(
            "example-error",
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
            "8",
            data.outcome
        )
        assertEquals(
            "Invalid request to create an Operation resource on the Patient endpoint.",
            data.outcomeDesc
        )
        assertEquals(
            "2017-09-07T23:42:24Z",
            data.recorded?.value.toString()
        )
        assertEquals(
            "hl7connect.healthintersections.com.au",
            data.source?.observer?.identifier?.value
        )
        assertEquals(
            "Cloud",
            data.source?.site
        )
        assertEquals(
            "3",
            data.source?.type?.get(0)?.code
        )
        assertEquals(
            "Web Server",
            data.source?.type?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/security-source-type",
            data.source?.type?.get(0)?.system
        )
        assertEquals(
            "create",
            data.subtype?.get(0)?.code
        )
        assertEquals(
            "create",
            data.subtype?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/restful-interaction",
            data.subtype?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "rest",
            data.type?.code
        )
        assertEquals(
            "Restful Operation",
            data.type?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/audit-event-type",
            data.type?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
