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
 * Code System: HTTPVerb
 *
 * HTTP verbs (in the HTTP command line). See [HTTP rfc](https://tools.ietf.org/html/rfc7231) for
 * details.
 *
 * @see <a href="http://hl7.org/fhir/http-verb">HTTPVerb</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/http-verb">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class HTTPVerb {

    /**
     * HTTP GET Command.
     */
    @SerialName("GET")
    GET,

    /**
     * HTTP HEAD Command.
     */
    @SerialName("HEAD")
    HEAD,

    /**
     * HTTP POST Command.
     */
    @SerialName("POST")
    POST,

    /**
     * HTTP PUT Command.
     */
    @SerialName("PUT")
    PUT,

    /**
     * HTTP DELETE Command.
     */
    @SerialName("DELETE")
    DELETE,

    /**
     * HTTP PATCH Command.
     */
    @SerialName("PATCH")
    PATCH,
}
