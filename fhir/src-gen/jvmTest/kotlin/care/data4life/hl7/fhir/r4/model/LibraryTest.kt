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
import care.data4life.hl7.fhir.r4.codesystem.RelatedArtifactType
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
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class LibraryTest {

    val parser = FhirR4Parser()

    @Test
    fun testLibrary01() {
        // Given
        val sourceJson = loadAsString("r4/library-predecessor-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertEquals(
            "text/cql",
            data.content?.get(0)?.contentType
        )
        assertEquals(
            "FHIR Helpers",
            data.content?.get(0)?.title
        )
        assertEquals(
            "library-fhir-helpers-content.cql",
            data.content?.get(0)?.url
        )
        assertEquals(
            "2016-11-14",
            data.date?.value.toString()
        )
        assertEquals(
            "FHIR Helpers",
            data.description
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "library-fhir-helpers-predecessor",
            data.id
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "FHIRHelpers",
            data.identifier?.get(0)?.value
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
            "Library/fhir-model-definition",
            data.relatedArtifact?.get(0)?.resource
        )
        assertEquals(
            RelatedArtifactType.DEPENDS_ON,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "Library/library-fhir-helpers",
            data.relatedArtifact?.get(1)?.resource
        )
        assertEquals(
            RelatedArtifactType.SUCCESSOR,
            data.relatedArtifact?.get(1)?.type
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
            "FHIR Helpers",
            data.title
        )
        assertEquals(
            "FHIR Helpers",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "logic-library",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "1.6",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testLibrary02() {
        // Given
        val sourceJson = loadAsString("r4/library-cms146-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertEquals(
            "text/cql",
            data.content?.get(0)?.contentType
        )
        assertEquals(
            "library-cms146-example-content.cql",
            data.content?.get(0)?.url
        )
        assertEquals(
            "Patient",
            data.dataRequirement?.get(0)?.type
        )
        assertEquals(
            "diagnosis",
            data.dataRequirement?.get(1)?.codeFilter?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "category",
            data.dataRequirement?.get(1)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "confirmed",
            data.dataRequirement?.get(1)?.codeFilter?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "clinicalStatus",
            data.dataRequirement?.get(1)?.codeFilter?.get(1)?.path
        )
        assertEquals(
            "code",
            data.dataRequirement?.get(1)?.codeFilter?.get(2)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.102.12.1011",
            data.dataRequirement?.get(1)?.codeFilter?.get(2)?.valueSet
        )
        assertEquals(
            "Condition",
            data.dataRequirement?.get(1)?.type
        )
        assertEquals(
            "diagnosis",
            data.dataRequirement?.get(2)?.codeFilter?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "category",
            data.dataRequirement?.get(2)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "confirmed",
            data.dataRequirement?.get(2)?.codeFilter?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "clinicalStatus",
            data.dataRequirement?.get(2)?.codeFilter?.get(1)?.path
        )
        assertEquals(
            "code",
            data.dataRequirement?.get(2)?.codeFilter?.get(2)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.102.12.1012",
            data.dataRequirement?.get(2)?.codeFilter?.get(2)?.valueSet
        )
        assertEquals(
            "Condition",
            data.dataRequirement?.get(2)?.type
        )
        assertEquals(
            "finished",
            data.dataRequirement?.get(3)?.codeFilter?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "status",
            data.dataRequirement?.get(3)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "ambulatory",
            data.dataRequirement?.get(3)?.codeFilter?.get(1)?.code?.get(0)?.code
        )
        assertEquals(
            "class",
            data.dataRequirement?.get(3)?.codeFilter?.get(1)?.path
        )
        assertEquals(
            "type",
            data.dataRequirement?.get(3)?.codeFilter?.get(2)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.101.12.1061",
            data.dataRequirement?.get(3)?.codeFilter?.get(2)?.valueSet
        )
        assertEquals(
            "Encounter",
            data.dataRequirement?.get(3)?.type
        )
        assertEquals(
            "diagnosis",
            data.dataRequirement?.get(4)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.198.12.1012",
            data.dataRequirement?.get(4)?.codeFilter?.get(0)?.valueSet
        )
        assertEquals(
            "DiagnosticReport",
            data.dataRequirement?.get(4)?.type
        )
        assertEquals(
            "code",
            data.dataRequirement?.get(5)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.196.12.1001",
            data.dataRequirement?.get(5)?.codeFilter?.get(0)?.valueSet
        )
        assertEquals(
            "Medication",
            data.dataRequirement?.get(5)?.type
        )
        assertEquals(
            "active",
            data.dataRequirement?.get(6)?.codeFilter?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "status",
            data.dataRequirement?.get(6)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "medication.code",
            data.dataRequirement?.get(6)?.codeFilter?.get(1)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.196.12.1001",
            data.dataRequirement?.get(6)?.codeFilter?.get(1)?.valueSet
        )
        assertEquals(
            "MedicationRequest",
            data.dataRequirement?.get(6)?.type
        )
        assertEquals(
            "completed",
            data.dataRequirement?.get(7)?.codeFilter?.get(0)?.code?.get(0)?.code
        )
        assertEquals(
            "status",
            data.dataRequirement?.get(7)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "medication.code",
            data.dataRequirement?.get(7)?.codeFilter?.get(1)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.196.12.1001",
            data.dataRequirement?.get(7)?.codeFilter?.get(1)?.valueSet
        )
        assertEquals(
            "MedicationStatement",
            data.dataRequirement?.get(7)?.type
        )
        assertEquals(
            "2015-07-22",
            data.date?.value.toString()
        )
        assertEquals(
            "Logic for CMS 146: Appropriate Testing for Children with Pharyngitis",
            data.description
        )
        assertEquals(
            "library-cms146-example",
            data.id
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "CMS146",
            data.identifier?.get(0)?.value
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
            "Library/library-quick-model-definition",
            data.relatedArtifact?.get(0)?.resource
        )
        assertEquals(
            RelatedArtifactType.DEPENDS_ON,
            data.relatedArtifact?.get(0)?.type
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
            "Appropriate Testing for Children with Pharyngitis",
            data.title
        )
        assertEquals(
            "logic-library",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "2.0.0",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testLibrary03() {
        // Given
        val sourceJson = loadAsString("r4/library-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertEquals(
            "text/cql",
            data.content?.get(0)?.contentType
        )
        assertEquals(
            "library-example-content.cql",
            data.content?.get(0)?.url
        )
        assertEquals(
            "code",
            data.dataRequirement?.get(0)?.codeFilter?.get(0)?.path
        )
        assertEquals(
            "urn:oid:2.16.840.1.113883.3.464.1003.111.12.1006",
            data.dataRequirement?.get(0)?.codeFilter?.get(0)?.valueSet
        )
        assertEquals(
            "Condition",
            data.dataRequirement?.get(0)?.type
        )
        assertEquals(
            "2015-07-22",
            data.date?.value.toString()
        )
        assertEquals(
            "Common Logic for adherence to Chlamydia Screening guidelines",
            data.description
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "ChalmydiaScreening_Common",
            data.identifier?.get(0)?.value
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
            "Library/library-quick-model-definition",
            data.relatedArtifact?.get(0)?.resource
        )
        assertEquals(
            RelatedArtifactType.DEPENDS_ON,
            data.relatedArtifact?.get(0)?.type
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
            "Chlamydia Screening Common Library",
            data.title
        )
        assertEquals(
            "Chlamydia Screening",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "logic-library",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "2.0.0",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testLibrary04() {
        // Given
        val sourceJson = loadAsString("r4/library-composition-example.json")

        // When
        val data = parser.toFhir(Library::class, sourceJson)

        // Then
        assertEquals(
            "2017-03-10",
            data.date?.value.toString()
        )
        assertEquals(
            "Artifacts required for implementation of Zika Virus Management",
            data.description
        )
        assertEquals(
            "composition-example",
            data.id
        )
        assertEquals(
            "http://example.org",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "Zika Artifacts",
            data.identifier?.get(0)?.value
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
            "ActivityDefinition/administer-zika-virus-exposure-assessment",
            data.relatedArtifact?.get(0)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "ActivityDefinition/order-serum-zika-dengue-virus-igm",
            data.relatedArtifact?.get(1)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            "ActivityDefinition/provide-mosquito-prevention-advice",
            data.relatedArtifact?.get(2)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(2)?.type
        )
        assertEquals(
            "Library/zika-virus-intervention-logic",
            data.relatedArtifact?.get(3)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(3)?.type
        )
        assertEquals(
            "PlanDefinition/zika-virus-intervention",
            data.relatedArtifact?.get(4)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(4)?.type
        )
        assertEquals(
            "Questionnaire/zika-virus-exposure-assessment",
            data.relatedArtifact?.get(5)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(5)?.type
        )
        assertEquals(
            RelatedArtifactType.DERIVED_FROM,
            data.relatedArtifact?.get(6)?.type
        )
        assertEquals(
            "https://www.cdc.gov/mmwr/volumes/65/wr/mm6539e1.htm?s_cid=mm6539e1_w",
            data.relatedArtifact?.get(6)?.url
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
            "Zika Artifacts",
            data.title
        )
        assertEquals(
            "Zika Virus Management",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "asset-collection",
            data.type?.coding?.get(0)?.code
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
}
