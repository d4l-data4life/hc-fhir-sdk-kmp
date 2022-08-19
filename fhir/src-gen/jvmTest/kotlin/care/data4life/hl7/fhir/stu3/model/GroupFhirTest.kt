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
import care.data4life.hl7.fhir.stu3.codesystem.GroupType
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * GroupTest.java
 *
 * Group of multiple entities
 *
 * Represents a defined collection of entities that may be discussed or acted upon collectively but
 * which are not expected to act collectively and are not formally or legally recognized; i.e. a
 * collection of entities that isn't an Organization.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class GroupFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testGroup01() {
        // Given
        val sourceJson = loadAsString("stu3/group-example.json")

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
        val sourceJson = loadAsString("stu3/group-example-member.json")

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
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )

        assertEquals(
            expected = GroupType.PERSON,
            actual = data.type
        )
    }
}
