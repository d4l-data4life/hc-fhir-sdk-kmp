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

package care.data4life.hl7.fhir.stu3.primitive

import care.data4life.hl7.fhir.stu3.datetime.XsDate
import care.data4life.hl7.fhir.stu3.json.XsDateParser
import care.data4life.hl7.fhir.stu3.model.Extension
import care.data4life.hl7.fhir.stu3.model.FhirElement
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.jvm.JvmStatic

interface FhirDate : FhirElement {
    val value: XsDate
}

/**
 * Date
 *
 *
 * A date, or partial date (e.g. just year or year + month) as used in human communication. There is
 * no time zone. Dates SHALL be valid dates. Month and day are optional.
 *
 *
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?
 *
 * @param value XsDate
 *
 * @see [Date](http://hl7.org/fhir/STU3/datatypes.html#date)
 *
 */
@Serializable(with = DateSerializer::class)
@SerialName("Date")
data class Date(
    override val value: XsDate,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: kotlin.String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDate {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Date"
    }
}

object DateSerializer : KSerializer<Date> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Date")

    // Serializer
    override fun deserialize(decoder: Decoder): Date {
        val value = XsDateParser.parse(decoder.decodeString())

        //TODO deserialize extensions and id

        return Date(value)
    }

    override fun serialize(encoder: Encoder, value: Date) {
        encoder.encodeString(XsDateParser.format(value.value))

        //TODO serialize extensions and id
    }
}
