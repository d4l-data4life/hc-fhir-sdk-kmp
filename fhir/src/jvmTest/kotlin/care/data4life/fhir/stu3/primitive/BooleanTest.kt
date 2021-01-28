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
class BooleanTest(
    private var value: kotlin.Boolean,
    private var extension: List<Extension>?,
    private var id: String?,

    private var shouldFail: kotlin.Boolean,
) {

    @Test
    fun testParameterized() {
        if (shouldFail) {
            assertFails {
                Boolean(value, extension, id)
            }
            return
        }

        val result = Boolean(value, extension, id)

        assertEquals(value, result.value)
        assertEquals(extension, result.extension)
        assertEquals(id, result.id)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: value: \"{0}\" extensions: \"{1}\" id: \"{2}\"")
        fun data(): Iterable<Array<Any?>> {
            return arrayListOf(
                // just value
                arrayOf(true, null, null, false),
                arrayOf(false, null, null, false),
            )
        }
    }
}
