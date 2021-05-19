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
import care.data4life.hl7.fhir.r4.codesystem.DetectedIssueSeverity
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.ObservationStatus
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DetectedIssueTest {

    val parser = FhirR4Parser()

    @Test
    fun testDetectedIssue01() {
        // Given
        val sourceJson = loadAsString("r4/detectedissue-example-allergy.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertEquals(
            "allergy",
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
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
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
    fun testDetectedIssue02() {
        // Given
        val sourceJson = loadAsString("r4/detectedissue-example-dup.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertEquals(
            "Device/software",
            data.author?.reference
        )
        assertEquals(
            "DUPTHPY",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Duplicate Therapy Alert",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Similar test was performed within the past 14 days",
            data.detail
        )
        assertEquals(
            "duplicate",
            data.id
        )
        assertEquals(
            "2013-05-08",
            data.identifiedDateTime?.value.toString()
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
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Chest CT - ordered May 8, 2013 by Dr. Adam Careful",
            data.implicated?.get(0)?.display
        )
        assertEquals(
            "ServiceRequest/di",
            data.implicated?.get(0)?.reference
        )
        assertEquals(
            "Image 1 from Series 3: CT Images on Patient MINT (MINT1234) taken at 1-Jan 2011 01:20 AM",
            data.implicated?.get(1)?.display
        )
        assertEquals(
            "ImagingStudy/example",
            data.implicated?.get(1)?.reference
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
            "Patient/dicom",
            data.patient?.reference
        )
        assertEquals(
            "http://www.tmhp.com/RadiologyClinicalDecisionSupport/2011/CHEST%20IMAGING%20GUIDELINES%202011.pdf",
            data.reference
        )
        assertEquals(
            ObservationStatus.FINAL,
            data.status
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
    fun testDetectedIssue03() {
        // Given
        val sourceJson = loadAsString("r4/detectedissue-example.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertEquals(
            "Device/software",
            data.author?.reference
        )
        assertEquals(
            "DRG",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Drug Interaction Alert",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "ddi",
            data.id
        )
        assertEquals(
            "2014-01-05",
            data.identifiedDateTime?.value.toString()
        )
        assertEquals(
            "500 mg Acetaminophen tablet 1/day, PRN since 2010",
            data.implicated?.get(0)?.display
        )
        assertEquals(
            "MedicationStatement/example001",
            data.implicated?.get(0)?.reference
        )
        assertEquals(
            "Warfarin 1 MG TAB prescribed Jan. 15, 2015",
            data.implicated?.get(1)?.display
        )
        assertEquals(
            "MedicationRequest/medrx0331",
            data.implicated?.get(1)?.reference
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
            "13",
            data.mitigation?.get(0)?.action?.coding?.get(0)?.code
        )
        assertEquals(
            "Stopped Concurrent Therapy",
            data.mitigation?.get(0)?.action?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.mitigation?.get(0)?.action?.coding?.get(0)?.system
        )
        assertEquals(
            "Asked patient to discontinue regular use of Tylenol and to consult with clinician if they need to resume to allow appropriate INR monitoring",
            data.mitigation?.get(0)?.action?.text
        )
        assertEquals(
            "Dr. Adam Careful",
            data.mitigation?.get(0)?.author?.display
        )
        assertEquals(
            "Practitioner/example",
            data.mitigation?.get(0)?.author?.reference
        )
        assertEquals(
            "2014-01-05",
            data.mitigation?.get(0)?.date?.value.toString()
        )
        assertEquals(
            DetectedIssueSeverity.HIGH,
            data.severity
        )
        assertEquals(
            ObservationStatus.FINAL,
            data.status
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
    fun testDetectedIssue04() {
        // Given
        val sourceJson = loadAsString("r4/detectedissue-example-lab.json")

        // When
        val data = parser.toFhir(DetectedIssue::class, sourceJson)

        // Then
        assertEquals(
            "lab",
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
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
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
}
