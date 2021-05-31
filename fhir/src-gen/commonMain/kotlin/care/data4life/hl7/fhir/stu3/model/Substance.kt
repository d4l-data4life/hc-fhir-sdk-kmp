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

import care.data4life.hl7.fhir.stu3.codesystem.FHIRSubstanceStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirSubstance
 *
 * A homogeneous material with a definite composition
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">Substance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
interface FhirSubstance : FhirDomainResource {

    /**
     * Unique identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * A code to indicate if the substance is actively used.
     */
    val status: FHIRSubstanceStatus?

    /**
     * What class/type of substance this is.
     */
    val category: kotlin.collections.List<CodeableConcept>?

    /**
     * What substance this is.
     */
    val code: CodeableConcept

    /**
     * Textual description of the substance, comments.
     */
    val description: String?

    /**
     * If this describes a specific package/container of the substance.
     */
    val instance: kotlin.collections.List<SubstanceInstance>?

    /**
     * Composition information about the substance.
     */
    val ingredient: kotlin.collections.List<SubstanceIngredient>?
}

/**
 * Substance
 *
 * A homogeneous material with a definite composition
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">Substance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
@Serializable
@SerialName("Substance")
data class Substance(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: FHIRSubstanceStatus? = null,

    @SerialName("category")
    override val category: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("instance")
    override val instance: kotlin.collections.List<SubstanceInstance>? = null,

    @SerialName("ingredient")
    override val ingredient: kotlin.collections.List<SubstanceIngredient>? = null,

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
) : FhirSubstance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Substance"
    }
}

/**
 * FhirSubstanceIngredient
 *
 * A substance can be composed of other substances.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">SubstanceIngredient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
interface FhirSubstanceIngredient : FhirBackboneElement {

    /**
     * Optional amount (concentration).
     */
    val quantity: Ratio?

    /**
     * A component of the substance.
     */
    val substanceCodeableConcept: CodeableConcept?

    /**
     * A component of the substance.
     */
    val substanceReference: Reference?
}

/**
 * SubstanceIngredient
 *
 * A substance can be composed of other substances.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">SubstanceIngredient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
@Serializable
@SerialName("SubstanceIngredient")
data class SubstanceIngredient(

    @SerialName("quantity")
    override val quantity: Ratio? = null,

    @SerialName("substanceCodeableConcept")
    override val substanceCodeableConcept: CodeableConcept? = null,

    @SerialName("substanceReference")
    override val substanceReference: Reference? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceIngredient {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SubstanceIngredient"
    }
}

/**
 * FhirSubstanceInstance
 *
 * Substance may be used to describe a kind of substance, or a specific package/container of the
 * substance: an instance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">SubstanceInstance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
interface FhirSubstanceInstance : FhirBackboneElement {

    /**
     * Identifier of the package/container.
     */
    val identifier: Identifier?

    /**
     * When no longer valid to use.
     */
    val expiry: DateTime?

    /**
     * Amount of substance in the package.
     */
    val quantity: Quantity?
}

/**
 * SubstanceInstance
 *
 * Substance may be used to describe a kind of substance, or a specific package/container of the
 * substance: an instance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Substance">SubstanceInstance</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Substance)
 */
@Serializable
@SerialName("SubstanceInstance")
data class SubstanceInstance(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("expiry")
    override val expiry: DateTime? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceInstance {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "SubstanceInstance"
    }
}
