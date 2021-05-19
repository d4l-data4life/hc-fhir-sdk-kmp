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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.ContactPointUse
import care.data4life.hl7.fhir.r4.codesystem.EndpointStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * EndpointTest.java
 *
 * The technical details of an endpoint that can be used for electronic services
 *
 * The technical details of an endpoint that can be used for electronic services, such as for web
 * services providing XDS.b or a REST endpoint for another FHIR server. This may include any security
 * context information.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EndpointTest {

    val parser = FhirR4Parser()

    @Test
    fun testEndpoint01() {
        // Given
        val sourceJson = loadAsString("r4/endpoint-example-iid.json")

        // When
        val data = parser.toFhir(Endpoint::class, sourceJson)

        // Then
        assertEquals(
            "https://pacs.hospital.org/IHEInvokeImageDisplay",
            data.address
        )
        assertEquals(
            "ihe-iid",
            data.connectionType?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/endpoint-connection-type",
            data.connectionType?.system
        )
        assertEquals(
            "example-iid",
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
            "PACS Hospital Invoke Image Display endpoint",
            data.name
        )
        assertEquals(
            "DICOM IID",
            data.payloadType?.get(0)?.text
        )
        assertEquals(
            EndpointStatus.ACTIVE,
            data.status
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
    fun testEndpoint02() {
        // Given
        val sourceJson = loadAsString("r4/endpoint-example-direct.json")

        // When
        val data = parser.toFhir(Endpoint::class, sourceJson)

        // Then
        assertEquals(
            "mailto:MARTIN.SMIETANKA@directnppes.com",
            data.address
        )
        assertEquals(
            "direct-project",
            data.connectionType?.code
        )
        assertEquals(
            "direct-endpoint",
            data.id
        )
        assertEquals(
            "Organization/299",
            data.managingOrganization?.reference
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
            "MARTIN SMIETANKA",
            data.name
        )
        assertEquals(
            "urn:hl7-org:sdwg:ccda-structuredBody:1.1",
            data.payloadType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.19376.1.2.3",
            data.payloadType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            EndpointStatus.ACTIVE,
            data.status
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
    fun testEndpoint03() {
        // Given
        val sourceJson = loadAsString("r4/endpoint-example-wadors.json")

        // When
        val data = parser.toFhir(Endpoint::class, sourceJson)

        // Then
        assertEquals(
            "https://pacs.hospital.org/wado-rs",
            data.address
        )
        assertEquals(
            "dicom-wado-rs",
            data.connectionType?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/endpoint-connection-type",
            data.connectionType?.system
        )
        assertEquals(
            "example-wadors",
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
            "PACS Hospital DICOM WADO-RS endpoint",
            data.name
        )
        assertEquals(
            "application/dicom",
            data.payloadMimeType?.get(0)
        )
        assertEquals(
            "DICOM WADO-RS",
            data.payloadType?.get(0)?.text
        )
        assertEquals(
            EndpointStatus.ACTIVE,
            data.status
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
    fun testEndpoint04() {
        // Given
        val sourceJson = loadAsString("r4/endpoint-example.json")

        // When
        val data = parser.toFhir(Endpoint::class, sourceJson)

        // Then
        assertEquals(
            "http://fhir3.healthintersections.com.au/open/CarePlan",
            data.address
        )
        assertEquals(
            "hl7-fhir-rest",
            data.connectionType?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/endpoint-connection-type",
            data.connectionType?.system
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.use
        )
        assertEquals(
            "endpointmanager@example.org",
            data.contact?.get(0)?.value
        )
        assertEquals(
            "bearer-code BASGS534s4",
            data.header?.get(0)
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://example.org/enpoint-identifier",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "epcp12",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Organization/hl7",
            data.managingOrganization?.reference
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
            "Health Intersections CarePlan Hub",
            data.name
        )
        assertEquals(
            "application/fhir+xml",
            data.payloadMimeType?.get(0)
        )
        assertEquals(
            "CarePlan",
            data.payloadType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/resource-types",
            data.payloadType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2014-09-01",
            data.period?.start?.value.toString()
        )
        assertEquals(
            EndpointStatus.ACTIVE,
            data.status
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
