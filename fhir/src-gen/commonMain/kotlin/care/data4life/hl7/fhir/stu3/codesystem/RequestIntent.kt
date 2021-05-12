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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Codes indicating the degree of authority/intentionality associated with a request
 *
 * @see <a href="http://hl7.org/fhir/request-intent">RequestIntent</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/request-intent">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class RequestIntent {

    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act
     */
    @SerialName("proposal")
    PROPOSAL,

    /**
     * The request represents an intension to ensure something occurs without providing an authorization for others to act
     */
    @SerialName("plan")
    PLAN,

    /**
     * The request represents a request/demand and authorization for action
     */
    @SerialName("order")
    ORDER,

    /**
     * The request represents an original authorization for action
     */
    @SerialName("original-order")
    ORIGINAL_ORDER,

    /**
     * The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization
     */
    @SerialName("reflex-order")
    REFLEX_ORDER,

    /**
     * The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order
     */
    @SerialName("filler-order")
    FILLER_ORDER,

    /**
     * An order created in fulfillment of a broader order that represents the authorization for a single activity occurrence.  E.g. The administration of a single dose of a drug.
     */
    @SerialName("instance-order")
    INSTANCE_ORDER,

    /**
     * The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or other constraints among a set of requests.

Refer to [[[RequestGroup]]] for additional information on how this status is used
     */
    @SerialName("option")
    OPTION
}
