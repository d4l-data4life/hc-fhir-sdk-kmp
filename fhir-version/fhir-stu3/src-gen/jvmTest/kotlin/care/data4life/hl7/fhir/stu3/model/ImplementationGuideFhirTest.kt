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
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.GuideDependencyType
import care.data4life.hl7.fhir.stu3.codesystem.GuidePageKind
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ImplementationGuideTest.java
 *
 * A set of rules about how FHIR is used
 *
 * A set of rules of how FHIR is used to solve a particular problem. This resource is used to gather
 * all the parts of an implementation guide into a logical whole and to publish a computable definition
 * of all the parts.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImplementationGuideFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testImplementationGuide01() {
        // Given
        val sourceJson = loadAsString("stu3/implementationguide-example.json")

        // When
        val data = parser.toFhir(ImplementationGuide::class, sourceJson)

        // Then
        assertImplementationGuide01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImplementationGuide01Step01(data: ImplementationGuide) {
        assertEquals(
            expected = "http://h7.org/fhir/fhir.css",
            actual = data.binary?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ONC",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://www.healthit.gov",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7",
            actual = data.contact?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(1)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://hl7.org/fhir",
            actual = data.contact?.get(1)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Published by ONC under the standard FHIR license (CC0)",
            actual = data.copyright
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-01-01",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = GuideDependencyType.REFERENCE,
            actual = data.dependency?.get(0)?.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ImplementationGuide/uscore",
            actual = data.dependency?.get(0)?.uri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.fhirVer
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "StructureDefinition/daf-patient",
            actual = data.global?.get(0)?.profile?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.global?.get(0)?.type
        )

        assertEquals(
            expected = "example",
            actual = data.id
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
            expected = "Data Access Framework (DAF)",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = GuidePageKind.PAGE,
            actual = data.page?.kind
        )

        assertEquals(
            expected = "text/html",
            actual = data.page?.page?.get(0)?.format
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = GuidePageKind.LIST,
            actual = data.page?.page?.get(0)?.kind
        )

        assertEquals(
            expected = "test",
            actual = data.page?.page?.get(0)?.pakkage?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "list.html",
            actual = data.page?.page?.get(0)?.source
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Value Set Page",
            actual = data.page?.page?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.VALUESET,
            actual = data.page?.page?.get(0)?.type?.get(0)
        )

        assertEquals(
            expected = "patient-example.html",
            actual = data.page?.source
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example Patient Page",
            actual = data.page?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Base package (not broken up into multiple packages)",
            actual = data.pakkage?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test",
            actual = data.pakkage?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "daf-tst",
            actual = data.pakkage?.get(0)?.resource?.get(0)?.acronym
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A test example to show how a package works",
            actual = data.pakkage?.get(0)?.resource?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.pakkage?.get(0)?.resource?.get(0)?.example?.value
        )

        assertEquals(
            expected = "StructureDefinition/daf-patient",
            actual = data.pakkage?.get(0)?.resource?.get(0)?.exampleFor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Test Example",
            actual = data.pakkage?.get(0)?.resource?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test.html",
            actual = data.pakkage?.get(0)?.resource?.get(0)?.sourceUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ONC / HL7 Joint project",
            actual = data.publisher
                ?.replace("\\n", " ")
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
            expected = "http://hl7.org/fhir/us/daf",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
