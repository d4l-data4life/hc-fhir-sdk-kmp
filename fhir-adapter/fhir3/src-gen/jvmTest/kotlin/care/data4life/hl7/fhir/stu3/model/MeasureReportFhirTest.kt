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
import care.data4life.hl7.fhir.stu3.codesystem.MeasureReportStatus
import care.data4life.hl7.fhir.stu3.codesystem.MeasureReportType
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MeasureReportTest.java
 *
 * Results of a measure evaluation
 *
 * The MeasureReport resource contains the results of evaluating a measure.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MeasureReportFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testMeasureReport01() {
        // Given
        val sourceJson = loadAsString("stu3/measurereport-cms146-cat1-example.json")

        // When
        val data = parser.toFhir(MeasureReport::class, sourceJson)

        // Then
        assertMeasureReport01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasureReport01Step01(data: MeasureReport) {

        assertEquals(
            expected = "reporter",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Bundle/456",
            actual = data.evaluatedResources?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146-group-1",
            actual = data.group?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "stratifier-ages-up-to-9",
            actual = data.group?.get(0)?.stratifier?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "true",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "false",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-ages-10-plus",
            actual = data.group?.get(0)?.stratifier?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "true",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "false",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-gender",
            actual = data.group?.get(0)?.stratifier?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "male",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "female",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "other",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "unknown",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measurereport-cms146-cat1-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measurereport-cms146-cat1-example-2017-03-13",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Measure/CMS146",
            actual = data.measure?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient/123",
            actual = data.patient?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-03-31",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "#reporter",
            actual = data.reportingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MeasureReportStatus.COMPLETE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = MeasureReportType.INDIVIDUAL,
            actual = data.type
        )
    }

    @Test
    fun testMeasureReport02() {
        // Given
        val sourceJson = loadAsString("stu3/measurereport-cms146-cat2-example.json")

        // When
        val data = parser.toFhir(MeasureReport::class, sourceJson)

        // Then
        assertMeasureReport02Step01(data)
        assertMeasureReport02Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasureReport02Step01(data: MeasureReport) {

        assertEquals(
            expected = "reporter",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146-group-1",
            actual = data.group?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500".toInt(),
            actual = data.group?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-initial-population",
            actual = data.group?.get(0)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200".toInt(),
            actual = data.group?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-numerator",
            actual = data.group?.get(0)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500".toInt(),
            actual = data.group?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-denominator",
            actual = data.group?.get(0)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-denominator-exclusions",
            actual = data.group?.get(0)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-ages-up-to-9",
            actual = data.group?.get(0)?.stratifier?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-true-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-true-numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-true-denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-true-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "true",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-false-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-false-numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-false-denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-up-to-9-false-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "false",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-ages-10-plus",
            actual = data.group?.get(0)?.stratifier?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-true-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-true-numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-true-denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-true-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "true",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-false-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-false-numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-false-denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-ages-10-plus-false-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "false",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-gender",
            actual = data.group?.get(0)?.stratifier?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-male-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-male-numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-male-denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-male-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "male",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-female-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-female-numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-female-denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-female-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "female",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-other-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(1)?.count?.value
        )
    }

    private fun assertMeasureReport02Step02(data: MeasureReport) {

        assertEquals(
            expected = "List/CMS146-stratifier-gender-other-numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-other-denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-other-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "other",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-unknown-initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(0)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-unknown-numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(1)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-unknown-denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(2)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "List/CMS146-stratifier-gender-unknown-denominator-exclusions",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(3)?.patients?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "unknown",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measurereport-cms146-cat2-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measurereport-cms146-cat2-example-2017-03-13",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Measure/CMS146",
            actual = data.measure?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-03-31",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "#reporter",
            actual = data.reportingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MeasureReportStatus.COMPLETE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = MeasureReportType.PATIENT_LIST,
            actual = data.type
        )
    }

    @Test
    fun testMeasureReport03() {
        // Given
        val sourceJson = loadAsString("stu3/measurereport-cms146-cat3-example.json")

        // When
        val data = parser.toFhir(MeasureReport::class, sourceJson)

        // Then
        assertMeasureReport03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasureReport03Step01(data: MeasureReport) {

        assertEquals(
            expected = "reporter",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146-group-1",
            actual = data.group?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500".toInt(),
            actual = data.group?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "200".toInt(),
            actual = data.group?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "500".toInt(),
            actual = data.group?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "stratifier-ages-up-to-9",
            actual = data.group?.get(0)?.stratifier?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "true",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "false",
            actual = data.group?.get(0)?.stratifier?.get(0)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-ages-10-plus",
            actual = data.group?.get(0)?.stratifier?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "true",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "false",
            actual = data.group?.get(0)?.stratifier?.get(1)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-gender",
            actual = data.group?.get(0)?.stratifier?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "male",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "100".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "250".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "50".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "female",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "other",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(2)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(0)?.count?.value
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(1)?.count?.value
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(2)?.count?.value
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "0".toInt(),
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.population?.get(3)?.count?.value
        )

        assertEquals(
            expected = "unknown",
            actual = data.group?.get(0)?.stratifier?.get(2)?.stratum?.get(3)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measurereport-cms146-cat3-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measurereport-cms146-cat3-example-2017-03-13",
            actual = data.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Measure/CMS146",
            actual = data.measure?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2014-03-31",
            actual = data.period?.end?.value.toString()
        )

        assertEquals(
            expected = "2014-01-01",
            actual = data.period?.start?.value.toString()
        )

        assertEquals(
            expected = "#reporter",
            actual = data.reportingOrganization?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = MeasureReportStatus.COMPLETE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = MeasureReportType.SUMMARY,
            actual = data.type
        )
    }
}
