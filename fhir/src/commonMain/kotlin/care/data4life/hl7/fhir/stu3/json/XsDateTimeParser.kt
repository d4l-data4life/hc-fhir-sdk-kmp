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

package care.data4life.hl7.fhir.stu3.json

import care.data4life.hl7.fhir.common.datetime.XsDateTime
import care.data4life.hl7.fhir.parser.json.StringParser

object XsDateTimeParser : StringParser<XsDateTime> {

    private val DATE_TIME_FORMAT_REGEX =
        "-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?".toRegex()
    private val DATE_TIME_FORMAT_DESTRUCT = "-?(\\d{4}(?:-\\d{2}(?:-\\d{2})?)?)(?:T)?(\\d{2}:\\d{2}:\\d{2}(?:\\.\\d*)?)?(Z|[\\+,\\-]\\d{2}:\\d{2})?".toRegex()

    override fun parse(input: String): XsDateTime {
        require(DATE_TIME_FORMAT_REGEX.matches(input))

        val match = DATE_TIME_FORMAT_DESTRUCT.matchEntire(input)

        val (date, time, timeZone) = match!!.destructured

        val xsDate = XsDateParser.parse(date ?: input)
        val xsTime = if (time.isNotEmpty()) XsTimeParser.parse(time) else null
        val xsTimeZone = if (timeZone.isNotEmpty()) XsTimeZoneParser.parse(timeZone) else null
        return XsDateTime(xsDate, xsTime, xsTimeZone)
    }

    override fun format(input: XsDateTime): String = XsDateTimeFormatter.formatDateTime(input)
}
