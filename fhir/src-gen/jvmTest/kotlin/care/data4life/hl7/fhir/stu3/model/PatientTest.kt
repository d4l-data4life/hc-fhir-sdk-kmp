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
import care.data4life.hl7.fhir.stu3.codesystem.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Ignore
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * PatientTest.java
 *
 * Information about an individual or animal receiving health care services.
 *
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class PatientTest {

    val parser = FhirStu3Parser()

    @Test
    fun testPatient1() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-xds.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("Metropolis", data.address?.get(0)?.city)
        assertEquals("USA", data.address?.get(0)?.country)
        assertEquals("100 Main St", data.address?.get(0)?.line?.get(0))
        assertEquals("44130", data.address?.get(0)?.postalCode)
        assertEquals("Il", data.address?.get(0)?.state)
        assertEquals("1956-05-27", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("xds", data.id)
        assertEquals("urn:oid:1.2.3.4.5", data.identifier?.get(0)?.system)
        assertEquals("MR", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(0)?.use)
        assertEquals("89765a87b", data.identifier?.get(0)?.value)
        assertEquals("Organization/2", data.managingOrganization?.reference)
        assertEquals("Doe", data.name?.get(0)?.family)
        assertEquals("John", data.name?.get(0)?.given?.get(0))
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient2() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-f001-pieter.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("Amsterdam", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Van Egmondkade 23", data.address?.get(0)?.line?.get(0))
        assertEquals("1024 RJ", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.HOME, data.address?.get(0)?.use)
        assertEquals("1944-11-17", data.birthDate?.value.toString())
        assertEquals("nl", data.communication?.get(0)?.language?.coding?.get(0)?.code)
        assertEquals("Dutch", data.communication?.get(0)?.language?.coding?.get(0)?.display)
        assertEquals(
            "urn:ietf:bcp:47",
            data.communication?.get(0)?.language?.coding?.get(0)?.system
        )
        assertEquals("Nederlands", data.communication?.get(0)?.language?.text)
        assertEquals("True".toBoolean(), data.communication?.get(0)?.preferred?.value)
        assertEquals("Abels", data.contact?.get(0)?.name?.family)
        assertEquals("Sarah", data.contact?.get(0)?.name?.given?.get(0))
        assertEquals(NameUse.USUAL, data.contact?.get(0)?.name?.use)
        assertEquals("C", data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0131",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(ContactPointSystem.PHONE, data.contact?.get(0)?.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.MOBILE, data.contact?.get(0)?.telecom?.get(0)?.use)
        assertEquals("0690383372", data.contact?.get(0)?.telecom?.get(0)?.value)
        assertEquals("False".toBoolean(), data.deceasedBoolean?.value)
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("f001", data.id)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.6.3", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(0)?.use)
        assertEquals("738472983", data.identifier?.get(0)?.value)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.6.3", data.identifier?.get(1)?.system)
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(1)?.use)
        assertEquals("Burgers University Medical Centre", data.managingOrganization?.display)
        assertEquals("Organization/f001", data.managingOrganization?.reference)
        assertEquals("M", data.maritalStatus?.coding?.get(0)?.code)
        assertEquals("Married", data.maritalStatus?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org/fhir/v3/MaritalStatus",
            data.maritalStatus?.coding?.get(0)?.system
        )
        assertEquals("Getrouwd", data.maritalStatus?.text)
        assertEquals("True".toBoolean(), data.multipleBirthBoolean?.value)
        assertEquals("van de Heuvel", data.name?.get(0)?.family)
        assertEquals("Pieter", data.name?.get(0)?.given?.get(0))
        assertEquals("MSc", data.name?.get(0)?.suffix?.get(0))
        assertEquals(NameUse.USUAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.MOBILE, data.telecom?.get(0)?.use)
        assertEquals("0648352638", data.telecom?.get(0)?.value)
        assertEquals(ContactPointSystem.EMAIL, data.telecom?.get(1)?.system)
        assertEquals(ContactPointUse.HOME, data.telecom?.get(1)?.use)
        assertEquals("p.heuvel@gmail.com", data.telecom?.get(1)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient3() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-d.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("1982-08-02", data.birthDate?.value.toString())
        assertEquals("True".toBoolean(), data.deceasedBoolean?.value)
        assertEquals(AdministrativeGender.FEMALE, data.gender)
        assertEquals("pat4", data.id)
        assertEquals("urn:oid:0.1.2.3.4.5.6.7", data.identifier?.get(0)?.system)
        assertEquals("MR", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(0)?.use)
        assertEquals("123458", data.identifier?.get(0)?.value)
        assertEquals("ACME Healthcare, Inc", data.managingOrganization?.display)
        assertEquals("Organization/1", data.managingOrganization?.reference)
        assertEquals("Notsowell", data.name?.get(0)?.family)
        assertEquals("Sandy", data.name?.get(0)?.given?.get(0))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient4() {
        // Given
        val sourceJson = loadAsString("stu3/patient-genetics-example1.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("2222 Home Street", data.address?.get(0)?.line?.get(0))
        assertEquals(AddressUse.HOME, data.address?.get(0)?.use)
        assertEquals("1973-05-31", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.FEMALE, data.gender)
        assertEquals("genetics-example1", data.id)
        assertEquals("http://hl7.org/fhir/sid/us-ssn", data.identifier?.get(0)?.system)
        assertEquals("SS", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals("444222222", data.identifier?.get(0)?.value)
        assertEquals("Organization/hl7", data.managingOrganization?.reference)
        assertEquals("2012-05-29T23:45:32Z", data.meta?.lastUpdated?.value.toString())
        assertEquals("Everywoman", data.name?.get(0)?.family)
        assertEquals("Eve", data.name?.get(0)?.given?.get(0))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("555-555-2003", data.telecom?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Ignore
    @Test
    fun testPatient5() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-b.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals(AdministrativeGender.OTHER, data.gender)
        assertEquals("pat2", data.id)
        assertEquals("urn:oid:0.1.2.3.4.5.6.7", data.identifier?.get(0)?.system)
        assertEquals("MR", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(0)?.use)
        assertEquals("123456", data.identifier?.get(0)?.value)
        assertEquals("Patient/pat1", data.link?.get(0)?.other?.reference)
        assertEquals(LinkType.SEEALSO, data.link?.get(0)?.type)
        assertEquals("ACME Healthcare, Inc", data.managingOrganization?.display)
        assertEquals("Organization/1", data.managingOrganization?.reference)
        assertEquals("Donald", data.name?.get(0)?.family)
        assertEquals("Duck", data.name?.get(0)?.given?.get(0))
        assertEquals("D", data.name?.get(0)?.given?.get(1))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals("image/gif", data.photo?.get(0)?.contentType)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient6() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-c.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("1982-01-23", data.birthDate?.value.toString())
        assertEquals("2015-02-14T13:42:00+10:00", data.deceasedDateTime?.value.toString())
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("pat3", data.id)
        assertEquals("urn:oid:0.1.2.3.4.5.6.7", data.identifier?.get(0)?.system)
        assertEquals("MR", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(0)?.use)
        assertEquals("123457", data.identifier?.get(0)?.value)
        assertEquals("ACME Healthcare, Inc", data.managingOrganization?.display)
        assertEquals("Organization/1", data.managingOrganization?.reference)
        assertEquals("Notsowell", data.name?.get(0)?.family)
        assertEquals("Simon", data.name?.get(0)?.given?.get(0))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient7() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-ihe-pcd.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("ihe-pcd", data.id)
        assertEquals("Internal Identifier", data.identifier?.get(0)?.type?.text)
        assertEquals("AB60001", data.identifier?.get(0)?.value)
        assertEquals("BROOKS", data.name?.get(0)?.family)
        assertEquals("ALBERT", data.name?.get(0)?.given?.get(0))
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Albert Brooks, Id: AB60001</div>",
            data.text?.div
        )
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Ignore
    @Test
    fun testPatient8() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("PleasantVille", data.address?.get(0)?.city)
        assertEquals("Rainbow", data.address?.get(0)?.district)
        assertEquals("534 Erewhon St", data.address?.get(0)?.line?.get(0))
        assertEquals("1974-12-25", data.address?.get(0)?.period?.start?.value.toString())
        assertEquals("3999", data.address?.get(0)?.postalCode)
        assertEquals("Vic", data.address?.get(0)?.state)
        assertEquals("534 Erewhon St PeasantVille, Rainbow, Vic  3999", data.address?.get(0)?.text)
        assertEquals(AddressType.BOTH, data.address?.get(0)?.type)
        assertEquals(AddressUse.HOME, data.address?.get(0)?.use)
        assertEquals("1974-12-25", data.birthDate?.value.toString())
        assertEquals("PleasantVille", data.contact?.get(0)?.address?.city)
        assertEquals("Rainbow", data.contact?.get(0)?.address?.district)
        assertEquals("534 Erewhon St", data.contact?.get(0)?.address?.line?.get(0))
        assertEquals("1974-12-25", data.contact?.get(0)?.address?.period?.start?.value.toString())
        assertEquals("3999", data.contact?.get(0)?.address?.postalCode)
        assertEquals("Vic", data.contact?.get(0)?.address?.state)
        assertEquals(AddressType.BOTH, data.contact?.get(0)?.address?.type)
        assertEquals(AddressUse.HOME, data.contact?.get(0)?.address?.use)
        assertEquals(AdministrativeGender.FEMALE, data.contact?.get(0)?.gender)
        assertEquals("du Marché", data.contact?.get(0)?.name?.family)
        assertEquals("Bénédicte", data.contact?.get(0)?.name?.given?.get(0))
        assertEquals("2012", data.contact?.get(0)?.period?.start?.value.toString())
        assertEquals("N", data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0131",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(ContactPointSystem.PHONE, data.contact?.get(0)?.telecom?.get(0)?.system)
        assertEquals("+33 (237) 998327", data.contact?.get(0)?.telecom?.get(0)?.value)
        assertEquals("False".toBoolean(), data.deceasedBoolean?.value)
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("example", data.id)
        assertEquals("Acme Healthcare", data.identifier?.get(0)?.assigner?.display)
        assertEquals("2001-05-06", data.identifier?.get(0)?.period?.start?.value.toString())
        assertEquals("urn:oid:1.2.36.146.595.217.0.1", data.identifier?.get(0)?.system)
        assertEquals("MR", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(0)?.use)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals("Organization/1", data.managingOrganization?.reference)
        assertEquals("Chalmers", data.name?.get(0)?.family)
        assertEquals("Peter", data.name?.get(0)?.given?.get(0))
        assertEquals("James", data.name?.get(0)?.given?.get(1))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals("Jim", data.name?.get(1)?.given?.get(0))
        assertEquals(NameUse.USUAL, data.name?.get(1)?.use)
        assertEquals("Windsor", data.name?.get(2)?.family)
        assertEquals("Peter", data.name?.get(2)?.given?.get(0))
        assertEquals("James", data.name?.get(2)?.given?.get(1))
        assertEquals("2002", data.name?.get(2)?.period?.end?.value.toString())
        assertEquals(NameUse.MAIDEN, data.name?.get(2)?.use)
        assertEquals(ContactPointUse.HOME, data.telecom?.get(0)?.use)
        assertEquals("1".toLong(), data.telecom?.get(1)?.rank?.value)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(1)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(1)?.use)
        assertEquals("(03) 5555 6473", data.telecom?.get(1)?.value)
        assertEquals("2".toLong(), data.telecom?.get(2)?.rank?.value)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(2)?.system)
        assertEquals(ContactPointUse.MOBILE, data.telecom?.get(2)?.use)
        assertEquals("(03) 3410 5613", data.telecom?.get(2)?.value)
        assertEquals("2014", data.telecom?.get(3)?.period?.end?.value.toString())
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(3)?.system)
        assertEquals(ContactPointUse.OLD, data.telecom?.get(3)?.use)
        assertEquals("(03) 5555 8834", data.telecom?.get(3)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient9() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-proband.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("1966-04-04", data.birthDate?.value.toString())
        assertEquals("False".toBoolean(), data.deceasedBoolean?.value)
        assertEquals(AdministrativeGender.FEMALE, data.gender)
        assertEquals("proband", data.id)
        assertEquals(
            "Boston Massachesetts General Hospital",
            data.identifier?.get(0)?.assigner?.display
        )
        assertEquals("urn:oid:2.16.840.1.113883.6.117", data.identifier?.get(0)?.system)
        assertEquals(
            "Computer-Stored Abulatory Records (COSTAR)",
            data.identifier?.get(0)?.type?.text
        )
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(0)?.use)
        assertEquals("999999999", data.identifier?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient10() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-f201-roel.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("Amsterdam", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Bos en Lommerplein 280", data.address?.get(0)?.line?.get(0))
        assertEquals("1055RW", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.HOME, data.address?.get(0)?.use)
        assertEquals("1960-03-13", data.birthDate?.value.toString())
        assertEquals("nl-NL", data.communication?.get(0)?.language?.coding?.get(0)?.code)
        assertEquals("Dutch", data.communication?.get(0)?.language?.coding?.get(0)?.display)
        assertEquals(
            "urn:ietf:bcp:47",
            data.communication?.get(0)?.language?.coding?.get(0)?.system
        )
        assertEquals("True".toBoolean(), data.communication?.get(0)?.preferred?.value)
        assertEquals("Ariadne Bor-Jansma", data.contact?.get(0)?.name?.text)
        assertEquals(NameUse.USUAL, data.contact?.get(0)?.name?.use)
        assertEquals("127850001", data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.code)
        assertEquals("Wife", data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://snomed.info/sct",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("N", data.contact?.get(0)?.relationship?.get(0)?.coding?.get(1)?.code)
        assertEquals(
            "http://hl7.org/fhir/v2/0131",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(1)?.system
        )
        assertEquals("WIFE", data.contact?.get(0)?.relationship?.get(0)?.coding?.get(2)?.code)
        assertEquals(
            "http://hl7.org/fhir/v3/RoleCode",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(2)?.system
        )
        assertEquals(ContactPointSystem.PHONE, data.contact?.get(0)?.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.HOME, data.contact?.get(0)?.telecom?.get(0)?.use)
        assertEquals("+31201234567", data.contact?.get(0)?.telecom?.get(0)?.value)
        assertEquals("False".toBoolean(), data.deceasedBoolean?.value)
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("f201", data.id)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.6.3", data.identifier?.get(0)?.system)
        assertEquals("BSN", data.identifier?.get(0)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("123456789", data.identifier?.get(0)?.value)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.6.3", data.identifier?.get(1)?.system)
        assertEquals("BSN", data.identifier?.get(1)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(1)?.use)
        assertEquals("123456789", data.identifier?.get(1)?.value)
        assertEquals("AUMC", data.managingOrganization?.display)
        assertEquals("Organization/f201", data.managingOrganization?.reference)
        assertEquals("36629006", data.maritalStatus?.coding?.get(0)?.code)
        assertEquals("Legally married", data.maritalStatus?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.maritalStatus?.coding?.get(0)?.system)
        assertEquals("M", data.maritalStatus?.coding?.get(1)?.code)
        assertEquals(
            "http://hl7.org/fhir/v3/MaritalStatus",
            data.maritalStatus?.coding?.get(1)?.system
        )
        assertEquals("False".toBoolean(), data.multipleBirthBoolean?.value)
        assertEquals("Bor", data.name?.get(0)?.family)
        assertEquals("Roelof Olaf", data.name?.get(0)?.given?.get(0))
        assertEquals("Drs.", data.name?.get(0)?.prefix?.get(0))
        assertEquals("PDEng.", data.name?.get(0)?.suffix?.get(0))
        assertEquals("Roel", data.name?.get(0)?.text)
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals("image/jpeg", data.photo?.get(0)?.contentType)
        assertEquals("Binary/f006", data.photo?.get(0)?.url)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.MOBILE, data.telecom?.get(0)?.use)
        assertEquals("+31612345678", data.telecom?.get(0)?.value)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(1)?.system)
        assertEquals(ContactPointUse.HOME, data.telecom?.get(1)?.use)
        assertEquals("+31201234567", data.telecom?.get(1)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
