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
import care.data4life.hl7.fhir.r4.codesystem.EncounterLocationStatus
import care.data4life.hl7.fhir.r4.codesystem.EncounterStatus
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * EncounterTest.java
 *
 * An interaction during which services are provided to the patient
 *
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare
 * service(s) or assessing the health status of a patient.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class EncounterFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testEncounter01() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-home.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter01Step01(data: Encounter) {

        assertEquals(
            expected = "HH",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "home health",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "home",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "home",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Client's home",
            actual = data.location?.get(0)?.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#home",
            actual = data.location?.get(0)?.location?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-01-17T16:30:00+10:00",
            actual = data.location?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-01-17T16:00:00+10:00",
            actual = data.location?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterLocationStatus.COMPLETED,
            actual = data.location?.get(0)?.status
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
            actual = data.participant?.get(0)?.individual?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-01-17T16:30:00+10:00",
            actual = data.participant?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-01-17T16:00:00+10:00",
            actual = data.participant?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "2015-01-17T16:30:00+10:00",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-01-17T16:00:00+10:00",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Encounter with patient @example who is at home</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEncounter02() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-f201-20130404.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter02Step01(data: Encounter) {

        assertEquals(
            expected = "AMB",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulatory",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.TEMP,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "Encounter_Roel_20130404",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "Practitioner/f201",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "17621005",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Normal",
            actual = data.priority?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.priority?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The patient had fever peaks over the last couple of days. He is worried about these peaks.",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f201",
            actual = data.serviceProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
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

        assertEquals(
            expected = "11429006",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Consultation",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testEncounter03() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-f003-abscess.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter03Step01(data: Encounter) {

        assertEquals(
            expected = "AMB",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulatory",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "305956004",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Referral by physician",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "306689006",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Discharge to home",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/pre-admissions",
            actual = data.hospitalization?.preAdmissionIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.hospitalization?.preAdmissionIdentifier?.use
        )

        assertEquals(
            expected = "93042",
            actual = data.hospitalization?.preAdmissionIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f003",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/encounters",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "v6751",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.length?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.length?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.length?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "90".toDouble(),
            actual = data.length?.value?.value
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
            expected = "E.M. van den Broek",
            actual = data.participant?.get(0)?.individual?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f001",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "103391001",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Non-urgent ear, nose and throat admission",
            actual = data.priority?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.priority?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "18099001",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Retropharyngeal abscess",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.serviceProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
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

        assertEquals(
            expected = "270427003",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient-initiated encounter",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testEncounter04() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter04Step01(data: Encounter) {

        assertEquals(
            expected = "IMP",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "inpatient encounter",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
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
            expected = EncounterStatus.IN_PROGRESS,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Encounter with patient @example</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEncounter05() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-f002-lung.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter05Step01(data: Encounter) {

        assertEquals(
            expected = "AMB",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulatory",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "305997006",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Referral by radiologist",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "306689006",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Discharge to home",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/pre-admissions",
            actual = data.hospitalization?.preAdmissionIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.hospitalization?.preAdmissionIdentifier?.use
        )

        assertEquals(
            expected = "98682",
            actual = data.hospitalization?.preAdmissionIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f002",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/zorgportal/identifiers/encounters",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "v3251",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.length?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.length?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.length?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "140".toDouble(),
            actual = data.length?.value?.value
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
            expected = "M.I.M Versteegh",
            actual = data.participant?.get(0)?.individual?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f003",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "103391001",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Urgent",
            actual = data.priority?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.priority?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "34068001",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Partial lobectomy of lung",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BMC",
            actual = data.serviceProvider?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.serviceProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
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

        assertEquals(
            expected = "270427003",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient-initiated encounter",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testEncounter06() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-f203-20130311.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter06Step01(data: Encounter) {

        assertEquals(
            expected = "Account/example",
            actual = data.account?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Appointment/example",
            actual = data.appointment?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ServiceRequest/myringotomy",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "IMP",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "inpatient encounter",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/stroke",
            actual = data.diagnosis?.get(0)?.condition?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(0)?.rank?.value
        )

        assertEquals(
            expected = "AD",
            actual = data.diagnosis?.get(0)?.use?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Admission diagnosis",
            actual = data.diagnosis?.get(0)?.use?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            actual = data.diagnosis?.get(0)?.use?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/f201",
            actual = data.diagnosis?.get(1)?.condition?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DD",
            actual = data.diagnosis?.get(1)?.use?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Discharge diagnosis",
            actual = data.diagnosis?.get(1)?.use?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            actual = data.diagnosis?.get(1)?.use?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "EpisodeOfCare/example",
            actual = data.episodeOfCare?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "309902002",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Clinical Oncology Department",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/2",
            actual = data.hospitalization?.destination?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "276026009",
            actual = data.hospitalization?.dietPreference?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fluid balance regulation",
            actual = data.hospitalization?.dietPreference?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.dietPreference?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/2",
            actual = data.hospitalization?.origin?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "readmitted",
            actual = data.hospitalization?.reAdmission?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "wheel",
            actual = data.hospitalization?.specialArrangement?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Wheelchair",
            actual = data.hospitalization?.specialArrangement?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/encounter-special-arrangements",
            actual = data.hospitalization?.specialArrangement?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "NRM",
            actual = data.hospitalization?.specialCourtesy?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "normal courtesy",
            actual = data.hospitalization?.specialCourtesy?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-EncounterSpecialCourtesy",
            actual = data.hospitalization?.specialCourtesy?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f203",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.TEMP,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "Encounter_Roel_20130311",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "Encounter/f203",
            actual = data.partOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f201",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PART",
            actual = data.participant?.get(0)?.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ParticipationType",
            actual = data.participant?.get(0)?.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-03-20",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2013-03-11",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "394849002",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "High priority",
            actual = data.priority?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.priority?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The patient seems to suffer from bilateral pneumonia and renal insufficiency, most likely due to chemotherapy.",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/2",
            actual = data.serviceProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
            actual = data.status
        )

        assertEquals(
            expected = "2013-03-08",
            actual = data.statusHistory?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.ARRIVED,
            actual = data.statusHistory?.get(0)?.status
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

        assertEquals(
            expected = "183807002",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Inpatient stay for nine days",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testEncounter07() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-xcda.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter07Step01(data: Encounter) {

        assertEquals(
            expected = "AMB",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulatory",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "xcda",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://healthcare.example.org/identifiers/enocunter",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "1234213.52345873",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
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
            expected = "Practitioner/xcda1",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "T-D8200",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Arm",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://ihe.net/xds/connectathon/eventCodes",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/xcda",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEncounter08() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-f202-20130128.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter08Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter08Step01(data: Encounter) {

        assertEquals(
            expected = "AMB",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulatory",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Complications from Roel's TPF chemotherapy on January 28th, 2013",
            actual = data.diagnosis?.get(0)?.condition?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.diagnosis?.get(0)?.rank?.value
        )

        assertEquals(
            expected = "AD",
            actual = data.diagnosis?.get(0)?.use?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Admission diagnosis",
            actual = data.diagnosis?.get(0)?.use?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            actual = data.diagnosis?.get(0)?.use?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The patient is treated for a tumor",
            actual = data.diagnosis?.get(1)?.condition?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.diagnosis?.get(1)?.rank?.value
        )

        assertEquals(
            expected = "CC",
            actual = data.diagnosis?.get(1)?.use?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chief complaint",
            actual = data.diagnosis?.get(1)?.use?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/diagnosis-role",
            actual = data.diagnosis?.get(1)?.use?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f202",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.TEMP,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "Encounter_Roel_20130128",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.length?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.length?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "minutes",
            actual = data.length?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "56".toDouble(),
            actual = data.length?.value?.value
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
            expected = "Practitioner/f201",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "103391001",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Urgent",
            actual = data.priority?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.priority?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "The patient is treated for a tumor.",
            actual = data.reasonCode?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f201",
            actual = data.serviceProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
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

        assertEquals(
            expected = "367336001",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chemotherapy",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testEncounter09() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-emerg.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter09Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter09Step01(data: Encounter) {

        assertEquals(
            expected = "EMER",
            actual = data.classHistory?.get(0)?.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "emergency",
            actual = data.classHistory?.get(0)?.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.classHistory?.get(0)?.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T09:27:00+10:00",
            actual = data.classHistory?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T07:15:00+10:00",
            actual = data.classHistory?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "IMP",
            actual = data.classHistory?.get(1)?.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "inpatient encounter",
            actual = data.classHistory?.get(1)?.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.classHistory?.get(1)?.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T09:27:00+10:00",
            actual = data.classHistory?.get(1)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = "IMP",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "inpatient encounter",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "emd",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "From accident/emergency department",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/admit-source",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "emerg",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Emergency Waiting Room",
            actual = data.location?.get(0)?.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T08:45:00+10:00",
            actual = data.location?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T07:15:00+10:00",
            actual = data.location?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterLocationStatus.ACTIVE,
            actual = data.location?.get(0)?.status
        )

        assertEquals(
            expected = "Emergency",
            actual = data.location?.get(1)?.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T09:27:00+10:00",
            actual = data.location?.get(1)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T08:45:00+10:00",
            actual = data.location?.get(1)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterLocationStatus.ACTIVE,
            actual = data.location?.get(1)?.status
        )

        assertEquals(
            expected = "Ward 1, Room 42, Bed 1",
            actual = data.location?.get(2)?.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T12:15:00+10:00",
            actual = data.location?.get(2)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T09:27:00+10:00",
            actual = data.location?.get(2)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterLocationStatus.ACTIVE,
            actual = data.location?.get(2)?.status
        )

        assertEquals(
            expected = "Ward 1, Room 42, Bed 1",
            actual = data.location?.get(3)?.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T12:45:00+10:00",
            actual = data.location?.get(3)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T12:15:00+10:00",
            actual = data.location?.get(3)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterLocationStatus.RESERVED,
            actual = data.location?.get(3)?.status
        )

        assertEquals(
            expected = "Ward 1, Room 42, Bed 1",
            actual = data.location?.get(4)?.location?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-02-01T12:45:00+10:00",
            actual = data.location?.get(4)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterLocationStatus.ACTIVE,
            actual = data.location?.get(4)?.status
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
            expected = "2017-02-01T07:15:00+10:00",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.IN_PROGRESS,
            actual = data.status
        )

        assertEquals(
            expected = "2017-02-01T07:35:00+10:00",
            actual = data.statusHistory?.get(0)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T07:15:00+10:00",
            actual = data.statusHistory?.get(0)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.ARRIVED,
            actual = data.statusHistory?.get(0)?.status
        )

        assertEquals(
            expected = "2017-02-01T08:45:00+10:00",
            actual = data.statusHistory?.get(1)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T07:35:00+10:00",
            actual = data.statusHistory?.get(1)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.TRIAGED,
            actual = data.statusHistory?.get(1)?.status
        )

        assertEquals(
            expected = "2017-02-01T12:15:00+10:00",
            actual = data.statusHistory?.get(2)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T08:45:00+10:00",
            actual = data.statusHistory?.get(2)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.IN_PROGRESS,
            actual = data.statusHistory?.get(2)?.status
        )

        assertEquals(
            expected = "2017-02-01T12:45:00+10:00",
            actual = data.statusHistory?.get(3)?.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-02-01T12:15:00+10:00",
            actual = data.statusHistory?.get(3)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.ONLEAVE,
            actual = data.statusHistory?.get(3)?.status
        )

        assertEquals(
            expected = "2017-02-01T12:45:00+10:00",
            actual = data.statusHistory?.get(4)?.period?.start?.value.toString()
        )

        assertEquals(
            expected = EncounterStatus.IN_PROGRESS,
            actual = data.statusHistory?.get(4)?.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Emergency visit that escalated into inpatient patient @example</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testEncounter10() {
        // Given
        val sourceJson = loadAsString("r4/encounter-example-f001-heart.json")

        // When
        val data = parser.toFhir(Encounter::class, sourceJson)

        // Then
        assertEncounter10Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertEncounter10Step01(data: Encounter) {

        assertEquals(
            expected = "AMB",
            actual = data.clazz?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulatory",
            actual = data.clazz?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActCode",
            actual = data.clazz?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "305956004",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Referral by physician",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.admitSource?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "306689006",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Discharge to home",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.hospitalization?.dischargeDisposition?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.amc.nl/zorgportal/identifiers/pre-admissions",
            actual = data.hospitalization?.preAdmissionIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.hospitalization?.preAdmissionIdentifier?.use
        )

        assertEquals(
            expected = "93042",
            actual = data.hospitalization?.preAdmissionIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "f001",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.amc.nl/zorgportal/identifiers/visits",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "v1451",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.length?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.length?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "min",
            actual = data.length?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "140".toDouble(),
            actual = data.length?.value?.value
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
            expected = "P. Voigt",
            actual = data.participant?.get(0)?.individual?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f002",
            actual = data.participant?.get(0)?.individual?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "310361003",
            actual = data.priority?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Non-urgent cardiological admission",
            actual = data.priority?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.priority?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "34068001",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Heart valve replacement",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Burgers University Medical Center",
            actual = data.serviceProvider?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f001",
            actual = data.serviceProvider?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EncounterStatus.FINISHED,
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

        assertEquals(
            expected = "270427003",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient-initiated encounter",
            actual = data.type?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.type?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
