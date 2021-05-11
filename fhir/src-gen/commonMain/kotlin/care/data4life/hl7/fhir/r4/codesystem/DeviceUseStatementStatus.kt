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
 * A coded concept indicating the current status of the Device Usage.
 *
 * @see <a href="http://hl7.org/fhir/device-statement-status">DeviceUseStatementStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/device-statement-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class DeviceUseStatementStatus {
    /**
     * The device is still being used.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * The device is no longer being used.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The statement was recorded incorrectly.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The device may be used at some time in the future.
     */
    @SerialName("intended")
    INTENDED,

    /**
     * Actions implied by the statement have been permanently halted, before all of them occurred.
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * Actions implied by the statement have been temporarily halted, but are expected to continue later. May also be called "suspended".
     */
    @SerialName("on-hold")
    ON_HOLD
}
