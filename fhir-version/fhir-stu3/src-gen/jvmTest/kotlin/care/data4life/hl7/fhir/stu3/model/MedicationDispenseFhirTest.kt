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
import care.data4life.hl7.fhir.stu3.codesystem.MedicationDispenseStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

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
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationDispenseFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testMedicationDispense01() {
        // Given
        val sourceJson = loadAsString("stu3/medicationdispenseexample8.json")

        // When
        val data = parser.toFhir(MedicationDispense::class, sourceJson)

        // Then
        assertMedicationDispense01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationDispense01Step01(data: MedicationDispense) {
        assertEquals(
            expected = "MedicationRequest/medrx0309",
            actual = data.authorizingPrescription?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medexample015",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500".toDouble(),
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.value?.value
        )

        assertEquals(
            expected = "394899003",
            actual = data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "oral administration of treatment",
            actual = data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.dosageInstruction?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2".toInt(),
            actual = data.dosageInstruction?.get(0)?.timing?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "21".toDouble(),
            actual = data.dosageInstruction?.get(0)?.timing?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.dosageInstruction?.get(0)?.timing?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "meddisp008",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#medexample015",
            actual = data.medicationReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f006",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.performer?.get(0)?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationDispenseStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
