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
 * This value set includes Coverage Class codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/coverage-class">CoverageClassCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/coverage-class">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class CoverageClassCodes {
    /**
     * An employee group
     */
    @SerialName("group")
    GROUP,

    /**
     * A sub-group of an employee group
     */
    @SerialName("subgroup")
    SUBGROUP,

    /**
     * A specific suite of benefits.
     */
    @SerialName("plan")
    PLAN,

    /**
     * A subset of a specific suite of benefits.
     */
    @SerialName("subplan")
    SUBPLAN,

    /**
     * A class of benefits.
     */
    @SerialName("class")
    CLASS,

    /**
     * A subset of a class of benefits.
     */
    @SerialName("subclass")
    SUBCLASS,

    /**
     * A sequence number associated with a short-term continuance of the coverage.
     */
    @SerialName("sequence")
    SEQUENCE,

    /**
     * Pharmacy benefit manager's Business Identification Number.
     */
    @SerialName("rxbin")
    RXBIN,

    /**
     * A Pharmacy Benefit Manager specified Processor Control Number.
     */
    @SerialName("rxpcn")
    RXPCN,

    /**
     * A Pharmacy Benefit Manager specified Member ID.
     */
    @SerialName("rxid")
    RXID,

    /**
     * A Pharmacy Benefit Manager specified Group number.
     */
    @SerialName("rxgroup")
    RXGROUP
}
