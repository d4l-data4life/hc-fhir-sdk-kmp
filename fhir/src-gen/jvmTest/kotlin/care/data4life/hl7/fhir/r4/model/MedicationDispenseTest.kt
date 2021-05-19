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
import care.data4life.hl7.fhir.r4.codesystem.MedicationDispenseStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicationDispenseTest.java
 *
 * Dispensing a medication to a named patient
 *
 * Indicates that a medication product is to be or has been dispensed for a named person/patient. This
 * includes a description of the medication product (supply) provided and the instructions for
 * administering the medication. The medication dispense is the result of a pharmacy system responding
 * to a medication order.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationDispenseTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicationDispense01() {
        // Given
        val sourceJson = loadAsString("r4/medicationdispenseexample8.json")

        // When
        val data = parser.toFhir(MedicationDispense::class, sourceJson)

        // Then
        assertEquals(
            "MedicationRequest/medrx0309",
            data.authorizingPrescription?.get(0)?.reference
        )
        assertEquals(
            "medexample015",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "mg",
            data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.system
        )
        assertEquals(
            "mg",
            data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit
        )
        assertEquals(
            "500".toDouble(),
            data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value
        )
        assertEquals(
            "ordered",
            data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Ordered",
            data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/dose-rate-type",
            data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "394899003",
            data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.code
        )
        assertEquals(
            "oral administration of treatment",
            data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.system
        )
        assertEquals(
            "1".toInt(),
            data.dosageInstruction?.get(0)?.sequence?.value
        )
        assertEquals(
            "2".toLong(),
            data.dosageInstruction?.get(0)?.timing?.repeat?.frequency?.value
        )
        assertEquals(
            "21".toDouble(),
            data.dosageInstruction?.get(0)?.timing?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.dosageInstruction?.get(0)?.timing?.repeat?.periodUnit
        )
        assertEquals(
            "meddisp008",
            data.id
        )
        assertEquals(
            "#medexample015",
            data.medicationReference?.reference
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
            "Practitioner/f006",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals(
            MedicationDispenseStatusCodes.COMPLETED,
            data.status
        )
        assertEquals(
            "Donald Duck",
            data.subject?.display
        )
        assertEquals(
            "Patient/pat1",
            data.subject?.reference
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
