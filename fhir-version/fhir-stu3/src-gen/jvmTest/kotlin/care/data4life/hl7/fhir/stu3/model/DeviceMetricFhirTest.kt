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
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricCalibrationState
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricCalibrationType
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricCategory
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricColor
import care.data4life.hl7.fhir.stu3.codesystem.DeviceMetricOperationalStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * DeviceMetricTest.java
 *
 * Measurement, calculation or setting capability of a medical device
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceMetricFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDeviceMetric01() {
        // Given
        val sourceJson = loadAsString("stu3/devicemetric-example.json")

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
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "345675",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
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
            expected = DeviceMetricOperationalStatus.ON,
            actual = data.operationalStatus
        )

        assertEquals(
            expected = "DeviceComponent/dc102",
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
            expected = "https://rtmms.nist.gov",
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
            expected = "https://rtmms.nist.gov",
            actual = data.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
