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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class BasicTest {

    val parser = FhirR4Parser()

    @Test
    fun testBasic01() {
        // Given
        val sourceJson = loadAsString("r4/basic-example2.json")

        // When
        val data = parser.toFhir(Basic::class, sourceJson)

        // Then
        assertEquals(
            "UMLCLASSMODEL",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-codes#resourceTypes",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "name",
            data.extension?.get(0)?.extension?.get(0)?.url
        )
        assertEquals(
            "Class1",
            data.extension?.get(0)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "name",
            data.extension?.get(0)?.extension?.get(1)?.extension?.get(0)?.url
        )
        assertEquals(
            "attribute1",
            data.extension?.get(0)?.extension?.get(1)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "minOccurs",
            data.extension?.get(0)?.extension?.get(1)?.extension?.get(1)?.url
        )
        assertEquals(
            "1".toInt(),
            data.extension?.get(0)?.extension?.get(1)?.extension?.get(1)?.valueInteger?.value
        )
        assertEquals(
            "maxOccurs",
            data.extension?.get(0)?.extension?.get(1)?.extension?.get(2)?.url
        )
        assertEquals(
            "*",
            data.extension?.get(0)?.extension?.get(1)?.extension?.get(2)?.valueCode
        )
        assertEquals(
            "attribute",
            data.extension?.get(0)?.extension?.get(1)?.url
        )
        assertEquals(
            "name",
            data.extension?.get(0)?.extension?.get(2)?.extension?.get(0)?.url
        )
        assertEquals(
            "attribute2",
            data.extension?.get(0)?.extension?.get(2)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "minOccurs",
            data.extension?.get(0)?.extension?.get(2)?.extension?.get(1)?.url
        )
        assertEquals(
            "0".toInt(),
            data.extension?.get(0)?.extension?.get(2)?.extension?.get(1)?.valueInteger?.value
        )
        assertEquals(
            "maxOccurs",
            data.extension?.get(0)?.extension?.get(2)?.extension?.get(2)?.url
        )
        assertEquals(
            "1".toInt(),
            data.extension?.get(0)?.extension?.get(2)?.extension?.get(2)?.valueInteger?.value
        )
        assertEquals(
            "attribute",
            data.extension?.get(0)?.extension?.get(2)?.url
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-extensions/UMLclass",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "classModel",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBasic02() {
        // Given
        val sourceJson = loadAsString("r4/basic-example-narrative.json")

        // When
        val data = parser.toFhir(Basic::class, sourceJson)

        // Then
        assertEquals(
            "Example Narrative Tester",
            data.code?.text
        )
        assertEquals(
            "basic-example-narrative",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testBasic03() {
        // Given
        val sourceJson = loadAsString("r4/basic-example.json")

        // When
        val data = parser.toFhir(Basic::class, sourceJson)

        // Then
        assertEquals(
            "Practitioner/example",
            data.author?.reference
        )
        assertEquals(
            "referral",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/basic-resource-type",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2013-05-14",
            data.created?.value.toString()
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-extensions/referral#requestingPractitioner",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "Dokter Bronsig",
            data.extension?.get(0)?.valueReference?.display
        )
        assertEquals(
            "Practitioner/f201",
            data.extension?.get(0)?.valueReference?.reference
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-extensions/referral#notes",
            data.extension?.get(1)?.url
        )
        assertEquals(
            "The patient had fever peaks over the last couple of days. He is worried about these peaks.",
            data.extension?.get(1)?.valueString
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-extensions/referral#fulfillingEncounter",
            data.extension?.get(2)?.url
        )
        assertEquals(
            "Encounter/f201",
            data.extension?.get(2)?.valueReference?.reference
        )
        assertEquals(
            "referral",
            data.id
        )
        assertEquals(
            "http://goodhealth.org/basic/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "19283746",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-extensions/referral#referredForService",
            data.modifierExtension?.get(0)?.url
        )
        assertEquals(
            "11429006",
            data.modifierExtension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Consultation",
            data.modifierExtension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.modifierExtension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-extensions/referral#targetDate",
            data.modifierExtension?.get(1)?.url
        )
        assertEquals(
            "2013-04-15",
            data.modifierExtension?.get(1)?.valuePeriod?.end?.value.toString()
        )
        assertEquals(
            "2013-04-01",
            data.modifierExtension?.get(1)?.valuePeriod?.start?.value.toString()
        )
        assertEquals(
            "http://example.org/do-not-use/fhir-extensions/referral#status",
            data.modifierExtension?.get(2)?.url
        )
        assertEquals(
            "complete",
            data.modifierExtension?.get(2)?.valueCode
        )
        assertEquals(
            "Roel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f201",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
