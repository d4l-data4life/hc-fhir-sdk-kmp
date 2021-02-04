/*
 * Copyright (c) 2021. D4L data4life gGmbH / All rights reserved.
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

package care.data4life.fhir.stu3.primitive

import care.data4life.fhir.stu3.model.Extension
import care.data4life.fhir.stu3.model.FhirElement
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.jvm.JvmStatic

interface FhirDecimal : FhirElement {
    val value: kotlin.Double
}

/**
 * Decimal
 *
 *
 * Rational numbers that have a decimal representation.
 *
 * The precision of the decimal value has significance:
 *
 *  * e.g. 0.010 is regarded as different to 0.01, and the original precision should be
 * preserved
 *
 * WARNING: Due to use of kotlin.Double the max precision is not available
 *
 *
 * @see [Decimal](http://hl7.org/fhir/STU3/datatypes.html#decimal)
 *
 *
 * Constructor
 *
 * @param value kotlin.Double
 */
@Serializable
@SerialName("Decimal")
data class Decimal(
    // TODO use BigDecimal for necessary precision
    override val value: kotlin.Double,

    // FhirElement
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDecimal {

    override val resourceType: kotlin.String
        get() = resourceType()


    @Serializer(forClass = Decimal::class)
    companion object : KSerializer<Decimal> {

        @JvmStatic
        fun resourceType(): kotlin.String = "Decimal"

        override fun deserialize(decoder: Decoder): Decimal {
            val value = decoder.decodeDouble()

            //TODO deserialize extensions and id

            return Decimal(value)
        }

        override fun serialize(encoder: Encoder, value: Decimal) {
            encoder.encodeDouble(value.value)

            //TODO serialize extensions and id
        }
    }
}

