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
import care.data4life.hl7.fhir.stu3.codesystem.ActionList
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ProcessRequestTest.java
 *
 * Request to perform some action on or in regards to an existing resource
 *
 * This resource provides the target, request and response, and action details for an action to be
 * performed by the target on or about existing resources.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ProcessRequestFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testProcessRequest01() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-poll-exclusive.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest01Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.POLL,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Communication",
            actual = data.exclude?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PaymentReconciliation",
            actual = data.exclude?.get(1)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1113",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "113",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Poll ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest02() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-poll-eob.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest02Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.POLL,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "1115",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.phr.com/patient/12345/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "115",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ExplanationOfBenefit",
            actual = data.include?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Poll ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest03() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-poll-specific.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest03Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.POLL,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "1111",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "111",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://npid.org/providerid",
            actual = data.provider?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AF12345",
            actual = data.provider?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://benefitco.com/oralhealthclaim/12345",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ninsurers.org/payorid",
            actual = data.target?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WI12345",
            actual = data.target?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Poll ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest04() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-poll-inclusive.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest04Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.POLL,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "1112",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "112",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PaymentReconciliation",
            actual = data.include?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Poll ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest05() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-poll-payrec.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest05Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.POLL,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "1114",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "114",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PaymentReconciliation",
            actual = data.include?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-20",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-08-10",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Poll ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest06() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest06Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.POLL,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "1110",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Poll ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest07() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-reverse.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest07Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.CANCEL,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "87654",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "76543",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.nullify?.value
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://BenefitsInc.com/fhir/claim/12345",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Reversal ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest08() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-reprocess.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest08Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.REPROCESS,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "44654",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44543",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.item?.get(0)?.sequenceLinkId?.value
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ABC12345G",
            actual = data.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://BenefitsInc.com/fhir/claim/12345",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ReProcess ProcessRequest resource.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcessRequest09() {
        // Given
        val sourceJson = loadAsString("stu3/processrequest-example-status.json")

        // When
        val data = parser.toFhir(ProcessRequest::class, sourceJson)

        // Then
        assertProcessRequest09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcessRequest09Step01(data: ProcessRequest) {
        assertEquals(
            expected = ActionList.STATUS,
            actual = data.action
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "87655",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/processrequest",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1776543",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.organization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim/12345",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://BenefitsInc.com/fhir/claimresponse/3500",
            actual = data.response?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the Status ProcessRequest</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
