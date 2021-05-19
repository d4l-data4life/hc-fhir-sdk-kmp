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
import care.data4life.hl7.fhir.r4.codesystem.CarePlanActivityStatus
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * CarePlanTest.java
 *
 * Healthcare plan for patient or group
 *
 * Describes the intention of how one or more practitioners intend to deliver care for a particular
 * patient, group or community for a period of time, possibly limited to care for a specific condition
 * or set of conditions.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class CarePlanTest {

    val parser = FhirR4Parser()

    @Test
    fun testCarePlan01() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f002-lung.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan01Step01(data: CarePlan) {

        assertEquals(
            expected = "359615001",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Partial lobectomy of lung",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.SERVICEREQUEST,
            actual = data.activity?.get(0)?.detail?.kind
        )

        assertEquals(
            expected = "M.I.M. Versteegh",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f003",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-07-07T09:30:10+01:00",
            actual = data.activity?.get(0)?.detail?.scheduledString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "?????",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/f201",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#careteam",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "careteam",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#goal",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f002",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/careplans",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "CP2934",
            actual = data.identifier?.get(0)?.value
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
            expected = "2013-07-07",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2011-07-06",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan02() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f202-malignancy.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan02Step01(data: CarePlan) {

        assertEquals(
            expected = "367336001",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chemotherapy",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.SERVICEREQUEST,
            actual = data.activity?.get(0)?.detail?.kind
        )

        assertEquals(
            expected = "#tpf",
            actual = data.activity?.get(0)?.detail?.productReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CarePlanActivityStatus.IN_PROGRESS,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "Roel's Chemotherapy",
            actual = data.activity?.get(0)?.outcomeReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Procedure/f201",
            actual = data.activity?.get(0)?.outcomeReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Roel's head-neck tumor",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/f202",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#careteam",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "doce",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cisp",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "fluo",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "tpf",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "careteam",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.contained?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#goal",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f202",
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
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan03() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-obesity-narrative.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan03Step01(data: CarePlan) {

        assertEquals(
            expected = "obesity-narrative",
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
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan04() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan04Step01(data: CarePlan) {

        assertEquals(
            expected = "3141-9",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Weight Measured",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "27113001",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body weight",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "Patient's home",
            actual = data.activity?.get(0)?.detail?.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.activity?.get(0)?.detail?.scheduledTiming?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.activity?.get(0)?.detail?.scheduledTiming?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.activity?.get(0)?.detail?.scheduledTiming?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "Achieved weight loss to mitigate diabetes risk.",
            actual = data.activity?.get(0)?.detail?.statusReason?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "161832001",
            actual = data.activity?.get(0)?.outcomeCodeableConcept?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Progressive weight loss",
            actual = data.activity?.get(0)?.outcomeCodeableConcept?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.outcomeCodeableConcept?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Weight Measured",
            actual = data.activity?.get(0)?.outcomeReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/example",
            actual = data.activity?.get(0)?.outcomeReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "obesity",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p1",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Dr Adam Careful",
            actual = data.author?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Management of Type 2 Diabetes",
            actual = data.basedOn?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CareTeam/example",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Weight management plan",
            actual = data.category?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "p1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.created?.value.toString()
        )

        assertEquals(
            expected = "Manage obesity and weight loss",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/home",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Goal/example",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/protocol-for-obesity",
            actual = data.instantiatesUri?.get(0)
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
            expected = "Overall wellness plan",
            actual = data.partOf?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-06-01",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "Plan from urgent care clinic",
            actual = data.replaces?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan05() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f201-renal.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan05Step01(data: CarePlan) {

        assertEquals(
            expected = "284093001",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Potassium supplementation",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "258718000",
            actual = data.activity?.get(0)?.detail?.dailyAmount?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.detail?.dailyAmount?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mmol",
            actual = data.activity?.get(0)?.detail?.dailyAmount?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "80".toDouble(),
            actual = data.activity?.get(0)?.detail?.dailyAmount?.value?.value
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.NUTRITIONORDER,
            actual = data.activity?.get(0)?.detail?.kind
        )

        assertEquals(
            expected = "Potassium",
            actual = data.activity?.get(0)?.detail?.productReference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Substance/f203",
            actual = data.activity?.get(0)?.detail?.productReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "daily",
            actual = data.activity?.get(0)?.detail?.scheduledString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "306005",
            actual = data.activity?.get(1)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Echography of kidney",
            actual = data.activity?.get(1)?.detail?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(1)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(1)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.SERVICEREQUEST,
            actual = data.activity?.get(1)?.detail?.kind
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(1)?.detail?.status
        )

        assertEquals(
            expected = "Roel's renal insufficiency",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/f204",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#careteam",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "careteam",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#goal",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.PROPOSAL,
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
            expected = "2013-03-13",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-03-11",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = RequestStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan06() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-GPVisit.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan06Step01(data: CarePlan) {

        assertEquals(
            expected = "nursecon",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/local",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Nurse Consultation",
            actual = data.activity?.get(0)?.detail?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.APPOINTMENT,
            actual = data.activity?.get(0)?.detail?.kind
        )

        assertEquals(
            expected = "Nurse Nancy",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/13",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-01T10:50:00+00:00",
            actual = data.activity?.get(0)?.detail?.scheduledPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-01-01T10:38:00+00:00",
            actual = data.activity?.get(0)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.activity?.get(0)?.outcomeReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "doccon",
            actual = data.activity?.get(1)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/local",
            actual = data.activity?.get(1)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Doctor Consultation",
            actual = data.activity?.get(1)?.detail?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(1)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.APPOINTMENT,
            actual = data.activity?.get(1)?.detail?.kind
        )

        assertEquals(
            expected = "Doctor Dave",
            actual = data.activity?.get(1)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/14",
            actual = data.activity?.get(1)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CarePlanActivityStatus.SCHEDULED,
            actual = data.activity?.get(1)?.detail?.status
        )

        assertEquals(
            expected = "obesity",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p1",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#careteam",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "p1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "careteam",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#goal",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "gpvisit",
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
            expected = "2013-01-01T10:30:00+00:00",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/100",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan07() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-integrated.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan07Step01(data)
        assertCarePlan07Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan07Step01(data: CarePlan) {

        assertEquals(
            expected = "Eve will review photos of high and low density foods and share with her parents",
            actual = data.activity?.get(0)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(0)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(0)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g1",
            actual = data.activity?.get(0)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(0)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.NOT_STARTED,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "Eve eats one meal a day with her parents",
            actual = data.activity?.get(0)?.progress?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(0)?.progress?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve will ask her dad to asist her to put the head of her bed on blocks",
            actual = data.activity?.get(1)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(1)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(1)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(1)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g1",
            actual = data.activity?.get(1)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ResourceType.COMMUNICATIONREQUEST,
            actual = data.activity?.get(1)?.detail?.kind
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(1)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.NOT_STARTED,
            actual = data.activity?.get(1)?.detail?.status
        )

        assertEquals(
            expected = "Eve will sleep in her bed more often than the couch",
            actual = data.activity?.get(1)?.progress?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(1)?.progress?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve will reduce her intake of coffee and chocolate",
            actual = data.activity?.get(2)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(2)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(2)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(2)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g2",
            actual = data.activity?.get(2)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(2)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.IN_PROGRESS,
            actual = data.activity?.get(2)?.detail?.status
        )

        assertEquals(
            expected = "Eve will walk her friend's dog up and down a big hill 15-30 minutes 3 days a week",
            actual = data.activity?.get(3)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(3)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(3)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(3)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g3",
            actual = data.activity?.get(3)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-27",
            actual = data.activity?.get(3)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.IN_PROGRESS,
            actual = data.activity?.get(3)?.detail?.status
        )

        assertEquals(
            expected = "Eve would like to try for 5 days a week.",
            actual = data.activity?.get(3)?.progress?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-27",
            actual = data.activity?.get(3)?.progress?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve is still walking the dogs.",
            actual = data.activity?.get(3)?.progress?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(3)?.progress?.get(1)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve will walk 3 blocks to her parents house twice a week",
            actual = data.activity?.get(4)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(4)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(4)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(4)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g3",
            actual = data.activity?.get(4)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-23",
            actual = data.activity?.get(4)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.IN_PROGRESS,
            actual = data.activity?.get(4)?.detail?.status
        )

        assertEquals(
            expected = "Eve walked 4 times the last week.",
            actual = data.activity?.get(4)?.progress?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-13",
            actual = data.activity?.get(4)?.progress?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve did not walk to her parents the last week, but has plans to start again",
            actual = data.activity?.get(4)?.progress?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(4)?.progress?.get(1)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve will use a calendar to check off after medications are taken",
            actual = data.activity?.get(5)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(5)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(5)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-13",
            actual = data.activity?.get(5)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g4",
            actual = data.activity?.get(5)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-23",
            actual = data.activity?.get(5)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.IN_PROGRESS,
            actual = data.activity?.get(5)?.detail?.status
        )

        assertEquals(
            expected = "Eve will use her lights MWF after her shower for 3 minutes",
            actual = data.activity?.get(6)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(6)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(6)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-27",
            actual = data.activity?.get(6)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g5",
            actual = data.activity?.get(6)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-23",
            actual = data.activity?.get(6)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.IN_PROGRESS,
            actual = data.activity?.get(6)?.detail?.status
        )

        assertEquals(
            expected = "After restarting the vinegar soaks the psoriasis is improved and Eve plans to treat the remainder with light treatments.  She plans to start this week.",
            actual = data.activity?.get(6)?.progress?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-13",
            actual = data.activity?.get(6)?.progress?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Since her skin is improved Eve has not been using the light treatment as often, maybe once a week.  She would like to increase to 3 times a week again",
            actual = data.activity?.get(6)?.progress?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-27",
            actual = data.activity?.get(6)?.progress?.get(1)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve will use a calendar of a chart to help her remember when to take her medications",
            actual = data.activity?.get(7)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(7)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(7)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-09-10",
            actual = data.activity?.get(7)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g4",
            actual = data.activity?.get(7)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-10",
            actual = data.activity?.get(7)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.IN_PROGRESS,
            actual = data.activity?.get(7)?.detail?.status
        )

        assertEquals(
            expected = "Eve created a chart as a reminer to take the medications that do not fit in her pill box",
            actual = data.activity?.get(7)?.progress?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-23",
            actual = data.activity?.get(7)?.progress?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve will start using stretch bands and one step 2 days a week Mon/Wed 6-7am and maybe Friday afternoon",
            actual = data.activity?.get(8)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(8)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(8)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-23",
            actual = data.activity?.get(8)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g3",
            actual = data.activity?.get(8)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-23",
            actual = data.activity?.get(8)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.ON_HOLD,
            actual = data.activity?.get(8)?.detail?.status
        )

        assertEquals(
            expected = "Will be able to esume exercise.",
            actual = data.activity?.get(8)?.progress?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-30",
            actual = data.activity?.get(8)?.progress?.get(0)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve prefers to focus on walking at this time",
            actual = data.activity?.get(8)?.progress?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-08-13",
            actual = data.activity?.get(8)?.progress?.get(1)?.time?.value.toString()
        )

        assertEquals(
            expected = "Eve will match a printed medication worksheet with the medication bottles at home",
            actual = data.activity?.get(9)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(9)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/RevisionDate",
            actual = data.activity?.get(9)?.detail?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-23",
            actual = data.activity?.get(9)?.detail?.extension?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "#g4",
            actual = data.activity?.get(9)?.detail?.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2012-07-10",
            actual = data.activity?.get(9)?.detail?.scheduledPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(9)?.detail?.status
        )

        assertEquals(
            expected = "GERDS",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p1",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Obesity",
            actual = data.addresses?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p2",
            actual = data.addresses?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Psoriasis",
            actual = data.addresses?.get(2)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p3",
            actual = data.addresses?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "p1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )
    }

    private fun assertCarePlan07Step02(data: CarePlan) {

        assertEquals(
            expected = "p2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "p3",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "g1",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "g2",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "g3",
            actual = data.contained?.get(5)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "g4",
            actual = data.contained?.get(6)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "g5",
            actual = data.contained?.get(7)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#g1",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#g2",
            actual = data.goal?.get(1)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#g3",
            actual = data.goal?.get(2)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#g4",
            actual = data.goal?.get(3)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#g5",
            actual = data.goal?.get(4)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "integrate",
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
            expected = "Patient family is not ready to commit to goal setting at this time.  Goal setting will be addressed in the future",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Eve Everywoman",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan08() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f003-pharynx.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan08Step01(data: CarePlan) {

        assertEquals(
            expected = "172960003",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Incision of retropharyngeal abscess",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.SERVICEREQUEST,
            actual = data.activity?.get(0)?.detail?.kind
        )

        assertEquals(
            expected = "E.M. van den broek",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f001",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-06-27T09:30:10+01:00",
            actual = data.activity?.get(0)?.detail?.scheduledString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "?????",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/f201",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#careteam",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "careteam",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#goal",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f003",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/careplans",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "CP3953",
            actual = data.identifier?.get(0)?.value
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
            expected = "2013-03-08T09:30:10+01:00",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-03-08T09:00:10+01:00",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan09() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-f001-heart.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan09Step01(data: CarePlan) {

        assertEquals(
            expected = "64915003",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Operation on heart",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.activity?.get(0)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.activity?.get(0)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.SERVICEREQUEST,
            actual = data.activity?.get(0)?.detail?.kind
        )

        assertEquals(
            expected = "P. Voigt",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f002",
            actual = data.activity?.get(0)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2011-06-27T09:30:10+01:00",
            actual = data.activity?.get(0)?.detail?.scheduledString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = CarePlanActivityStatus.COMPLETED,
            actual = data.activity?.get(0)?.detail?.status
        )

        assertEquals(
            expected = "?????",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/f201",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#careteam",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "careteam",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#goal",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f001",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/careplans",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "CP2903",
            actual = data.identifier?.get(0)?.value
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
            expected = "2011-06-27",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2011-06-26",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = RequestStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "P. van de Heuvel",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/f001",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testCarePlan10() {
        // Given
        val sourceJson = loadAsString("r4/careplan-example-pregnancy.json")

        // When
        val data = parser.toFhir(CarePlan::class, sourceJson)

        // Then
        assertCarePlan10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertCarePlan10Step01(data: CarePlan) {

        assertEquals(
            expected = "Prenatal vitamin MedicationRequest",
            actual = data.activity?.get(0)?.reference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1an",
            actual = data.activity?.get(1)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/mySystem",
            actual = data.activity?.get(1)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "First Antenatal encounter",
            actual = data.activity?.get(1)?.detail?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The first antenatal encounter. This is where a detailed physical examination is performed.             and the pregnanacy discussed with the mother-to-be.",
            actual = data.activity?.get(1)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(1)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.APPOINTMENT,
            actual = data.activity?.get(1)?.detail?.kind
        )

        assertEquals(
            expected = "Mavis Midwife",
            actual = data.activity?.get(1)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#pr1",
            actual = data.activity?.get(1)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-02-28",
            actual = data.activity?.get(1)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-02-14",
            actual = data.activity?.get(1)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.SCHEDULED,
            actual = data.activity?.get(1)?.detail?.status
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/careplan#andetails",
            actual = data.activity?.get(1)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://orionhealth.com/fhir/careplan/1andetails",
            actual = data.activity?.get(1)?.extension?.get(0)?.valueUri
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "an",
            actual = data.activity?.get(2)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/mySystem",
            actual = data.activity?.get(2)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Follow-up Antenatal encounter",
            actual = data.activity?.get(2)?.detail?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The second antenatal encounter. Discuss any issues that arose from the first antenatal encounter",
            actual = data.activity?.get(2)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(2)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.APPOINTMENT,
            actual = data.activity?.get(2)?.detail?.kind
        )

        assertEquals(
            expected = "Mavis Midwife",
            actual = data.activity?.get(2)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#pr1",
            actual = data.activity?.get(2)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-03-14",
            actual = data.activity?.get(2)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-03-01",
            actual = data.activity?.get(2)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.NOT_STARTED,
            actual = data.activity?.get(2)?.detail?.status
        )

        assertEquals(
            expected = "del",
            actual = data.activity?.get(3)?.detail?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/mySystem",
            actual = data.activity?.get(3)?.detail?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Delivery",
            actual = data.activity?.get(3)?.detail?.code?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The delivery.",
            actual = data.activity?.get(3)?.detail?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.activity?.get(3)?.detail?.doNotPerform?.value
        )

        assertEquals(
            expected = ResourceType.APPOINTMENT,
            actual = data.activity?.get(3)?.detail?.kind
        )

        assertEquals(
            expected = "Mavis Midwife",
            actual = data.activity?.get(3)?.detail?.performer?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#pr1",
            actual = data.activity?.get(3)?.detail?.performer?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-09-14",
            actual = data.activity?.get(3)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-09-01",
            actual = data.activity?.get(3)?.detail?.scheduledTiming?.repeat?.boundsPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = CarePlanActivityStatus.NOT_STARTED,
            actual = data.activity?.get(3)?.detail?.status
        )

        assertEquals(
            expected = "pregnancy",
            actual = data.addresses?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#p1",
            actual = data.addresses?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#careteam",
            actual = data.careTeam?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "p1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pr1",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pr2",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "careteam",
            actual = data.contained?.get(3)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "goal",
            actual = data.contained?.get(4)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/StructureDefinition/careplan#lmp",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-01",
            actual = data.extension?.get(0)?.valueDateTime?.value.toString()
        )

        assertEquals(
            expected = "#goal",
            actual = data.goal?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "preg",
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
            expected = "2013-10-01",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = RequestStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Eve Everywoman",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )
    }
}
