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
 * Code System: ActionRequiredBehavior
 *
 * Defines expectations around whether an action or action group is required.
 *
 * @see <a href="http://hl7.org/fhir/action-required-behavior">ActionRequiredBehavior</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/action-required-behavior">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ActionRequiredBehavior {

    /**
     * An action with this behavior must be included in the actions processed by the
     * end user; the end user SHALL NOT choose not to include this action.
     */
    @SerialName("must")
    MUST,

    /**
     * An action with this behavior may be included in the set of actions processed by
     * the end user.
     */
    @SerialName("could")
    COULD,

    /**
     * An action with this behavior must be included in the set of actions processed by
     * the end user, unless the end user provides documentation as to why the action
     * was not included.
     */
    @SerialName("must-unless-documented")
    MUST_UNLESS_DOCUMENTED,
}
