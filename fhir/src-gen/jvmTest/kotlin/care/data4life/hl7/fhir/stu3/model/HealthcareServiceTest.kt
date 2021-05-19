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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * HealthcareServiceTest.java
 *
 * The details of a healthcare service available at a location
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class HealthcareServiceTest {

    val parser = FhirStu3Parser()

    @Test
    fun testHealthcareService01() {
        // Given
        val sourceJson = loadAsString("stu3/healthcareservice-example.json")

        // When
        val data = parser.toFhir(HealthcareService::class, sourceJson)

        // Then
        assertHealthcareService01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertHealthcareService01Step01(data: HealthcareService) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.appointmentRequired?.value
        )

        assertEquals(
            expected = "Reduced capacity is available during the Christmas period",
            actual = data.availabilityExceptions
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.availableTime?.get(0)?.allDay?.value
        )

        assertEquals(
            expected = DaysOfWeek.WED,
            actual = data.availableTime?.get(0)?.daysOfWeek?.get(0)
        )

        assertEquals(
            expected = "05:30:00",
            actual = data.availableTime?.get(1)?.availableEndTime?.value.toString()
        )

        assertEquals(
            expected = "08:30:00",
            actual = data.availableTime?.get(1)?.availableStartTime?.value.toString()
        )

        assertEquals(
            expected = DaysOfWeek.MON,
            actual = data.availableTime?.get(1)?.daysOfWeek?.get(0)
        )

        assertEquals(
            expected = DaysOfWeek.TUE,
            actual = data.availableTime?.get(1)?.daysOfWeek?.get(1)
        )

        assertEquals(
            expected = DaysOfWeek.THU,
            actual = data.availableTime?.get(1)?.daysOfWeek?.get(2)
        )

        assertEquals(
            expected = DaysOfWeek.FRI,
            actual = data.availableTime?.get(1)?.daysOfWeek?.get(3)
        )

        assertEquals(
            expected = "04:30:00",
            actual = data.availableTime?.get(2)?.availableEndTime?.value.toString()
        )

        assertEquals(
            expected = "09:30:00",
            actual = data.availableTime?.get(2)?.availableStartTime?.value.toString()
        )

        assertEquals(
            expected = DaysOfWeek.SAT,
            actual = data.availableTime?.get(2)?.daysOfWeek?.get(0)
        )

        assertEquals(
            expected = DaysOfWeek.FRI,
            actual = data.availableTime?.get(2)?.daysOfWeek?.get(1)
        )

        assertEquals(
            expected = "8",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Counselling",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/service-category",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Counselling",
            actual = data.category?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Wheelchair access",
            actual = data.characteristic?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Providing Specialist psychology services to the greater Den Burg area, many years of experience dealing with PTSD issues",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DenBurg",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Greater Denburg area",
            actual = data.coverageArea?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#DenBurg",
            actual = data.coverageArea?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DVA Required",
            actual = data.eligibility?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Evidence of application for DVA status may be sufficient for commencing assessment",
            actual = data.eligibilityNote
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example",
            actual = data.endpoint?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/shared-ids",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HS-12",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Consulting psychologists and/or psychology services",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Christmas/Boxing Day",
            actual = data.notAvailable?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-12-26",
            actual = data.notAvailable?.get(0)?.during?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-12-25",
            actual = data.notAvailable?.get(0)?.during?.start?.value.toString()
        )

        assertEquals(
            expected = "New Years Day",
            actual = data.notAvailable?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.notAvailable?.get(1)?.during?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.notAvailable?.get(1)?.during?.start?.value.toString()
        )

        assertEquals(
            expected = "PTSD outreach",
            actual = data.programName?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Burgers University Medical Center",
            actual = data.providedBy?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.providedBy?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "phone",
            actual = data.referralMethod?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Phone",
            actual = data.referralMethod?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fax",
            actual = data.referralMethod?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fax",
            actual = data.referralMethod?.get(1)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "elec",
            actual = data.referralMethod?.get(2)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Secure Messaging",
            actual = data.referralMethod?.get(2)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "semail",
            actual = data.referralMethod?.get(3)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Secure Email",
            actual = data.referralMethod?.get(3)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cost",
            actual = data.serviceProvisionCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fees apply",
            actual = data.serviceProvisionCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/service-provision-conditions",
            actual = data.serviceProvisionCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "47505003",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Posttraumatic stress disorder",
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
            expected = "(555) silent",
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
            expected = "directaddress@example.com",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "394913002",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Psychotherapy",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "394587001",
            actual = data.type?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Psychiatry",
            actual = data.type?.get(1)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
