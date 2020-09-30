/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model


import care.data4life.fhir.stu3.FhirStu3Parser
import care.data4life.fhir.stu3.codesystem.MedicationStatus
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * MedicationTest.java
 *
 * Definition of a Medication.
 *
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class MedicationTest {

    val parser = FhirStu3Parser()


    @Test
    fun testMedication1() {
        val sourceJson = loadAsString("medicationexample0307.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.`package`?.batch?.get(0)?.expirationDate, "2019-10-31")
        assertEquals(data.`package`?.batch?.get(0)?.lotNumber, "12345")
        assertEquals(data.`package`?.container?.coding?.get(0)?.code, "415818006")
        assertEquals(data.`package`?.container?.coding?.get(0)?.display, "Vial")
        assertEquals(data.`package`?.container?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.`package`?.content?.get(0)?.amount?.code, "mL")
        assertEquals(data.`package`?.content?.get(0)?.amount?.system, "http://unitsofmeasure.org")
        assertEquals(data.`package`?.content?.get(0)?.amount?.value, "10")
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code,
            "325072002"
        )
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display,
            "Insulin Aspart (substance)"
        )
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system,
            "http://snomed.info/sct"
        )
        assertEquals(data.code?.coding?.get(0)?.code, "0169-7501-11")
        assertEquals(data.code?.coding?.get(0)?.display, "Novolog 100u/ml")
        assertEquals(data.code?.coding?.get(0)?.system, "http://hl7.org/fhir/sid/ndc")
        assertEquals(data.contained?.get(0)?.id, "org3")
        assertEquals(data.form?.coding?.get(0)?.code, "385219001")
        assertEquals(data.form?.coding?.get(0)?.display, "Injection solution (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "med0307")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.code, "mL")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "1")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "U")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "100")
        assertEquals(
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code,
            "325072002"
        )
        assertEquals(
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display,
            "Insulin Aspart (substance)"
        )
        assertEquals(
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system,
            "http://snomed.info/sct"
        )
        assertEquals(data.isBrand, "True")
        assertEquals(data.manufacturer?.reference, "#org3")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication2() {
        val sourceJson = loadAsString("medicationexample0311.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "373994007")
        assertEquals(data.code?.coding?.get(0)?.display, "Prednisone 5mg tablet (Product)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.contained?.get(0)?.id, "sub03")
        assertEquals(data.form?.coding?.get(0)?.code, "385055001")
        assertEquals(data.form?.coding?.get(0)?.display, "Tablet dose form (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "med0311")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.code, "TAB")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.system,
            "http://hl7.org/fhir/v3/orderableDrugForm"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "1")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "mg")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "5")
        assertEquals(data.ingredient?.get(0)?.itemReference?.reference, "#sub03")
        assertEquals(data.isBrand, "False")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication3() {
        val sourceJson = loadAsString("medicationexample0310.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "430127000")
        assertEquals(data.code?.coding?.get(0)?.display, "Oral Form Oxycodone (product)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.contained?.get(0)?.id, "sub03")
        assertEquals(data.form?.coding?.get(0)?.code, "385055001")
        assertEquals(data.form?.coding?.get(0)?.display, "Tablet dose form (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "med0310")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.code, "TAB")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.system,
            "http://hl7.org/fhir/v3/orderableDrugForm"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "1")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "mg")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "5")
        assertEquals(data.ingredient?.get(0)?.itemReference?.reference, "#sub03")
        assertEquals(data.isBrand, "False")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication4() {
        val sourceJson = loadAsString("medicationexample0306.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.`package`?.batch?.get(0)?.expirationDate, "2019-10-31")
        assertEquals(data.`package`?.batch?.get(0)?.lotNumber, "12345")
        assertEquals(data.code?.coding?.get(0)?.code, "51144-050-01")
        assertEquals(data.code?.coding?.get(0)?.display, "Adcetris")
        assertEquals(data.code?.coding?.get(0)?.system, "http://hl7.org/fhir/sid/ndc")
        assertEquals(data.contained?.get(0)?.id, "org3")
        assertEquals(data.form?.coding?.get(0)?.code, "421637006")
        assertEquals(
            data.form?.coding?.get(0)?.display,
            "Lyophilized powder for injectable solution (qualifier value) "
        )
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "med0306")
        assertEquals(data.isBrand, "True")
        assertEquals(data.manufacturer?.reference, "#org3")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication5() {
        val sourceJson = loadAsString("medicationexample0301.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.`package`?.batch?.get(0)?.expirationDate, "2017-05-22")
        assertEquals(data.`package`?.batch?.get(0)?.lotNumber, "9494788")
        assertEquals(data.`package`?.container?.coding?.get(0)?.code, "415818006")
        assertEquals(data.`package`?.container?.coding?.get(0)?.display, "Vial")
        assertEquals(data.`package`?.container?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.`package`?.content?.get(0)?.amount?.code, "mL")
        assertEquals(data.`package`?.content?.get(0)?.amount?.system, "http://unitsofmeasure.org")
        assertEquals(data.`package`?.content?.get(0)?.amount?.value, "10")
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code,
            "324337001"
        )
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display,
            "Vancomycin 500mg powder for infusion solution vial (product)"
        )
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system,
            "http://snomed.info/sct"
        )
        assertEquals(data.code?.coding?.get(0)?.code, "0069-2587-10")
        assertEquals(
            data.code?.coding?.get(0)?.display,
            "Vancomycin Hydrochloride (VANCOMYCIN HYDROCHLORIDE)"
        )
        assertEquals(data.code?.coding?.get(0)?.system, "http://hl7.org/fhir/sid/ndc")
        assertEquals(data.contained?.get(0)?.id, "org4")
        assertEquals(data.form?.coding?.get(0)?.code, "385219001")
        assertEquals(data.form?.coding?.get(0)?.display, "Injection Solution (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "med0301")
        assertEquals(data.image?.get(0)?.contentType, "application/pdf")
        assertEquals(data.image?.get(0)?.title, "Vancomycin Image")
        assertEquals(data.image?.get(0)?.url, "https://www.drugs.com/images/pills/fio/AKN07410.JPG")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.code, "mL")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "10")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "mg")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "500")
        assertEquals(data.ingredient?.get(0)?.isActive, "True")
        assertEquals(data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code, "66955")
        assertEquals(
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display,
            "Vancomycin Hydrochloride"
        )
        assertEquals(
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system,
            "http://www.nlm.nih.gov/research/umls/rxnorm"
        )
        assertEquals(data.isBrand, "True")
        assertEquals(data.isOverTheCounter, "False")
        assertEquals(data.manufacturer?.reference, "#org4")
        assertEquals(data.status, MedicationStatus.ACTIVE)
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication6() {
        val sourceJson = loadAsString("medicationexample0317.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.form?.coding?.get(0)?.code, "385219001")
        assertEquals(data.form?.coding?.get(0)?.display, "Injection Solution (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.form?.text, "Injection Solution (qualifier value)")
        assertEquals(data.id, "med0317")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.code, "mL")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "1")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "mEq")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "2")
        assertEquals(data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code, "204520")
        assertEquals(
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display,
            "Potassium Chloride"
        )
        assertEquals(
            data.ingredient?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system,
            "http://www.nlm.nih.gov/research/umls/rxnorm"
        )
        assertEquals(data.ingredient?.get(1)?.amount?.denominator?.code, "mL")
        assertEquals(
            data.ingredient?.get(1)?.amount?.denominator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(1)?.amount?.denominator?.value, "100")
        assertEquals(data.ingredient?.get(1)?.amount?.numerator?.code, "g")
        assertEquals(
            data.ingredient?.get(1)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(1)?.amount?.numerator?.value, "0.9")
        assertEquals(data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.code, "313002")
        assertEquals(
            data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.display,
            "Sodium Chloride 0.9% injectable solution"
        )
        assertEquals(
            data.ingredient?.get(1)?.itemCodeableConcept?.coding?.get(0)?.system,
            "http://www.nlm.nih.gov/research/umls/rxnorm"
        )
        assertEquals(data.isBrand, "False")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication7() {
        val sourceJson = loadAsString("medicationexample1.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.code?.text, "Amoxicillin 250mg/5ml Suspension")
        assertEquals(data.id, "medicationexample1")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Amoxicillin 250mg/5ml Suspension</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication8() {
        val sourceJson = loadAsString("medicationexample15.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.`package`?.batch?.get(0)?.expirationDate, "2017-05-22")
        assertEquals(data.`package`?.batch?.get(0)?.lotNumber, "9494788")
        assertEquals(data.`package`?.container?.coding?.get(0)?.code, "419672006")
        assertEquals(
            data.`package`?.container?.coding?.get(0)?.display,
            "Bottle - unit of produce usage (qualifier value)"
        )
        assertEquals(data.`package`?.container?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code,
            "134622004"
        )
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.display,
            "Capecitabine 500mg tablets (product)"
        )
        assertEquals(
            data.`package`?.content?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system,
            "http://snomed.info/sct"
        )
        assertEquals(data.code?.coding?.get(0)?.code, "213293")
        assertEquals(data.code?.coding?.get(0)?.display, "Capecitabine 500mg oral tablet (Xeloda)")
        assertEquals(
            data.code?.coding?.get(0)?.system,
            "http://www.nlm.nih.gov/research/umls/rxnorm"
        )
        assertEquals(data.contained?.get(0)?.id, "org2")
        assertEquals(data.contained?.get(1)?.id, "sub04")
        assertEquals(data.form?.coding?.get(0)?.code, "385055001")
        assertEquals(data.form?.coding?.get(0)?.display, "Tablet dose form (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "medexample015")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.code, "TAB")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.system,
            "http://hl7.org/fhir/v3/orderableDrugForm"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "1")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "mg")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "500")
        assertEquals(data.ingredient?.get(0)?.itemReference?.reference, "#sub04")
        assertEquals(data.isBrand, "True")
        assertEquals(data.manufacturer?.reference, "#org2")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication9() {
        val sourceJson = loadAsString("medicationexample0321.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "108761006")
        assertEquals(data.code?.coding?.get(0)?.display, "Capecitabine (product)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.contained?.get(0)?.id, "sub03")
        assertEquals(data.form?.coding?.get(0)?.code, "385055001")
        assertEquals(data.form?.coding?.get(0)?.display, "Tablet dose form (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "med0321")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.code,
            "Tablet dose form (qualifier value)"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.system, "http://snomed.info/sct")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "1")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "mg")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "500")
        assertEquals(data.ingredient?.get(0)?.itemReference?.reference, "#sub03")
        assertEquals(data.isBrand, "False")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testMedication10() {
        val sourceJson = loadAsString("medicationexample0320.json")

        val data = parser.toFhir(Medication::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "324252006")
        assertEquals(data.code?.coding?.get(0)?.display, "Azithromycin 250mg capsule (product)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.contained?.get(0)?.id, "sub03")
        assertEquals(data.form?.coding?.get(0)?.code, "385055001")
        assertEquals(data.form?.coding?.get(0)?.display, "Tablet dose form (qualifier value)")
        assertEquals(data.form?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "med0320")
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.code, "TAB")
        assertEquals(
            data.ingredient?.get(0)?.amount?.denominator?.system,
            "http://hl7.org/fhir/v3/orderableDrugForm"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.denominator?.value, "1")
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.code, "mg")
        assertEquals(
            data.ingredient?.get(0)?.amount?.numerator?.system,
            "http://unitsofmeasure.org"
        )
        assertEquals(data.ingredient?.get(0)?.amount?.numerator?.value, "250")
        assertEquals(data.ingredient?.get(0)?.itemReference?.reference, "#sub03")
        assertEquals(data.isBrand, "False")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


