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
import care.data4life.hl7.fhir.stu3.codesystem.ExplanationOfBenefitStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ExplanationOfBenefitTest.java
 *
 * Explanation of Benefit resource
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and
 * optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ExplanationOfBenefitTest {

    val parser = FhirStu3Parser()

    @Test
    fun testExplanationOfBenefit01() {
        // Given
        val sourceJson = loadAsString("stu3/explanationofbenefit-example.json")

        // When
        val data = parser.toFhir(ExplanationOfBenefit::class, sourceJson)

        // Then
        assertExplanationOfBenefit01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertExplanationOfBenefit01Step01(data: ExplanationOfBenefit) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Claim/100150",
            actual = data.claim?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ClaimResponse/R3500",
            actual = data.claimResponse?.reference
                ?.replace("\\n", " ")
        )

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
            expected = "Practitioner/1",
            actual = data.enterer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.facility?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EB3500",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/explanationofbenefit",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "987654321",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.coverage?.reference
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
            expected = "120.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.8".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(2)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.item?.get(0)?.adjudication?.get(2)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "96.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamLinkId?.get(0)?.value
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.item?.get(0)?.encounter?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.item?.get(0)?.net?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "1200",
            actual = data.item?.get(0)?.service?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/service-uscls",
            actual = data.item?.get(0)?.service?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.item?.get(0)?.unitPrice?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.organization?.reference
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
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.payee?.party?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/payeetype",
            actual = data.payee?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ExplanationOfBenefitStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ExplanationOfBenefit</div>",
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
            expected = "96.0".toDouble(),
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

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-claimtype",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
