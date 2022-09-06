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
 * FhirRange
 *
 * A set of ordered Quantities defined by a low and high limit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Range">Range</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Range)
 */
interface FhirRange : FhirElement {

    /**
     * Low limit.
     */
    val low: Quantity?

    /**
     * High limit.
     */
    val high: Quantity?
}

/**
 * Range
 *
 * A set of ordered Quantities defined by a low and high limit.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Range">Range</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Range)
 */
@Serializable
@SerialName("Range")
data class Range(

    @SerialName("low")
    override val low: Quantity? = null,

    @SerialName("high")
    override val high: Quantity? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRange {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Range"
    }
}
