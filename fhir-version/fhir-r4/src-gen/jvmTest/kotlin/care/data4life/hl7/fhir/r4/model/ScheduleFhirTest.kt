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
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ScheduleTest.java
 *
 * A container for slots of time that may be available for booking appointments
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ScheduleFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testSchedule01() {
        // Given
        val sourceJson = loadAsString("r4/schedule-provider-location1-example.json")

        // When
        val data = parser.toFhir(Schedule::class, sourceJson)

        // Then
        assertSchedule01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSchedule01Step01(data: Schedule) {
        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Dr. Beverly Crusher",
            actual = data.actor?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.actor?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USS Enterprise-D Sickbay",
            actual = data.actor?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/3",
            actual = data.actor?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The slots attached to this schedule are for genetic counselling in the USS Enterprise-D Sickbay.",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "exampleloc1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/scheduleid",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "46",
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
            expected = "2017-12-25T09:30:00Z",
            actual = data.planningHorizon?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-12-25T09:15:00Z",
            actual = data.planningHorizon?.start?.value.toString()
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
            expected = "75",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Genetic Counselling",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "394580004",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical genetics",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testSchedule02() {
        // Given
        val sourceJson = loadAsString("r4/schedule-example.json")

        // When
        val data = parser.toFhir(Schedule::class, sourceJson)

        // Then
        assertSchedule02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSchedule02Step01(data: Schedule) {
        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Burgers UMC, South Wing, second floor",
            actual = data.actor?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.actor?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The slots attached to this schedule should be specialized to cover immunizations within the clinic",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/scheduleid",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "45",
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
            expected = "2013-12-25T09:30:00Z",
            actual = data.planningHorizon?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-12-25T09:15:00Z",
            actual = data.planningHorizon?.start?.value.toString()
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testSchedule03() {
        // Given
        val sourceJson = loadAsString("r4/schedule-provider-location2-example.json")

        // When
        val data = parser.toFhir(Schedule::class, sourceJson)

        // Then
        assertSchedule03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSchedule03Step01(data: Schedule) {
        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Dr. Beverly Crusher",
            actual = data.actor?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.actor?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Starfleet HQ Sickbay",
            actual = data.actor?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/2",
            actual = data.actor?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The slots attached to this schedule are for neurosurgery operations at Starfleet HQ only.",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "exampleloc2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/scheduleid",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "47",
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
            expected = "2017-12-25T09:30:00Z",
            actual = data.planningHorizon?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-12-25T09:15:00Z",
            actual = data.planningHorizon?.start?.value.toString()
        )

        assertEquals(
            expected = "31",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specialist Surgical",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "221",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Surgery - General",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "394610002",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Surgery-Neurosurgery",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
