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
 * Indication of the degree of conformance expectations associated with a binding.
 *
 * @see <a href="http://hl7.org/fhir/binding-strength">BindingStrength</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/binding-strength">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class BindingStrength {

    /**
     * To be conformant, the concept in this element SHALL be from the specified value set.
     */
    @SerialName("required")
    REQUIRED,

    /**
     * To be conformant, the concept in this element SHALL be from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the value set does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
     */
    @SerialName("extensible")
    EXTENSIBLE,

    /**
     * Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
     */
    @SerialName("preferred")
    PREFERRED,

    /**
     * Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
     */
    @SerialName("example")
    EXAMPLE
}
