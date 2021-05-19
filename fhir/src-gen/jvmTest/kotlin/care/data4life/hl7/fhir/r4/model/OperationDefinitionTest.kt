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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

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
class OperationDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testOperationDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/operationdefinition-example.json")

        // When
        val data = parser.toFhir(OperationDefinition::class, sourceJson)

        // Then
        assertEquals(
            "OperationDefinition/Questionnaire-populate",
            data.base
        )
        assertEquals(
            "populate",
            data.code
        )
        assertEquals(
            "Only implemented for Labs and Medications so far",
            data.comment
        )
        assertEquals(
            "System Administrator",
            data.contact?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "beep@coyote.acme.com",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2015-08-04",
            data.date?.value.toString()
        )
        assertEquals(
            "Limited implementation of the Populate Questionnaire implementation",
            data.description
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "True".toBoolean(),
            data.instance?.value
        )
        assertEquals(
            "GB",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "United Kingdom of Great Britain and Northern Ireland (the)",
            data.jurisdiction?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            OperationKind.OPERATION,
            data.kind
        )
        assertEquals(
            "Populate Questionnaire",
            data.name
        )
        assertEquals(
            "subject",
            data.overload?.get(0)?.parameterName?.get(0)
        )
        assertEquals(
            "local",
            data.overload?.get(0)?.parameterName?.get(1)
        )
        assertEquals(
            "local defaults to false when not passed as a parameter",
            data.overload?.get(1)?.comment
        )
        assertEquals(
            "subject",
            data.overload?.get(1)?.parameterName?.get(0)
        )
        assertEquals(
            "1",
            data.parameter?.get(0)?.max
        )
        assertEquals(
            "1".toInt(),
            data.parameter?.get(0)?.min?.value
        )
        assertEquals(
            "subject",
            data.parameter?.get(0)?.name
        )
        assertEquals(
            "Reference",
            data.parameter?.get(0)?.type
        )
        assertEquals(
            OperationParameterUse.IN,
            data.parameter?.get(0)?.use
        )
        assertEquals(
            "If the *local* parameter is set to true, server information about the specified subject will be used to populate the instance.",
            data.parameter?.get(1)?.documentation
        )
        assertEquals(
            "1",
            data.parameter?.get(1)?.max
        )
        assertEquals(
            "0".toInt(),
            data.parameter?.get(1)?.min?.value
        )
        assertEquals(
            "local",
            data.parameter?.get(1)?.name
        )
        assertEquals(
            "Reference",
            data.parameter?.get(1)?.type
        )
        assertEquals(
            OperationParameterUse.IN,
            data.parameter?.get(1)?.use
        )
        assertEquals(
            "The partially (or fully)-populated set of answers for the specified Questionnaire",
            data.parameter?.get(2)?.documentation
        )
        assertEquals(
            "1",
            data.parameter?.get(2)?.max
        )
        assertEquals(
            "1".toInt(),
            data.parameter?.get(2)?.min?.value
        )
        assertEquals(
            "return",
            data.parameter?.get(2)?.name
        )
        assertEquals(
            "QuestionnaireResponse",
            data.parameter?.get(2)?.type
        )
        assertEquals(
            OperationParameterUse.OUT,
            data.parameter?.get(2)?.use
        )
        assertEquals(
            "Acme Healthcare Services",
            data.publisher
        )
        assertEquals(
            ResourceType.QUESTIONNAIRE,
            data.resource?.get(0)
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            "False".toBoolean(),
            data.system?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "False".toBoolean(),
            data.type?.value
        )
        assertEquals(
            "http://h7.org/fhir/OperationDefinition/example",
            data.url
        )
        assertEquals(
            "venue",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "Clinical Venue",
            data.useContext?.get(0)?.code?.display
        )
        assertEquals(
            "http://build.fhir.org/codesystem-usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "IMP",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "inpatient encounter",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "B",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
