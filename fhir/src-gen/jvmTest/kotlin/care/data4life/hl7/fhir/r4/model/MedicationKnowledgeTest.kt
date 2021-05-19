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
import care.data4life.hl7.fhir.r4.codesystem.MedicationKnowledgeStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicationKnowledgeTest.java
 *
 * Definition of Medication Knowledge
 *
 * Information about a medication that is used to support knowledge.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationKnowledgeTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicationKnowledge01() {
        // Given
        val sourceJson = loadAsString("r4/medicationknowledge-example.json")

        // When
        val data = parser.toFhir(MedicationKnowledge::class, sourceJson)

        // Then
        assertMedicationKnowledge01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationKnowledge01Step01(data: MedicationKnowledge) {

        assertEquals(
            expected = "mg/ml",
            actual = data.amount?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "50".toDouble(),
            actual = data.amount?.value?.value
        )

        assertEquals(
            expected = "0069-2587-10",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vancomycin Hydrochloride (VANCOMYCIN HYDROCHLORIDE)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/ndc",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "org4",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385219001",
            actual = data.doseForm?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Injection Solution (qualifier value)",
            actual = data.doseForm?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.doseForm?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#org4",
            actual = data.manufacturer?.reference
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
            expected = MedicationKnowledgeStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Vancomycin Hydrochloride (VANCOMYCIN HYDROCHLORIDE)",
            actual = data.synonym?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
