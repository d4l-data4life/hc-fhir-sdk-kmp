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

package care.data4life.hl7.fhir.r4.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Code System: ClaimProcessingCodes
 *
 * This value set includes Claim Processing Outcome codes.
 *
 * @see <a href="http://hl7.org/fhir/remittance-outcome">ClaimProcessingCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/remittance-outcome">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ClaimProcessingCodes {

    /**
     * The Claim/Pre-authorization/Pre-determination has been received but processing
     * has not begun.
     */
    @SerialName("queued")
    QUEUED,

    /**
     * The processing has completed without errors
     */
    @SerialName("complete")
    COMPLETE,

    /**
     * One or more errors have been detected in the Claim
     */
    @SerialName("error")
    ERROR,

    /**
     * No errors have been detected in the Claim and some of the adjudication has been
     * performed.
     */
    @SerialName("partial")
    PARTIAL,
}
