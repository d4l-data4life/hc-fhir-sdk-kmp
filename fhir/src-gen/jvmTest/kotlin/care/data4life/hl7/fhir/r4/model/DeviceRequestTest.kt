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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * DeviceRequestTest.java
 *
 * Medical device request
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable
 * device, or an external assistive device, such as a walker.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class DeviceRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testDeviceRequest01() {
        // Given
        val sourceJson = loadAsString("r4/devicerequest-example-insulinpump.json")

        // When
        val data = parser.toFhir(DeviceRequest::class, sourceJson)

        // Then
        assertEquals(
            "2013-05-08T09:33:27+07:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "Homecare - DM follow-up",
            data.basedOn?.get(0)?.display
        )
        assertEquals(
            "43148-6",
            data.codeCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.codeCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "Insulin delivery device panel",
            data.codeCodeableConcept?.text
        )
        assertEquals(
            "Encounter 1",
            data.encounter?.display
        )
        assertEquals(
            "ip_request1",
            data.groupIdentifier?.value
        )
        assertEquals(
            "insulinpump",
            data.id
        )
        assertEquals(
            "ip_request1.1",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://motivemi.com/artifacts/PlanDefinition/low-suicide-risk-order-set",
            data.instantiatesCanonical?.get(0)
        )
        assertEquals(
            RequestIntent.INSTANCE_ORDER,
            data.intent
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
            "this is the right device brand and model",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2013-05-08T09:33:27+07:00",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Nurse Rossignol",
            data.performer?.display
        )
        assertEquals(
            "Qualified nurse",
            data.performerType?.coding?.get(0)?.display
        )
        assertEquals(
            "Nurse",
            data.performerType?.text
        )
        assertEquals(
            "CGM ambulatory",
            data.priorRequest?.get(0)?.display
        )
        assertEquals(
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            "gastroparesis",
            data.reasonCode?.get(0)?.text
        )
        assertEquals(
            "Gastroparesis",
            data.reasonReference?.get(0)?.display
        )
        assertEquals(
            "Request for unspecified device",
            data.relevantHistory?.get(0)?.display
        )
        assertEquals(
            "Dr. Adam Careful",
            data.requester?.display
        )
        assertEquals(
            "Practitioner/example",
            data.requester?.reference
        )
        assertEquals(
            RequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Patient/dicom",
            data.subject?.reference
        )
        assertEquals(
            "Previous results",
            data.supportingInfo?.get(0)?.display
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
    fun testDeviceRequest02() {
        // Given
        val sourceJson = loadAsString("r4/devicerequest-example.json")

        // When
        val data = parser.toFhir(DeviceRequest::class, sourceJson)

        // Then
        assertEquals(
            "Device/example",
            data.codeReference?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            RequestIntent.ORIGINAL_ORDER,
            data.intent
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
            RequestStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
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
