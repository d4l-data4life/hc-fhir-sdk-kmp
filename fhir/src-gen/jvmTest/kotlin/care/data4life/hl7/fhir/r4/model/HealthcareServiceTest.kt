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
 * HealthcareServiceTest.java
 *
 * The details of a healthcare service available at a location
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class HealthcareServiceTest {

    val parser = FhirR4Parser()

    @Test
    fun testHealthcareService01() {
        // Given
        val sourceJson = loadAsString("r4/healthcareservice-example.json")

        // When
        val data = parser.toFhir(HealthcareService::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "False".toBoolean(),
            data.appointmentRequired?.value
        )
        assertEquals(
            "Reduced capacity is available during the Christmas period",
            data.availabilityExceptions
        )
        assertEquals(
            "True".toBoolean(),
            data.availableTime?.get(0)?.allDay?.value
        )
        assertEquals(
            DaysOfWeek.WED,
            data.availableTime?.get(0)?.daysOfWeek?.get(0)
        )
        assertEquals(
            "05:30:00",
            data.availableTime?.get(1)?.availableEndTime?.value.toString()
        )
        assertEquals(
            "08:30:00",
            data.availableTime?.get(1)?.availableStartTime?.value.toString()
        )
        assertEquals(
            DaysOfWeek.MON,
            data.availableTime?.get(1)?.daysOfWeek?.get(0)
        )
        assertEquals(
            DaysOfWeek.TUE,
            data.availableTime?.get(1)?.daysOfWeek?.get(1)
        )
        assertEquals(
            DaysOfWeek.THU,
            data.availableTime?.get(1)?.daysOfWeek?.get(2)
        )
        assertEquals(
            DaysOfWeek.FRI,
            data.availableTime?.get(1)?.daysOfWeek?.get(3)
        )
        assertEquals(
            "04:30:00",
            data.availableTime?.get(2)?.availableEndTime?.value.toString()
        )
        assertEquals(
            "09:30:00",
            data.availableTime?.get(2)?.availableStartTime?.value.toString()
        )
        assertEquals(
            DaysOfWeek.SAT,
            data.availableTime?.get(2)?.daysOfWeek?.get(0)
        )
        assertEquals(
            DaysOfWeek.FRI,
            data.availableTime?.get(2)?.daysOfWeek?.get(1)
        )
        assertEquals(
            "8",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Counselling",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/service-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Counselling",
            data.category?.get(0)?.text
        )
        assertEquals(
            "Wheelchair access",
            data.characteristic?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "Providing Specialist psychology services to the greater Den Burg area, many years of experience dealing with PTSD issues",
            data.comment
        )
        assertEquals(
            "DenBurg",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "Greater Denburg area",
            data.coverageArea?.get(0)?.display
        )
        assertEquals(
            "#DenBurg",
            data.coverageArea?.get(0)?.reference
        )
        assertEquals(
            "DVA Required",
            data.eligibility?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "Evidence of application for DVA status may be sufficient for commencing assessment",
            data.eligibility?.get(0)?.comment
        )
        assertEquals(
            "Endpoint/example",
            data.endpoint?.get(0)?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://example.org/shared-ids",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "HS-12",
            data.identifier?.get(0)?.value
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
            "Consulting psychologists and/or psychology services",
            data.name
        )
        assertEquals(
            "Christmas/Boxing Day",
            data.notAvailable?.get(0)?.description
        )
        assertEquals(
            "2015-12-26",
            data.notAvailable?.get(0)?.during?.end?.value.toString()
        )
        assertEquals(
            "2015-12-25",
            data.notAvailable?.get(0)?.during?.start?.value.toString()
        )
        assertEquals(
            "New Years Day",
            data.notAvailable?.get(1)?.description
        )
        assertEquals(
            "2016-01-01",
            data.notAvailable?.get(1)?.during?.end?.value.toString()
        )
        assertEquals(
            "2016-01-01",
            data.notAvailable?.get(1)?.during?.start?.value.toString()
        )
        assertEquals(
            "PTSD outreach",
            data.program?.get(0)?.text
        )
        assertEquals(
            "Burgers University Medical Center",
            data.providedBy?.display
        )
        assertEquals(
            "Organization/f001",
            data.providedBy?.reference
        )
        assertEquals(
            "phone",
            data.referralMethod?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Phone",
            data.referralMethod?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "fax",
            data.referralMethod?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "Fax",
            data.referralMethod?.get(1)?.coding?.get(0)?.display
        )
        assertEquals(
            "elec",
            data.referralMethod?.get(2)?.coding?.get(0)?.code
        )
        assertEquals(
            "Secure Messaging",
            data.referralMethod?.get(2)?.coding?.get(0)?.display
        )
        assertEquals(
            "semail",
            data.referralMethod?.get(3)?.coding?.get(0)?.code
        )
        assertEquals(
            "Secure Email",
            data.referralMethod?.get(3)?.coding?.get(0)?.display
        )
        assertEquals(
            "cost",
            data.serviceProvisionCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Fees apply",
            data.serviceProvisionCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/service-provision-conditions",
            data.serviceProvisionCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "47505003",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Posttraumatic stress disorder",
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
            "(555) silent",
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
            "directaddress@example.com",
            data.telecom?.get(1)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "394913002",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Psychotherapy",
            data.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "394587001",
            data.type?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "Psychiatry",
            data.type?.get(1)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.type?.get(1)?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
