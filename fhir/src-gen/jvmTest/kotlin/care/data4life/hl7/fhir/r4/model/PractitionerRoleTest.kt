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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.ContactPointUse
import care.data4life.hl7.fhir.r4.codesystem.DaysOfWeek
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * PractitionerRoleTest.java
 *
 * Roles/organizations the practitioner is associated with
 *
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an
 * organization for a period of time.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PractitionerRoleTest {

    val parser = FhirR4Parser()

    @Test
    fun testPractitionerRole01() {
        // Given
        val sourceJson = loadAsString("r4/practitionerrole-example.json")

        // When
        val data = parser.toFhir(PractitionerRole::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Adam is generally unavailable on public holidays and during the Christmas/New Year break",
            data.availabilityExceptions
        )
        assertEquals(
            "16:30:00",
            data.availableTime?.get(0)?.availableEndTime?.value.toString()
        )
        assertEquals(
            "09:00:00",
            data.availableTime?.get(0)?.availableStartTime?.value.toString()
        )
        assertEquals(
            DaysOfWeek.MON,
            data.availableTime?.get(0)?.daysOfWeek?.get(0)
        )
        assertEquals(
            DaysOfWeek.TUE,
            data.availableTime?.get(0)?.daysOfWeek?.get(1)
        )
        assertEquals(
            DaysOfWeek.WED,
            data.availableTime?.get(0)?.daysOfWeek?.get(2)
        )
        assertEquals(
            "12:00:00",
            data.availableTime?.get(1)?.availableEndTime?.value.toString()
        )
        assertEquals(
            "09:00:00",
            data.availableTime?.get(1)?.availableStartTime?.value.toString()
        )
        assertEquals(
            DaysOfWeek.THU,
            data.availableTime?.get(1)?.daysOfWeek?.get(0)
        )
        assertEquals(
            DaysOfWeek.FRI,
            data.availableTime?.get(1)?.daysOfWeek?.get(1)
        )
        assertEquals(
            "RP",
            data.code?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0286",
            data.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Endpoint/example",
            data.endpoint?.get(0)?.reference
        )
        assertEquals(
            "HealthcareService/example",
            data.healthcareService?.get(0)?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://www.acme.org/practitioners",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "23",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "South Wing, second floor",
            data.location?.get(0)?.display
        )
        assertEquals(
            "Location/1",
            data.location?.get(0)?.reference
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
            "Adam will be on extended leave during May 2017",
            data.notAvailable?.get(0)?.description
        )
        assertEquals(
            "2017-05-20",
            data.notAvailable?.get(0)?.during?.end?.value.toString()
        )
        assertEquals(
            "2017-05-01",
            data.notAvailable?.get(0)?.during?.start?.value.toString()
        )
        assertEquals(
            "Organization/f001",
            data.organization?.reference
        )
        assertEquals(
            "2012-03-31",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2012-01-01",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "Dr Adam Careful",
            data.practitioner?.display
        )
        assertEquals(
            "Practitioner/example",
            data.practitioner?.reference
        )
        assertEquals(
            "408443003",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General medical practice",
            data.specialty?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.specialty?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.telecom?.get(0)?.use
        )
        assertEquals(
            "(03) 5555 6473",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.telecom?.get(1)?.use
        )
        assertEquals(
            "adam.southern@example.org",
            data.telecom?.get(1)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
