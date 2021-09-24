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
class OperationOutcomeFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testOperationOutcome01() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-validationfail.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertOperationOutcome01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOperationOutcome01Step01(data: OperationOutcome) {

        assertEquals(
            expected = "validationfail",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueType.STRUCTURE,
            actual = data.issue?.get(0)?.code
        )

        assertEquals(
            expected = "Error parsing resource XML (Unknown Content \"label\"",
            actual = data.issue?.get(0)?.details?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.identifier",
            actual = data.issue?.get(0)?.expression?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/f:Patient/f:identifier",
            actual = data.issue?.get(0)?.location?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueSeverity.ERROR,
            actual = data.issue?.get(0)?.severity
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOperationOutcome02() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-break-the-glass.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertOperationOutcome02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOperationOutcome02Step01(data: OperationOutcome) {

        assertEquals(
            expected = "break-the-glass",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueType.SUPPRESSED,
            actual = data.issue?.get(0)?.code
        )

        assertEquals(
            expected = "ETREAT",
            actual = data.issue?.get(0)?.details?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Emergency Treatment",
            actual = data.issue?.get(0)?.details?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.issue?.get(0)?.details?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Additional information may be available using the Break-The-Glass Protocol",
            actual = data.issue?.get(0)?.details?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueSeverity.INFORMATION,
            actual = data.issue?.get(0)?.severity
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOperationOutcome03() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-searchfail.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertOperationOutcome03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOperationOutcome03Step01(data: OperationOutcome) {

        assertEquals(
            expected = "searchfail",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueType.CODE_INVALID,
            actual = data.issue?.get(0)?.code
        )

        assertEquals(
            expected = "The \"name\" parameter has the modifier \"exact\" which is not supported by this server",
            actual = data.issue?.get(0)?.details?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http.name:exact",
            actual = data.issue?.get(0)?.location?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueSeverity.FATAL,
            actual = data.issue?.get(0)?.severity
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOperationOutcome04() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-exception.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertOperationOutcome04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOperationOutcome04Step01(data: OperationOutcome) {

        assertEquals(
            expected = "exception",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueType.EXCEPTION,
            actual = data.issue?.get(0)?.code
        )

        assertEquals(
            expected = "SQL Link Communication Error (dbx = 34234)",
            actual = data.issue?.get(0)?.details?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueSeverity.ERROR,
            actual = data.issue?.get(0)?.severity
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOperationOutcome05() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertOperationOutcome05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOperationOutcome05Step01(data: OperationOutcome) {

        assertEquals(
            expected = "101",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueType.CODE_INVALID,
            actual = data.issue?.get(0)?.code
        )

        assertEquals(
            expected = "The code \"W\" is not known and not legal in this context",
            actual = data.issue?.get(0)?.details?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Acme.Interop.FHIRProcessors.Patient.processGender line 2453",
            actual = data.issue?.get(0)?.diagnostics
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.gender",
            actual = data.issue?.get(0)?.expression?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "/f:Patient/f:gender",
            actual = data.issue?.get(0)?.location?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueSeverity.ERROR,
            actual = data.issue?.get(0)?.severity
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testOperationOutcome06() {
        // Given
        val sourceJson = loadAsString("r4/operationoutcome-example-allok.json")

        // When
        val data = parser.toFhir(OperationOutcome::class, sourceJson)

        // Then
        assertOperationOutcome06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertOperationOutcome06Step01(data: OperationOutcome) {

        assertEquals(
            expected = "allok",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueType.INFORMATIONAL,
            actual = data.issue?.get(0)?.code
        )

        assertEquals(
            expected = "All OK",
            actual = data.issue?.get(0)?.details?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IssueSeverity.INFORMATION,
            actual = data.issue?.get(0)?.severity
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
