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
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * EnrollmentRequestTest.java
 *
 * Enroll in coverage
 *
 * This resource provides the insurance enrollment details to the insurer regarding a specified
 * coverage.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EnrollmentRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testEnrollmentRequest01() {
        // Given
        val sourceJson = loadAsString("r4/enrollmentrequest-example.json")

        // When
        val data = parser.toFhir(EnrollmentRequest::class, sourceJson)

        // Then
        assertEquals(
            "Patient/1",
            data.candidate?.reference
        )
        assertEquals(
            "Coverage/9876B1",
            data.coverage?.reference
        )
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "22345",
            data.id
        )
        assertEquals(
            "http://happyvalley.com/enrollmentrequest",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "EN22345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Organization/2",
            data.insurer?.reference
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
            "Organization/1",
            data.provider?.reference
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EnrollmentRequest.</div>",
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
