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
 * Codes representing the likelihood of a particular outcome in a risk assessment.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/risk-probability">RiskProbability</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/risk-probability">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class RiskProbability {
    /**
     * The specified outcome is exceptionally unlikely.
     */
    @SerialName("negligible")
    NEGLIGIBLE,

    /**
     * The specified outcome is possible but unlikely.
     */
    @SerialName("low")
    LOW,

    /**
     * The specified outcome has a reasonable likelihood of occurrence.
     */
    @SerialName("moderate")
    MODERATE,

    /**
     * The specified outcome is more likely to occur than not.
     */
    @SerialName("high")
    HIGH,

    /**
     * The specified outcome is effectively guaranteed.
     */
    @SerialName("certain")
    CERTAIN
}
