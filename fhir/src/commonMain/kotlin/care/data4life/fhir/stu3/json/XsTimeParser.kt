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
import care.data4life.fhir.stu3.datetime.XsTime

/**
 * XsTimeParser
 *
 * Parses XsTime according the FHIR specification derived from Time
 *
 * @see http://hl7.org/fhir/STU3/datatypes.html#time
 */
object XsTimeParser : StringParser<XsTime> {

    private val TIME_FORMAT =
        "([01][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])(\\.[0-9]+)?".toRegex()
    private val FRACTION_ZEROES = "(\\.[0]+)?.*".toRegex()


    override fun parse(input: String): XsTime {
        require(TIME_FORMAT.matches(input))

        val match = TIME_FORMAT.matchEntire(input)
        val (hour, minute, second, fraction) = match!!.destructured
        val (leadingZeroes) = FRACTION_ZEROES.matchEntire(fraction)!!.destructured

        return XsTime(
            hour.toInt(),
            minute.toInt(),
            second.toIntOrNull(),
            fraction.replace(".", "").toIntOrNull(),
            if (leadingZeroes.isEmpty()) null else leadingZeroes.length - 1
        )
    }

    override fun format(input: XsTime): String = XsDateTimeFormatter.formatTime(input)

}
