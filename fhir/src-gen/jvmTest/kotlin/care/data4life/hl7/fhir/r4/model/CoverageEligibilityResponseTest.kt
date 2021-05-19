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
import care.data4life.hl7.fhir.r4.codesystem.EligibilityResponsePurpose
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CoverageEligibilityResponseTest.java
 *
 * CoverageEligibilityResponse resource
 *
 * This resource provides eligibility and plan details from the processing of an
 * CoverageEligibilityRequest resource.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CoverageEligibilityResponseTest {

    val parser = FhirR4Parser()

    @Test
    fun testCoverageEligibilityResponse01() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityresponse-example.json")

        // When
        val data = parser.toFhir(CoverageEligibilityResponse::class, sourceJson)

        // Then
        assertCoverageEligibilityResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverageEligibilityResponse01Step01(data: CoverageEligibilityResponse) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Policy is currently in-force.",
            actual = data.disposition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "E2500",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "881234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.inforce?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EligibilityResponsePurpose.VALIDATION,
            actual = data.purpose?.get(0)
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityrequest/225476332402",
            actual = data.request?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCoverageEligibilityResponse02() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityresponse-example-error.json")

        // When
        val data = parser.toFhir(CoverageEligibilityResponse::class, sourceJson)

        // Then
        assertCoverageEligibilityResponse02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverageEligibilityResponse02Step01(data: CoverageEligibilityResponse) {

        assertEquals(
            expected = "2014-09-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Eligibiliy request could not be processed, please address errors before submitting.",
            actual = data.disposition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "a001",
            actual = data.error?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/adjudication-error",
            actual = data.error?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ELRSP/2017/01",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://national.org/form",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "E2503",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "8812343",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
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
            expected = ClaimProcessingCodes.ERROR,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EligibilityResponsePurpose.VALIDATION,
            actual = data.purpose?.get(0)
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse/225476332406",
            actual = data.request?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://national.org/clinic",
            actual = data.requestor?.identifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "OR1234",
            actual = data.requestor?.identifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCoverageEligibilityResponse03() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityresponse-example-benefits-2.json")

        // When
        val data = parser.toFhir(CoverageEligibilityResponse::class, sourceJson)

        // Then
        assertCoverageEligibilityResponse03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverageEligibilityResponse03Step01(data: CoverageEligibilityResponse) {

        assertEquals(
            expected = "coverage-1",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-09-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Policy is currently in-force.",
            actual = data.disposition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ELRSP/2017/01",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://national.org/form",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "E2502",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "8812342",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#coverage-1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.inforce?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "500000".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.usedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3748.0".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.usedMoney?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "copay-maximum",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "20".toLong(),
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.allowedUnsignedInt?.value
        )

        assertEquals(
            expected = "copay-percent",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "30",
            actual = data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health Benefit Plan Coverage",
            actual = data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "15000".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "69",
            actual = data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Maternity",
            actual = data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2000".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "F3",
            actual = data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Dental Coverage",
            actual = data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "F6",
            actual = data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vision products and services such as exams, glasses and contact lenses.",
            actual = data.insurance?.get(0)?.item?.get(3)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.item?.get(3)?.excluded?.value
        )

        assertEquals(
            expected = "Vision",
            actual = data.insurance?.get(0)?.item?.get(3)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EligibilityResponsePurpose.VALIDATION,
            actual = data.purpose?.get(0)
        )

        assertEquals(
            expected = EligibilityResponsePurpose.BENEFITS,
            actual = data.purpose?.get(1)
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityrequest/225476332405",
            actual = data.request?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://national.org/clinic",
            actual = data.requestor?.identifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "OR1234",
            actual = data.requestor?.identifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCoverageEligibilityResponse04() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityresponse-example-benefits.json")

        // When
        val data = parser.toFhir(CoverageEligibilityResponse::class, sourceJson)

        // Then
        assertCoverageEligibilityResponse04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverageEligibilityResponse04Step01(data: CoverageEligibilityResponse) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Policy is currently in-force.",
            actual = data.disposition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "E2501",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "881234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.inforce?.value
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "500000".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "copay-maximum",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "20".toLong(),
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.allowedUnsignedInt?.value
        )

        assertEquals(
            expected = "copay-percent",
            actual = data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "30",
            actual = data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health Benefit Plan Coverage",
            actual = data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "15000".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "69",
            actual = data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Maternity",
            actual = data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2000".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "F3",
            actual = data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Dental Coverage",
            actual = data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.item?.get(3)?.benefit?.get(0)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "400".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(3)?.benefit?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(3)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "F6",
            actual = data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(3)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(3)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.item?.get(3)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(3)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(3)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(3)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "shared",
            actual = data.insurance?.get(0)?.item?.get(4)?.benefit?.get(0)?.allowedString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "room",
            actual = data.insurance?.get(0)?.item?.get(4)?.benefit?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.item?.get(4)?.benefit?.get(1)?.allowedMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "600".toDouble(),
            actual = data.insurance?.get(0)?.item?.get(4)?.benefit?.get(1)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.item?.get(4)?.benefit?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "49",
            actual = data.insurance?.get(0)?.item?.get(4)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Hospital Room and Board",
            actual = data.insurance?.get(0)?.item?.get(4)?.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            actual = data.insurance?.get(0)?.item?.get(4)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.item?.get(4)?.network?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-network",
            actual = data.insurance?.get(0)?.item?.get(4)?.network?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "day",
            actual = data.insurance?.get(0)?.item?.get(4)?.term?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-term",
            actual = data.insurance?.get(0)?.item?.get(4)?.term?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.item?.get(4)?.unit?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/benefit-unit",
            actual = data.insurance?.get(0)?.item?.get(4)?.unit?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EligibilityResponsePurpose.VALIDATION,
            actual = data.purpose?.get(0)
        )

        assertEquals(
            expected = EligibilityResponsePurpose.BENEFITS,
            actual = data.purpose?.get(1)
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse/225476332402",
            actual = data.request?.reference
                ?.replace("\n", " ")
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
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
