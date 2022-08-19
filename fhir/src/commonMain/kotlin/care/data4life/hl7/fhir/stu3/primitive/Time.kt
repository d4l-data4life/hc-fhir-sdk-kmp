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

import care.data4life.hl7.fhir.common.datetime.XsTime
import care.data4life.hl7.fhir.common.datetime.parser.XsTimeParser
import care.data4life.hl7.fhir.stu3.model.Extension
import care.data4life.hl7.fhir.stu3.model.FhirElement
import kotlin.jvm.JvmStatic
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

interface FhirTime : FhirElement {
    val value: XsTime
}

/**
 * Time
 *
 * A time during the day, with no date specified (can be converted to a Duration since midnight).
 * Seconds must be provided due to schema type constraints but may be zero-filled and may be
 * ignored.
 *
 * The time "24:00" is not allowed, and neither is a time zone.
 *
 * Regex: ([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?
 *
 * @see [Time](http://hl7.org/fhir/STU3/datatypes.html#time)
 */
@Serializable(with = TimeSerializer::class)
@SerialName("Time")
data class Time(
    override val value: XsTime,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirTime {

    init {
        require(value.second != null) { "second of XsTime should be set" }
    }

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Time"
    }
}

object TimeSerializer : KSerializer<Time> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Time")

    override fun deserialize(decoder: Decoder): Time {
        val value = XsTimeParser.parse(decoder.decodeString())

        // TODO deserialize extensions and id

        return Time(value)
    }

    override fun serialize(encoder: Encoder, value: Time) {
        encoder.encodeString(XsTimeParser.format(value.value))

        // TODO serialize extensions and id
    }
}
