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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * EligibilityResponseTest.java
 *
 * EligibilityResponse resource
 *
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EligibilityResponseFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testEligibilityResponse01() {
        // Given
        val sourceJson = loadAsString("stu3/eligibilityresponse-example-benefits-2.json")

        // When
        val data = parser.toFhir(EligibilityResponse::class, sourceJson)

        // Then
        assertEligibilityResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEligibilityResponse01Step01(data: EligibilityResponse) {
        assertEquals(
            expected = "patient-1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "coverage-1",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Policy is currently in-force.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ELRSP/2017/01",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://national.org/form",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "E2502",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8812342",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.inforce?.value
        )

        assertEquals(
            expected = "medical",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500000".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.usedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.usedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3748.0".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.usedMoney?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "copay-maximum",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20".toLong(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(2)?.allowedUnsignedInt?.value
        )

        assertEquals(
            expected = "copay-percent",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Health Benefit Plan Coverage",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medical",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15000".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "69",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Maternity",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "oral",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2000".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "F3",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dental Coverage",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vision",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision products and services such as exams, glasses and contatc lenses.",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.excluded?.value
        )

        assertEquals(
            expected = "Vision",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "F6",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/contract/NBU22547",
            actual = data.insurance?.get(0)?.contract?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#coverage-1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/remittance-outcome",
            actual = data.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibility/225476332405",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://national.org/clinic",
            actual = data.requestOrganization?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OR1234",
            actual = data.requestOrganization?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://national.org/provider",
            actual = data.requestProvider?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PR9876",
            actual = data.requestProvider?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEligibilityResponse02() {
        // Given
        val sourceJson = loadAsString("stu3/eligibilityresponse-example-error.json")

        // When
        val data = parser.toFhir(EligibilityResponse::class, sourceJson)

        // Then
        assertEligibilityResponse02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEligibilityResponse02Step01(data: EligibilityResponse) {
        assertEquals(
            expected = "2014-09-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Eligibiliy request could not be processed, please address errors before submitting.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a001",
            actual = data.error?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/adjudication-error",
            actual = data.error?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ELRSP/2017/01",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://national.org/form",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "E2503",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8812343",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "error",
            actual = data.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/remittance-outcome",
            actual = data.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibility/225476332406",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://national.org/clinic",
            actual = data.requestOrganization?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OR1234",
            actual = data.requestOrganization?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://national.org/provider",
            actual = data.requestProvider?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PR9876",
            actual = data.requestProvider?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEligibilityResponse03() {
        // Given
        val sourceJson = loadAsString("stu3/eligibilityresponse-example.json")

        // When
        val data = parser.toFhir(EligibilityResponse::class, sourceJson)

        // Then
        assertEligibilityResponse03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEligibilityResponse03Step01(data: EligibilityResponse) {
        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Policy is currently in-force.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "E2500",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "881234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.inforce?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/remittance-outcome",
            actual = data.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibility/225476332402",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEligibilityResponse04() {
        // Given
        val sourceJson = loadAsString("stu3/eligibilityresponse-example-benefits.json")

        // When
        val data = parser.toFhir(EligibilityResponse::class, sourceJson)

        // Then
        assertEligibilityResponse04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEligibilityResponse04Step01(data: EligibilityResponse) {
        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Policy is currently in-force.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "E2501",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibilityresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "881234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.inforce?.value
        )

        assertEquals(
            expected = "medical",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500000".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "copay-maximum",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20".toLong(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(2)?.allowedUnsignedInt?.value
        )

        assertEquals(
            expected = "copay-percent",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.financial?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Health Benefit Plan Coverage",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(0)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medical",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15000".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "69",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Maternity",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(1)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "oral",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2000".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "F3",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dental Coverage",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(2)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vision",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.financial?.get(0)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.financial?.get(0)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "400".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.financial?.get(0)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "F6",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "annual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(3)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vision",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-category",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "shared",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.financial?.get(0)?.allowedString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "room",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.financial?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SAR",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.financial?.get(1)?.allowedMoney?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.financial?.get(1)?.allowedMoney?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "600".toDouble(),
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.financial?.get(1)?.allowedMoney?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.financial?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "in",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.network?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-network",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.network?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "49",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.subCategory?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hospital Room and Board",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.subCategory?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-subcategory",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.subCategory?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "day",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.term?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-term",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.term?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "individual",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.unit?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/benefit-unit",
            actual = data.insurance?.get(0)?.benefitBalance?.get(4)?.unit?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/remittance-outcome",
            actual = data.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibility/225476332402",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the EligibilityResponse.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
