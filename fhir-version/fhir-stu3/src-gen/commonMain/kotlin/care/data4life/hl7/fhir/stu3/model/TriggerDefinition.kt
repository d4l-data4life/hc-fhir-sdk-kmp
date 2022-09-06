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

package care.data4life.hl7.fhir.stu3.model

import care.data4life.hl7.fhir.stu3.codesystem.TriggerType
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirTriggerDefinition
 *
 * A description of a triggering event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TriggerDefinition">TriggerDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TriggerDefinition)
 */
interface FhirTriggerDefinition : FhirElement {

    /**
     * The type of triggering event.
     */
    val type: TriggerType

    /**
     * Triggering event name.
     */
    val eventName: String?

    /**
     * Timing of the event.
     */
    val eventTimingTiming: Timing?

    /**
     * Timing of the event.
     */
    val eventTimingReference: Reference?

    /**
     * Timing of the event.
     */
    val eventTimingDate: Date?

    /**
     * Timing of the event.
     */
    val eventTimingDateTime: DateTime?

    /**
     * Triggering data of the event.
     */
    val eventData: DataRequirement?
}

/**
 * TriggerDefinition
 *
 * A description of a triggering event.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/TriggerDefinition">TriggerDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/TriggerDefinition)
 */
@Serializable
@SerialName("TriggerDefinition")
data class TriggerDefinition(

    @SerialName("type")
    override val type: TriggerType,

    @SerialName("eventName")
    override val eventName: String? = null,

    @SerialName("eventTimingTiming")
    override val eventTimingTiming: Timing? = null,

    @SerialName("eventTimingReference")
    override val eventTimingReference: Reference? = null,

    @SerialName("eventTimingDate")
    override val eventTimingDate: Date? = null,

    @SerialName("eventTimingDateTime")
    override val eventTimingDateTime: DateTime? = null,

    @SerialName("eventData")
    override val eventData: DataRequirement? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTriggerDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TriggerDefinition"
    }
}
