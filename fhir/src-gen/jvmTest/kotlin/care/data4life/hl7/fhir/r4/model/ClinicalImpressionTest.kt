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
import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ClinicalImpressionTest.java
 *
 * A clinical assessment performed when planning treatments and management strategies for a patient
 *
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and
 * before planning the treatments or management strategies that are best to manage a patient's
 * condition. Assessments are often 1:1 with a clinical consultation / encounter, but this varies
 * greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than
 * "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ClinicalImpressionTest {

    val parser = FhirR4Parser()

    @Test
    fun testClinicalImpression01() {
        // Given
        val sourceJson = loadAsString("r4/clinicalimpression-example.json")

        // When
        val data = parser.toFhir(ClinicalImpression::class, sourceJson)

        // Then
        assertEquals(
            "Practitioner/example",
            data.assessor?.reference
        )
        assertEquals(
            "2014-12-06T22:33:00+11:00",
            data.date?.value.toString()
        )
        assertEquals(
            "This 26 yo male patient is brought into ER by ambulance after being involved in a motor vehicle accident",
            data.description
        )
        assertEquals(
            "2014-12-06T22:33:00+11:00",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2014-12-06T20:00:00+11:00",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "850.0",
            data.finding?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/sid/icd-9",
            data.finding?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Initial Examination",
            data.investigation?.get(0)?.code?.text
        )
        assertEquals(
            "deep laceration of the scalp (left temporo-occipital)",
            data.investigation?.get(0)?.item?.get(0)?.display
        )
        assertEquals(
            "decreased level of consciousness",
            data.investigation?.get(0)?.item?.get(1)?.display
        )
        assertEquals(
            "disoriented to time and place",
            data.investigation?.get(0)?.item?.get(2)?.display
        )
        assertEquals(
            "restless",
            data.investigation?.get(0)?.item?.get(3)?.display
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
            "MVA",
            data.problem?.get(0)?.display
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "provisional diagnoses of laceration of head and traumatic brain injury (TBI)",
            data.summary
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
