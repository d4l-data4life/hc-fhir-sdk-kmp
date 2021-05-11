/*
 * Copyright (c) 2020 D4L data4life gGmbH / All rights reserved.
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
 * Overall categorization of the event, e.g. real or potential
 *
 * @see <a href="http://hl7.org/fhir/adverse-event-category">AdverseEventCategory</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/adverse-event-category">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class AdverseEventCategory {
    /**
     * AE
     */
    @SerialName("AE")
    AE,

    /**
     * PAE
     */
    @SerialName("PAE")
    PAE
}
