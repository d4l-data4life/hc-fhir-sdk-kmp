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

package care.data4life.hl7.fhir.r4.model

import care.data4life.hl7.fhir.r4.codesystem.TriggerType
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirTriggerDefinition : FhirElement {

    // The type of triggering event.
    val type: TriggerType

    // Name or URI that identifies the event.
    val name: String?

    // Timing of the event.
    val timingTiming: Timing?

    // Timing of the event.
    val timingReference: Reference?

    // Timing of the event.
    val timingDate: Date?

    // Timing of the event.
    val timingDateTime: DateTime?

    // Triggering data of the event (multiple = 'and').
    val data: List<DataRequirement>?

    // Whether the event triggers (boolean expression).
    val condition: Expression?
}

/**
 * ClassName: TriggerDefinition
 *
 * SourceFileName: TriggerDefinition.kt
 *
 * A description of a triggering event. Triggering events can be named events, data events, or
 * periodic, as determined by the type element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TriggerDefinition">TriggerDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/TriggerDefinition)
 */
@Serializable
@SerialName("TriggerDefinition")
data class TriggerDefinition(

    // The type of triggering event.
    @SerialName("type")
    override val type: TriggerType,

    // Name or URI that identifies the event.
    @SerialName("name")
    override val name: String? = null,

    // Timing of the event.
    @SerialName("timingTiming")
    override val timingTiming: Timing? = null,

    // Timing of the event.
    @SerialName("timingReference")
    override val timingReference: Reference? = null,

    // Timing of the event.
    @SerialName("timingDate")
    override val timingDate: Date? = null,

    // Timing of the event.
    @SerialName("timingDateTime")
    override val timingDateTime: DateTime? = null,

    // Triggering data of the event (multiple = 'and').
    @SerialName("data")
    override val data: List<DataRequirement>? = null,

    // Whether the event triggers (boolean expression).
    @SerialName("condition")
    override val condition: Expression? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirTriggerDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TriggerDefinition"
    }
}
