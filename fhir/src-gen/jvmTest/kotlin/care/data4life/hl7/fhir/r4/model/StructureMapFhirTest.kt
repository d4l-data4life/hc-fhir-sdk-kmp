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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * StructureMapTest.java
 *
 * A Map of relationships between 2 structures that can be used to transform data
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class StructureMapFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testStructureMap01() {
        // Given
        val sourceJson = loadAsString("r4/structuremap-example.json")

        // When
        val data = parser.toFhir(StructureMap::class, sourceJson)

        // Then
        assertStructureMap01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertStructureMap01Step01(data: StructureMap) {
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
            expected = "2017-03-09",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Example Structure Map",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test -> testValue",
            actual = data.group?.get(0)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = StructureMapInputMode.SOURCE,
            actual = data.group?.get(0)?.input?.get(0)?.mode
        )

        assertEquals(
            expected = "test",
            actual = data.group?.get(0)?.input?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Examples",
            actual = data.group?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "rule1",
            actual = data.group?.get(0)?.rule?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Source",
            actual = data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.context
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test",
            actual = data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.element
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SourceClassA",
            actual = data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "t",
            actual = data.group?.get(0)?.rule?.get(0)?.source?.get(0)?.variable
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Destination",
            actual = data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.context
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = StructureMapContextType.VARIABLE,
            actual = data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.contextType
        )

        assertEquals(
            expected = "testValue",
            actual = data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.element
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = StructureMapTransform.COPY,
            actual = data.group?.get(0)?.rule?.get(0)?.target?.get(0)?.transform
        )

        assertEquals(
            expected = StructureMapGroupTypeMode.NONE,
            actual = data.group?.get(0)?.typeMode
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:37843577-95fb-4adb-84c0-8837188a7bf3",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "009",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oceania",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unstats.un.org/unsd/methods/m49/m49.htm",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ExampleMap",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 FHIR Standard",
            actual = data.publisher
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
            expected = "Example Map",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureMap/example",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
