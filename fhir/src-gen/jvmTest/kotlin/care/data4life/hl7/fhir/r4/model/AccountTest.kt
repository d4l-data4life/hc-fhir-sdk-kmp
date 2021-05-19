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
import care.data4life.hl7.fhir.r4.codesystem.AccountStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * AccountTest.java
 *
 * Tracks balance, charges, for patient or cost center
 *
 * A financial tool for tracking value accrued for a particular purpose. In the healthcare field, used
 * to track charges for a patient, cost centers, etc.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class AccountTest {

    val parser = FhirR4Parser()

    @Test
    fun testAccount01() {
        // Given
        val sourceJson = loadAsString("r4/account-example.json")

        // When
        val data = parser.toFhir(Account::class, sourceJson)

        // Then
        assertEquals(
            "Coverage/7546D",
            data.coverage?.get(0)?.coverage?.reference
        )
        assertEquals(
            "1".toLong(),
            data.coverage?.get(0)?.priority?.value
        )
        assertEquals(
            "Hospital charges",
            data.description
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "urn:oid:0.1.2.3.4.5.6.7",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "654321",
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
            "HACC Funded Billing for Peter James Chalmers",
            data.name
        )
        assertEquals(
            "Organization/hl7",
            data.owner?.reference
        )
        assertEquals(
            "2016-06-30",
            data.servicePeriod?.end?.value.toString()
        )
        assertEquals(
            "2016-01-01",
            data.servicePeriod?.start?.value.toString()
        )
        assertEquals(
            AccountStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Peter James Chalmers",
            data.subject?.get(0)?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">HACC Funded Billing for Peter James Chalmers</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "PBILLACCT",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "patient billing account",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "patient",
            data.type?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testAccount02() {
        // Given
        val sourceJson = loadAsString("r4/account-example-with-guarantor.json")

        // When
        val data = parser.toFhir(Account::class, sourceJson)

        // Then
        assertEquals(
            "Coverage/9876B1",
            data.coverage?.get(0)?.coverage?.reference
        )
        assertEquals(
            "1".toLong(),
            data.coverage?.get(0)?.priority?.value
        )
        assertEquals(
            "Coverage/7546D",
            data.coverage?.get(1)?.coverage?.reference
        )
        assertEquals(
            "2".toLong(),
            data.coverage?.get(1)?.priority?.value
        )
        assertEquals(
            "Hospital charges",
            data.description
        )
        assertEquals(
            "False".toBoolean(),
            data.guarantor?.get(0)?.onHold?.value
        )
        assertEquals(
            "Bénédicte du Marché",
            data.guarantor?.get(0)?.party?.display
        )
        assertEquals(
            "RelatedPerson/benedicte",
            data.guarantor?.get(0)?.party?.reference
        )
        assertEquals(
            "2016-01-01",
            data.guarantor?.get(0)?.period?.start?.value.toString()
        )
        assertEquals(
            "ewg",
            data.id
        )
        assertEquals(
            "urn:oid:0.1.2.3.4.5.6.7",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "654321",
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
            "Inpatient: Peter James Chalmers",
            data.name
        )
        assertEquals(
            "Burgers University Medical Center",
            data.owner?.display
        )
        assertEquals(
            "Organization/f001",
            data.owner?.reference
        )
        assertEquals(
            "2016-06-30",
            data.servicePeriod?.end?.value.toString()
        )
        assertEquals(
            "2016-01-01",
            data.servicePeriod?.start?.value.toString()
        )
        assertEquals(
            AccountStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "Peter James Chalmers",
            data.subject?.get(0)?.display
        )
        assertEquals(
            "Patient/example",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Inpatient Admission for Peter James Chalmers Account</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "PBILLACCT",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "patient billing account",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "patient",
            data.type?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
