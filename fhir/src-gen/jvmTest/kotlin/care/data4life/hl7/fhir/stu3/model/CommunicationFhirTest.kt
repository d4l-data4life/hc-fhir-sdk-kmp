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
import care.data4life.hl7.fhir.stu3.codesystem.EventStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * CommunicationTest.java
 *
 * A record of information transmitted from a sender to a receiver
 *
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible
 * provider, a public health agency was notified about a reportable condition.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CommunicationFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testCommunication01() {
        // Given
        val sourceJson = loadAsString("stu3/communication-example-fm-attachment.json")

        // When
        val data = parser.toFhir(Communication::class, sourceJson)

        // Then
        assertCommunication01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCommunication01Step01(data: Communication) {
        assertEquals(
            expected = "SolicitedAttachment",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/messagetypes",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fm-attachment",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.providerco.com/communication",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.payload?.get(0)?.contentAttachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010-02-01T11:50:23-05:00",
            actual = data.payload?.get(0)?.contentAttachment?.creation?.value.toString()
        )

        assertEquals(
            expected = "SGVsbG8=",
            actual = data.payload?.get(0)?.contentAttachment?.data
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "accident notes 20100201.pdf",
            actual = data.payload?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.payload?.get(1)?.contentAttachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010-02-01T10:57:34+01:00",
            actual = data.payload?.get(1)?.contentAttachment?.creation?.value.toString()
        )

        assertEquals(
            expected = "SGVsbG8gdGhlcmU=",
            actual = data.payload?.get(1)?.contentAttachment?.hash
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "104274".toLong(),
            actual = data.payload?.get(1)?.contentAttachment?.size?.value
        )

        assertEquals(
            expected = "http://happyvalley.com/docs/AB12345",
            actual = data.payload?.get(1)?.contentAttachment?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.jurisdiction.com/insurer",
            actual = data.recipient?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123456",
            actual = data.recipient?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.jurisdiction.com/provideroffices",
            actual = data.sender?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3456",
            actual = data.sender?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-12T18:01:10-08:00",
            actual = data.sent?.value.toString()
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Attachment which is unsolicited</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.topic?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.topic?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/claimresponse",
            actual = data.topic?.get(1)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3500",
            actual = data.topic?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCommunication02() {
        // Given
        val sourceJson = loadAsString("stu3/communication-example-fm-solicited-attachment.json")

        // When
        val data = parser.toFhir(Communication::class, sourceJson)

        // Then
        assertCommunication02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCommunication02Step01(data: Communication) {
        assertEquals(
            expected = "#request",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SolicitedAttachment",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/messagetypes",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "payor",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "request",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fm-solicited",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.providerco.com/communication",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.payload?.get(0)?.contentAttachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010-02-01T11:50:23-05:00",
            actual = data.payload?.get(0)?.contentAttachment?.creation?.value.toString()
        )

        assertEquals(
            expected = "SGVsbG8=",
            actual = data.payload?.get(0)?.contentAttachment?.data
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "accident notes 20100201.pdf",
            actual = data.payload?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.payload?.get(1)?.contentAttachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010-02-01T10:57:34+01:00",
            actual = data.payload?.get(1)?.contentAttachment?.creation?.value.toString()
        )

        assertEquals(
            expected = "SGVsbG8gdGhlcmU=",
            actual = data.payload?.get(1)?.contentAttachment?.hash
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "104274".toLong(),
            actual = data.payload?.get(1)?.contentAttachment?.size?.value
        )

        assertEquals(
            expected = "http://happyvalley.com/docs/AB12345",
            actual = data.payload?.get(1)?.contentAttachment?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#payor",
            actual = data.recipient?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#provider",
            actual = data.sender?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-12T18:01:10-08:00",
            actual = data.sent?.value.toString()
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Attachment in response to a Request</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCommunication03() {
        // Given
        val sourceJson = loadAsString("stu3/communication-example.json")

        // When
        val data = parser.toFhir(Communication::class, sourceJson)

        // Then
        assertCommunication03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCommunication03Step01(data: Communication) {
        assertEquals(
            expected = "Alert",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/messagetypes",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Alert",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hyperkalemia",
            actual = data.definition?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.4.5.6.7",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Paging System",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2345678901",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WRITTEN",
            actual = data.medium?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "written",
            actual = data.medium?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ParticipationMode",
            actual = data.medium?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "written",
            actual = data.medium?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serum Potassium Observation",
            actual = data.partOf?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient 1 has a very high serum potassium value (7.2 mmol/L on 2014-Dec-12 at 5:55 pm)",
            actual = data.payload?.get(0)?.contentString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serum Potassium Observation",
            actual = data.payload?.get(1)?.contentReference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-12-12T18:01:11-08:00",
            actual = data.received?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.recipient?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/f001",
            actual = data.sender?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-12-12T18:01:10-08:00",
            actual = data.sent?.value.toString()
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Patient has very high serum potassium</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
