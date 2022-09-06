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
import care.data4life.hl7.fhir.stu3.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.stu3.codesystem.ContributorType
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.RelatedArtifactType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * MeasureTest.java
 *
 * A quality measure definition
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MeasureFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testMeasure01() {
        // Given
        val sourceJson = loadAsString("stu3/measure-component-b-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertMeasure01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasure01Step01(data: Measure) {
        assertEquals(
            expected = "Main",
            actual = data.group?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Initial Population",
            actual = data.group?.get(0)?.population?.get(0)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Denominator",
            actual = data.group?.get(0)?.population?.get(1)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Numerator",
            actual = data.group?.get(0)?.population?.get(2)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "component-b-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "proportion",
            actual = data.scoring?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Screening for Depression",
            actual = data.title
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testMeasure02() {
        // Given
        val sourceJson = loadAsString("stu3/measure-predecessor-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertMeasure02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasure02Step01(data: Measure) {
        assertEquals(
            expected = "2014-03-08",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Exclusive breastfeeding measure of outcomes for exclusive breastmilk feeding of newborns.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Population Group 1",
            actual = data.group?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "InitialPopulation1",
            actual = data.group?.get(0)?.population?.get(0)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population-1-identifier",
            actual = data.group?.get(0)?.population?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Denominator1",
            actual = data.group?.get(0)?.population?.get(1)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-1-identifier",
            actual = data.group?.get(0)?.population?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusions",
            actual = data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DenominatorExclusions1",
            actual = data.group?.get(0)?.population?.get(2)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusions-1-identifier",
            actual = data.group?.get(0)?.population?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Numerator1",
            actual = data.group?.get(0)?.population?.get(3)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator-1-identifier",
            actual = data.group?.get(0)?.population?.get(3)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Population Group 2",
            actual = data.group?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "InitialPopulation2",
            actual = data.group?.get(1)?.population?.get(0)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population-2-identifier",
            actual = data.group?.get(1)?.population?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Denominator2",
            actual = data.group?.get(1)?.population?.get(1)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-2-identifier",
            actual = data.group?.get(1)?.population?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DenominatorExclusions2",
            actual = data.group?.get(1)?.population?.get(2)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusions-2-identifier",
            actual = data.group?.get(1)?.population?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Numerator2",
            actual = data.group?.get(1)?.population?.get(3)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator-2-identifier",
            actual = data.group?.get(1)?.population?.get(3)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measure-predecessor-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "exclusive-breastfeeding-measure",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Improvement noted as an increase in the rate",
            actual = data.improvementNotation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Library/library-exclusive-breastfeeding-cqm-logic",
            actual = data.library?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Measure of newborns who were fed breast milk only since birth",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "American Academy of Pediatrics. (2005). Section on Breastfeeding. Policy Statement:Breastfeeding and the Use of Human Milk. Pediatrics.115:496-506.",
            actual = data.relatedArtifact?.get(0)?.citation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(2)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(3)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(4)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(5)?.type
        )

        assertEquals(
            expected = "Kramer, M.S. & Kakuma, R. (2002).Optimal duration of exclusive breastfeeding. [107 refs] Cochrane Database of Systematic Reviews. (1):CD003517.",
            actual = data.relatedArtifact?.get(6)?.citation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(6)?.type
        )

        assertEquals(
            expected = "Petrova, A., Hegyi, T., & Mehta, R. (2007). Maternal race/ethnicity and one-month exclusive breastfeeding in association with the in-hospital feeding modality. Breastfeeding Medicine. 2(2):92-8.",
            actual = data.relatedArtifact?.get(7)?.citation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(7)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(8)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(9)?.type
        )

        assertEquals(
            expected = "proportion",
            actual = data.scoring?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Exclusive Breastfeeding Measure",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Exclusive Breastfeeding",
            actual = data.topic?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "process",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "3.0.1",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testMeasure03() {
        // Given
        val sourceJson = loadAsString("stu3/measure-cms146-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertMeasure03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasure03Step01(data: Measure) {
        assertEquals(
            expected = "2016-01-01",
            actual = data.approvalDate?.value.toString()
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "http://www.ncqa.org/",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "National Committee for Quality Assurance",
            actual = data.contributor?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContributorType.AUTHOR,
            actual = data.contributor?.get(0)?.type
        )

        assertEquals(
            expected = "2017-03-10",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Percentage of children 3-18 years of age who were diagnosed with pharyngitis, ordered an antibiotic and received a group A streptococcus (strep) test for the episode.",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-12-31",
            actual = data.effectivePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2017-01-01",
            actual = data.effectivePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
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
            expected = "CMS146.InInitialPopulation",
            actual = data.group?.get(0)?.population?.get(0)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population-identifier",
            actual = data.group?.get(0)?.population?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146.InNumerator",
            actual = data.group?.get(0)?.population?.get(1)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator-identifier",
            actual = data.group?.get(0)?.population?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146.InDenominator",
            actual = data.group?.get(0)?.population?.get(2)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-identifier",
            actual = data.group?.get(0)?.population?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusion",
            actual = data.group?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146.InDenominatorExclusions",
            actual = data.group?.get(0)?.population?.get(3)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator-exclusions-identifier",
            actual = data.group?.get(0)?.population?.get(3)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146.AgesUpToNine",
            actual = data.group?.get(0)?.stratifier?.get(0)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-ages-up-to-9",
            actual = data.group?.get(0)?.stratifier?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146.AgesTenPlus",
            actual = data.group?.get(0)?.stratifier?.get(1)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-ages-10-plus",
            actual = data.group?.get(0)?.stratifier?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "stratifier-ages-up-to-9",
            actual = data.group?.get(0)?.stratifier?.get(2)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.gender",
            actual = data.group?.get(0)?.stratifier?.get(2)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "This is an episode of care measure that examines all eligible episodes for the patient during the measurement period. If the patient has more than one episode, include all episodes in the measure",
            actual = data.guidance
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "measure-cms146-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/cqi/ecqm/Measure/Identifier/cms",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "146",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/cqi/ecqm/Measure/Identifier/nqf",
            actual = data.identifier?.get(1)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(1)?.use
        )

        assertEquals(
            expected = "0002",
            actual = data.identifier?.get(1)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Higher score indicates better quality",
            actual = data.improvementNotation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-09-01",
            actual = data.lastReviewDate?.value.toString()
        )

        assertEquals(
            expected = "Library/library-cms146-example",
            actual = data.library?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CMS146",
            actual = data.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "National Committee for Quality Assurance",
            actual = data.publisher
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Measure of children with a group A streptococcus test in the 7-day period from 3 days prior through 3 days after the diagnosis of pharyngitis",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Linder, J.A., D.W. Bates, G.M. Lee, J.A. Finkelstein. 2005. \"Antibiotic treatment of children with sore throat.\" JAMA 294(18):2315-2322. ",
            actual = data.relatedArtifact?.get(0)?.citation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "Infectious Diseases Society of America. 2012. \"Clinical Practice Guideline for the Diagnosis and Management of Group A Streptococcal Pharyngitis: 2012 Update.\" ",
            actual = data.relatedArtifact?.get(1)?.citation
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DOCUMENTATION,
            actual = data.relatedArtifact?.get(2)?.type
        )

        assertEquals(
            expected = "proportion",
            actual = data.scoring?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.ACTIVE,
            actual = data.status
        )

        assertEquals(
            expected = "supplemental-data-gender",
            actual = data.supplementalData?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient.gender",
            actual = data.supplementalData?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "supplemental-data-deceased",
            actual = data.supplementalData?.get(1)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "deceasedBoolean",
            actual = data.supplementalData?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Appropriate Testing for Children with Pharyngitis",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "57024-2",
            actual = data.topic?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/c80-doc-typecodes",
            actual = data.topic?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "process",
            actual = data.type?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/Measure/measure-cms146-example",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "program",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "eligibile-provider",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testMeasure04() {
        // Given
        val sourceJson = loadAsString("stu3/measure-component-a-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertMeasure04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasure04Step01(data: Measure) {
        assertEquals(
            expected = "Main",
            actual = data.group?.get(0)?.identifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "initial-population",
            actual = data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Initial Population",
            actual = data.group?.get(0)?.population?.get(0)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "denominator",
            actual = data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Denominator",
            actual = data.group?.get(0)?.population?.get(1)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "numerator",
            actual = data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Numerator",
            actual = data.group?.get(0)?.population?.get(2)?.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "component-a-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "proportion",
            actual = data.scoring?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Screening for Alcohol Misuse",
            actual = data.title
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testMeasure05() {
        // Given
        val sourceJson = loadAsString("stu3/measure-composite-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertMeasure05Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertMeasure05Step01(data: Measure) {
        assertEquals(
            expected = "opportunity",
            actual = data.compositeScoring?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "composite-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Measure/component-a-example",
            actual = data.relatedArtifact?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "Measure/component-b-example",
            actual = data.relatedArtifact?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = "proportion",
            actual = data.scoring?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Behavioral Assessment Composite Measure",
            actual = data.title
                ?.replace("\\n", " ")
        )
    }
}
