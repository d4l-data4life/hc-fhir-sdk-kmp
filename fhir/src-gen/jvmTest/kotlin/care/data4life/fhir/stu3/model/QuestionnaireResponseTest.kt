/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.model


import care.data4life.fhir.stu3.FhirStu3Parser
import care.data4life.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.fhir.stu3.codesystem.QuestionnaireResponseStatus
import care.data4life.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import javax.annotation.Generated
import kotlin.test.assertEquals

/**
 * QuestionnaireResponseTest.java
 *
 * A structured set of questions and their answers.
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 *
 */
@Generated("Generated from FHIR 3.0.1.11917 on 2020-10-01")
class QuestionnaireResponseTest {

    val parser = FhirStu3Parser()


    @Test
    fun testQuestionnaireResponse1() {
        val sourceJson = loadAsString("questionnaireresponse-example.json")

        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)


        assertEquals(data.author?.reference, "#questauth")
        assertEquals(data.authored, "2013-02-19T14:15:00-05:00")
        assertEquals(data.basedOn?.get(0)?.reference, "#order")
        assertEquals(data.contained?.get(0)?.id, "patsub")
        assertEquals(data.contained?.get(1)?.id, "order")
        assertEquals(data.contained?.get(2)?.id, "questauth")
        assertEquals(data.context?.reference, "Encounter/example")
        assertEquals(data.id, "3141")
        assertEquals(
            data.identifier?.system,
            "http://example.org/fhir/NamingSystem/questionnaire-ids"
        )
        assertEquals(data.identifier?.value, "Q12349876")
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.code, "1"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueCoding?.system, "http://cancer.questionnaire.org/system/code/yesno"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(0)?.linkId,
            "1.1.1.1"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(
                0
            )?.valueCoding?.code, "1"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(
                0
            )?.valueCoding?.system, "http://cancer.questionnaire.org/system/code/yesno"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(1)?.linkId,
            "1.1.1.2"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(
                0
            )?.valueCoding?.code, "0"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(
                0
            )?.valueCoding?.system, "http://cancer.questionnaire.org/system/code/yesno"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.item?.get(2)?.linkId,
            "1.1.1.3"
        )
        assertEquals(data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.linkId, "1.1.1")
        assertEquals(data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code, "1")
        assertEquals(data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display, "Yes")
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://cancer.questionnaire.org/system/code/yesno"
        )
        assertEquals(data.item?.get(0)?.item?.get(0)?.linkId, "1.1")
        assertEquals(data.item?.get(0)?.linkId, "1")
        assertEquals(data.parent?.get(0)?.reference, "Procedure/f201")
        assertEquals(data.status, QuestionnaireResponseStatus.COMPLETED)
        assertEquals(data.subject?.reference, "#patsub")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testQuestionnaireResponse2() {
        val sourceJson = loadAsString("questionnaireresponse-example-ussg-fht-answers.json")

        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)


        assertEquals(data.authored, "2008-01-17")
        assertEquals(data.id, "ussg-fht-answers")
        assertEquals(data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueDate, "2008-01-17")
        assertEquals(data.item?.get(0)?.item?.get(0)?.linkId, "0.1")
        assertEquals(data.item?.get(0)?.item?.get(0)?.text, "Date Done")
        assertEquals(data.item?.get(0)?.linkId, "0")
        assertEquals(data.item?.get(1)?.definition, "http://loinc.org/fhir/DataElement/54126-8")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString,
            "Annie Proband"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54125-0"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId, "1.1.1")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(0)?.text, "Name")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code,
            "LA3-6"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display,
            "Female"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54131-8"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(1)?.linkId, "1.1.2")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(1)?.text, "Gender")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueDate,
            "1966-04-04"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/21112-8"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(2)?.linkId, "1.1.3")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(2)?.text, "Date of Birth")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54132-6"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(3)?.linkId, "1.1.4")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(3)?.text, "Were you born a twin?")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54128-4"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(4)?.linkId, "1.1.5")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(4)?.text, "Were you adopted?")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54135-9"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(5)?.linkId, "1.1.6")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(5)?.text,
            "Are your parents related to each other in any way other than marriage?"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.code, "[in_i]"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.display, "inches"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.system, "http://unitsofmeasure.org"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId, "1.1.7.1.1"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text, "Units"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.item?.get(0)?.linkId,
            "1.1.7.1"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.answer?.get(0)?.valueDecimal,
            "63"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(6)?.definition,
            "http://loinc.org/fhir/DataElement/8302-2"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(6)?.linkId, "1.1.7")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(6)?.text, "Height")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.code, "lb"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.display, "pounds"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueCoding?.system, "http://unitsofmeasure.org"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId, "1.1.8.1.1"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text, "Units"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.item?.get(0)?.linkId,
            "1.1.8.1"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.answer?.get(0)?.valueDecimal,
            "127"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(7)?.definition,
            "http://loinc.org/fhir/DataElement/29463-7"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(7)?.linkId, "1.1.8")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(7)?.text, "Weight")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(8)?.answer?.get(0)?.valueDecimal,
            "22.5"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(8)?.definition,
            "http://loinc.org/fhir/DataElement/39156-5"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(8)?.linkId, "1.1.9")
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(8)?.text,
            "Body mass index (BMI) [Ratio]"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.code,
            "LA4457-3"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.display,
            "White"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(1)?.item?.get(0)?.item?.get(9)?.definition,
            "http://loinc.org/fhir/DataElement/54134-2"
        )
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(9)?.linkId, "1.1.10")
        assertEquals(data.item?.get(1)?.item?.get(0)?.item?.get(9)?.text, "Race")
        assertEquals(data.item?.get(1)?.item?.get(0)?.linkId, "1.1")
        assertEquals(data.item?.get(1)?.linkId, "1")
        assertEquals(data.item?.get(1)?.text, "Your health information")
        assertEquals(data.item?.get(2)?.definition, "http://loinc.org/fhir/DataElement/54114-4")
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10405-1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Daughter"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Susan"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA3-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Female"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "17"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(0)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(data.item?.get(2)?.item?.get(0)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10415-0"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Brother"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Brian"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA2-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Male"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "32"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10550-4"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "-- Other Cancer"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.linkId, "2.1.2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(0)?.text,
            "Disease or Condition"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code,
            "LA10397-0"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display,
            "30-39"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.linkId, "2.1.2.2")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.item?.get(1)?.text,
            "Age at Diagnosis"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.item?.get(1)?.linkId, "2.1.2")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.item?.get(1)?.text,
            "This family member's history of disease"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10418-4"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Sister"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Janet"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA3-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Female"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "36"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10536-3"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "-- Breast Cancer"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.linkId, "2.1.2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(0)?.text,
            "Disease or Condition"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code,
            "LA10397-0"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display,
            "30-39"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.linkId, "2.1.2.2")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.item?.get(1)?.text,
            "Age at Diagnosis"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.item?.get(1)?.linkId, "2.1.2")
        assertEquals(
            data.item?.get(2)?.item?.get(2)?.item?.get(1)?.text,
            "This family member's history of disease"
        )
        assertEquals(data.item?.get(2)?.item?.get(2)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10419-2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Nephew"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Ian"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA2-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Male"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "16"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(3)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(3)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(data.item?.get(2)?.item?.get(3)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10420-0"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Niece"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Helen"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA3-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Female"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "15"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(4)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(4)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(data.item?.get(2)?.item?.get(4)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10416-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Father"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Donald"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA2-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Male"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "52"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(5)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(5)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(data.item?.get(2)?.item?.get(5)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10425-9"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Paternal Uncle"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Eric"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA2-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Male"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "56"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(6)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(6)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(data.item?.get(2)?.item?.get(6)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10421-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Paternal Aunt"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Fiona"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA3-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Female"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueDecimal, "57"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54141-7"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.2.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Age"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA33-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "Yes"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10543-9"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "-- Skin Cancer"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.linkId, "2.1.2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.item?.get(0)?.text,
            "Disease or Condition"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.item?.get(1)?.linkId, "2.1.2")
        assertEquals(
            data.item?.get(2)?.item?.get(7)?.item?.get(1)?.text,
            "This family member's history of disease"
        )
        assertEquals(data.item?.get(2)?.item?.get(7)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10423-4"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Paternal Grandfather"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Bob"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA2-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Male"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueCoding?.code, "LA10537-1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueCoding?.display, "-- Colon Cancer"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueCoding?.system, "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54112-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.1.1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Cause of Death"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.answer?.get(0)?.valueCoding?.code, "LA10400-2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.answer?.get(0)?.valueCoding?.display, "OVER 60"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.answer?.get(0)?.valueCoding?.system, "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.definition, "http://loinc.org/fhir/DataElement/54113-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.linkId, "2.1.1.4.1.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.text, "Age at Death"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10537-1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "-- Colon Cancer"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.linkId, "2.1.2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(0)?.text,
            "Disease or Condition"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code,
            "LA10400-2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.display,
            "OVER 60"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.linkId, "2.1.2.2")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.item?.get(1)?.text,
            "Age at Diagnosis"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.item?.get(1)?.linkId, "2.1.2")
        assertEquals(
            data.item?.get(2)?.item?.get(8)?.item?.get(1)?.text,
            "This family member's history of disease"
        )
        assertEquals(data.item?.get(2)?.item?.get(8)?.linkId, "2.1")
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.code,
            "LA10424-2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.display,
            "Paternal Grandmother"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.definition,
            "http://loinc.org/fhir/DataElement/54136-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.linkId, "2.1.1.1")
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(0)?.text,
            "Relationship to you"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueString,
            "Claire"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.definition,
            "http://loinc.org/fhir/DataElement/54138-3"
        )
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.linkId, "2.1.1.2")
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(1)?.text, "Name")
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "LA3-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Female"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.definition,
            "http://loinc.org/fhir/DataElement/54123-5"
        )
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.linkId, "2.1.1.3")
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(2)?.text, "Gender")
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString,
            "Lou Gehrigs"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.linkId, "2.1.1.4.1.1.1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.item?.get(0)?.text, "Please specify"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueCoding?.code, "LA10589-2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueCoding?.display, "-- Other/Unexpected"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.answer?.get(0)?.valueCoding?.system, "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.definition, "http://loinc.org/fhir/DataElement/54112-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.linkId, "2.1.1.4.1.1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(0)?.text, "Cause of Death"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.answer?.get(0)?.valueCoding?.code, "LA10400-2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.answer?.get(0)?.valueCoding?.display, "OVER 60"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.answer?.get(0)?.valueCoding?.system, "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.definition, "http://loinc.org/fhir/DataElement/54113-6"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.linkId, "2.1.1.4.1.2"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.item?.get(1)?.text, "Age at Death"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.item?.get(
                0
            )?.linkId, "2.1.1.4.1"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.definition,
            "http://loinc.org/fhir/DataElement/54139-1"
        )
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.linkId, "2.1.1.4")
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(3)?.text, "Living?")
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.definition,
            "http://loinc.org/fhir/DataElement/54121-9"
        )
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.linkId, "2.1.1.5")
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(4)?.text,
            "Was this person born a twin?"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.code,
            "LA32-8"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.display,
            "No"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.answer?.get(0)?.valueCoding?.system,
            "http://loinc.org"
        )
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.definition,
            "http://loinc.org/fhir/DataElement/54122-7"
        )
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.linkId, "2.1.1.6")
        assertEquals(
            data.item?.get(2)?.item?.get(9)?.item?.get(0)?.item?.get(5)?.text,
            "Was this person adopted?"
        )
        assertEquals(data.item?.get(2)?.item?.get(9)?.item?.get(0)?.linkId, "2.1.1")
        assertEquals(data.item?.get(2)?.item?.get(9)?.linkId, "2.1")
        assertEquals(data.item?.get(2)?.linkId, "2")
        assertEquals(data.item?.get(2)?.subject?.reference, "Patient/pat1")
        assertEquals(data.item?.get(2)?.text, "Family member health information")
        assertEquals(data.questionnaire?.reference, "Questionnaire/ussg-fht")
        assertEquals(data.status, QuestionnaireResponseStatus.IN_PROGRESS)
        assertEquals(data.subject?.reference, "http://hl7.org/fhir/Patient/proband")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testQuestionnaireResponse3() {
        val sourceJson = loadAsString("questionnaireresponse-example-f201-lifelines.json")

        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)


        assertEquals(data.author?.reference, "Practitioner/f201")
        assertEquals(data.authored, "2013-06-18T00:00:00+01:00")
        assertEquals(data.id, "f201")
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString,
            "I am allergic to house dust"
        )
        assertEquals(data.item?.get(0)?.item?.get(0)?.linkId, "1.1")
        assertEquals(data.item?.get(0)?.item?.get(0)?.text, "Do you have allergies?")
        assertEquals(data.item?.get(0)?.linkId, "1")
        assertEquals(data.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueString, "Male")
        assertEquals(data.item?.get(1)?.item?.get(0)?.linkId, "2.1")
        assertEquals(data.item?.get(1)?.item?.get(0)?.text, "What is your gender?")
        assertEquals(data.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueDate, "1960-03-13")
        assertEquals(data.item?.get(1)?.item?.get(1)?.linkId, "2.2")
        assertEquals(data.item?.get(1)?.item?.get(1)?.text, "What is your date of birth?")
        assertEquals(
            data.item?.get(1)?.item?.get(2)?.answer?.get(0)?.valueString,
            "The Netherlands"
        )
        assertEquals(data.item?.get(1)?.item?.get(2)?.linkId, "2.3")
        assertEquals(data.item?.get(1)?.item?.get(2)?.text, "What is your country of birth?")
        assertEquals(data.item?.get(1)?.item?.get(3)?.answer?.get(0)?.valueString, "married")
        assertEquals(data.item?.get(1)?.item?.get(3)?.linkId, "2.4")
        assertEquals(data.item?.get(1)?.item?.get(3)?.text, "What is your marital status?")
        assertEquals(data.item?.get(1)?.linkId, "2")
        assertEquals(data.item?.get(1)?.text, "General questions")
        assertEquals(data.item?.get(2)?.item?.get(0)?.answer?.get(0)?.valueString, "No")
        assertEquals(data.item?.get(2)?.item?.get(0)?.linkId, "3.1")
        assertEquals(data.item?.get(2)?.item?.get(0)?.text, "Do you smoke?")
        assertEquals(
            data.item?.get(2)?.item?.get(1)?.answer?.get(0)?.valueString,
            "No, but I used to drink"
        )
        assertEquals(data.item?.get(2)?.item?.get(1)?.linkId, "3.2")
        assertEquals(data.item?.get(2)?.item?.get(1)?.text, "Do you drink alchohol?")
        assertEquals(data.item?.get(2)?.linkId, "3")
        assertEquals(data.item?.get(2)?.text, "Intoxications")
        assertEquals(data.source?.reference, "Practitioner/f201")
        assertEquals(data.status, QuestionnaireResponseStatus.COMPLETED)
        assertEquals(data.subject?.display, "Roel")
        assertEquals(data.subject?.reference, "Patient/f201")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testQuestionnaireResponse4() {
        val sourceJson = loadAsString("questionnaireresponse-example-bluebook.json")

        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)


        assertEquals(data.author?.reference, "http://hl7.org/fhir/Practitioner/example")
        assertEquals(data.authored, "2013-02-19T14:15:00+10:00")
        assertEquals(data.id, "bb")
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.item?.get(0)?.answer?.get(0)?.valueString,
            "Cathy Jones"
        )
        assertEquals(data.item?.get(0)?.item?.get(0)?.item?.get(0)?.linkId, "nameOfChild")
        assertEquals(data.item?.get(0)?.item?.get(0)?.item?.get(0)?.text, "Name of child")
        assertEquals(
            data.item?.get(0)?.item?.get(0)?.item?.get(1)?.answer?.get(0)?.valueCoding?.code,
            "f"
        )
        assertEquals(data.item?.get(0)?.item?.get(0)?.item?.get(1)?.linkId, "sex")
        assertEquals(data.item?.get(0)?.item?.get(0)?.item?.get(1)?.text, "Sex")
        assertEquals(data.item?.get(0)?.item?.get(0)?.linkId, "group")
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(0)?.answer?.get(0)?.valueDecimal,
            "3.25"
        )
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(0)?.linkId, "birthWeight")
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(0)?.text, "Birth weight (kg)")
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(1)?.answer?.get(0)?.valueDecimal,
            "44.3"
        )
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(1)?.linkId, "birthLength")
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(1)?.text, "Birth length (cm)")
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.answer?.get(0)?.valueDate, "1972-11-30"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.linkId, "vitaminKDose1"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(
                0
            )?.text, "1st dose"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.answer?.get(0)?.valueDate, "1972-12-11"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.linkId, "vitaminKDose2"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.item?.get(
                1
            )?.text, "2nd dose"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.item?.get(0)?.linkId,
            "vitaminKgivenDoses"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(2)?.answer?.get(0)?.valueCoding?.code,
            "INJECTION"
        )
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(2)?.linkId, "vitaminKgiven")
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(2)?.text, "Vitamin K given")
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.answer?.get(
                0
            )?.valueDate, "1972-12-04"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.linkId,
            "hepBgivenDate"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.item?.get(0)?.text,
            "Date given"
        )
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(3)?.answer?.get(0)?.valueBoolean,
            "True"
        )
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(3)?.linkId, "hepBgiven")
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(3)?.text, "Hep B given y / n")
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(4)?.answer?.get(0)?.valueString,
            "Already able to speak Chinese"
        )
        assertEquals(data.item?.get(0)?.item?.get(1)?.item?.get(4)?.linkId, "abnormalitiesAtBirth")
        assertEquals(
            data.item?.get(0)?.item?.get(1)?.item?.get(4)?.text,
            "Abnormalities noted at birth"
        )
        assertEquals(data.item?.get(0)?.item?.get(1)?.linkId, "neonatalInformation")
        assertEquals(data.item?.get(0)?.item?.get(1)?.text, "Neonatal Information")
        assertEquals(data.item?.get(0)?.linkId, "birthDetails")
        assertEquals(
            data.item?.get(0)?.text,
            "Birth details - To be completed by health professional"
        )
        assertEquals(data.status, QuestionnaireResponseStatus.COMPLETED)
        assertEquals(data.subject?.reference, "http://hl7.org/fhir/Patient/1")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }

    @Test
    fun testQuestionnaireResponse5() {
        val sourceJson = loadAsString("questionnaireresponse-example-gcs.json")

        val data = parser.toFhir(QuestionnaireResponse::class, sourceJson)


        assertEquals(data.authored, "2014-12-11T04:44:16Z")
        assertEquals(data.id, "gcs")
        assertEquals(data.item?.get(0)?.answer?.get(0)?.valueCoding?.code, "LA6560-2")
        assertEquals(data.item?.get(0)?.answer?.get(0)?.valueCoding?.display, "Confused")
        assertEquals(
            data.item?.get(0)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url,
            "http://hl7.org/fhir/StructureDefinition/iso21090-CO-value"
        )
        assertEquals(
            data.item?.get(0)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal,
            "4"
        )
        assertEquals(data.item?.get(0)?.answer?.get(0)?.valueCoding?.system, "http://loinc.org")
        assertEquals(data.item?.get(0)?.linkId, "1.1")
        assertEquals(data.item?.get(1)?.answer?.get(0)?.valueCoding?.code, "LA6566-9")
        assertEquals(data.item?.get(1)?.answer?.get(0)?.valueCoding?.display, "Localizing pain")
        assertEquals(
            data.item?.get(1)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url,
            "http://hl7.org/fhir/StructureDefinition/iso21090-CO-value"
        )
        assertEquals(
            data.item?.get(1)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal,
            "5"
        )
        assertEquals(data.item?.get(1)?.answer?.get(0)?.valueCoding?.system, "http://loinc.org")
        assertEquals(data.item?.get(1)?.linkId, "1.2")
        assertEquals(data.item?.get(2)?.answer?.get(0)?.valueCoding?.code, "LA6556-0")
        assertEquals(
            data.item?.get(2)?.answer?.get(0)?.valueCoding?.display,
            "Eyes open spontaneously"
        )
        assertEquals(
            data.item?.get(2)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.url,
            "http://hl7.org/fhir/StructureDefinition/iso21090-CO-value"
        )
        assertEquals(
            data.item?.get(2)?.answer?.get(0)?.valueCoding?.extension?.get(0)?.valueDecimal,
            "4"
        )
        assertEquals(data.item?.get(2)?.answer?.get(0)?.valueCoding?.system, "http://loinc.org")
        assertEquals(data.item?.get(2)?.linkId, "1.3")
        assertEquals(data.questionnaire?.reference, "Questionnaire/gcs")
        assertEquals(data.source?.reference, "Practitioner/f007")
        assertEquals(data.status, QuestionnaireResponseStatus.COMPLETED)
        assertEquals(data.subject?.display, "Peter James Chalmers")
        assertEquals(data.subject?.reference, "Patient/example")
        assertEquals(data.text?.status, NarrativeStatus.GENERATED)

        val json = parser.fromFhir(data)

        JSONAssert.assertEquals(sourceJson, json, false)
    }
}


