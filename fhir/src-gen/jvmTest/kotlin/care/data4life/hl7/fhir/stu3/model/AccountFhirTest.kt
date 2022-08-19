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
import care.data4life.hl7.fhir.stu3.codesystem.AccountStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * AccountTest.java
 *
 * Tracks balance, charges, for patient or cost center
 *
 * A financial tool for tracking value accrued for a particular purpose. In the healthcare field, used
 * to track charges for a patient, cost centers, etc.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AccountFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testAccount01() {
        // Given
        val sourceJson = loadAsString("stu3/account-example.json")

        // When
        val data = parser.toFhir(Account::class, sourceJson)

        // Then
        assertAccount01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAccount01Step01(data: Account) {
        assertEquals(
            expected = "2016-06-30",
            actual = data.active?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.active?.start?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.balance?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.balance?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.balance?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "-1200".toDouble(),
            actual = data.balance?.value?.value
        )

        assertEquals(
            expected = "Coverage/7546D",
            actual = data.coverage?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.coverage?.get(0)?.priority?.value
        )

        assertEquals(
            expected = "Hospital charges",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:0.1.2.3.4.5.6.7",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "654321",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HACC Funded Billing for Peter James Chalmers",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-30",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = AccountStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">HACC Funded Billing for Peter James Chalmers</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "PBILLACCT",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient billing account",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testAccount02() {
        // Given
        val sourceJson = loadAsString("stu3/account-example-with-guarantor.json")

        // When
        val data = parser.toFhir(Account::class, sourceJson)

        // Then
        assertAccount02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertAccount02Step01(data: Account) {
        assertEquals(
            expected = "2016-06-30",
            actual = data.active?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.active?.start?.value.toString()
        )

        assertEquals(
            expected = "USD",
            actual = data.balance?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:4217",
            actual = data.balance?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.balance?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "-1200".toDouble(),
            actual = data.balance?.value?.value
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.coverage?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.coverage?.get(0)?.priority?.value
        )

        assertEquals(
            expected = "Coverage/7546D",
            actual = data.coverage?.get(1)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.coverage?.get(1)?.priority?.value
        )

        assertEquals(
            expected = "Hospital charges",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.guarantor?.get(0)?.onHold?.value
        )

        assertEquals(
            expected = "Bénédicte du Marché",
            actual = data.guarantor?.get(0)?.party?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RelatedPerson/benedicte",
            actual = data.guarantor?.get(0)?.party?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.guarantor?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "ewg",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:0.1.2.3.4.5.6.7",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "654321",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Inpatient: Peter James Chalmers",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Burgers University Medical Center",
            actual = data.owner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-06-30",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = AccountStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Inpatient Admission for Peter James Chalmers Account</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "PBILLACCT",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient billing account",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )
    }
}
