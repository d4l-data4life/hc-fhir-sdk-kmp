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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * BodyStructureTest.java
 *
 * Specific and identified anatomical structure
 *
 * Record details about an anatomical structure. This resource may be used when a coded concept does
 * not provide the necessary detail needed for the use case.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class BodyStructureTest {

    val parser = FhirR4Parser()

    @Test
    fun testBodyStructure01() {
        // Given
        val sourceJson = loadAsString("r4/bodystructure-example-fetus.json")

        // When
        val data = parser.toFhir(BodyStructure::class, sourceJson)

        // Then
        assertBodyStructure01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBodyStructure01Step01(data: BodyStructure) {

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
            expected = "http://goodhealth.org/bodystructure/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "83418008",
            actual = data.location?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Entire fetus (body structure)",
            actual = data.location?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.location?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fetus",
            actual = data.location?.text
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
    fun testBodyStructure02() {
        // Given
        val sourceJson = loadAsString("r4/bodystructure-example-tumor.json")

        // When
        val data = parser.toFhir(BodyStructure::class, sourceJson)

        // Then
        assertBodyStructure02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBodyStructure02Step01(data: BodyStructure) {

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
            expected = "http://goodhealth.org/bodystructure/identifiers",
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
            expected = "78961009",
            actual = data.location?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Splenic structure (body structure)",
            actual = data.location?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.location?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Spleen",
            actual = data.location?.text
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
            expected = "4147007",
            actual = data.morphology?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mass (morphologic abnormality)",
            actual = data.morphology?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.morphology?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Splenic mass",
            actual = data.morphology?.text
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
    fun testBodyStructure03() {
        // Given
        val sourceJson = loadAsString("r4/bodystructure-example-skin-patch.json")

        // When
        val data = parser.toFhir(BodyStructure::class, sourceJson)

        // Then
        assertBodyStructure03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBodyStructure03Step01(data: BodyStructure) {

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.active?.value
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
            expected = "http://goodhealth.org/bodystructure/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14975008",
            actual = data.location?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Forearm",
            actual = data.location?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.location?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Forearm",
            actual = data.location?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "419161000",
            actual = data.locationQualifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Unilateral left",
            actual = data.locationQualifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.locationQualifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Left",
            actual = data.locationQualifier?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "263929005",
            actual = data.locationQualifier?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Volar",
            actual = data.locationQualifier?.get(1)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.locationQualifier?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Volar",
            actual = data.locationQualifier?.get(1)?.text
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
            expected = "Skin patch",
            actual = data.morphology?.text
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
