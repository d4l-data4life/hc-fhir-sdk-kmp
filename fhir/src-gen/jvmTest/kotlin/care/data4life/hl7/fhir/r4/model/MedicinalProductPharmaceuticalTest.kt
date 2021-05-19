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
 * MedicinalProductPharmaceuticalTest.java
 *
 * A pharmaceutical product described in terms of its composition and dose form
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductPharmaceuticalTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductPharmaceutical01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductpharmaceutical-example.json")

        // When
        val data = parser.toFhir(MedicinalProductPharmaceutical::class, sourceJson)

        // Then
        assertEquals(
            "Film-coatedtablet",
            data.administrableDoseForm?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/administrabledoseform",
            data.administrableDoseForm?.coding?.get(0)?.system
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://ema.europa.eu/example/phpididentifiersets",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "{PhPID}",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "MedicinalProductIngredient/example",
            data.ingredient?.get(0)?.reference
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
            "OralUse",
            data.routeOfAdministration?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/routeofadministration",
            data.routeOfAdministration?.get(0)?.code?.coding?.get(0)?.system
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
