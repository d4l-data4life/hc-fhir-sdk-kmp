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
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.MessageSignificanceCategory
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * MessageDefinitionTest.java
 *
 * A resource that defines a type of message that can be exchanged between systems
 *
 * Defines the characteristics of a message that can be shared between systems, including the type of
 * event that initiates the message, the content to be transmitted and what response(s), if any, are
 * permitted.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MessageDefinitionFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testMessageDefinition01() {
        // Given
        val sourceJson = loadAsString("stu3/messagedefinition-example.json")

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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-09",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "communication-request",
            actual = data.event?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/message-events",
            actual = data.event?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EXAMPLE",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Health Level Seven, Int'l",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Defines a base example for other MessageDefintion instances.",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.responseRequired?.value
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Message definition base example</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Message definition base example",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/MessageDefinition/example",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }
}
