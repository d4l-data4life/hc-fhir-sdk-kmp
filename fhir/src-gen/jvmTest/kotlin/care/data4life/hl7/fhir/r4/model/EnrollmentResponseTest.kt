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
import care.data4life.hl7.fhir.r4.codesystem.ClaimProcessingCodes
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * EnrollmentResponseTest.java
 *
 * EnrollmentResponse resource
 *
 * This resource provides enrollment and plan details from the processing of an EnrollmentRequest
 * resource.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EnrollmentResponseTest {

    val parser = FhirR4Parser()

    @Test
    fun testEnrollmentResponse01() {
        // Given
        val sourceJson = loadAsString("r4/enrollmentresponse-example.json")

        // When
        val data = parser.toFhir(EnrollmentResponse::class, sourceJson)

        // Then
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "Dependant added to policy.",
            data.disposition
        )
        assertEquals(
            "ER2500",
            data.id
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/enrollmentresponse",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "781234",
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
            "Organization/2",
            data.organization?.reference
        )
        assertEquals(
            ClaimProcessingCodes.COMPLETE,
            data.outcome
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/eligibility/225476332402",
            data.request?.reference
        )
        assertEquals(
            "Organization/1",
            data.requestProvider?.reference
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EnrollmentResponse</div>",
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
