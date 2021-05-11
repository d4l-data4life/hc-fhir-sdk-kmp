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
 * A coded concept specifying the state of the prescribing event. Describes the lifecycle of the prescription
 *
 * @see <a href="http://hl7.org/fhir/medication-request-status">MedicationRequestStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medication-request-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class MedicationRequestStatus {
    /**
     * The prescription is 'actionable', but not all actions that are implied by it have occurred yet.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * Actions implied by the prescription are to be temporarily halted, but are expected to continue later.  May also be called "suspended".
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * The prescription has been withdrawn.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * All actions that are implied by the prescription have occurred.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The prescription was entered in error.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the prescription are to be permanently halted, before all of them occurred.
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * The prescription is not yet 'actionable', i.e. it is a work in progress, requires sign-off or verification, and needs to be run through decision support process.
     */
    @SerialName("draft")
    DRAFT,

    /**
     * The authoring system does not know which of the status values currently applies for this request
     */
    @SerialName("unknown")
    UNKNOWN
}
