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
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * ImmunizationRecommendationTest.java
 *
 * Guidance or advice relating to an immunization
 *
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization
 * eligibility according to a published schedule) with optional supporting justification.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ImmunizationRecommendationFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testImmunizationRecommendation01() {
        // Given
        val sourceJson = loadAsString("stu3/immunizationrecommendation-example.json")

        // When
        val data = parser.toFhir(ImmunizationRecommendation::class, sourceJson)

        // Then
        assertImmunizationRecommendation01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunizationRecommendation01Step01(data: ImmunizationRecommendation) {
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
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1235",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-09T11:04:15.817-05:00",
            actual = data.recommendation?.get(0)?.date?.value.toString()
        )

        assertEquals(
            expected = "earliest",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Earliest Date",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/immunization-recommendation-date-criterion",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-12-01T00:00:00-05:00",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.value?.value.toString()
        )

        assertEquals(
            expected = "recommended",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Recommended",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/immunization-recommendation-date-criterion",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-12-01T00:00:00-05:00",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.value?.value.toString()
        )

        assertEquals(
            expected = "overdue",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Past Due Date",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/immunization-recommendation-date-criterion",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-12-28T00:00:00-05:00",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.value?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.recommendation?.get(0)?.doseNumber?.value
        )

        assertEquals(
            expected = "Not Complete",
            actual = data.recommendation?.get(0)?.forecastStatus?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.recommendation?.get(0)?.protocol?.authority?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "First sequence in protocol",
            actual = data.recommendation?.get(0)?.protocol?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.recommendation?.get(0)?.protocol?.doseSequence?.value
        )

        assertEquals(
            expected = "Vaccination Series 1",
            actual = data.recommendation?.get(0)?.protocol?.series
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Immunization/example",
            actual = data.recommendation?.get(0)?.supportingImmunization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/example",
            actual = data.recommendation?.get(0)?.supportingPatientInformation?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "14745005",
            actual = data.recommendation?.get(0)?.vaccineCode?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hepatitis A vaccine",
            actual = data.recommendation?.get(0)?.vaccineCode?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.recommendation?.get(0)?.vaccineCode?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Authored by Joginder Madra</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testImmunizationRecommendation02() {
        // Given
        val sourceJson = loadAsString("stu3/immunizationrecommendation-target-disease-example.json")

        // When
        val data = parser.toFhir(ImmunizationRecommendation::class, sourceJson)

        // Then
        assertImmunizationRecommendation02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertImmunizationRecommendation02Step01(data: ImmunizationRecommendation) {
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
            expected = "urn:oid:1.3.6.1.4.1.21367.2005.3.7.1235",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-02-09T11:04:15.817-05:00",
            actual = data.recommendation?.get(0)?.date?.value.toString()
        )

        assertEquals(
            expected = "earliest",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Earliest Date",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/immunization-recommendation-date-criterion",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-12-01T00:00:00-05:00",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(0)?.value?.value.toString()
        )

        assertEquals(
            expected = "recommended",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Recommended",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/immunization-recommendation-date-criterion",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-12-01T00:00:00-05:00",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(1)?.value?.value.toString()
        )

        assertEquals(
            expected = "overdue",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Past Due Date",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/immunization-recommendation-date-criterion",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.code?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-12-28T00:00:00-05:00",
            actual = data.recommendation?.get(0)?.dateCriterion?.get(2)?.value?.value.toString()
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.recommendation?.get(0)?.doseNumber?.value
        )

        assertEquals(
            expected = "Not Complete",
            actual = data.recommendation?.get(0)?.forecastStatus?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Organization/hl7",
            actual = data.recommendation?.get(0)?.protocol?.authority?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "First sequence in protocol",
            actual = data.recommendation?.get(0)?.protocol?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toLong(),
            actual = data.recommendation?.get(0)?.protocol?.doseSequence?.value
        )

        assertEquals(
            expected = "Vaccination Series 1",
            actual = data.recommendation?.get(0)?.protocol?.series
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Immunization/example",
            actual = data.recommendation?.get(0)?.supportingImmunization?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation/example",
            actual = data.recommendation?.get(0)?.supportingPatientInformation?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "40468003",
            actual = data.recommendation?.get(0)?.targetDisease?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.recommendation?.get(0)?.targetDisease?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Authored by Joginder Madra</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
