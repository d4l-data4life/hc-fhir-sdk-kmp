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

package care.data4life.hl7.fhir.common.datetime.parser

import care.data4life.hl7.fhir.common.datetime.XsTimeZone
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class XsTimeZoneParserTest {

    @Test
    fun `parse() SHOULD return a valid XsTimeZone`() {
        assertEquals(
            XsTimeZone(0, 0),
            XsTimeZoneParser.parse("+00:00")
        )
        assertEquals(
            XsTimeZone(0, 0, positiveOffset = false),
            XsTimeZoneParser.parse("-00:00")
        )
        assertEquals(
            XsTimeZone(0, 0, zeroOffsetGMT = false),
            XsTimeZoneParser.parse("Z")
        )

        assertEquals(
            XsTimeZone(23, 0),
            XsTimeZoneParser.parse("+23:00")
        )
        assertEquals(
            XsTimeZone(23, 0, positiveOffset = false),
            XsTimeZoneParser.parse("-23:00")
        )
        assertEquals(
            XsTimeZone(23, 59),
            XsTimeZoneParser.parse("+23:59")
        )
        assertEquals(
            XsTimeZone(23, 59, positiveOffset = false),
            XsTimeZoneParser.parse("-23:59")
        )
    }

    @Test
    fun `parse() SHOULD throw exception WHEN invalid input data`() {
        assertFails { XsTimeZoneParser.parse("") }
        assertFails { XsTimeZoneParser.parse(" ") }
        assertFails { XsTimeZoneParser.parse("z") }
        assertFails { XsTimeZoneParser.parse("abc") }
        assertFails { XsTimeZoneParser.parse("1") }
        assertFails { XsTimeZoneParser.parse("12") }
        assertFails { XsTimeZoneParser.parse("1234") }
        assertFails { XsTimeZoneParser.parse("1234:00") }
        assertFails { XsTimeZoneParser.parse("00:1200") }
        assertFails { XsTimeZoneParser.parse("000:1200") }

        assertFails { XsTimeZoneParser.parse("+12") }
        assertFails { XsTimeZoneParser.parse("+12:") }
        assertFails { XsTimeZoneParser.parse("+123:") }
        assertFails { XsTimeZoneParser.parse("+12:0") }
        assertFails { XsTimeZoneParser.parse("+12:6") }
        assertFails { XsTimeZoneParser.parse("+12:60") }
        assertFails { XsTimeZoneParser.parse("+12:000") }
        assertFails { XsTimeZoneParser.parse("+24:00") }

        assertFails { XsTimeZoneParser.parse("-12") }
        assertFails { XsTimeZoneParser.parse("-12") }
        assertFails { XsTimeZoneParser.parse("-12:") }
        assertFails { XsTimeZoneParser.parse("-123:") }
        assertFails { XsTimeZoneParser.parse("-12:0") }
        assertFails { XsTimeZoneParser.parse("-12:6") }
        assertFails { XsTimeZoneParser.parse("-12:60") }
        assertFails { XsTimeZoneParser.parse("-12:000") }
        assertFails { XsTimeZoneParser.parse("-24:00") }
    }

    @Test
    fun `format() SHOULD return well formed date time string`() {
        assertEquals(
            "Z",
            XsTimeZoneParser.format(XsTimeZone(0, 0, zeroOffsetGMT = false))
        )
        assertEquals(
            "+00:00",
            XsTimeZoneParser.format(XsTimeZone(0, 0))
        )
        assertEquals(
            "+23:59",
            XsTimeZoneParser.format(XsTimeZone(23, 59))
        )

        assertEquals(
            "-00:00",
            XsTimeZoneParser.format(XsTimeZone(0, 0, positiveOffset = false))
        )
        assertEquals(
            "-23:59",
            XsTimeZoneParser.format(XsTimeZone(23, 59, positiveOffset = false))
        )
    }
}
