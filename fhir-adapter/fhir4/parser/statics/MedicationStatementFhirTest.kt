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
import care.data4life.hl7.fhir.r4.codesystem.MedicationStatementStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicationStatementTest.java
 *
 * Record of medication being taken by a patient
 *
 * A record of a medication that is being consumed by a patient. A MedicationStatement may indicate
 * that the patient may be taking the medication now or has taken the medication in the past or will be
 * taking the medication in the future. The source of this information can be the patient, significant
 * other (such as a family member or spouse), or a clinician. A common scenario where this information
 * is captured is during the history taking process during a patient visit or stay. The medication
 * information may come from sources such as the patient's memory, from a prescription bottle, or from
 * a list of medications the patient, clinician or other party maintains.   The primary difference
 * between a medication statement and a medication administration is that the medication administration
 * has complete administration information and is based on actual administration information from the
 * person who administered the medication. A medication statement is often, if not always, less
 * specific. There is no required date/time when the medication was administered, in fact we only know
 * that a source has reported the patient is taking this medication, where details such as time,
 * quantity, or rate or even medication product may be incomplete or missing or less precise. As stated
 * earlier, the medication statement information may come from the patient's memory, from a
 * prescription bottle or from a list of medications the patient, clinician or other party maintains.
 * Medication administration is more formal and is not missing detailed information.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationStatementFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testMedicationStatement01() {
        // Given
        val sourceJson = loadAsString("r4/medicationstatementexample5.json")

        // When
        val data = parser.toFhir(MedicationStatement::class, sourceJson)

        // Then
        assertMedicationStatement01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationStatement01Step01(data: MedicationStatement) {

        assertEquals(
            expected = "CarePlan/gpvisit",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/f203",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-22",
            actual = data.dateAsserted?.value.toString()
        )

        assertEquals(
            expected = "2014-01-23",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example005",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.informationSource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.informationSource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "27658006",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Amoxicillin (product)",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.system
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
            expected = "Patient indicated that they thought it was Amoxicillin they were taking but it was really Erythromycin",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationStatementStatusCodes.ENTERED_IN_ERROR,
            actual = data.status
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedicationStatement02() {
        // Given
        val sourceJson = loadAsString("r4/medicationstatementexample4.json")

        // When
        val data = parser.toFhir(MedicationStatement::class, sourceJson)

        // Then
        assertMedicationStatement02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationStatement02Step01(data: MedicationStatement) {

        assertEquals(
            expected = "2015-02-22",
            actual = data.dateAsserted?.value.toString()
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.dosage?.get(0)?.asNeededBoolean?.value
        )

        assertEquals(
            expected = "d",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.value?.value
        )

        assertEquals(
            expected = "385055001",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "capsules",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toDouble(),
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.value?.value
        )

        assertEquals(
            expected = "260548002",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oral",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "one capsule three times daily",
            actual = data.dosage?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.dosage?.get(0)?.timing?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.timing?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.dosage?.get(0)?.timing?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-01-23",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example004",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.informationSource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.informationSource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "27658006",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Amoxicillin (product)",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.system
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
            expected = "Patient indicates they miss the occasional dose",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/blood-pressure",
            actual = data.partOf?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "65363002",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Otitis Media",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationStatementStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedicationStatement03() {
        // Given
        val sourceJson = loadAsString("r4/medicationstatementexample3.json")

        // When
        val data = parser.toFhir(MedicationStatement::class, sourceJson)

        // Then
        assertMedicationStatement03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationStatement03Step01(data: MedicationStatement) {

        assertEquals(
            expected = "2014-02-22",
            actual = data.dateAsserted?.value.toString()
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.dosage?.get(0)?.asNeededBoolean?.value
        )

        assertEquals(
            expected = "tab",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "tab",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value
        )

        assertEquals(
            expected = "ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/dose-rate-type",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "d",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.value?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.value?.value
        )

        assertEquals(
            expected = "260548002",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oral",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.dosage?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "1 tablet per day",
            actual = data.dosage?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-02-01",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example003",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.informationSource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.informationSource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Little Pink Pill for water retention",
            actual = data.medicationCodeableConcept?.text
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
            expected = "Patient cannot remember the name of the tablet, but takes it every day in the morning for water retention",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/blood-pressure",
            actual = data.reasonReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationStatementStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedicationStatement04() {
        // Given
        val sourceJson = loadAsString("r4/medicationstatementexample2.json")

        // When
        val data = parser.toFhir(MedicationStatement::class, sourceJson)

        // Then
        assertMedicationStatement04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationStatement04Step01(data: MedicationStatement) {

        assertEquals(
            expected = "med0309",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-22",
            actual = data.dateAsserted?.value.toString()
        )

        assertEquals(
            expected = "2015-01-23",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example002",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.informationSource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.informationSource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#med0309",
            actual = data.medicationReference?.reference
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
            expected = "Patient cannot take acetaminophen as per Dr instructions",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationStatementStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "166643006",
            actual = data.statusReason?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Liver enzymes abnormal",
            actual = data.statusReason?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.statusReason?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedicationStatement05() {
        // Given
        val sourceJson = loadAsString("r4/medicationstatementexample1.json")

        // When
        val data = parser.toFhir(MedicationStatement::class, sourceJson)

        // Then
        assertMedicationStatement05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationStatement05Step01(data: MedicationStatement) {

        assertEquals(
            expected = "inpatient",
            actual = data.category?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Inpatient",
            actual = data.category?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/medication-statement-category",
            actual = data.category?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "med0309",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-22",
            actual = data.dateAsserted?.value.toString()
        )

        assertEquals(
            expected = "MedicationRequest/medrx002",
            actual = data.derivedFrom?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Taking at bedtime",
            actual = data.dosage?.get(0)?.additionalInstruction?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "32914008",
            actual = data.dosage?.get(0)?.asNeededCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Restless Legs",
            actual = data.dosage?.get(0)?.asNeededCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosage?.get(0)?.asNeededCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toDouble(),
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.high?.value?.value
        )

        assertEquals(
            expected = "TAB",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-orderableDrugForm",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseRange?.low?.value?.value
        )

        assertEquals(
            expected = "ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/dose-rate-type",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "26643006",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oral Route",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.dosage?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "1-2 tablets once daily at bedtime as needed for restless legs",
            actual = data.dosage?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.dosage?.get(0)?.timing?.repeat?.frequency?.value
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.timing?.repeat?.period?.value
        )

        assertEquals(
            expected = "d",
            actual = data.dosage?.get(0)?.timing?.repeat?.periodUnit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-01-23",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example001",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/portal/medstatements",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "12345689",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.informationSource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.informationSource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#med0309",
            actual = data.medicationReference?.reference
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
            expected = "Patient indicates they miss the occasional dose",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "32914008",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Restless Legs",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationStatementStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedicationStatement06() {
        // Given
        val sourceJson = loadAsString("r4/medicationstatementexample7.json")

        // When
        val data = parser.toFhir(MedicationStatement::class, sourceJson)

        // Then
        assertMedicationStatement06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationStatement06Step01(data: MedicationStatement) {

        assertEquals(
            expected = "med0315",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example007",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.informationSource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.informationSource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#med0315",
            actual = data.medicationReference?.reference
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
            expected = "patient plans to start using for seasonal allergies in the Spring when pollen is in the air",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationStatementStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedicationStatement07() {
        // Given
        val sourceJson = loadAsString("r4/medicationstatementexample6.json")

        // When
        val data = parser.toFhir(MedicationStatement::class, sourceJson)

        // Then
        assertMedicationStatement07Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationStatement07Step01(data: MedicationStatement) {

        assertEquals(
            expected = "2014-02-22",
            actual = data.dateAsserted?.value.toString()
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.dosage?.get(0)?.asNeededBoolean?.value
        )

        assertEquals(
            expected = "mL",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "mL",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5".toDouble(),
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.doseQuantity?.value?.value
        )

        assertEquals(
            expected = "ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Ordered",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/dose-rate-type",
            actual = data.dosage?.get(0)?.doseAndRate?.get(0)?.type?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "d",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.denominator?.value?.value
        )

        assertEquals(
            expected = "3".toDouble(),
            actual = data.dosage?.get(0)?.maxDosePerPeriod?.numerator?.value?.value
        )

        assertEquals(
            expected = "260548002",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oral",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosage?.get(0)?.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.dosage?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "5ml three times daily",
            actual = data.dosage?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-02-01",
            actual = data.effectiveDateTime?.value.toString()
        )

        assertEquals(
            expected = "example006",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Peter Chalmers",
            actual = data.informationSource?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "RelatedPerson/peter",
            actual = data.informationSource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "27658006",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Amoxicillin (product)",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.medicationCodeableConcept?.coding?.get(0)?.system
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
            expected = "Father indicates they miss the occasional dose",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationStatementStatusCodes.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "Donald Duck",
            actual = data.subject?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/pat1",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
