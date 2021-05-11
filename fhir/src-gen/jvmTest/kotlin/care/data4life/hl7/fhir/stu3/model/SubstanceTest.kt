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
import care.data4life.hl7.fhir.stu3.codesystem.FHIRSubstanceStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * SubstanceTest.java
 *
 * A homogeneous material with a definite composition.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class SubstanceTest {

    val parser = FhirStu3Parser()

    @Test
    fun testSubstance1() {
        // Given
        val sourceJson = loadAsString("stu3/substance-example-silver-nitrate-product.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then

        assertEquals("chemical", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Chemical", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org.fhir/substance-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("333346007", data.code?.coding?.get(0)?.code)
        assertEquals("Silver nitrate 20% solution (product)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Solution for silver nitrate stain", data.description)
        assertEquals("f204", data.id)
        assertEquals("http://acme.org/identifiers/substances", data.identifier?.get(0)?.system)
        assertEquals("15970", data.identifier?.get(0)?.value)
        assertEquals("2018-01-01", data.instance?.get(0)?.expiry?.value.toString())
        assertEquals(
            "http://acme.org/identifiers/substances/lot",
            data.instance?.get(0)?.identifier?.system
        )
        assertEquals("AB94687", data.instance?.get(0)?.identifier?.value)
        assertEquals("mL", data.instance?.get(0)?.quantity?.code)
        assertEquals("http://unitsofmeasure.org", data.instance?.get(0)?.quantity?.system)
        assertEquals("mL", data.instance?.get(0)?.quantity?.unit)
        assertEquals("100".toDouble(), data.instance?.get(0)?.quantity?.value?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSubstance2() {
        // Given
        val sourceJson = loadAsString("stu3/substance-example-amoxicillin-clavulanate.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then

        assertEquals("drug", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Drug or Medicament", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org.fhir/substance-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("392259005", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Amoxicillin + clavulanate potassium 875mg/125mg tablet (product)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("ingr1", data.contained?.get(0)?.id)
        assertEquals("ingr2", data.contained?.get(1)?.id)
        assertEquals("Augmentin 875", data.description)
        assertEquals("f205", data.id)
        assertEquals("mg", data.ingredient?.get(0)?.quantity?.denominator?.code)
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.quantity?.denominator?.system
        )
        assertEquals("mg", data.ingredient?.get(0)?.quantity?.denominator?.unit)
        assertEquals(
            "1000".toDouble(),
            data.ingredient?.get(0)?.quantity?.denominator?.value?.value
        )
        assertEquals("mg", data.ingredient?.get(0)?.quantity?.numerator?.code)
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.quantity?.numerator?.system
        )
        assertEquals("mg", data.ingredient?.get(0)?.quantity?.numerator?.unit)
        assertEquals("875".toDouble(), data.ingredient?.get(0)?.quantity?.numerator?.value?.value)
        assertEquals("#ingr1", data.ingredient?.get(0)?.substanceReference?.reference)
        assertEquals("mg", data.ingredient?.get(1)?.quantity?.denominator?.code)
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(1)?.quantity?.denominator?.system
        )
        assertEquals("mg", data.ingredient?.get(1)?.quantity?.denominator?.unit)
        assertEquals(
            "1000".toDouble(),
            data.ingredient?.get(1)?.quantity?.denominator?.value?.value
        )
        assertEquals("mg", data.ingredient?.get(1)?.quantity?.numerator?.code)
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(1)?.quantity?.numerator?.system
        )
        assertEquals("mg", data.ingredient?.get(1)?.quantity?.numerator?.unit)
        assertEquals("125".toDouble(), data.ingredient?.get(1)?.quantity?.numerator?.value?.value)
        assertEquals("#ingr2", data.ingredient?.get(1)?.substanceReference?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSubstance3() {
        // Given
        val sourceJson = loadAsString("stu3/substance-example-f203-potassium.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then

        assertEquals("chemical", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Chemical", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org.fhir/substance-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("88480006", data.code?.coding?.get(0)?.code)
        assertEquals("Potassium", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("f203", data.id)
        assertEquals("http://acme.org/identifiers/substances", data.identifier?.get(0)?.system)
        assertEquals("1234", data.identifier?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSubstance4() {
        // Given
        val sourceJson = loadAsString("stu3/substance-example-f201-dust.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then

        assertEquals("406466009", data.code?.coding?.get(0)?.code)
        assertEquals("House dust allergen", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("f201", data.id)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSubstance5() {
        // Given
        val sourceJson = loadAsString("stu3/substance-example.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then

        assertEquals("allergen", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Allergen", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org.fhir/substance-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("apitoxin (Honey Bee Venom)", data.code?.text)
        assertEquals("example", data.id)
        assertEquals("http://acme.org/identifiers/substances", data.identifier?.get(0)?.system)
        assertEquals("1463", data.identifier?.get(0)?.value)
        assertEquals(FHIRSubstanceStatus.ACTIVE, data.status)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSubstance6() {
        // Given
        val sourceJson = loadAsString("stu3/substance-example-f202-staphylococcus.json")

        // When
        val data = parser.toFhir(Substance::class, sourceJson)

        // Then

        assertEquals("3092008", data.code?.coding?.get(0)?.code)
        assertEquals("Staphylococcus Aureus", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("f202", data.id)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
