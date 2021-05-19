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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.ContactPointUse
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * OrganizationAffiliationTest.java
 *
 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of relationship/sub-division relationship
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class OrganizationAffiliationTest {

    val parser = FhirR4Parser()

    @Test
    fun testOrganizationAffiliation01() {
        // Given
        val sourceJson = loadAsString("r4/organizationaffiliation-example.json")

        // When
        val data = parser.toFhir(OrganizationAffiliation::class, sourceJson)

        // Then
        assertOrganizationAffiliation01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganizationAffiliation01Step01(data: OrganizationAffiliation) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "provider",
            actual = data.code?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/organization-role",
            actual = data.code?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example",
            actual = data.endpoint?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HealthcareService/example",
            actual = data.healthcareService?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org/practitioners",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "23",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "South Wing, second floor",
            actual = data.location?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.get(0)?.reference
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
            expected = "HL7 Payer Network",
            actual = data.network?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7pay",
            actual = data.network?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7pay",
            actual = data.organization?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.participatingOrganization?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-03-31",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2012-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "408443003",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "General medical practice",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.specialty?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "general.practice@example.org",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganizationAffiliation02() {
        // Given
        val sourceJson = loadAsString("r4/orgrole-example-hie.json")

        // When
        val data = parser.toFhir(OrganizationAffiliation::class, sourceJson)

        // Then
        assertOrganizationAffiliation02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganizationAffiliation02Step01(data: OrganizationAffiliation) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "member",
            actual = data.code?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Member",
            actual = data.code?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/organization-role",
            actual = data.code?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Hospital member",
            actual = data.code?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Founding Fathers Memorial Hospital HIE endpoint",
            actual = data.endpoint?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Endpoint/foundingfathersHIE",
            actual = data.endpoint?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "orgrole2",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Monument Health Information Exchange",
            actual = data.identifier?.get(0)?.assigner?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Organization/monumentHIE",
            actual = data.identifier?.get(0)?.assigner?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/www.monumentHIE.com",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "member hospital",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.SECONDARY,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "hosp32",
            actual = data.identifier?.get(0)?.value
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
            expected = "Monument Health Information Exchange",
            actual = data.organization?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Organization/monumentHIE",
            actual = data.organization?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Founding Fathers Memorial Hospital",
            actual = data.participatingOrganization?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Organization/foundingfathers",
            actual = data.participatingOrganization?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganizationAffiliation03() {
        // Given
        val sourceJson = loadAsString("r4/orgrole-example-services.json")

        // When
        val data = parser.toFhir(OrganizationAffiliation::class, sourceJson)

        // Then
        assertOrganizationAffiliation03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganizationAffiliation03Step01(data: OrganizationAffiliation) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "provider",
            actual = data.code?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Provider",
            actual = data.code?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/organization-role",
            actual = data.code?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.code?.get(0)?.coding?.get(0)?.userSelected?.value
        )

        assertEquals(
            expected = "Provider of rehabilitation services",
            actual = data.code?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Inpatient rehabilitation services",
            actual = data.healthcareService?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/HealthcareService/independencerehab1",
            actual = data.healthcareService?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Outpatient rehabilitation services",
            actual = data.healthcareService?.get(1)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/HealthcareService/independencerehab2",
            actual = data.healthcareService?.get(1)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "orgrole1",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Founding Fathers Memorial Hospital",
            actual = data.identifier?.get(0)?.assigner?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Organization/foundingfathers",
            actual = data.identifier?.get(0)?.assigner?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/www.foundingfathersmemorial.com",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.SECONDARY,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "service002",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Founding Fathers Memorial Hospital",
            actual = data.location?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Location/foundingfathers1",
            actual = data.location?.get(0)?.reference
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
            expected = "Patriot Preferred Provider Network",
            actual = data.network?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Network/patriotppo",
            actual = data.network?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Founding Fathers Memorial Hospital",
            actual = data.organization?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Organization/foundingfathers",
            actual = data.organization?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Independence Rehabilitation Services, Inc.",
            actual = data.participatingOrganization?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ig/vhdir/Organization/independencerehab",
            actual = data.participatingOrganization?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2022-02-01",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2018-02-09",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "394602003",
            actual = data.specialty?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Rehabilitation - specialty",
            actual = data.specialty?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.specialty?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Rehabilitation",
            actual = data.specialty?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "202-109-8765",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
