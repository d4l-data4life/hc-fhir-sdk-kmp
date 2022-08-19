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
 * FhirSubstanceAmount
 *
 * Chemical substances are a single substance type whose primary defining element is the molecular
 * structure. Chemical substances shall be defined on the basis of their complete covalent molecular
 * structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured.
 * Purity, grade, physical form or particle size are not taken into account in the definition of a
 * chemical substance or in the assignment of a Substance ID
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceAmount">SubstanceAmount</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceAmount)
 */
interface FhirSubstanceAmount : FhirBackboneElement {

    /**
     * Used to capture quantitative values for a variety of elements. If only limits
     * are given, the arithmetic mean would be the average. If only a single definite
     * value for a given element is given, it would be captured in this field.
     */
    val amountQuantity: Quantity?

    /**
     * Used to capture quantitative values for a variety of elements. If only limits
     * are given, the arithmetic mean would be the average. If only a single definite
     * value for a given element is given, it would be captured in this field.
     */
    val amountRange: Range?

    /**
     * Used to capture quantitative values for a variety of elements. If only limits
     * are given, the arithmetic mean would be the average. If only a single definite
     * value for a given element is given, it would be captured in this field.
     */
    val amountString: String?

    /**
     * Most elements that require a quantitative value will also have a field called
     * amount type. Amount type should always be specified because the actual value of
     * the amount is often dependent on it. EXAMPLE: In capturing the actual relative
     * amounts of substances or molecular fragments it is essential to indicate whether
     * the amount refers to a mole ratio or weight ratio. For any given element an
     * effort should be made to use same the amount type for all related definitional
     * elements.
     */
    val amountType: CodeableConcept?

    /**
     * A textual comment on a numeric value.
     */
    val amountText: String?

    /**
     * Reference range of possible or expected values.
     */
    val referenceRange: SubstanceAmountReferenceRange?
}

/**
 * SubstanceAmount
 *
 * Chemical substances are a single substance type whose primary defining element is the molecular
 * structure. Chemical substances shall be defined on the basis of their complete covalent molecular
 * structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured.
 * Purity, grade, physical form or particle size are not taken into account in the definition of a
 * chemical substance or in the assignment of a Substance ID
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceAmount">SubstanceAmount</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceAmount)
 */
@Serializable
@SerialName("SubstanceAmount")
data class SubstanceAmount(

    @SerialName("amountQuantity")
    override val amountQuantity: Quantity? = null,

    @SerialName("amountRange")
    override val amountRange: Range? = null,

    @SerialName("amountString")
    override val amountString: String? = null,

    @SerialName("amountType")
    override val amountType: CodeableConcept? = null,

    @SerialName("amountText")
    override val amountText: String? = null,

    @SerialName("referenceRange")
    override val referenceRange: SubstanceAmountReferenceRange? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceAmount {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceAmount"
    }
}

/**
 * FhirSubstanceAmountReferenceRange
 *
 * Reference range of possible or expected values
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceAmount">SubstanceAmountReferenceRange</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceAmount)
 */
interface FhirSubstanceAmountReferenceRange : FhirElement {

    /**
     * Lower limit possible or expected.
     */
    val lowLimit: Quantity?

    /**
     * Upper limit possible or expected.
     */
    val highLimit: Quantity?
}

/**
 * SubstanceAmountReferenceRange
 *
 * Reference range of possible or expected values
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/SubstanceAmount">SubstanceAmountReferenceRange</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/SubstanceAmount)
 */
@Serializable
@SerialName("SubstanceAmountReferenceRange")
data class SubstanceAmountReferenceRange(

    @SerialName("lowLimit")
    override val lowLimit: Quantity? = null,

    @SerialName("highLimit")
    override val highLimit: Quantity? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirSubstanceAmountReferenceRange {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "SubstanceAmountReferenceRange"
    }
}
