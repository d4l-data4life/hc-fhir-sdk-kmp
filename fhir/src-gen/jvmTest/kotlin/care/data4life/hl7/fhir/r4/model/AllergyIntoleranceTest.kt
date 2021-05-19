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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

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
class AllergyIntoleranceTest {

    val parser = FhirR4Parser()

    @Test
    fun testAllergyIntolerance01() {
        // Given
        val sourceJson = loadAsString("r4/allergyintolerance-example.json")

        // When
        val data = parser.toFhir(AllergyIntolerance::class, sourceJson)

        // Then
        assertEquals(
            "Patient/example",
            data.asserter?.reference
        )
        assertEquals(
            AllergyIntoleranceCategory.FOOD,
            data.category?.get(0)
        )
        assertEquals(
            "active",
            data.clinicalStatus?.coding?.get(0)?.code
        )
        assertEquals(
            "Active",
            data.clinicalStatus?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical",
            data.clinicalStatus?.coding?.get(0)?.system
        )
        assertEquals(
            "227493005",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Cashew nuts",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            AllergyIntoleranceCriticality.HIGH,
            data.criticality
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://acme.com/ids/patients/risks",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "49476534",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "2012-06",
            data.lastOccurrence?.value.toString()
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
            "The criticality is high becasue of the observed anaphylactic reaction when challenged with cashew extract.",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2004",
            data.onsetDateTime?.value.toString()
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "Challenge Protocol. Severe reaction to subcutaneous cashew extract. Epinephrine administered",
            data.reaction?.get(0)?.description
        )
        assertEquals(
            "34206005",
            data.reaction?.get(0)?.exposureRoute?.coding?.get(0)?.code
        )
        assertEquals(
            "Subcutaneous route",
            data.reaction?.get(0)?.exposureRoute?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.reaction?.get(0)?.exposureRoute?.coding?.get(0)?.system
        )
        assertEquals(
            "39579001",
            data.reaction?.get(0)?.manifestation?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Anaphylactic reaction",
            data.reaction?.get(0)?.manifestation?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.reaction?.get(0)?.manifestation?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2012-06-12",
            data.reaction?.get(0)?.onset?.value.toString()
        )
        assertEquals(
            AllergyIntoleranceSeverity.SEVERE,
            data.reaction?.get(0)?.severity
        )
        assertEquals(
            "1160593",
            data.reaction?.get(0)?.substance?.coding?.get(0)?.code
        )
        assertEquals(
            "cashew nut allergenic extract Injectable Product",
            data.reaction?.get(0)?.substance?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.nlm.nih.gov/research/umls/rxnorm",
            data.reaction?.get(0)?.substance?.coding?.get(0)?.system
        )
        assertEquals(
            "64305001",
            data.reaction?.get(1)?.manifestation?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Urticaria",
            data.reaction?.get(1)?.manifestation?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.reaction?.get(1)?.manifestation?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "The patient reports that the onset of urticaria was within 15 minutes of eating cashews.",
            data.reaction?.get(1)?.note?.get(0)?.text
        )
        assertEquals(
            "2004",
            data.reaction?.get(1)?.onset?.value.toString()
        )
        assertEquals(
            AllergyIntoleranceSeverity.MODERATE,
            data.reaction?.get(1)?.severity
        )
        assertEquals(
            "2014-10-09T14:58:00+11:00",
            data.recordedDate?.value.toString()
        )
        assertEquals(
            "Practitioner/example",
            data.recorder?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            AllergyIntoleranceType.ALLERGY,
            data.type
        )
        assertEquals(
            "confirmed",
            data.verificationStatus?.coding?.get(0)?.code
        )
        assertEquals(
            "Confirmed",
            data.verificationStatus?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/allergyintolerance-verification",
            data.verificationStatus?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
