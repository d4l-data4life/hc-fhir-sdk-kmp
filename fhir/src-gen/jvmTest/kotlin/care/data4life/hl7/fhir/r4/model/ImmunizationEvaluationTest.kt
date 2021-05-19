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
import care.data4life.hl7.fhir.r4.codesystem.MedicationAdministrationStatusCodes
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ImmunizationEvaluationTest.java
 *
 * Immunization evaluation information
 *
 * Describes a comparison of an immunization event against published recommendations to determine if
 * the administration is "valid" in relation to those recommendations.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImmunizationEvaluationTest {

    val parser = FhirR4Parser()

    @Test
    fun testImmunizationEvaluation01() {
        // Given
        val sourceJson = loadAsString("r4/immunizationevaluation-example.json")

        // When
        val data = parser.toFhir(ImmunizationEvaluation::class, sourceJson)

        // Then
        assertEquals(
            "Organization/hl7",
            data.authority?.reference
        )
        assertEquals(
            "2013-01-10",
            data.date?.value.toString()
        )
        assertEquals(
            "1".toLong(),
            data.doseNumberPositiveInt?.value
        )
        assertEquals(
            "valid",
            data.doseStatus?.coding?.get(0)?.code
        )
        assertEquals(
            "Valid",
            data.doseStatus?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-evaluation-dose-status",
            data.doseStatus?.coding?.get(0)?.system
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
            "Immunization/example",
            data.immunizationEvent?.reference
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
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "Vaccination Series 1",
            data.series
        )
        assertEquals(
            "3".toLong(),
            data.seriesDosesPositiveInt?.value
        )
        assertEquals(
            MedicationAdministrationStatusCodes.COMPLETED,
            data.status
        )
        assertEquals(
            "1857005",
            data.targetDisease?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.targetDisease?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testImmunizationEvaluation02() {
        // Given
        val sourceJson = loadAsString("r4/immunizationevaluation-example-notvalid.json")

        // When
        val data = parser.toFhir(ImmunizationEvaluation::class, sourceJson)

        // Then
        assertEquals(
            "Organization/hl7",
            data.authority?.reference
        )
        assertEquals(
            "2013-01-10",
            data.date?.value.toString()
        )
        assertEquals(
            "2".toLong(),
            data.doseNumberPositiveInt?.value
        )
        assertEquals(
            "notvalid",
            data.doseStatus?.coding?.get(0)?.code
        )
        assertEquals(
            "Not Valid",
            data.doseStatus?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-evaluation-dose-status",
            data.doseStatus?.coding?.get(0)?.system
        )
        assertEquals(
            "outsidesched",
            data.doseStatusReason?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Administered outside recommended schedule",
            data.doseStatusReason?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/immunization-evaluation-dose-status-reason",
            data.doseStatusReason?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "notValid",
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
            "Immunization/example",
            data.immunizationEvent?.reference
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
            "Patient/example",
            data.patient?.reference
        )
        assertEquals(
            "Vaccination Series 1",
            data.series
        )
        assertEquals(
            "3".toLong(),
            data.seriesDosesPositiveInt?.value
        )
        assertEquals(
            MedicationAdministrationStatusCodes.COMPLETED,
            data.status
        )
        assertEquals(
            "1857005",
            data.targetDisease?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.targetDisease?.coding?.get(0)?.system
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
