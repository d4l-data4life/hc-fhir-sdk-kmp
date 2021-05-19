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
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.Use
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ClaimTest.java
 *
 * Claim, Pre-determination or Pre-authorization
 *
 * A provider issued list of professional services and products which have been provided, or are to be
 * provided, to a patient which is sent to an insurer for reimbursement.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ClaimTest {

    val parser = FhirR4Parser()

    @Test
    fun testClaim01() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-institutional-rich.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim01Step01(data: Claim) {

        assertEquals(
            expected = "2014-07-09",
            actual = data.accident?.date?.value.toString()
        )

        assertEquals(
            expected = "Grouse Mountain Ski Hill",
            actual = data.accident?.locationAddress?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SPT",
            actual = data.accident?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sporting Accident",
            actual = data.accident?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActIncidentCode",
            actual = data.accident?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.billablePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-08-15",
            actual = data.billablePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "physician",
            actual = data.careTeam?.get(0)?.qualification?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/provider-qualification",
            actual = data.careTeam?.get(0)?.qualification?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.careTeam?.get(0)?.responsible?.value
        )

        assertEquals(
            expected = "primary",
            actual = data.careTeam?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/claim-careteamrole",
            actual = data.careTeam?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "654456",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "400",
            actual = data.diagnosis?.get(0)?.packageCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Head trauma - concussion",
            actual = data.diagnosis?.get(0)?.packageCode?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-diagnosisrelatedgroup",
            actual = data.diagnosis?.get(0)?.packageCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "admitting",
            actual = data.diagnosis?.get(0)?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-diagnosistype",
            actual = data.diagnosis?.get(0)?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://jurisdiction.org/facilities/HOSP1234/users",
            actual = data.enterer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UC1234",
            actual = data.enterer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://jurisdiction.org/facilities",
            actual = data.facility?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HOSP1234",
            actual = data.facility?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "960151",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyhospital.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "96123451",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BA987123",
            actual = data.insurance?.get(0)?.businessArrangement
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "PA2014G56473",
            actual = data.insurance?.get(0)?.preAuthRef?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125.0".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "exam",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-serviceproduct",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125.0".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://npid.org/providerid",
            actual = data.provider?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NJ12345",
            actual = data.provider?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "employmentimpacted",
            actual = data.supportingInfo?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            actual = data.supportingInfo?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.supportingInfo?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.supportingInfo?.get(0)?.timingPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.supportingInfo?.get(0)?.timingPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "hospitalized",
            actual = data.supportingInfo?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            actual = data.supportingInfo?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.supportingInfo?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.supportingInfo?.get(1)?.timingPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-08-15",
            actual = data.supportingInfo?.get(1)?.timingPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125.0".toDouble(),
            actual = data.total?.value?.value
        )

        assertEquals(
            expected = "institutional",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim02() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-professional.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim02Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "654456",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "860150",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happypdocs.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8612345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "75.0".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "exam",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-serviceproduct",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "75.0".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "professional",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim03() {
        // Given
        val sourceJson = loadAsString("r4/claim-example.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim03Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "123456",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "100150",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.insurance?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.insurance?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "1200",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Oral Health Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim04() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-vision.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim04Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "654321",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "660150",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happysight.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6612345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "exam",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Vision Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "vision",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim05() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-vision-glasses-3tier.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim05Step01(data)
        assertClaim05Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim05Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "device-frame",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "device-lens",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "654321",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "660152",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happysight.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6612347",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ClaimResponse/R3500",
            actual = data.insurance?.get(0)?.claimResponse?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "PR7652387237",
            actual = data.insurance?.get(0)?.preAuthRef?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(1)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(1)?.focal?.value
        )

        assertEquals(
            expected = "AB543GTD7567",
            actual = data.insurance?.get(1)?.preAuthRef?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.insurance?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "F6",
            actual = data.item?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.item?.get(0)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/benefit-subcategory",
            actual = data.item?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "F6",
            actual = data.item?.get(0)?.detail?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.item?.get(0)?.detail?.get(0)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/benefit-subcategory",
            actual = data.item?.get(0)?.detail?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.factor?.value
        )

        assertEquals(
            expected = "rooh",
            actual = data.item?.get(0)?.detail?.get(0)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/modifiers",
            actual = data.item?.get(0)?.detail?.get(0)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "frame",
            actual = data.item?.get(0)?.detail?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.detail?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0010",
            actual = data.item?.get(0)?.detail?.get(0)?.revenue?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Clinic",
            actual = data.item?.get(0)?.detail?.get(0)?.revenue?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-revenue-center",
            actual = data.item?.get(0)?.detail?.get(0)?.revenue?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "#device-frame",
            actual = data.item?.get(0)?.detail?.get(0)?.udi?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "F6",
            actual = data.item?.get(0)?.detail?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.item?.get(0)?.detail?.get(1)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/benefit-subcategory",
            actual = data.item?.get(0)?.detail?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "lens",
            actual = data.item?.get(0)?.detail?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.detail?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "none",
            actual = data.item?.get(0)?.detail?.get(1)?.programCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-programcode",
            actual = data.item?.get(0)?.detail?.get(1)?.programCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.quantity?.value?.value
        )

        assertEquals(
            expected = "0010",
            actual = data.item?.get(0)?.detail?.get(1)?.revenue?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Clinic",
            actual = data.item?.get(0)?.detail?.get(1)?.revenue?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-revenue-center",
            actual = data.item?.get(0)?.detail?.get(1)?.revenue?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "F6",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/benefit-subcategory",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.factor?.value
        )

        assertEquals(
            expected = "rooh",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/modifiers",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "66.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "lens",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "none",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.programCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-programcode",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.programCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "0010",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.revenue?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Clinic",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.revenue?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-revenue-center",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.revenue?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "#device-lens",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.udi?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "F6",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/benefit-subcategory",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.factor?.value
        )

        assertEquals(
            expected = "rooh",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/modifiers",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "33.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "hardening",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.quantity?.value?.value
        )

        assertEquals(
            expected = "0010",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.revenue?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Clinic",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.revenue?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-revenue-center",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.revenue?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "F6",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/benefit-subcategory",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.factor?.value
        )

        assertEquals(
            expected = "rooh",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/modifiers",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "11.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.net?.value?.value
        )
    }

    private fun assertClaim05Step02(data: Claim) {

        assertEquals(
            expected = "UV coating",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.quantity?.value?.value
        )

        assertEquals(
            expected = "0010",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.revenue?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Clinic",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.revenue?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-revenue-center",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.revenue?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "55.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "F6",
            actual = data.item?.get(0)?.detail?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Coverage",
            actual = data.item?.get(0)?.detail?.get(2)?.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/benefit-subcategory",
            actual = data.item?.get(0)?.detail?.get(2)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.07".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.factor?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(2)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "15.4".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.net?.value?.value
        )

        assertEquals(
            expected = "fst",
            actual = data.item?.get(0)?.detail?.get(2)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.detail?.get(2)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0010",
            actual = data.item?.get(0)?.detail?.get(2)?.revenue?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Clinic",
            actual = data.item?.get(0)?.detail?.get(2)?.revenue?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-revenue-center",
            actual = data.item?.get(0)?.detail?.get(2)?.revenue?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(0)?.detail?.get(2)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(2)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "220.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "rooh",
            actual = data.item?.get(0)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/modifiers",
            actual = data.item?.get(0)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "235.4".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "glasses",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/ex-visionservice",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "none",
            actual = data.item?.get(0)?.programCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-programcode",
            actual = data.item?.get(0)?.programCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0010",
            actual = data.item?.get(0)?.revenue?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vision Clinic",
            actual = data.item?.get(0)?.revenue?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-revenue-center",
            actual = data.item?.get(0)?.revenue?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "235.4".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.optdocs.com/prescription/12345",
            actual = data.prescription?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Vision Claim for Glasses</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "vision",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim06() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-institutional.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim06Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "654456",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "http://jurisdiction.org/facilities/HOSP1234/users",
            actual = data.enterer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UC1234",
            actual = data.enterer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://jurisdiction.org/facilities",
            actual = data.facility?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HOSP1234",
            actual = data.facility?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "960150",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyhospital.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9612345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.item?.get(0)?.encounter?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125.0".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "exam",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-serviceproduct",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125.0".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.procedure?.get(0)?.date?.value.toString()
        )

        assertEquals(
            expected = "SDI9901",
            actual = data.procedure?.get(0)?.procedureCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Subcutaneous diagnostic implant",
            actual = data.procedure?.get(0)?.procedureCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.procedure?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "primary",
            actual = data.procedure?.get(0)?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/example",
            actual = data.procedure?.get(0)?.udi?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "emergency",
            actual = data.subType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-claimsubtype",
            actual = data.subType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125.0".toDouble(),
            actual = data.total?.value?.value
        )

        assertEquals(
            expected = "institutional",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim07() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-oral-contained.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim07Step01(data: Claim) {

        assertEquals(
            expected = "#provider-1",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "org-insurer",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "org-org",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider-1",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-1",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "coverage-1",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "123456",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "100152",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12347",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#coverage-1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "#org-insurer",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "1200",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#patient-1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#org-org",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Oral Health Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim08() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-pharmacy-medication.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim08Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "654456",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "760151",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happypharma.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7612345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "45.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "drugcost",
            actual = data.item?.get(0)?.detail?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-pharmaservice",
            actual = data.item?.get(0)?.detail?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "markup",
            actual = data.item?.get(0)?.detail?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-pharmaservice",
            actual = data.item?.get(0)?.detail?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(2)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "36.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.net?.value?.value
        )

        assertEquals(
            expected = "dispensefee",
            actual = data.item?.get(0)?.detail?.get(2)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ex-pharmaservice",
            actual = data.item?.get(0)?.detail?.get(2)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(0)?.detail?.get(2)?.sequence?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.informationSequence?.get(0)?.value
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.informationSequence?.get(1)?.value
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(0)?.informationSequence?.get(2)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "90.0".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "562721",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Alprazolam 0.25mg (Xanax)",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.nlm.nih.gov/research/umls/rxnorm",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.item?.get(0)?.quantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.item?.get(0)?.quantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.item?.get(0)?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "90".toDouble(),
            actual = data.item?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://pharmacy.org/MedicationRequest/AB1202B",
            actual = data.originalPrescription?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://pharmacy.org/MedicationRequest/AB1234G",
            actual = data.prescription?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stat",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "pharmacyrefill",
            actual = data.supportingInfo?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "new",
            actual = data.supportingInfo?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/pharmacy-refill",
            actual = data.supportingInfo?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.supportingInfo?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "pharmacyinformation",
            actual = data.supportingInfo?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "refillsremaining",
            actual = data.supportingInfo?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/pharmacy-information",
            actual = data.supportingInfo?.get(1)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.supportingInfo?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.supportingInfo?.get(1)?.valueQuantity?.value?.value
        )

        assertEquals(
            expected = "pharmacyinformation",
            actual = data.supportingInfo?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "dayssupply",
            actual = data.supportingInfo?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/pharmacy-information",
            actual = data.supportingInfo?.get(2)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.supportingInfo?.get(2)?.sequence?.value
        )

        assertEquals(
            expected = "90".toDouble(),
            actual = data.supportingInfo?.get(2)?.valueQuantity?.value?.value
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Pharmacy Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "90.0".toDouble(),
            actual = data.total?.value?.value
        )

        assertEquals(
            expected = "pharmacy",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaim09() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-oral-orthoplan.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim09Step01(data)
        assertClaim09Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim09Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2015-03-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "123457",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-10",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "provider",
            actual = data.fundsReserve?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100153",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12355",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1000.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "ORTHOEXAM",
            actual = data.item?.get(0)?.detail?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(0)?.detail?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1000.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1500.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "ORTHODIAG",
            actual = data.item?.get(0)?.detail?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(0)?.detail?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1500.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(2)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.net?.value?.value
        )

        assertEquals(
            expected = "ORTHOINITIAL",
            actual = data.item?.get(0)?.detail?.get(2)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(0)?.detail?.get(2)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(0)?.detail?.get(2)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(2)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "ORTHOMONTHS",
            actual = data.item?.get(0)?.detail?.get(3)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(0)?.detail?.get(3)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24".toDouble(),
            actual = data.item?.get(0)?.detail?.get(3)?.quantity?.value?.value
        )

        assertEquals(
            expected = "4".toLong(),
            actual = data.item?.get(0)?.detail?.get(3)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(4)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(4)?.net?.value?.value
        )

        assertEquals(
            expected = "ORTHOPERIODIC",
            actual = data.item?.get(0)?.detail?.get(4)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(0)?.detail?.get(4)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24".toDouble(),
            actual = data.item?.get(0)?.detail?.get(4)?.quantity?.value?.value
        )

        assertEquals(
            expected = "5".toLong(),
            actual = data.item?.get(0)?.detail?.get(4)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(4)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(4)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.diagnosisSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9000.0".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "ORTHPLAN",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2015-05-16",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9000.0".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "21",
            actual = data.item?.get(1)?.bodySite?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fdi.org/fhir/oraltoothcodes",
            actual = data.item?.get(1)?.bodySite?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(1)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "105.0".toDouble(),
            actual = data.item?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "21211",
            actual = data.item?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(1)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "L",
            actual = data.item?.get(1)?.subSite?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fdi.org/fhir/oralsurfacecodes",
            actual = data.item?.get(1)?.subSite?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "105.0".toDouble(),
            actual = data.item?.get(1)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "36",
            actual = data.item?.get(2)?.bodySite?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fdi.org/fhir/oraltoothcodes",
            actual = data.item?.get(2)?.bodySite?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(2)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "750.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "27211",
            actual = data.item?.get(2)?.detail?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(2)?.detail?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(2)?.detail?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "750.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "350.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "lab",
            actual = data.item?.get(2)?.detail?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(2)?.detail?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(2)?.detail?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(1)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "350.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(1)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1100.0".toDouble(),
            actual = data.item?.get(2)?.net?.value?.value
        )

        assertEquals(
            expected = "27211",
            actual = data.item?.get(2)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.item?.get(2)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(2)?.sequence?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.item?.get(2)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1100.0".toDouble(),
            actual = data.item?.get(2)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )
    }

    private fun assertClaim09Step02(data: Claim) {

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Oral Health Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.PREAUTHORIZATION,
            actual = data.use
        )
    }

    @Test
    fun testClaim10() {
        // Given
        val sourceJson = loadAsString("r4/claim-example-cms1500-medical.json")

        // When
        val data = parser.toFhir(Claim::class, sourceJson)

        // Then
        assertClaim10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaim10Step01(data: Claim) {

        assertEquals(
            expected = "Practitioner/example",
            actual = data.careTeam?.get(0)?.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.careTeam?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "patient-1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "coverage-1",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-10-16T00:00:00-07:00",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "M96.1",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Postlaminectomy syndrome",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-10",
            actual = data.diagnosis?.get(0)?.diagnosisCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "G89.4",
            actual = data.diagnosis?.get(1)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chronic pain syndrome",
            actual = data.diagnosis?.get(1)?.diagnosisCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-10",
            actual = data.diagnosis?.get(1)?.diagnosisCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.diagnosis?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "M53.88",
            actual = data.diagnosis?.get(2)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Other specified dorsopathies, sacral and sacrococcygeal region",
            actual = data.diagnosis?.get(2)?.diagnosisCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-10",
            actual = data.diagnosis?.get(2)?.diagnosisCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.diagnosis?.get(2)?.sequence?.value
        )

        assertEquals(
            expected = "M47.816",
            actual = data.diagnosis?.get(3)?.diagnosisCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Spondylosis without myelopathy or radiculopathy, lumbar region",
            actual = data.diagnosis?.get(3)?.diagnosisCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-10",
            actual = data.diagnosis?.get(3)?.diagnosisCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4".toLong(),
            actual = data.diagnosis?.get(3)?.sequence?.value
        )

        assertEquals(
            expected = "MED-00050",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://CedarArmsMedicalCenter.com/claim",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MED-00050",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#coverage-1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "http://CedarArmsMedicalCenter.com/claim",
            actual = data.insurance?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MED-00050",
            actual = data.insurance?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Humana Inc.",
            actual = data.insurer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bindb.com/bin",
            actual = data.insurer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123456",
            actual = data.insurer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.careTeamSequence?.get(0)?.value
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.diagnosisSequence?.get(0)?.value
        )

        assertEquals(
            expected = "4".toLong(),
            actual = data.item?.get(0)?.diagnosisSequence?.get(1)?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.informationSequence?.get(0)?.value
        )

        assertEquals(
            expected = "24",
            actual = data.item?.get(0)?.locationCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ambulatory Surgical Center",
            actual = data.item?.get(0)?.locationCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.cms.gov/medicare/coding/place-of-service-codes/place_of_service_code_set.html",
            actual = data.item?.get(0)?.locationCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12500.0".toDouble(),
            actual = data.item?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "62264",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Surgical Procedures on the Spine and Spinal Cord",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.ama-assn.org/go/cpt",
            actual = data.item?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2015-10-13",
            actual = data.item?.get(0)?.servicedDate?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12500.0".toDouble(),
            actual = data.item?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#patient-1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.payee?.party?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payee?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payeetype",
            actual = data.payee?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.provider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "831",
            actual = data.subType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.cms.gov/codes/billtype",
            actual = data.subType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hospitalized",
            actual = data.supportingInfo?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            actual = data.supportingInfo?.get(0)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.supportingInfo?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "2015-10-05T00:00:00-07:00",
            actual = data.supportingInfo?.get(0)?.timingPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-10-01T00:00:00-07:00",
            actual = data.supportingInfo?.get(0)?.timingPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "discharge",
            actual = data.supportingInfo?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claiminformationcategory",
            actual = data.supportingInfo?.get(1)?.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01",
            actual = data.supportingInfo?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Discharge to Home or Self Care",
            actual = data.supportingInfo?.get(1)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.cms.gov/Outreach-and-Education/Medicare-Learning-Network-MLN/MLNMattersArticles/downloads/SE0801.pdf",
            actual = data.supportingInfo?.get(1)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.supportingInfo?.get(1)?.sequence?.value
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of a CMS 1500 Claim</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12500.0".toDouble(),
            actual = data.total?.value?.value
        )

        assertEquals(
            expected = "institutional",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }
}
