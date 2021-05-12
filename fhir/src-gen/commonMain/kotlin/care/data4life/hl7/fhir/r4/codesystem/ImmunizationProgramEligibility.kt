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
 * The value set to instantiate this attribute should be drawn from a terminologically robust code
 * system that consists of or contains concepts to support describing the patient's eligibility for a
 * vaccination program. This value set is provided as a suggestive example.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/immunization-program-eligibility">ImmunizationProgramEligibility</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/immunization-program-eligibility">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ImmunizationProgramEligibility {

    /**
     * The patient is not eligible for the funding program.
     */
    @SerialName("ineligible")
    INELIGIBLE,

    /**
     * The patient is eligible for the funding program because they are uninsured.
     */
    @SerialName("uninsured")
    UNINSURED
}
