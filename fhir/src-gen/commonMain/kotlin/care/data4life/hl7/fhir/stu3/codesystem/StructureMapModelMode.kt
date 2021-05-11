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
 * How the referenced structure is used in this mapping
 *
 * @see <a href="http://hl7.org/fhir/map-model-mode">StructureMapModelMode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/map-model-mode">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class StructureMapModelMode {
    /**
     * This structure describes an instance passed to the mapping engine that is used a source of data
     */
    @SerialName("source")
    SOURCE,

    /**
     * This structure describes an instance that the mapping engine may ask for that is used a source of data
     */
    @SerialName("queried")
    QUERIED,

    /**
     * This structure describes an instance passed to the mapping engine that is used a target of data
     */
    @SerialName("target")
    TARGET,

    /**
     * This structure describes an instance that the mapping engine may ask to create that is used a target of data
     */
    @SerialName("produced")
    PRODUCED
}
