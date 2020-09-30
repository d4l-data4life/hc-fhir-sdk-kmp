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
import care.data4life.fhir.stu3.codesystem.CareTeamStatus
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
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
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class CareTeamTest {

    val parser = FhirStu3Parser()


    @Test
    fun testCareTeam1() {
        val sourceJson = loadAsString("careteam-example.json")

        val data = parser.toFhir(CareTeam::class, sourceJson)


        assertEquals(data.category?.get(0)?.coding?.get(0)?.code, "encounter")
        assertEquals(
            data.category?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/care-team-category"
        )
        assertEquals(data.contained?.get(0)?.id, "pr1")
        assertEquals(data.context?.reference, "Encounter/example")
        assertEquals(data.id, "example")
        assertEquals(data.identifier?.get(0)?.value, "12345")
        assertEquals(data.managingOrganization?.get(0)?.reference, "Organization/f001")
        assertEquals(data.name, "Peter James Charlmers Care Plan for Inpatient Encounter")
        assertEquals(data.participant?.get(0)?.member?.display, "Peter James Chalmers")
        assertEquals(data.participant?.get(0)?.member?.reference, "Patient/example")
        assertEquals(data.participant?.get(0)?.role?.text, "responsiblePerson")
        assertEquals(data.participant?.get(1)?.member?.display, "Dorothy Dietition")
        assertEquals(data.participant?.get(1)?.member?.reference, "#pr1")
        assertEquals(data.participant?.get(1)?.onBehalfOf?.reference, "Organization/f001")
        assertEquals(data.participant?.get(1)?.period?.end, "2013-01-01")
        assertEquals(data.participant?.get(1)?.role?.text, "adviser")
        assertEquals(data.period?.end, "2013-01-01")
        assertEquals(data.status, CareTeamStatus.ACTIVE)
        assertEquals(data.subject?.display, "Peter James Chalmers")
        assertEquals(data.subject?.reference, "Patient/example")
        assertEquals(data.text?.div, "<div xmlns=\"http://www.w3.org/1999/xhtml\">Care Team</div>")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


