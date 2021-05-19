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
import care.data4life.hl7.fhir.stu3.codesystem.DetectedIssueSeverity
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.ObservationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DetectedIssueTest.java
 *
 * Clinical issue with action
 *
 * Indicates an actual or potential clinical issue with or between one or more active or proposed
 * clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency,
 * Procedure-condition conflict, etc.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DetectedIssueFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDetectedIssue01() {
        // Given
        val sourceJson = loadAsString("stu3/detectedissue-example-allergy.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertDetectedIssue01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDetectedIssue01Step01(data: DetectedIssue) {

        assertEquals(
            expected = "allergy",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDetectedIssue02() {
        // Given
        val sourceJson = loadAsString("stu3/detectedissue-example-dup.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertDetectedIssue02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDetectedIssue02Step01(data: DetectedIssue) {

        assertEquals(
            expected = "Device/software",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DUPTHPY",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Duplicate Therapy Alert",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-08",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Similar test was performed within the past 14 days",
            actual = data.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "duplicate",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.use
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chest CT - ordered May 8, 2013 by Dr. Adam Careful",
            actual = data.implicated?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ProcedureRequest/di",
            actual = data.implicated?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Image 1 from Series 3: CT Images on Patient MINT (MINT1234) taken at 1-Jan 2011 01:20 AM",
            actual = data.implicated?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ImagingStudy/example",
            actual = data.implicated?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/dicom",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.tmhp.com/RadiologyClinicalDecisionSupport/2011/CHEST%20IMAGING%20GUIDELINES%202011.pdf",
            actual = data.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDetectedIssue03() {
        // Given
        val sourceJson = loadAsString("stu3/detectedissue-example.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertDetectedIssue03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDetectedIssue03Step01(data: DetectedIssue) {

        assertEquals(
            expected = "Device/software",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DRG",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Drug Interaction Alert",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-01-05",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "ddi",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500 mg Acetaminophen tablet 1/day, PRN since 2010",
            actual = data.implicated?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicationStatement/example001",
            actual = data.implicated?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Warfarin 1 MG TAB prescribed Jan. 15, 2015",
            actual = data.implicated?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicationRequest/medrx0331",
            actual = data.implicated?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "13",
            actual = data.mitigation?.get(0)?.action?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Stopped Concurrent Therapy",
            actual = data.mitigation?.get(0)?.action?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.mitigation?.get(0)?.action?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Asked patient to discontinue regular use of Tylenol and to consult with clinician if they need to resume to allow appropriate INR monitoring",
            actual = data.mitigation?.get(0)?.action?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr. Adam Careful",
            actual = data.mitigation?.get(0)?.author?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.mitigation?.get(0)?.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-01-05",
            actual = data.mitigation?.get(0)?.date?.value.toString()
        )

        assertEquals(
            expected = DetectedIssueSeverity.HIGH,
            actual = data.severity
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testDetectedIssue04() {
        // Given
        val sourceJson = loadAsString("stu3/detectedissue-example-lab.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertDetectedIssue04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDetectedIssue04Step01(data: DetectedIssue) {

        assertEquals(
            expected = "lab",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ObservationStatus.FINAL,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
