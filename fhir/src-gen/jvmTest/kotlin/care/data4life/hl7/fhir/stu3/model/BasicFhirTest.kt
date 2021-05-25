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
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * BasicTest.java
 *
 * Resource for non-supported content
 *
 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map
 * to an existing resource, and custom resources not appropriate for inclusion in the FHIR
 * specification.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class BasicFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testBasic01() {
        // Given
        val sourceJson = loadAsString("stu3/basic-example2.json")

        // When
        val data = parser.toFhir(Basic::class, sourceJson)

        // Then
        assertBasic01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBasic01Step01(data: Basic) {

        assertEquals(
            expected = "UMLCLASSMODEL",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-codes#resourceTypes",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "name",
            actual = data.extension?.get(0)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Class1",
            actual = data.extension?.get(0)?.extension?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "name",
            actual = data.extension?.get(0)?.extension?.get(1)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "attribute1",
            actual = data.extension?.get(0)?.extension?.get(1)?.extension?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "minOccurs",
            actual = data.extension?.get(0)?.extension?.get(1)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.extension?.get(0)?.extension?.get(1)?.extension?.get(1)?.valueInteger?.value
        )

        assertEquals(
            expected = "maxOccurs",
            actual = data.extension?.get(0)?.extension?.get(1)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "*",
            actual = data.extension?.get(0)?.extension?.get(1)?.extension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "attribute",
            actual = data.extension?.get(0)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "name",
            actual = data.extension?.get(0)?.extension?.get(2)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "attribute2",
            actual = data.extension?.get(0)?.extension?.get(2)?.extension?.get(0)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "minOccurs",
            actual = data.extension?.get(0)?.extension?.get(2)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.extension?.get(0)?.extension?.get(2)?.extension?.get(1)?.valueInteger?.value
        )

        assertEquals(
            expected = "maxOccurs",
            actual = data.extension?.get(0)?.extension?.get(2)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.extension?.get(0)?.extension?.get(2)?.extension?.get(2)?.valueInteger?.value
        )

        assertEquals(
            expected = "attribute",
            actual = data.extension?.get(0)?.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-extensions/UMLclass",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "classModel",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testBasic02() {
        // Given
        val sourceJson = loadAsString("stu3/basic-example-narrative.json")

        // When
        val data = parser.toFhir(Basic::class, sourceJson)

        // Then
        assertBasic02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBasic02Step01(data: Basic) {

        assertEquals(
            expected = "Example Narrative Tester",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "basic-example-narrative",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testBasic03() {
        // Given
        val sourceJson = loadAsString("stu3/basic-example.json")

        // When
        val data = parser.toFhir(Basic::class, sourceJson)

        // Then
        assertBasic03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertBasic03Step01(data: Basic) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "referral",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/basic-resource-type",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-14",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-extensions/referral#requestingPractitioner",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dokter Bronsig",
            actual = data.extension?.get(0)?.valueReference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f201",
            actual = data.extension?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-extensions/referral#notes",
            actual = data.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The patient had fever peaks over the last couple of days. He is worried about these peaks.",
            actual = data.extension?.get(1)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-extensions/referral#fulfillingEncounter",
            actual = data.extension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/f201",
            actual = data.extension?.get(2)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "referral",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealth.org/basic/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "19283746",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-extensions/referral#referredForService",
            actual = data.modifierExtension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "11429006",
            actual = data.modifierExtension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Consultation",
            actual = data.modifierExtension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.modifierExtension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-extensions/referral#targetDate",
            actual = data.modifierExtension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-04-15",
            actual = data.modifierExtension?.get(1)?.valuePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-04-01",
            actual = data.modifierExtension?.get(1)?.valuePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "http://example.org/do-not-use/fhir-extensions/referral#status",
            actual = data.modifierExtension?.get(2)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.modifierExtension?.get(2)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
