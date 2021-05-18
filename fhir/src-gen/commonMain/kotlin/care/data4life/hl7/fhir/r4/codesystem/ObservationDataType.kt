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
 * Code System: ObservationDataType
 *
 * Permitted data type for observation value.
 *
 * @see <a href="http://hl7.org/fhir/permitted-data-type">ObservationDataType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/permitted-data-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ObservationDataType {

    /**
     * A measured amount.
     */
    @SerialName("Quantity")
    QUANTITY,

    /**
     * A coded concept from a reference terminology and/or text.
     */
    @SerialName("CodeableConcept")
    CODEABLECONCEPT,

    /**
     * A sequence of Unicode characters.
     */
    @SerialName("string")
    STRING,

    /**
     * true or false.
     */
    @SerialName("boolean")
    BOOLEAN,

    /**
     * A signed integer.
     */
    @SerialName("integer")
    INTEGER,

    /**
     * A set of values bounded by low and high.
     */
    @SerialName("Range")
    RANGE,

    /**
     * A ratio of two Quantity values - a numerator and a denominator.
     */
    @SerialName("Ratio")
    RATIO,

    /**
     * A series of measurements taken by a device.
     */
    @SerialName("SampledData")
    SAMPLEDDATA,

    /**
     * A time during the day, in the format hh:mm:ss.
     */
    @SerialName("time")
    TIME,

    /**
     * A date, date-time or partial date (e.g. just year or year + month) as used in
     * human communication.
     */
    @SerialName("dateTime")
    DATETIME,

    /**
     * A time range defined by start and end date/time.
     */
    @SerialName("Period")
    PERIOD,
}
