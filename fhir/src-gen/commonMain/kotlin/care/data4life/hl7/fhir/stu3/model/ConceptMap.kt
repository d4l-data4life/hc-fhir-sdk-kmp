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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.ConceptMapEquivalence
import care.data4life.hl7.fhir.stu3.codesystem.ConceptMapGroupUnmappedMode
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirConceptMap
 *
 * A statement of relationships from one set of concepts to one or more other concepts - either code
 * systems or data elements, or classes in class models.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMap</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
interface FhirConceptMap : FhirDomainResource {

    /**
     * Logical URI to reference this concept map (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the concept map.
     */
    val identifier: Identifier?

    /**
     * Business version of the concept map.
     */
    val version: String?

    /**
     * Name for this concept map (computer friendly).
     */
    val name: String?

    /**
     * Name for this concept map (human friendly).
     */
    val title: String?

    /**
     * The status of this concept map. Enables tracking the life-cycle of the content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date this was last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Natural language description of the concept map.
     */
    val description: String?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for concept map (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this concept map is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Identifies the source of the concepts which are being mapped.
     */
    val sourceUri: String?

    /**
     * Identifies the source of the concepts which are being mapped.
     */
    val sourceReference: Reference?

    /**
     * Provides context to the mappings.
     */
    val targetUri: String?

    /**
     * Provides context to the mappings.
     */
    val targetReference: Reference?

    /**
     * Same source and target systems.
     */
    val group: kotlin.collections.List<ConceptMapGroup>?
}

/**
 * ConceptMap
 *
 * A statement of relationships from one set of concepts to one or more other concepts - either code
 * systems or data elements, or classes in class models.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMap</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
@Serializable
@SerialName("ConceptMap")
data class ConceptMap(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("sourceUri")
    override val sourceUri: String? = null,

    @SerialName("sourceReference")
    override val sourceReference: Reference? = null,

    @SerialName("targetUri")
    override val targetUri: String? = null,

    @SerialName("targetReference")
    override val targetReference: Reference? = null,

    @SerialName("group")
    override val group: kotlin.collections.List<ConceptMapGroup>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirConceptMap {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConceptMap"
    }
}

/**
 * FhirConceptMapGroup
 *
 * A group of mappings that all have the same source and target system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
interface FhirConceptMapGroup : FhirBackboneElement {

    /**
     * Code System (if value set crosses code systems).
     */
    val source: String?

    /**
     * Specific version of the code system.
     */
    val sourceVersion: String?

    /**
     * System of the target (if necessary).
     */
    val target: String?

    /**
     * Specific version of the code system.
     */
    val targetVersion: String?

    /**
     * Mappings for a concept from the source set.
     */
    val element: kotlin.collections.List<ConceptMapGroupElement>

    /**
     * When no match in the mappings.
     */
    val unmapped: ConceptMapGroupUnmapped?
}

/**
 * ConceptMapGroup
 *
 * A group of mappings that all have the same source and target system.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroup</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
@Serializable
@SerialName("ConceptMapGroup")
data class ConceptMapGroup(

    @SerialName("source")
    override val source: String? = null,

    @SerialName("sourceVersion")
    override val sourceVersion: String? = null,

    @SerialName("target")
    override val target: String? = null,

    @SerialName("targetVersion")
    override val targetVersion: String? = null,

    @SerialName("element")
    override val element: kotlin.collections.List<ConceptMapGroupElement>,

    @SerialName("unmapped")
    override val unmapped: ConceptMapGroupUnmapped? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConceptMapGroup {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConceptMapGroup"
    }
}

/**
 * FhirConceptMapGroupElement
 *
 * Mappings for an individual concept in the source to one or more concepts in the target.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupElement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
interface FhirConceptMapGroupElement : FhirBackboneElement {

    /**
     * Identifies element being mapped.
     */
    val code: String?

    /**
     * Display for the code.
     */
    val display: String?

    /**
     * Concept in target system for element.
     */
    val target: kotlin.collections.List<ConceptMapGroupElementTarget>?
}

