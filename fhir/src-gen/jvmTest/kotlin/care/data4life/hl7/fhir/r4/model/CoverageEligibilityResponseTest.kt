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
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "Policy is currently in-force.",
            data.disposition
        )
        assertEquals(
            "E2500",
            data.id
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "881234",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Coverage/9876B1",
            data.insurance?.get(0)?.coverage?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.insurance?.get(0)?.inforce?.value
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
            ClaimProcessingCodes.COMPLETE,
            data.outcome
        )
        assertEquals(
            "Patient/pat1",
            data.patient?.reference
        )
        assertEquals(
            EligibilityResponsePurpose.VALIDATION,
            data.purpose?.get(0)
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityrequest/225476332402",
            data.request?.reference
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
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
    fun testCoverageEligibilityResponse02() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityresponse-example-error.json")

        // When
        val data = parser.toFhir(CoverageEligibilityResponse::class, sourceJson)

        // Then
        assertEquals(
            "2014-09-16",
            data.created?.value.toString()
        )
        assertEquals(
            "Eligibiliy request could not be processed, please address errors before submitting.",
            data.disposition
        )
        assertEquals(
            "a001",
            data.error?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/adjudication-error",
            data.error?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "ELRSP/2017/01",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "http://national.org/form",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "E2503",
            data.id
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "8812343",
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
            ClaimProcessingCodes.ERROR,
            data.outcome
        )
        assertEquals(
            "Patient/f201",
            data.patient?.reference
        )
        assertEquals(
            EligibilityResponsePurpose.VALIDATION,
            data.purpose?.get(0)
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse/225476332406",
            data.request?.reference
        )
        assertEquals(
            "http://national.org/clinic",
            data.requestor?.identifier?.system
        )
        assertEquals(
            "OR1234",
            data.requestor?.identifier?.value
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
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
    fun testCoverageEligibilityResponse03() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityresponse-example-benefits-2.json")

        // When
        val data = parser.toFhir(CoverageEligibilityResponse::class, sourceJson)

        // Then
        assertEquals(
            "coverage-1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "2014-09-16",
            data.created?.value.toString()
        )
        assertEquals(
            "Policy is currently in-force.",
            data.disposition
        )
        assertEquals(
            "ELRSP/2017/01",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "http://national.org/form",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "E2502",
            data.id
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "8812342",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "#coverage-1",
            data.insurance?.get(0)?.coverage?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.insurance?.get(0)?.inforce?.value
        )
        assertEquals(
            "USD",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.currency
        )
        assertEquals(
            "500000".toDouble(),
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "USD",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.usedMoney?.currency
        )
        assertEquals(
            "3748.0".toDouble(),
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.usedMoney?.value?.value
        )
        assertEquals(
            "USD",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.currency
        )
        assertEquals(
            "100".toDouble(),
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.value?.value
        )
        assertEquals(
            "copay-maximum",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "20".toLong(),
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.allowedUnsignedInt?.value
        )
        assertEquals(
            "copay-percent",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "30",
            data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Health Benefit Plan Coverage",
            data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "annual",
            data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.system
        )
        assertEquals(
            "USD",
            data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.currency
        )
        assertEquals(
            "15000".toDouble(),
            data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "69",
            data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Maternity",
            data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "annual",
            data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.system
        )
        assertEquals(
            "USD",
            data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.currency
        )
        assertEquals(
            "2000".toDouble(),
            data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "F3",
            data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Dental Coverage",
            data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "annual",
            data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.system
        )
        assertEquals(
            "F6",
            data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Vision Coverage",
            data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "Vision products and services such as exams, glasses and contact lenses.",
            data.insurance?.get(0)?.item?.get(3)?.description
        )
        assertEquals(
            "True".toBoolean(),
            data.insurance?.get(0)?.item?.get(3)?.excluded?.value
        )
        assertEquals(
            "Vision",
            data.insurance?.get(0)?.item?.get(3)?.name
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
            ClaimProcessingCodes.COMPLETE,
            data.outcome
        )
        assertEquals(
            "Patient/f201",
            data.patient?.reference
        )
        assertEquals(
            EligibilityResponsePurpose.VALIDATION,
            data.purpose?.get(0)
        )
        assertEquals(
            EligibilityResponsePurpose.BENEFITS,
            data.purpose?.get(1)
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityrequest/225476332405",
            data.request?.reference
        )
        assertEquals(
            "http://national.org/clinic",
            data.requestor?.identifier?.system
        )
        assertEquals(
            "OR1234",
            data.requestor?.identifier?.value
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
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
    fun testCoverageEligibilityResponse04() {
        // Given
        val sourceJson = loadAsString("r4/coverageeligibilityresponse-example-benefits.json")

        // When
        val data = parser.toFhir(CoverageEligibilityResponse::class, sourceJson)

        // Then
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "Policy is currently in-force.",
            data.disposition
        )
        assertEquals(
            "E2501",
            data.id
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "881234",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Coverage/9876B1",
            data.insurance?.get(0)?.coverage?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.insurance?.get(0)?.inforce?.value
        )
        assertEquals(
            "SAR",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.currency
        )
        assertEquals(
            "500000".toDouble(),
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "SAR",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.currency
        )
        assertEquals(
            "100".toDouble(),
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.allowedMoney?.value?.value
        )
        assertEquals(
            "copay-maximum",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "20".toLong(),
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.allowedUnsignedInt?.value
        )
        assertEquals(
            "copay-percent",
            data.insurance?.get(0)?.item?.get(0)?.benefit?.get(2)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "30",
            data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Health Benefit Plan Coverage",
            data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(0)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(0)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "annual",
            data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(0)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(0)?.unit?.coding?.get(0)?.system
        )
        assertEquals(
            "SAR",
            data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.currency
        )
        assertEquals(
            "15000".toDouble(),
            data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(1)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "69",
            data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Maternity",
            data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(1)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(1)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "annual",
            data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(1)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(1)?.unit?.coding?.get(0)?.system
        )
        assertEquals(
            "SAR",
            data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.currency
        )
        assertEquals(
            "2000".toDouble(),
            data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(2)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "F3",
            data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Dental Coverage",
            data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(2)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(2)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "annual",
            data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(2)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(2)?.unit?.coding?.get(0)?.system
        )
        assertEquals(
            "SAR",
            data.insurance?.get(0)?.item?.get(3)?.benefit?.get(0)?.allowedMoney?.currency
        )
        assertEquals(
            "400".toDouble(),
            data.insurance?.get(0)?.item?.get(3)?.benefit?.get(0)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(3)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "F6",
            data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Vision Coverage",
            data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(3)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(3)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(3)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "annual",
            data.insurance?.get(0)?.item?.get(3)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(3)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(3)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(3)?.unit?.coding?.get(0)?.system
        )
        assertEquals(
            "shared",
            data.insurance?.get(0)?.item?.get(4)?.benefit?.get(0)?.allowedString
        )
        assertEquals(
            "room",
            data.insurance?.get(0)?.item?.get(4)?.benefit?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "SAR",
            data.insurance?.get(0)?.item?.get(4)?.benefit?.get(1)?.allowedMoney?.currency
        )
        assertEquals(
            "600".toDouble(),
            data.insurance?.get(0)?.item?.get(4)?.benefit?.get(1)?.allowedMoney?.value?.value
        )
        assertEquals(
            "benefit",
            data.insurance?.get(0)?.item?.get(4)?.benefit?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "49",
            data.insurance?.get(0)?.item?.get(4)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Hospital Room and Board",
            data.insurance?.get(0)?.item?.get(4)?.category?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-benefitcategory",
            data.insurance?.get(0)?.item?.get(4)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "in",
            data.insurance?.get(0)?.item?.get(4)?.network?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-network",
            data.insurance?.get(0)?.item?.get(4)?.network?.coding?.get(0)?.system
        )
        assertEquals(
            "day",
            data.insurance?.get(0)?.item?.get(4)?.term?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-term",
            data.insurance?.get(0)?.item?.get(4)?.term?.coding?.get(0)?.system
        )
        assertEquals(
            "individual",
            data.insurance?.get(0)?.item?.get(4)?.unit?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/benefit-unit",
            data.insurance?.get(0)?.item?.get(4)?.unit?.coding?.get(0)?.system
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
            ClaimProcessingCodes.COMPLETE,
            data.outcome
        )
        assertEquals(
            "Patient/pat1",
            data.patient?.reference
        )
        assertEquals(
            EligibilityResponsePurpose.VALIDATION,
            data.purpose?.get(0)
        )
        assertEquals(
            EligibilityResponsePurpose.BENEFITS,
            data.purpose?.get(1)
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/coverageeligibilityresponse/225476332402",
            data.request?.reference
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
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the CoverageEligibilityResponse.</div>",
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
