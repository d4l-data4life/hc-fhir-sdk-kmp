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
import care.data4life.hl7.fhir.r4.codesystem.ExplanationOfBenefitStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.NoteType
import care.data4life.hl7.fhir.r4.codesystem.Use
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ExplanationOfBenefitTest {

    val parser = FhirR4Parser()

    @Test
    fun testExplanationOfBenefit01() {
        // Given
        val sourceJson = loadAsString("r4/explanationofbenefit-example.json")

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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Claim/100150",
            actual = data.claim?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ClaimResponse/R3500",
            actual = data.claimResponse?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Claim settled as per contract.",
            actual = data.disposition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.enterer?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.facility?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "EB3500",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/explanationofbenefit",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "987654321",
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
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "Organization/3",
            actual = data.insurer?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "120.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.8".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "96.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.item?.get(0)?.encounter?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "1205",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-USCLS",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "Device/example",
            actual = data.item?.get(0)?.udi?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "180.0".toDouble(),
            actual = data.item?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(1)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.detail?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "180.0".toDouble(),
            actual = data.item?.get(1)?.detail?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(1)?.detail?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.detail?.get(0)?.net?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.item?.get(1)?.detail?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "group",
            actual = data.item?.get(1)?.detail?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(1)?.detail?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.9".toDouble(),
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "180.0".toDouble(),
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.net?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "1205",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-USCLS",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Device/example",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.udi?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.unitPrice?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "Device/example",
            actual = data.item?.get(1)?.detail?.get(0)?.udi?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.net?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.item?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "group",
            actual = data.item?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(1)?.servicedDate?.value.toString()
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
            expected = "Organization/2",
            actual = data.payee?.party?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payeetype",
            actual = data.payee?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.provider?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ExplanationOfBenefitStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ExplanationOfBenefit</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(0)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.total?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "submitted",
            actual = data.total?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(1)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "96.0".toDouble(),
            actual = data.total?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.total?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testExplanationOfBenefit02() {
        // Given
        val sourceJson = loadAsString("r4/explanationofbenefit-example-2.json")

        // When
        val data = parser.toFhir(ExplanationOfBenefit::class, sourceJson)

        // Then
        assertExplanationOfBenefit02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertExplanationOfBenefit02Step01(data: ExplanationOfBenefit) {

        assertEquals(
            expected = "2014-02-14",
            actual = data.accident?.date?.value.toString()
        )

        assertEquals(
            expected = "Location/ph",
            actual = data.accident?.locationReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SPT",
            actual = data.accident?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.accident?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-03-01",
            actual = data.billablePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-02-01",
            actual = data.billablePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Claim/100150",
            actual = data.claim?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ClaimResponse/R3500",
            actual = data.claimResponse?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Could not process.",
            actual = data.disposition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.enterer?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.facility?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.formCode?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/forms-codes",
            actual = data.formCode?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "EB3501",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/explanationofbenefit",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "error-1",
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
            actual = data.insurance?.get(0)?.focal?.value
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
            expected = "MedicationRequest/medrx0301",
            actual = data.originalPrescription?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ClaimProcessingCodes.ERROR,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.precedence?.value
        )

        assertEquals(
            expected = "MedicationRequest/medrx002",
            actual = data.prescription?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-02-14",
            actual = data.procedure?.get(0)?.date?.value.toString()
        )

        assertEquals(
            expected = "123001",
            actual = data.procedure?.get(0)?.procedureCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/ex-icd-10-procedures",
            actual = data.procedure?.get(0)?.procedureCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.procedure?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Device/example",
            actual = data.procedure?.get(0)?.udi?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "en-CA",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.processNote?.get(0)?.number?.value
        )

        assertEquals(
            expected = "Invalid claim",
            actual = data.processNote?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NoteType.DISPLAY,
            actual = data.processNote?.get(0)?.type
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.provider?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/case-number",
            actual = data.related?.get(0)?.reference?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "23-56Tu-XX-47-20150M14",
            actual = data.related?.get(0)?.reference?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ExplanationOfBenefitStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "emergency",
            actual = data.subType?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-claimsubtype",
            actual = data.subType?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "employmentimpacted",
            actual = data.supportingInfo?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            actual = data.supportingInfo?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.supportingInfo?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-02-28",
            actual = data.supportingInfo?.get(0)?.timingPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-02-14",
            actual = data.supportingInfo?.get(0)?.timingPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "hospitalized",
            actual = data.supportingInfo?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            actual = data.supportingInfo?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.supportingInfo?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "2014-02-16",
            actual = data.supportingInfo?.get(1)?.timingPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-02-14",
            actual = data.supportingInfo?.get(1)?.timingPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(0)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2478.57".toDouble(),
            actual = data.total?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "submitted",
            actual = data.total?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(1)?.amount?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.0".toDouble(),
            actual = data.total?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.total?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }
}
