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
 * The status of the episode of care.
 *
 * @see <a href="http://hl7.org/fhir/episode-of-care-status">EpisodeOfCareStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/episode-of-care-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class EpisodeOfCareStatus {

    /**
     * This episode of care is planned to start at the date specified in the period.start. During this status, an organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to make resources available to provide care services.
     */
    @SerialName("planned")
    PLANNED,

    /**
     * This episode has been placed on a waitlist, pending the episode being made active (or cancelled).
     */
    @SerialName("waitlist")
    WAITLIST,

    /**
     * This episode of care is current.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * This episode of care is on hold; the organization has limited responsibility for the patient (such as while on respite).
     */
    @SerialName("onhold")
    ONHOLD,

    /**
     * This episode of care is finished and the organization is not expecting to be providing further care to the patient. Can also be known as "closed", "completed" or other similar terms.
     */
    @SerialName("finished")
    FINISHED,

    /**
     * The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. It indicates that services terminated outside the planned/expected workflow.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * This instance should not have been part of this patient's medical record.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR
}
