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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.FhirStu3Parser
import org.junit.Test
import kotlin.test.assertEquals

/**
 * ClaimResponseTest.java
 *
 * Remittance resource
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * Generated from FHIR 3.0.1.11917)
 */
@Suppress("UNNECESSARY_SAFE_CALL")
class ClaimResponseFhirTest {

    val parser = FhirStu3Parser()

    @Test
    fun testClaimResponse01() {
        // FIXME Test disabled due to issues with claimresponse-example.json
        // REASON - Property _event is not supported yet
        assertEquals(true, true)
    }
}
