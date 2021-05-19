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
import care.data4life.hl7.fhir.r4.codesystem.QuestionnaireResponseStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * QuestionnaireResponseTest.java
 *
 * A structured set of questions and their answers
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent
 * subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class QuestionnaireResponseTest {

    val parser = FhirR4Parser()

    @Test
    fun testQuestionnaireResponse01() {
        // Given
        val sourceJson = loadAsString("r4/questionnaireresponse-example.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then
        assertQuestionnaireResponse01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaireResponse01Step01(data: QuestionnaireResponse) {

        assertEquals(
            expected = "#questauth",
            actual = data.author?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2013-02-19T14:15:00-05:00",
            actual = data.authored?.value.toString()
        )

        assertEquals(
            expected = "#order",
            actual = data.basedOn?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patsub",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "order",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "questauth",
            actual = data.contained?.get(2)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.encounter?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3141",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/NamingSystem/questionnaire-ids",
            actual = data.identifier?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Q12349876",
            actual = data.identifier?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://cancer.questionnaire.org/system/code/yesno",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.1.1",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://cancer.questionnaire.org/system/code/yesno",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.1.2",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://cancer.questionnaire.org/system/code/yesno",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.1.3",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.1",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://cancer.questionnaire.org/system/code/yesno",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Procedure/f201",
            actual = data.partOf?.get(0)?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = QuestionnaireResponseStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "#patsub",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testQuestionnaireResponse02() {
        // Given
        val sourceJson = loadAsString("r4/questionnaireresponse-example-ussg-fht-answers.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then
        assertQuestionnaireResponse02Step01(data)
        assertQuestionnaireResponse02Step02(data)
        assertQuestionnaireResponse02Step03(data)
        assertQuestionnaireResponse02Step04(data)
        assertQuestionnaireResponse02Step05(data)
        assertQuestionnaireResponse02Step06(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaireResponse02Step01(data: QuestionnaireResponse) {

        assertEquals(
            expected = "2008-01-17",
            actual = data.authored?.value.toString()
        )

        assertEquals(
            expected = "ussg-fht-answers",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2008-01-17",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "0.1",
            actual = data.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Date Done",
            actual = data.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0",
            actual = data.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54126-8",
            actual = data.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Annie Proband",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54125-0",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.1",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA3-6",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Female",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54131-8",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.2",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1966-04-04",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/21112-8",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.3",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Date of Birth",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54132-6",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.4",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Were you born a twin?",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54128-4",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.5",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Were you adopted?",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54135-9",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.6",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Are your parents related to each other in any way other than marriage?",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "[in_i]",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "inches",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.7.1.1",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Units",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.7.1",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "63".toDouble(),
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/8302-2",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.7",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Height",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(6)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "[lb_av]",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "pounds",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://unitsofmeasure.org",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.8.1.1",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Units",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.8.1",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "127".toDouble(),
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/29463-7",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.8",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Weight",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(7)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "22.5".toDouble(),
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(8)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/39156-5",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(8)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.9",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(8)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Body mass index (BMI) [Ratio]",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(8)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA4457-3",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "White",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54134-2",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(9)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1.10",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(9)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Race",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(9)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Your health information",
            actual = data.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54114-4",
            actual = data.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10405-1",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Daughter",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Susan",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA3-6",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Female",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "17".toDouble(),
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )
    }

    private fun assertQuestionnaireResponse02Step02(data: QuestionnaireResponse) {

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10415-0",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Brother",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Brian",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA2-8",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Male",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "32".toDouble(),
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10550-4",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-- Other Cancer",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2.1",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Disease or Condition",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10397-0",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "30-39",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2.2",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age at Diagnosis",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This family member's history of disease",
            actual = data.item?.get(2)?.item?.get(1)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10418-4",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Sister",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Janet",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA3-6",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Female",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "36".toDouble(),
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )
    }

    private fun assertQuestionnaireResponse02Step03(data: QuestionnaireResponse) {

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10536-3",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-- Breast Cancer",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2.1",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Disease or Condition",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10397-0",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "30-39",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2.2",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age at Diagnosis",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This family member's history of disease",
            actual = data.item?.get(2)?.item?.get(2)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10419-2",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Nephew",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Ian",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA2-8",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Male",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "16".toDouble(),
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(3)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10420-0",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Niece",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Helen",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA3-6",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Female",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "15".toDouble(),
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(4)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )
    }

    private fun assertQuestionnaireResponse02Step04(data: QuestionnaireResponse) {

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10416-8",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Father",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Donald",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA2-8",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Male",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "52".toDouble(),
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(5)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10425-9",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Paternal Uncle",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Eric",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA2-8",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Male",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "56".toDouble(),
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(6)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(6)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10421-8",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Paternal Aunt",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Fiona",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA3-6",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Female",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "57".toDouble(),
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )
    }

    private fun assertQuestionnaireResponse02Step05(data: QuestionnaireResponse) {

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54141-7",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2.2",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.2",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA33-6",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Yes",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10543-9",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-- Skin Cancer",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2.1",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Disease or Condition",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This family member's history of disease",
            actual = data.item?.get(2)?.item?.get(7)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(7)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10423-4",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Paternal Grandfather",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Bob",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA2-8",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Male",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10537-1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-- Colon Cancer",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54112-8",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.1.1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Cause of Death",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10400-2",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "OVER 60",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54113-6",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.1.2",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age at Death",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10537-1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-- Colon Cancer",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2.1",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Disease or Condition",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10400-2",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "OVER 60",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2.2",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age at Diagnosis",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.2",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This family member's history of disease",
            actual = data.item?.get(2)?.item?.get(8)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(8)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10424-2",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Paternal Grandmother",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54136-7",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.1",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relationship to you",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Claire",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54138-3",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )
    }

    private fun assertQuestionnaireResponse02Step06(data: QuestionnaireResponse) {

        assertEquals(
            expected = "2.1.1.2",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA3-6",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Female",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54123-5",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.3",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gender",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Lou Gehrigs",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.1.1.1",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Please specify",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10589-2",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "-- Other/Unexpected",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54112-8",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.1.1",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Cause of Death",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA10400-2",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "OVER 60",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54113-6",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.1.2",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Age at Death",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4.1",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54139-1",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.4",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Living?",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54121-9",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.5",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person born a twin?",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA32-8",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/fhir/DataElement/54122-7",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.definition
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1.6",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Was this person adopted?",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1.1",
            actual = data.item?.get(2)?.item?.get(9)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(2)?.item?.get(9)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Family member health information",
            actual = data.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Questionnaire/ussg-fht",
            actual = data.questionnaire
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = QuestionnaireResponseStatus.IN_PROGRESS,
            actual = data.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/proband",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.subject?.type
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testQuestionnaireResponse03() {
        // Given
        val sourceJson = loadAsString("r4/questionnaireresponse-example-f201-lifelines.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then
        assertQuestionnaireResponse03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaireResponse03Step01(data: QuestionnaireResponse) {

        assertEquals(
            expected = "Practitioner/f201",
            actual = data.author?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2013-06-18T00:00:00+01:00",
            actual = data.authored?.value.toString()
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "I am allergic to house dust",
            actual = data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Do you have allergies?",
            actual = data.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Male",
            actual = data.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "What is your gender?",
            actual = data.item?.get(1)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1960-03-13",
            actual = data.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "2.2",
            actual = data.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "What is your date of birth?",
            actual = data.item?.get(1)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "The Netherlands",
            actual = data.item?.get(1)?.item?.get(2)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.3",
            actual = data.item?.get(1)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "What is your country of birth?",
            actual = data.item?.get(1)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "married",
            actual = data.item?.get(1)?.item?.get(3)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2.4",
            actual = data.item?.get(1)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "What is your marital status?",
            actual = data.item?.get(1)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2",
            actual = data.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "General questions",
            actual = data.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No",
            actual = data.item?.get(2)?.item?.get(0)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3.1",
            actual = data.item?.get(2)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Do you smoke?",
            actual = data.item?.get(2)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "No, but I used to drink",
            actual = data.item?.get(2)?.item?.get(1)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3.2",
            actual = data.item?.get(2)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Do you drink alchohol?",
            actual = data.item?.get(2)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3",
            actual = data.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Intoxications",
            actual = data.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f201",
            actual = data.source?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = QuestionnaireResponseStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Roel",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/f201",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testQuestionnaireResponse04() {
        // Given
        val sourceJson = loadAsString("r4/questionnaireresponse-example-bluebook.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then
        assertQuestionnaireResponse04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaireResponse04Step01(data: QuestionnaireResponse) {

        assertEquals(
            expected = "http://hl7.org/fhir/Practitioner/example",
            actual = data.author?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner",
            actual = data.author?.type
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2013-02-19T14:15:00+10:00",
            actual = data.authored?.value.toString()
        )

        assertEquals(
            expected = "bb",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Cathy Jones",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "nameOfChild",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Name of child",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "f",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sex",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Sex",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "group",
            actual = data.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "3.25".toDouble(),
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "birthWeight",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Birth weight (kg)",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "44.3".toDouble(),
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "birthLength",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Birth length (cm)",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1972-11-30",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "vitaminKDose1",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1st dose",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1972-12-11",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "vitaminKDose2",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2nd dose",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "vitaminKgivenDoses",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "INJECTION",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "vitaminKgiven",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Vitamin K given",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1972-12-04",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDate?.value.toString()
        )

        assertEquals(
            expected = "hepBgivenDate",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Date given",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.valueBoolean?.value
        )

        assertEquals(
            expected = "hepBgiven",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Hep B given y / n",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Already able to speak Chinese",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(4)?.answer?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "abnormalitiesAtBirth",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(4)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Abnormalities noted at birth",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(4)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "neonatalInformation",
            actual = data.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Neonatal Information",
            actual = data.item?.get(0)?.item?.get(1)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "birthDetails",
            actual = data.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Birth details - To be completed by health professional",
            actual = data.item?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = QuestionnaireResponseStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Patient/1",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.subject?.type
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testQuestionnaireResponse05() {
        // Given
        val sourceJson = loadAsString("r4/questionnaireresponse-example-gcs.json")

        // When
        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)

        // Then
        assertQuestionnaireResponse05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaireResponse05Step01(data: QuestionnaireResponse) {

        assertEquals(
            expected = "2014-12-11T04:44:16Z",
            actual = data.authored?.value.toString()
        )

        assertEquals(
            expected = "gcs",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA6560-2",
            actual = data.item?.get(0)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Confused",
            actual = data.item?.get(0)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/ordinalValue",
            actual = data.item?.get(0)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "4".toDouble(),
            actual = data.item?.get(0)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(0)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA6566-9",
            actual = data.item?.get(1)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Localizing pain",
            actual = data.item?.get(1)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/ordinalValue",
            actual = data.item?.get(1)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "5".toDouble(),
            actual = data.item?.get(1)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.2",
            actual = data.item?.get(1)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LA6556-0",
            actual = data.item?.get(2)?.answer?.get(0)?.valueCoding?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Eyes open spontaneously",
            actual = data.item?.get(2)?.answer?.get(0)?.valueCoding?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/ordinalValue",
            actual = data.item?.get(2)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "4".toDouble(),
            actual = data.item?.get(2)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal?.value
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.answer?.get(0)?.valueCoding?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.3",
            actual = data.item?.get(2)?.linkId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "HTEST",
            actual = data.meta?.tag?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "test health data",
            actual = data.meta?.tag?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/v3-ActReason",
            actual = data.meta?.tag?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Questionnaire/gcs",
            actual = data.questionnaire
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practitioner/f007",
            actual = data.source?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = QuestionnaireResponseStatus.COMPLETED,
            actual = data.status
        )

        assertEquals(
            expected = "Peter James Chalmers",
            actual = data.subject?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
