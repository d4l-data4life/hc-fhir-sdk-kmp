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
 * Code System: BenefitCostApplicability
 *
 * Whether the cost applies to in-network or out-of-network providers.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/applicability">BenefitCostApplicability</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/insuranceplan-applicability">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class BenefitCostApplicability {

    /**
     * Provider is contracted with the health insurance company to provide services to
     * plan members for specific pre-negotiated rates
     */
    @SerialName("in-network")
    IN_NETWORK,

    /**
     * Provider is not contracted with the health insurance company to provide services
     * to plan members for specific pre-negotiated rates
     */
    @SerialName("out-of-network")
    OUT_OF_NETWORK,

    /**
     * Other applicability
     */
    @SerialName("other")
    OTHER,
}
