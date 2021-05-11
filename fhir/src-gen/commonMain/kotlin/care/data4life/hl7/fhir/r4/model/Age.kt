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

import care.data4life.hl7.fhir.r4.codesystem.QuantityComparator
import care.data4life.hl7.fhir.r4.primitive.Decimal
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirAge : FhirQuantity

/**
 * ClassName: Age
 *
 * SourceFileName: Age.kt
 *
 *
 * A duration of time during which an organism (or a process) has existed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Age">Age</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Age)
 */
@Serializable
@SerialName("Age")
data class Age(

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
    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirAge {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Age"
    }
}
