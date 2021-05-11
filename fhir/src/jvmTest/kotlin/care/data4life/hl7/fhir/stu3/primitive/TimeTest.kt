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

import care.data4life.hl7.fhir.stu3.datetime.XsTime
import care.data4life.hl7.fhir.stu3.model.Extension
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import kotlin.test.assertFails

@RunWith(value = Parameterized::class)
class TimeTest(
    private var values: Map<String, Any?>,
    private var id: String?,
    private var extension: List<Extension>?,

    private var shouldFail: kotlin.Boolean,
) {

    @Test
    fun testParameterized() {
        if (shouldFail) {
            assertFails {
                Time(
                    XsTime(
                        values["hour"] as Int,
                        values["minute"] as Int,
                        values["second"] as Int?,
                        values["fraction"] as Double?,
                    ), id, extension
                )
            }
            return
        }

        val result = Time(
            XsTime(
                values["hour"] as Int,
                values["minute"] as Int,
                values["second"] as Int?,
                values["fraction"] as Double?,
            ), id, extension
        )

        assertEquals(values["hour"], result.value.hour)
        assertEquals(values["minute"], result.value.minute)
        assertEquals(values["second"], result.value.second)
        assertEquals(values["fraction"], result.value.fraction)

        assertEquals(id, result.id)
        assertEquals(extension, result.extension)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: values: \"{0}\" id: \"{1}\" extension: \"{2}\" shouldFail: \"{3}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // valid
                arrayOf(mapOf("hour" to 21, "minute" to 32, "second" to 52), null, null, false),
                arrayOf(
                    mapOf("hour" to 21, "minute" to 32, "second" to 52, "fraction" to .12679),
                    null, null, false
                ),
                arrayOf(
                    mapOf("hour" to 21, "minute" to 32, "second" to 52, "fraction" to .000000001),
                    null, null, false
                ),
                arrayOf(
                    mapOf("hour" to 21, "minute" to 32, "second" to 52, "fraction" to .999999999),
                    null, null, false
                ),

                // fails
                // hour, minute and second must be specified
                arrayOf(mapOf("hour" to 18), null, null, true),
                arrayOf(mapOf("hour" to 18, "minute" to 32), null, null, true),

                // hour out of range
                arrayOf(mapOf("hour" to -1, "minute" to 32, "second" to 15), null, null, true),
                arrayOf(mapOf("hour" to 25, "minute" to 32, "second" to 15), null, null, true),

                // minute out of range
                arrayOf(mapOf("hour" to 12, "minute" to -1, "second" to 15), null, null, true),
                arrayOf(mapOf("hour" to 12, "minute" to 60, "second" to 15), null, null, true),

                // second out of range
                arrayOf(mapOf("hour" to 12, "minute" to 44, "second" to -1), null, null, true),
                arrayOf(mapOf("hour" to 12, "minute" to 44, "second" to 60), null, null, true),
            )
        }
    }
}
