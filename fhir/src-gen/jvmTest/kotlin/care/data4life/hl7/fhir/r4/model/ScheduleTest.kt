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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ScheduleTest.java
 *
 * A container for slots of time that may be available for booking appointments
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ScheduleTest {

    val parser = FhirR4Parser()

    @Test
    fun testSchedule01() {
        // Given
        val sourceJson = loadAsString("r4/schedule-provider-location1-example.json")

        // When
        val data = parser.toFhir(Schedule::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Dr. Beverly Crusher",
            data.actor?.get(0)?.display
        )
        assertEquals(
            "Practitioner/1",
            data.actor?.get(0)?.reference
        )
        assertEquals(
            "USS Enterprise-D Sickbay",
            data.actor?.get(1)?.display
        )
        assertEquals(
            "Location/3",
            data.actor?.get(1)?.reference
        )
        assertEquals(
            "The slots attached to this schedule are for genetic counselling in the USS Enterprise-D Sickbay.",
            data.comment
        )
        assertEquals(
            "exampleloc1",
            data.id
        )
        assertEquals(
            "http://example.org/scheduleid",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "46",
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
            "2017-12-25T09:30:00Z",
            data.planningHorizon?.end?.value.toString()
        )
        assertEquals(
            "2017-12-25T09:15:00Z",
            data.planningHorizon?.start?.value.toString()
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
            "75",
            data.serviceType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Genetic Counselling",
            data.serviceType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "394580004",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Clinical genetics",
            data.specialty?.get(0)?.coding?.get(0)?.display
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
    fun testSchedule02() {
        // Given
        val sourceJson = loadAsString("r4/schedule-example.json")

        // When
        val data = parser.toFhir(Schedule::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Burgers UMC, South Wing, second floor",
            data.actor?.get(0)?.display
        )
        assertEquals(
            "Location/1",
            data.actor?.get(0)?.reference
        )
        assertEquals(
            "The slots attached to this schedule should be specialized to cover immunizations within the clinic",
            data.comment
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://example.org/scheduleid",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "45",
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
            "2013-12-25T09:30:00Z",
            data.planningHorizon?.end?.value.toString()
        )
        assertEquals(
            "2013-12-25T09:15:00Z",
            data.planningHorizon?.start?.value.toString()
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSchedule03() {
        // Given
        val sourceJson = loadAsString("r4/schedule-provider-location2-example.json")

        // When
        val data = parser.toFhir(Schedule::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Dr. Beverly Crusher",
            data.actor?.get(0)?.display
        )
        assertEquals(
            "Practitioner/1",
            data.actor?.get(0)?.reference
        )
        assertEquals(
            "Starfleet HQ Sickbay",
            data.actor?.get(1)?.display
        )
        assertEquals(
            "Location/2",
            data.actor?.get(1)?.reference
        )
        assertEquals(
            "The slots attached to this schedule are for neurosurgery operations at Starfleet HQ only.",
            data.comment
        )
        assertEquals(
            "exampleloc2",
            data.id
        )
        assertEquals(
            "http://example.org/scheduleid",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "47",
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
            "2017-12-25T09:30:00Z",
            data.planningHorizon?.end?.value.toString()
        )
        assertEquals(
            "2017-12-25T09:15:00Z",
            data.planningHorizon?.start?.value.toString()
        )
        assertEquals(
            "31",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Specialist Surgical",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "221",
            data.serviceType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Surgery - General",
            data.serviceType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "394610002",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Surgery-Neurosurgery",
            data.specialty?.get(0)?.coding?.get(0)?.display
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
