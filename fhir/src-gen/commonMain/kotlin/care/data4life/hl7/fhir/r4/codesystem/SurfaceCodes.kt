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
 * Code System: SurfaceCodes
 *
 * This value set includes a smattering of FDI tooth surface codes.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/FDI-surface">SurfaceCodes</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/surface">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class SurfaceCodes {

    /**
     * The surface of a tooth that is closest to the midline (middle) of the face.
     */
    @SerialName("M")
    M,

    /**
     * The chewing surface of posterior teeth.
     */
    @SerialName("O")
    O,

    /**
     * The biting edge of anterior teeth.
     */
    @SerialName("I")
    I,

    /**
     * The surface of a tooth that faces away from the midline of the face.
     */
    @SerialName("D")
    D,

    /**
     * The surface of a posterior tooth facing the cheeks.
     */
    @SerialName("B")
    B,

    /**
     * The surface of a tooth facing the lips.
     */
    @SerialName("V")
    V,

    /**
     * The surface of a tooth facing the tongue.
     */
    @SerialName("L")
    L,

    /**
     * The Mesioclusal surfaces of a tooth.
     */
    @SerialName("MO")
    MO,

    /**
     * The Distoclusal surfaces of a tooth.
     */
    @SerialName("DO")
    DO,

    /**
     * The Distoincisal surfaces of a tooth.
     */
    @SerialName("DI")
    DI,

    /**
     * The Mesioclusodistal surfaces of a tooth.
     */
    @SerialName("MOD")
    MOD,
}
