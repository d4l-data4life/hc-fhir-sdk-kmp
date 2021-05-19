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
        assertCoverage01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverage01Step01(data: Coverage) {

        assertEquals(
            expected = "Patient/5",
            actual = data.beneficiary?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Western Airlines",
            actual = data.clazz?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "group",
            actual = data.clazz?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "WESTAIR",
            actual = data.clazz?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Full Coverage: Medical, Dental, Pharmacy, Vision, EHC",
            actual = data.clazz?.get(1)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "plan",
            actual = data.clazz?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "BG4352",
            actual = data.clazz?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Platinum",
            actual = data.clazz?.get(2)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subplan",
            actual = data.clazz?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(2)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "D15C9",
            actual = data.clazz?.get(2)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Contract/INS-101",
            actual = data.contract?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2018-12-31",
            actual = data.costToBeneficiary?.get(0)?.exception?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2018-01-01",
            actual = data.costToBeneficiary?.get(0)?.exception?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "retired",
            actual = data.costToBeneficiary?.get(0)?.exception?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-coverage-financial-exception",
            actual = data.costToBeneficiary?.get(0)?.exception?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "gpvisit",
            actual = data.costToBeneficiary?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-copay-type",
            actual = data.costToBeneficiary?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.costToBeneficiary?.get(0)?.valueMoney?.currency
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "20.0".toDouble(),
            actual = data.costToBeneficiary?.get(0)?.valueMoney?.value?.value
        )

        assertEquals(
            expected = "1",
            actual = data.dependent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "7546D",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://xyz.com/codes/identifier",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "AB98761",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "5",
            actual = data.network
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.order?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.payor?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-03-17",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2011-03-17",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "self",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.subscriber?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "AB9876",
            actual = data.subscriberId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the coverage</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EHCPOL",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "extended healthcare",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testCoverage02() {
        // Given
        val sourceJson = loadAsString("r4/coverage-example-selfpay.json")

        // When
        val data = parser.toFhir(Coverage::class, sourceJson)

        // Then
        assertCoverage02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverage02Step01(data: Coverage) {

        assertEquals(
            expected = "Patient/5",
            actual = data.beneficiary?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SP1234",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hospitalx.com/selfpayagreement",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SP12345678",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.payor?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-03-17",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "self",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.subscriber?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of a Self Pay Agreement.</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "pay",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "PAY",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-selfpay",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testCoverage03() {
        // Given
        val sourceJson = loadAsString("r4/coverage-example-ehic.json")

        // When
        val data = parser.toFhir(Coverage::class, sourceJson)

        // Then
        assertCoverage03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverage03Step01(data: Coverage) {

        assertEquals(
            expected = "Patient/5",
            actual = data.beneficiary?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "7547E",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://ehic.com/insurer/123456789/member",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A123456780",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://ehic.com/insurer",
            actual = data.payor?.get(0)?.identifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "123456789",
            actual = data.payor?.get(0)?.identifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-03-17",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "self",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.subscriber?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the European Health Insurance Card</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EHCPOL",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "extended healthcare",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testCoverage04() {
        // Given
        val sourceJson = loadAsString("r4/coverage-example.json")

        // When
        val data = parser.toFhir(Coverage::class, sourceJson)

        // Then
        assertCoverage04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCoverage04Step01(data: Coverage) {

        assertEquals(
            expected = "Patient/4",
            actual = data.beneficiary?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Corporate Baker's Inc. Local #35",
            actual = data.clazz?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "group",
            actual = data.clazz?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CB135",
            actual = data.clazz?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Trainee Part-time Benefits",
            actual = data.clazz?.get(1)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subgroup",
            actual = data.clazz?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.clazz?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Full Coverage: Medical, Dental, Pharmacy, Vision, EHC",
            actual = data.clazz?.get(2)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "plan",
            actual = data.clazz?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(2)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "B37FC",
            actual = data.clazz?.get(2)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Includes afterlife benefits",
            actual = data.clazz?.get(3)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subplan",
            actual = data.clazz?.get(3)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(3)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "P7",
            actual = data.clazz?.get(3)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Silver: Family Plan spouse only",
            actual = data.clazz?.get(4)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "class",
            actual = data.clazz?.get(4)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(4)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SILVER",
            actual = data.clazz?.get(4)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Low deductable, max \$20 copay",
            actual = data.clazz?.get(5)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subclass",
            actual = data.clazz?.get(5)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(5)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tier2",
            actual = data.clazz?.get(5)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sequence",
            actual = data.clazz?.get(6)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(6)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "9",
            actual = data.clazz?.get(6)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "rxid",
            actual = data.clazz?.get(7)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(7)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "MDF12345",
            actual = data.clazz?.get(7)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "rxbin",
            actual = data.clazz?.get(8)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(8)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "987654",
            actual = data.clazz?.get(8)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "rxgroup",
            actual = data.clazz?.get(9)?.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/coverage-class",
            actual = data.clazz?.get(9)?.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "M35PT",
            actual = data.clazz?.get(9)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0",
            actual = data.dependent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "9876B1",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://benefitsinc.com/certificate",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.payor?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2012-05-23",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2011-05-23",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "http://benefitsinc.com/FHIR/Organization/CBI35",
            actual = data.policyHolder?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "self",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/4",
            actual = data.subscriber?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the coverage</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EHCPOL",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "extended healthcare",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }
}
