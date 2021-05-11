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
 * This value set includes a smattering of Adjudication Value codes which includes codes to indicate the amounts eligible under the plan, the amount of benefit, copays etc.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/adjudication">AdjudicationValueCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/adjudication">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class AdjudicationValueCodes {
    /**
     * The total submitted amount for the claim or group or line item.
     */
    @SerialName("submitted")
    SUBMITTED,

    /**
     * Patient Co-Payment
     */
    @SerialName("copay")
    COPAY,

    /**
     * Amount of the change which is considered for adjudication.
     */
    @SerialName("eligible")
    ELIGIBLE,

    /**
     * Amount deducted from the eligible amount prior to adjudication.
     */
    @SerialName("deductible")
    DEDUCTIBLE,

    /**
     * The amount of deductible which could not allocated to other line items.
     */
    @SerialName("unallocdeduct")
    UNALLOCDEDUCT,

    /**
     * Eligible Percentage.
     */
    @SerialName("eligpercent")
    ELIGPERCENT,

    /**
     * The amount of tax.
     */
    @SerialName("tax")
    TAX,

    /**
     * Amount payable under the coverage
     */
    @SerialName("benefit")
    BENEFIT
}
