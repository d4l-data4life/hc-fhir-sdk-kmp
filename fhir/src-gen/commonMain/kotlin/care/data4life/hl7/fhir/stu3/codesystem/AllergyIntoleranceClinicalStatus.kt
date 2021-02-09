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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * The clinical status of the allergy or intolerance.
 *
 * @see <a href="http://hl7.org/fhir/allergy-clinical-status">AllergyIntoleranceClinicalStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/allergy-clinical-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class AllergyIntoleranceClinicalStatus {
    /**
     * An active record of a risk of a reaction to the identified substance.
     */
    @SerialName("active")
    ACTIVE,

    /**
     * An inactivated record of a risk of a reaction to the identified substance.
     */
    @SerialName("inactive")
    INACTIVE,

    /**
     * A reaction to the identified substance has been clinically reassessed by testing or re-exposure and considered to be resolved.
     */
    @SerialName("resolved")
    RESOLVED
}
