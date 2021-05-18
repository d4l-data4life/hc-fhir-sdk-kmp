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
 * Code System: AssertionResponseTypes
 *
 * The type of response code to use for assertion.
 *
 * @see <a href="http://hl7.org/fhir/assert-response-code-types">AssertionResponseTypes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/assert-response-code-types">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class AssertionResponseTypes {

    /**
     * Response code is 200.
     */
    @SerialName("okay")
    OKAY,

    /**
     * Response code is 201.
     */
    @SerialName("created")
    CREATED,

    /**
     * Response code is 204.
     */
    @SerialName("noContent")
    NOCONTENT,

    /**
     * Response code is 304.
     */
    @SerialName("notModified")
    NOTMODIFIED,

    /**
     * Response code is 400.
     */
    @SerialName("bad")
    BAD,

    /**
     * Response code is 403.
     */
    @SerialName("forbidden")
    FORBIDDEN,

    /**
     * Response code is 404.
     */
    @SerialName("notFound")
    NOTFOUND,

    /**
     * Response code is 405.
     */
    @SerialName("methodNotAllowed")
    METHODNOTALLOWED,

    /**
     * Response code is 409.
     */
    @SerialName("conflict")
    CONFLICT,

    /**
     * Response code is 410.
     */
    @SerialName("gone")
    GONE,

    /**
     * Response code is 412.
     */
    @SerialName("preconditionFailed")
    PRECONDITIONFAILED,

    /**
     * Response code is 422.
     */
    @SerialName("unprocessable")
    UNPROCESSABLE,
}
