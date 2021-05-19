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
        assertEquals(
            "Michigan Health",
            data.authority?.get(0)?.display
        )
        assertEquals(
            "Organization/3",
            data.authority?.get(0)?.reference
        )
        assertEquals(
            "UK Pharmacies",
            data.domain?.get(0)?.display
        )
        assertEquals(
            "Location/ukp",
            data.domain?.get(0)?.reference
        )
        assertEquals(
            "The terms of the consent in friendly consumer speak.",
            data.friendly?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "pcd-example-notOrg",
            data.id
        )
        assertEquals(
            "2015-11-18",
            data.issued?.value.toString()
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.legal?.get(0)?.contentAttachment?.title
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
            "Opt-In",
            data.subType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Default Authorization with exceptions.",
            data.subType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            data.subType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.get(0)?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "Withhold this order and any results or related objects from any provider.",
            data.term?.get(0)?.offer?.text
        )
        assertEquals(
            "Good Health Clinic",
            data.term?.get(0)?.offer?.topic?.display
        )
        assertEquals(
            "Organization/2.16.840.1.113883.19.5",
            data.term?.get(0)?.offer?.topic?.reference
        )
        assertEquals(
            "withhold-from",
            data.term?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Withhold all data from specified actor entity.",
            data.term?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/consent-term-type-codes",
            data.term?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "57016-8",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testContract02() {
        // Given
        val sourceJson = loadAsString("r4/contract-example-ins-policy.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertEquals(
            "2017-01-01",
            data.applies?.start?.value.toString()
        )
        assertEquals(
            "INS-101",
            data.id
        )
        assertEquals(
            "http://xyz-insurance.com/forms",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "YCSCWLN(01-2017)",
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
            "Patient/1",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "2017-06-01",
            data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.start?.value.toString()
        )
        assertEquals(
            "sample",
            data.term?.get(0)?.asset?.get(0)?.subtype?.get(0)?.text
        )
        assertEquals(
            "RicardianContract",
            data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1995",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.effectiveTime?.value.toString()
        )
        assertEquals(
            "Ford Bobcat",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.entityCodeableConcept?.text
        )
        assertEquals(
            "1.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.factor?.value
        )
        assertEquals(
            "http://somewhere.motor-vehicle.com/vin",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.system
        )
        assertEquals(
            "XXSVT34-7665t952236",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.value
        )
        assertEquals(
            "CAD",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.value?.value
        )
        assertEquals(
            "1.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.points?.value
        )
        assertEquals(
            "1".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.quantity?.value?.value
        )
        assertEquals(
            "CAD",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.value?.value
        )
        assertEquals(
            "Eligible Providers",
            data.term?.get(0)?.group?.get(0)?.offer?.text
        )
        assertEquals(
            "Responsibility for Payment",
            data.term?.get(0)?.group?.get(1)?.offer?.text
        )
        assertEquals(
            "Emergency Room Copay",
            data.term?.get(0)?.group?.get(2)?.group?.get(0)?.group?.get(0)?.offer?.text
        )
        assertEquals(
            "Professional Visit Copay",
            data.term?.get(0)?.group?.get(2)?.group?.get(0)?.group?.get(1)?.offer?.text
        )
        assertEquals(
            "Copays",
            data.term?.get(0)?.group?.get(2)?.group?.get(0)?.offer?.text
        )
        assertEquals(
            "Calendar Year Deductible",
            data.term?.get(0)?.group?.get(2)?.group?.get(1)?.offer?.text
        )
        assertEquals(
            "Out-Of-Pocket Maximum",
            data.term?.get(0)?.group?.get(2)?.group?.get(2)?.offer?.text
        )
        assertEquals(
            "Ambulance Services",
            data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(0)?.offer?.text
        )
        assertEquals(
            "Dental Services",
            data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(1)?.offer?.text
        )
        assertEquals(
            "Diagnostic Services",
            data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(2)?.offer?.text
        )
        assertEquals(
            "Emergency Room Services",
            data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(3)?.offer?.text
        )
        assertEquals(
            "Hospital Inpatient Care",
            data.term?.get(0)?.group?.get(2)?.group?.get(3)?.group?.get(4)?.offer?.text
        )
        assertEquals(
            "Medical Services",
            data.term?.get(0)?.group?.get(2)?.group?.get(3)?.offer?.text
        )
        assertEquals(
            "List of Benefits",
            data.term?.get(0)?.group?.get(2)?.offer?.text
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "healthinsurance",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Health Insurance",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/contract-type",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testContract03() {
        // Given
        val sourceJson = loadAsString("r4/contract-example-42cfr-part2.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertEquals(
            "2013-11-01T21:18:27-04:00",
            data.applies?.start?.value.toString()
        )
        assertEquals(
            "registration",
            data.contentDerivative?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/contract-content-derivative",
            data.contentDerivative?.coding?.get(0)?.system
        )
        assertEquals(
            "C-2121",
            data.id
        )
        assertEquals(
            "2013-11-01T21:18:27-04:00",
            data.issued?.value.toString()
        )
        assertEquals(
            "application/pdf",
            data.legal?.get(0)?.contentAttachment?.contentType
        )
        assertEquals(
            "en-US",
            data.legal?.get(0)?.contentAttachment?.language
        )
        assertEquals(
            "MDHHS-5515 Consent To Share Your Health Information",
            data.legal?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "http://org.mihin.ecms/ConsentDirective-2121",
            data.legal?.get(0)?.contentAttachment?.url
        )
        assertEquals(
            "2016-07-19T18:18:42.108-04:00",
            data.meta?.lastUpdated?.value.toString()
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
            "1",
            data.meta?.versionId
        )
        assertEquals(
            "Alice Recruit",
            data.signer?.get(0)?.party?.display
        )
        assertEquals(
            "Patient/f201",
            data.signer?.get(0)?.party?.reference
        )
        assertEquals(
            "1.2.840.10065.1.12.1.1",
            data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.code
        )
        assertEquals(
            "urn:iso-astm:E1762-95:2013",
            data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.system
        )
        assertEquals(
            "2017-02-08T10:57:34+01:00",
            data.signer?.get(0)?.signature?.get(0)?.whenn?.value.toString()
        )
        assertEquals(
            "Patient/f201",
            data.signer?.get(0)?.signature?.get(0)?.who?.reference
        )
        assertEquals(
            "SELF",
            data.signer?.get(0)?.type?.code
        )
        assertEquals(
            "http://mdhhs.org/fhir/consent-signer-type",
            data.signer?.get(0)?.type?.system
        )
        assertEquals(
            ContractResourceStatusCodes.EXECUTED,
            data.status
        )
        assertEquals(
            "hcd",
            data.subType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/consentcategorycodes",
            data.subType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Patient/f201",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "HPRGRP",
            data.term?.get(0)?.action?.get(0)?.intent?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.term?.get(0)?.action?.get(0)?.intent?.coding?.get(0)?.system
        )
        assertEquals(
            "Sample",
            data.term?.get(0)?.action?.get(0)?.status?.text
        )
        assertEquals(
            "VA Ann Arbor Healthcare System",
            data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.reference?.get(0)?.display
        )
        assertEquals(
            "Organization/f001",
            data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.reference?.get(0)?.reference
        )
        assertEquals(
            "IR",
            data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "Recipient",
            data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.coding?.get(0)?.display
        )
        assertEquals(
            "http://mdhhs.org/fhir/consent-actor-type",
            data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "Recipient of restricted health information",
            data.term?.get(0)?.action?.get(0)?.subject?.get(0)?.role?.text
        )
        assertEquals(
            "Community Mental Health Clinic",
            data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.reference?.get(0)?.display
        )
        assertEquals(
            "Organization/2",
            data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.reference?.get(0)?.reference
        )
        assertEquals(
            "IS",
            data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.coding?.get(0)?.code
        )
        assertEquals(
            "Sender",
            data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.coding?.get(0)?.display
        )
        assertEquals(
            "http://mdhhs.org/fhir/consent-actor-type",
            data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.coding?.get(0)?.system
        )
        assertEquals(
            "Sender of restricted health information",
            data.term?.get(0)?.action?.get(0)?.subject?.get(1)?.role?.text
        )
        assertEquals(
            "action-a",
            data.term?.get(0)?.action?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/contractaction",
            data.term?.get(0)?.action?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "2019-11-01T21:18:27-04:00",
            data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.end?.value.toString()
        )
        assertEquals(
            "2013-11-01T21:18:27-04:00",
            data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.start?.value.toString()
        )
        assertEquals(
            "OPTIN",
            data.term?.get(0)?.offer?.decision?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            data.term?.get(0)?.offer?.decision?.coding?.get(0)?.system
        )
        assertEquals(
            "Can't refuse",
            data.term?.get(0)?.offer?.text
        )
        assertEquals(
            "statutory",
            data.term?.get(0)?.offer?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/contracttermtypecodes",
            data.term?.get(0)?.offer?.type?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "OPTIN",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://mdhhs.org/fhir/consentdirective-type",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Opt-in consent directive",
            data.type?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testContract04() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notLabs.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertEquals(
            "Michigan Health",
            data.authority?.get(0)?.display
        )
        assertEquals(
            "Organization/3",
            data.authority?.get(0)?.reference
        )
        assertEquals(
            "UK Pharmacies",
            data.domain?.get(0)?.display
        )
        assertEquals(
            "Location/ukp",
            data.domain?.get(0)?.reference
        )
        assertEquals(
            "The terms of the consent in friendly consumer speak.",
            data.friendly?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "pcd-example-notLabs",
            data.id
        )
        assertEquals(
            "2014-08-17",
            data.issued?.value.toString()
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.legal?.get(0)?.contentAttachment?.title
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
            "Opt-In",
            data.subType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Default Authorization with exceptions.",
            data.subType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            data.subType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.get(0)?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "Withhold orders from any provider.",
            data.term?.get(0)?.group?.get(0)?.offer?.text
        )
        assertEquals(
            "ServiceRequest",
            data.term?.get(0)?.group?.get(0)?.subType?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/resource-types",
            data.term?.get(0)?.group?.get(0)?.subType?.coding?.get(0)?.system
        )
        assertEquals(
            "withhold-object-type",
            data.term?.get(0)?.group?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/fhir/consent-term-type-codes",
            data.term?.get(0)?.group?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "Withhold order results from any provider.",
            data.term?.get(0)?.group?.get(1)?.offer?.text
        )
        assertEquals(
            "DiagnosticReport",
            data.term?.get(0)?.group?.get(1)?.subType?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/resource-types",
            data.term?.get(0)?.group?.get(1)?.subType?.coding?.get(0)?.system
        )
        assertEquals(
            "withhold-object-type",
            data.term?.get(0)?.group?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://example.org/fhir/consent-term-type-codes",
            data.term?.get(0)?.group?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "sample",
            data.term?.get(0)?.offer?.text
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "57016-8",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testContract05() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notThem.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertEquals(
            "Michigan Health",
            data.authority?.get(0)?.display
        )
        assertEquals(
            "Organization/3",
            data.authority?.get(0)?.reference
        )
        assertEquals(
            "UK Pharmacies",
            data.domain?.get(0)?.display
        )
        assertEquals(
            "Location/ukp",
            data.domain?.get(0)?.reference
        )
        assertEquals(
            "The terms of the consent in friendly consumer speak.",
            data.friendly?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "pcd-example-notThem",
            data.id
        )
        assertEquals(
            "2015-11-18",
            data.issued?.value.toString()
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.legal?.get(0)?.contentAttachment?.title
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
            "Patient/f001",
            data.signer?.get(0)?.party?.reference
        )
        assertEquals(
            "1.2.840.10065.1.12.1.1",
            data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.code
        )
        assertEquals(
            "urn:iso-astm:E1762-95:2013",
            data.signer?.get(0)?.signature?.get(0)?.type?.get(0)?.system
        )
        assertEquals(
            "2013-06-08T10:57:34-07:00",
            data.signer?.get(0)?.signature?.get(0)?.whenn?.value.toString()
        )
        assertEquals(
            "Patient/f001",
            data.signer?.get(0)?.signature?.get(0)?.who?.reference
        )
        assertEquals(
            "COVPTY",
            data.signer?.get(0)?.type?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/contractsignertypecodes",
            data.signer?.get(0)?.type?.system
        )
        assertEquals(
            "Opt-In",
            data.subType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Default Authorization with exceptions.",
            data.subType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            data.subType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.get(0)?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "Withhold this order and any results or related objects from specified nurse provider.",
            data.term?.get(0)?.offer?.text
        )
        assertEquals(
            "Fictive Nurse",
            data.term?.get(0)?.offer?.topic?.display
        )
        assertEquals(
            "Practitioner/f204",
            data.term?.get(0)?.offer?.topic?.reference
        )
        assertEquals(
            "withhold-from",
            data.term?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Withhold all data from specified actor entity.",
            data.term?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/consent-term-type-codes",
            data.term?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "57016-8",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testContract06() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notAuthor.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertEquals(
            "Michigan Health",
            data.authority?.get(0)?.display
        )
        assertEquals(
            "Organization/3",
            data.authority?.get(0)?.reference
        )
        assertEquals(
            "UK Pharmacies",
            data.domain?.get(0)?.display
        )
        assertEquals(
            "Location/ukp",
            data.domain?.get(0)?.reference
        )
        assertEquals(
            "The terms of the consent in friendly consumer speak.",
            data.friendly?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "pcd-example-notAuthor",
            data.id
        )
        assertEquals(
            "2015-11-18",
            data.issued?.value.toString()
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.legal?.get(0)?.contentAttachment?.title
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
            "Opt-In",
            data.subType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Default Authorization with exceptions.",
            data.subType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            data.subType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.get(0)?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "Withhold all data authored by Good Health provider.",
            data.term?.get(0)?.offer?.text
        )
        assertEquals(
            "Good Health Clinic",
            data.term?.get(0)?.offer?.topic?.display
        )
        assertEquals(
            "Organization/2.16.840.1.113883.19.5",
            data.term?.get(0)?.offer?.topic?.reference
        )
        assertEquals(
            "withhold-authored-by",
            data.term?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Withhold all data authored by specified actor entity.",
            data.term?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/consent-term-type-codes",
            data.term?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "57016-8",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testContract07() {
        // Given
        val sourceJson = loadAsString("r4/contract-example.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertEquals(
            "C-123",
            data.id
        )
        assertEquals(
            "http://happyvalley.com/contract",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "12347",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "application/pdf",
            data.legallyBindingAttachment?.contentType
        )
        assertEquals(
            "http://www.aws3.com/storage/doc.pdf",
            data.legallyBindingAttachment?.url
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
            "application/txt",
            data.rule?.get(0)?.contentAttachment?.contentType
        )
        assertEquals(
            "http://www.rfc-editor.org/bcp/bcp13.txt",
            data.rule?.get(0)?.contentAttachment?.url
        )
        assertEquals(
            "2017-06-01",
            data.term?.get(0)?.asset?.get(0)?.period?.get(0)?.start?.value.toString()
        )
        assertEquals(
            "sample",
            data.term?.get(0)?.asset?.get(0)?.subtype?.get(0)?.text
        )
        assertEquals(
            "RicardianContract",
            data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.term?.get(0)?.asset?.get(0)?.type?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1995",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.effectiveTime?.value.toString()
        )
        assertEquals(
            "Ford Bobcat",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.entityCodeableConcept?.text
        )
        assertEquals(
            "1.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.factor?.value
        )
        assertEquals(
            "http://somewhere.motor-vehicle.com/vin",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.system
        )
        assertEquals(
            "XXSVT34-7665t952236",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.identifier?.value
        )
        assertEquals(
            "CAD",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.net?.value?.value
        )
        assertEquals(
            "1.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.points?.value
        )
        assertEquals(
            "1".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.quantity?.value?.value
        )
        assertEquals(
            "CAD",
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.currency
        )
        assertEquals(
            "200.0".toDouble(),
            data.term?.get(0)?.asset?.get(0)?.valuedItem?.get(0)?.unitPrice?.value?.value
        )
        assertEquals(
            "Can't refuse",
            data.term?.get(0)?.offer?.text
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the contract</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testContract08() {
        // Given
        val sourceJson = loadAsString("r4/pcd-example-notThis.json")

        // When
        val data = parser.toFhir(Contract::class, sourceJson)

        // Then
        assertEquals(
            "Michigan Health",
            data.authority?.get(0)?.display
        )
        assertEquals(
            "Organization/3",
            data.authority?.get(0)?.reference
        )
        assertEquals(
            "UK Pharmacies",
            data.domain?.get(0)?.display
        )
        assertEquals(
            "Location/ukp",
            data.domain?.get(0)?.reference
        )
        assertEquals(
            "The terms of the consent in friendly consumer speak.",
            data.friendly?.get(0)?.contentAttachment?.title
        )
        assertEquals(
            "pcd-example-notThis",
            data.id
        )
        assertEquals(
            "2015-11-18",
            data.issued?.value.toString()
        )
        assertEquals(
            "The terms of the consent in lawyer speak.",
            data.legal?.get(0)?.contentAttachment?.title
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
            "Opt-In",
            data.subType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Default Authorization with exceptions.",
            data.subType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://www.infoway-inforoute.ca.org/Consent-subtype-codes",
            data.subType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "P. van de Heuvel",
            data.subject?.get(0)?.display
        )
        assertEquals(
            "Patient/f001",
            data.subject?.get(0)?.reference
        )
        assertEquals(
            "2015-11-18",
            data.term?.get(0)?.applies?.start?.value.toString()
        )
        assertEquals(
            "http://example.org/fhir/term-items",
            data.term?.get(0)?.identifier?.system
        )
        assertEquals(
            "3347689",
            data.term?.get(0)?.identifier?.value
        )
        assertEquals(
            "2015-11-01",
            data.term?.get(0)?.issued?.value.toString()
        )
        assertEquals(
            "Withhold this order and any results or related objects from any provider.",
            data.term?.get(0)?.offer?.text
        )
        assertEquals(
            "ServiceRequest/lipid",
            data.term?.get(0)?.offer?.topic?.reference
        )
        assertEquals(
            "withhold-identified-object-and-related",
            data.term?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Withhold the identified object and any other resources that are related to this object.",
            data.term?.get(0)?.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/consent-term-type-codes",
            data.term?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "57016-8",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.type?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
