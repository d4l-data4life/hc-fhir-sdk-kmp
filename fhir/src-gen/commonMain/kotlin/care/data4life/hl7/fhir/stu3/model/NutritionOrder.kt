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

import care.data4life.hl7.fhir.stu3.codesystem.NutritionOrderStatus
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirNutritionOrder
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
 * patient/resident.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrder</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
interface FhirNutritionOrder : FhirDomainResource {

    /**
     * Identifiers assigned to this order.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * The workflow status of the nutrition order/request.
     */
    val status: NutritionOrderStatus?

    /**
     * The person who requires the diet, formula or nutritional supplement.
     */
    val patient: Reference

    /**
     * The encounter associated with this nutrition order.
     */
    val encounter: Reference?

    /**
     * Date and time the nutrition order was requested.
     */
    val dateTime: DateTime

    /**
     * Who ordered the diet, formula or nutritional supplement.
     */
    val orderer: Reference?

    /**
     * List of the patient's food and nutrition-related allergies and intolerances.
     */
    val allergyIntolerance: kotlin.collections.List<Reference>?

    /**
     * Order-specific modifier about the type of food that should be given.
     */
    val foodPreferenceModifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Order-specific modifier about the type of food that should not be given.
     */
    val excludeFoodModifier: kotlin.collections.List<CodeableConcept>?

    /**
     * Oral diet components.
     */
    val oralDiet: NutritionOrderOralDiet?

    /**
     * Supplement components.
     */
    val supplement: kotlin.collections.List<NutritionOrderSupplement>?

    /**
     * Enteral formula components.
     */
    val enteralFormula: NutritionOrderEnteralFormula?
}

/**
 * NutritionOrder
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
 * patient/resident.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrder</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
@Serializable
@SerialName("NutritionOrder")
data class NutritionOrder(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("status")
    override val status: NutritionOrderStatus? = null,

    @SerialName("patient")
    override val patient: Reference,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("dateTime")
    override val dateTime: DateTime,

    @SerialName("orderer")
    override val orderer: Reference? = null,

    @SerialName("allergyIntolerance")
    override val allergyIntolerance: kotlin.collections.List<Reference>? = null,

    @SerialName("foodPreferenceModifier")
    override val foodPreferenceModifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("excludeFoodModifier")
    override val excludeFoodModifier: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("oralDiet")
    override val oralDiet: NutritionOrderOralDiet? = null,

    @SerialName("supplement")
    override val supplement: kotlin.collections.List<NutritionOrderSupplement>? = null,

    @SerialName("enteralFormula")
    override val enteralFormula: NutritionOrderEnteralFormula? = null,

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
) : FhirNutritionOrder {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NutritionOrder"
    }
}

/**
 * FhirNutritionOrderEnteralFormula
 *
 * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers
 * nutrition distal to the oral cavity.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderEnteralFormula</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
interface FhirNutritionOrderEnteralFormula : FhirBackboneElement {

    /**
     * Type of enteral or infant formula.
     */
    val baseFormulaType: CodeableConcept?

    /**
     * Product or brand name of the enteral or infant formula.
     */
    val baseFormulaProductName: String?

    /**
     * Type of modular component to add to the feeding.
     */
    val additiveType: CodeableConcept?

    /**
     * Product or brand name of the modular additive.
     */
    val additiveProductName: String?

    /**
     * Amount of energy per specified volume that is required.
     */
    val caloricDensity: Quantity?

    /**
     * How the formula should enter the patient's gastrointestinal tract.
     */
    val routeofAdministration: CodeableConcept?

    /**
     * Formula feeding instruction as structured data.
     */
    val administration: kotlin.collections.List<NutritionOrderEnteralFormulaAdministration>?

    /**
     * Upper limit on formula volume per unit of time.
     */
    val maxVolumeToDeliver: Quantity?

    /**
     * Formula feeding instructions expressed as text.
     */
    val administrationInstruction: String?
}

/**
 * NutritionOrderEnteralFormula
 *
 * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers
 * nutrition distal to the oral cavity.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderEnteralFormula</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
@Serializable
@SerialName("NutritionOrderEnteralFormula")
data class NutritionOrderEnteralFormula(

    @SerialName("baseFormulaType")
    override val baseFormulaType: CodeableConcept? = null,

    @SerialName("baseFormulaProductName")
    override val baseFormulaProductName: String? = null,

    @SerialName("additiveType")
    override val additiveType: CodeableConcept? = null,

    @SerialName("additiveProductName")
    override val additiveProductName: String? = null,

    @SerialName("caloricDensity")
    override val caloricDensity: Quantity? = null,

    @SerialName("routeofAdministration")
    override val routeofAdministration: CodeableConcept? = null,

    @SerialName("administration")
    override val administration: kotlin.collections.List<NutritionOrderEnteralFormulaAdministration>? = null,

    @SerialName("maxVolumeToDeliver")
    override val maxVolumeToDeliver: Quantity? = null,

    @SerialName("administrationInstruction")
    override val administrationInstruction: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNutritionOrderEnteralFormula {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NutritionOrderEnteralFormula"
    }
}

/**
 * FhirNutritionOrderEnteralFormulaAdministration
 *
 * Formula administration instructions as structured data. This repeating structure allows for changing
 * the administration rate or volume over time for both bolus and continuous feeding. An example of
 * this would be an instruction to increase the rate of continuous feeding every 2 hours.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderEnteralFormulaAdministration</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
interface FhirNutritionOrderEnteralFormulaAdministration : FhirBackboneElement {

    /**
     * Scheduled frequency of enteral feeding.
     */
    val schedule: Timing?

    /**
     * The volume of formula to provide.
     */
    val quantity: Quantity?

    /**
     * Speed with which the formula is provided per period of time.
     */
    val rateQuantity: Quantity?

    /**
     * Speed with which the formula is provided per period of time.
     */
    val rateRatio: Ratio?
}

