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
 * Indicates the type of care team.
 *
 * @see <a href="http://hl7.org/fhir/care-team-category">CareTeamCategory</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/care-team-category">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class CareTeamCategory {

    /**
     * This type of team focuses on one specific type of incident, which is non-patient specific. The incident is determined by the context of use.  For example, code team (code red, code blue, medical emergency treatment) or the PICC line team.
     */
    @SerialName("event")
    EVENT,

    /**
     * This type of team focuses on one specific encounter. The encounter is determined by the context of use.  For example, during an inpatient encounter, the nutrition support care team
     */
    @SerialName("encounter")
    ENCOUNTER,

    /**
     * This type of team focuses on one specific episode of care with a defined time period or self-limiting process (e.g. 10 visits). The episode of care is determined by the context of use.  For example, a maternity care team over 9 months.
     */
    @SerialName("episode")
    EPISODE,

    /**
     * This type of team focuses on overall care coordination managing one or more conditions across the continuum of care ensuring there are smooth transitions of care. The members of the team are determined or selected by an individual or organization. When determined by an organization, the team may be assigned or based on the person's enrollment in a particular program. For example, disease management team or patient centered medical home team.
     */
    @SerialName("longitudinal")
    LONGITUDINAL,

    /**
     * This type of team focuses on one specific condition. The condition is determined by the context of use.  For example, a disease management team focused on one condition (e.g. diabetes).
     */
    @SerialName("condition")
    CONDITION,

    /**
     * This type of team is responsible for establishing, conducting, coordinating and monitoring the outcomes of clinical trials. The team focuses on research, clinical care and education.
     */
    @SerialName("clinical-research")
    CLINICAL_RESEARCH
}
