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
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.QuestionnaireItemType
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * QuestionnaireTest.java
 *
 * A structured set of questions
 *
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow
 * coherent, consistent data collection.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class QuestionnaireTest {

    val parser = FhirStu3Parser()

    @Test
    fun testQuestionnaire01() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaire-example.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertQuestionnaire01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaire01Step01(data: Questionnaire) {

        assertEquals(
            expected = "2012-01",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "3141",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "COMORBIDITY",
            actual = data.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/sections",
            actual = data.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "COMORB",
            actual = data.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/questions",
            actual = data.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CARDIAL",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/sections",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Y",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.answerCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/v2/0136",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.answerCoding?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.question
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "COMORBCAR",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/questions",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "COMCAR00",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Angina Pectoris",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/questions",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "194828000",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(1)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Angina (disorder)",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(1)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1.1.1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.prefix
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "22298006",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Myocardial infarction (disorder)",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1.1.1.2",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1.2",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.prefix
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "1.1.1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.prefix
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "COMORBVAS",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/questions",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1.1.2",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.2",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.prefix
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "1.1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.item?.get(0)?.prefix
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(0)?.type
        )

        assertEquals(
            expected = "HISTOPATHOLOGY",
            actual = data.item?.get(1)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/sections",
            actual = data.item?.get(1)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ABDOMINAL",
            actual = data.item?.get(1)?.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/sections",
            actual = data.item?.get(1)?.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "STADPT",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "pT category",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/questions",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.1.2",
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(1)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(1)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "2",
            actual = data.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(1)?.type
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.subjectType?.get(0)
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Cancer Quality Forum Questionnaire 2012",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Questionnaire/3141",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testQuestionnaire02() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaire-example-f201-lifelines.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertQuestionnaire02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaire02Step01(data: Questionnaire) {

        assertEquals(
            expected = "VL 1-1, 18-65_1.2.2",
            actual = data.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Lifelines Questionnaire 1 part 1",
            actual = data.code?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/system/code/lifelines/nl",
            actual = data.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2010",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "f201",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Do you have allergies?",
            actual = data.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.BOOLEAN,
            actual = data.item?.get(0)?.type
        )

        assertEquals(
            expected = "2.1",
            actual = data.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "What is your gender?",
            actual = data.item?.get(1)?.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.STRING,
            actual = data.item?.get(1)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "2.2",
            actual = data.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "What is your date of birth?",
            actual = data.item?.get(1)?.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.DATE,
            actual = data.item?.get(1)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "2.3",
            actual = data.item?.get(1)?.item?.get(2)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "What is your country of birth?",
            actual = data.item?.get(1)?.item?.get(2)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.STRING,
            actual = data.item?.get(1)?.item?.get(2)?.type
        )

        assertEquals(
            expected = "2.4",
            actual = data.item?.get(1)?.item?.get(3)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "What is your marital status?",
            actual = data.item?.get(1)?.item?.get(3)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.STRING,
            actual = data.item?.get(1)?.item?.get(3)?.type
        )

        assertEquals(
            expected = "2",
            actual = data.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "General questions",
            actual = data.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(1)?.type
        )

        assertEquals(
            expected = "3.1",
            actual = data.item?.get(2)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Do you smoke?",
            actual = data.item?.get(2)?.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.BOOLEAN,
            actual = data.item?.get(2)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "3.2",
            actual = data.item?.get(2)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Do you drink alchohol?",
            actual = data.item?.get(2)?.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.BOOLEAN,
            actual = data.item?.get(2)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "3",
            actual = data.item?.get(2)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Intoxications",
            actual = data.item?.get(2)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(2)?.type
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.subjectType?.get(0)
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Questionnaire/f201",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testQuestionnaire03() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaire-example-gcs.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertQuestionnaire03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaire03Step01(data: Questionnaire) {

        assertEquals(
            expected = "9269-2",
            actual = data.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "motor",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "verbal",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eye",
            actual = data.contained?.get(2)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-08-03",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "gcs",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "9270-0",
            actual = data.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#verbal",
            actual = data.item?.get(0)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.type
        )

        assertEquals(
            expected = "9268-4",
            actual = data.item?.get(1)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.2",
            actual = data.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#motor",
            actual = data.item?.get(1)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(1)?.type
        )

        assertEquals(
            expected = "9267-6",
            actual = data.item?.get(2)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.3",
            actual = data.item?.get(2)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#eye",
            actual = data.item?.get(2)?.options?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(2)?.type
        )

        assertEquals(
            expected = "FHIR Project team",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.subjectType?.get(0)
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Glasgow Coma Score",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Questionnaire/gcs",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testQuestionnaire04() {
        // Given
        val sourceJson = loadAsString("stu3/questionnaire-example-bluebook.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertQuestionnaire04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaire04Step01(data: Questionnaire) {

        assertEquals(
            expected = "2013-02-19",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "bb",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "nameOfChild",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Name of child",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.STRING,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "sex",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "F",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.option?.get(0)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "M",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.option?.get(1)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Sex",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "group",
            actual = data.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "birthWeight",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Birth weight (kg)",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.DECIMAL,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "birthLength",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Birth length (cm)",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.DECIMAL,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.enableWhen?.get(0)?.hasAnswer?.value
        )

        assertEquals(
            expected = "vitaminKgiven",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.enableWhen?.get(0)?.question
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "vitaminiKDose1",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1st dose",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.DATETIME,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "vitaminiKDose2",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2nd dose",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.DATETIME,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "vitaminKgivenDoses",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "vitaminKgiven",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "INJECTION",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.option?.get(0)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "INTRAVENOUS",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.option?.get(1)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ORAL",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.option?.get(2)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Vitamin K given",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.type
        )

        assertEquals(
            expected = "hepBgivenDate",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Date given",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.DATE,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "hepBgiven",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Hep B given y / n",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.BOOLEAN,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(3)?.type
        )

        assertEquals(
            expected = "abnormalitiesAtBirth",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(4)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Abnormalities noted at birth",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(4)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.STRING,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(4)?.type
        )

        assertEquals(
            expected = "neonatalInformation",
            actual = data.item?.get(0)?.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Neonatal Information",
            actual = data.item?.get(0)?.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(0)?.item?.get(1)?.type
        )

        assertEquals(
            expected = "birthDetails",
            actual = data.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Birth details - To be completed by health professional",
            actual = data.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.GROUP,
            actual = data.item?.get(0)?.type
        )

        assertEquals(
            expected = "AU",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "New South Wales Department of Health",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.subjectType?.get(0)
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "NSW Government My Personal Health Record",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Questionnaire/bb",
            actual = data.url
                ?.replace("\\n", " ")
        )
    }
}
