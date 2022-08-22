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
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.TestReportActionResult
import care.data4life.hl7.fhir.stu3.codesystem.TestReportParticipantType
import care.data4life.hl7.fhir.stu3.codesystem.TestReportResult
import care.data4life.hl7.fhir.stu3.codesystem.TestReportStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * TestReportTest.java
 *
 * Describes the results of a TestScript execution
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class TestReportFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testTestReport01() {
        // Given
        val sourceJson = loadAsString("stu3/testreport-example.json")

        // When
        val data = parser.toFhir(TestReport::class, sourceJson)

        // Then
        assertTestReport01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTestReport01Step01(data: TestReport) {
        assertEquals(
            expected = "testreport-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.9878",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-07T08:25:34-05:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "TestReport Example for TestScript Example",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Crucible",
            actual = data.participant?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportParticipantType.TEST_ENGINE,
            actual = data.participant?.get(0)?.type
        )

        assertEquals(
            expected = "http://projectcrucible.org",
            actual = data.participant?.get(0)?.uri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HealthIntersections STU3",
            actual = data.participant?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportParticipantType.SERVER,
            actual = data.participant?.get(1)?.type
        )

        assertEquals(
            expected = "http://fhir3.healthintersections.com.au/open",
            actual = data.participant?.get(1)?.uri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportResult.PASS,
            actual = data.result
        )

        assertEquals(
            expected = "100.0".toDouble(),
            actual = data.score?.value
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/1",
            actual = data.setup?.action?.get(0)?.operation?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DELETE Patient",
            actual = data.setup?.action?.get(0)?.operation?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.setup?.action?.get(0)?.operation?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/1",
            actual = data.setup?.action?.get(1)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTTP 204",
            actual = data.setup?.action?.get(1)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.setup?.action?.get(1)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/1",
            actual = data.setup?.action?.get(2)?.operation?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "POST Patient/fixture-patient-create",
            actual = data.setup?.action?.get(2)?.operation?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.setup?.action?.get(2)?.operation?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/1",
            actual = data.setup?.action?.get(3)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTTP 201",
            actual = data.setup?.action?.get(3)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.setup?.action?.get(3)?.assert?.result
        )

        assertEquals(
            expected = TestReportStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/3",
            actual = data.teardown?.action?.get(0)?.operation?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DELETE Patient/fixture-patient-create.",
            actual = data.teardown?.action?.get(0)?.operation?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.teardown?.action?.get(0)?.operation?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "GET Patient/fixture-patient-create",
            actual = data.test?.get(0)?.action?.get(0)?.operation?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(0)?.operation?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTTP 200",
            actual = data.test?.get(0)?.action?.get(1)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(1)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Last-Modified Present",
            actual = data.test?.get(0)?.action?.get(2)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(2)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Response is Patient",
            actual = data.test?.get(0)?.action?.get(3)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(3)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Response validates",
            actual = data.test?.get(0)?.action?.get(4)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(4)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.name.family 'Chalmers'",
            actual = data.test?.get(0)?.action?.get(5)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(5)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.name.given 'Peter'",
            actual = data.test?.get(0)?.action?.get(6)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(6)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.name.family 'Chalmers'",
            actual = data.test?.get(0)?.action?.get(7)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(7)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.name.family 'Chalmers'",
            actual = data.test?.get(0)?.action?.get(8)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(8)?.assert?.result
        )

        assertEquals(
            expected = "http://projectcrucible.org/permalink/2",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.detail
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient expected values.",
            actual = data.test?.get(0)?.action?.get(9)?.assert?.message
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TestReportActionResult.PASS,
            actual = data.test?.get(0)?.action?.get(9)?.assert?.result
        )

        assertEquals(
            expected = "Read a Patient and validate response.",
            actual = data.test?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "01-ReadPatient",
            actual = data.test?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Read Patient",
            actual = data.test?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TestScript/testscript-example",
            actual = data.testScript?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HL7 Execution Engine",
            actual = data.tester
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
