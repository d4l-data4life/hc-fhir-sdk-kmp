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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.r4.codesystem.SearchComparator
import care.data4life.hl7.fhir.r4.codesystem.SearchModifierCode
import care.data4life.hl7.fhir.r4.codesystem.SearchParamType
import care.data4life.hl7.fhir.r4.codesystem.XPathUsageType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * SearchParameterTest.java
 *
 * Search parameter for a resource
 *
 * A search parameter that defines a named search item that can be used to search/filter on a resource.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SearchParameterTest {

    val parser = FhirR4Parser()

    @Test
    fun testSearchParameter01() {
        // Given
        val sourceJson = loadAsString("r4/searchparameter-example-extension.json")

        // When
        val data = parser.toFhir(SearchParameter::class, sourceJson)

        // Then
        assertSearchParameter01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSearchParameter01Step01(data: SearchParameter) {

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.base?.get(0)
        )

        assertEquals(
            expected = "part-agree",
            actual = data.code
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
            expected = "Search by url for a participation agreement, which is stored in a DocumentReference",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "DocumentReference.extension('http://example.org/fhir/StructureDefinition/participation-agreement')",
            actual = data.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example-extension",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Example Search Parameter on an extension",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health Level Seven International (FHIR Infrastructure)",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ResourceType.DOCUMENTREFERENCE,
            actual = data.target?.get(0)
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = SearchParamType.REFERENCE,
            actual = data.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/SearchParameter/example-extension",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f:DocumentReference/f:extension[@url='http://example.org/fhir/StructureDefinition/participation-agreement']",
            actual = data.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = XPathUsageType.NORMAL,
            actual = data.xpathUsage
        )
    }

    @Test
    fun testSearchParameter02() {
        // Given
        val sourceJson = loadAsString("r4/searchparameter-example-reference.json")

        // When
        val data = parser.toFhir(SearchParameter::class, sourceJson)

        // Then
        assertSearchParameter02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSearchParameter02Step01(data: SearchParameter) {

        assertEquals(
            expected = ResourceType.CONDITION,
            actual = data.base?.get(0)
        )

        assertEquals(
            expected = "name",
            actual = data.chain?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "identifier",
            actual = data.chain?.get(1)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subject",
            actual = data.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "[string]",
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
            expected = "2013-10-23",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Search by condition subject",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "Condition.subject",
            actual = data.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example-reference",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = SearchModifierCode.MISSING,
            actual = data.modifier?.get(0)
        )

        assertEquals(
            expected = "Example Search Parameter",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health Level Seven International (FHIR Infrastructure)",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Need to search Condition by subject",
            actual = data.purpose
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ResourceType.ORGANIZATION,
            actual = data.target?.get(0)
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = SearchParamType.REFERENCE,
            actual = data.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/SearchParameter/example-reference",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = XPathUsageType.NORMAL,
            actual = data.xpathUsage
        )
    }

    @Test
    fun testSearchParameter03() {
        // Given
        val sourceJson = loadAsString("r4/searchparameter-example.json")

        // When
        val data = parser.toFhir(SearchParameter::class, sourceJson)

        // Then
        assertSearchParameter03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSearchParameter03Step01(data: SearchParameter) {

        assertEquals(
            expected = ResourceType.RESOURCE,
            actual = data.base?.get(0)
        )

        assertEquals(
            expected = "_id",
            actual = data.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = SearchComparator.EQ,
            actual = data.comparator?.get(0)
        )

        assertEquals(
            expected = "[string]",
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
            expected = "2013-10-23",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "http://hl7.org/fhir/SearchParameter/Resource-id",
            actual = data.derivedFrom
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Search by resource identifier - e.g. same as the read interaction, but can return included resources",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "id",
            actual = data.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "United States of America (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ID-SEARCH-PARAMETER",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health Level Seven International (FHIR Infrastructure)",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Need to search by identifier for various infrastructural cases - mainly retrieving packages, and matching as part of a chain",
            actual = data.purpose
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = SearchParamType.TOKEN,
            actual = data.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/SearchParameter/example",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "positive",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/variant-state",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.version
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f:*/f:id",
            actual = data.xpath
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = XPathUsageType.NORMAL,
            actual = data.xpathUsage
        )
    }
}
