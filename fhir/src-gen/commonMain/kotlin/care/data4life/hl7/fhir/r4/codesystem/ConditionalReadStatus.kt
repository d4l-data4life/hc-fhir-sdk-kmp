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
 * A code that indicates how the server supports conditional read.
 *
 * @see <a href="http://hl7.org/fhir/conditional-read-status">ConditionalReadStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/conditional-read-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ConditionalReadStatus {

    /**
     * No support for conditional reads.
     */
    @SerialName("not-supported")
    NOT_SUPPORTED,

    /**
     * Conditional reads are supported, but only with the If-Modified-Since HTTP Header.
     */
    @SerialName("modified-since")
    MODIFIED_SINCE,

    /**
     * Conditional reads are supported, but only with the If-None-Match HTTP Header.
     */
    @SerialName("not-match")
    NOT_MATCH,

    /**
     * Conditional reads are supported, with both If-Modified-Since and If-None-Match HTTP Headers.
     */
    @SerialName("full-support")
    FULL_SUPPORT
}
