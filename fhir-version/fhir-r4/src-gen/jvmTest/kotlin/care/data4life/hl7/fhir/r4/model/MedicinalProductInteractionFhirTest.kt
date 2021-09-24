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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicinalProductInteractionTest.java
 *
 * MedicinalProductInteraction
 *
 * The interactions of the medicinal product with other medicinal products, or other forms of
 * interactions.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductInteractionFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductInteraction01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductinteraction-example.json")

        // When
        val data = parser.toFhir(MedicinalProductInteraction::class, sourceJson)

        // Then
        assertMedicinalProductInteraction01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicinalProductInteraction01Step01(data: MedicinalProductInteraction) {

        assertEquals(
            expected = "Increasedplasmaconcentrations",
            actual = data.effect?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/interactionseffect",
            actual = data.effect?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ketoconazole",
            actual = data.interactant?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/interactant",
            actual = data.interactant?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "itraconazole",
            actual = data.interactant?.get(1)?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/interactant",
            actual = data.interactant?.get(1)?.itemCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coadministration not recommended in patients receiving concomitant systemic treatment strong inhibitors of both CYP3A4 and P-gp",
            actual = data.management?.text
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "StrongInhibitorofCYP3A4",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/interactionsType",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
