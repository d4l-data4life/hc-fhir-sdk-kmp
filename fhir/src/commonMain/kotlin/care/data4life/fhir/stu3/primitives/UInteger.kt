/*
 * BSD 3-Clause License
 *
 * Copyright (c) 2020, D4L data4life gGmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 *  Neither the name of the copyright holder nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package care.data4life.fhir.stu3.primitives

import care.data4life.fhir.stu3.model.Extension
import care.data4life.fhir.stu3.model.FhirElement
import kotlinx.serialization.*
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.jvm.JvmStatic

@OptIn(ExperimentalUnsignedTypes::class)
interface FhirUInteger : FhirElement {
   val value: UInt
}

@OptIn(ExperimentalUnsignedTypes::class)
@Serializable
@SerialName("unsignedInt")
data class UInteger(
    override val value: UInt,

    // # Element
    // Additional Content defined by implementations.
    override val extension: List<Extension>? = null,
    // xml:id (or equivalent in JSON).
    override val id: String? = null
) : FhirUInteger {
    init {
        require((0u..2_147_483_647u).contains(value)) {
            "Failed requirement: (0u..2_147_483_647u).contains($value)"
        }
    }
    override val resourceType: kotlin.String
        get() = resourceType()


    @Serializer(forClass = UInteger::class)
    companion object : KSerializer<UInteger> {

        @JvmStatic
        fun resourceType(): kotlin.String = "unsignedInt"

        override fun deserialize(decoder: Decoder): UInteger {
            val value = decoder.decodeInt().toUInt()

            //TODO deserialize extensions and id

            return UInteger(value)
        }
        override fun serialize(encoder: Encoder, value: UInteger) {
            encoder.encodeInt(value.value.toInt())

            //TODO serialize extensions and id
        }
    }
}
