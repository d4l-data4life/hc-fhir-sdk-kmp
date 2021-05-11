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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * ServiceRequestTest.java
 *
 * A request for a service to be performed.
 *
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 4.0.1-9346c8cc45")
class ServiceRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testServiceRequest1() {
        val sourceJson = loadAsString("r4/servicerequest-example2.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("as needed to clear mucus", data.asNeededCodeableConcept?.text)
        assertEquals("2017-02-01T17:23:07Z", data.authoredOn?.value.toString(),)
        assertEquals("CarePlan/gpvisit", data.basedOn?.get(0)?.reference)
        assertEquals("34431008", data.code?.coding?.get(0)?.code)
        assertEquals("Physiotherapy of chest (regime/therapy) ", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("signature", data.contained?.get(0)?.id)
        assertEquals("cystic-fibrosis", data.contained?.get(1)?.id)
        assertEquals("physiotherapy", data.id)
        assertEquals("http://goodhealth.org/placer-ids", data.identifier?.get(0)?.system)
        assertEquals("PLAC", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals("Placer Identifier", data.identifier?.get(0)?.type?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v2-0203", data.identifier?.get(0)?.type?.coding?.get(0)?.system)
        assertEquals("Placer", data.identifier?.get(0)?.type?.text)
        assertEquals("20170201-0001", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("15".toDouble(), data.occurrenceTiming?.repeat?.duration?.value)
        assertEquals("25".toDouble(), data.occurrenceTiming?.repeat?.durationMax?.value)
        assertEquals("min", data.occurrenceTiming?.repeat?.durationUnit)
        assertEquals("1".toLong(), data.occurrenceTiming?.repeat?.frequency?.value)
        assertEquals("4".toLong(), data.occurrenceTiming?.repeat?.frequencyMax?.value)
        assertEquals("1".toDouble(), data.occurrenceTiming?.repeat?.period?.value)
        assertEquals("d", data.occurrenceTiming?.repeat?.periodUnit)
        assertEquals("#cystic-fibrosis", data.reasonReference?.get(0)?.reference)
        assertEquals("Author's Signature", data.relevantHistory?.get(0)?.display)
        assertEquals("#signature", data.relevantHistory?.get(0)?.reference)
        assertEquals("Dr Adam Careful", data.requester?.display)
        assertEquals("Practitioner/example", data.requester?.reference)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest2() {
        val sourceJson = loadAsString("r4/servicerequest-example3.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("2017-02-01T17:23:07Z", data.authoredOn?.value.toString(),)
        assertEquals("359962006", data.code?.coding?.get(0)?.code)
        assertEquals("Turning patient in bed (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("True".toBoolean(), data.doNotPerform?.value)
        assertEquals("do-not-turn", data.id)
        assertEquals("http://goodhealth.org/placer-ids", data.identifier?.get(0)?.system)
        assertEquals("20170201-0002", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(RequestPriority.STAT, data.priority)
        assertEquals("Patient has a spinal fracture", data.reasonReference?.get(0)?.display)
        assertEquals("Dr Adam Careful", data.requester?.display)
        assertEquals("Practitioner/example", data.requester?.reference)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest3() {
        val sourceJson = loadAsString("r4/servicerequest-example-lipid.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("LIPID", data.code?.coding?.get(0)?.code)
        assertEquals("http://acme.org/tests", data.code?.coding?.get(0)?.system)
        assertEquals("Lipid Panel", data.code?.text)
        assertEquals("fasting", data.contained?.get(0)?.id)
        assertEquals("serum", data.contained?.get(1)?.id)
        assertEquals("Encounter/example", data.encounter?.reference)
        assertEquals("lipid", data.id)
        assertEquals("urn:oid:1.3.4.5.6.7", data.identifier?.get(0)?.system)
        assertEquals("PLAC", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/v2-0203", data.identifier?.get(0)?.type?.coding?.get(0)?.system)
        assertEquals("Placer", data.identifier?.get(0)?.type?.text)
        assertEquals("2345234234234", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORIGINAL_ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("patient is afraid of needles", data.note?.get(0)?.text)
        assertEquals("2013-05-02T16:16:00-07:00", data.occurrenceDateTime?.value.toString(),)
        assertEquals("Practitioner/f202", data.performer?.get(0)?.reference)
        assertEquals("V173", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Fam hx-ischem heart dis", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://hl7.org/fhir/sid/icd-9", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals("Practitioner/example", data.requester?.reference)
        assertEquals("Serum specimen", data.specimen?.get(0)?.display)
        assertEquals("#serum", data.specimen?.get(0)?.reference)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("Fasting status", data.supportingInfo?.get(0)?.display)
        assertEquals("#fasting", data.supportingInfo?.get(0)?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest4() {
        val sourceJson = loadAsString("r4/servicerequest-example-colonoscopy-bx.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("2017-03-05", data.authoredOn?.value.toString(),)
        assertEquals("76164006", data.code?.coding?.get(0)?.code)
        assertEquals("Biopsy of colon (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Biopsy of colon", data.code?.text)
        assertEquals("colon-biopsy", data.id)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Dr Adam Careful", data.performer?.get(0)?.display)
        assertEquals("Practitioner/example", data.performer?.get(0)?.reference)
        assertEquals("Dr. Beverly Crusher", data.requester?.display)
        assertEquals("Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809", data.requester?.reference)
        assertEquals("http://bumc.org/requisitions", data.requisition?.system)
        assertEquals("req12345", data.requisition?.value)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest5() {
        val sourceJson = loadAsString("r4/servicerequest-example4.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("229115003", data.code?.coding?.get(0)?.code)
        assertEquals("Bench Press (regime/therapy) ", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("benchpress", data.id)
        assertEquals(RequestIntent.PLAN, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("20".toLong(), data.occurrenceTiming?.repeat?.count?.value)
        assertEquals("30".toLong(), data.occurrenceTiming?.repeat?.countMax?.value)
        assertEquals("3".toLong(), data.occurrenceTiming?.repeat?.frequency?.value)
        assertEquals("1".toDouble(), data.occurrenceTiming?.repeat?.period?.value)
        assertEquals("wk", data.occurrenceTiming?.repeat?.periodUnit)
        assertEquals("Start with 30kg 10-15 repetitions for three sets and increase in increments of 5kg when you feel ready", data.patientInstruction)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest6() {
        val sourceJson = loadAsString("r4/servicerequest-example-edu.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("2016-08-16", data.authoredOn?.value.toString(),)
        assertEquals("311401005", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Patient education (procedure)", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Education", data.category?.get(0)?.text)
        assertEquals("48023004", data.code?.coding?.get(0)?.code)
        assertEquals("Breast self-examination technique education (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Health education - breast examination", data.code?.text)
        assertEquals("education", data.id)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2014-08-16", data.occurrenceDateTime?.value.toString(),)
        assertEquals("Pamela Educator, RN", data.performer?.get(0)?.display)
        assertEquals("early detection of breast mass", data.reasonCode?.get(0)?.text)
        assertEquals("Angela Care, MD", data.requester?.display)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Jane Doe", data.subject?.display)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest7() {
        val sourceJson = loadAsString("r4/servicerequest-example-ventilation.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("2018-02-20", data.authoredOn?.value.toString(),)
        assertEquals("40617009", data.code?.coding?.get(0)?.code)
        assertEquals("Artificial respiration (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Mechanical Ventilation", data.code?.text)
        assertEquals("vent", data.id)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("243144002", data.orderDetail?.get(0)?.coding?.get(0)?.code)
        assertEquals("Patient triggered inspiratory assistance (procedure)", data.orderDetail?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.orderDetail?.get(0)?.coding?.get(0)?.system)
        assertEquals("IPPB", data.orderDetail?.get(0)?.text)
        assertEquals(" Initial Settings : Sens: -1 cm H20 Pressure 15 cm H2O moderate flow:  Monitor VS every 15 minutes x 4 at the start of mechanical ventilation, then routine for unit OR every 5 hr", data.orderDetail?.get(1)?.text)
        assertEquals("Dr Cecil Surgeon", data.performer?.get(0)?.display)
        assertEquals("Practitioner/example", data.performer?.get(0)?.reference)
        assertEquals("chronic obstructive lung disease (COLD)", data.reasonCode?.get(0)?.text)
        assertEquals("Dr. Beverly Crusher", data.requester?.display)
        assertEquals("Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809", data.requester?.reference)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest8() {
        val sourceJson = loadAsString("r4/servicerequest-example-ambulation.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("2017-03-05", data.authoredOn?.value.toString(),)
        assertEquals("Maternity care plan", data.basedOn?.get(0)?.display)
        assertEquals("CarePlan/preg", data.basedOn?.get(0)?.reference)
        assertEquals("62013009", data.code?.coding?.get(0)?.code)
        assertEquals("Ambulating patient (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Ambulation", data.code?.text)
        assertEquals("ambulation", data.id)
        assertEquals("45678", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Blood Pressure", data.reasonReference?.get(0)?.display)
        assertEquals("Observation/blood-pressure", data.reasonReference?.get(0)?.reference)
        assertEquals("Dr. Beverly Crusher", data.requester?.display)
        assertEquals("Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809", data.requester?.reference)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest9() {
        val sourceJson = loadAsString("r4/servicerequest-example-pt.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("2016-09-20", data.authoredOn?.value.toString(),)
        assertEquals("36701003", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Both knees (body structure)", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("Both knees", data.bodySite?.get(0)?.text)
        assertEquals("386053000", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals("Evaluation procedure (procedure)", data.category?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Evaluation", data.category?.get(0)?.text)
        assertEquals("710830005", data.code?.coding?.get(0)?.code)
        assertEquals("Assessment of passive range of motion (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Assessment of passive range of motion", data.code?.text)
        assertEquals("physical-therapy", data.id)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2016-09-27", data.occurrenceDateTime?.value.toString(),)
        assertEquals("Paul Therapist, PT", data.performer?.get(0)?.display)
        assertEquals("assessment of mobility limitations due to osteoarthritis", data.reasonCode?.get(0)?.text)
        assertEquals("Ollie Ortho, MD", data.requester?.display)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testServiceRequest10() {
        val sourceJson = loadAsString("r4/servicerequest-example-di.json")

        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        assertEquals("24627-2", data.code?.coding?.get(0)?.code)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Chest CT", data.code?.text)
        assertEquals("di", data.id)
        assertEquals(RequestIntent.ORIGINAL_ORDER, data.intent)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2013-05-08T09:33:27+07:00", data.occurrenceDateTime?.value.toString(),)
        assertEquals("Check for metastatic disease", data.reasonCode?.get(0)?.text)
        assertEquals("Dr. Adam Careful", data.requester?.display)
        assertEquals("Practitioner/example", data.requester?.reference)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/dicom", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
