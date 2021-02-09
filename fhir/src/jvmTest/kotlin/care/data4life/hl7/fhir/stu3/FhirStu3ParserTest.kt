/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.hl7.fhir.stu3

import care.data4life.hl7.fhir.stu3.json.FhirStu3JsonParser
import care.data4life.hl7.fhir.test.data.FhirSimpleTestObject
import io.mockk.confirmVerified
import io.mockk.mockk
import io.mockk.verify
import kotlin.test.BeforeTest
import kotlin.test.Test

class FhirStu3ParserTest {

    private lateinit var jsonParser: FhirStu3JsonParser


    // SUT
    private lateinit var parser: FhirStu3Parser


    @BeforeTest
    fun setup() {
        jsonParser = mockk(relaxed = true)
        parser = FhirStu3Parser(jsonParser)
    }

    @Test
    fun `toFhir() SHOULD call jsonParser_fromJson()`() {
        // Given
        val clazz = FhirSimpleTestObject::class
        val data = "fhirData"

        // When
        parser.toFhir(clazz, data)


        // Then
        verify { jsonParser.fromJson(clazz, data) }
        confirmVerified(jsonParser)
    }


    @Test
    fun `fromFhir() SHOULD call jsonParser_toJson()`() {
        // Given
        val data = FhirSimpleTestObject.testData

        // When
        parser.fromFhir(data)


        // Then
        verify { jsonParser.toJson(data) }
        confirmVerified(jsonParser)
    }
}
