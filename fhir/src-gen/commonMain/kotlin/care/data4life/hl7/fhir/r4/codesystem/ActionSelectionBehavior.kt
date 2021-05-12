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
 * Defines selection behavior of a group.
 *
 * @see <a href="http://hl7.org/fhir/action-selection-behavior">ActionSelectionBehavior</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/action-selection-behavior">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ActionSelectionBehavior {

    /**
     * Any number of the actions in the group may be chosen, from zero to all.
     */
    @SerialName("any")
    ANY,

    /**
     * All the actions in the group must be selected as a single unit.
     */
    @SerialName("all")
    ALL,

    /**
     * All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, or none may be selected.
     */
    @SerialName("all-or-none")
    ALL_OR_NONE,

    /**
     * The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of the actions in the group.
     */
    @SerialName("exactly-one")
    EXACTLY_ONE,

    /**
     * The end user may choose zero or at most one of the actions in the group.
     */
    @SerialName("at-most-one")
    AT_MOST_ONE,

    /**
     * The end user must choose a minimum of one, and as many additional as desired.
     */
    @SerialName("one-or-more")
    ONE_OR_MORE
}
