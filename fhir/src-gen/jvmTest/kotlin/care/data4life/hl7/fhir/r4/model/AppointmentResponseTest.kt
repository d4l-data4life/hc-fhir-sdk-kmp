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
import care.data4life.hl7.fhir.r4.codesystem.ParticipationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * AppointmentResponseTest.java
 *
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AppointmentResponseTest {

    val parser = FhirR4Parser()

    @Test
    fun testAppointmentResponse01() {
        // Given
        val sourceJson = loadAsString("r4/appointmentresponse-example-req.json")

        // When
        val data = parser.toFhir(AppointmentResponse::class, sourceJson)

        // Then
        assertEquals(
            "Dr Adam Careful",
            data.actor?.display
        )
        assertEquals(
            "Practitioner/example",
            data.actor?.reference
        )
        assertEquals(
            "Brian MRI results discussion",
            data.appointment?.display
        )
        assertEquals(
            "Appointment/examplereq",
            data.appointment?.reference
        )
        assertEquals(
            "can't we try for this time, can't do mornings",
            data.comment
        )
        assertEquals(
            "2013-12-25T13:30:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "exampleresp",
            data.id
        )
        assertEquals(
            "http://example.org/sampleappointmentresponse-identifier",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "response123",
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
            ParticipationStatus.TENTATIVE,
            data.participantStatus
        )
        assertEquals(
            "ATND",
            data.participantType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            data.participantType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2013-12-25T13:15:00Z",
            data.start?.value.toString()
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Accept Brian MRI results discussion</div>",
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
    fun testAppointmentResponse02() {
        // Given
        val sourceJson = loadAsString("r4/appointmentresponse-example.json")

        // When
        val data = parser.toFhir(AppointmentResponse::class, sourceJson)

        // Then
        assertEquals(
            "Peter James Chalmers",
            data.actor?.display
        )
        assertEquals(
            "Patient/example",
            data.actor?.reference
        )
        assertEquals(
            "Brian MRI results discussion",
            data.appointment?.display
        )
        assertEquals(
            "Appointment/example",
            data.appointment?.reference
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
            ParticipationStatus.ACCEPTED,
            data.participantStatus
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Accept Brian MRI results discussion</div>",
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
