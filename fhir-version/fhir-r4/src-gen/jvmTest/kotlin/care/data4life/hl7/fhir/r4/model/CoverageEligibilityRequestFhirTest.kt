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
import care.data4life.hl7.fhir.r4.codesystem.EligibilityRequestPurpose
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CoverageEligibilityRequestTest.java
 *
 * CoverageEligibilityRequest resource
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for
 * them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether
 * the stated coverage is valid and in-force and optionally to provide the insurance details of the
 * policy.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CoverageEligibilityRequestFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testCoverageEligibilityRequest01() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityrequest-example.json")

        // When
        val data = parser.toFhir(CoverageEligibilityRequest::class, sourceJson)

        // Then
        assertCoverageEligibilityRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverageEligibilityRequest01Step01(data: CoverageEligibilityRequest) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "52345",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/coverageelegibilityrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EligibilityRequestPurpose.VALIDATION,
            actual = data.purpose?.get(0)
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCoverageEligibilityRequest02() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityrequest-example-2.json")

        // When
        val data = parser.toFhir(CoverageEligibilityRequest::class, sourceJson)

        // Then
        assertCoverageEligibilityRequest02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverageEligibilityRequest02Step01(data: CoverageEligibilityRequest) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "http://happyvalleyclinic.com/staff",
            actual = data.enterer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14",
            actual = data.enterer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://statecliniclicensor.com/clinicid",
            actual = data.facility?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "G35B9",
            actual = data.facility?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52346",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/coverageelegibilityrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "52346",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NB8742",
            actual = data.insurance?.get(0)?.businessArrangement
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "69",
            actual = data.item?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Maternity",
            actual = data.item?.get(0)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.item?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EligibilityRequestPurpose.VALIDATION,
            actual = data.purpose?.get(0)
        )

        assertEquals(
            expected = EligibilityRequestPurpose.BENEFITS,
            actual = data.purpose?.get(1)
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.servicedDate?.value.toString()
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
