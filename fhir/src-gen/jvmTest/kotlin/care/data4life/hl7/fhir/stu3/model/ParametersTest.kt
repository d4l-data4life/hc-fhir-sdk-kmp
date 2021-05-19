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
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ParametersTest.java
 *
 * Operation Request or Response
 *
 * This special resource type is used to represent an operation request and response (operations.html).
 * It has no other use, and there is no RESTful endpoint associated with it.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ParametersTest {

    val parser = FhirStu3Parser()

    @Test
    fun testParameters01() {
        // Given
        val sourceJson = loadAsString("stu3/parameters-example.json")

        // When
        val data = parser.toFhir(Parameters::class, sourceJson)

        // Then
        assertParameters01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertParameters01Step01(data: Parameters) {

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "start",
            actual = data.parameter?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010-01-01",
            actual = data.parameter?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "end",
            actual = data.parameter?.get(1)?.name
                ?.replace("\\n", " ")
        )
    }
}
