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
class NutritionOrderTest {

    val parser = FhirR4Parser()

    @Test
    fun testNutritionOrder01() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-diabeticsupplement.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "Cashew Nuts",
            data.allergyIntolerance?.get(0)?.display
        )
        assertEquals(
            "AllergyIntolerance/example",
            data.allergyIntolerance?.get(0)?.reference
        )
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "227493005",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Cashew Nut",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "20140730",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
        )
        assertEquals(
            "kosher",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/diet",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "diabeticsupplement",
            data.id
        )
        assertEquals(
            "http://goodhealthhospital.org/nutrition-requests",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Glucerna",
            data.supplement?.get(0)?.productName
        )
        assertEquals(
            "8 oz bottle",
            data.supplement?.get(0)?.quantity?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.supplement?.get(0)?.quantity?.value?.value
        )
        assertEquals(
            "2015-02-10T15:00:00Z",
            data.supplement?.get(0)?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.supplement?.get(0)?.schedule?.get(0)?.repeat?.frequency?.value
        )
        assertEquals(
            "24".toDouble(),
            data.supplement?.get(0)?.schedule?.get(0)?.repeat?.period?.value
        )
        assertEquals(
            "h",
            data.supplement?.get(0)?.schedule?.get(0)?.repeat?.periodUnit
        )
        assertEquals(
            "1".toDouble(),
            data.supplement?.get(0)?.schedule?.get(1)?.repeat?.duration?.value
        )
        assertEquals(
            "h",
            data.supplement?.get(0)?.schedule?.get(1)?.repeat?.durationUnit
        )
        assertEquals(
            "HS",
            data.supplement?.get(0)?.schedule?.get(1)?.repeat?.whenn?.get(0)
        )
        assertEquals(
            "443051000124104",
            data.supplement?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult diabetes specialty formula",
            data.supplement?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.supplement?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "1010",
            data.supplement?.get(0)?.type?.coding?.get(1)?.code
        )
        assertEquals(
            "Adult diabetic formula",
            data.supplement?.get(0)?.type?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/supplement-type-codes",
            data.supplement?.get(0)?.type?.coding?.get(1)?.system
        )
        assertEquals(
            "Adult diabetic formula",
            data.supplement?.get(0)?.type?.text
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
    fun testNutritionOrder02() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-enteralbolus.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "Cashew Nuts",
            data.allergyIntolerance?.get(0)?.display
        )
        assertEquals(
            "AllergyIntolerance/example",
            data.allergyIntolerance?.get(0)?.reference
        )
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "Acme Lipid Additive",
            data.enteralFormula?.additiveProductName
        )
        assertEquals(
            "lipid",
            data.enteralFormula?.additiveType?.coding?.get(0)?.code
        )
        assertEquals(
            "Lipid",
            data.enteralFormula?.additiveType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/entformula-additive",
            data.enteralFormula?.additiveType?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.enteralFormula?.administration?.get(0)?.quantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.administration?.get(0)?.quantity?.system
        )
        assertEquals(
            "milliliters",
            data.enteralFormula?.administration?.get(0)?.quantity?.unit
        )
        assertEquals(
            "240".toDouble(),
            data.enteralFormula?.administration?.get(0)?.quantity?.value?.value
        )
        assertEquals(
            "2014-09-17T16:00:00Z",
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.frequency?.value
        )
        assertEquals(
            "4".toDouble(),
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.period?.value
        )
        assertEquals(
            "h",
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.periodUnit
        )
        assertEquals(
            "240 mls every 4hrs ",
            data.enteralFormula?.administrationInstruction
        )
        assertEquals(
            "Acme High Protein Formula",
            data.enteralFormula?.baseFormulaProductName
        )
        assertEquals(
            "442991000124104",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult high protein formula",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.system
        )
        assertEquals(
            "cal/mL",
            data.enteralFormula?.caloricDensity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.caloricDensity?.system
        )
        assertEquals(
            "calories per milliliter",
            data.enteralFormula?.caloricDensity?.unit
        )
        assertEquals(
            "1.5".toDouble(),
            data.enteralFormula?.caloricDensity?.value?.value
        )
        assertEquals(
            "mL/d",
            data.enteralFormula?.maxVolumeToDeliver?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.maxVolumeToDeliver?.system
        )
        assertEquals(
            "milliliter/day",
            data.enteralFormula?.maxVolumeToDeliver?.unit
        )
        assertEquals(
            "1440".toDouble(),
            data.enteralFormula?.maxVolumeToDeliver?.value?.value
        )
        assertEquals(
            "GT",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.code
        )
        assertEquals(
            "Instillation, gastrostomy tube",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.system
        )
        assertEquals(
            "227493005",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Cashew Nut",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "20140730",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
        )
        assertEquals(
            "dairy-free",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/diet",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "enteralbolus",
            data.id
        )
        assertEquals(
            "http://www.acme.org/nutritionorders",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
    fun testNutritionOrder03() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-fiberrestricteddiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "Cashew Nuts",
            data.allergyIntolerance?.get(0)?.display
        )
        assertEquals(
            "AllergyIntolerance/example",
            data.allergyIntolerance?.get(0)?.reference
        )
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "227493005",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Cashew Nut",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "20140730",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
        )
        assertEquals(
            "dairy-free",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/diet",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "fiberrestricteddiet",
            data.id
        )
        assertEquals(
            "http://goodhealthhospital.org/nutrition-requests",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "g",
            data.oralDiet?.nutrient?.get(0)?.amount?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.oralDiet?.nutrient?.get(0)?.amount?.system
        )
        assertEquals(
            "grams",
            data.oralDiet?.nutrient?.get(0)?.amount?.unit
        )
        assertEquals(
            "50".toDouble(),
            data.oralDiet?.nutrient?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "256674009",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.code
        )
        assertEquals(
            "Fat",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-02-10",
            data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "3".toLong(),
            data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
        )
        assertEquals(
            "15108003",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Restricted fiber diet",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1000",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "Fiber restricted",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "Fiber restricted diet",
            data.oralDiet?.type?.get(0)?.text
        )
        assertEquals(
            "16208003",
            data.oralDiet?.type?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "Low fat diet",
            data.oralDiet?.type?.get(1)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            "1100",
            data.oralDiet?.type?.get(1)?.coding?.get(1)?.code
        )
        assertEquals(
            "Low Fat",
            data.oralDiet?.type?.get(1)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(1)?.coding?.get(1)?.system
        )
        assertEquals(
            "Low fat diet",
            data.oralDiet?.type?.get(1)?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
    fun testNutritionOrder04() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-texture-modified.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "texturemodified",
            data.id
        )
        assertEquals(
            "http://goodhealthhospital.org/nutrition-requests",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "2015-02-10",
            data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "3".toLong(),
            data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
        )
        assertEquals(
            "28647000",
            data.oralDiet?.texture?.get(0)?.foodType?.coding?.get(0)?.code
        )
        assertEquals(
            "Meat",
            data.oralDiet?.texture?.get(0)?.foodType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.texture?.get(0)?.foodType?.coding?.get(0)?.system
        )
        assertEquals(
            "Regular, Chopped Meat",
            data.oralDiet?.texture?.get(0)?.foodType?.text
        )
        assertEquals(
            "228049004",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.code
        )
        assertEquals(
            "Chopped food",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.system
        )
        assertEquals(
            "Regular, Chopped Meat",
            data.oralDiet?.texture?.get(0)?.modifier?.text
        )
        assertEquals(
            "435801000124108",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Texture modified diet",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1010",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "Texture modified diet",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "Texture modified diet",
            data.oralDiet?.type?.get(0)?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
    fun testNutritionOrder05() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-pureeddiet-simple.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "pureeddiet-simple",
            data.id
        )
        assertEquals(
            "http://goodhealthhospital.org/nutrition-requests",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "439021000124105",
            data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Dietary liquid consistency - nectar thick liquid",
            data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Nectar thick liquids",
            data.oralDiet?.fluidConsistencyType?.get(0)?.text
        )
        assertEquals(
            "2015-02-10",
            data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "3".toLong(),
            data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
        )
        assertEquals(
            "228055009",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.code
        )
        assertEquals(
            "Liquidized food",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.system
        )
        assertEquals(
            "Pureed",
            data.oralDiet?.texture?.get(0)?.modifier?.text
        )
        assertEquals(
            "226211001",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Pureed diet",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1010",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "Pureed diet",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "Pureed diet",
            data.oralDiet?.type?.get(0)?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Ensure Pudding at breakfast, lunch, supper",
            data.supplement?.get(0)?.instruction
        )
        assertEquals(
            "Ensure Pudding 4 oz container",
            data.supplement?.get(0)?.productName
        )
        assertEquals(
            "442971000124100",
            data.supplement?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult high energy formula",
            data.supplement?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.supplement?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "1040",
            data.supplement?.get(0)?.type?.coding?.get(1)?.code
        )
        assertEquals(
            "Adult high energy pudding",
            data.supplement?.get(0)?.type?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/supplement-type-codes",
            data.supplement?.get(0)?.type?.coding?.get(1)?.system
        )
        assertEquals(
            "Adult high energy pudding",
            data.supplement?.get(0)?.type?.text
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
    fun testNutritionOrder06() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-infantenteral.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "Acme High Carbohydrate Additive",
            data.enteralFormula?.additiveProductName
        )
        assertEquals(
            "carbohydrate",
            data.enteralFormula?.additiveType?.coding?.get(0)?.code
        )
        assertEquals(
            "Carbohydrate",
            data.enteralFormula?.additiveType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/entformula-additive",
            data.enteralFormula?.additiveType?.coding?.get(0)?.system
        )
        assertEquals(
            "[foz_us]",
            data.enteralFormula?.administration?.get(0)?.quantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.administration?.get(0)?.quantity?.system
        )
        assertEquals(
            "ounces",
            data.enteralFormula?.administration?.get(0)?.quantity?.unit
        )
        assertEquals(
            "4".toDouble(),
            data.enteralFormula?.administration?.get(0)?.quantity?.value?.value
        )
        assertEquals(
            "2014-09-17",
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.frequency?.value
        )
        assertEquals(
            "3".toDouble(),
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.period?.value
        )
        assertEquals(
            "h",
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.periodUnit
        )
        assertEquals(
            "Add high calorie high carbohydrate additive to increase cal/oz from 24 cal/oz to 27 cal/oz.",
            data.enteralFormula?.administrationInstruction
        )
        assertEquals(
            "Acme Infant Formula + Iron",
            data.enteralFormula?.baseFormulaProductName
        )
        assertEquals(
            "412414007",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.code
        )
        assertEquals(
            "infant formula + iron",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.system
        )
        assertEquals(
            "cal/[foz_us]",
            data.enteralFormula?.caloricDensity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.caloricDensity?.system
        )
        assertEquals(
            "calories per ounce",
            data.enteralFormula?.caloricDensity?.unit
        )
        assertEquals(
            "20".toDouble(),
            data.enteralFormula?.caloricDensity?.value?.value
        )
        assertEquals(
            "[foz_us]",
            data.enteralFormula?.maxVolumeToDeliver?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.maxVolumeToDeliver?.system
        )
        assertEquals(
            "ounces",
            data.enteralFormula?.maxVolumeToDeliver?.unit
        )
        assertEquals(
            "32".toDouble(),
            data.enteralFormula?.maxVolumeToDeliver?.value?.value
        )
        assertEquals(
            "PO",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.code
        )
        assertEquals(
            "Swallow, oral",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.userSelected?.value
        )
        assertEquals(
            "infantenteral",
            data.id
        )
        assertEquals(
            "http://www.acme.org/nutritionorders",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
    fun testNutritionOrder07() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-enteralcontinuous.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "mL/h",
            data.enteralFormula?.administration?.get(0)?.rateQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.administration?.get(0)?.rateQuantity?.system
        )
        assertEquals(
            "ml/hr",
            data.enteralFormula?.administration?.get(0)?.rateQuantity?.unit
        )
        assertEquals(
            "60".toDouble(),
            data.enteralFormula?.administration?.get(0)?.rateQuantity?.value?.value
        )
        assertEquals(
            "2014-09-17T07:00:00Z",
            data.enteralFormula?.administration?.get(0)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "mL/h",
            data.enteralFormula?.administration?.get(1)?.rateQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.administration?.get(1)?.rateQuantity?.system
        )
        assertEquals(
            "ml/hr",
            data.enteralFormula?.administration?.get(1)?.rateQuantity?.unit
        )
        assertEquals(
            "80".toDouble(),
            data.enteralFormula?.administration?.get(1)?.rateQuantity?.value?.value
        )
        assertEquals(
            "2014-09-17T11:00:00Z",
            data.enteralFormula?.administration?.get(1)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "mL/h",
            data.enteralFormula?.administration?.get(2)?.rateQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.administration?.get(2)?.rateQuantity?.system
        )
        assertEquals(
            "ml/hr",
            data.enteralFormula?.administration?.get(2)?.rateQuantity?.unit
        )
        assertEquals(
            "100".toDouble(),
            data.enteralFormula?.administration?.get(2)?.rateQuantity?.value?.value
        )
        assertEquals(
            "2014-09-17T15:00:00Z",
            data.enteralFormula?.administration?.get(2)?.schedule?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "Hold feedings from 7 pm to 7 am. Add MCT oil to increase calories from 1.0 cal/mL to 1.5 cal/mL",
            data.enteralFormula?.administrationInstruction
        )
        assertEquals(
            " Acme Diabetes Formula",
            data.enteralFormula?.baseFormulaProductName
        )
        assertEquals(
            "6547210000124112",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.code
        )
        assertEquals(
            "Diabetic specialty enteral formula",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.enteralFormula?.baseFormulaType?.coding?.get(0)?.system
        )
        assertEquals(
            "cal/mL",
            data.enteralFormula?.caloricDensity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.caloricDensity?.system
        )
        assertEquals(
            "calories per milliliter",
            data.enteralFormula?.caloricDensity?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.enteralFormula?.caloricDensity?.value?.value
        )
        assertEquals(
            "mL/d",
            data.enteralFormula?.maxVolumeToDeliver?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.enteralFormula?.maxVolumeToDeliver?.system
        )
        assertEquals(
            "milliliter/day",
            data.enteralFormula?.maxVolumeToDeliver?.unit
        )
        assertEquals(
            "880".toDouble(),
            data.enteralFormula?.maxVolumeToDeliver?.value?.value
        )
        assertEquals(
            "NGT",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.code
        )
        assertEquals(
            "Instillation, nasogastric tube",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            data.enteralFormula?.routeofAdministration?.coding?.get(0)?.system
        )
        assertEquals(
            "enteralcontinuous",
            data.id
        )
        assertEquals(
            "http://www.acme.org/nutritionorders",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
    fun testNutritionOrder08() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-cardiacdiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "Cashew Nuts",
            data.allergyIntolerance?.get(0)?.display
        )
        assertEquals(
            "AllergyIntolerance/example",
            data.allergyIntolerance?.get(0)?.reference
        )
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "227493005",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Cashew Nut",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "20140730",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
        )
        assertEquals(
            "dairy-free",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/diet",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "cardiacdiet",
            data.id
        )
        assertEquals(
            "http://goodhealthhospital.org/nutrition-requests",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "Starting on 2/10 breakfast, maximum 400 ml fluids per meal",
            data.oralDiet?.instruction
        )
        assertEquals(
            "g",
            data.oralDiet?.nutrient?.get(0)?.amount?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.oralDiet?.nutrient?.get(0)?.amount?.system
        )
        assertEquals(
            "grams",
            data.oralDiet?.nutrient?.get(0)?.amount?.unit
        )
        assertEquals(
            "2".toDouble(),
            data.oralDiet?.nutrient?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "39972003",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.code
        )
        assertEquals(
            "Sodium",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.system
        )
        assertEquals(
            "mL",
            data.oralDiet?.nutrient?.get(1)?.amount?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.oralDiet?.nutrient?.get(1)?.amount?.system
        )
        assertEquals(
            "milliliter",
            data.oralDiet?.nutrient?.get(1)?.amount?.unit
        )
        assertEquals(
            "1500".toDouble(),
            data.oralDiet?.nutrient?.get(1)?.amount?.value?.value
        )
        assertEquals(
            "33463005",
            data.oralDiet?.nutrient?.get(1)?.modifier?.coding?.get(0)?.code
        )
        assertEquals(
            "Fluid",
            data.oralDiet?.nutrient?.get(1)?.modifier?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.nutrient?.get(1)?.modifier?.coding?.get(0)?.system
        )
        assertEquals(
            "386619000",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Low sodium diet",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1040",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "Low Sodium Diet",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "Low sodium diet",
            data.oralDiet?.type?.get(0)?.text
        )
        assertEquals(
            "226208002",
            data.oralDiet?.type?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "Fluid restricted diet",
            data.oralDiet?.type?.get(1)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            "1040",
            data.oralDiet?.type?.get(1)?.coding?.get(1)?.code
        )
        assertEquals(
            "Fluid restricted diet",
            data.oralDiet?.type?.get(1)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(1)?.coding?.get(1)?.system
        )
        assertEquals(
            "Fluid restricted diet",
            data.oralDiet?.type?.get(1)?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
    fun testNutritionOrder09() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-pureeddiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "Cashew Nuts",
            data.allergyIntolerance?.get(0)?.display
        )
        assertEquals(
            "AllergyIntolerance/example",
            data.allergyIntolerance?.get(0)?.reference
        )
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "227493005",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Cashew Nut",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "20140730",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
        )
        assertEquals(
            "dairy-free",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/diet",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "pureeddiet",
            data.id
        )
        assertEquals(
            "http://goodhealthhospital.org/nutrition-requests",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "439021000124105",
            data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Dietary liquid consistency - nectar thick liquid",
            data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.fluidConsistencyType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Nectar thick liquids",
            data.oralDiet?.fluidConsistencyType?.get(0)?.text
        )
        assertEquals(
            "2015-02-10",
            data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "3".toLong(),
            data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
        )
        assertEquals(
            "228055009",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.code
        )
        assertEquals(
            "Liquidized food",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.texture?.get(0)?.modifier?.coding?.get(0)?.system
        )
        assertEquals(
            "Pureed",
            data.oralDiet?.texture?.get(0)?.modifier?.text
        )
        assertEquals(
            "226211001",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Pureed diet",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1010",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "Pureed diet",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "Pureed diet",
            data.oralDiet?.type?.get(0)?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
    fun testNutritionOrder10() {
        // Given
        val sourceJson = loadAsString("r4/nutritionorder-example-diabeticdiet.json")

        // When
        val data = parser.toFhir(NutritionOrder::class, sourceJson)

        // Then
        assertEquals(
            "Cashew Nuts",
            data.allergyIntolerance?.get(0)?.display
        )
        assertEquals(
            "AllergyIntolerance/example",
            data.allergyIntolerance?.get(0)?.reference
        )
        assertEquals(
            "2014-09-17",
            data.dateTime?.value.toString()
        )
        assertEquals(
            "Inpatient",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "227493005",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Cashew Nut",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "20140730",
            data.excludeFoodModifier?.get(0)?.coding?.get(0)?.version
        )
        assertEquals(
            "dairy-free",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/diet",
            data.foodPreferenceModifier?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "diabeticdiet",
            data.id
        )
        assertEquals(
            "http://goodhealthhospital.org/nutrition-requests",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.ORDER,
            data.intent
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
            "g",
            data.oralDiet?.nutrient?.get(0)?.amount?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.oralDiet?.nutrient?.get(0)?.amount?.system
        )
        assertEquals(
            "grams",
            data.oralDiet?.nutrient?.get(0)?.amount?.unit
        )
        assertEquals(
            "75".toDouble(),
            data.oralDiet?.nutrient?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "2331003",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.code
        )
        assertEquals(
            "Carbohydrate",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.nutrient?.get(0)?.modifier?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-02-10",
            data.oralDiet?.schedule?.get(0)?.repeat?.boundsPeriod?.start?.value.toString()
        )
        assertEquals(
            "3".toLong(),
            data.oralDiet?.schedule?.get(0)?.repeat?.frequency?.value
        )
        assertEquals(
            "1".toDouble(),
            data.oralDiet?.schedule?.get(0)?.repeat?.period?.value
        )
        assertEquals(
            "d",
            data.oralDiet?.schedule?.get(0)?.repeat?.periodUnit
        )
        assertEquals(
            "160670007",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Diabetic diet",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.oralDiet?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1030",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "DD - Diabetic diet",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://goodhealthhospital.org/diet-type-codes",
            data.oralDiet?.type?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "DD - Diabetic diet",
            data.oralDiet?.type?.get(0)?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.orderer?.display
        )
        assertEquals(
            "Practitioner/example",
            data.orderer?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.patient?.display
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
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
}
