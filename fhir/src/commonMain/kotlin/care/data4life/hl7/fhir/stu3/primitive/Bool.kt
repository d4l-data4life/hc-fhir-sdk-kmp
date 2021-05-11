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

package care.data4life.hl7.fhir.stu3.primitive

import care.data4life.hl7.fhir.stu3.model.Extension
import care.data4life.hl7.fhir.stu3.model.FhirElement
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.jvm.JvmStatic

interface FhirBool : FhirElement {
    val value: kotlin.Boolean
}

/**
 * Bool
 *
 *
 * true | false
 *
 *
 * @see [boolean](http://hl7.org/fhir/STU3/datatypes.html#boolean)
 *
 *
 * Constructor
 *
 * @param value Boolean
 */
@Serializable(with = BoolSerializer::class)
@SerialName("Bool")
data class Bool(
    override val value: kotlin.Boolean,

    // FhirElement
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirBool {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Bool"
    }
}

object BoolSerializer : KSerializer<Bool> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Bool")

    override fun deserialize(decoder: Decoder): Bool {
        val value = decoder.decodeBoolean()

        //TODO deserialize extensions and id

        return Bool(value)
    }

    override fun serialize(encoder: Encoder, value: Bool) {
        encoder.encodeBoolean(value.value)

        //TODO serialize extensions and id
    }
}
