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

import care.data4life.hl7.fhir.stu3.codesystem.QuantityComparator
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirQuantity
 *
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts
 * include amounts that are not precisely quantified, including amounts involving arbitrary units and
 * floating currencies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Quantity">Quantity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Quantity)
 */
interface FhirQuantity : FhirElement {

    /**
     * Numerical value (with implicit precision).
     */
    val value: Decimal?

    /**
     * How the value should be understood and represented - whether the actual value is
     * greater or less than the stated value due to measurement issues; e.g. if the
     * comparator is "<" , then the real value is < stated value.
     */
    val comparator: QuantityComparator?

    /**
     * Unit representation.
     */
    val unit: String?

    /**
     * System that defines coded unit form.
     */
    val system: String?

    /**
     * Coded form of the unit.
     */
    val code: String?
}

/**
 * Quantity
 *
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts
 * include amounts that are not precisely quantified, including amounts involving arbitrary units and
 * floating currencies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Quantity">Quantity</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Quantity)
 */
@Serializable
@SerialName("Quantity")
data class Quantity(

    @SerialName("value")
    override val value: Decimal? = null,

    @SerialName("comparator")
    override val comparator: QuantityComparator? = null,

    @SerialName("unit")
    override val unit: String? = null,

    @SerialName("system")
    override val system: String? = null,

    @SerialName("code")
    override val code: String? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirQuantity {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Quantity"
    }
}
