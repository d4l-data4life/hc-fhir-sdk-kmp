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
import care.data4life.hl7.fhir.r4.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.r4.codesystem.SubscriptionChannelType
import care.data4life.hl7.fhir.r4.codesystem.SubscriptionStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * SubscriptionTest.java
 *
 * Server push subscription criteria
 *
 * The subscription resource is used to define a push-based subscription from a server to another
 * system. Once a subscription is registered with the server, the server checks every resource that is
 * created or updated, and if the resource matches the given criteria, it sends a message on the
 * defined "channel" so that another system can take an appropriate action.
 *
 * Generated from FHIR 4.0.1-9346c8cc45)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SubscriptionTest {

    val parser = FhirR4Parser()

    @Test
    fun testSubscription01() {
        // Given
        val sourceJson = loadAsString("r4/subscription-example-error.json")

        // When
        val data = parser.toFhir(Subscription::class, sourceJson)

        // Then
        assertEquals(
            "https://biliwatch.com/customers/mount-auburn-miu/on-result",
            data.channel?.endpoint
        )
        assertEquals(
            "Authorization: Bearer secret-token-abc-123",
            data.channel?.header?.get(0)
        )
        assertEquals(
            "application/fhir+json",
            data.channel?.payload
        )
        assertEquals(
            SubscriptionChannelType.REST_HOOK,
            data.channel?.type
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.system
        )
        assertEquals(
            "ext 4123",
            data.contact?.get(0)?.value
        )
        assertEquals(
            "Observation?code=http://loinc.org|1975-2",
            data.criteria
        )
        assertEquals(
            "2021-01-01T00:00:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "Socket Error 10060 - can't connect to host",
            data.error
        )
        assertEquals(
            "example-error",
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
            "Monitor new neonatal function",
            data.reason
        )
        assertEquals(
            SubscriptionStatus.ERROR,
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

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    @Test
    fun testSubscription02() {
        // Given
        val sourceJson = loadAsString("r4/subscription-example.json")

        // When
        val data = parser.toFhir(Subscription::class, sourceJson)

        // Then
        assertEquals(
            "https://biliwatch.com/customers/mount-auburn-miu/on-result",
            data.channel?.endpoint
        )
        assertEquals(
            "Authorization: Bearer secret-token-abc-123",
            data.channel?.header?.get(0)
        )
        assertEquals(
            "application/fhir+json",
            data.channel?.payload
        )
        assertEquals(
            SubscriptionChannelType.REST_HOOK,
            data.channel?.type
        )
        assertEquals(
            ContactPointSystem.PHONE,
            data.contact?.get(0)?.system
        )
        assertEquals(
            "ext 4123",
            data.contact?.get(0)?.value
        )
        assertEquals(
            "Observation?code=http://loinc.org|1975-2",
            data.criteria
        )
        assertEquals(
            "2021-01-01T00:00:00Z",
            data.end?.value.toString()
        )
        assertEquals(
            "example",
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
            "Monitor new neonatal function",
            data.reason
        )
        assertEquals(
            SubscriptionStatus.REQUESTED,
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

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }
}
