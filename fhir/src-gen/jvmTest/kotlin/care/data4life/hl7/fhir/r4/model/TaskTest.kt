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
class TaskTest {

    val parser = FhirR4Parser()

    @Test
    fun testTask01() {
        // Given
        val sourceJson = loadAsString("r4/task-example6.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2016-10-31T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "General Wellness Careplan",
            data.basedOn?.get(0)?.display
        )
        assertEquals(
            "test completed and posted",
            data.businessStatus?.text
        )
        assertEquals(
            "Lipid Panel",
            data.code?.text
        )
        assertEquals(
            "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            data.description
        )
        assertEquals(
            "Example In-Patient Encounter",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "2016-10-31T18:45:05+10:00",
            data.executionPeriod?.end?.value.toString()
        )
        assertEquals(
            "2016-10-31T08:25:05+10:00",
            data.executionPeriod?.start?.value.toString()
        )
        assertEquals(
            "Lipid Panel Request",
            data.focus?.display
        )
        assertEquals(
            "ServiceRequest/lipid",
            data.focus?.reference
        )
        assertEquals(
            "Peter James Chalmers",
            data.forr?.display
        )
        assertEquals(
            "Patient/example",
            data.forr?.reference
        )
        assertEquals(
            "http:/goodhealth.org/accession/identifiers",
            data.groupIdentifier?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.groupIdentifier?.use
        )
        assertEquals(
            "G20170201-001",
            data.groupIdentifier?.value
        )
        assertEquals(
            "example6",
            data.id
        )
        assertEquals(
            "http:/goodhealth.org/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20170201-001",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2016-10-31T18:45:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "DiagnosticReport generated",
            data.output?.get(0)?.type?.text
        )
        assertEquals(
            "DiagnosticReport/lipids",
            data.output?.get(0)?.valueReference?.reference
        )
        assertEquals(
            "collected specimen",
            data.output?.get(1)?.type?.text
        )
        assertEquals(
            "Specimen/101",
            data.output?.get(1)?.valueReference?.reference
        )
        assertEquals(
            "Clinical Laboratory @ Acme Hospital",
            data.owner?.display
        )
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.owner?.reference
        )
        assertEquals(
            "performer",
            data.performerType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/task-performer-type",
            data.performerType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.text
        )
        assertEquals(
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            "The Task.reason should only be included if there is no Task.focus or if it differs from the reason indicated on the focus",
            data.reasonCode?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.requester?.display
        )
        assertEquals(
            "Practitioner/example",
            data.requester?.reference
        )
        assertEquals(
            "2016-11-02T09:45:05+10:00",
            data.restriction?.period?.end?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.restriction?.repetitions?.value
        )
        assertEquals(
            TaskStatus.COMPLETED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask02() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-poll.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2018-10-12T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "poll",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "fm-example2",
            data.id
        )
        assertEquals(
            "http:/happyvalley.com/task",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20181012-005",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "include",
            data.input?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            data.input?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "ClaimResponse",
            data.input?.get(0)?.valueCode
        )
        assertEquals(
            "period",
            data.input?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            data.input?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "2018-10-12",
            data.input?.get(1)?.valuePeriod?.end?.value.toString()
        )
        assertEquals(
            "2018-10-01",
            data.input?.get(1)?.valuePeriod?.start?.value.toString()
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2018-10-12T08:25:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "http://nationalinsurers.com/identifiers",
            data.owner?.identifier?.system
        )
        assertEquals(
            "12345",
            data.owner?.identifier?.value
        )
        assertEquals(
            RequestPriority.STAT,
            data.priority
        )
        assertEquals(
            "Happy Valley Clinic",
            data.requester?.display
        )
        assertEquals(
            "Organization/example",
            data.requester?.reference
        )
        assertEquals(
            TaskStatus.REQUESTED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask03() {
        // Given
        val sourceJson = loadAsString("r4/task-example1.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2016-10-31T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "General Wellness Careplan",
            data.basedOn?.get(0)?.display
        )
        assertEquals(
            "waiting for specimen",
            data.businessStatus?.text
        )
        assertEquals(
            "Lipid Panel",
            data.code?.text
        )
        assertEquals(
            "signature",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            data.description
        )
        assertEquals(
            "Example In-Patient Encounter",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "2016-10-31T08:25:05+10:00",
            data.executionPeriod?.start?.value.toString()
        )
        assertEquals(
            "Lipid Panel Request",
            data.focus?.display
        )
        assertEquals(
            "ServiceRequest/lipid",
            data.focus?.reference
        )
        assertEquals(
            "Peter James Chalmers",
            data.forr?.display
        )
        assertEquals(
            "Patient/example",
            data.forr?.reference
        )
        assertEquals(
            "http:/goodhealth.org/accession/identifiers",
            data.groupIdentifier?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.groupIdentifier?.use
        )
        assertEquals(
            "G20170201-001",
            data.groupIdentifier?.value
        )
        assertEquals(
            "example1",
            data.id
        )
        assertEquals(
            "http:/goodhealth.org/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20170201-001",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2016-10-31T09:45:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Clinical Laboratory @ Acme Hospital",
            data.owner?.display
        )
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.owner?.reference
        )
        assertEquals(
            "performer",
            data.performerType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/task-performer-type",
            data.performerType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.text
        )
        assertEquals(
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            "The Task.reason should only be included if there is no Task.focus or if it differs from the reason indicated on the focus",
            data.reasonCode?.text
        )
        assertEquals(
            "Author's Signature",
            data.relevantHistory?.get(0)?.display
        )
        assertEquals(
            "#signature",
            data.relevantHistory?.get(0)?.reference
        )
        assertEquals(
            "Dr Adam Careful",
            data.requester?.display
        )
        assertEquals(
            "Practitioner/example",
            data.requester?.reference
        )
        assertEquals(
            "2016-11-02T09:45:05+10:00",
            data.restriction?.period?.end?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.restriction?.repetitions?.value
        )
        assertEquals(
            TaskStatus.IN_PROGRESS,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask04() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-reprocess.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "reprocess",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "http://happyvalley.com/claim",
            data.focus?.identifier?.system
        )
        assertEquals(
            "1501",
            data.focus?.identifier?.value
        )
        assertEquals(
            "fm-example4",
            data.id
        )
        assertEquals(
            "http:/happyvalley.com/task",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20181012-006",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "origresponse",
            data.input?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            data.input?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "http://nationalinsurers.com/claimresponse",
            data.input?.get(0)?.valueReference?.identifier?.system
        )
        assertEquals(
            "CR201810040001234",
            data.input?.get(0)?.valueReference?.identifier?.value
        )
        assertEquals(
            "reference",
            data.input?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            data.input?.get(1)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "BR12345",
            data.input?.get(1)?.valueString
        )
        assertEquals(
            "item",
            data.input?.get(2)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            data.input?.get(2)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "2".toLong(),
            data.input?.get(2)?.valuePositiveInt?.value
        )
        assertEquals(
            "item",
            data.input?.get(3)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskinputtype",
            data.input?.get(3)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "3".toLong(),
            data.input?.get(3)?.valuePositiveInt?.value
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "http://nationalinsurers.com/identifiers",
            data.owner?.identifier?.system
        )
        assertEquals(
            "12345",
            data.owner?.identifier?.value
        )
        assertEquals(
            RequestPriority.STAT,
            data.priority
        )
        assertEquals(
            "Happy Valley Clinic",
            data.requester?.display
        )
        assertEquals(
            "Organization/example",
            data.requester?.reference
        )
        assertEquals(
            TaskStatus.REQUESTED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask05() {
        // Given
        val sourceJson = loadAsString("r4/task-example3.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2016-03-10T22:39:32-04:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "Refill Request",
            data.code?.text
        )
        assertEquals(
            "MedicationRequest/medrx002",
            data.focus?.reference
        )
        assertEquals(
            "Patient/f001",
            data.forr?.reference
        )
        assertEquals(
            "example3",
            data.id
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2016-03-10T22:39:32-04:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.owner?.reference
        )
        assertEquals(
            "Patient/example",
            data.requester?.reference
        )
        assertEquals(
            TaskStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask06() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-status-resp.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "status",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "http://happyvalley.com/claim",
            data.focus?.identifier?.system
        )
        assertEquals(
            "1500",
            data.focus?.identifier?.value
        )
        assertEquals(
            "fm-example6",
            data.id
        )
        assertEquals(
            "http:/happyvalley.com/task",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20181012-001",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://nationalinsurers.com/identifiers/12345",
            data.identifier?.get(1)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(1)?.use
        )
        assertEquals(
            "123GB5674",
            data.identifier?.get(1)?.value
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "status",
            data.output?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/financial-taskoutputtype",
            data.output?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "complete",
            data.output?.get(0)?.valueCode
        )
        assertEquals(
            "http://nationalinsurers.com/identifiers",
            data.owner?.identifier?.system
        )
        assertEquals(
            "12345",
            data.owner?.identifier?.value
        )
        assertEquals(
            RequestPriority.STAT,
            data.priority
        )
        assertEquals(
            "Happy Valley Clinic",
            data.requester?.display
        )
        assertEquals(
            "Organization/example",
            data.requester?.reference
        )
        assertEquals(
            TaskStatus.COMPLETED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask07() {
        // Given
        val sourceJson = loadAsString("r4/task-example2.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2016-10-31T08:45:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "waiting for patient",
            data.businessStatus?.text
        )
        assertEquals(
            "Specimen Collection",
            data.code?.text
        )
        assertEquals(
            "Example In-Patient Encounter",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "2016-10-31T08:45:05+10:00",
            data.executionPeriod?.start?.value.toString()
        )
        assertEquals(
            "BloodDraw ServiceRequest",
            data.focus?.display
        )
        assertEquals(
            "Peter James Chalmers",
            data.forr?.display
        )
        assertEquals(
            "Patient/example",
            data.forr?.reference
        )
        assertEquals(
            "http:/goodhealth.org/accession/identifiers",
            data.groupIdentifier?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.groupIdentifier?.use
        )
        assertEquals(
            "G20170201-001",
            data.groupIdentifier?.value
        )
        assertEquals(
            "example2",
            data.id
        )
        assertEquals(
            "http:/goodhealth.org/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20170201-002",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "filler-order",
            data.intent
        )
        assertEquals(
            "2016-10-31T09:45:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Clinical Laboratory @ Acme Hospital",
            data.owner?.display
        )
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.owner?.reference
        )
        assertEquals(
            "Lipid Panel",
            data.partOf?.get(0)?.display
        )
        assertEquals(
            "Task/example1",
            data.partOf?.get(0)?.reference
        )
        assertEquals(
            "performer",
            data.performerType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/task-performer-type",
            data.performerType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.text
        )
        assertEquals(
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            "Clinical Laboratory @ Acme Hospital",
            data.requester?.display
        )
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.requester?.reference
        )
        assertEquals(
            "2016-11-01T09:45:05+10:00",
            data.restriction?.period?.end?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.restriction?.repetitions?.value
        )
        assertEquals(
            TaskStatus.ACCEPTED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask08() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-release.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "release",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "http://happyvalley.com/claim",
            data.focus?.identifier?.system
        )
        assertEquals(
            "1501",
            data.focus?.identifier?.value
        )
        assertEquals(
            "fm-example3",
            data.id
        )
        assertEquals(
            "http:/happyvalley.com/task",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20181012-001",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "origresponse",
            data.input?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/financial-taskinputtype",
            data.input?.get(0)?.type?.coding?.get(0)?.system
        )
        assertEquals(
            "http://nationalinsurers.com/claimresponse",
            data.input?.get(0)?.valueReference?.identifier?.system
        )
        assertEquals(
            "CR201810040001234",
            data.input?.get(0)?.valueReference?.identifier?.value
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "http://nationalinsurers.com/identifiers",
            data.owner?.identifier?.system
        )
        assertEquals(
            "12345",
            data.owner?.identifier?.value
        )
        assertEquals(
            RequestPriority.STAT,
            data.priority
        )
        assertEquals(
            "Happy Valley Clinic",
            data.requester?.display
        )
        assertEquals(
            "Organization/example",
            data.requester?.reference
        )
        assertEquals(
            TaskStatus.REQUESTED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask09() {
        // Given
        val sourceJson = loadAsString("r4/task-example-fm-cancel.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "cancel",
            data.code?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/financialtaskcode",
            data.code?.coding?.get(0)?.system
        )
        assertEquals(
            "http://happyvalley.com/claim",
            data.focus?.identifier?.system
        )
        assertEquals(
            "1500",
            data.focus?.identifier?.value
        )
        assertEquals(
            "fm-example1",
            data.id
        )
        assertEquals(
            "http:/happyvalley.com/task",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20181012-001",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2018-10-04T08:25:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "http://nationalinsurers.com/identifiers",
            data.owner?.identifier?.system
        )
        assertEquals(
            "12345",
            data.owner?.identifier?.value
        )
        assertEquals(
            RequestPriority.STAT,
            data.priority
        )
        assertEquals(
            "Happy Valley Clinic",
            data.requester?.display
        )
        assertEquals(
            "Organization/example",
            data.requester?.reference
        )
        assertEquals(
            TaskStatus.REQUESTED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testTask10() {
        // Given
        val sourceJson = loadAsString("r4/task-example5.json")

        // When
        val data = parser.toFhir(Task::class, sourceJson)

        // Then
        assertEquals(
            "2016-10-31T08:25:05+10:00",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "General Wellness Careplan",
            data.basedOn?.get(0)?.display
        )
        assertEquals(
            "specimen received, test in progress",
            data.businessStatus?.text
        )
        assertEquals(
            "Lipid Panel",
            data.code?.text
        )
        assertEquals(
            "Create order for getting specimen, Set up inhouse testing,  generate order for any sendouts and submit with specimen",
            data.description
        )
        assertEquals(
            "Example In-Patient Encounter",
            data.encounter?.display
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "2016-10-31T08:25:05+10:00",
            data.executionPeriod?.start?.value.toString()
        )
        assertEquals(
            "Lipid Panel Request",
            data.focus?.display
        )
        assertEquals(
            "ServiceRequest/lipid",
            data.focus?.reference
        )
        assertEquals(
            "Peter James Chalmers",
            data.forr?.display
        )
        assertEquals(
            "Patient/example",
            data.forr?.reference
        )
        assertEquals(
            "http:/goodhealth.org/accession/identifiers",
            data.groupIdentifier?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.groupIdentifier?.use
        )
        assertEquals(
            "G20170201-001",
            data.groupIdentifier?.value
        )
        assertEquals(
            "example5",
            data.id
        )
        assertEquals(
            "http:/goodhealth.org/identifiers",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "20170201-001",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "order",
            data.intent
        )
        assertEquals(
            "2016-10-31T16:45:05+10:00",
            data.lastModified?.value.toString()
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "collected specimen",
            data.output?.get(0)?.type?.text
        )
        assertEquals(
            "Specimen/101",
            data.output?.get(0)?.valueReference?.reference
        )
        assertEquals(
            "Clinical Laboratory @ Acme Hospital",
            data.owner?.display
        )
        assertEquals(
            "Organization/1832473e-2fe0-452d-abe9-3cdb9879522f",
            data.owner?.reference
        )
        assertEquals(
            "performer",
            data.performerType?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/task-performer-type",
            data.performerType?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Performer",
            data.performerType?.get(0)?.text
        )
        assertEquals(
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            "The Task.reason should only be included if there is no Task.focus or if it differs from the reason indicated on the focus",
            data.reasonCode?.text
        )
        assertEquals(
            "Dr Adam Careful",
            data.requester?.display
        )
        assertEquals(
            "Practitioner/example",
            data.requester?.reference
        )
        assertEquals(
            "2016-11-02T09:45:05+10:00",
            data.restriction?.period?.end?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.restriction?.repetitions?.value
        )
        assertEquals(
            TaskStatus.IN_PROGRESS,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
