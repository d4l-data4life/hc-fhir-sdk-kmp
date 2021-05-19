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
        // FIXME Test disabled due to issues with plandefinition-example-kdn5-simplified.json
        // REASON - Property _type is not supported yet
        assertEquals(expected = true, actual = true)
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medication-action-1",
            actual = data.action?.get(0)?.action?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Administer Medication 1",
            actual = data.action?.get(0)?.action?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#activitydefinition-medicationrequest-2",
            actual = data.action?.get(0)?.action?.get(1)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medication-action-2",
            actual = data.action?.get(0)?.action?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medication-action-1",
            actual = data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.actionId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "h",
            actual = data.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.offsetDuration?.unit
                ?.replace("\\n", " ")
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
                ?.replace("\\n", " ")
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "activitydefinition-medicationrequest-2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "options-example",
            actual = data.id
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
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">[Put rendering here]</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )

        assertEquals(
            expected = "This example illustrates relationships between actions.",
            actual = data.title
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testPlanDefinition03() {
        // FIXME Test disabled due to issues with plandefinition-example-cardiology-os.json
        // REASON - Property _event is not supported yet
        assertEquals(expected = true, actual = true)
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.condition?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "#procedure",
            actual = data.action?.get(0)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Measure, Weight, Height, Waist, Circumference; Calculate BMI",
            actual = data.action?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "reduce-bmi-ratio",
            actual = data.action?.get(0)?.goalId?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionRequiredBehavior.MUST_UNLESS_DOCUMENTED,
            actual = data.action?.get(0)?.requiredBehavior
        )

        assertEquals(
            expected = "Measure BMI",
            actual = data.action?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "National Heart, Lung, and Blood Institute",
            actual = data.author?.get(0)?.name
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ContactPointSystem.URL,
            actual = data.author?.get(0)?.telecom?.get(0)?.system
        )

        assertEquals(
            expected = "https://www.nhlbi.nih.gov/health-pro/guidelines",
            actual = data.author?.get(0)?.telecom?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "procedure",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "414916001",
            actual = data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Obesity (disorder)",
            actual = data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.goal?.get(0)?.addresses?.get(0)?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Treatment",
            actual = data.goal?.get(0)?.category?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Reduce BMI to below 25",
            actual = data.goal?.get(0)?.description?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Evaluation and Treatment Strategy",
            actual = data.goal?.get(0)?.documentation?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.JUSTIFICATION,
            actual = data.goal?.get(0)?.documentation?.get(0)?.type
        )

        assertEquals(
            expected = "https://www.nhlbi.nih.gov/health-pro/guidelines/current/obesity-guidelines/e_textbook/txgd/42.htm",
            actual = data.goal?.get(0)?.documentation?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "reduce-bmi-ratio",
            actual = data.goal?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medium-priority",
            actual = data.goal?.get(0)?.priority?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "When the patient's BMI Ratio is at or above 25",
            actual = data.goal?.get(0)?.start?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "kg/m2",
            actual = data.goal?.get(0)?.target?.get(0)?.detailRange?.high?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "24.9".toDouble(),
            actual = data.goal?.get(0)?.target?.get(0)?.detailRange?.high?.value?.value
        )

        assertEquals(
            expected = "a",
            actual = data.goal?.get(0)?.target?.get(0)?.due?.unit
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toDouble(),
            actual = data.goal?.get(0)?.target?.get(0)?.due?.value?.value
        )

        assertEquals(
            expected = "39156-5",
            actual = data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Body mass index (BMI) [Ratio]",
            actual = data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://loinc.org",
            actual = data.goal?.get(0)?.target?.get(0)?.measure?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "protocol-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://acme.org",
            actual = data.identifier?.get(0)?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-1",
            actual = data.identifier?.get(0)?.value
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
            expected = "Example of A medical algorithm for assessment and treatment of overweight and obesity",
            actual = data.purpose
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Overweight and Obesity Treatment Guidelines",
            actual = data.relatedArtifact?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "http://www.nhlbi.nih.gov/health-pro/guidelines/current/obesity-guidelines/e_textbook/txgd/algorthm/algorthm.htm",
            actual = data.relatedArtifact?.get(0)?.url
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
            expected = "Obesity Assessment Protocol",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "clinical-protocol",
            actual = data.type?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "focus",
            actual = data.useContext?.get(0)?.code?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "414916001",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Obesity (disorder)",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.display
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://snomed.info/sct",
            actual = data.useContext?.get(0)?.valueCodeableConcept?.coding?.get(0)?.system
                ?.replace("\\n", " ")
        )
    }

    @Test
    fun testPlanDefinition05() {
        // FIXME Test disabled due to issues with plandefinition-example.json
        // REASON - Property _event is not supported yet
        assertEquals(expected = true, actual = true)
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(0)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/administer-zika-virus-exposure-assessment",
            actual = data.action?.get(0)?.action?.get(0)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Should Order Serum + Urine rRT-PCR Test",
            actual = data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.expression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(1)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/order-serum-urine-rrt-pcr-test",
            actual = data.action?.get(0)?.action?.get(1)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Should Order Serum Zika Virus IgM + Dengue Virus IgM",
            actual = data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.expression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(2)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/order-serum-zika-dengue-virus-igm",
            actual = data.action?.get(0)?.action?.get(2)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Should Consider IgM Antibody Testing",
            actual = data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.expression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(3)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "ActivityDefinition/consider-igm-antibody-testing",
            actual = data.action?.get(0)?.action?.get(3)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ActivityDefinition/provide-mosquito-prevention-advice",
            actual = data.action?.get(0)?.action?.get(4)?.action?.get(0)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "ActivityDefinition/provide-contraception-advice",
            actual = data.action?.get(0)?.action?.get(4)?.action?.get(1)?.definitionCanonical
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Should Provide Mosquito Prevention and Contraception Advice",
            actual = data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.expression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.action?.get(4)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "Is Patient Pregnant",
            actual = data.action?.get(0)?.condition?.get(0)?.expression?.expression
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "text/cql",
            actual = data.action?.get(0)?.condition?.get(0)?.expression?.language
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionConditionKind.APPLICABILITY,
            actual = data.action?.get(0)?.condition?.get(0)?.kind
        )

        assertEquals(
            expected = "Zika Virus Assessment",
            actual = data.action?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "patient-view",
            actual = data.action?.get(0)?.trigger?.get(0)?.name
                ?.replace("\\n", " ")
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
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "zika-virus-intervention-initial",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = IdentifierUse.OFFICIAL,
            actual = data.identifier?.get(0)?.use
        )

        assertEquals(
            expected = "zika-virus-intervention",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Library/zika-virus-intervention-logic",
            actual = data.library?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RelatedArtifactType.DERIVED_FROM,
            actual = data.relatedArtifact?.get(0)?.type
        )

        assertEquals(
            expected = "https://www.cdc.gov/mmwr/volumes/65/wr/mm6539e1.htm?s_cid=mm6539e1_w",
            actual = data.relatedArtifact?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PlanDefinition/zika-virus-intervention",
            actual = data.relatedArtifact?.get(1)?.resource
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
            expected = "Example Zika Virus Intervention",
            actual = data.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Zika Virus Management",
            actual = data.topic?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/PlanDefinition/zika-virus-intervention",
            actual = data.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1.0.0",
            actual = data.version
                ?.replace("\\n", " ")
        )
    }
}
