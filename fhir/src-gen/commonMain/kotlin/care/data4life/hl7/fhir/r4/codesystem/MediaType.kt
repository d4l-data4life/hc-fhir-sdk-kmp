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
 * Codes for high level media categories.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/media-type">MediaType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/media-type">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class MediaType {

    /**
     * The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents
     */
    @SerialName("image")
    IMAGE,

    /**
     * The media consists of a series of frames that capture a moving image
     */
    @SerialName("video")
    VIDEO,

    /**
     * The media consists of a sound recording
     */
    @SerialName("audio")
    AUDIO
}
