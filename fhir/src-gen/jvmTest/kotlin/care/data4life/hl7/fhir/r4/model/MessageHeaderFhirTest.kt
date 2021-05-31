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
class MessageHeaderFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMessageHeader01() {
        // Given
        val sourceJson = loadAsString("r4/messageheader-example.json")

        // When
        val data = parser.toFhir(MessageHeader::class, sourceJson)

        // Then
        assertMessageHeader01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMessageHeader01Step01(data: MessageHeader) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:////acme.com/ehr/fhir/messagedefinition/patientrequest",
            actual = data.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "llp:10.11.12.14:5432",
            actual = data.destination?.get(0)?.endpoint
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Message Gateway",
            actual = data.destination?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/ehr/fhir/Practitioner/2323-33-4",
            actual = data.destination?.get(0)?.receiver?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/example",
            actual = data.destination?.get(0)?.target?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.enterer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "admin-notify",
            actual = data.eventCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/message-events",
            actual = data.eventCoding?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.focus?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1cbdfb97-5859-48a4-8301-d54eab818d68",
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
            expected = "admit",
            actual = data.reason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/message-reasons-encounter",
            actual = data.reason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResponseType.OK,
            actual = data.response?.code
        )

        assertEquals(
            expected = "5015fe84-8e76-4526-89d8-44b322e8d4fb",
            actual = data.response?.identifier
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.sender?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.source?.contact?.system
        )

        assertEquals(
            expected = "+1 (555) 123 4567",
            actual = data.source?.contact?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "llp:10.11.12.13:5432",
            actual = data.source?.endpoint
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Central Patient Registry",
            actual = data.source?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FooBar Patient Manager",
            actual = data.source?.software
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3.1.45.AABB",
            actual = data.source?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
