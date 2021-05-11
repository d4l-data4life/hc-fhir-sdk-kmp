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
 * The type of name the device is referred by.
 *
 * @see <a href="http://hl7.org/fhir/device-nametype">DeviceNameType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/device-nametype">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class DeviceNameType {
    /**
     * UDI Label name.
     */
    @SerialName("udi-label-name")
    UDI_LABEL_NAME,

    /**
     * User Friendly name.
     */
    @SerialName("user-friendly-name")
    USER_FRIENDLY_NAME,

    /**
     * Patient Reported name.
     */
    @SerialName("patient-reported-name")
    PATIENT_REPORTED_NAME,

    /**
     * Manufacturer name.
     */
    @SerialName("manufacturer-name")
    MANUFACTURER_NAME,

    /**
     * Model name.
     */
    @SerialName("model-name")
    MODEL_NAME,

    /**
     * other.
     */
    @SerialName("other")
    OTHER
}
