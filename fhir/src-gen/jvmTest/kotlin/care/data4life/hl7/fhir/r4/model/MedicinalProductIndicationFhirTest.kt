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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * MedicinalProductIndicationTest.java
 *
 * MedicinalProductIndication
 *
 * Indication for the Medicinal Product.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductIndicationFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductIndication01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductindication-example.json")

        // When
        val data = parser.toFhir(MedicinalProductIndication::class, sourceJson)

        // Then
        assertMedicinalProductIndication01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicinalProductIndication01Step01(data: MedicinalProductIndication) {
        assertEquals(
            expected = "Hipsurgery",
            actual = data.comorbidity?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/comorbidity",
            actual = data.comorbidity?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Venousthromboembolismprophylaxis",
            actual = data.diseaseSymptomProcedure?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/indicationasdisease-symptom-procedure",
            actual = data.diseaseSymptomProcedure?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRYLX",
            actual = data.intendedEffect?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/intendedeffect",
            actual = data.intendedEffect?.coding?.get(0)?.system
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
            expected = "a",
            actual = data.population?.get(0)?.ageRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18".toDouble(),
            actual = data.population?.get(0)?.ageRange?.low?.value?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
