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
 * Example list of general categories for flagged issues. (Not complete or necessarily appropriate.)
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/flag-category">FlagCategory</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/flag-category">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class FlagCategory {

    /**
     * Flags related to the subject's dietary needs.
     */
    @SerialName("diet")
    DIET,

    /**
     * Flags related to the subject's medications.
     */
    @SerialName("drug")
    DRUG,

    /**
     * Flags related to performing laboratory tests and related processes (e.g. phlebotomy).
     */
    @SerialName("lab")
    LAB,

    /**
     * Flags related to administrative and financial processes.
     */
    @SerialName("admin")
    ADMIN,

    /**
     * Flags related to coming into contact with the patient.
     */
    @SerialName("contact")
    CONTACT,

    /**
     * Flags related to the subject's clinical data.
     */
    @SerialName("clinical")
    CLINICAL,

    /**
     * Flags related to behavior.
     */
    @SerialName("behavioral")
    BEHAVIORAL,

    /**
     * Flags related to research.
     */
    @SerialName("research")
    RESEARCH,

    /**
     * Flags related to subject's advance directives.
     */
    @SerialName("advance-directive")
    ADVANCE_DIRECTIVE,

    /**
     * Flags related to safety precautions.
     */
    @SerialName("safety")
    SAFETY
}
