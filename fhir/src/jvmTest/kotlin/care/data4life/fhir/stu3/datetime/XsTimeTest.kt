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
class XsTimeTest(
    private var hour: Int,
    private var minute: Int,
    private var second: Int?,
    private var fractionOfSecond: Int?,
    private var fractionPadding: Int?,

    private var shouldFail: Boolean
) {

    @Test
    fun test() {
        if (shouldFail) {
            assertFails {
                XsTime(hour, minute, second, fractionOfSecond, fractionPadding)
            }
            return
        }

        val time = XsTime(hour, minute, second, fractionOfSecond, fractionPadding)

        assertEquals(hour, time.hour)
        assertEquals(minute, time.minute)
        assertEquals(second, time.second)
        assertEquals(fractionOfSecond, time.fractionOfSecond)
        assertEquals(fractionPadding, time.fractionPadding)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: hour: \"{0}\" minute: \"{1}\" second: \"{2}\" fractionOfSecond: \"{3}\"  fractionPadding: \"{4}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // hour
                arrayOf(0, 0, null, null, null, false),
                arrayOf(23, 0, null, null, null, false),

                // minute
                arrayOf(12, 0, null, null, null, false),
                arrayOf(12, 59, null, null, null, false),

                // second
                arrayOf(12, 0, 0, null, null, false),
                arrayOf(12, 0, 59, null, null, false),

                // fraction
                arrayOf(12, 0, 59, 123, null, false),
                arrayOf(12, 0, 59, 123, 2, false),
                arrayOf(12, 0, 59, 1, 4, false),


                // error cases
                // hour
                arrayOf(-1, 0, null, null, null, true),
                arrayOf(24, 0, null, null, null, true),

                // minute
                arrayOf(12, -1, null, null, null, true),
                arrayOf(12, 60, null, null, null, true),

                // second
                arrayOf(12, 0, -1, null, null, true),
                arrayOf(12, 0, 60, null, null, true),

                // fraction
                arrayOf(12, 0, 59, -123, null, true),
                arrayOf(12, 0, 59, 123, -2, true),
                arrayOf(12, 0, 59, null, 2, true),
            )
        }
    }
}
