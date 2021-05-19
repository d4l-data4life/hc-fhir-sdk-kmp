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
import care.data4life.hl7.fhir.r4.codesystem.BindingStrength
import care.data4life.hl7.fhir.r4.codesystem.ConstraintSeverity
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
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
class StructureDefinitionTest {

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
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition",
            actual = data.differential?.element?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Slice by .section.code when using this library of sections",
            actual = data.differential?.element?.get(1)?.slicing?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.differential?.element?.get(1)?.slicing?.discriminator?.get(0)?.path
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "procedure",
            actual = data.differential?.element?.get(2)?.sliceName
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Procedures Performed",
            actual = data.differential?.element?.get(3)?.fixedString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:procedure.title",
            actual = data.differential?.element?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(3)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.title",
            actual = data.differential?.element?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:procedure.code",
            actual = data.differential?.element?.get(4)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(4)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.code",
            actual = data.differential?.element?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "29554-3",
            actual = data.differential?.element?.get(4)?.patternCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Procedure Narrative",
            actual = data.differential?.element?.get(4)?.patternCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.differential?.element?.get(4)?.patternCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:medications",
            actual = data.differential?.element?.get(5)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(5)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medications",
            actual = data.differential?.element?.get(5)?.sliceName
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Medications Administered",
            actual = data.differential?.element?.get(6)?.fixedString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:medications.title",
            actual = data.differential?.element?.get(6)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(6)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.title",
            actual = data.differential?.element?.get(6)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:medications.code",
            actual = data.differential?.element?.get(7)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(7)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.code",
            actual = data.differential?.element?.get(7)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "29549-3",
            actual = data.differential?.element?.get(7)?.patternCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Medication administered Narrative",
            actual = data.differential?.element?.get(7)?.patternCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.differential?.element?.get(7)?.patternCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:plan",
            actual = data.differential?.element?.get(8)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(8)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "plan",
            actual = data.differential?.element?.get(8)?.sliceName
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Discharge Treatment Plan",
            actual = data.differential?.element?.get(9)?.fixedString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:plan.title",
            actual = data.differential?.element?.get(9)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(9)?.min?.value
        )

        assertEquals(
            expected = "Composition.section.title",
            actual = data.differential?.element?.get(9)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-section-library",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StructureDefinitionKind.COMPLEX_TYPE,
            actual = data.kind
        )

        assertEquals(
            expected = "DocumentSectionLibrary",
            actual = data.name
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition",
            actual = data.type
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/example-section-library",
            actual = data.url
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testStructureDefinition02() {
        // Given
        val sourceJson = loadAsString("r4/examplescenario.profile.json")

        // When
        val data = parser.toFhir(StructureDefinition::class, sourceJson)

        // Then
        assertStructureDefinition02Step01(data)
        assertStructureDefinition02Step02(data)
        assertStructureDefinition02Step03(data)
        assertStructureDefinition02Step04(data)
        assertStructureDefinition02Step05(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertStructureDefinition02Step01(data: StructureDefinition) {

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.abstrakt?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DomainResource",
            actual = data.baseDefinition
                ?.replace("\n", " ")
        )

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
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(1)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://www.hl7.org/Special/committees/fiwg/index.cfm",
            actual = data.contact?.get(1)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2019-11-01T09:29:23+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = TypeDerivationRule.SPECIALIZATION,
            actual = data.derivation
        )

        assertEquals(
            expected = "Example of workflow instance.",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "name.matches('[A-Z]([A-Za-z0-9_]){0,254}')",
            actual = data.differential?.element?.get(0)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name should be usable as an identifier for the module by machine processing applications such as code generation",
            actual = data.differential?.element?.get(0)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "esc-0",
            actual = data.differential?.element?.get(0)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.WARNING,
            actual = data.differential?.element?.get(0)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "not(exists(f:name/@value)) or matches(f:name/@value, '[A-Z]([A-Za-z0-9_]){0,254}')",
            actual = data.differential?.element?.get(0)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Example of workflow instance.",
            actual = data.differential?.element?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario",
            actual = data.differential?.element?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.differential?.element?.get(0)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(0)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario",
            actual = data.differential?.element?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Example of workflow instance",
            actual = data.differential?.element?.get(0)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.url",
            actual = data.differential?.element?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(1)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(1)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.url",
            actual = data.differential?.element?.get(1)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.differential?.element?.get(1)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.identifier",
            actual = data.differential?.element?.get(1)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.differential?.element?.get(1)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(1)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.url",
            actual = data.differential?.element?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Allows the example scenario to be referenced by a single globally unique identifier.",
            actual = data.differential?.element?.get(1)?.requirements
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Canonical identifier for this example scenario, represented as a URI (globally unique)",
            actual = data.differential?.element?.get(1)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "uri",
            actual = data.differential?.element?.get(1)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A formal identifier that is used to identify this example scenario when it is represented in other formats, or referenced in a specification, model, design or an instance.",
            actual = data.differential?.element?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.identifier",
            actual = data.differential?.element?.get(2)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(2)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(2)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.identifier",
            actual = data.differential?.element?.get(2)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.differential?.element?.get(2)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.identifier",
            actual = data.differential?.element?.get(2)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "objimpl",
            actual = data.differential?.element?.get(2)?.mapping?.get(2)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "no-gen-base",
            actual = data.differential?.element?.get(2)?.mapping?.get(2)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.differential?.element?.get(2)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(2)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.identifier",
            actual = data.differential?.element?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Allows externally provided and/or usable business identifiers to be easily associated with the module.",
            actual = data.differential?.element?.get(2)?.requirements
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Additional identifier for the example scenario",
            actual = data.differential?.element?.get(2)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Identifier",
            actual = data.differential?.element?.get(2)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.version",
            actual = data.differential?.element?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(3)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(3)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.version",
            actual = data.differential?.element?.get(3)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.differential?.element?.get(3)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.version",
            actual = data.differential?.element?.get(3)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.differential?.element?.get(3)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(3)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.version",
            actual = data.differential?.element?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Business version of the example scenario",
            actual = data.differential?.element?.get(3)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "string",
            actual = data.differential?.element?.get(3)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The name is not expected to be globally unique. The name should be a simple alphanumeric type name to ensure that it is machine-processing friendly.",
            actual = data.differential?.element?.get(4)?.comment
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "inv-0",
            actual = data.differential?.element?.get(4)?.condition?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A natural language name identifying the example scenario. This name should be usable as an identifier for the module by machine processing applications such as code generation.",
            actual = data.differential?.element?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.name",
            actual = data.differential?.element?.get(4)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(4)?.isSummary?.value
        )

        assertEquals(
            expected = "1",
            actual = data.differential?.element?.get(4)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(4)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.name",
            actual = data.differential?.element?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Support human navigation and code generation.",
            actual = data.differential?.element?.get(4)?.requirements
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name for this example scenario (computer friendly)",
            actual = data.differential?.element?.get(4)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "string",
            actual = data.differential?.element?.get(4)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The lifecycle status of an artifact.",
            actual = data.differential?.element?.get(5)?.binding?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-bindingName",
            actual = data.differential?.element?.get(5)?.binding?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "PublicationStatus",
            actual = data.differential?.element?.get(5)?.binding?.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-isCommonBinding",
            actual = data.differential?.element?.get(5)?.binding?.extension?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(5)?.binding?.extension?.get(1)?.valueBoolean?.value
        )

        assertEquals(
            expected = BindingStrength.REQUIRED,
            actual = data.differential?.element?.get(5)?.binding?.strength
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/publication-status|4.0.1",
            actual = data.differential?.element?.get(5)?.binding?.valueSet
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Allows filtering of example scenarios that are appropriate for use versus not.",
            actual = data.differential?.element?.get(5)?.comment
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The status of this example scenario. Enables tracking the life-cycle of the content.",
            actual = data.differential?.element?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.status",
            actual = data.differential?.element?.get(5)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(5)?.isModifier?.value
        )

        assertEquals(
            expected = "This is labeled as \"Is Modifier\" because applications should not use a retired {{title}} without due consideration",
            actual = data.differential?.element?.get(5)?.isModifierReason
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(5)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(5)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.status",
            actual = data.differential?.element?.get(5)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.differential?.element?.get(5)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.status",
            actual = data.differential?.element?.get(5)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.differential?.element?.get(5)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(5)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.status",
            actual = data.differential?.element?.get(5)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "draft | active | retired | unknown",
            actual = data.differential?.element?.get(5)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.differential?.element?.get(5)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Allows filtering of example scenarios that are appropriate for use versus not.",
            actual = data.differential?.element?.get(6)?.comment
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A Boolean value to indicate that this example scenario is authored for testing purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.",
            actual = data.differential?.element?.get(6)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.experimental",
            actual = data.differential?.element?.get(6)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(6)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(6)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.experimental",
            actual = data.differential?.element?.get(6)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.differential?.element?.get(6)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.class",
            actual = data.differential?.element?.get(6)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.differential?.element?.get(6)?.max
                ?.replace("\n", " ")
        )
    }

    private fun assertStructureDefinition02Step02(data: StructureDefinition) {

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(6)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.experimental",
            actual = data.differential?.element?.get(6)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Enables experimental content to be developed following the same lifecycle that would be used for a production-level example scenario.",
            actual = data.differential?.element?.get(6)?.requirements
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "For testing purposes, not real usage",
            actual = data.differential?.element?.get(6)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "boolean",
            actual = data.differential?.element?.get(6)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Revision Date",
            actual = data.differential?.element?.get(7)?.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.date",
            actual = data.differential?.element?.get(7)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(7)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(7)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.date",
            actual = data.differential?.element?.get(7)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.differential?.element?.get(7)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.recorded",
            actual = data.differential?.element?.get(7)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.differential?.element?.get(7)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(7)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.date",
            actual = data.differential?.element?.get(7)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Date last changed",
            actual = data.differential?.element?.get(7)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "dateTime",
            actual = data.differential?.element?.get(7)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The name of the organization or individual that published the example scenario.",
            actual = data.differential?.element?.get(8)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.publisher",
            actual = data.differential?.element?.get(8)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(8)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(8)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.publisher",
            actual = data.differential?.element?.get(8)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.differential?.element?.get(8)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.witness",
            actual = data.differential?.element?.get(8)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.differential?.element?.get(8)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(8)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.publisher",
            actual = data.differential?.element?.get(8)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Helps establish the \"authority/credibility\" of the example scenario.  May also allow for contact.",
            actual = data.differential?.element?.get(8)?.requirements
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name of the publisher (organization or individual)",
            actual = data.differential?.element?.get(8)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "string",
            actual = data.differential?.element?.get(8)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "May be a web site, an email address, a telephone number, etc.",
            actual = data.differential?.element?.get(9)?.comment
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Contact details to assist a user in finding and communicating with the publisher.",
            actual = data.differential?.element?.get(9)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.contact",
            actual = data.differential?.element?.get(9)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.differential?.element?.get(9)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.differential?.element?.get(9)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.contact",
            actual = data.differential?.element?.get(9)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.differential?.element?.get(9)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(9)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.contact",
            actual = data.differential?.element?.get(9)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Contact details for the publisher",
            actual = data.differential?.element?.get(9)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ContactDetail",
            actual = data.differential?.element?.get(9)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-category",
            actual = data.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Foundation.Conformance",
            actual = data.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
            actual = data.extension?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "trial-use",
            actual = data.extension?.get(1)?.valueCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            actual = data.extension?.get(2)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.extension?.get(2)?.valueInteger?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-security-category",
            actual = data.extension?.get(3)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "anonymous",
            actual = data.extension?.get(3)?.valueCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            actual = data.extension?.get(4)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.extension?.get(4)?.valueCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.fhirVer
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StructureDefinitionKind.RESOURCE,
            actual = data.kind
        )

        assertEquals(
            expected = "workflow",
            actual = data.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Workflow Pattern",
            actual = data.mapping?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/workflow",
            actual = data.mapping?.get(0)?.uri
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs Pattern Mapping",
            actual = data.mapping?.get(1)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/fivews",
            actual = data.mapping?.get(1)?.uri
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "objimpl",
            actual = data.mapping?.get(2)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Object Implementation Information",
            actual = data.mapping?.get(2)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/object-implementation",
            actual = data.mapping?.get(2)?.uri
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "rim",
            actual = data.mapping?.get(3)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "RIM Mapping",
            actual = data.mapping?.get(3)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/v3",
            actual = data.mapping?.get(3)?.uri
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2019-11-01T09:29:23.356+11:00",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "ExampleScenario",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health Level Seven International (FHIR Infrastructure)",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(0)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(0)?.base?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario",
            actual = data.snapshot?.element?.get(0)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "contained.contained.empty()",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "If the resource is contained in another resource, it SHALL NOT contain nested Resources",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "dom-2",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(0)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DomainResource",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "not(parent::f:contained and f:contained)",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "If the resource is contained in another resource, it SHALL be referred to from elsewhere in the resource or SHALL refer to the containing resource",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(1)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "dom-3",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(1)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(0)?.constraint?.get(1)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DomainResource",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(1)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "not(exists(for \$id in f:contained/*/f:id/@value return \$contained[not(parent::*/descendant::f:reference/@value=concat('#', \$contained/*/id/@value) or descendant::f:reference[@value='#'])]))",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(1)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "contained.meta.versionId.empty() and contained.meta.lastUpdated.empty()",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(2)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "If a resource is contained in another resource, it SHALL NOT have a meta.versionId or a meta.lastUpdated",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(2)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "dom-4",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(2)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(0)?.constraint?.get(2)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DomainResource",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(2)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "not(exists(f:contained/*/f:meta/f:versionId)) and not(exists(f:contained/*/f:meta/f:lastUpdated))",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(2)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "contained.meta.security.empty()",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(3)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "If a resource is contained in another resource, it SHALL NOT have a security label",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(3)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "dom-5",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(3)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(0)?.constraint?.get(3)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DomainResource",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(3)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "not(exists(f:contained/*/f:meta/f:security))",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(3)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text.`div`.exists()",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-bestpractice",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.extension?.get(0)?.valueBoolean?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-bestpractice-explanation",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.extension?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A resource should have narrative for robust management",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.human
                ?.replace("\n", " ")
        )
    }

    private fun assertStructureDefinition02Step03(data: StructureDefinition) {

        assertEquals(
            expected = "dom-6",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.WARNING,
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DomainResource",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "exists(f:text/h:div)",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(4)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "name.matches('[A-Z]([A-Za-z0-9_]){0,254}')",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(5)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name should be usable as an identifier for the module by machine processing applications such as code generation",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(5)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "esc-0",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(5)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.WARNING,
            actual = data.snapshot?.element?.get(0)?.constraint?.get(5)?.severity
        )

        assertEquals(
            expected = "not(exists(f:name/@value)) or matches(f:name/@value, '[A-Z]([A-Za-z0-9_]){0,254}')",
            actual = data.snapshot?.element?.get(0)?.constraint?.get(5)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Example of workflow instance.",
            actual = data.snapshot?.element?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario",
            actual = data.snapshot?.element?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(0)?.isModifier?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(0)?.isSummary?.value
        )

        assertEquals(
            expected = "rim",
            actual = data.snapshot?.element?.get(0)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Entity. Role, or Act",
            actual = data.snapshot?.element?.get(0)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(0)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(0)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario",
            actual = data.snapshot?.element?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Example of workflow instance",
            actual = data.snapshot?.element?.get(0)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(1)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(1)?.base?.min?.value
        )

        assertEquals(
            expected = "Resource.id",
            actual = data.snapshot?.element?.get(1)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The only time that a resource does not have an id is when it is being submitted to the server using a create operation.",
            actual = data.snapshot?.element?.get(1)?.comment
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.",
            actual = data.snapshot?.element?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.id",
            actual = data.snapshot?.element?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(1)?.isModifier?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(1)?.isSummary?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(1)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(1)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.id",
            actual = data.snapshot?.element?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Logical id of this artifact",
            actual = data.snapshot?.element?.get(1)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhirpath/System.String",
            actual = data.snapshot?.element?.get(1)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fhir-type",
            actual = data.snapshot?.element?.get(1)?.type?.get(0)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "string",
            actual = data.snapshot?.element?.get(1)?.type?.get(0)?.extension?.get(0)?.valueUrl
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(2)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(2)?.base?.min?.value
        )

        assertEquals(
            expected = "Resource.meta",
            actual = data.snapshot?.element?.get(2)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hasValue() or (children().count() > id.count())",
            actual = data.snapshot?.element?.get(2)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All FHIR elements must have a @value or children",
            actual = data.snapshot?.element?.get(2)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ele-1",
            actual = data.snapshot?.element?.get(2)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(2)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Element",
            actual = data.snapshot?.element?.get(2)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "@value|f:*|h:div",
            actual = data.snapshot?.element?.get(2)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.",
            actual = data.snapshot?.element?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.meta",
            actual = data.snapshot?.element?.get(2)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(2)?.isModifier?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(2)?.isSummary?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(2)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(2)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.meta",
            actual = data.snapshot?.element?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Metadata about the resource",
            actual = data.snapshot?.element?.get(2)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Meta",
            actual = data.snapshot?.element?.get(2)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(3)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(3)?.base?.min?.value
        )

        assertEquals(
            expected = "Resource.implicitRules",
            actual = data.snapshot?.element?.get(3)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hasValue() or (children().count() > id.count())",
            actual = data.snapshot?.element?.get(3)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All FHIR elements must have a @value or children",
            actual = data.snapshot?.element?.get(3)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ele-1",
            actual = data.snapshot?.element?.get(3)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(3)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Element",
            actual = data.snapshot?.element?.get(3)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "@value|f:*|h:div",
            actual = data.snapshot?.element?.get(3)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.implicitRules",
            actual = data.snapshot?.element?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(3)?.isModifier?.value
        )

        assertEquals(
            expected = "This element is labeled as a modifier because the implicit rules may provide additional knowledge about the resource that modifies it's meaning or interpretation",
            actual = data.snapshot?.element?.get(3)?.isModifierReason
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(3)?.isSummary?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(3)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(3)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.implicitRules",
            actual = data.snapshot?.element?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A set of rules under which this content was created",
            actual = data.snapshot?.element?.get(3)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "uri",
            actual = data.snapshot?.element?.get(3)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(4)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(4)?.base?.min?.value
        )

        assertEquals(
            expected = "Resource.language",
            actual = data.snapshot?.element?.get(4)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A human language.",
            actual = data.snapshot?.element?.get(4)?.binding?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-maxValueSet",
            actual = data.snapshot?.element?.get(4)?.binding?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/all-languages",
            actual = data.snapshot?.element?.get(4)?.binding?.extension?.get(0)?.valueCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-bindingName",
            actual = data.snapshot?.element?.get(4)?.binding?.extension?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Language",
            actual = data.snapshot?.element?.get(4)?.binding?.extension?.get(1)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/elementdefinition-isCommonBinding",
            actual = data.snapshot?.element?.get(4)?.binding?.extension?.get(2)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(4)?.binding?.extension?.get(2)?.valueBoolean?.value
        )

        assertEquals(
            expected = BindingStrength.PREFERRED,
            actual = data.snapshot?.element?.get(4)?.binding?.strength
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/languages",
            actual = data.snapshot?.element?.get(4)?.binding?.valueSet
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hasValue() or (children().count() > id.count())",
            actual = data.snapshot?.element?.get(4)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All FHIR elements must have a @value or children",
            actual = data.snapshot?.element?.get(4)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ele-1",
            actual = data.snapshot?.element?.get(4)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(4)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Element",
            actual = data.snapshot?.element?.get(4)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "@value|f:*|h:div",
            actual = data.snapshot?.element?.get(4)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The base language in which the resource is written.",
            actual = data.snapshot?.element?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.language",
            actual = data.snapshot?.element?.get(4)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(4)?.isModifier?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(4)?.isSummary?.value
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(4)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(4)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.language",
            actual = data.snapshot?.element?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Language of the resource content",
            actual = data.snapshot?.element?.get(4)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.snapshot?.element?.get(4)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "narrative",
            actual = data.snapshot?.element?.get(5)?.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "html",
            actual = data.snapshot?.element?.get(5)?.alias?.get(1)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "xhtml",
            actual = data.snapshot?.element?.get(5)?.alias?.get(2)
                ?.replace("\n", " ")
        )
    }

    private fun assertStructureDefinition02Step04(data: StructureDefinition) {

        assertEquals(
            expected = "display",
            actual = data.snapshot?.element?.get(5)?.alias?.get(3)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(5)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(5)?.base?.min?.value
        )

        assertEquals(
            expected = "DomainResource.text",
            actual = data.snapshot?.element?.get(5)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hasValue() or (children().count() > id.count())",
            actual = data.snapshot?.element?.get(5)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All FHIR elements must have a @value or children",
            actual = data.snapshot?.element?.get(5)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ele-1",
            actual = data.snapshot?.element?.get(5)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(5)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Element",
            actual = data.snapshot?.element?.get(5)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "@value|f:*|h:div",
            actual = data.snapshot?.element?.get(5)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.text",
            actual = data.snapshot?.element?.get(5)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(5)?.isModifier?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(5)?.isSummary?.value
        )

        assertEquals(
            expected = "rim",
            actual = data.snapshot?.element?.get(5)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Act.text?",
            actual = data.snapshot?.element?.get(5)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(5)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(5)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.text",
            actual = data.snapshot?.element?.get(5)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Text summary of the resource, for human interpretation",
            actual = data.snapshot?.element?.get(5)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Narrative",
            actual = data.snapshot?.element?.get(5)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "inline resources",
            actual = data.snapshot?.element?.get(6)?.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "anonymous resources",
            actual = data.snapshot?.element?.get(6)?.alias?.get(1)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "contained resources",
            actual = data.snapshot?.element?.get(6)?.alias?.get(2)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(6)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(6)?.base?.min?.value
        )

        assertEquals(
            expected = "DomainResource.contained",
            actual = data.snapshot?.element?.get(6)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.contained",
            actual = data.snapshot?.element?.get(6)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(6)?.isModifier?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(6)?.isSummary?.value
        )

        assertEquals(
            expected = "rim",
            actual = data.snapshot?.element?.get(6)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "N/A",
            actual = data.snapshot?.element?.get(6)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(6)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(6)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.contained",
            actual = data.snapshot?.element?.get(6)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Contained, inline Resources",
            actual = data.snapshot?.element?.get(6)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Resource",
            actual = data.snapshot?.element?.get(6)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "extensions",
            actual = data.snapshot?.element?.get(7)?.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "user content",
            actual = data.snapshot?.element?.get(7)?.alias?.get(1)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(7)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(7)?.base?.min?.value
        )

        assertEquals(
            expected = "DomainResource.extension",
            actual = data.snapshot?.element?.get(7)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hasValue() or (children().count() > id.count())",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All FHIR elements must have a @value or children",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ele-1",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(7)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Element",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "@value|f:*|h:div",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "extension.exists() != value.exists()",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(1)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Must have either extensions or value[x], not both",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(1)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ext-1",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(1)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(7)?.constraint?.get(1)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Extension",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(1)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "exists(f:extension)!=exists(f:*[starts-with(local-name(.), \"value\")])",
            actual = data.snapshot?.element?.get(7)?.constraint?.get(1)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.extension",
            actual = data.snapshot?.element?.get(7)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(7)?.isModifier?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(7)?.isSummary?.value
        )

        assertEquals(
            expected = "rim",
            actual = data.snapshot?.element?.get(7)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "N/A",
            actual = data.snapshot?.element?.get(7)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(7)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(7)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.extension",
            actual = data.snapshot?.element?.get(7)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Additional content defined by implementations",
            actual = data.snapshot?.element?.get(7)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Extension",
            actual = data.snapshot?.element?.get(7)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "extensions",
            actual = data.snapshot?.element?.get(8)?.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "user content",
            actual = data.snapshot?.element?.get(8)?.alias?.get(1)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(8)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(8)?.base?.min?.value
        )

        assertEquals(
            expected = "DomainResource.modifierExtension",
            actual = data.snapshot?.element?.get(8)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hasValue() or (children().count() > id.count())",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All FHIR elements must have a @value or children",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ele-1",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(8)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Element",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "@value|f:*|h:div",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "extension.exists() != value.exists()",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(1)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Must have either extensions or value[x], not both",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(1)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ext-1",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(1)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(8)?.constraint?.get(1)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Extension",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(1)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "exists(f:extension)!=exists(f:*[starts-with(local-name(.), \"value\")])",
            actual = data.snapshot?.element?.get(8)?.constraint?.get(1)?.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ExampleScenario.modifierExtension",
            actual = data.snapshot?.element?.get(8)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(8)?.isModifier?.value
        )

        assertEquals(
            expected = "Modifier extensions are expected to modify the meaning or interpretation of the resource that contains them",
            actual = data.snapshot?.element?.get(8)?.isModifierReason
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(8)?.isSummary?.value
        )

        assertEquals(
            expected = "rim",
            actual = data.snapshot?.element?.get(8)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "N/A",
            actual = data.snapshot?.element?.get(8)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.snapshot?.element?.get(8)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(8)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.modifierExtension",
            actual = data.snapshot?.element?.get(8)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Extensions that cannot be ignored",
            actual = data.snapshot?.element?.get(8)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Extension",
            actual = data.snapshot?.element?.get(8)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(9)?.base?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(9)?.base?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.url",
            actual = data.snapshot?.element?.get(9)?.base?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hasValue() or (children().count() > id.count())",
            actual = data.snapshot?.element?.get(9)?.constraint?.get(0)?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All FHIR elements must have a @value or children",
            actual = data.snapshot?.element?.get(9)?.constraint?.get(0)?.human
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ele-1",
            actual = data.snapshot?.element?.get(9)?.constraint?.get(0)?.key
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ConstraintSeverity.ERROR,
            actual = data.snapshot?.element?.get(9)?.constraint?.get(0)?.severity
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Element",
            actual = data.snapshot?.element?.get(9)?.constraint?.get(0)?.source
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "@value|f:*|h:div",
            actual = data.snapshot?.element?.get(9)?.constraint?.get(0)?.xpath
                ?.replace("\n", " ")
        )
    }

    private fun assertStructureDefinition02Step05(data: StructureDefinition) {

        assertEquals(
            expected = "ExampleScenario.url",
            actual = data.snapshot?.element?.get(9)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.snapshot?.element?.get(9)?.isModifier?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.snapshot?.element?.get(9)?.isSummary?.value
        )

        assertEquals(
            expected = "workflow",
            actual = data.snapshot?.element?.get(9)?.mapping?.get(0)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Definition.url",
            actual = data.snapshot?.element?.get(9)?.mapping?.get(0)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "w5",
            actual = data.snapshot?.element?.get(9)?.mapping?.get(1)?.identity
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "FiveWs.identifier",
            actual = data.snapshot?.element?.get(9)?.mapping?.get(1)?.map
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.snapshot?.element?.get(9)?.max
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.snapshot?.element?.get(9)?.min?.value
        )

        assertEquals(
            expected = "ExampleScenario.url",
            actual = data.snapshot?.element?.get(9)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Allows the example scenario to be referenced by a single globally unique identifier.",
            actual = data.snapshot?.element?.get(9)?.requirements
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Canonical identifier for this example scenario, represented as a URI (globally unique)",
            actual = data.snapshot?.element?.get(9)?.short
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "uri",
            actual = data.snapshot?.element?.get(9)?.type?.get(0)?.code
                ?.replace("\n", " ")
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
            expected = "ExampleScenario",
            actual = data.type
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/ExampleScenario",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testStructureDefinition03() {
        // Given
        val sourceJson = loadAsString("r4/structuredefinition-example-composition.json")

        // When
        val data = parser.toFhir(StructureDefinition::class, sourceJson)

        // Then
        assertStructureDefinition03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertStructureDefinition03Step01(data: StructureDefinition) {

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.abstrakt?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/Composition",
            actual = data.baseDefinition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2018-11-05T17:47:00+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = TypeDerivationRule.CONSTRAINT,
            actual = data.derivation
        )

        assertEquals(
            expected = "Composition",
            actual = data.differential?.element?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition",
            actual = data.differential?.element?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Slice by .section.code",
            actual = data.differential?.element?.get(1)?.slicing?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.differential?.element?.get(1)?.slicing?.discriminator?.get(0)?.path
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(2)?.min?.value
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "procedure",
            actual = data.differential?.element?.get(2)?.sliceName
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "BackboneElement",
            actual = data.differential?.element?.get(2)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/document-section-library",
            actual = data.differential?.element?.get(2)?.type?.get(0)?.profile?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:medications",
            actual = data.differential?.element?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.differential?.element?.get(3)?.min?.value
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medications",
            actual = data.differential?.element?.get(3)?.sliceName
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "BackboneElement",
            actual = data.differential?.element?.get(3)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/document-section-library",
            actual = data.differential?.element?.get(3)?.type?.get(0)?.profile?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition.section:plan",
            actual = data.differential?.element?.get(4)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0".toLong(),
            actual = data.differential?.element?.get(4)?.min?.value
        )

        assertEquals(
            expected = "Composition.section",
            actual = data.differential?.element?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "plan",
            actual = data.differential?.element?.get(4)?.sliceName
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "BackboneElement",
            actual = data.differential?.element?.get(4)?.type?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/document-section-library",
            actual = data.differential?.element?.get(4)?.type?.get(0)?.profile?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-composition",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = StructureDefinitionKind.COMPLEX_TYPE,
            actual = data.kind
        )

        assertEquals(
            expected = "DocumentStructure",
            actual = data.name
                ?.replace("\n", " ")
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
            expected = "Document Structure (For testing section templates)",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Composition",
            actual = data.type
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/example-composition",
            actual = data.url
                ?.replace("\n", " ")
        )
    }
}
