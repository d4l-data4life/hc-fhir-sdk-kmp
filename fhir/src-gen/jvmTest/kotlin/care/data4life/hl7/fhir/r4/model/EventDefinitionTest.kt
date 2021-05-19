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
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.TriggerType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * EventDefinitionTest.java
 *
 * A description of when an event can occur
 *
 * The EventDefinition resource provides a reusable description of when a particular event can occur.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EventDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testEventDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/eventdefinition-example.json")

        // When
        val data = parser.toFhir(EventDefinition::class, sourceJson)

        // Then
        assertEventDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEventDefinition01Step01(data: EventDefinition) {

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
            expected = "Monitor all admissions to Emergency",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Encounter Location = emergency (active/completed encounters, current or previous)",
            actual = data.trigger?.get(0)?.condition?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "(this | %previous).location.where(location = 'Location/emergency' and status in {'active', 'completed'}).exists()",
            actual = data.trigger?.get(0)?.condition?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/fhirpath",
            actual = data.trigger?.get(0)?.condition?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter",
            actual = data.trigger?.get(0)?.data?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "monitor-emergency-admissions",
            actual = data.trigger?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TriggerType.NAMED_EVENT,
            actual = data.trigger?.get(0)?.type
        )
    }
}
