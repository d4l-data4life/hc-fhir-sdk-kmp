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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * RelatedPersonTest.java
 *
 * A person that is related to a patient, but who is not a direct target of care
 *
 * Information about a person that is involved in the care for a patient, but who is not the target of
 * healthcare, nor has a formal responsibility in the care process.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class RelatedPersonFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testRelatedPerson01() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-peter.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertRelatedPerson01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRelatedPerson01Step01(data: RelatedPerson) {
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
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "peter",
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
            expected = "Chalmers",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "James",
            actual = data.name?.get(0)?.given?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.OFFICIAL,
            actual = data.name?.get(0)?.use
        )

        assertEquals(
            expected = "Patient/animal",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-03-11",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "image/jpeg",
            actual = data.photo?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Binary/f012",
            actual = data.photo?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "C",
            actual = data.relationship?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0131",
            actual = data.relationship?.get(0)?.coding?.get(0)?.system
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
            expected = "(03) 5555 6473",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRelatedPerson02() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-f001-sarah.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertRelatedPerson02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRelatedPerson02Step01(data: RelatedPerson) {
        assertEquals(
            expected = AdministrativeGender.FEMALE,
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
            expected = "BSN",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
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
            expected = "Abels",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sarah",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.USUAL,
            actual = data.name?.get(0)?.use
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SIGOTHR",
            actual = data.relationship?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.relationship?.get(0)?.coding?.get(0)?.system
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
            expected = "0690383372",
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
            expected = "s.abels@kpn.nl",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRelatedPerson03() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-newborn-mom.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertRelatedPerson03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRelatedPerson03Step01(data: RelatedPerson) {
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
            expected = "newborn-mom",
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
            expected = "http://terminology.hl7.org/CodeSystem/v2-0203",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "444222222",
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
            expected = "Patient/newborn",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NMTH",
            actual = data.relationship?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "natural mother",
            actual = data.relationship?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.relationship?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Natural Mother",
            actual = data.relationship?.get(0)?.text
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
    fun testRelatedPerson04() {
        // FIXME Test disabled due to issues with relatedperson-example.json
        // REASON - Property _family is not supported yet
        assertEquals(expected = true, actual = true)
    }

    @Test
    fun testRelatedPerson05() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-f002-ariadne.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertRelatedPerson05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRelatedPerson05Step01(data: RelatedPerson) {
        assertEquals(
            expected = "1963",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.FEMALE,
            actual = data.gender
        )

        assertEquals(
            expected = "f002",
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
            expected = "Ariadne Bor-Jansma",
            actual = data.name?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.USUAL,
            actual = data.name?.get(0)?.use
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1975",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "image/jpeg",
            actual = data.photo?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SIGOTHR",
            actual = data.relationship?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            actual = data.relationship?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.HOME,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "+31201234567",
            actual = data.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
