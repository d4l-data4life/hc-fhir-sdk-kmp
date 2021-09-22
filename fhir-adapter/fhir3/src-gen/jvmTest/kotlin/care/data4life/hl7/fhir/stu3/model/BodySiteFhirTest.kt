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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * BodySiteTest.java
 *
 * Specific and identified anatomical location
 *
 * Record details about the anatomical location of a specimen or body part. This resource may be used
 * when a coded concept does not provide the necessary detail needed for the use case.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class BodySiteFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testBodySite01() {
        // Given
        val sourceJson = loadAsString("stu3/bodysite-example-fetus.json")

        // When
        val data = parser.toFhir(BodySite::class, sourceJson)

        // Then
        assertBodySite01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBodySite01Step01(data: BodySite) {

        assertEquals(
            expected = "83418008",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Entire fetus (body structure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fetus",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EDD 1/1/2017 confirmation by LMP",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fetus",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealth.org/bodysite/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testBodySite02() {
        // Given
        val sourceJson = loadAsString("stu3/bodysite-example-tumor.json")

        // When
        val data = parser.toFhir(BodySite::class, sourceJson)

        // Then
        assertBodySite02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBodySite02Step01(data: BodySite) {

        assertEquals(
            expected = "4147007",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mass (morphologic abnormality)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Splenic mass",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7 cm maximum diameter",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "tumor",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealth.org/bodysite/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/dicom",
            actual = data.image?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://imaging.acme.com/wado/server?requestType=WADO&amp;wado_details",
            actual = data.image?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "78961009",
            actual = data.qualifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Splenic structure (body structure)",
            actual = data.qualifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.qualifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Splenic mass",
            actual = data.qualifier?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testBodySite03() {
        // Given
        val sourceJson = loadAsString("stu3/bodysite-example-skin-patch.json")

        // When
        val data = parser.toFhir(BodySite::class, sourceJson)

        // Then
        assertBodySite03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBodySite03Step01(data: BodySite) {

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "39937001",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Skin structure (body structure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Skin patch",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "inner surface (volar) of the left forearm",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "skin-patch",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealth.org/bodysite/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
