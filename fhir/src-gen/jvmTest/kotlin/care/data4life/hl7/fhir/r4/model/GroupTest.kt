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
class GroupTest {

    val parser = FhirR4Parser()

    @Test
    fun testGroup01() {
        // Given
        val sourceJson = loadAsString("r4/group-example.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.actual?.value
        )
        assertEquals(
            "gender",
            data.characteristic?.get(0)?.code?.text
        )
        assertEquals(
            "False".toBoolean(),
            data.characteristic?.get(0)?.exclude?.value
        )
        assertEquals(
            "mixed",
            data.characteristic?.get(0)?.valueCodeableConcept?.text
        )
        assertEquals(
            "owner",
            data.characteristic?.get(1)?.code?.text
        )
        assertEquals(
            "False".toBoolean(),
            data.characteristic?.get(1)?.exclude?.value
        )
        assertEquals(
            "John Smith",
            data.characteristic?.get(1)?.valueCodeableConcept?.text
        )
        assertEquals(
            "Horse",
            data.code?.text
        )
        assertEquals(
            "101",
            data.id
        )
        assertEquals(
            "http://someveterinarianclinic.org/fhir/NamingSystem/herds",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
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
            "John's herd",
            data.name
        )
        assertEquals(
            "25".toLong(),
            data.quantity?.value
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )
        assertEquals(
            GroupType.ANIMAL,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testGroup02() {
        // Given
        val sourceJson = loadAsString("r4/group-example-member.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.actual?.value
        )
        assertEquals(
            "102",
            data.id
        )
        assertEquals(
            "Patient/pat1",
            data.member?.get(0)?.entity?.reference
        )
        assertEquals(
            "2014-10-08",
            data.member?.get(0)?.period?.start?.value.toString()
        )
        assertEquals(
            "Patient/pat2",
            data.member?.get(1)?.entity?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.member?.get(1)?.inactive?.value
        )
        assertEquals(
            "2015-04-02",
            data.member?.get(1)?.period?.start?.value.toString()
        )
        assertEquals(
            "Patient/pat3",
            data.member?.get(2)?.entity?.reference
        )
        assertEquals(
            "2015-08-06",
            data.member?.get(2)?.period?.start?.value.toString()
        )
        assertEquals(
            "Patient/pat4",
            data.member?.get(3)?.entity?.reference
        )
        assertEquals(
            "2015-08-06",
            data.member?.get(3)?.period?.start?.value.toString()
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
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )
        assertEquals(
            GroupType.PERSON,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testGroup03() {
        // Given
        val sourceJson = loadAsString("r4/group-example-patientlist.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.actual?.value
        )
        assertEquals(
            "attributed-to",
            data.characteristic?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org",
            data.characteristic?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Patients primarily attributed to",
            data.characteristic?.get(0)?.code?.text
        )
        assertEquals(
            "False".toBoolean(),
            data.characteristic?.get(0)?.exclude?.value
        )
        assertEquals(
            "Practitioner/123",
            data.characteristic?.get(0)?.valueReference?.reference
        )
        assertEquals(
            "example-patientlist",
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
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )
        assertEquals(
            GroupType.PERSON,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testGroup04() {
        // Given
        val sourceJson = loadAsString("r4/group-example-herd1.json")

        // When
        val data = parser.toFhir(Group::class, sourceJson)

        // Then
        assertEquals(
            "True".toBoolean(),
            data.active?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.actual?.value
        )
        assertEquals(
            "gender",
            data.characteristic?.get(0)?.code?.text
        )
        assertEquals(
            "False".toBoolean(),
            data.characteristic?.get(0)?.exclude?.value
        )
        assertEquals(
            "female",
            data.characteristic?.get(0)?.valueCodeableConcept?.text
        )
        assertEquals(
            "388393002",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Genus Sus (organism)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "POR",
            data.code?.coding?.get(1)?.code
        )
        assertEquals(
            "porcine",
            data.code?.coding?.get(1)?.display
        )
        assertEquals(
            "https://www.aphis.usda.gov",
            data.code?.coding?.get(1)?.system
        )
        assertEquals(
            "Porcine",
            data.code?.text
        )
        assertEquals(
            "http://example.org/fhir/StructureDefinition/owner",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "Peter Chalmers",
            data.extension?.get(0)?.valueReference?.display
        )
        assertEquals(
            "RelatedPerson/peter",
            data.extension?.get(0)?.valueReference?.reference
        )
        assertEquals(
            "herd1",
            data.id
        )
        assertEquals(
            "https://vetmed.iastate.edu/vdl",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "20171120-1234",
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
            "Breeding herd",
            data.name
        )
        assertEquals(
            "2500".toLong(),
            data.quantity?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            GroupType.ANIMAL,
            data.type
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
