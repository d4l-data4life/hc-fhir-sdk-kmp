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
import care.data4life.hl7.fhir.r4.codesystem.CapabilityStatementKind
import care.data4life.hl7.fhir.r4.codesystem.CodeSearchSupport
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * TerminologyCapabilitiesTest.java
 *
 * A statement of system capabilities
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology
 * Server that may be used as a statement of actual server functionality or a statement of required or
 * desired server implementation.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class TerminologyCapabilitiesTest {

    val parser = FhirR4Parser()

    @Test
    fun testTerminologyCapabilities01() {
        // Given
        val sourceJson = loadAsString("r4/terminologycapabilities-example.json")

        // When
        val data = parser.toFhir(TerminologyCapabilities::class, sourceJson)

        // Then
        assertEquals(
            CodeSearchSupport.EXPLICIT,
            data.codeSearch
        )
        assertEquals(
            "System Administrator",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "wile@acme.org",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2012-01-04",
            data.date?.value.toString()
        )
        assertEquals(
            "This is the FHIR capability statement for the main EHR at ACME for the private interface - it does not describe the public interface",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "Acme Terminology Server",
            data.implementation?.description
        )
        assertEquals(
            "http://example.org/tx",
            data.implementation?.url
        )
        assertEquals(
            CapabilityStatementKind.INSTANCE,
            data.kind
        )
        assertEquals(
            "ACME-EHR",
            data.name
        )
        assertEquals(
            "ACME Corporation",
            data.publisher
        )
        assertEquals(
            "TxServer",
            data.software?.name
        )
        assertEquals(
            "0.1.2",
            data.software?.version
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
            "ACME EHR capability statement",
            data.title
        )
        assertEquals(
            "urn:uuid:68D043B5-9ECF-4559-A57A-396E0D452311",
            data.url
        )
        assertEquals(
            "20130510",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
