/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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
 * One of the message events defined as part of FHIR.
 *
 * @see <a href="http://hl7.org/fhir/message-events">MessageEvent</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/message-events">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class MessageEvent {
    /**
     * The definition of a code system is used to create a simple collection of codes suitable for use for data entry or validation. An expanded code system will be returned, or an error message.
     */
    @SerialName("CodeSystem-expand")
    CODESYSTEM_EXPAND,

    /**
     * Change the status of a Medication Administration to show that it is complete.
     */
    @SerialName("MedicationAdministration-Complete")
    MEDICATIONADMINISTRATION_COMPLETE,

    /**
     * Someone wishes to record that the record of administration of a medication is in error and should be ignored.
     */
    @SerialName("MedicationAdministration-Nullification")
    MEDICATIONADMINISTRATION_NULLIFICATION,

    /**
     * Indicates that a medication has been recorded against the patient's record.
     */
    @SerialName("MedicationAdministration-Recording")
    MEDICATIONADMINISTRATION_RECORDING,

    /**
     * Update a Medication Administration record.
     */
    @SerialName("MedicationAdministration-Update")
    MEDICATIONADMINISTRATION_UPDATE,

    /**
     * Notification of a change to an administrative resource (either create or update). Note that there is no delete, though some administrative resources have status or period elements for this use.
     */
    @SerialName("admin-notify")
    ADMIN_NOTIFY,

    /**
     * Notification to convey information.
     */
    @SerialName("communication-request")
    COMMUNICATION_REQUEST,

    /**
     * Provide a diagnostic report, or update a previously provided diagnostic report.
     */
    @SerialName("diagnosticreport-provide")
    DIAGNOSTICREPORT_PROVIDE,

    /**
     * Provide a simple observation or update a previously provided simple observation.
     */
    @SerialName("observation-provide")
    OBSERVATION_PROVIDE,

    /**
     * Notification that two patient records actually identify the same patient.
     */
    @SerialName("patient-link")
    PATIENT_LINK,

    /**
     * Notification that previous advice that two patient records concern the same patient is now considered incorrect.
     */
    @SerialName("patient-unlink")
    PATIENT_UNLINK,

    /**
     * The definition of a value set is used to create a simple collection of codes suitable for use for data entry or validation. An expanded value set will be returned, or an error message.
     */
    @SerialName("valueset-expand")
    VALUESET_EXPAND
}
