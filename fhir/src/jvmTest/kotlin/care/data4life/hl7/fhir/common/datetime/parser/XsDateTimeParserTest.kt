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

import care.data4life.hl7.fhir.common.datetime.XsDate
import care.data4life.hl7.fhir.common.datetime.XsDateTime
import care.data4life.hl7.fhir.common.datetime.XsTime
import care.data4life.hl7.fhir.common.datetime.XsTimeZone
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class XsDateTimeParserTest {

    @Test
    fun `parse() SHOULD return a valid XsDateTime`() {
        assertEquals(
            XsDateTime(XsDate(1000, null, null), null, null),
            XsDateTimeParser.parse("1000")
        )
        assertEquals(
            XsDateTime(XsDate(9999, null, null), null, null),
            XsDateTimeParser.parse("9999")
        )
        assertEquals(
            XsDateTime(XsDate(2015, 12, null), null, null),
            XsDateTimeParser.parse("2015-12")
        )
        assertEquals(
            XsDateTime(XsDate(2015, 1, null), null, null),
            XsDateTimeParser.parse("2015-01")
        )
        assertEquals(
            XsDateTime(XsDate(2015, 1, 1), null, null),
            XsDateTimeParser.parse("2015-01-01")
        )
        assertEquals(
            XsDateTime(XsDate(2015, 1, 31), null, null),
            XsDateTimeParser.parse("2015-01-31")
        )
        assertEquals(
            XsDateTime(
                XsDate(2015, 1, 31),
                XsTime(21, 32, 52, null),
                XsTimeZone(zeroOffsetGMT = false)
            ),
            XsDateTimeParser.parse("2015-01-31T21:32:52Z")
        )
        assertEquals(
            XsDateTime(
                XsDate(2015, 1, 31),
                XsTime(21, 32, 52, .12679),
                XsTimeZone(zeroOffsetGMT = false)
            ),
            XsDateTimeParser.parse("2015-01-31T21:32:52.12679Z")
        )
        assertEquals(
            XsDateTime(
                XsDate(2015, 1, 31),
                XsTime(21, 32, 52, .000000001),
                XsTimeZone(zeroOffsetGMT = false)
            ),
            XsDateTimeParser.parse("2015-01-31T21:32:52.000000001Z")
        )
        assertEquals(
            XsDateTime(
                XsDate(2015, 1, 31),
                XsTime(21, 32, 52, .999999999),
                XsTimeZone(zeroOffsetGMT = false)
            ),
            XsDateTimeParser.parse("2015-01-31T21:32:52.999999999Z")
        )
        assertEquals(
            XsDateTime(
                XsDate(2015, 1, 31),
                XsTime(21, 32, 52, null),
                XsTimeZone(1)
            ),
            XsDateTimeParser.parse("2015-01-31T21:32:52+01:00")
        )
        assertEquals(
            XsDateTime(
                XsDate(2015, 1, 31),
                XsTime(21, 32, 52, null),
                XsTimeZone(1, 0, false)
            ),
            XsDateTimeParser.parse("2015-01-31T21:32:52-01:00")
        )
        assertEquals(
            XsDateTime(
                XsDate(2015, 1, 31),
                XsTime(21, 32, 52, .12679),
                XsTimeZone(1)
            ),
            XsDateTimeParser.parse("2015-01-31T21:32:52.12679+01:00")
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
        assertFails { XsDateParser.parse("-1") }

        assertFails { XsDateParser.parse("2017-13") }
        assertFails { XsDateParser.parse("2017-00") }

        assertFails { XsDateParser.parse("2017-11-00") }
        assertFails { XsDateParser.parse("2017-11-32") }
        assertFails { XsDateParser.parse("2017-00-12") }
        assertFails { XsDateParser.parse("2017-11-00") }

        assertFails { XsDateParser.parse("2017-11-00T01:12:31") }
    }

    @Test
    fun `format() SHOULD return well formed date time string`() {
        // Date check
        assertEquals(
            "2015",
            XsDateTimeParser.format(XsDateTime(XsDate(2015, null, null), null, null))
        )
        assertEquals(
            "2015-05",
            XsDateTimeParser.format(XsDateTime(XsDate(2015, 5, null), null, null))
        )
        assertEquals(
            "2015-11",
            XsDateTimeParser.format(XsDateTime(XsDate(2015, 11, null), null, null))
        )
        assertEquals(
            "2015-11-09",
            XsDateTimeParser.format(XsDateTime(XsDate(2015, 11, 9), null, null))
        )
        assertEquals(
            "2015-11-25",
            XsDateTimeParser.format(XsDateTime(XsDate(2015, 11, 25), null, null))
        )

        // Date, Time and Timezone check
        assertEquals(
            "2015-11-09T00:00:00Z",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(0, 0, null, null),
                    XsTimeZone(0, 0, zeroOffsetGMT = false)
                )
            )
        )
        assertEquals(
            "2015-11-09T12:00:00+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 0, null, null),
                    XsTimeZone(1, 0)
                )
            )
        )
        assertEquals(
            "2015-11-09T00:12:00+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(0, 12, null, null),
                    XsTimeZone(1, 0)
                )
            )
        )
        assertEquals(
            "2015-11-09T12:12:00+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, null, null),
                    XsTimeZone(1, 0)
                )
            )
        )
        assertEquals(
            "2015-11-09T12:12:12+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, null),
                    XsTimeZone(1, 0)
                )
            )
        )
        assertEquals(
            "2015-11-09T01:02:03+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(1, 2, 3, null),
                    XsTimeZone(1, 0)
                )
            )
        )

        assertEquals(
            "2015-11-09T12:12:12.12345+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, .12345),
                    XsTimeZone(1, 0)
                )
            )
        )
        assertEquals(
            "2015-11-09T12:12:12.00001+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, .00001),
                    XsTimeZone(1, 0)
                )
            )
        )
        assertEquals(
            "2015-11-09T12:12:12.00006+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, .00006),
                    XsTimeZone(1, 0)
                )
            )
        )
        assertEquals(
            "2015-11-09T12:12:12.00026+01:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, .00026),
                    XsTimeZone(1, 0)
                )
            )
        )

        assertEquals(
            "2015-11-09T12:12:12-05:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, null),
                    XsTimeZone(5, 0, false)
                )
            )
        )

        assertEquals(
            "2015-11-09T12:12:12Z",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, null),
                    XsTimeZone(0, 0, zeroOffsetGMT = false)
                )
            )
        )
        assertEquals(
            "2015-11-09T12:12:12+00:00",
            XsDateTimeParser.format(
                XsDateTime(
                    XsDate(2015, 11, 9),
                    XsTime(12, 12, 12, null),
                    XsTimeZone(0, 0)
                )
            )
        )
    }
}
