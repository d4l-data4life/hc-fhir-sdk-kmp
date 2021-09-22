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

import care.data4life.hl7.fhir.common.datetime.XsDate
import care.data4life.hl7.fhir.stu3.model.Extension
import care.data4life.hl7.fhir.stu3.model.FhirStu3
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.test.data.FhirDateTestObject
import kotlinx.serialization.modules.PolymorphicModuleBuilder
import kotlinx.serialization.modules.subclass
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class DateJsonParserTest : BaseFhirPrimitiveJsonParserTest() {

    @Test
    fun `Given, fromJson() is called with malformed JSON, it throws exception`() {
        assertFails {
            parser.fromJson(Date::class, "malformed")
        }
    }

    @Test
    fun `Given, fromJson() is called with value only, it returns a Date`() {
        // Given
        val value = testValue
        val input = FhirDateTestObject.jsonData(Date(value = value))
        val expected = Date(value = value)

        // When
        val result = parser.fromJson(fhirResourceType, input)

        // Then
        assertEquals(expected, result.value)
    }

    @Test
    @Ignore
    fun `Given, fromJson() is called with value and sibling object with id, it returns a Date`() {
        // Given
        val value = testValue
        val id = "12979787a32339"
        val input = FhirDateTestObject.jsonData(Date(value = value, id = id))
        val expected = Date(value = value, id = id)

        // When
        val result = parser.fromJson(fhirResourceType, input)

        // Then
        assertEquals(expected, result.value)
    }

    @Test
    @Ignore
    fun `Given, fromJson() is called with value and sibling object with extension, it returns a Date`() {
        // Given
        val value = testValue
        val extension = listOf(Extension(url = "some url", valueString = "value as String"))
        val input = FhirDateTestObject.jsonData(
            Date(
                value = value,
                extension = extension
            )
        )
        val expected = Date(value = value, extension = extension)

        // When
        val result = parser.fromJson(fhirResourceType, input)

        // Then
        assertEquals(expected, result.value)
    }

    @Test
    @Ignore
    fun `Given, fromJson() is called with value and sibling object with extension and id, it returns a Date`() {
        // Given
        val value = testValue
        val extension = listOf(Extension(url = "some url", valueString = "value as String"))
        val id = "12979787a32339"
        val input = FhirDateTestObject.jsonData(
            Date(
                value = value,
                extension = extension,
                id = id
            )
        )
        val expected = Date(value = value, extension = extension, id = id)

        // When
        val result = parser.fromJson(fhirResourceType, input)

        // Then
        assertEquals(expected, result.value)
    }

    @Test
    fun `Given, toJson() is called with value only, it returns a JSON with only the value`() {
        // Given
        val value = testValue
        val input = FhirDateTestObject.testData(Date(value = value))
        val expected = FhirDateTestObject.jsonData(Date(value = value))

        // When
        val result = parser.toJson(input)

        // Then
        assertEquals(expected, result)
    }

    @Test
    @Ignore
    fun `Given, toJson() is called with value and id, it returns a JSON with the value as property and the id in a sibling property object`() {
        // Given
        val value = testValue
        val id = "12979787a32339"
        val input = FhirDateTestObject.testData(Date(value = value, id = id))
        val expected = FhirDateTestObject.jsonData(
            Date(value = value, id = id)
        )

        // When
        val result = parser.toJson(input)

        // Then
        assertEquals(expected, result)
    }

    @Test
    @Ignore
    fun `Given, toJson() is called with value and extension, it returns a JSON with the value as property and the extension in a sibling property object`() {
        // Given
        val value = testValue
        val extension = listOf(Extension(url = "some url", valueString = "value as String"))
        val input = FhirDateTestObject.testData(
            Date(
                value = value,
                extension = extension
            )
        )
        val expected = FhirDateTestObject.jsonData(
            Date(
                value = value,
                extension = extension
            )
        )

        // When
        val result = parser.toJson(input)

        // Then
        assertEquals(expected, result)
    }

    @Test
    @Ignore
    fun `Given, toJson() is called with all properties set, it returns a JSON with the value as property and the extension and id in a sibling property object`() {
        // Given
        val value = testValue
        val extension = listOf(Extension(url = "some url", valueString = "value as String"))
        val id = "12979787a32339"
        val input = FhirDateTestObject.testData(
            Date(
                value = value,
                extension = extension,
                id = id
            )
        )
        val expected = FhirDateTestObject.jsonData(
            Date(
                value = value,
                extension = extension,
                id = id
            )
        )

        // When
        val result = parser.toJson(input)

        // Then
        assertEquals(expected, result)
    }

    override fun PolymorphicModuleBuilder<FhirStu3>.addTestSubclass() {
        subclass(fhirResourceType)
    }

    companion object {
        val fhirResourceType = FhirDateTestObject::class

        val testValue = XsDate(2021, 1, 12)
    }
}
