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
import care.data4life.hl7.fhir.r4.codesystem.DiagnosticReportStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DiagnosticReportFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testDiagnosticReport01() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-ultrasound.json")

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
            expected = "394914008",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Radiology",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RAD",
            actual = data.category?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0074",
            actual = data.category?.get(0)?.coding?.get(1)?.system
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
            expected = "2012-12-01T12:00:00+01:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "A comment about the image",
            actual = data.media?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WADO example image",
            actual = data.media?.get(0)?.link?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Media/1.2.840.11361907579238403408700.3.1.04.19970327150033",
            actual = data.media?.get(0)?.link?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.reference
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
    fun testDiagnosticReport02() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-f201-brainct.json")

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
            expected = "394914008",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Radiology",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RAD",
            actual = data.category?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0074",
            actual = data.category?.get(0)?.coding?.get(1)?.system
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
            expected = "CT brains: large tumor sphenoid/clivus.",
            actual = data.conclusion
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "188340000",
            actual = data.conclusionCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Malignant tumor of craniopharyngeal duct",
            actual = data.conclusionCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.conclusionCode?.get(0)?.coding?.get(0)?.system
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
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blijdorp MC",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f203",
            actual = data.performer?.get(0)?.reference
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
    fun testDiagnosticReport03() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-papsmear.json")

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
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.reference
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
    fun testDiagnosticReport04() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-gingival-mass.json")

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
            expected = "PAT",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pathology (gross & histopath, not surgical)",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0074",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pathology",
            actual = data.category?.get(0)?.text
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
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Animal Labs",
            actual = data.performer?.get(0)?.display
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

    @Test
    fun testDiagnosticReport05() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-pgx.json")

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
            expected = "ServiceRequest/example-pgx",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PGxReport",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pharmacogenetics Report",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://system/PGxReport",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pharmacogenetics Report",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-15T12:34:56+11:00",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example-pgx",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-20T14:00:05+11:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/4829",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.presentedForm?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-20T20:00:00+11:00",
            actual = data.presentedForm?.get(0)?.creation?.value.toString()
        )

        assertEquals(
            expected = "cGRmSW5CYXNlNjRCaW5hcnk=",
            actual = data.presentedForm?.get(0)?.data
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "571ef9c5655840f324e679072ed62b1b95eef8a0",
            actual = data.presentedForm?.get(0)?.hash
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en",
            actual = data.presentedForm?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pharmacogenetics Report",
            actual = data.presentedForm?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/example-phenotype",
            actual = data.result?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DiagnosticReportStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "Bob Smith",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/899962",
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
        val sourceJson = loadAsString("r4/diagnosticreport-example-dxa.json")

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
            expected = "38269-7",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DXA BONE DENSITOMETRY",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "391040000",
            actual = data.conclusionCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "At risk of osteoporotic fracture",
            actual = data.conclusionCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.conclusionCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2008-06-17",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "102",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2008-06-18T09:23:00+10:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Henry Seven",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/bmd",
            actual = data.result?.get(0)?.reference
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
}
