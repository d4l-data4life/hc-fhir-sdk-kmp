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
import care.data4life.hl7.fhir.stu3.codesystem.IdentifierUse
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.RelatedArtifactType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * LibraryTest.java
 *
 * Represents a library of quality improvement components
 *
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used
 * to describe and expose existing knowledge assets such as logic libraries and information model
 * descriptions, as well as to describe a collection of knowledge assets.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class LibraryTest {

    val parser = FhirStu3Parser()

    @Test
    fun testLibrary01() {
        // Given
        val sourceJson = loadAsString("stu3/library-predecessor-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertLibrary01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLibrary01Step01(data: Library) {

        assertEquals(
            expected = "text/cql",
            actual = data.content?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Helpers",
            actual = data.content?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "library-fhir-helpers-content.cql",
            actual = data.content?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2016-11-14",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "FHIR Helpers",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "library-fhir-helpers-predecessor",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "FHIRHelpers",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Library/fhir-model-definition",
            actual = data.relatedArtifact?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DEPENDS_ON,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "Library/library-fhir-helpers",
            actual = data.relatedArtifact?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.SUCCESSOR,
            actual = data.relatedArtifact?.get(1)?.type
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
            expected = "FHIR Helpers",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "FHIR Helpers",
            actual = data.topic?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "logic-library",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.6",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testLibrary02() {
        // Given
        val sourceJson = loadAsString("stu3/library-cms146-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertLibrary02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLibrary02Step01(data: Library) {

        assertEquals(
            expected = "text/cql",
            actual = data.content?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "library-cms146-example-content.cql",
            actual = data.content?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Patient",
            actual = data.dataRequirement?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "category",
            actual = data.dataRequirement?.get(1)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "diagnosis",
            actual = data.dataRequirement?.get(1)?.codeFilter?.get(0)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "clinicalStatus",
            actual = data.dataRequirement?.get(1)?.codeFilter?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "confirmed",
            actual = data.dataRequirement?.get(1)?.codeFilter?.get(1)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.dataRequirement?.get(1)?.codeFilter?.get(2)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.3.464.1003.102.12.1011",
            actual = data.dataRequirement?.get(1)?.codeFilter?.get(2)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition",
            actual = data.dataRequirement?.get(1)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "category",
            actual = data.dataRequirement?.get(2)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "diagnosis",
            actual = data.dataRequirement?.get(2)?.codeFilter?.get(0)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "clinicalStatus",
            actual = data.dataRequirement?.get(2)?.codeFilter?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "confirmed",
            actual = data.dataRequirement?.get(2)?.codeFilter?.get(1)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.dataRequirement?.get(2)?.codeFilter?.get(2)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.3.464.1003.102.12.1012",
            actual = data.dataRequirement?.get(2)?.codeFilter?.get(2)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition",
            actual = data.dataRequirement?.get(2)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.dataRequirement?.get(3)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "finished",
            actual = data.dataRequirement?.get(3)?.codeFilter?.get(0)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "class",
            actual = data.dataRequirement?.get(3)?.codeFilter?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ambulatory",
            actual = data.dataRequirement?.get(3)?.codeFilter?.get(1)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "type",
            actual = data.dataRequirement?.get(3)?.codeFilter?.get(2)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.3.464.1003.101.12.1061",
            actual = data.dataRequirement?.get(3)?.codeFilter?.get(2)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter",
            actual = data.dataRequirement?.get(3)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "diagnosis",
            actual = data.dataRequirement?.get(4)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.3.464.1003.198.12.1012",
            actual = data.dataRequirement?.get(4)?.codeFilter?.get(0)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "DiagnosticReport",
            actual = data.dataRequirement?.get(4)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.dataRequirement?.get(5)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.3.464.1003.196.12.1001",
            actual = data.dataRequirement?.get(5)?.codeFilter?.get(0)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Medication",
            actual = data.dataRequirement?.get(5)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.dataRequirement?.get(6)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "active",
            actual = data.dataRequirement?.get(6)?.codeFilter?.get(0)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medication.code",
            actual = data.dataRequirement?.get(6)?.codeFilter?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.3.464.1003.196.12.1001",
            actual = data.dataRequirement?.get(6)?.codeFilter?.get(1)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicationRequest",
            actual = data.dataRequirement?.get(6)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.dataRequirement?.get(7)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "completed",
            actual = data.dataRequirement?.get(7)?.codeFilter?.get(0)?.valueCode?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medication.code",
            actual = data.dataRequirement?.get(7)?.codeFilter?.get(1)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.16.840.1.113883.3.464.1003.196.12.1001",
            actual = data.dataRequirement?.get(7)?.codeFilter?.get(1)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "MedicationStatement",
            actual = data.dataRequirement?.get(7)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-07-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Logic for CMS 146: Appropriate Testing for Children with Pharyngitis",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "library-cms146-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "CMS146",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Library/library-quick-model-definition",
            actual = data.relatedArtifact?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DEPENDS_ON,
            actual = data.relatedArtifact?.get(0)?.type
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
            expected = "Appropriate Testing for Children with Pharyngitis",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "logic-library",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testLibrary03() {
        // Given
        val sourceJson = loadAsString("stu3/library-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertLibrary03Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLibrary03Step01(data: Library) {

        assertEquals(
            expected = "text/cql",
            actual = data.content?.get(0)?.contentType
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "library-example-content.cql",
            actual = data.content?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "code",
            actual = data.dataRequirement?.get(0)?.codeFilter?.get(0)?.path
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Other Female Reproductive Conditions",
            actual = data.dataRequirement?.get(0)?.codeFilter?.get(0)?.valueSetString
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Condition",
            actual = data.dataRequirement?.get(0)?.type
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2015-07-22",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Common Logic for adherence to Chlamydia Screening guidelines",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "ChalmydiaScreening_Common",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Library/library-quick-model-definition",
            actual = data.relatedArtifact?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DEPENDS_ON,
            actual = data.relatedArtifact?.get(0)?.type
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
            expected = "Chlamydia Screening Common Library",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Chlamydia Screening",
            actual = data.topic?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "logic-library",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testLibrary04() {
        // Given
        val sourceJson = loadAsString("stu3/library-composition-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertLibrary04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertLibrary04Step01(data: Library) {

        assertEquals(
            expected = "2017-03-10",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Artifacts required for implementation of Zika Virus Management",
            actual = data.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "composition-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "Zika Artifacts",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ActivityDefinition/administer-zika-virus-exposure-assessment",
            actual = data.relatedArtifact?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "ActivityDefinition/order-serum-zika-dengue-virus-igm",
            actual = data.relatedArtifact?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = "ActivityDefinition/provide-mosquito-prevention-advice",
            actual = data.relatedArtifact?.get(2)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(2)?.type
        )

        assertEquals(
            expected = "Library/zika-virus-intervention-logic",
            actual = data.relatedArtifact?.get(3)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(3)?.type
        )

        assertEquals(
            expected = "PlanDefinition/zika-virus-intervention",
            actual = data.relatedArtifact?.get(4)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(4)?.type
        )

        assertEquals(
            expected = "Questionnaire/zika-virus-exposure-assessment",
            actual = data.relatedArtifact?.get(5)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(5)?.type
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(6)?.type
        )

        assertEquals(
            expected = "https://www.cdc.gov/mmwr/volumes/65/wr/mm6539e1.htm?s_cid=mm6539e1_w",
            actual = data.relatedArtifact?.get(6)?.url
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
            expected = "Zika Artifacts",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Zika Virus Management",
            actual = data.topic?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "asset-collection",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
