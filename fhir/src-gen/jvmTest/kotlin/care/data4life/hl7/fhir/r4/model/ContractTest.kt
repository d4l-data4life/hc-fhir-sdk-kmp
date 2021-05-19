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
import care.data4life.hl7.fhir.r4.codesystem.ContractResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ContractTest.java
 *
 * Legal Agreement
 *
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or
 * agreement.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ContractTest {

    val parser = FhirR4Parser()

    @Test
    fun testContract01() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notOrg.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract01Step01(data: Contract) {

        assertEquals(
            expected = "Michigan Health",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/3",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UK Pharmacies",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/ukp",
            actual = data.domain?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in friendly consumer speak.",
            actual = data.friendly?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pcd-example-notOrg",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.legal?.get(0)?.contentAttachment?.title
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
            expected = "Opt-In",
            actual = data.subType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Default Authorization with exceptions.",
            actual = data.subType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            actual = data.subType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold this order and any results or related objects from any provider.",
            actual = data.term?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.term?.get(0)?.offer?.topic?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.term?.get(0)?.offer?.topic?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-from",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold all data from specified actor entity.",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "57016-8",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testContract02() {
        // Given
        val sourceJson = loadAsString("r4/contract-example-ins-policy.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract02Step01(data: Contract) {

        assertEquals(
            expected = "2017-01-01",
            actual = data.applies?.start?.value.toString()
        )

        assertEquals(
            expected = "INS-101",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://xyz-insurance.com/forms",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "YCSCWLN(01-2017)",
            actual = data.identifier?.get(0)?.value
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
            expected = "Patient/1",
            actual = data.subject?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-06-01",
            actual = data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.start?.value.toString()
        )

        assertEquals(
            expected = "sample",
            actual = data.term?.get(0)?.asset?.get(0)?.subtype?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RicardianContract",
            actual = data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1995",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.effectiveTime?.value.toString()
        )

        assertEquals(
            expected = "Ford Bobcat",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.entityCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.factor?.value
        )

        assertEquals(
            expected = "http://somewhere.motor-vehicle.com/vin",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XXSVT34-7665t952236",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CAD",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "1.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.points?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "CAD",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "Eligible Providers",
            actual = data.term?.get(0)?.group?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Responsibility for Payment",
            actual = data.term?.get(0)?.group?.get(1)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Emergency Room Copay",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(0)?.group?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Professional Visit Copay",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(0)?.group?.get(1)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Copays",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Calendar Year Deductible",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(1)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Out-Of-Pocket Maximum",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(2)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ambulance Services",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dental Services",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(1)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Diagnostic Services",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(2)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Emergency Room Services",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(3)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hospital Inpatient Care",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(4)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medical Services",
            actual = data.term?.get(0)?.group?.get(2)?.group?.get(3)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "List of Benefits",
            actual = data.term?.get(0)?.group?.get(2)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "healthinsurance",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Health Insurance",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contract-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testContract03() {
        // Given
        val sourceJson = loadAsString("r4/contract-example-42cfr-part2.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract03Step01(data: Contract) {

        assertEquals(
            expected = "2013-11-01T21:18:27-04:00",
            actual = data.applies?.start?.value.toString()
        )

        assertEquals(
            expected = "registration",
            actual = data.contentDerivative?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contract-content-derivative",
            actual = data.contentDerivative?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "C-2121",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-11-01T21:18:27-04:00",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.legal?.get(0)?.contentAttachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-US",
            actual = data.legal?.get(0)?.contentAttachment?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MDHHS-5515 Consent To Share Your Health Information",
            actual = data.legal?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://org.mihin.ecms/ConsentDirective-2121",
            actual = data.legal?.get(0)?.contentAttachment?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-07-19T18:18:42.108-04:00",
            actual = data.meta?.lastUpdated?.value.toString()
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
            expected = "1",
            actual = data.meta?.versionId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Alice Recruit",
            actual = data.signer?.get(0)?.party?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.signer?.get(0)?.party?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.2.840.10065.1.12.1.1",
            actual = data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso-astm:E1762-95:2013",
            actual = data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-08T10:57:34+01:00",
            actual = data.signer?.get(0)?.signature?.get(0)?.whenn?.value.toString()
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.signer?.get(0)?.signature?.get(0)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SELF",
            actual = data.signer?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://mdhhs.org/fhir/consent-signer-type",
            actual = data.signer?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContractResourceStatusCodes.EXECUTED,
            actual = data.status
        )

        assertEquals(
            expected = "hcd",
            actual = data.subType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/consentcategorycodes",
            actual = data.subType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HPRGRP",
            actual = data.term?.get(0)?.action?.get(0)?.intent?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.term?.get(0)?.action?.get(0)?.intent?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sample",
            actual = data.term?.get(0)?.action?.get(0)?.status?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "VA Ann Arbor Healthcare System",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.reference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.reference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IR",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Recipient",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://mdhhs.org/fhir/consent-actor-type",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Recipient of restricted health information",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Community Mental Health Clinic",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.reference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.reference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IS",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sender",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://mdhhs.org/fhir/consent-actor-type",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sender of restricted health information",
            actual = data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "action-a",
            actual = data.term?.get(0)?.action?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contractaction",
            actual = data.term?.get(0)?.action?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2019-11-01T21:18:27-04:00",
            actual = data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-11-01T21:18:27-04:00",
            actual = data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.start?.value.toString()
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.term?.get(0)?.offer?.decision?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.term?.get(0)?.offer?.decision?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Can't refuse",
            actual = data.term?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "statutory",
            actual = data.term?.get(0)?.offer?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contracttermtypecodes",
            actual = data.term?.get(0)?.offer?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "OPTIN",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://mdhhs.org/fhir/consentdirective-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Opt-in consent directive",
            actual = data.type?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testContract04() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notLabs.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract04Step01(data: Contract) {

        assertEquals(
            expected = "Michigan Health",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/3",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UK Pharmacies",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/ukp",
            actual = data.domain?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in friendly consumer speak.",
            actual = data.friendly?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pcd-example-notLabs",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-17",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.legal?.get(0)?.contentAttachment?.title
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
            expected = "Opt-In",
            actual = data.subType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Default Authorization with exceptions.",
            actual = data.subType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            actual = data.subType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold orders from any provider.",
            actual = data.term?.get(0)?.group?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ServiceRequest",
            actual = data.term?.get(0)?.group?.get(0)?.subType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.term?.get(0)?.group?.get(0)?.subType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-object-type",
            actual = data.term?.get(0)?.group?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(0)?.group?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold order results from any provider.",
            actual = data.term?.get(0)?.group?.get(1)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.term?.get(0)?.group?.get(1)?.subType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.term?.get(0)?.group?.get(1)?.subType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-object-type",
            actual = data.term?.get(0)?.group?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(0)?.group?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "sample",
            actual = data.term?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "57016-8",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testContract05() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notThem.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract05Step01(data: Contract) {

        assertEquals(
            expected = "Michigan Health",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/3",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UK Pharmacies",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/ukp",
            actual = data.domain?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in friendly consumer speak.",
            actual = data.friendly?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pcd-example-notThem",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.legal?.get(0)?.contentAttachment?.title
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
            expected = "Patient/f001",
            actual = data.signer?.get(0)?.party?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.2.840.10065.1.12.1.1",
            actual = data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso-astm:E1762-95:2013",
            actual = data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-06-08T10:57:34-07:00",
            actual = data.signer?.get(0)?.signature?.get(0)?.whenn?.value.toString()
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.signer?.get(0)?.signature?.get(0)?.who?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "COVPTY",
            actual = data.signer?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/contractsignertypecodes",
            actual = data.signer?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Opt-In",
            actual = data.subType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Default Authorization with exceptions.",
            actual = data.subType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            actual = data.subType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold this order and any results or related objects from specified nurse provider.",
            actual = data.term?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fictive Nurse",
            actual = data.term?.get(0)?.offer?.topic?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f204",
            actual = data.term?.get(0)?.offer?.topic?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-from",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold all data from specified actor entity.",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "57016-8",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testContract06() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notAuthor.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract06Step01(data: Contract) {

        assertEquals(
            expected = "Michigan Health",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/3",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UK Pharmacies",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/ukp",
            actual = data.domain?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in friendly consumer speak.",
            actual = data.friendly?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pcd-example-notAuthor",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.legal?.get(0)?.contentAttachment?.title
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
            expected = "Opt-In",
            actual = data.subType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Default Authorization with exceptions.",
            actual = data.subType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            actual = data.subType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold all data authored by Good Health provider.",
            actual = data.term?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.term?.get(0)?.offer?.topic?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.term?.get(0)?.offer?.topic?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-authored-by",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold all data authored by specified actor entity.",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "57016-8",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testContract07() {
        // Given
        val sourceJson = loadAsString("r4/contract-example.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract07Step01(data: Contract) {

        assertEquals(
            expected = "C-123",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/contract",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12347",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/pdf",
            actual = data.legallyBindingAttachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.aws3.com/storage/doc.pdf",
            actual = data.legallyBindingAttachment?.url
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
            expected = "application/txt",
            actual = data.rule?.get(0)?.contentAttachment?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.rfc-editor.org/bcp/bcp13.txt",
            actual = data.rule?.get(0)?.contentAttachment?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-06-01",
            actual = data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.start?.value.toString()
        )

        assertEquals(
            expected = "sample",
            actual = data.term?.get(0)?.asset?.get(0)?.subtype?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RicardianContract",
            actual = data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1995",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.effectiveTime?.value.toString()
        )

        assertEquals(
            expected = "Ford Bobcat",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.entityCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.factor?.value
        )

        assertEquals(
            expected = "http://somewhere.motor-vehicle.com/vin",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "XXSVT34-7665t952236",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CAD",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "1.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.points?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.quantity?.value?.value
        )

        assertEquals(
            expected = "CAD",
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.value?.value
        )

        assertEquals(
            expected = "Can't refuse",
            actual = data.term?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the contract</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testContract08() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notThis.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertContract08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertContract08Step01(data: Contract) {

        assertEquals(
            expected = "Michigan Health",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/3",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UK Pharmacies",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/ukp",
            actual = data.domain?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The terms of the consent in friendly consumer speak.",
            actual = data.friendly?.get(0)?.contentAttachment?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pcd-example-notThis",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.issued?.value.toString()
        )

        assertEquals(
            expected = "The terms of the consent in lawyer speak.",
            actual = data.legal?.get(0)?.contentAttachment?.title
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
            expected = "Opt-In",
            actual = data.subType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Default Authorization with exceptions.",
            actual = data.subType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            actual = data.subType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-18",
            actual = data.term?.get(0)?.applies?.start?.value.toString()
        )

        assertEquals(
            expected = "http://example.org/fhir/term-items",
            actual = data.term?.get(0)?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3347689",
            actual = data.term?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-11-01",
            actual = data.term?.get(0)?.issued?.value.toString()
        )

        assertEquals(
            expected = "Withhold this order and any results or related objects from any provider.",
            actual = data.term?.get(0)?.offer?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ServiceRequest/lipid",
            actual = data.term?.get(0)?.offer?.topic?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-identified-object-and-related",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold the identified object and any other resources that are related to this object.",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "57016-8",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
