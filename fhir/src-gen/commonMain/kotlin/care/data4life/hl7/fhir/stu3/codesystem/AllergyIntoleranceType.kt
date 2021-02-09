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
 * Identification of the underlying physiological mechanism for a Reaction Risk.
 *
 * @see <a href="http://hl7.org/fhir/allergy-intolerance-type">AllergyIntoleranceType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/allergy-intolerance-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class AllergyIntoleranceType {
    /**
     * A propensity for hypersensitivity reaction(s) to a substance.  These reactions are most typically type I hypersensitivity, plus other "allergy-like" reactions, including pseudoallergy.
     */
    @SerialName("allergy")
    ALLERGY,

    /**
     * A propensity for adverse reactions to a substance that is not judged to be allergic or "allergy-like".  These reactions are typically (but not necessarily) non-immune.  They are to some degree idiosyncratic and/or individually specific (i.e. are not a reaction that is expected to occur with most or all patients given similar circumstances).
     */
    @SerialName("intolerance")
    INTOLERANCE
}
