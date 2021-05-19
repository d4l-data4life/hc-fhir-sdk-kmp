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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.NamingSystemIdentifierType
import care.data4life.hl7.fhir.r4.codesystem.NamingSystemType
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * NamingSystemTest.java
 *
 * System of unique identification
 *
 * A curated namespace that issues unique symbols within that namespace for the identification of
 * concepts, people, devices, etc. Represents a "System" used within the Identifier and Coding data
 * types.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class NamingSystemTest {

    val parser = FhirR4Parser()

    @Test
    fun testNamingSystem01() {
        // Given
        val sourceJson = loadAsString("r4/namingsystem-example-id.json")

        // When
        val data = parser.toFhir(NamingSystem::class, sourceJson)

        // Then
        assertNamingSystem01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNamingSystem01Step01(data: NamingSystem) {

        assertEquals(
            expected = "HL7 Australia FHIR Team",
            actual = data.contact?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7-australia.wikispaces.com/FHIR+Australia",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-31",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Australian HI Identifier as established by relevant regulations etc.",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example-id",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "AU",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NamingSystemType.IDENTIFIER,
            actual = data.kind
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Austalian Healthcare Identifier - Individual",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HL7 Australia on behalf of NEHTA",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HI Service Operator / NEHTA",
            actual = data.responsible
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "NI",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "National unique individual identifier",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0203",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "IHI",
            actual = data.type?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This value is used in Australian CDA documents",
            actual = data.uniqueId?.get(0)?.comment
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NamingSystemIdentifierType.OID,
            actual = data.uniqueId?.get(0)?.type
        )

        assertEquals(
            expected = "1.2.36.1.2001.1003.0",
            actual = data.uniqueId?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-21",
            actual = data.uniqueId?.get(1)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.uniqueId?.get(1)?.preferred?.value
        )

        assertEquals(
            expected = NamingSystemIdentifierType.URI,
            actual = data.uniqueId?.get(1)?.type
        )

        assertEquals(
            expected = "http://ns.electronichealth.net.au/id/hi/ihi/1.0",
            actual = data.uniqueId?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Used in Australia for identifying patients",
            actual = data.usage
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testNamingSystem02() {
        // Given
        val sourceJson = loadAsString("r4/namingsystem-example.json")

        // When
        val data = parser.toFhir(NamingSystem::class, sourceJson)

        // Then
        assertNamingSystem02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertNamingSystem02Step01(data: NamingSystem) {

        assertEquals(
            expected = "FHIR project team",
            actual = data.contact?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-12-13",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NamingSystemType.CODESYSTEM,
            actual = data.kind
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SNOMED CT",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HL7 International on behalf of IHTSDO",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "IHTSDO & affiliates",
            actual = data.responsible
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = NamingSystemIdentifierType.OID,
            actual = data.uniqueId?.get(0)?.type
        )

        assertEquals(
            expected = "2.16.840.1.113883.6.96",
            actual = data.uniqueId?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.uniqueId?.get(1)?.preferred?.value
        )

        assertEquals(
            expected = NamingSystemIdentifierType.URI,
            actual = data.uniqueId?.get(1)?.type
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.uniqueId?.get(1)?.value
                ?.replace("\n", " ")
        )
    }
}
