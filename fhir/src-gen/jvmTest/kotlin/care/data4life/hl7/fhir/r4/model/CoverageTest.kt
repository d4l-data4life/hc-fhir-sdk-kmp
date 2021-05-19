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
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CoverageTest.java
 *
 * Insurance or medical plan or a payment agreement
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 * Includes both insurance and self-payment.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CoverageTest {

    val parser = FhirR4Parser()

    @Test
    fun testCoverage01() {
        // Given
        val sourceJson = loadAsString("r4/coverage-example-2.json")

        // When
        val data = parser.toFhir(Coverage::class, sourceJson)

        // Then
        assertEquals(
            "Patient/5",
            data.beneficiary?.reference
        )
        assertEquals(
            "Western Airlines",
            data.clazz?.get(0)?.name
        )
        assertEquals(
            "group",
            data.clazz?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "WESTAIR",
            data.clazz?.get(0)?.value
        )
        assertEquals(
            "Full Coverage: Medical, Dental, Pharmacy, Vision, EHC",
            data.clazz?.get(1)?.name
        )
        assertEquals(
            "plan",
            data.clazz?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "BG4352",
            data.clazz?.get(1)?.value
        )
        assertEquals(
            "Platinum",
            data.clazz?.get(2)?.name
        )
        assertEquals(
            "subplan",
            data.clazz?.get(2)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(2)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "D15C9",
            data.clazz?.get(2)?.value
        )
        assertEquals(
            "Contract/INS-101",
            data.contract?.get(0)?.reference
        )
        assertEquals(
            "2018-12-31",
            data.costToBeneficiary?.get(0)?.exception?.get(0)?.period?.end?.value.toString()
        )
        assertEquals(
            "2018-01-01",
            data.costToBeneficiary?.get(0)?.exception?.get(0)?.period?.start?.value.toString()
        )
        assertEquals(
            "retired",
            data.costToBeneficiary?.get(0)?.exception?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/ex-coverage-financial-exception",
            data.costToBeneficiary?.get(0)?.exception?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "gpvisit",
            data.costToBeneficiary?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-copay-type",
            data.costToBeneficiary?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "USD",
            data.costToBeneficiary?.get(0)?.valueMoney?.currency
        )
        assertEquals(
            "20.0".toDouble(),
            data.costToBeneficiary?.get(0)?.valueMoney?.value?.value
        )
        assertEquals(
            "1",
            data.dependent
        )
        assertEquals(
            "7546D",
            data.id
        )
        assertEquals(
            "http://xyz.com/codes/identifier",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "AB98761",
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
            "5",
            data.network
        )
        assertEquals(
            "2".toLong(),
            data.order?.value
        )
        assertEquals(
            "Organization/2",
            data.payor?.get(0)?.reference
        )
        assertEquals(
            "2012-03-17",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2011-03-17",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "self",
            data.relationship?.coding?.get(0)?.code
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "Patient/5",
            data.subscriber?.reference
        )
        assertEquals(
            "AB9876",
            data.subscriberId
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the coverage</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "EHCPOL",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "extended healthcare",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCoverage02() {
        // Given
        val sourceJson = loadAsString("r4/coverage-example-selfpay.json")

        // When
        val data = parser.toFhir(Coverage::class, sourceJson)

        // Then
        assertEquals(
            "Patient/5",
            data.beneficiary?.reference
        )
        assertEquals(
            "SP1234",
            data.id
        )
        assertEquals(
            "http://hospitalx.com/selfpayagreement",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "SP12345678",
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
            "Patient/5",
            data.payor?.get(0)?.reference
        )
        assertEquals(
            "2012-03-17",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "self",
            data.relationship?.coding?.get(0)?.code
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "Patient/5",
            data.subscriber?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of a Self Pay Agreement.</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "pay",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "PAY",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-selfpay",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCoverage03() {
        // Given
        val sourceJson = loadAsString("r4/coverage-example-ehic.json")

        // When
        val data = parser.toFhir(Coverage::class, sourceJson)

        // Then
        assertEquals(
            "Patient/5",
            data.beneficiary?.reference
        )
        assertEquals(
            "7547E",
            data.id
        )
        assertEquals(
            "http://ehic.com/insurer/123456789/member",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "A123456780",
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
            "http://ehic.com/insurer",
            data.payor?.get(0)?.identifier?.system
        )
        assertEquals(
            "123456789",
            data.payor?.get(0)?.identifier?.value
        )
        assertEquals(
            "2012-03-17",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "self",
            data.relationship?.coding?.get(0)?.code
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "Patient/5",
            data.subscriber?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the European Health Insurance Card</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "EHCPOL",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "extended healthcare",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testCoverage04() {
        // Given
        val sourceJson = loadAsString("r4/coverage-example.json")

        // When
        val data = parser.toFhir(Coverage::class, sourceJson)

        // Then
        assertEquals(
            "Patient/4",
            data.beneficiary?.reference
        )
        assertEquals(
            "Corporate Baker's Inc. Local #35",
            data.clazz?.get(0)?.name
        )
        assertEquals(
            "group",
            data.clazz?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "CB135",
            data.clazz?.get(0)?.value
        )
        assertEquals(
            "Trainee Part-time Benefits",
            data.clazz?.get(1)?.name
        )
        assertEquals(
            "subgroup",
            data.clazz?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "123",
            data.clazz?.get(1)?.value
        )
        assertEquals(
            "Full Coverage: Medical, Dental, Pharmacy, Vision, EHC",
            data.clazz?.get(2)?.name
        )
        assertEquals(
            "plan",
            data.clazz?.get(2)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(2)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "B37FC",
            data.clazz?.get(2)?.value
        )
        assertEquals(
            "Includes afterlife benefits",
            data.clazz?.get(3)?.name
        )
        assertEquals(
            "subplan",
            data.clazz?.get(3)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(3)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "P7",
            data.clazz?.get(3)?.value
        )
        assertEquals(
            "Silver: Family Plan spouse only",
            data.clazz?.get(4)?.name
        )
        assertEquals(
            "class",
            data.clazz?.get(4)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(4)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "SILVER",
            data.clazz?.get(4)?.value
        )
        assertEquals(
            "Low deductable, max \$20 copay",
            data.clazz?.get(5)?.name
        )
        assertEquals(
            "subclass",
            data.clazz?.get(5)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(5)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Tier2",
            data.clazz?.get(5)?.value
        )
        assertEquals(
            "sequence",
            data.clazz?.get(6)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(6)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "9",
            data.clazz?.get(6)?.value
        )
        assertEquals(
            "rxid",
            data.clazz?.get(7)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(7)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "MDF12345",
            data.clazz?.get(7)?.value
        )
        assertEquals(
            "rxbin",
            data.clazz?.get(8)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(8)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "987654",
            data.clazz?.get(8)?.value
        )
        assertEquals(
            "rxgroup",
            data.clazz?.get(9)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/coverage-class",
            data.clazz?.get(9)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "M35PT",
            data.clazz?.get(9)?.value
        )
        assertEquals(
            "0",
            data.dependent
        )
        assertEquals(
            "9876B1",
            data.id
        )
        assertEquals(
            "http://benefitsinc.com/certificate",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12345",
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
            "Organization/2",
            data.payor?.get(0)?.reference
        )
        assertEquals(
            "2012-05-23",
            data.period?.end?.value.toString()
        )
        assertEquals(
            "2011-05-23",
            data.period?.start?.value.toString()
        )
        assertEquals(
            "http://benefitsinc.com/FHIR/Organization/CBI35",
            data.policyHolder?.reference
        )
        assertEquals(
            "self",
            data.relationship?.coding?.get(0)?.code
        )
        assertEquals(
            FinancialResourceStatusCodes.ACTIVE,
            data.status
        )
        assertEquals(
            "Patient/4",
            data.subscriber?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the coverage</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "EHCPOL",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "extended healthcare",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
