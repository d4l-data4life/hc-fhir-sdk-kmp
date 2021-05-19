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
 * RelatedPersonTest.java
 *
 * An person that is related to a patient, but who is not a direct target of care
 *
 * Information about a person that is involved in the care for a patient, but who is not the target of
 * healthcare, nor has a formal responsibility in the care process.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class RelatedPersonTest {

    val parser = FhirStu3Parser()

    @Test
    fun testRelatedPerson01() {
        // Given
        val sourceJson = loadAsString("stu3/relatedperson-example-peter.json")

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
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0131",
            actual = data.relationship?.coding?.get(0)?.system
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
        val sourceJson = loadAsString("stu3/relatedperson-example-f001-sarah.json")

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
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/RoleCode",
            actual = data.relationship?.coding?.get(0)?.system
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
        val sourceJson = loadAsString("stu3/relatedperson-example.json")

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
            expected = "Paris",
            actual = data.address?.get(0)?.city
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FRA",
            actual = data.address?.get(0)?.country
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "43, Place du Marché Sainte Catherine",
            actual = data.address?.get(0)?.line?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "75004",
            actual = data.address?.get(0)?.postalCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = AdministrativeGender.FEMALE,
            actual = data.gender
        )

        assertEquals(
            expected = "benedicte",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.250.1.61",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "INSEE",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.USUAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "272117510400399",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "du Marché",
            actual = data.name?.get(0)?.family
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bénédicte",
            actual = data.name?.get(0)?.given?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "image/jpeg",
            actual = data.photo?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Binary/f016",
            actual = data.photo?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "N",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0131",
            actual = data.relationship?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WIFE",
            actual = data.relationship?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/RoleCode",
            actual = data.relationship?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "+33 (237) 998327",
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
        // Given
        val sourceJson = loadAsString("stu3/relatedperson-example-f002-ariadne.json")

        // When
        val data = parser.toFhir(RelatedPerson::class, sourceJson)

        // Then
        assertRelatedPerson04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRelatedPerson04Step01(data: RelatedPerson) {

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
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/RoleCode",
            actual = data.relationship?.coding?.get(0)?.system
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
