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
import care.data4life.hl7.fhir.stu3.codesystem.CareTeamStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * CareTeamTest.java
 *
 * Planned participants in the coordination and delivery of care for a patient or group.
 *
 * The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care for a patient.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class CareTeamTest {

    val parser = FhirStu3Parser()

    @Test
    fun testCareTeam1() {
        // Given
        val sourceJson = loadAsString("stu3/careteam-example.json")

        // When
        val data = parser.toFhir(CareTeam::class, sourceJson)

        // Then

        assertEquals("encounter", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/care-team-category",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("pr1", data.contained?.get(0)?.id)
        assertEquals("Encounter/example", data.context?.reference)
        assertEquals("example", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("Organization/f001", data.managingOrganization?.get(0)?.reference)
        assertEquals("Peter James Charlmers Care Plan for Inpatient Encounter", data.name)
        assertEquals("Peter James Chalmers", data.participant?.get(0)?.member?.display)
        assertEquals("Patient/example", data.participant?.get(0)?.member?.reference)
        assertEquals("responsiblePerson", data.participant?.get(0)?.role?.text)
        assertEquals("Dorothy Dietition", data.participant?.get(1)?.member?.display)
        assertEquals("#pr1", data.participant?.get(1)?.member?.reference)
        assertEquals("Organization/f001", data.participant?.get(1)?.onBehalfOf?.reference)
        assertEquals("2013-01-01", data.participant?.get(1)?.period?.end?.value.toString())
        assertEquals("adviser", data.participant?.get(1)?.role?.text)
        assertEquals("2013-01-01", data.period?.end?.value.toString())
        assertEquals(CareTeamStatus.ACTIVE, data.status)
        assertEquals("Peter James Chalmers", data.subject?.display)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Care Team</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
