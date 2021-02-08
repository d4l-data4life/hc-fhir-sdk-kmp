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
 * A set of common concept properties for use on coded systems through out the FHIR eco-system.
 *
 * @see <a href="http://hl7.org/fhir/concept-properties">FHIRDefinedConceptProperties</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/concept-properties">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917 on 2020-10-01
 */
@Serializable
enum class FHIRDefinedConceptProperties {
    /**
     * True if the concept is not considered active - e.g. not a valid concept any more. Property type is boolean, default value is false
     */
    @SerialName("inactive")
    INACTIVE,

    /**
     * The date at which a concept was deprecated. Concepts that are deprecated but not inactive can still be used, but their use is discouraged, and they should be expected to be made inactive in a future release. Property type is dateTime
     */
    @SerialName("deprecated")
    DEPRECATED,

    /**
     * The concept is not intended to be chosen by the user - only intended to be used as a selector for other concepts. Note, though, that the interpretation of this is highly contextual; all concepts are selectable in some context. Property type is boolean, default value is false
     */
    @SerialName("notSelectable")
    NOTSELECTABLE,

    /**
     * The concept identified in this property is a parent of the concept on which it is a property. The property type will be 'code'. The meaning of 'parent' is defined by the hierarchyMeaning attribute
     */
    @SerialName("parent")
    PARENT,

    /**
     * The concept identified in this property is a child of the concept on which it is a property. The property type will be 'code'. The meaning of 'child' is defined by the hierarchyMeaning attribute
     */
    @SerialName("child")
    CHILD
}
