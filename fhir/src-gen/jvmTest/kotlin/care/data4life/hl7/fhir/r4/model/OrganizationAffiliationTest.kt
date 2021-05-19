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
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "provider",
            data.code?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/organization-role",
            data.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Endpoint/example",
            data.endpoint?.get(0)?.reference
        )
        assertEquals(
            "HealthcareService/example",
            data.healthcareService?.get(0)?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://www.acme.org/practitioners",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "23",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "South Wing, second floor",
            data.location?.get(0)?.display
        )
        assertEquals(
            "Location/1",
            data.location?.get(0)?.reference
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
            "HL7 Payer Network",
            data.network?.get(0)?.display
        )
        assertEquals(
            "Organization/hl7pay",
            data.network?.get(0)?.reference
        )
        assertEquals(
            "Organization/hl7pay",
            data.organization?.reference
        )
        assertEquals(
            "Organization/f001",
            data.participatingOrganization?.reference
        )
        assertEquals(
            "2012-03-31",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2012-01-01",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "408443003",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "General medical practice",
            data.specialty?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.specialty?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.telecom?.get(0)?.use
        )
        assertEquals(
            "general.practice@example.org",
            data.telecom?.get(0)?.value
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

    @Test
    fun testOrganizationAffiliation02() {
        // Given
        val sourceJson = loadAsString("r4/orgrole-example-hie.json")

        // When
        val data = parser.toFhir(OrganizationAffiliation::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "member",
            data.code?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Member",
            data.code?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/organization-role",
            data.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Hospital member",
            data.code?.get(0)?.text
        )
        assertEquals(
            "Founding Fathers Memorial Hospital HIE endpoint",
            data.endpoint?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Endpoint/foundingfathersHIE",
            data.endpoint?.get(0)?.reference
        )
        assertEquals(
            "orgrole2",
            data.id
        )
        assertEquals(
            "Monument Health Information Exchange",
            data.identifier?.get(0)?.assigner?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Organization/monumentHIE",
            data.identifier?.get(0)?.assigner?.reference
        )
        assertEquals(
            "http://example.org/www.monumentHIE.com",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "member hospital",
            data.identifier?.get(0)?.type?.text
        )
        assertEquals(
            IdentifierUse.SECONDARY,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "hosp32",
            data.identifier?.get(0)?.value
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
            "Monument Health Information Exchange",
            data.organization?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Organization/monumentHIE",
            data.organization?.reference
        )
        assertEquals(
            "Founding Fathers Memorial Hospital",
            data.participatingOrganization?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Organization/foundingfathers",
            data.participatingOrganization?.reference
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

    @Test
    fun testOrganizationAffiliation03() {
        // Given
        val sourceJson = loadAsString("r4/orgrole-example-services.json")

        // When
        val data = parser.toFhir(OrganizationAffiliation::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "provider",
            data.code?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Provider",
            data.code?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/organization-role",
            data.code?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.code?.get(0)?.coding?.get(0)?.userSelected?.value
        )
        assertEquals(
            "Provider of rehabilitation services",
            data.code?.get(0)?.text
        )
        assertEquals(
            "Inpatient rehabilitation services",
            data.healthcareService?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/HealthcareService/independencerehab1",
            data.healthcareService?.get(0)?.reference
        )
        assertEquals(
            "Outpatient rehabilitation services",
            data.healthcareService?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/HealthcareService/independencerehab2",
            data.healthcareService?.get(1)?.reference
        )
        assertEquals(
            "orgrole1",
            data.id
        )
        assertEquals(
            "Founding Fathers Memorial Hospital",
            data.identifier?.get(0)?.assigner?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Organization/foundingfathers",
            data.identifier?.get(0)?.assigner?.reference
        )
        assertEquals(
            "http://example.org/www.foundingfathersmemorial.com",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.SECONDARY,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "service002",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Founding Fathers Memorial Hospital",
            data.location?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Location/foundingfathers1",
            data.location?.get(0)?.reference
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
            "Patriot Preferred Provider Network",
            data.network?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Network/patriotppo",
            data.network?.get(0)?.reference
        )
        assertEquals(
            "Founding Fathers Memorial Hospital",
            data.organization?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Organization/foundingfathers",
            data.organization?.reference
        )
        assertEquals(
            "Independence Rehabilitation Services, Inc.",
            data.participatingOrganization?.display
        )
        assertEquals(
            "http://hl7.org/fhir/ig/vhdir/Organization/independencerehab",
            data.participatingOrganization?.reference
        )
        assertEquals(
            "2022-02-01",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2018-02-09",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "394602003",
            data.specialty?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Rehabilitation - specialty",
            data.specialty?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.specialty?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Rehabilitation",
            data.specialty?.get(0)?.text
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.telecom?.get(0)?.use
        )
        assertEquals(
            "202-109-8765",
            data.telecom?.get(0)?.value
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
