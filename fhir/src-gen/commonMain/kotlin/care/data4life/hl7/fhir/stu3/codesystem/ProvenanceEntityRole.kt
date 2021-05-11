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
 * How an entity was used in an activity.
 *
 * @see <a href="http://hl7.org/fhir/provenance-entity-role">ProvenanceEntityRole</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/provenance-entity-role">ValueSet</a>
 *
 * Generated from FHIR 3.0.1.11917
 */
@Serializable
enum class ProvenanceEntityRole {
    /**
     * A transformation of an entity into another, an update of an entity resulting in a new one, or the construction of a new entity based on a preexisting entity.
     */
    @SerialName("derivation")
    DERIVATION,

    /**
     * A derivation for which the resulting entity is a revised version of some original.
     */
    @SerialName("revision")
    REVISION,

    /**
     * The repeat of (some or all of) an entity, such as text or image, by someone who may or may not be its original author.
     */
    @SerialName("quotation")
    QUOTATION,

    /**
     * A primary source for a topic refers to something produced by some agent with direct experience and knowledge about the topic, at the time of the topic's study, without benefit from hindsight.
     */
    @SerialName("source")
    SOURCE,

    /**
     * A derivation for which the entity is removed from accessibility usually through the use of the Delete operation.
     */
    @SerialName("removal")
    REMOVAL
}
