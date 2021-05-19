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
 * PaymentReconciliationTest.java
 *
 * PaymentReconciliation resource
 *
 * This resource provides payment details and claim references supporting a bulk payment.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PaymentReconciliationTest {

    val parser = FhirStu3Parser()

    @Test
    fun testPaymentReconciliation01() {
        // Given
        val sourceJson = loadAsString("stu3/paymentreconciliation-example.json")

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
            actual = data.detail?.get(0)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.detail?.get(0)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1000.0".toDouble(),
            actual = data.detail?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.detail?.get(0)?.date?.value.toString()
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
            expected = "http://hl7.org/fhir/payment-type",
            actual = data.detail?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.detail?.get(1)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.detail?.get(1)?.amount?.system
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
            expected = "http://hl7.org/fhir/payment-type",
            actual = data.detail?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.detail?.get(2)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.detail?.get(2)?.amount?.system
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
            expected = "advance",
            actual = data.detail?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/payment-type",
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
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ncforms.org/formid",
            actual = data.form?.coding?.get(0)?.system
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
            expected = "display",
            actual = data.processNote?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/note-type",
            actual = data.processNote?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/eligibility/225476332402",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requestProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
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

        assertEquals(
            expected = "USD",
            actual = data.total?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.total?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3500.0".toDouble(),
            actual = data.total?.value?.value
        )
    }
}
