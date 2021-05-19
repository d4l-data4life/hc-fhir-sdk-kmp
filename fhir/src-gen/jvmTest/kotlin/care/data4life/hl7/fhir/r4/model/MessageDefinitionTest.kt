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
        assertEquals(
            MessageSignificanceCategory.NOTIFICATION,
            data.category
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2016-11-09",
            data.date?.value.toString()
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
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "EXAMPLE",
            data.name
        )
        assertEquals(
            "Health Level Seven, Int'l",
            data.publisher
        )
        assertEquals(
            "Defines a base example for other MessageDefinition instances.",
            data.purpose
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Message definition base example</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Message definition base example",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/MessageDefinition/example",
            data.url
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
