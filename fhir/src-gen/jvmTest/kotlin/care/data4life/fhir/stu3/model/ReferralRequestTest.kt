/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model


import care.data4life.fhir.stu3.FhirStu3Parser
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.stu3.codesystem.RequestIntent
import care.data4life.fhir.stu3.codesystem.RequestPriority
import care.data4life.fhir.stu3.codesystem.RequestStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
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
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class ReferralRequestTest {

    val parser = FhirStu3Parser()


    @Test
    fun testReferralRequest1() {
        val sourceJson = loadAsString("referralrequest-example.json")

        val data = parser.toFhir(ReferralRequest::class, sourceJson)


        assertEquals(data.authoredOn, "2014-02-14")
        assertEquals(
			data.basedOn?.get(0)?.display,
			"ProcedureRequest for Myringotomy and insertion of tympanic ventilation tube"
		)
        assertEquals(data.context?.display, "Beverly Waver's encounter on 2014-02-14")
        assertEquals(
			data.definition?.get(0)?.display,
			"Protocol for insertion of tympanic ventilation tube"
		)
        assertEquals(
			data.description,
			"In the past 2 years Beverly has had 6 instances of r) sided Otitis media. She is     falling behind her peers at school, and displaying some learning difficulties."
		)
        assertEquals(data.groupIdentifier?.value, "1234")
        assertEquals(data.id, "example")
        assertEquals(
			data.identifier?.get(0)?.system,
			"http://orionhealth.com/fhir/apps/referralids"
		)
        assertEquals(data.identifier?.get(0)?.value, "ret4421")
        assertEquals(data.intent, RequestIntent.ORDER)
        assertEquals(data.occurrencePeriod?.end, "2014-03-14")
        assertEquals(data.priority, RequestPriority.ROUTINE)
        assertEquals(data.reasonCode?.get(0)?.text, "For consideration of Grommets")
        assertEquals(data.recipient?.get(0)?.display, "Dr Dave")
        assertEquals(
			data.recipient?.get(0)?.reference,
			"https://fhir.orionhealth.com/blaze/fhir/Practitioner/76597"
		)
        assertEquals(data.replaces?.get(0)?.display, "prior ReferralRequest")
        assertEquals(data.requester?.agent?.display, "Serena Shrink")
        assertEquals(
			data.requester?.agent?.reference,
			"https://fhir.orionhealth.com/blaze/fhir/Practitioner/77272"
		)
        assertEquals(data.serviceRequested?.get(0)?.coding?.get(0)?.code, "172676009")
        assertEquals(
			data.serviceRequested?.get(0)?.coding?.get(0)?.display,
			"Myringotomy and insertion of tympanic ventilation tube"
		)
        assertEquals(
			data.serviceRequested?.get(0)?.coding?.get(0)?.system,
			"http://snomed.info/sct"
		)
        assertEquals(data.serviceRequested?.get(0)?.text, "Insertion of grommets")
        assertEquals(data.specialty?.coding?.get(0)?.code, "ent")
        assertEquals(data.specialty?.coding?.get(0)?.display, "ENT")
        assertEquals(
			data.specialty?.coding?.get(0)?.system,
			"http://orionhealth.com/fhir/apps/specialties"
		)
        assertEquals(data.status, RequestStatus.ACTIVE)
        assertEquals(data.subject.display, "Beverly Weaver")
        assertEquals(
			data.subject.reference,
			"https://fhir.orionhealth.com/blaze/fhir/Patient/77662"
		)
        assertEquals(
			data.text?.div,
			"<div xmlns=\"http://www.w3.org/1999/xhtml\">Referral to Dr Dave for Beverly weaver to have grommets inserted in her r) ear</div>"
		)
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.type?.coding?.get(0)?.code, "103696004")
        assertEquals(data.type?.coding?.get(0)?.display, "Patient referral to specialist")
        assertEquals(data.type?.coding?.get(0)?.system, "http://snomed.info/sct")

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


