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
import care.data4life.hl7.fhir.r4.codesystem.AllergyIntoleranceCategory
import care.data4life.hl7.fhir.r4.codesystem.AllergyIntoleranceCriticality
import care.data4life.hl7.fhir.r4.codesystem.AllergyIntoleranceSeverity
import care.data4life.hl7.fhir.r4.codesystem.AllergyIntoleranceType
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * AllergyIntoleranceTest.java
 *
 * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
 *
 * Risk of harmful or undesirable, physiological response which is unique to an individual and
 * associated with exposure to a substance.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AllergyIntoleranceFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testAllergyIntolerance01() {
        // Given
        val sourceJson = loadAsString("r4/allergyintolerance-example.json")

        // When
        val data = parser.toFhir(AllergyIntolerance::class, sourceJson)

        // Then
        assertAllergyIntolerance01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAllergyIntolerance01Step01(data: AllergyIntolerance) {
        assertEquals(
            expected = "Patient/example",
            actual = data.asserter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AllergyIntoleranceCategory.FOOD,
            actual = data.category?.get(0)
        )

        assertEquals(
            expected = "active",
            actual = data.clinicalStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Active",
            actual = data.clinicalStatus?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical",
            actual = data.clinicalStatus?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "227493005",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cashew nuts",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AllergyIntoleranceCriticality.HIGH,
            actual = data.criticality
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.com/ids/patients/risks",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "49476534",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06",
            actual = data.lastOccurrence?.value.toString()
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
            expected = "The criticality is high becasue of the observed anaphylactic reaction when challenged with cashew extract.",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2004",
            actual = data.onsetDateTime?.value.toString()
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Challenge Protocol. Severe reaction to subcutaneous cashew extract. Epinephrine administered",
            actual = data.reaction?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "34206005",
            actual = data.reaction?.get(0)?.exposureRoute?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Subcutaneous route",
            actual = data.reaction?.get(0)?.exposureRoute?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reaction?.get(0)?.exposureRoute?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "39579001",
            actual = data.reaction?.get(0)?.manifestation?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Anaphylactic reaction",
            actual = data.reaction?.get(0)?.manifestation?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reaction?.get(0)?.manifestation?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-12",
            actual = data.reaction?.get(0)?.onset?.value.toString()
        )

        assertEquals(
            expected = AllergyIntoleranceSeverity.SEVERE,
            actual = data.reaction?.get(0)?.severity
        )

        assertEquals(
            expected = "1160593",
            actual = data.reaction?.get(0)?.substance?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cashew nut allergenic extract Injectable Product",
            actual = data.reaction?.get(0)?.substance?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.nlm.nih.gov/research/umls/rxnorm",
            actual = data.reaction?.get(0)?.substance?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "64305001",
            actual = data.reaction?.get(1)?.manifestation?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Urticaria",
            actual = data.reaction?.get(1)?.manifestation?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reaction?.get(1)?.manifestation?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The patient reports that the onset of urticaria was within 15 minutes of eating cashews.",
            actual = data.reaction?.get(1)?.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2004",
            actual = data.reaction?.get(1)?.onset?.value.toString()
        )

        assertEquals(
            expected = AllergyIntoleranceSeverity.MODERATE,
            actual = data.reaction?.get(1)?.severity
        )

        assertEquals(
            expected = "2014-10-09T14:58:00+11:00",
            actual = data.recordedDate?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.recorder?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = AllergyIntoleranceType.ALLERGY,
            actual = data.type
        )

        assertEquals(
            expected = "confirmed",
            actual = data.verificationStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Confirmed",
            actual = data.verificationStatus?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/allergyintolerance-verification",
            actual = data.verificationStatus?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
