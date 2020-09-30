/*
 * Copyright (c) 2020. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * Different measurement principle supported by the device.
 *
 * @see <a href="http://hl7.org/fhir/measurement-principle">MeasmntPrinciple</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/measurement-principle">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class MeasmntPrinciple {
    /**
     * Measurement principle isn't in the list.
     */
    @SerialName("other")
    OTHER,

    /**
     * Measurement is done using the chemical principle.
     */
    @SerialName("chemical")
    CHEMICAL,

    /**
     * Measurement is done using the electrical principle.
     */
    @SerialName("electrical")
    ELECTRICAL,

    /**
     * Measurement is done using the impedance principle.
     */
    @SerialName("impedance")
    IMPEDANCE,

    /**
     * Measurement is done using the nuclear principle.
     */
    @SerialName("nuclear")
    NUCLEAR,

    /**
     * Measurement is done using the optical principle.
     */
    @SerialName("optical")
    OPTICAL,

    /**
     * Measurement is done using the thermal principle.
     */
    @SerialName("thermal")
    THERMAL,

    /**
     * Measurement is done using the biological principle.
     */
    @SerialName("biological")
    BIOLOGICAL,

    /**
     * Measurement is done using the mechanical principle.
     */
    @SerialName("mechanical")
    MECHANICAL,

    /**
     * Measurement is done using the acoustical principle.
     */
    @SerialName("acoustical")
    ACOUSTICAL,

    /**
     * Measurement is done using the manual principle.
     */
    @SerialName("manual")
    MANUAL
}
