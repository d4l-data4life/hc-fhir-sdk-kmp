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
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirCount : FhirQuantity

/**
 * ClassName: Count
 *
 * SourceFileName: Count.kt
 *
 *
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Count">Count</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Count)
 */
@Serializable
@SerialName("Count")
data class Count(

    // # Quantity
    // Numerical value (with implicit precision).
    @SerialName("value")
    override val value: Decimal? = null,
    // How the value should be understood and represented - whether the actual value is greater or less than the stated value due to measurement issues; e.g. if the comparator is "<" , then the real value is < stated value.
    @SerialName("comparator")
    override val comparator: QuantityComparator? = null,
    // Unit representation.
    @SerialName("unit")
    override val unit: String? = null,
    // System that defines coded unit form.
    @SerialName("system")
    override val system: String? = null,
    // Coded form of the unit.
    @SerialName("code")
    override val code: String? = null,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirCount {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Count"
    }
}
