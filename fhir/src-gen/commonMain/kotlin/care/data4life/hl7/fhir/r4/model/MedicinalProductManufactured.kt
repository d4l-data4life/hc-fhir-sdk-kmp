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

import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMedicinalProductManufactured
 *
 * The manufactured item as contained in the packaged medicinal product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured">MedicinalProductManufactured</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured)
 */
interface FhirMedicinalProductManufactured : FhirDomainResource {

    /**
     * Dose form as manufactured and before any transformation into the pharmaceutical
     * product.
     */
    val manufacturedDoseForm: CodeableConcept

    /**
     * The “real world” units in which the quantity of the manufactured item is
     * described.
     */
    val unitOfPresentation: CodeableConcept?

    /**
     * The quantity or "count number" of the manufactured item.
     */
    val quantity: Quantity

    /**
     * Manufacturer of the item (Note that this should be named "manufacturer" but it
     * currently causes technical issues).
     */
    val manufacturer: kotlin.collections.List<Reference>?

    /**
     * Ingredient.
     */
    val ingredient: kotlin.collections.List<Reference>?

    /**
     * Dimensions, color etc..
     */
    val physicalCharacteristics: ProdCharacteristic?

    /**
     * Other codeable characteristics.
     */
    val otherCharacteristics: kotlin.collections.List<CodeableConcept>?
}

/**
 * MedicinalProductManufactured
 *
 * The manufactured item as contained in the packaged medicinal product
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured">MedicinalProductManufactured</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/MedicinalProductManufactured)
 */
@Serializable
@SerialName("MedicinalProductManufactured")
data class MedicinalProductManufactured(

    @SerialName("manufacturedDoseForm")
    override val manufacturedDoseForm: CodeableConcept,

    @SerialName("unitOfPresentation")
    override val unitOfPresentation: CodeableConcept? = null,

    @SerialName("quantity")
    override val quantity: Quantity,

    @SerialName("manufacturer")
    override val manufacturer: kotlin.collections.List<Reference>? = null,

    @SerialName("ingredient")
    override val ingredient: kotlin.collections.List<Reference>? = null,

    @SerialName("physicalCharacteristics")
    override val physicalCharacteristics: ProdCharacteristic? = null,

    @SerialName("otherCharacteristics")
    override val otherCharacteristics: kotlin.collections.List<CodeableConcept>? = null,

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
) : FhirMedicinalProductManufactured {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "MedicinalProductManufactured"
    }
}