/**
 * NutritionOrderEnteralFormulaAdministration
 *
 * Formula administration instructions as structured data. This repeating structure allows for changing
 * the administration rate or volume over time for both bolus and continuous feeding. An example of
 * this would be an instruction to increase the rate of continuous feeding every 2 hours.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderEnteralFormulaAdministration</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
@Serializable
@SerialName("NutritionOrderEnteralFormulaAdministration")
data class NutritionOrderEnteralFormulaAdministration(

    @SerialName("schedule")
    override val schedule: Timing? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("rateQuantity")
    override val rateQuantity: Quantity? = null,

    @SerialName("rateRatio")
    override val rateRatio: Ratio? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNutritionOrderEnteralFormulaAdministration {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NutritionOrderEnteralFormulaAdministration"
    }
}

/**
 * FhirNutritionOrderOralDiet
 *
 * Diet given orally in contrast to enteral (tube) feeding.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderOralDiet</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
interface FhirNutritionOrderOralDiet : FhirBackboneElement {

    /**
     * Type of oral diet or diet restrictions that describe what can be consumed orally.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Scheduled frequency of diet.
     */
    val schedule: kotlin.collections.List<Timing>?

    /**
     * Required nutrient modifications.
     */
    val nutrient: kotlin.collections.List<NutritionOrderOralDietNutrient>?

    /**
     * Required texture modifications.
     */
    val texture: kotlin.collections.List<NutritionOrderOralDietTexture>?

    /**
     * The required consistency of fluids and liquids provided to the patient.
     */
    val fluidConsistencyType: kotlin.collections.List<CodeableConcept>?

    /**
     * Instructions or additional information about the oral diet.
     */
    val instruction: String?
}

/**
 * NutritionOrderOralDiet
 *
 * Diet given orally in contrast to enteral (tube) feeding.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderOralDiet</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
@Serializable
@SerialName("NutritionOrderOralDiet")
data class NutritionOrderOralDiet(

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("schedule")
    override val schedule: kotlin.collections.List<Timing>? = null,

    @SerialName("nutrient")
    override val nutrient: kotlin.collections.List<NutritionOrderOralDietNutrient>? = null,

    @SerialName("texture")
    override val texture: kotlin.collections.List<NutritionOrderOralDietTexture>? = null,

    @SerialName("fluidConsistencyType")
    override val fluidConsistencyType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("instruction")
    override val instruction: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNutritionOrderOralDiet {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NutritionOrderOralDiet"
    }
}

/**
 * FhirNutritionOrderOralDietNutrient
 *
 * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber
 * or sodium) required for the oral diet.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderOralDietNutrient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
interface FhirNutritionOrderOralDietNutrient : FhirBackboneElement {

    /**
     * Type of nutrient that is being modified.
     */
    val modifier: CodeableConcept?

    /**
     * Quantity of the specified nutrient.
     */
    val amount: Quantity?
}

/**
 * NutritionOrderOralDietNutrient
 *
 * Class that defines the quantity and type of nutrient modifications (for example carbohydrate, fiber
 * or sodium) required for the oral diet.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderOralDietNutrient</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
@Serializable
@SerialName("NutritionOrderOralDietNutrient")
data class NutritionOrderOralDietNutrient(

    @SerialName("modifier")
    override val modifier: CodeableConcept? = null,

    @SerialName("amount")
    override val amount: Quantity? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNutritionOrderOralDietNutrient {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NutritionOrderOralDietNutrient"
    }
}

/**
 * FhirNutritionOrderOralDietTexture
 *
 * Class that describes any texture modifications required for the patient to safely consume various
 * types of solid foods.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderOralDietTexture</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
interface FhirNutritionOrderOralDietTexture : FhirBackboneElement {

    /**
     * Code to indicate how to alter the texture of the foods, e.g. pureed.
     */
    val modifier: CodeableConcept?

    /**
     * Concepts that are used to identify an entity that is ingested for nutritional
     * purposes.
     */
    val foodType: CodeableConcept?
}

/**
 * NutritionOrderOralDietTexture
 *
 * Class that describes any texture modifications required for the patient to safely consume various
 * types of solid foods.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderOralDietTexture</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
@Serializable
@SerialName("NutritionOrderOralDietTexture")
data class NutritionOrderOralDietTexture(

    @SerialName("modifier")
    override val modifier: CodeableConcept? = null,

    @SerialName("foodType")
    override val foodType: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNutritionOrderOralDietTexture {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NutritionOrderOralDietTexture"
    }
}

/**
 * FhirNutritionOrderSupplement
 *
 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderSupplement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
interface FhirNutritionOrderSupplement : FhirBackboneElement {

    /**
     * Type of supplement product requested.
     */
    val type: CodeableConcept?

    /**
     * Product or brand name of the nutritional supplement.
     */
    val productName: String?

    /**
     * Scheduled frequency of supplement.
     */
    val schedule: kotlin.collections.List<Timing>?

    /**
     * Amount of the nutritional supplement.
     */
    val quantity: Quantity?

    /**
     * Instructions or additional information about the oral supplement.
     */
    val instruction: String?
}

/**
 * NutritionOrderSupplement
 *
 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/NutritionOrder">NutritionOrderSupplement</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/NutritionOrder)
 */
@Serializable
@SerialName("NutritionOrderSupplement")
data class NutritionOrderSupplement(

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("productName")
    override val productName: String? = null,

    @SerialName("schedule")
    override val schedule: kotlin.collections.List<Timing>? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("instruction")
    override val instruction: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirNutritionOrderSupplement {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "NutritionOrderSupplement"
    }
}
