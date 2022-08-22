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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

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
class CompartmentDefinitionFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testCompartmentDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/compartmentdefinition-example.json")

        // When
        val data = parser.toFhir(CompartmentDefinition::class, sourceJson)

        // Then
        assertCompartmentDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCompartmentDefinition01Step01(data: CompartmentDefinition) {
        assertEquals(
            expected = CompartmentType.DEVICE,
            actual = data.code
        )

        assertEquals(
            expected = "[string]",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-24",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "The set of resources associated with a particular Device (example with Communication and CommunicationRequest resourses only).",
            actual = data.description
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
            expected = "Health Level Seven International (FHIR Infrastructure)",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Provides an example of a FHIR compartment definition based on the Device resource type.",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.COMMUNICATION,
            actual = data.resource?.get(0)?.code
        )

        assertEquals(
            expected = "The device used as the message sender and recipient",
            actual = data.resource?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "sender",
            actual = data.resource?.get(0)?.param?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "recipient",
            actual = data.resource?.get(0)?.param?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.COMMUNICATIONREQUEST,
            actual = data.resource?.get(1)?.code
        )

        assertEquals(
            expected = "The device used as the message sender and recipient",
            actual = data.resource?.get(1)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "sender",
            actual = data.resource?.get(1)?.param?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "recipient",
            actual = data.resource?.get(1)?.param?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.search?.value
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
            expected = "http://hl7.org/fhir/CompartmentDefinition/example",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
