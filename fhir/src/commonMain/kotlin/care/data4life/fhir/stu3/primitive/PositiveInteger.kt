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

interface FhirPositiveInteger : FhirElement {
    val value: Int
}

/**
 * PositiveInteger
 *
 *
 * Any positive 32-bit integer (e.g. >= 1)
 *
 * Due to use of kotlin.Int the max value is limited to 2_147_483_647
 *
 * Regex: +?[1-9][0-9]*
 *
 *
 * @see [positiveInt](http://hl7.org/fhir/STU3/datatypes.html#positiveInt)
 *
 *
 * Constructor
 *
 * @param value Int
 */
@Serializable
@SerialName("PositiveInt")
data class PositiveInteger(
    override val value: kotlin.Int,

    // # Element
    // Additional Content defined by implementations.
    override val extension: List<Extension>? = null,
    // xml:id (or equivalent in JSON).
    override val id: kotlin.String? = null
) : FhirPositiveInteger {

    init {
        require(value >= 1) { "not a positive integer >= 1" }
    }

    override val resourceType: kotlin.String
        get() = resourceType()


    @Serializer(forClass = PositiveInteger::class)
    companion object : KSerializer<PositiveInteger> {

        @JvmStatic
        fun resourceType(): kotlin.String = "PositiveInt"

        override fun deserialize(decoder: Decoder): PositiveInteger {
            val value = decoder.decodeInt()

            //TODO deserialize extensions and id

            return PositiveInteger(value)
        }

        override fun serialize(encoder: Encoder, value: PositiveInteger) {
            encoder.encodeInt(value.value)

            //TODO serialize extensions and id
        }
    }
}
