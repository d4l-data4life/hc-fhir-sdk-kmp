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
 * Codes representing the current status of the device - on, off, suspended, etc.
 *
 * @see <a href="http://hl7.org/fhir/operational-status">DeviceComponentOperationalStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/operational-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DeviceComponentOperationalStatus {
    /**
     * The device is off.
     */
    @SerialName("off")
    OFF,

    /**
     * The device is fully operational.
     */
    @SerialName("on")
    ON,

    /**
     * The device is not ready.
     */
    @SerialName("not-ready")
    NOT_READY,

    /**
     * The device is ready but not actively operating.
     */
    @SerialName("standby")
    STANDBY,

    /**
     * The device transducer is diconnected.
     */
    @SerialName("transduc-discon")
    TRANSDUC_DISCON,

    /**
     * The device hardware is disconnected.
     */
    @SerialName("hw-discon")
    HW_DISCON,

    /**
     * The device was entered in error.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR
}
