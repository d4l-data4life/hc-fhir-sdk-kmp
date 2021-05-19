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
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.SupplyRequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * SupplyRequestTest.java
 *
 * Request for a medication, substance or device
 *
 * A record of a request for a medication, substance or device used in the healthcare setting.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SupplyRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testSupplyRequest01() {
        // Given
        val sourceJson = loadAsString("r4/supplyrequest-example-simpleorder.json")

        // When
        val data = parser.toFhir(SupplyRequest::class, sourceJson)

        // Then
        assertEquals(
            "2016-12-31",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "central",
            data.category?.coding?.get(0)?.code
        )
        assertEquals(
            "Central Stock Resupply",
            data.category?.coding?.get(0)?.display
        )
        assertEquals(
            "Location 1",
            data.deliverFrom?.display
        )
        assertEquals(
            "GoodHealth Clinic Receiving",
            data.deliverTo?.display
        )
        assertEquals(
            "simpleorder",
            data.id
        )
        assertEquals(
            "Order10284",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "BlueTubes",
            data.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Blood collect tubes blue cap",
            data.itemCodeableConcept?.coding?.get(0)?.display
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
            "2016-12-31",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            RequestPriority.ASAP,
            data.priority
        )
        assertEquals(
            "10".toDouble(),
            data.quantity?.value?.value
        )
        assertEquals(
            "stock_low",
            data.reasonCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Refill due to low stock",
            data.reasonCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "Henry Seven",
            data.requester?.display
        )
        assertEquals(
            SupplyRequestStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Vendor1",
            data.supplier?.get(0)?.display
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
