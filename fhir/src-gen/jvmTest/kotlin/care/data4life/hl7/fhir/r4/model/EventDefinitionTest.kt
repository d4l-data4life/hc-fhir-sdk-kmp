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
            "Monitor all admissions to Emergency",
            data.purpose
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Encounter Location = emergency (active/completed encounters, current or previous)",
            data.trigger?.get(0)?.condition?.description
        )
        assertEquals(
            "(this | %previous).location.where(location = 'Location/emergency' and status in {'active', 'completed'}).exists()",
            data.trigger?.get(0)?.condition?.expression
        )
        assertEquals(
            "text/fhirpath",
            data.trigger?.get(0)?.condition?.language
        )
        assertEquals(
            "Encounter",
            data.trigger?.get(0)?.data?.get(0)?.type
        )
        assertEquals(
            "monitor-emergency-admissions",
            data.trigger?.get(0)?.name
        )
        assertEquals(
            TriggerType.NAMED_EVENT,
            data.trigger?.get(0)?.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
