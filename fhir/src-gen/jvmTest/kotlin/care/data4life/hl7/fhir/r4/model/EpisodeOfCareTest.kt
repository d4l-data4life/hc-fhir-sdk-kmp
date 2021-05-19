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
import care.data4life.hl7.fhir.r4.codesystem.EpisodeOfCareStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * EpisodeOfCareTest.java
 *
 * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility
 *
 * An association between a patient and an organization / healthcare provider(s) during which time
 * encounters may occur. The managing organization assumes a level of responsibility for the patient
 * during this time.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EpisodeOfCareTest {

    val parser = FhirR4Parser()

    @Test
    fun testEpisodeOfCare01() {
        // Given
        val sourceJson = loadAsString("r4/episodeofcare-example.json")

        // When
        val data = parser.toFhir(EpisodeOfCare::class, sourceJson)

        // Then
        assertEpisodeOfCare01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEpisodeOfCare01Step01(data: EpisodeOfCare) {

        assertEquals(
            expected = "example account",
            actual = data.account?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Account/example",
            actual = data.account?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Amanda Assigned",
            actual = data.careManager?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/14",
            actual = data.careManager?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Condition/stroke",
            actual = data.diagnosis?.get(0)?.condition?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.rank?.value
        )

        assertEquals(
            expected = "CC",
            actual = data.diagnosis?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Chief complaint",
            actual = data.diagnosis?.get(0)?.role?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            actual = data.diagnosis?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/sampleepisodeofcare-identifier",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.managingOrganization?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-09-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "Referral from Example Aged Care Services",
            actual = data.referralRequest?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EpisodeOfCareStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "2014-09-14",
            actual = data.statusHistory?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-09-01",
            actual = data.statusHistory?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EpisodeOfCareStatus.PLANNED,
            actual = data.statusHistory?.get(0)?.status
        )

        assertEquals(
            expected = "2014-09-21",
            actual = data.statusHistory?.get(1)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-09-15",
            actual = data.statusHistory?.get(1)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EpisodeOfCareStatus.ACTIVE,
            actual = data.statusHistory?.get(1)?.status
        )

        assertEquals(
            expected = "2014-09-24",
            actual = data.statusHistory?.get(2)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-09-22",
            actual = data.statusHistory?.get(2)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EpisodeOfCareStatus.ONHOLD,
            actual = data.statusHistory?.get(2)?.status
        )

        assertEquals(
            expected = "2014-09-25",
            actual = data.statusHistory?.get(3)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EpisodeOfCareStatus.ACTIVE,
            actual = data.statusHistory?.get(3)?.status
        )

        assertEquals(
            expected = "example care team",
            actual = data.team?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CareTeam/example",
            actual = data.team?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "hacc",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Home and Community Care",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/episodeofcare-type",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }
}
