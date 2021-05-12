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
 * Codes for the stage in the progression of a therapy from initial experimental use in humans in
 * clinical trials to post-market evaluation.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/research-study-phase">ResearchStudyPhase</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/research-study-phase">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ResearchStudyPhase {

    /**
     * Trials without phases (for example, studies of devices or behavioral interventions).
     */
    @SerialName("n-a")
    N_A,

    /**
     * Designation for optional exploratory trials conducted in accordance with the United States Food and Drug Administration's (FDA) 2006 Guidance on Exploratory Investigational New Drug (IND) Studies. Formerly called Phase 0.
     */
    @SerialName("early-phase-1")
    EARLY_PHASE_1,

    /**
     * Includes initial studies to determine the metabolism and pharmacologic actions of drugs in humans, the side effects associated with increasing doses, and to gain early evidence of effectiveness; may include healthy participants and/or patients.
     */
    @SerialName("phase-1")
    PHASE_1,

    /**
     * Trials that are a combination of phases 1 and 2.
     */
    @SerialName("phase-1-phase-2")
    PHASE_1_PHASE_2,

    /**
     * Includes controlled clinical studies conducted to evaluate the effectiveness of the drug for a particular indication or indications in participants with the disease or condition under study and to determine the common short-term side effects and risks.
     */
    @SerialName("phase-2")
    PHASE_2,

    /**
     * Trials that are a combination of phases 2 and 3.
     */
    @SerialName("phase-2-phase-3")
    PHASE_2_PHASE_3,

    /**
     * Includes trials conducted after preliminary evidence suggesting effectiveness of the drug has been obtained, and are intended to gather additional information to evaluate the overall benefit-risk relationship of the drug.
     */
    @SerialName("phase-3")
    PHASE_3,

    /**
     * Studies of FDA-approved drugs to delineate additional information including the drug's risks, benefits, and optimal use.
     */
    @SerialName("phase-4")
    PHASE_4
}
