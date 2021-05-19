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
 * MedicinalProductIngredientTest.java
 *
 * An ingredient of a manufactured item or pharmaceutical product
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductIngredientTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductIngredient01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductingredient-example.json")

        // When
        val data = parser.toFhir(MedicinalProductIngredient::class, sourceJson)

        // Then
        assertMedicinalProductIngredient01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicinalProductIngredient01Step01(data: MedicinalProductIngredient) {

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.manufacturer?.get(0)?.reference
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
            expected = "ActiveBase",
            actual = data.role?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/ingredientRole",
            actual = data.role?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "equixabanCompanyequixaban1",
            actual = data.specifiedSubstance?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/specifiedSubstance",
            actual = data.specifiedSubstance?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.specifiedSubstance?.get(0)?.group?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/specifiedSubstanceGroup",
            actual = data.specifiedSubstance?.get(0)?.group?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "EQUIXABAN",
            actual = data.substance?.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/substance",
            actual = data.substance?.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "{tablet}",
            actual = data.substance?.strength?.get(0)?.presentation?.denominator?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.substance?.strength?.get(0)?.presentation?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.substance?.strength?.get(0)?.presentation?.numerator?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.5".toDouble(),
            actual = data.substance?.strength?.get(0)?.presentation?.numerator?.value?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
