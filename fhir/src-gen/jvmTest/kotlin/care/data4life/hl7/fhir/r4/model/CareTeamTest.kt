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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.r4.codesystem.CareTeamStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CareTeamTest {

    val parser = FhirR4Parser()

    @Test
    fun testCareTeam01() {
        // Given
        val sourceJson = loadAsString("r4/careteam-example.json")

        // When
        val data = parser.toFhir(CareTeam::class, sourceJson)

        // Then
        assertEquals(
            "LA27976-2",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Encounter-focused care team",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "pr1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Organization/f001",
            data.managingOrganization?.get(0)?.reference
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Peter James Charlmers Care Plan for Inpatient Encounter",
            data.name
        )
        assertEquals(
            "Peter James Chalmers",
            data.participant?.get(0)?.member?.display
        )
        assertEquals(
            "Patient/example",
            data.participant?.get(0)?.member?.reference
        )
        assertEquals(
            "responsiblePerson",
            data.participant?.get(0)?.role?.get(0)?.text
        )
        assertEquals(
            "Dorothy Dietition",
            data.participant?.get(1)?.member?.display
        )
        assertEquals(
            "#pr1",
            data.participant?.get(1)?.member?.reference
        )
        assertEquals(
            "Organization/f001",
            data.participant?.get(1)?.onBehalfOf?.reference
        )
        assertEquals(
            "2013-01-01",
            data.participant?.get(1)?.period?.end?.value.toString()
        )
        assertEquals(
            "adviser",
            data.participant?.get(1)?.role?.get(0)?.text
        )
        assertEquals(
            "2013-01-01",
            data.period?.end?.value.toString()
        )
        assertEquals(
            CareTeamStatus.ACTIVE,
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
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Care Team</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
