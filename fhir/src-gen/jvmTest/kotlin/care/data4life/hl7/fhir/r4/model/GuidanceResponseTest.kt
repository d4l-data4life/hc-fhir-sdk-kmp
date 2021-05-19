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
        assertGuidanceResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertGuidanceResponse01Step01(data: GuidanceResponse) {

        assertEquals(
            expected = "outputParameters1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "guidanceResponse1",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://someguidelineprovider.org/radiology-appropriateness-guidelines.html",
            actual = data.moduleUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-03-10T16:02:00Z",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "#outputParameters1",
            actual = data.outputParameters?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/software",
            actual = data.performer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Guideline Appropriate Ordering Assessment",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.requestIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "guidanceRequest1",
            actual = data.requestIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = GuidanceResponseStatus.SUCCESS,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
