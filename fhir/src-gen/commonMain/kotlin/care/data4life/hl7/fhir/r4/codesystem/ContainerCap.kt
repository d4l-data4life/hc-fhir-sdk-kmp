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
 * Code System: ContainerCap
 *
 * Color of the container cap.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/container-cap">ContainerCap</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/container-cap">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class ContainerCap {

    /**
     * red cap.
     */
    @SerialName("red")
    RED,

    /**
     * yellow cap.
     */
    @SerialName("yellow")
    YELLOW,

    /**
     * dark yellow cap.
     */
    @SerialName("dark-yellow")
    DARK_YELLOW,

    /**
     * grey cap.
     */
    @SerialName("grey")
    GREY,

    /**
     * light blue cap.
     */
    @SerialName("light-blue")
    LIGHT_BLUE,

    /**
     * black cap.
     */
    @SerialName("black")
    BLACK,

    /**
     * green cap.
     */
    @SerialName("green")
    GREEN,

    /**
     * light green cap.
     */
    @SerialName("light-green")
    LIGHT_GREEN,

    /**
     * lavender cap.
     */
    @SerialName("lavender")
    LAVENDER,

    /**
     * brown cap.
     */
    @SerialName("brown")
    BROWN,

    /**
     * white cap.
     */
    @SerialName("white")
    WHITE,

    /**
     * pink cap.
     */
    @SerialName("pink")
    PINK,
}
