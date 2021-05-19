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
import care.data4life.hl7.fhir.r4.codesystem.FlagStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * FlagTest.java
 *
 * Key information to flag to healthcare providers
 *
 * Prospective warnings of potential issues when providing care to the patient.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class FlagTest {

    val parser = FhirR4Parser()

    @Test
    fun testFlag01() {
        // Given
        val sourceJson = loadAsString("r4/flag-example.json")

        // When
        val data = parser.toFhir(Flag::class, sourceJson)

        // Then
        assertFlag01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertFlag01Step01(data: Flag) {

        assertEquals(
            expected = "Nancy Nurse",
            actual = data.author?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.author?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "safety",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Safety",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/flag-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Safety",
            actual = data.category?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "bigdog",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Big dog",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/local",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient has a big dog at his home. Always always wear a suit of armor or take other active counter-measures",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-12-01",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-01-17",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = FlagStatus.INACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter Patient",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Large Dog warning for Peter Patient</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testFlag02() {
        // Given
        val sourceJson = loadAsString("r4/flag-example-encounter.json")

        // When
        val data = parser.toFhir(Flag::class, sourceJson)

        // Then
        assertFlag02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertFlag02Step01(data: Flag) {

        assertEquals(
            expected = "infection",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Infection Control Level",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/local",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "l3",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Follow Level 3 Protocol",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/local/if1",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example-encounter",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FlagStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter Patient",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Follow Infection Control Level 3 Protocol</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
