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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

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
class InvoiceTest {

    val parser = FhirR4Parser()

    @Test
    fun testInvoice01() {
        // Given
        val sourceJson = loadAsString("r4/invoice-example.json")

        // When
        val data = parser.toFhir(Invoice::class, sourceJson)

        // Then
        assertEquals(
            "Account/example",
            data.account?.reference
        )
        assertEquals(
            "2017-01-25T08:00:00+01:00",
            data.date?.value.toString()
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://myHospital.org/Invoices",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "654321",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://myhospital/NamingSystem/departments",
            data.issuer?.identifier?.system
        )
        assertEquals(
            "CARD_INTERMEDIATE_CARE",
            data.issuer?.identifier?.value
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
            "Practitioner/example",
            data.participant?.get(0)?.actor?.reference
        )
        assertEquals(
            "17561000",
            data.participant?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "Cardiologist",
            data.participant?.get(0)?.role?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.participant?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            InvoiceStatus.ISSUED,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Example of Invoice</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "EUR",
            data.totalGross?.currency
        )
        assertEquals(
            "48".toDouble(),
            data.totalGross?.value?.value
        )
        assertEquals(
            "EUR",
            data.totalNet?.currency
        )
        assertEquals(
            "40".toDouble(),
            data.totalNet?.value?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
