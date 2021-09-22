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
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * NutritionOrderTest.java
 *
 * Diet, formula or nutritional supplement request
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
 * patient/resident.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class NutritionOrderFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testNutritionOrder01() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-diabeticsupplement.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder01Step01(data: NutritionOrder) {

        assertEquals(
            expected = "Cashew Nuts",
            actual = data.allergyIntolerance?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AllergyIntolerance/example",
            actual = data.allergyIntolerance?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "227493005",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cashew Nut",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20140730",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "kosher",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diet",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "diabeticsupplement",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/nutrition-requests",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Glucerna",
            actual = data.supplement?.get(0)?.productName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8 oz bottle",
            actual = data.supplement?.get(0)?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.supplement?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "2015-02-10T15:00:00Z",
            actual = data.supplement?.get(0)?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.supplement?.get(0)?.schedule?.get(0)?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "24".toDouble(),
            actual = data.supplement?.get(0)?.schedule?.get(0)?.repeat?.period?.value
        )

        assertEquals(
            expected = "h",
            actual = data.supplement?.get(0)?.schedule?.get(0)?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.supplement?.get(0)?.schedule?.get(1)?.repeat?.duration?.value
        )

        assertEquals(
            expected = "h",
            actual = data.supplement?.get(0)?.schedule?.get(1)?.repeat?.durationUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HS",
            actual = data.supplement?.get(0)?.schedule?.get(1)?.repeat?.whenn?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "443051000124104",
            actual = data.supplement?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult diabetes specialty formula",
            actual = data.supplement?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.supplement?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1010",
            actual = data.supplement?.get(0)?.type?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult diabetic formula",
            actual = data.supplement?.get(0)?.type?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/supplement-type-codes",
            actual = data.supplement?.get(0)?.type?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult diabetic formula",
            actual = data.supplement?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder02() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-enteralbolus.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder02Step01(data: NutritionOrder) {

        assertEquals(
            expected = "Cashew Nuts",
            actual = data.allergyIntolerance?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AllergyIntolerance/example",
            actual = data.allergyIntolerance?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Lipid Additive",
            actual = data.enteralFormula?.additiveProductName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lipid",
            actual = data.enteralFormula?.additiveType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid",
            actual = data.enteralFormula?.additiveType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/entformula-additive",
            actual = data.enteralFormula?.additiveType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "milliliters",
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "240".toDouble(),
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "2014-09-17T16:00:00Z",
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "4".toDouble(),
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.period?.value
        )

        assertEquals(
            expected = "h",
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "240 mls every 4hrs ",
            actual = data.enteralFormula?.administrationInstruction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme High Protein Formula",
            actual = data.enteralFormula?.baseFormulaProductName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "442991000124104",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult high protein formula",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cal/mL",
            actual = data.enteralFormula?.caloricDensity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.caloricDensity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "calories per milliliter",
            actual = data.enteralFormula?.caloricDensity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.5".toDouble(),
            actual = data.enteralFormula?.caloricDensity?.value?.value
        )

        assertEquals(
            expected = "mL/d",
            actual = data.enteralFormula?.maxVolumeToDeliver?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.maxVolumeToDeliver?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "milliliter/day",
            actual = data.enteralFormula?.maxVolumeToDeliver?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1440".toDouble(),
            actual = data.enteralFormula?.maxVolumeToDeliver?.value?.value
        )

        assertEquals(
            expected = "GT",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Instillation, gastrostomy tube",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "227493005",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cashew Nut",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20140730",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dairy-free",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diet",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "enteralbolus",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org/nutritionorders",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder03() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-fiberrestricteddiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder03Step01(data: NutritionOrder) {

        assertEquals(
            expected = "Cashew Nuts",
            actual = data.allergyIntolerance?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AllergyIntolerance/example",
            actual = data.allergyIntolerance?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "227493005",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cashew Nut",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20140730",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dairy-free",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diet",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fiberrestricteddiet",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/nutrition-requests",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "g",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "grams",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toDouble(),
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "256674009",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fat",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-10",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15108003",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Restricted fiber diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1000",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fiber restricted",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fiber restricted diet",
            actual = data.oralDiet?.type?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "16208003",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Low fat diet",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1100",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Low Fat",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Low fat diet",
            actual = data.oralDiet?.type?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder04() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-texture-modified.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder04Step01(data: NutritionOrder) {

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "texturemodified",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/nutrition-requests",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "2015-02-10",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "28647000",
            actual = data.oralDiet?.texture?.get(0)?.foodType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Meat",
            actual = data.oralDiet?.texture?.get(0)?.foodType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.texture?.get(0)?.foodType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Regular, Chopped Meat",
            actual = data.oralDiet?.texture?.get(0)?.foodType?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "228049004",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chopped food",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Regular, Chopped Meat",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "435801000124108",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Texture modified diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1010",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Texture modified diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Texture modified diet",
            actual = data.oralDiet?.type?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder05() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-pureeddiet-simple.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder05Step01(data: NutritionOrder) {

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "pureeddiet-simple",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/nutrition-requests",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "439021000124105",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dietary liquid consistency - nectar thick liquid",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nectar thick liquids",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-10",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "228055009",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Liquidized food",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "226211001",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1010",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed diet",
            actual = data.oralDiet?.type?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Ensure Pudding at breakfast, lunch, supper",
            actual = data.supplement?.get(0)?.instruction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ensure Pudding 4 oz container",
            actual = data.supplement?.get(0)?.productName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "442971000124100",
            actual = data.supplement?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult high energy formula",
            actual = data.supplement?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.supplement?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1040",
            actual = data.supplement?.get(0)?.type?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult high energy pudding",
            actual = data.supplement?.get(0)?.type?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/supplement-type-codes",
            actual = data.supplement?.get(0)?.type?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adult high energy pudding",
            actual = data.supplement?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder06() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-infantenteral.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder06Step01(data: NutritionOrder) {

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme High Carbohydrate Additive",
            actual = data.enteralFormula?.additiveProductName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "carbohydrate",
            actual = data.enteralFormula?.additiveType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Carbohydrate",
            actual = data.enteralFormula?.additiveType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/entformula-additive",
            actual = data.enteralFormula?.additiveType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "[foz_us]",
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ounces",
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4".toDouble(),
            actual = data.enteralFormula?.administration?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "3".toDouble(),
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.period?.value
        )

        assertEquals(
            expected = "h",
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Add high calorie high carbohydrate additive to increase cal/oz from 24 cal/oz to 27 cal/oz.",
            actual = data.enteralFormula?.administrationInstruction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Infant Formula + Iron",
            actual = data.enteralFormula?.baseFormulaProductName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "412414007",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "infant formula + iron",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cal/[foz_us]",
            actual = data.enteralFormula?.caloricDensity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.caloricDensity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "calories per ounce",
            actual = data.enteralFormula?.caloricDensity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20".toDouble(),
            actual = data.enteralFormula?.caloricDensity?.value?.value
        )

        assertEquals(
            expected = "[foz_us]",
            actual = data.enteralFormula?.maxVolumeToDeliver?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.maxVolumeToDeliver?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ounces",
            actual = data.enteralFormula?.maxVolumeToDeliver?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "32".toDouble(),
            actual = data.enteralFormula?.maxVolumeToDeliver?.value?.value
        )

        assertEquals(
            expected = "PO",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Swallow, oral",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.userSelected?.value
        )

        assertEquals(
            expected = "infantenteral",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org/nutritionorders",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder07() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-enteralcontinuous.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder07Step01(data: NutritionOrder) {

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL/h",
            actual = data.enteralFormula?.administration?.get(0)?.rateQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.administration?.get(0)?.rateQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ml/hr",
            actual = data.enteralFormula?.administration?.get(0)?.rateQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "60".toDouble(),
            actual = data.enteralFormula?.administration?.get(0)?.rateQuantity?.value?.value
        )

        assertEquals(
            expected = "2014-09-17T07:00:00Z",
            actual = data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "mL/h",
            actual = data.enteralFormula?.administration?.get(1)?.rateQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.administration?.get(1)?.rateQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ml/hr",
            actual = data.enteralFormula?.administration?.get(1)?.rateQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80".toDouble(),
            actual = data.enteralFormula?.administration?.get(1)?.rateQuantity?.value?.value
        )

        assertEquals(
            expected = "2014-09-17T11:00:00Z",
            actual = data.enteralFormula?.administration?.get(1)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "mL/h",
            actual = data.enteralFormula?.administration?.get(2)?.rateQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.administration?.get(2)?.rateQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ml/hr",
            actual = data.enteralFormula?.administration?.get(2)?.rateQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toDouble(),
            actual = data.enteralFormula?.administration?.get(2)?.rateQuantity?.value?.value
        )

        assertEquals(
            expected = "2014-09-17T15:00:00Z",
            actual = data.enteralFormula?.administration?.get(2)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Hold feedings from 7 pm to 7 am. Add MCT oil to increase calories from 1.0 cal/mL to 1.5 cal/mL",
            actual = data.enteralFormula?.administrationInstruction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = " Acme Diabetes Formula",
            actual = data.enteralFormula?.baseFormulaProductName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6547210000124112",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Diabetic specialty enteral formula",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.enteralFormula?.baseFormulaType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cal/mL",
            actual = data.enteralFormula?.caloricDensity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.caloricDensity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "calories per milliliter",
            actual = data.enteralFormula?.caloricDensity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.enteralFormula?.caloricDensity?.value?.value
        )

        assertEquals(
            expected = "mL/d",
            actual = data.enteralFormula?.maxVolumeToDeliver?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.enteralFormula?.maxVolumeToDeliver?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "milliliter/day",
            actual = data.enteralFormula?.maxVolumeToDeliver?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "880".toDouble(),
            actual = data.enteralFormula?.maxVolumeToDeliver?.value?.value
        )

        assertEquals(
            expected = "NGT",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Instillation, nasogastric tube",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            actual = data.enteralFormula?.routeofAdministration?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "enteralcontinuous",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org/nutritionorders",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder08() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-cardiacdiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder08Step01(data: NutritionOrder) {

        assertEquals(
            expected = "Cashew Nuts",
            actual = data.allergyIntolerance?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AllergyIntolerance/example",
            actual = data.allergyIntolerance?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "227493005",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cashew Nut",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20140730",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dairy-free",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diet",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cardiacdiet",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/nutrition-requests",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "Starting on 2/10 breakfast, maximum 400 ml fluids per meal",
            actual = data.oralDiet?.instruction
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "g",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "grams",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "39972003",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sodium",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.oralDiet?.nutrient?.get(1)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.oralDiet?.nutrient?.get(1)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "milliliter",
            actual = data.oralDiet?.nutrient?.get(1)?.amount?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1500".toDouble(),
            actual = data.oralDiet?.nutrient?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "33463005",
            actual = data.oralDiet?.nutrient?.get(1)?.modifier?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fluid",
            actual = data.oralDiet?.nutrient?.get(1)?.modifier?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.nutrient?.get(1)?.modifier?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "386619000",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Low sodium diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1040",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Low Sodium Diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Low sodium diet",
            actual = data.oralDiet?.type?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "226208002",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fluid restricted diet",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1040",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fluid restricted diet",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(1)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fluid restricted diet",
            actual = data.oralDiet?.type?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder09() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-pureeddiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder09Step01(data: NutritionOrder) {

        assertEquals(
            expected = "Cashew Nuts",
            actual = data.allergyIntolerance?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AllergyIntolerance/example",
            actual = data.allergyIntolerance?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "227493005",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cashew Nut",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20140730",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dairy-free",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diet",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pureeddiet",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/nutrition-requests",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "439021000124105",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dietary liquid consistency - nectar thick liquid",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nectar thick liquids",
            actual = data.oralDiet?.fluidConsistencyType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-10",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "228055009",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Liquidized food",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed",
            actual = data.oralDiet?.texture?.get(0)?.modifier?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "226211001",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1010",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pureed diet",
            actual = data.oralDiet?.type?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testNutritionOrder10() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-diabeticdiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertNutritionOrder10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNutritionOrder10Step01(data: NutritionOrder) {

        assertEquals(
            expected = "Cashew Nuts",
            actual = data.allergyIntolerance?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AllergyIntolerance/example",
            actual = data.allergyIntolerance?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-09-17",
            actual = data.dateTime?.value.toString()
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "227493005",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cashew Nut",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20140730",
            actual = data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dairy-free",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diet",
            actual = data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "diabeticdiet",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/nutrition-requests",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "g",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "grams",
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "75".toDouble(),
            actual = data.oralDiet?.nutrient?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "2331003",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Carbohydrate",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-10",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "160670007",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Diabetic diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1030",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DD - Diabetic diet",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealthhospital.org/diet-type-codes",
            actual = data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DD - Diabetic diet",
            actual = data.oralDiet?.type?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.orderer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.orderer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
