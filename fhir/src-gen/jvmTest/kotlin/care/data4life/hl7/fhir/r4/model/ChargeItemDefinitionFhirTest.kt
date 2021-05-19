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
import care.data4life.hl7.fhir.r4.codesystem.InvoicePriceComponentType
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ChargeItemDefinitionTest.java
 *
 * Definition of properties and rules about how the price and the applicability of a ChargeItem can be determined
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes
 * necessary to calculate costs and prices. The properties may differ largely depending on type and
 * realm, therefore this resource gives only a rough structure and requires profiling for each type of
 * billing code system.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ChargeItemDefinitionFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testChargeItemDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/chargeitemdefinition-device-example.json")

        // When
        val data = parser.toFhir(ChargeItemDefinition::class, sourceJson)

        // Then
        assertChargeItemDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertChargeItemDefinition01Step01(data: ChargeItemDefinition) {

        assertEquals(
            expected = "Verify ChargeItem pertains to Device 12345",
            actual = data.applicability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "%context.service.suppliedItem='Device/12345'",
            actual = data.applicability?.get(0)?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/fhirpath",
            actual = data.applicability?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Financial details for  custom made device",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "device",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Device/12345",
            actual = data.instance?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EUR",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "67.44".toDouble(),
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "VK",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Verkaufspreis (netto)",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fhir.de/CodeSystem/billing-attributes",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = InvoicePriceComponentType.BASE,
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.type
        )

        assertEquals(
            expected = "Gültigkeit Steuersatz",
            actual = data.propertyGroup?.get(1)?.applicability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "%context.occurenceDateTime > '2018-04-01'",
            actual = data.propertyGroup?.get(1)?.applicability?.get(0)?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/fhirpath",
            actual = data.propertyGroup?.get(1)?.applicability?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MWST",
            actual = data.propertyGroup?.get(1)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mehrwersteuersatz",
            actual = data.propertyGroup?.get(1)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fhir.de/CodeSystem/billing-attributes",
            actual = data.propertyGroup?.get(1)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.19".toDouble(),
            actual = data.propertyGroup?.get(1)?.priceComponent?.get(0)?.factor?.value
        )

        assertEquals(
            expected = InvoicePriceComponentType.TAX,
            actual = data.propertyGroup?.get(1)?.priceComponent?.get(0)?.type
        )

        assertEquals(
            expected = "Gültigkeit Steuersatz",
            actual = data.propertyGroup?.get(2)?.applicability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "%context.occurenceDateTime <= '2018-04-01'",
            actual = data.propertyGroup?.get(2)?.applicability?.get(0)?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/fhirpath",
            actual = data.propertyGroup?.get(2)?.applicability?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MWST",
            actual = data.propertyGroup?.get(2)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mehrwersteuersatz",
            actual = data.propertyGroup?.get(2)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fhir.de/CodeSystem/billing-attributes",
            actual = data.propertyGroup?.get(2)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.07".toDouble(),
            actual = data.propertyGroup?.get(2)?.priceComponent?.get(0)?.factor?.value
        )

        assertEquals(
            expected = InvoicePriceComponentType.TAX,
            actual = data.propertyGroup?.get(2)?.priceComponent?.get(0)?.type
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://sap.org/ChargeItemDefinition/device-123",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testChargeItemDefinition02() {
        // Given
        val sourceJson = loadAsString("r4/chargeitemdefinition-ebm-example.json")

        // When
        val data = parser.toFhir(ChargeItemDefinition::class, sourceJson)

        // Then
        assertChargeItemDefinition02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertChargeItemDefinition02Step01(data: ChargeItemDefinition) {

        assertEquals(
            expected = "Excludes billing code 13250 for same Encounter",
            actual = data.applicability?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "[some CQL expression]",
            actual = data.applicability?.get(0)?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.applicability?.get(0)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Applies only once per Encounter",
            actual = data.applicability?.get(1)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "[some CQL expression]",
            actual = data.applicability?.get(1)?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/CQL",
            actual = data.applicability?.get(1)?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30110",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Allergologiediagnostik I",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fhir.de/CodingSystem/kbv/ebm",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Allergologisch-diagnostischer Komplex zur Diagnostik und/oder zum Ausschluss einer (Kontakt-)Allergie vom Spättyp (Typ IV), einschl. Kosten",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-06-30",
            actual = data.effectivePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2018-04-01",
            actual = data.effectivePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "ebm",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EUR",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "67.44".toDouble(),
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "gesamt-euro",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Gesamt (Euro)",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fhir.de/CodeSystem/kbv/ebm-attribute",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = InvoicePriceComponentType.BASE,
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(0)?.type
        )

        assertEquals(
            expected = "gesamt-punkte",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Gesamt (Punkte)",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(1)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://fhir.de/CodeSystem/kbv/ebm-attribute",
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(1)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "633".toDouble(),
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(1)?.factor?.value
        )

        assertEquals(
            expected = InvoicePriceComponentType.INFORMATIONAL,
            actual = data.propertyGroup?.get(0)?.priceComponent?.get(1)?.type
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://fhir.de/ChargeItemDefinition/kbv/ebm-30110",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2-2018",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
