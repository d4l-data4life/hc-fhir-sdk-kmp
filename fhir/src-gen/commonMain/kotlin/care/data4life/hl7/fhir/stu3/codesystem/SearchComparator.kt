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
 * What Search Comparator Codes are supported in search
 *
 * @see <a href="http://hl7.org/fhir/search-comparator">SearchComparator</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/search-comparator">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class SearchComparator {
    /**
     * the value for the parameter in the resource is equal to the provided value
     */
    @SerialName("eq")
    EQ,

    /**
     * the value for the parameter in the resource is not equal to the provided value
     */
    @SerialName("ne")
    NE,

    /**
     * the value for the parameter in the resource is greater than the provided value
     */
    @SerialName("gt")
    GT,

    /**
     * the value for the parameter in the resource is less than the provided value
     */
    @SerialName("lt")
    LT,

    /**
     * the value for the parameter in the resource is greater or equal to the provided value
     */
    @SerialName("ge")
    GE,

    /**
     * the value for the parameter in the resource is less or equal to the provided value
     */
    @SerialName("le")
    LE,

    /**
     * the value for the parameter in the resource starts after the provided value
     */
    @SerialName("sa")
    SA,

    /**
     * the value for the parameter in the resource ends before the provided value
     */
    @SerialName("eb")
    EB,

    /**
     * the value for the parameter in the resource is approximately the same to the provided value.
     */
    @SerialName("ap")
    AP
}
