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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * CoverageTest.java
 *
 * Insurance or medical plan or a payment agreement
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CoverageFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testCoverage01() {
        // Given
        val sourceJson = loadAsString("stu3/coverage-example-2.json")

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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Contract/563818",
            actual = data.contract?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.dependent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WESTAIR",
            actual = data.grouping?.group
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Western Airlines",
            actual = data.grouping?.groupDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "WESTAIR",
            actual = data.grouping?.plan
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Western Airlines",
            actual = data.grouping?.planDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "D15C9",
            actual = data.grouping?.subPlan
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Platinum",
            actual = data.grouping?.subPlanDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7546D",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://xyz.com/codes/identifier",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AB98761",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5",
            actual = data.network
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.order?.value
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.payor?.get(0)?.reference
                ?.replace("\\n", " ")
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.subscriber?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AB9876",
            actual = data.subscriberId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the coverage</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EHCPOL",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "extended healthcare",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCoverage02() {
        // Given
        val sourceJson = loadAsString("stu3/coverage-example-selfpay.json")

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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SP1234",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hospitalx.com/selfpayagreement",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SP12345678",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.payor?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-03-17",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "self",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.subscriber?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of a Self Pay Agreement.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "pay",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PAY",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/coverage-selfpay",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCoverage03() {
        // Given
        val sourceJson = loadAsString("stu3/coverage-example-ehic.json")

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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "7547E",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ehic.com/insurer/123456789/member",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A123456780",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ehic.com/insurer",
            actual = data.payor?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123456789",
            actual = data.payor?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-03-17",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "self",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/5",
            actual = data.subscriber?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the European Health Insurance Card</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EHCPOL",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "extended healthcare",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testCoverage04() {
        // Given
        val sourceJson = loadAsString("stu3/coverage-example.json")

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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0",
            actual = data.dependent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Silver: Family Plan spouse only",
            actual = data.grouping?.classDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SILVER",
            actual = data.grouping?.clazz
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CBI35",
            actual = data.grouping?.group
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Corporate Baker's Inc. Local #35",
            actual = data.grouping?.groupDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "B37FC",
            actual = data.grouping?.plan
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Full Coverage: Medical, Dental, Pharmacy, Vision, EHC",
            actual = data.grouping?.planDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Tier2",
            actual = data.grouping?.subClass
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Low deductable, max \$20 copay",
            actual = data.grouping?.subClassDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "123",
            actual = data.grouping?.subGroup
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Trainee Part-time Benefits",
            actual = data.grouping?.subGroupDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P7",
            actual = data.grouping?.subPlan
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Includes afterlife benefits",
            actual = data.grouping?.subPlanDisplay
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9876B1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://benefitsinc.com/certificate",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.payor?.get(0)?.reference
                ?.replace("\\n", " ")
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "self",
            actual = data.relationship?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9",
            actual = data.sequence
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.status
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/4",
            actual = data.subscriber?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the coverage</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "EHCPOL",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "extended healthcare",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
