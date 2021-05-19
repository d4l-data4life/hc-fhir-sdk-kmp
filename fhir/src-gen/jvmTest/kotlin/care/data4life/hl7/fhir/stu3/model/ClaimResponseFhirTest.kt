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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ClaimResponseTest.java
 *
 * Remittance resource
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ClaimResponseFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testClaimResponse01() {
        // Given
        val sourceJson = loadAsString("stu3/claimresponse-example.json")

        // When
        val data = parser.toFhir(ClaimResponse::class, sourceJson)

        // Then
        assertClaimResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaimResponse01Step01(data: ClaimResponse) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Claim settled as per contract.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3500",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/remittance",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3500",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.jurisdiction.org/insurers",
            actual = data.insurer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "555123",
            actual = data.insurer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "copay",
            actual = data.item?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(2)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(3)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.item?.get(0)?.adjudication?.get(3)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.47".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(3)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.adjudication?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequenceLinkId?.value
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
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payeeType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/payeetype",
            actual = data.payeeType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.payment?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.payment?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.47".toDouble(),
            actual = data.payment?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-31",
            actual = data.payment?.date?.value.toString()
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/paymentidentifier",
            actual = data.payment?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "201408-2-1569478",
            actual = data.payment?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.payment?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-paymenttype",
            actual = data.payment?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/oralhealthclaim/15476332402",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.requestProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ClaimResponse</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.totalBenefit?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.totalBenefit?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.47".toDouble(),
            actual = data.totalBenefit?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.totalCost?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.totalCost?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.totalCost?.value?.value
        )
    }
}
