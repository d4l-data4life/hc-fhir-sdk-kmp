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

import care.data4life.hl7.fhir.r4.codesystem.SubscriptionChannelType
import care.data4life.hl7.fhir.r4.codesystem.SubscriptionStatus
import care.data4life.hl7.fhir.r4.primitive.Instant
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirSubscription
 *
 * The subscription resource is used to define a push-based subscription from a server to another
 * system. Once a subscription is registered with the server, the server checks every resource that is
 * created or updated, and if the resource matches the given criteria, it sends a message on the
 * defined "channel" so that another system can take an appropriate action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Subscription">Subscription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Subscription)
 */
interface FhirSubscription : FhirDomainResource {

    /**
     * The status of the subscription, which marks the server state for managing the
     * subscription.
     */
    val status: SubscriptionStatus

    /**
     * Contact details for source (e.g. troubleshooting).
     */
    val contact: kotlin.collections.List<ContactPoint>?

    /**
     * When to automatically delete the subscription.
     */
    val end: Instant?

    /**
     * Description of why this subscription was created.
     */
    val reason: String

    /**
     * Rule for server push.
     */
    val criteria: String

    /**
     * Latest error note.
     */
    val error: String?

    /**
     * The channel on which to report matches to the criteria.
     */
    val channel: SubscriptionChannel
}

/**
 * Subscription
 *
 * The subscription resource is used to define a push-based subscription from a server to another
 * system. Once a subscription is registered with the server, the server checks every resource that is
 * created or updated, and if the resource matches the given criteria, it sends a message on the
 * defined "channel" so that another system can take an appropriate action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Subscription">Subscription</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Subscription)
 */
@Serializable
@SerialName("Subscription")
data class Subscription(

    @SerialName("status")
    override val status: SubscriptionStatus,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("end")
    override val end: Instant? = null,

    @SerialName("reason")
    override val reason: String,

    @SerialName("criteria")
    override val criteria: String,

    @SerialName("error")
    override val error: String? = null,

    @SerialName("channel")
    override val channel: SubscriptionChannel,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirSubscription {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Subscription"
    }
}

/**
 * FhirSubscriptionChannel
 *
 * Details where to send notifications when resources are received that meet the criteria.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Subscription">SubscriptionChannel</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Subscription)
 */
interface FhirSubscriptionChannel : FhirBackboneElement {

    /**
     * The type of channel to send notifications on.
     */
    val type: SubscriptionChannelType

    /**
     * Where the channel points to.
     */
    val endpoint: String?

    /**
     * MIME type to send, or omit for no payload.
     */
    val payload: String?

    /**
     * Usage depends on the channel type.
     */
    val header: kotlin.collections.List<String>?
}

/**
 * SubscriptionChannel
 *
 * Details where to send notifications when resources are received that meet the criteria.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Subscription">SubscriptionChannel</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Subscription)
 */
@Serializable
@SerialName("SubscriptionChannel")
data class SubscriptionChannel(

    @SerialName("type")
    override val type: SubscriptionChannelType,

    @SerialName("endpoint")
    override val endpoint: String? = null,

    @SerialName("payload")
    override val payload: String? = null,

    @SerialName("header")
    override val header: kotlin.collections.List<String>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubscriptionChannel {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubscriptionChannel"
    }
}
