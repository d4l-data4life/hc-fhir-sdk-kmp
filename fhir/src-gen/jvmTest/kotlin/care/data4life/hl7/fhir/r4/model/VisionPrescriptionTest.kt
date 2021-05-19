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
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.VisionBase
import care.data4life.hl7.fhir.r4.codesystem.VisionEyes
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * VisionPrescriptionTest.java
 *
 * Prescription for vision correction products for a patient
 *
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class VisionPrescriptionTest {

    val parser = FhirR4Parser()

    @Test
    fun testVisionPrescription01() {
        // Given
        val sourceJson = loadAsString("r4/visionprescription-example-1.json")

        // When
        val data = parser.toFhir(VisionPrescription::class, sourceJson)

        // Then
        assertVisionPrescription01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertVisionPrescription01Step01(data: VisionPrescription) {

        assertEquals(
            expected = "2014-06-15",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "2014-06-15",
            actual = data.dateWritten?.value.toString()
        )

        assertEquals(
            expected = "Encounter/f001",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "33124",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.happysight.com/prescription",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "15014",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.75".toDouble(),
            actual = data.lensSpecification?.get(0)?.add?.value
        )

        assertEquals(
            expected = "160".toInt(),
            actual = data.lensSpecification?.get(0)?.axis?.value
        )

        assertEquals(
            expected = "8.7".toDouble(),
            actual = data.lensSpecification?.get(0)?.backCurve?.value
        )

        assertEquals(
            expected = "OphthaGuard",
            actual = data.lensSpecification?.get(0)?.brand
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "green",
            actual = data.lensSpecification?.get(0)?.color
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-2.25".toDouble(),
            actual = data.lensSpecification?.get(0)?.cylinder?.value
        )

        assertEquals(
            expected = "14.0".toDouble(),
            actual = data.lensSpecification?.get(0)?.diameter?.value
        )

        assertEquals(
            expected = "month",
            actual = data.lensSpecification?.get(0)?.duration?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.lensSpecification?.get(0)?.duration?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "month",
            actual = data.lensSpecification?.get(0)?.duration?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.lensSpecification?.get(0)?.duration?.value?.value
        )

        assertEquals(
            expected = VisionEyes.RIGHT,
            actual = data.lensSpecification?.get(0)?.eye
        )

        assertEquals(
            expected = "Shade treatment for extreme light sensitivity",
            actual = data.lensSpecification?.get(0)?.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-2.75".toDouble(),
            actual = data.lensSpecification?.get(0)?.power?.value
        )

        assertEquals(
            expected = "contact",
            actual = data.lensSpecification?.get(0)?.product?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            actual = data.lensSpecification?.get(0)?.product?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.75".toDouble(),
            actual = data.lensSpecification?.get(1)?.add?.value
        )

        assertEquals(
            expected = "160".toInt(),
            actual = data.lensSpecification?.get(1)?.axis?.value
        )

        assertEquals(
            expected = "8.7".toDouble(),
            actual = data.lensSpecification?.get(1)?.backCurve?.value
        )

        assertEquals(
            expected = "OphthaGuard",
            actual = data.lensSpecification?.get(1)?.brand
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "green",
            actual = data.lensSpecification?.get(1)?.color
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-3.5".toDouble(),
            actual = data.lensSpecification?.get(1)?.cylinder?.value
        )

        assertEquals(
            expected = "14.0".toDouble(),
            actual = data.lensSpecification?.get(1)?.diameter?.value
        )

        assertEquals(
            expected = "month",
            actual = data.lensSpecification?.get(1)?.duration?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.lensSpecification?.get(1)?.duration?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "month",
            actual = data.lensSpecification?.get(1)?.duration?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.lensSpecification?.get(1)?.duration?.value?.value
        )

        assertEquals(
            expected = VisionEyes.LEFT,
            actual = data.lensSpecification?.get(1)?.eye
        )

        assertEquals(
            expected = "Shade treatment for extreme light sensitivity",
            actual = data.lensSpecification?.get(1)?.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-2.75".toDouble(),
            actual = data.lensSpecification?.get(1)?.power?.value
        )

        assertEquals(
            expected = "contact",
            actual = data.lensSpecification?.get(1)?.product?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            actual = data.lensSpecification?.get(1)?.product?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.prescriber?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Sample Contract Lens prescription</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testVisionPrescription02() {
        // Given
        val sourceJson = loadAsString("r4/visionprescription-example.json")

        // When
        val data = parser.toFhir(VisionPrescription::class, sourceJson)

        // Then
        assertVisionPrescription02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertVisionPrescription02Step01(data: VisionPrescription) {

        assertEquals(
            expected = "2014-06-15",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "2014-06-15",
            actual = data.dateWritten?.value.toString()
        )

        assertEquals(
            expected = "33123",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.happysight.com/prescription",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "15013",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.0".toDouble(),
            actual = data.lensSpecification?.get(0)?.add?.value
        )

        assertEquals(
            expected = VisionEyes.RIGHT,
            actual = data.lensSpecification?.get(0)?.eye
        )

        assertEquals(
            expected = "0.5".toDouble(),
            actual = data.lensSpecification?.get(0)?.prism?.get(0)?.amount?.value
        )

        assertEquals(
            expected = VisionBase.DOWN,
            actual = data.lensSpecification?.get(0)?.prism?.get(0)?.base
        )

        assertEquals(
            expected = "lens",
            actual = data.lensSpecification?.get(0)?.product?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            actual = data.lensSpecification?.get(0)?.product?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-2.0".toDouble(),
            actual = data.lensSpecification?.get(0)?.sphere?.value
        )

        assertEquals(
            expected = "2.0".toDouble(),
            actual = data.lensSpecification?.get(1)?.add?.value
        )

        assertEquals(
            expected = "180".toInt(),
            actual = data.lensSpecification?.get(1)?.axis?.value
        )

        assertEquals(
            expected = "-0.5".toDouble(),
            actual = data.lensSpecification?.get(1)?.cylinder?.value
        )

        assertEquals(
            expected = VisionEyes.LEFT,
            actual = data.lensSpecification?.get(1)?.eye
        )

        assertEquals(
            expected = "0.5".toDouble(),
            actual = data.lensSpecification?.get(1)?.prism?.get(0)?.amount?.value
        )

        assertEquals(
            expected = VisionBase.UP,
            actual = data.lensSpecification?.get(1)?.prism?.get(0)?.base
        )

        assertEquals(
            expected = "lens",
            actual = data.lensSpecification?.get(1)?.product?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            actual = data.lensSpecification?.get(1)?.product?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-1.0".toDouble(),
            actual = data.lensSpecification?.get(1)?.sphere?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.prescriber?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
