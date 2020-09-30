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
import care.data4life.fhir.stu3.codesystem.AdministrativeGender
import care.data4life.fhir.stu3.codesystem.FamilyHistoryStatus
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * FamilyMemberHistoryTest.java
 *
 * Information about patient's relatives, relevant for patient.
 *
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class FamilyMemberHistoryTest {

    val parser = FhirStu3Parser()


    @Test
    fun testFamilyMemberHistory1() {
        val sourceJson = loadAsString("familymemberhistory-example.json")

        val data = parser.toFhir(FamilyMemberHistory::class, sourceJson)


        assertEquals(data.condition?.get(0)?.code?.coding?.get(0)?.code, "315619001")
        assertEquals(data.condition?.get(0)?.code?.coding?.get(0)?.display, "Myocardial Infarction")
        assertEquals(data.condition?.get(0)?.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.condition?.get(0)?.code?.text, "Heart Attack")
        assertEquals(
            data.condition?.get(0)?.note?.get(0)?.text,
            "Was fishing at the time. At least he went doing someting he loved."
        )
        assertEquals(data.condition?.get(0)?.onsetAge?.code, "a")
        assertEquals(data.condition?.get(0)?.onsetAge?.system, "http://unitsofmeasure.org")
        assertEquals(data.condition?.get(0)?.onsetAge?.unit, "yr")
        assertEquals(data.condition?.get(0)?.onsetAge?.value, "74")
        assertEquals(data.date, "2011-03-18")
        assertEquals(data.definition?.get(0)?.display, "Family Member History Questionnaire")
        assertEquals(data.gender, AdministrativeGender.MALE)
        assertEquals(data.id, "father")
        assertEquals(data.identifier?.get(0)?.value, "12345")
        assertEquals(data.notDone, "False")
        assertEquals(data.patient.display, "Peter Patient")
        assertEquals(data.patient.reference, "Patient/example")
        assertEquals(data.relationship.coding?.get(0)?.code, "FTH")
        assertEquals(data.relationship.coding?.get(0)?.display, "father")
        assertEquals(data.relationship.coding?.get(0)?.system, "http://hl7.org/fhir/v3/RoleCode")
        assertEquals(data.status, FamilyHistoryStatus.COMPLETED)
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Father died of a heart attack aged 74</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testFamilyMemberHistory2() {
        val sourceJson = loadAsString("familymemberhistory-example-mother.json")

        val data = parser.toFhir(FamilyMemberHistory::class, sourceJson)


        assertEquals(data.condition?.get(0)?.code?.coding?.get(0)?.code, "371041009")
        assertEquals(data.condition?.get(0)?.code?.coding?.get(0)?.display, "Embolic Stroke")
        assertEquals(data.condition?.get(0)?.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.condition?.get(0)?.code?.text, "Stroke")
        assertEquals(data.condition?.get(0)?.onsetAge?.code, "a")
        assertEquals(data.condition?.get(0)?.onsetAge?.system, "http://unitsofmeasure.org")
        assertEquals(data.condition?.get(0)?.onsetAge?.unit, "yr")
        assertEquals(data.condition?.get(0)?.onsetAge?.value, "56")
        assertEquals(data.id, "mother")
        assertEquals(data.patient.display, "Peter Patient")
        assertEquals(data.patient.reference, "Patient/100")
        assertEquals(data.relationship.coding?.get(0)?.code, "MTH")
        assertEquals(data.relationship.coding?.get(0)?.display, "mother")
        assertEquals(data.relationship.coding?.get(0)?.system, "http://hl7.org/fhir/v3/RoleCode")
        assertEquals(data.status, FamilyHistoryStatus.COMPLETED)
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Mother died of a stroke aged 56</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


