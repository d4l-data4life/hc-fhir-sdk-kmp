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
import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ProcedureTest.java
 *
 * An action that is being or was performed on a patient
 *
 * An action that is or was performed on or for a patient. This can be a physical intervention like an
 * operation, or less invasive like long term services, counseling, or hypnotherapy.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ProcedureTest {

    val parser = FhirR4Parser()

    @Test
    fun testProcedure01() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-f201-tpf.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure01Step01(data: Procedure) {

        assertEquals(
            expected = "272676008",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Sphenoid bone",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "367336001",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Chemotherapy",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Roel's encounter on January 28th, 2013",
            actual = data.encounter?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/f202",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "PlanDefinition/KDN5",
            actual = data.instantiatesCanonical?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Eerste neo-adjuvante TPF-kuur bij groot proces in sphenoid met intracraniale uitbreiding.",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2013-01-28T14:27:00+01:00",
            actual = data.performedPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-01-28T13:31:00+01:00",
            actual = data.performedPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Dokter Bronsig",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f201",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "310512001",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Medical oncologist",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport/f201",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure02() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-ambulation.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure02Step01(data: Procedure) {

        assertEquals(
            expected = "Maternity care plan",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CarePlan/preg",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "62013009",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Ambulating patient (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Ambulation",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ambulation",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/protocol-for-hypertension-during-pregnancy",
            actual = data.instantiatesUri?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Burgers University Medical Center, South Wing, second floor",
            actual = data.location?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Carla Espinosa",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f204",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "University Medical Hospital",
            actual = data.performer?.get(0)?.onBehalfOf?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.performer?.get(0)?.onBehalfOf?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Blood Pressure",
            actual = data.reasonReference?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Observation/blood-pressure",
            actual = data.reasonReference?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.NOT_DONE,
            actual = data.status
        )

        assertEquals(
            expected = "398254007",
            actual = data.statusReason?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "  Pre-eclampsia (disorder)",
            actual = data.statusReason?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.statusReason?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Pre-eclampsia",
            actual = data.statusReason?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Ambulation procedure was not done</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure03() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-implant.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure03Step01(data: Procedure) {

        assertEquals(
            expected = "25267002",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Insertion of intracardiac pacemaker (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Implant Pacemaker",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "implanted",
            actual = data.focalDevice?.get(0)?.action?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/device-action",
            actual = data.focalDevice?.get(0)?.action?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Device/example-pacemaker",
            actual = data.focalDevice?.get(0)?.manipulated?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ROS 5 days  - 2013-04-10",
            actual = data.followUp?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example-implant",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Routine Appendectomy. Appendix was inflamed and in retro-caecal position",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-04-05",
            actual = data.performedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Dr Cecil Surgeon",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Bradycardia",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure04() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-colon-biopsy.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure04Step01(data: Procedure) {

        assertEquals(
            expected = "76164006",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Biopsy of colon (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Biopsy of colon",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "colon-biopsy",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Burgers University Medical Center, South Wing, second floor",
            actual = data.location?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Colonoscopy",
            actual = data.partOf?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Procedure/colonoscopy",
            actual = data.partOf?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Biopsy of colon, which was part of colonoscopy</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure05() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-f004-tracheotomy.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure05Step01(data: Procedure) {

        assertEquals(
            expected = "83030008",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Retropharyngeal area",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "48387007",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Tracheotomy",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/f003",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "described in care plan",
            actual = data.followUp?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f004",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "removal of the retropharyngeal abscess",
            actual = data.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2013-03-22T10:30:10+01:00",
            actual = data.performedPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-03-22T09:30:10+01:00",
            actual = data.performedPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "A. Langeveld",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f005",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "01.000",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Arts",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.15.111",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Care role",
            actual = data.performer?.get(0)?.function?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ensure breathing during surgery",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "???????????",
            actual = data.report?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport/f001",
            actual = data.report?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure06() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-education.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure06Step01(data: Procedure) {

        assertEquals(
            expected = "Order for health education",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ServiceRequest/education",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "311401005",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient education (procedure)",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Education",
            actual = data.category?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "48023004",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Breast self-examination technique education (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Health education - breast examination",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "education",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Southside Community Health Center",
            actual = data.location?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.performedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Pamela Educator, RN",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "early detection of breast mass",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Jane Doe",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Health education - breast examination for early detection of breast mass</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure07() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-colonoscopy.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure07Step01(data: Procedure) {

        assertEquals(
            expected = "73761001",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Colonoscopy (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Colonoscopy",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Perforated intestine condition",
            actual = data.complicationDetail?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "colonoscopy",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Burgers University Medical Center, South Wing, second floor",
            actual = data.location?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Colonoscopy with complication</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Colonoscope device",
            actual = data.usedReference?.get(0)?.display
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testProcedure08() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-physical-therapy.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure08Step01(data: Procedure) {

        assertEquals(
            expected = "Order for the assessment of passive range of motion",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ServiceRequest/physical-therapy",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "36701003",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Both knees (body structure)",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Both knees",
            actual = data.bodySite?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "386053000",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Evaluation procedure (procedure)",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Evaluation",
            actual = data.category?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "710830005",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Assessment of passive range of motion (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Assessment of passive range of motion",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "physical-therapy",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Sawbones Orthopedic Clinic",
            actual = data.location?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-09-27",
            actual = data.performedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Paul Therapist, PT",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "assessment of mobility limitations due to osteoarthritis",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Assessment of passive range of motion for both knees on Sept 27, 2016 due to osteoarthritis</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure09() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example-f003-abscess.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure09Step01(data: Procedure) {

        assertEquals(
            expected = "83030008",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Retropharyngeal area",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "172960003",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Incision of retropharyngeal abscess",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/f003",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "described in care plan",
            actual = data.followUp?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f003",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "removal of the retropharyngeal abscess",
            actual = data.outcome?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2013-03-24T10:30:10+01:00",
            actual = data.performedPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-03-24T09:30:10+01:00",
            actual = data.performedPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "E.M.J.M. van den broek",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f001",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "01.000",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Arts",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:oid:2.16.840.1.113883.2.4.15.111",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Care role",
            actual = data.performer?.get(0)?.function?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "abcess in retropharyngeal area",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Lab results blood test",
            actual = data.report?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport/f001",
            actual = data.report?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedure10() {
        // Given
        val sourceJson = loadAsString("r4/procedure-example.json")

        // When
        val data = parser.toFhir(Procedure::class, sourceJson)

        // Then
        assertProcedure10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedure10Step01(data: Procedure) {

        assertEquals(
            expected = "Dr Cecil Surgeon",
            actual = data.asserter?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.asserter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "80146002",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Appendectomy (Procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Appendectomy",
            actual = data.code?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ROS 5 days  - 2013-04-10",
            actual = data.followUp?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Routine Appendectomy. Appendix was inflamed and in retro-caecal position",
            actual = data.note?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2013-04-05",
            actual = data.performedDateTime?.value.toString()
        )

        assertEquals(
            expected = "Dr Cecil Surgeon",
            actual = data.performer?.get(0)?.actor?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Generalized abdominal pain 24 hours. Localized in RIF with rebound and guarding",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Dr Cecil Surgeon",
            actual = data.recorder?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.recorder?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Routine Appendectomy</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
