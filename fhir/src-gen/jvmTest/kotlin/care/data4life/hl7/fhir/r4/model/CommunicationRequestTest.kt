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
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CommunicationRequestTest.java
 *
 * A request for information to be sent to a receiver
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible
 * provider, the CDS system proposes that the public health agency be notified about a reportable
 * condition.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CommunicationRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testCommunicationRequest01() {
        // Given
        val sourceJson = loadAsString("r4/communicationrequest-example.json")

        // When
        val data = parser.toFhir(CommunicationRequest::class, sourceJson)

        // Then
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
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
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">To be filled out at a later time</div>",
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
    fun testCommunicationRequest02() {
        // Given
        val sourceJson = loadAsString("r4/communicationrequest-example-fm-solicit-attachment.json")

        // When
        val data = parser.toFhir(CommunicationRequest::class, sourceJson)

        // Then
        assertEquals(
            "2016-06-10T11:01:10-08:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "EligibilityRequest",
            data.basedOn?.get(0)?.display
        )
        assertEquals(
            "SolicitedAttachmentRequest",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://acme.org/messagetypes",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "provider",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "payor",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "requester",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "12345",
            data.groupIdentifier?.value
        )
        assertEquals(
            "fm-solicit",
            data.id
        )
        assertEquals(
            "http://www.jurisdiction.com/insurer/123456",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "ABC123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "WRITTEN",
            data.medium?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "written",
            data.medium?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationMode",
            data.medium?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "written",
            data.medium?.get(0)?.text
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
            "2016-06-10T11:01:10-08:00",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Please provide the accident report and any associated pictures to support your Claim# DEF5647.",
            data.payload?.get(0)?.contentString
        )
        assertEquals(
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            "#provider",
            data.recipient?.get(0)?.reference
        )
        assertEquals(
            "prior CommunicationRequest",
            data.replaces?.get(0)?.display
        )
        assertEquals(
            "#requester",
            data.requester?.reference
        )
        assertEquals(
            "#payor",
            data.sender?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Request for Accident Report</div>",
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
