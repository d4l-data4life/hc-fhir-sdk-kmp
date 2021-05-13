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
import care.data4life.hl7.fhir.r4.codesystem.AdministrativeGender
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
 * PatientTest.java
 *
 * Information about an individual or animal receiving health care services
 *
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PatientTest {

    val parser = FhirR4Parser()

    @Test
    fun testPatient01() {
        // Given
        val sourceJson = loadAsString("r4/patient-example-xds.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Metropolis",
            data.address?.get(0)?.city
        )
        assertEquals(
            "USA",
            data.address?.get(0)?.country
        )
        assertEquals(
            "100 Main St",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "44130",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            "Il",
            data.address?.get(0)?.state
        )
        assertEquals(
            "1956-05-27",
            data.birthDate?.value.toString()
        )
        assertEquals(
            AdministrativeGender.MALE,
            data.gender
        )
        assertEquals(
            "xds",
            data.id
        )
        assertEquals(
            "urn:oid:1.2.3.4.5",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "MR",
            data.identifier?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "89765a87b",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Organization/2",
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
            "Doe",
            data.name?.get(0)?.family
        )
        assertEquals(
            "John",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient02() {
        // Given
        val sourceJson = loadAsString("r4/patient-example-f001-pieter.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Amsterdam",
            data.address?.get(0)?.city
        )
        assertEquals(
            "NLD",
            data.address?.get(0)?.country
        )
        assertEquals(
            "Van Egmondkade 23",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "1024 RJ",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            AddressUse.HOME,
            data.address?.get(0)?.use
        )
        assertEquals(
            "1944-11-17",
            data.birthDate?.value.toString()
        )
        assertEquals(
            "nl",
            data.communication?.get(0)?.language?.coding?.get(0)?.code
        )
        assertEquals(
            "Dutch",
            data.communication?.get(0)?.language?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:ietf:bcp:47",
            data.communication?.get(0)?.language?.coding?.get(0)?.system
        )
        assertEquals(
            "Nederlands",
            data.communication?.get(0)?.language?.text
        )
        assertEquals(
            "True".toBoolean(),
            data.communication?.get(0)?.preferred?.value
        )
        assertEquals(
            "Abels",
            data.contact?.get(0)?.name?.family
        )
        assertEquals(
            "Sarah",
            data.contact?.get(0)?.name?.given?.get(0)
        )
        assertEquals(
            NameUse.USUAL,
            data.contact?.get(0)?.name?.use
        )
        assertEquals(
            "C",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0131",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.MOBILE,
            data.contact?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "0690383372",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "False".toBoolean(),
            data.deceasedBoolean?.value
        )
        assertEquals(
            AdministrativeGender.MALE,
            data.gender
        )
        assertEquals(
            "f001",
            data.id
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.2.4.6.3",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "738472983",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.2.4.6.3",
            data.identifier?.get(1)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(1)?.use
        )
        assertEquals(
            "Burgers University Medical Centre",
            data.managingOrganization?.display
        )
        assertEquals(
            "Organization/f001",
            data.managingOrganization?.reference
        )
        assertEquals(
            "M",
            data.maritalStatus?.coding?.get(0)?.code
        )
        assertEquals(
            "Married",
            data.maritalStatus?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
            data.maritalStatus?.coding?.get(0)?.system
        )
        assertEquals(
            "Getrouwd",
            data.maritalStatus?.text
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
            "True".toBoolean(),
            data.multipleBirthBoolean?.value
        )
        assertEquals(
            "van de Heuvel",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Pieter",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            "MSc",
            data.name?.get(0)?.suffix?.get(0)
        )
        assertEquals(
            NameUse.USUAL,
            data.name?.get(0)?.use
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
            "0648352638",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.HOME,
            data.telecom?.get(1)?.use
        )
        assertEquals(
            "p.heuvel@gmail.com",
            data.telecom?.get(1)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient03() {
        // Given
        val sourceJson = loadAsString("r4/patient-example-d.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "1982-08-02",
            data.birthDate?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.deceasedBoolean?.value
        )
        assertEquals(
            AdministrativeGender.FEMALE,
            data.gender
        )
        assertEquals(
            "pat4",
            data.id
        )
        assertEquals(
            "urn:oid:0.1.2.3.4.5.6.7",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "MR",
            data.identifier?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "123458",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "ACME Healthcare, Inc",
            data.managingOrganization?.display
        )
        assertEquals(
            "Organization/1",
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
            "Notsowell",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Sandy",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            NameUse.OFFICIAL,
            data.name?.get(0)?.use
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient04() {
        // FIXME Test disabled due to issues with patient-example-infant-twin-1.json
        // REASON - Property _birthDate is not supported
        assertEquals(true, true)
    }

    @Test
    fun testPatient05() {
        // Given
        val sourceJson = loadAsString("r4/patient-example-infant-mom.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertEquals(
            "1995-10-12",
            data.birthDate?.value.toString()
        )
        assertEquals(
            AdministrativeGender.FEMALE,
            data.gender
        )
        assertEquals(
            "Too-Onebee",
            data.generalPractitioner?.get(0)?.display
        )
        assertEquals(
            "Practitioner/21B",
            data.generalPractitioner?.get(0)?.reference
        )
        assertEquals(
            "infant-mom",
            data.id
        )
        assertEquals(
            "M",
            data.maritalStatus?.coding?.get(0)?.code
        )
        assertEquals(
            "Married",
            data.maritalStatus?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus",
            data.maritalStatus?.coding?.get(0)?.system
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
            "Solo",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Leia",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            NameUse.OFFICIAL,
            data.name?.get(0)?.use
        )
        assertEquals(
            "Organa",
            data.name?.get(1)?.family
        )
        assertEquals(
            "Leia",
            data.name?.get(1)?.given?.get(0)
        )
        assertEquals(
            NameUse.MAIDEN,
            data.name?.get(1)?.use
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient06() {
        // FIXME Test disabled due to issues with patient-example-newborn.json
        // REASON - Property _birthDate is not supported
        assertEquals(true, true)
    }

    @Test
    fun testPatient07() {
        // Given
        val sourceJson = loadAsString("r4/patient-example-infant-fetal.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertEquals(
            "Organa",
            data.contact?.get(0)?.name?.family
        )
        assertEquals(
            "Leia",
            data.contact?.get(0)?.name?.given?.get(0)
        )
        assertEquals(
            NameUse.MAIDEN,
            data.contact?.get(0)?.name?.use
        )
        assertEquals(
            "72705000",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Mother",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "N",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0131",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            "MTH",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(2)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            data.contact?.get(0)?.relationship?.get(0)?.coding?.get(2)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.MOBILE,
            data.contact?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "+31201234567",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/patient-mothersMaidenName",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "Organa",
            data.extension?.get(0)?.valueString
        )
        assertEquals(
            AdministrativeGender.MALE,
            data.gender
        )
        assertEquals(
            "infant-fetal",
            data.id
        )
        assertEquals(
            "http://coruscanthealth.org/main-hospital/patient-identifier",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "MR",
            data.identifier?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "MRN657865757378",
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient08() {
        // Given
        val sourceJson = loadAsString("r4/patient-genetics-example1.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "2222 Home Street",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            AddressUse.HOME,
            data.address?.get(0)?.use
        )
        assertEquals(
            "1973-05-31",
            data.birthDate?.value.toString()
        )
        assertEquals(
            AdministrativeGender.FEMALE,
            data.gender
        )
        assertEquals(
            "genetics-example1",
            data.id
        )
        assertEquals(
            "http://hl7.org/fhir/sid/us-ssn",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "SS",
            data.identifier?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "444222222",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Organization/hl7",
            data.managingOrganization?.reference
        )
        assertEquals(
            "2012-05-29T23:45:32Z",
            data.meta?.lastUpdated?.value.toString()
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
            "Everywoman",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Eve",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            NameUse.OFFICIAL,
            data.name?.get(0)?.use
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
            "555-555-2003",
            data.telecom?.get(0)?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPatient09() {
        // FIXME Test disabled due to issues with patient-example-b.json
        // REASON - Property _gender is not supported
        assertEquals(true, true)
    }

    @Test
    fun testPatient10() {
        // Given
        val sourceJson = loadAsString("r4/patient-example-c.json")

        // When
        val data = parser.toFhir(Patient::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "1982-01-23",
            data.birthDate?.value.toString()
        )
        assertEquals(
            "2015-02-14T13:42:00+10:00",
            data.deceasedDateTime?.value.toString()
        )
        assertEquals(
            AdministrativeGender.MALE,
            data.gender
        )
        assertEquals(
            "pat3",
            data.id
        )
        assertEquals(
            "urn:oid:0.1.2.3.4.5.6.7",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "MR",
            data.identifier?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "123457",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "ACME Healthcare, Inc",
            data.managingOrganization?.display
        )
        assertEquals(
            "Organization/1",
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
            "Notsowell",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Simon",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            NameUse.OFFICIAL,
            data.name?.get(0)?.use
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When reverse
        val json = parser.fromFhir(data)

        // Then reverse
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
