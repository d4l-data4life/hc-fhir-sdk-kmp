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

package care.data4life.fhir.stu3.datetime

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import kotlin.test.assertFails

@RunWith(value = Parameterized::class)
class XsDateTimeTest(
    private var date: XsDate,
    private var time: XsTime?,
    private var timeZone: XsTimeZone?,

    private var shouldFail: Boolean
) {

    @Test
    fun test() {
        if (shouldFail) {
            assertFails {
                XsDateTime(date, time, timeZone)
            }
            return
        }

        val dateTime = XsDateTime(date, time, timeZone)

        assertEquals(date, dateTime.date)
        assertEquals(time, dateTime.time)
        assertEquals(timeZone, dateTime.timeZone)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: date: \"{0}\" time: \"{1}\" timeZone: \"{2}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // date
                arrayOf(XsDate(2018,5,12), null, null, false),

                // time & timeZone
                arrayOf(
                    XsDate(2018,5,12),
                    XsTime(11,14, null, null, null),
                    XsTimeZone(0, 0),
                    false
                ),


                // error cases
                // time missing
                arrayOf(
                    XsDate(2018,5,12),
                    null,
                    XsTimeZone(0, 0),
                    true
                ),

                // timeZone missing
                arrayOf(
                    XsDate(2018,5,12),
                    XsTime(11,14, null, null, null),
                    null,
                    true
                ),
            )
        }
    }
}
