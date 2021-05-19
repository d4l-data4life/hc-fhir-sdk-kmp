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
import care.data4life.hl7.fhir.r4.codesystem.LinkageType
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * LinkageTest.java
 *
 * Links records for 'same' item
 *
 * Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class LinkageTest {

    val parser = FhirR4Parser()

    @Test
    fun testLinkage01() {
        // Given
        val sourceJson = loadAsString("r4/linkage-example.json")

        // When
        val data = parser.toFhir(Linkage::class, sourceJson)

        // Then
        assertEquals(
            "Practitioner/f201",
            data.author?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "Severe burn of left ear (Date: 24-May 2012)",
            data.item?.get(0)?.resource?.display
        )
        assertEquals(
            "Condition/example",
            data.item?.get(0)?.resource?.reference
        )
        assertEquals(
            LinkageType.SOURCE,
            data.item?.get(0)?.type
        )
        assertEquals(
            "Severe burn of left ear (Date: 24-May 2012)",
            data.item?.get(1)?.resource?.display
        )
        assertEquals(
            "Condition/condition-example",
            data.item?.get(1)?.resource?.reference
        )
        assertEquals(
            LinkageType.ALTERNATE,
            data.item?.get(1)?.type
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
