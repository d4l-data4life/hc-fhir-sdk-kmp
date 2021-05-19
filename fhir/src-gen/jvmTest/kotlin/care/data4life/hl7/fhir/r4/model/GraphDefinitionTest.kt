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
import care.data4life.hl7.fhir.r4.codesystem.GraphCompartmentRule
import care.data4life.hl7.fhir.r4.codesystem.GraphCompartmentUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * GraphDefinitionTest.java
 *
 * Definition of a graph of resources
 *
 * A formal computable definition of a graph of resources - that is, a coherent set of resources that
 * form a graph by following references. The Graph Definition resource defines a set and makes rules
 * about the set.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class GraphDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testGraphDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/graphdefinition-example.json")

        // When
        val data = parser.toFhir(GraphDefinition::class, sourceJson)

        // Then
        assertGraphDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGraphDefinition01Step01(data: GraphDefinition) {

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-04",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Specify to include list references when generating a document using the \$document operation",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Link to List",
            actual = data.link?.get(0)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section.entry",
            actual = data.link?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = CompartmentType.PATIENT,
            actual = data.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.code
        )

        assertEquals(
            expected = GraphCompartmentRule.IDENTICAL,
            actual = data.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.rule
        )

        assertEquals(
            expected = GraphCompartmentUse.REQUIREMENT,
            actual = data.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.use
        )

        assertEquals(
            expected = "Include any list entries",
            actual = data.link?.get(0)?.target?.get(0)?.link?.get(0)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "List.entry.item",
            actual = data.link?.get(0)?.target?.get(0)?.link?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = CompartmentType.PATIENT,
            actual = data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.code
        )

        assertEquals(
            expected = GraphCompartmentRule.IDENTICAL,
            actual = data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.rule
        )

        assertEquals(
            expected = GraphCompartmentUse.REQUIREMENT,
            actual = data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.use
        )

        assertEquals(
            expected = ResourceType.RESOURCE,
            actual = data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.type
        )

        assertEquals(
            expected = ResourceType.LIST,
            actual = data.link?.get(0)?.target?.get(0)?.type
        )

        assertEquals(
            expected = "Document Generation Template",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FHIR Project",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ResourceType.COMPOSITION,
            actual = data.start
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
            expected = "http://h7.org/fhir/GraphDefinition/example",
            actual = data.url
                ?.replace("\n", " ")
        )
    }
}
