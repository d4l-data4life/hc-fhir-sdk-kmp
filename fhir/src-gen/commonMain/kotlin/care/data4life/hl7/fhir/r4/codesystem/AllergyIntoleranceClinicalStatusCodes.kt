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

import kotlinx.serialization.*



/**
 * Preferred value set for AllergyIntolerance Clinical Status.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical">AllergyIntoleranceClinicalStatusCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/allergyintolerance-clinical">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class AllergyIntoleranceClinicalStatusCodes {
    /**
     * The subject is currently experiencing, or is at risk of, a reaction to the identified substance.
     */
    @SerialName("active")
    ACTIVE,
    /**
     * The subject is no longer at risk of a reaction to the identified substance.
     */
    @SerialName("inactive")
    INACTIVE,
    /**
     * A reaction to the identified substance has been clinically reassessed by testing or re-exposure and is considered no longer to be present. Re-exposure could be accidental, unplanned, or outside of any clinical setting.
     */
    @SerialName("resolved")
    RESOLVED
}
