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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * PractitionerTest.java
 *
 * A person with a  formal responsibility in the provisioning of healthcare or related services.
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class PractitionerTest {

    val parser = FhirStu3Parser()


    @Test
    fun testPractitioner1() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-f203-jvg.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("Den helder", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Walvisbaai 3", data.address?.get(0)?.line?.get(0))
        assertEquals("2333ZA", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.get(0)?.use)
        assertEquals("1983-04-20", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("f203", data.id)
        assertEquals("urn:oid:2.16.528.1.1007.3.1", data.identifier?.get(0)?.system)
        assertEquals("UZI-nummer", data.identifier?.get(0)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("12345678903", data.identifier?.get(0)?.value)
        assertEquals("https://www.bigregister.nl/", data.identifier?.get(1)?.system)
        assertEquals("BIG-nummer", data.identifier?.get(1)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(1)?.use)
        assertEquals("12345678903", data.identifier?.get(1)?.value)
        assertEquals("Juri van Gelder", data.name?.get(0)?.text)
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("+31715269111", data.telecom?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner2() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-f201-ab.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("Den helder", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Walvisbaai 3", data.address?.get(0)?.line?.get(0))
        assertEquals("C4 - Automatisering", data.address?.get(0)?.line?.get(1))
        assertEquals("2333ZA", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.get(0)?.use)
        assertEquals("1956-12-24", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("f201", data.id)
        assertEquals("urn:oid:2.16.528.1.1007.3.1", data.identifier?.get(0)?.system)
        assertEquals("UZI-nummer", data.identifier?.get(0)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("12345678901", data.identifier?.get(0)?.value)
        assertEquals("Bronsig", data.name?.get(0)?.family)
        assertEquals("Arend", data.name?.get(0)?.given?.get(0))
        assertEquals("Dr.", data.name?.get(0)?.prefix?.get(0))
        assertEquals("Dokter Bronsig", data.name?.get(0)?.text)
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals("41672002", data.qualification?.get(0)?.code?.coding?.get(0)?.code)
        assertEquals("Pulmonologist", data.qualification?.get(0)?.code?.coding?.get(0)?.display)
        assertEquals(
            "http://snomed.info/sct",
            data.qualification?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("+31715269111", data.telecom?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner3() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-f202-lm.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("Den helder", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Walvisbaai 3", data.address?.get(0)?.line?.get(0))
        assertEquals("C4 - Automatisering", data.address?.get(0)?.line?.get(1))
        assertEquals("2333ZA", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.get(0)?.use)
        assertEquals("1960-06-12", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("f202", data.id)
        assertEquals("urn:oid:2.16.528.1.1007.3.1", data.identifier?.get(0)?.system)
        assertEquals("UZI-nummer", data.identifier?.get(0)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("12345678902", data.identifier?.get(0)?.value)
        assertEquals("https://www.bigregister.nl/", data.identifier?.get(1)?.system)
        assertEquals("BIG-nummer", data.identifier?.get(1)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(1)?.use)
        assertEquals("12345678902", data.identifier?.get(1)?.value)
        assertEquals("Maas", data.name?.get(0)?.family)
        assertEquals("Luigi", data.name?.get(0)?.given?.get(0))
        assertEquals("Dr.", data.name?.get(0)?.prefix?.get(0))
        assertEquals("Luigi Maas", data.name?.get(0)?.text)
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("+31715269111", data.telecom?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner4() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-xcda-author.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("xcda-author", data.id)
        assertEquals("Hippocrates", data.name?.get(0)?.family)
        assertEquals("Harold", data.name?.get(0)?.given?.get(0))
        assertEquals("MD", data.name?.get(0)?.suffix?.get(0))
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner5() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-f003-mv.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("Amsterdam", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Galapagosweg 91", data.address?.get(0)?.line?.get(0))
        assertEquals("1105 AZ", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.get(0)?.use)
        assertEquals("1963-07-01", data.birthDate?.value.toString())
        assertEquals("nl", data.communication?.get(0)?.coding?.get(0)?.code)
        assertEquals("Dutch", data.communication?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "urn:oid:2.16.840.1.113883.6.121",
            data.communication?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("f003", data.id)
        assertEquals("urn:oid:2.16.528.1.1007.3.1", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("846100293", data.identifier?.get(0)?.value)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.6.3", data.identifier?.get(1)?.system)
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(1)?.use)
        assertEquals("243HID3RT938", data.identifier?.get(1)?.value)
        assertEquals("Versteegh", data.name?.get(0)?.family)
        assertEquals("Marc", data.name?.get(0)?.given?.get(0))
        assertEquals("MD", data.name?.get(0)?.suffix?.get(0))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("0205562431", data.telecom?.get(0)?.value)
        assertEquals(ContactPointSystem.EMAIL, data.telecom?.get(1)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(1)?.use)
        assertEquals("m.versteegh@bmc.nl", data.telecom?.get(1)?.value)
        assertEquals(ContactPointSystem.FAX, data.telecom?.get(2)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(2)?.use)
        assertEquals("0205662948", data.telecom?.get(2)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner6() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-f002-pv.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("Den Burg", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Galapagosweg 91", data.address?.get(0)?.line?.get(0))
        assertEquals("9105 PZ", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.get(0)?.use)
        assertEquals("1979-04-29", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.MALE, data.gender)
        assertEquals("f002", data.id)
        assertEquals("urn:oid:2.16.528.1.1007.3.1", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("730291637", data.identifier?.get(0)?.value)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.6.3", data.identifier?.get(1)?.system)
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(1)?.use)
        assertEquals("174BIP3JH438", data.identifier?.get(1)?.value)
        assertEquals("Voigt", data.name?.get(0)?.family)
        assertEquals("Pieter", data.name?.get(0)?.given?.get(0))
        assertEquals("MD", data.name?.get(0)?.suffix?.get(0))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("0205569336", data.telecom?.get(0)?.value)
        assertEquals(ContactPointSystem.EMAIL, data.telecom?.get(1)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(1)?.use)
        assertEquals("p.voigt@bmc.nl", data.telecom?.get(1)?.value)
        assertEquals(ContactPointSystem.FAX, data.telecom?.get(2)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(2)?.use)
        assertEquals("0205669382", data.telecom?.get(2)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner7() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("True".toBoolean(), data.active?.value)
        assertEquals("PleasantVille", data.address?.get(0)?.city)
        assertEquals("534 Erewhon St", data.address?.get(0)?.line?.get(0))
        assertEquals("3999", data.address?.get(0)?.postalCode)
        assertEquals("Vic", data.address?.get(0)?.state)
        assertEquals(AddressUse.HOME, data.address?.get(0)?.use)
        assertEquals("example", data.id)
        assertEquals("http://www.acme.org/practitioners", data.identifier?.get(0)?.system)
        assertEquals("23", data.identifier?.get(0)?.value)
        assertEquals("Careful", data.name?.get(0)?.family)
        assertEquals("Adam", data.name?.get(0)?.given?.get(0))
        assertEquals("Dr", data.name?.get(0)?.prefix?.get(0))
        assertEquals("BS", data.qualification?.get(0)?.code?.coding?.get(0)?.code)
        assertEquals(
            "Bachelor of Science",
            data.qualification?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/v2/0360/2.7",
            data.qualification?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals("Bachelor of Science", data.qualification?.get(0)?.code?.text)
        assertEquals(
            "http://example.org/UniversityIdentifier",
            data.qualification?.get(0)?.identifier?.get(0)?.system
        )
        assertEquals("12345", data.qualification?.get(0)?.identifier?.get(0)?.value)
        assertEquals("Example University", data.qualification?.get(0)?.issuer?.display)
        assertEquals("1995", data.qualification?.get(0)?.period?.start?.value.toString())
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner8() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-f007-sh.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("Den Burg", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Galapagosweg 91", data.address?.get(0)?.line?.get(0))
        assertEquals("9105 PZ", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.get(0)?.use)
        assertEquals("1971-11-07", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.FEMALE, data.gender)
        assertEquals("f007", data.id)
        assertEquals("urn:oid:2.16.528.1.1007.3.1", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("874635264", data.identifier?.get(0)?.value)
        assertEquals("urn:oid:2.16.840.1.113883.2.4.6.3", data.identifier?.get(1)?.system)
        assertEquals(IdentifierUse.USUAL, data.identifier?.get(1)?.use)
        assertEquals("567IUI51C154", data.identifier?.get(1)?.value)
        assertEquals("Heps", data.name?.get(0)?.family)
        assertEquals("Simone", data.name?.get(0)?.given?.get(0))
        assertEquals("MD", data.name?.get(0)?.suffix?.get(0))
        assertEquals(NameUse.OFFICIAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("020556936", data.telecom?.get(0)?.value)
        assertEquals(ContactPointSystem.EMAIL, data.telecom?.get(1)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(1)?.use)
        assertEquals("S.M.Heps@bmc.nl", data.telecom?.get(1)?.value)
        assertEquals(ContactPointSystem.FAX, data.telecom?.get(2)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(2)?.use)
        assertEquals("0205669283", data.telecom?.get(2)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner9() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-f204-ce.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("Den helder", data.address?.get(0)?.city)
        assertEquals("NLD", data.address?.get(0)?.country)
        assertEquals("Walvisbaai 3", data.address?.get(0)?.line?.get(0))
        assertEquals("2333ZA", data.address?.get(0)?.postalCode)
        assertEquals(AddressUse.WORK, data.address?.get(0)?.use)
        assertEquals("1967-11-05", data.birthDate?.value.toString())
        assertEquals(AdministrativeGender.FEMALE, data.gender)
        assertEquals("f204", data.id)
        assertEquals("urn:oid:2.16.528.1.1007.3.1", data.identifier?.get(0)?.system)
        assertEquals("UZI-nummer", data.identifier?.get(0)?.type?.text)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("12345678904", data.identifier?.get(0)?.value)
        assertEquals("Carla Espinosa", data.name?.get(0)?.text)
        assertEquals(NameUse.USUAL, data.name?.get(0)?.use)
        assertEquals(ContactPointSystem.PHONE, data.telecom?.get(0)?.system)
        assertEquals(ContactPointUse.WORK, data.telecom?.get(0)?.use)
        assertEquals("+31715262169", data.telecom?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPractitioner10() {
        // Given
        val sourceJson = loadAsString("stu3/practitioner-example-xcda1.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then

        assertEquals("xcda1", data.id)
        assertEquals(
            "http://healthcare.example.org/identifiers/staff",
            data.identifier?.get(0)?.system
        )
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("D234123", data.identifier?.get(0)?.value)
        assertEquals("Dopplemeyer", data.name?.get(0)?.family)
        assertEquals("Sherry", data.name?.get(0)?.given?.get(0))
        assertEquals(ContactPointSystem.EMAIL, data.telecom?.get(0)?.system)
        assertEquals("john.doe@healthcare.example.org", data.telecom?.get(0)?.value)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}


