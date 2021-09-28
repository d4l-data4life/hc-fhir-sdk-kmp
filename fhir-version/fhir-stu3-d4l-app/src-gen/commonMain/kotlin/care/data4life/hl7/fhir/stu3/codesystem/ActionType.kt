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
 * Code System: ActionType
 *
 * The type of action to be performed
 *
 * @see <a href="http://hl7.org/fhir/action-type">ActionType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/action-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class ActionType {

    /**
     * The action is to create a new resource
     */
    @SerialName("create")
    CREATE,

    /**
     * The action is to update an existing resource
     */
    @SerialName("update")
    UPDATE,

    /**
     * The action is to remove an existing resource
     */
    @SerialName("remove")
    REMOVE,

    /**
     * The action is to fire a specific event
     */
    @SerialName("fire-event")
    FIRE_EVENT,
}
