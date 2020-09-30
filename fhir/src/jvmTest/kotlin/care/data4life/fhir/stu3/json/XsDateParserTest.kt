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

import care.data4life.fhir.stu3.datetime.XsDate
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class XsDateParserTest {

    @Test
    fun `parse() SHOULD return a valid XsDate`() {
        assertEquals(
            XsDate(1000, null, null),
            XsDateParser.parse("1000")
        )
        assertEquals(
            XsDate(9999, null, null),
            XsDateParser.parse("9999")
        )
        assertEquals(
            XsDate(2015, 12, null),
            XsDateParser.parse("2015-12")
        )
        assertEquals(
            XsDate(2015, 1, null),
            XsDateParser.parse("2015-01")
        )
        assertEquals(
            XsDate(2015, 1, 1),
            XsDateParser.parse("2015-01-01")
        )
        assertEquals(
            XsDate(2015, 1, 31),
            XsDateParser.parse("2015-01-31")
        )

        // before Zero

        assertEquals(
            XsDate(-1000, null, null),
            XsDateParser.parse("-1000")
        )

        assertEquals(
            XsDate(-9999, null, null),
            XsDateParser.parse("-9999")
        )

        assertEquals(
            XsDate(-2015, 12, 5),
            XsDateParser.parse("-2015-12-05")
        )
    }


    @Test
    fun `parse() SHOULD throw exception WHEN invalid input data`() {
        assertFails { XsDateParser.parse("") }
        assertFails { XsDateParser.parse(" ") }
        assertFails { XsDateParser.parse("abc") }

        assertFails { XsDateParser.parse("999") }
        assertFails { XsDateParser.parse("-999") }
        assertFails { XsDateParser.parse("10000") }
        assertFails { XsDateParser.parse("-10000") }

        assertFails { XsDateParser.parse("2017-13") }
        assertFails { XsDateParser.parse("2017-00") }

        assertFails { XsDateParser.parse("2017-11-00") }
        assertFails { XsDateParser.parse("2017-11-32") }
        assertFails { XsDateParser.parse("2017-00-12") }
        assertFails { XsDateParser.parse("2017-11-00") }
    }

    @Test
    fun `format() SHOULD return well formed date string`() {
        assertEquals(
            "2015",
            XsDateParser.format(XsDate(2015, null, null))
        )
        assertEquals(
            "0001",
            XsDateParser.format(XsDate(1, null, null))
        )
        assertEquals(
            "2015-05",
            XsDateParser.format(XsDate(2015, 5, null))
        )
        assertEquals(
            "2015-11",
            XsDateParser.format(XsDate(2015, 11, null))
        )
        assertEquals(
            "2015-11-09",
            XsDateParser.format(XsDate(2015, 11, 9))
        )
        assertEquals(
            "2015-11-25",
            XsDateParser.format(XsDate(2015, 11, 25))
        )

        assertEquals(
            "-2015",
            XsDateParser.format(XsDate(-2015, null, null))
        )
        assertEquals(
            "-0001",
            XsDateParser.format(XsDate(-1, null, null))
        )
        assertEquals(
            "-2015-05",
            XsDateParser.format(XsDate(-2015, 5, null))
        )
        assertEquals(
            "-2015-11",
            XsDateParser.format(XsDate(-2015, 11, null))
        )
        assertEquals(
            "-2015-11-09",
            XsDateParser.format(XsDate(-2015, 11, 9))
        )
        assertEquals(
            "-2015-11-25",
            XsDateParser.format(XsDate(-2015, 11, 25))
        )
    }
}
