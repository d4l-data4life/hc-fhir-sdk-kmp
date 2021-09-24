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
 * Code System: RequestResourceType
 *
 * A list of all the request resource types defined in this version of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/request-resource-types">RequestResourceType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/request-resource-types">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class RequestResourceType {

    /**
     * A booking of a healthcare event among patient(s), practitioner(s), related
     * person(s) and/or device(s) for a specific date/time. This may result in one or
     * more Encounter(s).
     */
    @SerialName("Appointment")
    APPOINTMENT,

    /**
     * A reply to an appointment request for a patient and/or practitioner(s), such as
     * a confirmation or rejection.
     */
    @SerialName("AppointmentResponse")
    APPOINTMENTRESPONSE,

    /**
     * Healthcare plan for patient or group.
     */
    @SerialName("CarePlan")
    CAREPLAN,

    /**
     * Claim, Pre-determination or Pre-authorization.
     */
    @SerialName("Claim")
    CLAIM,

    /**
     * A request for information to be sent to a receiver.
     */
    @SerialName("CommunicationRequest")
    COMMUNICATIONREQUEST,

    /**
     * Legal Agreement.
     */
    @SerialName("Contract")
    CONTRACT,

    /**
     * Medical device request.
     */
    @SerialName("DeviceRequest")
    DEVICEREQUEST,

    /**
     * Enrollment request.
     */
    @SerialName("EnrollmentRequest")
    ENROLLMENTREQUEST,

    /**
     * Guidance or advice relating to an immunization.
     */
    @SerialName("ImmunizationRecommendation")
    IMMUNIZATIONRECOMMENDATION,

    /**
     * Ordering of medication for patient or group.
     */
    @SerialName("MedicationRequest")
    MEDICATIONREQUEST,

    /**
     * Diet, formula or nutritional supplement request.
     */
    @SerialName("NutritionOrder")
    NUTRITIONORDER,

    /**
     * A record of a request for service such as diagnostic investigations, treatments,
     * or operations to be performed.
     */
    @SerialName("ServiceRequest")
    SERVICEREQUEST,

    /**
     * Request for a medication, substance or device.
     */
    @SerialName("SupplyRequest")
    SUPPLYREQUEST,

    /**
     * A task to be performed.
     */
    @SerialName("Task")
    TASK,

    /**
     * Prescription for vision correction products for a patient.
     */
    @SerialName("VisionPrescription")
    VISIONPRESCRIPTION,
}
