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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * ImmunizationRecommendationTest.java
 *
 * Guidance or advice relating to an immunization
 *
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
 * schedule with optional supporting justification.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImmunizationRecommendationTest {

    val parser = FhirR4Parser()

    @Test
    fun testImmunizationRecommendation01() {
        // Given
        val sourceJson = loadAsString("r4/immunizationrecommendation-example.json")

        // When
        val data = parser.toFhir(ImmunizationRecommendation::class, sourceJson)

        // Then
        assertEquals(
            "Organization/hl7",
            data.authority?.reference
        )
        assertEquals(
            "2015-02-09T11:04:15.817-05:00",
            data.date?.value.toString()
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
            "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1235",
            data.identifier?.get(0)?.value
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
            "earliest",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Earliest Date",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/immunization-recommendation-date-criterion",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-12-01T00:00:00-05:00",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.value?.value.toString()
        )
        assertEquals(
            "recommended",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Recommended",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/immunization-recommendation-date-criterion",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-12-01T00:00:00-05:00",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.value?.value.toString()
        )
        assertEquals(
            "overdue",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Past Due Date",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/immunization-recommendation-date-criterion",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-12-28T00:00:00-05:00",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.value?.value.toString()
        )
        assertEquals(
            "First sequence in protocol",
            data.recommendation?.get(0)?.description
        )
        assertEquals(
            "1".toLong(),
            data.recommendation?.get(0)?.doseNumberPositiveInt?.value
        )
        assertEquals(
            "Not Complete",
            data.recommendation?.get(0)?.forecastStatus?.text
        )
        assertEquals(
            "Vaccination Series 1",
            data.recommendation?.get(0)?.series
        )
        assertEquals(
            "3".toLong(),
            data.recommendation?.get(0)?.seriesDosesPositiveInt?.value
        )
        assertEquals(
            "Immunization/example",
            data.recommendation?.get(0)?.supportingImmunization?.get(0)?.reference
        )
        assertEquals(
            "Observation/example",
            data.recommendation?.get(0)?.supportingPatientInformation?.get(0)?.reference
        )
        assertEquals(
            "14745005",
            data.recommendation?.get(0)?.vaccineCode?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Hepatitis A vaccine",
            data.recommendation?.get(0)?.vaccineCode?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.recommendation?.get(0)?.vaccineCode?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Authored by Joginder Madra</div>",
            data.text?.div
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
    fun testImmunizationRecommendation02() {
        // Given
        val sourceJson = loadAsString("r4/immunizationrecommendation-example-target-disease.json")

        // When
        val data = parser.toFhir(ImmunizationRecommendation::class, sourceJson)

        // Then
        assertEquals(
            "Organization/hl7",
            data.authority?.reference
        )
        assertEquals(
            "2015-02-09T11:04:15.817-05:00",
            data.date?.value.toString()
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
            "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1235",
            data.identifier?.get(0)?.value
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
            "30981-5",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Earliest date to give",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-12-01T00:00:00-05:00",
            data.recommendation?.get(0)?.dateCriterion?.get(0)?.value?.value.toString()
        )
        assertEquals(
            "recommended",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Recommended",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/immunization-recommendation-date-criterion",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2015-12-01T00:00:00-05:00",
            data.recommendation?.get(0)?.dateCriterion?.get(1)?.value?.value.toString()
        )
        assertEquals(
            "overdue",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Past Due Date",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.display
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/immunization-recommendation-date-criterion",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-12-28T00:00:00-05:00",
            data.recommendation?.get(0)?.dateCriterion?.get(2)?.value?.value.toString()
        )
        assertEquals(
            "First sequence in protocol",
            data.recommendation?.get(0)?.description
        )
        assertEquals(
            "1".toLong(),
            data.recommendation?.get(0)?.doseNumberPositiveInt?.value
        )
        assertEquals(
            "Not Complete",
            data.recommendation?.get(0)?.forecastStatus?.text
        )
        assertEquals(
            "Vaccination Series 1",
            data.recommendation?.get(0)?.series
        )
        assertEquals(
            "3".toLong(),
            data.recommendation?.get(0)?.seriesDosesPositiveInt?.value
        )
        assertEquals(
            "Immunization/example",
            data.recommendation?.get(0)?.supportingImmunization?.get(0)?.reference
        )
        assertEquals(
            "Observation/example",
            data.recommendation?.get(0)?.supportingPatientInformation?.get(0)?.reference
        )
        assertEquals(
            "40468003",
            data.recommendation?.get(0)?.targetDisease?.coding?.get(0)?.code
        )
        assertEquals(
            "http://snomed.info/sct",
            data.recommendation?.get(0)?.targetDisease?.coding?.get(0)?.system
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Authored by Joginder Madra</div>",
            data.text?.div
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
