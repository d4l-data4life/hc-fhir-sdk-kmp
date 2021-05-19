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
import care.data4life.hl7.fhir.r4.codesystem.ActionCardinalityBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionConditionKind
import care.data4life.hl7.fhir.r4.codesystem.ActionGroupingBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionRelationshipType
import care.data4life.hl7.fhir.r4.codesystem.ActionRequiredBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionSelectionBehavior
import care.data4life.hl7.fhir.r4.codesystem.ContactPointSystem
import care.data4life.hl7.fhir.r4.codesystem.ContactPointUse
import care.data4life.hl7.fhir.r4.codesystem.IdentifierUse
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.RelatedArtifactType
import care.data4life.hl7.fhir.r4.codesystem.TriggerType
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * PlanDefinitionTest.java
 *
 * The definition of a plan for a series of actions, independent of any specific patient or context
 *
 * This resource allows for the definition of various types of plans as a sharable, consumable, and
 * executable artifact. The resource is general enough to support the description of a broad range of
 * clinical artifacts such as clinical decision support rules, order sets and protocols.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class PlanDefinitionTest {

    val parser = FhirR4Parser()

    @Test
    fun testPlanDefinition01() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-example-kdn5-simplified.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertPlanDefinition01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPlanDefinition01Step01(data: PlanDefinition) {

        assertEquals(
            expected = "#1111",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "day",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(0)?.valueInteger?.value
        )

        assertEquals(
            expected = "day",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "8".toInt(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(1)?.valueInteger?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/timing-daysOfCycle",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "action-1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Gemcitabine 1250 mg/m² IV over 30 minutes on days 1 and 8",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#2222",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "day",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.extension?.get(0)?.valueInteger?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/timing-daysOfCycle",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "action-2",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "action-1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.actionId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionRelationshipType.CONCURRENT_WITH_START,
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.relationship
        )

        assertEquals(
            expected = "CARBOplatin AUC 5 IV over 30 minutes on Day 1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "cycle-definition-1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "21-day cycle for 6 cycles",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "6".toLong(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.count?.value
        )

        assertEquals(
            expected = "21".toDouble(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.duration?.value
        )

        assertEquals(
            expected = "d",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.durationUnit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.SENTENCE_GROUP,
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.EXACTLY_ONE,
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.ALL,
            actual = data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.EXACTLY_ONE,
            actual = data.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "2016-07-27",
            actual = data.approvalDate?.value.toString()
        )

        assertEquals(
            expected = "Lee Surprenant",
            actual = data.author?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1111",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2222",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "All rights reserved.",
            actual = data.copyright
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "KDN5",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/ordertemplates",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "KDN5",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-07-27",
            actual = data.lastReviewDate?.value.toString()
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
            expected = "National Comprehensive Cancer Network, Inc.",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "NCCN Guidelines for Kidney Cancer. V.2.2016",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "http://www.example.org/professionals/physician_gls/PDF/kidney.pdf",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Oudard S, et al. J Urol. 2007;177(5):1698-702",
            actual = data.relatedArtifact?.get(1)?.citation
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.CITATION,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = "http://www.ncbi.nlm.nih.gov/pubmed/17437788",
            actual = data.relatedArtifact?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = NarrativeStatus.ADDITIONAL,
            actual = data.text?.status
        )

        assertEquals(
            expected = "Gemcitabine/CARBOplatin",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Chemotherapy Order Template",
            actual = data.type?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "treamentSetting-or-diseaseStatus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/indications",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            actual = data.useContext?.get(0)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A",
            actual = data.useContext?.get(0)?.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Metastatic",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "disease-or-histology",
            actual = data.useContext?.get(1)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/indications",
            actual = data.useContext?.get(1)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            actual = data.useContext?.get(1)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A",
            actual = data.useContext?.get(1)?.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Collecting Duct/Medullary Subtypes",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(2)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(2)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            actual = data.useContext?.get(2)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "A",
            actual = data.useContext?.get(2)?.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Kidney Cancer",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "treatmentSetting-or-diseaseStatus",
            actual = data.useContext?.get(3)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/indications",
            actual = data.useContext?.get(3)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            actual = data.useContext?.get(3)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "B",
            actual = data.useContext?.get(3)?.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Relapsed",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "disease-or-histology",
            actual = data.useContext?.get(4)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/CodeSystem/indications",
            actual = data.useContext?.get(4)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            actual = data.useContext?.get(4)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "B",
            actual = data.useContext?.get(4)?.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Collecting Duct/Medullary Subtypes",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(5)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(5)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            actual = data.useContext?.get(5)?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "B",
            actual = data.useContext?.get(5)?.extension?.get(0)?.valueString
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Kidney Cancer – Collecting Duct/Medullary Subtypes - Metastatic",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1",
            actual = data.version
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testPlanDefinition02() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-options-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertPlanDefinition02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPlanDefinition02Step01(data: PlanDefinition) {

        assertEquals(
            expected = "#activitydefinition-medicationrequest-1",
            actual = data.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medication-action-1",
            actual = data.action?.get(0)?.action?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Administer Medication 1",
            actual = data.action?.get(0)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#activitydefinition-medicationrequest-2",
            actual = data.action?.get(0)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medication-action-2",
            actual = data.action?.get(0)?.action?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medication-action-1",
            actual = data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.actionId
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "h",
            actual = data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.offsetDuration?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.offsetDuration?.value?.value
        )

        assertEquals(
            expected = ActionRelationshipType.AFTER_END,
            actual = data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.relationship
        )

        assertEquals(
            expected = "Administer Medication 2",
            actual = data.action?.get(0)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.ALL,
            actual = data.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "activitydefinition-medicationrequest-1",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "activitydefinition-medicationrequest-2",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "options-example",
            actual = data.id
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
            expected = PublicationStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
            actual = data.text?.div
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "This example illustrates relationships between actions.",
            actual = data.title
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testPlanDefinition03() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-example-cardiology-os.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertPlanDefinition03Step01(data)
        assertPlanDefinition03Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPlanDefinition03Step01(data: PlanDefinition) {

        assertEquals(
            expected = "#referralToCardiologyConsult",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Now()",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "timing.event",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Code '261QM0850X' from CardiologyChestPainLogic.\"NUCC Provider Taxonomy\" display 'Adult Mental Health'",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "specialty",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.ServiceRequestFulfillmentTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "occurrenceDateTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subject",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "requester.agent",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.CardiologyReferralReason",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonCode",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.RiskAssessment",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonReference",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Referral to cardiology to evaluate chest pain (routine)",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#CollectReferralReason",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Reason for cardiology consultation",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#CardiologyConsultationGoal",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(2)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Goal of cardiology consultation",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(2)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.ANY,
            actual = data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "Consults and Referrals",
            actual = data.action?.get(0)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "#metoprololTartrate25Prescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprolol tartrate 25 mg tablet 1 tablet oral 2 time daily",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#metoprololTartrate50Prescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprolol tartrate 50 mg tablet 1 tablet oral 2 time daily",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#amlodipinePrescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "amlodipine 5  tablet 1 tablet oral  daily",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.selectionBehavior
        )

        assertEquals(
            expected = "Antianginal Therapy",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#nitroglycerinPrescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "nitroglycerin 0.4 mg tablet sub-lingual every 5 minutes as needed for chest pain; maximum 3 tablets",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.selectionBehavior
        )

        assertEquals(
            expected = "Nitroglycerin",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Consider the following medications for stable patients to be initiated prior to the cardiology consultation.",
            actual = data.action?.get(0)?.action?.get(1)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Medications",
            actual = data.action?.get(0)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Bruce Bray MD",
            actual = data.author?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Scott Wall MD",
            actual = data.author?.get(1)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Aiden Abidov MD, PhD",
            actual = data.author?.get(2)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "cardiology-chestPain-logic",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "referralToCardiologyConsult",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate25Prescription",
            actual = data.contained?.get(2)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate25Medication",
            actual = data.contained?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate25Substance",
            actual = data.contained?.get(4)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate50Prescription",
            actual = data.contained?.get(5)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate50Medication",
            actual = data.contained?.get(6)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate50Substance",
            actual = data.contained?.get(7)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "nitroglycerinPrescription",
            actual = data.contained?.get(8)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "nitroglycerinMedication",
            actual = data.contained?.get(9)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "© Copyright Cognitive Medical Systems, Inc. 9444 Waples Street Suite 300 San Diego, CA 92121",
            actual = data.copyright
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-08-29",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "example-cardiology-os",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:va.gov:kbs:knart:artifact:r1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "bb7ccea6-9744-4743-854a-bcffd87191f6",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:va.gov:kbs:contract:VA118-16-D-1008:to:VA-118-16-F-1008-0007",
            actual = data.identifier?.get(1)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CLIN0004AG",
            actual = data.identifier?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:cognitivemedicine.com:lab:jira",
            actual = data.identifier?.get(2)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "KP-914",
            actual = data.identifier?.get(2)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#cardiology-chestPain-logic",
            actual = data.library?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ChestPainCoronaryArteryDiseaseOrderSetKNART",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Department of Veterans Affairs",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Cardiology: Chest Pain (CP) / Coronary Artery Disease (CAD) Clinical Content White Paper",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "NEED-A-URL-HERE",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Outcome CVD (coronary death, myocardial infarction, coronary insufficiency, angina, ischemic stroke, hemorrhagic stroke, transient ischemic attack, peripheral artery disease, heart failure)",
            actual = data.relatedArtifact?.get(1)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = "https://www.framinghamheartstudy.org/risk-functions/cardiovascular-disease/10-year-risk.php",
            actual = data.relatedArtifact?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "General cardiovascular risk profile for use in primary care: the Framingham Heart Study",
            actual = data.relatedArtifact?.get(2)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(2)?.type
        )

        assertEquals(
            expected = "https://www.framinghamheartstudy.org/risk-functions/cardiovascular-disease/10-year-risk.php",
            actual = data.relatedArtifact?.get(2)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(3)?.type
        )

        assertEquals(
            expected = "NEED-A-URL-HERE",
            actual = data.relatedArtifact?.get(3)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(4)?.type
        )

        assertEquals(
            expected = "NEED-A-URL-HERE",
            actual = data.relatedArtifact?.get(4)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: ASPIRIN 81 MG- aspirin tablet, coated",
            actual = data.relatedArtifact?.get(5)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(5)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=b4064039-2345-4227-b83d-54dc13a838d3",
            actual = data.relatedArtifact?.get(5)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: CLOPIDOGREL- clopidogrel bisulfate tablet, film coated",
            actual = data.relatedArtifact?.get(6)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(6)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=7fe85155-bc00-406b-b097-e8aece187a8a",
            actual = data.relatedArtifact?.get(6)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: LIPITOR- atorvastatin calcium tablet, film coated",
            actual = data.relatedArtifact?.get(7)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(7)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=7fe85155-bc00-406b-b097-e8aece187a8a",
            actual = data.relatedArtifact?.get(7)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: METOPROLOL SUCCINATE EXTENDED-RELEASE - metoprolol succinate tablet, film coated, extended release",
            actual = data.relatedArtifact?.get(8)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(8)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=2d948600-35d8-4490-983b-918bdce488c8",
            actual = data.relatedArtifact?.get(8)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: NITROGLYCERIN- nitroglycerin tablet",
            actual = data.relatedArtifact?.get(9)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(9)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=67bf2a15-b115-47ac-ae28-ce2dafd6b5c9",
            actual = data.relatedArtifact?.get(9)?.url
                ?.replace("\n", " ")
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
            expected = "Chest Pain (CP) - Coronary Artery Disease (CAD) Order Set KNART",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "order-set",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Order Set",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/plan-definition-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://va.gov/kas/orderset/B5-Cardiology-ChestPainCAD-OS",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "look up value",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "appropriate snomed condition",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.1",
            actual = data.version
                ?.replace("\n", " ")
        )
    }

    private fun assertPlanDefinition03Step02(data: PlanDefinition) {

        assertEquals(
            expected = "#referralToCardiologyConsult",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Now()",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "timing.event",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Code '261QM0850X' from CardiologyChestPainLogic.\"NUCC Provider Taxonomy\" display 'Adult Mental Health'",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "specialty",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.ServiceRequestFulfillmentTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "occurrenceDateTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subject",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "requester.agent",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.CardiologyReferralReason",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonCode",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.RiskAssessment",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonReference",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Referral to cardiology to evaluate chest pain (routine)",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#CollectReferralReason",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Reason for cardiology consultation",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#CardiologyConsultationGoal",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(2)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Goal of cardiology consultation",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(2)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.ANY,
            actual = data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "Consults and Referrals",
            actual = data.action?.get(0)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "#metoprololTartrate25Prescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprolol tartrate 25 mg tablet 1 tablet oral 2 time daily",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#metoprololTartrate50Prescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprolol tartrate 50 mg tablet 1 tablet oral 2 time daily",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#amlodipinePrescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "amlodipine 5  tablet 1 tablet oral  daily",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.selectionBehavior
        )

        assertEquals(
            expected = "Antianginal Therapy",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#nitroglycerinPrescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CardiologyChestPainLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "nitroglycerin 0.4 mg tablet sub-lingual every 5 minutes as needed for chest pain; maximum 3 tablets",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.selectionBehavior
        )

        assertEquals(
            expected = "Nitroglycerin",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(2)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Consider the following medications for stable patients to be initiated prior to the cardiology consultation.",
            actual = data.action?.get(0)?.action?.get(1)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Medications",
            actual = data.action?.get(0)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Bruce Bray MD",
            actual = data.author?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Scott Wall MD",
            actual = data.author?.get(1)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Aiden Abidov MD, PhD",
            actual = data.author?.get(2)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "cardiology-chestPain-logic",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "referralToCardiologyConsult",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate25Prescription",
            actual = data.contained?.get(2)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate25Medication",
            actual = data.contained?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate25Substance",
            actual = data.contained?.get(4)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate50Prescription",
            actual = data.contained?.get(5)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate50Medication",
            actual = data.contained?.get(6)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "metoprololTartrate50Substance",
            actual = data.contained?.get(7)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "nitroglycerinPrescription",
            actual = data.contained?.get(8)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "nitroglycerinMedication",
            actual = data.contained?.get(9)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "© Copyright Cognitive Medical Systems, Inc. 9444 Waples Street Suite 300 San Diego, CA 92121",
            actual = data.copyright
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-08-29",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "example-cardiology-os",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:va.gov:kbs:knart:artifact:r1",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "bb7ccea6-9744-4743-854a-bcffd87191f6",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:va.gov:kbs:contract:VA118-16-D-1008:to:VA-118-16-F-1008-0007",
            actual = data.identifier?.get(1)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "CLIN0004AG",
            actual = data.identifier?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:cognitivemedicine.com:lab:jira",
            actual = data.identifier?.get(2)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "KP-914",
            actual = data.identifier?.get(2)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#cardiology-chestPain-logic",
            actual = data.library?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ChestPainCoronaryArteryDiseaseOrderSetKNART",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Department of Veterans Affairs",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Cardiology: Chest Pain (CP) / Coronary Artery Disease (CAD) Clinical Content White Paper",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "NEED-A-URL-HERE",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Outcome CVD (coronary death, myocardial infarction, coronary insufficiency, angina, ischemic stroke, hemorrhagic stroke, transient ischemic attack, peripheral artery disease, heart failure)",
            actual = data.relatedArtifact?.get(1)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = "https://www.framinghamheartstudy.org/risk-functions/cardiovascular-disease/10-year-risk.php",
            actual = data.relatedArtifact?.get(1)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "General cardiovascular risk profile for use in primary care: the Framingham Heart Study",
            actual = data.relatedArtifact?.get(2)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(2)?.type
        )

        assertEquals(
            expected = "https://www.framinghamheartstudy.org/risk-functions/cardiovascular-disease/10-year-risk.php",
            actual = data.relatedArtifact?.get(2)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(3)?.type
        )

        assertEquals(
            expected = "NEED-A-URL-HERE",
            actual = data.relatedArtifact?.get(3)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(4)?.type
        )

        assertEquals(
            expected = "NEED-A-URL-HERE",
            actual = data.relatedArtifact?.get(4)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: ASPIRIN 81 MG- aspirin tablet, coated",
            actual = data.relatedArtifact?.get(5)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(5)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=b4064039-2345-4227-b83d-54dc13a838d3",
            actual = data.relatedArtifact?.get(5)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: CLOPIDOGREL- clopidogrel bisulfate tablet, film coated",
            actual = data.relatedArtifact?.get(6)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(6)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=7fe85155-bc00-406b-b097-e8aece187a8a",
            actual = data.relatedArtifact?.get(6)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: LIPITOR- atorvastatin calcium tablet, film coated",
            actual = data.relatedArtifact?.get(7)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(7)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=7fe85155-bc00-406b-b097-e8aece187a8a",
            actual = data.relatedArtifact?.get(7)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: METOPROLOL SUCCINATE EXTENDED-RELEASE - metoprolol succinate tablet, film coated, extended release",
            actual = data.relatedArtifact?.get(8)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(8)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=2d948600-35d8-4490-983b-918bdce488c8",
            actual = data.relatedArtifact?.get(8)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LABEL: NITROGLYCERIN- nitroglycerin tablet",
            actual = data.relatedArtifact?.get(9)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.relatedArtifact?.get(9)?.type
        )

        assertEquals(
            expected = "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=67bf2a15-b115-47ac-ae28-ce2dafd6b5c9",
            actual = data.relatedArtifact?.get(9)?.url
                ?.replace("\n", " ")
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
            expected = "Chest Pain (CP) - Coronary Artery Disease (CAD) Order Set KNART",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "order-set",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Order Set",
            actual = data.type?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/plan-definition-type",
            actual = data.type?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://va.gov/kas/orderset/B5-Cardiology-ChestPainCAD-OS",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "look up value",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "appropriate snomed condition",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "0.1",
            actual = data.version
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testPlanDefinition04() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-protocol-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertPlanDefinition04Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPlanDefinition04Step01(data: PlanDefinition) {

        assertEquals(
            expected = ActionCardinalityBehavior.SINGLE,
            actual = data.action?.get(0)?.cardinalityBehavior
        )

        assertEquals(
            expected = "exists ([Condition: Obesity]) or not exists ([Observation: BMI] O where O.effectiveDateTime 2 years or less before Today())",
            actual = data.action?.get(0)?.condition?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.condition?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "#procedure",
            actual = data.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Measure, Weight, Height, Waist, Circumference; Calculate BMI",
            actual = data.action?.get(0)?.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reduce-bmi-ratio",
            actual = data.action?.get(0)?.goalId?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionRequiredBehavior.MUST_UNLESS_DOCUMENTED,
            actual = data.action?.get(0)?.requiredBehavior
        )

        assertEquals(
            expected = "Measure BMI",
            actual = data.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "National Heart, Lung, and Blood Institute",
            actual = data.author?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.author?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "https://www.nhlbi.nih.gov/health-pro/guidelines",
            actual = data.author?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "procedure",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "414916001",
            actual = data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Obesity (disorder)",
            actual = data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Treatment",
            actual = data.goal?.get(0)?.category?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Reduce BMI to below 25",
            actual = data.goal?.get(0)?.description?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Evaluation and Treatment Strategy",
            actual = data.goal?.get(0)?.documentation?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.goal?.get(0)?.documentation?.get(0)?.type
        )

        assertEquals(
            expected = "https://www.nhlbi.nih.gov/health-pro/guidelines/current/obesity-guidelines/e_textbook/txgd/42.htm",
            actual = data.goal?.get(0)?.documentation?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reduce-bmi-ratio",
            actual = data.goal?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "medium-priority",
            actual = data.goal?.get(0)?.priority?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "When the patient's BMI Ratio is at or above 25",
            actual = data.goal?.get(0)?.start?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "kg/m2",
            actual = data.goal?.get(0)?.target?.get(0)?.detailRange?.high?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "24.9".toDouble(),
            actual = data.goal?.get(0)?.target?.get(0)?.detailRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.goal?.get(0)?.target?.get(0)?.due?.unit
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.goal?.get(0)?.target?.get(0)?.due?.value?.value
        )

        assertEquals(
            expected = "39156-5",
            actual = data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Body mass index (BMI) [Ratio]",
            actual = data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "protocol-example",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://acme.org",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "example-1",
            actual = data.identifier?.get(0)?.value
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
            expected = "Example of A medical algorithm for assessment and treatment of overweight and obesity",
            actual = data.purpose
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Overweight and Obesity Treatment Guidelines",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "http://www.nhlbi.nih.gov/health-pro/guidelines/current/obesity-guidelines/e_textbook/txgd/algorthm/algorthm.htm",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\n", " ")
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
            expected = "Obesity Assessment Protocol",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "clinical-protocol",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "414916001",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Obesity (disorder)",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testPlanDefinition05() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertPlanDefinition05Step01(data)
        assertPlanDefinition05Step02(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPlanDefinition05Step01(data: PlanDefinition) {

        assertEquals(
            expected = "#referralToMentalHealthCare",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Now()",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "timing.event",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Code '261QM0850X' from SuicideRiskLogic.\"NUCC Provider Taxonomy\" display 'Adult Mental Health'",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "specialty",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.ServiceRequestFulfillmentTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "occurrenceDateTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Patient",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subject",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "requester.agent",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessmentScore",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonCode",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessment",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonReference",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Refer to outpatient mental health program for evaluation and treatment of mental health conditions now",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.ANY,
            actual = data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "Consults and Referrals",
            actual = data.action?.get(0)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#citalopramPrescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessmentScore",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonCode",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessment",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonReference",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopram 20 mg tablet 1 tablet oral 1 time daily now (30 table; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "escitalopram 10 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "fluoxetine 20 mg capsule 1 capsule oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(2)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "paroxetine 20 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(3)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sertraline 50 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(4)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/html",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.contentType
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "National Library of Medicine. DailyMed website. CITALOPRAM- citalopram hydrobromide tablet, film coated.",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=6daeb45c-451d-b135-bf8f-2d6dff4b6b01",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.CITATION,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.type
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "Selective Serotonin Reuptake Inhibitors (Choose a mazimum of one or document reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Dopamine Norepinephrine Reuptake Inhibitors (Choose a maximum of one or document reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(1)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Serotonin Norepinephrine Reuptake Inhibitors (Choose a maximum of one or doument reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(2)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Norepinephrine-Serotonin Modulators (Choose a maximum of one or document reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(3)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/html",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.contentType
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/cqf-qualityOfEvidence",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "high",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/evidence-quality",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "High Quality",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.CITATION,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.type
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "First-Line Antidepressants",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.selectionBehavior
        )

        assertEquals(
            expected = "Medications",
            actual = data.action?.get(0)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Suicide Risk Assessment and Outpatient Management",
            actual = data.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-03-12",
            actual = data.approvalDate?.value.toString()
        )

        assertEquals(
            expected = "Motive Medical Intelligence",
            actual = data.author?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.author?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.author?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "415-362-4007",
            actual = data.author?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.author?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.author?.get(0)?.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "info@motivemi.com",
            actual = data.author?.get(0)?.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "415-362-4007",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "info@motivemi.com",
            actual = data.contact?.get(0)?.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "referralToMentalHealthCare",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopramPrescription",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopramMedication",
            actual = data.contained?.get(2)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopramSubstance",
            actual = data.contained?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "© Copyright 2016 Motive Medical Intelligence. All rights reserved.",
            actual = data.copyright
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-15",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Orders to be applied to a patient characterized as low suicide risk.",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-12-31",
            actual = data.effectivePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.effectivePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "low-suicide-risk-order-set",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://motivemi.com/artifacts",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "mmi:low-suicide-risk-order-set",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-08-15",
            actual = data.lastReviewDate?.value.toString()
        )

        assertEquals(
            expected = "Library/suiciderisk-orderset-logic",
            actual = data.library?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LowSuicideRiskOrderSet",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Motive Medical Intelligence",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This order set helps ensure consistent application of appropriate orders for the care of low suicide risk patients.",
            actual = data.purpose
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ActivityDefinition/referralPrimaryCareMentalHealth",
            actual = data.relatedArtifact?.get(1)?.resource
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = "ActivityDefinition/citalopramPrescription",
            actual = data.relatedArtifact?.get(2)?.resource
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(2)?.type
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
            expected = "Low Suicide Risk Order Set",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Suicide risk assessment",
            actual = data.topic?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://motivemi.com/artifacts/PlanDefinition/low-suicide-risk-order-set",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This order set should be applied after assessing a patient for suicide risk, when the findings of that assessment indicate the patient has low suicide risk.",
            actual = data.usage
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "age",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "D000328",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Adult",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://meshb.nlm.nih.gov",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(1)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(1)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "87512008",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Mild major depression",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(2)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(2)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "40379007",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Major depression, recurrent, mild",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(3)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(3)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "394687007",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Low suicide risk",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(4)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(4)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "225337009",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Suicide risk assessment",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "user",
            actual = data.useContext?.get(5)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(5)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "309343006",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Physician",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "venue",
            actual = data.useContext?.get(6)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(6)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "440655000",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Outpatient environment",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\n", " ")
        )
    }

    private fun assertPlanDefinition05Step02(data: PlanDefinition) {

        assertEquals(
            expected = "#referralToMentalHealthCare",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Now()",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "timing.event",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Code '261QM0850X' from SuicideRiskLogic.\"NUCC Provider Taxonomy\" display 'Adult Mental Health'",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "specialty",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.ServiceRequestFulfillmentTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "occurrenceDateTime",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Patient",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "subject",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "requester.agent",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessmentScore",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonCode",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessment",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonReference",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Refer to outpatient mental health program for evaluation and treatment of mental health conditions now",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.ANY,
            actual = data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "Consults and Referrals",
            actual = data.action?.get(0)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "#citalopramPrescription",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "'draft'",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "status",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.Practitioner",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "prescriber",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessmentScore",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonCode",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "SuicideRiskLogic.RiskAssessment",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "reasonReference",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopram 20 mg tablet 1 tablet oral 1 time daily now (30 table; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "escitalopram 10 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "fluoxetine 20 mg capsule 1 capsule oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(2)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "paroxetine 20 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(3)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "sertraline 50 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(4)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/html",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.contentType
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "National Library of Medicine. DailyMed website. CITALOPRAM- citalopram hydrobromide tablet, film coated.",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=6daeb45c-451d-b135-bf8f-2d6dff4b6b01",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.CITATION,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.type
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "Selective Serotonin Reuptake Inhibitors (Choose a mazimum of one or document reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Dopamine Norepinephrine Reuptake Inhibitors (Choose a maximum of one or document reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(1)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Serotonin Norepinephrine Reuptake Inhibitors (Choose a maximum of one or doument reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(2)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Norepinephrine-Serotonin Modulators (Choose a maximum of one or document reasons for exception)",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(3)?.textEquivalent
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/html",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.contentType
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/cqf-qualityOfEvidence",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "high",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/evidence-quality",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "High Quality",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.CITATION,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.type
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "First-Line Antidepressants",
            actual = data.action?.get(0)?.action?.get(1)?.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.action?.get(1)?.groupingBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.AT_MOST_ONE,
            actual = data.action?.get(0)?.action?.get(1)?.selectionBehavior
        )

        assertEquals(
            expected = "Medications",
            actual = data.action?.get(0)?.action?.get(1)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Suicide Risk Assessment and Outpatient Management",
            actual = data.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-03-12",
            actual = data.approvalDate?.value.toString()
        )

        assertEquals(
            expected = "Motive Medical Intelligence",
            actual = data.author?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.author?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.author?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "415-362-4007",
            actual = data.author?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.author?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.author?.get(0)?.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "info@motivemi.com",
            actual = data.author?.get(0)?.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(0)?.use
        )

        assertEquals(
            expected = "415-362-4007",
            actual = data.contact?.get(0)?.telecom?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.EMAIL,
            actual = data.contact?.get(0)?.telecom?.get(1)?.system
        )

        assertEquals(
            expected = ContactPointUse.WORK,
            actual = data.contact?.get(0)?.telecom?.get(1)?.use
        )

        assertEquals(
            expected = "info@motivemi.com",
            actual = data.contact?.get(0)?.telecom?.get(1)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "referralToMentalHealthCare",
            actual = data.contained?.get(0)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopramPrescription",
            actual = data.contained?.get(1)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopramMedication",
            actual = data.contained?.get(2)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "citalopramSubstance",
            actual = data.contained?.get(3)?.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "© Copyright 2016 Motive Medical Intelligence. All rights reserved.",
            actual = data.copyright
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2015-08-15",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Orders to be applied to a patient characterized as low suicide risk.",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2017-12-31",
            actual = data.effectivePeriod?.end?.value.toString()
        )

        assertEquals(
            expected = "2016-01-01",
            actual = data.effectivePeriod?.start?.value.toString()
        )

        assertEquals(
            expected = "True".toBoolean(),
            actual = data.experimental?.value
        )

        assertEquals(
            expected = "low-suicide-risk-order-set",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://motivemi.com/artifacts",
            actual = data.identifier?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "mmi:low-suicide-risk-order-set",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "US",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "urn:iso:std:iso:3166",
            actual = data.jurisdiction?.get(0)?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "2016-08-15",
            actual = data.lastReviewDate?.value.toString()
        )

        assertEquals(
            expected = "Library/suiciderisk-orderset-logic",
            actual = data.library?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "LowSuicideRiskOrderSet",
            actual = data.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Motive Medical Intelligence",
            actual = data.publisher
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This order set helps ensure consistent application of appropriate orders for the care of low suicide risk patients.",
            actual = data.purpose
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ActivityDefinition/referralPrimaryCareMentalHealth",
            actual = data.relatedArtifact?.get(1)?.resource
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(1)?.type
        )

        assertEquals(
            expected = "ActivityDefinition/citalopramPrescription",
            actual = data.relatedArtifact?.get(2)?.resource
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.COMPOSED_OF,
            actual = data.relatedArtifact?.get(2)?.type
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
            expected = "Low Suicide Risk Order Set",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Suicide risk assessment",
            actual = data.topic?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://motivemi.com/artifacts/PlanDefinition/low-suicide-risk-order-set",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "This order set should be applied after assessing a patient for suicide risk, when the findings of that assessment indicate the patient has low suicide risk.",
            actual = data.usage
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "age",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(0)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "D000328",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Adult",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "https://meshb.nlm.nih.gov",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(1)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(1)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "87512008",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Mild major depression",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(2)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(2)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "40379007",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Major depression, recurrent, mild",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(3)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(3)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "394687007",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Low suicide risk",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(4)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(4)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "225337009",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Suicide risk assessment",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "user",
            actual = data.useContext?.get(5)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(5)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "309343006",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Physician",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "venue",
            actual = data.useContext?.get(6)?.code?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://terminology.hl7.org/CodeSystem/usage-context-type",
            actual = data.useContext?.get(6)?.code?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "440655000",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Outpatient environment",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\n", " ")
        )
    }

    @Test
    fun testPlanDefinition06() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-predecessor-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertPlanDefinition06Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertPlanDefinition06Step01(data: PlanDefinition) {

        assertEquals(
            expected = "Should Administer Zika Virus Exposure Assessment",
            actual = data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/administer-zika-virus-exposure-assessment",
            actual = data.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Should Order Serum + Urine rRT-PCR Test",
            actual = data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/order-serum-urine-rrt-pcr-test",
            actual = data.action?.get(0)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Should Order Serum Zika Virus IgM + Dengue Virus IgM",
            actual = data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/order-serum-zika-dengue-virus-igm",
            actual = data.action?.get(0)?.action?.get(2)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Should Consider IgM Antibody Testing",
            actual = data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/consider-igm-antibody-testing",
            actual = data.action?.get(0)?.action?.get(3)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ActivityDefinition/provide-mosquito-prevention-advice",
            actual = data.action?.get(0)?.action?.get(4)?.action?.get(0)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "ActivityDefinition/provide-contraception-advice",
            actual = data.action?.get(0)?.action?.get(4)?.action?.get(1)?.definitionCanonical
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Should Provide Mosquito Prevention and Contraception Advice",
            actual = data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "Is Patient Pregnant",
            actual = data.action?.get(0)?.condition?.get(0)?.expression?.expression
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.condition?.get(0)?.expression?.language
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "Zika Virus Assessment",
            actual = data.action?.get(0)?.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "patient-view",
            actual = data.action?.get(0)?.trigger?.get(0)?.name
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = TriggerType.NAMED_EVENT,
            actual = data.action?.get(0)?.trigger?.get(0)?.type
        )

        assertEquals(
            expected = "2016-11-14",
            actual = data.date?.value.toString()
        )

        assertEquals(
            expected = "Zika Virus Management intervention describing the CDC Guidelines for Zika Virus Reporting and Management.",
            actual = data.description
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "zika-virus-intervention-initial",
            actual = data.id
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "zika-virus-intervention",
            actual = data.identifier?.get(0)?.value
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Library/zika-virus-intervention-logic",
            actual = data.library?.get(0)
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "https://www.cdc.gov/mmwr/volumes/65/wr/mm6539e1.htm?s_cid=mm6539e1_w",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "PlanDefinition/zika-virus-intervention",
            actual = data.relatedArtifact?.get(1)?.resource
                ?.replace("\n", " ")
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
            expected = "Example Zika Virus Intervention",
            actual = data.title
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "Zika Virus Management",
            actual = data.topic?.get(0)?.text
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "http://example.org/PlanDefinition/zika-virus-intervention",
            actual = data.url
                ?.replace("\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\n", " ")
        )
    }
}
