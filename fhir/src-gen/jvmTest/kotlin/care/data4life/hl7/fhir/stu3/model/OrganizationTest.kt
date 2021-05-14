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
import care.data4life.hl7.fhir.stu3.codesystem.AddressUse
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointUse
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NameUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
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
 * departments, community groups, healthcare practice groups, etc.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class OrganizationTest {

    val parser = FhirStu3Parser()

    @Test
    fun testOrganization01() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "Ann Arbor",
            data.address?.get(0)?.city
        )
        assertEquals(
            "USA",
            data.address?.get(0)?.country
        )
        assertEquals(
            "3300 Washtenaw Avenue, Suite 227",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "48104",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            "MI",
            data.address?.get(0)?.state
        )
        assertEquals(
            "Endpoint/example",
            data.endpoint?.get(0)?.reference
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/organization-alias",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "HL7 International",
            data.extension?.get(0)?.valueString
        )
        assertEquals(
            "hl7",
            data.id
        )
        assertEquals(
            "Health Level Seven International",
            data.name
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            "(+1) 734-677-7777",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.FAX,
            data.telecom?.get(1)?.system
        )
        assertEquals(
            "(+1) 734-677-6622",
            data.telecom?.get(1)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.telecom?.get(2)?.system
        )
        assertEquals(
            "hq@HL7.org",
            data.telecom?.get(2)?.value
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
    fun testOrganization02() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-mmanu.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Swizterland",
            data.address?.get(0)?.country
        )
        assertEquals(
            "mmanu",
            data.id
        )
        assertEquals(
            "Acme Corporation",
            data.name
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
    fun testOrganization03() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-gastro.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "1",
            data.id
        )
        assertEquals(
            "http://www.acme.org.au/units",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "Gastro",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Gastroenterology",
            data.name
        )
        assertEquals(
            "ACME Healthcare, Inc",
            data.partOf?.display
        )
        assertEquals(
            "Organization/1",
            data.partOf?.reference
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.MOBILE,
            data.telecom?.get(0)?.use
        )
        assertEquals(
            "+1 555 234 3523",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.telecom?.get(1)?.use
        )
        assertEquals(
            "gastro@acme.org",
            data.telecom?.get(1)?.value
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
    fun testOrganization04() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-lab.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.id
        )
        assertEquals(
            "http://www.acme.org.au/units",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "ClinLab",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Clinical Lab",
            data.name
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
            "+1 555 234 1234",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.telecom?.get(1)?.use
        )
        assertEquals(
            "contact@labs.acme.org",
            data.telecom?.get(1)?.value
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
    fun testOrganization05() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-f002-burgers-card.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "South Wing, floor 2",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "South Wing, floor 2",
            data.contact?.get(0)?.address?.line?.get(0)
        )
        assertEquals(
            "mevr. D. de Haan",
            data.contact?.get(0)?.name?.text
        )
        assertEquals(
            "ADMIN",
            data.contact?.get(0)?.purpose?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/contactentity-type",
            data.contact?.get(0)?.purpose?.coding?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "022-655 2321",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            "cardio@burgersumc.nl",
            data.contact?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            ContactPointSystem.FAX,
            data.contact?.get(0)?.telecom?.get(2)?.system
        )
        assertEquals(
            "022-655 2322",
            data.contact?.get(0)?.telecom?.get(2)?.value
        )
        assertEquals(
            "f002",
            data.id
        )
        assertEquals(
            "Burgers UMC Cardiology unit",
            data.name
        )
        assertEquals(
            "Organization/f001",
            data.partOf?.reference
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            "022-655 2320",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "dept",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Hospital Department",
            data.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/organization-type",
            data.type?.get(0)?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOrganization06() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-f201-aumc.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Den Helder",
            data.address?.get(0)?.city
        )
        assertEquals(
            "NLD",
            data.address?.get(0)?.country
        )
        assertEquals(
            "Walvisbaai 3",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "2333ZA",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            AddressUse.WORK,
            data.address?.get(0)?.use
        )
        assertEquals(
            "Den helder",
            data.contact?.get(0)?.address?.city
        )
        assertEquals(
            "NLD",
            data.contact?.get(0)?.address?.country
        )
        assertEquals(
            "Walvisbaai 3",
            data.contact?.get(0)?.address?.line?.get(0)
        )
        assertEquals(
            "Gebouw 2",
            data.contact?.get(0)?.address?.line?.get(1)
        )
        assertEquals(
            "2333ZA",
            data.contact?.get(0)?.address?.postalCode
        )
        assertEquals(
            "Brand",
            data.contact?.get(0)?.name?.family
        )
        assertEquals(
            "Ronald",
            data.contact?.get(0)?.name?.given?.get(0)
        )
        assertEquals(
            "Prof.Dr.",
            data.contact?.get(0)?.name?.prefix?.get(0)
        )
        assertEquals(
            "Professor Brand",
            data.contact?.get(0)?.name?.text
        )
        assertEquals(
            NameUse.OFFICIAL,
            data.contact?.get(0)?.name?.use
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "+31715269702",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "f201",
            data.id
        )
        assertEquals(
            "http://www.zorgkaartnederland.nl/",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "Artis University Medical Center",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Artis University Medical Center (AUMC)",
            data.name
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
            "+31715269111",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "405608006",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Academic Medical Center",
            data.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "V6",
            data.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "University Medical Hospital",
            data.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.2.4.15.1060",
            data.type?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "prov",
            data.type?.get(0)?.coding?.get(2)?.code
        )
        assertEquals(
            "Healthcare Provider",
            data.type?.get(0)?.coding?.get(2)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/organization-type",
            data.type?.get(0)?.coding?.get(2)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOrganization07() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-good-health-care.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "2.16.840.1.113883.19.5",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "2.16.840.1.113883.19.5",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Good Health Clinic",
            data.name
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
    fun testOrganization08() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-f001-burgers.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "Den Burg",
            data.address?.get(0)?.city
        )
        assertEquals(
            "NLD",
            data.address?.get(0)?.country
        )
        assertEquals(
            "Galapagosweg 91",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "9105 PZ",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            AddressUse.WORK,
            data.address?.get(0)?.use
        )
        assertEquals(
            "Den Burg",
            data.address?.get(1)?.city
        )
        assertEquals(
            "NLD",
            data.address?.get(1)?.country
        )
        assertEquals(
            "PO Box 2311",
            data.address?.get(1)?.line?.get(0)
        )
        assertEquals(
            "9100 AA",
            data.address?.get(1)?.postalCode
        )
        assertEquals(
            AddressUse.WORK,
            data.address?.get(1)?.use
        )
        assertEquals(
            "PRESS",
            data.contact?.get(0)?.purpose?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/contactentity-type",
            data.contact?.get(0)?.purpose?.coding?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "022-655 2334",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "PATINF",
            data.contact?.get(1)?.purpose?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/contactentity-type",
            data.contact?.get(1)?.purpose?.coding?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(1)?.telecom?.get(0)?.system
        )
        assertEquals(
            "022-655 2335",
            data.contact?.get(1)?.telecom?.get(0)?.value
        )
        assertEquals(
            "f001",
            data.id
        )
        assertEquals(
            "urn:oid:2.16.528.1",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "91654",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.2.4.6.1",
            data.identifier?.get(1)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(1)?.use
        )
        assertEquals(
            "17-0112278",
            data.identifier?.get(1)?.value
        )
        assertEquals(
            "Burgers University Medical Center",
            data.name
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
            "022-655 2300",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "V6",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "University Medical Hospital",
            data.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.2.4.15.1060",
            data.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "prov",
            data.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "Healthcare Provider",
            data.type?.get(0)?.coding?.get(1)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/organization-type",
            data.type?.get(0)?.coding?.get(1)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOrganization09() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-insurer.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "ABC Insurance",
            data.alias?.get(0)
        )
        assertEquals(
            "2",
            data.id
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.19.2.3",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "666666",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "XYZ Insurance",
            data.name
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
    fun testOrganization10() {
        // Given
        val sourceJson = loadAsString("stu3/organization-example-f203-bumc.json")

        // When
        val data = parser.toFhir(Organization::class, sourceJson)

        // Then

        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Blijdorp",
            data.address?.get(0)?.city
        )
        assertEquals(
            "NLD",
            data.address?.get(0)?.country
        )
        assertEquals(
            "apenrots 230",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "3056BE",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            AddressUse.WORK,
            data.address?.get(0)?.use
        )
        assertEquals(
            "f203",
            data.id
        )
        assertEquals(
            "http://www.zorgkaartnederland.nl/",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "Zorginstelling naam",
            data.identifier?.get(0)?.type?.text
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "Blijdorp MC",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Blijdorp Medisch Centrum (BUMC)",
            data.name
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
            "+31107040704",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "405608006",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Academic Medical Center",
            data.type?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "prov",
            data.type?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/organization-type",
            data.type?.get(0)?.coding?.get(1)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
