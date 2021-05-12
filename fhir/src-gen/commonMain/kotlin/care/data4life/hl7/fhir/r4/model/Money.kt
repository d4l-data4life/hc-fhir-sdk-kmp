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

import care.data4life.hl7.fhir.r4.primitive.Decimal
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirMoney : FhirElement {

    // Numerical value (with implicit precision).
    val value: Decimal?

    // ISO 4217 Currency Code.
    val currency: String?
}

/**
 * ClassName: Money
 *
 * SourceFileName: Money.kt
 *
 * An amount of economic utility in some recognized currency
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Money">Money</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Money)
 */
@Serializable
@SerialName("Money")
data class Money(

    // Numerical value (with implicit precision).
    @SerialName("value")
    override val value: Decimal? = null,

    // ISO 4217 Currency Code.
    @SerialName("currency")
    override val currency: String? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirMoney {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Money"
    }
}
