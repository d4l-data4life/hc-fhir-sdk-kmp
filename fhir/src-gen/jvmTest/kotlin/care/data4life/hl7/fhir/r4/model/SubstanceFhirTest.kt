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
import care.data4life.hl7.fhir.r4.codesystem.FHIRSubstanceStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * SubstanceTest.java
 *
 * A homogeneous material with a definite composition
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SubstanceFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testSubstance01() {
        // Given
        val sourceJson = loadAsString("r4/substance-example-silver-nitrate-product.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then
        assertSubstance01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubstance01Step01(data: Substance) {
        assertEquals(
            expected = "chemical",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chemical",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/substance-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "333346007",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Silver nitrate 20% solution (product)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Solution for silver nitrate stain",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f204",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/identifiers/substances",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15970",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-01-01",
            actual = data.instance?.get(0)?.expiry?.value.toString()
        )

        assertEquals(
            expected = "http://acme.org/identifiers/substances/lot",
            actual = data.instance?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AB94687",
            actual = data.instance?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.instance?.get(0)?.quantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.instance?.get(0)?.quantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.instance?.get(0)?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.instance?.get(0)?.quantity?.value?.value
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
    }

    @Test
    fun testSubstance02() {
        // Given
        val sourceJson = loadAsString("r4/substance-example-amoxicillin-clavulanate.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then
        assertSubstance02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubstance02Step01(data: Substance) {
        assertEquals(
            expected = "drug",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Drug or Medicament",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/substance-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "392259005",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Amoxicillin + clavulanate potassium 875mg/125mg tablet (product)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ingr1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ingr2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Augmentin 875",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f205",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.quantity?.denominator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.quantity?.denominator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.quantity?.denominator?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1000".toDouble(),
            actual = data.ingredient?.get(0)?.quantity?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.quantity?.numerator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.quantity?.numerator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.quantity?.numerator?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "875".toDouble(),
            actual = data.ingredient?.get(0)?.quantity?.numerator?.value?.value
        )

        assertEquals(
            expected = "#ingr1",
            actual = data.ingredient?.get(0)?.substanceReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(1)?.quantity?.denominator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(1)?.quantity?.denominator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(1)?.quantity?.denominator?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1000".toDouble(),
            actual = data.ingredient?.get(1)?.quantity?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(1)?.quantity?.numerator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(1)?.quantity?.numerator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(1)?.quantity?.numerator?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125".toDouble(),
            actual = data.ingredient?.get(1)?.quantity?.numerator?.value?.value
        )

        assertEquals(
            expected = "#ingr2",
            actual = data.ingredient?.get(1)?.substanceReference?.reference
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
    }

    @Test
    fun testSubstance03() {
        // Given
        val sourceJson = loadAsString("r4/substance-example-f203-potassium.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then
        assertSubstance03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubstance03Step01(data: Substance) {
        assertEquals(
            expected = "chemical",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chemical",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/substance-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "88480006",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Potassium",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f203",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/identifiers/substances",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1234",
            actual = data.identifier?.get(0)?.value
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
    }

    @Test
    fun testSubstance04() {
        // Given
        val sourceJson = loadAsString("r4/substance-example-f201-dust.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then
        assertSubstance04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubstance04Step01(data: Substance) {
        assertEquals(
            expected = "406466009",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "House dust allergen",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f201",
            actual = data.id
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
    }

    @Test
    fun testSubstance05() {
        // Given
        val sourceJson = loadAsString("r4/substance-example.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then
        assertSubstance05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubstance05Step01(data: Substance) {
        assertEquals(
            expected = "allergen",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Allergen",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/substance-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "apitoxin (Honey Bee Venom)",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/identifiers/substances",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1463",
            actual = data.identifier?.get(0)?.value
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
            expected = FHIRSubstanceStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testSubstance06() {
        // Given
        val sourceJson = loadAsString("r4/substance-example-f202-staphylococcus.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then
        assertSubstance06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubstance06Step01(data: Substance) {
        assertEquals(
            expected = "3092008",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Staphylococcus Aureus",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f202",
            actual = data.id
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
    }
}
