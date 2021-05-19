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
        assertEquals(
            "Account/example",
            data.account?.get(0)?.reference
        )
        assertEquals(
            "01510",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Zusatzpauschale für Beobachtung nach diagnostischer Koronarangiografie",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "Encounter/example",
            data.context?.reference
        )
        assertEquals(
            "http://www.kbv.de/tools/ebm/html/01520_2904360860826220813632.html",
            data.definitionUri?.get(0)
        )
        assertEquals(
            "2017-01-25T23:55:04+01:00",
            data.enteredDate?.value.toString()
        )
        assertEquals(
            "Practitioner/example",
            data.enterer?.reference
        )
        assertEquals(
            "0.8".toDouble(),
            data.factorOverride?.value
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://myHospital.org/ChargeItems",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "654321",
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
            "Practitioner/example",
            data.note?.get(0)?.authorReference?.reference
        )
        assertEquals(
            "The code is only applicable for periods longer than 4h",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2017-01-25T23:55:04+01:00",
            data.note?.get(0)?.time?.value.toString()
        )
        assertEquals(
            "2017-01-25T12:35:00+01:00",
            data.occurrencePeriod?.end?.value.toString()
        )
        assertEquals(
            "2017-01-25T08:00:00+01:00",
            data.occurrencePeriod?.start?.value.toString()
        )
        assertEquals(
            "Patient is Cardiologist's golf buddy, so he gets a 20% discount!",
            data.overrideReason
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals(
            "17561000",
            data.performer?.get(0)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "Cardiologist",
            data.performer?.get(0)?.function?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.performer?.get(0)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(1)?.actor?.reference
        )
        assertEquals(
            "224542009",
            data.performer?.get(1)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "Coronary Care Nurse",
            data.performer?.get(1)?.function?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.performer?.get(1)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "http://myhospital/NamingSystem/departments",
            data.performingOrganization?.identifier?.system
        )
        assertEquals(
            "CARD_INTERMEDIATE_CARE",
            data.performingOrganization?.identifier?.value
        )
        assertEquals(
            "EUR",
            data.priceOverride?.currency
        )
        assertEquals(
            "40".toDouble(),
            data.priceOverride?.value?.value
        )
        assertEquals(
            "1".toDouble(),
            data.quantity?.value?.value
        )
        assertEquals(
            "123456",
            data.reason?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "DIAG-1",
            data.reason?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/sid/icd-10",
            data.reason?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "http://myhospital/NamingSystem/departments",
            data.requestingOrganization?.identifier?.system
        )
        assertEquals(
            "CARD_U1",
            data.requestingOrganization?.identifier?.value
        )
        assertEquals(
            "Procedure/example",
            data.service?.get(0)?.reference
        )
        assertEquals(
            ChargeItemStatus.BILLABLE,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Example of ChargeItem Usage in Context of the German EBM Billing code system</div>",
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
