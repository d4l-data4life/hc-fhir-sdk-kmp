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

package care.data4life.fhir.stu3.json

import care.data4life.fhir.stu3.model.FhirStu3
import care.data4life.fhir.test.data.FhirTestObject
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class FhirStu3JsonParserTest {

    // SUT
    private lateinit var parser: FhirStu3JsonParser


    @BeforeTest
    fun setup() {
        val fhirSerializersModule = SerializersModule {
            polymorphic(FhirStu3::class) {
                subclass(FhirTestObject::class)
            }
        }
        val reader = FhirStu3JsonParser.defaultJsonReader(fhirSerializersModule)

        parser = FhirStu3JsonParser(reader)
    }

    @Test
    fun `fromJson() SHOULD throw Exception WHEN Json is malformed`() {
        assertFails {
            parser.fromJson(FhirTestObject::class, "malformed")
        }
    }

    @Test
    fun `fromJson() SHOULD parse WHEN Fhir type is known`() {
        // Given
        val fhirType = FhirTestObject::class
        val fhirJson = FhirTestObject.jsonData
        val expected = FhirTestObject.testData

        // When
        val result = parser.fromJson(fhirType, fhirJson)

        // Then
        assertEquals(expected, result)
    }

    @Test
    fun `toJson() SHOULD format WHEN Fhir type is known`() {
        // Given
        val input = FhirTestObject.testData
        val expected = FhirTestObject.jsonData

        // When
        val result = parser.toJson(input)

        // Then
        assertEquals(expected, result)
    }

}
