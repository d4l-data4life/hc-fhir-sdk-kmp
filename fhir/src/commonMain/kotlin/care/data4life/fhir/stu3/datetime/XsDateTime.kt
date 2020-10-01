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
 * XsDateTime
 *
 * A date, date-time or partial date (e.g. just year or year + month) as used in human
 * communication. If hours and minutes are specified, a time zone SHALL be populated. Seconds must
 * be provided due to schema type constraints but may be zero-filled and may be ignored. Dates SHALL
 * be valid dates. The time "24:00" is not allowed.
 *
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?(Z|(\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?
 *
 * FHIR representation: union of xs:dateTime, xs:date, xs:gYearMonth, xs:gYear
 *
 * @see <a href="http://hl7.org/fhir/STU3/datatypes.html#datetime">DateTime</a>
 *
 * Constructor
 *
 * @param date          Date as XsDate
 * @param time          Time as XsTime
 * @param timeZone      TimeZone as XsTimeZone
 */
@Serializable
data class XsDateTime(
    val date: XsDate,
    val time: XsTime?,
    val timeZone: XsTimeZone?
) {
    init {
        if (time != null || timeZone != null) {
            requireNotNull(time) { "if timezone is provided, time is needed too" }
            requireNotNull(timeZone) { "if time is provided, timezone is needed too" }
        }
    }
}
