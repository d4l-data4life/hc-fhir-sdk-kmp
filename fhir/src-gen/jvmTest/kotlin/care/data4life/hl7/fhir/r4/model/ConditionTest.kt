/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ConditionTest {

    val parser = FhirR4Parser()

    @Test
    fun testCondition1() {
        val sourceJson = loadAsString("r4/condition-example-f003-abscess.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("P. van de Heuvel", data.asserter?.display)
        assertEquals("Patient/f001", data.asserter?.reference)
        assertEquals("280193007", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Entire retropharyngeal area", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("439401001", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("diagnosis", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("active", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("18099001", data.code?.coding?.get(0)?.code)
        assertEquals("Retropharyngeal abscess", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f003", data.encounter?.reference)
        assertEquals("169068008", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code)
        assertEquals("CT of neck", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system)
        assertEquals("f003", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2012-02-27", data.onsetDateTime?.value.toString(),)
        assertEquals("2012-02-20", data.recordedDate?.value.toString(),)
        assertEquals("371923003", data.severity?.coding?.get(0)?.code)
        assertEquals("Mild to moderate", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("confirmed", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition2() {
        val sourceJson = loadAsString("r4/condition-example-f203-sepsis.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("281158006", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Pulmonary vascular structure", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("55607006", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(1)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-category", data.category?.get(0)?.coding?.get(1)?.system)
        assertEquals("active", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("10001005", data.code?.coding?.get(0)?.code)
        assertEquals("Bacterial sepsis", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Roel's encounter on March elevanth", data.encounter?.display)
        assertEquals("Encounter/f203", data.encounter?.reference)
        assertEquals("Diagnostic report for Roel's sepsis", data.evidence?.get(0)?.detail?.get(0)?.display)
        assertEquals("DiagnosticReport/f202", data.evidence?.get(0)?.detail?.get(0)?.reference)
        assertEquals("f203", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2013-03-08", data.onsetDateTime?.value.toString(),)
        assertEquals("2013-03-11", data.recordedDate?.value.toString(),)
        assertEquals("371924009", data.severity?.coding?.get(0)?.code)
        assertEquals("Moderate to severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("confirmed", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition3() {
        val sourceJson = loadAsString("r4/condition-example-stroke.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("encounter-diagnosis", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Encounter Diagnosis", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("active", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("422504002", data.code?.coding?.get(0)?.code)
        assertEquals("Ischemic stroke (disorder)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Stroke", data.code?.text)
        assertEquals("stroke", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2010-07-18", data.onsetDateTime?.value.toString(),)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Ischemic stroke, July 18, 2010</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("confirmed", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition4() {
        val sourceJson = loadAsString("r4/condition-example-family-history.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem List Item", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("active", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("312824007", data.code?.coding?.get(0)?.code)
        assertEquals("Family history of cancer of colon", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("family-history", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Family history of cancer of colon</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition5() {
        val sourceJson = loadAsString("r4/condition-example-f002-lung.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("P. van de Heuvel", data.asserter?.display)
        assertEquals("Patient/f001", data.asserter?.reference)
        assertEquals("51185008", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Thorax", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("439401001", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("diagnosis", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("active", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("254637007", data.code?.coding?.get(0)?.code)
        assertEquals("NSCLC - Non-small cell lung cancer", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f002", data.encounter?.reference)
        assertEquals("169069000", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code)
        assertEquals("CT of thorax", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system)
        assertEquals("f002", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2011-05-05", data.onsetDateTime?.value.toString(),)
        assertEquals("2012-06-03", data.recordedDate?.value.toString(),)
        assertEquals("24484000", data.severity?.coding?.get(0)?.code)
        assertEquals("Severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("258219007", data.stage?.get(0)?.summary?.coding?.get(0)?.code)
        assertEquals("stage II", data.stage?.get(0)?.summary?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.stage?.get(0)?.summary?.coding?.get(0)?.system)
        assertEquals("260998006", data.stage?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals("Clinical staging (qualifier value)", data.stage?.get(0)?.type?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.stage?.get(0)?.type?.coding?.get(0)?.system)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("confirmed", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition6() {
        val sourceJson = loadAsString("r4/condition-example-f205-infection.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("active", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("87628006", data.code?.coding?.get(0)?.code)
        assertEquals("Bacterial infectious disease", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("f205", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2013-04-04", data.recordedDate?.value.toString(),)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("differential", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition7() {
        val sourceJson = loadAsString("r4/condition-example-f204-renal.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("2013-03-20", data.abatementDateTime?.value.toString(),)
        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("181414000", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Kidney", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("55607006", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(1)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-category", data.category?.get(0)?.coding?.get(1)?.system)
        assertEquals("inactive", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("36225005", data.code?.coding?.get(0)?.code)
        assertEquals("Acute renal insufficiency specified as due to procedure", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Roel's encounter on March elevanth", data.encounter?.display)
        assertEquals("Encounter/f203", data.encounter?.reference)
        assertEquals("f204", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("The patient is anuric.", data.note?.get(0)?.text)
        assertEquals("2013-03-11", data.onsetDateTime?.value.toString(),)
        assertEquals("2013-03-11", data.recordedDate?.value.toString(),)
        assertEquals("24484000", data.severity?.coding?.get(0)?.code)
        assertEquals("Severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Genetic analysis master panel", data.stage?.get(0)?.assessment?.get(0)?.display)
        assertEquals("14803004", data.stage?.get(0)?.summary?.coding?.get(0)?.code)
        assertEquals("Temporary", data.stage?.get(0)?.summary?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.stage?.get(0)?.summary?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("differential", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition8() {
        val sourceJson = loadAsString("r4/condition-example2.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem List Item", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("active", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("Asthma", data.code?.text)
        assertEquals("example2", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("approximately November 2012", data.onsetString)
        assertEquals("255604002", data.severity?.coding?.get(0)?.code)
        assertEquals("Mild", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Mild Asthma (Date: 12-Nov 2012)</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("confirmed", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition9() {
        val sourceJson = loadAsString("r4/condition-example-f202-malignancy.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("a", data.abatementAge?.code)
        assertEquals("http://unitsofmeasure.org", data.abatementAge?.system)
        assertEquals("years", data.abatementAge?.unit)
        assertEquals("54".toDouble(), data.abatementAge?.value?.value)
        assertEquals("361355005", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Entire head and neck", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("encounter-diagnosis", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("resolved", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("363346000", data.code?.coding?.get(0)?.code)
        assertEquals("Malignant neoplastic disease", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Erasmus' diagnostic report of Roel's tumor", data.evidence?.get(0)?.detail?.get(0)?.display)
        assertEquals("DiagnosticReport/f201", data.evidence?.get(0)?.detail?.get(0)?.reference)
        assertEquals("f202", data.id)
        assertEquals("TBOO", data.meta?.security?.get(0)?.code)
        assertEquals("taboo", data.meta?.security?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.meta?.security?.get(0)?.system)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("a", data.onsetAge?.code)
        assertEquals("http://unitsofmeasure.org", data.onsetAge?.system)
        assertEquals("years", data.onsetAge?.unit)
        assertEquals("52".toDouble(), data.onsetAge?.value?.value)
        assertEquals("2012-12-01", data.recordedDate?.value.toString(),)
        assertEquals("24484000", data.severity?.coding?.get(0)?.code)
        assertEquals("Severe", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("confirmed", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testCondition10() {
        val sourceJson = loadAsString("r4/condition-example-f201-fever.json")

        val data = parser.toFhir(Condition::class, sourceJson)

        assertEquals("around April 9, 2013", data.abatementString)
        assertEquals("Practitioner/f201", data.asserter?.reference)
        assertEquals("38266002", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Entire body as a whole", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("55607006", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Problem", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("problem-list-item", data.category?.get(0)?.coding?.get(1)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-category", data.category?.get(0)?.coding?.get(1)?.system)
        assertEquals("resolved", data.clinicalStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-clinical", data.clinicalStatus?.coding?.get(0)?.system)
        assertEquals("386661006", data.code?.coding?.get(0)?.code)
        assertEquals("Fever", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Encounter/f201", data.encounter?.reference)
        assertEquals("258710007", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code)
        assertEquals("degrees C", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system)
        assertEquals("Temperature", data.evidence?.get(0)?.detail?.get(0)?.display)
        assertEquals("Observation/f202", data.evidence?.get(0)?.detail?.get(0)?.reference)
        assertEquals("f201", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2013-04-02", data.onsetDateTime?.value.toString(),)
        assertEquals("2013-04-04", data.recordedDate?.value.toString(),)
        assertEquals("Practitioner/f201", data.recorder?.reference)
        assertEquals("255604002", data.severity?.coding?.get(0)?.code)
        assertEquals("Mild", data.severity?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.severity?.coding?.get(0)?.system)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("confirmed", data.verificationStatus?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/condition-ver-status", data.verificationStatus?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
