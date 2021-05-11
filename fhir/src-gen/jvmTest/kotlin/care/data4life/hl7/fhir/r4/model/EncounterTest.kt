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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * EncounterTest.java
 *
 * An interaction during which services are provided to the patient.
 *
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 4.0.1-9346c8cc45")
class EncounterTest {

    val parser = FhirR4Parser()

    @Test
    fun testEncounter1() {
        val sourceJson = loadAsString("r4/encounter-example-home.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("HH", data.clazz?.code)
        assertEquals("home health", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("home", data.contained?.get(0)?.id)
        assertEquals("home", data.id)
        assertEquals("Client's home", data.location?.get(0)?.location?.display)
        assertEquals("#home", data.location?.get(0)?.location?.reference)
        assertEquals("2015-01-17T16:30:00+10:00", data.location?.get(0)?.period?.end?.value.toString(),)
        assertEquals("2015-01-17T16:00:00+10:00", data.location?.get(0)?.period?.start?.value.toString(),)
        assertEquals(EncounterLocationStatus.COMPLETED, data.location?.get(0)?.status)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Dr Adam Careful", data.participant?.get(0)?.individual?.display)
        assertEquals("Practitioner/example", data.participant?.get(0)?.individual?.reference)
        assertEquals("2015-01-17T16:30:00+10:00", data.participant?.get(0)?.period?.end?.value.toString(),)
        assertEquals("2015-01-17T16:00:00+10:00", data.participant?.get(0)?.period?.start?.value.toString(),)
        assertEquals("2015-01-17T16:30:00+10:00", data.period?.end?.value.toString(),)
        assertEquals("2015-01-17T16:00:00+10:00", data.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Encounter with patient @example who is at home</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter2() {
        val sourceJson = loadAsString("r4/encounter-example-f201-20130404.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("AMB", data.clazz?.code)
        assertEquals("ambulatory", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("f201", data.id)
        assertEquals(IdentifierUse.TEMP, data.identifier?.get(0)?.use)
        assertEquals("Encounter_Roel_20130404", data.identifier?.get(0)?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Practitioner/f201", data.participant?.get(0)?.individual?.reference)
        assertEquals("17621005", data.priority?.coding?.get(0)?.code)
        assertEquals("Normal", data.priority?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.priority?.coding?.get(0)?.system)
        assertEquals("The patient had fever peaks over the last couple of days. He is worried about these peaks.", data.reasonCode?.get(0)?.text)
        assertEquals("Organization/f201", data.serviceProvider?.reference)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("11429006", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Consultation", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter3() {
        val sourceJson = loadAsString("r4/encounter-example-f003-abscess.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("AMB", data.clazz?.code)
        assertEquals("ambulatory", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("305956004", data.hospitalization?.admitSource?.coding?.get(0)?.code)
        assertEquals("Referral by physician", data.hospitalization?.admitSource?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.admitSource?.coding?.get(0)?.system)
        assertEquals("306689006", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.code)
        assertEquals("Discharge to home", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.system)
        assertEquals("http://www.bmc.nl/zorgportal/identifiers/pre-admissions", data.hospitalization?.preAdmissionIdentifier?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.hospitalization?.preAdmissionIdentifier?.use)
        assertEquals("93042", data.hospitalization?.preAdmissionIdentifier?.value)
        assertEquals("f003", data.id)
        assertEquals("http://www.bmc.nl/zorgportal/identifiers/encounters", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("v6751", data.identifier?.get(0)?.value)
        assertEquals("min", data.length?.code)
        assertEquals("http://unitsofmeasure.org", data.length?.system)
        assertEquals("min", data.length?.unit)
        assertEquals("90".toDouble(), data.length?.value?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("E.M. van den Broek", data.participant?.get(0)?.individual?.display)
        assertEquals("Practitioner/f001", data.participant?.get(0)?.individual?.reference)
        assertEquals("103391001", data.priority?.coding?.get(0)?.code)
        assertEquals("Non-urgent ear, nose and throat admission", data.priority?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.priority?.coding?.get(0)?.system)
        assertEquals("18099001", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Retropharyngeal abscess", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals("Organization/f001", data.serviceProvider?.reference)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("270427003", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Patient-initiated encounter", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter4() {
        val sourceJson = loadAsString("r4/encounter-example.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("IMP", data.clazz?.code)
        assertEquals("inpatient encounter", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("example", data.id)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals(EncounterStatus.IN_PROGRESS, data.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Encounter with patient @example</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter5() {
        val sourceJson = loadAsString("r4/encounter-example-f002-lung.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("AMB", data.clazz?.code)
        assertEquals("ambulatory", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("305997006", data.hospitalization?.admitSource?.coding?.get(0)?.code)
        assertEquals("Referral by radiologist", data.hospitalization?.admitSource?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.admitSource?.coding?.get(0)?.system)
        assertEquals("306689006", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.code)
        assertEquals("Discharge to home", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.system)
        assertEquals("http://www.bmc.nl/zorgportal/identifiers/pre-admissions", data.hospitalization?.preAdmissionIdentifier?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.hospitalization?.preAdmissionIdentifier?.use)
        assertEquals("98682", data.hospitalization?.preAdmissionIdentifier?.value)
        assertEquals("f002", data.id)
        assertEquals("http://www.bmc.nl/zorgportal/identifiers/encounters", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("v3251", data.identifier?.get(0)?.value)
        assertEquals("min", data.length?.code)
        assertEquals("http://unitsofmeasure.org", data.length?.system)
        assertEquals("min", data.length?.unit)
        assertEquals("140".toDouble(), data.length?.value?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("M.I.M Versteegh", data.participant?.get(0)?.individual?.display)
        assertEquals("Practitioner/f003", data.participant?.get(0)?.individual?.reference)
        assertEquals("103391001", data.priority?.coding?.get(0)?.code)
        assertEquals("Urgent", data.priority?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.priority?.coding?.get(0)?.system)
        assertEquals("34068001", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Partial lobectomy of lung", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals("BMC", data.serviceProvider?.display)
        assertEquals("Organization/f001", data.serviceProvider?.reference)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("270427003", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Patient-initiated encounter", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter6() {
        val sourceJson = loadAsString("r4/encounter-example-f203-20130311.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("Account/example", data.account?.get(0)?.reference)
        assertEquals("Appointment/example", data.appointment?.get(0)?.reference)
        assertEquals("ServiceRequest/myringotomy", data.basedOn?.get(0)?.reference)
        assertEquals("IMP", data.clazz?.code)
        assertEquals("inpatient encounter", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("Condition/stroke", data.diagnosis?.get(0)?.condition?.reference)
        assertEquals("1".toLong(), data.diagnosis?.get(0)?.rank?.value)
        assertEquals("AD", data.diagnosis?.get(0)?.use?.coding?.get(0)?.code)
        assertEquals("Admission diagnosis", data.diagnosis?.get(0)?.use?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/diagnosis-role", data.diagnosis?.get(0)?.use?.coding?.get(0)?.system)
        assertEquals("Condition/f201", data.diagnosis?.get(1)?.condition?.reference)
        assertEquals("DD", data.diagnosis?.get(1)?.use?.coding?.get(0)?.code)
        assertEquals("Discharge diagnosis", data.diagnosis?.get(1)?.use?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/diagnosis-role", data.diagnosis?.get(1)?.use?.coding?.get(0)?.system)
        assertEquals("EpisodeOfCare/example", data.episodeOfCare?.get(0)?.reference)
        assertEquals("309902002", data.hospitalization?.admitSource?.coding?.get(0)?.code)
        assertEquals("Clinical Oncology Department", data.hospitalization?.admitSource?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.admitSource?.coding?.get(0)?.system)
        assertEquals("Location/2", data.hospitalization?.destination?.reference)
        assertEquals("276026009", data.hospitalization?.dietPreference?.get(0)?.coding?.get(0)?.code)
        assertEquals("Fluid balance regulation", data.hospitalization?.dietPreference?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.dietPreference?.get(0)?.coding?.get(0)?.system)
        assertEquals("Location/2", data.hospitalization?.origin?.reference)
        assertEquals("readmitted", data.hospitalization?.reAdmission?.coding?.get(0)?.display)
        assertEquals("wheel", data.hospitalization?.specialArrangement?.get(0)?.coding?.get(0)?.code)
        assertEquals("Wheelchair", data.hospitalization?.specialArrangement?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/encounter-special-arrangements", data.hospitalization?.specialArrangement?.get(0)?.coding?.get(0)?.system)
        assertEquals("NRM", data.hospitalization?.specialCourtesy?.get(0)?.coding?.get(0)?.code)
        assertEquals("normal courtesy", data.hospitalization?.specialCourtesy?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-EncounterSpecialCourtesy", data.hospitalization?.specialCourtesy?.get(0)?.coding?.get(0)?.system)
        assertEquals("f203", data.id)
        assertEquals(IdentifierUse.TEMP, data.identifier?.get(0)?.use)
        assertEquals("Encounter_Roel_20130311", data.identifier?.get(0)?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Encounter/f203", data.partOf?.reference)
        assertEquals("Practitioner/f201", data.participant?.get(0)?.individual?.reference)
        assertEquals("PART", data.participant?.get(0)?.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ParticipationType", data.participant?.get(0)?.type?.get(0)?.coding?.get(0)?.system)
        assertEquals("2013-03-20", data.period?.end?.value.toString(),)
        assertEquals("2013-03-11", data.period?.start?.value.toString(),)
        assertEquals("394849002", data.priority?.coding?.get(0)?.code)
        assertEquals("High priority", data.priority?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.priority?.coding?.get(0)?.system)
        assertEquals("The patient seems to suffer from bilateral pneumonia and renal insufficiency, most likely due to chemotherapy.", data.reasonCode?.get(0)?.text)
        assertEquals("Organization/2", data.serviceProvider?.reference)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("2013-03-08", data.statusHistory?.get(0)?.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.ARRIVED, data.statusHistory?.get(0)?.status)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("183807002", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Inpatient stay for nine days", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter7() {
        val sourceJson = loadAsString("r4/encounter-example-xcda.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("AMB", data.clazz?.code)
        assertEquals("ambulatory", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("xcda", data.id)
        assertEquals("http://healthcare.example.org/identifiers/enocunter", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("1234213.52345873", data.identifier?.get(0)?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Practitioner/xcda1", data.participant?.get(0)?.individual?.reference)
        assertEquals("T-D8200", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Arm", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://ihe.net/xds/connectathon/eventCodes", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("Patient/xcda", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter8() {
        val sourceJson = loadAsString("r4/encounter-example-f202-20130128.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("AMB", data.clazz?.code)
        assertEquals("ambulatory", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("Complications from Roel's TPF chemotherapy on January 28th, 2013", data.diagnosis?.get(0)?.condition?.display)
        assertEquals("2".toLong(), data.diagnosis?.get(0)?.rank?.value)
        assertEquals("AD", data.diagnosis?.get(0)?.use?.coding?.get(0)?.code)
        assertEquals("Admission diagnosis", data.diagnosis?.get(0)?.use?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/diagnosis-role", data.diagnosis?.get(0)?.use?.coding?.get(0)?.system)
        assertEquals("The patient is treated for a tumor", data.diagnosis?.get(1)?.condition?.display)
        assertEquals("1".toLong(), data.diagnosis?.get(1)?.rank?.value)
        assertEquals("CC", data.diagnosis?.get(1)?.use?.coding?.get(0)?.code)
        assertEquals("Chief complaint", data.diagnosis?.get(1)?.use?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/diagnosis-role", data.diagnosis?.get(1)?.use?.coding?.get(0)?.system)
        assertEquals("f202", data.id)
        assertEquals(IdentifierUse.TEMP, data.identifier?.get(0)?.use)
        assertEquals("Encounter_Roel_20130128", data.identifier?.get(0)?.value)
        assertEquals("min", data.length?.code)
        assertEquals("http://unitsofmeasure.org", data.length?.system)
        assertEquals("minutes", data.length?.unit)
        assertEquals("56".toDouble(), data.length?.value?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Practitioner/f201", data.participant?.get(0)?.individual?.reference)
        assertEquals("103391001", data.priority?.coding?.get(0)?.code)
        assertEquals("Urgent", data.priority?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.priority?.coding?.get(0)?.system)
        assertEquals("The patient is treated for a tumor.", data.reasonCode?.get(0)?.text)
        assertEquals("Organization/f201", data.serviceProvider?.reference)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("Roel", data.subject?.display)
        assertEquals("Patient/f201", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("367336001", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Chemotherapy", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter9() {
        val sourceJson = loadAsString("r4/encounter-example-emerg.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("EMER", data.classHistory?.get(0)?.clazz?.code)
        assertEquals("emergency", data.classHistory?.get(0)?.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.classHistory?.get(0)?.clazz?.system)
        assertEquals("2017-02-01T09:27:00+10:00", data.classHistory?.get(0)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T07:15:00+10:00", data.classHistory?.get(0)?.period?.start?.value.toString(),)
        assertEquals("IMP", data.classHistory?.get(1)?.clazz?.code)
        assertEquals("inpatient encounter", data.classHistory?.get(1)?.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.classHistory?.get(1)?.clazz?.system)
        assertEquals("2017-02-01T09:27:00+10:00", data.classHistory?.get(1)?.period?.start?.value.toString(),)
        assertEquals("IMP", data.clazz?.code)
        assertEquals("inpatient encounter", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("emd", data.hospitalization?.admitSource?.coding?.get(0)?.code)
        assertEquals("From accident/emergency department", data.hospitalization?.admitSource?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/admit-source", data.hospitalization?.admitSource?.coding?.get(0)?.system)
        assertEquals("emerg", data.id)
        assertEquals("Emergency Waiting Room", data.location?.get(0)?.location?.display)
        assertEquals("2017-02-01T08:45:00+10:00", data.location?.get(0)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T07:15:00+10:00", data.location?.get(0)?.period?.start?.value.toString(),)
        assertEquals(EncounterLocationStatus.ACTIVE, data.location?.get(0)?.status)
        assertEquals("Emergency", data.location?.get(1)?.location?.display)
        assertEquals("2017-02-01T09:27:00+10:00", data.location?.get(1)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T08:45:00+10:00", data.location?.get(1)?.period?.start?.value.toString(),)
        assertEquals(EncounterLocationStatus.ACTIVE, data.location?.get(1)?.status)
        assertEquals("Ward 1, Room 42, Bed 1", data.location?.get(2)?.location?.display)
        assertEquals("2017-02-01T12:15:00+10:00", data.location?.get(2)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T09:27:00+10:00", data.location?.get(2)?.period?.start?.value.toString(),)
        assertEquals(EncounterLocationStatus.ACTIVE, data.location?.get(2)?.status)
        assertEquals("Ward 1, Room 42, Bed 1", data.location?.get(3)?.location?.display)
        assertEquals("2017-02-01T12:45:00+10:00", data.location?.get(3)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T12:15:00+10:00", data.location?.get(3)?.period?.start?.value.toString(),)
        assertEquals(EncounterLocationStatus.RESERVED, data.location?.get(3)?.status)
        assertEquals("Ward 1, Room 42, Bed 1", data.location?.get(4)?.location?.display)
        assertEquals("2017-02-01T12:45:00+10:00", data.location?.get(4)?.period?.start?.value.toString(),)
        assertEquals(EncounterLocationStatus.ACTIVE, data.location?.get(4)?.status)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("2017-02-01T07:15:00+10:00", data.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.IN_PROGRESS, data.status)
        assertEquals("2017-02-01T07:35:00+10:00", data.statusHistory?.get(0)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T07:15:00+10:00", data.statusHistory?.get(0)?.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.ARRIVED, data.statusHistory?.get(0)?.status)
        assertEquals("2017-02-01T08:45:00+10:00", data.statusHistory?.get(1)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T07:35:00+10:00", data.statusHistory?.get(1)?.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.TRIAGED, data.statusHistory?.get(1)?.status)
        assertEquals("2017-02-01T12:15:00+10:00", data.statusHistory?.get(2)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T08:45:00+10:00", data.statusHistory?.get(2)?.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.IN_PROGRESS, data.statusHistory?.get(2)?.status)
        assertEquals("2017-02-01T12:45:00+10:00", data.statusHistory?.get(3)?.period?.end?.value.toString(),)
        assertEquals("2017-02-01T12:15:00+10:00", data.statusHistory?.get(3)?.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.ONLEAVE, data.statusHistory?.get(3)?.status)
        assertEquals("2017-02-01T12:45:00+10:00", data.statusHistory?.get(4)?.period?.start?.value.toString(),)
        assertEquals(EncounterStatus.IN_PROGRESS, data.statusHistory?.get(4)?.status)
        assertEquals("Patient/example", data.subject?.reference)
        assertEquals("<div xmlns=\"http://www.w3.org/1999/xhtml\">Emergency visit that escalated into inpatient patient @example</div>", data.text?.div)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testEncounter10() {
        val sourceJson = loadAsString("r4/encounter-example-f001-heart.json")

        val data = parser.toFhir(Encounter::class, sourceJson)

        assertEquals("AMB", data.clazz?.code)
        assertEquals("ambulatory", data.clazz?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActCode", data.clazz?.system)
        assertEquals("305956004", data.hospitalization?.admitSource?.coding?.get(0)?.code)
        assertEquals("Referral by physician", data.hospitalization?.admitSource?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.admitSource?.coding?.get(0)?.system)
        assertEquals("306689006", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.code)
        assertEquals("Discharge to home", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.hospitalization?.dischargeDisposition?.coding?.get(0)?.system)
        assertEquals("http://www.amc.nl/zorgportal/identifiers/pre-admissions", data.hospitalization?.preAdmissionIdentifier?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.hospitalization?.preAdmissionIdentifier?.use)
        assertEquals("93042", data.hospitalization?.preAdmissionIdentifier?.value)
        assertEquals("f001", data.id)
        assertEquals("http://www.amc.nl/zorgportal/identifiers/visits", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("v1451", data.identifier?.get(0)?.value)
        assertEquals("min", data.length?.code)
        assertEquals("http://unitsofmeasure.org", data.length?.system)
        assertEquals("min", data.length?.unit)
        assertEquals("140".toDouble(), data.length?.value?.value)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("P. Voigt", data.participant?.get(0)?.individual?.display)
        assertEquals("Practitioner/f002", data.participant?.get(0)?.individual?.reference)
        assertEquals("310361003", data.priority?.coding?.get(0)?.code)
        assertEquals("Non-urgent cardiological admission", data.priority?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.priority?.coding?.get(0)?.system)
        assertEquals("34068001", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Heart valve replacement", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals("Burgers University Medical Center", data.serviceProvider?.display)
        assertEquals("Organization/f001", data.serviceProvider?.reference)
        assertEquals(EncounterStatus.FINISHED, data.status)
        assertEquals("P. van de Heuvel", data.subject?.display)
        assertEquals("Patient/f001", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)
        assertEquals("270427003", data.type?.get(0)?.coding?.get(0)?.code)
        assertEquals("Patient-initiated encounter", data.type?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.type?.get(0)?.coding?.get(0)?.system)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
