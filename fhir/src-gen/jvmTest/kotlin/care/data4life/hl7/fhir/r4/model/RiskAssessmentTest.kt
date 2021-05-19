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
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.ObservationStatus
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class RiskAssessmentTest {

    val parser = FhirR4Parser()

    @Test
    fun testRiskAssessment01() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example-population.json")

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
            expected = "group1",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "population",
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
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "#group1",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment02() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example-cardiac.json")

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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport/lipids",
            actual = data.basis?.get(1)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Observation/blood-pressure",
            actual = data.basis?.get(2)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "cardiac",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "risk-assessment-cardiac",
            actual = data.identifier?.get(0)?.value
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
            expected = "2014-07-19T16:04:00Z",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "http://cvdrisk.nhlbi.nih.gov/#cholesterol",
            actual = data.performer?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Heart Attack",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.02".toDouble(),
            actual = data.prediction?.get(0)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "49".toDouble(),
            actual = data.prediction?.get(0)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.low?.unit
                ?.replace("\n", " ")
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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment03() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example.json")

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
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "genetic",
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
            expected = "BRCAPRO",
            actual = data.method?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "High degree of certainty",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2006-01-13T23:01:00Z",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.000168".toDouble(),
            actual = data.prediction?.get(0)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "53".toDouble(),
            actual = data.prediction?.get(0)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(1)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.000368".toDouble(),
            actual = data.prediction?.get(1)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(1)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(1)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(1)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "57".toDouble(),
            actual = data.prediction?.get(1)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(1)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(1)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(1)?.whenRange?.low?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "54".toDouble(),
            actual = data.prediction?.get(1)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(2)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.000594".toDouble(),
            actual = data.prediction?.get(2)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(2)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(2)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(2)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "62".toDouble(),
            actual = data.prediction?.get(2)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(2)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(2)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(2)?.whenRange?.low?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "58".toDouble(),
            actual = data.prediction?.get(2)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(3)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.000838".toDouble(),
            actual = data.prediction?.get(3)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(3)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(3)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(3)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "67".toDouble(),
            actual = data.prediction?.get(3)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(3)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(3)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(3)?.whenRange?.low?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "63".toDouble(),
            actual = data.prediction?.get(3)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(4)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.001089".toDouble(),
            actual = data.prediction?.get(4)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(4)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(4)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(4)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "72".toDouble(),
            actual = data.prediction?.get(4)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(4)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(4)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(4)?.whenRange?.low?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "68".toDouble(),
            actual = data.prediction?.get(4)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(5)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.001327".toDouble(),
            actual = data.prediction?.get(5)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(5)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(5)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(5)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "77".toDouble(),
            actual = data.prediction?.get(5)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(5)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(5)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(5)?.whenRange?.low?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "73".toDouble(),
            actual = data.prediction?.get(5)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(6)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.00153".toDouble(),
            actual = data.prediction?.get(6)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(6)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(6)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(6)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "82".toDouble(),
            actual = data.prediction?.get(6)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(6)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(6)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(6)?.whenRange?.low?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "78".toDouble(),
            actual = data.prediction?.get(6)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(7)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.001663".toDouble(),
            actual = data.prediction?.get(7)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(7)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(7)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(7)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "88".toDouble(),
            actual = data.prediction?.get(7)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(7)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(7)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(7)?.whenRange?.low?.unit
                ?.replace("\n", " ")
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
            expected = "Patient/b248b1b2-1686-4b94-9936-37d7a5f94b51",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment04() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-riskexample.json")

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
            expected = "ImmunizationRecommendation/example",
            actual = data.basedOn?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport/example",
            actual = data.basis?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Observation/example",
            actual = data.basis?.get(1)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "709510001",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Assessment of risk for disease (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://browser.ihtsdotools.org/",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Condition/example",
            actual = data.condition?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter with patient @example",
            actual = data.encounter?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "riskexample",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "risk-assessment-breastcancer1",
            actual = data.identifier?.get(0)?.value
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
            expected = "This risk assessment is for reference only",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-10-10",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "DiagnosticReport/example",
            actual = data.parent?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Breast Cancer",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.000368".toDouble(),
            actual = data.prediction?.get(0)?.probabilityDecimal?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.high?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.high?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "57".toDouble(),
            actual = data.prediction?.get(0)?.whenRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.prediction?.get(0)?.whenRange?.low?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.prediction?.get(0)?.whenRange?.low?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "years",
            actual = data.prediction?.get(0)?.whenRange?.low?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "54".toDouble(),
            actual = data.prediction?.get(0)?.whenRange?.low?.value?.value
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Risk assessment for reference only</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment05() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example-breastcancer.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertRiskAssessment05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRiskAssessment05Step01(data: RiskAssessment) {

        assertEquals(
            expected = "Observation/example-genetics-brcapat",
            actual = data.basis?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "709510001",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Assessment of risk for disease (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://browser.ihtsdotools.org/",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "breastcancer-risk",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "risk-assessment-breastcancer1",
            actual = data.identifier?.get(0)?.value
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
            expected = "This risk assessment is based on BRCA1 and BRCA2 genetic mutation test",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Unknown risk of developing breast cancer",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testRiskAssessment06() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example-prognosis.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertRiskAssessment06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRiskAssessment06Step01(data: RiskAssessment) {

        assertEquals(
            expected = "Ischemic Stroke",
            actual = data.condition?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Condition/stroke",
            actual = data.condition?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prognosis",
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
            expected = "2010-11-22",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "249943000:363698007=72098002,260868000=6934004",
            actual = data.prediction?.get(0)?.outcome?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.prediction?.get(0)?.outcome?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "permanent weakness of the left arm",
            actual = data.prediction?.get(0)?.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "moderate",
            actual = data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "moderate likelihood",
            actual = data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/risk-probability",
            actual = data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }
}
