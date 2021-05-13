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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

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
class GoalTest {

    val parser = FhirStu3Parser()

    @Test
    fun testGoal01() {
        // Given
        val sourceJson = loadAsString("stu3/goal-example.json")

        // When
        val data = parser.toFhir(Goal::class, sourceJson)

        // Then

        assertEquals(
            "obesity condition",
            data.addresses?.get(0)?.display
        )
        assertEquals(
            "dietary",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/goal-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Target weight is 160 to 180 lbs.",
            data.description?.text
        )
        assertEquals(
            "Peter James Chalmers",
            data.expressedBy?.display
        )
        assertEquals(
            "Patient/example",
            data.expressedBy?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Body Weight Measured",
            data.outcomeReference?.get(0)?.display
        )
        assertEquals(
            "Observation/example",
            data.outcomeReference?.get(0)?.reference
        )
        assertEquals(
            "high-priority",
            data.priority?.coding?.get(0)?.code
        )
        assertEquals(
            "High Priority",
            data.priority?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/goal-priority",
            data.priority?.coding?.get(0)?.system
        )
        assertEquals(
            "high",
            data.priority?.text
        )
        assertEquals(
            "2015-04-05",
            data.startDate?.value.toString()
        )
        assertEquals(
            GoalStatus.ON_HOLD,
            data.status
        )
        assertEquals(
            "2016-02-14",
            data.statusDate?.value.toString()
        )
        assertEquals(
            "Patient wants to defer weight loss until after honeymoon.",
            data.statusReason
        )
        assertEquals(
            "Peter James Chalmers",
            data.subject?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "[lb_av]",
            data.target?.detailRange?.high?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.target?.detailRange?.high?.system
        )
        assertEquals(
            "lbs",
            data.target?.detailRange?.high?.unit
        )
        assertEquals(
            "180".toDouble(),
            data.target?.detailRange?.high?.value?.value
        )
        assertEquals(
            "[lb_av]",
            data.target?.detailRange?.low?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.target?.detailRange?.low?.system
        )
        assertEquals(
            "lbs",
            data.target?.detailRange?.low?.unit
        )
        assertEquals(
            "160".toDouble(),
            data.target?.detailRange?.low?.value?.value
        )
        assertEquals(
            "2016-04-05",
            data.target?.dueDate?.value.toString()
        )
        assertEquals(
            "3141-9",
            data.target?.measure?.coding?.get(0)?.code
        )
        assertEquals(
            "Weight Measured",
            data.target?.measure?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.target?.measure?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testGoal02() {
        // Given
        val sourceJson = loadAsString("stu3/goal-example-stop-smoking.json")

        // When
        val data = parser.toFhir(Goal::class, sourceJson)

        // Then

        assertEquals(
            "Stop smoking",
            data.description?.text
        )
        assertEquals(
            "stop-smoking",
            data.id
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "8517006",
            data.outcomeCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Ex-smoker (finding)",
            data.outcomeCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.outcomeCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Former smoker",
            data.outcomeCode?.get(0)?.text
        )
        assertEquals(
            "2015-04-05",
            data.startDate?.value.toString()
        )
        assertEquals(
            GoalStatus.ACHIEVED,
            data.status
        )
        assertEquals(
            "Peter James Chalmers",
            data.subject?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
