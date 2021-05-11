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
 * A list of all the event resource types defined in this version of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/event-resource-types">EventResourceType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/event-resource-types">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class EventResourceType {
    /**
     * Item containing charge code(s) associated with the provision of healthcare provider products.
     */
    @SerialName("ChargeItem")
    CHARGEITEM,

    /**
     * Remittance resource.
     */
    @SerialName("ClaimResponse")
    CLAIMRESPONSE,

    /**
     * A clinical assessment performed when planning treatments and management strategies for a patient.
     */
    @SerialName("ClinicalImpression")
    CLINICALIMPRESSION,

    /**
     * A record of information transmitted from a sender to a receiver.
     */
    @SerialName("Communication")
    COMMUNICATION,

    /**
     * A set of resources composed into a single coherent clinical statement with clinical attestation.
     */
    @SerialName("Composition")
    COMPOSITION,

    /**
     * Detailed information about conditions, problems or diagnoses.
     */
    @SerialName("Condition")
    CONDITION,

    /**
     * A healthcare consumer's policy choices to permits or denies recipients or roles to perform actions for specific purposes and periods of time.
     */
    @SerialName("Consent")
    CONSENT,

    /**
     * Insurance or medical plan or a payment agreement.
     */
    @SerialName("Coverage")
    COVERAGE,

    /**
     * Record of use of a device.
     */
    @SerialName("DeviceUseStatement")
    DEVICEUSESTATEMENT,

    /**
     * A Diagnostic report - a combination of request information, atomic results, images, interpretation, as well as formatted reports.
     */
    @SerialName("DiagnosticReport")
    DIAGNOSTICREPORT,

    /**
     * A list that defines a set of documents.
     */
    @SerialName("DocumentManifest")
    DOCUMENTMANIFEST,

    /**
     * A reference to a document.
     */
    @SerialName("DocumentReference")
    DOCUMENTREFERENCE,

    /**
     * An interaction during which services are provided to the patient.
     */
    @SerialName("Encounter")
    ENCOUNTER,

    /**
     * EnrollmentResponse resource.
     */
    @SerialName("EnrollmentResponse")
    ENROLLMENTRESPONSE,

    /**
     * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility.
     */
    @SerialName("EpisodeOfCare")
    EPISODEOFCARE,

    /**
     * Explanation of Benefit resource.
     */
    @SerialName("ExplanationOfBenefit")
    EXPLANATIONOFBENEFIT,

    /**
     * Information about patient's relatives, relevant for patient.
     */
    @SerialName("FamilyMemberHistory")
    FAMILYMEMBERHISTORY,

    /**
     * The formal response to a guidance request.
     */
    @SerialName("GuidanceResponse")
    GUIDANCERESPONSE,

    /**
     * A set of images produced in single study (one or more series of references images).
     */
    @SerialName("ImagingStudy")
    IMAGINGSTUDY,

    /**
     * Immunization event information.
     */
    @SerialName("Immunization")
    IMMUNIZATION,

    /**
     * Results of a measure evaluation.
     */
    @SerialName("MeasureReport")
    MEASUREREPORT,

    /**
     * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
     */
    @SerialName("Media")
    MEDIA,

    /**
     * Administration of medication to a patient.
     */
    @SerialName("MedicationAdministration")
    MEDICATIONADMINISTRATION,

    /**
     * Dispensing a medication to a named patient.
     */
    @SerialName("MedicationDispense")
    MEDICATIONDISPENSE,

    /**
     * Record of medication being taken by a patient.
     */
    @SerialName("MedicationStatement")
    MEDICATIONSTATEMENT,

    /**
     * Measurements and simple assertions.
     */
    @SerialName("Observation")
    OBSERVATION,

    /**
     * PaymentNotice request.
     */
    @SerialName("PaymentNotice")
    PAYMENTNOTICE,

    /**
     * PaymentReconciliation resource.
     */
    @SerialName("PaymentReconciliation")
    PAYMENTRECONCILIATION,

    /**
     * An action that is being or was performed on a patient.
     */
    @SerialName("Procedure")
    PROCEDURE,

    /**
     * ProcessResponse resource.
     */
    @SerialName("ProcessResponse")
    PROCESSRESPONSE,

    /**
     * A structured set of questions and their answers.
     */
    @SerialName("QuestionnaireResponse")
    QUESTIONNAIRERESPONSE,

    /**
     * Potential outcomes for a subject with likelihood.
     */
    @SerialName("RiskAssessment")
    RISKASSESSMENT,

    /**
     * Delivery of bulk Supplies.
     */
    @SerialName("SupplyDelivery")
    SUPPLYDELIVERY,

    /**
     * A task to be performed.
     */
    @SerialName("Task")
    TASK
}
