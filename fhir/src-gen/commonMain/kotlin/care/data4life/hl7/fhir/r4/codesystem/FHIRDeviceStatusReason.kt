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
 * Code System: FHIRDeviceStatusReason
 *
 * The availability status reason of the device.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/device-status-reason">FHIRDeviceStatusReason</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/device-status-reason">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class FHIRDeviceStatusReason {

    /**
     * The device is off.
     */
    @SerialName("online")
    ONLINE,

    /**
     * The device is paused.
     */
    @SerialName("paused")
    PAUSED,

    /**
     * The device is ready but not actively operating.
     */
    @SerialName("standby")
    STANDBY,

    /**
     * The device is offline.
     */
    @SerialName("offline")
    OFFLINE,

    /**
     * The device is not ready.
     */
    @SerialName("not-ready")
    NOT_READY,

    /**
     * The device transducer is disconnected.
     */
    @SerialName("transduc-discon")
    TRANSDUC_DISCON,

    /**
     * The device hardware is disconnected.
     */
    @SerialName("hw-discon")
    HW_DISCON,

    /**
     * The device is off.
     */
    @SerialName("off")
    OFF,
}
