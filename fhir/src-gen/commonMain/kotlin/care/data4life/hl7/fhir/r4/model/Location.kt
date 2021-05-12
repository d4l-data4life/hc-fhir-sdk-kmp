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
import care.data4life.hl7.fhir.r4.codesystem.LocationMode
import care.data4life.hl7.fhir.r4.codesystem.LocationStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Time
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirLocation : FhirDomainResource {

    // Unique code or number identifying the location to its users.
    val identifier: List<Identifier>?

    // The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
    val status: LocationStatus?

    // The operational status of the location (typically only for a bed/room).
    val operationalStatus: Coding?

    // Name of the location as used by humans.
    val name: String?

    // A list of alternate names that the location is known as, or was known as, in the past.
    val alias: List<String>?

    // Additional details about the location that could be displayed as further information to identify the location beyond its name.
    val description: String?

    // Indicates whether a resource instance represents a specific location or a class of locations.
    val mode: LocationMode?

    // Type of function performed.
    val type: List<CodeableConcept>?

    // Contact details of the location.
    val telecom: List<ContactPoint>?

    // Physical location.
    val address: Address?

    // Physical form of the location.
    val physicalType: CodeableConcept?

    // The absolute geographic location.
    val position: LocationPosition?

    // Organization responsible for provisioning and upkeep.
    val managingOrganization: Reference?

    // Another Location this one is physically a part of.
    val partOf: Reference?

    // What days/times during a week is this location usually open.
    val hoursOfOperation: List<LocationHoursOfOperation>?

    // Description of availability exceptions.
    val availabilityExceptions: String?

    // Technical endpoints providing access to services operated for the location.
    val endpoint: List<Reference>?
}

/**
 * ClassName: Location
 *
 * SourceFileName: Location.kt
 *
 * Details and position information for a physical place where services are provided and resources and
 * participants may be stored, found, contained, or accommodated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">Location</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
 */
@Serializable
@SerialName("Location")
data class Location(

    // Unique code or number identifying the location to its users.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // The status property covers the general availability of the resource, not the current value which may be covered by the operationStatus, or by a schedule/slots if they are configured for the location.
    @SerialName("status")
    override val status: LocationStatus? = null,

    // The operational status of the location (typically only for a bed/room).
    @SerialName("operationalStatus")
    override val operationalStatus: Coding? = null,

    // Name of the location as used by humans.
    @SerialName("name")
    override val name: String? = null,

    // A list of alternate names that the location is known as, or was known as, in the past.
    @SerialName("alias")
    override val alias: List<String>? = null,

    // Additional details about the location that could be displayed as further information to identify the location beyond its name.
    @SerialName("description")
    override val description: String? = null,

    // Indicates whether a resource instance represents a specific location or a class of locations.
    @SerialName("mode")
    override val mode: LocationMode? = null,

    // Type of function performed.
    @SerialName("type")
    override val type: List<CodeableConcept>? = null,

    // Contact details of the location.
    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    // Physical location.
    @SerialName("address")
    override val address: Address? = null,

    // Physical form of the location.
    @SerialName("physicalType")
    override val physicalType: CodeableConcept? = null,

    // The absolute geographic location.
    @SerialName("position")
    override val position: LocationPosition? = null,

    // Organization responsible for provisioning and upkeep.
    @SerialName("managingOrganization")
    override val managingOrganization: Reference? = null,

    // Another Location this one is physically a part of.
    @SerialName("partOf")
    override val partOf: Reference? = null,

    // What days/times during a week is this location usually open.
    @SerialName("hoursOfOperation")
    override val hoursOfOperation: List<LocationHoursOfOperation>? = null,

    // Description of availability exceptions.
    @SerialName("availabilityExceptions")
    override val availabilityExceptions: String? = null,

    // Technical endpoints providing access to services operated for the location.
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
) : FhirLocation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Location"
    }
}

interface FhirLocationHoursOfOperation : FhirBackboneElement {

    // Indicates which days of the week are available between the start and end Times.
    val daysOfWeek: List<DaysOfWeek>?

    // The Location is open all day.
    val allDay: Bool?

    // Time that the Location opens.
    val openingTime: Time?

    // Time that the Location closes.
    val closingTime: Time?
}

/**
 * ClassName: LocationHoursOfOperation
 *
 * SourceFileName: Location.kt
 *
 * What days/times during a week is this location usually open
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">LocationHoursOfOperation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
 */
@Serializable
@SerialName("LocationHoursOfOperation")
data class LocationHoursOfOperation(

    // Indicates which days of the week are available between the start and end Times.
    @SerialName("daysOfWeek")
    override val daysOfWeek: List<DaysOfWeek>? = null,

    // The Location is open all day.
    @SerialName("allDay")
    override val allDay: Bool? = null,

    // Time that the Location opens.
    @SerialName("openingTime")
    override val openingTime: Time? = null,

    // Time that the Location closes.
    @SerialName("closingTime")
    override val closingTime: Time? = null,

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
) : FhirLocationHoursOfOperation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "LocationHoursOfOperation"
    }
}

interface FhirLocationPosition : FhirBackboneElement {

    // Longitude with WGS84 datum.
    val longitude: Decimal

    // Latitude with WGS84 datum.
    val latitude: Decimal

    // Altitude with WGS84 datum.
    val altitude: Decimal?
}

/**
 * ClassName: LocationPosition
 *
 * SourceFileName: Location.kt
 *
 * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same
 * co-ordinate system used in KML).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">LocationPosition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
 */
@Serializable
@SerialName("LocationPosition")
data class LocationPosition(

    // Longitude with WGS84 datum.
    @SerialName("longitude")
    override val longitude: Decimal,

    // Latitude with WGS84 datum.
    @SerialName("latitude")
    override val latitude: Decimal,

    // Altitude with WGS84 datum.
    @SerialName("altitude")
    override val altitude: Decimal? = null,

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
) : FhirLocationPosition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "LocationPosition"
    }
}
