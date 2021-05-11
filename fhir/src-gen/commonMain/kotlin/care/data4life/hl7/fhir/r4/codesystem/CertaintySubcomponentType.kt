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
 * The subcomponent classification of quality of evidence rating systems.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/certainty-subcomponent-type">CertaintySubcomponentType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/certainty-subcomponent-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class CertaintySubcomponentType {
    /**
     * methodologic concerns reducing internal validity.
     */
    @SerialName("RiskOfBias")
    RISKOFBIAS,

    /**
     * concerns that findings are not similar enough to support certainty.
     */
    @SerialName("Inconsistency")
    INCONSISTENCY,

    /**
     * concerns reducing external validity.
     */
    @SerialName("Indirectness")
    INDIRECTNESS,

    /**
     * High quality evidence.
     */
    @SerialName("Imprecision")
    IMPRECISION,

    /**
     * likelihood that what is published misrepresents what is available to publish.
     */
    @SerialName("PublicationBias")
    PUBLICATIONBIAS,

    /**
     * higher certainty due to dose response relationship.
     */
    @SerialName("DoseResponseGradient")
    DOSERESPONSEGRADIENT,

    /**
     * higher certainty due to risk of bias in opposite direction.
     */
    @SerialName("PlausibleConfounding")
    PLAUSIBLECONFOUNDING,

    /**
     * higher certainty due to large effect size.
     */
    @SerialName("LargeEffect")
    LARGEEFFECT
}
