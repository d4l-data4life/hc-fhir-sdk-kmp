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
 * Code System: IdentifierUse
 *
 * Identifies the purpose for this identifier, if known .
 *
 * @see <a href="http://hl7.org/fhir/identifier-use">IdentifierUse</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/identifier-use">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class IdentifierUse {

    /**
     * The identifier recommended for display and use in real-world interactions.
     */
    @SerialName("usual")
    USUAL,

    /**
     * The identifier considered to be most trusted for the identification of this
     * item. Sometimes also known as "primary" and "main". The determination of
     * "official" is subjective and implementation guides often provide additional
     * guidelines for use.
     */
    @SerialName("official")
    OFFICIAL,

    /**
     * A temporary identifier.
     */
    @SerialName("temp")
    TEMP,

    /**
     * An identifier that was assigned in secondary use - it serves to identify the
     * object in a relative context, but cannot be consistently assigned to the same
     * object again in a different context.
     */
    @SerialName("secondary")
    SECONDARY,

    /**
     * The identifier id no longer considered valid, but may be relevant for search
     * purposes. E.g. Changes to identifier schemes, account merges, etc.
     */
    @SerialName("old")
    OLD,
}
