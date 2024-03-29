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

package care.data4life.hl7.fhir

import care.data4life.hl7.fhir.r4.FhirR4Parser
import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

internal class FhirParserFactoryTest {

    // SUT
    private lateinit var fhir: FhirParserFactory

    @BeforeTest
    fun setup() {
        fhir = FhirParserFactory()
    }

    @Test
    fun `createStu3Parser() SHOULD return instance of FhirStu3Parser`() {
        assertTrue(fhir.createStu3Parser() is FhirStu3Parser)
    }

    @Test
    fun `createR4Parser() SHOULD return instance of FhirR4Parser`() {
        assertTrue(fhir.createR4Parser() is FhirR4Parser)
    }
}
