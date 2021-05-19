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
        assertEquals(
            "Assessments should be performed before requesting appointments in this slot.",
            data.comment
        )
        assertEquals(
            "2013-12-25T09:15:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "1",
            data.id
        )
        assertEquals(
            "http://example.org/identifiers/slots",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123132",
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
            "True".toBoolean(),
            data.overbooked?.value
        )
        assertEquals(
            "Schedule/example",
            data.schedule?.reference
        )
        assertEquals(
            "17",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Practice",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "2013-12-25T09:00:00Z",
            data.start?.value.toString()
        )
        assertEquals(
            SlotStatus.BUSY,
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

    @Test
    fun testSlot02() {
        // Given
        val sourceJson = loadAsString("r4/slot-example.json")

        // When
        val data = parser.toFhir(Slot::class, sourceJson)

        // Then
        assertEquals(
            "WALKIN",
            data.appointmentType?.coding?.get(0)?.code
        )
        assertEquals(
            "A previously unscheduled walk-in visit",
            data.appointmentType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0276",
            data.appointmentType?.coding?.get(0)?.system
        )
        assertEquals(
            "Assessments should be performed before requesting appointments in this slot.",
            data.comment
        )
        assertEquals(
            "2013-12-25T09:30:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "example",
            data.id
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
            "Schedule/example",
            data.schedule?.reference
        )
        assertEquals(
            "17",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Practice",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "57",
            data.serviceType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Immunization",
            data.serviceType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "408480009",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Clinical immunology",
            data.specialty?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "2013-12-25T09:15:00Z",
            data.start?.value.toString()
        )
        assertEquals(
            SlotStatus.FREE,
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

    @Test
    fun testSlot03() {
        // Given
        val sourceJson = loadAsString("r4/slot-example-unavailable.json")

        // When
        val data = parser.toFhir(Slot::class, sourceJson)

        // Then
        assertEquals(
            "Dr Careful is out of the office",
            data.comment
        )
        assertEquals(
            "2013-12-25T09:45:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "3",
            data.id
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
            "Schedule/example",
            data.schedule?.reference
        )
        assertEquals(
            "17",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Practice",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "2013-12-25T09:30:00Z",
            data.start?.value.toString()
        )
        assertEquals(
            SlotStatus.BUSY_UNAVAILABLE,
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

    @Test
    fun testSlot04() {
        // Given
        val sourceJson = loadAsString("r4/slot-example-tentative.json")

        // When
        val data = parser.toFhir(Slot::class, sourceJson)

        // Then
        assertEquals(
            "Dr Careful is out of the office",
            data.comment
        )
        assertEquals(
            "2013-12-25T10:00:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "2",
            data.id
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
            "Schedule/example",
            data.schedule?.reference
        )
        assertEquals(
            "17",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Practice",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "2013-12-25T09:45:00Z",
            data.start?.value.toString()
        )
        assertEquals(
            SlotStatus.BUSY_TENTATIVE,
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
