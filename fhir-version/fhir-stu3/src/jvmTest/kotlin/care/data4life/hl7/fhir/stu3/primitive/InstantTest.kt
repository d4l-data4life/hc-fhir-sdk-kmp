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

package care.data4life.hl7.fhir.stu3.primitive

import care.data4life.hl7.fhir.common.datetime.XsDate
import care.data4life.hl7.fhir.common.datetime.XsDateTime
import care.data4life.hl7.fhir.common.datetime.XsTime
import care.data4life.hl7.fhir.common.datetime.XsTimeZone
import care.data4life.hl7.fhir.stu3.model.Extension
import kotlin.test.assertEquals
import kotlin.test.assertFails
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class InstantTest(
    private var values: Map<String, Any?>,
    private var id: String?,
    private var extension: List<Extension>?,

    private var shouldFail: kotlin.Boolean
) {

    @Test
    fun testParameterized() {
        if (shouldFail) {
            assertFails {
                Instant(
                    XsDateTime(
                        XsDate(
                            values["year"] as Int,
                            values["month"] as Int?,
                            values["day"] as Int?
                        ),
                        values["time"] as XsTime?,
                        values["timezone"] as XsTimeZone?
                    ),
                    id,
                    extension
                )
            }
            return
        }

        val result = Instant(
            XsDateTime(
                XsDate(
                    values["year"] as Int,
                    values["month"] as Int?,
                    values["day"] as Int?
                ),
                values["time"] as XsTime?,
                values["timezone"] as XsTimeZone?
            ),
            id,
            extension
        )

        assertEquals(values["year"], result.value.date.year)
        assertEquals(values["month"], result.value.date.month)
        assertEquals(values["day"], result.value.date.day)
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
                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 1,
                        "day" to 31,
                        "time" to XsTime(21, 32, 52),
                        "timezone" to XsTimeZone(zeroOffsetGMT = false)
                    ),
                    null,
                    null,
                    false
                ),
                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 1,
                        "day" to 31,
                        "time" to XsTime(21, 32, 52, .1234567),
                        "timezone" to XsTimeZone(zeroOffsetGMT = false)
                    ),
                    null,
                    null,
                    false
                ),

                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 1,
                        "day" to 31,
                        "time" to XsTime(21, 32, 52, .1234567),
                        "timezone" to XsTimeZone(1, 0, false)
                    ),
                    null,
                    null,
                    false
                ),

                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 1,
                        "day" to 31,
                        "time" to XsTime(21, 32, 52, .1234567),
                        "timezone" to XsTimeZone(1)
                    ),
                    null,
                    null,
                    false
                ),

                // fails
                // only date
                // date incomplete
                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to null,
                        "day" to 12
                    ),
                    null,
                    null,
                    true
                ),
                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 5,
                        "day" to null
                    ),
                    null,
                    null,
                    true
                ),

                // time not set
                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 5,
                        "day" to 12
                    ),
                    null,
                    null,
                    true
                ),
                // time incomplete
                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 5,
                        "day" to 12,
                        "time" to XsTime(21, 32, null)
                    ),
                    null,
                    null,
                    true
                ),

                // timezone missing
                arrayOf(
                    mapOf(
                        "year" to 2021,
                        "month" to 1,
                        "day" to 31,
                        "time" to XsTime(21, 32, 52),
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
