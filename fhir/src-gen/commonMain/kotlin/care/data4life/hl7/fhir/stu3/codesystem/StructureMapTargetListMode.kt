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
 * If field is a list, how to manage the production
 *
 * @see <a href="http://hl7.org/fhir/map-target-list-mode">StructureMapTargetListMode</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/map-target-list-mode">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class StructureMapTargetListMode {

    /**
     * when the target list is being assembled, the items for this rule go first. If more that one rule defines a first item (for a given instance of mapping) then this is an error
     */
    @SerialName("first")
    FIRST,

    /**
     * the target instance is shared with the target instances generated by another rule (up to the first common n items, then create new ones)
     */
    @SerialName("share")
    SHARE,

    /**
     * when the target list is being assembled, the items for this rule go last. If more that one rule defines a last item (for a given instance of mapping) then this is an error
     */
    @SerialName("last")
    LAST,

    /**
     * re-use the first item in the list, and keep adding content to it
     */
    @SerialName("collate")
    COLLATE
}
