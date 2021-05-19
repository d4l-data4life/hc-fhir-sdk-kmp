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
import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CommunicationTest.java
 *
 * A record of information transmitted from a sender to a receiver
 *
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible
 * provider, a public health agency that was notified about a reportable condition.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CommunicationTest {

    val parser = FhirR4Parser()

    @Test
    fun testCommunication01() {
        // Given
        val sourceJson = loadAsString("r4/communication-example-fm-attachment.json")

        // When
        val data = parser.toFhir(Communication::class, sourceJson)

        // Then
        assertEquals(
            "http://happyvalley.com/claim",
            data.about?.get(0)?.identifier?.system
        )
        assertEquals(
            "12345",
            data.about?.get(0)?.identifier?.value
        )
        assertEquals(
            "http://www.BenefitsInc.com/fhir/claimresponse",
            data.about?.get(1)?.identifier?.system
        )
        assertEquals(
            "R3500",
            data.about?.get(1)?.identifier?.value
        )
        assertEquals(
            "SolicitedAttachment",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://acme.org/messagetypes",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "fm-attachment",
            data.id
        )
        assertEquals(
            "http://www.providerco.com/communication",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
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
            "application/pdf",
            data.payload?.get(0)?.contentAttachment?.contentType
        )
        assertEquals(
            "2010-02-01T11:50:23-05:00",
            data.payload?.get(0)?.contentAttachment?.creation?.value.toString()
        )
        assertEquals(
            "SGVsbG8=",
            data.payload?.get(0)?.contentAttachment?.data
        )
        assertEquals(
            "accident notes 20100201.pdf",
            data.payload?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "application/pdf",
            data.payload?.get(1)?.contentAttachment?.contentType
        )
        assertEquals(
            "2010-02-01T10:57:34+01:00",
            data.payload?.get(1)?.contentAttachment?.creation?.value.toString()
        )
        assertEquals(
            "SGVsbG8gdGhlcmU=",
            data.payload?.get(1)?.contentAttachment?.hash
        )
        assertEquals(
            "104274".toLong(),
            data.payload?.get(1)?.contentAttachment?.size?.value
        )
        assertEquals(
            "http://example.org/docs/AB12345",
            data.payload?.get(1)?.contentAttachment?.url
        )
        assertEquals(
            "http://www.jurisdiction.com/insurer",
            data.recipient?.get(0)?.identifier?.system
        )
        assertEquals(
            "123456",
            data.recipient?.get(0)?.identifier?.value
        )
        assertEquals(
            "http://www.jurisdiction.com/provideroffices",
            data.sender?.identifier?.system
        )
        assertEquals(
            "3456",
            data.sender?.identifier?.value
        )
        assertEquals(
            "2016-06-12T18:01:10-08:00",
            data.sent?.value.toString()
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/1",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Attachment which is unsolicited</div>",
            data.text?.div
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
    fun testCommunication02() {
        // Given
        val sourceJson = loadAsString("r4/communication-example-fm-solicited-attachment.json")

        // When
        val data = parser.toFhir(Communication::class, sourceJson)

        // Then
        assertEquals(
            "#request",
            data.basedOn?.get(0)?.reference
        )
        assertEquals(
            "SolicitedAttachment",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://acme.org/messagetypes",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "provider",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "payor",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "request",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "fm-solicited",
            data.id
        )
        assertEquals(
            "http://www.providerco.com/communication",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
            data.identifier?.get(0)?.value
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
            "application/pdf",
            data.payload?.get(0)?.contentAttachment?.contentType
        )
        assertEquals(
            "2010-02-01T11:50:23-05:00",
            data.payload?.get(0)?.contentAttachment?.creation?.value.toString()
        )
        assertEquals(
            "SGVsbG8=",
            data.payload?.get(0)?.contentAttachment?.data
        )
        assertEquals(
            "accident notes 20100201.pdf",
            data.payload?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "application/pdf",
            data.payload?.get(1)?.contentAttachment?.contentType
        )
        assertEquals(
            "2010-02-01T10:57:34+01:00",
            data.payload?.get(1)?.contentAttachment?.creation?.value.toString()
        )
        assertEquals(
            "SGVsbG8gdGhlcmU=",
            data.payload?.get(1)?.contentAttachment?.hash
        )
        assertEquals(
            "104274".toLong(),
            data.payload?.get(1)?.contentAttachment?.size?.value
        )
        assertEquals(
            "http://happyvalley.com/docs/AB12345",
            data.payload?.get(1)?.contentAttachment?.url
        )
        assertEquals(
            "#payor",
            data.recipient?.get(0)?.reference
        )
        assertEquals(
            "#provider",
            data.sender?.reference
        )
        assertEquals(
            "2016-06-12T18:01:10-08:00",
            data.sent?.value.toString()
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/1",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Attachment in response to a Request</div>",
            data.text?.div
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
    fun testCommunication03() {
        // Given
        val sourceJson = loadAsString("r4/communication-example.json")

        // When
        val data = parser.toFhir(Communication::class, sourceJson)

        // Then
        assertEquals(
            "Alert",
            data.category?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://acme.org/messagetypes",
            data.category?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Alert",
            data.category?.get(0)?.text
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "urn:oid:1.3.4.5.6.7",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "Paging System",
            data.identifier?.get(0)?.type?.text
        )
        assertEquals(
            "2345678901",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://example.org/hyperkalemia",
            data.instantiatesUri?.get(0)
        )
        assertEquals(
            "WRITTEN",
            data.medium?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "written",
            data.medium?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ParticipationMode",
            data.medium?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "written",
            data.medium?.get(0)?.text
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
            "Serum Potassium Observation",
            data.partOf?.get(0)?.display
        )
        assertEquals(
            "Patient 1 has a very high serum potassium value (7.2 mmol/L on 2014-Dec-12 at 5:55 pm)",
            data.payload?.get(0)?.contentString
        )
        assertEquals(
            "Serum Potassium Observation",
            data.payload?.get(1)?.contentReference?.display
        )
        assertEquals(
            "2014-12-12T18:01:11-08:00",
            data.received?.value.toString()
        )
        assertEquals(
            "Practitioner/example",
            data.recipient?.get(0)?.reference
        )
        assertEquals(
            "Device/f001",
            data.sender?.reference
        )
        assertEquals(
            "2014-12-12T18:01:10-08:00",
            data.sent?.value.toString()
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Patient has very high serum potassium</div>",
            data.text?.div
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
