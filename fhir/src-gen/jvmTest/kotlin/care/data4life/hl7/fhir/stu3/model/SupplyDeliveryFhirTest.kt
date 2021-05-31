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
import care.data4life.hl7.fhir.stu3.codesystem.SupplyDeliveryStatus
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
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SupplyDeliveryFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testSupplyDelivery01() {
        // Given
        val sourceJson = loadAsString("stu3/supplydelivery-example.json")

        // When
        val data = parser.toFhir(SupplyDelivery::class, sourceJson)

        // Then
        assertSupplyDelivery01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSupplyDelivery01Step01(data: SupplyDelivery) {

        assertEquals(
            expected = "SupplyRequest/simpleorder",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location 1",
            actual = data.destination?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "simpledelivery",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Order10284",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-12-31",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Central Supply Restock",
            actual = data.partOf?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SupplyDeliveryStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "BlueTubes",
            actual = data.suppliedItem?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blood collect tubes blue cap",
            actual = data.suppliedItem?.itemCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10".toDouble(),
            actual = data.suppliedItem?.quantity?.value?.value
        )

        assertEquals(
            expected = "Vendor1",
            actual = data.supplier?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "device",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/supply-item-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blood collect tubes blue cap",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testSupplyDelivery02() {
        // Given
        val sourceJson = loadAsString("stu3/supplydelivery-example-pumpdelivery.json")

        // When
        val data = parser.toFhir(SupplyDelivery::class, sourceJson)

        // Then
        assertSupplyDelivery02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSupplyDelivery02Step01(data: SupplyDelivery) {

        assertEquals(
            expected = "Home care dept",
            actual = data.destination?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pumpdelivery",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SupplierDeliveryNr",
            actual = data.identifier?.assigner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "98398459409",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mr. Belpit",
            actual = data.patient?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nurse Smith",
            actual = data.receiver?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SupplyDeliveryStatus.IN_PROGRESS,
            actual = data.status
        )

        assertEquals(
            expected = "ACME distribution",
            actual = data.supplier?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
