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
import care.data4life.hl7.fhir.stu3.codesystem.NarrativeStatus
import care.data4life.hl7.fhir.stu3.codesystem.SubscriptionChannelType
import care.data4life.hl7.fhir.stu3.codesystem.SubscriptionStatus
import care.data4life.hl7.fhir.test.util.FileHelper.loadAsString
import org.junit.Test
import org.skyscreamer.jsonassert.JSONAssert
import kotlin.test.assertEquals

/**
 * SubscriptionTest.java
 *
 * A server push subscription criteria
 *
 * The subscription resource is used to define a push based subscription from a server to another
 * system. Once a subscription is registered with the server, the server checks every resource that is
 * created or updated, and if the resource matches the given criteria, it sends a message on the
 * defined "channel" so that another system is able to take an appropriate action.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class SubscriptionFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testSubscription01() {
        // Given
        val sourceJson = loadAsString("stu3/subscription-example-error.json")

        // When
        val data = parser.toFhir(Subscription::class, sourceJson)

        // Then
        assertSubscription01Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubscription01Step01(data: Subscription) {

        assertEquals(
            expected = "https://biliwatch.com/customers/mount-auburn-miu/on-result",
            actual = data.channel?.endpoint
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Authorization: Bearer secret-token-abc-123",
            actual = data.channel?.header?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/fhir+json",
            actual = data.channel?.payload
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SubscriptionChannelType.REST_HOOK,
            actual = data.channel?.type
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.system
        )

        assertEquals(
            expected = "ext 4123",
            actual = data.contact?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation?code=http://loinc.org|1975-2",
            actual = data.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2021-01-01T00:00:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "Socket Error 10060 - can't connect to host",
            actual = data.error
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "example-error",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Monitor new neonatal function",
            actual = data.reason
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SubscriptionStatus.ERROR,
            actual = data.status
        )

        assertEquals(
            expected = "bili-done",
            actual = data.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/cs/internal",
            actual = data.tag?.get(0)?.system
                ?.replace("\\n", " ")
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
    }

    @Test
    fun testSubscription02() {
        // Given
        val sourceJson = loadAsString("stu3/subscription-example.json")

        // When
        val data = parser.toFhir(Subscription::class, sourceJson)

        // Then
        assertSubscription02Step01(data)

        // When generating JSON from model
        val json = parser.fromFhir(data)

        // Then JSON needs to match original JSON file
        JSONAssert.assertEquals(sourceJson, json, true)
    }

    private fun assertSubscription02Step01(data: Subscription) {

        assertEquals(
            expected = "https://biliwatch.com/customers/mount-auburn-miu/on-result",
            actual = data.channel?.endpoint
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Authorization: Bearer secret-token-abc-123",
            actual = data.channel?.header?.get(0)
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "application/fhir+json",
            actual = data.channel?.payload
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SubscriptionChannelType.REST_HOOK,
            actual = data.channel?.type
        )

        assertEquals(
            expected = ContactPointSystem.PHONE,
            actual = data.contact?.get(0)?.system
        )

        assertEquals(
            expected = "ext 4123",
            actual = data.contact?.get(0)?.value
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Observation?code=http://loinc.org|1975-2",
            actual = data.criteria
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "2021-01-01T00:00:00Z",
            actual = data.end?.value.toString()
        )

        assertEquals(
            expected = "example",
            actual = data.id
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "Monitor new neonatal function",
            actual = data.reason
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = SubscriptionStatus.REQUESTED,
            actual = data.status
        )

        assertEquals(
            expected = "bili-done",
            actual = data.tag?.get(0)?.code
                ?.replace("\\n", " ")
        )

        assertEquals(
            expected = "http://example.org/fhir/cs/internal",
            actual = data.tag?.get(0)?.system
                ?.replace("\\n", " ")
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
    }
}
