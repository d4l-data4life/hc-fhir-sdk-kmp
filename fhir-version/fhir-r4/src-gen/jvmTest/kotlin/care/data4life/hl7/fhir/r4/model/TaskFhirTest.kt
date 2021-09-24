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
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.TaskStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * TaskTest.java
 *
 * A task to be performed
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class TaskFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testTask01() {
        // Given
        val sourceJson = loadAsString("r4/task-example6.json")

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
            expected = "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
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
            expected = "ServiceRequest/lipid",
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
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T18:45:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://terminology.hl7.org/CodeSystem/task-performer-type",
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
            actual = data.reasonCode?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.reference
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
        val sourceJson = loadAsString("r4/task-example-fm-poll.json")

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
            expected = "2018-10-12T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "poll",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fm-example2",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/happyvalley.com/task",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20181012-005",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "include",
            actual = data.input?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            actual = data.input?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ClaimResponse",
            actual = data.input?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "period",
            actual = data.input?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            actual = data.input?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-10-12",
            actual = data.input?.get(1)?.valuePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2018-10-01",
            actual = data.input?.get(1)?.valuePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-10-12T08:25:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://nationalinsurers.com/identifiers",
            actual = data.owner?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.owner?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.STAT,
            actual = data.priority
        )

        assertEquals(
            expected = "Happy Valley Clinic",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.requester?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TaskStatus.REQUESTED,
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
        val sourceJson = loadAsString("r4/task-example1.json")

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
            expected = "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
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
            expected = "ServiceRequest/lipid",
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
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T09:45:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://terminology.hl7.org/CodeSystem/task-performer-type",
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
            actual = data.reasonCode?.text
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
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.reference
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
    fun testTask04() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-reprocess.json")

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
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "reprocess",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.focus?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1501",
            actual = data.focus?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fm-example4",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/happyvalley.com/task",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20181012-006",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "origresponse",
            actual = data.input?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            actual = data.input?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://nationalinsurers.com/claimresponse",
            actual = data.input?.get(0)?.valueReference?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CR201810040001234",
            actual = data.input?.get(0)?.valueReference?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "reference",
            actual = data.input?.get(1)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            actual = data.input?.get(1)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BR12345",
            actual = data.input?.get(1)?.valueString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "item",
            actual = data.input?.get(2)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            actual = data.input?.get(2)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.input?.get(2)?.valuePositiveInt?.value
        )

        assertEquals(
            expected = "item",
            actual = data.input?.get(3)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            actual = data.input?.get(3)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.input?.get(3)?.valuePositiveInt?.value
        )

        assertEquals(
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://nationalinsurers.com/identifiers",
            actual = data.owner?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.owner?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.STAT,
            actual = data.priority
        )

        assertEquals(
            expected = "Happy Valley Clinic",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.requester?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TaskStatus.REQUESTED,
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
        val sourceJson = loadAsString("r4/task-example3.json")

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
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-03-10T22:39:32-04:00",
            actual = data.lastModified?.value.toString()
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
            expected = "Practitioner/example",
            actual = data.owner?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.requester?.reference
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
    fun testTask06() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-status-resp.json")

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
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "status",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.focus?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1500",
            actual = data.focus?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fm-example6",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/happyvalley.com/task",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20181012-001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://nationalinsurers.com/identifiers/12345",
            actual = data.identifier?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "123GB5674",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "status",
            actual = data.output?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/financial-taskoutputtype",
            actual = data.output?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "complete",
            actual = data.output?.get(0)?.valueCode
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://nationalinsurers.com/identifiers",
            actual = data.owner?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.owner?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.STAT,
            actual = data.priority
        )

        assertEquals(
            expected = "Happy Valley Clinic",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.requester?.reference
                ?.replace("\\n", " ")
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
    fun testTask07() {
        // Given
        val sourceJson = loadAsString("r4/task-example2.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask07Step01(data: Task) {

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
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T08:45:05+10:00",
            actual = data.executionPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "BloodDraw ServiceRequest",
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
            expected = "filler-order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T09:45:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://terminology.hl7.org/CodeSystem/task-performer-type",
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
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            actual = data.requester?.reference
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
    fun testTask08() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-release.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask08Step01(data: Task) {

        assertEquals(
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "release",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.focus?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1501",
            actual = data.focus?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fm-example3",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/happyvalley.com/task",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20181012-001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "origresponse",
            actual = data.input?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/financial-taskinputtype",
            actual = data.input?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://nationalinsurers.com/claimresponse",
            actual = data.input?.get(0)?.valueReference?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CR201810040001234",
            actual = data.input?.get(0)?.valueReference?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://nationalinsurers.com/identifiers",
            actual = data.owner?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.owner?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.STAT,
            actual = data.priority
        )

        assertEquals(
            expected = "Happy Valley Clinic",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.requester?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TaskStatus.REQUESTED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testTask09() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-cancel.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask09Step01(data: Task) {

        assertEquals(
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "cancel",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://happyvalley.com/claim",
            actual = data.focus?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1500",
            actual = data.focus?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fm-example1",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http:/happyvalley.com/task",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "20181012-001",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2018-10-04T08:25:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://nationalinsurers.com/identifiers",
            actual = data.owner?.identifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.owner?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.STAT,
            actual = data.priority
        )

        assertEquals(
            expected = "Happy Valley Clinic",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/example",
            actual = data.requester?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = TaskStatus.REQUESTED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testTask10() {
        // Given
        val sourceJson = loadAsString("r4/task-example5.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertTask10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertTask10Step01(data: Task) {

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
            expected = "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Example In-Patient Encounter",
            actual = data.encounter?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
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
            expected = "ServiceRequest/lipid",
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
            expected = "order",
            actual = data.intent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-10-31T16:45:05+10:00",
            actual = data.lastModified?.value.toString()
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
            expected = "http://terminology.hl7.org/CodeSystem/task-performer-type",
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
            actual = data.reasonCode?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.reference
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
}
