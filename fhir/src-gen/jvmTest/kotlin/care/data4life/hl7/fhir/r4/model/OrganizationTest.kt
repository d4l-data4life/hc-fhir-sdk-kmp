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
import care.data4life.hl7.fhir.r4.codesystem.AddressUse
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.ContactPointUse
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NameUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * OrganizationTest.java
 *
 * A grouping of people or organizations with a common purpose
 *
 * A formally or informally recognized grouping of people or organizations formed for the purpose of
 * achieving some form of collective action. Includes companies, institutions, corporations,
 * departments, community groups, healthcare practice groups, payer/insurer, etc.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class OrganizationTest {

    val parser = FhirR4Parser()

    @Test
    fun testOrganization01() {
        // Given
        val sourceJson = loadAsString("r4/organization-example.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization01Step01(data: Organization) {

        assertEquals(
            expected = "Ann Arbor",
            actual = data.address?.get(0)?.city
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USA",
            actual = data.address?.get(0)?.country
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3300 Washtenaw Avenue, Suite 227",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "48104",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "MI",
            actual = data.address?.get(0)?.state
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HL7 International",
            actual = data.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Endpoint/example",
            actual = data.endpoint?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "hl7",
            actual = data.id
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
            expected = "Health Level Seven International",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "(+1) 734-677-7777",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.FAX,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = "(+1) 734-677-6622",
            actual = data.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(2)?.system
        )

        assertEquals(
            expected = "hq@HL7.org",
            actual = data.telecom?.get(2)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganization02() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-mmanu.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization02Step01(data: Organization) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Swizterland",
            actual = data.address?.get(0)?.country
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mmanu",
            actual = data.id
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
            expected = "Acme Corporation",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganization03() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-gastro.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization03Step01(data: Organization) {

        assertEquals(
            expected = "1",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org.au/units",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gastro",
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
            expected = "Gastroenterology",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.MOBILE,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "+1 555 234 3523",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "gastro@acme.org",
            actual = data.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganization04() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-mihealth.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization04Step01(data: Organization) {

        assertEquals(
            expected = "Michigan State Department of Health",
            actual = data.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://michigan.gov/state-dept-ids",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "25",
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
            expected = "Michigan Health",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganization05() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-lab.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization05Step01(data: Organization) {

        assertEquals(
            expected = "1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org.au/units",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ClinLab",
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
            expected = "Clinical Lab",
            actual = data.name
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
            expected = "+1 555 234 1234",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "contact@labs.acme.org",
            actual = data.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganization06() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-f002-burgers-card.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization06Step01(data: Organization) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "South Wing, floor 2",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "South Wing, floor 2",
            actual = data.contact?.get(0)?.address?.line?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "mevr. D. de Haan",
            actual = data.contact?.get(0)?.name?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ADMIN",
            actual = data.contact?.get(0)?.purpose?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contactentity-type",
            actual = data.contact?.get(0)?.purpose?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "022-655 2321",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = "cardio@burgersumc.nl",
            actual = data.contact?.get(0)?.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.FAX,
            actual = data.contact?.get(0)?.telecom?.get(2)?.system
        )

        assertEquals(
            expected = "022-655 2322",
            actual = data.contact?.get(0)?.telecom?.get(2)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f002",
            actual = data.id
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
            expected = "Burgers UMC Cardiology unit",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.partOf?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "022-655 2320",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "dept",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Hospital Department",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/organization-type",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testOrganization07() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-f201-aumc.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization07Step01(data: Organization) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Den Helder",
            actual = data.address?.get(0)?.city
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Walvisbaai 3",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2333ZA",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "Den helder",
            actual = data.contact?.get(0)?.address?.city
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.contact?.get(0)?.address?.country
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Walvisbaai 3",
            actual = data.contact?.get(0)?.address?.line?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gebouw 2",
            actual = data.contact?.get(0)?.address?.line?.get(1)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2333ZA",
            actual = data.contact?.get(0)?.address?.postalCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Brand",
            actual = data.contact?.get(0)?.name?.family
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Ronald",
            actual = data.contact?.get(0)?.name?.given?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Prof.Dr.",
            actual = data.contact?.get(0)?.name?.prefix?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Professor Brand",
            actual = data.contact?.get(0)?.name?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NameUse.OFFICIAL,
            actual = data.contact?.get(0)?.name?.use
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "+31715269702",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://www.zorgkaartnederland.nl/",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "Artis University Medical Center",
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
            expected = "Artis University Medical Center (AUMC)",
            actual = data.name
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
            expected = "+31715269111",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "405608006",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Academic Medical Center",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "V6",
            actual = data.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "University Medical Hospital",
            actual = data.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.15.1060",
            actual = data.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prov",
            actual = data.type?.get(0)?.coding?.get(2)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Healthcare Provider",
            actual = data.type?.get(0)?.coding?.get(2)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/organization-type",
            actual = data.type?.get(0)?.coding?.get(2)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testOrganization08() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-good-health-care.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization08Step01(data: Organization) {

        assertEquals(
            expected = "2.16.840.1.113883.19.5",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.19.5",
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
            expected = "Good Health Clinic",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOrganization09() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-f001-burgers.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization09Step01(data: Organization) {

        assertEquals(
            expected = "Den Burg",
            actual = data.address?.get(0)?.city
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Galapagosweg 91",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "9105 PZ",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "Den Burg",
            actual = data.address?.get(1)?.city
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(1)?.country
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "PO Box 2311",
            actual = data.address?.get(1)?.line?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "9100 AA",
            actual = data.address?.get(1)?.postalCode
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(1)?.use
        )

        assertEquals(
            expected = "PRESS",
            actual = data.contact?.get(0)?.purpose?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contactentity-type",
            actual = data.contact?.get(0)?.purpose?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "022-655 2334",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "PATINF",
            actual = data.contact?.get(1)?.purpose?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contactentity-type",
            actual = data.contact?.get(1)?.purpose?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(1)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "022-655 2335",
            actual = data.contact?.get(1)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f001",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.528.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "91654",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.6.1",
            actual = data.identifier?.get(1)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "17-0112278",
            actual = data.identifier?.get(1)?.value
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
            expected = "Burgers University Medical Center",
            actual = data.name
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
            expected = "022-655 2300",
            actual = data.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "V6",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "University Medical Hospital",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.15.1060",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prov",
            actual = data.type?.get(0)?.coding?.get(1)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Healthcare Provider",
            actual = data.type?.get(0)?.coding?.get(1)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/organization-type",
            actual = data.type?.get(0)?.coding?.get(1)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testOrganization10() {
        // Given
        val sourceJson = loadAsString("r4/organization-example-insurer.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then
        assertOrganization10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOrganization10Step01(data: Organization) {

        assertEquals(
            expected = "ABC Insurance",
            actual = data.alias?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.3.19.2.3",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "666666",
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
            expected = "XYZ Insurance",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
