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
 * A list of all the knowledge resource types defined in this version of the FHIR specification.
 *
 * @see <a href="http://hl7.org/fhir/knowledge-resource-types">KnowledgeResourceType</a>
 * @see <a href="http://hl7.org/fhir/ValueSet/knowledge-resource-types">ValueSet</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45
 */
@Serializable
enum class KnowledgeResourceType {
    /**
     * The definition of a specific activity to be taken, independent of any particular patient or context.
     */
    @SerialName("ActivityDefinition")
    ACTIVITYDEFINITION,

    /**
     * A set of codes drawn from one or more code systems.
     */
    @SerialName("CodeSystem")
    CODESYSTEM,

    /**
     * A map from one set of concepts to one or more other concepts.
     */
    @SerialName("ConceptMap")
    CONCEPTMAP,

    /**
     * Represents a library of quality improvement components.
     */
    @SerialName("Library")
    LIBRARY,

    /**
     * A quality measure definition.
     */
    @SerialName("Measure")
    MEASURE,

    /**
     * The definition of a plan for a series of actions, independent of any specific patient or context.
     */
    @SerialName("PlanDefinition")
    PLANDEFINITION,

    /**
     * Structural Definition.
     */
    @SerialName("StructureDefinition")
    STRUCTUREDEFINITION,

    /**
     * A Map of relationships between 2 structures that can be used to transform data.
     */
    @SerialName("StructureMap")
    STRUCTUREMAP,

    /**
     * A set of codes drawn from one or more code systems.
     */
    @SerialName("ValueSet")
    VALUESET
}
