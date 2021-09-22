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
class AppointmentFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testAppointment01() {
        // Given
        val sourceJson = loadAsString("r4/appointment-example.json")

        // When
        val data = parser.toFhir(Appointment::class, sourceJson)

        // Then
        assertAppointment01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAppointment01Step01(data: Appointment) {

        assertEquals(
            expected = "FOLLOWUP",
            actual = data.appointmentType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A follow up visit from a previous appointment",
            actual = data.appointmentType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0276",
            actual = data.appointmentType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ServiceRequest/myringotomy",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Further expand on the results of the MRI and determine the next actions that may be appropriate.",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-10-10",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Discussion on the results of your recent MRI",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-10T11:00:00Z",
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
            expected = "Peter James Chalmers",
            actual = data.participant?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.participant?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(0)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(0)?.status
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.participant?.get(1)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.participant?.get(1)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(1)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(1)?.status
        )

        assertEquals(
            expected = "ATND",
            actual = data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "South Wing, second floor",
            actual = data.participant?.get(2)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.participant?.get(2)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(2)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(2)?.status
        )

        assertEquals(
            expected = "5".toLong(),
            actual = data.priority?.value
        )

        assertEquals(
            expected = "Severe burn of left ear",
            actual = data.reasonReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/example",
            actual = data.reasonReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "gp",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Practice",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/service-category",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Discussion",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "394814009",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General practice",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.specialty?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-10T09:00:00Z",
            actual = data.start?.value.toString()
        )

        assertEquals(
            expected = AppointmentStatus.BOOKED,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Brian MRI results discussion</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testAppointment02() {
        // Given
        val sourceJson = loadAsString("r4/appointment-example-request.json")

        // When
        val data = parser.toFhir(Appointment::class, sourceJson)

        // Then
        assertAppointment02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAppointment02Step01(data: Appointment) {

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
            expected = "Further expand on the results of the MRI and determine the next actions that may be appropriate.",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-12-02",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Discussion on the results of your recent MRI",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "examplereq",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/sampleappointment-identifier",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
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
            expected = "15".toLong(),
            actual = data.minutesDuration?.value
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.participant?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.participant?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(0)?.required
        )

        assertEquals(
            expected = ParticipationStatus.NEEDS_ACTION,
            actual = data.participant?.get(0)?.status
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(1)?.required
        )

        assertEquals(
            expected = ParticipationStatus.NEEDS_ACTION,
            actual = data.participant?.get(1)?.status
        )

        assertEquals(
            expected = "ATND",
            actual = data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.participant?.get(1)?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "South Wing, second floor",
            actual = data.participant?.get(2)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.participant?.get(2)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(2)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(2)?.status
        )

        assertEquals(
            expected = "5".toLong(),
            actual = data.priority?.value
        )

        assertEquals(
            expected = "413095006",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical Review",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-09",
            actual = data.requestedPeriod?.get(0)?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-06-02",
            actual = data.requestedPeriod?.get(0)?.start?.value.toString()
        )

        assertEquals(
            expected = "gp",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Practice",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/service-category",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Slot/example",
            actual = data.slot?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "394814009",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General practice",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.specialty?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AppointmentStatus.PROPOSED,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Brian MRI results discussion</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testAppointment03() {
        // Given
        val sourceJson = loadAsString("r4/appointment-example2doctors.json")

        // When
        val data = parser.toFhir(Appointment::class, sourceJson)

        // Then
        assertAppointment03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAppointment03Step01(data: Appointment) {

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
            expected = "Clarify the results of the MRI to ensure context of test was correct",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Discussion about Peter Chalmers MRI results",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-09T11:00:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "2docs",
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
            expected = "Peter James Chalmers",
            actual = data.participant?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.participant?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.INFORMATION_ONLY,
            actual = data.participant?.get(0)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(0)?.status
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.participant?.get(1)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.participant?.get(1)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(1)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(1)?.status
        )

        assertEquals(
            expected = "Luigi Maas",
            actual = data.participant?.get(2)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f202",
            actual = data.participant?.get(2)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.REQUIRED,
            actual = data.participant?.get(2)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(2)?.status
        )

        assertEquals(
            expected = "Phone Call",
            actual = data.participant?.get(3)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipantRequired.INFORMATION_ONLY,
            actual = data.participant?.get(3)?.required
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participant?.get(3)?.status
        )

        assertEquals(
            expected = "5".toLong(),
            actual = data.priority?.value
        )

        assertEquals(
            expected = "gp",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Practice",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/service-category",
            actual = data.serviceCategory?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Discussion",
            actual = data.serviceType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "394814009",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General practice",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.specialty?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-09T09:00:00Z",
            actual = data.start?.value.toString()
        )

        assertEquals(
            expected = AppointmentStatus.BOOKED,
            actual = data.status
        )

        assertEquals(
            expected = "DiagnosticReport/ultrasound",
            actual = data.supportingInformation?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Brian MRI results discussion</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
