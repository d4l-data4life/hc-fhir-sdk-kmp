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

import care.data4life.hl7.fhir.r4.model.Extension
import kotlin.test.assertEquals
import kotlin.test.assertFails
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class PositiveIntegerTest(
    private var value: kotlin.Long,
    private var extension: List<Extension>?,
    private var id: String?,

    private var shouldFail: kotlin.Boolean
) {

    @Test
    fun `Given, input should`() {
        if (shouldFail) {
            assertFails {
                PositiveInteger(value, id, extension)
            }
            return
        }

        val result = PositiveInteger(value, id, extension)

        assertEquals(value, result.value)
        assertEquals(id, result.id)
        assertEquals(extension, result.extension)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: value: \"{0}\" extensions: \"{1}\" id: \"{2}\" shouldFail: \"{3}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // positive
                arrayOf(1, null, null, false),
                arrayOf(2147483647, null, null, false),
                arrayOf(9223372036854775807, null, null, false),

                // error cases
                // zero
                arrayOf(0, null, null, true),

                // negative
                arrayOf(-1, null, null, true),
                arrayOf(-2147483648, null, null, true)

                // fail will fail on system level
                // arrayOf(9223372036854775808, null, null, true),
            )
        }
    }
}
