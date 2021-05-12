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
 * MedicationDispense Status Codes
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/medicationdispense-status">MedicationDispenseStatusCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medicationdispense-status">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class MedicationDispenseStatusCodes {

    /**
     * The core event has not started yet, but some staging activities have begun (e.g.
     * initial compounding or packaging of medication). Preparation stages may be
     * tracked for billing purposes.
     */
    @SerialName("preparation")
    PREPARATION,

    /**
     * The dispensed product is ready for pickup.
     */
    @SerialName("in-progress")
    IN_PROGRESS,

    /**
     * The dispensed product was not and will never be picked up by the patient.
     */
    @SerialName("cancelled")
    CANCELLED,

    /**
     * The dispense process is paused while waiting for an external event to reactivate
     * the dispense.  For example, new stock has arrived or the prescriber has called.
     */
    @SerialName("on-hold")
    ON_HOLD,

    /**
     * The dispensed product has been picked up.
     */
    @SerialName("completed")
    COMPLETED,

    /**
     * The dispense was entered in error and therefore nullified.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,

    /**
     * Actions implied by the dispense have been permanently halted, before all of them
     * occurred.
     */
    @SerialName("stopped")
    STOPPED,

    /**
     * The dispense was declined and not performed.
     */
    @SerialName("declined")
    DECLINED,

    /**
     * The authoring system does not know which of the status values applies for this
     * medication dispense.  Note: this concept is not to be used for other - one of
     * the listed statuses is presumed to apply, it's just now known which one.
     */
    @SerialName("unknown")
    UNKNOWN
}
