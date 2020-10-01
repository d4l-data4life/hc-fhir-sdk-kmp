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
 * XsTime
 *
 * An xs:time implementation for FHIR Time
 *
 * Regex: ([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?
 *
 * @see http://hl7.org/fhir/STU3/datatypes.html#time
 *
 * HIR representation: xs:time
 *
 * Constructor
 *
 * @param hour             Hour of day, allowed range from 0 to 23
 * @param minute           Minute of the hour, allowed range from 0 to 59
 * @param second           Second of the minute, allowed range form 0 to 59
 * @param fractionOfSecond Fraction of the second
 * @param fractionPadding  Left padding of the fraction for leading zeros, e.g. 00001 = padding of 4
 */
@Serializable
data class XsTime(
    val hour: Int,
    val minute: Int,
    val second: Int?,
    val fractionOfSecond: Int?,
    val fractionPadding: Int?
) {
    init {
        require(hour >= 0) { "hour should be >= 0" }
        require(hour <= 23) { "hour should be <= 23" }

        require(minute >= 0) { "minute should be >= 0" }
        require(minute <= 59) { "minute should be <= 59" }

        if (second != null) {
            require(second >= 0) { "second should be >= 0" }
            require(second <= 59) { "second should be <= 59" }
        }

        if (fractionOfSecond != null) {
            require(fractionOfSecond >= 0) { "fractionOfSecond should be >=0" }
        }

        if (fractionPadding != null) {
            requireNotNull(fractionOfSecond) { "if fractionPadding is provided, fractionOfSecond is needed too"}
            require(fractionPadding >= 0) { "fractionPadding should be >=0" }
        }
    }
}
