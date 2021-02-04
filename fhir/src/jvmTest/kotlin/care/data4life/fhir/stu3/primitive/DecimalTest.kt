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

package care.data4life.fhir.stu3.primitive

import care.data4life.fhir.stu3.model.Extension
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals
import kotlin.test.assertFails

@RunWith(value = Parameterized::class)
class DecimalTest(
    private var value: kotlin.String,
    private var extension: List<Extension>?,
    private var id: String?,

    private var shouldFail: kotlin.Boolean,
) {

    @Test
    fun testParameterized() {
        if (shouldFail) {
            assertFails {
                Decimal(value.toDouble(), id, extension)
            }
            return
        }

        val result = Decimal(value.toDouble(), id, extension)

        assertEquals(value, result.value.toString())
        assertEquals(extension, result.extension)
        assertEquals(id, result.id)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: value: \"{0}\" extensions: \"{1}\" id: \"{2}\" shouldFail: \"{3}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // zero
                arrayOf("0.0", null, null, false),
                // arrayOf("0", null, null, false), //FIXME not supported by Double

                // positive
                arrayOf("1.0", null, null, false),
                arrayOf("123.456", null, null, false),
                // arrayOf("456", null, null, false), //FIXME not supported by Double
                //arrayOf("7.0100100", null, null, false), //FIXME not supported by Double

                // negative
                arrayOf("-1.0", null, null, false),
                arrayOf("-123.456", null, null, false),
                //arrayOf("-456", null, null, false), //FIXME not supported by Double
                //arrayOf("-7.0100100", null, null, false), //FIXME not supported by Double
            )
        }
    }
}
