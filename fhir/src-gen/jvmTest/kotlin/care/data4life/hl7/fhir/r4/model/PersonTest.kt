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
 * PersonTest.java
 *
 * A generic person record
 *
 * Demographics and administrative information about a person independent of a specific health-related
 * context.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PersonTest {

    val parser = FhirR4Parser()

    @Test
    fun testPerson01() {
        // Given
        val sourceJson = loadAsString("r4/person-example-f002-ariadne.json")

        // When
        val data = parser.toFhir(Person::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
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
            "Ariadne Bor-Jansma",
            data.link?.get(0)?.target?.display
        )
        assertEquals(
            "RelatedPerson/f002",
            data.link?.get(0)?.target?.reference
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
            "image/jpeg",
            data.photo?.contentType
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

    @Test
    fun testPerson02() {
        // Given
        val sourceJson = loadAsString("r4/person-example.json")

        // When
        val data = parser.toFhir(Person::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
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
            "1974-12-25",
            data.birthDate?.value.toString()
        )
        assertEquals(
            AdministrativeGender.MALE,
            data.gender
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "Acme Healthcare",
            data.identifier?.get(0)?.assigner?.display
        )
        assertEquals(
            "2001-05-06",
            data.identifier?.get(0)?.period?.start?.value.toString()
        )
        assertEquals(
            "urn:oid:1.2.36.146.595.217.0.1",
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
            "12345",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Peter Chalmers",
            data.link?.get(0)?.target?.display
        )
        assertEquals(
            "RelatedPerson/peter",
            data.link?.get(0)?.target?.reference
        )
        assertEquals(
            "Peter Chalmers",
            data.link?.get(1)?.target?.display
        )
        assertEquals(
            "Patient/example",
            data.link?.get(1)?.target?.reference
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
            "Jim",
            data.name?.get(1)?.given?.get(0)
        )
        assertEquals(
            NameUse.USUAL,
            data.name?.get(1)?.use
        )
        assertEquals(
            ContactPointUse.HOME,
            data.telecom?.get(0)?.use
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.telecom?.get(1)?.use
        )
        assertEquals(
            "(03) 5555 6473",
            data.telecom?.get(1)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.telecom?.get(2)?.system
        )
        assertEquals(
            ContactPointUse.HOME,
            data.telecom?.get(2)?.use
        )
        assertEquals(
            "Jim@example.org",
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
}
