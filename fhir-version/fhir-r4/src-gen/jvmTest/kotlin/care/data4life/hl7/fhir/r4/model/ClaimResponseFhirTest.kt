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
import care.data4life.hl7.fhir.r4.codesystem.ClaimProcessingCodes
import care.data4life.hl7.fhir.r4.codesystem.FinancialResourceStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.NoteType
import care.data4life.hl7.fhir.r4.codesystem.Use
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ClaimResponseTest.java
 *
 * Response to a claim predetermination or preauthorization
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ClaimResponseFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testClaimResponse01() {
        // Given
        val sourceJson = loadAsString("r4/claimresponse-example-unsolicited-preauth.json")

        // When
        val data = parser.toFhir(ClaimResponse::class, sourceJson)

        // Then
        assertClaimResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaimResponse01Step01(data: ClaimResponse) {
        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.addItem?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.adjudication?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "copay",
            actual = data.addItem?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.addItem?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(2)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "240.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.addItem?.get(0)?.itemSequence?.get(0)?.value
        )

        assertEquals(
            expected = "x",
            actual = data.addItem?.get(0)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "None",
            actual = data.addItem?.get(0)?.modifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/modifiers",
            actual = data.addItem?.get(0)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250.0".toDouble(),
            actual = data.addItem?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "101".toLong(),
            actual = data.addItem?.get(0)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "1101",
            actual = data.addItem?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.addItem?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(1)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "800.0".toDouble(),
            actual = data.addItem?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.addItem?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.addItem?.get(1)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.0".toDouble(),
            actual = data.addItem?.get(1)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(1)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "800.0".toDouble(),
            actual = data.addItem?.get(1)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.addItem?.get(1)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.addItem?.get(1)?.itemSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "800.0".toDouble(),
            actual = data.addItem?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "2101",
            actual = data.addItem?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Radiograph, series (12)",
            actual = data.addItem?.get(1)?.productOrService?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.addItem?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "The enclosed services are authorized for your provision within 30 days of this notice.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UR3503",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.SocialBenefitsInc.com/fhir/ClaimResponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "UR3503",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Coverage/9876B1",
            actual = data.insurance?.get(0)?.coverage?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.insurance?.get(0)?.focal?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.insurance?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "http://www.jurisdiction.org/insurers",
            actual = data.insurer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "444123",
            actual = data.insurer?.identifier?.value
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payeeType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payeetype",
            actual = data.payeeType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18SS12345",
            actual = data.preAuthRef
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-CA",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "101".toLong(),
            actual = data.processNote?.get(0)?.number?.value
        )

        assertEquals(
            expected = "Please submit a Pre-Authorization request if a more extensive examination or urgent services are required.",
            actual = data.processNote?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NoteType.PRINT,
            actual = data.processNote?.get(0)?.type
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A sample unsolicited pre-authorization response which authorizes basic dental services to be performed for a patient.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1050.0".toDouble(),
            actual = data.total?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "submitted",
            actual = data.total?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1040.0".toDouble(),
            actual = data.total?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.total?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.PREAUTHORIZATION,
            actual = data.use
        )
    }

    @Test
    fun testClaimResponse02() {
        // Given
        val sourceJson = loadAsString("r4/claimresponse-example-additem.json")

        // When
        val data = parser.toFhir(ClaimResponse::class, sourceJson)

        // Then
        assertClaimResponse02Step01(data)
        assertClaimResponse02Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaimResponse02Step01(data: ClaimResponse) {
        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.addItem?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.adjudication?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "copay",
            actual = data.addItem?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.addItem?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(2)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "72.0".toDouble(),
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ar002",
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.reason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Plan Limit Reached",
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.reason?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/adjudication-reason",
            actual = data.addItem?.get(0)?.adjudication?.get(3)?.reason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.addItem?.get(0)?.itemSequence?.get(0)?.value
        )

        assertEquals(
            expected = "x",
            actual = data.addItem?.get(0)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "None",
            actual = data.addItem?.get(0)?.modifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/modifiers",
            actual = data.addItem?.get(0)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(0)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.addItem?.get(0)?.net?.value?.value
        )

        assertEquals(
            expected = "101".toLong(),
            actual = data.addItem?.get(0)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "1101",
            actual = data.addItem?.get(0)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.addItem?.get(0)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(1)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "35.57".toDouble(),
            actual = data.addItem?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.addItem?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.addItem?.get(1)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.addItem?.get(1)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(1)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "28.47".toDouble(),
            actual = data.addItem?.get(1)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.addItem?.get(1)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.addItem?.get(1)?.itemSequence?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(1)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "35.57".toDouble(),
            actual = data.addItem?.get(1)?.net?.value?.value
        )

        assertEquals(
            expected = "2141",
            actual = data.addItem?.get(1)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Radiograph, bytewing",
            actual = data.addItem?.get(1)?.productOrService?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.addItem?.get(1)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(2)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "350.0".toDouble(),
            actual = data.addItem?.get(2)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.addItem?.get(2)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.addItem?.get(2)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.addItem?.get(2)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(2)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "270.0".toDouble(),
            actual = data.addItem?.get(2)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.addItem?.get(2)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.addItem?.get(2)?.detailSequence?.get(0)?.value
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.addItem?.get(2)?.itemSequence?.get(0)?.value
        )

        assertEquals(
            expected = "x",
            actual = data.addItem?.get(2)?.modifier?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "None",
            actual = data.addItem?.get(2)?.modifier?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/modifiers",
            actual = data.addItem?.get(2)?.modifier?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.addItem?.get(2)?.net?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "350.0".toDouble(),
            actual = data.addItem?.get(2)?.net?.value?.value
        )

        assertEquals(
            expected = "101".toLong(),
            actual = data.addItem?.get(2)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "expense",
            actual = data.addItem?.get(2)?.productOrService?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/oralservicecodes",
            actual = data.addItem?.get(2)?.productOrService?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Claim settled as per contract.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3503",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/remittance",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3503",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.jurisdiction.org/insurers",
            actual = data.insurer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "555123",
            actual = data.insurer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.itemSequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "105.0".toDouble(),
            actual = data.item?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(1)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(1)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(1)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "84.0".toDouble(),
            actual = data.item?.get(1)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(1)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(1)?.itemSequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "750.0".toDouble(),
            actual = data.item?.get(2)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(2)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(2)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(2)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "600.0".toDouble(),
            actual = data.item?.get(2)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(2)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "750.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "600.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(2)?.detail?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(2)?.detail?.get(0)?.detailSequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(1)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(2)?.detail?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(2)?.detail?.get(1)?.adjudication?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.0".toDouble(),
            actual = data.item?.get(2)?.detail?.get(1)?.adjudication?.get(1)?.amount?.value?.value
        )
    }

    private fun assertClaimResponse02Step02(data: ClaimResponse) {
        assertEquals(
            expected = "benefit",
            actual = data.item?.get(2)?.detail?.get(1)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(2)?.detail?.get(1)?.detailSequence?.value
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(2)?.itemSequence?.value
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payeeType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payeetype",
            actual = data.payeeType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.payment?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.47".toDouble(),
            actual = data.payment?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-31",
            actual = data.payment?.date?.value.toString()
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/paymentidentifier",
            actual = data.payment?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "201408-2-15507",
            actual = data.payment?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.payment?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-paymenttype",
            actual = data.payment?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-CA",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "101".toLong(),
            actual = data.processNote?.get(0)?.number?.value
        )

        assertEquals(
            expected = "Package codes are not permitted. Codes replaced by Insurer.",
            actual = data.processNote?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NoteType.PRINT,
            actual = data.processNote?.get(0)?.type
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.request?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12346",
            actual = data.request?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ClaimResponse to Claim Oral Average with additional items</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1340.57".toDouble(),
            actual = data.total?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "submitted",
            actual = data.total?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1054.47".toDouble(),
            actual = data.total?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.total?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaimResponse03() {
        // Given
        val sourceJson = loadAsString("r4/claimresponse-example.json")

        // When
        val data = parser.toFhir(ClaimResponse::class, sourceJson)

        // Then
        assertClaimResponse03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaimResponse03Step01(data: ClaimResponse) {
        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Claim settled as per contract.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3500",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/remittance",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3500",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.jurisdiction.org/insurers",
            actual = data.insurer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "555123",
            actual = data.insurer?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "copay",
            actual = data.item?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(2)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(3)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "90.47".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(3)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.adjudication?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ar002",
            actual = data.item?.get(0)?.adjudication?.get(3)?.reason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Plan Limit Reached",
            actual = data.item?.get(0)?.adjudication?.get(3)?.reason?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/adjudication-reason",
            actual = data.item?.get(0)?.adjudication?.get(3)?.reason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.itemSequence?.value
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payeeType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payeetype",
            actual = data.payeeType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.payment?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.47".toDouble(),
            actual = data.payment?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-31",
            actual = data.payment?.date?.value.toString()
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/paymentidentifier",
            actual = data.payment?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "201408-2-1569478",
            actual = data.payment?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.payment?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-paymenttype",
            actual = data.payment?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/oralhealthclaim/15476332402",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "emergency",
            actual = data.subType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-claimsubtype",
            actual = data.subType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ClaimResponse</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "135.57".toDouble(),
            actual = data.total?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "submitted",
            actual = data.total?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "90.47".toDouble(),
            actual = data.total?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.total?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaimResponse04() {
        // Given
        val sourceJson = loadAsString("r4/claimresponse-example-vision-3tier.json")

        // When
        val data = parser.toFhir(ClaimResponse::class, sourceJson)

        // Then
        assertClaimResponse04Step01(data)
        assertClaimResponse04Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaimResponse04Step01(data: ClaimResponse) {
        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Claim settled as per contract.",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3502",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://thebenefitcompany.com/claimresponse",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CR6532875367",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.insurer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "235.4".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "copay",
            actual = data.item?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(2)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.adjudication?.get(3)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "172.32".toDouble(),
            actual = data.item?.get(0)?.adjudication?.get(3)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.adjudication?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "copay",
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(2)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(3)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(3)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.detail?.get(0)?.adjudication?.get(3)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(0)?.detailSequence?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(0)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "110.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "88.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.detail?.get(1)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.detailSequence?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "60.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(0)?.subDetailSequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(1)?.subDetailSequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "10.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(0)?.detail?.get(1)?.subDetail?.get(2)?.subDetailSequence?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "eligible",
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligpercent",
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(1)?.value?.value
        )

        assertEquals(
            expected = "USD",
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(2)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14.0".toDouble(),
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(2)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.item?.get(0)?.detail?.get(2)?.adjudication?.get(2)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.item?.get(0)?.detail?.get(2)?.detailSequence?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.detail?.get(2)?.noteNumber?.get(0)?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.item?.get(0)?.itemSequence?.value
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
            expected = ClaimProcessingCodes.COMPLETE,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "provider",
            actual = data.payeeType?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payeetype",
            actual = data.payeeType?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.payment?.adjustment?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "75.0".toDouble(),
            actual = data.payment?.adjustment?.value?.value
        )

        assertEquals(
            expected = "a002",
            actual = data.payment?.adjustmentReason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Prior Overpayment",
            actual = data.payment?.adjustmentReason?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/payment-adjustment-reason",
            actual = data.payment?.adjustmentReason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.payment?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "107.0".toDouble(),
            actual = data.payment?.amount?.value?.value
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.payment?.date?.value.toString()
        )

        assertEquals(
            expected = "http://thebenefitcompany.com/paymentidentifier",
            actual = data.payment?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "201416-123456",
            actual = data.payment?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.payment?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/ex-paymenttype",
            actual = data.payment?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-CA",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )
    }

    private fun assertClaimResponse04Step02(data: ClaimResponse) {
        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.processNote?.get(0)?.number?.value
        )

        assertEquals(
            expected = "After hours surcharge declined",
            actual = data.processNote?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NoteType.DISPLAY,
            actual = data.processNote?.get(0)?.type
        )

        assertEquals(
            expected = "http://happysight.com/claim",
            actual = data.request?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6612346",
            actual = data.request?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1",
            actual = data.requestor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ClaimResponse</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(0)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "235.4".toDouble(),
            actual = data.total?.get(0)?.amount?.value?.value
        )

        assertEquals(
            expected = "submitted",
            actual = data.total?.get(0)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "USD",
            actual = data.total?.get(1)?.amount?.currency
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "182.0".toDouble(),
            actual = data.total?.get(1)?.amount?.value?.value
        )

        assertEquals(
            expected = "benefit",
            actual = data.total?.get(1)?.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vision",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }

    @Test
    fun testClaimResponse05() {
        // Given
        val sourceJson = loadAsString("r4/claimresponse-example-2.json")

        // When
        val data = parser.toFhir(ClaimResponse::class, sourceJson)

        // Then
        assertClaimResponse05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertClaimResponse05Step01(data: ClaimResponse) {
        assertEquals(
            expected = "CommunicationRequest/fm-solicit",
            actual = data.communicationRequest?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Claim could not be processed",
            actual = data.disposition
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "a002",
            actual = data.error?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/adjudication-error",
            actual = data.error?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.error?.get(0)?.detailSequence?.value
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.error?.get(0)?.itemSequence?.value
        )

        assertEquals(
            expected = "2",
            actual = data.formCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/forms-codes",
            actual = data.formCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3501",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.BenefitsInc.com/fhir/remittance",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "R3501",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.jurisdiction.org/insurers",
            actual = data.insurer?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "555123",
            actual = data.insurer?.identifier?.value
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
            expected = ClaimProcessingCodes.ERROR,
            actual = data.outcome
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "en-CA",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:bcp:47",
            actual = data.processNote?.get(0)?.language?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.processNote?.get(0)?.number?.value
        )

        assertEquals(
            expected = "Invalid claim",
            actual = data.processNote?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NoteType.DISPLAY,
            actual = data.processNote?.get(0)?.type
        )

        assertEquals(
            expected = "Claim/100156",
            actual = data.request?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.requestor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = FinancialResourceStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">A human-readable rendering of the ClaimResponse that demonstrates returning errors</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "oral",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/claim-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = Use.CLAIM,
            actual = data.use
        )
    }
}
