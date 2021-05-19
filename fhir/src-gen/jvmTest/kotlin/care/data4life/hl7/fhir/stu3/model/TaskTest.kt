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
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.RequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.TaskStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * TaskTest.java
 *
 * A task to be performed
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class TaskTest {

    val parser = FhirStu3Parser()

    @Test
    fun testTask01() {
        // Given
        val sourceJson = loadAsString("stu3/task-example6.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask01Step01(data: Task) {

        assertEquals(
            expected = "2016-10-31T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "General Wellness Careplan",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "test completed and posted",
            actual = data.businessStatus?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Panel",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T18:45:05+10:00",
            actual = data.executionPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-10-31T08:25:05+10:00",
            actual = data.executionPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Lipid Panel Request",
            actual = data.focus?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ProcedureRequest/lipid",
            actual = data.focus?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.forr?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.forr?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/accession/identifiers",
            actual = data.groupIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.groupIdentifier?.use
        )

        assertEquals(
            expected = "G20170201-001",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example6",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20170201-001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2016-10-31T18:45:05+10:00",
            actual = data.lastModified?.value.toString()
        )

        assertEquals(
            expected = "DiagnosticReport generated",
            actual = data.output?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport/lipids",
            actual = data.output?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "collected specimen",
            actual = data.output?.get(1)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen/101",
            actual = data.output?.get(1)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical Laboratory @ Acme Hospital",
            actual = data.owner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/task-performer-type",
            actual = data.performerType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "The Task.reason should only be included if there is no Task.focus or if it differs from the reason indicated on the focus",
            actual = data.reason?.text
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
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.requester?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-02T09:45:05+10:00",
            actual = data.restriction?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.restriction?.repetitions?.value
        )

        assertEquals(
            expected = TaskStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testTask02() {
        // Given
        val sourceJson = loadAsString("stu3/task-example1.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask02Step01(data: Task) {

        assertEquals(
            expected = "2016-10-31T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "General Wellness Careplan",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "waiting for specimen",
            actual = data.businessStatus?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Panel",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "signature",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T08:25:05+10:00",
            actual = data.executionPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Lipid Panel Request",
            actual = data.focus?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ProcedureRequest/lipid",
            actual = data.focus?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.forr?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.forr?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/accession/identifiers",
            actual = data.groupIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.groupIdentifier?.use
        )

        assertEquals(
            expected = "G20170201-001",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20170201-001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2016-10-31T09:45:05+10:00",
            actual = data.lastModified?.value.toString()
        )

        assertEquals(
            expected = "Clinical Laboratory @ Acme Hospital",
            actual = data.owner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/task-performer-type",
            actual = data.performerType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "The Task.reason should only be included if there is no Task.focus or if it differs from the reason indicated on the focus",
            actual = data.reason?.text
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
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.requester?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-02T09:45:05+10:00",
            actual = data.restriction?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.restriction?.repetitions?.value
        )

        assertEquals(
            expected = TaskStatus.IN_PROGRESS,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testTask03() {
        // Given
        val sourceJson = loadAsString("stu3/task-example3.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask03Step01(data: Task) {

        assertEquals(
            expected = "2016-03-10T22:39:32-04:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "Refill Request",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicationRequest/medrx002",
            actual = data.focus?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.forr?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example3",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2016-03-10T22:39:32-04:00",
            actual = data.lastModified?.value.toString()
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TaskStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testTask04() {
        // Given
        val sourceJson = loadAsString("stu3/task-example2.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask04Step01(data: Task) {

        assertEquals(
            expected = "2016-10-31T08:45:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "waiting for patient",
            actual = data.businessStatus?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen Collection",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T08:45:05+10:00",
            actual = data.executionPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "BloodDraw ProcedureRequest",
            actual = data.focus?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.forr?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.forr?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/accession/identifiers",
            actual = data.groupIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.groupIdentifier?.use
        )

        assertEquals(
            expected = "G20170201-001",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20170201-002",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.FILLER_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2016-10-31T09:45:05+10:00",
            actual = data.lastModified?.value.toString()
        )

        assertEquals(
            expected = "Clinical Laboratory @ Acme Hospital",
            actual = data.owner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Panel",
            actual = data.partOf?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Task/example1",
            actual = data.partOf?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/task-performer-type",
            actual = data.performerType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "Clinical Laboratory @ Acme Hospital",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-01T09:45:05+10:00",
            actual = data.restriction?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.restriction?.repetitions?.value
        )

        assertEquals(
            expected = TaskStatus.ACCEPTED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testTask05() {
        // Given
        val sourceJson = loadAsString("stu3/task-example5.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask05Step01(data: Task) {

        assertEquals(
            expected = "2016-10-31T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "General Wellness Careplan",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "specimen received, test in progress",
            actual = data.businessStatus?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Panel",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T08:25:05+10:00",
            actual = data.executionPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "Lipid Panel Request",
            actual = data.focus?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ProcedureRequest/lipid",
            actual = data.focus?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.forr?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.forr?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/accession/identifiers",
            actual = data.groupIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.groupIdentifier?.use
        )

        assertEquals(
            expected = "G20170201-001",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example5",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20170201-001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2016-10-31T16:45:05+10:00",
            actual = data.lastModified?.value.toString()
        )

        assertEquals(
            expected = "collected specimen",
            actual = data.output?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen/101",
            actual = data.output?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical Laboratory @ Acme Hospital",
            actual = data.owner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/task-performer-type",
            actual = data.performerType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "The Task.reason should only be included if there is no Task.focus or if it differs from the reason indicated on the focus",
            actual = data.reason?.text
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
            expected = "Organization/2.16.840.1.113883.19.5",
            actual = data.requester?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-02T09:45:05+10:00",
            actual = data.restriction?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.restriction?.repetitions?.value
        )

        assertEquals(
            expected = TaskStatus.IN_PROGRESS,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testTask06() {
        // Given
        val sourceJson = loadAsString("stu3/task-example4.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask06Step01(data: Task) {

        assertEquals(
            expected = "2016-10-31T08:45:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "Specimen Collection",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T14:45:05+10:00",
            actual = data.executionPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-10-31T08:45:05+10:00",
            actual = data.executionPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "BloodDraw ProcedureRequest",
            actual = data.focus?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.forr?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.forr?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/accession/identifiers",
            actual = data.groupIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.groupIdentifier?.use
        )

        assertEquals(
            expected = "G20170201-001",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example4",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/goodhealth.org/identifiers",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20170201-002",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.FILLER_ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "2016-10-31T09:45:05+10:00",
            actual = data.lastModified?.value.toString()
        )

        assertEquals(
            expected = "collected specimen",
            actual = data.output?.get(0)?.type?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Specimen/101",
            actual = data.output?.get(0)?.valueReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Luigi Maas",
            actual = data.owner?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f202",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lipid Panel",
            actual = data.partOf?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Task/example1",
            actual = data.partOf?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/task-performer-type",
            actual = data.performerType?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Performer",
            actual = data.performerType?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "Clinical Laboratory @ Acme Hospital",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-01T09:45:05+10:00",
            actual = data.restriction?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.restriction?.repetitions?.value
        )

        assertEquals(
            expected = TaskStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
