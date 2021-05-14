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
import care.data4life.hl7.fhir.stu3.codesystem.MedicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicationTest.java
 *
 * Definition of a Medication
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the
 * ingredients and the packaging for a medication.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationTest {

    val parser = FhirStu3Parser()

    @Test
    fun testMedication01() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0307.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "2019-10-31",
            data.`package`?.batch?.get(0)?.expirationDate?.value.toString()
        )
        assertEquals(
            "12345",
            data.`package`?.batch?.get(0)?.lotNumber
        )
        assertEquals(
            "415818006",
            data.`package`?.container?.coding?.get(0)?.code
        )
        assertEquals(
            "Vial",
            data.`package`?.container?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.`package`?.container?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.`package`?.content?.get(0)?.amount?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.`package`?.content?.get(0)?.amount?.system
        )
        assertEquals(
            "10".toDouble(),
            data.`package`?.content?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "325072002",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Insulin Aspart (substance)",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "0169-7501-11",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Novolog 100u/ml",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/sid/ndc",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "org3",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "385219001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Injection solution (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "med0307",
            data.id
        )
        assertEquals(
            "mL",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "1".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "U",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "100".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "325072002",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Insulin Aspart (substance)",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.isBrand?.value
        )
        assertEquals(
            "#org3",
            data.manufacturer?.reference
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

    @Test
    fun testMedication02() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0311.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "373994007",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Prednisone 5mg tablet (Product)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "sub03",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "385055001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Tablet dose form (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "med0311",
            data.id
        )
        assertEquals(
            "TAB",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/orderableDrugForm",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "1".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "mg",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "5".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "#sub03",
            data.ingredient?.get(0)?.itemReference?.reference
        )
        assertEquals(
            "False".toBoolean(),
            data.isBrand?.value
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

    @Test
    fun testMedication03() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0310.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "430127000",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Oral Form Oxycodone (product)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "sub03",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "385055001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Tablet dose form (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "med0310",
            data.id
        )
        assertEquals(
            "TAB",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/orderableDrugForm",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "1".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "mg",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "5".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "#sub03",
            data.ingredient?.get(0)?.itemReference?.reference
        )
        assertEquals(
            "False".toBoolean(),
            data.isBrand?.value
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

    @Test
    fun testMedication04() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0306.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "2019-10-31",
            data.`package`?.batch?.get(0)?.expirationDate?.value.toString()
        )
        assertEquals(
            "12345",
            data.`package`?.batch?.get(0)?.lotNumber
        )
        assertEquals(
            "51144-050-01",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Adcetris",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/sid/ndc",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "org3",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "421637006",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Lyophilized powder for injectable solution (qualifier value) ",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "med0306",
            data.id
        )
        assertEquals(
            "True".toBoolean(),
            data.isBrand?.value
        )
        assertEquals(
            "#org3",
            data.manufacturer?.reference
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

    @Test
    fun testMedication05() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0301.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "2017-05-22",
            data.`package`?.batch?.get(0)?.expirationDate?.value.toString()
        )
        assertEquals(
            "9494788",
            data.`package`?.batch?.get(0)?.lotNumber
        )
        assertEquals(
            "415818006",
            data.`package`?.container?.coding?.get(0)?.code
        )
        assertEquals(
            "Vial",
            data.`package`?.container?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.`package`?.container?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.`package`?.content?.get(0)?.amount?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.`package`?.content?.get(0)?.amount?.system
        )
        assertEquals(
            "10".toDouble(),
            data.`package`?.content?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "324337001",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Vancomycin 500mg powder for infusion solution vial (product)",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "0069-2587-10",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Vancomycin Hydrochloride (VANCOMYCIN HYDROCHLORIDE)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/sid/ndc",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "org4",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "385219001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Injection Solution (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "med0301",
            data.id
        )
        assertEquals(
            "application/pdf",
            data.image?.get(0)?.contentType
        )
        assertEquals(
            "Vancomycin Image",
            data.image?.get(0)?.title
        )
        assertEquals(
            "https://www.drugs.com/images/pills/fio/AKN07410.JPG",
            data.image?.get(0)?.url
        )
        assertEquals(
            "mL",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "10".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "mg",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "500".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.ingredient?.get(0)?.isActive?.value
        )
        assertEquals(
            "66955",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Vancomycin Hydrochloride",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.nlm.nih.gov/research/umls/rxnorm",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.isBrand?.value
        )
        assertEquals(
            "False".toBoolean(),
            data.isOverTheCounter?.value
        )
        assertEquals(
            "#org4",
            data.manufacturer?.reference
        )
        assertEquals(
            MedicationStatus.ACTIVE,
            data.status
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

    @Test
    fun testMedication06() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0317.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "385219001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Injection Solution (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "Injection Solution (qualifier value)",
            data.form?.text
        )
        assertEquals(
            "med0317",
            data.id
        )
        assertEquals(
            "mL",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "1".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "mEq",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "2".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "204520",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Potassium Chloride",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.nlm.nih.gov/research/umls/rxnorm",
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.ingredient?.get(1)?.amount?.denominator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(1)?.amount?.denominator?.system
        )
        assertEquals(
            "100".toDouble(),
            data.ingredient?.get(1)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "g",
            data.ingredient?.get(1)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(1)?.amount?.numerator?.system
        )
        assertEquals(
            "0.9".toDouble(),
            data.ingredient?.get(1)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "313002",
            data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Sodium Chloride 0.9% injectable solution",
            data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.nlm.nih.gov/research/umls/rxnorm",
            data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "False".toBoolean(),
            data.isBrand?.value
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

    @Test
    fun testMedication07() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample1.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "Amoxicillin 250mg/5ml Suspension",
            data.code?.text
        )
        assertEquals(
            "medicationexample1",
            data.id
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Amoxicillin 250mg/5ml Suspension</div>",
            data.text?.div
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

    @Test
    fun testMedication08() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample15.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "2017-05-22",
            data.`package`?.batch?.get(0)?.expirationDate?.value.toString()
        )
        assertEquals(
            "9494788",
            data.`package`?.batch?.get(0)?.lotNumber
        )
        assertEquals(
            "419672006",
            data.`package`?.container?.coding?.get(0)?.code
        )
        assertEquals(
            "Bottle - unit of produce usage (qualifier value)",
            data.`package`?.container?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.`package`?.container?.coding?.get(0)?.system
        )
        assertEquals(
            "134622004",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Capecitabine 500mg tablets (product)",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "213293",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Capecitabine 500mg oral tablet (Xeloda)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.nlm.nih.gov/research/umls/rxnorm",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "org2",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "sub04",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "385055001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Tablet dose form (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "medexample015",
            data.id
        )
        assertEquals(
            "TAB",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/orderableDrugForm",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "1".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "mg",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "500".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "#sub04",
            data.ingredient?.get(0)?.itemReference?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.isBrand?.value
        )
        assertEquals(
            "#org2",
            data.manufacturer?.reference
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

    @Test
    fun testMedication09() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0321.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "108761006",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Capecitabine (product)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "sub03",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "385055001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Tablet dose form (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "med0321",
            data.id
        )
        assertEquals(
            "Tablet dose form (qualifier value)",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "1".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "mg",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "500".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "#sub03",
            data.ingredient?.get(0)?.itemReference?.reference
        )
        assertEquals(
            "False".toBoolean(),
            data.isBrand?.value
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

    @Test
    fun testMedication10() {
        // Given
        val sourceJson = loadAsString("stu3/medicationexample0320.json")

        // When
        val data = parser.toFhir(Medication::class, sourceJson)

        // Then

        assertEquals(
            "324252006",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Azithromycin 250mg capsule (product)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "sub03",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "385055001",
            data.form?.coding?.get(0)?.code
        )
        assertEquals(
            "Tablet dose form (qualifier value)",
            data.form?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.form?.coding?.get(0)?.system
        )
        assertEquals(
            "med0320",
            data.id
        )
        assertEquals(
            "TAB",
            data.ingredient?.get(0)?.amount?.denominator?.code
        )
        assertEquals(
            "http://hl7.org/fhir/v3/orderableDrugForm",
            data.ingredient?.get(0)?.amount?.denominator?.system
        )
        assertEquals(
            "1".toDouble(),
            data.ingredient?.get(0)?.amount?.denominator?.value?.value
        )
        assertEquals(
            "mg",
            data.ingredient?.get(0)?.amount?.numerator?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.ingredient?.get(0)?.amount?.numerator?.system
        )
        assertEquals(
            "250".toDouble(),
            data.ingredient?.get(0)?.amount?.numerator?.value?.value
        )
        assertEquals(
            "#sub03",
            data.ingredient?.get(0)?.itemReference?.reference
        )
        assertEquals(
            "False".toBoolean(),
            data.isBrand?.value
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
