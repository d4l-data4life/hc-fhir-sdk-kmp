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
        assertEquals(
            "2016-06-06",
            data.batchIdentifier?.get(0)?.outerPackaging?.period?.end?.value.toString()
        )
        assertEquals(
            "http://ema.europa.eu/example/baid1",
            data.batchIdentifier?.get(0)?.outerPackaging?.system
        )
        assertEquals(
            "AAF5699",
            data.batchIdentifier?.get(0)?.outerPackaging?.value
        )
        assertEquals(
            "ALU-PVC/PVDC BLISTERS. CARTONS OF 10 FILM-COATED TABLETS. ",
            data.description
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://ema.europa.eu/example/pcid",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "{PCID}",
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
            "Organization/example",
            data.packageItem?.get(0)?.manufacturer?.get(0)?.reference
        )
        assertEquals(
            "PVC",
            data.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/packageItemContainerMaterial",
            data.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "PVDC",
            data.packageItem?.get(0)?.material?.get(1)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/packageItemContainerMaterial",
            data.packageItem?.get(0)?.material?.get(1)?.coding?.get(0)?.system
        )
        assertEquals(
            "alu",
            data.packageItem?.get(0)?.material?.get(2)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/packageItemContainerMaterial",
            data.packageItem?.get(0)?.material?.get(2)?.coding?.get(0)?.system
        )
        assertEquals(
            "MedicinalProductManufactured/example",
            data.packageItem?.get(0)?.packageItem?.get(0)?.manufacturedItem?.get(0)?.reference
        )
        assertEquals(
            "Organization/example",
            data.packageItem?.get(0)?.packageItem?.get(0)?.manufacturer?.get(0)?.reference
        )
        assertEquals(
            "Paperboard",
            data.packageItem?.get(0)?.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/packageItemContainerMaterial",
            data.packageItem?.get(0)?.packageItem?.get(0)?.material?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "mm",
            data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.height?.unit
        )
        assertEquals(
            "125".toDouble(),
            data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.height?.value?.value
        )
        assertEquals(
            "mm",
            data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.width?.unit
        )
        assertEquals(
            "45".toDouble(),
            data.packageItem?.get(0)?.packageItem?.get(0)?.physicalCharacteristics?.width?.value?.value
        )
        assertEquals(
            "1",
            data.packageItem?.get(0)?.packageItem?.get(0)?.quantity?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.packageItem?.get(0)?.packageItem?.get(0)?.quantity?.value?.value
        )
        assertEquals(
            "a",
            data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.period?.unit
        )
        assertEquals(
            "3".toDouble(),
            data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.period?.value?.value
        )
        assertEquals(
            "Thismedicinalproductdoesnotrequireanyspecialstoragecondition.",
            data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.specialPrecautionsForStorage?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/specialprecautionsforstorage",
            data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.specialPrecautionsForStorage?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "ShelfLifeofPackagedMedicinalProduct",
            data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/shelfLifeTypePlaceHolder",
            data.packageItem?.get(0)?.packageItem?.get(0)?.shelfLifeStorage?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Blister",
            data.packageItem?.get(0)?.packageItem?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/packageitemcontainertype",
            data.packageItem?.get(0)?.packageItem?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "mm",
            data.packageItem?.get(0)?.physicalCharacteristics?.depth?.unit
        )
        assertEquals(
            "23.5".toDouble(),
            data.packageItem?.get(0)?.physicalCharacteristics?.depth?.value?.value
        )
        assertEquals(
            "mm",
            data.packageItem?.get(0)?.physicalCharacteristics?.height?.unit
        )
        assertEquals(
            "50".toDouble(),
            data.packageItem?.get(0)?.physicalCharacteristics?.height?.value?.value
        )
        assertEquals(
            "mm",
            data.packageItem?.get(0)?.physicalCharacteristics?.width?.unit
        )
        assertEquals(
            "136".toDouble(),
            data.packageItem?.get(0)?.physicalCharacteristics?.width?.value?.value
        )
        assertEquals(
            "1",
            data.packageItem?.get(0)?.quantity?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.packageItem?.get(0)?.quantity?.value?.value
        )
        assertEquals(
            "Carton",
            data.packageItem?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/packageitemcontainertype",
            data.packageItem?.get(0)?.type?.coding?.get(0)?.system
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
