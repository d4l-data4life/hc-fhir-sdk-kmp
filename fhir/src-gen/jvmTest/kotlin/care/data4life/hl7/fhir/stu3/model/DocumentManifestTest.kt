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
import care.data4life.hl7.fhir.stu3.codesystem.DocumentReferenceStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
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
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DocumentManifestTest {

    val parser = FhirStu3Parser()

    @Test
    fun testDocumentManifest01() {
        // Given
        val sourceJson = loadAsString("stu3/documentmanifest-example.json")

        // When
        val data = parser.toFhir(DocumentManifest::class, sourceJson)

        // Then
        assertDocumentManifest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertDocumentManifest01Step01(data: DocumentManifest) {

        assertEquals(
            expected = "#a1",
            actual = data.author?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DocumentReference/example",
            actual = data.content?.get(0)?.pReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2004-12-25T23:50:50-05:00",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Physical",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/documents",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "23425234234-2347",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/documents",
            actual = data.masterIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "23425234234-2346",
            actual = data.masterIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/xcda1",
            actual = data.recipient?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/documents",
            actual = data.related?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "23425234234-9999",
            actual = data.related?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DocumentReference/example",
            actual = data.related?.get(0)?.ref?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2009.1.2.1",
            actual = data.source
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = DocumentReferenceStatus.CURRENT,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Text</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "History and Physical",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )
    }
}
