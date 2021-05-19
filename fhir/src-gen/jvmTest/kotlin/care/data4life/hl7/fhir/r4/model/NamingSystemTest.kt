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
        assertEquals(
            "HL7 Australia FHIR Team",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7-australia.wikispaces.com/FHIR+Australia",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2015-08-31",
            data.date?.value.toString()
        )
        assertEquals(
            "Australian HI Identifier as established by relevant regulations etc.",
            data.description
        )
        assertEquals(
            "example-id",
            data.id
        )
        assertEquals(
            "AU",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            NamingSystemType.IDENTIFIER,
            data.kind
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
            "Austalian Healthcare Identifier - Individual",
            data.name
        )
        assertEquals(
            "HL7 Australia on behalf of NEHTA",
            data.publisher
        )
        assertEquals(
            "HI Service Operator / NEHTA",
            data.responsible
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "NI",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "National unique individual identifier",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0203",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "IHI",
            data.type?.text
        )
        assertEquals(
            "This value is used in Australian CDA documents",
            data.uniqueId?.get(0)?.comment
        )
        assertEquals(
            NamingSystemIdentifierType.OID,
            data.uniqueId?.get(0)?.type
        )
        assertEquals(
            "1.2.36.1.2001.1003.0",
            data.uniqueId?.get(0)?.value
        )
        assertEquals(
            "2015-08-21",
            data.uniqueId?.get(1)?.period?.start?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.uniqueId?.get(1)?.preferred?.value
        )
        assertEquals(
            NamingSystemIdentifierType.URI,
            data.uniqueId?.get(1)?.type
        )
        assertEquals(
            "http://ns.electronichealth.net.au/id/hi/ihi/1.0",
            data.uniqueId?.get(1)?.value
        )
        assertEquals(
            "Used in Australia for identifying patients",
            data.usage
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testNamingSystem02() {
        // Given
        val sourceJson = loadAsString("r4/namingsystem-example.json")

        // When
        val data = parser.toFhir(NamingSystem::class, sourceJson)

        // Then
        assertEquals(
            "FHIR project team",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2014-12-13",
            data.date?.value.toString()
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            NamingSystemType.CODESYSTEM,
            data.kind
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
            "SNOMED CT",
            data.name
        )
        assertEquals(
            "HL7 International on behalf of IHTSDO",
            data.publisher
        )
        assertEquals(
            "IHTSDO & affiliates",
            data.responsible
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            NamingSystemIdentifierType.OID,
            data.uniqueId?.get(0)?.type
        )
        assertEquals(
            "2.16.840.1.113883.6.96",
            data.uniqueId?.get(0)?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.uniqueId?.get(1)?.preferred?.value
        )
        assertEquals(
            NamingSystemIdentifierType.URI,
            data.uniqueId?.get(1)?.type
        )
        assertEquals(
            "http://snomed.info/sct",
            data.uniqueId?.get(1)?.value
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
