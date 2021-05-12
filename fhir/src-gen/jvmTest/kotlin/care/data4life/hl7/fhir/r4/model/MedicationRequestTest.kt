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
import kotlin.test.assertEquals

/**
 * MedicationRequestTest.java
 *
 * Ordering of medication for patient or group.
 *
 * An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 *
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationRequestTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicationRequest1() {
        val sourceJson = loadAsString("r4/medicationrequestexample1.json")

        val data = parser.toFhir(MedicationRequest::class, sourceJson)

        assertEquals("2015-01-15", data.authoredOn?.value.toString(),)
        assertEquals("med0316", data.contained?.get(0)?.id)
        assertEquals("d", data.dispenseRequest?.expectedSupplyDuration?.code)
        assertEquals("http://unitsofmeasure.org", data.dispenseRequest?.expectedSupplyDuration?.system)
        assertEquals("days", data.dispenseRequest?.expectedSupplyDuration?.unit)
        assertEquals("30".toDouble(), data.dispenseRequest?.expectedSupplyDuration?.value?.value)
        assertEquals("1".toLong(), data.dispenseRequest?.numberOfRepeatsAllowed?.value)
        assertEquals("TAB", data.dispenseRequest?.quantity?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm", data.dispenseRequest?.quantity?.system)
        assertEquals("TAB", data.dispenseRequest?.quantity?.unit)
        assertEquals("30".toDouble(), data.dispenseRequest?.quantity?.value?.value)
        assertEquals("2016-01-15", data.dispenseRequest?.validityPeriod?.end?.value.toString(),)
        assertEquals("2015-01-15", data.dispenseRequest?.validityPeriod?.start?.value.toString(),)
        assertEquals("311504000", data.dosageInstruction?.get(0)?.additionalInstruction?.get(0)?.coding?.get(0)?.code)
        assertEquals("With or after food", data.dosageInstruction?.get(0)?.additionalInstruction?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosageInstruction?.get(0)?.additionalInstruction?.get(0)?.coding?.get(0)?.system)
        assertEquals("TAB", data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm", data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.system)
        assertEquals("TAB", data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit)
        assertEquals("1".toDouble(), data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value)
        assertEquals("ordered", data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals("Ordered", data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/dose-rate-type", data.dosageInstruction?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system)
        assertEquals("421521009", data.dosageInstruction?.get(0)?.method?.coding?.get(0)?.code)
        assertEquals("Swallow - dosing instruction imperative (qualifier value)", data.dosageInstruction?.get(0)?.method?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosageInstruction?.get(0)?.method?.coding?.get(0)?.system)
        assertEquals("26643006", data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.code)
        assertEquals("Oral Route", data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.system)
        assertEquals("1".toInt(), data.dosageInstruction?.get(0)?.sequence?.value)
        assertEquals("One tablet daily", data.dosageInstruction?.get(0)?.text)
        assertEquals("QD", data.dosageInstruction?.get(0)?.timing?.code?.coding?.get(0)?.code)
        assertEquals("QD", data.dosageInstruction?.get(0)?.timing?.code?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-GTSAbbreviation", data.dosageInstruction?.get(0)?.timing?.code?.coding?.get(0)?.system)
        assertEquals("encounter who leads to this prescription", data.encounter?.display)
        assertEquals("Encounter/f001", data.encounter?.reference)
        assertEquals("medrx0311", data.id)
        assertEquals("http://www.bmc.nl/portal/prescriptions", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("12345689", data.identifier?.get(0)?.value)
        assertEquals(MedicationRequestIntent.ORDER, data.intent)
        assertEquals("#med0316", data.medicationReference?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Chlorthalidone increases urniation so take it in the morning", data.note?.get(0)?.text)
        assertEquals("condition for prescribing this medication", data.reasonReference?.get(0)?.display)
        assertEquals("Condition/f201", data.reasonReference?.get(0)?.reference)
        assertEquals("Patrick Pump", data.requester?.display)
        assertEquals("Practitioner/f007", data.requester?.reference)
        assertEquals(MedicationrequestStatus.ACTIVE, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals("True".toBoolean(), data.substitution?.allowedBoolean?.value)
        assertEquals("CT", data.substitution?.reason?.coding?.get(0)?.code)
        assertEquals("continuing therapy", data.substitution?.reason?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.substitution?.reason?.coding?.get(0)?.system)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testMedicationRequest2() {
        val sourceJson = loadAsString("r4/medicationrequestexample2.json")

        val data = parser.toFhir(MedicationRequest::class, sourceJson)

        assertEquals("2015-03-01", data.authoredOn?.value.toString(),)
        assertEquals("1".toInt(), data.dosageInstruction?.get(0)?.sequence?.value)
        assertEquals("Take one tablet daily as directed", data.dosageInstruction?.get(0)?.text)
        assertEquals("encounter that leads to this prescription", data.encounter?.display)
        assertEquals("Encounter/f001", data.encounter?.reference)
        assertEquals("medrx002", data.id)
        assertEquals("http://www.bmc.nl/portal/prescriptions", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("12345", data.identifier?.get(0)?.value)
        assertEquals(MedicationRequestIntent.ORDER, data.intent)
        assertEquals("prescribed medication", data.medicationReference?.display)
        assertEquals("Medication/med0316", data.medicationReference?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("59621000", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Essential hypertension (disorder)", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals("Patrick Pump", data.requester?.display)
        assertEquals("Practitioner/f007", data.requester?.reference)
        assertEquals(MedicationrequestStatus.ACTIVE, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
