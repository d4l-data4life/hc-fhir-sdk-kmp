/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * GoalTest.java
 *
 * Describes the intended objective(s) for a patient, group or organization.
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class GoalTest {

    val parser = FhirR4Parser()

    @Test
    fun testGoal1() {
        val sourceJson = loadAsString("r4/goal-example.json")

        val data = parser.toFhir(Goal::class, sourceJson)

        assertEquals("obesity condition", data.addresses?.get(0)?.display)
        assertEquals("dietary", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/goal-category", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Target weight is 160 to 180 lbs.", data.description?.text)
        assertEquals("Peter James Chalmers", data.expressedBy?.display)
        assertEquals("Patient/example", data.expressedBy?.reference)
        assertEquals("example", data.id)
        assertEquals("123", data.identifier?.get(0)?.value)
        assertEquals(GoalLifecycleStatus.ON_HOLD, data.lifecycleStatus)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Body Weight Measured", data.outcomeReference?.get(0)?.display)
        assertEquals("Observation/example", data.outcomeReference?.get(0)?.reference)
        assertEquals("high-priority", data.priority?.coding?.get(0)?.code)
        assertEquals("High Priority", data.priority?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/goal-priority", data.priority?.coding?.get(0)?.system)
        assertEquals("high", data.priority?.text)
        assertEquals("2015-04-05", data.startDate?.value.toString())
        assertEquals("2016-02-14", data.statusDate?.value.toString())
        assertEquals("Patient wants to defer weight loss until after honeymoon.", data.statusReason)
        assertEquals("Peter James Chalmers", data.subject?.display)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("[lb_av]", data.target?.get(0)?.detailRange?.high?.code)
        assertEquals("http://unitsofmeasure.org", data.target?.get(0)?.detailRange?.high?.system)
        assertEquals("lbs", data.target?.get(0)?.detailRange?.high?.unit)
        assertEquals("180".toDouble(), data.target?.get(0)?.detailRange?.high?.value?.value)
        assertEquals("[lb_av]", data.target?.get(0)?.detailRange?.low?.code)
        assertEquals("http://unitsofmeasure.org", data.target?.get(0)?.detailRange?.low?.system)
        assertEquals("lbs", data.target?.get(0)?.detailRange?.low?.unit)
        assertEquals("160".toDouble(), data.target?.get(0)?.detailRange?.low?.value?.value)
        assertEquals("2016-04-05", data.target?.get(0)?.dueDate?.value.toString())
        assertEquals("3141-9", data.target?.get(0)?.measure?.coding?.get(0)?.code)
        assertEquals("Weight Measured", data.target?.get(0)?.measure?.coding?.get(0)?.display)
        assertEquals("http://loinc.org", data.target?.get(0)?.measure?.coding?.get(0)?.system)
        assertEquals(NarrativeStatus.ADDITIONAL, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testGoal2() {
        val sourceJson = loadAsString("r4/goal-example-stop-smoking.json")

        val data = parser.toFhir(Goal::class, sourceJson)

        assertEquals("achieved", data.achievementStatus?.coding?.get(0)?.code)
        assertEquals("Achieved", data.achievementStatus?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/goal-achievement", data.achievementStatus?.coding?.get(0)?.system)
        assertEquals("Achieved", data.achievementStatus?.text)
        assertEquals("Stop smoking", data.description?.text)
        assertEquals("stop-smoking", data.id)
        assertEquals("123", data.identifier?.get(0)?.value)
        assertEquals(GoalLifecycleStatus.COMPLETED, data.lifecycleStatus)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("8517006", data.outcomeCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Ex-smoker (finding)", data.outcomeCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.outcomeCode?.get(0)?.coding?.get(0)?.system)
        assertEquals("Former smoker", data.outcomeCode?.get(0)?.text)
        assertEquals("2015-04-05", data.startDate?.value.toString())
        assertEquals("Peter James Chalmers", data.subject?.display)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.ADDITIONAL, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
