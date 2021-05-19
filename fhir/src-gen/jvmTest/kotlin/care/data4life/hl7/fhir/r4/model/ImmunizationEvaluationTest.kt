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
        assertImmunizationEvaluation01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunizationEvaluation01Step01(data: ImmunizationEvaluation) {

        assertEquals(
            expected = "Organization/hl7",
            actual = data.authority?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-10",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.doseNumberPositiveInt?.value
        )

        assertEquals(
            expected = "valid",
            actual = data.doseStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Valid",
            actual = data.doseStatus?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-evaluation-dose-status",
            actual = data.doseStatus?.coding?.get(0)?.system
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
            expected = "Immunization/example",
            actual = data.immunizationEvent?.reference
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
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vaccination Series 1",
            actual = data.series
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.seriesDosesPositiveInt?.value
        )

        assertEquals(
            expected = MedicationAdministrationStatusCodes.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "1857005",
            actual = data.targetDisease?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.targetDisease?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testImmunizationEvaluation02() {
        // Given
        val sourceJson = loadAsString("r4/immunizationevaluation-example-notvalid.json")

        // When
        val data = parser.toFhir(ImmunizationEvaluation::class, sourceJson)

        // Then
        assertImmunizationEvaluation02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunizationEvaluation02Step01(data: ImmunizationEvaluation) {

        assertEquals(
            expected = "Organization/hl7",
            actual = data.authority?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2013-01-10",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "2".toLong(),
            actual = data.doseNumberPositiveInt?.value
        )

        assertEquals(
            expected = "notvalid",
            actual = data.doseStatus?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Not Valid",
            actual = data.doseStatus?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-evaluation-dose-status",
            actual = data.doseStatus?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "outsidesched",
            actual = data.doseStatusReason?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Administered outside recommended schedule",
            actual = data.doseStatusReason?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/immunization-evaluation-dose-status-reason",
            actual = data.doseStatusReason?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "notValid",
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
            expected = "Immunization/example",
            actual = data.immunizationEvent?.reference
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
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vaccination Series 1",
            actual = data.series
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3".toLong(),
            actual = data.seriesDosesPositiveInt?.value
        )

        assertEquals(
            expected = MedicationAdministrationStatusCodes.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "1857005",
            actual = data.targetDisease?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.targetDisease?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
