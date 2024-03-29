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
import care.data4life.hl7.fhir.stu3.codesystem.AdministrativeGender
import care.data4life.hl7.fhir.stu3.codesystem.FamilyHistoryStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * FamilyMemberHistoryTest.java
 *
 * Information about patient's relatives, relevant for patient
 *
 * Significant health events and conditions for a person related to the patient relevant in the context
 * of care for the patient.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class FamilyMemberHistoryFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testFamilyMemberHistory01() {
        // Given
        val sourceJson = loadAsString("stu3/familymemberhistory-example.json")

        // When
        val data = parser.toFhir(FamilyMemberHistory::class, sourceJson)

        // Then
        assertFamilyMemberHistory01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertFamilyMemberHistory01Step01(data: FamilyMemberHistory) {
        assertEquals(
            expected = "315619001",
            actual = data.condition?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Myocardial Infarction",
            actual = data.condition?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.condition?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Heart Attack",
            actual = data.condition?.get(0)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Was fishing at the time. At least he went doing someting he loved.",
            actual = data.condition?.get(0)?.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a",
            actual = data.condition?.get(0)?.onsetAge?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.condition?.get(0)?.onsetAge?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "yr",
            actual = data.condition?.get(0)?.onsetAge?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "74".toDouble(),
            actual = data.condition?.get(0)?.onsetAge?.value?.value
        )

        assertEquals(
            expected = "2011-03-18",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Family Member History Questionnaire",
            actual = data.definition?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "father",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.notDone?.value
        )

        assertEquals(
            expected = "Peter Patient",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FTH",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "father",
            actual = data.relationship?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/RoleCode",
            actual = data.relationship?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FamilyHistoryStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Father died of a heart attack aged 74</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testFamilyMemberHistory02() {
        // Given
        val sourceJson = loadAsString("stu3/familymemberhistory-example-mother.json")

        // When
        val data = parser.toFhir(FamilyMemberHistory::class, sourceJson)

        // Then
        assertFamilyMemberHistory02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertFamilyMemberHistory02Step01(data: FamilyMemberHistory) {
        assertEquals(
            expected = "371041009",
            actual = data.condition?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Embolic Stroke",
            actual = data.condition?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.condition?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Stroke",
            actual = data.condition?.get(0)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a",
            actual = data.condition?.get(0)?.onsetAge?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.condition?.get(0)?.onsetAge?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "yr",
            actual = data.condition?.get(0)?.onsetAge?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "56".toDouble(),
            actual = data.condition?.get(0)?.onsetAge?.value?.value
        )

        assertEquals(
            expected = "mother",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Patient",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/100",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MTH",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mother",
            actual = data.relationship?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/RoleCode",
            actual = data.relationship?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FamilyHistoryStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Mother died of a stroke aged 56</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
