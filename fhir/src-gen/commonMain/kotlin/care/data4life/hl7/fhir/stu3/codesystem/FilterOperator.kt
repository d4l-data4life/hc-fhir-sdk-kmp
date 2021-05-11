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
 * The kind of operation to perform as a part of a property based filter.
 *
 * @see <a href="http://hl7.org/fhir/filter-operator">FilterOperator</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/filter-operator">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class FilterOperator {
    /**
     * The specified property of the code equals the provided value.
     */
    @SerialName("=")
    EQUAL,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, including the provided concept itself (i.e. include child codes)
     */
    @SerialName("is-a")
    IS_A,

    /**
     * Includes all concept ids that have a transitive is-a relationship with the concept Id provided as the value, excluding the provided concept itself (i.e. include child codes)
     */
    @SerialName("descendent-of")
    DESCENDENT_OF,

    /**
     * The specified property of the code does not have an is-a relationship with the provided value.
     */
    @SerialName("is-not-a")
    IS_NOT_A,

    /**
     * The specified property of the code  matches the regex specified in the provided value.
     */
    @SerialName("regex")
    REGEX,

    /**
     * The specified property of the code is in the set of codes or concepts specified in the provided value (comma separated list).
     */
    @SerialName("in")
    IN,

    /**
     * The specified property of the code is not in the set of codes or concepts specified in the provided value (comma separated list).
     */
    @SerialName("not-in")
    NOT_IN,

    /**
     * Includes all concept ids that have a transitive is-a relationship from the concept Id provided as the value, including the provided concept itself (e.g. include parent codes)
     */
    @SerialName("generalizes")
    GENERALIZES,

    /**
     * The specified property of the code has at least one value (if the specified value is true; if the specified value is false, then matches when the specified property of the code has no values)
     */
    @SerialName("exists")
    EXISTS
}
