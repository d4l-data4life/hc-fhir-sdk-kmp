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
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.StructureMapContextType
import care.data4life.hl7.fhir.r4.codesystem.StructureMapGroupTypeMode
import care.data4life.hl7.fhir.r4.codesystem.StructureMapInputMode
import care.data4life.hl7.fhir.r4.codesystem.StructureMapTransform
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * StructureMapTest.java
 *
 * A Map of relationships between 2 structures that can be used to transform data
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class StructureMapTest {

    val parser = FhirR4Parser()

    @Test
    fun testStructureMap01() {
        // Given
        val sourceJson = loadAsString("r4/structuremap-example.json")

        // When
        val data = parser.toFhir(StructureMap::class, sourceJson)

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
            "2017-03-09",
            data.date?.value.toString()
        )
        assertEquals(
            "Example Structure Map",
            data.description
        )
        assertEquals(
            "test -> testValue",
            data.group?.get(0)?.documentation
        )
        assertEquals(
            StructureMapInputMode.SOURCE,
            data.group?.get(0)?.input?.get(0)?.mode
        )
        assertEquals(
            "test",
            data.group?.get(0)?.input?.get(0)?.name
        )
        assertEquals(
            "Examples",
            data.group?.get(0)?.name
        )
        assertEquals(
            "rule1",
            data.group?.get(0)?.rule?.get(0)?.name
        )
        assertEquals(
            "Source",
            data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.context
        )
        assertEquals(
            "test",
            data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.element
        )
        assertEquals(
            "SourceClassA",
            data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.type
        )
        assertEquals(
            "t",
            data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.variable
        )
        assertEquals(
            "Destination",
            data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.context
        )
        assertEquals(
            StructureMapContextType.VARIABLE,
            data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.contextType
        )
        assertEquals(
            "testValue",
            data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.element
        )
        assertEquals(
            StructureMapTransform.COPY,
            data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.transform
        )
        assertEquals(
            StructureMapGroupTypeMode.NONE,
            data.group?.get(0)?.typeMode
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:37843577-95fb-4adb-84c0-8837188a7bf3",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "009",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Oceania",
            data.jurisdiction?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://unstats.un.org/unsd/methods/m49/m49.htm",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "ExampleMap",
            data.name
        )
        assertEquals(
            "HL7 FHIR Standard",
            data.publisher
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
            "Example Map",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/StructureMap/example",
            data.url
        )
        assertEquals(
            "0.1",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
