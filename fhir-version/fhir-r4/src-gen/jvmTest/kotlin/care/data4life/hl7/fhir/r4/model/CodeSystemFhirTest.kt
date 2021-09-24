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
import care.data4life.hl7.fhir.r4.codesystem.CodeSystemContentMode
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.FilterOperator
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PropertyType
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CodeSystemTest.java
 *
 * Declares the existence of and describes a code system or code system supplement
 *
 * The CodeSystem resource is used to declare the existence of and describe a code system or code
 * system supplement and its key properties, and optionally define a part or all of its content.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CodeSystemFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testCodeSystem01() {
        // Given
        val sourceJson = loadAsString("r4/codesystem-example-supplement.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then
        assertCodeSystem01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCodeSystem01Step01(data: CodeSystem) {

        assertEquals(
            expected = "chol-mmol",
            actual = data.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "legacy",
            actual = data.concept?.get(0)?.property?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.concept?.get(0)?.property?.get(0)?.valueBoolean?.value
        )

        assertEquals(
            expected = "chol-mass",
            actual = data.concept?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "legacy",
            actual = data.concept?.get(1)?.property?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.concept?.get(1)?.property?.get(0)?.valueBoolean?.value
        )

        assertEquals(
            expected = "chol",
            actual = data.concept?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "legacy",
            actual = data.concept?.get(2)?.property?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.concept?.get(2)?.property?.get(0)?.valueBoolean?.value
        )

        assertEquals(
            expected = "FHIR project team",
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
            expected = CodeSystemContentMode.SUPPLEMENT,
            actual = data.content
        )

        assertEquals(
            expected = "2016-01-28",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example-supplement",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CholCodeLegacyStatus",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "legacy",
            actual = data.property?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hether the test is currently performed",
            actual = data.property?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PropertyType.BOOLEAN,
            actual = data.property?.get(0)?.type
        )

        assertEquals(
            expected = "ACME Co",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/CodeSystem/example",
            actual = data.supplements
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/CodeSystem/example-supplement",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "201801103",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCodeSystem02() {
        // Given
        val sourceJson = loadAsString("r4/codesystem-list-example-codes.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then
        assertCodeSystem02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCodeSystem02Step01(data: CodeSystem) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.caseSensitive?.value
        )

        assertEquals(
            expected = "alerts",
            actual = data.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A list of alerts for the patient.",
            actual = data.concept?.get(0)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Alerts",
            actual = data.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "adverserxns",
            actual = data.concept?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A list of part adverse reactions.",
            actual = data.concept?.get(1)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adverse Reactions",
            actual = data.concept?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "allergies",
            actual = data.concept?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A list of Allergies for the patient.",
            actual = data.concept?.get(2)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Allergies",
            actual = data.concept?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medications",
            actual = data.concept?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A list of medication statements for the patient.",
            actual = data.concept?.get(3)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medication List",
            actual = data.concept?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "problems",
            actual = data.concept?.get(4)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A list of problems that the patient is known of have (or have had in the past).",
            actual = data.concept?.get(4)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Problem List",
            actual = data.concept?.get(4)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "worklist",
            actual = data.concept?.get(5)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A list of items that constitute a set of work to be performed (typically this code would be specialized for more specific uses, such as a ward round list).",
            actual = data.concept?.get(5)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Worklist",
            actual = data.concept?.get(5)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "waiting",
            actual = data.concept?.get(6)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A list of items waiting for an event (perhaps a surgical patient waiting list).",
            actual = data.concept?.get(6)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Waiting List",
            actual = data.concept?.get(6)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "protocols",
            actual = data.concept?.get(7)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A set of protocols to be followed.",
            actual = data.concept?.get(7)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Protocols",
            actual = data.concept?.get(7)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "plans",
            actual = data.concept?.get(8)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A set of care plans that apply in a particular context of care.",
            actual = data.concept?.get(8)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Care Plans",
            actual = data.concept?.get(8)?.display
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
            expected = CodeSystemContentMode.COMPLETE,
            actual = data.content
        )

        assertEquals(
            expected = "Example use codes for the List resource - typical kinds of use.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "draft",
            actual = data.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.extension?.get(2)?.valueInteger?.value
        )

        assertEquals(
            expected = "list-example-codes",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.642.4.1105",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2019-11-01T09:29:23.356+11:00",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablecodesystem",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ExampleUseCodesForList",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Project",
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
            expected = "Example Use Codes for List",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/list-example-use-codes",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/list-example-codes",
            actual = data.valueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCodeSystem03() {
        // Given
        val sourceJson = loadAsString("r4/codesystem-examplescenario-actor-type.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then
        assertCodeSystem03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCodeSystem03Step01(data: CodeSystem) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.caseSensitive?.value
        )

        assertEquals(
            expected = "person",
            actual = data.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A person.",
            actual = data.concept?.get(0)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Person",
            actual = data.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "entity",
            actual = data.concept?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A system.",
            actual = data.concept?.get(1)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System",
            actual = data.concept?.get(1)?.display
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
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = "fhir@lists.hl7.org",
            actual = data.contact?.get(0)?.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CodeSystemContentMode.COMPLETE,
            actual = data.content
        )

        assertEquals(
            expected = "2019-11-01T09:29:23+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "The type of actor - system or human.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir",
            actual = data.extension?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-standards-status",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "trial-use",
            actual = data.extension?.get(1)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.extension?.get(2)?.valueInteger?.value
        )

        assertEquals(
            expected = "examplescenario-actor-type",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.4.642.4.859",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2019-11-01T09:29:23.356+11:00",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "ExampleScenarioActorType",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 (FHIR Project)",
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
            expected = "ExampleScenarioActorType",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/examplescenario-actor-type",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/examplescenario-actor-type",
            actual = data.valueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCodeSystem04() {
        // Given
        val sourceJson = loadAsString("r4/codesystem-example-summary.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then
        assertCodeSystem04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCodeSystem04Step01(data: CodeSystem) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.caseSensitive?.value
        )

        assertEquals(
            expected = "FHIR project team",
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
            expected = CodeSystemContentMode.NOT_PRESENT,
            actual = data.content
        )

        assertEquals(
            expected = "92".toLong(),
            actual = data.count?.value
        )

        assertEquals(
            expected = "This is an example code system summary for the ACME codes for body site.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "summary",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CA",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Code system summary example for ACME body sites",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 International",
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
            expected = "http://hl7.org/fhir/CodeSystem/summary",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "species",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/CodeSystem/contexttype",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "337915000",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Homo sapiens (organism)",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCodeSystem05() {
        // Given
        val sourceJson = loadAsString("r4/codesystem-example.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then
        assertCodeSystem05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCodeSystem05Step01(data: CodeSystem) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.caseSensitive?.value
        )

        assertEquals(
            expected = "chol-mmol",
            actual = data.concept?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serum Cholesterol, in mmol/L",
            actual = data.concept?.get(0)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "internal-label",
            actual = data.concept?.get(0)?.designation?.get(0)?.use?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/config/fhir/codesystems/internal",
            actual = data.concept?.get(0)?.designation?.get(0)?.use?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "From ACME POC Testing",
            actual = data.concept?.get(0)?.designation?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SChol (mmol/L)",
            actual = data.concept?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "chol-mass",
            actual = data.concept?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serum Cholesterol, in mg/L",
            actual = data.concept?.get(1)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "internal-label",
            actual = data.concept?.get(1)?.designation?.get(0)?.use?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/config/fhir/codesystems/internal",
            actual = data.concept?.get(1)?.designation?.get(0)?.use?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "From Paragon Labs",
            actual = data.concept?.get(1)?.designation?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SChol (mg/L)",
            actual = data.concept?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "chol",
            actual = data.concept?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serum Cholesterol",
            actual = data.concept?.get(2)?.definition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "internal-label",
            actual = data.concept?.get(2)?.designation?.get(0)?.use?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/config/fhir/codesystems/internal",
            actual = data.concept?.get(2)?.designation?.get(0)?.use?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Obdurate Labs uses this with both kinds of units...",
            actual = data.concept?.get(2)?.designation?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SChol",
            actual = data.concept?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR project team",
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
            expected = CodeSystemContentMode.COMPLETE,
            actual = data.content
        )

        assertEquals(
            expected = "2016-01-28",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is an example code system that includes all the ACME codes for serum/plasma cholesterol from v2.36.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "acme-plasma",
            actual = data.filter?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "An internal filter used to select codes that are only used with plasma",
            actual = data.filter?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FilterOperator.EQUAL,
            actual = data.filter?.get(0)?.operator?.get(0)
        )

        assertEquals(
            expected = "the value of this filter is either 'true' or 'false'",
            actual = data.filter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/identifiers/codesystems",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "internal-cholesterol-inl",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/shareablecodesystem",
            actual = data.meta?.profile?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACMECholCodesBlood",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Co",
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
            expected = "ACME Codes for Cholesterol in Serum/Plasma",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/CodeSystem/example",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20160128",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
