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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.codesystem.FHIRSubstanceStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirSubstance : FhirDomainResource {

    // Unique identifier.
    val identifier: List<Identifier>?

    // A code to indicate if the substance is actively used.
    val status: FHIRSubstanceStatus?

    // What class/type of substance this is.
    val category: List<CodeableConcept>?

    // What substance this is.
    val code: CodeableConcept

    // Textual description of the substance, comments.
    val description: String?

    // If this describes a specific package/container of the substance.
    val instance: List<SubstanceInstance>?

    // Composition information about the substance.
    val ingredient: List<SubstanceIngredient>?
}

/**
 * ClassName: Substance
 *
 * SourceFileName: Substance.kt
 *
 *
 * A homogeneous material with a definite composition
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">Substance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
@Serializable
@SerialName("Substance")
data class Substance(

    // Unique identifier.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // A code to indicate if the substance is actively used.
    @SerialName("status")
    override val status: FHIRSubstanceStatus? = null,
    // What class/type of substance this is.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,
    // What substance this is.
    @SerialName("code")
    override val code: CodeableConcept,
    // Textual description of the substance, comments.
    @SerialName("description")
    override val description: String? = null,
    // If this describes a specific package/container of the substance.
    @SerialName("instance")
    override val instance: List<SubstanceInstance>? = null,
    // Composition information about the substance.
    @SerialName("ingredient")
    override val ingredient: List<SubstanceIngredient>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource
    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,
    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,
    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    // Language of the resource content.
    @SerialName("language")
    override val language: String? = null
) : FhirSubstance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Substance"
    }
}

interface FhirSubstanceIngredient : FhirBackboneElement {

    // Optional amount (concentration).
    val quantity: Ratio?

    // A component of the substance.
    val substanceCodeableConcept: CodeableConcept?

    // A component of the substance.
    val substanceReference: Reference?
}

/**
 * ClassName: SubstanceIngredient
 *
 * SourceFileName: Substance.kt
 *
 *
 * A substance can be composed of other substances.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">SubstanceIngredient</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
@Serializable
@SerialName("SubstanceIngredient")
data class SubstanceIngredient(

    // Optional amount (concentration).
    @SerialName("quantity")
    override val quantity: Ratio? = null,
    // A component of the substance.
    @SerialName("substanceCodeableConcept")
    override val substanceCodeableConcept: CodeableConcept? = null,
    // A component of the substance.
    @SerialName("substanceReference")
    override val substanceReference: Reference? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSubstanceIngredient {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SubstanceIngredient"
    }
}

interface FhirSubstanceInstance : FhirBackboneElement {

    // Identifier of the package/container.
    val identifier: Identifier?

    // When no longer valid to use.
    val expiry: DateTime?

    // Amount of substance in the package.
    val quantity: Quantity?
}

/**
 * ClassName: SubstanceInstance
 *
 * SourceFileName: Substance.kt
 *
 *
 * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">SubstanceInstance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
@Serializable
@SerialName("SubstanceInstance")
data class SubstanceInstance(

    // Identifier of the package/container.
    @SerialName("identifier")
    override val identifier: Identifier? = null,
    // When no longer valid to use.
    @SerialName("expiry")
    override val expiry: DateTime? = null,
    // Amount of substance in the package.
    @SerialName("quantity")
    override val quantity: Quantity? = null,

    // # BackboneElement
    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirSubstanceInstance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SubstanceInstance"
    }
}