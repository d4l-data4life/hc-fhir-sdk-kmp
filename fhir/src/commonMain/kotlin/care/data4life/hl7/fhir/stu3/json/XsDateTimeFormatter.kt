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

import care.data4life.hl7.fhir.stu3.datetime.XsDate
import care.data4life.hl7.fhir.stu3.datetime.XsDateTime
import care.data4life.hl7.fhir.stu3.datetime.XsTime
import care.data4life.hl7.fhir.stu3.datetime.XsTimeZone

object XsDateTimeFormatter {

    private const val DATE_FORMAT_FULL = "%Y-%M-%D"
    private const val DATE_FORMAT_YEAR_MONTH = "%Y-%M"
    private const val DATE_FORMAT_YEAR = "%Y"
    private const val DATE_TIME_FORMAT = "%Y-%M-%DT%h:%m:%s%z"
    private const val TIME_FORMAT = "%h:%m:%s"


    fun formatDate(date: XsDate): kotlin.String {
        return if (date.month != null && date.day != null) {
            doFormat(
                DATE_FORMAT_FULL,
                date.year,
                date.month,
                date.day,
                null,
                null,
                null,
                null,
                null
            )
        } else if (date.month != null) {
            doFormat(
                DATE_FORMAT_YEAR_MONTH,
                date.year,
                date.month,
                null,
                null,
                null,
                null,
                null,
                null
            )
        } else {
            doFormat(DATE_FORMAT_YEAR, date.year, null, null, null, null, null, null, null)
        }
    }

    fun formatDateTime(dateTime: XsDateTime): String {
        return if (dateTime.time != null) {
            doFormat(
                DATE_TIME_FORMAT,
                dateTime.date.year,
                dateTime.date.month,
                dateTime.date.day,
                dateTime.time.hour,
                dateTime.time.minute,
                dateTime.time.second,
                dateTime.time.fraction,
                dateTime.timeZone
            )
        } else {
            formatDate(dateTime.date)
        }
    }

    fun formatTime(time: XsTime): String {
        return doFormat(
            TIME_FORMAT,
            null,
            null,
            null,
            time.hour,
            time.minute,
            time.second,
            time.fraction,
            null
        )
    }

    private fun doFormat(
        format: String,
        year: Int?,
        month: Int?,
        day: Int?,
        hour: Int?,
        minute: Int?,
        second: Int?,
        fractionOfSecond: Double?,
        timeZone: XsTimeZone?
    ): String {

        var fidx = 0
        val flen = format.length
        val buffer = StringBuilder()

        while (fidx < flen) {
            val fch = format[fidx++]

            if (fch != '%') {  // not a meta character
                buffer.append(fch)
                continue
            }

            // seen meta character. we don't do error check against the format
            when (format[fidx++]) {
                'Y' // year
                -> formatYear(year, buffer)

                'M' // month
                -> formatMonth(month, buffer)

                'D' // day
                -> formatDay(day, buffer)

                'h' // hour
                -> formatHour(hour, buffer)

                'm' // minutes
                -> formatMinute(minute, buffer)

                's' // parse seconds.
                -> formatSecond(second, fractionOfSecond, buffer)

                'z' // time zone
                -> formatTimeZone(timeZone, buffer)

                else ->
                    // illegal meta character. impossible.
                    throw IllegalArgumentException()
            }
        }

        return buffer.toString()
    }


    private fun formatYear(year: Int?, buf: StringBuilder) {
        var s: String
        s = when {
            year == null -> {
                ""
            }
            year <= 0 -> { // negative value
                "${(0 - year)}"
            }
            else -> {
                // positive value
                "$year"
            }
        }

        while (s.length < 4) {
            s = "0$s"
        }

        if (year != null && year <= 0) {
            s = "-$s"
        }

        buf.append(s)
    }

    private fun formatMonth(month: Int?, buf: StringBuilder) {
        formatTwoDigits(month, buf)
    }

    private fun formatDay(day: Int?, buf: StringBuilder) {
        formatTwoDigits(day, buf)
    }

    private fun formatHour(hour: Int?, buf: StringBuilder) {
        formatTwoDigits(hour, buf)
    }

    private fun formatMinute(minute: Int?, buffer: StringBuilder) {
        formatTwoDigits(minute, buffer)
    }

    private fun formatSecond(
        second: Int?,
        fractionOfSecond: Double?,
        buffer: StringBuilder
    ) {
        formatTwoDigits(second, buffer)
        if (fractionOfSecond != null && fractionOfSecond > 0.0) {
            formatFraction(fractionOfSecond, buffer)
        }
    }

    private fun formatFraction(
        fraction: Double?,
        buffer: StringBuilder
    ){
        buffer.append(".")
        val fractionString = fraction.toString()
        if (fractionString.contains("E")) {
            formatFractionExponent(fractionString, buffer)
        } else buffer.append(fractionString.substringAfter("."))
    }

    private fun formatFractionExponent(
        fractionString: String,
        buffer: StringBuilder
    ) {
        val fraction = fractionString.substringBefore("E")
        val padding = fractionString.substringAfter("-").toInt()
        for (i in 1 until padding) {
            buffer.append("0")
        }
        if (fraction.contains(".")) {
            val split = fraction.split(".")
            buffer.append(split[0] + (if (split[1] != "0") split[1] else ""))
        } else buffer.append(fraction)
    }

    /**
     * formats time zone specifier.
     */
    private fun formatTimeZone(timeZone: XsTimeZone?, buffer: StringBuilder) {
        if (timeZone == null) return
        else buffer.append(XsTimeZoneParser.format(timeZone))
    }

    /**
     * formats Integer into two-character-wide string.
     */
    private fun formatTwoDigits(n: Int?, buffer: StringBuilder) {
        if (n == null) {
            buffer.append("00")
        } else {
            // n is always non-negative.
            if (n < 10) buffer.append('0')
            buffer.append(n)
        }
    }
}
