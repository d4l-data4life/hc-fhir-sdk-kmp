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
 * PersonTest.java
 *
 * A generic person record
 *
 * Demographics and administrative information about a person independent of a specific health-related
 * context.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PersonTest {

    val parser = FhirStu3Parser()

    @Test
    fun testPerson01() {
        // Given
        val sourceJson = loadAsString("stu3/person-example-f002-ariadne.json")

        // When
        val data = parser.toFhir(Person::class, sourceJson)

        // Then
        assertPerson01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPerson01Step01(data: Person) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

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
            expected = "Ariadne Bor-Jansma",
            actual = data.link?.get(0)?.target?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RelatedPerson/f002",
            actual = data.link?.get(0)?.target?.reference
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
            expected = "image/jpeg",
            actual = data.photo?.contentType
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

    @Test
    fun testPerson02() {
        // Given
        val sourceJson = loadAsString("stu3/person-example.json")

        // When
        val data = parser.toFhir(Person::class, sourceJson)

        // Then
        assertPerson02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPerson02Step01(data: Person) {

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
            expected = "1974-12-25",
            actual = data.birthDate?.value.toString()
        )

        assertEquals(
            expected = AdministrativeGender.MALE,
            actual = data.gender
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Healthcare",
            actual = data.identifier?.get(0)?.assigner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2001-05-06",
            actual = data.identifier?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "urn:oid:1.2.36.146.595.217.0.1",
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
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.link?.get(0)?.target?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RelatedPerson/peter",
            actual = data.link?.get(0)?.target?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.link?.get(1)?.target?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.link?.get(1)?.target?.reference
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
            expected = "Jim",
            actual = data.name?.get(1)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NameUse.USUAL,
            actual = data.name?.get(1)?.use
        )

        assertEquals(
            expected = ContactPointUse.HOME,
            actual = data.telecom?.get(0)?.use
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "(03) 5555 6473",
            actual = data.telecom?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.telecom?.get(2)?.system
        )

        assertEquals(
            expected = ContactPointUse.HOME,
            actual = data.telecom?.get(2)?.use
        )

        assertEquals(
            expected = "Jim@example.org",
            actual = data.telecom?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
