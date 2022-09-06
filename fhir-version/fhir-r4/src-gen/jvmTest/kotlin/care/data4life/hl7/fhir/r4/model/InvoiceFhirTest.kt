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
import care.data4life.hl7.fhir.r4.codesystem.InvoiceStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * InvoiceTest.java
 *
 * Invoice containing ChargeItems from an Account
 *
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price
 * for Billing purpose.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class InvoiceFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testInvoice01() {
        // Given
        val sourceJson = loadAsString("r4/invoice-example.json")

        // When
        val data = parser.toFhir(Invoice::class, sourceJson)

        // Then
        assertInvoice01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertInvoice01Step01(data: Invoice) {
        assertEquals(
            expected = "Account/example",
            actual = data.account?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-01-25T08:00:00+01:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://myHospital.org/Invoices",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "654321",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://myhospital/NamingSystem/departments",
            actual = data.issuer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CARD_INTERMEDIATE_CARE",
            actual = data.issuer?.identifier?.value
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
            expected = "Practitioner/example",
            actual = data.participant?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "17561000",
            actual = data.participant?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cardiologist",
            actual = data.participant?.get(0)?.role?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.participant?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = InvoiceStatus.ISSUED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Example of Invoice</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EUR",
            actual = data.totalGross?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48".toDouble(),
            actual = data.totalGross?.value?.value
        )

        assertEquals(
            expected = "EUR",
            actual = data.totalNet?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "40".toDouble(),
            actual = data.totalNet?.value?.value
        )
    }
}
