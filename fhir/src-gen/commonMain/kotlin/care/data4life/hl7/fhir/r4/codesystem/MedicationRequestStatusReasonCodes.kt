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
 * MedicationRequest Status Reason Codes
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/medicationrequest-status-reason">MedicationRequestStatusReasonCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/medicationrequest-status-reason">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class MedicationRequestStatusReasonCodes {

    /**
     * This therapy has been ordered as a backup to a preferred therapy. This order will be released when and if the preferred therapy is unsuccessful.
     */
    @SerialName("altchoice")
    ALTCHOICE,

    /**
     * Clarification is required before the order can be acted upon.
     */
    @SerialName("clarif")
    CLARIF,

    /**
     * The current level of the medication in the patient's system is too high. The medication is suspended to allow the level to subside to a safer level.
     */
    @SerialName("drughigh")
    DRUGHIGH,

    /**
     * The patient has been admitted to a care facility and their community medications are suspended until hospital discharge.
     */
    @SerialName("hospadm")
    HOSPADM,

    /**
     * The therapy would interfere with a planned lab test and the therapy is being withdrawn until the test is completed.
     */
    @SerialName("labint")
    LABINT,

    /**
     * Patient not available for a period of time due to a scheduled therapy, leave of absence or other reason.
     */
    @SerialName("non-avail")
    NON_AVAIL,

    /**
     * The patient is pregnant or breast feeding. The therapy will be resumed when the pregnancy is complete and the patient is no longer breastfeeding.
     */
    @SerialName("preg")
    PREG,

    /**
     * The patient is believed to be allergic to a substance that is part of the therapy and the therapy is being temporarily withdrawn to confirm.
     */
    @SerialName("salg")
    SALG,

    /**
     * The drug interacts with a short-term treatment that is more urgently required. This order will be resumed when the short-term treatment is complete.
     */
    @SerialName("sddi")
    SDDI,

    /**
     * The drug interacts with a short-term treatment that is more urgently required. This order will be resumed when the short-term treatment is complete.
     */
    @SerialName("sdupther")
    SDUPTHER,

    /**
     * The drug interacts with a short-term treatment that is more urgently required. This order will be resumed when the short-term treatment is complete.
     */
    @SerialName("sintol")
    SINTOL,

    /**
     * The drug is contraindicated for patients receiving surgery and the patient is scheduled to be admitted for surgery in the near future. The drug will be resumed when the patient has sufficiently recovered from the surgery.
     */
    @SerialName("surg")
    SURG,

    /**
     * The patient was previously receiving a medication contraindicated with the current medication. The current medication will remain on hold until the prior medication has been cleansed from their system.
     */
    @SerialName("washout")
    WASHOUT
}
