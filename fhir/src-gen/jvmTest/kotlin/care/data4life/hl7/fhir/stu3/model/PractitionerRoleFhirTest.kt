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
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointUse
import care.data4life.hl7.fhir.stu3.codesystem.DaysOfWeek
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * PractitionerRoleTest.java
 *
 * Roles/organizations the practitioner is associated with
 *
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an
 * organization for a period of time.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PractitionerRoleFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testPractitionerRole01() {
        // Given
        val sourceJson = loadAsString("stu3/practitionerrole-example.json")

        // When
        val data = parser.toFhir(PractitionerRole::class, sourceJson)

        // Then
        assertPractitionerRole01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitionerRole01Step01(data: PractitionerRole) {
        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Adam is generally unavailable on public holidays and during the Christmas/New Year break",
            actual = data.availabilityExceptions
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "16:30:00",
            actual = data.availableTime?.get(0)?.availableEndTime?.value.toString()
        )

        assertEquals(
            expected = "09:00:00",
            actual = data.availableTime?.get(0)?.availableStartTime?.value.toString()
        )

        assertEquals(
            expected = DaysOfWeek.MON,
            actual = data.availableTime?.get(0)?.daysOfWeek?.get(0)
        )

        assertEquals(
            expected = DaysOfWeek.TUE,
            actual = data.availableTime?.get(0)?.daysOfWeek?.get(1)
        )

        assertEquals(
            expected = DaysOfWeek.WED,
            actual = data.availableTime?.get(0)?.daysOfWeek?.get(2)
        )

        assertEquals(
            expected = "12:00:00",
            actual = data.availableTime?.get(1)?.availableEndTime?.value.toString()
        )

        assertEquals(
            expected = "09:00:00",
            actual = data.availableTime?.get(1)?.availableStartTime?.value.toString()
        )

        assertEquals(
            expected = DaysOfWeek.THU,
            actual = data.availableTime?.get(1)?.daysOfWeek?.get(0)
        )

        assertEquals(
            expected = DaysOfWeek.FRI,
            actual = data.availableTime?.get(1)?.daysOfWeek?.get(1)
        )

        assertEquals(
            expected = "RP",
            actual = data.code?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0286",
            actual = data.code?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example",
            actual = data.endpoint?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HealthcareService/example",
            actual = data.healthcareService?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org/practitioners",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "23",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "South Wing, second floor",
            actual = data.location?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adam will be on extended leave during May 2017",
            actual = data.notAvailable?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-05-20",
            actual = data.notAvailable?.get(0)?.during?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-05-01",
            actual = data.notAvailable?.get(0)?.during?.start?.value.toString()
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-03-31",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2012-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.practitioner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.practitioner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "408443003",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General medical practice",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.specialty?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "(03) 5555 6473",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "adam.southern@example.org",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
