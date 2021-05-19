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
import care.data4life.hl7.fhir.r4.codesystem.AppointmentStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.ParticipantRequired
import care.data4life.hl7.fhir.r4.codesystem.ParticipationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * AppointmentTest.java
 *
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AppointmentTest {

    val parser = FhirR4Parser()

    @Test
    fun testAppointment01() {
        // Given
        val sourceJson = loadAsString("r4/appointment-example.json")

        // When
        val data = parser.toFhir(Appointment::class, sourceJson)

        // Then
        assertEquals(
            "FOLLOWUP",
            data.appointmentType?.coding?.get(0)?.code
        )
        assertEquals(
            "A follow up visit from a previous appointment",
            data.appointmentType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0276",
            data.appointmentType?.coding?.get(0)?.system
        )
        assertEquals(
            "ServiceRequest/myringotomy",
            data.basedOn?.get(0)?.reference
        )
        assertEquals(
            "Further expand on the results of the MRI and determine the next actions that may be appropriate.",
            data.comment
        )
        assertEquals(
            "2013-10-10",
            data.created?.value.toString()
        )
        assertEquals(
            "Discussion on the results of your recent MRI",
            data.description
        )
        assertEquals(
            "2013-12-10T11:00:00Z",
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
            "Peter James Chalmers",
            data.participant?.get(0)?.actor?.display
        )
        assertEquals(
            "Patient/example",
            data.participant?.get(0)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(0)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(0)?.status
        )
        assertEquals(
            "Dr Adam Careful",
            data.participant?.get(1)?.actor?.display
        )
        assertEquals(
            "Practitioner/example",
            data.participant?.get(1)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(1)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(1)?.status
        )
        assertEquals(
            "ATND",
            data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "South Wing, second floor",
            data.participant?.get(2)?.actor?.display
        )
        assertEquals(
            "Location/1",
            data.participant?.get(2)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(2)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(2)?.status
        )
        assertEquals(
            "5".toLong(),
            data.priority?.value
        )
        assertEquals(
            "Severe burn of left ear",
            data.reasonReference?.get(0)?.display
        )
        assertEquals(
            "Condition/example",
            data.reasonReference?.get(0)?.reference
        )
        assertEquals(
            "gp",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Practice",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/service-category",
            data.serviceCategory?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "52",
            data.serviceType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Discussion",
            data.serviceType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "394814009",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General practice",
            data.specialty?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.specialty?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2013-12-10T09:00:00Z",
            data.start?.value.toString()
        )
        assertEquals(
            AppointmentStatus.BOOKED,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Brian MRI results discussion</div>",
            data.text?.div
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
    fun testAppointment02() {
        // Given
        val sourceJson = loadAsString("r4/appointment-example-request.json")

        // When
        val data = parser.toFhir(Appointment::class, sourceJson)

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
            "Further expand on the results of the MRI and determine the next actions that may be appropriate.",
            data.comment
        )
        assertEquals(
            "2015-12-02",
            data.created?.value.toString()
        )
        assertEquals(
            "Discussion on the results of your recent MRI",
            data.description
        )
        assertEquals(
            "examplereq",
            data.id
        )
        assertEquals(
            "http://example.org/sampleappointment-identifier",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
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
            "15".toLong(),
            data.minutesDuration?.value
        )
        assertEquals(
            "Peter James Chalmers",
            data.participant?.get(0)?.actor?.display
        )
        assertEquals(
            "Patient/example",
            data.participant?.get(0)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(0)?.required
        )
        assertEquals(
            ParticipationStatus.NEEDS_ACTION,
            data.participant?.get(0)?.status
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(1)?.required
        )
        assertEquals(
            ParticipationStatus.NEEDS_ACTION,
            data.participant?.get(1)?.status
        )
        assertEquals(
            "ATND",
            data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "South Wing, second floor",
            data.participant?.get(2)?.actor?.display
        )
        assertEquals(
            "Location/1",
            data.participant?.get(2)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(2)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(2)?.status
        )
        assertEquals(
            "5".toLong(),
            data.priority?.value
        )
        assertEquals(
            "413095006",
            data.reasonCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.reasonCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Clinical Review",
            data.reasonCode?.get(0)?.text
        )
        assertEquals(
            "2016-06-09",
            data.requestedPeriod?.get(0)?.end?.value.toString()
        )
        assertEquals(
            "2016-06-02",
            data.requestedPeriod?.get(0)?.start?.value.toString()
        )
        assertEquals(
            "gp",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Practice",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/service-category",
            data.serviceCategory?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Slot/example",
            data.slot?.get(0)?.reference
        )
        assertEquals(
            "394814009",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General practice",
            data.specialty?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.specialty?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            AppointmentStatus.PROPOSED,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Brian MRI results discussion</div>",
            data.text?.div
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
    fun testAppointment03() {
        // Given
        val sourceJson = loadAsString("r4/appointment-example2doctors.json")

        // When
        val data = parser.toFhir(Appointment::class, sourceJson)

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
            "Clarify the results of the MRI to ensure context of test was correct",
            data.comment
        )
        assertEquals(
            "Discussion about Peter Chalmers MRI results",
            data.description
        )
        assertEquals(
            "2013-12-09T11:00:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "2docs",
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
            "Peter James Chalmers",
            data.participant?.get(0)?.actor?.display
        )
        assertEquals(
            "Patient/example",
            data.participant?.get(0)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.INFORMATION_ONLY,
            data.participant?.get(0)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(0)?.status
        )
        assertEquals(
            "Dr Adam Careful",
            data.participant?.get(1)?.actor?.display
        )
        assertEquals(
            "Practitioner/example",
            data.participant?.get(1)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(1)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(1)?.status
        )
        assertEquals(
            "Luigi Maas",
            data.participant?.get(2)?.actor?.display
        )
        assertEquals(
            "Practitioner/f202",
            data.participant?.get(2)?.actor?.reference
        )
        assertEquals(
            ParticipantRequired.REQUIRED,
            data.participant?.get(2)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(2)?.status
        )
        assertEquals(
            "Phone Call",
            data.participant?.get(3)?.actor?.display
        )
        assertEquals(
            ParticipantRequired.INFORMATION_ONLY,
            data.participant?.get(3)?.required
        )
        assertEquals(
            ParticipationStatus.ACCEPTED,
            data.participant?.get(3)?.status
        )
        assertEquals(
            "5".toLong(),
            data.priority?.value
        )
        assertEquals(
            "gp",
            data.serviceCategory?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Practice",
            data.serviceCategory?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/service-category",
            data.serviceCategory?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "52",
            data.serviceType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General Discussion",
            data.serviceType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "394814009",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General practice",
            data.specialty?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.specialty?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2013-12-09T09:00:00Z",
            data.start?.value.toString()
        )
        assertEquals(
            AppointmentStatus.BOOKED,
            data.status
        )
        assertEquals(
            "DiagnosticReport/ultrasound",
            data.supportingInformation?.get(0)?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Brian MRI results discussion</div>",
            data.text?.div
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
