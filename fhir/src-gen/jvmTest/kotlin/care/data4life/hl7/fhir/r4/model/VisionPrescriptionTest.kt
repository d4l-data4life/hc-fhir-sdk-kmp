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
        assertEquals(
            "2014-06-15",
            data.created?.value.toString()
        )
        assertEquals(
            "2014-06-15",
            data.dateWritten?.value.toString()
        )
        assertEquals(
            "Encounter/f001",
            data.encounter?.reference
        )
        assertEquals(
            "33124",
            data.id
        )
        assertEquals(
            "http://www.happysight.com/prescription",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "15014",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "1.75".toDouble(),
            data.lensSpecification?.get(0)?.add?.value
        )
        assertEquals(
            "160".toInt(),
            data.lensSpecification?.get(0)?.axis?.value
        )
        assertEquals(
            "8.7".toDouble(),
            data.lensSpecification?.get(0)?.backCurve?.value
        )
        assertEquals(
            "OphthaGuard",
            data.lensSpecification?.get(0)?.brand
        )
        assertEquals(
            "green",
            data.lensSpecification?.get(0)?.color
        )
        assertEquals(
            "-2.25".toDouble(),
            data.lensSpecification?.get(0)?.cylinder?.value
        )
        assertEquals(
            "14.0".toDouble(),
            data.lensSpecification?.get(0)?.diameter?.value
        )
        assertEquals(
            "month",
            data.lensSpecification?.get(0)?.duration?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.lensSpecification?.get(0)?.duration?.system
        )
        assertEquals(
            "month",
            data.lensSpecification?.get(0)?.duration?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.lensSpecification?.get(0)?.duration?.value?.value
        )
        assertEquals(
            VisionEyes.RIGHT,
            data.lensSpecification?.get(0)?.eye
        )
        assertEquals(
            "Shade treatment for extreme light sensitivity",
            data.lensSpecification?.get(0)?.note?.get(0)?.text
        )
        assertEquals(
            "-2.75".toDouble(),
            data.lensSpecification?.get(0)?.power?.value
        )
        assertEquals(
            "contact",
            data.lensSpecification?.get(0)?.product?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            data.lensSpecification?.get(0)?.product?.coding?.get(0)?.system
        )
        assertEquals(
            "1.75".toDouble(),
            data.lensSpecification?.get(1)?.add?.value
        )
        assertEquals(
            "160".toInt(),
            data.lensSpecification?.get(1)?.axis?.value
        )
        assertEquals(
            "8.7".toDouble(),
            data.lensSpecification?.get(1)?.backCurve?.value
        )
        assertEquals(
            "OphthaGuard",
            data.lensSpecification?.get(1)?.brand
        )
        assertEquals(
            "green",
            data.lensSpecification?.get(1)?.color
        )
        assertEquals(
            "-3.5".toDouble(),
            data.lensSpecification?.get(1)?.cylinder?.value
        )
        assertEquals(
            "14.0".toDouble(),
            data.lensSpecification?.get(1)?.diameter?.value
        )
        assertEquals(
            "month",
            data.lensSpecification?.get(1)?.duration?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.lensSpecification?.get(1)?.duration?.system
        )
        assertEquals(
            "month",
            data.lensSpecification?.get(1)?.duration?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.lensSpecification?.get(1)?.duration?.value?.value
        )
        assertEquals(
            VisionEyes.LEFT,
            data.lensSpecification?.get(1)?.eye
        )
        assertEquals(
            "Shade treatment for extreme light sensitivity",
            data.lensSpecification?.get(1)?.note?.get(0)?.text
        )
        assertEquals(
            "-2.75".toDouble(),
            data.lensSpecification?.get(1)?.power?.value
        )
        assertEquals(
            "contact",
            data.lensSpecification?.get(1)?.product?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            data.lensSpecification?.get(1)?.product?.coding?.get(0)?.system
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
            "Practitioner/example",
            data.prescriber?.reference
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Sample Contract Lens prescription</div>",
            data.text?.div
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
    fun testVisionPrescription02() {
        // Given
        val sourceJson = loadAsString("r4/visionprescription-example.json")

        // When
        val data = parser.toFhir(VisionPrescription::class, sourceJson)

        // Then
        assertEquals(
            "2014-06-15",
            data.created?.value.toString()
        )
        assertEquals(
            "2014-06-15",
            data.dateWritten?.value.toString()
        )
        assertEquals(
            "33123",
            data.id
        )
        assertEquals(
            "http://www.happysight.com/prescription",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "15013",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "2.0".toDouble(),
            data.lensSpecification?.get(0)?.add?.value
        )
        assertEquals(
            VisionEyes.RIGHT,
            data.lensSpecification?.get(0)?.eye
        )
        assertEquals(
            "0.5".toDouble(),
            data.lensSpecification?.get(0)?.prism?.get(0)?.amount?.value
        )
        assertEquals(
            VisionBase.DOWN,
            data.lensSpecification?.get(0)?.prism?.get(0)?.base
        )
        assertEquals(
            "lens",
            data.lensSpecification?.get(0)?.product?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            data.lensSpecification?.get(0)?.product?.coding?.get(0)?.system
        )
        assertEquals(
            "-2.0".toDouble(),
            data.lensSpecification?.get(0)?.sphere?.value
        )
        assertEquals(
            "2.0".toDouble(),
            data.lensSpecification?.get(1)?.add?.value
        )
        assertEquals(
            "180".toInt(),
            data.lensSpecification?.get(1)?.axis?.value
        )
        assertEquals(
            "-0.5".toDouble(),
            data.lensSpecification?.get(1)?.cylinder?.value
        )
        assertEquals(
            VisionEyes.LEFT,
            data.lensSpecification?.get(1)?.eye
        )
        assertEquals(
            "0.5".toDouble(),
            data.lensSpecification?.get(1)?.prism?.get(0)?.amount?.value
        )
        assertEquals(
            VisionBase.UP,
            data.lensSpecification?.get(1)?.prism?.get(0)?.base
        )
        assertEquals(
            "lens",
            data.lensSpecification?.get(1)?.product?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-visionprescriptionproduct",
            data.lensSpecification?.get(1)?.product?.coding?.get(0)?.system
        )
        assertEquals(
            "-1.0".toDouble(),
            data.lensSpecification?.get(1)?.sphere?.value
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
            "Practitioner/example",
            data.prescriber?.reference
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
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
