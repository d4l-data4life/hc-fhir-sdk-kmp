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
import care.data4life.hl7.fhir.stu3.codesystem.MedicationAdministrationStatus
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ImmunizationTest.java
 *
 * Immunization event information
 *
 * Describes the event of a patient being administered a vaccination or a record of a vaccination as
 * reported by a patient, a clinician or another party and may include vaccine reaction information and
 * what vaccination protocol was followed.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImmunizationTest {

    val parser = FhirStu3Parser()

    @Test
    fun testImmunization01() {
        // Given
        val sourceJson = loadAsString("stu3/immunization-example.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertImmunization01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunization01Step01(data: Immunization) {

        assertEquals(
            expected = "2013-01-10",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "mg",
            actual = data.doseQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.doseQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "5".toDouble(),
            actual = data.doseQuantity?.value?.value
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-15",
            actual = data.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "429060002",
            actual = data.explanation?.reason?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.explanation?.reason?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AAJN11K",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.manufacturer?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.notGiven?.value
        )

        assertEquals(
            expected = "Notes on adminstration of vaccine",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.practitioner?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OP",
            actual = data.practitioner?.get(0)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0443",
            actual = data.practitioner?.get(0)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.practitioner?.get(1)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AP",
            actual = data.practitioner?.get(1)?.role?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0443",
            actual = data.practitioner?.get(1)?.role?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.primarySource?.value
        )

        assertEquals(
            expected = "2013-01-10",
            actual = data.reaction?.get(0)?.date?.value.toString()
        )

        assertEquals(
            expected = "Observation/example",
            actual = data.reaction?.get(0)?.detail?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.reaction?.get(0)?.reported?.value
        )

        assertEquals(
            expected = "IM",
            actual = data.route?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Injection, intramuscular",
            actual = data.route?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/RouteOfAdministration",
            actual = data.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LA",
            actual = data.site?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "left arm",
            actual = data.site?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActSite",
            actual = data.site?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationAdministrationStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.vaccinationProtocol?.get(0)?.authority?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vaccination Protocol Sequence 1",
            actual = data.vaccinationProtocol?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.vaccinationProtocol?.get(0)?.doseSequence?.value
        )

        assertEquals(
            expected = "count",
            actual = data.vaccinationProtocol?.get(0)?.doseStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Counts",
            actual = data.vaccinationProtocol?.get(0)?.doseStatus?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/vaccination-protocol-dose-status",
            actual = data.vaccinationProtocol?.get(0)?.doseStatus?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "coldchbrk",
            actual = data.vaccinationProtocol?.get(0)?.doseStatusReason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Cold chain break",
            actual = data.vaccinationProtocol?.get(0)?.doseStatusReason?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/vaccination-protocol-dose-status-reason",
            actual = data.vaccinationProtocol?.get(0)?.doseStatusReason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vaccination Series 1",
            actual = data.vaccinationProtocol?.get(0)?.series
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.vaccinationProtocol?.get(0)?.seriesDoses?.value
        )

        assertEquals(
            expected = "1857005",
            actual = data.vaccinationProtocol?.get(0)?.targetDisease?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.vaccinationProtocol?.get(0)?.targetDisease?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FLUVAX",
            actual = data.vaccineCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.36.1.2001.1005.17",
            actual = data.vaccineCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Fluvax (Influenza)",
            actual = data.vaccineCode?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testImmunization02() {
        // Given
        val sourceJson = loadAsString("stu3/immunization-example-historical.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertImmunization02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunization02Step01(data: Immunization) {

        assertEquals(
            expected = "2012-01-15",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "historical",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:ietf:rfc:3986",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.notGiven?.value
        )

        assertEquals(
            expected = "Notes on adminstration of a historical vaccine",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "False".toBoolean(),
            actual = data.primarySource?.value
        )

        assertEquals(
            expected = "record",
            actual = data.reportOrigin?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/immunization-origin",
            actual = data.reportOrigin?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Written Record",
            actual = data.reportOrigin?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MedicationAdministrationStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "GNFLU",
            actual = data.vaccineCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.36.1.2001.1005.17",
            actual = data.vaccineCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Influenza",
            actual = data.vaccineCode?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testImmunization03() {
        // Given
        val sourceJson = loadAsString("stu3/immunization-example-refused.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertImmunization03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunization03Step01(data: Immunization) {

        assertEquals(
            expected = "2013-01-10",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "MEDPREC",
            actual = data.explanation?.reasonNotGiven?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medical precaution",
            actual = data.explanation?.reasonNotGiven?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v3/ActReason",
            actual = data.explanation?.reasonNotGiven?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "notGiven",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.notGiven?.value
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.primarySource?.value
        )

        assertEquals(
            expected = MedicationAdministrationStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "01",
            actual = data.vaccineCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DTP",
            actual = data.vaccineCode?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/cvx",
            actual = data.vaccineCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }
}
