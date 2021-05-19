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
        assertEquals(
            ResourceType.PATIENT,
            data.base?.get(0)
        )
        assertEquals(
            "part-agree",
            data.code
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
            "Search by url for a participation agreement, which is stored in a DocumentReference",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "DocumentReference.extension('http://example.org/fhir/StructureDefinition/participation-agreement')",
            data.expression
        )
        assertEquals(
            "example-extension",
            data.id
        )
        assertEquals(
            "Example Search Parameter on an extension",
            data.name
        )
        assertEquals(
            "Health Level Seven International (FHIR Infrastructure)",
            data.publisher
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            ResourceType.DOCUMENTREFERENCE,
            data.target?.get(0)
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SearchParamType.REFERENCE,
            data.type
        )
        assertEquals(
            "http://hl7.org/fhir/SearchParameter/example-extension",
            data.url
        )
        assertEquals(
            "f:DocumentReference/f:extension[@url='http://example.org/fhir/StructureDefinition/participation-agreement']",
            data.xpath
        )
        assertEquals(
            XPathUsageType.NORMAL,
            data.xpathUsage
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSearchParameter02() {
        // Given
        val sourceJson = loadAsString("r4/searchparameter-example-reference.json")

        // When
        val data = parser.toFhir(SearchParameter::class, sourceJson)

        // Then
        assertEquals(
            ResourceType.CONDITION,
            data.base?.get(0)
        )
        assertEquals(
            "name",
            data.chain?.get(0)
        )
        assertEquals(
            "identifier",
            data.chain?.get(1)
        )
        assertEquals(
            "subject",
            data.code
        )
        assertEquals(
            "[string]",
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
            "2013-10-23",
            data.date?.value.toString()
        )
        assertEquals(
            "Search by condition subject",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "Condition.subject",
            data.expression
        )
        assertEquals(
            "example-reference",
            data.id
        )
        assertEquals(
            SearchModifierCode.MISSING,
            data.modifier?.get(0)
        )
        assertEquals(
            "Example Search Parameter",
            data.name
        )
        assertEquals(
            "Health Level Seven International (FHIR Infrastructure)",
            data.publisher
        )
        assertEquals(
            "Need to search Condition by subject",
            data.purpose
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            ResourceType.ORGANIZATION,
            data.target?.get(0)
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SearchParamType.REFERENCE,
            data.type
        )
        assertEquals(
            "http://hl7.org/fhir/SearchParameter/example-reference",
            data.url
        )
        assertEquals(
            XPathUsageType.NORMAL,
            data.xpathUsage
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSearchParameter03() {
        // Given
        val sourceJson = loadAsString("r4/searchparameter-example.json")

        // When
        val data = parser.toFhir(SearchParameter::class, sourceJson)

        // Then
        assertEquals(
            ResourceType.RESOURCE,
            data.base?.get(0)
        )
        assertEquals(
            "_id",
            data.code
        )
        assertEquals(
            SearchComparator.EQ,
            data.comparator?.get(0)
        )
        assertEquals(
            "[string]",
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
            "2013-10-23",
            data.date?.value.toString()
        )
        assertEquals(
            "http://hl7.org/fhir/SearchParameter/Resource-id",
            data.derivedFrom
        )
        assertEquals(
            "Search by resource identifier - e.g. same as the read interaction, but can return included resources",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "id",
            data.expression
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "United States of America (the)",
            data.jurisdiction?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "ID-SEARCH-PARAMETER",
            data.name
        )
        assertEquals(
            "Health Level Seven International (FHIR Infrastructure)",
            data.publisher
        )
        assertEquals(
            "Need to search by identifier for various infrastructural cases - mainly retrieving packages, and matching as part of a chain",
            data.purpose
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            SearchParamType.TOKEN,
            data.type
        )
        assertEquals(
            "http://hl7.org/fhir/SearchParameter/example",
            data.url
        )
        assertEquals(
            "focus",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "positive",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/variant-state",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "1",
            data.version
        )
        assertEquals(
            "f:*/f:id",
            data.xpath
        )
        assertEquals(
            XPathUsageType.NORMAL,
            data.xpathUsage
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
