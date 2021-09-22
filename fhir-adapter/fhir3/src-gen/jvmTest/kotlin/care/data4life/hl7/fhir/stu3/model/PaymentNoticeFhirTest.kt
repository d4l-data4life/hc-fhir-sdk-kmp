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
 * PaymentNoticeTest.java
 *
 * PaymentNotice request
 *
 * This resource provides the status of the payment for goods and services rendered, and the request
 * and response resource references.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PaymentNoticeFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testPaymentNotice01() {
        // Given
        val sourceJson = loadAsString("stu3/paymentnotice-example.json")

        // When
        val data = parser.toFhir(PaymentNotice::class, sourceJson)

        // Then
        assertPaymentNotice01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPaymentNotice01Step01(data: PaymentNotice) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "77654",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://benefitsinc.com/paymentnotice",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "776543",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "paid",
            actual = data.paymentStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/paymentstatus",
            actual = data.paymentStatus?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://npid.org/provider",
            actual = data.provider?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PR957857",
            actual = data.provider?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://benefitsinc.com/fhir/claim/12345",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://benefitsinc.com/fhir/claimresponse/CR12345",
            actual = data.response?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-15",
            actual = data.statusDate?.value.toString()
        )

        assertEquals(
            expected = "http://regulators.gov",
            actual = data.target?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AB123",
            actual = data.target?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the PaymentNotice</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
