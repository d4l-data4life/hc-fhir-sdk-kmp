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
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ParametersTest.java
 *
 * Operation Request or Response
 *
 * This resource is a non-persisted resource used to pass information into and back from an
 * [operation](operations.html). It has no other use, and there is no RESTful endpoint associated with
 * it.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ParametersTest {

    val parser = FhirR4Parser()

    @Test
    fun testParameters01() {
        // Given
        val sourceJson = loadAsString("r4/parameters-example.json")

        // When
        val data = parser.toFhir(Parameters::class, sourceJson)

        // Then
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
            "exact",
            data.parameter?.get(0)?.name
        )
        assertEquals(
            "True".toBoolean(),
            data.parameter?.get(0)?.valueBoolean?.value
        )
        assertEquals(
            "property",
            data.parameter?.get(1)?.name
        )
        assertEquals(
            "code",
            data.parameter?.get(1)?.part?.get(0)?.name
        )
        assertEquals(
            "focus",
            data.parameter?.get(1)?.part?.get(0)?.valueCode
        )
        assertEquals(
            "value",
            data.parameter?.get(1)?.part?.get(1)?.name
        )
        assertEquals(
            "top",
            data.parameter?.get(1)?.part?.get(1)?.valueCode
        )
        assertEquals(
            "patient",
            data.parameter?.get(2)?.name
        )
        assertEquals(
            "example",
            data.parameter?.get(2)?.resource?.id
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
