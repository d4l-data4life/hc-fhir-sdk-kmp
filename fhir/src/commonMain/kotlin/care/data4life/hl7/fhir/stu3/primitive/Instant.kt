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
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.jvm.JvmStatic

interface FhirInstant : FhirElement {
    val value: XsDateTime
}

/**
 * Instant
 *
 *
 * An instant in time - known at least to the second and always includes a time zone.
 *
 *
 * Note: This is intended for precisely observed times (typically system logs etc.) ) { and not
 * human-reported times - for them ) { use date and dateTime. instant is a more constrained dateTime
 *
 *
 * Regex: -?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\.[0-9]+)?(Z|(\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))))
 *
 * @see [Instant](http://hl7.org/fhir/STU3/datatypes.html#instant)
 *
 *
 * Constructor
 *
 * takes a XsDateTime that is defined at least to the second and always includes a
 * time zone
 *
 * @param value XsDateTime of the Instant.
 */
@Serializable(with = InstantSerializer::class)
@SerialName("Instant")
data class Instant(
    override val value: XsDateTime,

    // # Element
    // xml:id (or equivalent in JSON).
    @SerialName("id")
    override val id: kotlin.String? = null,
    // Additional Content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirInstant {

    init {
        requireNotNull(value.date.month) { "date: month must be set" }
        requireNotNull(value.date.day) { "date: day must be set" }
        requireNotNull(value.time) { "time must be set" }
        requireNotNull(value.time.second) { "time: second must be set" }
        requireNotNull(value.timeZone) { "timezone must be set" }
    }

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Instant"
    }
}

object InstantSerializer : KSerializer<Instant> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Instant")

    override fun deserialize(decoder: Decoder): Instant {
        val value = XsDateTimeParser.parse(decoder.decodeString())

        // TODO deserialize extensions and id

        return Instant(value)
    }

    override fun serialize(encoder: Encoder, value: Instant) {
        encoder.encodeString(XsDateTimeParser.format(value.value))

        // TODO serialize extensions and id
    }
}
