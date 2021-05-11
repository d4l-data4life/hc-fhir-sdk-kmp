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
 * Statement about the degree of clinical certainty that a specific substance was the cause of the manifestation in a reaction event.
 *
 * @see <a href="http://hl7.org/fhir/reaction-event-certainty">AllergyIntoleranceCertainty</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/reaction-event-certainty">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class AllergyIntoleranceCertainty {
    /**
     * There is a low level of clinical certainty that the reaction was caused by the identified substance.
     */
    @SerialName("unlikely")
    UNLIKELY,

    /**
     * There is a high level of clinical certainty that the reaction was caused by the identified substance.
     */
    @SerialName("likely")
    LIKELY,

    /**
     * There is a very high level of clinical certainty that the reaction was due to the identified substance, which may include clinical evidence by testing or rechallenge.
     */
    @SerialName("confirmed")
    CONFIRMED,

    /**
     * The clinical certainty that the reaction was caused by the identified substance is unknown.  It is an explicit assertion that certainty is not known.
     */
    @SerialName("unknown")
    UNKNOWN
}
