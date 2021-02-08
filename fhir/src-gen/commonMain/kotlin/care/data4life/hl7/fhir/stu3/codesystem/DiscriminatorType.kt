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
 * How an element value is interpreted when discrimination is evaluated
 *
 * @see <a href="http://hl7.org/fhir/discriminator-type">DiscriminatorType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/discriminator-type">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class DiscriminatorType {
    /**
     * The slices have different values in the nominated element
     */
    @SerialName("value")
    VALUE,

    /**
     * The slices are differentiated by the presence or absence of the nominated element
     */
    @SerialName("exists")
    EXISTS,

    /**
     * The slices have different values in the nominated element, as determined by testing them against the applicable ElementDefinition.pattern[x]
     */
    @SerialName("pattern")
    PATTERN,

    /**
     * The slices are differentiated by type of the nominated element to a specifed profile
     */
    @SerialName("type")
    TYPE,

    /**
     * The slices are differentiated by conformance of the nominated element to a specifed profile
     */
    @SerialName("profile")
    PROFILE
}
