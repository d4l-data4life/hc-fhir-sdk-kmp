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

package care.data4life.fhir.stu3.json

import care.data4life.fhir.parser.json.StringParser
import care.data4life.fhir.stu3.datetime.XsDate

/**
 * XsDateParser
 *
 * Parses XsDate according the FHIR specification derived from Date
 *
 * @see [Date]](http://hl7.org/fhir/STU3/datatypes.html#date)
 */
object XsDateParser : StringParser<XsDate> {

    private val DATE_FORMAT = "-?([0-9]{4})(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?".toRegex()

    override fun parse(input: String): XsDate {
        require(DATE_FORMAT.matches(input))

        val beforeZero = input.startsWith("-")
        val match = DATE_FORMAT.matchEntire(input)
        val (year, _, month, _, day) = match!!.destructured

        return XsDate(
            if (beforeZero) year.toInt().unaryMinus() else year.toInt(),
            month.toIntOrNull(),
            day.toIntOrNull()
        )
    }

    override fun format(input: XsDate): String = XsDateTimeFormatter.formatDate(input)

}


