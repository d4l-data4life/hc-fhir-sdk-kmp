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
import care.data4life.hl7.fhir.r4.codesystem.GroupType
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * GroupTest.java
 *
 * Group of multiple entities
 *
 * Represents a defined collection of entities that may be discussed or acted upon collectively but
 * which are not expected to act collectively, and are not formally or legally recognized; i.e. a
 * collection of entities that isn't an Organization.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class GroupFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testGroup01() {
        // Given
        val sourceJson = loadAsString("r4/group-example.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertGroup01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGroup01Step01(data: Group) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.actual?.value
        )

        assertEquals(
            expected = "gender",
            actual = data.characteristic?.get(0)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.characteristic?.get(0)?.exclude?.value
        )

        assertEquals(
            expected = "mixed",
            actual = data.characteristic?.get(0)?.valueCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "owner",
            actual = data.characteristic?.get(1)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.characteristic?.get(1)?.exclude?.value
        )

        assertEquals(
            expected = "John Smith",
            actual = data.characteristic?.get(1)?.valueCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Horse",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "101",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://someveterinarianclinic.org/fhir/NamingSystem/herds",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
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
            expected = "John's herd",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "25".toLong(),
            actual = data.quantity?.value
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )

        assertEquals(
            expected = GroupType.ANIMAL,
            actual = data.type
        )
    }

    @Test
    fun testGroup02() {
        // Given
        val sourceJson = loadAsString("r4/group-example-member.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertGroup02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGroup02Step01(data: Group) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.actual?.value
        )

        assertEquals(
            expected = "102",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.member?.get(0)?.entity?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-10-08",
            actual = data.member?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "Patient/pat2",
            actual = data.member?.get(1)?.entity?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.member?.get(1)?.inactive?.value
        )

        assertEquals(
            expected = "2015-04-02",
            actual = data.member?.get(1)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "Patient/pat3",
            actual = data.member?.get(2)?.entity?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-06",
            actual = data.member?.get(2)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "Patient/pat4",
            actual = data.member?.get(3)?.entity?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-06",
            actual = data.member?.get(3)?.period?.start?.value.toString()
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
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )

        assertEquals(
            expected = GroupType.PERSON,
            actual = data.type
        )
    }

    @Test
    fun testGroup03() {
        // Given
        val sourceJson = loadAsString("r4/group-example-patientlist.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertGroup03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGroup03Step01(data: Group) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.actual?.value
        )

        assertEquals(
            expected = "attributed-to",
            actual = data.characteristic?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.characteristic?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patients primarily attributed to",
            actual = data.characteristic?.get(0)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.characteristic?.get(0)?.exclude?.value
        )

        assertEquals(
            expected = "Practitioner/123",
            actual = data.characteristic?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-patientlist",
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
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )

        assertEquals(
            expected = GroupType.PERSON,
            actual = data.type
        )
    }

    @Test
    fun testGroup04() {
        // Given
        val sourceJson = loadAsString("r4/group-example-herd1.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertGroup04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGroup04Step01(data: Group) {

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.active?.value
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.actual?.value
        )

        assertEquals(
            expected = "gender",
            actual = data.characteristic?.get(0)?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.characteristic?.get(0)?.exclude?.value
        )

        assertEquals(
            expected = "female",
            actual = data.characteristic?.get(0)?.valueCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "388393002",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Genus Sus (organism)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "POR",
            actual = data.code?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "porcine",
            actual = data.code?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://www.aphis.usda.gov",
            actual = data.code?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Porcine",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/owner",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.extension?.get(0)?.valueReference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RelatedPerson/peter",
            actual = data.extension?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "herd1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://vetmed.iastate.edu/vdl",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20171120-1234",
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
            expected = "Breeding herd",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2500".toLong(),
            actual = data.quantity?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = GroupType.ANIMAL,
            actual = data.type
        )
    }
}
