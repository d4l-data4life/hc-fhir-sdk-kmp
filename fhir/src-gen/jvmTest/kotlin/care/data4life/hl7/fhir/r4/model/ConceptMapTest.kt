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
import care.data4life.hl7.fhir.r4.codesystem.ConceptMapEquivalence
import care.data4life.hl7.fhir.r4.codesystem.ConceptMapGroupUnmappedMode
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ConceptMapTest.java
 *
 * A map from one set of concepts to one or more other concepts
 *
 * A statement of relationships from one set of concepts to one or more other concepts - either
 * concepts in code systems, or data element/data element concepts, or classes in class models.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ConceptMapTest {

    val parser = FhirR4Parser()

    @Test
    fun testConceptMap01() {
        // Given
        val sourceJson = loadAsString("r4/conceptmap-example.json")

        // When
        val data = parser.toFhir(ConceptMap::class, sourceJson)

        // Then
        assertEquals(
            "FHIR project team (example)",
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
            "Creative Commons 0",
            data.copyright
        )
        assertEquals(
            "2012-06-13",
            data.date?.value.toString()
        )
        assertEquals(
            "A mapping between the FHIR and HL7 v3 AddressUse Code systems",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "home",
            data.group?.get(0)?.element?.get(0)?.code
        )
        assertEquals(
            "home",
            data.group?.get(0)?.element?.get(0)?.display
        )
        assertEquals(
            "H",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.code
        )
        assertEquals(
            "home",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.display
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "work",
            data.group?.get(0)?.element?.get(1)?.code
        )
        assertEquals(
            "work",
            data.group?.get(0)?.element?.get(1)?.display
        )
        assertEquals(
            "WP",
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.code
        )
        assertEquals(
            "work place",
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.display
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "temp",
            data.group?.get(0)?.element?.get(2)?.code
        )
        assertEquals(
            "temp",
            data.group?.get(0)?.element?.get(2)?.display
        )
        assertEquals(
            "TMP",
            data.group?.get(0)?.element?.get(2)?.target?.get(0)?.code
        )
        assertEquals(
            "temporary address",
            data.group?.get(0)?.element?.get(2)?.target?.get(0)?.display
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(2)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "old",
            data.group?.get(0)?.element?.get(3)?.code
        )
        assertEquals(
            "old",
            data.group?.get(0)?.element?.get(3)?.display
        )
        assertEquals(
            "BAD",
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.code
        )
        assertEquals(
            "In the HL7 v3 AD, old is handled by the usablePeriod element, but you have to provide a time, there's no simple equivalent of flagging an address as old",
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.comment
        )
        assertEquals(
            "bad address",
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.display
        )
        assertEquals(
            ConceptMapEquivalence.DISJOINT,
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "http://hl7.org/fhir/address-use",
            data.group?.get(0)?.source
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-AddressUse",
            data.group?.get(0)?.target
        )
        assertEquals(
            "temp",
            data.group?.get(0)?.unmapped?.code
        )
        assertEquals(
            "temp",
            data.group?.get(0)?.unmapped?.display
        )
        assertEquals(
            ConceptMapGroupUnmappedMode.FIXED,
            data.group?.get(0)?.unmapped?.mode
        )
        assertEquals(
            "101",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.system
        )
        assertEquals(
            "urn:uuid:53cd62ee-033e-414c-9f58-3ca97b5ffc3b",
            data.identifier?.value
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "FHIR-v3-Address-Use",
            data.name
        )
        assertEquals(
            "HL7, Inc",
            data.publisher
        )
        assertEquals(
            "To help implementers map from HL7 v3/CDA to FHIR",
            data.purpose
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/address-use",
            data.sourceUri
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            "http://terminology.hl7.org/ValueSet/v3-AddressUse",
            data.targetUri
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "FHIR/v3 Address Use Mapping",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/ConceptMap/101",
            data.url
        )
        assertEquals(
            "venue",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "for CCDA Usage",
            data.useContext?.get(0)?.valueCodeableConcept?.text
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testConceptMap02() {
        // Given
        val sourceJson = loadAsString("r4/conceptmap-example-2.json")

        // When
        val data = parser.toFhir(ConceptMap::class, sourceJson)

        // Then
        assertEquals(
            "FHIR project team (example)",
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
            "2012-06-13",
            data.date?.value.toString()
        )
        assertEquals(
            "An example mapping",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "code",
            data.group?.get(0)?.element?.get(0)?.code
        )
        assertEquals(
            "Example Code",
            data.group?.get(0)?.element?.get(0)?.display
        )
        assertEquals(
            "code2",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.code
        )
        assertEquals(
            "Something Coded",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/property-value/example",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.property
        )
        assertEquals(
            "http://example.org/fhir/example3",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.system
        )
        assertEquals(
            "some-code",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.value
        )
        assertEquals(
            "Some Example Code",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.display
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "http://example.org/fhir/example1",
            data.group?.get(0)?.source
        )
        assertEquals(
            "http://example.org/fhir/example2",
            data.group?.get(0)?.target
        )
        assertEquals(
            ConceptMapGroupUnmappedMode.OTHER_MAP,
            data.group?.get(0)?.unmapped?.mode
        )
        assertEquals(
            "http://example.org/fhir/ConceptMap/map2",
            data.group?.get(0)?.unmapped?.url
        )
        assertEquals(
            "example2",
            data.id
        )
        assertEquals(
            "FHIR-exanple-2",
            data.name
        )
        assertEquals(
            "HL7, Inc",
            data.publisher
        )
        assertEquals(
            "To illustrate mapping features",
            data.purpose
        )
        assertEquals(
            "http://example.org/fhir/example1",
            data.sourceUri
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            "http://example.org/fhir/example2",
            data.targetUri
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "FHIR Example 2",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/ConceptMap/example2",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testConceptMap03() {
        // Given
        val sourceJson = loadAsString("r4/conceptmap-example-specimen-type.json")

        // When
        val data = parser.toFhir(ConceptMap::class, sourceJson)

        // Then
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(1)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://www.phconnect.org/group/laboratorymessagingcommunityofpractice/forum/attachment/download?id=3649725%3AUploadedFile%3A145786",
            data.contact?.get(1)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2013-07-25",
            data.date?.value.toString()
        )
        assertEquals(
            "False".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "ACNE",
            data.group?.get(0)?.element?.get(0)?.code
        )
        assertEquals(
            "309068002",
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.code
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(0)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "ACNFLD",
            data.group?.get(0)?.element?.get(1)?.code
        )
        assertEquals(
            "119323008",
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.code
        )
        assertEquals(
            "HL7 term is a historical term. mapped to Pus",
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.comment
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "TypeModifier",
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.product?.get(0)?.property
        )
        assertEquals(
            "http://snomed.info/sct",
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.product?.get(0)?.system
        )
        assertEquals(
            "47002008",
            data.group?.get(0)?.element?.get(1)?.target?.get(0)?.product?.get(0)?.value
        )
        assertEquals(
            "AIRS",
            data.group?.get(0)?.element?.get(2)?.code
        )
        assertEquals(
            "446302006",
            data.group?.get(0)?.element?.get(2)?.target?.get(0)?.code
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(2)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "ALL",
            data.group?.get(0)?.element?.get(3)?.code
        )
        assertEquals(
            "119376003",
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.code
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "TypeModifier",
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.product?.get(0)?.property
        )
        assertEquals(
            "http://snomed.info/sct",
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.product?.get(0)?.system
        )
        assertEquals(
            "7970006",
            data.group?.get(0)?.element?.get(3)?.target?.get(0)?.product?.get(0)?.value
        )
        assertEquals(
            "AMP",
            data.group?.get(0)?.element?.get(4)?.code
        )
        assertEquals(
            "408654003",
            data.group?.get(0)?.element?.get(4)?.target?.get(0)?.code
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(4)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "http://snomed.info/id/246380002",
            data.group?.get(0)?.element?.get(4)?.target?.get(0)?.product?.get(0)?.property
        )
        assertEquals(
            "http://snomed.info/sct",
            data.group?.get(0)?.element?.get(4)?.target?.get(0)?.product?.get(0)?.system
        )
        assertEquals(
            "81723002",
            data.group?.get(0)?.element?.get(4)?.target?.get(0)?.product?.get(0)?.value
        )
        assertEquals(
            "ANGI",
            data.group?.get(0)?.element?.get(5)?.code
        )
        assertEquals(
            "119312009",
            data.group?.get(0)?.element?.get(5)?.target?.get(0)?.code
        )
        assertEquals(
            "TBD in detail",
            data.group?.get(0)?.element?.get(5)?.target?.get(0)?.comment
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(5)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "ARTC",
            data.group?.get(0)?.element?.get(6)?.code
        )
        assertEquals(
            "119312009",
            data.group?.get(0)?.element?.get(6)?.target?.get(0)?.code
        )
        assertEquals(
            "TBD in detail",
            data.group?.get(0)?.element?.get(6)?.target?.get(0)?.comment
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(6)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "ASERU",
            data.group?.get(0)?.element?.get(7)?.code
        )
        assertEquals(
            "pending",
            data.group?.get(0)?.element?.get(7)?.target?.get(0)?.comment
        )
        assertEquals(
            ConceptMapEquivalence.UNMATCHED,
            data.group?.get(0)?.element?.get(7)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "ASP",
            data.group?.get(0)?.element?.get(8)?.code
        )
        assertEquals(
            "119295008",
            data.group?.get(0)?.element?.get(8)?.target?.get(0)?.code
        )
        assertEquals(
            ConceptMapEquivalence.EQUIVALENT,
            data.group?.get(0)?.element?.get(8)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "http://snomed.info/id/246380002",
            data.group?.get(0)?.element?.get(8)?.target?.get(0)?.product?.get(0)?.property
        )
        assertEquals(
            "http://snomed.info/sct",
            data.group?.get(0)?.element?.get(8)?.target?.get(0)?.product?.get(0)?.system
        )
        assertEquals(
            "14766002",
            data.group?.get(0)?.element?.get(8)?.target?.get(0)?.product?.get(0)?.value
        )
        assertEquals(
            "ATTE",
            data.group?.get(0)?.element?.get(9)?.code
        )
        assertEquals(
            "TBD",
            data.group?.get(0)?.element?.get(9)?.target?.get(0)?.comment
        )
        assertEquals(
            ConceptMapEquivalence.UNMATCHED,
            data.group?.get(0)?.element?.get(9)?.target?.get(0)?.equivalence
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0487",
            data.group?.get(0)?.source
        )
        assertEquals(
            "http://snomed.info/sct",
            data.group?.get(0)?.target
        )
        assertEquals(
            "102",
            data.id
        )
        assertEquals(
            "Specimen mapping from v2 table 0487 to SNOMED CT",
            data.name
        )
        assertEquals(
            "FHIR project team (original source: LabMCoP)",
            data.publisher
        )
        assertEquals(
            "http://terminology.hl7.org/ValueSet/v2-0487",
            data.sourceCanonical
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            "http://snomed.info/sct?fhir_vs",
            data.targetCanonical
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "http://hl7.org/fhir/ConceptMap/102",
            data.url
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
