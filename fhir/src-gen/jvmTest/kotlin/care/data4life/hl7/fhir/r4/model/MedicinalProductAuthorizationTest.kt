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
class MedicinalProductAuthorizationTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicinalProductAuthorization01() {
        // Given
        val sourceJson = loadAsString("r4/medicinalproductauthorization-example.json")

        // When
        val data = parser.toFhir(MedicinalProductAuthorization::class, sourceJson)

        // Then
        assertEquals(
            "EU",
            data.country?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/country",
            data.country?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2020-08-15",
            data.dataExclusivityPeriod?.end?.value.toString()
        )
        assertEquals(
            "2010-08-15",
            data.dataExclusivityPeriod?.start?.value.toString()
        )
        assertEquals(
            "2010-08-15",
            data.dateOfFirstAuthorization?.value.toString()
        )
        assertEquals(
            "Organization/example",
            data.holder?.reference
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "http://ema.europa.eu/example/marketingAuthorisationNumber",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "EU/1/11/999/001",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "2010-08-15",
            data.internationalBirthDate?.value.toString()
        )
        assertEquals(
            "NO",
            data.jurisdictionalAuthorization?.get(0)?.country?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/countryCode",
            data.jurisdictionalAuthorization?.get(0)?.country?.coding?.get(0)?.system
        )
        assertEquals(
            "1",
            data.jurisdictionalAuthorization?.get(0)?.id
        )
        assertEquals(
            "http://ema.europa.eu/example/marketingauthorisationnumber",
            data.jurisdictionalAuthorization?.get(0)?.identifier?.get(0)?.system
        )
        assertEquals(
            "123-456-789",
            data.jurisdictionalAuthorization?.get(0)?.identifier?.get(0)?.value
        )
        assertEquals(
            "NO",
            data.jurisdictionalAuthorization?.get(1)?.country?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/countryCode",
            data.jurisdictionalAuthorization?.get(1)?.country?.coding?.get(0)?.system
        )
        assertEquals(
            "2",
            data.jurisdictionalAuthorization?.get(1)?.id
        )
        assertEquals(
            "http://ema.europa.eu/example/marketingauthorisationnumber",
            data.jurisdictionalAuthorization?.get(1)?.identifier?.get(0)?.system
        )
        assertEquals(
            "123-456-123",
            data.jurisdictionalAuthorization?.get(1)?.identifier?.get(0)?.value
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
            "2015-08-01",
            data.procedure?.application?.get(0)?.dateDateTime?.value.toString()
        )
        assertEquals(
            "http://ema.europa.eu/example/applicationidentifier-number",
            data.procedure?.application?.get(0)?.identifier?.system
        )
        assertEquals(
            "IA38G",
            data.procedure?.application?.get(0)?.identifier?.value
        )
        assertEquals(
            "GroupTypeIAVariationNotification",
            data.procedure?.application?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/marketingAuthorisationApplicationType",
            data.procedure?.application?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-08-21",
            data.procedure?.datePeriod?.end?.value.toString()
        )
        assertEquals(
            "2015-08-02",
            data.procedure?.datePeriod?.start?.value.toString()
        )
        assertEquals(
            "http://ema.europa.eu/example/procedureidentifier-number",
            data.procedure?.identifier?.system
        )
        assertEquals(
            "EMEA/H/C/009999/IA/0099/G",
            data.procedure?.identifier?.value
        )
        assertEquals(
            "VariationTypeIA",
            data.procedure?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/marketingAuthorisationProcedureType",
            data.procedure?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Organization/example",
            data.regulator?.reference
        )
        assertEquals(
            "active",
            data.status?.coding?.get(0)?.code
        )
        assertEquals(
            "http://ema.europa.eu/example/authorisationstatus",
            data.status?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-01-14",
            data.statusDate?.value.toString()
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "2020-05-20",
            data.validityPeriod?.end?.value.toString()
        )
        assertEquals(
            "2015-08-16",
            data.validityPeriod?.start?.value.toString()
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
