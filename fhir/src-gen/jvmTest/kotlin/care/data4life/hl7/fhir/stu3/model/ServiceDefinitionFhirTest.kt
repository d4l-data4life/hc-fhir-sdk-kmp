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
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ServiceDefinitionTest.java
 *
 * A description of decision support service functionality
 *
 * The ServiceDefinition describes a unit of decision support functionality that is made available as a
 * service, such as immunization modules or drug-drug interaction checking.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ServiceDefinitionFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testServiceDefinition01() {
        // Given
        val sourceJson = loadAsString("stu3/servicedefinition-example.json")

        // When
        val data = parser.toFhir(ServiceDefinition::class, sourceJson)

        // Then
        assertServiceDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceDefinition01Step01(data: ServiceDefinition) {
        assertEquals(
            expected = "2015-07-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Guideline appropriate ordering is used to assess appropriateness of an order given a patient, a proposed order, and a set of clinical indications.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "guildeline-appropriate-ordering",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Guideline Appropriate Ordering Module",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Guideline Appropriate Ordering",
            actual = data.topic?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Appropriate Use Criteria",
            actual = data.topic?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
