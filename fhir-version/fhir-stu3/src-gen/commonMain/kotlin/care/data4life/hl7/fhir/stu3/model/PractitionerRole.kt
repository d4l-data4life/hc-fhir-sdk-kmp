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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
    val identifier: kotlin.collections.List<Identifier>?

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
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Specific specialty of the practitioner.
     */
    val specialty: kotlin.collections.List<CodeableConcept>?

    /**
     * The location(s) at which this practitioner provides care.
     */
    val location: kotlin.collections.List<Reference>?

    /**
     * The list of healthcare services that this worker provides for this role's
     * Organization/Location(s).
     */
    val healthcareService: kotlin.collections.List<Reference>?

    /**
     * Contact details that are specific to the role/location/service.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Times the Service Site is available.
     */
    val availableTime: kotlin.collections.List<PractitionerRoleAvailableTime>?

    /**
     * Not available during this time due to provided reason.
     */
    val notAvailable: kotlin.collections.List<PractitionerRoleNotAvailable>?

    /**
     * Description of availability exceptions.
     */
    val availabilityExceptions: String?

    /**
     * Technical endpoints providing access to services operated for the practitioner
     * with this role.
     */
    val endpoint: kotlin.collections.List<Reference>?
}

/**
 * PractitionerRole
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
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("practitioner")
    override val practitioner: Reference? = null,

    @SerialName("organization")
    override val organization: Reference? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specialty")
    override val specialty: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("location")
    override val location: kotlin.collections.List<Reference>? = null,

    @SerialName("healthcareService")
    override val healthcareService: kotlin.collections.List<Reference>? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("availableTime")
    override val availableTime: kotlin.collections.List<PractitionerRoleAvailableTime>? = null,

    @SerialName("notAvailable")
    override val notAvailable: kotlin.collections.List<PractitionerRoleNotAvailable>? = null,

    @SerialName("availabilityExceptions")
    override val availabilityExceptions: String? = null,

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<Reference>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

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
    val daysOfWeek: kotlin.collections.List<DaysOfWeek>?

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
    override val daysOfWeek: kotlin.collections.List<DaysOfWeek>? = null,

    @SerialName("allDay")
    override val allDay: Bool? = null,

    @SerialName("availableStartTime")
    override val availableStartTime: Time? = null,

    @SerialName("availableEndTime")
    override val availableEndTime: Time? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPractitionerRoleNotAvailable {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PractitionerRoleNotAvailable"
    }
}
