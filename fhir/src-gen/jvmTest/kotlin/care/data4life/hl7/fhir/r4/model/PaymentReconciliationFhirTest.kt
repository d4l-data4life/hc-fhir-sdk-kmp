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
class PaymentReconciliationFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testPaymentReconciliation01() {
        // Given
        val sourceJson = loadAsString("r4/paymentreconciliation-example.json")

        // When
        val data = parser.toFhir(PaymentReconciliation::class, sourceJson)

        // Then
        assertPaymentReconciliation01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPaymentReconciliation01Step01(data: PaymentReconciliation) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.detail?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3500.0".toDouble(),
            actual = data.detail?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.detail?.get(0)?.date?.value.toString()
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/payment/2018/detail",
            actual = data.detail?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10-12345-001",
            actual = data.detail?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.detail?.get(0)?.payee?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalleyclinic.com/claim",
            actual = data.detail?.get(0)?.request?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AB12345",
            actual = data.detail?.get(0)?.request?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/claimresponse",
            actual = data.detail?.get(0)?.response?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CR20140815-AB12345",
            actual = data.detail?.get(0)?.response?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.detail?.get(0)?.submitter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "payment",
            actual = data.detail?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payment-type",
            actual = data.detail?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.detail?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4000.0".toDouble(),
            actual = data.detail?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-12",
            actual = data.detail?.get(1)?.date?.value.toString()
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/payment/2018/detail",
            actual = data.detail?.get(1)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10-12345-002",
            actual = data.detail?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/oralhealthclaim/225476332699",
            actual = data.detail?.get(1)?.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "payment",
            actual = data.detail?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payment-type",
            actual = data.detail?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.detail?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "-1500.0".toDouble(),
            actual = data.detail?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.detail?.get(2)?.date?.value.toString()
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/payment/2018/detail",
            actual = data.detail?.get(2)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10-12345-003",
            actual = data.detail?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "advance",
            actual = data.detail?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payment-type",
            actual = data.detail?.get(2)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014 August mid-month settlement.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PAYREC/2016/01B",
            actual = data.formCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ncforms.org/formid",
            actual = data.formCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ER2500",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/enrollmentresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "781234",
            actual = data.identifier?.get(0)?.value
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "USD",
            actual = data.paymentAmount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7000.0".toDouble(),
            actual = data.paymentAmount?.value?.value
        )

        assertEquals(
            expected = "2014-08-01",
            actual = data.paymentDate?.value.toString()
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/payment/2018",
            actual = data.paymentIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10-12345",
            actual = data.paymentIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.paymentIssuer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-31",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "Due to the year end holiday the cutoff for submissions for December will be the 28th.",
            actual = data.processNote?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NoteType.DISPLAY,
            actual = data.processNote?.get(0)?.type
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibility/225476332402",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the PaymentReconciliation</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
