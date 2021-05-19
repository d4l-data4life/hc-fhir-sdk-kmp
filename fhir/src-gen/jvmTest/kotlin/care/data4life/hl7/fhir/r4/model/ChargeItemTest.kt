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
import care.data4life.hl7.fhir.r4.codesystem.ChargeItemStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ChargeItemTest.java
 *
 * Item containing charge code(s) associated with the provision of healthcare provider products
 *
 * The resource ChargeItem describes the provision of healthcare provider products for a certain
 * patient, therefore referring not only to the product, but containing in addition details of the
 * provision, like date, time, amounts and participating organizations and persons. Main Usage of the
 * ChargeItem is to enable the billing process and internal cost allocation.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ChargeItemTest {

    val parser = FhirR4Parser()

    @Test
    fun testChargeItem01() {
        // Given
        val sourceJson = loadAsString("r4/chargeitem-example.json")

        // When
        val data = parser.toFhir(ChargeItem::class, sourceJson)

        // Then
        assertChargeItem01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertChargeItem01Step01(data: ChargeItem) {

        assertEquals(
            expected = "Account/example",
            actual = data.account?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "01510",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Zusatzpauschale für Beobachtung nach diagnostischer Koronarangiografie",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.kbv.de/tools/ebm/html/01520_2904360860826220813632.html",
            actual = data.definitionUri?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-01-25T23:55:04+01:00",
            actual = data.enteredDate?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.enterer?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.8".toDouble(),
            actual = data.factorOverride?.value
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://myHospital.org/ChargeItems",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "654321",
            actual = data.identifier?.get(0)?.value
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
            expected = "Practitioner/example",
            actual = data.note?.get(0)?.authorReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The code is only applicable for periods longer than 4h",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-01-25T23:55:04+01:00",
            actual = data.note?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "2017-01-25T12:35:00+01:00",
            actual = data.occurrencePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-01-25T08:00:00+01:00",
            actual = data.occurrencePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Patient is Cardiologist's golf buddy, so he gets a 20% discount!",
            actual = data.overrideReason
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "17561000",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Cardiologist",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(1)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "224542009",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Coronary Care Nurse",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://myhospital/NamingSystem/departments",
            actual = data.performingOrganization?.identifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CARD_INTERMEDIATE_CARE",
            actual = data.performingOrganization?.identifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "EUR",
            actual = data.priceOverride?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "40".toDouble(),
            actual = data.priceOverride?.value?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.quantity?.value?.value
        )

        assertEquals(
            expected = "123456",
            actual = data.reason?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "DIAG-1",
            actual = data.reason?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-10",
            actual = data.reason?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://myhospital/NamingSystem/departments",
            actual = data.requestingOrganization?.identifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CARD_U1",
            actual = data.requestingOrganization?.identifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Procedure/example",
            actual = data.service?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ChargeItemStatus.BILLABLE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Example of ChargeItem Usage in Context of the German EBM Billing code system</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
