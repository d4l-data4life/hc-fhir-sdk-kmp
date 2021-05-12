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
import care.data4life.hl7.fhir.stu3.codesystem.ConditionVerificationStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ConditionTest.java
 *
 * Detailed information about conditions, problems or diagnoses.
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 *
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ConditionTest {

    val parser = FhirStu3Parser()

    @Test
    fun testCondition1() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-f003-abscess.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("2012-02-20", data.assertedDate?.value.toString())
        assertEquals("P. van de Heuvel", data.asserter?.display)
        assertEquals("Patient/f001", data.asserter?.reference)
        assertEquals("280193007", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Entire retropharyngeal area", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("439401001", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("diagnosis", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("active", data.clinicalStatus)
        assertEquals("18099001", data.code?.coding?.get(0)?.code)
        assertEquals("Retropharyngeal abscess", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f003", data.context?.reference)
        assertEquals("169068008", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code)
        assertEquals("CT of neck", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://snomed.info/sct",
            data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("f003", data.id)
        assertEquals("2012-02-27", data.onsetDateTime?.value.toString())
        assertEquals("371923003", data.severity?.coding?.get(0)?.code)
        assertEquals("Mild to moderate", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.CONFIRMED, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition2() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-f203-sepsis.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("2013-03-11", data.assertedDate?.value.toString())
        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("281158006", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Pulmonary vascular structure", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("55607006", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(1)?.code)
        assertEquals(
            "http://hl7.org/fhir/condition-category",
            data.category?.get(0)?.coding?.get(1)?.system
        )
        assertEquals("active", data.clinicalStatus)
        assertEquals("10001005", data.code?.coding?.get(0)?.code)
        assertEquals("Bacterial sepsis", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Roel's encounter on March eleventh", data.context?.display)
        assertEquals("Encounter/f203", data.context?.reference)
        assertEquals(
            "Diagnostic report for Roel's sepsis",
            data.evidence?.get(0)?.detail?.get(0)?.display
        )
        assertEquals("DiagnosticReport/f202", data.evidence?.get(0)?.detail?.get(0)?.reference)
        assertEquals("f203", data.id)
        assertEquals("2013-03-08", data.onsetDateTime?.value.toString())
        assertEquals("371924009", data.severity?.coding?.get(0)?.code)
        assertEquals("Moderate to severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.CONFIRMED, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition3() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-stroke.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("encounter-diagnosis", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Encounter Diagnosis", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org/fhir/condition-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("active", data.clinicalStatus)
        assertEquals("422504002", data.code?.coding?.get(0)?.code)
        assertEquals("Ischemic stroke (disorder)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Stroke", data.code?.text)
        assertEquals("stroke", data.id)
        assertEquals("2010-07-18", data.onsetDateTime?.value.toString())
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Ischemic stroke, July 18, 2010</div>",
            data.text?.div
        )
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.CONFIRMED, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition4() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-family-history.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem List Item", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org/fhir/condition-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("active", data.clinicalStatus)
        assertEquals("312824007", data.code?.coding?.get(0)?.code)
        assertEquals("Family history of cancer of colon", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("family-history", data.id)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Family history of cancer of colon</div>",
            data.text?.div
        )
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition5() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-f002-lung.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("2012-06-03", data.assertedDate?.value.toString())
        assertEquals("P. van de Heuvel", data.asserter?.display)
        assertEquals("Patient/f001", data.asserter?.reference)
        assertEquals("51185008", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Thorax", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("439401001", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("diagnosis", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("active", data.clinicalStatus)
        assertEquals("254637007", data.code?.coding?.get(0)?.code)
        assertEquals("NSCLC - Non-small cell lung cancer", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f002", data.context?.reference)
        assertEquals("169069000", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code)
        assertEquals("CT of thorax", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://snomed.info/sct",
            data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("f002", data.id)
        assertEquals("2011-05-05", data.onsetDateTime?.value.toString())
        assertEquals("24484000", data.severity?.coding?.get(0)?.code)
        assertEquals("Severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("258219007", data.stage?.summary?.coding?.get(0)?.code)
        assertEquals("stage II", data.stage?.summary?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.stage?.summary?.coding?.get(0)?.system)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.CONFIRMED, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition6() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-f205-infection.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("2013-04-04", data.assertedDate?.value.toString())
        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("active", data.clinicalStatus)
        assertEquals("87628006", data.code?.coding?.get(0)?.code)
        assertEquals("Bacterial infectious disease", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("f205", data.id)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.DIFFERENTIAL, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition7() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-f204-renal.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("2013-03-20", data.abatementDateTime?.value.toString())
        assertEquals("2013-03-11", data.assertedDate?.value.toString())
        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("181414000", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Kidney", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("55607006", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(1)?.code)
        assertEquals(
            "http://hl7.org/fhir/condition-category",
            data.category?.get(0)?.coding?.get(1)?.system
        )
        assertEquals("active", data.clinicalStatus)
        assertEquals("36225005", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Acute renal insufficiency specified as due to procedure",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Roel's encounter on March eleventh", data.context?.display)
        assertEquals("Encounter/f203", data.context?.reference)
        assertEquals("f204", data.id)
        assertEquals("The patient is anuric.", data.note?.get(0)?.text)
        assertEquals("2013-03-11", data.onsetDateTime?.value.toString())
        assertEquals("24484000", data.severity?.coding?.get(0)?.code)
        assertEquals("Severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Genetic analysis master panel", data.stage?.assessment?.get(0)?.display)
        assertEquals("14803004", data.stage?.summary?.coding?.get(0)?.code)
        assertEquals("Temporary", data.stage?.summary?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.stage?.summary?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.DIFFERENTIAL, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition8() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example2.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem List Item", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org/fhir/condition-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("active", data.clinicalStatus)
        assertEquals("Asthma", data.code?.text)
        assertEquals("example2", data.id)
        assertEquals("approximately November 2012", data.onsetString)
        assertEquals("255604002", data.severity?.coding?.get(0)?.code)
        assertEquals("Mild", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Mild Asthma (Date: 12-Nov 2012)</div>",
            data.text?.div
        )
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.CONFIRMED, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition9() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-f202-malignancy.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("a", data.abatementAge?.code)
        assertEquals("http://unitsofmeasure.org", data.abatementAge?.system)
        assertEquals("years", data.abatementAge?.unit)
        assertEquals("54".toDouble(), data.abatementAge?.value?.value)
        assertEquals("2012-12-01", data.assertedDate?.value.toString())
        assertEquals("361355005", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Entire head and neck", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("encounter-diagnosis", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/condition-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("resolved", data.clinicalStatus)
        assertEquals("363346000", data.code?.coding?.get(0)?.code)
        assertEquals("Malignant neoplastic disease", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals(
            "Erasmus' diagnostic report of Roel's tumor",
            data.evidence?.get(0)?.detail?.get(0)?.display
        )
        assertEquals("DiagnosticReport/f201", data.evidence?.get(0)?.detail?.get(0)?.reference)
        assertEquals("f202", data.id)
        assertEquals("TBOO", data.meta?.security?.get(0)?.code)
        assertEquals("taboo", data.meta?.security?.get(0)?.display)
        assertEquals("http://hl7.org/fhir/v3/ActCode", data.meta?.security?.get(0)?.system)
        assertEquals("a", data.onsetAge?.code)
        assertEquals("http://unitsofmeasure.org", data.onsetAge?.system)
        assertEquals("years", data.onsetAge?.unit)
        assertEquals("52".toDouble(), data.onsetAge?.value?.value)
        assertEquals("24484000", data.severity?.coding?.get(0)?.code)
        assertEquals("Severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.CONFIRMED, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCondition10() {
        // Given
        val sourceJson = loadAsString("stu3/condition-example-f201-fever.json")

        // When
        val data = parser.toFhir(Condition::class, sourceJson)

        // Then

        assertEquals("around April 9, 2013", data.abatementString)
        assertEquals("2013-04-04", data.assertedDate?.value.toString())
        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("38266002", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Entire body as a whole", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("55607006", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(1)?.code)
        assertEquals(
            "http://hl7.org/fhir/condition-category",
            data.category?.get(0)?.coding?.get(1)?.system
        )
        assertEquals("resolved", data.clinicalStatus)
        assertEquals("386661006", data.code?.coding?.get(0)?.code)
        assertEquals("Fever", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f201", data.context?.reference)
        assertEquals("258710007", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code)
        assertEquals("degrees C", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://snomed.info/sct",
            data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("Temperature", data.evidence?.get(0)?.detail?.get(0)?.display)
        assertEquals("Observation/f202", data.evidence?.get(0)?.detail?.get(0)?.reference)
        assertEquals("f201", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("2013-04-02", data.onsetDateTime?.value.toString())
        assertEquals("255604002", data.severity?.coding?.get(0)?.code)
        assertEquals("Mild", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals(ConditionVerificationStatus.CONFIRMED, data.verificationStatus)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
