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
class QuestionnaireTest {

    val parser = FhirR4Parser()

    @Test
    fun testQuestionnaire01() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-cqf-example.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertEquals(
            "44249-1",
            data.code?.get(0)?.code
        )
        assertEquals(
            "PHQ-9 quick depression assessment panel:-:Pt:^Patient:-:Report.PHQ-9",
            data.code?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.code?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/cqf-library",
            data.extension?.get(0)?.url
        )
        assertEquals(
            "Library/phq-9-logic",
            data.extension?.get(0)?.valueCanonical
        )
        assertEquals(
            "phq-9-questionnaire",
            data.id
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "phq-9",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(0)?.answerValueSet
        )
        assertEquals(
            "44250-9",
            data.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "LittleInterest",
            data.item?.get(0)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(0)?.required?.value
        )
        assertEquals(
            "Little interest or pleasure in doing things",
            data.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(1)?.answerValueSet
        )
        assertEquals(
            "44255-8",
            data.item?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(1)?.code?.get(0)?.system
        )
        assertEquals(
            "FeelingDown",
            data.item?.get(1)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(1)?.required?.value
        )
        assertEquals(
            "Feeling down, depressed, or hopeless",
            data.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(1)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(2)?.answerValueSet
        )
        assertEquals(
            "44259-0",
            data.item?.get(2)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.code?.get(0)?.system
        )
        assertEquals(
            "TroubleSleeping",
            data.item?.get(2)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(2)?.required?.value
        )
        assertEquals(
            "Trouble falling or staying asleep",
            data.item?.get(2)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(2)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(3)?.answerValueSet
        )
        assertEquals(
            "44254-1",
            data.item?.get(3)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(3)?.code?.get(0)?.system
        )
        assertEquals(
            "FeelingTired",
            data.item?.get(3)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(3)?.required?.value
        )
        assertEquals(
            "Feeling tired or having little energy",
            data.item?.get(3)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(3)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(4)?.answerValueSet
        )
        assertEquals(
            "44251-7",
            data.item?.get(4)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(4)?.code?.get(0)?.system
        )
        assertEquals(
            "BadAppetite",
            data.item?.get(4)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(4)?.required?.value
        )
        assertEquals(
            "Poor appetite or overeating",
            data.item?.get(4)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(4)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(5)?.answerValueSet
        )
        assertEquals(
            "44258-2",
            data.item?.get(5)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(5)?.code?.get(0)?.system
        )
        assertEquals(
            "FeelingBadAboutSelf",
            data.item?.get(5)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(5)?.required?.value
        )
        assertEquals(
            "Feeling bad about yourself - or that you are a failure or have let yourself or your family down",
            data.item?.get(5)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(5)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(6)?.answerValueSet
        )
        assertEquals(
            "44252-5",
            data.item?.get(6)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(6)?.code?.get(0)?.system
        )
        assertEquals(
            "TroubleConcentrating",
            data.item?.get(6)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(6)?.required?.value
        )
        assertEquals(
            "Trouble concentrating on things, such as reading the newspaper or watching television",
            data.item?.get(6)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(6)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(7)?.answerValueSet
        )
        assertEquals(
            "44253-3",
            data.item?.get(7)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(7)?.code?.get(0)?.system
        )
        assertEquals(
            "MovingSpeaking",
            data.item?.get(7)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(7)?.required?.value
        )
        assertEquals(
            "Moving or speaking so slowly that other people could have noticed. Or the opposite - being so fidgety or restless that you have been moving around a lot more than usual",
            data.item?.get(7)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(7)?.type
        )
        assertEquals(
            "44261-6",
            data.item?.get(8)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(8)?.code?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/cqf-expression",
            data.item?.get(8)?.extension?.get(0)?.url
        )
        assertEquals(
            "CalculateTotalScore",
            data.item?.get(8)?.extension?.get(0)?.valueExpression?.expression
        )
        assertEquals(
            "text/cql",
            data.item?.get(8)?.extension?.get(0)?.valueExpression?.language
        )
        assertEquals(
            "TotalScore",
            data.item?.get(8)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(8)?.required?.value
        )
        assertEquals(
            "Total score",
            data.item?.get(8)?.text
        )
        assertEquals(
            QuestionnaireItemType.INTEGER,
            data.item?.get(8)?.type
        )
        assertEquals(
            "http://loinc.org/vs/LL358-3",
            data.item?.get(9)?.answerValueSet
        )
        assertEquals(
            "44256-6",
            data.item?.get(9)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(9)?.code?.get(0)?.system
        )
        assertEquals(
            "Difficulty",
            data.item?.get(9)?.linkId
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(9)?.required?.value
        )
        assertEquals(
            "If you checked off any problems, how difficult have these problems made it for you to do your work, take care of things at home, or get along with other people",
            data.item?.get(9)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(9)?.type
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/cqf-questionnaire",
            data.meta?.profile?.get(0)
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
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            ResourceType.PATIENT,
            data.subjectType?.get(0)
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">PHQ-9 Questionnaire with dynamic logic</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Patient Health Questionnaire (PHQ-9)",
            data.title
        )
        assertEquals(
            "1.0.0",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaire02() {
        // FIXME Test disabled due to issues with examplescenario-questionnaire.json
        // REASON - ExampleScenario contains an item that is just an extension and fails with linkId required
        assertEquals(true, true)
    }

    @Test
    fun testQuestionnaire03() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertEquals(
            "2012-01",
            data.date?.value.toString()
        )
        assertEquals(
            "3141",
            data.id
        )
        assertEquals(
            "COMORBIDITY",
            data.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "http://example.org/system/code/sections",
            data.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/yesnodontknow",
            data.item?.get(0)?.item?.get(0)?.answerValueSet
        )
        assertEquals(
            "COMORB",
            data.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "http://example.org/system/code/questions",
            data.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "CARDIAL",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "http://example.org/system/code/sections",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "Y",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.answerCoding?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/v2-0136",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.answerCoding?.system
        )
        assertEquals(
            QuestionnaireItemOperator.EQUAL,
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.operator
        )
        assertEquals(
            "1.1",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.enableWhen?.get(0)?.question
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/yesnodontknow",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answerValueSet
        )
        assertEquals(
            "COMORBCAR",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "http://example.org/system/code/questions",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/yesnodontknow",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answerValueSet
        )
        assertEquals(
            "COMCAR00",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "Angina Pectoris",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.display
        )
        assertEquals(
            "http://example.org/system/code/questions",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "194828000",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(1)?.code
        )
        assertEquals(
            "Angina (disorder)",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(1)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.code?.get(1)?.system
        )
        assertEquals(
            "1.1.1.1.1",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "1.1.1",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.prefix
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/yesnodontknow",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerValueSet
        )
        assertEquals(
            "22298006",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "Myocardial infarction (disorder)",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.system
        )
        assertEquals(
            "1.1.1.1.2",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
        )
        assertEquals(
            "1.1.2",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.prefix
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.type
        )
        assertEquals(
            "1.1.1.1",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "1.1",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.prefix
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "http://hl7.org/fhir/ValueSet/yesnodontknow",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerValueSet
        )
        assertEquals(
            "COMORBVAS",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "http://example.org/system/code/questions",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.code?.get(0)?.system
        )
        assertEquals(
            "1.1.1.2",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
        )
        assertEquals(
            "1.2",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.prefix
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.type
        )
        assertEquals(
            "1.1.1",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "1.1",
            data.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "1",
            data.item?.get(0)?.item?.get(0)?.prefix
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "1",
            data.item?.get(0)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(0)?.type
        )
        assertEquals(
            "HISTOPATHOLOGY",
            data.item?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "http://example.org/system/code/sections",
            data.item?.get(1)?.code?.get(0)?.system
        )
        assertEquals(
            "ABDOMINAL",
            data.item?.get(1)?.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "http://example.org/system/code/sections",
            data.item?.get(1)?.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "STADPT",
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "pT category",
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.display
        )
        assertEquals(
            "http://example.org/system/code/questions",
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "2.1.2",
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "2.1",
            data.item?.get(1)?.item?.get(0)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(1)?.item?.get(0)?.type
        )
        assertEquals(
            "2",
            data.item?.get(1)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(1)?.type
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            ResourceType.PATIENT,
            data.subjectType?.get(0)
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Cancer Quality Forum Questionnaire 2012",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/Questionnaire/3141",
            data.url
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaire04() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example-f201-lifelines.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertEquals(
            "VL 1-1, 18-65_1.2.2",
            data.code?.get(0)?.code
        )
        assertEquals(
            "Lifelines Questionnaire 1 part 1",
            data.code?.get(0)?.display
        )
        assertEquals(
            "http://example.org/system/code/lifelines/nl",
            data.code?.get(0)?.system
        )
        assertEquals(
            "2010",
            data.date?.value.toString()
        )
        assertEquals(
            "f201",
            data.id
        )
        assertEquals(
            "1",
            data.item?.get(0)?.linkId
        )
        assertEquals(
            "Do you have allergies?",
            data.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.BOOLEAN,
            data.item?.get(0)?.type
        )
        assertEquals(
            "2.1",
            data.item?.get(1)?.item?.get(0)?.linkId
        )
        assertEquals(
            "What is your gender?",
            data.item?.get(1)?.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.STRING,
            data.item?.get(1)?.item?.get(0)?.type
        )
        assertEquals(
            "2.2",
            data.item?.get(1)?.item?.get(1)?.linkId
        )
        assertEquals(
            "What is your date of birth?",
            data.item?.get(1)?.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.DATE,
            data.item?.get(1)?.item?.get(1)?.type
        )
        assertEquals(
            "2.3",
            data.item?.get(1)?.item?.get(2)?.linkId
        )
        assertEquals(
            "What is your country of birth?",
            data.item?.get(1)?.item?.get(2)?.text
        )
        assertEquals(
            QuestionnaireItemType.STRING,
            data.item?.get(1)?.item?.get(2)?.type
        )
        assertEquals(
            "2.4",
            data.item?.get(1)?.item?.get(3)?.linkId
        )
        assertEquals(
            "What is your marital status?",
            data.item?.get(1)?.item?.get(3)?.text
        )
        assertEquals(
            QuestionnaireItemType.STRING,
            data.item?.get(1)?.item?.get(3)?.type
        )
        assertEquals(
            "2",
            data.item?.get(1)?.linkId
        )
        assertEquals(
            "General questions",
            data.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(1)?.type
        )
        assertEquals(
            "3.1",
            data.item?.get(2)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Do you smoke?",
            data.item?.get(2)?.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.BOOLEAN,
            data.item?.get(2)?.item?.get(0)?.type
        )
        assertEquals(
            "3.2",
            data.item?.get(2)?.item?.get(1)?.linkId
        )
        assertEquals(
            "Do you drink alchohol?",
            data.item?.get(2)?.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.BOOLEAN,
            data.item?.get(2)?.item?.get(1)?.type
        )
        assertEquals(
            "3",
            data.item?.get(2)?.linkId
        )
        assertEquals(
            "Intoxications",
            data.item?.get(2)?.text
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(2)?.type
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            ResourceType.PATIENT,
            data.subjectType?.get(0)
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "http://hl7.org/fhir/Questionnaire/f201",
            data.url
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaire05() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example-gcs.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertEquals(
            "9269-2",
            data.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.code?.get(0)?.system
        )
        assertEquals(
            "motor",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "verbal",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "eye",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "2015-08-03",
            data.date?.value.toString()
        )
        assertEquals(
            "gcs",
            data.id
        )
        assertEquals(
            "#verbal",
            data.item?.get(0)?.answerValueSet
        )
        assertEquals(
            "9270-0",
            data.item?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(0)?.code?.get(0)?.system
        )
        assertEquals(
            "1.1",
            data.item?.get(0)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.type
        )
        assertEquals(
            "#motor",
            data.item?.get(1)?.answerValueSet
        )
        assertEquals(
            "9268-4",
            data.item?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(1)?.code?.get(0)?.system
        )
        assertEquals(
            "1.2",
            data.item?.get(1)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(1)?.type
        )
        assertEquals(
            "#eye",
            data.item?.get(2)?.answerValueSet
        )
        assertEquals(
            "9267-6",
            data.item?.get(2)?.code?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.item?.get(2)?.code?.get(0)?.system
        )
        assertEquals(
            "1.3",
            data.item?.get(2)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(2)?.type
        )
        assertEquals(
            "FHIR Project team",
            data.publisher
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            ResourceType.PATIENT,
            data.subjectType?.get(0)
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Glasgow Coma Score",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/Questionnaire/gcs",
            data.url
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testQuestionnaire06() {
        // Given
        val sourceJson = loadAsString("r4/questionnaire-example-bluebook.json")

        // When
        val data = parser.toFhir(Questionnaire::class, sourceJson)

        // Then
        assertEquals(
            "2013-02-19",
            data.date?.value.toString()
        )
        assertEquals(
            "bb",
            data.id
        )
        assertEquals(
            "nameOfChild",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Name of child",
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.STRING,
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "F",
            data.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerOption?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "M",
            data.item?.get(0)?.item?.get(0)?.item?.get(1)?.answerOption?.get(1)?.valueCoding?.code
        )
        assertEquals(
            "sex",
            data.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId
        )
        assertEquals(
            "Sex",
            data.item?.get(0)?.item?.get(0)?.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.item?.get(0)?.item?.get(1)?.type
        )
        assertEquals(
            "group",
            data.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "birthWeight",
            data.item?.get(0)?.item?.get(1)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Birth weight (kg)",
            data.item?.get(0)?.item?.get(1)?.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.DECIMAL,
            data.item?.get(0)?.item?.get(1)?.item?.get(0)?.type
        )
        assertEquals(
            "birthLength",
            data.item?.get(0)?.item?.get(1)?.item?.get(1)?.linkId
        )
        assertEquals(
            "Birth length (cm)",
            data.item?.get(0)?.item?.get(1)?.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.DECIMAL,
            data.item?.get(0)?.item?.get(1)?.item?.get(1)?.type
        )
        assertEquals(
            "INJECTION",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answerOption?.get(0)?.valueCoding?.code
        )
        assertEquals(
            "INTRAVENOUS",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answerOption?.get(1)?.valueCoding?.code
        )
        assertEquals(
            "ORAL",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answerOption?.get(2)?.valueCoding?.code
        )
        assertEquals(
            "True".toBoolean(),
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.enableWhen?.get(0)?.answerBoolean?.value
        )
        assertEquals(
            QuestionnaireItemOperator.EXISTS,
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.enableWhen?.get(0)?.operator
        )
        assertEquals(
            "vitaminKgiven",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.enableWhen?.get(0)?.question
        )
        assertEquals(
            "vitaminiKDose1",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId
        )
        assertEquals(
            "1st dose",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.DATETIME,
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.type
        )
        assertEquals(
            "vitaminiKDose2",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.linkId
        )
        assertEquals(
            "2nd dose",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.DATETIME,
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.type
        )
        assertEquals(
            "vitaminKgivenDoses",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.linkId
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.item?.get(0)?.type
        )
        assertEquals(
            "vitaminKgiven",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.linkId
        )
        assertEquals(
            "Vitamin K given",
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.text
        )
        assertEquals(
            QuestionnaireItemType.CHOICE,
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.type
        )
        assertEquals(
            "hepBgivenDate",
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.item?.get(0)?.linkId
        )
        assertEquals(
            "Date given",
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.DATE,
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.item?.get(0)?.type
        )
        assertEquals(
            "hepBgiven",
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.linkId
        )
        assertEquals(
            "Hep B given y / n",
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.text
        )
        assertEquals(
            QuestionnaireItemType.BOOLEAN,
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.type
        )
        assertEquals(
            "abnormalitiesAtBirth",
            data.item?.get(0)?.item?.get(1)?.item?.get(4)?.linkId
        )
        assertEquals(
            "Abnormalities noted at birth",
            data.item?.get(0)?.item?.get(1)?.item?.get(4)?.text
        )
        assertEquals(
            QuestionnaireItemType.STRING,
            data.item?.get(0)?.item?.get(1)?.item?.get(4)?.type
        )
        assertEquals(
            "neonatalInformation",
            data.item?.get(0)?.item?.get(1)?.linkId
        )
        assertEquals(
            "Neonatal Information",
            data.item?.get(0)?.item?.get(1)?.text
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(0)?.item?.get(1)?.type
        )
        assertEquals(
            "birthDetails",
            data.item?.get(0)?.linkId
        )
        assertEquals(
            "Birth details - To be completed by health professional",
            data.item?.get(0)?.text
        )
        assertEquals(
            QuestionnaireItemType.GROUP,
            data.item?.get(0)?.type
        )
        assertEquals(
            "AU",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "New South Wales Department of Health",
            data.publisher
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            ResourceType.PATIENT,
            data.subjectType?.get(0)
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "NSW Government My Personal Health Record",
            data.title
        )
        assertEquals(
            "http://hl7.org/fhir/Questionnaire/bb",
            data.url
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
