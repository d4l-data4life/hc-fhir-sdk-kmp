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
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2015-08-04",
            data.date?.value.toString()
        )
        assertEquals(
            "Specify to include list references when generating a document using the \$document operation",
            data.description
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "Link to List",
            data.link?.get(0)?.description
        )
        assertEquals(
            "Composition.section.entry",
            data.link?.get(0)?.path
        )
        assertEquals(
            CompartmentType.PATIENT,
            data.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.code
        )
        assertEquals(
            GraphCompartmentRule.IDENTICAL,
            data.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.rule
        )
        assertEquals(
            GraphCompartmentUse.REQUIREMENT,
            data.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.use
        )
        assertEquals(
            "Include any list entries",
            data.link?.get(0)?.target?.get(0)?.link?.get(0)?.description
        )
        assertEquals(
            "List.entry.item",
            data.link?.get(0)?.target?.get(0)?.link?.get(0)?.path
        )
        assertEquals(
            CompartmentType.PATIENT,
            data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.code
        )
        assertEquals(
            GraphCompartmentRule.IDENTICAL,
            data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.rule
        )
        assertEquals(
            GraphCompartmentUse.REQUIREMENT,
            data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.compartment?.get(0)?.use
        )
        assertEquals(
            ResourceType.RESOURCE,
            data.link?.get(0)?.target?.get(0)?.link?.get(0)?.target?.get(0)?.type
        )
        assertEquals(
            ResourceType.LIST,
            data.link?.get(0)?.target?.get(0)?.type
        )
        assertEquals(
            "Document Generation Template",
            data.name
        )
        assertEquals(
            "FHIR Project",
            data.publisher
        )
        assertEquals(
            ResourceType.COMPOSITION,
            data.start
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
            "http://h7.org/fhir/GraphDefinition/example",
            data.url
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
