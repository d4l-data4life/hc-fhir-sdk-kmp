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
 * Whether the effect estimate is an absolute effect estimate (absolute difference) or a relative effect estimate (relative difference), and the specific type of effect estimate (eg relative risk or median difference).
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/effect-estimate-type">EffectEstimateType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/effect-estimate-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class EffectEstimateType {
    /**
     * relative risk (a type of relative effect estimate).
     */
    @SerialName("relative-RR")
    RELATIVE_RR,

    /**
     * odds ratio (a type of relative effect estimate).
     */
    @SerialName("relative-OR")
    RELATIVE_OR,

    /**
     * hazard ratio (a type of relative effect estimate).
     */
    @SerialName("relative-HR")
    RELATIVE_HR,

    /**
     * absolute risk difference (a type of absolute effect estimate).
     */
    @SerialName("absolute-ARD")
    ABSOLUTE_ARD,

    /**
     * mean difference (a type of absolute effect estimate).
     */
    @SerialName("absolute-MeanDiff")
    ABSOLUTE_MEANDIFF,

    /**
     * standardized mean difference (a type of absolute effect estimate).
     */
    @SerialName("absolute-SMD")
    ABSOLUTE_SMD,

    /**
     * median difference (a type of absolute effect estimate).
     */
    @SerialName("absolute-MedianDiff")
    ABSOLUTE_MEDIANDIFF
}
