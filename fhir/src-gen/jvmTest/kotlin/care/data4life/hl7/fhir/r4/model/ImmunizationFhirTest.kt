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
import care.data4life.hl7.fhir.r4.codesystem.EventStatus
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ImmunizationTest.java
 *
 * Immunization event information
 *
 * Describes the event of a patient being administered a vaccine or a record of an immunization as
 * reported by a patient, a clinician or another party.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImmunizationFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testImmunization01() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example.json")

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
            expected = "253088698300010311120702",
            actual = data.education?.get(0)?.documentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-10",
            actual = data.education?.get(0)?.presentationDate?.value.toString()
        )

        assertEquals(
            expected = "2012-07-02",
            actual = data.education?.get(0)?.publicationDate?.value.toString()
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
            expected = "private",
            actual = data.fundingSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-funding-source",
            actual = data.fundingSource?.coding?.get(0)?.system
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
            expected = "True".toBoolean(),
            actual = data.isSubpotent?.value
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
            expected = "Notes on adminstration of vaccine",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-10",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OP",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0443",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(1)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AP",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0443",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.primarySource?.value
        )

        assertEquals(
            expected = "ineligible",
            actual = data.programEligibility?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility",
            actual = data.programEligibility?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "429060002",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.reasonCode?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
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
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActSite",
            actual = data.site?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
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
        val sourceJson = loadAsString("r4/immunization-example-historical.json")

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
            expected = "Notes on adminstration of a historical vaccine",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "January 2012",
            actual = data.occurrenceString
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
            expected = "http://terminology.hl7.org/CodeSystem/immunization-origin",
            actual = data.reportOrigin?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Written Record",
            actual = data.reportOrigin?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
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
        val sourceJson = loadAsString("r4/immunization-example-protocol.json")

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
            expected = "2018-12-15",
            actual = data.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "private",
            actual = data.fundingSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-funding-source",
            actual = data.fundingSource?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "protocol",
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
            expected = "False".toBoolean(),
            actual = data.isSubpotent?.value
        )

        assertEquals(
            expected = "Location/1",
            actual = data.location?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PT123F",
            actual = data.lotNumber
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.manufacturer?.reference
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
            expected = "2018-06-18",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OP",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0443",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(1)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AP",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0443",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.primarySource?.value
        )

        assertEquals(
            expected = "ineligible",
            actual = data.programEligibility?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility",
            actual = data.programEligibility?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.protocolApplied?.get(0)?.doseNumberPositiveInt?.value
        )

        assertEquals(
            expected = "2-dose",
            actual = data.protocolApplied?.get(0)?.series
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "40468003",
            actual = data.protocolApplied?.get(0)?.targetDisease?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.protocolApplied?.get(0)?.targetDisease?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.protocolApplied?.get(1)?.doseNumberPositiveInt?.value
        )

        assertEquals(
            expected = "3-dose",
            actual = data.protocolApplied?.get(1)?.series
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "66071002",
            actual = data.protocolApplied?.get(1)?.targetDisease?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.protocolApplied?.get(1)?.targetDisease?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
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
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActSite",
            actual = data.site?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "104",
            actual = data.vaccineCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/sid/cvx",
            actual = data.vaccineCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Twinrix (HepA/HepB)",
            actual = data.vaccineCode?.text
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testImmunization04() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example-refused.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertImmunization04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunization04Step01(data: Immunization) {

        assertEquals(
            expected = "notGiven",
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
            expected = "2013-01-10",
            actual = data.occurrenceDateTime?.value.toString()
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
            expected = EventStatus.NOT_DONE,
            actual = data.status
        )

        assertEquals(
            expected = "MEDPREC",
            actual = data.statusReason?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medical precaution",
            actual = data.statusReason?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.statusReason?.coding?.get(0)?.system
                ?.replace("\\n", " ")
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

    @Test
    fun testImmunization05() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example-subpotent.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertImmunization05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunization05Step01(data: Immunization) {

        assertEquals(
            expected = "ml",
            actual = data.doseQuantity?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.doseQuantity?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0.5".toDouble(),
            actual = data.doseQuantity?.value?.value
        )

        assertEquals(
            expected = "253088698300010311120702",
            actual = data.education?.get(0)?.documentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-10",
            actual = data.education?.get(0)?.presentationDate?.value.toString()
        )

        assertEquals(
            expected = "2012-07-02",
            actual = data.education?.get(0)?.publicationDate?.value.toString()
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-28",
            actual = data.expirationDate?.value.toString()
        )

        assertEquals(
            expected = "private",
            actual = data.fundingSource?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-funding-source",
            actual = data.fundingSource?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "subpotent",
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
            expected = "False".toBoolean(),
            actual = data.isSubpotent?.value
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
            expected = "Notes on adminstration of vaccine",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-01-15",
            actual = data.occurrenceDateTime?.value.toString()
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(0)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "OP",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0443",
            actual = data.performer?.get(0)?.function?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/example",
            actual = data.performer?.get(1)?.actor?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "AP",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v2-0443",
            actual = data.performer?.get(1)?.function?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.primarySource?.value
        )

        assertEquals(
            expected = "ineligible",
            actual = data.programEligibility?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility",
            actual = data.programEligibility?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
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
            expected = "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            actual = data.route?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LT",
            actual = data.site?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "left thigh",
            actual = data.site?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActSite",
            actual = data.site?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = EventStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "partial",
            actual = data.subpotentReason?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-subpotent-reason",
            actual = data.subpotentReason?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "GNHEP",
            actual = data.vaccineCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:oid:1.2.36.1.2001.1005.17",
            actual = data.vaccineCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hepatitis B",
            actual = data.vaccineCode?.text
                ?.replace("\\n", " ")
        )
    }
}
