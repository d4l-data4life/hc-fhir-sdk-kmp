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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirMoney
 *
 * An amount of economic utility in some recognized currency
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Money">Money</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Money)
 */
interface FhirMoney : FhirElement {

    /**
     * Numerical value (with implicit precision).
     */
    val value: Decimal?

    /**
     * ISO 4217 Currency Code.
     */
    val currency: String?
}

/**
 * Money
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

    @SerialName("value")
    override val value: Decimal? = null,

    @SerialName("currency")
    override val currency: String? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirMoney {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Money"
    }
}
