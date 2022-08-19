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
 * FhirProductShelfLife
 *
 * The shelf-life and storage information for a medicinal product item or container can be described
 * using this class
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProductShelfLife">ProductShelfLife</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ProductShelfLife)
 */
interface FhirProductShelfLife : FhirBackboneElement {

    /**
     * Unique identifier for the packaged Medicinal Product.
     */
    val identifier: Identifier?

    /**
     * This describes the shelf life, taking into account various scenarios such as
     * shelf life of the packaged Medicinal Product itself, shelf life after
     * transformation where necessary and shelf life after the first opening of a
     * bottle, etc. The shelf life type shall be specified using an appropriate
     * controlled vocabulary The controlled term and the controlled term identifier
     * shall be specified.
     */
    val type: CodeableConcept

    /**
     * The shelf life time period can be specified using a numerical value for the
     * period of time and its unit of time measurement The unit of measurement shall be
     * specified in accordance with ISO 11240 and the resulting terminology The symbol
     * and the symbol identifier shall be used.
     */
    val period: Quantity

    /**
     * Special precautions for storage, if any, can be specified using an appropriate
     * controlled vocabulary The controlled term and the controlled term identifier
     * shall be specified.
     */
    val specialPrecautionsForStorage: kotlin.collections.List<CodeableConcept>?
}

/**
 * ProductShelfLife
 *
 * The shelf-life and storage information for a medicinal product item or container can be described
 * using this class
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProductShelfLife">ProductShelfLife</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ProductShelfLife)
 */
@Serializable
@SerialName("ProductShelfLife")
data class ProductShelfLife(

    @SerialName("identifier")
    override val identifier: Identifier? = null,

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("period")
    override val period: Quantity,

    @SerialName("specialPrecautionsForStorage")
    override val specialPrecautionsForStorage: kotlin.collections.List<CodeableConcept>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirProductShelfLife {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ProductShelfLife"
    }
}
