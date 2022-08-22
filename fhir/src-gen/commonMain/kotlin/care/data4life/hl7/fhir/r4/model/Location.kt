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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirLocation
 *
 * Details and position information for a physical place where services are provided and resources and
 * participants may be stored, found, contained, or accommodated.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">Location</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
 */
interface FhirLocation : FhirDomainResource {

    /**
     * Unique code or number identifying the location to its users.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The status property covers the general availability of the resource, not the
     * current value which may be covered by the operationStatus, or by a
     * schedule/slots if they are configured for the location.
     */
    val status: LocationStatus?

    /**
     * The operational status of the location (typically only for a bed/room).
     */
    val operationalStatus: Coding?

    /**
     * Name of the location as used by humans.
     */
    val name: String?

    /**
     * A list of alternate names that the location is known as, or was known as, in the
     * past.
     */
    val alias: kotlin.collections.List<String>?

    /**
     * Additional details about the location that could be displayed as further
     * information to identify the location beyond its name.
     */
    val description: String?

    /**
     * Indicates whether a resource instance represents a specific location or a class
     * of locations.
     */
    val mode: LocationMode?

    /**
     * Type of function performed.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Contact details of the location.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Physical location.
     */
    val address: Address?

    /**
     * Physical form of the location.
     */
    val physicalType: CodeableConcept?

    /**
     * The absolute geographic location.
     */
    val position: LocationPosition?

    /**
     * Organization responsible for provisioning and upkeep.
     */
    val managingOrganization: Reference?

    /**
     * Another Location this one is physically a part of.
     */
    val partOf: Reference?

    /**
     * What days/times during a week is this location usually open.
     */
    val hoursOfOperation: kotlin.collections.List<LocationHoursOfOperation>?

    /**
     * Description of availability exceptions.
     */
    val availabilityExceptions: String?

    /**
     * Technical endpoints providing access to services operated for the location.
     */
    val endpoint: kotlin.collections.List<Reference>?
}

/**
 * Location
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

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: LocationStatus? = null,

    @SerialName("operationalStatus")
    override val operationalStatus: Coding? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("alias")
    override val alias: kotlin.collections.List<String>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("mode")
    override val mode: LocationMode? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("address")
    override val address: Address? = null,

    @SerialName("physicalType")
    override val physicalType: CodeableConcept? = null,

    @SerialName("position")
    override val position: LocationPosition? = null,

    @SerialName("managingOrganization")
    override val managingOrganization: Reference? = null,

    @SerialName("partOf")
    override val partOf: Reference? = null,

    @SerialName("hoursOfOperation")
    override val hoursOfOperation: kotlin.collections.List<LocationHoursOfOperation>? = null,

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
) : FhirLocation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Location"
    }
}

/**
 * FhirLocationHoursOfOperation
 *
 * What days/times during a week is this location usually open
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">LocationHoursOfOperation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
 */
interface FhirLocationHoursOfOperation : FhirBackboneElement {

    /**
     * Indicates which days of the week are available between the start and end Times.
     */
    val daysOfWeek: kotlin.collections.List<DaysOfWeek>?

    /**
     * The Location is open all day.
     */
    val allDay: Bool?

    /**
     * Time that the Location opens.
     */
    val openingTime: Time?

    /**
     * Time that the Location closes.
     */
    val closingTime: Time?
}

/**
 * LocationHoursOfOperation
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

    @SerialName("daysOfWeek")
    override val daysOfWeek: kotlin.collections.List<DaysOfWeek>? = null,

    @SerialName("allDay")
    override val allDay: Bool? = null,

    @SerialName("openingTime")
    override val openingTime: Time? = null,

    @SerialName("closingTime")
    override val closingTime: Time? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirLocationHoursOfOperation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "LocationHoursOfOperation"
    }
}

/**
 * FhirLocationPosition
 *
 * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same
 * co-ordinate system used in KML).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Location">LocationPosition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Location)
 */
interface FhirLocationPosition : FhirBackboneElement {

    /**
     * Longitude with WGS84 datum.
     */
    val longitude: Decimal

    /**
     * Latitude with WGS84 datum.
     */
    val latitude: Decimal

    /**
     * Altitude with WGS84 datum.
     */
    val altitude: Decimal?
}

/**
 * LocationPosition
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

    @SerialName("longitude")
    override val longitude: Decimal,

    @SerialName("latitude")
    override val latitude: Decimal,

    @SerialName("altitude")
    override val altitude: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirLocationPosition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "LocationPosition"
    }
}
