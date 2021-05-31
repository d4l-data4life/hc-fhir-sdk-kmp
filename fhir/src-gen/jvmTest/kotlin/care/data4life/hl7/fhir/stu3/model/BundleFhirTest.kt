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
import care.data4life.hl7.fhir.stu3.codesystem.BundleType
import care.data4life.hl7.fhir.stu3.codesystem.HTTPVerb
import care.data4life.hl7.fhir.stu3.codesystem.SearchEntryMode
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
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class BundleFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testBundle01() {
        // Given
        val sourceJson = loadAsString("stu3/xds-example.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle01Step01(data: Bundle) {

        assertEquals(
            expected = "urn:uuid:3fdc72f4-a11d-4a9d-9260-a9f745779e1d",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(0)?.request?.method
        )

        assertEquals(
            expected = "DocumentReference",
            actual = data.entry?.get(0)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-07-01T13:11:33Z",
            actual = data.entry?.get(0)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://localhost:9556/svc/fhir/Patient/a2",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient?identifier=http://acme.org/xds/patients!89765a87b",
            actual = data.entry?.get(1)?.request?.ifNoneExist
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(1)?.request?.method
        )

        assertEquals(
            expected = "Patient",
            actual = data.entry?.get(1)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a2",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-07-01T13:11:33Z",
            actual = data.entry?.get(1)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://localhost:9556/svc/fhir/Practitioner/a3",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(2)?.request?.method
        )

        assertEquals(
            expected = "Practitioner",
            actual = data.entry?.get(2)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a3",
            actual = data.entry?.get(2)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-07-01T13:11:33Z",
            actual = data.entry?.get(2)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://localhost:9556/svc/fhir/Practitioner/a4",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(3)?.request?.method
        )

        assertEquals(
            expected = "Practitioner",
            actual = data.entry?.get(3)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a4",
            actual = data.entry?.get(3)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-07-01T13:11:33Z",
            actual = data.entry?.get(3)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://localhost:9556/svc/fhir/Binary/1e404af3-077f-4bee-b7a6-a9be97e1ce32",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(4)?.request?.method
        )

        assertEquals(
            expected = "Binary",
            actual = data.entry?.get(4)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1e404af3-077f-4bee-b7a6-a9be97e1ce32",
            actual = data.entry?.get(4)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-07-01T13:11:33Z",
            actual = data.entry?.get(4)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "xds",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-07-01T13:11:33Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = BundleType.TRANSACTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle02() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-examples-general.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle02Step01(data: Bundle) {

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/1",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/13",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "13",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(1)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/14",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14",
            actual = data.entry?.get(2)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(2)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/15",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15",
            actual = data.entry?.get(3)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(3)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/16",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "16",
            actual = data.entry?.get(4)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(4)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/17",
            actual = data.entry?.get(5)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "17",
            actual = data.entry?.get(5)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(5)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/18",
            actual = data.entry?.get(6)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18",
            actual = data.entry?.get(6)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(6)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/19",
            actual = data.entry?.get(7)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "19",
            actual = data.entry?.get(7)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(7)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/20",
            actual = data.entry?.get(8)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20",
            actual = data.entry?.get(8)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(8)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/21",
            actual = data.entry?.get(9)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "21",
            actual = data.entry?.get(9)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.entry?.get(9)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "3ad0687e-f477-468c-afd5-fcc2bf897809",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = BundleType.COLLECTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle03() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-hla-genetics-results-example.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle03Step01(data: Bundle) {

        assertEquals(
            expected = "urn:uuid:b0a4b18e-94e7-4b1b-8031-c7ae4bdd8db9",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(0)?.request?.method
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.entry?.get(0)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:8200dab6-18a2-4550-b913-a7db480c0804",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(1)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(1)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:7c393185-f15c-45bc-a714-c0fdbea32675",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(2)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(2)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:65c85f14-c3a0-4b72-818f-820e04fcc621",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(3)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(3)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:fbba9fe7-0ece-4ec1-9233-a437a8d242a0",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(4)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(4)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:cbabf93e-1b4b-46f2-ba1e-d84862670670",
            actual = data.entry?.get(5)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(5)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(5)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:c233ad3d-1572-48d6-93da-0a583535e138",
            actual = data.entry?.get(6)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(6)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(6)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:05fa52d7-5c67-460a-8722-d3460b24d6fe",
            actual = data.entry?.get(7)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(7)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(7)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:db69e549-6267-4777-b4b9-8813f3329309",
            actual = data.entry?.get(8)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(8)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(8)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:bb55c2bc-5ad2-4bc1-8ff3-c407d06b12d0",
            actual = data.entry?.get(9)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.POST,
            actual = data.entry?.get(9)?.request?.method
        )

        assertEquals(
            expected = "Sequence",
            actual = data.entry?.get(9)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hla-1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = BundleType.TRANSACTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle04() {
        // Given
        val sourceJson = loadAsString("stu3/practitionerrole-examples-general.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle04Step01(data: Bundle) {

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/f003-0",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f003-0",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/example-0",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-0",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/example-1",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-1",
            actual = data.entry?.get(2)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/example-2",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-2",
            actual = data.entry?.get(3)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/f007-0",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f007-0",
            actual = data.entry?.get(4)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/f004-0",
            actual = data.entry?.get(5)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f004-0",
            actual = data.entry?.get(5)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/xcda1-0",
            actual = data.entry?.get(6)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "xcda1-0",
            actual = data.entry?.get(6)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/f202-0",
            actual = data.entry?.get(7)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f202-0",
            actual = data.entry?.get(7)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/f201-0",
            actual = data.entry?.get(8)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f201-0",
            actual = data.entry?.get(8)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/PractitionerRole/f203-0",
            actual = data.entry?.get(9)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f203-0",
            actual = data.entry?.get(9)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3ad0687e-f477-468c-afd5-fcc2bf897808",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = BundleType.COLLECTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle05() {
        // Given
        val sourceJson = loadAsString("stu3/document-example-dischargesummary.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle05Step01(data: Bundle) {

        assertEquals(
            expected = "http://fhir.healthintersections.com.au/open/Composition/180f219f-97a8-486d-99d9-ed631fe4fc57",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "180f219f-97a8-486d-99d9-ed631fe4fc57",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-28T22:12:21Z",
            actual = data.entry?.get(0)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://fhir.healthintersections.com.au/open/Practitioner/example",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-05T16:13:03Z",
            actual = data.entry?.get(1)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://fhir.healthintersections.com.au/open/Patient/d1",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "d1",
            actual = data.entry?.get(2)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fhir.healthintersections.com.au/open/Encounter/doc-example",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "doc-example",
            actual = data.entry?.get(3)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-05T16:13:03Z",
            actual = data.entry?.get(3)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "urn:uuid:541a72a8-df75-4484-ac89-ac4923f03b81",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-05T16:13:03Z",
            actual = data.entry?.get(4)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "urn:uuid:124a6916-5d84-4b8c-b250-10cefb8e6e86",
            actual = data.entry?.get(5)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-05T16:13:03Z",
            actual = data.entry?.get(5)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "urn:uuid:673f8db5-0ffd-4395-9657-6da00420bbc1",
            actual = data.entry?.get(6)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:47600e0f-b6b5-4308-84b5-5dec157f7637",
            actual = data.entry?.get(7)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-05T16:13:03Z",
            actual = data.entry?.get(7)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "father",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:0c3151bd-1cbf-4d64-b04d-cd9187a4c6e0",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-28T22:12:21Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "image/jpg",
            actual = data.signature?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.signature?.onBehalfOfReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.2.840.10065.1.12.1.1",
            actual = data.signature?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Author's Signature",
            actual = data.signature?.type?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso-astm:E1762-95:2013",
            actual = data.signature?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-31T07:42:33+10:00",
            actual = data.signature?.whenn?.value.toString()
        )

        assertEquals(
            expected = "Device/software",
            actual = data.signature?.whoReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = BundleType.DOCUMENT,
            actual = data.type
        )
    }

    @Test
    fun testBundle06() {
        // Given
        val sourceJson = loadAsString("stu3/location-examples-general.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle06Step01(data: Bundle) {

        assertEquals(
            expected = "http://hl7.org/fhir/Location/2",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Location/3",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3ad0687e-f477-468c-afd5-fcc2bf897819",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = BundleType.COLLECTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle07() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaire-profile-example-ussg-fht.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle07Step01(data: Bundle) {

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ConceptMap/ussgfht-loincde",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(0)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ConceptMap/ussgfht-loincde",
            actual = data.entry?.get(0)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ussgfht-loincde",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/Questionnaire/54127-6",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(1)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/Questionnaire/54127-6",
            actual = data.entry?.get(1)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "54127-6",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-questionnaire",
            actual = data.entry?.get(1)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL1-9",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(2)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL1-9",
            actual = data.entry?.get(2)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL1-9",
            actual = data.entry?.get(2)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(2)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL623-0",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(3)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL623-0",
            actual = data.entry?.get(3)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL623-0",
            actual = data.entry?.get(3)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(3)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL361-7",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(4)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL361-7",
            actual = data.entry?.get(4)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL361-7",
            actual = data.entry?.get(4)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(4)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL629-7",
            actual = data.entry?.get(5)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(5)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL629-7",
            actual = data.entry?.get(5)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL629-7",
            actual = data.entry?.get(5)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(5)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL628-9",
            actual = data.entry?.get(6)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(6)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL628-9",
            actual = data.entry?.get(6)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL628-9",
            actual = data.entry?.get(6)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(6)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL626-3",
            actual = data.entry?.get(7)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(7)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL626-3",
            actual = data.entry?.get(7)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL626-3",
            actual = data.entry?.get(7)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(7)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL619-8",
            actual = data.entry?.get(8)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(8)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL619-8",
            actual = data.entry?.get(8)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL619-8",
            actual = data.entry?.get(8)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(8)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL621-4",
            actual = data.entry?.get(9)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = HTTPVerb.PUT,
            actual = data.entry?.get(9)?.request?.method
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/ValueSet/LL621-4",
            actual = data.entry?.get(9)?.request?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LL621-4",
            actual = data.entry?.get(9)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/sdc/StructureDefinition/sdc-valueset",
            actual = data.entry?.get(9)?.resource?.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ussg-fht",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = BundleType.TRANSACTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle08() {
        // Given
        val sourceJson = loadAsString("stu3/endpoint-examples-general-template.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle08Step01(data: Bundle) {

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/71",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "71",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/72",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "72",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/73",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "73",
            actual = data.entry?.get(2)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/74",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "74",
            actual = data.entry?.get(3)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/75",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "75",
            actual = data.entry?.get(4)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/76",
            actual = data.entry?.get(5)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "76",
            actual = data.entry?.get(5)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/77",
            actual = data.entry?.get(6)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "77",
            actual = data.entry?.get(6)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/78",
            actual = data.entry?.get(7)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "78",
            actual = data.entry?.get(7)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/79",
            actual = data.entry?.get(8)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "79",
            actual = data.entry?.get(8)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Endpoint/80",
            actual = data.entry?.get(9)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80",
            actual = data.entry?.get(9)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "b0a5e4277-83c4-4adb-87e2-e3efe3369b6f",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = BundleType.COLLECTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle09() {
        // Given
        val sourceJson = loadAsString("stu3/patient-examples-cypress-template.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle09Step01(data: Bundle) {

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/71",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "71",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(0)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/72",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "72",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(1)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/73",
            actual = data.entry?.get(2)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "73",
            actual = data.entry?.get(2)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(2)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/74",
            actual = data.entry?.get(3)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "74",
            actual = data.entry?.get(3)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(3)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/75",
            actual = data.entry?.get(4)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "75",
            actual = data.entry?.get(4)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(4)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/76",
            actual = data.entry?.get(5)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "76",
            actual = data.entry?.get(5)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(5)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/77",
            actual = data.entry?.get(6)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "77",
            actual = data.entry?.get(6)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(6)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/78",
            actual = data.entry?.get(7)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "78",
            actual = data.entry?.get(7)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(7)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/79",
            actual = data.entry?.get(8)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "79",
            actual = data.entry?.get(8)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(8)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/80",
            actual = data.entry?.get(9)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80",
            actual = data.entry?.get(9)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-03T23:45:32Z",
            actual = data.entry?.get(9)?.resource?.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "b0a5e4277-83c4-4adb-87e2-e3efe3369b6f",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = BundleType.COLLECTION,
            actual = data.type
        )
    }

    @Test
    fun testBundle10() {
        // Given
        val sourceJson = loadAsString("stu3/bundle-example.json")

        // When
        val data = parser.toFhir(Bundle::class, sourceJson)

        // Then
        assertBundle10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBundle10Step01(data: Bundle) {

        assertEquals(
            expected = "https://example.com/base/MedicationRequest/3123",
            actual = data.entry?.get(0)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3123",
            actual = data.entry?.get(0)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchEntryMode.MATCH,
            actual = data.entry?.get(0)?.search?.mode
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.entry?.get(0)?.search?.score?.value
        )

        assertEquals(
            expected = "https://example.com/base/Medication/example",
            actual = data.entry?.get(1)?.fullUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.entry?.get(1)?.resource?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SearchEntryMode.INCLUDE,
            actual = data.entry?.get(1)?.search?.mode
        )

        assertEquals(
            expected = "bundle-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "self",
            actual = data.link?.get(0)?.relation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://example.com/base/MedicationRequest?patient=347&_include=MedicationRequest.medication",
            actual = data.link?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "next",
            actual = data.link?.get(1)?.relation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://example.com/base/MedicationRequest?patient=347&searchId=ff15fd40-ff71-4b48-b366-09c706bed9d0&page=2",
            actual = data.link?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-18T01:43:30Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.total?.value
        )

        assertEquals(
            expected = BundleType.SEARCHSET,
            actual = data.type
        )
    }
}
