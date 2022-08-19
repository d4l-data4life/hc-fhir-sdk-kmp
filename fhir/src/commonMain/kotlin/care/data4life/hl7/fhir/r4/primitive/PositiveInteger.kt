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

package care.data4life.hl7.fhir.r4.primitive

import care.data4life.hl7.fhir.r4.model.Extension
import care.data4life.hl7.fhir.r4.model.FhirElement
import kotlin.jvm.JvmStatic
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

interface FhirPositiveInteger : FhirElement {
    val value: kotlin.Long
}

/**
 * PositiveInteger
 *
 *
 * Any positive integer (e.g. >= 1)
 *
 * WARNING: Due to use of kotlin.Long the max value is limited to 9_223_372_036_854_775_807
 *
 * Regex: +?[1-9][0-9]*
 *
 *
 * @see [positiveInt](http://hl7.org/fhir/R4/datatypes.html#positiveInt)
 *
 *
 * Constructor
 *
 * @param value Int
 */
@Serializable(with = PositiveIntegerSerializer::class)
@SerialName("PositiveInteger")
data class PositiveInteger(
    // TODO could be replaced by kotlin.UInt when not experimental anymore (last check 2021-01-28)
    override val value: kotlin.Long,

    // FhirElement
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPositiveInteger {

    init {
        require(value >= 1) { "not a positive integer >= 1" }
    }

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PositiveInteger"
    }
}

object PositiveIntegerSerializer : KSerializer<PositiveInteger> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("PositiveInteger")

    override fun deserialize(decoder: Decoder): PositiveInteger {
        val value = decoder.decodeLong()

        // TODO deserialize extensions and id

        return PositiveInteger(value)
    }

    override fun serialize(encoder: Encoder, value: PositiveInteger) {
        encoder.encodeLong(value.value)

        // TODO serialize extensions and id
    }
}
