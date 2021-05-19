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
        assertClinicalImpression01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClinicalImpression01Step01(data: ClinicalImpression) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.assessor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-12-06T22:33:00+11:00",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This 26 yo male patient is brought into ER by ambulance after being involved in a motor vehicle accident",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-12-06T22:33:00+11:00",
            actual = data.effectivePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-12-06T20:00:00+11:00",
            actual = data.effectivePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "850.0",
            actual = data.finding?.get(0)?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-9",
            actual = data.finding?.get(0)?.itemCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Initial Examination",
            actual = data.investigation?.get(0)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "deep laceration of the scalp (left temporo-occipital)",
            actual = data.investigation?.get(0)?.item?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "decreased level of consciousness",
            actual = data.investigation?.get(0)?.item?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "disoriented to time and place",
            actual = data.investigation?.get(0)?.item?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "restless",
            actual = data.investigation?.get(0)?.item?.get(3)?.display
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
            expected = "MVA",
            actual = data.problem?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provisional diagnoses of laceration of head and traumatic brain injury (TBI)",
            actual = data.summary
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
