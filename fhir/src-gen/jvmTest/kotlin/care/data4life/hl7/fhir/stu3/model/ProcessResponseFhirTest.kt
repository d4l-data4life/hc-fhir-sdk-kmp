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
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ProcessResponseTest.java
 *
 * ProcessResponse resource
 *
 * This resource provides processing status, errors and notes from the processing of a resource.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ProcessResponseFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testProcessResponse01() {
        // Given
        val sourceJson = loadAsString("stu3/processresponse-example.json")

        // When
        val data = parser.toFhir(ProcessResponse::class, sourceJson)

        // Then
        assertProcessResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessResponse01Step01(data: ProcessResponse) {

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Adjudication processing completed, ClaimResponse and EOB ready for retrieval.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SR2500",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/processresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "881234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/processoutcomecodes",
            actual = data.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/fhir/claim/12345",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ProcessResponse</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessResponse02() {
        // Given
        val sourceJson = loadAsString("stu3/processresponse-example-error.json")

        // When
        val data = parser.toFhir(ProcessResponse::class, sourceJson)

        // Then
        assertProcessResponse02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessResponse02Step01(data: ProcessResponse) {

        assertEquals(
            expected = "2014-07-14",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Referred to claim not found on system.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a001",
            actual = data.error?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/adjudication-error",
            actual = data.error?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRRESP/2016/01",
            actual = data.form?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ncforms.org/formid",
            actual = data.form?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SR2349",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/processresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ER987634",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "error",
            actual = data.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/processoutcomecodes",
            actual = data.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Please check the submitted payor identification and local claim number.",
            actual = data.processNote?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "print",
            actual = data.processNote?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/note-type",
            actual = data.processNote?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/fhir/claim/12204",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://npid.org/providerid",
            actual = data.requestProvider?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AZ43258",
            actual = data.requestProvider?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ProcessResponse</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessResponse03() {
        // Given
        val sourceJson = loadAsString("stu3/processresponse-example-pended.json")

        // When
        val data = parser.toFhir(ProcessResponse::class, sourceJson)

        // Then
        assertProcessResponse03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessResponse03Step01(data: ProcessResponse) {

        assertEquals(
            expected = "#comreq-1",
            actual = data.communicationRequest?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "comreq-1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Additional information required.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SR2499",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/processresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "881222",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pended",
            actual = data.outcome?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/processoutcomecodes",
            actual = data.outcome?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/fhir/claim/12345",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A ProcessResponse indicating pended status with a request for additional information.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
