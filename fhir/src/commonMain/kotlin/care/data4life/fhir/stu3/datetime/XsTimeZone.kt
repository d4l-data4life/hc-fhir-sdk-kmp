/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.datetime

import kotlinx.serialization.Serializable

/**
 * XsTimeZone
 *
 * Represented as an offset from UTC as defined in ISO 8601.
 *
 * Specify an offset from the UTC time by adding a positive or negative time
 *
 * Defaults to 00:00
 *
 * +06:00
 * -06:00
 */
@Serializable
data class XsTimeZone(
    val hourOffset: Int = 0,
    val minuteOffset: Int = 0,
    val positiveOffset: Boolean = true,
    val zeroOffsetGMT: Boolean = true
) {
    init {
        require(hourOffset >= 0) { "hour should be >= 0" }
        require(hourOffset <= 23) { "hour should be <= 23" }

        require(minuteOffset >= 0) { "minute should be >= 0" }
        require(minuteOffset <= 59) { "minute should be <= 59" }

        if (!zeroOffsetGMT) {
            require(hourOffset == 0) { "if zeroOffsetGMT is provided, hourOffset must to be 0" }
            require(minuteOffset == 0) { "if zeroOffsetGMT is provided, minuteOffset must to be 0" }
            require(positiveOffset) { "if zeroOffsetGMT is false, positiveOffset must to be true" }
        }
    }
}
