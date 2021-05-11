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

import kotlinx.serialization.*



/**
 * Codes for the main intent of the study.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/research-study-prim-purp-type">ResearchStudyPrimaryPurposeType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/research-study-prim-purp-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ResearchStudyPrimaryPurposeType {
    /**
     * One or more interventions are being evaluated for treating a disease, syndrome, or condition.
     */
    @SerialName("treatment")
    TREATMENT,
    /**
     * One or more interventions are being assessed for preventing the development of a specific disease or health condition.
     */
    @SerialName("prevention")
    PREVENTION,
    /**
     * One or more interventions are being evaluated for identifying a disease or health condition.
     */
    @SerialName("diagnostic")
    DIAGNOSTIC,
    /**
     * One or more interventions are evaluated for maximizing comfort, minimizing side effects, or mitigating against a decline in the participant's health or function.
     */
    @SerialName("supportive-care")
    SUPPORTIVE_CARE,
    /**
     * One or more interventions are assessed or examined for identifying a condition, or risk factors for a condition, in people who are not yet known to have the condition or risk factor.
     */
    @SerialName("screening")
    SCREENING,
    /**
     * One or more interventions for evaluating the delivery, processes, management, organization, or financing of healthcare.
     */
    @SerialName("health-services-research")
    HEALTH_SERVICES_RESEARCH,
    /**
     * One or more interventions for examining the basic mechanism of action (for example, physiology or biomechanics of an intervention).
     */
    @SerialName("basic-science")
    BASIC_SCIENCE,
    /**
     * An intervention of a device product is being evaluated to determine the feasibility of the product or to test a prototype device and not health outcomes. Such studies are conducted to confirm the design and operating specifications of a device before beginning a full clinical trial.
     */
    @SerialName("device-feasibility")
    DEVICE_FEASIBILITY
}
