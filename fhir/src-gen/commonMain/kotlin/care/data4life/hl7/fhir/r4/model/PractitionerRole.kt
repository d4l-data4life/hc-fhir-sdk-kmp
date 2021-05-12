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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.codesystem.DaysOfWeek
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Time
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirPractitionerRole : FhirDomainResource {

    // Business Identifiers that are specific to a role/location.
    val identifier: List<Identifier>?

    // Whether this practitioner role record is in active use.
    val active: Bool?

    // The period during which the practitioner is authorized to perform in these role(s).
    val period: Period?

    // Practitioner that is able to provide the defined services for the organization.
    val practitioner: Reference?

    // Organization where the roles are available.
    val organization: Reference?

    // Roles which this practitioner may perform.
    val code: List<CodeableConcept>?

    // Specific specialty of the practitioner.
    val specialty: List<CodeableConcept>?

    // The location(s) at which this practitioner provides care.
    val location: List<Reference>?

    // The list of healthcare services that this worker provides for this role's Organization/Location(s).
    val healthcareService: List<Reference>?

    // Contact details that are specific to the role/location/service.
    val telecom: List<ContactPoint>?

    // Times the Service Site is available.
    val availableTime: List<PractitionerRoleAvailableTime>?

    // Not available during this time due to provided reason.
    val notAvailable: List<PractitionerRoleNotAvailable>?

    // Description of availability exceptions.
    val availabilityExceptions: String?

    // Technical endpoints providing access to services operated for the practitioner with this role.
    val endpoint: List<Reference>?
}

/**
 * ClassName: PractitionerRole
 *
 * SourceFileName: PractitionerRole.kt
 *
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an
 * organization for a period of time.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRole</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
@Serializable
@SerialName("PractitionerRole")
data class PractitionerRole(

    // Business Identifiers that are specific to a role/location.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // Whether this practitioner role record is in active use.
    @SerialName("active")
    override val active: Bool? = null,

    // The period during which the practitioner is authorized to perform in these role(s).
    @SerialName("period")
    override val period: Period? = null,

    // Practitioner that is able to provide the defined services for the organization.
    @SerialName("practitioner")
    override val practitioner: Reference? = null,

    // Organization where the roles are available.
    @SerialName("organization")
    override val organization: Reference? = null,

    // Roles which this practitioner may perform.
    @SerialName("code")
    override val code: List<CodeableConcept>? = null,

    // Specific specialty of the practitioner.
    @SerialName("specialty")
    override val specialty: List<CodeableConcept>? = null,

    // The location(s) at which this practitioner provides care.
    @SerialName("location")
    override val location: List<Reference>? = null,

    // The list of healthcare services that this worker provides for this role's Organization/Location(s).
    @SerialName("healthcareService")
    override val healthcareService: List<Reference>? = null,

    // Contact details that are specific to the role/location/service.
    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    // Times the Service Site is available.
    @SerialName("availableTime")
    override val availableTime: List<PractitionerRoleAvailableTime>? = null,

    // Not available during this time due to provided reason.
    @SerialName("notAvailable")
    override val notAvailable: List<PractitionerRoleNotAvailable>? = null,

    // Description of availability exceptions.
    @SerialName("availabilityExceptions")
    override val availabilityExceptions: String? = null,

    // Technical endpoints providing access to services operated for the practitioner with this role.
    @SerialName("endpoint")
    override val endpoint: List<Reference>? = null,

    // # DomainResource

    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,

    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,

    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,

    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,

    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    // Language of the resource content.
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

interface FhirPractitionerRoleAvailableTime : FhirBackboneElement {

    // Indicates which days of the week are available between the start and end Times.
    val daysOfWeek: List<DaysOfWeek>?

    // Always available? e.g. 24 hour service.
    val allDay: Bool?

    // Opening time of day (ignored if allDay = true).
    val availableStartTime: Time?

    // Closing time of day (ignored if allDay = true).
    val availableEndTime: Time?
}

/**
 * ClassName: PractitionerRoleAvailableTime
 *
 * SourceFileName: PractitionerRole.kt
 *
 * A collection of times the practitioner is available or performing this role at the location and/or
 * healthcareservice.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRoleAvailableTime</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
@Serializable
@SerialName("PractitionerRoleAvailableTime")
data class PractitionerRoleAvailableTime(

    // Indicates which days of the week are available between the start and end Times.
    @SerialName("daysOfWeek")
    override val daysOfWeek: List<DaysOfWeek>? = null,

    // Always available? e.g. 24 hour service.
    @SerialName("allDay")
    override val allDay: Bool? = null,

    // Opening time of day (ignored if allDay = true).
    @SerialName("availableStartTime")
    override val availableStartTime: Time? = null,

    // Closing time of day (ignored if allDay = true).
    @SerialName("availableEndTime")
    override val availableEndTime: Time? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
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

interface FhirPractitionerRoleNotAvailable : FhirBackboneElement {

    // Reason presented to the user explaining why time not available.
    val description: String

    // Service not available from this date.
    val during: Period?
}

/**
 * ClassName: PractitionerRoleNotAvailable
 *
 * SourceFileName: PractitionerRole.kt
 *
 * The practitioner is not available or performing this role during this period of time due to the
 * provided reason.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PractitionerRole">PractitionerRoleNotAvailable</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PractitionerRole)
 */
@Serializable
@SerialName("PractitionerRoleNotAvailable")
data class PractitionerRoleNotAvailable(

    // Reason presented to the user explaining why time not available.
    @SerialName("description")
    override val description: String,

    // Service not available from this date.
    @SerialName("during")
    override val during: Period? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
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
