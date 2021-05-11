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


import javax.annotation.Generated

import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

import care.data4life.hl7.fhir.r4.codesystem.*
import care.data4life.hl7.fhir.r4.primitive.*
import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Ignore

import kotlin.test.assertEquals

/**
 * MedicationStatementTest.java
 *
 * Record of medication being taken by a patient.
 *
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains.

The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
 *
 */
@Suppress("UNNECESSARY_SAFE_CALL")
@Generated("Generated from FHIR 4.0.1-9346c8cc45")
class MedicationStatementTest {

    val parser = FhirR4Parser()


    @Test
    fun testMedicationStatement1() {
        val sourceJson = loadAsString("r4/medicationstatementexample5.json")

        val data = parser.toFhir(MedicationStatement::class, sourceJson)


        assertEquals("CarePlan/gpvisit", data.basedOn?.get(0)?.reference)
        assertEquals("Encounter/f203", data.context?.reference)
        assertEquals("2015-02-22", data.dateAsserted?.value.toString(), )
        assertEquals("2014-01-23", data.effectiveDateTime?.value.toString(), )
        assertEquals("example005", data.id)
        assertEquals("Donald Duck", data.informationSource?.display)
        assertEquals("Patient/pat1", data.informationSource?.reference)
        assertEquals("27658006", data.medicationCodeableConcept?.coding?.get(0)?.code)
        assertEquals("Amoxicillin (product)", data.medicationCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.medicationCodeableConcept?.coding?.get(0)?.system)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Patient indicated that they thought it was Amoxicillin they were taking but it was really Erythromycin", data.note?.get(0)?.text)
        assertEquals(MedicationStatementStatusCodes.ENTERED_IN_ERROR, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testMedicationStatement2() {
        val sourceJson = loadAsString("r4/medicationstatementexample4.json")

        val data = parser.toFhir(MedicationStatement::class, sourceJson)


        assertEquals("2015-02-22", data.dateAsserted?.value.toString(), )
        assertEquals("False".toBoolean(), data.dosage?.get(0)?.asNeededBoolean?.value)
        assertEquals("d", data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.code)
        assertEquals("http://unitsofmeasure.org", data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.system)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.value?.value)
        assertEquals("385055001", data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.code)
        assertEquals("http://snomed.info/sct", data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.system)
        assertEquals("capsules", data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.unit)
        assertEquals("3".toDouble(), data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.value?.value)
        assertEquals("260548002", data.dosage?.get(0)?.route?.coding?.get(0)?.code)
        assertEquals("Oral", data.dosage?.get(0)?.route?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosage?.get(0)?.route?.coding?.get(0)?.system)
        assertEquals("one capsule three times daily", data.dosage?.get(0)?.text)
        assertEquals("3".toLong(), data.dosage?.get(0)?.timing?.repeat?.frequency?.value)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.timing?.repeat?.period?.value)
        assertEquals("d", data.dosage?.get(0)?.timing?.repeat?.periodUnit)
        assertEquals("2014-01-23", data.effectiveDateTime?.value.toString(), )
        assertEquals("example004", data.id)
        assertEquals("Donald Duck", data.informationSource?.display)
        assertEquals("Patient/pat1", data.informationSource?.reference)
        assertEquals("27658006", data.medicationCodeableConcept?.coding?.get(0)?.code)
        assertEquals("Amoxicillin (product)", data.medicationCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.medicationCodeableConcept?.coding?.get(0)?.system)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Patient indicates they miss the occasional dose", data.note?.get(0)?.text)
        assertEquals("Observation/blood-pressure", data.partOf?.get(0)?.reference)
        assertEquals("65363002", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Otitis Media", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals(MedicationStatementStatusCodes.ACTIVE, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testMedicationStatement3() {
        val sourceJson = loadAsString("r4/medicationstatementexample3.json")

        val data = parser.toFhir(MedicationStatement::class, sourceJson)


        assertEquals("2014-02-22", data.dateAsserted?.value.toString(), )
        assertEquals("False".toBoolean(), data.dosage?.get(0)?.asNeededBoolean?.value)
        assertEquals("tab", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.system)
        assertEquals("tab", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value)
        assertEquals("ordered", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals("Ordered", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/dose-rate-type", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system)
        assertEquals("d", data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.code)
        assertEquals("http://unitsofmeasure.org", data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.system)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.value?.value)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.value?.value)
        assertEquals("260548002", data.dosage?.get(0)?.route?.coding?.get(0)?.code)
        assertEquals("Oral", data.dosage?.get(0)?.route?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosage?.get(0)?.route?.coding?.get(0)?.system)
        assertEquals("1".toInt(), data.dosage?.get(0)?.sequence?.value)
        assertEquals("1 tablet per day", data.dosage?.get(0)?.text)
        assertEquals("2014-02-01", data.effectiveDateTime?.value.toString(), )
        assertEquals("example003", data.id)
        assertEquals("Donald Duck", data.informationSource?.display)
        assertEquals("Patient/pat1", data.informationSource?.reference)
        assertEquals("Little Pink Pill for water retention", data.medicationCodeableConcept?.text)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Patient cannot remember the name of the tablet, but takes it every day in the morning for water retention", data.note?.get(0)?.text)
        assertEquals("Observation/blood-pressure", data.reasonReference?.get(0)?.reference)
        assertEquals(MedicationStatementStatusCodes.ACTIVE, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testMedicationStatement4() {
        val sourceJson = loadAsString("r4/medicationstatementexample2.json")

        val data = parser.toFhir(MedicationStatement::class, sourceJson)


        assertEquals("med0309", data.contained?.get(0)?.id)
        assertEquals("2015-02-22", data.dateAsserted?.value.toString(), )
        assertEquals("2015-01-23", data.effectiveDateTime?.value.toString(), )
        assertEquals("example002", data.id)
        assertEquals("Donald Duck", data.informationSource?.display)
        assertEquals("Patient/pat1", data.informationSource?.reference)
        assertEquals("#med0309", data.medicationReference?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Patient cannot take acetaminophen as per Dr instructions", data.note?.get(0)?.text)
        assertEquals(MedicationStatementStatusCodes.ACTIVE, data.status)
        assertEquals("166643006", data.statusReason?.get(0)?.coding?.get(0)?.code)
        assertEquals("Liver enzymes abnormal", data.statusReason?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.statusReason?.get(0)?.coding?.get(0)?.system)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testMedicationStatement5() {
        val sourceJson = loadAsString("r4/medicationstatementexample1.json")

        val data = parser.toFhir(MedicationStatement::class, sourceJson)


        assertEquals("inpatient", data.category?.coding?.get(0)?.code)
        assertEquals("Inpatient", data.category?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/medication-statement-category", data.category?.coding?.get(0)?.system)
        assertEquals("med0309", data.contained?.get(0)?.id)
        assertEquals("2015-02-22", data.dateAsserted?.value.toString(), )
        assertEquals("MedicationRequest/medrx002", data.derivedFrom?.get(0)?.reference)
        assertEquals("Taking at bedtime", data.dosage?.get(0)?.additionalInstruction?.get(0)?.text)
        assertEquals("32914008", data.dosage?.get(0)?.asNeededCodeableConcept?.coding?.get(0)?.code)
        assertEquals("Restless Legs", data.dosage?.get(0)?.asNeededCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosage?.get(0)?.asNeededCodeableConcept?.coding?.get(0)?.system)
        assertEquals("TAB", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.system)
        assertEquals("TAB", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.unit)
        assertEquals("2".toDouble(), data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.value?.value)
        assertEquals("TAB", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.code)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.system)
        assertEquals("TAB", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.unit)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.value?.value)
        assertEquals("ordered", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals("Ordered", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/dose-rate-type", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system)
        assertEquals("26643006", data.dosage?.get(0)?.route?.coding?.get(0)?.code)
        assertEquals("Oral Route", data.dosage?.get(0)?.route?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosage?.get(0)?.route?.coding?.get(0)?.system)
        assertEquals("1".toInt(), data.dosage?.get(0)?.sequence?.value)
        assertEquals("1-2 tablets once daily at bedtime as needed for restless legs", data.dosage?.get(0)?.text)
        assertEquals("1".toLong(), data.dosage?.get(0)?.timing?.repeat?.frequency?.value)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.timing?.repeat?.period?.value)
        assertEquals("d", data.dosage?.get(0)?.timing?.repeat?.periodUnit)
        assertEquals("2015-01-23", data.effectiveDateTime?.value.toString(), )
        assertEquals("example001", data.id)
        assertEquals("http://www.bmc.nl/portal/medstatements", data.identifier?.get(0)?.system)
        assertEquals(IdentifierUse.OFFICIAL, data.identifier?.get(0)?.use)
        assertEquals("12345689", data.identifier?.get(0)?.value)
        assertEquals("Donald Duck", data.informationSource?.display)
        assertEquals("Patient/pat1", data.informationSource?.reference)
        assertEquals("#med0309", data.medicationReference?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Patient indicates they miss the occasional dose", data.note?.get(0)?.text)
        assertEquals("32914008", data.reasonCode?.get(0)?.coding?.get(0)?.code)
        assertEquals("Restless Legs", data.reasonCode?.get(0)?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.reasonCode?.get(0)?.coding?.get(0)?.system)
        assertEquals(MedicationStatementStatusCodes.ACTIVE, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testMedicationStatement6() {
        val sourceJson = loadAsString("r4/medicationstatementexample7.json")

        val data = parser.toFhir(MedicationStatement::class, sourceJson)


        assertEquals("med0315", data.contained?.get(0)?.id)
        assertEquals("example007", data.id)
        assertEquals("Donald Duck", data.informationSource?.display)
        assertEquals("Patient/pat1", data.informationSource?.reference)
        assertEquals("#med0315", data.medicationReference?.reference)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("patient plans to start using for seasonal allergies in the Spring when pollen is in the air", data.note?.get(0)?.text)
        assertEquals(MedicationStatementStatusCodes.ACTIVE, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
    @Test
    fun testMedicationStatement7() {
        val sourceJson = loadAsString("r4/medicationstatementexample6.json")

        val data = parser.toFhir(MedicationStatement::class, sourceJson)


        assertEquals("2014-02-22", data.dateAsserted?.value.toString(), )
        assertEquals("False".toBoolean(), data.dosage?.get(0)?.asNeededBoolean?.value)
        assertEquals("mL", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.code)
        assertEquals("http://unitsofmeasure.org", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.system)
        assertEquals("mL", data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit)
        assertEquals("5".toDouble(), data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value)
        assertEquals("ordered", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code)
        assertEquals("Ordered", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/dose-rate-type", data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system)
        assertEquals("d", data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.code)
        assertEquals("http://unitsofmeasure.org", data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.system)
        assertEquals("1".toDouble(), data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.value?.value)
        assertEquals("3".toDouble(), data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.value?.value)
        assertEquals("260548002", data.dosage?.get(0)?.route?.coding?.get(0)?.code)
        assertEquals("Oral", data.dosage?.get(0)?.route?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.dosage?.get(0)?.route?.coding?.get(0)?.system)
        assertEquals("1".toInt(), data.dosage?.get(0)?.sequence?.value)
        assertEquals("5ml three times daily", data.dosage?.get(0)?.text)
        assertEquals("2014-02-01", data.effectiveDateTime?.value.toString(), )
        assertEquals("example006", data.id)
        assertEquals("Peter Chalmers", data.informationSource?.display)
        assertEquals("RelatedPerson/peter", data.informationSource?.reference)
        assertEquals("27658006", data.medicationCodeableConcept?.coding?.get(0)?.code)
        assertEquals("Amoxicillin (product)", data.medicationCodeableConcept?.coding?.get(0)?.display)
        assertEquals("http://snomed.info/sct", data.medicationCodeableConcept?.coding?.get(0)?.system)
        assertEquals("HTEST", data.meta?.tag?.get(0)?.code)
        assertEquals("test health data", data.meta?.tag?.get(0)?.display)
        assertEquals("http://terminology.hl7.org/CodeSystem/v3-ActReason", data.meta?.tag?.get(0)?.system)
        assertEquals("Father indicates they miss the occasional dose", data.note?.get(0)?.text)
        assertEquals(MedicationStatementStatusCodes.ACTIVE, data.status)
        assertEquals("Donald Duck", data.subject?.display)
        assertEquals("Patient/pat1", data.subject?.reference)
        assertEquals(NarrativeStatus.GENERATED, data.text?.status)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
