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
class XsDateTest(
    private var year: Int,
    private var month: Int?,
    private var day: Int?,

    private var isCorrect: Boolean
) {

    @Test
    fun test() {
        if (!isCorrect) {
            assertFails {
                XsDate(year, month, day)
            }
            return
        }

        val date = XsDate(year, month, day)

        assertEquals(year, date.year)
        assertEquals(month, date.month)
        assertEquals(day, date.day)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: year: \"{0}\" month: \"{1}\" day: \"{2}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // year
                arrayOf(-9999, null, null, true),
                arrayOf(9999, null, null, true),

                // month
                arrayOf(2015, 1, null, true),
                arrayOf(2015, 12, null, true),

                // day
                arrayOf(2015, 1, 1, true),
                arrayOf(2015, 1, 31, true),


                // error cases
                // year
                arrayOf(10000, null, null, false),
                arrayOf(-10000, null, null, false),

                // month
                arrayOf(2020, 0, null, false),
                arrayOf(2020, -1, null, false),
                arrayOf(2020, 13, null, false),

                // day
                arrayOf(2020, 1, 0, false),
                arrayOf(2020, 1, -1, false),
                arrayOf(2020, 1, 32, false),
            )
        }
    }
}
