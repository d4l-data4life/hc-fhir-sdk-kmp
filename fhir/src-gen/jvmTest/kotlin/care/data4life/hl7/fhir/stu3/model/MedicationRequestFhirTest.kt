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
import care.data4life.hl7.fhir.stu3.codesystem.MedicationRequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.MedicationRequestStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MedicationRequestTest.java
 *
 * Ordering of medication for patient or group
 *
 * An order or request for both supply of the medication and the instructions for administration of the
 * medication to a patient. The resource is called "MedicationRequest" rather than
 * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient
 * settings, including care plans, etc., and to harmonize with workflow patterns.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MedicationRequestFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testMedicationRequest01() {
        // Given
        val sourceJson = loadAsString("stu3/medicationrequestexample1.json")

        // When
        val data = parser.toFhir(MedicationRequest::class, sourceJson)

        // Then
        assertMedicationRequest01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationRequest01Step01(data: MedicationRequest) {

        assertEquals(
            expected = "2015-01-15",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "med0316",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "encounter who leads to this prescription",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/f001",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "d",
            actual = data.dispenseRequest?.expectedSupplyDuration?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.dispenseRequest?.expectedSupplyDuration?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "days",
            actual = data.dispenseRequest?.expectedSupplyDuration?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30".toDouble(),
            actual = data.dispenseRequest?.expectedSupplyDuration?.value?.value
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.dispenseRequest?.numberOfRepeatsAllowed?.value
        )

        assertEquals(
            expected = "TAB",
            actual = data.dispenseRequest?.quantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/orderableDrugForm",
            actual = data.dispenseRequest?.quantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.dispenseRequest?.quantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "30".toDouble(),
            actual = data.dispenseRequest?.quantity?.value?.value
        )

        assertEquals(
            expected = "2016-01-15",
            actual = data.dispenseRequest?.validityPeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2015-01-15",
            actual = data.dispenseRequest?.validityPeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "311504000",
            actual = data.dosageInstruction?.get(0)?.additionalInstruction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "With or after food",
            actual = data.dosageInstruction?.get(0)?.additionalInstruction?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosageInstruction?.get(0)?.additionalInstruction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/orderableDrugForm",
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TAB",
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.dosageInstruction?.get(0)?.doseQuantity?.value?.value
        )

        assertEquals(
            expected = "421521009",
            actual = data.dosageInstruction?.get(0)?.method?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Swallow - dosing instruction imperative (qualifier value)",
            actual = data.dosageInstruction?.get(0)?.method?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosageInstruction?.get(0)?.method?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "26643006",
            actual = data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Oral Route",
            actual = data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.dosageInstruction?.get(0)?.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.dosageInstruction?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "One tablet daily",
            actual = data.dosageInstruction?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "QD",
            actual = data.dosageInstruction?.get(0)?.timing?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "QD",
            actual = data.dosageInstruction?.get(0)?.timing?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/GTSAbbreviation",
            actual = data.dosageInstruction?.get(0)?.timing?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medrx0311",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/portal/prescriptions",
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
            expected = MedicationRequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "#med0316",
            actual = data.medicationReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chlorthalidone increases urniation so take it in the morning",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "condition for prescribing this medication",
            actual = data.reasonReference?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition/f201",
            actual = data.reasonReference?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patrick Pump",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f007",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f002",
            actual = data.requester?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationRequestStatus.ACTIVE,
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
            expected = "True".toBoolean(),
            actual = data.substitution?.allowed?.value
        )

        assertEquals(
            expected = "CT",
            actual = data.substitution?.reason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "continuing therapy",
            actual = data.substitution?.reason?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActReason",
            actual = data.substitution?.reason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testMedicationRequest02() {
        // Given
        val sourceJson = loadAsString("stu3/medicationrequestexample2.json")

        // When
        val data = parser.toFhir(MedicationRequest::class, sourceJson)

        // Then
        assertMedicationRequest02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMedicationRequest02Step01(data: MedicationRequest) {

        assertEquals(
            expected = "2015-03-01",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "encounter that leads to this prescription",
            actual = data.context?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/f001",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.dosageInstruction?.get(0)?.sequence?.value
        )

        assertEquals(
            expected = "Take one tablet daily as directed",
            actual = data.dosageInstruction?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medrx002",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://www.bmc.nl/portal/prescriptions",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "12345",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationRequestIntent.ORDER,
            actual = data.intent
        )

        assertEquals(
            expected = "prescribed medication",
            actual = data.medicationReference?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medication/med0316",
            actual = data.medicationReference?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "59621000",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Essential hypertension (disorder)",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patrick Pump",
            actual = data.requester?.agent?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f007",
            actual = data.requester?.agent?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/f002",
            actual = data.requester?.onBehalfOf?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationRequestStatus.ACTIVE,
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
