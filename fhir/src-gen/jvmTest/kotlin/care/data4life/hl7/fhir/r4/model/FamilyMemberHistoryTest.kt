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
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * FamilyMemberHistoryTest.java
 *
 * Information about patient's relatives, relevant for patient.
 *
 * Significant health conditions for a person related to the patient relevant in the context of care for the patient.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 4.0.1-9346c8cc45")
class FamilyMemberHistoryTest {

    val parser = FhirR4Parser()

    @Test
    fun testFamilyMemberHistory1() {
        val sourceJson = loadAsString("r4/familymemberhistory-example.json")

        val data = parser.toFhir(FamilyMemberHistory::class, sourceJson)

        assertEquals("315619001", data.condition?.get(0)?.code?.coding?.get(0)?.code)
        assertEquals("Myocardial Infarction", data.condition?.get(0)?.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.condition?.get(0)?.code?.coding?.get(0)?.system)
        assertEquals("Heart Attack", data.condition?.get(0)?.code?.text)
        assertEquals("True".toBoolean(), data.condition?.get(0)?.contributedToDeath?.value)
        assertEquals("Was fishing at the time. At least he went doing someting he loved.", data.condition?.get(0)?.note?.get(0)?.text)
        assertEquals("a", data.condition?.get(0)?.onsetAge?.code)
        assertEquals("http://unitsofmeasure.org", data.condition?.get(0)?.onsetAge?.system)
        assertEquals("yr", data.condition?.get(0)?.onsetAge?.unit)
        assertEquals("74".toDouble(), data.condition?.get(0)?.onsetAge?.value?.value)
        assertEquals("2011-03-18", data.date?.value.toString(),)
        assertEquals("father", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("http://example.org/family-member-history-questionnaire", data.instantiatesUri?.get(0))
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Peter Patient", data.patient?.display)
        assertEquals("Patient/example", data.patient?.reference)
        assertEquals("FTH", data.relationship?.coding?.get(0)?.code)
        assertEquals("father", data.relationship?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-RoleCode", data.relationship?.coding?.get(0)?.system)
        assertEquals("male", data.sex?.coding?.get(0)?.code)
        assertEquals("Male", data.sex?.coding?.get(0)?.display)
        assertEquals("http://hl7.org/fhir/administrative-gender", data.sex?.coding?.get(0)?.system)
        assertEquals(FamilyHistoryStatus.COMPLETED, data.status)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Father died of a heart attack aged 74</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testFamilyMemberHistory2() {
        val sourceJson = loadAsString("r4/familymemberhistory-example-mother.json")

        val data = parser.toFhir(FamilyMemberHistory::class, sourceJson)

        assertEquals("371041009", data.condition?.get(0)?.code?.coding?.get(0)?.code)
        assertEquals("Embolic Stroke", data.condition?.get(0)?.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.condition?.get(0)?.code?.coding?.get(0)?.system)
        assertEquals("Stroke", data.condition?.get(0)?.code?.text)
        assertEquals("a", data.condition?.get(0)?.onsetAge?.code)
        assertEquals("http://unitsofmeasure.org", data.condition?.get(0)?.onsetAge?.system)
        assertEquals("yr", data.condition?.get(0)?.onsetAge?.unit)
        assertEquals("56".toDouble(), data.condition?.get(0)?.onsetAge?.value?.value)
        assertEquals("mother", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Peter Patient", data.patient?.display)
        assertEquals("Patient/100", data.patient?.reference)
        assertEquals("MTH", data.relationship?.coding?.get(0)?.code)
        assertEquals("mother", data.relationship?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-RoleCode", data.relationship?.coding?.get(0)?.system)
        assertEquals(FamilyHistoryStatus.COMPLETED, data.status)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Mother died of a stroke aged 56</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
