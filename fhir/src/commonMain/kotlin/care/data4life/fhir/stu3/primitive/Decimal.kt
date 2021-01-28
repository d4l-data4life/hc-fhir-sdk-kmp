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

    // # Element
    // Additional Content defined by implementations.
    override val extension: List<Extension>? = null,
    // xml:id (or equivalent in JSON).
    override val id: String? = null
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

