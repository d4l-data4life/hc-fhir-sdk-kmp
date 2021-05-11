/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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
 * A coded concept specifying the state of the dispense event.
 *
 * @see <a href="http://hl7.org/fhir/medication-dispense-status">MedicationDispenseStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medication-dispense-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class MedicationDispenseStatus {
    /**
     * The core event has not started yet, but some staging activities have begun (e.g. initial compounding or packaging of medication). Preparation stages may be tracked for billing purposes.
     */
    @SerialName("preparation")
    PREPARATION,

    /**
     * The dispense has started but has not yet completed.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be called "suspended"
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * All actions that are implied by the dispense have occurred.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The dispense was entered in error and therefore nullified.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the dispense have been permanently halted, before all of them occurred.
     */
    @SerialName("stopped")
    STOPPED
}
