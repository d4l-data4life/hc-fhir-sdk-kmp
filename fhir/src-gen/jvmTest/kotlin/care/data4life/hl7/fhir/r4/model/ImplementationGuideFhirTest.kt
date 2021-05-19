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
import care.data4life.hl7.fhir.r4.codesystem.GuidePageGeneration
import care.data4life.hl7.fhir.r4.codesystem.GuideParameterCode
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ImplementationGuideTest.java
 *
 * A set of rules about how FHIR is used
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically
 * through the use of FHIR resources. This resource is used to gather all the parts of an
 * implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImplementationGuideFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testImplementationGuide01() {
        // Given
        val sourceJson = loadAsString("r4/implementationguide-example.json")

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
            expected = "Base package (not broken up into multiple packages)",
            actual = data.definition?.grouping?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test",
            actual = data.definition?.grouping?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = GuidePageGeneration.HTML,
            actual = data.definition?.page?.generation
        )

        assertEquals(
            expected = "patient-example.html",
            actual = data.definition?.page?.nameUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = GuidePageGeneration.HTML,
            actual = data.definition?.page?.page?.get(0)?.generation
        )

        assertEquals(
            expected = "list.html",
            actual = data.definition?.page?.page?.get(0)?.nameUrl
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Value Set Page",
            actual = data.definition?.page?.page?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example Patient Page",
            actual = data.definition?.page?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = GuideParameterCode.APPLY,
            actual = data.definition?.parameter?.get(0)?.code
        )

        assertEquals(
            expected = "version",
            actual = data.definition?.parameter?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A test example to show how an implementation guide works",
            actual = data.definition?.resource?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/core/StructureDefinition/patient",
            actual = data.definition?.resource?.get(0)?.exampleCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Test Example",
            actual = data.definition?.resource?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/test",
            actual = data.definition?.resource?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ImplementationGuide/uscore",
            actual = data.dependsOn?.get(0)?.uri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "4.0.1",
            actual = data.fhirVer?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/core/StructureDefinition/patient",
            actual = data.global?.get(0)?.profile
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
            expected = "CC0-1.0",
            actual = data.license
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir.png",
            actual = data.manifest?.image?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fhir.css",
            actual = data.manifest?.other?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-test",
            actual = data.manifest?.page?.get(0)?.anchor?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "tx",
            actual = data.manifest?.page?.get(0)?.anchor?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "uml",
            actual = data.manifest?.page?.get(0)?.anchor?.get(2)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-test.html",
            actual = data.manifest?.page?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Test Patient Example",
            actual = data.manifest?.page?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/daf",
            actual = data.manifest?.rendering
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/us/core/StructureDefinition/patient",
            actual = data.manifest?.resource?.get(0)?.exampleCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/test",
            actual = data.manifest?.resource?.get(0)?.reference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-test.html#patient-test",
            actual = data.manifest?.resource?.get(0)?.relativePath
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Data Access Framework (DAF)",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "hl7.fhir.us.daf",
            actual = data.packageId
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
