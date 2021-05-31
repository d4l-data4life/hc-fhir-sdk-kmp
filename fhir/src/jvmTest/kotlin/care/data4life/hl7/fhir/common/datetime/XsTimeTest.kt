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

package care.data4life.hl7.fhir.common.datetime

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
    private var fraction: Double?,
    private var stringFormat: String,

    private var shouldFail: Boolean
) {

    @Test
    fun test() {
        if (shouldFail) {
            assertFails {
                XsTime(hour, minute, second, fraction)
            }
            return
        }

        val time = XsTime(hour, minute, second, fraction)

        assertEquals(hour, time.hour)
        assertEquals(minute, time.minute)
        assertEquals(second, time.second)
        assertEquals(fraction, time.fraction)
        assertEquals(stringFormat, time.toString())
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: hour: \"{0}\" minute: \"{1}\" second: \"{2}\" fractionOfSecond: \"{3}\" stringFormat: \"{4}\" shouldFail: \"{5}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // hour
                arrayOf(0, 0, null, null, "00:00:00", false),
                arrayOf(23, 0, null, null, "23:00:00", false),

                // minute
                arrayOf(12, 0, null, null, "12:00:00", false),
                arrayOf(12, 59, null, null, "12:59:00", false),

                // second
                arrayOf(12, 0, 0, null, "12:00:00", false),
                arrayOf(12, 0, 59, null, "12:00:59", false),

                // fraction
                arrayOf(12, 0, 59, .123, "12:00:59.123", false),
                arrayOf(12, 0, 59, .00123, "12:00:59.00123", false),
                arrayOf(12, 0, 59, .0001, "12:00:59.0001", false),

                // error cases
                // hour
                arrayOf(-1, 0, null, null, "", true),
                arrayOf(24, 0, null, null, "", true),

                // minute
                arrayOf(12, -1, null, null, "", true),
                arrayOf(12, 60, null, null, "", true),

                // second
                arrayOf(12, 0, -1, null, "", true),
                arrayOf(12, 0, 60, null, "", true),

                // fraction
                arrayOf(12, 0, 59, -.123, "", true),
            )
        }
    }
}
