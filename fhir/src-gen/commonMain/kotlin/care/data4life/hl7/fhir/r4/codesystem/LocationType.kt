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
 * This example value set defines a set of codes that can be used to indicate the physical form of the Location.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/location-physical-type">LocationType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/location-physical-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class LocationType {
    /**
     * A collection of buildings or other locations such as a site or a campus.
     */
    @SerialName("si")
    SI,

    /**
     * Any Building or structure. This may contain rooms, corridors, wings, etc. It might not have walls, or a roof, but is considered a defined/allocated space.
     */
    @SerialName("bu")
    BU,

    /**
     * A Wing within a Building, this often contains levels, rooms and corridors.
     */
    @SerialName("wi")
    WI,

    /**
     * A Ward is a section of a medical facility that may contain rooms and other types of location.
     */
    @SerialName("wa")
    WA,

    /**
     * A Level in a multi-level Building/Structure.
     */
    @SerialName("lvl")
    LVL,

    /**
     * Any corridor within a Building, that may connect rooms.
     */
    @SerialName("co")
    CO,

    /**
     * A space that is allocated as a room, it may have walls/roof etc., but does not require these.
     */
    @SerialName("ro")
    RO,

    /**
     * A space that is allocated for sleeping/laying on. This is not the physical bed/trolley that may be moved about, but the space it may occupy.
     */
    @SerialName("bd")
    BD,

    /**
     * A means of transportation.
     */
    @SerialName("ve")
    VE,

    /**
     * A residential dwelling. Usually used to reference a location that a person/patient may reside.
     */
    @SerialName("ho")
    HO,

    /**
     * A container that can store goods, equipment, medications or other items.
     */
    @SerialName("ca")
    CA,

    /**
     * A defined path to travel between 2 points that has a known name.
     */
    @SerialName("rd")
    RD,

    /**
     * A defined physical boundary of something, such as a flood risk zone, region, postcode
     */
    @SerialName("area")
    AREA,

    /**
     * A wide scope that covers a conceptual domain, such as a Nation (Country wide community or Federal Government - e.g. Ministry of Health),  Province or State (community or Government), Business (throughout the enterprise), Nation with a business scope of an agency (e.g. CDC, FDA etc.) or a Business segment (UK Pharmacy), not just an physical boundary
     */
    @SerialName("jdn")
    JDN
}
