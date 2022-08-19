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
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ImagingManifestTest.java
 *
 * Key Object Selection
 *
 * A text description of the DICOM SOP instances selected in the ImagingManifest; or the reason for, or
 * significance of, the selection.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImagingManifestFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testImagingManifest01() {
        // Given
        val sourceJson = loadAsString("stu3/imagingmanifest-example.json")

        // When
        val data = parser.toFhir(ImagingManifest::class, sourceJson)

        // Then
        assertImagingManifest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImagingManifest01Step01(data: ImagingManifest) {
        assertEquals(
            expected = "Practitioner/example",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-11-20T11:01:20-08:00",
            actual = data.authoringTime?.value.toString()
        )

        assertEquals(
            expected = "1 SC image (screen snapshot) and 2 CT images to share a chest CT exam",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.189642796.63084.16748.2599092901",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/dicom",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example-iid",
            actual = data.study?.get(0)?.endpoint?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example-wadors",
            actual = data.study?.get(0)?.endpoint?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ImagingStudy/example",
            actual = data.study?.get(0)?.imagingStudy?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example-wadors",
            actual = data.study?.get(0)?.series?.get(0)?.endpoint?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.840.10008.5.1.4.1.1.7",
            actual = data.study?.get(0)?.series?.get(0)?.instance?.get(0)?.sopClass
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.189642796.63084.16748.2599092902",
            actual = data.study?.get(0)?.series?.get(0)?.instance?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.189642796.63084.16750.2599092901",
            actual = data.study?.get(0)?.series?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            actual = data.study?.get(0)?.series?.get(1)?.instance?.get(0)?.sopClass
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.189642796.63084.16748.2599092903",
            actual = data.study?.get(0)?.series?.get(1)?.instance?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.840.10008.5.1.4.1.1.2",
            actual = data.study?.get(0)?.series?.get(1)?.instance?.get(1)?.sopClass
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.189642796.63084.16748.2599092904",
            actual = data.study?.get(0)?.series?.get(1)?.instance?.get(1)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.189642796.63084.16750.2599092902",
            actual = data.study?.get(0)?.series?.get(1)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.124.113543.6003.189642796.63084.16749.2599092904",
            actual = data.study?.get(0)?.uid
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A set of images to share accompanying an report document, including one SC image and two CT image</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