/**
 * ConceptMapGroupElement
 *
 * Mappings for an individual concept in the source to one or more concepts in the target.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupElement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
@Serializable
@SerialName("ConceptMapGroupElement")
data class ConceptMapGroupElement(

    @SerialName("code")
    override val code: String? = null,

    @SerialName("display")
    override val display: String? = null,

    @SerialName("target")
    override val target: kotlin.collections.List<ConceptMapGroupElementTarget>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConceptMapGroupElement {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConceptMapGroupElement"
    }
}

/**
 * FhirConceptMapGroupElementTarget
 *
 * A concept from the target value set that this concept maps to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupElementTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
interface FhirConceptMapGroupElementTarget : FhirBackboneElement {

    /**
     * Code that identifies the target element.
     */
    val code: String?

    /**
     * Display for the code.
     */
    val display: String?

    /**
     * The equivalence between the source and target concepts (counting for the
     * dependencies and products). The equivalence is read from target to source (e.g.
     * the target is 'wider' than the source).
     */
    val equivalence: ConceptMapEquivalence?

    /**
     * Description of status/issues in mapping.
     */
    val comment: String?

    /**
     * Other elements required for this mapping (from context).
     */
    val dependsOn: kotlin.collections.List<ConceptMapGroupElementTargetDependsOn>?

    /**
     * Other concepts that this mapping also produces.
     */
    val product: kotlin.collections.List<ConceptMapGroupElementTargetDependsOn>?
}

/**
 * ConceptMapGroupElementTarget
 *
 * A concept from the target value set that this concept maps to.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupElementTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
@Serializable
@SerialName("ConceptMapGroupElementTarget")
data class ConceptMapGroupElementTarget(

    @SerialName("code")
    override val code: String? = null,

    @SerialName("display")
    override val display: String? = null,

    @SerialName("equivalence")
    override val equivalence: ConceptMapEquivalence? = null,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("dependsOn")
    override val dependsOn: kotlin.collections.List<ConceptMapGroupElementTargetDependsOn>? = null,

    @SerialName("product")
    override val product: kotlin.collections.List<ConceptMapGroupElementTargetDependsOn>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConceptMapGroupElementTarget {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConceptMapGroupElementTarget"
    }
}

/**
 * FhirConceptMapGroupElementTargetDependsOn
 *
 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the
 * specified element can be resolved, and it has the specified value.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupElementTargetDependsOn</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
interface FhirConceptMapGroupElementTargetDependsOn : FhirBackboneElement {

    /**
     * Reference to property mapping depends on.
     */
    val property: String

    /**
     * Code System (if necessary).
     */
    val system: String?

    /**
     * Value of the referenced element.
     */
    val code: String

    /**
     * Display for the code.
     */
    val display: String?
}

/**
 * ConceptMapGroupElementTargetDependsOn
 *
 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the
 * specified element can be resolved, and it has the specified value.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupElementTargetDependsOn</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
@Serializable
@SerialName("ConceptMapGroupElementTargetDependsOn")
data class ConceptMapGroupElementTargetDependsOn(

    @SerialName("property")
    override val property: String,

    @SerialName("system")
    override val system: String? = null,

    @SerialName("code")
    override val code: String,

    @SerialName("display")
    override val display: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConceptMapGroupElementTargetDependsOn {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConceptMapGroupElementTargetDependsOn"
    }
}

/**
 * FhirConceptMapGroupUnmapped
 *
 * What to do when there is no match in the mappings in the group.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupUnmapped</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
interface FhirConceptMapGroupUnmapped : FhirBackboneElement {

    /**
     * Defines which action to take if there is no match in the group. One of 3 actions
     * is possible: use the unmapped code (this is useful when doing a mapping between
     * versions, and only a few codes have changed), use a fixed code (a default code),
     * or alternatively, a reference to a different concept map can be provided (by
     * canonical URL).
     */
    val mode: ConceptMapGroupUnmappedMode

    /**
     * Fixed code when mode = fixed.
     */
    val code: String?

    /**
     * Display for the code.
     */
    val display: String?

    /**
     * Canonical URL for other concept map.
     */
    val url: String?
}

/**
 * ConceptMapGroupUnmapped
 *
 * What to do when there is no match in the mappings in the group.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ConceptMap">ConceptMapGroupUnmapped</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ConceptMap)
 */
@Serializable
@SerialName("ConceptMapGroupUnmapped")
data class ConceptMapGroupUnmapped(

    @SerialName("mode")
    override val mode: ConceptMapGroupUnmappedMode,

    @SerialName("code")
    override val code: String? = null,

    @SerialName("display")
    override val display: String? = null,

    @SerialName("url")
    override val url: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirConceptMapGroupUnmapped {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ConceptMapGroupUnmapped"
    }
}
