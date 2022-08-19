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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

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
class TerminologyCapabilitiesFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testTerminologyCapabilities01() {
        // Given
        val sourceJson = loadAsString("r4/terminologycapabilities-example.json")

        // When
        val data = parser.toFhir(TerminologyCapabilities::class, sourceJson)

        // Then
        assertTerminologyCapabilities01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTerminologyCapabilities01Step01(data: TerminologyCapabilities) {
        assertEquals(
            expected = CodeSearchSupport.EXPLICIT,
            actual = data.codeSearch
        )

        assertEquals(
            expected = "System Administrator",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "wile@acme.org",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-01-04",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "This is the FHIR capability statement for the main EHR at ACME for the private interface - it does not describe the public interface",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme Terminology Server",
            actual = data.implementation?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/tx",
            actual = data.implementation?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CapabilityStatementKind.INSTANCE,
            actual = data.kind
        )

        assertEquals(
            expected = "ACME-EHR",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ACME Corporation",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TxServer",
            actual = data.software?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.1.2",
            actual = data.software?.version
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
            expected = "ACME EHR capability statement",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:uuid:68D043B5-9ECF-4559-A57A-396E0D452311",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20130510",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
