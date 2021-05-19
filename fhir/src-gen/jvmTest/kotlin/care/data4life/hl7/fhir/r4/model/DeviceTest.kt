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
import care.data4life.hl7.fhir.r4.codesystem.FHIRDeviceStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DeviceTest.java
 *
 * Item used in healthcare
 *
 * A type of a manufactured item that is used in the provision of healthcare without being
 * substantially changed through that activity. The device may be a medical or non-medical device.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceTest {

    val parser = FhirR4Parser()

    @Test
    fun testDevice01() {
        // Given
        val sourceJson = loadAsString("r4/device-example-f001-feedingtube.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertEquals(
            "f001",
            data.id
        )
        assertEquals(
            "http:/goodhealthhospital/identifier/devices",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
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
            FHIRDeviceStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: f001</p><p><b>identifier</b>: 12345</p><p><b>status</b>: active</p></div>",
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
    fun testDevice02() {
        // Given
        val sourceJson = loadAsString("r4/device-example.json")

        // When
        val data = parser.toFhir(Device::class, sourceJson)

        // Then
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://goodcare.org/devices/id",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "345675",
            data.identifier?.get(0)?.value
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
            "<div xmlns=\"http://www.w3.org/1999/xhtml\"><p><b>Generated Narrative with Details</b></p><p><b>id</b>: example</p><p><b>identifier</b>: 345675</p></div>",
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
}
