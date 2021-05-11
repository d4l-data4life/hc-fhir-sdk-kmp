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

package care.data4life.hl7.fhir.stu3.json

import care.data4life.hl7.fhir.stu3.model.FhirResource
import care.data4life.hl7.fhir.stu3.model.FhirSerializationModule
import care.data4life.hl7.fhir.stu3.model.FhirStu3
import care.data4life.hl7.fhir.stu3.test.data.FhirContainedTestObject
import care.data4life.hl7.fhir.stu3.test.data.FhirResourceTestObject
import care.data4life.hl7.fhir.stu3.test.data.FhirSimpleTestObject
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.plus
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
        val fhirTestSerializersModule = SerializersModule {
            polymorphic(FhirStu3::class) {
                subclass(FhirSimpleTestObject::class)
                subclass(FhirContainedTestObject::class)
            }
            polymorphic(FhirResource::class) {
                subclass(FhirResourceTestObject::class)
            }
        }

        val reader = FhirStu3JsonParser.defaultJsonReader(
            (FhirSerializationModule.module() + fhirTestSerializersModule)
        )

        parser = FhirStu3JsonParser(reader)
    }

    @Test
    fun `fromJson() SHOULD throw Exception WHEN Json is malformed`() {
        assertFails {
            parser.fromJson(FhirSimpleTestObject::class, "malformed")
        }
    }

    @Test
    fun `fromJson() SHOULD parse WHEN Fhir type is known`() {
        // Given
        val fhirType = FhirSimpleTestObject::class
        val fhirJson = FhirSimpleTestObject.jsonData
        val expected = FhirSimpleTestObject.testData

        // When
        val result = parser.fromJson(fhirType, fhirJson)

        // Then
        assertEquals(expected, result)
    }

    @Test
    fun `fromJson() SHOULD parse WHEN Fhir type has contained fhir objects`() {
        // Given
        val fhirType = FhirContainedTestObject::class
        val fhirJson = FhirContainedTestObject.jsonData
        val expected = FhirContainedTestObject.testData

        // When
        val result = parser.fromJson(fhirType, fhirJson)

        // Then
        assertEquals(expected, result)
    }

    @Test
    fun `toJson() SHOULD format WHEN Fhir type is known`() {
        // Given
        val input = FhirSimpleTestObject.testData
        val expected = FhirSimpleTestObject.jsonData

        // When
        val result = parser.toJson(input)

        // Then
        assertEquals(expected, result)
    }

    @Test
    fun `toJson() SHOULD format WHEN Fhir type has contained fhir objects`() {
        // Given
        val input = FhirContainedTestObject.testData
        val expected = FhirContainedTestObject.jsonData

        // When
        val result = parser.toJson(input)

        // Then
        assertEquals(expected, result)
    }
}
