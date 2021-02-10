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

package care.data4life.hl7.fhir.stu3.model


import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import care.data4life.hl7.fhir.stu3.codesystem.DiagnosticReportStatus
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
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
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class DiagnosticReportTest {

    val parser = FhirStu3Parser()


    @Test
    fun testDiagnosticReport1() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-f202-bloodculture.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("#req", data.basedOn?.get(0)?.reference)
        assertEquals("15220000", data.category?.coding?.get(0)?.code)
        assertEquals("Laboratory test", data.category?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.coding?.get(0)?.system)
        assertEquals("LAB", data.category?.coding?.get(1)?.code)
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(1)?.system)
        assertEquals("104177005", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Blood culture for bacteria, including anaerobic screen",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("428763004", data.codedDiagnosis?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "Bacteremia due to staphylococcus",
            data.codedDiagnosis?.get(0)?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.codedDiagnosis?.get(0)?.coding?.get(0)?.system)
        assertEquals("Blood culture tested positive on staphylococcus aureus", data.conclusion)
        assertEquals("req", data.contained?.get(0)?.id)
        assertEquals("f202", data.id)
        assertEquals("2013-03-11T10:28:00+01:00", data.issued?.value.toString())
        assertEquals("AUMC", data.performer?.get(0)?.actor?.display)
        assertEquals("Organization/f201", data.performer?.get(0)?.actor?.reference)
        assertEquals(
            "Results for staphylococcus analysis on Roel's blood culture",
            data.result?.get(0)?.display
        )
        assertEquals("Observation/f206", data.result?.get(0)?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport2() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-ghp.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("GHP", data.code?.coding?.get(0)?.code)
        assertEquals("General Health Profile", data.code?.coding?.get(0)?.display)
        assertEquals("http://acme.com/labs/reports", data.code?.coding?.get(0)?.system)
        assertEquals("rtt", data.contained?.get(0)?.id)
        assertEquals("ltt", data.contained?.get(1)?.id)
        assertEquals("urine", data.contained?.get(2)?.id)
        assertEquals("p2", data.contained?.get(3)?.id)
        assertEquals("r1", data.contained?.get(4)?.id)
        assertEquals("r2", data.contained?.get(5)?.id)
        assertEquals("r3", data.contained?.get(6)?.id)
        assertEquals("r4", data.contained?.get(7)?.id)
        assertEquals("r5", data.contained?.get(8)?.id)
        assertEquals("r6", data.contained?.get(9)?.id)
        assertEquals("2015-08-16T06:40:17Z", data.effectiveDateTime?.value.toString())
        assertEquals("ghp", data.id)
        assertEquals("http://acme.com/lab/reports", data.identifier?.get(0)?.system)
        assertEquals("ghp-example", data.identifier?.get(0)?.value)
        assertEquals("2015-08-17T06:40:17Z", data.issued?.value.toString())
        assertEquals("2015-08-16T10:35:23Z", data.meta?.lastUpdated?.value.toString())
        assertEquals("Acme Laboratory, Inc", data.performer?.get(0)?.actor?.display)
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals("Chemistry Panel", data.result?.get(0)?.display)
        assertEquals("#p1", data.result?.get(0)?.reference)
        assertEquals("CBC", data.result?.get(1)?.display)
        assertEquals("#p2", data.result?.get(1)?.reference)
        assertEquals("Urinalysis", data.result?.get(2)?.display)
        assertEquals("#p3", data.result?.get(2)?.reference)
        assertEquals("Red Top Tube", data.specimen?.get(0)?.display)
        assertEquals("#rtt", data.specimen?.get(0)?.reference)
        assertEquals("Lavender Top Tube", data.specimen?.get(1)?.display)
        assertEquals("#ltt", data.specimen?.get(1)?.reference)
        assertEquals("Urine Sample", data.specimen?.get(2)?.display)
        assertEquals("#urine", data.specimen?.get(2)?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Patient/pat2", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport3() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-lipids.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("HM", data.category?.coding?.get(0)?.code)
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(0)?.system)
        assertEquals("24331-1", data.code?.coding?.get(0)?.code)
        assertEquals("Lipid 1996 panel - Serum or Plasma", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Lipid Panel", data.code?.text)
        assertEquals("cholesterol", data.contained?.get(0)?.id)
        assertEquals("triglyceride", data.contained?.get(1)?.id)
        assertEquals("hdlcholesterol", data.contained?.get(2)?.id)
        assertEquals("ldlcholesterol", data.contained?.get(3)?.id)
        assertEquals("2011-03-04T08:30:00+11:00", data.effectiveDateTime?.value.toString())
        assertEquals("lipids", data.id)
        assertEquals("http://acme.com/lab/reports", data.identifier?.get(0)?.system)
        assertEquals("5234342", data.identifier?.get(0)?.value)
        assertEquals("2013-01-27T11:45:33+11:00", data.issued?.value.toString())
        assertEquals("Acme Laboratory, Inc", data.performer?.get(0)?.actor?.display)
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals("#cholesterol", data.result?.get(0)?.reference)
        assertEquals("#triglyceride", data.result?.get(1)?.reference)
        assertEquals("#hdlcholesterol", data.result?.get(2)?.reference)
        assertEquals("#ldlcholesterol", data.result?.get(3)?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Patient/pat2", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport4() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-f001-bloodexam.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("#req", data.basedOn?.get(0)?.reference)
        assertEquals("252275004", data.category?.coding?.get(0)?.code)
        assertEquals("Haematology test", data.category?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.coding?.get(0)?.system)
        assertEquals("HM", data.category?.coding?.get(1)?.code)
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(1)?.system)
        assertEquals("58410-2", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Complete blood count (hemogram) panel - Blood by Automated count",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Core lab", data.conclusion)
        assertEquals("req", data.contained?.get(0)?.id)
        assertEquals("f001", data.id)
        assertEquals(
            "http://www.bmc.nl/zorgportal/identifiers/reports",
            data.identifier?.get(0)?.system
        )
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("nr1239044", data.identifier?.get(0)?.value)
        assertEquals("2013-05-15T19:32:52+01:00", data.issued?.value.toString())
        assertEquals("Burgers University Medical Centre", data.performer?.get(0)?.actor?.display)
        assertEquals("Organization/f001", data.performer?.get(0)?.actor?.reference)
        assertEquals("Observation/f001", data.result?.get(0)?.reference)
        assertEquals("Observation/f002", data.result?.get(1)?.reference)
        assertEquals("Observation/f003", data.result?.get(2)?.reference)
        assertEquals("Observation/f004", data.result?.get(3)?.reference)
        assertEquals("Observation/f005", data.result?.get(4)?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("P. van den Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport5() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-ultrasound.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("394914008", data.category?.coding?.get(0)?.code)
        assertEquals("Radiology", data.category?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.coding?.get(0)?.system)
        assertEquals("RAD", data.category?.coding?.get(1)?.code)
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(1)?.system)
        assertEquals("45036003", data.code?.coding?.get(0)?.code)
        assertEquals("Ultrasonography of abdomen", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Abdominal Ultrasound", data.code?.text)
        assertEquals("Unremarkable study", data.conclusion)
        assertEquals("2012-12-01T12:00:00+01:00", data.effectiveDateTime?.value.toString())
        assertEquals("ultrasound", data.id)
        assertEquals("A comment about the image", data.image?.get(0)?.comment)
        assertEquals("WADO example image", data.image?.get(0)?.link?.display)
        assertEquals(
            "Media/1.2.840.11361907579238403408700.3.0.14.19970327150033",
            data.image?.get(0)?.link?.reference
        )
        assertEquals("2012-12-01T12:00:00+01:00", data.issued?.value.toString())
        assertEquals("Practitioner/example", data.performer?.get(0)?.actor?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport6() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-f201-brainct.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("394914008", data.category?.coding?.get(0)?.code)
        assertEquals("Radiology", data.category?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.coding?.get(0)?.system)
        assertEquals("RAD", data.category?.coding?.get(1)?.code)
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(1)?.system)
        assertEquals("429858000", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Computed tomography (CT) of head and neck",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("CT of head-neck", data.code?.text)
        assertEquals("188340000", data.codedDiagnosis?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "Malignant tumor of craniopharyngeal duct",
            data.codedDiagnosis?.get(0)?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.codedDiagnosis?.get(0)?.coding?.get(0)?.system)
        assertEquals("CT brains: large tumor sphenoid/clivus.", data.conclusion)
        assertEquals("2012-12-01T12:00:00+01:00", data.effectiveDateTime?.value.toString())
        assertEquals("f201", data.id)
        assertEquals("HEAD and NECK CT DICOM imaging study", data.imagingStudy?.get(0)?.display)
        assertEquals("2012-12-01T12:00:00+01:00", data.issued?.value.toString())
        assertEquals("Blijdorp MC", data.performer?.get(0)?.actor?.display)
        assertEquals("Organization/f203", data.performer?.get(0)?.actor?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport7() {
        val sourceJson = loadAsString("stu3/diagnosticreport-genetics-example-2-familyhistory.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("15220000", data.category?.coding?.get(0)?.code)
        assertEquals("Laboratory test", data.category?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.coding?.get(0)?.system)
        assertEquals("LAB", data.category?.coding?.get(1)?.code)
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(1)?.system)
        assertEquals("55233-1", data.code?.coding?.get(0)?.code)
        assertEquals("Genetic analysis master panel", data.code?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("f1-genetics", data.contained?.get(0)?.id)
        assertEquals("2015-05-26T15:30:10+01:00", data.effectiveDateTime?.value.toString())
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory",
            data.extension?.get(0)?.url
        )
        assertEquals("#f1-genetics", data.extension?.get(0)?.valueReference?.reference)
        assertEquals("dg2", data.id)
        assertEquals("2014-05-16T10:28:00+01:00", data.issued?.value.toString())
        assertEquals("Molecular Diagnostic Laboratory", data.performer?.get(0)?.actor?.display)
        assertEquals("Practitioner/genetics-example2", data.performer?.get(0)?.actor?.reference)
        assertEquals("Genetic analysis for BRAC -1", data.result?.get(0)?.display)
        assertEquals("Observation/ob-genetics-3-1", data.result?.get(0)?.reference)
        assertEquals("Genetic analysis for BRAC -2", data.result?.get(1)?.display)
        assertEquals("Observation/ob-genetics-3-2", data.result?.get(1)?.reference)
        assertEquals("Molecular Specimen ID: MLD45-Z4-1234", data.specimen?.get(0)?.display)
        assertEquals("Specimen/genetics-example2", data.specimen?.get(0)?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Peter James Chalmers(MRN: 12345)", data.subject?.display)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport8() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("HM", data.category?.coding?.get(0)?.code)
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(0)?.system)
        assertEquals("58410-2", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Complete blood count (hemogram) panel - Blood by Automated count",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("CBC", data.code?.coding?.get(1)?.code)
        assertEquals("MASTER FULL BLOOD COUNT", data.code?.coding?.get(1)?.display)
        assertEquals("Complete Blood Count", data.code?.text)
        assertEquals("r1", data.contained?.get(0)?.id)
        assertEquals("r2", data.contained?.get(1)?.id)
        assertEquals("r3", data.contained?.get(2)?.id)
        assertEquals("r4", data.contained?.get(3)?.id)
        assertEquals("r5", data.contained?.get(4)?.id)
        assertEquals("r6", data.contained?.get(5)?.id)
        assertEquals("r7", data.contained?.get(6)?.id)
        assertEquals("r8", data.contained?.get(7)?.id)
        assertEquals("r9", data.contained?.get(8)?.id)
        assertEquals("r10", data.contained?.get(9)?.id)
        assertEquals("Encounter/example", data.context?.reference)
        assertEquals("2011-03-04T08:30:00+11:00", data.effectiveDateTime?.value.toString())
        assertEquals("101", data.id)
        assertEquals("http://acme.com/lab/reports", data.identifier?.get(0)?.system)
        assertEquals("5234342", data.identifier?.get(0)?.value)
        assertEquals("2011-03-04T11:45:33+11:00", data.issued?.value.toString())
        assertEquals("01", data.meta?.tag?.get(0)?.code)
        assertEquals("Needs Review", data.meta?.tag?.get(0)?.display)
        assertEquals(
            "http://example.org/fhir/CodeSystem/workflow-codes",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals("Acme Laboratory, Inc", data.performer?.get(0)?.actor?.display)
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals("application/pdf", data.presentedForm?.get(0)?.contentType)
        assertEquals("en-AU", data.presentedForm?.get(0)?.language)
        assertEquals("HTML Report", data.presentedForm?.get(0)?.title)
        assertEquals("#r1", data.result?.get(0)?.reference)
        assertEquals("#r2", data.result?.get(1)?.reference)
        assertEquals("#r3", data.result?.get(2)?.reference)
        assertEquals("#r4", data.result?.get(3)?.reference)
        assertEquals("#r5", data.result?.get(4)?.reference)
        assertEquals("#r6", data.result?.get(5)?.reference)
        assertEquals("#r7", data.result?.get(6)?.reference)
        assertEquals("#r8", data.result?.get(7)?.reference)
        assertEquals("#r9", data.result?.get(8)?.reference)
        assertEquals("#r10", data.result?.get(9)?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Patient/pat2", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport9() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-papsmear.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("47527-7", data.code?.coding?.get(0)?.code)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("2013-02-11T10:33:33+11:00", data.effectiveDateTime?.value.toString())
        assertEquals("pap", data.id)
        assertEquals("2013-02-13T11:45:33+11:00", data.issued?.value.toString())
        assertEquals("Practitioner/example", data.performer?.get(0)?.actor?.reference)
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Patient/b248b1b2-1686-4b94-9936-37d7a5f94b51", data.subject?.reference)
        assertEquals(NarrativeStatus.ADDITIONAL, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testDiagnosticReport10() {
        val sourceJson = loadAsString("stu3/diagnosticreport-example-gingival-mass.json")

        val data = parser.toFhir(DiagnosticReport::class, sourceJson)


        assertEquals("PAT", data.category?.coding?.get(0)?.code)
        assertEquals(
            "Pathology (gross & histopath, not surgical)",
            data.category?.coding?.get(0)?.display
        )
        assertEquals("http://hl7.org/fhir/v2/0074", data.category?.coding?.get(0)?.system)
        assertEquals("Pathology", data.category?.text)
        assertEquals("4503", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("https://www.acmeonline.com", data.code?.coding?.get(0)?.system)
        assertEquals(
            "Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            data.code?.text
        )
        assertEquals("2017-03-02", data.effectiveDateTime?.value.toString())
        assertEquals("gingival-mass", data.id)
        assertEquals("https://www.acmeonline.com", data.identifier?.get(0)?.system)
        assertEquals("P73456090", data.identifier?.get(0)?.value)
        assertEquals("2017-03-15T08:13:08Z", data.issued?.value.toString())
        assertEquals("Acme Animal Labs", data.performer?.get(0)?.actor?.display)
        assertEquals("application/pdf", data.presentedForm?.get(0)?.contentType)
        assertEquals("en", data.presentedForm?.get(0)?.language)
        assertEquals(
            "LAB ID: P73456090 MAX JONES Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            data.presentedForm?.get(0)?.title
        )
        assertEquals(DiagnosticReportStatus.FINAL, data.status)
        assertEquals("Max Jones", data.subject?.display)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}


