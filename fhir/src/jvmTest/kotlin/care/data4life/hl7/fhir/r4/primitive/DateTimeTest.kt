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

package care.data4life.hl7.fhir.r4.primitive

import care.data4life.hl7.fhir.common.datetime.XsDate
import care.data4life.hl7.fhir.common.datetime.XsDateTime
import care.data4life.hl7.fhir.common.datetime.XsTime
import care.data4life.hl7.fhir.common.datetime.XsTimeZone
import care.data4life.hl7.fhir.r4.model.Extension
import kotlin.test.assertEquals
import kotlin.test.assertFails
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class DateTimeTest(
    private var values: Map<String, Any?>,
    private var id: String?,
    private var extension: List<Extension>?,

    private var shouldFail: kotlin.Boolean
) {

    @Test
    fun testParameterized() {
        if (shouldFail) {
            assertFails {
                DateTime(
                    XsDateTime(
                        values["date"] as XsDate,
                        values["time"] as XsTime?,
                        values["timezone"] as XsTimeZone?
                    ),
                    id,
                    extension
                )
            }
            return
        }

        val result = DateTime(
            XsDateTime(
                values["date"] as XsDate,
                values["time"] as XsTime?,
                values["timezone"] as XsTimeZone?
            ),
            id,
            extension
        )

        assertEquals(values["date"], result.value.date)
        assertEquals(values["time"], result.value.time)
        assertEquals(values["timezone"], result.value.timeZone)

        assertEquals(id, result.id)
        assertEquals(extension, result.extension)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: values: \"{0}\" id: \"{1}\" extension: \"{2}\" shouldFail: \"{3}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // valid
                arrayOf(mapOf("date" to XsDate(1000)), null, null, false),
                arrayOf(mapOf("date" to XsDate(9999)), null, null, false),
                arrayOf(mapOf("date" to XsDate(-9999)), null, null, false),

                arrayOf(mapOf("date" to XsDate(2021, 1)), null, null, false),
                arrayOf(mapOf("date" to XsDate(2021, 12)), null, null, false),

                arrayOf(mapOf("date" to XsDate(2021, 1, 1)), null, null, false),
                arrayOf(mapOf("date" to XsDate(2021, 1, 31)), null, null, false),

                arrayOf(
                    mapOf(
                        "date" to XsDate(2021, 1, 31),
                        "time" to XsTime(21, 32, 52, .1234567),
                        "timezone" to XsTimeZone(zeroOffsetGMT = false)
                    ),
                    null,
                    null,
                    false
                ),

                arrayOf(
                    mapOf(
                        "date" to XsDate(2021, 1, 31),
                        "time" to XsTime(21, 32, 52, .1234567),
                        "timezone" to XsTimeZone(1, 0, false)
                    ),
                    null,
                    null,
                    false
                ),

                arrayOf(
                    mapOf(
                        "date" to XsDate(2021, 1, 31),
                        "time" to XsTime(21, 32, 52, .1234567),
                        "timezone" to XsTimeZone(1)
                    ),
                    null,
                    null,
                    false
                ),

                // fails
                arrayOf(
                    mapOf(
                        "date" to XsDate(2021, 1, 31),
                        "time" to null,
                        "timezone" to XsTimeZone(1)
                    ),
                    null,
                    null,
                    true
                ),
                arrayOf(
                    mapOf(
                        "date" to XsDate(2021, 1, 31),
                        "time" to XsTime(21, 32, 52, .1234567),
                        "timezone" to null
                    ),
                    null,
                    null,
                    true
                )
            )
        }
    }
}
