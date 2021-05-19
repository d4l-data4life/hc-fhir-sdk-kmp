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
class ImplementationGuideTest {

    val parser = FhirR4Parser()

    @Test
    fun testImplementationGuide01() {
        // Given
        val sourceJson = loadAsString("r4/implementationguide-example.json")

        // When
        val data = parser.toFhir(ImplementationGuide::class, sourceJson)

        // Then
        assertEquals(
            "ONC",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://www.healthit.gov",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "HL7",
            data.contact?.get(1)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(1)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir",
            data.contact?.get(1)?.telecom?.get(0)?.value
        )
        assertEquals(
            "Published by ONC under the standard FHIR license (CC0)",
            data.copyright
        )
        assertEquals(
            "2015-01-01",
            data.date?.value.toString()
        )
        assertEquals(
            "Base package (not broken up into multiple packages)",
            data.definition?.grouping?.get(0)?.description
        )
        assertEquals(
            "test",
            data.definition?.grouping?.get(0)?.name
        )
        assertEquals(
            GuidePageGeneration.HTML,
            data.definition?.page?.generation
        )
        assertEquals(
            "patient-example.html",
            data.definition?.page?.nameUrl
        )
        assertEquals(
            GuidePageGeneration.HTML,
            data.definition?.page?.page?.get(0)?.generation
        )
        assertEquals(
            "list.html",
            data.definition?.page?.page?.get(0)?.nameUrl
        )
        assertEquals(
            "Value Set Page",
            data.definition?.page?.page?.get(0)?.title
        )
        assertEquals(
            "Example Patient Page",
            data.definition?.page?.title
        )
        assertEquals(
            GuideParameterCode.APPLY,
            data.definition?.parameter?.get(0)?.code
        )
        assertEquals(
            "version",
            data.definition?.parameter?.get(0)?.value
        )
        assertEquals(
            "A test example to show how an implementation guide works",
            data.definition?.resource?.get(0)?.description
        )
        assertEquals(
            "http://hl7.org/fhir/us/core/StructureDefinition/patient",
            data.definition?.resource?.get(0)?.exampleCanonical
        )
        assertEquals(
            "Test Example",
            data.definition?.resource?.get(0)?.name
        )
        assertEquals(
            "Patient/test",
            data.definition?.resource?.get(0)?.reference?.reference
        )
        assertEquals(
            "http://hl7.org/fhir/ImplementationGuide/uscore",
            data.dependsOn?.get(0)?.uri
        )
        assertEquals(
            "False".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "4.0.1",
            data.fhirVer?.get(0)
        )
        assertEquals(
            "http://hl7.org/fhir/us/core/StructureDefinition/patient",
            data.global?.get(0)?.profile
        )
        assertEquals(
            ResourceType.PATIENT,
            data.global?.get(0)?.type
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
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "CC0-1.0",
            data.license
        )
        assertEquals(
            "fhir.png",
            data.manifest?.image?.get(0)
        )
        assertEquals(
            "fhir.css",
            data.manifest?.other?.get(0)
        )
        assertEquals(
            "patient-test",
            data.manifest?.page?.get(0)?.anchor?.get(0)
        )
        assertEquals(
            "tx",
            data.manifest?.page?.get(0)?.anchor?.get(1)
        )
        assertEquals(
            "uml",
            data.manifest?.page?.get(0)?.anchor?.get(2)
        )
        assertEquals(
            "patient-test.html",
            data.manifest?.page?.get(0)?.name
        )
        assertEquals(
            "Test Patient Example",
            data.manifest?.page?.get(0)?.title
        )
        assertEquals(
            "http://hl7.org/fhir/us/daf",
            data.manifest?.rendering
        )
        assertEquals(
            "http://hl7.org/fhir/us/core/StructureDefinition/patient",
            data.manifest?.resource?.get(0)?.exampleCanonical
        )
        assertEquals(
            "Patient/test",
            data.manifest?.resource?.get(0)?.reference?.reference
        )
        assertEquals(
            "patient-test.html#patient-test",
            data.manifest?.resource?.get(0)?.relativePath
        )
        assertEquals(
            "Data Access Framework (DAF)",
            data.name
        )
        assertEquals(
            "hl7.fhir.us.daf",
            data.packageId
        )
        assertEquals(
            "ONC / HL7 Joint project",
            data.publisher
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
            "http://hl7.org/fhir/us/daf",
            data.url
        )
        assertEquals(
            "0",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
