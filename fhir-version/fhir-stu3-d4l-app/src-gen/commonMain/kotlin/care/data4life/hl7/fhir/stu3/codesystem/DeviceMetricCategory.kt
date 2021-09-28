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
 * Code System: DeviceMetricCategory
 *
 * Describes the category of the metric.
 *
 * @see <a href="http://hl7.org/fhir/metric-category">DeviceMetricCategory</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/metric-category">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DeviceMetricCategory {

    /**
     * DeviceObservations generated for this DeviceMetric are measured.
     */
    @SerialName("measurement")
    MEASUREMENT,

    /**
     * DeviceObservations generated for this DeviceMetric is a setting that will
     * influence the behavior of the Device.
     */
    @SerialName("setting")
    SETTING,

    /**
     * DeviceObservations generated for this DeviceMetric are calculated.
     */
    @SerialName("calculation")
    CALCULATION,

    /**
     * The category of this DeviceMetric is unspecified.
     */
    @SerialName("unspecified")
    UNSPECIFIED,
}
