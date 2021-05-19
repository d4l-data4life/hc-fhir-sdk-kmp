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
        assertEquals(
            "#1111",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "day",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(0)?.url
        )
        assertEquals(
            "1".toInt(),
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(0)?.valueInteger?.value
        )
        assertEquals(
            "day",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(1)?.url
        )
        assertEquals(
            "8".toInt(),
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(1)?.valueInteger?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/timing-daysOfCycle",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.url
        )
        assertEquals(
            "action-1",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.id
        )
        assertEquals(
            "Gemcitabine 1250 mg/m² IV over 30 minutes on days 1 and 8",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
        )
        assertEquals(
            "#2222",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.definitionCanonical
        )
        assertEquals(
            "day",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.extension?.get(0)?.url
        )
        assertEquals(
            "1".toInt(),
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.extension?.get(0)?.valueInteger?.value
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/timing-daysOfCycle",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.url
        )
        assertEquals(
            "action-2",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.id
        )
        assertEquals(
            "action-1",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.actionId
        )
        assertEquals(
            ActionRelationshipType.CONCURRENT_WITH_START,
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.relationship
        )
        assertEquals(
            "CARBOplatin AUC 5 IV over 30 minutes on Day 1",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.textEquivalent
        )
        assertEquals(
            "cycle-definition-1",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.id
        )
        assertEquals(
            "21-day cycle for 6 cycles",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
        )
        assertEquals(
            "6".toLong(),
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.count?.value
        )
        assertEquals(
            "21".toDouble(),
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.duration?.value
        )
        assertEquals(
            "d",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.durationUnit
        )
        assertEquals(
            ActionGroupingBehavior.SENTENCE_GROUP,
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.EXACTLY_ONE,
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            ActionSelectionBehavior.ALL,
            data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            ActionSelectionBehavior.EXACTLY_ONE,
            data.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "2016-07-27",
            data.approvalDate?.value.toString()
        )
        assertEquals(
            "Lee Surprenant",
            data.author?.get(0)?.name
        )
        assertEquals(
            "1111",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "2222",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "All rights reserved.",
            data.copyright
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "KDN5",
            data.id
        )
        assertEquals(
            "http://example.org/ordertemplates",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "KDN5",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "2016-07-27",
            data.lastReviewDate?.value.toString()
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
            "National Comprehensive Cancer Network, Inc.",
            data.publisher
        )
        assertEquals(
            "NCCN Guidelines for Kidney Cancer. V.2.2016",
            data.relatedArtifact?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.DERIVED_FROM,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "http://www.example.org/professionals/physician_gls/PDF/kidney.pdf",
            data.relatedArtifact?.get(0)?.url
        )
        assertEquals(
            "Oudard S, et al. J Urol. 2007;177(5):1698-702",
            data.relatedArtifact?.get(1)?.citation
        )
        assertEquals(
            RelatedArtifactType.CITATION,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            "http://www.ncbi.nlm.nih.gov/pubmed/17437788",
            data.relatedArtifact?.get(1)?.url
        )
        assertEquals(
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            NarrativeStatus.ADDITIONAL,
            data.text?.status
        )
        assertEquals(
            "Gemcitabine/CARBOplatin",
            data.title
        )
        assertEquals(
            "Chemotherapy Order Template",
            data.type?.text
        )
        assertEquals(
            "treamentSetting-or-diseaseStatus",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/indications",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            data.useContext?.get(0)?.extension?.get(0)?.url
        )
        assertEquals(
            "A",
            data.useContext?.get(0)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "Metastatic",
            data.useContext?.get(0)?.valueCodeableConcept?.text
        )
        assertEquals(
            "disease-or-histology",
            data.useContext?.get(1)?.code?.code
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/indications",
            data.useContext?.get(1)?.code?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            data.useContext?.get(1)?.extension?.get(0)?.url
        )
        assertEquals(
            "A",
            data.useContext?.get(1)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "Collecting Duct/Medullary Subtypes",
            data.useContext?.get(1)?.valueCodeableConcept?.text
        )
        assertEquals(
            "focus",
            data.useContext?.get(2)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(2)?.code?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            data.useContext?.get(2)?.extension?.get(0)?.url
        )
        assertEquals(
            "A",
            data.useContext?.get(2)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "Kidney Cancer",
            data.useContext?.get(2)?.valueCodeableConcept?.text
        )
        assertEquals(
            "treatmentSetting-or-diseaseStatus",
            data.useContext?.get(3)?.code?.code
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/indications",
            data.useContext?.get(3)?.code?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            data.useContext?.get(3)?.extension?.get(0)?.url
        )
        assertEquals(
            "B",
            data.useContext?.get(3)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "Relapsed",
            data.useContext?.get(3)?.valueCodeableConcept?.text
        )
        assertEquals(
            "disease-or-histology",
            data.useContext?.get(4)?.code?.code
        )
        assertEquals(
            "http://example.org/fhir/CodeSystem/indications",
            data.useContext?.get(4)?.code?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            data.useContext?.get(4)?.extension?.get(0)?.url
        )
        assertEquals(
            "B",
            data.useContext?.get(4)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "Collecting Duct/Medullary Subtypes",
            data.useContext?.get(4)?.valueCodeableConcept?.text
        )
        assertEquals(
            "focus",
            data.useContext?.get(5)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(5)?.code?.system
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/usagecontext-group",
            data.useContext?.get(5)?.extension?.get(0)?.url
        )
        assertEquals(
            "B",
            data.useContext?.get(5)?.extension?.get(0)?.valueString
        )
        assertEquals(
            "Kidney Cancer – Collecting Duct/Medullary Subtypes - Metastatic",
            data.useContext?.get(5)?.valueCodeableConcept?.text
        )
        assertEquals(
            "1",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPlanDefinition02() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-options-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertEquals(
            "#activitydefinition-medicationrequest-1",
            data.action?.get(0)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "medication-action-1",
            data.action?.get(0)?.action?.get(0)?.id
        )
        assertEquals(
            "Administer Medication 1",
            data.action?.get(0)?.action?.get(0)?.title
        )
        assertEquals(
            "#activitydefinition-medicationrequest-2",
            data.action?.get(0)?.action?.get(1)?.definitionCanonical
        )
        assertEquals(
            "medication-action-2",
            data.action?.get(0)?.action?.get(1)?.id
        )
        assertEquals(
            "medication-action-1",
            data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.actionId
        )
        assertEquals(
            "h",
            data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.offsetDuration?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.offsetDuration?.value?.value
        )
        assertEquals(
            ActionRelationshipType.AFTER_END,
            data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.relationship
        )
        assertEquals(
            "Administer Medication 2",
            data.action?.get(0)?.action?.get(1)?.title
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.ALL,
            data.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "activitydefinition-medicationrequest-1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "activitydefinition-medicationrequest-2",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "options-example",
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
            PublicationStatus.DRAFT,
            data.status
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )
        assertEquals(
            "This example illustrates relationships between actions.",
            data.title
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPlanDefinition03() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-example-cardiology-os.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertEquals(
            "#referralToCardiologyConsult",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "Now()",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "timing.event",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "Code '261QM0850X' from CardiologyChestPainLogic.\"NUCC Provider Taxonomy\" display 'Adult Mental Health'",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "specialty",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.ServiceRequestFulfillmentTime",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
        )
        assertEquals(
            "occurrenceDateTime",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Patient",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
        )
        assertEquals(
            "subject",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Practitioner",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
        )
        assertEquals(
            "requester.agent",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.CardiologyReferralReason",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.language
        )
        assertEquals(
            "reasonCode",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.RiskAssessment",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.language
        )
        assertEquals(
            "reasonReference",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.path
        )
        assertEquals(
            "Referral to cardiology to evaluate chest pain (routine)",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
        )
        assertEquals(
            "#CollectReferralReason",
            data.action?.get(0)?.action?.get(0)?.action?.get(1)?.definitionCanonical
        )
        assertEquals(
            "Reason for cardiology consultation",
            data.action?.get(0)?.action?.get(0)?.action?.get(1)?.title
        )
        assertEquals(
            "#CardiologyConsultationGoal",
            data.action?.get(0)?.action?.get(0)?.action?.get(2)?.definitionCanonical
        )
        assertEquals(
            "Goal of cardiology consultation",
            data.action?.get(0)?.action?.get(0)?.action?.get(2)?.title
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.ANY,
            data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "Consults and Referrals",
            data.action?.get(0)?.action?.get(0)?.title
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.AT_MOST_ONE,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "#metoprololTartrate25Prescription",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "'draft'",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "status",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Practitioner",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
        )
        assertEquals(
            "prescriber",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.dynamicValue?.get(2)?.path
        )
        assertEquals(
            "metoprolol tartrate 25 mg tablet 1 tablet oral 2 time daily",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(0)?.textEquivalent
        )
        assertEquals(
            "#metoprololTartrate50Prescription",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.definitionCanonical
        )
        assertEquals(
            "'draft'",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "status",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Practitioner",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.expression?.language
        )
        assertEquals(
            "prescriber",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.dynamicValue?.get(2)?.path
        )
        assertEquals(
            "metoprolol tartrate 50 mg tablet 1 tablet oral 2 time daily",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(1)?.textEquivalent
        )
        assertEquals(
            "#amlodipinePrescription",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.definitionCanonical
        )
        assertEquals(
            "'draft'",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "status",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Practitioner",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.expression?.language
        )
        assertEquals(
            "prescriber",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.dynamicValue?.get(2)?.path
        )
        assertEquals(
            "amlodipine 5  tablet 1 tablet oral  daily",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.action?.get(2)?.textEquivalent
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.AT_MOST_ONE,
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.selectionBehavior
        )
        assertEquals(
            "Antianginal Therapy",
            data.action?.get(0)?.action?.get(1)?.action?.get(1)?.title
        )
        assertEquals(
            "#nitroglycerinPrescription",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "'draft'",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "status",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "CardiologyChestPainLogic.Practitioner",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
        )
        assertEquals(
            "prescriber",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.dynamicValue?.get(2)?.path
        )
        assertEquals(
            "nitroglycerin 0.4 mg tablet sub-lingual every 5 minutes as needed for chest pain; maximum 3 tablets",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.action?.get(0)?.textEquivalent
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.AT_MOST_ONE,
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.selectionBehavior
        )
        assertEquals(
            "Nitroglycerin",
            data.action?.get(0)?.action?.get(1)?.action?.get(2)?.title
        )
        assertEquals(
            "Consider the following medications for stable patients to be initiated prior to the cardiology consultation.",
            data.action?.get(0)?.action?.get(1)?.description
        )
        assertEquals(
            "Medications",
            data.action?.get(0)?.action?.get(1)?.title
        )
        assertEquals(
            "Bruce Bray MD",
            data.author?.get(0)?.name
        )
        assertEquals(
            "Scott Wall MD",
            data.author?.get(1)?.name
        )
        assertEquals(
            "Aiden Abidov MD, PhD",
            data.author?.get(2)?.name
        )
        assertEquals(
            "cardiology-chestPain-logic",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "referralToCardiologyConsult",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "metoprololTartrate25Prescription",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "metoprololTartrate25Medication",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "metoprololTartrate25Substance",
            data.contained?.get(4)?.id
        )
        assertEquals(
            "metoprololTartrate50Prescription",
            data.contained?.get(5)?.id
        )
        assertEquals(
            "metoprololTartrate50Medication",
            data.contained?.get(6)?.id
        )
        assertEquals(
            "metoprololTartrate50Substance",
            data.contained?.get(7)?.id
        )
        assertEquals(
            "nitroglycerinPrescription",
            data.contained?.get(8)?.id
        )
        assertEquals(
            "nitroglycerinMedication",
            data.contained?.get(9)?.id
        )
        assertEquals(
            "© Copyright Cognitive Medical Systems, Inc. 9444 Waples Street Suite 300 San Diego, CA 92121",
            data.copyright
        )
        assertEquals(
            "2017-08-29",
            data.date?.value.toString()
        )
        assertEquals(
            "example-cardiology-os",
            data.id
        )
        assertEquals(
            "urn:va.gov:kbs:knart:artifact:r1",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "bb7ccea6-9744-4743-854a-bcffd87191f6",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "urn:va.gov:kbs:contract:VA118-16-D-1008:to:VA-118-16-F-1008-0007",
            data.identifier?.get(1)?.system
        )
        assertEquals(
            "CLIN0004AG",
            data.identifier?.get(1)?.value
        )
        assertEquals(
            "urn:cognitivemedicine.com:lab:jira",
            data.identifier?.get(2)?.system
        )
        assertEquals(
            "KP-914",
            data.identifier?.get(2)?.value
        )
        assertEquals(
            "#cardiology-chestPain-logic",
            data.library?.get(0)
        )
        assertEquals(
            "ChestPainCoronaryArteryDiseaseOrderSetKNART",
            data.name
        )
        assertEquals(
            "Department of Veterans Affairs",
            data.publisher
        )
        assertEquals(
            "Cardiology: Chest Pain (CP) / Coronary Artery Disease (CAD) Clinical Content White Paper",
            data.relatedArtifact?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.DERIVED_FROM,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "NEED-A-URL-HERE",
            data.relatedArtifact?.get(0)?.url
        )
        assertEquals(
            "Outcome CVD (coronary death, myocardial infarction, coronary insufficiency, angina, ischemic stroke, hemorrhagic stroke, transient ischemic attack, peripheral artery disease, heart failure)",
            data.relatedArtifact?.get(1)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            "https://www.framinghamheartstudy.org/risk-functions/cardiovascular-disease/10-year-risk.php",
            data.relatedArtifact?.get(1)?.url
        )
        assertEquals(
            "General cardiovascular risk profile for use in primary care: the Framingham Heart Study",
            data.relatedArtifact?.get(2)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(2)?.type
        )
        assertEquals(
            "https://www.framinghamheartstudy.org/risk-functions/cardiovascular-disease/10-year-risk.php",
            data.relatedArtifact?.get(2)?.url
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(3)?.type
        )
        assertEquals(
            "NEED-A-URL-HERE",
            data.relatedArtifact?.get(3)?.url
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(4)?.type
        )
        assertEquals(
            "NEED-A-URL-HERE",
            data.relatedArtifact?.get(4)?.url
        )
        assertEquals(
            "LABEL: ASPIRIN 81 MG- aspirin tablet, coated",
            data.relatedArtifact?.get(5)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(5)?.type
        )
        assertEquals(
            "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=b4064039-2345-4227-b83d-54dc13a838d3",
            data.relatedArtifact?.get(5)?.url
        )
        assertEquals(
            "LABEL: CLOPIDOGREL- clopidogrel bisulfate tablet, film coated",
            data.relatedArtifact?.get(6)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(6)?.type
        )
        assertEquals(
            "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=7fe85155-bc00-406b-b097-e8aece187a8a",
            data.relatedArtifact?.get(6)?.url
        )
        assertEquals(
            "LABEL: LIPITOR- atorvastatin calcium tablet, film coated",
            data.relatedArtifact?.get(7)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(7)?.type
        )
        assertEquals(
            "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=7fe85155-bc00-406b-b097-e8aece187a8a",
            data.relatedArtifact?.get(7)?.url
        )
        assertEquals(
            "LABEL: METOPROLOL SUCCINATE EXTENDED-RELEASE - metoprolol succinate tablet, film coated, extended release",
            data.relatedArtifact?.get(8)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(8)?.type
        )
        assertEquals(
            "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=2d948600-35d8-4490-983b-918bdce488c8",
            data.relatedArtifact?.get(8)?.url
        )
        assertEquals(
            "LABEL: NITROGLYCERIN- nitroglycerin tablet",
            data.relatedArtifact?.get(9)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.relatedArtifact?.get(9)?.type
        )
        assertEquals(
            "https://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=67bf2a15-b115-47ac-ae28-ce2dafd6b5c9",
            data.relatedArtifact?.get(9)?.url
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
            "Chest Pain (CP) - Coronary Artery Disease (CAD) Order Set KNART",
            data.title
        )
        assertEquals(
            "order-set",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Order Set",
            data.type?.coding?.get(0)?.display
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/plan-definition-type",
            data.type?.coding?.get(0)?.system
        )
        assertEquals(
            "http://va.gov/kas/orderset/B5-Cardiology-ChestPainCAD-OS",
            data.url
        )
        assertEquals(
            "focus",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "look up value",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "appropriate snomed condition",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "0.1",
            data.version
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPlanDefinition04() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-protocol-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertEquals(
            ActionCardinalityBehavior.SINGLE,
            data.action?.get(0)?.cardinalityBehavior
        )
        assertEquals(
            "exists ([Condition: Obesity]) or not exists ([Observation: BMI] O where O.effectiveDateTime 2 years or less before Today())",
            data.action?.get(0)?.condition?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.condition?.get(0)?.expression?.language
        )
        assertEquals(
            ActionConditionKind.APPLICABILITY,
            data.action?.get(0)?.condition?.get(0)?.kind
        )
        assertEquals(
            "#procedure",
            data.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "Measure, Weight, Height, Waist, Circumference; Calculate BMI",
            data.action?.get(0)?.description
        )
        assertEquals(
            "reduce-bmi-ratio",
            data.action?.get(0)?.goalId?.get(0)
        )
        assertEquals(
            ActionRequiredBehavior.MUST_UNLESS_DOCUMENTED,
            data.action?.get(0)?.requiredBehavior
        )
        assertEquals(
            "Measure BMI",
            data.action?.get(0)?.title
        )
        assertEquals(
            "National Heart, Lung, and Blood Institute",
            data.author?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.URL,
            data.author?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            "https://www.nhlbi.nih.gov/health-pro/guidelines",
            data.author?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            "procedure",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "414916001",
            data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.code
        )
        assertEquals(
            "Obesity (disorder)",
            data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.system
        )
        assertEquals(
            "Treatment",
            data.goal?.get(0)?.category?.text
        )
        assertEquals(
            "Reduce BMI to below 25",
            data.goal?.get(0)?.description?.text
        )
        assertEquals(
            "Evaluation and Treatment Strategy",
            data.goal?.get(0)?.documentation?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.JUSTIFICATION,
            data.goal?.get(0)?.documentation?.get(0)?.type
        )
        assertEquals(
            "https://www.nhlbi.nih.gov/health-pro/guidelines/current/obesity-guidelines/e_textbook/txgd/42.htm",
            data.goal?.get(0)?.documentation?.get(0)?.url
        )
        assertEquals(
            "reduce-bmi-ratio",
            data.goal?.get(0)?.id
        )
        assertEquals(
            "medium-priority",
            data.goal?.get(0)?.priority?.text
        )
        assertEquals(
            "When the patient's BMI Ratio is at or above 25",
            data.goal?.get(0)?.start?.text
        )
        assertEquals(
            "kg/m2",
            data.goal?.get(0)?.target?.get(0)?.detailRange?.high?.unit
        )
        assertEquals(
            "24.9".toDouble(),
            data.goal?.get(0)?.target?.get(0)?.detailRange?.high?.value?.value
        )
        assertEquals(
            "a",
            data.goal?.get(0)?.target?.get(0)?.due?.unit
        )
        assertEquals(
            "1".toDouble(),
            data.goal?.get(0)?.target?.get(0)?.due?.value?.value
        )
        assertEquals(
            "39156-5",
            data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.code
        )
        assertEquals(
            "Body mass index (BMI) [Ratio]",
            data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.display
        )
        assertEquals(
            "http://loinc.org",
            data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.system
        )
        assertEquals(
            "protocol-example",
            data.id
        )
        assertEquals(
            "http://acme.org",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            "example-1",
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
            "Example of A medical algorithm for assessment and treatment of overweight and obesity",
            data.purpose
        )
        assertEquals(
            "Overweight and Obesity Treatment Guidelines",
            data.relatedArtifact?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.DERIVED_FROM,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "http://www.nhlbi.nih.gov/health-pro/guidelines/current/obesity-guidelines/e_textbook/txgd/algorthm/algorthm.htm",
            data.relatedArtifact?.get(0)?.url
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
            "Obesity Assessment Protocol",
            data.title
        )
        assertEquals(
            "clinical-protocol",
            data.type?.coding?.get(0)?.code
        )
        assertEquals(
            "focus",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "414916001",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Obesity (disorder)",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testPlanDefinition05() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertEquals(
            "#referralToMentalHealthCare",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "Now()",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "timing.event",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "Code '261QM0850X' from SuicideRiskLogic.\"NUCC Provider Taxonomy\" display 'Adult Mental Health'",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "specialty",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "SuicideRiskLogic.ServiceRequestFulfillmentTime",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
        )
        assertEquals(
            "occurrenceDateTime",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
        )
        assertEquals(
            "SuicideRiskLogic.Patient",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
        )
        assertEquals(
            "subject",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
        )
        assertEquals(
            "SuicideRiskLogic.Practitioner",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
        )
        assertEquals(
            "requester.agent",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
        )
        assertEquals(
            "SuicideRiskLogic.RiskAssessmentScore",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.expression?.language
        )
        assertEquals(
            "reasonCode",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(5)?.path
        )
        assertEquals(
            "SuicideRiskLogic.RiskAssessment",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.expression?.language
        )
        assertEquals(
            "reasonReference",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(6)?.path
        )
        assertEquals(
            "Refer to outpatient mental health program for evaluation and treatment of mental health conditions now",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.ANY,
            data.action?.get(0)?.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "Consults and Referrals",
            data.action?.get(0)?.action?.get(0)?.title
        )
        assertEquals(
            "#citalopramPrescription",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "'draft'",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.expression?.language
        )
        assertEquals(
            "status",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(0)?.path
        )
        assertEquals(
            "SuicideRiskLogic.Patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.expression?.language
        )
        assertEquals(
            "patient",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(1)?.path
        )
        assertEquals(
            "SuicideRiskLogic.Practitioner",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.expression?.language
        )
        assertEquals(
            "prescriber",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(2)?.path
        )
        assertEquals(
            "SuicideRiskLogic.RiskAssessmentScore",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.expression?.language
        )
        assertEquals(
            "reasonCode",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(3)?.path
        )
        assertEquals(
            "SuicideRiskLogic.RiskAssessment",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.expression?.language
        )
        assertEquals(
            "reasonReference",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.dynamicValue?.get(4)?.path
        )
        assertEquals(
            "citalopram 20 mg tablet 1 tablet oral 1 time daily now (30 table; 3 refills)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
        )
        assertEquals(
            "escitalopram 10 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.textEquivalent
        )
        assertEquals(
            "fluoxetine 20 mg capsule 1 capsule oral 1 time daily now (30 tablet; 3 refills)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(2)?.textEquivalent
        )
        assertEquals(
            "paroxetine 20 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(3)?.textEquivalent
        )
        assertEquals(
            "sertraline 50 mg tablet 1 tablet oral 1 time daily now (30 tablet; 3 refills)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.action?.get(4)?.textEquivalent
        )
        assertEquals(
            "text/html",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.contentType
        )
        assertEquals(
            "National Library of Medicine. DailyMed website. CITALOPRAM- citalopram hydrobromide tablet, film coated.",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.title
        )
        assertEquals(
            "http://dailymed.nlm.nih.gov/dailymed/drugInfo.cfm?setid=6daeb45c-451d-b135-bf8f-2d6dff4b6b01",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.document?.url
        )
        assertEquals(
            RelatedArtifactType.CITATION,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.documentation?.get(0)?.type
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.AT_MOST_ONE,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "Selective Serotonin Reuptake Inhibitors (Choose a mazimum of one or document reasons for exception)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(0)?.title
        )
        assertEquals(
            "Dopamine Norepinephrine Reuptake Inhibitors (Choose a maximum of one or document reasons for exception)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(1)?.textEquivalent
        )
        assertEquals(
            "Serotonin Norepinephrine Reuptake Inhibitors (Choose a maximum of one or doument reasons for exception)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(2)?.textEquivalent
        )
        assertEquals(
            "Norepinephrine-Serotonin Modulators (Choose a maximum of one or document reasons for exception)",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.action?.get(3)?.textEquivalent
        )
        assertEquals(
            "text/html",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.contentType
        )
        assertEquals(
            "http://hl7.org/fhir/StructureDefinition/cqf-qualityOfEvidence",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.url
        )
        assertEquals(
            "high",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/evidence-quality",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "High Quality",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.extension?.get(0)?.valueCodeableConcept?.text
        )
        assertEquals(
            "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.title
        )
        assertEquals(
            "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.document?.url
        )
        assertEquals(
            RelatedArtifactType.CITATION,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.documentation?.get(0)?.type
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.AT_MOST_ONE,
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "First-Line Antidepressants",
            data.action?.get(0)?.action?.get(1)?.action?.get(0)?.title
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.action?.get(1)?.groupingBehavior
        )
        assertEquals(
            ActionSelectionBehavior.AT_MOST_ONE,
            data.action?.get(0)?.action?.get(1)?.selectionBehavior
        )
        assertEquals(
            "Medications",
            data.action?.get(0)?.action?.get(1)?.title
        )
        assertEquals(
            "Suicide Risk Assessment and Outpatient Management",
            data.action?.get(0)?.title
        )
        assertEquals(
            "2016-03-12",
            data.approvalDate?.value.toString()
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.author?.get(0)?.name
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.author?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.author?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.author?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.author?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.author?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.telecom?.get(0)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(0)?.use
        )
        assertEquals(
            "415-362-4007",
            data.contact?.get(0)?.telecom?.get(0)?.value
        )
        assertEquals(
            ContactPointSystem.EMAIL,
            data.contact?.get(0)?.telecom?.get(1)?.system
        )
        assertEquals(
            ContactPointUse.WORK,
            data.contact?.get(0)?.telecom?.get(1)?.use
        )
        assertEquals(
            "info@motivemi.com",
            data.contact?.get(0)?.telecom?.get(1)?.value
        )
        assertEquals(
            "referralToMentalHealthCare",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "citalopramPrescription",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "citalopramMedication",
            data.contained?.get(2)?.id
        )
        assertEquals(
            "citalopramSubstance",
            data.contained?.get(3)?.id
        )
        assertEquals(
            "© Copyright 2016 Motive Medical Intelligence. All rights reserved.",
            data.copyright
        )
        assertEquals(
            "2015-08-15",
            data.date?.value.toString()
        )
        assertEquals(
            "Orders to be applied to a patient characterized as low suicide risk.",
            data.description
        )
        assertEquals(
            "2017-12-31",
            data.effectivePeriod?.end?.value.toString()
        )
        assertEquals(
            "2016-01-01",
            data.effectivePeriod?.start?.value.toString()
        )
        assertEquals(
            "True".toBoolean(),
            data.experimental?.value
        )
        assertEquals(
            "low-suicide-risk-order-set",
            data.id
        )
        assertEquals(
            "http://motivemi.com/artifacts",
            data.identifier?.get(0)?.system
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "mmi:low-suicide-risk-order-set",
            data.identifier?.get(0)?.value
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
            "2016-08-15",
            data.lastReviewDate?.value.toString()
        )
        assertEquals(
            "Library/suiciderisk-orderset-logic",
            data.library?.get(0)
        )
        assertEquals(
            "LowSuicideRiskOrderSet",
            data.name
        )
        assertEquals(
            "Motive Medical Intelligence",
            data.publisher
        )
        assertEquals(
            "This order set helps ensure consistent application of appropriate orders for the care of low suicide risk patients.",
            data.purpose
        )
        assertEquals(
            "Practice Guideline for the Treatment of Patients with Major Depressive Disorder",
            data.relatedArtifact?.get(0)?.display
        )
        assertEquals(
            RelatedArtifactType.DERIVED_FROM,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "http://psychiatryonline.org/pb/assets/raw/sitewide/practice_guidelines/guidelines/mdd.pdf",
            data.relatedArtifact?.get(0)?.url
        )
        assertEquals(
            "ActivityDefinition/referralPrimaryCareMentalHealth",
            data.relatedArtifact?.get(1)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(1)?.type
        )
        assertEquals(
            "ActivityDefinition/citalopramPrescription",
            data.relatedArtifact?.get(2)?.resource
        )
        assertEquals(
            RelatedArtifactType.COMPOSED_OF,
            data.relatedArtifact?.get(2)?.type
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
            "Low Suicide Risk Order Set",
            data.title
        )
        assertEquals(
            "Suicide risk assessment",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "http://motivemi.com/artifacts/PlanDefinition/low-suicide-risk-order-set",
            data.url
        )
        assertEquals(
            "This order set should be applied after assessing a patient for suicide risk, when the findings of that assessment indicate the patient has low suicide risk.",
            data.usage
        )
        assertEquals(
            "age",
            data.useContext?.get(0)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(0)?.code?.system
        )
        assertEquals(
            "D000328",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Adult",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "https://meshb.nlm.nih.gov",
            data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(1)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(1)?.code?.system
        )
        assertEquals(
            "87512008",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Mild major depression",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(1)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(2)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(2)?.code?.system
        )
        assertEquals(
            "40379007",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Major depression, recurrent, mild",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(2)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(3)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(3)?.code?.system
        )
        assertEquals(
            "394687007",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Low suicide risk",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(3)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "focus",
            data.useContext?.get(4)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(4)?.code?.system
        )
        assertEquals(
            "225337009",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Suicide risk assessment",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(4)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "user",
            data.useContext?.get(5)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(5)?.code?.system
        )
        assertEquals(
            "309343006",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Physician",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(5)?.valueCodeableConcept?.coding?.get(0)?.system
        )
        assertEquals(
            "venue",
            data.useContext?.get(6)?.code?.code
        )
        assertEquals(
            "http://terminology.hl7.org/CodeSystem/usage-context-type",
            data.useContext?.get(6)?.code?.system
        )
        assertEquals(
            "440655000",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.code
        )
        assertEquals(
            "Outpatient environment",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.display
        )
        assertEquals(
            "http://snomed.info/sct",
            data.useContext?.get(6)?.valueCodeableConcept?.coding?.get(0)?.system
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
    fun testPlanDefinition06() {
        // Given
        val sourceJson = loadAsString("r4/plandefinition-predecessor-example.json")

        // When
        val data = parser.toFhir(PlanDefinition::class, sourceJson)

        // Then
        assertEquals(
            "Should Administer Zika Virus Exposure Assessment",
            data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.expression?.language
        )
        assertEquals(
            ActionConditionKind.APPLICABILITY,
            data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.kind
        )
        assertEquals(
            "ActivityDefinition/administer-zika-virus-exposure-assessment",
            data.action?.get(0)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "Should Order Serum + Urine rRT-PCR Test",
            data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.expression?.language
        )
        assertEquals(
            ActionConditionKind.APPLICABILITY,
            data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.kind
        )
        assertEquals(
            "ActivityDefinition/order-serum-urine-rrt-pcr-test",
            data.action?.get(0)?.action?.get(1)?.definitionCanonical
        )
        assertEquals(
            "Should Order Serum Zika Virus IgM + Dengue Virus IgM",
            data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.expression?.language
        )
        assertEquals(
            ActionConditionKind.APPLICABILITY,
            data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.kind
        )
        assertEquals(
            "ActivityDefinition/order-serum-zika-dengue-virus-igm",
            data.action?.get(0)?.action?.get(2)?.definitionCanonical
        )
        assertEquals(
            "Should Consider IgM Antibody Testing",
            data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.expression?.language
        )
        assertEquals(
            ActionConditionKind.APPLICABILITY,
            data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.kind
        )
        assertEquals(
            "ActivityDefinition/consider-igm-antibody-testing",
            data.action?.get(0)?.action?.get(3)?.definitionCanonical
        )
        assertEquals(
            "ActivityDefinition/provide-mosquito-prevention-advice",
            data.action?.get(0)?.action?.get(4)?.action?.get(0)?.definitionCanonical
        )
        assertEquals(
            "ActivityDefinition/provide-contraception-advice",
            data.action?.get(0)?.action?.get(4)?.action?.get(1)?.definitionCanonical
        )
        assertEquals(
            "Should Provide Mosquito Prevention and Contraception Advice",
            data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.expression?.language
        )
        assertEquals(
            ActionConditionKind.APPLICABILITY,
            data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.kind
        )
        assertEquals(
            "Is Patient Pregnant",
            data.action?.get(0)?.condition?.get(0)?.expression?.expression
        )
        assertEquals(
            "text/cql",
            data.action?.get(0)?.condition?.get(0)?.expression?.language
        )
        assertEquals(
            ActionConditionKind.APPLICABILITY,
            data.action?.get(0)?.condition?.get(0)?.kind
        )
        assertEquals(
            "Zika Virus Assessment",
            data.action?.get(0)?.title
        )
        assertEquals(
            "patient-view",
            data.action?.get(0)?.trigger?.get(0)?.name
        )
        assertEquals(
            TriggerType.NAMED_EVENT,
            data.action?.get(0)?.trigger?.get(0)?.type
        )
        assertEquals(
            "2016-11-14",
            data.date?.value.toString()
        )
        assertEquals(
            "Zika Virus Management intervention describing the CDC Guidelines for Zika Virus Reporting and Management.",
            data.description
        )
        assertEquals(
            "zika-virus-intervention-initial",
            data.id
        )
        assertEquals(
            IdentifierUse.OFFICIAL,
            data.identifier?.get(0)?.use
        )
        assertEquals(
            "zika-virus-intervention",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "Library/zika-virus-intervention-logic",
            data.library?.get(0)
        )
        assertEquals(
            RelatedArtifactType.DERIVED_FROM,
            data.relatedArtifact?.get(0)?.type
        )
        assertEquals(
            "https://www.cdc.gov/mmwr/volumes/65/wr/mm6539e1.htm?s_cid=mm6539e1_w",
            data.relatedArtifact?.get(0)?.url
        )
        assertEquals(
            "PlanDefinition/zika-virus-intervention",
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
            "Example Zika Virus Intervention",
            data.title
        )
        assertEquals(
            "Zika Virus Management",
            data.topic?.get(0)?.text
        )
        assertEquals(
            "http://example.org/PlanDefinition/zika-virus-intervention",
            data.url
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
