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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ServiceRequestTest.java
 *
 * A request for a service to be performed
 *
 * A record of a request for service such as diagnostic investigations, treatments, or operations to be
 * performed.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ServiceRequestFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testServiceRequest01() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example2.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest01Step01(data: ServiceRequest) {
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
            expected = "http://terminology.hl7.org/CodeSystem/v2-0203",
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
            expected = "1".toLong(),
            actual = data.occurrenceTiming?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "4".toLong(),
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
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.reference
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
    fun testServiceRequest02() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example3.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest02Step01(data: ServiceRequest) {
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
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.reference
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
    fun testServiceRequest03() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example-lipid.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest03Step01(data: ServiceRequest) {
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
            actual = data.encounter?.reference
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
            expected = "http://terminology.hl7.org/CodeSystem/v2-0203",
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
            actual = data.performer?.get(0)?.reference
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
            actual = data.requester?.reference
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
    fun testServiceRequest04() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example-colonoscopy-bx.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest04Step01(data: ServiceRequest) {
        assertEquals(
            expected = "2017-03-05",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "76164006",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Biopsy of colon (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Biopsy of colon",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "colon-biopsy",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "Dr Adam Careful",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr. Beverly Crusher",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809",
            actual = data.requester?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://bumc.org/requisitions",
            actual = data.requisition?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "req12345",
            actual = data.requisition?.value
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
    fun testServiceRequest05() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example4.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest05Step01(data: ServiceRequest) {
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
            expected = "20".toLong(),
            actual = data.occurrenceTiming?.repeat?.count?.value
        )

        assertEquals(
            expected = "30".toLong(),
            actual = data.occurrenceTiming?.repeat?.countMax?.value
        )

        assertEquals(
            expected = "3".toLong(),
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
            expected = "Start with 30kg 10-15 repetitions for three sets and increase in increments of 5kg when you feel ready",
            actual = data.patientInstruction
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
    fun testServiceRequest06() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example-edu.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest06Step01(data: ServiceRequest) {
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
            expected = "2014-08-16",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Pamela Educator, RN",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "early detection of breast mass",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Angela Care, MD",
            actual = data.requester?.display
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
    fun testServiceRequest07() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example-ventilation.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest07Step01(data: ServiceRequest) {
        assertEquals(
            expected = "2018-02-20",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "40617009",
            actual = data.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Artificial respiration (procedure)",
            actual = data.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Mechanical Ventilation",
            actual = data.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vent",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.ORDER,
            actual = data.intent
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
            expected = "243144002",
            actual = data.orderDetail?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient triggered inspiratory assistance (procedure)",
            actual = data.orderDetail?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.orderDetail?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IPPB",
            actual = data.orderDetail?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = " Initial Settings : Sens: -1 cm H20 Pressure 15 cm H2O moderate flow:  Monitor VS every 15 minutes x 4 at the start of mechanical ventilation, then routine for unit OR every 5 hr",
            actual = data.orderDetail?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Cecil Surgeon",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "chronic obstructive lung disease (COLD)",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr. Beverly Crusher",
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809",
            actual = data.requester?.reference
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
    fun testServiceRequest08() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example-ambulation.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest08Step01(data: ServiceRequest) {
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
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/3ad0687e-f477-468c-afd5-fcc2bf897809",
            actual = data.requester?.reference
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
    fun testServiceRequest09() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example-pt.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest09Step01(data: ServiceRequest) {
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
            expected = "2016-09-27",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Paul Therapist, PT",
            actual = data.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "assessment of mobility limitations due to osteoarthritis",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ollie Ortho, MD",
            actual = data.requester?.display
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
    fun testServiceRequest10() {
        // Given
        val sourceJson = loadAsString("r4/servicerequest-example-di.json")

        // When
        val data = parser.toFhir(ServiceRequest::class, sourceJson)

        // Then
        assertServiceRequest10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertServiceRequest10Step01(data: ServiceRequest) {
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
            actual = data.requester?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.requester?.reference
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
}
