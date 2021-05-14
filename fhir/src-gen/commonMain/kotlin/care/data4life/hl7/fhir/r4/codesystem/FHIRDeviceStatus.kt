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
 * Code System: FHIRDeviceStatus
 *
 * The availability status of the device.
 *
 * @see <a href="http://hl7.org/fhir/device-status">FHIRDeviceStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/device-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class FHIRDeviceStatus {

    /**
     * The device is available for use. Note: For *implanted devices* this means that
     * the device is implanted in the patient.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * The device is no longer available for use (e.g. lost, expired, damaged). Note:
     * For *implanted devices* this means that the device has been removed from the
     * patient.
     */
    @SerialName("inactive")
    INACTIVE,

    /**
     * The device was entered in error and voided.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * The status of the device has not been determined.
     */
    @SerialName("unknown")
    UNKNOWN,
}
