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

import care.data4life.hl7.fhir.r4.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirMedicinalProductIngredient
 *
 * An ingredient of a manufactured item or pharmaceutical product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredient</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
interface FhirMedicinalProductIngredient : FhirDomainResource {

    /**
     * Identifier for the ingredient.
     */
    val identifier: Identifier?

    /**
     * Ingredient role e.g. Active ingredient, excipient.
     */
    val role: CodeableConcept

    /**
     * If the ingredient is a known or suspected allergen.
     */
    val allergenicIndicator: Bool?

    /**
     * Manufacturer of this Ingredient.
     */
    val manufacturer: kotlin.collections.List<Reference>?

    /**
     * A specified substance that comprises this ingredient.
     */
    val specifiedSubstance: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstance>?

    /**
     * The ingredient substance.
     */
    val substance: MedicinalProductIngredientSubstance?
}

/**
 * MedicinalProductIngredient
 *
 * An ingredient of a manufactured item or pharmaceutical product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredient</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
@Serializable
@SerialName("MedicinalProductIngredient")
data class MedicinalProductIngredient(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("role")
    override val role: CodeableConcept,

    @SerialName("allergenicIndicator")
    override val allergenicIndicator: Bool? = null,

    @SerialName("manufacturer")
    override val manufacturer: kotlin.collections.List<Reference>? = null,

    @SerialName("specifiedSubstance")
    override val specifiedSubstance: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstance>? = null,

    @SerialName("substance")
    override val substance: MedicinalProductIngredientSubstance? = null,

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
) : FhirMedicinalProductIngredient {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductIngredient"
    }
}

/**
 * FhirMedicinalProductIngredientSpecifiedSubstance
 *
 * A specified substance that comprises this ingredient
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSpecifiedSubstance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
interface FhirMedicinalProductIngredientSpecifiedSubstance : FhirBackboneElement {

    /**
     * The specified substance.
     */
    val code: CodeableConcept

    /**
     * The group of specified substance, e.g. group 1 to 4.
     */
    val group: CodeableConcept

    /**
     * Confidentiality level of the specified substance as the ingredient.
     */
    val confidentiality: CodeableConcept?

    /**
     * Quantity of the substance or specified substance present in the manufactured
     * item or pharmaceutical product.
     */
    val strength: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstanceStrength>?
}

/**
 * MedicinalProductIngredientSpecifiedSubstance
 *
 * A specified substance that comprises this ingredient
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSpecifiedSubstance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
@Serializable
@SerialName("MedicinalProductIngredientSpecifiedSubstance")
data class MedicinalProductIngredientSpecifiedSubstance(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("group")
    override val group: CodeableConcept,

    @SerialName("confidentiality")
    override val confidentiality: CodeableConcept? = null,

    @SerialName("strength")
    override val strength: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstanceStrength>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductIngredientSpecifiedSubstance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductIngredientSpecifiedSubstance"
    }
}

/**
 * FhirMedicinalProductIngredientSpecifiedSubstanceStrength
 *
 * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical
 * product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSpecifiedSubstanceStrength</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
interface FhirMedicinalProductIngredientSpecifiedSubstanceStrength : FhirBackboneElement {

    /**
     * The quantity of substance in the unit of presentation, or in the volume (or
     * mass) of the single pharmaceutical product or manufactured item.
     */
    val presentation: Ratio

    /**
     * A lower limit for the quantity of substance in the unit of presentation. For use
     * when there is a range of strengths, this is the lower limit, with the
     * presentation attribute becoming the upper limit.
     */
    val presentationLowLimit: Ratio?

    /**
     * The strength per unitary volume (or mass).
     */
    val concentration: Ratio?

    /**
     * A lower limit for the strength per unitary volume (or mass), for when there is a
     * range. The concentration attribute then becomes the upper limit.
     */
    val concentrationLowLimit: Ratio?

    /**
     * For when strength is measured at a particular point or distance.
     */
    val measurementPoint: String?

    /**
     * The country or countries for which the strength range applies.
     */
    val country: kotlin.collections.List<CodeableConcept>?

    /**
     * Strength expressed in terms of a reference substance.
     */
    val referenceStrength: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength>?
}

/**
 * MedicinalProductIngredientSpecifiedSubstanceStrength
 *
 * Quantity of the substance or specified substance present in the manufactured item or pharmaceutical
 * product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSpecifiedSubstanceStrength</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
@Serializable
@SerialName("MedicinalProductIngredientSpecifiedSubstanceStrength")
data class MedicinalProductIngredientSpecifiedSubstanceStrength(

    @SerialName("presentation")
    override val presentation: Ratio,

    @SerialName("presentationLowLimit")
    override val presentationLowLimit: Ratio? = null,

    @SerialName("concentration")
    override val concentration: Ratio? = null,

    @SerialName("concentrationLowLimit")
    override val concentrationLowLimit: Ratio? = null,

    @SerialName("measurementPoint")
    override val measurementPoint: String? = null,

    @SerialName("country")
    override val country: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("referenceStrength")
    override val referenceStrength: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductIngredientSpecifiedSubstanceStrength {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductIngredientSpecifiedSubstanceStrength"
    }
}

/**
 * FhirMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength
 *
 * Strength expressed in terms of a reference substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
interface FhirMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength : FhirBackboneElement {

    /**
     * Relevant reference substance.
     */
    val substance: CodeableConcept?

    /**
     * Strength expressed in terms of a reference substance.
     */
    val strength: Ratio

    /**
     * Strength expressed in terms of a reference substance.
     */
    val strengthLowLimit: Ratio?

    /**
     * For when strength is measured at a particular point or distance.
     */
    val measurementPoint: String?

    /**
     * The country or countries for which the strength range applies.
     */
    val country: kotlin.collections.List<CodeableConcept>?
}

/**
 * MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength
 *
 * Strength expressed in terms of a reference substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
@Serializable
@SerialName("MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength")
data class MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength(

    @SerialName("substance")
    override val substance: CodeableConcept? = null,

    @SerialName("strength")
    override val strength: Ratio,

    @SerialName("strengthLowLimit")
    override val strengthLowLimit: Ratio? = null,

    @SerialName("measurementPoint")
    override val measurementPoint: String? = null,

    @SerialName("country")
    override val country: kotlin.collections.List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength"
    }
}

/**
 * FhirMedicinalProductIngredientSubstance
 *
 * The ingredient substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSubstance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
interface FhirMedicinalProductIngredientSubstance : FhirBackboneElement {

    /**
     * The ingredient substance.
     */
    val code: CodeableConcept

    /**
     * Quantity of the substance or specified substance present in the manufactured
     * item or pharmaceutical product.
     */
    val strength: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstanceStrength>?
}

/**
 * MedicinalProductIngredientSubstance
 *
 * The ingredient substance
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient">MedicinalProductIngredientSubstance</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductIngredient)
 */
@Serializable
@SerialName("MedicinalProductIngredientSubstance")
data class MedicinalProductIngredientSubstance(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("strength")
    override val strength: kotlin.collections.List<MedicinalProductIngredientSpecifiedSubstanceStrength>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMedicinalProductIngredientSubstance {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductIngredientSubstance"
    }
}
