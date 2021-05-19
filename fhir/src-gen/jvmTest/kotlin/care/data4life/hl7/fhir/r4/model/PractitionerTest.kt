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
 * PractitionerTest.java
 *
 * A person with a  formal responsibility in the provisioning of healthcare or related services
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PractitionerTest {

    val parser = FhirR4Parser()

    @Test
    fun testPractitioner01() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-f203-jvg.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner01Step01(data: Practitioner) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Den helder",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Walvisbaai 3",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2333ZA",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1983-04-20",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f203",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.528.1.1007.3.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UZI-nummer",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "12345678903",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.bigregister.nl/",
            actual = data.identifier?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BIG-nummer",
            actual = data.identifier?.get(1)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "12345678903",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
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
            expected = "Juri van Gelder",
            actual = data.name?.get(0)?.text
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
            expected = "+31715269111",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner02() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-f201-ab.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner02Step01(data: Practitioner) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Den helder",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Walvisbaai 3",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "C4 - Automatisering",
            actual = data.address?.get(0)?.line?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2333ZA",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1956-12-24",
            actual = data.birthDate?.value.toString()
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
            expected = "urn:oid:2.16.528.1.1007.3.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UZI-nummer",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "12345678901",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "Bronsig",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Arend",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr.",
            actual = data.name?.get(0)?.prefix?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dokter Bronsig",
            actual = data.name?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.OFFICIAL,
            actual = data.name?.get(0)?.use
        )

        assertEquals(
            expected = "41672002",
            actual = data.qualification?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pulmonologist",
            actual = data.qualification?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.qualification?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner03() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-f202-lm.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner03Step01(data: Practitioner) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "Den helder",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Walvisbaai 3",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "C4 - Automatisering",
            actual = data.address?.get(0)?.line?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2333ZA",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1960-06-12",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f202",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.528.1.1007.3.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UZI-nummer",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "12345678902",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.bigregister.nl/",
            actual = data.identifier?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BIG-nummer",
            actual = data.identifier?.get(1)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "12345678902",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
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
            expected = "Maas",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Luigi",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr.",
            actual = data.name?.get(0)?.prefix?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Luigi Maas",
            actual = data.name?.get(0)?.text
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
            expected = "+31715269111",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner04() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-xcda-author.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner04Step01(data: Practitioner) {

        assertEquals(
            expected = "xcda-author",
            actual = data.id
                ?.replace("\\n", " ")
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
            expected = "Hippocrates",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Harold",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MD",
            actual = data.name?.get(0)?.suffix?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner05() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-f003-mv.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner05Step01(data: Practitioner) {

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
            expected = "Galapagosweg 91",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1105 AZ",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1963-07-01",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = "nl",
            actual = data.communication?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dutch",
            actual = data.communication?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.communication?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f003",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.528.1.1007.3.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "846100293",
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
            expected = "243HID3RT938",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
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
            expected = "Versteegh",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Marc",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MD",
            actual = data.name?.get(0)?.suffix?.get(0)
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
            expected = "0205562431",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "m.versteegh@bmc.nl",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.FAX,
            actual = data.telecom?.get(2)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(2)?.use
        )

        assertEquals(
            expected = "0205662948",
            actual = data.telecom?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner06() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-f002-pv.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner06Step01(data: Practitioner) {

        assertEquals(
            expected = "Den Burg",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Galapagosweg 91",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9105 PZ",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1979-04-29",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f002",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.528.1.1007.3.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "730291637",
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
            expected = "174BIP3JH438",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
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
            expected = "Voigt",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Pieter",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MD",
            actual = data.name?.get(0)?.suffix?.get(0)
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
            expected = "0205569336",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "p.voigt@bmc.nl",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.FAX,
            actual = data.telecom?.get(2)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(2)?.use
        )

        assertEquals(
            expected = "0205669382",
            actual = data.telecom?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner07() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner07Step01(data: Practitioner) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "PleasantVille",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "534 Erewhon St",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3999",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vic",
            actual = data.address?.get(0)?.state
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.HOME,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.acme.org/practitioners",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "23",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "Careful",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Adam",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr",
            actual = data.name?.get(0)?.prefix?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BS",
            actual = data.qualification?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bachelor of Science",
            actual = data.qualification?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0360/2.7",
            actual = data.qualification?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bachelor of Science",
            actual = data.qualification?.get(0)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/UniversityIdentifier",
            actual = data.qualification?.get(0)?.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.qualification?.get(0)?.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example University",
            actual = data.qualification?.get(0)?.issuer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1995",
            actual = data.qualification?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner08() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-f007-sh.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner08Step01(data: Practitioner) {

        assertEquals(
            expected = "Den Burg",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Galapagosweg 91",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9105 PZ",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1971-11-07",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.FEMALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f007",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.528.1.1007.3.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "874635264",
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
            expected = "567IUI51C154",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
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
            expected = "Heps",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Simone",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MD",
            actual = data.name?.get(0)?.suffix?.get(0)
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
            expected = "020556936",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "S.M.Heps@bmc.nl",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.FAX,
            actual = data.telecom?.get(2)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(2)?.use
        )

        assertEquals(
            expected = "0205669283",
            actual = data.telecom?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner09() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-f204-ce.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner09Step01(data: Practitioner) {

        assertEquals(
            expected = "Den helder",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NLD",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Walvisbaai 3",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2333ZA",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AddressUse.WORK,
            actual = data.address?.get(0)?.use
        )

        assertEquals(
            expected = "1967-11-05",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.FEMALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f204",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.528.1.1007.3.1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UZI-nummer",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "12345678904",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "Carla Espinosa",
            actual = data.name?.get(0)?.text
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
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "+31715262169",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testPractitioner10() {
        // Given
        val sourceJson = loadAsString("r4/practitioner-example-xcda1.json")

        // When
        val data = parser.toFhir(Practitioner::class, sourceJson)

        // Then
        assertPractitioner10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPractitioner10Step01(data: Practitioner) {

        assertEquals(
            expected = "xcda1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://healthcare.example.org/identifiers/staff",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "D234123",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "Dopplemeyer",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sherry",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "john.doe@healthcare.example.org",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
