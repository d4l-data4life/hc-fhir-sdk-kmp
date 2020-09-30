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
import care.data4life.fhir.stu3.codesystem.*
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * OrganizationTest.java
 *
 * A grouping of people or organizations with a common purpose.
 *
 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class OrganizationTest {

    val parser = FhirStu3Parser()


    @Test
    fun testOrganization1() {
        val sourceJson = loadAsString("organization-example.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.address?.get(0)?.city, "Ann Arbor")
        assertEquals(data.address?.get(0)?.country, "USA")
        assertEquals(data.address?.get(0)?.line?.get(0), "3300 Washtenaw Avenue, Suite 227")
        assertEquals(data.address?.get(0)?.postalCode, "48104")
        assertEquals(data.address?.get(0)?.state, "MI")
        assertEquals(data.endpoint?.get(0)?.reference, "Endpoint/example")
        assertEquals(
            data.extension?.get(0)?.url,
            "http://hl7.org/fhir/StructureDefinition/organization-alias"
        )
        assertEquals(data.extension?.get(0)?.valueString, "HL7 International")
        assertEquals(data.id, "hl7")
        assertEquals(data.name, "Health Level Seven International")
        assertEquals(data.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.telecom?.get(0)?.value, "(+1) 734-677-7777")
        assertEquals(data.telecom?.get(1)?.system, ContactPointSystem.FAX)
        assertEquals(data.telecom?.get(1)?.value, "(+1) 734-677-6622")
        assertEquals(data.telecom?.get(2)?.system, ContactPointSystem.EMAIL)
        assertEquals(data.telecom?.get(2)?.value, "hq@HL7.org")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization2() {
        val sourceJson = loadAsString("organization-example-mmanu.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.active, "True")
        assertEquals(data.address?.get(0)?.country, "Swizterland")
        assertEquals(data.id, "mmanu")
        assertEquals(data.name, "Acme Corporation")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization3() {
        val sourceJson = loadAsString("organization-example-gastro.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.id, "1")
        assertEquals(data.identifier?.get(0)?.system, "http://www.acme.org.au/units")
        assertEquals(data.identifier?.get(0)?.value, "Gastro")
        assertEquals(data.name, "Gastroenterology")
        assertEquals(data.partOf?.display, "ACME Healthcare, Inc")
        assertEquals(data.partOf?.reference, "Organization/1")
        assertEquals(data.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.telecom?.get(0)?.use, ContactPointUse.MOBILE)
        assertEquals(data.telecom?.get(0)?.value, "+1 555 234 3523")
        assertEquals(data.telecom?.get(1)?.system, ContactPointSystem.EMAIL)
        assertEquals(data.telecom?.get(1)?.use, ContactPointUse.WORK)
        assertEquals(data.telecom?.get(1)?.value, "gastro@acme.org")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization4() {
        val sourceJson = loadAsString("organization-example-lab.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.id, "1832473e-2fe0-452d-abe9-3cdb9879522f")
        assertEquals(data.identifier?.get(0)?.system, "http://www.acme.org.au/units")
        assertEquals(data.identifier?.get(0)?.value, "ClinLab")
        assertEquals(data.name, "Clinical Lab")
        assertEquals(data.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.telecom?.get(0)?.use, ContactPointUse.WORK)
        assertEquals(data.telecom?.get(0)?.value, "+1 555 234 1234")
        assertEquals(data.telecom?.get(1)?.system, ContactPointSystem.EMAIL)
        assertEquals(data.telecom?.get(1)?.use, ContactPointUse.WORK)
        assertEquals(data.telecom?.get(1)?.value, "contact@labs.acme.org")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization5() {
        val sourceJson = loadAsString("organization-example-f002-burgers-card.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.active, "True")
        assertEquals(data.address?.get(0)?.line?.get(0), "South Wing, floor 2")
        assertEquals(data.contact?.get(0)?.address?.line?.get(0), "South Wing, floor 2")
        assertEquals(data.contact?.get(0)?.name?.text, "mevr. D. de Haan")
        assertEquals(data.contact?.get(0)?.purpose?.coding?.get(0)?.code, "ADMIN")
        assertEquals(
            data.contact?.get(0)?.purpose?.coding?.get(0)?.system,
            "http://hl7.org/fhir/contactentity-type"
        )
        assertEquals(data.contact?.get(0)?.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.contact?.get(0)?.telecom?.get(0)?.value, "022-655 2321")
        assertEquals(data.contact?.get(0)?.telecom?.get(1)?.system, ContactPointSystem.EMAIL)
        assertEquals(data.contact?.get(0)?.telecom?.get(1)?.value, "cardio@burgersumc.nl")
        assertEquals(data.contact?.get(0)?.telecom?.get(2)?.system, ContactPointSystem.FAX)
        assertEquals(data.contact?.get(0)?.telecom?.get(2)?.value, "022-655 2322")
        assertEquals(data.id, "f002")
        assertEquals(data.name, "Burgers UMC Cardiology unit")
        assertEquals(data.partOf?.reference, "Organization/f001")
        assertEquals(data.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.telecom?.get(0)?.value, "022-655 2320")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.get(0)?.coding?.get(0)?.code, "dept")
        assertEquals(data.type?.get(0)?.coding?.get(0)?.display, "Hospital Department")
        assertEquals(
            data.type?.get(0)?.coding?.get(0)?.system,
            "http://hl7.org/fhir/organization-type"
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization6() {
        val sourceJson = loadAsString("organization-example-f201-aumc.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.active, "True")
        assertEquals(data.address?.get(0)?.city, "Den Helder")
        assertEquals(data.address?.get(0)?.country, "NLD")
        assertEquals(data.address?.get(0)?.line?.get(0), "Walvisbaai 3")
        assertEquals(data.address?.get(0)?.postalCode, "2333ZA")
        assertEquals(data.address?.get(0)?.use, AddressUse.WORK)
        assertEquals(data.contact?.get(0)?.address?.city, "Den helder")
        assertEquals(data.contact?.get(0)?.address?.country, "NLD")
        assertEquals(data.contact?.get(0)?.address?.line?.get(0), "Walvisbaai 3")
        assertEquals(data.contact?.get(0)?.address?.line?.get(1), "Gebouw 2")
        assertEquals(data.contact?.get(0)?.address?.postalCode, "2333ZA")
        assertEquals(data.contact?.get(0)?.name?.family, "Brand")
        assertEquals(data.contact?.get(0)?.name?.given?.get(0), "Ronald")
        assertEquals(data.contact?.get(0)?.name?.prefix?.get(0), "Prof.Dr.")
        assertEquals(data.contact?.get(0)?.name?.text, "Professor Brand")
        assertEquals(data.contact?.get(0)?.name?.use, NameUse.OFFICIAL)
        assertEquals(data.contact?.get(0)?.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.contact?.get(0)?.telecom?.get(0)?.use, ContactPointUse.WORK)
        assertEquals(data.contact?.get(0)?.telecom?.get(0)?.value, "+31715269702")
        assertEquals(data.id, "f201")
        assertEquals(data.identifier?.get(0)?.system, "http://www.zorgkaartnederland.nl/")
        assertEquals(data.identifier?.get(0)?.use, IdentifierUse.OFFICIAL)
        assertEquals(data.identifier?.get(0)?.value, "Artis University Medical Center")
        assertEquals(data.name, "Artis University Medical Center (AUMC)")
        assertEquals(data.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.telecom?.get(0)?.use, ContactPointUse.WORK)
        assertEquals(data.telecom?.get(0)?.value, "+31715269111")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.get(0)?.coding?.get(0)?.code, "405608006")
        assertEquals(data.type?.get(0)?.coding?.get(0)?.display, "Academic Medical Center")
        assertEquals(data.type?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.type?.get(0)?.coding?.get(1)?.code, "V6")
        assertEquals(data.type?.get(0)?.coding?.get(1)?.display, "University Medical Hospital")
        assertEquals(
            data.type?.get(0)?.coding?.get(1)?.system,
            "urn:oid:2.16.840.1.113883.2.4.15.1060"
        )
        assertEquals(data.type?.get(0)?.coding?.get(2)?.code, "prov")
        assertEquals(data.type?.get(0)?.coding?.get(2)?.display, "Healthcare Provider")
        assertEquals(
            data.type?.get(0)?.coding?.get(2)?.system,
            "http://hl7.org/fhir/organization-type"
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization7() {
        val sourceJson = loadAsString("organization-example-good-health-care.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.id, "2.16.840.1.113883.19.5")
        assertEquals(data.identifier?.get(0)?.system, "urn:ietf:rfc:3986")
        assertEquals(data.identifier?.get(0)?.value, "2.16.840.1.113883.19.5")
        assertEquals(data.name, "Good Health Clinic")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization8() {
        val sourceJson = loadAsString("organization-example-f001-burgers.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.address?.get(0)?.city, "Den Burg")
        assertEquals(data.address?.get(0)?.country, "NLD")
        assertEquals(data.address?.get(0)?.line?.get(0), "Galapagosweg 91")
        assertEquals(data.address?.get(0)?.postalCode, "9105 PZ")
        assertEquals(data.address?.get(0)?.use, AddressUse.WORK)
        assertEquals(data.address?.get(1)?.city, "Den Burg")
        assertEquals(data.address?.get(1)?.country, "NLD")
        assertEquals(data.address?.get(1)?.line?.get(0), "PO Box 2311")
        assertEquals(data.address?.get(1)?.postalCode, "9100 AA")
        assertEquals(data.address?.get(1)?.use, AddressUse.WORK)
        assertEquals(data.contact?.get(0)?.purpose?.coding?.get(0)?.code, "PRESS")
        assertEquals(
            data.contact?.get(0)?.purpose?.coding?.get(0)?.system,
            "http://hl7.org/fhir/contactentity-type"
        )
        assertEquals(data.contact?.get(0)?.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.contact?.get(0)?.telecom?.get(0)?.value, "022-655 2334")
        assertEquals(data.contact?.get(1)?.purpose?.coding?.get(0)?.code, "PATINF")
        assertEquals(
            data.contact?.get(1)?.purpose?.coding?.get(0)?.system,
            "http://hl7.org/fhir/contactentity-type"
        )
        assertEquals(data.contact?.get(1)?.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.contact?.get(1)?.telecom?.get(0)?.value, "022-655 2335")
        assertEquals(data.id, "f001")
        assertEquals(data.identifier?.get(0)?.system, "urn:oid:2.16.528.1")
        assertEquals(data.identifier?.get(0)?.use, IdentifierUse.OFFICIAL)
        assertEquals(data.identifier?.get(0)?.value, "91654")
        assertEquals(data.identifier?.get(1)?.system, "urn:oid:2.16.840.1.113883.2.4.6.1")
        assertEquals(data.identifier?.get(1)?.use, IdentifierUse.USUAL)
        assertEquals(data.identifier?.get(1)?.value, "17-0112278")
        assertEquals(data.name, "Burgers University Medical Center")
        assertEquals(data.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.telecom?.get(0)?.use, ContactPointUse.WORK)
        assertEquals(data.telecom?.get(0)?.value, "022-655 2300")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.get(0)?.coding?.get(0)?.code, "V6")
        assertEquals(data.type?.get(0)?.coding?.get(0)?.display, "University Medical Hospital")
        assertEquals(
            data.type?.get(0)?.coding?.get(0)?.system,
            "urn:oid:2.16.840.1.113883.2.4.15.1060"
        )
        assertEquals(data.type?.get(0)?.coding?.get(1)?.code, "prov")
        assertEquals(data.type?.get(0)?.coding?.get(1)?.display, "Healthcare Provider")
        assertEquals(
            data.type?.get(0)?.coding?.get(1)?.system,
            "http://hl7.org/fhir/organization-type"
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization9() {
        val sourceJson = loadAsString("organization-example-insurer.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.alias?.get(0), "ABC Insurance")
        assertEquals(data.id, "2")
        assertEquals(data.identifier?.get(0)?.system, "urn:oid:2.16.840.1.113883.3.19.2.3")
        assertEquals(data.identifier?.get(0)?.value, "666666")
        assertEquals(data.name, "XYZ Insurance")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testOrganization10() {
        val sourceJson = loadAsString("organization-example-f203-bumc.json")

        val data = parser.toFhir(Organization::class, sourceJson)


        assertEquals(data.active, "True")
        assertEquals(data.address?.get(0)?.city, "Blijdorp")
        assertEquals(data.address?.get(0)?.country, "NLD")
        assertEquals(data.address?.get(0)?.line?.get(0), "apenrots 230")
        assertEquals(data.address?.get(0)?.postalCode, "3056BE")
        assertEquals(data.address?.get(0)?.use, AddressUse.WORK)
        assertEquals(data.id, "f203")
        assertEquals(data.identifier?.get(0)?.system, "http://www.zorgkaartnederland.nl/")
        assertEquals(data.identifier?.get(0)?.type?.text, "Zorginstelling naam")
        assertEquals(data.identifier?.get(0)?.use, IdentifierUse.OFFICIAL)
        assertEquals(data.identifier?.get(0)?.value, "Blijdorp MC")
        assertEquals(data.name, "Blijdorp Medisch Centrum (BUMC)")
        assertEquals(data.telecom?.get(0)?.system, ContactPointSystem.PHONE)
        assertEquals(data.telecom?.get(0)?.use, ContactPointUse.WORK)
        assertEquals(data.telecom?.get(0)?.value, "+31107040704")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.get(0)?.coding?.get(0)?.code, "405608006")
        assertEquals(data.type?.get(0)?.coding?.get(0)?.display, "Academic Medical Center")
        assertEquals(data.type?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.type?.get(0)?.coding?.get(1)?.code, "prov")
        assertEquals(
            data.type?.get(0)?.coding?.get(1)?.system,
            "http://hl7.org/fhir/organization-type"
        )

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


