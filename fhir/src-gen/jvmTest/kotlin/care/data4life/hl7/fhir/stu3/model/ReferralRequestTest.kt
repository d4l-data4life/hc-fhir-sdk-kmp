/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * ReferralRequestTest.java
 *
 * A request for referral or transfer of care.
 *
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class ReferralRequestTest {

    val parser = FhirStu3Parser()


    @Test
    fun testReferralRequest1() {
        val sourceJson = loadAsString("stu3/referralrequest-example.json")

        val data = parser.toFhir(ReferralRequest::class, sourceJson)


        assertEquals("2014-02-14", data.authoredOn?.value.toString())
        assertEquals(
            "ProcedureRequest for Myringotomy and insertion of tympanic ventilation tube",
            data.basedOn?.get(0)?.display
        )
        assertEquals("Beverly Waver's encounter on 2014-02-14", data.context?.display)
        assertEquals(
            "Protocol for insertion of tympanic ventilation tube",
            data.definition?.get(0)?.display
        )
        assertEquals(
            "In the past 2 years Beverly has had 6 instances of r) sided Otitis media. She is     falling behind her peers at school, and displaying some learning difficulties.",
            data.description
        )
        assertEquals("1234", data.groupIdentifier?.value)
        assertEquals("example", data.id)
        assertEquals(
            "http://orionhealth.com/fhir/apps/referralids",
            data.identifier?.get(0)?.system
        )
        assertEquals("ret4421", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("2014-03-14", data.occurrencePeriod?.end?.value.toString())
        assertEquals(RequestPriority.ROUTINE, data.priority)
        assertEquals("For consideration of Grommets", data.reasonCode?.get(0)?.text)
        assertEquals("Dr Dave", data.recipient?.get(0)?.display)
        assertEquals(
            "https://fhir.orionhealth.com/blaze/fhir/Practitioner/76597",
            data.recipient?.get(0)?.reference
        )
        assertEquals("prior ReferralRequest", data.replaces?.get(0)?.display)
        assertEquals("Serena Shrink", data.requester?.agent?.display)
        assertEquals(
            "https://fhir.orionhealth.com/blaze/fhir/Practitioner/77272",
            data.requester?.agent?.reference
        )
        assertEquals("172676009", data.serviceRequested?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "Myringotomy and insertion of tympanic ventilation tube",
            data.serviceRequested?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.serviceRequested?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("Insertion of grommets", data.serviceRequested?.get(0)?.text)
        assertEquals("ent", data.specialty?.coding?.get(0)?.code)
        assertEquals("ENT", data.specialty?.coding?.get(0)?.display)
        assertEquals(
            "http://orionhealth.com/fhir/apps/specialties",
            data.specialty?.coding?.get(0)?.system
        )
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Beverly Weaver", data.subject?.display)
        assertEquals(
            "https://fhir.orionhealth.com/blaze/fhir/Patient/77662",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Referral to Dr Dave for Beverly weaver to have grommets inserted in her r) ear</div>",
            data.text?.div
        )
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("103696004", data.type?.coding?.get(0)?.code)
        assertEquals("Patient referral to specialist", data.type?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.type?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}


