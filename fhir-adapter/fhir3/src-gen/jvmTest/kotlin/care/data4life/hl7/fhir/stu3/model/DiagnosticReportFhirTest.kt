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
import care.data4life.hl7.fhir.stu3.codesystem.DiagnosticReportStatus
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DiagnosticReportTest.java
 *
 * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports
 *
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
 * devices, and locations, and/or specimens derived from these. The report includes clinical context
 * such as requesting and provider information, and some mix of atomic results, images, textual and
 * coded interpretations, and formatted representation of diagnostic reports.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DiagnosticReportFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDiagnosticReport01() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-f202-bloodculture.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport01Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "#req",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15220000",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Laboratory test",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LAB",
            actual = data.category?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "104177005",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blood culture for bacteria, including anaerobic screen",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "428763004",
            actual = data.codedDiagnosis?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bacteremia due to staphylococcus",
            actual = data.codedDiagnosis?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.codedDiagnosis?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blood culture tested positive on staphylococcus aureus",
            actual = data.conclusion
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "req",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f202",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-03-11T10:28:00+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "AUMC",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f201",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Results for staphylococcus analysis on Roel's blood culture",
            actual = data.result?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/f206",
            actual = data.result?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport02() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-ghp.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport02Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "GHP",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General Health Profile",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/labs/reports",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "rtt",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ltt",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urine",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "p2",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r1",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r2",
            actual = data.contained?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r3",
            actual = data.contained?.get(6)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r4",
            actual = data.contained?.get(7)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r5",
            actual = data.contained?.get(8)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r6",
            actual = data.contained?.get(9)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-16T06:40:17Z",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "ghp",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/lab/reports",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ghp-example",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-17T06:40:17Z",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "2015-08-16T10:35:23Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "Acme Laboratory, Inc",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chemistry Panel",
            actual = data.result?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p1",
            actual = data.result?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CBC",
            actual = data.result?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p2",
            actual = data.result?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Urinalysis",
            actual = data.result?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p3",
            actual = data.result?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Red Top Tube",
            actual = data.specimen?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#rtt",
            actual = data.specimen?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lavender Top Tube",
            actual = data.specimen?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#ltt",
            actual = data.specimen?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Urine Sample",
            actual = data.specimen?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#urine",
            actual = data.specimen?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/pat2",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport03() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-lipids.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport03Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "HM",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24331-1",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid 1996 panel - Serum or Plasma",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Panel",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cholesterol",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "triglyceride",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hdlcholesterol",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ldlcholesterol",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-03-04T08:30:00+11:00",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "lipids",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/lab/reports",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5234342",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-27T11:45:33+11:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Acme Laboratory, Inc",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#cholesterol",
            actual = data.result?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#triglyceride",
            actual = data.result?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#hdlcholesterol",
            actual = data.result?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#ldlcholesterol",
            actual = data.result?.get(3)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/pat2",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport04() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-f001-bloodexam.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport04Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "#req",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "252275004",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Haematology test",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HM",
            actual = data.category?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "58410-2",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Complete blood count (hemogram) panel - Blood by Automated count",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Core lab",
            actual = data.conclusion
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "req",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f001",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/reports",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "nr1239044",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-15T19:32:52+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Burgers University Medical Centre",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/f001",
            actual = data.result?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/f002",
            actual = data.result?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/f003",
            actual = data.result?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/f004",
            actual = data.result?.get(3)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/f005",
            actual = data.result?.get(4)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "P. van den Heuvel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport05() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-ultrasound.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport05Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "394914008",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Radiology",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RAD",
            actual = data.category?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "45036003",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ultrasonography of abdomen",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Abdominal Ultrasound",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Unremarkable study",
            actual = data.conclusion
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-12-01T12:00:00+01:00",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "ultrasound",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A comment about the image",
            actual = data.image?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WADO example image",
            actual = data.image?.get(0)?.link?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Media/1.2.840.11361907579238403408700.3.0.14.19970327150033",
            actual = data.image?.get(0)?.link?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-12-01T12:00:00+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport06() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-f201-brainct.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport06Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "394914008",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Radiology",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RAD",
            actual = data.category?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "429858000",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Computed tomography (CT) of head and neck",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CT of head-neck",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "188340000",
            actual = data.codedDiagnosis?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Malignant tumor of craniopharyngeal duct",
            actual = data.codedDiagnosis?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.codedDiagnosis?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CT brains: large tumor sphenoid/clivus.",
            actual = data.conclusion
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-12-01T12:00:00+01:00",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HEAD and NECK CT DICOM imaging study",
            actual = data.imagingStudy?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-12-01T12:00:00+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Blijdorp MC",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f203",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport07() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-genetics-example-2-familyhistory.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport07Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "15220000",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Laboratory test",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LAB",
            actual = data.category?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "55233-1",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Genetic analysis master panel",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f1-genetics",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-05-26T15:30:10+01:00",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/DiagnosticReport-geneticsFamilyMemberHistory",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#f1-genetics",
            actual = data.extension?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dg2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-05-16T10:28:00+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Molecular Diagnostic Laboratory",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/genetics-example2",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Genetic analysis for BRAC -1",
            actual = data.result?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/ob-genetics-3-1",
            actual = data.result?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Genetic analysis for BRAC -2",
            actual = data.result?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/ob-genetics-3-2",
            actual = data.result?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Molecular Specimen ID: MLD45-Z4-1234",
            actual = data.specimen?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen/genetics-example2",
            actual = data.specimen?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers(MRN: 12345)",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport08() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport08Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "HM",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "58410-2",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Complete blood count (hemogram) panel - Blood by Automated count",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CBC",
            actual = data.code?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MASTER FULL BLOOD COUNT",
            actual = data.code?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Complete Blood Count",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r3",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r4",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r5",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r6",
            actual = data.contained?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r7",
            actual = data.contained?.get(6)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r8",
            actual = data.contained?.get(7)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r9",
            actual = data.contained?.get(8)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "r10",
            actual = data.contained?.get(9)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-03-04T08:30:00+11:00",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "101",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/lab/reports",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5234342",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-03-04T11:45:33+11:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "01",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Needs Review",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/workflow-codes",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Laboratory, Inc",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.presentedForm?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-AU",
            actual = data.presentedForm?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTML Report",
            actual = data.presentedForm?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r1",
            actual = data.result?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r2",
            actual = data.result?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r3",
            actual = data.result?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r4",
            actual = data.result?.get(3)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r5",
            actual = data.result?.get(4)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r6",
            actual = data.result?.get(5)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r7",
            actual = data.result?.get(6)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r8",
            actual = data.result?.get(7)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r9",
            actual = data.result?.get(8)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#r10",
            actual = data.result?.get(9)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/pat2",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport09() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-papsmear.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport09Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "47527-7",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-02-11T10:33:33+11:00",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "pap",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-02-13T11:45:33+11:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/b248b1b2-1686-4b94-9936-37d7a5f94b51",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testDiagnosticReport10() {
        // Given
        val sourceJson = loadAsString("stu3/diagnosticreport-example-gingival-mass.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertDiagnosticReport10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDiagnosticReport10Step01(data: DiagnosticReport) {

        assertEquals(
            expected = "PAT",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pathology (gross & histopath, not surgical)",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0074",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pathology",
            actual = data.category?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4503",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.acmeonline.com",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-03-02",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "gingival-mass",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.acmeonline.com",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P73456090",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-03-15T08:13:08Z",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "Acme Animal Labs",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.presentedForm?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en",
            actual = data.presentedForm?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LAB ID: P73456090 MAX JONES Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            actual = data.presentedForm?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Max Jones",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
