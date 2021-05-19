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
import care.data4life.hl7.fhir.r4.codesystem.MessageSignificanceCategory
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MessageDefinitionTest.java
 *
 * A resource that defines a type of message that can be exchanged between systems
 *
 * Defines the characteristics of a message that can be shared between systems, including the type of
 * event that initiates the message, the content to be transmitted and what response(s), if any, are
 * permitted.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MessageDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testMessageDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/messagedefinition-example.json")

        // When
        val data = parser.toFhir(MessageDefinition::class, sourceJson)

        // Then
        assertMessageDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMessageDefinition01Step01(data: MessageDefinition) {

        assertEquals(
            expected = MessageSignificanceCategory.NOTIFICATION,
            actual = data.category
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-11-09",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "admin-notify",
            actual = data.eventCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/message-events",
            actual = data.eventCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "EXAMPLE",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health Level Seven, Int'l",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Defines a base example for other MessageDefinition instances.",
            actual = data.purpose
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Message definition base example</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Message definition base example",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/MessageDefinition/example",
            actual = data.url
                ?.replace("\n", " ")
        )
    }
}
