package care.data4life.fhir.stu3.primitives

import care.data4life.fhir.stu3.model.Extension
import care.data4life.fhir.stu3.model.FhirElement
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.jvm.JvmStatic

@OptIn(ExperimentalUnsignedTypes::class)
interface FhirPInteger : FhirElement {
    val value: UInt
}

@OptIn(ExperimentalUnsignedTypes::class)
@Serializable
@SerialName("positiveInt")
data class PInteger(
    override val value: UInt,

    // # Element
    // Additional Content defined by implementations.
    override val extension: List<Extension>? = null,
    // xml:id (or equivalent in JSON).
    override val id: String? = null
) : FhirUInteger {
    init {
        require((1u..2_147_483_647u).contains(value)) {
            "Failed requirement: (1u..2_147_483_647u).contains($value)"
        }
    }
    override val resourceType: kotlin.String
        get() = resourceType()


    @Serializer(forClass = PInteger::class)
    companion object : KSerializer<PInteger> {

        @JvmStatic
        fun resourceType(): kotlin.String = "positiveInt"

        override fun deserialize(decoder: Decoder): PInteger {
            val value = decoder.decodeInt().toUInt()

            //TODO deserialize extensions and id

            return PInteger(value)
        }
        override fun serialize(encoder: Encoder, value: PInteger) {
            encoder.encodeInt(value.value.toInt())

            //TODO serialize extensions and id
        }
    }
}
