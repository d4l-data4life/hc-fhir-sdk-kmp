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
import care.data4life.hl7.fhir.r4.codesystem.BundleType
import care.data4life.hl7.fhir.r4.codesystem.HTTPVerb
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * BundleTest.java
 *
 * Contains a collection of resources
 *
 * A container for a collection of resources.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class BundleTest {

    val parser = FhirR4Parser()

    @Test
    fun testBundle01() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-f202-bloodculture.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "https://example.com/base/DiagnosticReport/f202",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "f202",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/ServiceRequest/req",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "req",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "f202",
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
            BundleType.COLLECTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle02() {
        // Given
        val sourceJson = loadAsString("r4/xds-example.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "urn:uuid:3fdc72f4-a11d-4a9d-9260-a9f745779e1d",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(0)?.request?.method
        )
        assertEquals(
            "DocumentReference",
            data.entry?.get(0)?.request?.url
        )
        assertEquals(
            "2013-07-01T13:11:33Z",
            data.entry?.get(0)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://localhost:9556/svc/fhir/Patient/a2",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "Patient?identifier=http://acme.org/xds/patients!89765a87b",
            data.entry?.get(1)?.request?.ifNoneExist
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(1)?.request?.method
        )
        assertEquals(
            "Patient",
            data.entry?.get(1)?.request?.url
        )
        assertEquals(
            "a2",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "2013-07-01T13:11:33Z",
            data.entry?.get(1)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://localhost:9556/svc/fhir/Practitioner/a3",
            data.entry?.get(2)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(2)?.request?.method
        )
        assertEquals(
            "Practitioner",
            data.entry?.get(2)?.request?.url
        )
        assertEquals(
            "a3",
            data.entry?.get(2)?.resource?.id
        )
        assertEquals(
            "2013-07-01T13:11:33Z",
            data.entry?.get(2)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://localhost:9556/svc/fhir/Practitioner/a4",
            data.entry?.get(3)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(3)?.request?.method
        )
        assertEquals(
            "Practitioner",
            data.entry?.get(3)?.request?.url
        )
        assertEquals(
            "a4",
            data.entry?.get(3)?.resource?.id
        )
        assertEquals(
            "2013-07-01T13:11:33Z",
            data.entry?.get(3)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://localhost:9556/svc/fhir/Binary/1e404af3-077f-4bee-b7a6-a9be97e1ce32",
            data.entry?.get(4)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(4)?.request?.method
        )
        assertEquals(
            "Binary",
            data.entry?.get(4)?.request?.url
        )
        assertEquals(
            "1e404af3-077f-4bee-b7a6-a9be97e1ce32",
            data.entry?.get(4)?.resource?.id
        )
        assertEquals(
            "2013-07-01T13:11:33Z",
            data.entry?.get(4)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "xds",
            data.id
        )
        assertEquals(
            "2013-07-01T13:11:33Z",
            data.meta?.lastUpdated?.value.toString()
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
            BundleType.TRANSACTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle03() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-ghp.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "https://example.com/base/DiagnosticReport/ghp",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "ghp",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "2015-08-16T10:35:23Z",
            data.entry?.get(0)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "https://example.com/base/Specimen/rtt",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "rtt",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Specimen/ltt",
            data.entry?.get(2)?.fullUrl
        )
        assertEquals(
            "ltt",
            data.entry?.get(2)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Specimen/urine",
            data.entry?.get(3)?.fullUrl
        )
        assertEquals(
            "urine",
            data.entry?.get(3)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/p2",
            data.entry?.get(4)?.fullUrl
        )
        assertEquals(
            "p2",
            data.entry?.get(4)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/r1",
            data.entry?.get(5)?.fullUrl
        )
        assertEquals(
            "r1",
            data.entry?.get(5)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/r2",
            data.entry?.get(6)?.fullUrl
        )
        assertEquals(
            "r2",
            data.entry?.get(6)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/r3",
            data.entry?.get(7)?.fullUrl
        )
        assertEquals(
            "r3",
            data.entry?.get(7)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/r4",
            data.entry?.get(8)?.fullUrl
        )
        assertEquals(
            "r4",
            data.entry?.get(8)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/r5",
            data.entry?.get(9)?.fullUrl
        )
        assertEquals(
            "r5",
            data.entry?.get(9)?.resource?.id
        )
        assertEquals(
            "ghp",
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
            BundleType.COLLECTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle04() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-examples-general.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "http://hl7.org/fhir/Practitioner/1",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "1",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/13",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "13",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(1)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/14",
            data.entry?.get(2)?.fullUrl
        )
        assertEquals(
            "14",
            data.entry?.get(2)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(2)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/15",
            data.entry?.get(3)?.fullUrl
        )
        assertEquals(
            "15",
            data.entry?.get(3)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(3)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/16",
            data.entry?.get(4)?.fullUrl
        )
        assertEquals(
            "16",
            data.entry?.get(4)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(4)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/17",
            data.entry?.get(5)?.fullUrl
        )
        assertEquals(
            "17",
            data.entry?.get(5)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(5)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/18",
            data.entry?.get(6)?.fullUrl
        )
        assertEquals(
            "18",
            data.entry?.get(6)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(6)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/19",
            data.entry?.get(7)?.fullUrl
        )
        assertEquals(
            "19",
            data.entry?.get(7)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(7)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/20",
            data.entry?.get(8)?.fullUrl
        )
        assertEquals(
            "20",
            data.entry?.get(8)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(8)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/Practitioner/21",
            data.entry?.get(9)?.fullUrl
        )
        assertEquals(
            "21",
            data.entry?.get(9)?.resource?.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.entry?.get(9)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "3ad0687e-f477-468c-afd5-fcc2bf897809",
            data.id
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.meta?.lastUpdated?.value.toString()
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
            BundleType.COLLECTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle05() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-lipids.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "https://example.com/base/DiagnosticReport/lipids",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "lipids",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/cholesterol",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "cholesterol",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/triglyceride",
            data.entry?.get(2)?.fullUrl
        )
        assertEquals(
            "triglyceride",
            data.entry?.get(2)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/hdlcholesterol",
            data.entry?.get(3)?.fullUrl
        )
        assertEquals(
            "hdlcholesterol",
            data.entry?.get(3)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/Observation/ldlcholesterol",
            data.entry?.get(4)?.fullUrl
        )
        assertEquals(
            "ldlcholesterol",
            data.entry?.get(4)?.resource?.id
        )
        assertEquals(
            "lipids",
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
            BundleType.COLLECTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle06() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-hla-genetics-results-example.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "urn:uuid:b0a4b18e-94e7-4b1b-8031-c7ae4bdd8db9",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(0)?.request?.method
        )
        assertEquals(
            "DiagnosticReport",
            data.entry?.get(0)?.request?.url
        )
        assertEquals(
            "urn:uuid:8200dab6-18a2-4550-b913-a7db480c0804",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(1)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(1)?.request?.url
        )
        assertEquals(
            "urn:uuid:7c393185-f15c-45bc-a714-c0fdbea32675",
            data.entry?.get(2)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(2)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(2)?.request?.url
        )
        assertEquals(
            "urn:uuid:65c85f14-c3a0-4b72-818f-820e04fcc621",
            data.entry?.get(3)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(3)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(3)?.request?.url
        )
        assertEquals(
            "urn:uuid:fbba9fe7-0ece-4ec1-9233-a437a8d242a0",
            data.entry?.get(4)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(4)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(4)?.request?.url
        )
        assertEquals(
            "urn:uuid:cbabf93e-1b4b-46f2-ba1e-d84862670670",
            data.entry?.get(5)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(5)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(5)?.request?.url
        )
        assertEquals(
            "urn:uuid:c233ad3d-1572-48d6-93da-0a583535e138",
            data.entry?.get(6)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(6)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(6)?.request?.url
        )
        assertEquals(
            "urn:uuid:05fa52d7-5c67-460a-8722-d3460b24d6fe",
            data.entry?.get(7)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(7)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(7)?.request?.url
        )
        assertEquals(
            "urn:uuid:db69e549-6267-4777-b4b9-8813f3329309",
            data.entry?.get(8)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(8)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(8)?.request?.url
        )
        assertEquals(
            "urn:uuid:bb55c2bc-5ad2-4bc1-8ff3-c407d06b12d0",
            data.entry?.get(9)?.fullUrl
        )
        assertEquals(
            HTTPVerb.POST,
            data.entry?.get(9)?.request?.method
        )
        assertEquals(
            "MolecularSequence",
            data.entry?.get(9)?.request?.url
        )
        assertEquals(
            "hla-1",
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
            BundleType.TRANSACTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle07() {
        // Given
        val sourceJson = loadAsString("r4/practitionerrole-examples-general.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/f003-0",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "f003-0",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/example-0",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "example-0",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/example-1",
            data.entry?.get(2)?.fullUrl
        )
        assertEquals(
            "example-1",
            data.entry?.get(2)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/example-2",
            data.entry?.get(3)?.fullUrl
        )
        assertEquals(
            "example-2",
            data.entry?.get(3)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/f007-0",
            data.entry?.get(4)?.fullUrl
        )
        assertEquals(
            "f007-0",
            data.entry?.get(4)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/f004-0",
            data.entry?.get(5)?.fullUrl
        )
        assertEquals(
            "f004-0",
            data.entry?.get(5)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/xcda1-0",
            data.entry?.get(6)?.fullUrl
        )
        assertEquals(
            "xcda1-0",
            data.entry?.get(6)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/f202-0",
            data.entry?.get(7)?.fullUrl
        )
        assertEquals(
            "f202-0",
            data.entry?.get(7)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/f201-0",
            data.entry?.get(8)?.fullUrl
        )
        assertEquals(
            "f201-0",
            data.entry?.get(8)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/PractitionerRole/f203-0",
            data.entry?.get(9)?.fullUrl
        )
        assertEquals(
            "f203-0",
            data.entry?.get(9)?.resource?.id
        )
        assertEquals(
            "3ad0687e-f477-468c-afd5-fcc2bf897808",
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
            BundleType.COLLECTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle08() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-f001-bloodexam.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "https://example.com/base/DiagnosticReport/f001",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "f001",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "https://example.com/base/ServiceRequest/req",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "req",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "f001",
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
            BundleType.COLLECTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle09() {
        // Given
        val sourceJson = loadAsString("r4/document-example-dischargesummary.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "180f219f-97a8-486d-99d9-ed631fe4fc57",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "2013-05-28T22:12:21Z",
            data.entry?.get(0)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://fhir.healthintersections.com.au/open/Practitioner/example",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "example",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "2013-05-05T16:13:03Z",
            data.entry?.get(1)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "http://fhir.healthintersections.com.au/open/Patient/d1",
            data.entry?.get(2)?.fullUrl
        )
        assertEquals(
            "d1",
            data.entry?.get(2)?.resource?.id
        )
        assertEquals(
            "http://fhir.healthintersections.com.au/open/Encounter/doc-example",
            data.entry?.get(3)?.fullUrl
        )
        assertEquals(
            "doc-example",
            data.entry?.get(3)?.resource?.id
        )
        assertEquals(
            "2013-05-05T16:13:03Z",
            data.entry?.get(3)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "urn:uuid:541a72a8-df75-4484-ac89-ac4923f03b81",
            data.entry?.get(4)?.fullUrl
        )
        assertEquals(
            "2013-05-05T16:13:03Z",
            data.entry?.get(4)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "urn:uuid:124a6916-5d84-4b8c-b250-10cefb8e6e86",
            data.entry?.get(5)?.fullUrl
        )
        assertEquals(
            "2013-05-05T16:13:03Z",
            data.entry?.get(5)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "urn:uuid:673f8db5-0ffd-4395-9657-6da00420bbc1",
            data.entry?.get(6)?.fullUrl
        )
        assertEquals(
            "urn:uuid:47600e0f-b6b5-4308-84b5-5dec157f7637",
            data.entry?.get(7)?.fullUrl
        )
        assertEquals(
            "2013-05-05T16:13:03Z",
            data.entry?.get(7)?.resource?.meta?.lastUpdated?.value.toString()
        )
        assertEquals(
            "father",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.system
        )
        assertEquals(
            "urn:uuid:0c3151bd-1cbf-4d64-b04d-cd9187a4c6e0",
            data.identifier?.value
        )
        assertEquals(
            "2013-05-28T22:12:21Z",
            data.meta?.lastUpdated?.value.toString()
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
            "Organization/example",
            data.signature?.onBehalfOf?.reference
        )
        assertEquals(
            "image/jpg",
            data.signature?.sigFormat
        )
        assertEquals(
            "1.2.840.10065.1.12.1.1",
            data.signature?.type?.get(0)?.code
        )
        assertEquals(
            "Author's Signature",
            data.signature?.type?.get(0)?.display
        )
        assertEquals(
            "urn:iso-astm:E1762-95:2013",
            data.signature?.type?.get(0)?.system
        )
        assertEquals(
            "2015-08-31T07:42:33+10:00",
            data.signature?.whenn?.value.toString()
        )
        assertEquals(
            "Device/software",
            data.signature?.who?.reference
        )
        assertEquals(
            "2013-05-28T22:12:21Z",
            data.timestamp?.value.toString()
        )
        assertEquals(
            BundleType.DOCUMENT,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBundle10() {
        // Given
        val sourceJson = loadAsString("r4/location-examples-general.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertEquals(
            "http://hl7.org/fhir/Location/2",
            data.entry?.get(0)?.fullUrl
        )
        assertEquals(
            "2",
            data.entry?.get(0)?.resource?.id
        )
        assertEquals(
            "http://hl7.org/fhir/Location/3",
            data.entry?.get(1)?.fullUrl
        )
        assertEquals(
            "3",
            data.entry?.get(1)?.resource?.id
        )
        assertEquals(
            "3ad0687e-f477-468c-afd5-fcc2bf897819",
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
            BundleType.COLLECTION,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
