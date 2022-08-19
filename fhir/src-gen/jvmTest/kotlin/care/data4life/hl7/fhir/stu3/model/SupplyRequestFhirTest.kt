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
import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.SupplyRequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * SupplyRequestTest.java
 *
 * Request for a medication, substance or device
 *
 * A record of a request for a medication, substance or device used in the healthcare setting.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SupplyRequestFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testSupplyRequest01() {
        // Given
        val sourceJson = loadAsString("stu3/supplyrequest-example-simpleorder.json")

        // When
        val data = parser.toFhir(SupplyRequest::class, sourceJson)

        // Then
        assertSupplyRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSupplyRequest01Step01(data: SupplyRequest) {
        assertEquals(
            expected = "2016-12-31",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "central",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Central Stock Resupply",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location 1",
            actual = data.deliverFrom?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "GoodHealth Clinic Receiving",
            actual = data.deliverTo?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "simpleorder",
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
            expected = "BlueTubes",
            actual = data.orderedItem?.itemCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blood collect tubes blue cap",
            actual = data.orderedItem?.itemCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10".toDouble(),
            actual = data.orderedItem?.quantity?.value?.value
        )

        assertEquals(
            expected = RequestPriority.ASAP,
            actual = data.priority
        )

        assertEquals(
            expected = "stock_low",
            actual = data.reasonCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Refill due to low stock",
            actual = data.reasonCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Henry Seven",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Purchasing Dept",
            actual = data.requester?.onBehalfOf?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SupplyRequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Vendor1",
            actual = data.supplier?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
