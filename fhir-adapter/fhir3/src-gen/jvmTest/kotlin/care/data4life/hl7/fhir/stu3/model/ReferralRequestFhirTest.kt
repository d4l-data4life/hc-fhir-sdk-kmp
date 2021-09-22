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
import care.data4life.hl7.fhir.stu3.codesystem.RequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ReferralRequestTest.java
 *
 * A request for referral or transfer of care
 *
 * Used to record and send details about a request for referral service or transfer of a patient to the
 * care of another provider or provider organization.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ReferralRequestFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testReferralRequest01() {
        // Given
        val sourceJson = loadAsString("stu3/referralrequest-example.json")

        // When
        val data = parser.toFhir(ReferralRequest::class, sourceJson)

        // Then
        assertReferralRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertReferralRequest01Step01(data: ReferralRequest) {

        assertEquals(
            expected = "2014-02-14",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "ProcedureRequest for Myringotomy and insertion of tympanic ventilation tube",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Beverly Waver's encounter on 2014-02-14",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Protocol for insertion of tympanic ventilation tube",
            actual = data.definition?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "In the past 2 years Beverly has had 6 instances of r) sided Otitis media. She is     falling behind her peers at school, and displaying some learning difficulties.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1234",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://orionhealth.com/fhir/apps/referralids",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ret4421",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2014-03-14",
            actual = data.occurrencePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "For consideration of Grommets",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Dave",
            actual = data.recipient?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://fhir.orionhealth.com/blaze/fhir/Practitioner/76597",
            actual = data.recipient?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "prior ReferralRequest",
            actual = data.replaces?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serena Shrink",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://fhir.orionhealth.com/blaze/fhir/Practitioner/77272",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "172676009",
            actual = data.serviceRequested?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Myringotomy and insertion of tympanic ventilation tube",
            actual = data.serviceRequested?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.serviceRequested?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Insertion of grommets",
            actual = data.serviceRequested?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ent",
            actual = data.specialty?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ENT",
            actual = data.specialty?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://orionhealth.com/fhir/apps/specialties",
            actual = data.specialty?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Beverly Weaver",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "https://fhir.orionhealth.com/blaze/fhir/Patient/77662",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Referral to Dr Dave for Beverly weaver to have grommets inserted in her r) ear</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "103696004",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient referral to specialist",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
