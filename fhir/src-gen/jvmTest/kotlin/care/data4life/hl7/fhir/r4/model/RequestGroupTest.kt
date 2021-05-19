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
import care.data4life.hl7.fhir.r4.codesystem.ActionGroupingBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionPrecheckBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionRelationshipType
import care.data4life.hl7.fhir.r4.codesystem.ActionRequiredBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionSelectionBehavior
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * RequestGroupTest.java
 *
 * A group of related requests
 *
 * A group of related requests that can be used to capture intended activities that have inter-
 * dependencies such as "give this medication after that one".
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class RequestGroupTest {

    val parser = FhirR4Parser()

    @Test
    fun testRequestGroup01() {
        // Given
        val sourceJson = loadAsString("r4/requestgroup-kdn5-example.json")

        // When
        val data = parser.toFhir(RequestGroup::class, sourceJson)

        // Then
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
            "#1111",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.resource?.reference
        )
        assertEquals(
            "Gemcitabine 1250 mg/m² IV over 30 minutes on days 1 and 8",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.textEquivalent
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
            "#2222",
            data.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(0)?.action?.get(1)?.resource?.reference
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
            "Practitioner/1",
            data.author?.reference
        )
        assertEquals(
            "2017-03-06T17:31:00Z",
            data.authoredOn?.value.toString()
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
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "kdn5-example",
            data.id
        )
        assertEquals(
            "requestgroup-kdn5",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            "PlanDefinition/KDN5",
            data.instantiatesCanonical?.get(0)
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
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
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            RequestStatus.DRAFT,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Administer gemcitabine and carboplatin.</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testRequestGroup02() {
        // Given
        val sourceJson = loadAsString("r4/requestgroup-example.json")

        // When
        val data = parser.toFhir(RequestGroup::class, sourceJson)

        // Then
        assertEquals(
            "Administer medication 1",
            data.action?.get(0)?.action?.get(0)?.description
        )
        assertEquals(
            "medication-action-1",
            data.action?.get(0)?.action?.get(0)?.id
        )
        assertEquals(
            "#medicationrequest-1",
            data.action?.get(0)?.action?.get(0)?.resource?.reference
        )
        assertEquals(
            "create",
            data.action?.get(0)?.action?.get(0)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            "Administer medication 2",
            data.action?.get(0)?.action?.get(1)?.description
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
            "#medicationrequest-2",
            data.action?.get(0)?.action?.get(1)?.resource?.reference
        )
        assertEquals(
            "create",
            data.action?.get(0)?.action?.get(1)?.type?.coding?.get(0)?.code
        )
        assertEquals(
            ActionCardinalityBehavior.SINGLE,
            data.action?.get(0)?.cardinalityBehavior
        )
        assertEquals(
            "Administer medications at the appropriate time",
            data.action?.get(0)?.description
        )
        assertEquals(
            ActionGroupingBehavior.LOGICAL_GROUP,
            data.action?.get(0)?.groupingBehavior
        )
        assertEquals(
            "Practitioner/1",
            data.action?.get(0)?.participant?.get(0)?.reference
        )
        assertEquals(
            ActionPrecheckBehavior.YES,
            data.action?.get(0)?.precheckBehavior
        )
        assertEquals(
            "1",
            data.action?.get(0)?.prefix
        )
        assertEquals(
            ActionRequiredBehavior.MUST,
            data.action?.get(0)?.requiredBehavior
        )
        assertEquals(
            ActionSelectionBehavior.ALL,
            data.action?.get(0)?.selectionBehavior
        )
        assertEquals(
            "Administer medication 1, followed an hour later by medication 2",
            data.action?.get(0)?.textEquivalent
        )
        assertEquals(
            "2017-03-06T19:00:00Z",
            data.action?.get(0)?.timingDateTime?.value.toString()
        )
        assertEquals(
            "Administer Medications",
            data.action?.get(0)?.title
        )
        assertEquals(
            "Practitioner/1",
            data.author?.reference
        )
        assertEquals(
            "2017-03-06T17:31:00Z",
            data.authoredOn?.value.toString()
        )
        assertEquals(
            "medicationrequest-1",
            data.contained?.get(0)?.id
        )
        assertEquals(
            "medicationrequest-2",
            data.contained?.get(1)?.id
        )
        assertEquals(
            "Encounter/example",
            data.encounter?.reference
        )
        assertEquals(
            "http://example.org/treatment-group",
            data.groupIdentifier?.system
        )
        assertEquals(
            "00001",
            data.groupIdentifier?.value
        )
        assertEquals(
            "example",
            data.id
        )
        assertEquals(
            "requestgroup-1",
            data.identifier?.get(0)?.value
        )
        assertEquals(
            RequestIntent.PLAN,
            data.intent
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
            "Additional notes about the request group",
            data.note?.get(0)?.text
        )
        assertEquals(
            RequestPriority.ROUTINE,
            data.priority
        )
        assertEquals(
            "Treatment",
            data.reasonCode?.get(0)?.text
        )
        assertEquals(
            RequestStatus.DRAFT,
            data.status
        )
        assertEquals(
            "Patient/example",
            data.subject?.reference
        )
        assertEquals(
            "<div xmlns=\"http://www.w3.org/1999/xhtml\">Example RequestGroup illustrating related actions to administer medications in sequence with time delay.</div>",
            data.text?.div
        )
        assertEquals(
            NarrativeStatus.GENERATED,
            data.text?.status
        )

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
