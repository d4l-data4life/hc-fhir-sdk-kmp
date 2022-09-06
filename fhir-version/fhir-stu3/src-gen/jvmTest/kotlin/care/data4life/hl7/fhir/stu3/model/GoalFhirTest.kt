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
import care.data4life.hl7.fhir.stu3.codesystem.GoalStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * GoalTest.java
 *
 * Describes the intended objective(s) for a patient, group or organization
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight
 * loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a
 * process improvement objective, etc.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class GoalFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testGoal01() {
        // Given
        val sourceJson = loadAsString("stu3/goal-example.json")

        // When
        val data = parser.toFhir(Goal::class, sourceJson)

        // Then
        assertGoal01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGoal01Step01(data: Goal) {
        assertEquals(
            expected = "obesity condition",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dietary",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/goal-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Target weight is 160 to 180 lbs.",
            actual = data.description?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.expressedBy?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.expressedBy?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body Weight Measured",
            actual = data.outcomeReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/example",
            actual = data.outcomeReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "high-priority",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "High Priority",
            actual = data.priority?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/goal-priority",
            actual = data.priority?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "high",
            actual = data.priority?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-04-05",
            actual = data.startDate?.value.toString()
        )

        assertEquals(
            expected = GoalStatus.ON_HOLD,
            actual = data.status
        )

        assertEquals(
            expected = "2016-02-14",
            actual = data.statusDate?.value.toString()
        )

        assertEquals(
            expected = "Patient wants to defer weight loss until after honeymoon.",
            actual = data.statusReason
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "[lb_av]",
            actual = data.target?.detailRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.target?.detailRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lbs",
            actual = data.target?.detailRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "180".toDouble(),
            actual = data.target?.detailRange?.high?.value?.value
        )

        assertEquals(
            expected = "[lb_av]",
            actual = data.target?.detailRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.target?.detailRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lbs",
            actual = data.target?.detailRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "160".toDouble(),
            actual = data.target?.detailRange?.low?.value?.value
        )

        assertEquals(
            expected = "2016-04-05",
            actual = data.target?.dueDate?.value.toString()
        )

        assertEquals(
            expected = "3141-9",
            actual = data.target?.measure?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Weight Measured",
            actual = data.target?.measure?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.target?.measure?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testGoal02() {
        // Given
        val sourceJson = loadAsString("stu3/goal-example-stop-smoking.json")

        // When
        val data = parser.toFhir(Goal::class, sourceJson)

        // Then
        assertGoal02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGoal02Step01(data: Goal) {
        assertEquals(
            expected = "Stop smoking",
            actual = data.description?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stop-smoking",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8517006",
            actual = data.outcomeCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ex-smoker (finding)",
            actual = data.outcomeCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.outcomeCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Former smoker",
            actual = data.outcomeCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-04-05",
            actual = data.startDate?.value.toString()
        )

        assertEquals(
            expected = GoalStatus.ACHIEVED,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }
}
