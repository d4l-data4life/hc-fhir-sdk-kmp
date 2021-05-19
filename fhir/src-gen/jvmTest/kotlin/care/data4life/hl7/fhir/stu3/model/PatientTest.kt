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
import care.data4life.hl7.fhir.stu3.codesystem.AdministrativeGender
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
 * PatientTest.java
 *
 * Information about an individual or animal receiving health care services
 *
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PatientTest {

    val parser = FhirStu3Parser()

    @Test
    fun testPatient01() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-xds.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient01Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Metropolis",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USA",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100 Main St",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44130",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Il",
            actual = data.address?.get(0)?.state
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1956-05-27",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "xds",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.3.4.5",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MR",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0203",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "89765a87b",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.managingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Doe",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "John",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPatient02() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-f001-pieter.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient02Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Amsterdam",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Van Egmondkade 23",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1024 RJ",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.HOME,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1944-11-17",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = "nl",
            actual = data.communication?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dutch",
            actual = data.communication?.get(0)?.language?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.communication?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nederlands",
            actual = data.communication?.get(0)?.language?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.communication?.get(0)?.preferred?.value
        )

        assertEquals(
            expected = "Abels",
            actual = data.contact?.get(0)?.name?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sarah",
            actual = data.contact?.get(0)?.name?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.USUAL,
            actual = data.contact?.get(0)?.name?.use
        )

        assertEquals(
            expected = "C",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0131",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.MOBILE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "0690383372",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.deceasedBoolean?.value
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f001",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.6.3",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "738472983",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.6.3",
            actual = data.identifier?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "Burgers University Medical Centre",
            actual = data.managingOrganization?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.managingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "M",
            actual = data.maritalStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Married",
            actual = data.maritalStatus?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/MaritalStatus",
            actual = data.maritalStatus?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Getrouwd",
            actual = data.maritalStatus?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.multipleBirthBoolean?.value
        )

        assertEquals(
            expected = "van de Heuvel",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pieter",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MSc",
            actual = data.name?.get(0)?.suffix?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.USUAL,
            actual = data.name?.get(0)?.use
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
            expected = "0648352638",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.HOME,
            actual = data.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "p.heuvel@gmail.com",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPatient03() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-d.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient03Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "1982-08-02",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.deceasedBoolean?.value
        )

        assertEquals(
            expected = AdministrativeGender.FEMALE,
            actual = data.gender
        )

        assertEquals(
            expected = "pat4",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:0.1.2.3.4.5.6.7",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MR",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0203",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "123458",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACME Healthcare, Inc",
            actual = data.managingOrganization?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.managingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Notsowell",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sandy",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.OFFICIAL,
            actual = data.name?.get(0)?.use
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPatient04() {
        // Given
        val sourceJson = loadAsString("stu3/patient-genetics-example1.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient04Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "2222 Home Street",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.HOME,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1973-05-31",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.FEMALE,
            actual = data.gender
        )

        assertEquals(
            expected = "genetics-example1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/us-ssn",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SS",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0203",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "444222222",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.managingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-05-29T23:45:32Z",
            actual = data.meta?.lastUpdated?.value.toString()
        )

        assertEquals(
            expected = "Everywoman",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Eve",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.OFFICIAL,
            actual = data.name?.get(0)?.use
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
            expected = "555-555-2003",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPatient05() {
        // FIXME Test disabled due to issues with patient-example-b.json
        // REASON - Property _gender is not supported
        assertEquals(true, true)
    }

    @Test
    fun testPatient06() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-c.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient06Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "1982-01-23",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = "2015-02-14T13:42:00+10:00",
            actual = data.deceasedDateTime?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "pat3",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:0.1.2.3.4.5.6.7",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MR",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0203",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "123457",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACME Healthcare, Inc",
            actual = data.managingOrganization?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.managingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Notsowell",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Simon",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.OFFICIAL,
            actual = data.name?.get(0)?.use
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPatient07() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-ihe-pcd.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient07Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "ihe-pcd",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Internal Identifier",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AB60001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BROOKS",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ALBERT",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Albert Brooks, Id: AB60001</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPatient08() {
        // FIXME Test disabled due to issues with patient-example.json
        // REASON - Properties _birthDate and _family are not supported
        assertEquals(true, true)
    }

    @Test
    fun testPatient09() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-proband.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient09Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "1966-04-04",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.deceasedBoolean?.value
        )

        assertEquals(
            expected = AdministrativeGender.FEMALE,
            actual = data.gender
        )

        assertEquals(
            expected = "proband",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Boston Massachesetts General Hospital",
            actual = data.identifier?.get(0)?.assigner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.6.117",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Computer-Stored Abulatory Records (COSTAR)",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "999999999",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPatient10() {
        // Given
        val sourceJson = loadAsString("stu3/patient-example-f201-roel.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertPatient10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPatient10Step01(data: Patient) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Amsterdam",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bos en Lommerplein 280",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1055RW",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.HOME,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1960-03-13",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = "nl-NL",
            actual = data.communication?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dutch",
            actual = data.communication?.get(0)?.language?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.communication?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.communication?.get(0)?.preferred?.value
        )

        assertEquals(
            expected = "Ariadne Bor-Jansma",
            actual = data.contact?.get(0)?.name?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.USUAL,
            actual = data.contact?.get(0)?.name?.use
        )

        assertEquals(
            expected = "127850001",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Wife",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0131",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WIFE",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/RoleCode",
            actual = data.contact?.get(0)?.relationship?.get(0)?.coding?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.HOME,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "+31201234567",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.deceasedBoolean?.value
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.6.3",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BSN",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "123456789",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.6.3",
            actual = data.identifier?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BSN",
            actual = data.identifier?.get(1)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "123456789",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AUMC",
            actual = data.managingOrganization?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f201",
            actual = data.managingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "36629006",
            actual = data.maritalStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Legally married",
            actual = data.maritalStatus?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.maritalStatus?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "M",
            actual = data.maritalStatus?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/MaritalStatus",
            actual = data.maritalStatus?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.multipleBirthBoolean?.value
        )

        assertEquals(
            expected = "Bor",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Roelof Olaf",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Drs.",
            actual = data.name?.get(0)?.prefix?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PDEng.",
            actual = data.name?.get(0)?.suffix?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Roel",
            actual = data.name?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.OFFICIAL,
            actual = data.name?.get(0)?.use
        )

        assertEquals(
            expected = "image/jpeg",
            actual = data.photo?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Binary/f006",
            actual = data.photo?.get(0)?.url
                ?.replace("\\n", " ")
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
            expected = "+31612345678",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.HOME,
            actual = data.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "+31201234567",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
