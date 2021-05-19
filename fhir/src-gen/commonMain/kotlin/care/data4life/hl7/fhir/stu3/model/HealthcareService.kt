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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.DaysOfWeek
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Time
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirHealthcareService
 *
 * The details of a healthcare service available at a location
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HealthcareService">HealthcareService</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HealthcareService)
 */
interface FhirHealthcareService : FhirDomainResource {

    /**
     * External identifiers for this item.
     */
    val identifier: List<Identifier>?

    /**
     * Whether this healthcareservice is in active use.
     */
    val active: Bool?

    /**
     * Organization that provides this service.
     */
    val providedBy: Reference?

    /**
     * Broad category of service being performed or delivered.
     */
    val category: CodeableConcept?

    /**
     * Type of service that may be delivered or performed.
     */
    val type: List<CodeableConcept>?

    /**
     * Specialties handled by the HealthcareService.
     */
    val specialty: List<CodeableConcept>?

    /**
     * Location(s) where service may be provided.
     */
    val location: List<Reference>?

    /**
     * Description of service as presented to a consumer while searching.
     */
    val name: String?

    /**
     * Additional description and/or any specific issues not covered elsewhere.
     */
    val comment: String?

    /**
     * Extra details about the service that can't be placed in the other fields.
     */
    val extraDetails: String?

    /**
     * Facilitates quick identification of the service.
     */
    val photo: Attachment?

    /**
     * Contacts related to the healthcare service.
     */
    val telecom: List<ContactPoint>?

    /**
     * Location(s) service is inteded for/available to.
     */
    val coverageArea: List<Reference>?

    /**
     * Conditions under which service is available/offered.
     */
    val serviceProvisionCode: List<CodeableConcept>?

    /**
     * Specific eligibility requirements required to use the service.
     */
    val eligibility: CodeableConcept?

    /**
     * Describes the eligibility conditions for the service.
     */
    val eligibilityNote: String?

    /**
     * Program Names that categorize the service.
     */
    val programName: List<String>?

    /**
     * Collection of characteristics (attributes).
     */
    val characteristic: List<CodeableConcept>?

    /**
     * Ways that the service accepts referrals.
     */
    val referralMethod: List<CodeableConcept>?

    /**
     * If an appointment is required for access to this service.
     */
    val appointmentRequired: Bool?

    /**
     * Times the Service Site is available.
     */
    val availableTime: List<HealthcareServiceAvailableTime>?

    /**
     * Not available during this time due to provided reason.
     */
    val notAvailable: List<HealthcareServiceNotAvailable>?

    /**
     * Description of availability exceptions.
     */
    val availabilityExceptions: String?

    /**
     * Technical endpoints providing access to services operated for the location.
     */
    val endpoint: List<Reference>?
}

/**
 * HealthcareService
 *
 * SourceFileName: HealthcareService.kt
 *
 * The details of a healthcare service available at a location
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HealthcareService">HealthcareService</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HealthcareService)
 */
@Serializable
@SerialName("HealthcareService")
data class HealthcareService(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("providedBy")
    override val providedBy: Reference? = null,

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("type")
    override val type: List<CodeableConcept>? = null,

    @SerialName("specialty")
    override val specialty: List<CodeableConcept>? = null,

    @SerialName("location")
    override val location: List<Reference>? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("extraDetails")
    override val extraDetails: String? = null,

    @SerialName("photo")
    override val photo: Attachment? = null,

    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    @SerialName("coverageArea")
    override val coverageArea: List<Reference>? = null,

    @SerialName("serviceProvisionCode")
    override val serviceProvisionCode: List<CodeableConcept>? = null,

    @SerialName("eligibility")
    override val eligibility: CodeableConcept? = null,

    @SerialName("eligibilityNote")
    override val eligibilityNote: String? = null,

    @SerialName("programName")
    override val programName: List<String>? = null,

    @SerialName("characteristic")
    override val characteristic: List<CodeableConcept>? = null,

    @SerialName("referralMethod")
    override val referralMethod: List<CodeableConcept>? = null,

    @SerialName("appointmentRequired")
    override val appointmentRequired: Bool? = null,

    @SerialName("availableTime")
    override val availableTime: List<HealthcareServiceAvailableTime>? = null,

    @SerialName("notAvailable")
    override val notAvailable: List<HealthcareServiceNotAvailable>? = null,

    @SerialName("availabilityExceptions")
    override val availabilityExceptions: String? = null,

    @SerialName("endpoint")
    override val endpoint: List<Reference>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirHealthcareService {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "HealthcareService"
    }
}

/**
 * FhirHealthcareServiceAvailableTime
 *
 * A collection of times that the Service Site is available.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HealthcareService">HealthcareServiceAvailableTime</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HealthcareService)
 */
interface FhirHealthcareServiceAvailableTime : FhirBackboneElement {

    /**
     * Indicates which days of the week are available between the start and end Times.
     */
    val daysOfWeek: List<DaysOfWeek>?

    /**
     * Always available? e.g. 24 hour service.
     */
    val allDay: Bool?

    /**
     * Opening time of day (ignored if allDay = true).
     */
    val availableStartTime: Time?

    /**
     * Closing time of day (ignored if allDay = true).
     */
    val availableEndTime: Time?
}

/**
 * HealthcareServiceAvailableTime
 *
 * SourceFileName: HealthcareService.kt
 *
 * A collection of times that the Service Site is available.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HealthcareService">HealthcareServiceAvailableTime</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HealthcareService)
 */
@Serializable
@SerialName("HealthcareServiceAvailableTime")
data class HealthcareServiceAvailableTime(

    @SerialName("daysOfWeek")
    override val daysOfWeek: List<DaysOfWeek>? = null,

    @SerialName("allDay")
    override val allDay: Bool? = null,

    @SerialName("availableStartTime")
    override val availableStartTime: Time? = null,

    @SerialName("availableEndTime")
    override val availableEndTime: Time? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirHealthcareServiceAvailableTime {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "HealthcareServiceAvailableTime"
    }
}

/**
 * FhirHealthcareServiceNotAvailable
 *
 * The HealthcareService is not available during this period of time due to the provided reason.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HealthcareService">HealthcareServiceNotAvailable</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HealthcareService)
 */
interface FhirHealthcareServiceNotAvailable : FhirBackboneElement {

    /**
     * Reason presented to the user explaining why time not available.
     */
    val description: String

    /**
     * Service not availablefrom this date.
     */
    val during: Period?
}

/**
 * HealthcareServiceNotAvailable
 *
 * SourceFileName: HealthcareService.kt
 *
 * The HealthcareService is not available during this period of time due to the provided reason.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/HealthcareService">HealthcareServiceNotAvailable</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/HealthcareService)
 */
@Serializable
@SerialName("HealthcareServiceNotAvailable")
data class HealthcareServiceNotAvailable(

    @SerialName("description")
    override val description: String,

    @SerialName("during")
    override val during: Period? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirHealthcareServiceNotAvailable {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "HealthcareServiceNotAvailable"
    }
}
