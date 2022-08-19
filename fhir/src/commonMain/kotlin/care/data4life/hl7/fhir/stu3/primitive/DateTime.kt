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

import care.data4life.hl7.fhir.common.datetime.XsDateTime
import care.data4life.hl7.fhir.common.datetime.parser.XsDateTimeParser
import care.data4life.hl7.fhir.stu3.model.Extension
import care.data4life.hl7.fhir.stu3.model.FhirElement
import kotlin.jvm.JvmStatic
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

interface FhirDateTime : FhirElement {
    val value: XsDateTime
}

/**
 * DateTime
 *
 *
 * A date, date-time or partial date (e.g. just year or year + month) as used in human
 * communication. If hours and minutes are specified, a time zone SHALL be populated. Seconds must
 * be provided due to schema type constraints but may be zero-filled and may be ignored. Dates SHALL
 * be valid dates. The time "24:00" is not allowed.
 *
 *
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?(Z|(\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?
 *
 * @see [DateTime](http://hl7.org/fhir/STU3/datatypes.html#datetime)
 *
 *
 * Constructor, takes a date and optionally a time and a timezone.
 *
 *
 * If time is given, timezone must be given too.
 *
 * @param date     The FhirDate of the dateTime
 * @param time     The FhirTime of the dateTime (optional)
 * @param timeZone The TimeZone of the dateTime (optional)
 */
@Serializable(with = DateTimeSerializer::class)
@SerialName("DateTime")
data class DateTime(
    override val value: XsDateTime,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: kotlin.String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirDateTime {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "DateTime"
    }
}

object DateTimeSerializer : KSerializer<DateTime> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("DateTime")

    override fun deserialize(decoder: Decoder): DateTime {
        val value = XsDateTimeParser.parse(decoder.decodeString())

        // TODO deserialize extensions and id

        return DateTime(value)
    }

    override fun serialize(encoder: Encoder, value: DateTime) {
        encoder.encodeString(XsDateTimeParser.format(value.value))

        // TODO serialize extensions and id
    }
}
