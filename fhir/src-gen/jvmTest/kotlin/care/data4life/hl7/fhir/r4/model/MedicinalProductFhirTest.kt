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
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * MedicinalProductTest.java
 *
 * Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use)
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProduct01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproduct-example.json")

        // When
        val data = parser.toFhir(MedicinalProduct::class, sourceJson)

        // Then
        assertMedicinalProduct01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicinalProduct01Step01(data: MedicinalProduct) {
        assertEquals(
            expected = "DocumentReference/example",
            actual = data.attachedDocument?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/MPID",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "{mpid}",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/manufacturingAuthorisationReferenceNumber",
            actual = data.manufacturingBusinessOperation?.get(0)?.authorisationReferenceNumber?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1324TZ",
            actual = data.manufacturingBusinessOperation?.get(0)?.authorisationReferenceNumber?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-03-15",
            actual = data.manufacturingBusinessOperation?.get(0)?.effectiveDate?.value.toString()
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.manufacturingBusinessOperation?.get(0)?.manufacturer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Batchrelease",
            actual = data.manufacturingBusinessOperation?.get(0)?.operationType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/manufacturingOperationType",
            actual = data.manufacturingBusinessOperation?.get(0)?.operationType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.manufacturingBusinessOperation?.get(0)?.regulator?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DocumentReference/example",
            actual = data.masterFile?.get(0)?.reference
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
            expected = "EU",
            actual = data.name?.get(0)?.countryLanguage?.get(0)?.country?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/countryCode",
            actual = data.name?.get(0)?.countryLanguage?.get(0)?.country?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EU",
            actual = data.name?.get(0)?.countryLanguage?.get(0)?.jurisdiction?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/jurisdictionCode",
            actual = data.name?.get(0)?.countryLanguage?.get(0)?.jurisdiction?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EN",
            actual = data.name?.get(0)?.countryLanguage?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/languageCode",
            actual = data.name?.get(0)?.countryLanguage?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Equilidem",
            actual = data.name?.get(0)?.namePart?.get(0)?.part
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "INV",
            actual = data.name?.get(0)?.namePart?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.5 mg",
            actual = data.name?.get(0)?.namePart?.get(1)?.part
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "STR",
            actual = data.name?.get(0)?.namePart?.get(1)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "film-coated tablets",
            actual = data.name?.get(0)?.namePart?.get(2)?.part
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FRM",
            actual = data.name?.get(0)?.namePart?.get(2)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Equilidem 2.5 mg film-coated tablets",
            actual = data.name?.get(0)?.productName
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WHOAnatomicalTherapeuticChemicalATCClassificationSystem|B01AF02",
            actual = data.productClassification?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/WHOAnatomicalTherapeuticChemicalATCClassificationSystem",
            actual = data.productClassification?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
