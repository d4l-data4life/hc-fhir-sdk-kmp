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
        assertEquals(
            "group1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "population",
            data.id
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
            ObservationStatus.FINAL,
            data.status
        )
        assertEquals(
            "#group1",
            data.subject?.reference
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
    fun testRiskAssessment02() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example-cardiac.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertEquals(
            "Patient/pat2",
            data.basis?.get(0)?.reference
        )
        assertEquals(
            "DiagnosticReport/lipids",
            data.basis?.get(1)?.reference
        )
        assertEquals(
            "Observation/blood-pressure",
            data.basis?.get(2)?.reference
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "cardiac",
            data.id
        )
        assertEquals(
            "http://example.org",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "risk-assessment-cardiac",
            data.identifier?.get(0)?.value
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
            "2014-07-19T16:04:00Z",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "http://cvdrisk.nhlbi.nih.gov/#cholesterol",
            data.performer?.display
        )
        assertEquals(
            "Heart Attack",
            data.prediction?.get(0)?.outcome?.text
        )
        assertEquals(
            "0.02".toDouble(),
            data.prediction?.get(0)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(0)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(0)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(0)?.whenRange?.high?.unit
        )
        assertEquals(
            "49".toDouble(),
            data.prediction?.get(0)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(0)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(0)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(0)?.whenRange?.low?.unit
        )
        assertEquals(
            "39".toDouble(),
            data.prediction?.get(0)?.whenRange?.low?.value?.value
        )
        assertEquals(
            ObservationStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/pat2",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testRiskAssessment03() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertEquals(
            "List/prognosis",
            data.basis?.get(0)?.reference
        )
        assertEquals(
            "genetic",
            data.id
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
            "BRCAPRO",
            data.method?.coding?.get(0)?.code
        )
        assertEquals(
            "High degree of certainty",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2006-01-13T23:01:00Z",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(0)?.outcome?.text
        )
        assertEquals(
            "0.000168".toDouble(),
            data.prediction?.get(0)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(0)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(0)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(0)?.whenRange?.high?.unit
        )
        assertEquals(
            "53".toDouble(),
            data.prediction?.get(0)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(1)?.outcome?.text
        )
        assertEquals(
            "0.000368".toDouble(),
            data.prediction?.get(1)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(1)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(1)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(1)?.whenRange?.high?.unit
        )
        assertEquals(
            "57".toDouble(),
            data.prediction?.get(1)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(1)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(1)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(1)?.whenRange?.low?.unit
        )
        assertEquals(
            "54".toDouble(),
            data.prediction?.get(1)?.whenRange?.low?.value?.value
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(2)?.outcome?.text
        )
        assertEquals(
            "0.000594".toDouble(),
            data.prediction?.get(2)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(2)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(2)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(2)?.whenRange?.high?.unit
        )
        assertEquals(
            "62".toDouble(),
            data.prediction?.get(2)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(2)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(2)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(2)?.whenRange?.low?.unit
        )
        assertEquals(
            "58".toDouble(),
            data.prediction?.get(2)?.whenRange?.low?.value?.value
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(3)?.outcome?.text
        )
        assertEquals(
            "0.000838".toDouble(),
            data.prediction?.get(3)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(3)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(3)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(3)?.whenRange?.high?.unit
        )
        assertEquals(
            "67".toDouble(),
            data.prediction?.get(3)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(3)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(3)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(3)?.whenRange?.low?.unit
        )
        assertEquals(
            "63".toDouble(),
            data.prediction?.get(3)?.whenRange?.low?.value?.value
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(4)?.outcome?.text
        )
        assertEquals(
            "0.001089".toDouble(),
            data.prediction?.get(4)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(4)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(4)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(4)?.whenRange?.high?.unit
        )
        assertEquals(
            "72".toDouble(),
            data.prediction?.get(4)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(4)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(4)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(4)?.whenRange?.low?.unit
        )
        assertEquals(
            "68".toDouble(),
            data.prediction?.get(4)?.whenRange?.low?.value?.value
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(5)?.outcome?.text
        )
        assertEquals(
            "0.001327".toDouble(),
            data.prediction?.get(5)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(5)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(5)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(5)?.whenRange?.high?.unit
        )
        assertEquals(
            "77".toDouble(),
            data.prediction?.get(5)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(5)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(5)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(5)?.whenRange?.low?.unit
        )
        assertEquals(
            "73".toDouble(),
            data.prediction?.get(5)?.whenRange?.low?.value?.value
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(6)?.outcome?.text
        )
        assertEquals(
            "0.00153".toDouble(),
            data.prediction?.get(6)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(6)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(6)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(6)?.whenRange?.high?.unit
        )
        assertEquals(
            "82".toDouble(),
            data.prediction?.get(6)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(6)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(6)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(6)?.whenRange?.low?.unit
        )
        assertEquals(
            "78".toDouble(),
            data.prediction?.get(6)?.whenRange?.low?.value?.value
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(7)?.outcome?.text
        )
        assertEquals(
            "0.001663".toDouble(),
            data.prediction?.get(7)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(7)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(7)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(7)?.whenRange?.high?.unit
        )
        assertEquals(
            "88".toDouble(),
            data.prediction?.get(7)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(7)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(7)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(7)?.whenRange?.low?.unit
        )
        assertEquals(
            "83".toDouble(),
            data.prediction?.get(7)?.whenRange?.low?.value?.value
        )
        assertEquals(
            ObservationStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/b248b1b2-1686-4b94-9936-37d7a5f94b51",
            data.subject?.reference
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
    fun testRiskAssessment04() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-riskexample.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertEquals(
            "ImmunizationRecommendation/example",
            data.basedOn?.reference
        )
        assertEquals(
            "DiagnosticReport/example",
            data.basis?.get(0)?.reference
        )
        assertEquals(
            "Observation/example",
            data.basis?.get(1)?.reference
        )
        assertEquals(
            "709510001",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Assessment of risk for disease (procedure)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://browser.ihtsdotools.org/",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Condition/example",
            data.condition?.reference
        )
        assertEquals(
            "Encounter with patient @example",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "riskexample",
            data.id
        )
        assertEquals(
            "http://example.org",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "risk-assessment-breastcancer1",
            data.identifier?.get(0)?.value
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
            "This risk assessment is for reference only",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2017-10-10",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "DiagnosticReport/example",
            data.parent?.reference
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.reference
        )
        assertEquals(
            "Breast Cancer",
            data.prediction?.get(0)?.outcome?.text
        )
        assertEquals(
            "0.000368".toDouble(),
            data.prediction?.get(0)?.probabilityDecimal?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(0)?.whenRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(0)?.whenRange?.high?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(0)?.whenRange?.high?.unit
        )
        assertEquals(
            "57".toDouble(),
            data.prediction?.get(0)?.whenRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.prediction?.get(0)?.whenRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.prediction?.get(0)?.whenRange?.low?.system
        )
        assertEquals(
            "years",
            data.prediction?.get(0)?.whenRange?.low?.unit
        )
        assertEquals(
            "54".toDouble(),
            data.prediction?.get(0)?.whenRange?.low?.value?.value
        )
        assertEquals(
            ObservationStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Risk assessment for reference only</div>",
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
    fun testRiskAssessment05() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example-breastcancer.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertEquals(
            "Observation/example-genetics-brcapat",
            data.basis?.get(0)?.reference
        )
        assertEquals(
            "709510001",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Assessment of risk for disease (procedure)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://browser.ihtsdotools.org/",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "breastcancer-risk",
            data.id
        )
        assertEquals(
            "http://example.org",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "risk-assessment-breastcancer1",
            data.identifier?.get(0)?.value
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
            "This risk assessment is based on BRCA1 and BRCA2 genetic mutation test",
            data.note?.get(0)?.text
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.reference
        )
        assertEquals(
            "Unknown risk of developing breast cancer",
            data.prediction?.get(0)?.outcome?.text
        )
        assertEquals(
            ObservationStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testRiskAssessment06() {
        // Given
        val sourceJson = loadAsString("r4/riskassessment-example-prognosis.json")

        // When
        val data = parser.toFhir(RiskAssessment::class, sourceJson)

        // Then
        assertEquals(
            "Ischemic Stroke",
            data.condition?.display
        )
        assertEquals(
            "Condition/stroke",
            data.condition?.reference
        )
        assertEquals(
            "prognosis",
            data.id
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
            "2010-11-22",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "249943000:363698007=72098002,260868000=6934004",
            data.prediction?.get(0)?.outcome?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.prediction?.get(0)?.outcome?.coding?.get(0)?.system
        )
        assertEquals(
            "permanent weakness of the left arm",
            data.prediction?.get(0)?.outcome?.text
        )
        assertEquals(
            "moderate",
            data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.code
        )
        assertEquals(
            "moderate likelihood",
            data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/risk-probability",
            data.prediction?.get(0)?.qualitativeRisk?.coding?.get(0)?.system
        )
        assertEquals(
            ObservationStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
