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
import kotlin.test.assertEquals

/**
 * CareTeamTest.java
 *
 * Planned participants in the coordination and delivery of care for a patient or group
 *
 * The Care Team includes all the people and organizations who plan to participate in the coordination
 * and delivery of care for a patient.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CareTeamFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testCareTeam01() {
        // Given
        val sourceJson = loadAsString("stu3/careteam-example.json")

        // When
        val data = parser.toFhir(CareTeam::class, sourceJson)

        // Then
        assertCareTeam01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCareTeam01Step01(data: CareTeam) {

        assertEquals(
            expected = "encounter",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/care-team-category",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pr1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.managingOrganization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Charlmers Care Plan for Inpatient Encounter",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.participant?.get(0)?.member?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.participant?.get(0)?.member?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "responsiblePerson",
            actual = data.participant?.get(0)?.role?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dorothy Dietition",
            actual = data.participant?.get(1)?.member?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#pr1",
            actual = data.participant?.get(1)?.member?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.participant?.get(1)?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-01",
            actual = data.participant?.get(1)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "adviser",
            actual = data.participant?.get(1)?.role?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-01",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = CareTeamStatus.ACTIVE,
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
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Care Team</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
