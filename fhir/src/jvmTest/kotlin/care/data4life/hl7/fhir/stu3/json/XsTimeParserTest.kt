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

import care.data4life.hl7.fhir.common.datetime.XsTime
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class XsTimeParserTest {

    @Test
    fun `parse() SHOULD return a valid XsTime`() {
        assertEquals(
            XsTime(21, 32, 52, null),
            XsTimeParser.parse("21:32:52")
        )

        assertEquals(
            XsTime(21, 32, 52, .12679),
            XsTimeParser.parse("21:32:52.12679")
        )

        assertEquals(
            XsTime(21, 32, 52, .000000001),
            XsTimeParser.parse("21:32:52.000000001")
        )

        assertEquals(
            XsTime(21, 32, 52, .999999999),
            XsTimeParser.parse("21:32:52.999999999")
        )
    }

    @Test
    fun `parse() SHOULD throw exception WHEN invalid input data`() {
        assertFails { XsTimeParser.parse("") }
        assertFails { XsTimeParser.parse(" ") }
        assertFails { XsTimeParser.parse("abc") }

        // all the parts must be specified
        assertFails { XsTimeParser.parse("18") }
        assertFails { XsTimeParser.parse("21:32") }

        // the hour part is out of range
        assertFails { XsTimeParser.parse("25:25:10") }

        // the minute part is out of range
        assertFails { XsTimeParser.parse("21:79:10") }

        // the second part is out of range
        assertFails { XsTimeParser.parse("21:39:72") }

        // negative input
        assertFails { XsTimeParser.parse("-10:00:00") }

        // all the digits must be supplied)
        assertFails { XsTimeParser.parse("1:20:10") }

        // no time zone allowed
        assertFails { XsTimeParser.parse("21:32:52+02:00") }
        assertFails { XsTimeParser.parse("19:32:52Z") }
    }

    @Test
    fun `format() SHOULD return well formed time string`() {
        assertEquals(
            "00:00:00",
            XsTimeParser.format(XsTime(0, 0, null, null))
        )
        assertEquals(
            "12:00:00",
            XsTimeParser.format(XsTime(12, 0, null, null))
        )
        assertEquals(
            "00:12:00",
            XsTimeParser.format(XsTime(0, 12, null, null))
        )
        assertEquals(
            "12:12:00",
            XsTimeParser.format(XsTime(12, 12, null, null))
        )
        assertEquals(
            "12:12:12",
            XsTimeParser.format(XsTime(12, 12, 12, null))
        )
        assertEquals(
            "01:02:03",
            XsTimeParser.format(XsTime(1, 2, 3, null))
        )
        assertEquals(
            "12:12:12.12345",
            XsTimeParser.format(XsTime(12, 12, 12, .12345))
        )
        assertEquals(
            "12:12:12.00001",
            XsTimeParser.format(XsTime(12, 12, 12, .00001))
        )
    }
}
