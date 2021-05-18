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
 * Code System: HumanNameAssemblyOrder
 *
 * A code that represents the preferred display order of the components of a human name.
 *
 * @see <a href="http://terminology.hl7.org/CodeSystem/name-assembly-order">HumanNameAssemblyOrder</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class HumanNameAssemblyOrder {

    /**
     * NL1
     */
    @SerialName("NL1")
    NL1,

    /**
     * NL2
     */
    @SerialName("NL2")
    NL2,

    /**
     * NL3
     */
    @SerialName("NL3")
    NL3,

    /**
     * NL4
     */
    @SerialName("NL4")
    NL4,
}
