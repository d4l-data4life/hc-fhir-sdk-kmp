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
        assertEquals(
            "Nancy Nurse",
            data.author?.display
        )
        assertEquals(
            "Practitioner/example",
            data.author?.reference
        )
        assertEquals(
            "safety",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Safety",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/flag-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Safety",
            data.category?.get(0)?.text
        )
        assertEquals(
            "bigdog",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Big dog",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/local",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Patient has a big dog at his home. Always always wear a suit of armor or take other active counter-measures",
            data.code?.text
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "12345",
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
            "2016-12-01",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2015-01-17",
            data.period?.start?.value.toString()
        )
        assertEquals(
            FlagStatus.INACTIVE,
            data.status
        )
        assertEquals(
            "Peter Patient",
            data.subject?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Large Dog warning for Peter Patient</div>",
            data.text?.div
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
    fun testFlag02() {
        // Given
        val sourceJson = loadAsString("r4/flag-example-encounter.json")

        // When
        val data = parser.toFhir(Flag::class, sourceJson)

        // Then
        assertEquals(
            "infection",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Infection Control Level",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/local",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "l3",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Follow Level 3 Protocol",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/local/if1",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "example-encounter",
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
            FlagStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Peter Patient",
            data.subject?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Follow Infection Control Level 3 Protocol</div>",
            data.text?.div
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
