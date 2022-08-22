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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.OperationKind
import care.data4life.hl7.fhir.r4.codesystem.OperationParameterUse
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * OperationDefinitionTest.java
 *
 * Definition of an operation or a named query
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using
 * the search interaction).
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class OperationDefinitionFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testOperationDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/operationdefinition-example.json")

        // When
        val data = parser.toFhir(OperationDefinition::class, sourceJson)

        // Then
        assertOperationDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOperationDefinition01Step01(data: OperationDefinition) {
        assertEquals(
            expected = "OperationDefinition/Questionnaire-populate",
            actual = data.base
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "populate",
            actual = data.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Only implemented for Labs and Medications so far",
            actual = data.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "System Administrator",
            actual = data.contact?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "beep@coyote.acme.com",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-04",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Limited implementation of the Populate Questionnaire implementation",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.instance?.value
        )

        assertEquals(
            expected = "GB",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "United Kingdom of Great Britain and Northern Ireland (the)",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = OperationKind.OPERATION,
            actual = data.kind
        )

        assertEquals(
            expected = "Populate Questionnaire",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "subject",
            actual = data.overload?.get(0)?.parameterName?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "local",
            actual = data.overload?.get(0)?.parameterName?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "local defaults to false when not passed as a parameter",
            actual = data.overload?.get(1)?.comment
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "subject",
            actual = data.overload?.get(1)?.parameterName?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.parameter?.get(0)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.parameter?.get(0)?.min?.value
        )

        assertEquals(
            expected = "subject",
            actual = data.parameter?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Reference",
            actual = data.parameter?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = OperationParameterUse.IN,
            actual = data.parameter?.get(0)?.use
        )

        assertEquals(
            expected = "If the *local* parameter is set to true, server information about the specified subject will be used to populate the instance.",
            actual = data.parameter?.get(1)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.parameter?.get(1)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.parameter?.get(1)?.min?.value
        )

        assertEquals(
            expected = "local",
            actual = data.parameter?.get(1)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Reference",
            actual = data.parameter?.get(1)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = OperationParameterUse.IN,
            actual = data.parameter?.get(1)?.use
        )

        assertEquals(
            expected = "The partially (or fully)-populated set of answers for the specified Questionnaire",
            actual = data.parameter?.get(2)?.documentation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.parameter?.get(2)?.max
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.parameter?.get(2)?.min?.value
        )

        assertEquals(
            expected = "return",
            actual = data.parameter?.get(2)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "QuestionnaireResponse",
            actual = data.parameter?.get(2)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = OperationParameterUse.OUT,
            actual = data.parameter?.get(2)?.use
        )

        assertEquals(
            expected = "Acme Healthcare Services",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.QUESTIONNAIRE,
            actual = data.resource?.get(0)
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.system?.value
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.type?.value
        )

        assertEquals(
            expected = "http://h7.org/fhir/OperationDefinition/example",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "venue",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical Venue",
            actual = data.useContext?.get(0)?.code?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://build.fhir.org/codesystem-usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IMP",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "inpatient encounter",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "B",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
