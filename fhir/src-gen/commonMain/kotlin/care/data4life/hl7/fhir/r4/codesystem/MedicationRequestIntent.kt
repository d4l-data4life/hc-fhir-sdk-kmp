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

package care.data4life.hl7.fhir.r4.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MedicationRequest Intent Codes
 *
 * @see <a href="http://hl7.org/fhir/CodeSystem/medicationrequest-intent">MedicationRequestIntent</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medicationrequest-intent">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class MedicationRequestIntent {

    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act
     */
    @SerialName("proposal")
    PROPOSAL,

    /**
     * The request represents an intention to ensure something occurs without providing an authorization for others to act.
     */
    @SerialName("plan")
    PLAN,

    /**
     * The request represents a request/demand and authorization for action
     */
    @SerialName("order")
    ORDER,

    /**
     * The request represents the original authorization for the medication request.
     */
    @SerialName("original-order")
    ORIGINAL_ORDER,

    /**
     * The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization..
     */
    @SerialName("reflex-order")
    REFLEX_ORDER,

    /**
     * The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.
     */
    @SerialName("filler-order")
    FILLER_ORDER,

    /**
     * The request represents an instance for the particular order, for example a medication administration record.
     */
    @SerialName("instance-order")
    INSTANCE_ORDER,

    /**
     * The request represents a component or option for a RequestGroup that establishes timing, conditionality and/or  other constraints among a set of requests.
     */
    @SerialName("option")
    OPTION
}
