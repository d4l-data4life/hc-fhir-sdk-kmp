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
class DiagnosticReportTest {

    val parser = FhirR4Parser()

    @Test
    fun testDiagnosticReport01() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-ultrasound.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertEquals(
            "394914008",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Radiology",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "RAD",
            data.category?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0074",
            data.category?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "45036003",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Ultrasonography of abdomen",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Abdominal Ultrasound",
            data.code?.text
        )
        assertEquals(
            "Unremarkable study",
            data.conclusion
        )
        assertEquals(
            "2012-12-01T12:00:00+01:00",
            data.effectiveDateTime?.value.toString()
        )
        assertEquals(
            "ultrasound",
            data.id
        )
        assertEquals(
            "2012-12-01T12:00:00+01:00",
            data.issued?.value.toString()
        )
        assertEquals(
            "A comment about the image",
            data.media?.get(0)?.comment
        )
        assertEquals(
            "WADO example image",
            data.media?.get(0)?.link?.display
        )
        assertEquals(
            "Media/1.2.840.11361907579238403408700.3.1.04.19970327150033",
            data.media?.get(0)?.link?.reference
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
            "Practitioner/example",
            data.performer?.get(0)?.reference
        )
        assertEquals(
            DiagnosticReportStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/example",
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
    fun testDiagnosticReport02() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-f201-brainct.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertEquals(
            "394914008",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Radiology",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "RAD",
            data.category?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0074",
            data.category?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "429858000",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Computed tomography (CT) of head and neck",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "CT of head-neck",
            data.code?.text
        )
        assertEquals(
            "CT brains: large tumor sphenoid/clivus.",
            data.conclusion
        )
        assertEquals(
            "188340000",
            data.conclusionCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Malignant tumor of craniopharyngeal duct",
            data.conclusionCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.conclusionCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2012-12-01T12:00:00+01:00",
            data.effectiveDateTime?.value.toString()
        )
        assertEquals(
            "f201",
            data.id
        )
        assertEquals(
            "HEAD and NECK CT DICOM imaging study",
            data.imagingStudy?.get(0)?.display
        )
        assertEquals(
            "2012-12-01T12:00:00+01:00",
            data.issued?.value.toString()
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
            "Blijdorp MC",
            data.performer?.get(0)?.display
        )
        assertEquals(
            "Organization/f203",
            data.performer?.get(0)?.reference
        )
        assertEquals(
            DiagnosticReportStatus.FINAL,
            data.status
        )
        assertEquals(
            "Roel",
            data.subject?.display
        )
        assertEquals(
            "Patient/f201",
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
    fun testDiagnosticReport03() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-papsmear.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertEquals(
            "47527-7",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2013-02-11T10:33:33+11:00",
            data.effectiveDateTime?.value.toString()
        )
        assertEquals(
            "pap",
            data.id
        )
        assertEquals(
            "2013-02-13T11:45:33+11:00",
            data.issued?.value.toString()
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
            "Practitioner/example",
            data.performer?.get(0)?.reference
        )
        assertEquals(
            DiagnosticReportStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/b248b1b2-1686-4b94-9936-37d7a5f94b51",
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
    fun testDiagnosticReport04() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-gingival-mass.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertEquals(
            "PAT",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Pathology (gross & histopath, not surgical)",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0074",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Pathology",
            data.category?.get(0)?.text
        )
        assertEquals(
            "4503",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "https://www.acmeonline.com",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            data.code?.text
        )
        assertEquals(
            "2017-03-02",
            data.effectiveDateTime?.value.toString()
        )
        assertEquals(
            "gingival-mass",
            data.id
        )
        assertEquals(
            "https://www.acmeonline.com",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "P73456090",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "2017-03-15T08:13:08Z",
            data.issued?.value.toString()
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
            "Acme Animal Labs",
            data.performer?.get(0)?.display
        )
        assertEquals(
            "application/pdf",
            data.presentedForm?.get(0)?.contentType
        )
        assertEquals(
            "en",
            data.presentedForm?.get(0)?.language
        )
        assertEquals(
            "LAB ID: P73456090 MAX JONES Biopsy without Microscopic Description (1 Site/Lesion)-Standard",
            data.presentedForm?.get(0)?.title
        )
        assertEquals(
            DiagnosticReportStatus.FINAL,
            data.status
        )
        assertEquals(
            "Max Jones",
            data.subject?.display
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
    fun testDiagnosticReport05() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-pgx.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertEquals(
            "ServiceRequest/example-pgx",
            data.basedOn?.get(0)?.reference
        )
        assertEquals(
            "PGxReport",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Pharmacogenetics Report",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "https://system/PGxReport",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Pharmacogenetics Report",
            data.code?.text
        )
        assertEquals(
            "2016-10-15T12:34:56+11:00",
            data.effectiveDateTime?.value.toString()
        )
        assertEquals(
            "example-pgx",
            data.id
        )
        assertEquals(
            "2016-10-20T14:00:05+11:00",
            data.issued?.value.toString()
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
            "Organization/4829",
            data.performer?.get(0)?.reference
        )
        assertEquals(
            "application/pdf",
            data.presentedForm?.get(0)?.contentType
        )
        assertEquals(
            "2016-10-20T20:00:00+11:00",
            data.presentedForm?.get(0)?.creation?.value.toString()
        )
        assertEquals(
            "cGRmSW5CYXNlNjRCaW5hcnk=",
            data.presentedForm?.get(0)?.data
        )
        assertEquals(
            "571ef9c5655840f324e679072ed62b1b95eef8a0",
            data.presentedForm?.get(0)?.hash
        )
        assertEquals(
            "en",
            data.presentedForm?.get(0)?.language
        )
        assertEquals(
            "Pharmacogenetics Report",
            data.presentedForm?.get(0)?.title
        )
        assertEquals(
            "Observation/example-phenotype",
            data.result?.get(0)?.reference
        )
        assertEquals(
            DiagnosticReportStatus.FINAL,
            data.status
        )
        assertEquals(
            "Bob Smith",
            data.subject?.display
        )
        assertEquals(
            "Patient/899962",
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
    fun testDiagnosticReport06() {
        // Given
        val sourceJson = loadAsString("r4/diagnosticreport-example-dxa.json")

        // When
        val data = parser.toFhir(DiagnosticReport::class, sourceJson)

        // Then
        assertEquals(
            "38269-7",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "DXA BONE DENSITOMETRY",
            data.code?.text
        )
        assertEquals(
            "391040000",
            data.conclusionCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "At risk of osteoporotic fracture",
            data.conclusionCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.conclusionCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2008-06-17",
            data.effectiveDateTime?.value.toString()
        )
        assertEquals(
            "102",
            data.id
        )
        assertEquals(
            "2008-06-18T09:23:00+10:00",
            data.issued?.value.toString()
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
            "Dr Henry Seven",
            data.performer?.get(0)?.display
        )
        assertEquals(
            "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809",
            data.performer?.get(0)?.reference
        )
        assertEquals(
            "Observation/bmd",
            data.result?.get(0)?.reference
        )
        assertEquals(
            DiagnosticReportStatus.FINAL,
            data.status
        )
        assertEquals(
            "Patient/pat2",
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
}
