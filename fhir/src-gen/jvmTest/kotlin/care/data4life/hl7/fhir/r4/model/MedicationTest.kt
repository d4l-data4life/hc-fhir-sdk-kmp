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
import care.data4life.hl7.fhir.r4.codesystem.MedicationStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicationTest.java
 *
 * Definition of a Medication
 *
 * This resource is primarily used for the identification and definition of a medication for the
 * purposes of prescribing, dispensing, and administering a medication as well as for making statements
 * about medication use.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedication01() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0307.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication01Step01(data: Medication) {

        assertEquals(
            expected = "2019-10-31",
            actual = data.batch?.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "12345",
            actual = data.batch?.lotNumber
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0169-7501-11",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Novolog 100u/ml",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/ndc",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "org3",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385219001",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Injection solution (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0307",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "325072002",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Insulin Aspart (substance)",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "U",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
        )

        assertEquals(
            expected = "#org3",
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication02() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0311.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication02Step01(data: Medication) {

        assertEquals(
            expected = "373994007",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Prednisone 5mg tablet (Product)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sub03",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385055001",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tablet dose form (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0311",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#sub03",
            actual = data.ingredient?.get(0)?.itemReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "5".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication03() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0310.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication03Step01(data: Medication) {

        assertEquals(
            expected = "430127000",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Oral Form Oxycodone (product)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sub03",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385055001",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tablet dose form (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0310",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#sub03",
            actual = data.ingredient?.get(0)?.itemReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "5".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication04() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0306.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication04Step01(data: Medication) {

        assertEquals(
            expected = "2019-10-31",
            actual = data.batch?.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "12345",
            actual = data.batch?.lotNumber
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "51144-050-01",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Adcetris",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/ndc",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "org3",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "421637006",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Lyophilized powder for injectable solution (qualifier value) ",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0306",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#org3",
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication05() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0301.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication05Step01(data: Medication) {

        assertEquals(
            expected = "2017-05-22",
            actual = data.batch?.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "9494788",
            actual = data.batch?.lotNumber
                ?.replace("\n", " ")
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
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Injection Solution (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0301",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.ingredient?.get(0)?.isActive?.value
        )

        assertEquals(
            expected = "66955",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vancomycin Hydrochloride",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.nlm.nih.gov/research/umls/rxnorm",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "10".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "500".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
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
            expected = MedicationStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication06() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0317.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication06Step01(data: Medication) {

        assertEquals(
            expected = "385219001",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Injection Solution (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Injection Solution (qualifier value)",
            actual = data.form?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0317",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "204520",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Potassium Chloride",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.nlm.nih.gov/research/umls/rxnorm",
            actual = data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "meq",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
        )

        assertEquals(
            expected = "313002",
            actual = data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Sodium Chloride 0.9% injectable solution",
            actual = data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.nlm.nih.gov/research/umls/rxnorm",
            actual = data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.ingredient?.get(1)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(1)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.ingredient?.get(1)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "g",
            actual = data.ingredient?.get(1)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(1)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.9".toDouble(),
            actual = data.ingredient?.get(1)?.strength?.numerator?.value?.value
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication07() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample1.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication07Step01(data: Medication) {

        assertEquals(
            expected = "Amoxicillin 250mg/5ml Suspension",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medicationexample1",
            actual = data.id
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
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Amoxicillin 250mg/5ml Suspension</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication08() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample15.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication08Step01(data: Medication) {

        assertEquals(
            expected = "2017-05-22",
            actual = data.batch?.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "9494788",
            actual = data.batch?.lotNumber
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "213293",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Capecitabine 500mg oral tablet (Xeloda)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.nlm.nih.gov/research/umls/rxnorm",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "org2",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sub04",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385055001",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tablet dose form (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medexample015",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#sub04",
            actual = data.ingredient?.get(0)?.itemReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "500".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
        )

        assertEquals(
            expected = "#org2",
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication09() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0321.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication09Step01(data: Medication) {

        assertEquals(
            expected = "108761006",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Capecitabine (product)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sub03",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385055001",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tablet dose form (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0321",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#sub03",
            actual = data.ingredient?.get(0)?.itemReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385055001",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tablet",
            actual = data.ingredient?.get(0)?.strength?.denominator?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "500".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedication10() {
        // Given
        val sourceJson = loadAsString("r4/medicationexample0320.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then
        assertMedication10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedication10Step01(data: Medication) {

        assertEquals(
            expected = "324252006",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Azithromycin 250mg capsule (product)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sub03",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "385055001",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tablet dose form (qualifier value)",
            actual = data.form?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "med0320",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#sub03",
            actual = data.ingredient?.get(0)?.itemReference?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.ingredient?.get(0)?.strength?.denominator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm",
            actual = data.ingredient?.get(0)?.strength?.denominator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.denominator?.value?.value
        )

        assertEquals(
            expected = "mg",
            actual = data.ingredient?.get(0)?.strength?.numerator?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.ingredient?.get(0)?.strength?.numerator?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "250".toDouble(),
            actual = data.ingredient?.get(0)?.strength?.numerator?.value?.value
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
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
