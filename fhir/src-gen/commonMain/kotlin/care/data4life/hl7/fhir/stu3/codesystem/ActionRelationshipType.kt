/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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
 * Defines the types of relationships between actions
 *
 * @see <a href="http://hl7.org/fhir/action-relationship-type">ActionRelationshipType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/action-relationship-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class ActionRelationshipType {
    /**
     * The action must be performed before the start of the related action
     */
    @SerialName("before-start")
    BEFORE_START,

    /**
     * The action must be performed before the related action
     */
    @SerialName("before")
    BEFORE,

    /**
     * The action must be performed before the end of the related action
     */
    @SerialName("before-end")
    BEFORE_END,

    /**
     * The action must be performed concurrent with the start of the related action
     */
    @SerialName("concurrent-with-start")
    CONCURRENT_WITH_START,

    /**
     * The action must be performed concurrent with the related action
     */
    @SerialName("concurrent")
    CONCURRENT,

    /**
     * The action must be performed concurrent with the end of the related action
     */
    @SerialName("concurrent-with-end")
    CONCURRENT_WITH_END,

    /**
     * The action must be performed after the start of the related action
     */
    @SerialName("after-start")
    AFTER_START,

    /**
     * The action must be performed after the related action
     */
    @SerialName("after")
    AFTER,

    /**
     * The action must be performed after the end of the related action
     */
    @SerialName("after-end")
    AFTER_END
}
