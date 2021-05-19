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
 * MedicinalProductIndicationTest.java
 *
 * MedicinalProductIndication
 *
 * Indication for the Medicinal Product.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductIndicationTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductIndication01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductindication-example.json")

        // When
        val data = parser.toFhir(MedicinalProductIndication::class, sourceJson)

        // Then
        assertEquals(
            "Hipsurgery",
            data.comorbidity?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/comorbidity",
            data.comorbidity?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Venousthromboembolismprophylaxis",
            data.diseaseSymptomProcedure?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/indicationasdisease-symptom-procedure",
            data.diseaseSymptomProcedure?.coding?.get(0)?.system
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "PRYLX",
            data.intendedEffect?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/intendedeffect",
            data.intendedEffect?.coding?.get(0)?.system
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
            "a",
            data.population?.get(0)?.ageRange?.low?.unit
        )
        assertEquals(
            "18".toDouble(),
            data.population?.get(0)?.ageRange?.low?.value?.value
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
