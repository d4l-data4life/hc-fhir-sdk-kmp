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
import care.data4life.hl7.fhir.stu3.codesystem.ActionCardinalityBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionGroupingBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionPrecheckBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionRelationshipType
import care.data4life.hl7.fhir.stu3.codesystem.ActionRequiredBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionSelectionBehavior
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.RequestIntent
import care.data4life.hl7.fhir.stu3.codesystem.RequestPriority
import care.data4life.hl7.fhir.stu3.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import kotlin.test.assertEquals
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert

/**
 * RequestGroupTest.java
 *
 * A group of related requests
 *
 * A group of related requests that can be used to capture intended activities that have inter-
 * dependencies such as "give this medication after that one".
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class RequestGroupFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testRequestGroup01() {
        // Given
        val sourceJson = loadAsString("stu3/requestgroup-kdn5-example.json")

        // When
        val data = parser.toFhir(RequestGroup::class, sourceJson)

        // Then
        assertRequestGroup01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRequestGroup01Step01(data: RequestGroup) {
        assertEquals(
            expected = "day",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(0)?.valueInteger?.value
        )

        assertEquals(
            expected = "day",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(1)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "8".toInt(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.extension?.get(1)?.valueInteger?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/timing-daysOfCycle",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "action-1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#1111",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Gemcitabine 1250 mg/m² IV over 30 minutes on days 1 and 8",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "day",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "1".toInt(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.extension?.get(0)?.valueInteger?.value
        )

        assertEquals(
            expected = "http://hl7.org/fhir/StructureDefinition/timing-daysOfCycle",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.extension?.get(0)?.url
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "action-2",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "action-1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.actionId
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionRelationshipType.CONCURRENT_WITH_START,
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.relatedAction?.get(0)?.relationship
        )

        assertEquals(
            expected = "#2222",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "CARBOplatin AUC 5 IV over 30 minutes on Day 1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.textEquivalent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "cycle-definition-1",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "21-day cycle for 6 cycles",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "6".toInt(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.count?.value
        )

        assertEquals(
            expected = "21".toDouble(),
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.duration?.value
        )

        assertEquals(
            expected = "d",
            actual = data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.timingTiming?.repeat?.durationUnit
                ?.replace("\\n", " ")
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
            expected = "Practitioner/1",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-03-06T17:31:00Z",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "1111",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2222",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "PlanDefinition/KDN5",
            actual = data.definition?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "kdn5-example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "requestgroup-kdn5",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.PLAN,
            actual = data.intent
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = RequestStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Administer gemcitabine and carboplatin.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }

    @Test
    fun testRequestGroup02() {
        // Given
        val sourceJson = loadAsString("stu3/requestgroup-example.json")

        // When
        val data = parser.toFhir(RequestGroup::class, sourceJson)

        // Then
        assertRequestGroup02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertRequestGroup02Step01(data: RequestGroup) {
        assertEquals(
            expected = "Administer medication 1",
            actual = data.action?.get(0)?.action?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medication-action-1",
            actual = data.action?.get(0)?.action?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "#medicationrequest-1",
            actual = data.action?.get(0)?.action?.get(0)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "create",
            actual = data.action?.get(0)?.action?.get(0)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Administer medication 2",
            actual = data.action?.get(0)?.action?.get(1)?.description
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
            expected = "#medicationrequest-2",
            actual = data.action?.get(0)?.action?.get(1)?.resource?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "create",
            actual = data.action?.get(0)?.action?.get(1)?.type?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionCardinalityBehavior.SINGLE,
            actual = data.action?.get(0)?.cardinalityBehavior
        )

        assertEquals(
            expected = "Administer medications at the appropriate time",
            actual = data.action?.get(0)?.description
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionGroupingBehavior.LOGICAL_GROUP,
            actual = data.action?.get(0)?.groupingBehavior
        )

        assertEquals(
            expected = "1",
            actual = data.action?.get(0)?.label
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.action?.get(0)?.participant?.get(0)?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = ActionPrecheckBehavior.YES,
            actual = data.action?.get(0)?.precheckBehavior
        )

        assertEquals(
            expected = ActionRequiredBehavior.MUST,
            actual = data.action?.get(0)?.requiredBehavior
        )

        assertEquals(
            expected = ActionSelectionBehavior.ALL,
            actual = data.action?.get(0)?.selectionBehavior
        )

        assertEquals(
            expected = "Administer medication 1, followed an hour later by medication 2",
            actual = data.action?.get(0)?.textEquivalent
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-03-06T19:00:00Z",
            actual = data.action?.get(0)?.timingDateTime?.value.toString()
        )

        assertEquals(
            expected = "Administer Medications",
            actual = data.action?.get(0)?.title
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Practitioner/1",
            actual = data.author?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2017-03-06T17:31:00Z",
            actual = data.authoredOn?.value.toString()
        )

        assertEquals(
            expected = "medicationrequest-1",
            actual = data.contained?.get(0)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "medicationrequest-2",
            actual = data.contained?.get(1)?.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Encounter/example",
            actual = data.context?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/treatment-group",
            actual = data.groupIdentifier?.system
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "00001",
            actual = data.groupIdentifier?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "requestgroup-1",
            actual = data.identifier?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestIntent.PLAN,
            actual = data.intent
        )

        assertEquals(
            expected = "Additional notes about the request group",
            actual = data.note?.get(0)?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestPriority.ROUTINE,
            actual = data.priority
        )

        assertEquals(
            expected = "Treatment",
            actual = data.reasonCodeableConcept?.text
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = RequestStatus.DRAFT,
            actual = data.status
        )

        assertEquals(
            expected = "Patient/example",
            actual = data.subject?.reference
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "<div xmlns=\"http://www.w3.org/1999/xhtml\">Example RequestGroup illustrating related actions to administer medications in sequence with time delay.</div>",
            actual = data.text?.div
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = NarrativeStatus.GENERATED,
            actual = data.text?.status
        )
    }
}
