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
import care.data4life.hl7.fhir.r4.codesystem.MedicationAdministrationStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * MedicationAdministrationTest.java
 *
 * Administration of medication to a patient
 *
 * Describes the event of a patient consuming or otherwise being administered a medication. This may be
 * as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this
 * event to the authorizing prescription, and the specific encounter between patient and health care
 * practitioner.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationAdministrationFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicationAdministration01() {
        // Given
        val sourceJson = loadAsString("r4/medicationadministrationexample3.json")

        // When
        val data = parser.toFhir(MedicationAdministration::class, sourceJson)

        // Then
        assertMedicationAdministration01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationAdministration01Step01(data: MedicationAdministration) {
        assertEquals(
            expected = "med0303",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/f001",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-01-15T14:30:00+01:00",
            actual = data.effectivePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-01-15T14:30:00+01:00",
            actual = data.effectivePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "medadminexample03",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#med0303",
            actual = data.medicationReference?.reference
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
            expected = "Patient started Bupropion this morning - will administer in a reduced dose tomorrow",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicationRequest/medrx0317",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationAdministrationStatusCodes.ON_HOLD,
            actual = data.status
        )

        assertEquals(
            expected = "373147003",
            actual = data.statusReason?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Administration of medication not done due to a contraindication (situation)",
            actual = data.statusReason?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.statusReason?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = "Condition/f204",
            actual = data.supportingInformation?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
