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

package care.data4life.hl7.fhir.stu3.codesystem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


/**
 * If field is a list, how to manage the source
 *
 * @see <a href="http://hl7.org/fhir/map-source-list-mode">StructureMapSourceListMode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/map-source-list-mode">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class StructureMapSourceListMode {
    /**
     * Only process this rule for the first in the list
     */
    @SerialName("first")
    FIRST,

    /**
     * Process this rule for all but the first
     */
    @SerialName("not_first")
    NOT_FIRST,

    /**
     * Only process this rule for the last in the list
     */
    @SerialName("last")
    LAST,

    /**
     * Process this rule for all but the last
     */
    @SerialName("not_last")
    NOT_LAST,

    /**
     * Only process this rule is there is only item
     */
    @SerialName("only_one")
    ONLY_ONE
}
