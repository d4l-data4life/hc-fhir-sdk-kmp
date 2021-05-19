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
import care.data4life.hl7.fhir.r4.codesystem.SlotStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * SlotTest.java
 *
 * A slot of time on a schedule that may be available for booking appointments
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SlotTest {

    val parser = FhirR4Parser()

    @Test
    fun testSlot01() {
        // Given
        val sourceJson = loadAsString("r4/slot-example-busy.json")

        // When
        val data = parser.toFhir(Slot::class, sourceJson)

        // Then
        assertSlot01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSlot01Step01(data: Slot) {

        assertEquals(
            expected = "Assessments should be performed before requesting appointments in this slot.",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T09:15:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/identifiers/slots",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123132",
            actual = data.identifier?.get(0)?.value
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
            expected = "True".toBoolean(),
            actual = data.overbooked?.value
        )

        assertEquals(
            expected = "Schedule/example",
            actual = data.schedule?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "17",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Practice",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T09:00:00Z",
            actual = data.start?.value.toString()
        )

        assertEquals(
            expected = SlotStatus.BUSY,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testSlot02() {
        // Given
        val sourceJson = loadAsString("r4/slot-example.json")

        // When
        val data = parser.toFhir(Slot::class, sourceJson)

        // Then
        assertSlot02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSlot02Step01(data: Slot) {

        assertEquals(
            expected = "WALKIN",
            actual = data.appointmentType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A previously unscheduled walk-in visit",
            actual = data.appointmentType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0276",
            actual = data.appointmentType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Assessments should be performed before requesting appointments in this slot.",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T09:30:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "example",
            actual = data.id
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
            expected = "Schedule/example",
            actual = data.schedule?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "17",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Practice",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "57",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Immunization",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "408480009",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical immunology",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T09:15:00Z",
            actual = data.start?.value.toString()
        )

        assertEquals(
            expected = SlotStatus.FREE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testSlot03() {
        // Given
        val sourceJson = loadAsString("r4/slot-example-unavailable.json")

        // When
        val data = parser.toFhir(Slot::class, sourceJson)

        // Then
        assertSlot03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSlot03Step01(data: Slot) {

        assertEquals(
            expected = "Dr Careful is out of the office",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T09:45:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "3",
            actual = data.id
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
            expected = "Schedule/example",
            actual = data.schedule?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "17",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Practice",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T09:30:00Z",
            actual = data.start?.value.toString()
        )

        assertEquals(
            expected = SlotStatus.BUSY_UNAVAILABLE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testSlot04() {
        // Given
        val sourceJson = loadAsString("r4/slot-example-tentative.json")

        // When
        val data = parser.toFhir(Slot::class, sourceJson)

        // Then
        assertSlot04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSlot04Step01(data: Slot) {

        assertEquals(
            expected = "Dr Careful is out of the office",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T10:00:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "2",
            actual = data.id
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
            expected = "Schedule/example",
            actual = data.schedule?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "17",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Practice",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T09:45:00Z",
            actual = data.start?.value.toString()
        )

        assertEquals(
            expected = SlotStatus.BUSY_TENTATIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
