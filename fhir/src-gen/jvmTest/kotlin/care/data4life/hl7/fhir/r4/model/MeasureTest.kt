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
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.RelatedArtifactType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * MeasureTest.java
 *
 * A quality measure definition
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class MeasureTest {

    val parser = FhirR4Parser()

    @Test
    fun testMeasure01() {
        // Given
        val sourceJson = loadAsString("r4/measure-component-b-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertEquals(
            "Main",
            data.group?.get(0)?.id
        )
        assertEquals(
            "initial-population",
            data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Initial Population",
            data.group?.get(0)?.population?.get(0)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(0)?.criteria?.language
        )
        assertEquals(
            "denominator",
            data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Denominator",
            data.group?.get(0)?.population?.get(1)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(1)?.criteria?.language
        )
        assertEquals(
            "numerator",
            data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Numerator",
            data.group?.get(0)?.population?.get(2)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(2)?.criteria?.language
        )
        assertEquals(
            "component-b-example",
            data.id
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
            "proportion",
            data.scoring?.coding?.get(0)?.code
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Screening for Depression",
            data.title
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMeasure02() {
        // Given
        val sourceJson = loadAsString("r4/measure-predecessor-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertEquals(
            "2014-03-08",
            data.date?.value.toString()
        )
        assertEquals(
            "Exclusive breastfeeding measure of outcomes for exclusive breastmilk feeding of newborns.",
            data.description
        )
        assertEquals(
            "PopulationGroup1",
            data.group?.get(0)?.id
        )
        assertEquals(
            "initial-population",
            data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "InitialPopulation1",
            data.group?.get(0)?.population?.get(0)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(0)?.criteria?.language
        )
        assertEquals(
            "denominator",
            data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Denominator1",
            data.group?.get(0)?.population?.get(1)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(1)?.criteria?.language
        )
        assertEquals(
            "denominator-exclusions",
            data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "DenominatorExclusions1",
            data.group?.get(0)?.population?.get(2)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(2)?.criteria?.language
        )
        assertEquals(
            "numerator",
            data.group?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Numerator1",
            data.group?.get(0)?.population?.get(3)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(3)?.criteria?.language
        )
        assertEquals(
            "PopulationGroup2",
            data.group?.get(1)?.id
        )
        assertEquals(
            "initial-population",
            data.group?.get(1)?.population?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "InitialPopulation2",
            data.group?.get(1)?.population?.get(0)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(1)?.population?.get(0)?.criteria?.language
        )
        assertEquals(
            "denominator",
            data.group?.get(1)?.population?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Denominator2",
            data.group?.get(1)?.population?.get(1)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(1)?.population?.get(1)?.criteria?.language
        )
        assertEquals(
            "denominator-exclusion",
            data.group?.get(1)?.population?.get(2)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "DenominatorExclusions2",
            data.group?.get(1)?.population?.get(2)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(1)?.population?.get(2)?.criteria?.language
        )
        assertEquals(
            "numerator",
            data.group?.get(1)?.population?.get(3)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Numerator2",
            data.group?.get(1)?.population?.get(3)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(1)?.population?.get(3)?.criteria?.language
        )
        assertEquals(
            "measure-predecessor-example",
            data.id
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "exclusive-breastfeeding-measure",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "increase",
            data.improvementNotation?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/measure-improvement-notation",
            data.improvementNotation?.coding?.get(0)?.system
        )
        assertEquals(
            "Library/library-exclusive-breastfeeding-cqm-logic",
            data.library?.get(0)
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
            "Measure of newborns who were fed breast milk only since birth",
            data.purpose
        )
        assertEquals(
            "American Academy of Pediatrics. (2005). Section on Breastfeeding. Policy Statement:Breastfeeding and the Use of Human Milk. Pediatrics.115:496-506.",
            data.relatedArtifact?.get(0)?.citation
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(2)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(3)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(4)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(5)?.type
        )
        assertEquals(
            "Kramer, M.S. & Kakuma, R. (2002).Optimal duration of exclusive breastfeeding. [107 refs] Cochrane Database of Systematic Reviews. (1):CD003517.",
            data.relatedArtifact?.get(6)?.citation
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(6)?.type
        )
        assertEquals(
            "Petrova, A., Hegyi, T., & Mehta, R. (2007). Maternal race/ethnicity and one-month exclusive breastfeeding in association with the in-hospital feeding modality. Breastfeeding Medicine. 2(2):92-8.",
            data.relatedArtifact?.get(7)?.citation
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(7)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(8)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(9)?.type
        )
        assertEquals(
            "proportion",
            data.scoring?.coding?.get(0)?.code
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Exclusive Breastfeeding Measure",
            data.title
        )
        assertEquals(
            "Exclusive Breastfeeding",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "process",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "4.0.1",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMeasure03() {
        // Given
        val sourceJson = loadAsString("r4/measure-cms146-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertEquals(
            "2016-01-01",
            data.approvalDate?.value.toString()
        )
        assertEquals(
            "National Committee for Quality Assurance",
            data.author?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "http://www.ncqa.org/",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "2017-03-10",
            data.date?.value.toString()
        )
        assertEquals(
            "Percentage of children 3-18 years of age who were diagnosed with pharyngitis, ordered an antibiotic and received a group A streptococcus (strep) test for the episode.",
            data.description
        )
        assertEquals(
            "2017-12-31",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2017-01-01",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "CMS146-group-1",
            data.group?.get(0)?.id
        )
        assertEquals(
            "initial-population",
            data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "CMS146.InInitialPopulation",
            data.group?.get(0)?.population?.get(0)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(0)?.criteria?.language
        )
        assertEquals(
            "numerator",
            data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "CMS146.InNumerator",
            data.group?.get(0)?.population?.get(1)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(1)?.criteria?.language
        )
        assertEquals(
            "denominator",
            data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "CMS146.InDenominator",
            data.group?.get(0)?.population?.get(2)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(2)?.criteria?.language
        )
        assertEquals(
            "denominator-exclusion",
            data.group?.get(0)?.population?.get(3)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "CMS146.InDenominatorExclusions",
            data.group?.get(0)?.population?.get(3)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(3)?.criteria?.language
        )
        assertEquals(
            "stratifier-ages-up-to-9",
            data.group?.get(0)?.stratifier?.get(0)?.code?.text
        )
        assertEquals(
            "CMS146.AgesUpToNine",
            data.group?.get(0)?.stratifier?.get(0)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.stratifier?.get(0)?.criteria?.language
        )
        assertEquals(
            "stratifier-ages-10-plus",
            data.group?.get(0)?.stratifier?.get(1)?.code?.text
        )
        assertEquals(
            "CMS146.AgesTenPlus",
            data.group?.get(0)?.stratifier?.get(1)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.stratifier?.get(1)?.criteria?.language
        )
        assertEquals(
            "stratifier-gender",
            data.group?.get(0)?.stratifier?.get(2)?.code?.text
        )
        assertEquals(
            "Patient.gender",
            data.group?.get(0)?.stratifier?.get(2)?.criteria?.expression
        )
        assertEquals(
            "text/fhirpath",
            data.group?.get(0)?.stratifier?.get(2)?.criteria?.language
        )
        assertEquals(
            "This is an episode of care measure that examines all eligible episodes for the patient during the measurement period. If the patient has more than one episode, include all episodes in the measure",
            data.guidance
        )
        assertEquals(
            "measure-cms146-example",
            data.id
        )
        assertEquals(
            "http://hl7.org/fhir/cqi/ecqm/Measure/Identifier/cms",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "146",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "http://hl7.org/fhir/cqi/ecqm/Measure/Identifier/nqf",
            data.identifier?.get(1)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(1)?.use
        )
        assertEquals(
            "0002",
            data.identifier?.get(1)?.value
        )
        assertEquals(
            "increase",
            data.improvementNotation?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/measure-improvement-notation",
            data.improvementNotation?.coding?.get(0)?.system
        )
        assertEquals(
            "US",
            data.jurisdiction?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "urn:iso:std:iso:3166",
            data.jurisdiction?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "2016-09-01",
            data.lastReviewDate?.value.toString()
        )
        assertEquals(
            "Library/library-cms146-example",
            data.library?.get(0)
        )
        assertEquals(
            "CMS146",
            data.name
        )
        assertEquals(
            "National Committee for Quality Assurance",
            data.publisher
        )
        assertEquals(
            "Measure of children with a group A streptococcus test in the 7-day period from 3 days prior through 3 days after the diagnosis of pharyngitis",
            data.purpose
        )
        assertEquals(
            "Linder, J.A., D.W. Bates, G.M. Lee, J.A. Finkelstein. 2005. _Antibiotic treatment of children with sore throat._ JAMA 294(18):2315-2322. ",
            data.relatedArtifact?.get(0)?.citation
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "Infectious Diseases Society of America. 2012. _Clinical Practice Guideline for the Diagnosis and Management of Group A Streptococcal Pharyngitis: 2012 Update._ ",
            data.relatedArtifact?.get(1)?.citation
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            RelatedArtifactType.DOCUMENTATION,
            data.relatedArtifact?.get(2)?.type
        )
        assertEquals(
            "proportion",
            data.scoring?.coding?.get(0)?.code
        )
        assertEquals(
            PublicationStatus.ACTIVE,
            data.status
        )
        assertEquals(
            "supplemental-data-gender",
            data.supplementalData?.get(0)?.code?.text
        )
        assertEquals(
            "Patient.gender",
            data.supplementalData?.get(0)?.criteria?.expression
        )
        assertEquals(
            "text/fhirpath",
            data.supplementalData?.get(0)?.criteria?.language
        )
        assertEquals(
            "supplemental-data-deceased",
            data.supplementalData?.get(1)?.code?.text
        )
        assertEquals(
            "deceasedBoolean",
            data.supplementalData?.get(1)?.criteria?.expression
        )
        assertEquals(
            "text/fhirpath",
            data.supplementalData?.get(1)?.criteria?.language
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )
        assertEquals(
            "Appropriate Testing for Children with Pharyngitis",
            data.title
        )
        assertEquals(
            "57024-2",
            data.topic?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://loinc.org",
            data.topic?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "process",
            data.type?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "http://hl7.org/fhir/Measure/measure-cms146-example",
            data.url
        )
        assertEquals(
            "program",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "eligibile-provider",
            data.useContext?.get(0)?.valueCodeableConcept?.text
        )
        assertEquals(
            "age",
            data.useContext?.get(1)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(1)?.code?.system
        )
        assertEquals(
            "a",
            data.useContext?.get(1)?.valueRange?.high?.unit
        )
        assertEquals(
            "18".toDouble(),
            data.useContext?.get(1)?.valueRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.useContext?.get(1)?.valueRange?.low?.unit
        )
        assertEquals(
            "3".toDouble(),
            data.useContext?.get(1)?.valueRange?.low?.value?.value
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
    fun testMeasure04() {
        // Given
        val sourceJson = loadAsString("r4/measure-component-a-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertEquals(
            "Main",
            data.group?.get(0)?.id
        )
        assertEquals(
            "initial-population",
            data.group?.get(0)?.population?.get(0)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Initial Population",
            data.group?.get(0)?.population?.get(0)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(0)?.criteria?.language
        )
        assertEquals(
            "denominator",
            data.group?.get(0)?.population?.get(1)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Denominator",
            data.group?.get(0)?.population?.get(1)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(1)?.criteria?.language
        )
        assertEquals(
            "numerator",
            data.group?.get(0)?.population?.get(2)?.code?.coding?.get(0)?.code
        )
        assertEquals(
            "Numerator",
            data.group?.get(0)?.population?.get(2)?.criteria?.expression
        )
        assertEquals(
            "text/cql",
            data.group?.get(0)?.population?.get(2)?.criteria?.language
        )
        assertEquals(
            "component-a-example",
            data.id
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
            "proportion",
            data.scoring?.coding?.get(0)?.code
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Screening for Alcohol Misuse",
            data.title
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testMeasure05() {
        // Given
        val sourceJson = loadAsString("r4/measure-composite-example.json")

        // When
        val data = parser.toFhir(Measure::class, sourceJson)

        // Then
        assertEquals(
            "opportunity",
            data.compositeScoring?.coding?.get(0)?.code
        )
        assertEquals(
            "composite-example",
            data.id
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
            "Measure/component-a-example",
            data.relatedArtifact?.get(0)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "Measure/component-b-example",
            data.relatedArtifact?.get(1)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            "proportion",
            data.scoring?.coding?.get(0)?.code
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "Behavioral Assessment Composite Measure",
            data.title
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
