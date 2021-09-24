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
 * MedicinalProductAuthorizationTest.java
 *
 * The regulatory authorization of a medicinal product
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicinalProductAuthorizationFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductAuthorization01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductauthorization-example.json")

        // When
        val data = parser.toFhir(MedicinalProductAuthorization::class, sourceJson)

        // Then
        assertMedicinalProductAuthorization01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicinalProductAuthorization01Step01(data: MedicinalProductAuthorization) {

        assertEquals(
            expected = "EU",
            actual = data.country?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/country",
            actual = data.country?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2020-08-15",
            actual = data.dataExclusivityPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2010-08-15",
            actual = data.dataExclusivityPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "2010-08-15",
            actual = data.dateOfFirstAuthorization?.value.toString()
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.holder?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/marketingAuthorisationNumber",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EU/1/11/999/001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010-08-15",
            actual = data.internationalBirthDate?.value.toString()
        )

        assertEquals(
            expected = "NO",
            actual = data.jurisdictionalAuthorization?.get(0)?.country?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/countryCode",
            actual = data.jurisdictionalAuthorization?.get(0)?.country?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.jurisdictionalAuthorization?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/marketingauthorisationnumber",
            actual = data.jurisdictionalAuthorization?.get(0)?.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123-456-789",
            actual = data.jurisdictionalAuthorization?.get(0)?.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NO",
            actual = data.jurisdictionalAuthorization?.get(1)?.country?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/countryCode",
            actual = data.jurisdictionalAuthorization?.get(1)?.country?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.jurisdictionalAuthorization?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/marketingauthorisationnumber",
            actual = data.jurisdictionalAuthorization?.get(1)?.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123-456-123",
            actual = data.jurisdictionalAuthorization?.get(1)?.identifier?.get(0)?.value
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
            expected = "2015-08-01",
            actual = data.procedure?.application?.get(0)?.dateDateTime?.value.toString()
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/applicationidentifier-number",
            actual = data.procedure?.application?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IA38G",
            actual = data.procedure?.application?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "GroupTypeIAVariationNotification",
            actual = data.procedure?.application?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/marketingAuthorisationApplicationType",
            actual = data.procedure?.application?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-21",
            actual = data.procedure?.datePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-08-02",
            actual = data.procedure?.datePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/procedureidentifier-number",
            actual = data.procedure?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EMEA/H/C/009999/IA/0099/G",
            actual = data.procedure?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "VariationTypeIA",
            actual = data.procedure?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/marketingAuthorisationProcedureType",
            actual = data.procedure?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.regulator?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ema.europa.eu/example/authorisationstatus",
            actual = data.status?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-01-14",
            actual = data.statusDate?.value.toString()
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "2020-05-20",
            actual = data.validityPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-08-16",
            actual = data.validityPeriod?.start?.value.toString()
        )
    }
}
