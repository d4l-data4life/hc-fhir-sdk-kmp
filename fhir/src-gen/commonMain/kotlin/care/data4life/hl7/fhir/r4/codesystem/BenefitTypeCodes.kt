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
 * This value set includes a smattering of Benefit type codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/benefit-type">BenefitTypeCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/benefit-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class BenefitTypeCodes {
    /**
     * Maximum benefit allowable.
     */
    @SerialName("benefit")
    BENEFIT,

    /**
     * Cost to be incurred before benefits are applied
     */
    @SerialName("deductible")
    DEDUCTIBLE,

    /**
     * Service visit
     */
    @SerialName("visit")
    VISIT,

    /**
     * Type of room
     */
    @SerialName("room")
    ROOM,

    /**
     * Copayment per service
     */
    @SerialName("copay")
    COPAY,

    /**
     * Copayment percentage per service
     */
    @SerialName("copay-percent")
    COPAY_PERCENT,

    /**
     * Copayment maximum per service
     */
    @SerialName("copay-maximum")
    COPAY_MAXIMUM,

    /**
     * Vision Exam
     */
    @SerialName("vision-exam")
    VISION_EXAM,

    /**
     * Frames and lenses
     */
    @SerialName("vision-glasses")
    VISION_GLASSES,

    /**
     * Contact Lenses
     */
    @SerialName("vision-contacts")
    VISION_CONTACTS,

    /**
     * Medical Primary Health Coverage
     */
    @SerialName("medical-primarycare")
    MEDICAL_PRIMARYCARE,

    /**
     * Pharmacy Dispense Coverage
     */
    @SerialName("pharmacy-dispense")
    PHARMACY_DISPENSE
}
