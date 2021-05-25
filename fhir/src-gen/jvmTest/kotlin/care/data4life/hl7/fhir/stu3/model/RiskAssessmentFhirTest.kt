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
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.ObservationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * RiskAssessmentTest.java
 *
 * Potential outcomes for a subject with likelihood
 *
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of
 * each outcome.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class RiskAssessmentFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testRiskAssessment01() {
        // Given
        val sourceJson = loadAsString("stu3/riskassessment-example-population.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertRiskAssessment01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRiskAssessment01Step01(data: RiskAssessment) {

        assertEquals(
            expected = "population",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment02() {
        // Given
        val sourceJson = loadAsString("stu3/riskassessment-example-cardiac.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertRiskAssessment02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRiskAssessment02Step01(data: RiskAssessment) {

        assertEquals(
            expected = "Patient/pat2",
            actual = data.basis?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport/lipids",
            actual = data.basis?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/blood-pressure",
            actual = data.basis?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cardiac",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.use
        )

        assertEquals(
            expected = "risk-assessment-cardiac",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-07-19T16:04:00Z",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "http://cvdrisk.nhlbi.nih.gov/#cholesterol",
            actual = data.performer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Heart Attack",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.02".toDouble(),
            actual = data.prediction?.get(0)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "49".toDouble(),
            actual = data.prediction?.get(0)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "39".toDouble(),
            actual = data.prediction?.get(0)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/pat2",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment03() {
        // Given
        val sourceJson = loadAsString("stu3/riskassessment-example.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertRiskAssessment03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRiskAssessment03Step01(data: RiskAssessment) {

        assertEquals(
            expected = "List/prognosis",
            actual = data.basis?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "High degree of certainty",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "genetic",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BRCAPRO",
            actual = data.method?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2006-01-13T23:01:00Z",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.000168".toDouble(),
            actual = data.prediction?.get(0)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "53".toDouble(),
            actual = data.prediction?.get(0)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(1)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.000368".toDouble(),
            actual = data.prediction?.get(1)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(1)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(1)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(1)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "57".toDouble(),
            actual = data.prediction?.get(1)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(1)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(1)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(1)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "54".toDouble(),
            actual = data.prediction?.get(1)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(2)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.000594".toDouble(),
            actual = data.prediction?.get(2)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(2)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(2)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(2)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "62".toDouble(),
            actual = data.prediction?.get(2)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(2)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(2)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(2)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "58".toDouble(),
            actual = data.prediction?.get(2)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(3)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.000838".toDouble(),
            actual = data.prediction?.get(3)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(3)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(3)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(3)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "67".toDouble(),
            actual = data.prediction?.get(3)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(3)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(3)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(3)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "63".toDouble(),
            actual = data.prediction?.get(3)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(4)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.001089".toDouble(),
            actual = data.prediction?.get(4)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(4)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(4)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(4)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "72".toDouble(),
            actual = data.prediction?.get(4)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(4)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(4)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(4)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "68".toDouble(),
            actual = data.prediction?.get(4)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(5)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.001327".toDouble(),
            actual = data.prediction?.get(5)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(5)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(5)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(5)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "77".toDouble(),
            actual = data.prediction?.get(5)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(5)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(5)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(5)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "73".toDouble(),
            actual = data.prediction?.get(5)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(6)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.00153".toDouble(),
            actual = data.prediction?.get(6)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(6)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(6)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(6)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "82".toDouble(),
            actual = data.prediction?.get(6)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(6)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(6)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(6)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "78".toDouble(),
            actual = data.prediction?.get(6)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(7)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.001663".toDouble(),
            actual = data.prediction?.get(7)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(7)?.whenRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(7)?.whenRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(7)?.whenRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "88".toDouble(),
            actual = data.prediction?.get(7)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(7)?.whenRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(7)?.whenRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(7)?.whenRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "83".toDouble(),
            actual = data.prediction?.get(7)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment04() {
        // Given
        val sourceJson = loadAsString("stu3/riskassessment-example-prognosis.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertRiskAssessment04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRiskAssessment04Step01(data: RiskAssessment) {

        assertEquals(
            expected = "Ischemic Stroke",
            actual = data.condition?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/stroke",
            actual = data.condition?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "prognosis",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010-11-22",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "249943000:363698007=72098002,260868000=6934004",
            actual = data.prediction?.get(0)?.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.prediction?.get(0)?.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "permanent weakness of the left arm",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "moderate",
            actual = data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "moderate likelihood",
            actual = data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/risk-probability",
            actual = data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }
}
