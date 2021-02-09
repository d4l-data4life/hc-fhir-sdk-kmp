/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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

import care.data4life.hl7.fhir.stu3.datetime.XsDate
import care.data4life.hl7.fhir.stu3.model.Extension
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import kotlin.test.assertFails

@RunWith(value = Parameterized::class)
class DateTest(
    private var values: Map<String, Any?>,
    private var id: String?,
    private var extension: List<Extension>?,

    private var shouldFail: kotlin.Boolean,
) {

    @Test
    fun testParameterized() {
        if (shouldFail) {
            assertFails {
                Date(
                    XsDate(
                        values["year"] as Int,
                        values["month"] as Int?,
                        values["day"] as Int?,
                    ), id, extension
                )
            }
            return
        }

        val result = Date(
            XsDate(
                values["year"] as Int,
                values["month"] as Int?,
                values["day"] as Int?,
            ), id, extension
        )

        assertEquals(values["year"], result.value.year)
        assertEquals(values["month"], result.value.month)
        assertEquals(values["day"], result.value.day)

        assertEquals(id, result.id)
        assertEquals(extension, result.extension)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: values: \"{0}\" id: \"{1}\" extension: \"{2}\" shouldFail: \"{3}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // valid
                arrayOf(mapOf("year" to 1000), null, null, false),
                arrayOf(mapOf("year" to 9999), null, null, false),

                arrayOf(mapOf("year" to 2021, "month" to 1), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 12), null, null, false),

                arrayOf(mapOf("year" to 2021, "month" to 12, "day" to 1), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 12, "day" to 31), null, null, false),

                // day of month
                arrayOf(mapOf("year" to 2021, "month" to 1, "day" to 31), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 2, "day" to 28), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 3, "day" to 31), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 4, "day" to 30), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 5, "day" to 31), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 6, "day" to 30), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 7, "day" to 31), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 8, "day" to 31), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 9, "day" to 30), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 10, "day" to 31), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 11, "day" to 30), null, null, false),
                arrayOf(mapOf("year" to 2021, "month" to 12, "day" to 31), null, null, false),


                // leap year
                arrayOf(mapOf("year" to 2016, "month" to 2, "day" to 29), null, null, false),
                arrayOf(mapOf("year" to 2020, "month" to 2, "day" to 29), null, null, false),
                arrayOf(mapOf("year" to 2024, "month" to 2, "day" to 29), null, null, false),
                // leap year not applied every 100 years and again every 400
                arrayOf(mapOf("year" to 1600, "month" to 2, "day" to 29), null, null, false),
                arrayOf(mapOf("year" to 2000, "month" to 2, "day" to 29), null, null, false),
                arrayOf(mapOf("year" to 2400, "month" to 2, "day" to 29), null, null, false),

                // negative year
                arrayOf(mapOf("year" to -9999), null, null, false),
                arrayOf(mapOf("year" to -2021, "month" to 7, "day" to 15), null, null, false),


                // fails
                // year out of range
                arrayOf(mapOf("year" to -10000), null, null, true),
                arrayOf(mapOf("year" to 10000), null, null, true),

                // month out of range
                arrayOf(mapOf("year" to 2021, "month" to 0), null, null, true),
                arrayOf(mapOf("year" to 2021, "month" to -1), null, null, true),
                arrayOf(mapOf("year" to 2021, "month" to 13), null, null, true),

                // day out of range
                arrayOf(mapOf("year" to -2021, "month" to 7, "day" to 0), null, null, true),
                arrayOf(mapOf("year" to -2021, "month" to 7, "day" to -1), null, null, true),
                arrayOf(mapOf("year" to -2021, "month" to 7, "day" to 32), null, null, true),

                // day of month is 30
                arrayOf(mapOf("year" to 2021, "month" to 4, "day" to 31), null, null, true),
                arrayOf(mapOf("year" to 2021, "month" to 6, "day" to 31), null, null, true),
                arrayOf(mapOf("year" to 2021, "month" to 9, "day" to 31), null, null, true),
                arrayOf(mapOf("year" to 2021, "month" to 11, "day" to 31), null, null, true),
                // february in a no leap year
                arrayOf(mapOf("year" to 2021, "month" to 2, "day" to 29), null, null, true),

                // year is mandatory
                arrayOf(mapOf("month" to 11), null, null, true),
                arrayOf(mapOf("month" to 11, "day" to 11), null, null, true),
                arrayOf(mapOf("day" to 11), null, null, true),

                // day only allowed with month and year set
                arrayOf(mapOf("day" to 15), null, null, true),
                arrayOf(mapOf("month" to 10, "day" to 15), null, null, true),
                arrayOf(mapOf("year" to 2015, "day" to 15), null, null, true),

                // leap year validate days based on month
                arrayOf(mapOf("year" to 2021, "month" to 2, "day" to 31), null, null, true),
                arrayOf(mapOf("year" to 2021, "month" to 2, "day" to 30), null, null, true),
                arrayOf(mapOf("year" to 2021, "month" to 2, "day" to 29), null, null, true),
                // leap year not applied every 100 years and again every 400
                arrayOf(mapOf("year" to 1900, "month" to 2, "day" to 29), null, null, true),
                arrayOf(mapOf("year" to 2100, "month" to 2, "day" to 29), null, null, true),
            )
        }
    }
}
