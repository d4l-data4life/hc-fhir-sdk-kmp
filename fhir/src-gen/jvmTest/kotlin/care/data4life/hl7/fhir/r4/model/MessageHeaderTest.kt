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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.ResponseType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MessageHeaderTest.java
 *
 * A resource that describes a message that is exchanged between systems
 *
 * The header for a message exchange that is either requesting or responding to an action. The
 * reference(s) that are the subject of the action as well as other information related to the action
 * are typically transmitted in a bundle in which the MessageHeader resource instance is the first
 * resource in the bundle.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MessageHeaderTest {

    val parser = FhirR4Parser()

    @Test
    fun testMessageHeader01() {
        // Given
        val sourceJson = loadAsString("r4/messageheader-example.json")

        // When
        val data = parser.toFhir(MessageHeader::class, sourceJson)

        // Then
        assertEquals(
            "Practitioner/example",
            data.author?.reference
        )
        assertEquals(
            "http:////acme.com/ehr/fhir/messagedefinition/patientrequest",
            data.definition
        )
        assertEquals(
            "llp:10.11.12.14:5432",
            data.destination?.get(0)?.endpoint
        )
        assertEquals(
            "Acme Message Gateway",
            data.destination?.get(0)?.name
        )
        assertEquals(
            "http://acme.com/ehr/fhir/Practitioner/2323-33-4",
            data.destination?.get(0)?.receiver?.reference
        )
        assertEquals(
            "Device/example",
            data.destination?.get(0)?.target?.reference
        )
        assertEquals(
            "Practitioner/example",
            data.enterer?.reference
        )
        assertEquals(
            "admin-notify",
            data.eventCoding?.code
        )
        assertEquals(
            "http://example.org/fhir/message-events",
            data.eventCoding?.system
        )
        assertEquals(
            "Patient/example",
            data.focus?.get(0)?.reference
        )
        assertEquals(
            "1cbdfb97-5859-48a4-8301-d54eab818d68",
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
            "admit",
            data.reason?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/message-reasons-encounter",
            data.reason?.coding?.get(0)?.system
        )
        assertEquals(
            ResponseType.OK,
            data.response?.code
        )
        assertEquals(
            "5015fe84-8e76-4526-89d8-44b322e8d4fb",
            data.response?.identifier
        )
        assertEquals(
            "Organization/1",
            data.sender?.reference
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.source?.contact?.system
        )
        assertEquals(
            "+1 (555) 123 4567",
            data.source?.contact?.value
        )
        assertEquals(
            "llp:10.11.12.13:5432",
            data.source?.endpoint
        )
        assertEquals(
            "Acme Central Patient Registry",
            data.source?.name
        )
        assertEquals(
            "FooBar Patient Manager",
            data.source?.software
        )
        assertEquals(
            "3.1.45.AABB",
            data.source?.version
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
