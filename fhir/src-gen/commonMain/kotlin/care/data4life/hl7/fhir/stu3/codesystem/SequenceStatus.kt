/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Codes providing the status of the variant test result
 *
 * @see <a href="http://hl7.org/fhir/variant-state">SequenceStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/variant-state">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class SequenceStatus {
    /**
     * the variant is detected
     */
    @SerialName("positive")
    POSITIVE,

    /**
     * no variant is detected
     */
    @SerialName("negative")
    NEGATIVE,

    /**
     * result of the variant is missing
     */
    @SerialName("absent")
    ABSENT
}
