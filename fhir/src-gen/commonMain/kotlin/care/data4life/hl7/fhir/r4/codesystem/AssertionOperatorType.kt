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
 * Code System: AssertionOperatorType
 *
 * The type of operator to use for assertion.
 *
 * @see <a href="http://hl7.org/fhir/assert-operator-codes">AssertionOperatorType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/assert-operator-codes">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class AssertionOperatorType {

    /**
     * Default value. Equals comparison.
     */
    @SerialName("equals")
    EQUALS,

    /**
     * Not equals comparison.
     */
    @SerialName("notEquals")
    NOTEQUALS,

    /**
     * Compare value within a known set of values.
     */
    @SerialName("in")
    IN,

    /**
     * Compare value not within a known set of values.
     */
    @SerialName("notIn")
    NOTIN,

    /**
     * Compare value to be greater than a known value.
     */
    @SerialName("greaterThan")
    GREATERTHAN,

    /**
     * Compare value to be less than a known value.
     */
    @SerialName("lessThan")
    LESSTHAN,

    /**
     * Compare value is empty.
     */
    @SerialName("empty")
    EMPTY,

    /**
     * Compare value is not empty.
     */
    @SerialName("notEmpty")
    NOTEMPTY,

    /**
     * Compare value string contains a known value.
     */
    @SerialName("contains")
    CONTAINS,

    /**
     * Compare value string does not contain a known value.
     */
    @SerialName("notContains")
    NOTCONTAINS,

    /**
     * Evaluate the FHIRPath expression as a boolean condition.
     */
    @SerialName("eval")
    EVAL,
}
