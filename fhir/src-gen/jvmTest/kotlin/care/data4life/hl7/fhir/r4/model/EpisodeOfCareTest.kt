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
        assertEquals(
            "example account",
            data.account?.get(0)?.display
        )
        assertEquals(
            "Account/example",
            data.account?.get(0)?.reference
        )
        assertEquals(
            "Amanda Assigned",
            data.careManager?.display
        )
        assertEquals(
            "Practitioner/14",
            data.careManager?.reference
        )
        assertEquals(
            "Condition/stroke",
            data.diagnosis?.get(0)?.condition?.reference
        )
        assertEquals(
            "1".toLong(),
            data.diagnosis?.get(0)?.rank?.value
        )
        assertEquals(
            "CC",
            data.diagnosis?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "Chief complaint",
            data.diagnosis?.get(0)?.role?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            data.diagnosis?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://example.org/sampleepisodeofcare-identifier",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "123",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Organization/hl7",
            data.managingOrganization?.reference
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
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "2014-09-01",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "Referral from Example Aged Care Services",
            data.referralRequest?.get(0)?.display
        )
        assertEquals(
            EpisodeOfCareStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "2014-09-14",
            data.statusHistory?.get(0)?.period?.end?.value.toString()
        )
        assertEquals(
            "2014-09-01",
            data.statusHistory?.get(0)?.period?.start?.value.toString()
        )
        assertEquals(
            EpisodeOfCareStatus.PLANNED,
            data.statusHistory?.get(0)?.status
        )
        assertEquals(
            "2014-09-21",
            data.statusHistory?.get(1)?.period?.end?.value.toString()
        )
        assertEquals(
            "2014-09-15",
            data.statusHistory?.get(1)?.period?.start?.value.toString()
        )
        assertEquals(
            EpisodeOfCareStatus.ACTIVE,
            data.statusHistory?.get(1)?.status
        )
        assertEquals(
            "2014-09-24",
            data.statusHistory?.get(2)?.period?.end?.value.toString()
        )
        assertEquals(
            "2014-09-22",
            data.statusHistory?.get(2)?.period?.start?.value.toString()
        )
        assertEquals(
            EpisodeOfCareStatus.ONHOLD,
            data.statusHistory?.get(2)?.status
        )
        assertEquals(
            "2014-09-25",
            data.statusHistory?.get(3)?.period?.start?.value.toString()
        )
        assertEquals(
            EpisodeOfCareStatus.ACTIVE,
            data.statusHistory?.get(3)?.status
        )
        assertEquals(
            "example care team",
            data.team?.get(0)?.display
        )
        assertEquals(
            "CareTeam/example",
            data.team?.get(0)?.reference
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "hacc",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Home and Community Care",
            data.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/episodeofcare-type",
            data.type?.get(0)?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
