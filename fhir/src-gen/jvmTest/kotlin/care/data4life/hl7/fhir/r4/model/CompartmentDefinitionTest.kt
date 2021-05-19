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
import care.data4life.hl7.fhir.r4.codesystem.CompartmentType
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CompartmentDefinitionTest.java
 *
 * Compartment Definition for a resource
 *
 * A compartment definition that defines how resources are accessed on a server.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CompartmentDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testCompartmentDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/compartmentdefinition-example.json")

        // When
        val data = parser.toFhir(CompartmentDefinition::class, sourceJson)

        // Then
        assertEquals(
            CompartmentType.DEVICE,
            data.code
        )
        assertEquals(
            "[string]",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2017-02-24",
            data.date?.value.toString()
        )
        assertEquals(
            "The set of resources associated with a particular Device (example with Communication and CommunicationRequest resourses only).",
            data.description
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
            "Health Level Seven International (FHIR Infrastructure)",
            data.publisher
        )
        assertEquals(
            "Provides an example of a FHIR compartment definition based on the Device resource type.",
            data.purpose
        )
        assertEquals(
            ResourceType.COMMUNICATION,
            data.resource?.get(0)?.code
        )
        assertEquals(
            "The device used as the message sender and recipient",
            data.resource?.get(0)?.documentation
        )
        assertEquals(
            "sender",
            data.resource?.get(0)?.param?.get(0)
        )
        assertEquals(
            "recipient",
            data.resource?.get(0)?.param?.get(1)
        )
        assertEquals(
            ResourceType.COMMUNICATIONREQUEST,
            data.resource?.get(1)?.code
        )
        assertEquals(
            "The device used as the message sender and recipient",
            data.resource?.get(1)?.documentation
        )
        assertEquals(
            "sender",
            data.resource?.get(1)?.param?.get(0)
        )
        assertEquals(
            "recipient",
            data.resource?.get(1)?.param?.get(1)
        )
        assertEquals(
            "True".toBoolean(),
            data.search?.value
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
            "http://hl7.org/fhir/CompartmentDefinition/example",
            data.url
        )
        assertEquals(
            "focus",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "Device",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/resource-types",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
