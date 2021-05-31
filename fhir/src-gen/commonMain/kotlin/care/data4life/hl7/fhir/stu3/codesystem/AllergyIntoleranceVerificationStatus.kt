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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Code System: AllergyIntoleranceVerificationStatus
 *
 * Assertion about certainty associated with a propensity, or potential risk, of a reaction to the
 * identified substance.
 *
 * @see <a href="http://hl7.org/fhir/allergy-verification-status">AllergyIntoleranceVerificationStatus</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/allergy-verification-status">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class AllergyIntoleranceVerificationStatus {

    /**
     * A low level of certainty about the propensity for a reaction to the identified
     * substance.
     */
    @SerialName("unconfirmed")
    UNCONFIRMED,

    /**
     * A high level of certainty about the propensity for a reaction to the identified
     * substance, which may include clinical evidence by testing or rechallenge.
     */
    @SerialName("confirmed")
    CONFIRMED,

    /**
     * A propensity for a reaction to the identified substance has been disproven with
     * a high level of clinical certainty, which may include testing or rechallenge,
     * and is refuted.
     */
    @SerialName("refuted")
    REFUTED,

    /**
     * The statement was entered in error and is not valid.
     */
    @SerialName("entered-in-error")
    ENTERED_IN_ERROR,
}
