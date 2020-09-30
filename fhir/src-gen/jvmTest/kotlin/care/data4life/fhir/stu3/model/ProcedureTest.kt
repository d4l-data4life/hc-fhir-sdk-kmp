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
import care.data4life.fhir.stu3.codesystem.EventStatus
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * ProcedureTest.java
 *
 * An action that is being or was performed on a patient.
 *
 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class ProcedureTest {

    val parser = FhirStu3Parser()


    @Test
    fun testProcedure1() {
        val sourceJson = loadAsString("procedure-example-f201-tpf.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "272676008")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Sphenoid bone")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.coding?.get(0)?.code, "367336001")
        assertEquals(data.code?.coding?.get(0)?.display, "Chemotherapy")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.display, "Roel's encounter on January 28th, 2013")
        assertEquals(data.context?.reference, "Encounter/f202")
        assertEquals(data.id, "f201")
        assertEquals(
            data.note?.get(0)?.text,
            "Eerste neo-adjuvante TPF-kuur bij groot proces in sphenoid met intracraniale uitbreiding."
        )
        assertEquals(data.performedPeriod?.end, "2013-01-28T14:27:00+01:00")
        assertEquals(data.performedPeriod?.start, "2013-01-28T13:31:00+01:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "Dokter Bronsig")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/f201")
        assertEquals(data.performer?.get(0)?.role?.coding?.get(0)?.code, "310512001")
        assertEquals(data.performer?.get(0)?.role?.coding?.get(0)?.display, "Medical oncologist")
        assertEquals(data.performer?.get(0)?.role?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.reasonCode?.get(0)?.text, "DiagnosticReport/f201")
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.display, "Roel")
        assertEquals(data.subject.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure2() {
        val sourceJson = loadAsString("procedure-example-ambulation.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.basedOn?.get(0)?.display, "Maternity care plan")
        assertEquals(data.basedOn?.get(0)?.reference, "CarePlan/preg")
        assertEquals(data.code?.coding?.get(0)?.code, "62013009")
        assertEquals(data.code?.coding?.get(0)?.display, "Ambulating patient (procedure)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Ambulation")
        assertEquals(data.definition?.get(0)?.display, "Protocol for hypertension during pregnancy")
        assertEquals(data.id, "ambulation")
        assertEquals(data.identifier?.get(0)?.value, "12345")
        assertEquals(
            data.location?.display,
            "Burgers University Medical Center, South Wing, second floor"
        )
        assertEquals(data.location?.reference, "Location/1")
        assertEquals(data.notDone, "True")
        assertEquals(data.notDoneReason?.coding?.get(0)?.code, "398254007")
        assertEquals(data.notDoneReason?.coding?.get(0)?.display, "  Pre-eclampsia (disorder)")
        assertEquals(data.notDoneReason?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.notDoneReason?.text, "Pre-eclampsia")
        assertEquals(data.performer?.get(0)?.actor?.display, "Carla Espinosa")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/f204")
        assertEquals(data.performer?.get(0)?.onBehalfOf?.display, "University Medical Hospital")
        assertEquals(data.performer?.get(0)?.onBehalfOf?.reference, "Organization/f001")
        assertEquals(data.reasonReference?.get(0)?.display, "Blood Pressure")
        assertEquals(data.reasonReference?.get(0)?.reference, "Observation/blood-pressure")
        assertEquals(data.status, EventStatus.SUSPENDED)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Ambulation procedure was not done</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure3() {
        val sourceJson = loadAsString("procedure-example-implant.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "25267002")
        assertEquals(
            data.code?.coding?.get(0)?.display,
            "Insertion of intracardiac pacemaker (procedure)"
        )
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Implant Pacemaker")
        assertEquals(data.focalDevice?.get(0)?.action?.coding?.get(0)?.code, "implanted")
        assertEquals(
            data.focalDevice?.get(0)?.action?.coding?.get(0)?.system,
            "http://hl7.org/fhir/device-action"
        )
        assertEquals(data.focalDevice?.get(0)?.manipulated?.reference, "Device/example-pacemaker")
        assertEquals(data.followUp?.get(0)?.text, "ROS 5 days  - 2013-04-10")
        assertEquals(data.id, "example-implant")
        assertEquals(
            data.note?.get(0)?.text,
            "Routine Appendectomy. Appendix was inflamed and in retro-caecal position"
        )
        assertEquals(data.performedDateTime, "2015-04-05")
        assertEquals(data.performer?.get(0)?.actor?.display, "Dr Cecil Surgeon")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/example")
        assertEquals(data.reasonCode?.get(0)?.text, "Bradycardia")
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure4() {
        val sourceJson = loadAsString("procedure-example-colon-biopsy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "76164006")
        assertEquals(data.code?.coding?.get(0)?.display, "Biopsy of colon (procedure)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Biopsy of colon")
        assertEquals(data.id, "colon-biopsy")
        assertEquals(data.identifier?.get(0)?.value, "12345")
        assertEquals(
            data.location?.display,
            "Burgers University Medical Center, South Wing, second floor"
        )
        assertEquals(data.location?.reference, "Location/1")
        assertEquals(data.notDone, "False")
        assertEquals(data.partOf?.get(0)?.display, "Colonoscopy")
        assertEquals(data.partOf?.get(0)?.reference, "Procedure/colonoscopy")
        assertEquals(data.performer?.get(0)?.actor?.display, "Dr Adam Careful")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/example")
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Biopsy of colon, which was part of colonoscopy</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure5() {
        val sourceJson = loadAsString("procedure-example-f004-tracheotomy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "83030008")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Retropharyngeal area")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.coding?.get(0)?.code, "48387007")
        assertEquals(data.code?.coding?.get(0)?.display, "Tracheotomy")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.reference, "Encounter/f003")
        assertEquals(data.followUp?.get(0)?.text, "described in care plan")
        assertEquals(data.id, "f004")
        assertEquals(data.outcome?.text, "removal of the retropharyngeal abscess")
        assertEquals(data.performedPeriod?.end, "2013-03-22T10:30:10+01:00")
        assertEquals(data.performedPeriod?.start, "2013-03-22T09:30:10+01:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "A. Langeveld")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/f005")
        assertEquals(data.performer?.get(0)?.role?.coding?.get(0)?.code, "01.000")
        assertEquals(data.performer?.get(0)?.role?.coding?.get(0)?.display, "Arts")
        assertEquals(
            data.performer?.get(0)?.role?.coding?.get(0)?.system,
            "urn:oid:2.16.840.1.113883.2.4.15.111"
        )
        assertEquals(data.performer?.get(0)?.role?.text, "Care role")
        assertEquals(data.reasonCode?.get(0)?.text, "ensure breathing during surgery")
        assertEquals(data.report?.get(0)?.display, "???????????")
        assertEquals(data.report?.get(0)?.reference, "DiagnosticReport/f001")
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.display, "P. van de Heuvel")
        assertEquals(data.subject.reference, "Patient/f001")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure6() {
        val sourceJson = loadAsString("procedure-example-education.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.basedOn?.get(0)?.display, "Order for health education")
        assertEquals(data.basedOn?.get(0)?.reference, "ProcedureRequest/education")
        assertEquals(data.category?.coding?.get(0)?.code, "311401005")
        assertEquals(data.category?.coding?.get(0)?.display, "Patient education (procedure)")
        assertEquals(data.category?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.text, "Education")
        assertEquals(data.code?.coding?.get(0)?.code, "48023004")
        assertEquals(
            data.code?.coding?.get(0)?.display,
            "Breast self-examination technique education (procedure)"
        )
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Health education - breast examination")
        assertEquals(data.id, "education")
        assertEquals(data.location?.display, "Southside Community Health Center")
        assertEquals(data.performedDateTime, "2014-08-16")
        assertEquals(data.performer?.get(0)?.actor?.display, "Pamela Educator, RN")
        assertEquals(data.reasonCode?.get(0)?.text, "early detection of breast mass")
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.display, "Jane Doe")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Health education - breast examination for early detection of breast mass</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure7() {
        val sourceJson = loadAsString("procedure-example-colonoscopy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "73761001")
        assertEquals(data.code?.coding?.get(0)?.display, "Colonoscopy (procedure)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Colonoscopy")
        assertEquals(data.complicationDetail?.get(0)?.display, "Perforated intestine condition")
        assertEquals(data.id, "colonoscopy")
        assertEquals(data.identifier?.get(0)?.value, "12345")
        assertEquals(
            data.location?.display,
            "Burgers University Medical Center, South Wing, second floor"
        )
        assertEquals(data.location?.reference, "Location/1")
        assertEquals(data.notDone, "False")
        assertEquals(data.performer?.get(0)?.actor?.display, "Dr Adam Careful")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/example")
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Colonoscopy with complication</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)
        assertEquals(data.usedReference?.get(0)?.display, "Colonoscope device")

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure8() {
        val sourceJson = loadAsString("procedure-example-physical-therapy.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(
            data.basedOn?.get(0)?.display,
            "Order for the assessment of passive range of motion"
        )
        assertEquals(data.basedOn?.get(0)?.reference, "ProcedureRequest/physical-therapy")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "36701003")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Both knees (body structure)")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.bodySite?.get(0)?.text, "Both knees")
        assertEquals(data.category?.coding?.get(0)?.code, "386053000")
        assertEquals(data.category?.coding?.get(0)?.display, "Evaluation procedure (procedure)")
        assertEquals(data.category?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.category?.text, "Evaluation")
        assertEquals(data.code?.coding?.get(0)?.code, "710830005")
        assertEquals(
            data.code?.coding?.get(0)?.display,
            "Assessment of passive range of motion (procedure)"
        )
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Assessment of passive range of motion")
        assertEquals(data.id, "physical-therapy")
        assertEquals(data.location?.display, "Sawbones Orthopedic Clinic")
        assertEquals(data.performedDateTime, "2016-09-27")
        assertEquals(data.performer?.get(0)?.actor?.display, "Paul Therapist, PT")
        assertEquals(
            data.reasonCode?.get(0)?.text,
            "assessment of mobility limitations due to osteoarthritis"
        )
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Assessment of passive range of motion for both knees on Sept 27, 2016 due to osteoarthritis</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure9() {
        val sourceJson = loadAsString("procedure-example-f003-abscess.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.code, "83030008")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.display, "Retropharyngeal area")
        assertEquals(data.bodySite?.get(0)?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.coding?.get(0)?.code, "172960003")
        assertEquals(data.code?.coding?.get(0)?.display, "Incision of retropharyngeal abscess")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.context?.reference, "Encounter/f003")
        assertEquals(data.followUp?.get(0)?.text, "described in care plan")
        assertEquals(data.id, "f003")
        assertEquals(data.outcome?.text, "removal of the retropharyngeal abscess")
        assertEquals(data.performedPeriod?.end, "2013-03-24T10:30:10+01:00")
        assertEquals(data.performedPeriod?.start, "2013-03-24T09:30:10+01:00")
        assertEquals(data.performer?.get(0)?.actor?.display, "E.M.J.M. van den broek")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/f001")
        assertEquals(data.performer?.get(0)?.role?.coding?.get(0)?.code, "01.000")
        assertEquals(data.performer?.get(0)?.role?.coding?.get(0)?.display, "Arts")
        assertEquals(
            data.performer?.get(0)?.role?.coding?.get(0)?.system,
            "urn:oid:2.16.840.1.113883.2.4.15.111"
        )
        assertEquals(data.performer?.get(0)?.role?.text, "Care role")
        assertEquals(data.reasonCode?.get(0)?.text, "abcess in retropharyngeal area")
        assertEquals(data.report?.get(0)?.display, "Lab results blood test")
        assertEquals(data.report?.get(0)?.reference, "DiagnosticReport/f001")
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.display, "P. van de Heuvel")
        assertEquals(data.subject.reference, "Patient/f001")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testProcedure10() {
        val sourceJson = loadAsString("procedure-example.json")

        val data = parser.toFhir(Procedure::class, sourceJson)


        assertEquals(data.code?.coding?.get(0)?.code, "80146002")
        assertEquals(data.code?.coding?.get(0)?.display, "Appendectomy (Procedure)")
        assertEquals(data.code?.coding?.get(0)?.system, "http://snomed.info/sct")
        assertEquals(data.code?.text, "Appendectomy")
        assertEquals(data.followUp?.get(0)?.text, "ROS 5 days  - 2013-04-10")
        assertEquals(data.id, "example")
        assertEquals(
            data.note?.get(0)?.text,
            "Routine Appendectomy. Appendix was inflamed and in retro-caecal position"
        )
        assertEquals(data.performedDateTime, "2013-04-05")
        assertEquals(data.performer?.get(0)?.actor?.display, "Dr Cecil Surgeon")
        assertEquals(data.performer?.get(0)?.actor?.reference, "Practitioner/example")
        assertEquals(
            data.reasonCode?.get(0)?.text,
            "Generalized abdominal pain 24 hours. Localized in RIF with rebound and guarding"
        )
        assertEquals(data.status, EventStatus.COMPLETED)
        assertEquals(data.subject.reference, "Patient/example")
        assertEquals(
            data.text?.div,
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Routine Appendectomy</div>"
        )
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


