/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model


import care.data4life.fhir.stu3.FhirStu3Parser
import care.data4life.fhir.stu3.codesystem.GoalStatus
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * GoalTest.java
 *
 * Describes the intended objective(s) for a patient, group or organization.
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class GoalTest {

    val parser = FhirStu3Parser()


    @Test
    fun testGoal1() {
        val sourceJson = loadAsString("goal-example.json")

        val data = parser.toFhir(Goal::class, sourceJson)


        assertEquals(data.addresses?.get(0)?.display, "obesity condition")
        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "dietary")
        assertEquals(
            data.category?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/goal-category"
        )
        assertEquals(data.description.text, "Target weight is 160 to 180 lbs.")
        assertEquals(data.expressedBy?.display, "Peter James Chalmers")
        assertEquals(data.expressedBy?.reference, "Patient/example")
        assertEquals(data.id, "example")
        assertEquals(data.identifier?.get(0)?.value, "123")
        assertEquals(data.outcomeReference?.get(0)?.display, "Body Weight Measured")
        assertEquals(data.outcomeReference?.get(0)?.reference, "Observation/example")
        assertEquals(data.priority?.coding?.get(0)?.code, "high-priority")
        assertEquals(data.priority?.coding?.get(0)?.display, "High Priority")
        assertEquals(data.priority?.coding?.get(0)?.system, "http://hl7.org/fhir/goal-priority")
        assertEquals(data.priority?.text, "high")
        assertEquals(data.startDate, "2015-04-05")
        assertEquals(data.status, GoalStatus.ON_HOLD)
        assertEquals(data.statusDate, "2016-02-14")
        assertEquals(data.statusReason, "Patient wants to defer weight loss until after honeymoon.")
        assertEquals(data.subject?.display, "Peter James Chalmers")
        assertEquals(data.subject?.reference, "Patient/example")
        assertEquals(data.target?.detailRange?.high?.code, "[lb_av]")
        assertEquals(data.target?.detailRange?.high?.system, "http://unitsofmeasure.org")
        assertEquals(data.target?.detailRange?.high?.unit, "lbs")
        assertEquals(data.target?.detailRange?.high?.value, "180")
        assertEquals(data.target?.detailRange?.low?.code, "[lb_av]")
        assertEquals(data.target?.detailRange?.low?.system, "http://unitsofmeasure.org")
        assertEquals(data.target?.detailRange?.low?.unit, "lbs")
        assertEquals(data.target?.detailRange?.low?.value, "160")
        assertEquals(data.target?.dueDate, "2016-04-05")
        assertEquals(data.target?.measure?.coding?.get(0)?.code, "3141-9")
        assertEquals(data.target?.measure?.coding?.get(0)?.display, "Weight Measured")
        assertEquals(data.target?.measure?.coding?.get(0)?.system, "http://loinc.org")
        assertEquals(data.text?.status, NarrativeStatus.ADDITIONAL)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testGoal2() {
        val sourceJson = loadAsString("goal-example-stop-smoking.json")

        val data = parser.toFhir(Goal::class, sourceJson)


        assertEquals(data.description.text, "Stop smoking")
        assertEquals(data.id, "stop-smoking")
        assertEquals(data.identifier?.get(0)?.value, "123")
        assertEquals(data.outcomeCode?.get(0)?.coding?.get(0)?.code, "8517006")
        assertEquals(data.outcomeCode?.get(0)?.coding?.get(0)?.display, "Ex-smoker (finding)")
        assertEquals(data.outcomeCode?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.outcomeCode?.get(0)?.text, "Former smoker")
        assertEquals(data.startDate, "2015-04-05")
        assertEquals(data.status, GoalStatus.ACHIEVED)
        assertEquals(data.subject?.display, "Peter James Chalmers")
        assertEquals(data.subject?.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.ADDITIONAL)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


