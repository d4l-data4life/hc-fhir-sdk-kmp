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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirRatio
 *
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Ratio">Ratio</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Ratio)
 */
interface FhirRatio : FhirElement {

    /**
     * Numerator value.
     */
    val numerator: Quantity?

    /**
     * Denominator value.
     */
    val denominator: Quantity?
}

/**
 * Ratio
 *
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Ratio">Ratio</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Ratio)
 */
@Serializable
@SerialName("Ratio")
data class Ratio(

    @SerialName("numerator")
    override val numerator: Quantity? = null,

    @SerialName("denominator")
    override val denominator: Quantity? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRatio {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Ratio"
    }
}
