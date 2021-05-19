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
class ChargeItemDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testChargeItemDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/chargeitemdefinition-device-example.json")

        // When
        val data = parser.toFhir(ChargeItemDefinition::class, sourceJson)

        // Then
        assertEquals(
            "Verify ChargeItem pertains to Device 12345",
            data.applicability?.get(0)?.description
        )
        assertEquals(
            "%context.service.suppliedItem='Device/12345'",
            data.applicability?.get(0)?.expression
        )
        assertEquals(
            "text/fhirpath",
            data.applicability?.get(0)?.language
        )
        assertEquals(
            "Financial details for  custom made device",
            data.description
        )
        assertEquals(
            "device",
            data.id
        )
        assertEquals(
            "Device/12345",
            data.instance?.get(0)?.reference
        )
        assertEquals(
            "EUR",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.currency
        )
        assertEquals(
            "67.44".toDouble(),
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "VK",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Verkaufspreis (netto)",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://fhir.de/CodeSystem/billing-attributes",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            InvoicePriceComponentType.BASE,
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.type
        )
        assertEquals(
            "Gültigkeit Steuersatz",
            data.propertyGroup?.get(1)?.applicability?.get(0)?.description
        )
        assertEquals(
            "%context.occurenceDateTime > '2018-04-01'",
            data.propertyGroup?.get(1)?.applicability?.get(0)?.expression
        )
        assertEquals(
            "text/fhirpath",
            data.propertyGroup?.get(1)?.applicability?.get(0)?.language
        )
        assertEquals(
            "MWST",
            data.propertyGroup?.get(1)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Mehrwersteuersatz",
            data.propertyGroup?.get(1)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://fhir.de/CodeSystem/billing-attributes",
            data.propertyGroup?.get(1)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "1.19".toDouble(),
            data.propertyGroup?.get(1)?.priceComponent?.get(0)?.factor?.value
        )
        assertEquals(
            InvoicePriceComponentType.TAX,
            data.propertyGroup?.get(1)?.priceComponent?.get(0)?.type
        )
        assertEquals(
            "Gültigkeit Steuersatz",
            data.propertyGroup?.get(2)?.applicability?.get(0)?.description
        )
        assertEquals(
            "%context.occurenceDateTime <= '2018-04-01'",
            data.propertyGroup?.get(2)?.applicability?.get(0)?.expression
        )
        assertEquals(
            "text/fhirpath",
            data.propertyGroup?.get(2)?.applicability?.get(0)?.language
        )
        assertEquals(
            "MWST",
            data.propertyGroup?.get(2)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Mehrwersteuersatz",
            data.propertyGroup?.get(2)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://fhir.de/CodeSystem/billing-attributes",
            data.propertyGroup?.get(2)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "1.07".toDouble(),
            data.propertyGroup?.get(2)?.priceComponent?.get(0)?.factor?.value
        )
        assertEquals(
            InvoicePriceComponentType.TAX,
            data.propertyGroup?.get(2)?.priceComponent?.get(0)?.type
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "http://sap.org/ChargeItemDefinition/device-123",
            data.url
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testChargeItemDefinition02() {
        // Given
        val sourceJson = loadAsString("r4/chargeitemdefinition-ebm-example.json")

        // When
        val data = parser.toFhir(ChargeItemDefinition::class, sourceJson)

        // Then
        assertEquals(
            "Excludes billing code 13250 for same Encounter",
            data.applicability?.get(0)?.description
        )
        assertEquals(
            "[some CQL expression]",
            data.applicability?.get(0)?.expression
        )
        assertEquals(
            "text/cql",
            data.applicability?.get(0)?.language
        )
        assertEquals(
            "Applies only once per Encounter",
            data.applicability?.get(1)?.description
        )
        assertEquals(
            "[some CQL expression]",
            data.applicability?.get(1)?.expression
        )
        assertEquals(
            "text/CQL",
            data.applicability?.get(1)?.language
        )
        assertEquals(
            "30110",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Allergologiediagnostik I",
            data.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://fhir.de/CodingSystem/kbv/ebm",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "Allergologisch-diagnostischer Komplex zur Diagnostik und/oder zum Ausschluss einer (Kontakt-)Allergie vom Spättyp (Typ IV), einschl. Kosten",
            data.description
        )
        assertEquals(
            "2018-06-30",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2018-04-01",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "ebm",
            data.id
        )
        assertEquals(
            "EUR",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.currency
        )
        assertEquals(
            "67.44".toDouble(),
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.amount?.value?.value
        )
        assertEquals(
            "gesamt-euro",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Gesamt (Euro)",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://fhir.de/CodeSystem/kbv/ebm-attribute",
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            InvoicePriceComponentType.BASE,
            data.propertyGroup?.get(0)?.priceComponent?.get(0)?.type
        )
        assertEquals(
            "gesamt-punkte",
            data.propertyGroup?.get(0)?.priceComponent?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Gesamt (Punkte)",
            data.propertyGroup?.get(0)?.priceComponent?.get(1)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://fhir.de/CodeSystem/kbv/ebm-attribute",
            data.propertyGroup?.get(0)?.priceComponent?.get(1)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "633".toDouble(),
            data.propertyGroup?.get(0)?.priceComponent?.get(1)?.factor?.value
        )
        assertEquals(
            InvoicePriceComponentType.INFORMATIONAL,
            data.propertyGroup?.get(0)?.priceComponent?.get(1)?.type
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "http://fhir.de/ChargeItemDefinition/kbv/ebm-30110",
            data.url
        )
        assertEquals(
            "2-2018",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
