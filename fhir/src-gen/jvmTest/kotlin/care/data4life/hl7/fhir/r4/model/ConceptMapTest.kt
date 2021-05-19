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
        assertConceptMap01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConceptMap01Step01(data: ConceptMap) {

        assertEquals(
            expected = "FHIR project team (example)",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Creative Commons 0",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-13",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "A mapping between the FHIR and HL7 v3 AddressUse Code systems",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "home",
            actual = data.group?.get(0)?.element?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "home",
            actual = data.group?.get(0)?.element?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "H",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "home",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "work",
            actual = data.group?.get(0)?.element?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "work",
            actual = data.group?.get(0)?.element?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WP",
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "work place",
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "temp",
            actual = data.group?.get(0)?.element?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "temp",
            actual = data.group?.get(0)?.element?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TMP",
            actual = data.group?.get(0)?.element?.get(2)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "temporary address",
            actual = data.group?.get(0)?.element?.get(2)?.target?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(2)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "old",
            actual = data.group?.get(0)?.element?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "old",
            actual = data.group?.get(0)?.element?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BAD",
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "In the HL7 v3 AD, old is handled by the usablePeriod element, but you have to provide a time, there's no simple equivalent of flagging an address as old",
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "bad address",
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.DISJOINT,
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "http://hl7.org/fhir/address-use",
            actual = data.group?.get(0)?.source
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-AddressUse",
            actual = data.group?.get(0)?.target
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "temp",
            actual = data.group?.get(0)?.unmapped?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "temp",
            actual = data.group?.get(0)?.unmapped?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapGroupUnmappedMode.FIXED,
            actual = data.group?.get(0)?.unmapped?.mode
        )

        assertEquals(
            expected = "101",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:53cd62ee-033e-414c-9f58-3ca97b5ffc3b",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR-v3-Address-Use",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7, Inc",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "To help implementers map from HL7 v3/CDA to FHIR",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/address-use",
            actual = data.sourceUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "http://terminology.hl7.org/ValueSet/v3-AddressUse",
            actual = data.targetUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "FHIR/v3 Address Use Mapping",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ConceptMap/101",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "venue",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "for CCDA Usage",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testConceptMap02() {
        // Given
        val sourceJson = loadAsString("r4/conceptmap-example-2.json")

        // When
        val data = parser.toFhir(ConceptMap::class, sourceJson)

        // Then
        assertConceptMap02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConceptMap02Step01(data: ConceptMap) {

        assertEquals(
            expected = "FHIR project team (example)",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-06-13",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "An example mapping",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "code",
            actual = data.group?.get(0)?.element?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example Code",
            actual = data.group?.get(0)?.element?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code2",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Something Coded",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/property-value/example",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/example3",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "some-code",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.dependsOn?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Some Example Code",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "http://example.org/fhir/example1",
            actual = data.group?.get(0)?.source
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/example2",
            actual = data.group?.get(0)?.target
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapGroupUnmappedMode.OTHER_MAP,
            actual = data.group?.get(0)?.unmapped?.mode
        )

        assertEquals(
            expected = "http://example.org/fhir/ConceptMap/map2",
            actual = data.group?.get(0)?.unmapped?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR-exanple-2",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7, Inc",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "To illustrate mapping features",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/example1",
            actual = data.sourceUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "http://example.org/fhir/example2",
            actual = data.targetUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "FHIR Example 2",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ConceptMap/example2",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testConceptMap03() {
        // Given
        val sourceJson = loadAsString("r4/conceptmap-example-specimen-type.json")

        // When
        val data = parser.toFhir(ConceptMap::class, sourceJson)

        // Then
        assertConceptMap03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertConceptMap03Step01(data: ConceptMap) {

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(1)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://www.phconnect.org/group/laboratorymessagingcommunityofpractice/forum/attachment/download?id=3649725%3AUploadedFile%3A145786",
            actual = data.contact?.get(1)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-07-25",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "ACNE",
            actual = data.group?.get(0)?.element?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "309068002",
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(0)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "ACNFLD",
            actual = data.group?.get(0)?.element?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "119323008",
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 term is a historical term. mapped to Pus",
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "TypeModifier",
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.product?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.product?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "47002008",
            actual = data.group?.get(0)?.element?.get(1)?.target?.get(0)?.product?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AIRS",
            actual = data.group?.get(0)?.element?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "446302006",
            actual = data.group?.get(0)?.element?.get(2)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(2)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "ALL",
            actual = data.group?.get(0)?.element?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "119376003",
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "TypeModifier",
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.product?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.product?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7970006",
            actual = data.group?.get(0)?.element?.get(3)?.target?.get(0)?.product?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AMP",
            actual = data.group?.get(0)?.element?.get(4)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "408654003",
            actual = data.group?.get(0)?.element?.get(4)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(4)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "http://snomed.info/id/246380002",
            actual = data.group?.get(0)?.element?.get(4)?.target?.get(0)?.product?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.group?.get(0)?.element?.get(4)?.target?.get(0)?.product?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "81723002",
            actual = data.group?.get(0)?.element?.get(4)?.target?.get(0)?.product?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ANGI",
            actual = data.group?.get(0)?.element?.get(5)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "119312009",
            actual = data.group?.get(0)?.element?.get(5)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TBD in detail",
            actual = data.group?.get(0)?.element?.get(5)?.target?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(5)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "ARTC",
            actual = data.group?.get(0)?.element?.get(6)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "119312009",
            actual = data.group?.get(0)?.element?.get(6)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TBD in detail",
            actual = data.group?.get(0)?.element?.get(6)?.target?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(6)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "ASERU",
            actual = data.group?.get(0)?.element?.get(7)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pending",
            actual = data.group?.get(0)?.element?.get(7)?.target?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.UNMATCHED,
            actual = data.group?.get(0)?.element?.get(7)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "ASP",
            actual = data.group?.get(0)?.element?.get(8)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "119295008",
            actual = data.group?.get(0)?.element?.get(8)?.target?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.EQUIVALENT,
            actual = data.group?.get(0)?.element?.get(8)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "http://snomed.info/id/246380002",
            actual = data.group?.get(0)?.element?.get(8)?.target?.get(0)?.product?.get(0)?.property
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.group?.get(0)?.element?.get(8)?.target?.get(0)?.product?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14766002",
            actual = data.group?.get(0)?.element?.get(8)?.target?.get(0)?.product?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ATTE",
            actual = data.group?.get(0)?.element?.get(9)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TBD",
            actual = data.group?.get(0)?.element?.get(9)?.target?.get(0)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ConceptMapEquivalence.UNMATCHED,
            actual = data.group?.get(0)?.element?.get(9)?.target?.get(0)?.equivalence
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0487",
            actual = data.group?.get(0)?.source
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.group?.get(0)?.target
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "102",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen mapping from v2 table 0487 to SNOMED CT",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR project team (original source: LabMCoP)",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/ValueSet/v2-0487",
            actual = data.sourceCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "http://snomed.info/sct?fhir_vs",
            actual = data.targetCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ConceptMap/102",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
