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
 * FhirPractitionerRole
 *
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an
 * organization for a period of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRole</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
interface FhirPractitionerRole : FhirDomainResource {

    /**
     * Business Identifiers that are specific to a role/location.
     */
    val identifier: List<Identifier>?

    /**
     * Whether this practitioner's record is in active use.
     */
    val active: Bool?

    /**
     * The period during which the practitioner is authorized to perform in these
     * role(s).
     */
    val period: Period?

    /**
     * Practitioner that is able to provide the defined services for the organation.
     */
    val practitioner: Reference?

    /**
     * Organization where the roles are available.
     */
    val organization: Reference?

    /**
     * Roles which this practitioner may perform.
     */
    val code: List<CodeableConcept>?

    /**
     * Specific specialty of the practitioner.
     */
    val specialty: List<CodeableConcept>?

    /**
     * The location(s) at which this practitioner provides care.
     */
    val location: List<Reference>?

    /**
     * The list of healthcare services that this worker provides for this role's
     * Organization/Location(s).
     */
    val healthcareService: List<Reference>?

    /**
     * Contact details that are specific to the role/location/service.
     */
    val telecom: List<ContactPoint>?

    /**
     * Times the Service Site is available.
     */
    val availableTime: List<PractitionerRoleAvailableTime>?

    /**
     * Not available during this time due to provided reason.
     */
    val notAvailable: List<PractitionerRoleNotAvailable>?

    /**
     * Description of availability exceptions.
     */
    val availabilityExceptions: String?

    /**
     * Technical endpoints providing access to services operated for the practitioner
     * with this role.
     */
    val endpoint: List<Reference>?
}

/**
 * PractitionerRole
 *
 * SourceFileName: PractitionerRole.kt
 *
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an
 * organization for a period of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRole</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
@Serializable
@SerialName("PractitionerRole")
data class PractitionerRole(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("practitioner")
    override val practitioner: Reference? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("code")
    override val code: List<CodeableConcept>? = null,

    @SerialName("specialty")
    override val specialty: List<CodeableConcept>? = null,

    @SerialName("location")
    override val location: List<Reference>? = null,

    @SerialName("healthcareService")
    override val healthcareService: List<Reference>? = null,

    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    @SerialName("availableTime")
    override val availableTime: List<PractitionerRoleAvailableTime>? = null,

    @SerialName("notAvailable")
    override val notAvailable: List<PractitionerRoleNotAvailable>? = null,

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
) : FhirPractitionerRole {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PractitionerRole"
    }
}

/**
 * FhirPractitionerRoleAvailableTime
 *
 * A collection of times that the Service Site is available.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRoleAvailableTime</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
interface FhirPractitionerRoleAvailableTime : FhirBackboneElement {

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
 * PractitionerRoleAvailableTime
 *
 * SourceFileName: PractitionerRole.kt
 *
 * A collection of times that the Service Site is available.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRoleAvailableTime</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
@Serializable
@SerialName("PractitionerRoleAvailableTime")
data class PractitionerRoleAvailableTime(

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
) : FhirPractitionerRoleAvailableTime {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PractitionerRoleAvailableTime"
    }
}

/**
 * FhirPractitionerRoleNotAvailable
 *
 * The HealthcareService is not available during this period of time due to the provided reason.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRoleNotAvailable</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
interface FhirPractitionerRoleNotAvailable : FhirBackboneElement {

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
 * PractitionerRoleNotAvailable
 *
 * SourceFileName: PractitionerRole.kt
 *
 * The HealthcareService is not available during this period of time due to the provided reason.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRoleNotAvailable</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
@Serializable
@SerialName("PractitionerRoleNotAvailable")
data class PractitionerRoleNotAvailable(

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
) : FhirPractitionerRoleNotAvailable {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PractitionerRoleNotAvailable"
    }
}
