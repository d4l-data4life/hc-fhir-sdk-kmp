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
import care.data4life.hl7.fhir.r4.codesystem.DeviceMetricCalibrationState
import care.data4life.hl7.fhir.r4.codesystem.DeviceMetricCalibrationType
import care.data4life.hl7.fhir.r4.codesystem.DeviceMetricCategory
import care.data4life.hl7.fhir.r4.codesystem.DeviceMetricColor
import care.data4life.hl7.fhir.r4.codesystem.DeviceMetricOperationalStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DeviceMetricTest.java
 *
 * Measurement, calculation or setting capability of a medical device
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceMetricTest {

    val parser = FhirR4Parser()

    @Test
    fun testDeviceMetric01() {
        // Given
        val sourceJson = loadAsString("r4/devicemetric-example.json")

        // When
        val data = parser.toFhir(DeviceMetric::class, sourceJson)

        // Then
        assertEquals(
            DeviceMetricCalibrationState.CALIBRATED,
            data.calibration?.get(0)?.state
        )
        assertEquals(
            "2016-12-28T09:03:04-05:00",
            data.calibration?.get(0)?.time?.value.toString()
        )
        assertEquals(
            DeviceMetricCalibrationType.TWO_POINT,
            data.calibration?.get(0)?.type
        )
        assertEquals(
            DeviceMetricCategory.MEASUREMENT,
            data.category
        )
        assertEquals(
            DeviceMetricColor.BLUE,
            data.color
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://goodcare.org/devicemetric/id",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "345675",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "1".toLong(),
            data.measurementPeriod?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.measurementPeriod?.repeat?.period?.value
        )
        assertEquals(
            "s",
            data.measurementPeriod?.repeat?.periodUnit
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
            DeviceMetricOperationalStatus.ON,
            data.operationalStatus
        )
        assertEquals(
            "DeviceDefinition/dc102",
            data.parent?.reference
        )
        assertEquals(
            "Device/dev1",
            data.source?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "150456",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "MDC_PULS_OXIM_SAT_O2",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:iso:std:iso:11073:10101",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "262688",
            data.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "MDC_DIM_PERCENT",
            data.unit?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:iso:std:iso:11073:10101",
            data.unit?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
