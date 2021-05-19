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
import care.data4life.hl7.fhir.r4.codesystem.SupplyDeliveryStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * SupplyDeliveryTest.java
 *
 * Delivery of bulk Supplies
 *
 * Record of delivery of what is supplied.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SupplyDeliveryTest {

    val parser = FhirR4Parser()

    @Test
    fun testSupplyDelivery01() {
        // Given
        val sourceJson = loadAsString("r4/supplydelivery-example.json")

        // When
        val data = parser.toFhir(SupplyDelivery::class, sourceJson)

        // Then
        assertEquals(
            "SupplyRequest/simpleorder",
            data.basedOn?.get(0)?.reference
        )
        assertEquals(
            "Location 1",
            data.destination?.display
        )
        assertEquals(
            "simpledelivery",
            data.id
        )
        assertEquals(
            "Order10284",
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
            "2016-12-31",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Central Supply Restock",
            data.partOf?.get(0)?.display
        )
        assertEquals(
            SupplyDeliveryStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "BlueTubes",
            data.suppliedItem?.itemCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Blood collect tubes blue cap",
            data.suppliedItem?.itemCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "10".toDouble(),
            data.suppliedItem?.quantity?.value?.value
        )
        assertEquals(
            "Vendor1",
            data.supplier?.display
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "device",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/supply-item-type",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Blood collect tubes blue cap",
            data.type?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSupplyDelivery02() {
        // Given
        val sourceJson = loadAsString("r4/supplydelivery-example-pumpdelivery.json")

        // When
        val data = parser.toFhir(SupplyDelivery::class, sourceJson)

        // Then
        assertEquals(
            "Home care dept",
            data.destination?.display
        )
        assertEquals(
            "pumpdelivery",
            data.id
        )
        assertEquals(
            "SupplierDeliveryNr",
            data.identifier?.get(0)?.assigner?.display
        )
        assertEquals(
            "98398459409",
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
            "Mr. Belpit",
            data.patient?.display
        )
        assertEquals(
            "Nurse Smith",
            data.receiver?.get(0)?.display
        )
        assertEquals(
            SupplyDeliveryStatus.IN_PROGRESS,
            data.status
        )
        assertEquals(
            "ACME distribution",
            data.supplier?.display
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
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
