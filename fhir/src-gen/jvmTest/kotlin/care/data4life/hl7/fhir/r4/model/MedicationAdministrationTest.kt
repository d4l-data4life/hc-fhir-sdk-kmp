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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

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
class MedicationAdministrationTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicationAdministration01() {
        // Given
        val sourceJson = loadAsString("r4/medicationadministrationexample3.json")

        // When
        val data = parser.toFhir(MedicationAdministration::class, sourceJson)

        // Then
        assertEquals(
            "med0303",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "Encounter/f001",
            data.context?.reference
        )
        assertEquals(
            "2015-01-15T14:30:00+01:00",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2015-01-15T14:30:00+01:00",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "medadminexample03",
            data.id
        )
        assertEquals(
            "#med0303",
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
            "Patient started Bupropion this morning - will administer in a reduced dose tomorrow",
            data.note?.get(0)?.text
        )
        assertEquals(
            "MedicationRequest/medrx0317",
            data.request?.reference
        )
        assertEquals(
            MedicationAdministrationStatusCodes.ON_HOLD,
            data.status
        )
        assertEquals(
            "373147003",
            data.statusReason?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Administration of medication not done due to a contraindication (situation)",
            data.statusReason?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.statusReason?.get(0)?.coding?.get(0)?.system
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
            "Condition/f204",
            data.supportingInformation?.get(0)?.reference
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
