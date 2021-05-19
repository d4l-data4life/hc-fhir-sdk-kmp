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
class ImmunizationTest {

    val parser = FhirR4Parser()

    @Test
    fun testImmunization01() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertEquals(
            "mg",
            data.doseQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.doseQuantity?.system
        )
        assertEquals(
            "5".toDouble(),
            data.doseQuantity?.value?.value
        )
        assertEquals(
            "253088698300010311120702",
            data.education?.get(0)?.documentType
        )
        assertEquals(
            "2013-01-10",
            data.education?.get(0)?.presentationDate?.value.toString()
        )
        assertEquals(
            "2012-07-02",
            data.education?.get(0)?.publicationDate?.value.toString()
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "2015-02-15",
            data.expirationDate?.value.toString()
        )
        assertEquals(
            "private",
            data.fundingSource?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-funding-source",
            data.fundingSource?.coding?.get(0)?.system
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "True".toBoolean(),
            data.isSubpotent?.value
        )
        assertEquals(
            "Location/1",
            data.location?.reference
        )
        assertEquals(
            "AAJN11K",
            data.lotNumber
        )
        assertEquals(
            "Organization/hl7",
            data.manufacturer?.reference
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Notes on adminstration of vaccine",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2013-01-10",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals(
            "OP",
            data.performer?.get(0)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0443",
            data.performer?.get(0)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(1)?.actor?.reference
        )
        assertEquals(
            "AP",
            data.performer?.get(1)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0443",
            data.performer?.get(1)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.primarySource?.value
        )
        assertEquals(
            "ineligible",
            data.programEligibility?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility",
            data.programEligibility?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "429060002",
            data.reasonCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.reasonCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "IM",
            data.route?.coding?.get(0)?.code
        )
        assertEquals(
            "Injection, intramuscular",
            data.route?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            data.route?.coding?.get(0)?.system
        )
        assertEquals(
            "LA",
            data.site?.coding?.get(0)?.code
        )
        assertEquals(
            "left arm",
            data.site?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActSite",
            data.site?.coding?.get(0)?.system
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "FLUVAX",
            data.vaccineCode?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:oid:1.2.36.1.2001.1005.17",
            data.vaccineCode?.coding?.get(0)?.system
        )
        assertEquals(
            "Fluvax (Influenza)",
            data.vaccineCode?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testImmunization02() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example-historical.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertEquals(
            "historical",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Location/1",
            data.location?.reference
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Notes on adminstration of a historical vaccine",
            data.note?.get(0)?.text
        )
        assertEquals(
            "January 2012",
            data.occurrenceString
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "False".toBoolean(),
            data.primarySource?.value
        )
        assertEquals(
            "record",
            data.reportOrigin?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-origin",
            data.reportOrigin?.coding?.get(0)?.system
        )
        assertEquals(
            "Written Record",
            data.reportOrigin?.text
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "GNFLU",
            data.vaccineCode?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:oid:1.2.36.1.2001.1005.17",
            data.vaccineCode?.coding?.get(0)?.system
        )
        assertEquals(
            "Influenza",
            data.vaccineCode?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testImmunization03() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example-protocol.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertEquals(
            "mg",
            data.doseQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.doseQuantity?.system
        )
        assertEquals(
            "5".toDouble(),
            data.doseQuantity?.value?.value
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "2018-12-15",
            data.expirationDate?.value.toString()
        )
        assertEquals(
            "private",
            data.fundingSource?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-funding-source",
            data.fundingSource?.coding?.get(0)?.system
        )
        assertEquals(
            "protocol",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "False".toBoolean(),
            data.isSubpotent?.value
        )
        assertEquals(
            "Location/1",
            data.location?.reference
        )
        assertEquals(
            "PT123F",
            data.lotNumber
        )
        assertEquals(
            "Organization/hl7",
            data.manufacturer?.reference
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2018-06-18",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals(
            "OP",
            data.performer?.get(0)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0443",
            data.performer?.get(0)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(1)?.actor?.reference
        )
        assertEquals(
            "AP",
            data.performer?.get(1)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0443",
            data.performer?.get(1)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.primarySource?.value
        )
        assertEquals(
            "ineligible",
            data.programEligibility?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility",
            data.programEligibility?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "1".toLong(),
            data.protocolApplied?.get(0)?.doseNumberPositiveInt?.value
        )
        assertEquals(
            "2-dose",
            data.protocolApplied?.get(0)?.series
        )
        assertEquals(
            "40468003",
            data.protocolApplied?.get(0)?.targetDisease?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.protocolApplied?.get(0)?.targetDisease?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2".toLong(),
            data.protocolApplied?.get(1)?.doseNumberPositiveInt?.value
        )
        assertEquals(
            "3-dose",
            data.protocolApplied?.get(1)?.series
        )
        assertEquals(
            "66071002",
            data.protocolApplied?.get(1)?.targetDisease?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.protocolApplied?.get(1)?.targetDisease?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "IM",
            data.route?.coding?.get(0)?.code
        )
        assertEquals(
            "Injection, intramuscular",
            data.route?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            data.route?.coding?.get(0)?.system
        )
        assertEquals(
            "LA",
            data.site?.coding?.get(0)?.code
        )
        assertEquals(
            "left arm",
            data.site?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActSite",
            data.site?.coding?.get(0)?.system
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "104",
            data.vaccineCode?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/sid/cvx",
            data.vaccineCode?.coding?.get(0)?.system
        )
        assertEquals(
            "Twinrix (HepA/HepB)",
            data.vaccineCode?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testImmunization04() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example-refused.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertEquals(
            "notGiven",
            data.id
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "2013-01-10",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "True".toBoolean(),
            data.primarySource?.value
        )
        assertEquals(
            EventStatus.NOT_DONE,
            data.status
        )
        assertEquals(
            "MEDPREC",
            data.statusReason?.coding?.get(0)?.code
        )
        assertEquals(
            "medical precaution",
            data.statusReason?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.statusReason?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "01",
            data.vaccineCode?.coding?.get(0)?.code
        )
        assertEquals(
            "DTP",
            data.vaccineCode?.coding?.get(0)?.display
        )
        assertEquals(
            "http://hl7.org/fhir/sid/cvx",
            data.vaccineCode?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testImmunization05() {
        // Given
        val sourceJson = loadAsString("r4/immunization-example-subpotent.json")

        // When
        val data = parser.toFhir(Immunization::class, sourceJson)

        // Then
        assertEquals(
            "ml",
            data.doseQuantity?.code
        )
        assertEquals(
            "http://unitsofmeasure.org",
            data.doseQuantity?.system
        )
        assertEquals(
            "0.5".toDouble(),
            data.doseQuantity?.value?.value
        )
        assertEquals(
            "253088698300010311120702",
            data.education?.get(0)?.documentType
        )
        assertEquals(
            "2013-01-10",
            data.education?.get(0)?.presentationDate?.value.toString()
        )
        assertEquals(
            "2012-07-02",
            data.education?.get(0)?.publicationDate?.value.toString()
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "2015-02-28",
            data.expirationDate?.value.toString()
        )
        assertEquals(
            "private",
            data.fundingSource?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-funding-source",
            data.fundingSource?.coding?.get(0)?.system
        )
        assertEquals(
            "subpotent",
            data.id
        )
        assertEquals(
            "urn:ietf:rfc:3986",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1234",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "False".toBoolean(),
            data.isSubpotent?.value
        )
        assertEquals(
            "Location/1",
            data.location?.reference
        )
        assertEquals(
            "AAJN11K",
            data.lotNumber
        )
        assertEquals(
            "Organization/hl7",
            data.manufacturer?.reference
        )
        assertEquals(
            "HTEST",
            data.meta?.tag?.get(0)?.code
        )
        assertEquals(
            "test health data",
            data.meta?.tag?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            data.meta?.tag?.get(0)?.system
        )
        assertEquals(
            "Notes on adminstration of vaccine",
            data.note?.get(0)?.text
        )
        assertEquals(
            "2015-01-15",
            data.occurrenceDateTime?.value.toString()
        )
        assertEquals(
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(0)?.actor?.reference
        )
        assertEquals(
            "OP",
            data.performer?.get(0)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0443",
            data.performer?.get(0)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "Practitioner/example",
            data.performer?.get(1)?.actor?.reference
        )
        assertEquals(
            "AP",
            data.performer?.get(1)?.function?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0443",
            data.performer?.get(1)?.function?.coding?.get(0)?.system
        )
        assertEquals(
            "True".toBoolean(),
            data.primarySource?.value
        )
        assertEquals(
            "ineligible",
            data.programEligibility?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-program-eligibility",
            data.programEligibility?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "IM",
            data.route?.coding?.get(0)?.code
        )
        assertEquals(
            "Injection, intramuscular",
            data.route?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-RouteOfAdministration",
            data.route?.coding?.get(0)?.system
        )
        assertEquals(
            "LT",
            data.site?.coding?.get(0)?.code
        )
        assertEquals(
            "left thigh",
            data.site?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v3-ActSite",
            data.site?.coding?.get(0)?.system
        )
        assertEquals(
            EventStatus.COMPLETED,
            data.status
        )
        assertEquals(
            "partial",
            data.subpotentReason?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-subpotent-reason",
            data.subpotentReason?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "GNHEP",
            data.vaccineCode?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:oid:1.2.36.1.2001.1005.17",
            data.vaccineCode?.coding?.get(0)?.system
        )
        assertEquals(
            "Hepatitis B",
            data.vaccineCode?.text
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
