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
import care.data4life.fhir.stu3.codesystem.DiagnosticReportStatus
import care.data4life.fhir.stu3.codesystem.IdentifierUse
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * DiagnosticReportTest.java
 *
 * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports.
 *
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class DiagnosticReportTest {

    val parser = FhirStu3Parser()


    @Test
    fun testDiagnosticReport1() {
        val sourceJson = loadAsString("diagnosticreport-example-f202-bloodculture.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.basedOn?.get(0)?.reference, "#req")
        assertEquals(data.category?.coding?.get(0)?.code, "15220000")
        assertEquals(data.category?.coding?.get(0)?.display, "Laboratory test")
        assertEquals(data.category?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.coding?.get(1)?.code, "LAB")
        assertEquals(data.category?.coding?.get(1)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.code.coding?.get(0)?.code, "104177005")
        assertEquals(
            data.code.coding?.get(0)?.display,
            "Blood culture for bacteria, including anaerobic screen"
        )
        assertEquals(data.code.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.codedDiagnosis?.get(0)?.coding?.get(0)?.code, "428763004")
        assertEquals(
            data.codedDiagnosis?.get(0)?.coding?.get(0)?.display,
            "Bacteremia due to staphylococcus"
        )
        assertEquals(data.codedDiagnosis?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.conclusion, "Blood culture tested positive on staphylococcus aureus")
        assertEquals(data.contained?.get(0)?.id, "req")
        assertEquals(data.id, "f202")
        assertEquals(data.issued, "2013-03-11T10:28:00+01:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "AUMC")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Organization/f201")
        assertEquals(
            data.result?.get(0)?.display,
            "Results for staphylococcus analysis on Roel's blood culture"
        )
        assertEquals(data.result?.get(0)?.reference, "Observation/f206")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.display, "Roel")
        assertEquals(data.subject?.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport2() {
        val sourceJson = loadAsString("diagnosticreport-example-ghp.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.code.coding?.get(0)?.code, "GHP")
        assertEquals(data.code.coding?.get(0)?.display, "General Health Profile")
        assertEquals(data.code.coding?.get(0)?.system, "http://acme.com/labs/reports")
        assertEquals(data.contained?.get(0)?.id, "rtt")
        assertEquals(data.contained?.get(1)?.id, "ltt")
        assertEquals(data.contained?.get(2)?.id, "urine")
        assertEquals(data.contained?.get(3)?.id, "p2")
        assertEquals(data.contained?.get(4)?.id, "r1")
        assertEquals(data.contained?.get(5)?.id, "r2")
        assertEquals(data.contained?.get(6)?.id, "r3")
        assertEquals(data.contained?.get(7)?.id, "r4")
        assertEquals(data.contained?.get(8)?.id, "r5")
        assertEquals(data.contained?.get(9)?.id, "r6")
        assertEquals(data.effectiveDateTime, "2015-08-16T06:40:17Z")
        assertEquals(data.id, "ghp")
        assertEquals(data.identifier?.get(0)?.system, "http://acme.com/lab/reports")
        assertEquals(data.identifier?.get(0)?.value, "ghp-example")
        assertEquals(data.issued, "2015-08-17T06:40:17Z")
        assertEquals(data.meta?.lastUpdated, "2015-08-16T10:35:23Z")
        assertEquals(data.performer?.get(0)?.actor?.display, "Acme Laboratory, Inc")
        assertEquals(
            data.performer?.get(0)?.actor?.reference,
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f"
        )
        assertEquals(data.result?.get(0)?.display, "Chemistry Panel")
        assertEquals(data.result?.get(0)?.reference, "#p1")
        assertEquals(data.result?.get(1)?.display, "CBC")
        assertEquals(data.result?.get(1)?.reference, "#p2")
        assertEquals(data.result?.get(2)?.display, "Urinalysis")
        assertEquals(data.result?.get(2)?.reference, "#p3")
        assertEquals(data.specimen?.get(0)?.display, "Red Top Tube")
        assertEquals(data.specimen?.get(0)?.reference, "#rtt")
        assertEquals(data.specimen?.get(1)?.display, "Lavender Top Tube")
        assertEquals(data.specimen?.get(1)?.reference, "#ltt")
        assertEquals(data.specimen?.get(2)?.display, "Urine Sample")
        assertEquals(data.specimen?.get(2)?.reference, "#urine")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.reference, "Patient/pat2")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport3() {
        val sourceJson = loadAsString("diagnosticreport-example-lipids.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.category?.coding?.get(0)?.code, "HM")
        assertEquals(data.category?.coding?.get(0)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.code.coding?.get(0)?.code, "24331-1")
        assertEquals(data.code.coding?.get(0)?.display, "Lipid 1996 panel - Serum or Plasma")
        assertEquals(data.code.coding?.get(0)?.system, "http://loinc.org")
        assertEquals(data.code.text, "Lipid Panel")
        assertEquals(data.contained?.get(0)?.id, "cholesterol")
        assertEquals(data.contained?.get(1)?.id, "triglyceride")
        assertEquals(data.contained?.get(2)?.id, "hdlcholesterol")
        assertEquals(data.contained?.get(3)?.id, "ldlcholesterol")
        assertEquals(data.effectiveDateTime, "2011-03-04T08:30:00+11:00")
        assertEquals(data.id, "lipids")
        assertEquals(data.identifier?.get(0)?.system, "http://acme.com/lab/reports")
        assertEquals(data.identifier?.get(0)?.value, "5234342")
        assertEquals(data.issued, "2013-01-27T11:45:33+11:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "Acme Laboratory, Inc")
        assertEquals(
            data.performer?.get(0)?.actor?.reference,
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f"
        )
        assertEquals(data.result?.get(0)?.reference, "#cholesterol")
        assertEquals(data.result?.get(1)?.reference, "#triglyceride")
        assertEquals(data.result?.get(2)?.reference, "#hdlcholesterol")
        assertEquals(data.result?.get(3)?.reference, "#ldlcholesterol")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.reference, "Patient/pat2")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport4() {
        val sourceJson = loadAsString("diagnosticreport-example-f001-bloodexam.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.basedOn?.get(0)?.reference, "#req")
        assertEquals(data.category?.coding?.get(0)?.code, "252275004")
        assertEquals(data.category?.coding?.get(0)?.display, "Haematology test")
        assertEquals(data.category?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.coding?.get(1)?.code, "HM")
        assertEquals(data.category?.coding?.get(1)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.code.coding?.get(0)?.code, "58410-2")
        assertEquals(
            data.code.coding?.get(0)?.display,
            "Complete blood count (hemogram) panel - Blood by Automated count"
        )
        assertEquals(data.code.coding?.get(0)?.system, "http://loinc.org")
        assertEquals(data.conclusion, "Core lab")
        assertEquals(data.contained?.get(0)?.id, "req")
        assertEquals(data.id, "f001")
        assertEquals(
            data.identifier?.get(0)?.system,
            "http://www.bmc.nl/zorgportal/identifiers/reports"
        )
        assertEquals(data.identifier?.get(0)?.use, IdentifierUse.OFFICIAL)
        assertEquals(data.identifier?.get(0)?.value, "nr1239044")
        assertEquals(data.issued, "2013-05-15T19:32:52+01:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "Burgers University Medical Centre")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Organization/f001")
        assertEquals(data.result?.get(0)?.reference, "Observation/f001")
        assertEquals(data.result?.get(1)?.reference, "Observation/f002")
        assertEquals(data.result?.get(2)?.reference, "Observation/f003")
        assertEquals(data.result?.get(3)?.reference, "Observation/f004")
        assertEquals(data.result?.get(4)?.reference, "Observation/f005")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.display, "P. van den Heuvel")
        assertEquals(data.subject?.reference, "Patient/f001")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport5() {
        val sourceJson = loadAsString("diagnosticreport-example-ultrasound.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.category?.coding?.get(0)?.code, "394914008")
        assertEquals(data.category?.coding?.get(0)?.display, "Radiology")
        assertEquals(data.category?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.coding?.get(1)?.code, "RAD")
        assertEquals(data.category?.coding?.get(1)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.code.coding?.get(0)?.code, "45036003")
        assertEquals(data.code.coding?.get(0)?.display, "Ultrasonography of abdomen")
        assertEquals(data.code.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code.text, "Abdominal Ultrasound")
        assertEquals(data.conclusion, "Unremarkable study")
        assertEquals(data.effectiveDateTime, "2012-12-01T12:00:00+01:00")
        assertEquals(data.id, "ultrasound")
        assertEquals(data.image?.get(0)?.comment, "A comment about the image")
        assertEquals(data.image?.get(0)?.link?.display, "WADO example image")
        assertEquals(
            data.image?.get(0)?.link?.reference,
            "Media/1.2.840.11361907579238403408700.3.0.14.19970327150033"
        )
        assertEquals(data.issued, "2012-12-01T12:00:00+01:00")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/example")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport6() {
        val sourceJson = loadAsString("diagnosticreport-example-f201-brainct.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.category?.coding?.get(0)?.code, "394914008")
        assertEquals(data.category?.coding?.get(0)?.display, "Radiology")
        assertEquals(data.category?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.coding?.get(1)?.code, "RAD")
        assertEquals(data.category?.coding?.get(1)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.code.coding?.get(0)?.code, "429858000")
        assertEquals(
            data.code.coding?.get(0)?.display,
            "Computed tomography (CT) of head and neck"
        )
        assertEquals(data.code.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code.text, "CT of head-neck")
        assertEquals(data.codedDiagnosis?.get(0)?.coding?.get(0)?.code, "188340000")
        assertEquals(
            data.codedDiagnosis?.get(0)?.coding?.get(0)?.display,
            "Malignant tumor of craniopharyngeal duct"
        )
        assertEquals(data.codedDiagnosis?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.conclusion, "CT brains: large tumor sphenoid/clivus.")
        assertEquals(data.effectiveDateTime, "2012-12-01T12:00:00+01:00")
        assertEquals(data.id, "f201")
        assertEquals(data.imagingStudy?.get(0)?.display, "HEAD and NECK CT DICOM imaging study")
        assertEquals(data.issued, "2012-12-01T12:00:00+01:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "Blijdorp MC")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Organization/f203")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.display, "Roel")
        assertEquals(data.subject?.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport7() {
        val sourceJson = loadAsString("diagnosticreport-genetics-example-2-familyhistory.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.category?.coding?.get(0)?.code, "15220000")
        assertEquals(data.category?.coding?.get(0)?.display, "Laboratory test")
        assertEquals(data.category?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.coding?.get(1)?.code, "LAB")
        assertEquals(data.category?.coding?.get(1)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.code.coding?.get(0)?.code, "55233-1")
        assertEquals(data.code.coding?.get(0)?.display, "Genetic analysis master panel")
        assertEquals(data.code.coding?.get(0)?.system, "http://loinc.org")
        assertEquals(data.contained?.get(0)?.id, "f1-genetics")
        assertEquals(data.effectiveDateTime, "2015-05-26T15:30:10+01:00")
        assertEquals(
            data.extension?.get(0)?.url,
            "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory"
        )
        assertEquals(data.extension?.get(0)?.valueReference?.reference, "#f1-genetics")
        assertEquals(data.id, "dg2")
        assertEquals(data.issued, "2014-05-16T10:28:00+01:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "Molecular Diagnostic Laboratory")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/genetics-example2")
        assertEquals(data.result?.get(0)?.display, "Genetic analysis for BRAC -1")
        assertEquals(data.result?.get(0)?.reference, "Observation/ob-genetics-3-1")
        assertEquals(data.result?.get(1)?.display, "Genetic analysis for BRAC -2")
        assertEquals(data.result?.get(1)?.reference, "Observation/ob-genetics-3-2")
        assertEquals(data.specimen?.get(0)?.display, "Molecular Specimen ID: MLD45-Z4-1234")
        assertEquals(data.specimen?.get(0)?.reference, "Specimen/genetics-example2")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.display, "Peter James Chalmers(MRN: 12345)")
        assertEquals(data.subject?.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport8() {
        val sourceJson = loadAsString("diagnosticreport-example.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.category?.coding?.get(0)?.code, "HM")
        assertEquals(data.category?.coding?.get(0)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.code.coding?.get(0)?.code, "58410-2")
        assertEquals(
            data.code.coding?.get(0)?.display,
            "Complete blood count (hemogram) panel - Blood by Automated count"
        )
        assertEquals(data.code.coding?.get(0)?.system, "http://loinc.org")
        assertEquals(data.code.coding?.get(1)?.code, "CBC")
        assertEquals(data.code.coding?.get(1)?.display, "MASTER FULL BLOOD COUNT")
        assertEquals(data.code.text, "Complete Blood Count")
        assertEquals(data.contained?.get(0)?.id, "r1")
        assertEquals(data.contained?.get(1)?.id, "r2")
        assertEquals(data.contained?.get(2)?.id, "r3")
        assertEquals(data.contained?.get(3)?.id, "r4")
        assertEquals(data.contained?.get(4)?.id, "r5")
        assertEquals(data.contained?.get(5)?.id, "r6")
        assertEquals(data.contained?.get(6)?.id, "r7")
        assertEquals(data.contained?.get(7)?.id, "r8")
        assertEquals(data.contained?.get(8)?.id, "r9")
        assertEquals(data.contained?.get(9)?.id, "r10")
        assertEquals(data.context?.reference, "Encounter/example")
        assertEquals(data.effectiveDateTime, "2011-03-04T08:30:00+11:00")
        assertEquals(data.id, "101")
        assertEquals(data.identifier?.get(0)?.system, "http://acme.com/lab/reports")
        assertEquals(data.identifier?.get(0)?.value, "5234342")
        assertEquals(data.issued, "2011-03-04T11:45:33+11:00")
        assertEquals(data.meta?.tag?.get(0)?.code, "01")
        assertEquals(data.meta?.tag?.get(0)?.display, "Needs Review")
        assertEquals(
            data.meta?.tag?.get(0)?.system,
            "http://example.org/fhir/CodeSystem/workflow-codes"
        )
        assertEquals(data.performer?.get(0)?.actor?.display, "Acme Laboratory, Inc")
        assertEquals(
            data.performer?.get(0)?.actor?.reference,
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f"
        )
        assertEquals(data.presentedForm?.get(0)?.contentType, "application/pdf")
        assertEquals(data.presentedForm?.get(0)?.language, "en-AU")
        assertEquals(data.presentedForm?.get(0)?.title, "HTML Report")
        assertEquals(data.result?.get(0)?.reference, "#r1")
        assertEquals(data.result?.get(1)?.reference, "#r2")
        assertEquals(data.result?.get(2)?.reference, "#r3")
        assertEquals(data.result?.get(3)?.reference, "#r4")
        assertEquals(data.result?.get(4)?.reference, "#r5")
        assertEquals(data.result?.get(5)?.reference, "#r6")
        assertEquals(data.result?.get(6)?.reference, "#r7")
        assertEquals(data.result?.get(7)?.reference, "#r8")
        assertEquals(data.result?.get(8)?.reference, "#r9")
        assertEquals(data.result?.get(9)?.reference, "#r10")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.reference, "Patient/pat2")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport9() {
        val sourceJson = loadAsString("diagnosticreport-example-papsmear.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.code.coding?.get(0)?.code, "47527-7")
        assertEquals(data.code.coding?.get(0)?.system, "http://loinc.org")
        assertEquals(data.effectiveDateTime, "2013-02-11T10:33:33+11:00")
        assertEquals(data.id, "pap")
        assertEquals(data.issued, "2013-02-13T11:45:33+11:00")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/example")
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.reference, "Patient/b248b1b2-1686-4b94-9936-37d7a5f94b51")
        assertEquals(data.text?.status, NarrativeStatus.ADDITIONAL)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testDiagnosticReport10() {
        val sourceJson = loadAsString("diagnosticreport-example-gingival-mass.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals(data.category?.coding?.get(0)?.code, "PAT")
        assertEquals(
            data.category?.coding?.get(0)?.display,
            "Pathology (gross & histopath, not surgical)"
        )
        assertEquals(data.category?.coding?.get(0)?.system, "http://hl7.org/fhir/v2/0074")
        assertEquals(data.category?.text, "Pathology")
        assertEquals(data.code.coding?.get(0)?.code, "4503")
        assertEquals(
            data.code.coding?.get(0)?.display,
            "Biopsy without Microscopic Description (1 Site/Lesion)-Standard"
        )
        assertEquals(data.code.coding?.get(0)?.system, "https://www.acmeonline.com")
        assertEquals(
            data.code.text,
            "Biopsy without Microscopic Description (1 Site/Lesion)-Standard"
        )
        assertEquals(data.effectiveDateTime, "2017-03-02")
        assertEquals(data.id, "gingival-mass")
        assertEquals(data.identifier?.get(0)?.system, "https://www.acmeonline.com")
        assertEquals(data.identifier?.get(0)?.value, "P73456090")
        assertEquals(data.issued, "2017-03-15T08:13:08Z")
        assertEquals(data.performer?.get(0)?.actor?.display, "Acme Animal Labs")
        assertEquals(data.presentedForm?.get(0)?.contentType, "application/pdf")
        assertEquals(data.presentedForm?.get(0)?.language, "en")
        assertEquals(
            data.presentedForm?.get(0)?.title,
            "LAB ID: P73456090 MAX JONES Biopsy without Microscopic Description (1 Site/Lesion)-Standard"
        )
        assertEquals(data.status, DiagnosticReportStatus.FINAL)
        assertEquals(data.subject?.display, "Max Jones")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


