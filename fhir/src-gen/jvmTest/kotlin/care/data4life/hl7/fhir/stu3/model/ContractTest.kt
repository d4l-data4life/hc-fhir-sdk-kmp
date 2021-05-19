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
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ContractTest.java
 *
 * Legal Agreement
 *
 * A formal agreement between parties regarding the conduct of business, exchange of information or
 * other matters.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ContractTest {

    val parser = FhirStu3Parser()

    @Test
    fun testContract01() {
        // Given
        val sourceJson = loadAsString("stu3/pcd-example-notOrg.json")

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
            expected = "Canada Infoway",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/Infoway",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Canada Infoway",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/Infoway",
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
            actual = data.term?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.term?.get(0)?.topic?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.term?.get(0)?.topic?.get(0)?.reference
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
        val sourceJson = loadAsString("stu3/contract-example-42cfr-part2.json")

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
            expected = "VA Ann Arbor Healthcare System",
            actual = data.agent?.get(0)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.agent?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IR",
            actual = data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Recipient",
            actual = data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://org.mdhhs.fhir.consent-actor-type",
            actual = data.agent?.get(0)?.role?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Recipient of restricted health information",
            actual = data.agent?.get(0)?.role?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Community Mental Health Clinic",
            actual = data.agent?.get(1)?.actor?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.agent?.get(1)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IS",
            actual = data.agent?.get(1)?.role?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sender",
            actual = data.agent?.get(1)?.role?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://org.mdhhs.fhir.consent-actor-type",
            actual = data.agent?.get(1)?.role?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sender of restricted health information",
            actual = data.agent?.get(1)?.role?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "C-2121",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2031-11-01T21:18:27-04:00",
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
            expected = "1",
            actual = data.meta?.versionId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R",
            actual = data.securityLabel?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Restricted",
            actual = data.securityLabel?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/Confidentiality",
            actual = data.securityLabel?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ETH",
            actual = data.securityLabel?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "substance abuse information sensitivity",
            actual = data.securityLabel?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.securityLabel?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "42CFRPart2",
            actual = data.securityLabel?.get(2)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.securityLabel?.get(2)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TREAT",
            actual = data.securityLabel?.get(3)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "treatment",
            actual = data.securityLabel?.get(3)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActReason",
            actual = data.securityLabel?.get(3)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HPAYMT",
            actual = data.securityLabel?.get(4)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "healthcare payment",
            actual = data.securityLabel?.get(4)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActReason",
            actual = data.securityLabel?.get(4)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "HOPERAT",
            actual = data.securityLabel?.get(5)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "healthcare operations",
            actual = data.securityLabel?.get(5)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActReason",
            actual = data.securityLabel?.get(5)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PERSISTLABEL",
            actual = data.securityLabel?.get(6)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "persist security label",
            actual = data.securityLabel?.get(6)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.securityLabel?.get(6)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PRIVMARK",
            actual = data.securityLabel?.get(7)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "privacy mark",
            actual = data.securityLabel?.get(7)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.securityLabel?.get(7)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NORDSCLCD",
            actual = data.securityLabel?.get(8)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "no redisclosure without consent directive",
            actual = data.securityLabel?.get(8)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActCode",
            actual = data.securityLabel?.get(8)?.system
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
            actual = data.signer?.get(0)?.signature?.get(0)?.whoReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "SELF",
            actual = data.signer?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://org.mdhhs.fhir.consent-signer-type",
            actual = data.signer?.get(0)?.type?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MDHHS-5515",
            actual = data.subType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Michigan MDHHS-5515 Consent to Share Behavioral Health Information for Care Coordination Purposes",
            actual = data.subType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/consentcategorycodes",
            actual = data.subType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.get(0)?.reference
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
            expected = "http://org.mdhhs.fhir.consentdirective-type",
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
    fun testContract03() {
        // Given
        val sourceJson = loadAsString("stu3/pcd-example-notLabs.json")

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
            expected = "Canada Infoway",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/Infoway",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Canada Infoway",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/Infoway",
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
            expected = "ProcedureRequest",
            actual = data.term?.get(0)?.subType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.term?.get(0)?.subType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold orders from any provider.",
            actual = data.term?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-object-type",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.term?.get(1)?.subType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/resource-types",
            actual = data.term?.get(1)?.subType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Withhold order results from any provider.",
            actual = data.term?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "withhold-object-type",
            actual = data.term?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/consent-term-type-codes",
            actual = data.term?.get(1)?.type?.coding?.get(0)?.system
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
    fun testContract04() {
        // Given
        val sourceJson = loadAsString("stu3/pcd-example-notThem.json")

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
            expected = "Patient/f001",
            actual = data.agent?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Canada Infoway",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Canada Infoway",
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
            actual = data.signer?.get(0)?.signature?.get(0)?.whoReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "COVPTY",
            actual = data.signer?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.hl7.org/fhir/contractsignertypecodes",
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
            actual = data.term?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fictive Nurse",
            actual = data.term?.get(0)?.topic?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f204",
            actual = data.term?.get(0)?.topic?.get(0)?.reference
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
    fun testContract05() {
        // Given
        val sourceJson = loadAsString("stu3/pcd-example-notAuthor.json")

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
            expected = "Canada Infoway",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/Infoway",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Canada Infoway",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/Infoway",
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
            actual = data.term?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.term?.get(0)?.topic?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.term?.get(0)?.topic?.get(0)?.reference
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
    fun testContract06() {
        // Given
        val sourceJson = loadAsString("stu3/contract-example.json")

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
            expected = "C-123",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/contract",
            actual = data.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12347",
            actual = data.identifier?.value
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
    fun testContract07() {
        // Given
        val sourceJson = loadAsString("stu3/pcd-example-notThis.json")

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
            expected = "Canada Infoway",
            actual = data.authority?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/Infoway",
            actual = data.authority?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Canada Infoway",
            actual = data.domain?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/Infoway",
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
            actual = data.term?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ProcedureRequest/example-lipid",
            actual = data.term?.get(0)?.topic?.get(0)?.reference
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
