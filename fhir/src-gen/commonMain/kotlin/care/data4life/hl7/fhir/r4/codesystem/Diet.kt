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
 * This value set defines a set of codes that can be used to indicate dietary preferences or
 * restrictions a patient may have.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/diet">Diet</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/encounter-diet">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class Diet {

    /**
     * Food without meat, poultry or seafood.
     */
    @SerialName("vegetarian")
    VEGETARIAN,

    /**
     * Excludes dairy products.
     */
    @SerialName("dairy-free")
    DAIRY_FREE,

    /**
     * Excludes ingredients containing nuts.
     */
    @SerialName("nut-free")
    NUT_FREE,

    /**
     * Excludes ingredients containing gluten.
     */
    @SerialName("gluten-free")
    GLUTEN_FREE,

    /**
     * Food without meat, poultry, seafood, eggs, dairy products and other animal-
     * derived substances.
     */
    @SerialName("vegan")
    VEGAN,

    /**
     * Foods that conform to Islamic law.
     */
    @SerialName("halal")
    HALAL,

    /**
     * Foods that conform to Jewish dietary law.
     */
    @SerialName("kosher")
    KOSHER
}
