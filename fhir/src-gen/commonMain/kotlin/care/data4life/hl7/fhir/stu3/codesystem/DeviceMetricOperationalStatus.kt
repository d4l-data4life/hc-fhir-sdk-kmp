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
 * Code System: DeviceMetricOperationalStatus
 *
 * Describes the operational status of the DeviceMetric.
 *
 * @see <a href="http://hl7.org/fhir/metric-operational-status">DeviceMetricOperationalStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/metric-operational-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DeviceMetricOperationalStatus {

    /**
     * The DeviceMetric is operating and will generate DeviceObservations.
     */
    @SerialName("on")
    ON,

    /**
     * The DeviceMetric is not operating.
     */
    @SerialName("off")
    OFF,

    /**
     * The DeviceMetric is operating, but will not generate any DeviceObservations.
     */
    @SerialName("standby")
    STANDBY,

    /**
     * The DeviceMetric was entered in error.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,
}
