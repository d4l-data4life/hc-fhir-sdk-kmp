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
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicinalProductManufacturedTest.java
 *
 * The manufactured item as contained in the packaged medicinal product
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductManufacturedTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductManufactured01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductmanufactured-example.json")

        // When
        val data = parser.toFhir(MedicinalProductManufactured::class, sourceJson)

        // Then
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "MedicinalProductIngredient/example",
            data.ingredient?.get(0)?.reference
        )
        assertEquals(
            "Film-coatedtablet",
            data.manufacturedDoseForm?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/manufactureddoseform",
            data.manufacturedDoseForm?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/example",
            data.manufacturer?.get(0)?.reference
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
            "Pink",
            data.physicalCharacteristics?.color?.get(0)
        )
        assertEquals(
            "894",
            data.physicalCharacteristics?.imprint?.get(0)
        )
        assertEquals(
            "Oval",
            data.physicalCharacteristics?.shape
        )
        assertEquals(
            "1",
            data.quantity?.unit
        )
        assertEquals(
            "10".toDouble(),
            data.quantity?.value?.value
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Tablet",
            data.unitOfPresentation?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/unitofpresentation",
            data.unitOfPresentation?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
