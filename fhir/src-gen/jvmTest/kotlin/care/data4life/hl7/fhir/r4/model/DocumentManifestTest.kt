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
import care.data4life.hl7.fhir.r4.codesystem.DocumentReferenceStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DocumentManifestTest.java
 *
 * A list that defines a set of documents
 *
 * A collection of documents compiled for a purpose together with metadata that applies to the
 * collection.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DocumentManifestTest {

    val parser = FhirR4Parser()

    @Test
    fun testDocumentManifest01() {
        // Given
        val sourceJson = loadAsString("r4/documentmanifest-example.json")

        // When
        val data = parser.toFhir(DocumentManifest::class, sourceJson)

        // Then
        assertEquals(
            "#a1",
            data.author?.get(0)?.reference
        )
        assertEquals(
            "a1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "DocumentReference/example",
            data.content?.get(0)?.reference
        )
        assertEquals(
            "2004-12-25T23:50:50-05:00",
            data.created?.value.toString()
        )
        assertEquals(
            "Physical",
            data.description
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://example.org/documents",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "23425234234-2347",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://example.org/documents",
            data.masterIdentifier?.system
        )
        assertEquals(
            "23425234234-2346",
            data.masterIdentifier?.value
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
            "Practitioner/xcda1",
            data.recipient?.get(0)?.reference
        )
        assertEquals(
            "http://example.org/documents",
            data.related?.get(0)?.identifier?.system
        )
        assertEquals(
            "23425234234-9999",
            data.related?.get(0)?.identifier?.value
        )
        assertEquals(
            "DocumentReference/example",
            data.related?.get(0)?.ref?.reference
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.21367.2009.1.2.1",
            data.source
        )
        assertEquals(
            DocumentReferenceStatus.CURRENT,
            data.status
        )
        assertEquals(
            "Patient/xcda",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Text</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "History and Physical",
            data.type?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
