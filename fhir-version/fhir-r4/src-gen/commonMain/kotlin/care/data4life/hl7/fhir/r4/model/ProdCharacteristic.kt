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
 * FhirProdCharacteristic
 *
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProdCharacteristic">ProdCharacteristic</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ProdCharacteristic)
 */
interface FhirProdCharacteristic : FhirBackboneElement {

    /**
     * Where applicable, the height can be specified using a numerical value and its
     * unit of measurement The unit of measurement shall be specified in accordance
     * with ISO 11240 and the resulting terminology The symbol and the symbol
     * identifier shall be used.
     */
    val height: Quantity?

    /**
     * Where applicable, the width can be specified using a numerical value and its
     * unit of measurement The unit of measurement shall be specified in accordance
     * with ISO 11240 and the resulting terminology The symbol and the symbol
     * identifier shall be used.
     */
    val width: Quantity?

    /**
     * Where applicable, the depth can be specified using a numerical value and its
     * unit of measurement The unit of measurement shall be specified in accordance
     * with ISO 11240 and the resulting terminology The symbol and the symbol
     * identifier shall be used.
     */
    val depth: Quantity?

    /**
     * Where applicable, the weight can be specified using a numerical value and its
     * unit of measurement The unit of measurement shall be specified in accordance
     * with ISO 11240 and the resulting terminology The symbol and the symbol
     * identifier shall be used.
     */
    val weight: Quantity?

    /**
     * Where applicable, the nominal volume can be specified using a numerical value
     * and its unit of measurement The unit of measurement shall be specified in
     * accordance with ISO 11240 and the resulting terminology The symbol and the
     * symbol identifier shall be used.
     */
    val nominalVolume: Quantity?

    /**
     * Where applicable, the external diameter can be specified using a numerical value
     * and its unit of measurement The unit of measurement shall be specified in
     * accordance with ISO 11240 and the resulting terminology The symbol and the
     * symbol identifier shall be used.
     */
    val externalDiameter: Quantity?

    /**
     * Where applicable, the shape can be specified An appropriate controlled
     * vocabulary shall be used The term and the term identifier shall be used.
     */
    val shape: String?

    /**
     * Where applicable, the color can be specified An appropriate controlled
     * vocabulary shall be used The term and the term identifier shall be used.
     */
    val color: kotlin.collections.List<String>?

    /**
     * Where applicable, the imprint can be specified as text.
     */
    val imprint: kotlin.collections.List<String>?

    /**
     * Where applicable, the image can be provided The format of the image attachment
     * shall be specified by regional implementations.
     */
    val image: kotlin.collections.List<Attachment>?

    /**
     * Where applicable, the scoring can be specified An appropriate controlled
     * vocabulary shall be used The term and the term identifier shall be used.
     */
    val scoring: CodeableConcept?
}

/**
 * ProdCharacteristic
 *
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ProdCharacteristic">ProdCharacteristic</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ProdCharacteristic)
 */
@Serializable
@SerialName("ProdCharacteristic")
data class ProdCharacteristic(

    @SerialName("height")
    override val height: Quantity? = null,

    @SerialName("width")
    override val width: Quantity? = null,

    @SerialName("depth")
    override val depth: Quantity? = null,

    @SerialName("weight")
    override val weight: Quantity? = null,

    @SerialName("nominalVolume")
    override val nominalVolume: Quantity? = null,

    @SerialName("externalDiameter")
    override val externalDiameter: Quantity? = null,

    @SerialName("shape")
    override val shape: String? = null,

    @SerialName("color")
    override val color: kotlin.collections.List<String>? = null,

    @SerialName("imprint")
    override val imprint: kotlin.collections.List<String>? = null,

    @SerialName("image")
    override val image: kotlin.collections.List<Attachment>? = null,

    @SerialName("scoring")
    override val scoring: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirProdCharacteristic {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ProdCharacteristic"
    }
}
