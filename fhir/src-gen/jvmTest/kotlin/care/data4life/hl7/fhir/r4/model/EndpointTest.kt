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
        assertEndpoint01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEndpoint01Step01(data: Endpoint) {

        assertEquals(
            expected = "https://pacs.hospital.org/IHEInvokeImageDisplay",
            actual = data.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ihe-iid",
            actual = data.connectionType?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/endpoint-connection-type",
            actual = data.connectionType?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-iid",
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
            expected = "PACS Hospital Invoke Image Display endpoint",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DICOM IID",
            actual = data.payloadType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EndpointStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEndpoint02() {
        // Given
        val sourceJson = loadAsString("r4/endpoint-example-direct.json")

        // When
        val data = parser.toFhir(Endpoint::class, sourceJson)

        // Then
        assertEndpoint02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEndpoint02Step01(data: Endpoint) {

        assertEquals(
            expected = "mailto:MARTIN.SMIETANKA@directnppes.com",
            actual = data.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "direct-project",
            actual = data.connectionType?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "direct-endpoint",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/299",
            actual = data.managingOrganization?.reference
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
            expected = "MARTIN SMIETANKA",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:hl7-org:sdwg:ccda-structuredBody:1.1",
            actual = data.payloadType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.19376.1.2.3",
            actual = data.payloadType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EndpointStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEndpoint03() {
        // Given
        val sourceJson = loadAsString("r4/endpoint-example-wadors.json")

        // When
        val data = parser.toFhir(Endpoint::class, sourceJson)

        // Then
        assertEndpoint03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEndpoint03Step01(data: Endpoint) {

        assertEquals(
            expected = "https://pacs.hospital.org/wado-rs",
            actual = data.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dicom-wado-rs",
            actual = data.connectionType?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/endpoint-connection-type",
            actual = data.connectionType?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-wadors",
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
            expected = "PACS Hospital DICOM WADO-RS endpoint",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/dicom",
            actual = data.payloadMimeType?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DICOM WADO-RS",
            actual = data.payloadType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EndpointStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEndpoint04() {
        // Given
        val sourceJson = loadAsString("r4/endpoint-example.json")

        // When
        val data = parser.toFhir(Endpoint::class, sourceJson)

        // Then
        assertEndpoint04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEndpoint04Step01(data: Endpoint) {

        assertEquals(
            expected = "http://fhir3.healthintersections.com.au/open/CarePlan",
            actual = data.address
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hl7-fhir-rest",
            actual = data.connectionType?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/endpoint-connection-type",
            actual = data.connectionType?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.use
        )

        assertEquals(
            expected = "endpointmanager@example.org",
            actual = data.contact?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bearer-code BASGS534s4",
            actual = data.header?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/enpoint-identifier",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "epcp12",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.managingOrganization?.reference
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
            expected = "Health Intersections CarePlan Hub",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/fhir+xml",
            actual = data.payloadMimeType?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CarePlan",
            actual = data.payloadType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.payloadType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = EndpointStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
