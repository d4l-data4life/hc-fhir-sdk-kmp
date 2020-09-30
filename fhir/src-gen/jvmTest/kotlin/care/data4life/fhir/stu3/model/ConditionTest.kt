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
import care.data4life.fhir.stu3.codesystem.ConditionVerificationStatus
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * ConditionTest.java
 *
 * Detailed information about conditions, problems or diagnoses.
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class ConditionTest {

    val parser = FhirStu3Parser()


    @Test
    fun testCondition1() {
        val sourceJson = loadAsString("condition-example-f003-abscess.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.assertedDate, "2012-02-20")
        assertEquals(data.asserter?.display, "P. van de Heuvel")
        assertEquals(data.asserter?.reference, "Patient/f001")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "280193007")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Entire retropharyngeal area")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "439401001")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "diagnosis")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.coding?.get(0)?.code, "18099001")
        assertEquals(data.code?.coding?.get(0)?.display, "Retropharyngeal abscess")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.reference, "Encounter/f003")
        assertEquals(data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code, "169068008")
        assertEquals(data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display, "CT of neck")
        assertEquals(
            data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system,
            "http://snomed.info/sct"
        )
        assertEquals(data.id, "f003")
        assertEquals(data.onsetDateTime, "2012-02-27")
        assertEquals(data.severity?.coding?.get(0)?.code, "371923003")
        assertEquals(data.severity?.coding?.get(0)?.display, "Mild to moderate")
        assertEquals(data.severity?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.subject.display, "P. van de Heuvel")
        assertEquals(data.subject.reference, "Patient/f001")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.CONFIRMED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition2() {
        val sourceJson = loadAsString("condition-example-f203-sepsis.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.assertedDate, "2013-03-11")
        assertEquals(data.asserter?.reference, "Practitioner/f201")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "281158006")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Pulmonary vascular structure")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "55607006")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "Problem")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(1)?.code, "problem-list-item")
        assertEquals(
            data.category?.get(0)?.coding?.get(1)?.system,
            "http://hl7.org/fhir/condition-category"
        )
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.coding?.get(0)?.code, "10001005")
        assertEquals(data.code?.coding?.get(0)?.display, "Bacterial sepsis")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.display, "Roel's encounter on March eleventh")
        assertEquals(data.context?.reference, "Encounter/f203")
        assertEquals(
            data.evidence?.get(0)?.detail?.get(0)?.display,
            "Diagnostic report for Roel's sepsis"
        )
        assertEquals(data.evidence?.get(0)?.detail?.get(0)?.reference, "DiagnosticReport/f202")
        assertEquals(data.id, "f203")
        assertEquals(data.onsetDateTime, "2013-03-08")
        assertEquals(data.severity?.coding?.get(0)?.code, "371924009")
        assertEquals(data.severity?.coding?.get(0)?.display, "Moderate to severe")
        assertEquals(data.severity?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.subject.display, "Roel")
        assertEquals(data.subject.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.CONFIRMED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition3() {
        val sourceJson = loadAsString("condition-example-stroke.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "encounter-diagnosis")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "Encounter Diagnosis")
        assertEquals(
            data.category?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/condition-category"
        )
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.coding?.get(0)?.code, "422504002")
        assertEquals(data.code?.coding?.get(0)?.display, "Ischemic stroke (disorder)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Stroke")
        assertEquals(data.id, "stroke")
        assertEquals(data.onsetDateTime, "2010-07-18")
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Ischemic stroke, July 18, 2010</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.CONFIRMED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition4() {
        val sourceJson = loadAsString("condition-example-family-history.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "problem-list-item")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "Problem List Item")
        assertEquals(
            data.category?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/condition-category"
        )
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.coding?.get(0)?.code, "312824007")
        assertEquals(data.code?.coding?.get(0)?.display, "Family history of cancer of colon")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "family-history")
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Family history of cancer of colon</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition5() {
        val sourceJson = loadAsString("condition-example-f002-lung.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.assertedDate, "2012-06-03")
        assertEquals(data.asserter?.display, "P. van de Heuvel")
        assertEquals(data.asserter?.reference, "Patient/f001")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "51185008")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Thorax")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "439401001")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "diagnosis")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.coding?.get(0)?.code, "254637007")
        assertEquals(data.code?.coding?.get(0)?.display, "NSCLC - Non-small cell lung cancer")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.reference, "Encounter/f002")
        assertEquals(data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code, "169069000")
        assertEquals(data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display, "CT of thorax")
        assertEquals(
            data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system,
            "http://snomed.info/sct"
        )
        assertEquals(data.id, "f002")
        assertEquals(data.onsetDateTime, "2011-05-05")
        assertEquals(data.severity?.coding?.get(0)?.code, "24484000")
        assertEquals(data.severity?.coding?.get(0)?.display, "Severe")
        assertEquals(data.severity?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.stage?.summary?.coding?.get(0)?.code, "258219007")
        assertEquals(data.stage?.summary?.coding?.get(0)?.display, "stage II")
        assertEquals(data.stage?.summary?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.subject.display, "P. van de Heuvel")
        assertEquals(data.subject.reference, "Patient/f001")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.CONFIRMED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition6() {
        val sourceJson = loadAsString("condition-example-f205-infection.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.assertedDate, "2013-04-04")
        assertEquals(data.asserter?.reference, "Practitioner/f201")
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.coding?.get(0)?.code, "87628006")
        assertEquals(data.code?.coding?.get(0)?.display, "Bacterial infectious disease")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.id, "f205")
        assertEquals(data.subject.display, "Roel")
        assertEquals(data.subject.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.DIFFERENTIAL)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition7() {
        val sourceJson = loadAsString("condition-example-f204-renal.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.abatementDateTime, "2013-03-20")
        assertEquals(data.assertedDate, "2013-03-11")
        assertEquals(data.asserter?.reference, "Practitioner/f201")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "181414000")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Kidney")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "55607006")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "Problem")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(1)?.code, "problem-list-item")
        assertEquals(
            data.category?.get(0)?.coding?.get(1)?.system,
            "http://hl7.org/fhir/condition-category"
        )
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.coding?.get(0)?.code, "36225005")
        assertEquals(
            data.code?.coding?.get(0)?.display,
            "Acute renal insufficiency specified as due to procedure"
        )
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.display, "Roel's encounter on March eleventh")
        assertEquals(data.context?.reference, "Encounter/f203")
        assertEquals(data.id, "f204")
        assertEquals(data.note?.get(0)?.text, "The patient is anuric.")
        assertEquals(data.onsetDateTime, "2013-03-11")
        assertEquals(data.severity?.coding?.get(0)?.code, "24484000")
        assertEquals(data.severity?.coding?.get(0)?.display, "Severe")
        assertEquals(data.severity?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.stage?.assessment?.get(0)?.display, "Genetic analysis master panel")
        assertEquals(data.stage?.summary?.coding?.get(0)?.code, "14803004")
        assertEquals(data.stage?.summary?.coding?.get(0)?.display, "Temporary")
        assertEquals(data.stage?.summary?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.subject.display, "Roel")
        assertEquals(data.subject.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.DIFFERENTIAL)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition8() {
        val sourceJson = loadAsString("condition-example2.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "problem-list-item")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "Problem List Item")
        assertEquals(
            data.category?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/condition-category"
        )
        assertEquals(data.clinicalStatus, "active")
        assertEquals(data.code?.text, "Asthma")
        assertEquals(data.id, "example2")
        assertEquals(data.onsetString, "approximately November 2012")
        assertEquals(data.severity?.coding?.get(0)?.code, "255604002")
        assertEquals(data.severity?.coding?.get(0)?.display, "Mild")
        assertEquals(data.severity?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Mild Asthma (Date: 12-Nov 2012)</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.CONFIRMED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition9() {
        val sourceJson = loadAsString("condition-example-f202-malignancy.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.abatementAge?.code, "a")
        assertEquals(data.abatementAge?.system, "http://unitsofmeasure.org")
        assertEquals(data.abatementAge?.unit, "years")
        assertEquals(data.abatementAge?.value, "54")
        assertEquals(data.assertedDate, "2012-12-01")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "361355005")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Entire head and neck")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "encounter-diagnosis")
        assertEquals(
            data.category?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/condition-category"
        )
        assertEquals(data.clinicalStatus, "resolved")
        assertEquals(data.code?.coding?.get(0)?.code, "363346000")
        assertEquals(data.code?.coding?.get(0)?.display, "Malignant neoplastic disease")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(
            data.evidence?.get(0)?.detail?.get(0)?.display,
            "Erasmus' diagnostic report of Roel's tumor"
        )
        assertEquals(data.evidence?.get(0)?.detail?.get(0)?.reference, "DiagnosticReport/f201")
        assertEquals(data.id, "f202")
        assertEquals(data.meta?.security?.get(0)?.code, "TBOO")
        assertEquals(data.meta?.security?.get(0)?.display, "taboo")
        assertEquals(data.meta?.security?.get(0)?.system, "http://hl7.org/fhir/v3/ActCode")
        assertEquals(data.onsetAge?.code, "a")
        assertEquals(data.onsetAge?.system, "http://unitsofmeasure.org")
        assertEquals(data.onsetAge?.unit, "years")
        assertEquals(data.onsetAge?.value, "52")
        assertEquals(data.severity?.coding?.get(0)?.code, "24484000")
        assertEquals(data.severity?.coding?.get(0)?.display, "Severe")
        assertEquals(data.severity?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.subject.display, "Roel")
        assertEquals(data.subject.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.CONFIRMED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testCondition10() {
        val sourceJson = loadAsString("condition-example-f201-fever.json")

        val data = parser.toFhir(Condition::class, sourceJson)


        assertEquals(data.abatementString, "around April 9, 2013")
        assertEquals(data.assertedDate, "2013-04-04")
        assertEquals(data.asserter?.reference, "Practitioner/f201")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "38266002")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Entire body as a whole")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "55607006")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.display, "Problem")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.get(0)?.coding?.get(1)?.code, "problem-list-item")
        assertEquals(
            data.category?.get(0)?.coding?.get(1)?.system,
            "http://hl7.org/fhir/condition-category"
        )
        assertEquals(data.clinicalStatus, "resolved")
        assertEquals(data.code?.coding?.get(0)?.code, "386661006")
        assertEquals(data.code?.coding?.get(0)?.display, "Fever")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.reference, "Encounter/f201")
        assertEquals(data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.code, "258710007")
        assertEquals(data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.display, "degrees C")
        assertEquals(
            data.evidence?.get(0)?.code?.get(0)?.coding?.get(0)?.system,
            "http://snomed.info/sct"
        )
        assertEquals(data.evidence?.get(0)?.detail?.get(0)?.display, "Temperature")
        assertEquals(data.evidence?.get(0)?.detail?.get(0)?.reference, "Observation/f202")
        assertEquals(data.id, "f201")
        assertEquals(data.identifier?.get(0)?.value, "12345")
        assertEquals(data.onsetDateTime, "2013-04-02")
        assertEquals(data.severity?.coding?.get(0)?.code, "255604002")
        assertEquals(data.severity?.coding?.get(0)?.display, "Mild")
        assertEquals(data.severity?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.subject.display, "Roel")
        assertEquals(data.subject.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.verificationStatus, ConditionVerificationStatus.CONFIRMED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


