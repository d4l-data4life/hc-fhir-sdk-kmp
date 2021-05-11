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

package care.data4life.hl7.fhir.common.datetime

import care.data4life.hl7.fhir.stu3.json.XsDateParser
import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable

/**
 * XsDate
 *
 * A date, or partial date (e.g. just year or year + month) as used in human communication. There is no time zone. Dates SHALL be valid dates
 *
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?
 *
 * FHIR representation: union of xs:date, xs:gYearMonth, xs:gYear
 *
 * @see http://hl7.org/fhir/STU3/datatypes.html#date
 *
 * Constructor
 *
 * @param year          Year as YYYY, allowed range -9999 to 9999
 * @param month         Month of the year, allowed range 1 to 12
 * @param day           Day of the month, allowed range 1 to 31 but has to be a valid date (leap year)
 */
@Serializable
data class XsDate(
    val year: Int,
    val month: Int? = null,
    val day: Int? = null
) {
    init {
        require(year >= -9999) { "year should be >= -9999" }
        require(year <= 9999) { "month should be <= 9999" }

        if (month != null) {
            require(month >= 1) { "month should be >= 1" }
            require(month <= 12) { "month should be <= 12" }
        }

        if (day != null) {
            require(month != null) { "if day is set month is required" }

            @Suppress("USELESS_IS_CHECK")
            require(LocalDate(year, month, day) is LocalDate) { "date should be valid" }
        }
    }

    override fun toString(): String {
        return XsDateParser.format(this)
    }
}
