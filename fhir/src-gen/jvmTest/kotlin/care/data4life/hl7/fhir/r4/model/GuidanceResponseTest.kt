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
import care.data4life.hl7.fhir.r4.codesystem.GuidanceResponseStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * GuidanceResponseTest.java
 *
 * The formal response to a guidance request
 *
 * A guidance response is the formal response to a guidance request, including any output parameters
 * returned by the evaluation, as well as the description of any proposed actions to be taken.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class GuidanceResponseTest {

    val parser = FhirR4Parser()

    @Test
    fun testGuidanceResponse01() {
        // Given
        val sourceJson = loadAsString("r4/guidanceresponse-example.json")

        // When
        val data = parser.toFhir(GuidanceResponse::class, sourceJson)

        // Then
        assertEquals(
            "outputParameters1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://example.org",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "guidanceResponse1",
            data.identifier?.get(0)?.value
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
            "http://someguidelineprovider.org/radiology-appropriateness-guidelines.html",
            data.moduleUri
        )
        assertEquals(
            "2017-03-10T16:02:00Z",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "#outputParameters1",
            data.outputParameters?.reference
        )
        assertEquals(
            "Device/software",
            data.performer?.reference
        )
        assertEquals(
            "Guideline Appropriate Ordering Assessment",
            data.reasonCode?.get(0)?.text
        )
        assertEquals(
            "http://example.org",
            data.requestIdentifier?.system
        )
        assertEquals(
            "guidanceRequest1",
            data.requestIdentifier?.value
        )
        assertEquals(
            GuidanceResponseStatus.SUCCESS,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
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
