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

package care.data4life.hl7.fhir.stu3.model


import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import care.data4life.hl7.fhir.stu3.codesystem.CodeSystemContentMode
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * CodeSystemTest.java
 *
 * A set of codes drawn from one or more code systems.
 *
 * A code system resource specifies a set of codes drawn from one or more code systems.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class CodeSystemTest {

    val parser = FhirStu3Parser()


    @Test
    fun testCodeSystem1() {
        // Given
        val sourceJson = loadAsString("stu3/codesystem-list-example-codes.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.caseSensitive?.value)
        assertEquals("alerts", data.concept?.get(0)?.code)
        assertEquals("A list of alerts for the patient.", data.concept?.get(0)?.definition)
        assertEquals("Alerts", data.concept?.get(0)?.display)
        assertEquals("adverserxns", data.concept?.get(1)?.code)
        assertEquals("A list of part adverse reactions.", data.concept?.get(1)?.definition)
        assertEquals("Adverse Reactions", data.concept?.get(1)?.display)
        assertEquals("allergies", data.concept?.get(2)?.code)
        assertEquals("A list of Allergies for the patient.", data.concept?.get(2)?.definition)
        assertEquals("Allergies", data.concept?.get(2)?.display)
        assertEquals("medications", data.concept?.get(3)?.code)
        assertEquals(
            "A list of medication statements for the patient.",
            data.concept?.get(3)?.definition
        )
        assertEquals("Medication List", data.concept?.get(3)?.display)
        assertEquals("problems", data.concept?.get(4)?.code)
        assertEquals(
            "A list of problems that the patient is known of have (or have had in the past).",
            data.concept?.get(4)?.definition
        )
        assertEquals("Problem List", data.concept?.get(4)?.display)
        assertEquals("worklist", data.concept?.get(5)?.code)
        assertEquals(
            "A list of items that constitute a set of work to be performed (typically this code would be specialized for more specific uses, such as a ward round list).",
            data.concept?.get(5)?.definition
        )
        assertEquals("Worklist", data.concept?.get(5)?.display)
        assertEquals("waiting", data.concept?.get(6)?.code)
        assertEquals(
            "A list of items waiting for an event (perhaps a surgical patient waiting list).",
            data.concept?.get(6)?.definition
        )
        assertEquals("Waiting List", data.concept?.get(6)?.display)
        assertEquals("protocols", data.concept?.get(7)?.code)
        assertEquals("A set of protocols to be followed.", data.concept?.get(7)?.definition)
        assertEquals("Protocols", data.concept?.get(7)?.display)
        assertEquals("plans", data.concept?.get(8)?.code)
        assertEquals(
            "A set of care plans that apply in a particular context of care.",
            data.concept?.get(8)?.definition
        )
        assertEquals("Care Plans", data.concept?.get(8)?.display)
        assertEquals(ContactPointSystem.URL, data.contact?.get(0)?.telecom?.get(0)?.system)
        assertEquals("http://hl7.org/fhir", data.contact?.get(0)?.telecom?.get(0)?.value)
        assertEquals(CodeSystemContentMode.COMPLETE, data.content)
        assertEquals(
            "Example use codes for the List resource - typical kinds of use.",
            data.description
        )
        assertEquals("True".toBoolean(), data.experimental?.value)
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-ballot-status",
            data.extension?.get(0)?.url
        )
        assertEquals("Informative", data.extension?.get(0)?.valueString)
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-fmm",
            data.extension?.get(1)?.url
        )
        assertEquals("1".toInt(), data.extension?.get(1)?.valueInteger?.value)
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/structuredefinition-wg",
            data.extension?.get(2)?.url
        )
        assertEquals("fhir", data.extension?.get(2)?.valueCode)
        assertEquals("list-example-codes", data.id)
        assertEquals("urn:ietf:rfc:3986", data.identifier?.system)
        assertEquals("urn:oid:2.16.840.1.113883.4.642.1.308", data.identifier?.value)
        assertEquals("2017-04-19T07:44:43.294+10:00", data.meta?.lastUpdated?.value.toString())
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablecodesystem",
            data.meta?.profile?.get(0)
        )
        assertEquals("Example Use Codes for List", data.name)
        assertEquals("FHIR Project", data.publisher)
        assertEquals(PublicationStatus.DRAFT, data.status)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("http://hl7.org/fhir/list-example-use-codes", data.url)
        assertEquals("http://hl7.org/fhir/ValueSet/list-example-codes", data.valueSet)
        assertEquals("3.0.1", data.version)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCodeSystem2() {
        // Given
        val sourceJson = loadAsString("stu3/codesystem-example-summary.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.caseSensitive?.value)
        assertEquals("FHIR project team", data.contact?.get(0)?.name)
        assertEquals(ContactPointSystem.URL, data.contact?.get(0)?.telecom?.get(0)?.system)
        assertEquals("http://hl7.org/fhir", data.contact?.get(0)?.telecom?.get(0)?.value)
        assertEquals(CodeSystemContentMode.NOT_PRESENT, data.content)
        assertEquals("92".toLong(), data.count?.value)
        assertEquals(
            "This is an example code system summary for the ACME codes for body site.",
            data.description
        )
        assertEquals("True".toBoolean(), data.experimental?.value)
        assertEquals("summary", data.id)
        assertEquals("CA", data.jurisdiction?.get(0)?.coding?.get(0)?.code)
        assertEquals("urn:iso:std:iso:3166", data.jurisdiction?.get(0)?.coding?.get(0)?.system)
        assertEquals("Code system summary example for ACME body sites", data.name)
        assertEquals("HL7 International", data.publisher)
        assertEquals(PublicationStatus.DRAFT, data.status)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("http://hl7.org/fhir/CodeSystem/summary", data.url)
        assertEquals("species", data.useContext?.get(0)?.code?.code)
        assertEquals(
            "http://example.org/CodeSystem/contexttype",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "337915000",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Homo sapiens (organism)",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCodeSystem3() {
        // Given
        val sourceJson = loadAsString("stu3/codesystem-example.json")

        // When
        val data = parser.toFhir(CodeSystem::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.caseSensitive?.value)
        assertEquals("chol-mmol", data.concept?.get(0)?.code)
        assertEquals("Serum Cholesterol, in mmol/L", data.concept?.get(0)?.definition)
        assertEquals("internal-label", data.concept?.get(0)?.designation?.get(0)?.use?.code)
        assertEquals(
            "http://acme.com/config/fhir/codesystems/internal",
            data.concept?.get(0)?.designation?.get(0)?.use?.system
        )
        assertEquals("From ACME POC Testing", data.concept?.get(0)?.designation?.get(0)?.value)
        assertEquals("SChol (mmol/L)", data.concept?.get(0)?.display)
        assertEquals("chol-mass", data.concept?.get(1)?.code)
        assertEquals("Serum Cholesterol, in mg/L", data.concept?.get(1)?.definition)
        assertEquals("internal-label", data.concept?.get(1)?.designation?.get(0)?.use?.code)
        assertEquals(
            "http://acme.com/config/fhir/codesystems/internal",
            data.concept?.get(1)?.designation?.get(0)?.use?.system
        )
        assertEquals("From Paragon Labs", data.concept?.get(1)?.designation?.get(0)?.value)
        assertEquals("SChol (mg/L)", data.concept?.get(1)?.display)
        assertEquals("chol", data.concept?.get(2)?.code)
        assertEquals("Serum Cholesterol", data.concept?.get(2)?.definition)
        assertEquals("internal-label", data.concept?.get(2)?.designation?.get(0)?.use?.code)
        assertEquals(
            "http://acme.com/config/fhir/codesystems/internal",
            data.concept?.get(2)?.designation?.get(0)?.use?.system
        )
        assertEquals(
            "Obdurate Labs uses this with both kinds of units...",
            data.concept?.get(2)?.designation?.get(0)?.value
        )
        assertEquals("SChol", data.concept?.get(2)?.display)
        assertEquals("FHIR project team", data.contact?.get(0)?.name)
        assertEquals(ContactPointSystem.URL, data.contact?.get(0)?.telecom?.get(0)?.system)
        assertEquals("http://hl7.org/fhir", data.contact?.get(0)?.telecom?.get(0)?.value)
        assertEquals(CodeSystemContentMode.COMPLETE, data.content)
        assertEquals("2016-01-28", data.date?.value.toString())
        assertEquals(
            "This is an example code system that includes all the ACME codes for serum/plasma cholesterol from v2.36.",
            data.description
        )
        assertEquals("True".toBoolean(), data.experimental?.value)
        assertEquals("example", data.id)
        assertEquals("http://acme.com/identifiers/codesystems", data.identifier?.system)
        assertEquals("internal-cholesterol-inl", data.identifier?.value)
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/shareablecodesystem",
            data.meta?.profile?.get(0)
        )
        assertEquals("ACME Codes for Cholesterol in Serum/Plasma", data.name)
        assertEquals("HL7 International", data.publisher)
        assertEquals(PublicationStatus.DRAFT, data.status)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("http://hl7.org/fhir/CodeSystem/example", data.url)
        assertEquals("20160128", data.version)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}


