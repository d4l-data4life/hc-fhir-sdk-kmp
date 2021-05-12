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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Used to specify why the normally expected content of the data element is missing.
 *
 * @see <a href="http://hl7.org/fhir/data-absent-reason">DataAbsentReason</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/data-absent-reason">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class DataAbsentReason {

    /**
     * The value is not known.
     */
    @SerialName("unknown")
    UNKNOWN,

    /**
     * The source human does not know the value.
     */
    @SerialName("asked")
    ASKED,

    /**
     * There is reason to expect (from the workflow) that the value may become known.
     */
    @SerialName("temp")
    TEMP,

    /**
     * The workflow didn't lead to this value being known.
     */
    @SerialName("not-asked")
    NOT_ASKED,

    /**
     * The information is not available due to security, privacy or related reasons.
     */
    @SerialName("masked")
    MASKED,

    /**
     * The source system wasn't capable of supporting this element.
     */
    @SerialName("unsupported")
    UNSUPPORTED,

    /**
     * The content of the data is represented in the resource narrative.
     */
    @SerialName("astext")
    ASTEXT,

    /**
     * Some system or workflow process error means that the information is not
     * available.
     */
    @SerialName("error")
    ERROR,

    /**
     * NaN, standing for not a number, is a numeric data type value representing an
     * undefined or unrepresentable value.
     */
    @SerialName("NaN")
    NAN,

    /**
     * The value is not available because the observation procedure (test, etc.) was
     * not performed.
     */
    @SerialName("not-performed")
    NOT_PERFORMED
}
