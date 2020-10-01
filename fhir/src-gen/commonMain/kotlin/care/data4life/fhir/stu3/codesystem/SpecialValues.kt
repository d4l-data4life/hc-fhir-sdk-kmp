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

package care.data4life.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * A set of generally useful codes defined so they can be included in value sets.
 *
 * @see <a href="http://hl7.org/fhir/special-values">SpecialValues</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/special-values">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class SpecialValues {
    /**
     * Boolean true.
     */
    @SerialName("true")
    TRUE,

    /**
     * Boolean false.
     */
    @SerialName("false")
    FALSE,

    /**
     * The content is greater than zero, but too small to be quantified.
     */
    @SerialName("trace")
    TRACE,

    /**
     * The specific quantity is not known, but is known to be non-zero and is not specified because it makes up the bulk of the material.
     */
    @SerialName("sufficient")
    SUFFICIENT,

    /**
     * The value is no longer available.
     */
    @SerialName("withdrawn")
    WITHDRAWN,

    /**
     * The are no known applicable values in this context.
     */
    @SerialName("nil-known")
    NIL_KNOWN
}
