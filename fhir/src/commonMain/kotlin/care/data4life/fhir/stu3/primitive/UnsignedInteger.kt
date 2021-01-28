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

interface FhirUnsignedInteger : FhirElement {
    val value: kotlin.Long
}

/**
 * UnsignedInteger
 *
 *
 * Any unsinged integer (e.g. >= 0)
 *
 * WARNING: Due to use of kotlin.Long the max value is limited to 9_223_372_036_854_775_807
 *
 * Regex: +?[1-9][0-9]*
 *
 *
 * @see [unsignedInt](http://hl7.org/fhir/STU3/datatypes.html#unsignedInt)
 *
 *
 * Constructor
 *
 * @param value Int
 */
@Serializable
@SerialName("UnsignedInt")
data class UnsignedInteger(
    // TODO could be replaced by kotlin.UInt when not experimental anymore (last check 2021-01-28)
    override val value: kotlin.Long,

    // # Element
    // Additional Content defined by implementations.
    override val extension: List<Extension>? = null,
    // xml:id (or equivalent in JSON).
    override val id: String? = null
) : FhirUnsignedInteger {

    init {
        require(value >= 0) { "not an unsigned integer >= 0" }
    }

    override val resourceType: kotlin.String
        get() = resourceType()


    @Serializer(forClass = UnsignedInteger::class)
    companion object : KSerializer<UnsignedInteger> {

        @JvmStatic
        fun resourceType(): kotlin.String = "UnsignedInt"

        override fun deserialize(decoder: Decoder): UnsignedInteger {
            val value = decoder.decodeLong()

            //TODO deserialize extensions and id

            return UnsignedInteger(value)
        }

        override fun serialize(encoder: Encoder, value: UnsignedInteger) {
            encoder.encodeLong(value.value)

            //TODO serialize extensions and id
        }
    }
}
