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
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.ParticipationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * AppointmentResponseTest.java
 *
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AppointmentResponseTest {

    val parser = FhirStu3Parser()

    @Test
    fun testAppointmentResponse01() {
        // Given
        val sourceJson = loadAsString("stu3/appointmentresponse-example-req.json")

        // When
        val data = parser.toFhir(AppointmentResponse::class, sourceJson)

        // Then
        assertAppointmentResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAppointmentResponse01Step01(data: AppointmentResponse) {

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Brian MRI results discussion",
            actual = data.appointment?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Appointment/examplereq",
            actual = data.appointment?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "can't we try for this time, can't do mornings",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T13:30:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "exampleresp",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/sampleappointmentresponse-identifier",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "response123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipationStatus.TENTATIVE,
            actual = data.participantStatus
        )

        assertEquals(
            expected = "ATND",
            actual = data.participantType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ParticipationType",
            actual = data.participantType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-12-25T13:15:00Z",
            actual = data.start?.value.toString()
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Accept Brian MRI results discussion</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testAppointmentResponse02() {
        // Given
        val sourceJson = loadAsString("stu3/appointmentresponse-example.json")

        // When
        val data = parser.toFhir(AppointmentResponse::class, sourceJson)

        // Then
        assertAppointmentResponse02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAppointmentResponse02Step01(data: AppointmentResponse) {

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Brian MRI results discussion",
            actual = data.appointment?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Appointment/example",
            actual = data.appointment?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ParticipationStatus.ACCEPTED,
            actual = data.participantStatus
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Accept Brian MRI results discussion</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
