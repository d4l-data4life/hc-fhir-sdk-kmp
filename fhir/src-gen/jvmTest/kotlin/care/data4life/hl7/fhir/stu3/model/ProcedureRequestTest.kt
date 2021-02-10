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
 * ProcedureRequestTest.java
 *
 * A request for a procedure or diagnostic to be performed.
 *
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 3.0.1.11917")
class ProcedureRequestTest {

    val parser = FhirStu3Parser()


    @Test
    fun testProcedureRequest1() {
        val sourceJson = loadAsString("stu3/procedurerequest-example-lipid.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("LIPID", data.code?.coding?.get(0)?.code)
        assertEquals("http://acme.org/tests", data.code?.coding?.get(0)?.system)
        assertEquals("Lipid Panel", data.code?.text)
        assertEquals("fasting", data.contained?.get(0)?.id)
        assertEquals("serum", data.contained?.get(1)?.id)
        assertEquals("Encounter/example", data.context?.reference)
        assertEquals("lipid", data.id)
        assertEquals("urn:oid:1.3.4.5.6.7", data.identifier?.get(0)?.system)
        assertEquals("PLAC", data.identifier?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals(
            "http://hl7.org/fhir/identifier-type",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals("Placer", data.identifier?.get(0)?.type?.text)
        assertEquals("2345234234234", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORIGINAL_ORDER, data.intent)
        assertEquals("patient is afraid of needles", data.note?.get(0)?.text)
        assertEquals("2013-05-02T16:16:00-07:00", data.occurrenceDateTime?.value.toString())
        assertEquals("Practitioner/f202", data.performer?.reference)
        assertEquals("V173", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Fam hx-ischem heart dis", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals(
            "http://hl7.org/fhir/sid/icd-9",
            data.reasonCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals("Practitioner/example", data.requester?.agent?.reference)
        assertEquals("Organization/f001", data.requester?.onBehalfOf?.reference)
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
    fun testProcedureRequest2() {
        val sourceJson = loadAsString("stu3/procedurerequest-example4.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("229115003", data.code?.coding?.get(0)?.code)
        assertEquals("Bench Press (regime/therapy) ", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("benchpress", data.id)
        assertEquals(RequestIntent.PLAN, data.intent)
        assertEquals(
            "Start with 30kg and increase in increments of 5kg when you feel ready",
            data.note?.get(0)?.text
        )
        assertEquals("20".toInt(), data.occurrenceTiming?.repeat?.count?.value)
        assertEquals("30".toInt(), data.occurrenceTiming?.repeat?.countMax?.value)
        assertEquals("3".toInt(), data.occurrenceTiming?.repeat?.frequency?.value)
        assertEquals("1".toDouble(), data.occurrenceTiming?.repeat?.period?.value)
        assertEquals("wk", data.occurrenceTiming?.repeat?.periodUnit)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest3() {
        val sourceJson = loadAsString("stu3/procedurerequest-example-edu.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("2016-08-16", data.authoredOn?.value.toString())
        assertEquals("311401005", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "Patient education (procedure)",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Education", data.category?.get(0)?.text)
        assertEquals("48023004", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Breast self-examination technique education (procedure)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Health education - breast examination", data.code?.text)
        assertEquals("education", data.id)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("2014-08-16", data.occurrenceDateTime?.value.toString())
        assertEquals("Pamela Educator, RN", data.performer?.display)
        assertEquals("early detection of breast mass", data.reasonCode?.get(0)?.text)
        assertEquals("Angela Care, MD", data.requester?.agent?.display)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Jane Doe", data.subject?.display)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest4() {
        val sourceJson = loadAsString("stu3/procedurerequest-example-pt.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("2016-09-20", data.authoredOn?.value.toString())
        assertEquals("36701003", data.bodySite?.get(0)?.coding?.get(0)?.code)
        assertEquals("Both knees (body structure)", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.bodySite?.get(0)?.coding?.get(0)?.system)
        assertEquals("Both knees", data.bodySite?.get(0)?.text)
        assertEquals("386053000", data.category?.get(0)?.coding?.get(0)?.code)
        assertEquals(
            "Evaluation procedure (procedure)",
            data.category?.get(0)?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.category?.get(0)?.coding?.get(0)?.system)
        assertEquals("Evaluation", data.category?.get(0)?.text)
        assertEquals("710830005", data.code?.coding?.get(0)?.code)
        assertEquals(
            "Assessment of passive range of motion (procedure)",
            data.code?.coding?.get(0)?.display
        )
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Assessment of passive range of motion", data.code?.text)
        assertEquals("physical-therapy", data.id)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("2016-09-27", data.occurrenceDateTime?.value.toString())
        assertEquals("Paul Therapist, PT", data.performer?.display)
        assertEquals(
            "assessment of mobility limitations due to osteoarthritis",
            data.reasonCode?.get(0)?.text
        )
        assertEquals("Ollie Ortho, MD", data.requester?.agent?.display)
        assertEquals("Sawbones Orthopedic Clinic", data.requester?.onBehalfOf?.display)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest5() {
        val sourceJson = loadAsString("stu3/procedurerequest-genetics-example-1.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("49874-1", data.code?.coding?.get(0)?.code)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("ABCB4 gene mutation analysis", data.code?.text)
        assertEquals("Encounter/example", data.context?.reference)
        assertEquals("og-example1", data.id)
        assertEquals(RequestIntent.ORIGINAL_ORDER, data.intent)
        assertEquals("2014-05-12T16:16:00-07:00", data.occurrenceDateTime?.value.toString())
        assertEquals("Practitioner/example", data.performer?.reference)
        assertEquals("Practitioner/example", data.requester?.agent?.reference)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest6() {
        val sourceJson = loadAsString("stu3/procedurerequest-example-di.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("24627-2", data.code?.coding?.get(0)?.code)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Chest CT", data.code?.text)
        assertEquals("di", data.id)
        assertEquals(RequestIntent.ORIGINAL_ORDER, data.intent)
        assertEquals("2013-05-08T09:33:27+07:00", data.occurrenceDateTime?.value.toString())
        assertEquals("Check for metastatic disease", data.reasonCode?.get(0)?.text)
        assertEquals("Dr. Adam Careful", data.requester?.agent?.display)
        assertEquals("Practitioner/example", data.requester?.agent?.reference)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/dicom", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest7() {
        val sourceJson = loadAsString("stu3/procedurerequest-example-subrequest.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("Original Request", data.basedOn?.get(0)?.display)
        assertEquals("Right arm", data.bodySite?.get(0)?.coding?.get(0)?.display)
        assertEquals("Right arm", data.bodySite?.get(0)?.text)
        assertEquals("35542-0", data.code?.coding?.get(0)?.code)
        assertEquals("http://loinc.org", data.code?.coding?.get(0)?.system)
        assertEquals("Peanut IgG", data.code?.text)
        assertEquals("Protocol for alergies", data.definition?.get(0)?.display)
        assertEquals("subrequest", data.id)
        assertEquals(RequestIntent.INSTANCE_ORDER, data.intent)
        assertEquals("2013-05-08T09:33:27+07:00", data.occurrenceDateTime?.value.toString())
        assertEquals("Qualified nurse", data.performerType?.coding?.get(0)?.display)
        assertEquals("Nurse", data.performerType?.text)
        assertEquals(RequestPriority.ROUTINE, data.priority)
        assertEquals("Check for Peanut Allergy", data.reasonCode?.get(0)?.text)
        assertEquals("Previous allergy test", data.replaces?.get(0)?.display)
        assertEquals("Dr. Adam Careful", data.requester?.agent?.display)
        assertEquals("Practitioner/example", data.requester?.agent?.reference)
        assertEquals("A13848392", data.requisition?.value)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/dicom", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest8() {
        val sourceJson = loadAsString("stu3/procedurerequest-example2.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("as needed to clear mucus", data.asNeededCodeableConcept?.text)
        assertEquals("2017-02-01T17:23:07Z", data.authoredOn?.value.toString())
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
        assertEquals(
            "http://hl7.org/fhir/identifier-type",
            data.identifier?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals("Placer", data.identifier?.get(0)?.type?.text)
        assertEquals("20170201-0001", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("15".toDouble(), data.occurrenceTiming?.repeat?.duration?.value)
        assertEquals("25".toDouble(), data.occurrenceTiming?.repeat?.durationMax?.value)
        assertEquals("min", data.occurrenceTiming?.repeat?.durationUnit)
        assertEquals("1".toInt(), data.occurrenceTiming?.repeat?.frequency?.value)
        assertEquals("4".toInt(), data.occurrenceTiming?.repeat?.frequencyMax?.value)
        assertEquals("1".toDouble(), data.occurrenceTiming?.repeat?.period?.value)
        assertEquals("d", data.occurrenceTiming?.repeat?.periodUnit)
        assertEquals("#cystic-fibrosis", data.reasonReference?.get(0)?.reference)
        assertEquals("Author's Signature", data.relevantHistory?.get(0)?.display)
        assertEquals("#signature", data.relevantHistory?.get(0)?.reference)
        assertEquals("Dr Adam Careful", data.requester?.agent?.display)
        assertEquals("Practitioner/example", data.requester?.agent?.reference)
        assertEquals("Good Health Clinic", data.requester?.onBehalfOf?.display)
        assertEquals("Organization/2", data.requester?.onBehalfOf?.reference)
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest9() {
        val sourceJson = loadAsString("stu3/procedurerequest-example3.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("2017-02-01T17:23:07Z", data.authoredOn?.value.toString())
        assertEquals("359962006", data.code?.coding?.get(0)?.code)
        assertEquals("Turning patient in bed (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("True".toBoolean(), data.doNotPerform?.value)
        assertEquals("do-not-turn", data.id)
        assertEquals("http://goodhealth.org/placer-ids", data.identifier?.get(0)?.system)
        assertEquals("20170201-0002", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals(RequestPriority.STAT, data.priority)
        assertEquals("Patient has a spinal fracture", data.reasonReference?.get(0)?.display)
        assertEquals("Dr Adam Careful", data.requester?.agent?.display)
        assertEquals("Practitioner/example", data.requester?.agent?.reference)
        assertEquals(RequestStatus.ACTIVE, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testProcedureRequest10() {
        val sourceJson = loadAsString("stu3/procedurerequest-example-ambulation.json")

        val data = parser.toFhir(ProcedureRequest::class, sourceJson)


        assertEquals("2017-03-05", data.authoredOn?.value.toString())
        assertEquals("Maternity care plan", data.basedOn?.get(0)?.display)
        assertEquals("CarePlan/preg", data.basedOn?.get(0)?.reference)
        assertEquals("62013009", data.code?.coding?.get(0)?.code)
        assertEquals("Ambulating patient (procedure)", data.code?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.code?.coding?.get(0)?.system)
        assertEquals("Ambulation", data.code?.text)
        assertEquals("Protocol for hypertension during pregnancy", data.definition?.get(0)?.display)
        assertEquals("ambulation", data.id)
        assertEquals("45678", data.identifier?.get(0)?.value)
        assertEquals(RequestIntent.ORDER, data.intent)
        assertEquals("Blood Pressure", data.reasonReference?.get(0)?.display)
        assertEquals("Observation/blood-pressure", data.reasonReference?.get(0)?.reference)
        assertEquals("Dr. Beverly Crusher", data.requester?.agent?.display)
        assertEquals(
            "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809",
            data.requester?.agent?.reference
        )
        assertEquals(RequestStatus.COMPLETED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}


