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
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.QuestionnaireItemOperator
import care.data4life.hl7.fhir.r4.codesystem.QuestionnaireItemType
import care.data4life.hl7.fhir.r4.codesystem.ResourceType
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class QuestionnaireFhirTest {

    val parser = FhirR4Parser()

    @Test
    fun testQuestionnaire01() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-cqf-example.json")

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
            expected = "44249-1",
            actual = data.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PHQ-9 quick depression assessment panel:-:Pt:^Patient:-:Report.PHQ-9",
            actual = data.code?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/cqf-library",
            actual = data.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Library/phq-9-logic",
            actual = data.extension?.get(0)?.valueCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "phq-9-questionnaire",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "phq-9",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(0)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44250-9",
            actual = data.item?.get(0)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(0)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "LittleInterest",
            actual = data.item?.get(0)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(0)?.required?.value
        )

        assertEquals(
            expected = "Little interest or pleasure in doing things",
            actual = data.item?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(1)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44255-8",
            actual = data.item?.get(1)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(1)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FeelingDown",
            actual = data.item?.get(1)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(1)?.required?.value
        )

        assertEquals(
            expected = "Feeling down, depressed, or hopeless",
            actual = data.item?.get(1)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(1)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(2)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44259-0",
            actual = data.item?.get(2)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(2)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TroubleSleeping",
            actual = data.item?.get(2)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(2)?.required?.value
        )

        assertEquals(
            expected = "Trouble falling or staying asleep",
            actual = data.item?.get(2)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(2)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(3)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44254-1",
            actual = data.item?.get(3)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(3)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FeelingTired",
            actual = data.item?.get(3)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(3)?.required?.value
        )

        assertEquals(
            expected = "Feeling tired or having little energy",
            actual = data.item?.get(3)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(3)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(4)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44251-7",
            actual = data.item?.get(4)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(4)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "BadAppetite",
            actual = data.item?.get(4)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(4)?.required?.value
        )

        assertEquals(
            expected = "Poor appetite or overeating",
            actual = data.item?.get(4)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(4)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(5)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44258-2",
            actual = data.item?.get(5)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(5)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FeelingBadAboutSelf",
            actual = data.item?.get(5)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(5)?.required?.value
        )

        assertEquals(
            expected = "Feeling bad about yourself - or that you are a failure or have let yourself or your family down",
            actual = data.item?.get(5)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(5)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(6)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44252-5",
            actual = data.item?.get(6)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(6)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TroubleConcentrating",
            actual = data.item?.get(6)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(6)?.required?.value
        )

        assertEquals(
            expected = "Trouble concentrating on things, such as reading the newspaper or watching television",
            actual = data.item?.get(6)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(6)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(7)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44253-3",
            actual = data.item?.get(7)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(7)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MovingSpeaking",
            actual = data.item?.get(7)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(7)?.required?.value
        )

        assertEquals(
            expected = "Moving or speaking so slowly that other people could have noticed. Or the opposite - being so fidgety or restless that you have been moving around a lot more than usual",
            actual = data.item?.get(7)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(7)?.type
        )

        assertEquals(
            expected = "44261-6",
            actual = data.item?.get(8)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(8)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/cqf-expression",
            actual = data.item?.get(8)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CalculateTotalScore",
            actual = data.item?.get(8)?.extension?.get(0)?.valueExpression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.item?.get(8)?.extension?.get(0)?.valueExpression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "TotalScore",
            actual = data.item?.get(8)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(8)?.required?.value
        )

        assertEquals(
            expected = "Total score",
            actual = data.item?.get(8)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.INTEGER,
            actual = data.item?.get(8)?.type
        )

        assertEquals(
            expected = "http://loinc.org/vs/LL358-3",
            actual = data.item?.get(9)?.answerValueSet
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "44256-6",
            actual = data.item?.get(9)?.code?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.item?.get(9)?.code?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Difficulty",
            actual = data.item?.get(9)?.linkId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(9)?.required?.value
        )

        assertEquals(
            expected = "If you checked off any problems, how difficult have these problems made it for you to do your work, take care of things at home, or get along with other people",
            actual = data.item?.get(9)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(9)?.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/cqf-questionnaire",
            actual = data.meta?.profile?.get(0)
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
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = ResourceType.PATIENT,
            actual = data.subjectType?.get(0)
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">PHQ-9 Questionnaire with dynamic logic</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Patient Health Questionnaire (PHQ-9)",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testQuestionnaire02() {
        // FIXME Test disabled due to issues with examplescenario-questionnaire.json
        // REASON - ExampleScenario contains an item that is just an extension and fails with linkId required
        assertEquals(expected = true, actual = true)
    }

    @Test
    fun testQuestionnaire03() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example.json")

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
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.answerValueSet
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
            expected = "http://terminology.hl7.org/CodeSystem/v2-0136",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.answerCoding?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemOperator.EQUAL,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.operator
        )

        assertEquals(
            expected = "1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.question
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answerValueSet
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
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answerValueSet
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
            expected = "1.1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.prefix
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerValueSet
                ?.replace("\\n", " ")
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
            expected = "1.1",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.prefix
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )

        assertEquals(
            expected = "http://hl7.org/fhir/ValueSet/yesnodontknow",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerValueSet
                ?.replace("\\n", " ")
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
    fun testQuestionnaire04() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example-f201-lifelines.json")

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
    fun testQuestionnaire05() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example-gcs.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertQuestionnaire05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaire05Step01(data: Questionnaire) {

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
            expected = "#verbal",
            actual = data.item?.get(0)?.answerValueSet
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
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(0)?.type
        )

        assertEquals(
            expected = "#motor",
            actual = data.item?.get(1)?.answerValueSet
                ?.replace("\\n", " ")
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
            expected = QuestionnaireItemType.CHOICE,
            actual = data.item?.get(1)?.type
        )

        assertEquals(
            expected = "#eye",
            actual = data.item?.get(2)?.answerValueSet
                ?.replace("\\n", " ")
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
    fun testQuestionnaire06() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example-bluebook.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertQuestionnaire06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertQuestionnaire06Step01(data: Questionnaire) {

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
            expected = "F",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerOption?.get(0)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "M",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerOption?.get(1)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "sex",
            actual = data.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
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
            expected = "INJECTION",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answerOption?.get(0)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "INTRAVENOUS",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answerOption?.get(1)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ORAL",
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answerOption?.get(2)?.valueCoding?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.enableWhen?.get(0)?.answerBoolean?.value
        )

        assertEquals(
            expected = QuestionnaireItemOperator.EXISTS,
            actual = data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.enableWhen?.get(0)?.operator
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
