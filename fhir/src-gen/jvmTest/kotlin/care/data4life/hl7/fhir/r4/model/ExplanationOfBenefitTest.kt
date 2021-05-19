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
        assertEquals(
            "Practitioner/example",
            data.careTeam?.get(0)?.provider?.reference
        )
        assertEquals(
            "1".toLong(),
            data.careTeam?.get(0)?.sequence?.value
        )
        assertEquals(
            "Claim/100150",
            data.claim?.reference
        )
        assertEquals(
            "ClaimResponse/R3500",
            data.claimResponse?.reference
        )
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "Claim settled as per contract.",
            data.disposition
        )
        assertEquals(
            "Practitioner/1",
            data.enterer?.reference
        )
        assertEquals(
            "Location/1",
            data.facility?.reference
        )
        assertEquals(
            "EB3500",
            data.id
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/explanationofbenefit",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "987654321",
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
            "Organization/3",
            data.insurer?.reference
        )
        assertEquals(
            "USD",
            data.item?.get(0)?.adjudication?.get(0)?.amount?.currency
        )
        assertEquals(
            "120.0".toDouble(),
            data.item?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "eligible",
            data.item?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "eligpercent",
            data.item?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "0.8".toDouble(),
            data.item?.get(0)?.adjudication?.get(1)?.value?.value
        )
        assertEquals(
            "USD",
            data.item?.get(0)?.adjudication?.get(2)?.amount?.currency
        )
        assertEquals(
            "96.0".toDouble(),
            data.item?.get(0)?.adjudication?.get(2)?.amount?.value?.value
        )
        assertEquals(
            "benefit",
            data.item?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "1".toLong(),
            data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )
        assertEquals(
            "Encounter/example",
            data.item?.get(0)?.encounter?.get(0)?.reference
        )
        assertEquals(
            "USD",
            data.item?.get(0)?.net?.currency
        )
        assertEquals(
            "135.57".toDouble(),
            data.item?.get(0)?.net?.value?.value
        )
        assertEquals(
            "1205",
            data.item?.get(0)?.productOrService?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-USCLS",
            data.item?.get(0)?.productOrService?.coding?.get(0)?.system
        )
        assertEquals(
            "1".toLong(),
            data.item?.get(0)?.sequence?.value
        )
        assertEquals(
            "2014-08-16",
            data.item?.get(0)?.servicedDate?.value.toString()
        )
        assertEquals(
            "Device/example",
            data.item?.get(0)?.udi?.get(0)?.reference
        )
        assertEquals(
            "USD",
            data.item?.get(0)?.unitPrice?.currency
        )
        assertEquals(
            "135.57".toDouble(),
            data.item?.get(0)?.unitPrice?.value?.value
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.adjudication?.get(0)?.amount?.currency
        )
        assertEquals(
            "180.0".toDouble(),
            data.item?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "benefit",
            data.item?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "1".toLong(),
            data.item?.get(1)?.careTeamSequence?.get(0)?.value
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.detail?.get(0)?.adjudication?.get(0)?.amount?.currency
        )
        assertEquals(
            "180.0".toDouble(),
            data.item?.get(1)?.detail?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "benefit",
            data.item?.get(1)?.detail?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.detail?.get(0)?.net?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.item?.get(1)?.detail?.get(0)?.net?.value?.value
        )
        assertEquals(
            "group",
            data.item?.get(1)?.detail?.get(0)?.productOrService?.coding?.get(0)?.code
        )
        assertEquals(
            "1".toLong(),
            data.item?.get(1)?.detail?.get(0)?.sequence?.value
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(0)?.amount?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "eligible",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "eligpercent",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "0.9".toDouble(),
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(1)?.value?.value
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(2)?.amount?.currency
        )
        assertEquals(
            "180.0".toDouble(),
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(2)?.amount?.value?.value
        )
        assertEquals(
            "benefit",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.net?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.net?.value?.value
        )
        assertEquals(
            "1205",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.productOrService?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-USCLS",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.productOrService?.coding?.get(0)?.system
        )
        assertEquals(
            "1".toLong(),
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.sequence?.value
        )
        assertEquals(
            "Device/example",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.udi?.get(0)?.reference
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.unitPrice?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.item?.get(1)?.detail?.get(0)?.subDetail?.get(0)?.unitPrice?.value?.value
        )
        assertEquals(
            "Device/example",
            data.item?.get(1)?.detail?.get(0)?.udi?.get(0)?.reference
        )
        assertEquals(
            "USD",
            data.item?.get(1)?.net?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.item?.get(1)?.net?.value?.value
        )
        assertEquals(
            "group",
            data.item?.get(1)?.productOrService?.coding?.get(0)?.code
        )
        assertEquals(
            "2".toLong(),
            data.item?.get(1)?.sequence?.value
        )
        assertEquals(
            "2014-08-16",
            data.item?.get(1)?.servicedDate?.value.toString()
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
            "Organization/2",
            data.payee?.party?.reference
        )
        assertEquals(
            "provider",
            data.payee?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/payeetype",
            data.payee?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/1",
            data.provider?.reference
        )
        assertEquals(
            ExplanationOfBenefitStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ExplanationOfBenefit</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "USD",
            data.total?.get(0)?.amount?.currency
        )
        assertEquals(
            "135.57".toDouble(),
            data.total?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "submitted",
            data.total?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "USD",
            data.total?.get(1)?.amount?.currency
        )
        assertEquals(
            "96.0".toDouble(),
            data.total?.get(1)?.amount?.value?.value
        )
        assertEquals(
            "benefit",
            data.total?.get(1)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "oral",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/claim-type",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            Use.CLAIM,
            data.use
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testExplanationOfBenefit02() {
        // Given
        val sourceJson = loadAsString("r4/explanationofbenefit-example-2.json")

        // When
        val data = parser.toFhir(ExplanationOfBenefit::class, sourceJson)

        // Then
        assertEquals(
            "2014-02-14",
            data.accident?.date?.value.toString()
        )
        assertEquals(
            "Location/ph",
            data.accident?.locationReference?.reference
        )
        assertEquals(
            "SPT",
            data.accident?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.accident?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "2014-03-01",
            data.billablePeriod?.end?.value.toString()
        )
        assertEquals(
            "2014-02-01",
            data.billablePeriod?.start?.value.toString()
        )
        assertEquals(
            "Claim/100150",
            data.claim?.reference
        )
        assertEquals(
            "ClaimResponse/R3500",
            data.claimResponse?.reference
        )
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "Could not process.",
            data.disposition
        )
        assertEquals(
            "Practitioner/1",
            data.enterer?.reference
        )
        assertEquals(
            "Location/1",
            data.facility?.reference
        )
        assertEquals(
            "2",
            data.formCode?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/forms-codes",
            data.formCode?.coding?.get(0)?.system
        )
        assertEquals(
            "EB3501",
            data.id
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/explanationofbenefit",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "error-1",
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
            "MedicationRequest/medrx0301",
            data.originalPrescription?.reference
        )
        assertEquals(
            ClaimProcessingCodes.ERROR,
            data.outcome
        )
        assertEquals(
            "Patient/pat1",
            data.patient?.reference
        )
        assertEquals(
            "2".toLong(),
            data.precedence?.value
        )
        assertEquals(
            "MedicationRequest/medrx002",
            data.prescription?.reference
        )
        assertEquals(
            "2014-02-14",
            data.procedure?.get(0)?.date?.value.toString()
        )
        assertEquals(
            "123001",
            data.procedure?.get(0)?.procedureCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/sid/ex-icd-10-procedures",
            data.procedure?.get(0)?.procedureCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "1".toLong(),
            data.procedure?.get(0)?.sequence?.value
        )
        assertEquals(
            "Device/example",
            data.procedure?.get(0)?.udi?.get(0)?.reference
        )
        assertEquals(
            "en-CA",
            data.processNote?.get(0)?.language?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:ietf:bcp:47",
            data.processNote?.get(0)?.language?.coding?.get(0)?.system
        )
        assertEquals(
            "1".toLong(),
            data.processNote?.get(0)?.number?.value
        )
        assertEquals(
            "Invalid claim",
            data.processNote?.get(0)?.text
        )
        assertEquals(
            NoteType.DISPLAY,
            data.processNote?.get(0)?.type
        )
        assertEquals(
            "Organization/2",
            data.provider?.reference
        )
        assertEquals(
            "http://www.BenefitsInc.com/case-number",
            data.related?.get(0)?.reference?.system
        )
        assertEquals(
            "23-56Tu-XX-47-20150M14",
            data.related?.get(0)?.reference?.value
        )
        assertEquals(
            ExplanationOfBenefitStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "emergency",
            data.subType?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-claimsubtype",
            data.subType?.coding?.get(0)?.system
        )
        assertEquals(
            "employmentimpacted",
            data.supportingInfo?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            data.supportingInfo?.get(0)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "1".toLong(),
            data.supportingInfo?.get(0)?.sequence?.value
        )
        assertEquals(
            "2014-02-28",
            data.supportingInfo?.get(0)?.timingPeriod?.end?.value.toString()
        )
        assertEquals(
            "2014-02-14",
            data.supportingInfo?.get(0)?.timingPeriod?.start?.value.toString()
        )
        assertEquals(
            "hospitalized",
            data.supportingInfo?.get(1)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            data.supportingInfo?.get(1)?.category?.coding?.get(0)?.system
        )
        assertEquals(
            "2".toLong(),
            data.supportingInfo?.get(1)?.sequence?.value
        )
        assertEquals(
            "2014-02-16",
            data.supportingInfo?.get(1)?.timingPeriod?.end?.value.toString()
        )
        assertEquals(
            "2014-02-14",
            data.supportingInfo?.get(1)?.timingPeriod?.start?.value.toString()
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "USD",
            data.total?.get(0)?.amount?.currency
        )
        assertEquals(
            "2478.57".toDouble(),
            data.total?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "submitted",
            data.total?.get(0)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "USD",
            data.total?.get(1)?.amount?.currency
        )
        assertEquals(
            "0.0".toDouble(),
            data.total?.get(1)?.amount?.value?.value
        )
        assertEquals(
            "benefit",
            data.total?.get(1)?.category?.coding?.get(0)?.code
        )
        assertEquals(
            "oral",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/claim-type",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            Use.CLAIM,
            data.use
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
