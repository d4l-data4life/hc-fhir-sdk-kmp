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
class CoverageEligibilityRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testCoverageEligibilityRequest01() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityrequest-example.json")

        // When
        val data = parser.toFhir(CoverageEligibilityRequest::class, sourceJson)

        // Then
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "52345",
            data.id
        )
        assertEquals(
            "http://happyvalley.com/coverageelegibilityrequest",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "52345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Coverage/9876B1",
            data.insurance?.get(0)?.coverage?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.insurance?.get(0)?.focal?.value
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
            "Patient/pat1",
            data.patient?.reference
        )
        assertEquals(
            "normal",
            data.priority?.coding?.get(0)?.code
        )
        assertEquals(
            "Organization/1",
            data.provider?.reference
        )
        assertEquals(
            EligibilityRequestPurpose.VALIDATION,
            data.purpose?.get(0)
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityRequest</div>",
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
    fun testCoverageEligibilityRequest02() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityrequest-example-2.json")

        // When
        val data = parser.toFhir(CoverageEligibilityRequest::class, sourceJson)

        // Then
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "http://happyvalleyclinic.com/staff",
            data.enterer?.identifier?.system
        )
        assertEquals(
            "14",
            data.enterer?.identifier?.value
        )
        assertEquals(
            "http://statecliniclicensor.com/clinicid",
            data.facility?.identifier?.system
        )
        assertEquals(
            "G35B9",
            data.facility?.identifier?.value
        )
        assertEquals(
            "52346",
            data.id
        )
        assertEquals(
            "http://happyvalley.com/coverageelegibilityrequest",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "52346",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "NB8742",
            data.insurance?.get(0)?.businessArrangement
        )
        assertEquals(
            "Coverage/9876B1",
            data.insurance?.get(0)?.coverage?.reference
        )
        assertEquals(
            "Organization/2",
            data.insurer?.reference
        )
        assertEquals(
            "69",
            data.item?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Maternity",
            data.item?.get(0)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.item?.get(0)?.category?.coding?.get(0)?.system
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
            "Patient/pat1",
            data.patient?.reference
        )
        assertEquals(
            "normal",
            data.priority?.coding?.get(0)?.code
        )
        assertEquals(
            "Organization/1",
            data.provider?.reference
        )
        assertEquals(
            EligibilityRequestPurpose.VALIDATION,
            data.purpose?.get(0)
        )
        assertEquals(
            EligibilityRequestPurpose.BENEFITS,
            data.purpose?.get(1)
        )
        assertEquals(
            "2014-09-17",
            data.servicedDate?.value.toString()
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityRequest</div>",
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
