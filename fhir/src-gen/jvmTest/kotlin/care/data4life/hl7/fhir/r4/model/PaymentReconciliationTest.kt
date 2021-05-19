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
import care.data4life.hl7.fhir.r4.codesystem.NoteType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * PaymentReconciliationTest.java
 *
 * PaymentReconciliation resource
 *
 * This resource provides the details including amount of a payment and allocates the payment items
 * being paid.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PaymentReconciliationTest {

    val parser = FhirR4Parser()

    @Test
    fun testPaymentReconciliation01() {
        // Given
        val sourceJson = loadAsString("r4/paymentreconciliation-example.json")

        // When
        val data = parser.toFhir(PaymentReconciliation::class, sourceJson)

        // Then
        assertEquals(
            "2014-08-16",
            data.created?.value.toString()
        )
        assertEquals(
            "USD",
            data.detail?.get(0)?.amount?.currency
        )
        assertEquals(
            "3500.0".toDouble(),
            data.detail?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "2014-08-16",
            data.detail?.get(0)?.date?.value.toString()
        )
        assertEquals(
            "http://www.BenefitsInc.com/payment/2018/detail",
            data.detail?.get(0)?.identifier?.system
        )
        assertEquals(
            "10-12345-001",
            data.detail?.get(0)?.identifier?.value
        )
        assertEquals(
            "Organization/1",
            data.detail?.get(0)?.payee?.reference
        )
        assertEquals(
            "http://happyvalleyclinic.com/claim",
            data.detail?.get(0)?.request?.identifier?.system
        )
        assertEquals(
            "AB12345",
            data.detail?.get(0)?.request?.identifier?.value
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/claimresponse",
            data.detail?.get(0)?.response?.identifier?.system
        )
        assertEquals(
            "CR20140815-AB12345",
            data.detail?.get(0)?.response?.identifier?.value
        )
        assertEquals(
            "Organization/1",
            data.detail?.get(0)?.submitter?.reference
        )
        assertEquals(
            "payment",
            data.detail?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/payment-type",
            data.detail?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "USD",
            data.detail?.get(1)?.amount?.currency
        )
        assertEquals(
            "4000.0".toDouble(),
            data.detail?.get(1)?.amount?.value?.value
        )
        assertEquals(
            "2014-08-12",
            data.detail?.get(1)?.date?.value.toString()
        )
        assertEquals(
            "http://www.BenefitsInc.com/payment/2018/detail",
            data.detail?.get(1)?.identifier?.system
        )
        assertEquals(
            "10-12345-002",
            data.detail?.get(1)?.identifier?.value
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/oralhealthclaim/225476332699",
            data.detail?.get(1)?.request?.reference
        )
        assertEquals(
            "payment",
            data.detail?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/payment-type",
            data.detail?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "USD",
            data.detail?.get(2)?.amount?.currency
        )
        assertEquals(
            "-1500.0".toDouble(),
            data.detail?.get(2)?.amount?.value?.value
        )
        assertEquals(
            "2014-08-16",
            data.detail?.get(2)?.date?.value.toString()
        )
        assertEquals(
            "http://www.BenefitsInc.com/payment/2018/detail",
            data.detail?.get(2)?.identifier?.system
        )
        assertEquals(
            "10-12345-003",
            data.detail?.get(2)?.identifier?.value
        )
        assertEquals(
            "advance",
            data.detail?.get(2)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/payment-type",
            data.detail?.get(2)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "2014 August mid-month settlement.",
            data.disposition
        )
        assertEquals(
            "PAYREC/2016/01B",
            data.formCode?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ncforms.org/formid",
            data.formCode?.coding?.get(0)?.system
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
            ClaimProcessingCodes.COMPLETE,
            data.outcome
        )
        assertEquals(
            "USD",
            data.paymentAmount?.currency
        )
        assertEquals(
            "7000.0".toDouble(),
            data.paymentAmount?.value?.value
        )
        assertEquals(
            "2014-08-01",
            data.paymentDate?.value.toString()
        )
        assertEquals(
            "http://www.BenefitsInc.com/payment/2018",
            data.paymentIdentifier?.system
        )
        assertEquals(
            "10-12345",
            data.paymentIdentifier?.value
        )
        assertEquals(
            "Organization/2",
            data.paymentIssuer?.reference
        )
        assertEquals(
            "2014-08-31",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2014-08-16",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "Due to the year end holiday the cutoff for submissions for December will be the 28th.",
            data.processNote?.get(0)?.text
        )
        assertEquals(
            NoteType.DISPLAY,
            data.processNote?.get(0)?.type
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/eligibility/225476332402",
            data.request?.reference
        )
        assertEquals(
            "Organization/1",
            data.requestor?.reference
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the PaymentReconciliation</div>",
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
