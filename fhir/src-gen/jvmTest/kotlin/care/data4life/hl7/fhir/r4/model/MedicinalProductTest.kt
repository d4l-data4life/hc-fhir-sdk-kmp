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
 * MedicinalProductTest.java
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use)
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProduct01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproduct-example.json")

        // When
        val data = parser.toFhir(MedicinalProduct::class, sourceJson)

        // Then
        assertEquals(
            "DocumentReference/example",
            data.attachedDocument?.get(0)?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://ema.europa.eu/example/MPID",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "{mpid}",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://ema.europa.eu/example/manufacturingAuthorisationReferenceNumber",
            data.manufacturingBusinessOperation?.get(0)?.authorisationReferenceNumber?.system
        )
        assertEquals(
            "1324TZ",
            data.manufacturingBusinessOperation?.get(0)?.authorisationReferenceNumber?.value
        )
        assertEquals(
            "2013-03-15",
            data.manufacturingBusinessOperation?.get(0)?.effectiveDate?.value.toString()
        )
        assertEquals(
            "Organization/example",
            data.manufacturingBusinessOperation?.get(0)?.manufacturer?.get(0)?.reference
        )
        assertEquals(
            "Batchrelease",
            data.manufacturingBusinessOperation?.get(0)?.operationType?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/manufacturingOperationType",
            data.manufacturingBusinessOperation?.get(0)?.operationType?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/example",
            data.manufacturingBusinessOperation?.get(0)?.regulator?.reference
        )
        assertEquals(
            "DocumentReference/example",
            data.masterFile?.get(0)?.reference
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
            "EU",
            data.name?.get(0)?.countryLanguage?.get(0)?.country?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/countryCode",
            data.name?.get(0)?.countryLanguage?.get(0)?.country?.coding?.get(0)?.system
        )
        assertEquals(
            "EU",
            data.name?.get(0)?.countryLanguage?.get(0)?.jurisdiction?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/jurisdictionCode",
            data.name?.get(0)?.countryLanguage?.get(0)?.jurisdiction?.coding?.get(0)?.system
        )
        assertEquals(
            "EN",
            data.name?.get(0)?.countryLanguage?.get(0)?.language?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/languageCode",
            data.name?.get(0)?.countryLanguage?.get(0)?.language?.coding?.get(0)?.system
        )
        assertEquals(
            "Equilidem",
            data.name?.get(0)?.namePart?.get(0)?.part
        )
        assertEquals(
            "INV",
            data.name?.get(0)?.namePart?.get(0)?.type?.code
        )
        assertEquals(
            "2.5 mg",
            data.name?.get(0)?.namePart?.get(1)?.part
        )
        assertEquals(
            "STR",
            data.name?.get(0)?.namePart?.get(1)?.type?.code
        )
        assertEquals(
            "film-coated tablets",
            data.name?.get(0)?.namePart?.get(2)?.part
        )
        assertEquals(
            "FRM",
            data.name?.get(0)?.namePart?.get(2)?.type?.code
        )
        assertEquals(
            "Equilidem 2.5 mg film-coated tablets",
            data.name?.get(0)?.productName
        )
        assertEquals(
            "WHOAnatomicalTherapeuticChemicalATCClassificationSystem|B01AF02",
            data.productClassification?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/WHOAnatomicalTherapeuticChemicalATCClassificationSystem",
            data.productClassification?.get(0)?.coding?.get(0)?.system
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
