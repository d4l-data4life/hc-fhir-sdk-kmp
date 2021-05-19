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
import care.data4life.hl7.fhir.r4.codesystem.IssueSeverity
import care.data4life.hl7.fhir.r4.codesystem.IssueType
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * OperationOutcomeTest.java
 *
 * Information about the success/failure of an action
 *
 * A collection of error, warning, or information messages that result from a system action.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class OperationOutcomeTest {

    val parser = FhirR4Parser()

    @Test
    fun testOperationOutcome01() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-validationfail.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertEquals(
            "validationfail",
            data.id
        )
        assertEquals(
            IssueType.STRUCTURE,
            data.issue?.get(0)?.code
        )
        assertEquals(
            "Error parsing resource XML (Unknown Content \"label\"",
            data.issue?.get(0)?.details?.text
        )
        assertEquals(
            "Patient.identifier",
            data.issue?.get(0)?.expression?.get(0)
        )
        assertEquals(
            "/f:Patient/f:identifier",
            data.issue?.get(0)?.location?.get(0)
        )
        assertEquals(
            IssueSeverity.ERROR,
            data.issue?.get(0)?.severity
        )
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOperationOutcome02() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-break-the-glass.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertEquals(
            "break-the-glass",
            data.id
        )
        assertEquals(
            IssueType.SUPPRESSED,
            data.issue?.get(0)?.code
        )
        assertEquals(
            "ETREAT",
            data.issue?.get(0)?.details?.coding?.get(0)?.code
        )
        assertEquals(
            "Emergency Treatment",
            data.issue?.get(0)?.details?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.issue?.get(0)?.details?.coding?.get(0)?.system
        )
        assertEquals(
            "Additional information may be available using the Break-The-Glass Protocol",
            data.issue?.get(0)?.details?.text
        )
        assertEquals(
            IssueSeverity.INFORMATION,
            data.issue?.get(0)?.severity
        )
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOperationOutcome03() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-searchfail.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertEquals(
            "searchfail",
            data.id
        )
        assertEquals(
            IssueType.CODE_INVALID,
            data.issue?.get(0)?.code
        )
        assertEquals(
            "The \"name\" parameter has the modifier \"exact\" which is not supported by this server",
            data.issue?.get(0)?.details?.text
        )
        assertEquals(
            "http.name:exact",
            data.issue?.get(0)?.location?.get(0)
        )
        assertEquals(
            IssueSeverity.FATAL,
            data.issue?.get(0)?.severity
        )
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOperationOutcome04() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-exception.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertEquals(
            "exception",
            data.id
        )
        assertEquals(
            IssueType.EXCEPTION,
            data.issue?.get(0)?.code
        )
        assertEquals(
            "SQL Link Communication Error (dbx = 34234)",
            data.issue?.get(0)?.details?.text
        )
        assertEquals(
            IssueSeverity.ERROR,
            data.issue?.get(0)?.severity
        )
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOperationOutcome05() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertEquals(
            "101",
            data.id
        )
        assertEquals(
            IssueType.CODE_INVALID,
            data.issue?.get(0)?.code
        )
        assertEquals(
            "The code \"W\" is not known and not legal in this context",
            data.issue?.get(0)?.details?.text
        )
        assertEquals(
            "Acme.Interop.FHIRProcessors.Patient.processGender line 2453",
            data.issue?.get(0)?.diagnostics
        )
        assertEquals(
            "Patient.gender",
            data.issue?.get(0)?.expression?.get(0)
        )
        assertEquals(
            "/f:Patient/f:gender",
            data.issue?.get(0)?.location?.get(0)
        )
        assertEquals(
            IssueSeverity.ERROR,
            data.issue?.get(0)?.severity
        )
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testOperationOutcome06() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-allok.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertEquals(
            "allok",
            data.id
        )
        assertEquals(
            IssueType.INFORMATIONAL,
            data.issue?.get(0)?.code
        )
        assertEquals(
            "All OK",
            data.issue?.get(0)?.details?.text
        )
        assertEquals(
            IssueSeverity.INFORMATION,
            data.issue?.get(0)?.severity
        )
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
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
