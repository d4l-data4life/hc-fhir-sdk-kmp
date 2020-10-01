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
import care.data4life.fhir.stu3.datetime.XsTimeZone

/**
 * XsTimeZoneParser
 *
 * Parses XsTimeZone according the FHIR spec for Date
 *
 * @see http://hl7.org/fhir/STU3/datatypes.html#date
 */
object XsTimeZoneParser : StringParser<XsTimeZone> {

    private val TIME_ZONE = "(Z|[+-](2[0-3]|[01]?[0-9])(?::([0-5][0-9])))".toRegex()


    override fun parse(input: String): XsTimeZone {
        require(TIME_ZONE.matches(input))

        if ("Z" == input) return XsTimeZone(0, 0, zeroOffsetGMT = false)

        val positiveOffset = input.startsWith("+")
        val (_, hour, minute) = TIME_ZONE.matchEntire(input)!!.destructured

        return XsTimeZone(hour.toInt(), minute.toInt(), positiveOffset)
    }

    override fun format(input: XsTimeZone): String {
        if (input.hourOffset == 0 && input.minuteOffset == 0 && !input.zeroOffsetGMT) return "Z"

        return "${if (input.positiveOffset) "+" else "-"}${input.hourOffset.padStartZero(2)}:${input.minuteOffset.padStartZero(2)}"
    }
}
