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
class XsTimeZoneTest(
    private var hourOffset: Int,
    private var minuteOffset: Int,
    private var positiveOffset: Boolean,
    private var zeroOffsetGMT: Boolean,

    private var shouldFail: Boolean
) {

    @Test
    fun test() {
        if (shouldFail) {
            assertFails {
                XsTimeZone(hourOffset, minuteOffset, positiveOffset, zeroOffsetGMT)
            }
            return
        }

        val timeZone = XsTimeZone(hourOffset, minuteOffset, positiveOffset, zeroOffsetGMT)

        assertEquals(hourOffset, timeZone.hourOffset)
        assertEquals(minuteOffset, timeZone.minuteOffset)
        assertEquals(positiveOffset, timeZone.positiveOffset)
        assertEquals(zeroOffsetGMT, timeZone.zeroOffsetGMT)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: hourOffset: \"{0}\" minuteOffset: \"{1}\" positiveOffset: \"{2}\" zeroOffsetGMT: \"{3}\" shouldFail: \"{4}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // hourOffset
                arrayOf(0, 0, true, true, false),
                arrayOf(23, 0, true, true, false),

                // minuteOffset
                arrayOf(0, 0, true, true, false),
                arrayOf(0, 59, true, true, false),

                // positiveOffset - negative
                arrayOf(2, 0, false, true, false),

                // zeroOffsetGMT
                arrayOf(0, 0, true, false, false),


                // error cases
                // hourOffset
                arrayOf(-1, 0, true, true, true),
                arrayOf(24, 0, true, true, true),

                // minuteOffset
                arrayOf(0, -1, true, true, true),
                arrayOf(0, 60, true, true, true),

                // positiveOffset

                // zeroOffsetGMT
                arrayOf(0, 0, false, false, true),
                arrayOf(1, 0, true, false, true),
                arrayOf(0, 1, true, false, true),
            )
        }
    }
}
