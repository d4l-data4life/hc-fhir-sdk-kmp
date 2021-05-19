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
        assertDeviceMetric01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDeviceMetric01Step01(data: DeviceMetric) {

        assertEquals(
            expected = DeviceMetricCalibrationState.CALIBRATED,
            actual = data.calibration?.get(0)?.state
        )

        assertEquals(
            expected = "2016-12-28T09:03:04-05:00",
            actual = data.calibration?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = DeviceMetricCalibrationType.TWO_POINT,
            actual = data.calibration?.get(0)?.type
        )

        assertEquals(
            expected = DeviceMetricCategory.MEASUREMENT,
            actual = data.category
        )

        assertEquals(
            expected = DeviceMetricColor.BLUE,
            actual = data.color
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodcare.org/devicemetric/id",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "345675",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.measurementPeriod?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.measurementPeriod?.repeat?.period?.value
        )

        assertEquals(
            expected = "s",
            actual = data.measurementPeriod?.repeat?.periodUnit
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
            expected = DeviceMetricOperationalStatus.ON,
            actual = data.operationalStatus
        )

        assertEquals(
            expected = "DeviceDefinition/dc102",
            actual = data.parent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/dev1",
            actual = data.source?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "150456",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MDC_PULS_OXIM_SAT_O2",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:11073:10101",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "262688",
            actual = data.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MDC_DIM_PERCENT",
            actual = data.unit?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:11073:10101",
            actual = data.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
