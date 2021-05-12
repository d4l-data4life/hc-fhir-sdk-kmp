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
 * Type for access of external URI.
 *
 * @see <a href="http://hl7.org/fhir/repository-type">RepositoryType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/repository-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class RepositoryType {

    /**
     * When URL is clicked, the resource can be seen directly (by webpage or by download link format).
     */
    @SerialName("directlink")
    DIRECTLINK,

    /**
     * When the API method (e.g. [base_url]/[parameter]) related with the URL of the website is executed, the resource can be seen directly (usually in JSON or XML format).
     */
    @SerialName("openapi")
    OPENAPI,

    /**
     * When logged into the website, the resource can be seen.
     */
    @SerialName("login")
    LOGIN,

    /**
     * When logged in and  follow the API in the website related with URL, the resource can be seen.
     */
    @SerialName("oauth")
    OAUTH,

    /**
     * Some other complicated or particular way to get resource from URL.
     */
    @SerialName("other")
    OTHER
}
