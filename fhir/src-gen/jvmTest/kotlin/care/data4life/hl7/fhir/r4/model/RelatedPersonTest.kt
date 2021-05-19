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
class RelatedPersonTest {

    val parser = FhirR4Parser()

    @Test
    fun testRelatedPerson01() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-peter.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertEquals(
            "PleasantVille",
            data.address?.get(0)?.city
        )
        assertEquals(
            "534 Erewhon St",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "3999",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            "Vic",
            data.address?.get(0)?.state
        )
        assertEquals(
            AddressUse.HOME,
            data.address?.get(0)?.use
        )
        assertEquals(
            AdministrativeGender.MALE,
            data.gender
        )
        assertEquals(
            "peter",
            data.id
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
            "Chalmers",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Peter",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            "James",
            data.name?.get(0)?.given?.get(1)
        )
        assertEquals(
            NameUse.OFFICIAL,
            data.name?.get(0)?.use
        )
        assertEquals(
            "Patient/animal",
            data.patient?.reference
        )
        assertEquals(
            "2012-03-11",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "image/jpeg",
            data.photo?.get(0)?.contentType
        )
        assertEquals(
            "Binary/f012",
            data.photo?.get(0)?.url
        )
        assertEquals(
            "C",
            data.relationship?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0131",
            data.relationship?.get(0)?.coding?.get(0)?.system
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
            "(03) 5555 6473",
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
    fun testRelatedPerson02() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-f001-sarah.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertEquals(
            AdministrativeGender.FEMALE,
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
            "BSN",
            data.identifier?.get(0)?.type?.text
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
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
            "Abels",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Sarah",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            NameUse.USUAL,
            data.name?.get(0)?.use
        )
        assertEquals(
            "Patient/f001",
            data.patient?.reference
        )
        assertEquals(
            "SIGOTHR",
            data.relationship?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            data.relationship?.get(0)?.coding?.get(0)?.system
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
            "0690383372",
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
            "s.abels@kpn.nl",
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
    fun testRelatedPerson03() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-newborn-mom.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

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
            "newborn-mom",
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
            "Patient/newborn",
            data.patient?.reference
        )
        assertEquals(
            "NMTH",
            data.relationship?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "natural mother",
            data.relationship?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            data.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Natural Mother",
            data.relationship?.get(0)?.text
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

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testRelatedPerson04() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "Paris",
            data.address?.get(0)?.city
        )
        assertEquals(
            "FRA",
            data.address?.get(0)?.country
        )
        assertEquals(
            "43, Place du Marché Sainte Catherine",
            data.address?.get(0)?.line?.get(0)
        )
        assertEquals(
            "75004",
            data.address?.get(0)?.postalCode
        )
        assertEquals(
            AdministrativeGender.FEMALE,
            data.gender
        )
        assertEquals(
            "benedicte",
            data.id
        )
        assertEquals(
            "urn:oid:1.2.250.1.61",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "INSEE",
            data.identifier?.get(0)?.type?.text
        )
        assertEquals(
            IdentifierUse.USUAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "272117510400399",
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
            "du Marché",
            data.name?.get(0)?.family
        )
        assertEquals(
            "Bénédicte",
            data.name?.get(0)?.given?.get(0)
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "image/jpeg",
            data.photo?.get(0)?.contentType
        )
        assertEquals(
            "Binary/f016",
            data.photo?.get(0)?.url
        )
        assertEquals(
            "N",
            data.relationship?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0131",
            data.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "WIFE",
            data.relationship?.get(0)?.coding?.get(1)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            data.relationship?.get(0)?.coding?.get(1)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            "+33 (237) 998327",
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
    fun testRelatedPerson05() {
        // Given
        val sourceJson = loadAsString("r4/relatedperson-example-f002-ariadne.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertEquals(
            "1963",
            data.birthDate?.value.toString()
        )
        assertEquals(
            AdministrativeGender.FEMALE,
            data.gender
        )
        assertEquals(
            "f002",
            data.id
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
            "Ariadne Bor-Jansma",
            data.name?.get(0)?.text
        )
        assertEquals(
            NameUse.USUAL,
            data.name?.get(0)?.use
        )
        assertEquals(
            "Patient/f201",
            data.patient?.reference
        )
        assertEquals(
            "1975",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "image/jpeg",
            data.photo?.get(0)?.contentType
        )
        assertEquals(
            "SIGOTHR",
            data.relationship?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RoleCode",
            data.relationship?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.HOME,
            data.telecom?.get(0)?.use
        )
        assertEquals(
            "+31201234567",
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
