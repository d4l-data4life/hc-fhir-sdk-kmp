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
 * MedicinalProductPackagedTest.java
 *
 * A medicinal product in a container or package
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductPackagedTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductPackaged01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductpackaged-example.json")

        // When
        val data = parser.toFhir(MedicinalProductPackaged::class, sourceJson)

        // Then
        assertMedicinalProductPackaged01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicinalProductPackaged01Step01(data: MedicinalProductPackaged) {

        assertEquals(
            expected = "2016-06-06",
            actual = data.batchIdentifier?.get(0)?.outerPackaging?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/baid1",
            actual = data.batchIdentifier?.get(0)?.outerPackaging?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AAF5699",
            actual = data.batchIdentifier?.get(0)?.outerPackaging?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ALU-PVC/PVDC BLISTERS. CARTONS OF 10 FILM-COATED TABLETS. ",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/pcid",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "{PCID}",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.packageItem?.get(0)?.manufacturer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PVC",
            actual = data.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/packageItemContainerMaterial",
            actual = data.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PVDC",
            actual = data.packageItem?.get(0)?.material?.get(1)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/packageItemContainerMaterial",
            actual = data.packageItem?.get(0)?.material?.get(1)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "alu",
            actual = data.packageItem?.get(0)?.material?.get(2)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/packageItemContainerMaterial",
            actual = data.packageItem?.get(0)?.material?.get(2)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicinalProductManufactured/example",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.manufacturedItem?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.manufacturer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Paperboard",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/packageItemContainerMaterial",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mm",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.height?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "125".toDouble(),
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.height?.value?.value
        )

        assertEquals(
            expected = "mm",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.width?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "45".toDouble(),
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.width?.value?.value
        )

        assertEquals(
            expected = "1",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.period?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toDouble(),
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.period?.value?.value
        )

        assertEquals(
            expected = "Thismedicinalproductdoesnotrequireanyspecialstoragecondition.",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.specialPrecautionsForStorage?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/specialprecautionsforstorage",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.specialPrecautionsForStorage?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ShelfLifeofPackagedMedicinalProduct",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/shelfLifeTypePlaceHolder",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Blister",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/packageitemcontainertype",
            actual = data.packageItem?.get(0)?.packageItem?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mm",
            actual = data.packageItem?.get(0)?.physicalCharacteristics?.depth?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "23.5".toDouble(),
            actual = data.packageItem?.get(0)?.physicalCharacteristics?.depth?.value?.value
        )

        assertEquals(
            expected = "mm",
            actual = data.packageItem?.get(0)?.physicalCharacteristics?.height?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toDouble(),
            actual = data.packageItem?.get(0)?.physicalCharacteristics?.height?.value?.value
        )

        assertEquals(
            expected = "mm",
            actual = data.packageItem?.get(0)?.physicalCharacteristics?.width?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "136".toDouble(),
            actual = data.packageItem?.get(0)?.physicalCharacteristics?.width?.value?.value
        )

        assertEquals(
            expected = "1",
            actual = data.packageItem?.get(0)?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.packageItem?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "Carton",
            actual = data.packageItem?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/packageitemcontainertype",
            actual = data.packageItem?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
