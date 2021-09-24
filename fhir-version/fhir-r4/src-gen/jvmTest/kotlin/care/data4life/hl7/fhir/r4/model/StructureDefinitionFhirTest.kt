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
import care.data4life.hl7.fhir.r4.codesystem.DiscriminatorType
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.SlicingRules
import care.data4life.hl7.fhir.r4.codesystem.StructureDefinitionKind
import care.data4life.hl7.fhir.r4.codesystem.TypeDerivationRule
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * StructureDefinitionTest.java
 *
 * Structural Definition
 *
 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data
 * types defined in FHIR, and also for describing extensions and constraints on resources and data
 * types.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class StructureDefinitionFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testStructureDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/structuredefinition-example-section-library.json")

        // When
        val data = parser.toFhir(StructureDefinition::class, sourceJson)

        // Then
        assertStructureDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertStructureDefinition01Step01(data: StructureDefinition) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.abstrakt?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Composition",
            actual = data.baseDefinition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-11-05T17:57:00+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = TypeDerivationRule.CONSTRAINT,
            actual = data.derivation
        )

        assertEquals(
            expected = "Composition",
            actual = data.differential?.element?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition",
            actual = data.differential?.element?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Slice by .section.code when using this library of sections",
            actual = data.differential?.element?.get(1)?.slicing?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.differential?.element?.get(1)?.slicing?.discriminator?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiscriminatorType.PATTERN,
            actual = data.differential?.element?.get(1)?.slicing?.discriminator?.get(0)?.type
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(1)?.slicing?.ordered?.value
        )

        assertEquals(
            expected = SlicingRules.CLOSED,
            actual = data.differential?.element?.get(1)?.slicing?.rules
        )

        assertEquals(
            expected = "Composition.section:procedure",
            actual = data.differential?.element?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(2)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "procedure",
            actual = data.differential?.element?.get(2)?.sliceName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Procedures Performed",
            actual = data.differential?.element?.get(3)?.fixedString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section:procedure.title",
            actual = data.differential?.element?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(3)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.title",
            actual = data.differential?.element?.get(3)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section:procedure.code",
            actual = data.differential?.element?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(4)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.code",
            actual = data.differential?.element?.get(4)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "29554-3",
            actual = data.differential?.element?.get(4)?.patternCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Procedure Narrative",
            actual = data.differential?.element?.get(4)?.patternCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.differential?.element?.get(4)?.patternCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section:medications",
            actual = data.differential?.element?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(5)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medications",
            actual = data.differential?.element?.get(5)?.sliceName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medications Administered",
            actual = data.differential?.element?.get(6)?.fixedString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section:medications.title",
            actual = data.differential?.element?.get(6)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(6)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.title",
            actual = data.differential?.element?.get(6)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section:medications.code",
            actual = data.differential?.element?.get(7)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(7)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.code",
            actual = data.differential?.element?.get(7)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "29549-3",
            actual = data.differential?.element?.get(7)?.patternCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medication administered Narrative",
            actual = data.differential?.element?.get(7)?.patternCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.differential?.element?.get(7)?.patternCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section:plan",
            actual = data.differential?.element?.get(8)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(8)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "plan",
            actual = data.differential?.element?.get(8)?.sliceName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Discharge Treatment Plan",
            actual = data.differential?.element?.get(9)?.fixedString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition.section:plan.title",
            actual = data.differential?.element?.get(9)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(9)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.title",
            actual = data.differential?.element?.get(9)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-section-library",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = StructureDefinitionKind.COMPLEX_TYPE,
            actual = data.kind
        )

        assertEquals(
            expected = "DocumentSectionLibrary",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Document Section Library (For testing section templates)",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Composition",
            actual = data.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/example-section-library",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testStructureDefinition02() {
        // FIXME Test disabled due to issues with examplescenario.profile.json
        // REASON - Property _baseDefinition is not supported yet
        assertEquals(expected = true, actual = true)
    }

    @Test
    fun testStructureDefinition03() {
        // FIXME Test disabled due to issues with structuredefinition-example-composition.json
        // REASON - Property _profile is not supported yet
        assertEquals(expected = true, actual = true)
    }
}
