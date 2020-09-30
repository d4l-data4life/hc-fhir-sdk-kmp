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

package care.data4life.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * The processing mode that applies to this list
 *
 * @see <a href="http://hl7.org/fhir/list-mode">ListMode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/list-mode">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class ListMode {
    /**
     * This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes
     */
    @SerialName("working")
    WORKING,

    /**
     * This list was prepared as a snapshot. It should not be assumed to be current
     */
    @SerialName("snapshot")
    SNAPSHOT,

    /**
     * A list that indicates where changes have been made or recommended
     */
    @SerialName("changes")
    CHANGES
}
