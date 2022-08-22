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
import care.data4life.hl7.fhir.stu3.codesystem.MeasmntPrinciple
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * DeviceComponentTest.java
 *
 * An instance of a medical-related component of a medical device
 *
 * The characteristics, operational status and capabilities of a medical-related component of a medical
 * device.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceComponentFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDeviceComponent01() {
        // Given
        val sourceJson = loadAsString("stu3/devicecomponent-example.json")

        // When
        val data = parser.toFhir(DeviceComponent::class, sourceJson)

        // Then
        assertDeviceComponent01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDeviceComponent01Step01(data: DeviceComponent) {
        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-US",
            actual = data.languageCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://tools.ietf.org/html/bcp47",
            actual = data.languageCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-10-07T14:45:00Z",
            actual = data.lastSystemChange?.value.toString()
        )

        assertEquals(
            expected = MeasmntPrinciple.OPTICAL,
            actual = data.measurementPrinciple
        )

        assertEquals(
            expected = "off",
            actual = data.operationalStatus?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Off",
            actual = data.operationalStatus?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:11073:10101",
            actual = data.operationalStatus?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "miscellaneous",
            actual = data.parameterGroup?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Miscellaneous Parameter Group",
            actual = data.parameterGroup?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:11073:10101",
            actual = data.parameterGroup?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DeviceComponent/dc1",
            actual = data.parent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/d1",
            actual = data.source?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "2000",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MDC_DEV_ANALY_SAT_O2_MDS",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:11073:10101",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testDeviceComponent02() {
        // Given
        val sourceJson = loadAsString("stu3/devicecomponent-example-prodspec.json")

        // When
        val data = parser.toFhir(DeviceComponent::class, sourceJson)

        // Then
        assertDeviceComponent02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDeviceComponent02Step01(data: DeviceComponent) {
        assertEquals(
            expected = "example-prodspec",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "789123",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-US",
            actual = data.languageCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://tools.ietf.org/html/bcp47",
            actual = data.languageCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-10-07T14:45:00Z",
            actual = data.lastSystemChange?.value.toString()
        )

        assertEquals(
            expected = "off",
            actual = data.operationalStatus?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Off",
            actual = data.operationalStatus?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "xa-12324-b",
            actual = data.productionSpecification?.get(0)?.productionSpec
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "serial-number",
            actual = data.productionSpecification?.get(0)?.specType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serial number",
            actual = data.productionSpecification?.get(0)?.specType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.productionSpecification?.get(1)?.productionSpec
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hardware-revision",
            actual = data.productionSpecification?.get(1)?.specType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hardware Revision",
            actual = data.productionSpecification?.get(1)?.specType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.12",
            actual = data.productionSpecification?.get(2)?.productionSpec
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "software-revision",
            actual = data.productionSpecification?.get(2)?.specType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Software Revision",
            actual = data.productionSpecification?.get(2)?.specType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0.23",
            actual = data.productionSpecification?.get(3)?.productionSpec
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "firmware-revision",
            actual = data.productionSpecification?.get(3)?.specType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Firmware Revision",
            actual = data.productionSpecification?.get(3)?.specType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/d1",
            actual = data.source?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "2000",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MDC_DEV_ANALY_SAT_O2_MDS",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:11073:10101",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
