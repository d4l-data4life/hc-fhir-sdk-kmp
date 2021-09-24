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
 * ProcedureRequestTest.java
 *
 * A request for a procedure or diagnostic to be performed
 *
 * A record of a request for diagnostic investigations, treatments, or operations to be performed.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ProcedureRequestFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testProcedureRequest01() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example-lipid.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest01Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "LIPID",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org/tests",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Panel",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fasting",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "serum",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "lipid",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.4.5.6.7",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PLAC",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/identifier-type",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Placer",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2345234234234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORIGINAL_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "patient is afraid of needles",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-05-02T16:16:00-07:00",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/f202",
            actual = data.performer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "V173",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fam hx-ischem heart dis",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/icd-9",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.requester?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Serum specimen",
            actual = data.specimen?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#serum",
            actual = data.specimen?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fasting status",
            actual = data.supportingInfo?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#fasting",
            actual = data.supportingInfo?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest02() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example4.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest02Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "229115003",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bench Press (regime/therapy) ",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "benchpress",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.PLAN,
            actual = data.intent
        )

        assertEquals(
            expected = "Start with 30kg and increase in increments of 5kg when you feel ready",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20".toInt(),
            actual = data.occurrenceTiming?.repeat?.count?.value
        )

        assertEquals(
            expected = "30".toInt(),
            actual = data.occurrenceTiming?.repeat?.countMax?.value
        )

        assertEquals(
            expected = "3".toInt(),
            actual = data.occurrenceTiming?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.occurrenceTiming?.repeat?.period?.value
        )

        assertEquals(
            expected = "wk",
            actual = data.occurrenceTiming?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest03() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example-edu.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest03Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "2016-08-16",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "311401005",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient education (procedure)",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Education",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "48023004",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Breast self-examination technique education (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Health education - breast examination",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "education",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2014-08-16",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Pamela Educator, RN",
            actual = data.performer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "early detection of breast mass",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Angela Care, MD",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Jane Doe",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest04() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example-pt.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest04Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "2016-09-20",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "36701003",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Both knees (body structure)",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Both knees",
            actual = data.bodySite?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "386053000",
            actual = data.category?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Evaluation procedure (procedure)",
            actual = data.category?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.category?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Evaluation",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "710830005",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Assessment of passive range of motion (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Assessment of passive range of motion",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "physical-therapy",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2016-09-27",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Paul Therapist, PT",
            actual = data.performer?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "assessment of mobility limitations due to osteoarthritis",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ollie Ortho, MD",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sawbones Orthopedic Clinic",
            actual = data.requester?.onBehalfOf?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest05() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-genetics-example-1.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest05Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "49874-1",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ABCB4 gene mutation analysis",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "og-example1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORIGINAL_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2014-05-12T16:16:00-07:00",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest06() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example-di.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest06Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "24627-2",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chest CT",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "di",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORIGINAL_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2013-05-08T09:33:27+07:00",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Check for metastatic disease",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr. Adam Careful",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/dicom",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest07() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example-subrequest.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest07Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "Original Request",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Right arm",
            actual = data.bodySite?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Right arm",
            actual = data.bodySite?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "35542-0",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peanut IgG",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Protocol for alergies",
            actual = data.definition?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "subrequest",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.INSTANCE_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2013-05-08T09:33:27+07:00",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Qualified nurse",
            actual = data.performerType?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nurse",
            actual = data.performerType?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "Check for Peanut Allergy",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Previous allergy test",
            actual = data.replaces?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr. Adam Careful",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "A13848392",
            actual = data.requisition?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/dicom",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest08() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example2.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest08Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "as needed to clear mucus",
            actual = data.asNeededCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T17:23:07Z",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "CarePlan/gpvisit",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "34431008",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Physiotherapy of chest (regime/therapy) ",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "signature",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cystic-fibrosis",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "physiotherapy",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealth.org/placer-ids",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PLAC",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Placer Identifier",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/identifier-type",
            actual = data.identifier?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Placer",
            actual = data.identifier?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20170201-0001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "15".toDouble(),
            actual = data.occurrenceTiming?.repeat?.duration?.value
        )

        assertEquals(
            expected = "25".toDouble(),
            actual = data.occurrenceTiming?.repeat?.durationMax?.value
        )

        assertEquals(
            expected = "min",
            actual = data.occurrenceTiming?.repeat?.durationUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.occurrenceTiming?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "4".toInt(),
            actual = data.occurrenceTiming?.repeat?.frequencyMax?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.occurrenceTiming?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.occurrenceTiming?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#cystic-fibrosis",
            actual = data.reasonReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Author's Signature",
            actual = data.relevantHistory?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#signature",
            actual = data.relevantHistory?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Good Health Clinic",
            actual = data.requester?.onBehalfOf?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.requester?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest09() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example3.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest09Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "2017-02-01T17:23:07Z",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "359962006",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Turning patient in bed (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.doNotPerform?.value
        )

        assertEquals(
            expected = "do-not-turn",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://goodhealth.org/placer-ids",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "20170201-0002",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = RequestPriority.STAT,
            actual = data.priority
        )

        assertEquals(
            expected = "Patient has a spinal fracture",
            actual = data.reasonReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testProcedureRequest10() {
        // Given
        val sourceJson = loadAsString("stu3/procedurerequest-example-ambulation.json")

        // When
        val data = parser.toFhir(ProcedureRequest::class, sourceJson)

        // Then
        assertProcedureRequest10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertProcedureRequest10Step01(data: ProcedureRequest) {

        assertEquals(
            expected = "2017-03-05",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "Maternity care plan",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CarePlan/preg",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "62013009",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ambulating patient (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ambulation",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Protocol for hypertension during pregnancy",
            actual = data.definition?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulation",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "45678",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "Blood Pressure",
            actual = data.reasonReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/blood-pressure",
            actual = data.reasonReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr. Beverly Crusher",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
