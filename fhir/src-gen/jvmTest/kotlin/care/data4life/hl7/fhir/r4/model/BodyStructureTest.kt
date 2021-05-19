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
        assertEquals(
            "EDD 1/1/2017 confirmation by LMP",
            data.description
        )
        assertEquals(
            "fetus",
            data.id
        )
        assertEquals(
            "http://goodhealth.org/bodystructure/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "83418008",
            data.location?.coding?.get(0)?.code
        )
        assertEquals(
            "Entire fetus (body structure)",
            data.location?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.location?.coding?.get(0)?.system
        )
        assertEquals(
            "Fetus",
            data.location?.text
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
            "Patient/example",
            data.patient?.reference
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
    fun testBodyStructure02() {
        // Given
        val sourceJson = loadAsString("r4/bodystructure-example-tumor.json")

        // When
        val data = parser.toFhir(BodyStructure::class, sourceJson)

        // Then
        assertEquals(
            "7 cm maximum diameter",
            data.description
        )
        assertEquals(
            "tumor",
            data.id
        )
        assertEquals(
            "http://goodhealth.org/bodystructure/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "application/dicom",
            data.image?.get(0)?.contentType
        )
        assertEquals(
            "http://imaging.acme.com/wado/server?requestType=WADO&amp;wado_details",
            data.image?.get(0)?.url
        )
        assertEquals(
            "78961009",
            data.location?.coding?.get(0)?.code
        )
        assertEquals(
            "Splenic structure (body structure)",
            data.location?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.location?.coding?.get(0)?.system
        )
        assertEquals(
            "Spleen",
            data.location?.text
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
            "4147007",
            data.morphology?.coding?.get(0)?.code
        )
        assertEquals(
            "Mass (morphologic abnormality)",
            data.morphology?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.morphology?.coding?.get(0)?.system
        )
        assertEquals(
            "Splenic mass",
            data.morphology?.text
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
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
    fun testBodyStructure03() {
        // Given
        val sourceJson = loadAsString("r4/bodystructure-example-skin-patch.json")

        // When
        val data = parser.toFhir(BodyStructure::class, sourceJson)

        // Then
        assertEquals(
            "False".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "inner surface (volar) of the left forearm",
            data.description
        )
        assertEquals(
            "skin-patch",
            data.id
        )
        assertEquals(
            "http://goodhealth.org/bodystructure/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "14975008",
            data.location?.coding?.get(0)?.code
        )
        assertEquals(
            "Forearm",
            data.location?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.location?.coding?.get(0)?.system
        )
        assertEquals(
            "Forearm",
            data.location?.text
        )
        assertEquals(
            "419161000",
            data.locationQualifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Unilateral left",
            data.locationQualifier?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.locationQualifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Left",
            data.locationQualifier?.get(0)?.text
        )
        assertEquals(
            "263929005",
            data.locationQualifier?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "Volar",
            data.locationQualifier?.get(1)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.locationQualifier?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            "Volar",
            data.locationQualifier?.get(1)?.text
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
            "Skin patch",
            data.morphology?.text
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
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
