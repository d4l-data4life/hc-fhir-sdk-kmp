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

import care.data4life.hl7.fhir.r4.codesystem.DaysOfWeek
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import care.data4life.hl7.fhir.r4.primitive.Time
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirTiming : FhirBackboneElement {

    // When the event occurs.
    val event: List<DateTime>?

    // When the event is to occur.
    val repeat: TimingRepeat?

    // BID | TID | QID | AM | PM | QD | QOD | +.
    val code: CodeableConcept?
}

/**
 * ClassName: Timing
 *
 * SourceFileName: Timing.kt
 *
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things
 * are planned, expected or requested to occur. The most common usage is in dosage instructions for
 * medications. They are also used when planning care of various kinds, and may be used for reporting
 * the schedule to which past regular activities were carried out.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">Timing</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Timing)
 */
@Serializable
@SerialName("Timing")
data class Timing(

    // When the event occurs.
    @SerialName("event")
    override val event: List<DateTime>? = null,

    // When the event is to occur.
    @SerialName("repeat")
    override val repeat: TimingRepeat? = null,

    // BID | TID | QID | AM | PM | QD | QOD | +.
    @SerialName("code")
    override val code: CodeableConcept? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirTiming {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Timing"
    }
}

interface FhirTimingRepeat : FhirElement {

    // Length/Range of lengths, or (Start and/or end) limits.
    val boundsDuration: Duration?

    // Length/Range of lengths, or (Start and/or end) limits.
    val boundsRange: Range?

    // Length/Range of lengths, or (Start and/or end) limits.
    val boundsPeriod: Period?

    // Number of times to repeat.
    val count: PositiveInteger?

    // Maximum number of times to repeat.
    val countMax: PositiveInteger?

    // How long when it happens.
    val duration: Decimal?

    // How long when it happens (Max).
    val durationMax: Decimal?

    // s | min | h | d | wk | mo | a - unit of time (UCUM).
    val durationUnit: String?

    // Event occurs frequency times per period.
    val frequency: PositiveInteger?

    // Event occurs up to frequencyMax times per period.
    val frequencyMax: PositiveInteger?

    // Event occurs frequency times per period.
    val period: Decimal?

    // Upper limit of period (3-4 hours).
    val periodMax: Decimal?

    // s | min | h | d | wk | mo | a - unit of time (UCUM).
    val periodUnit: String?

    // If one or more days of week is provided, then the action happens only on the specified day(s).
    val dayOfWeek: List<DaysOfWeek>?

    // Time of day for action.
    val timeOfDay: List<Time>?

    // Code for time period of occurrence.
    val `when`: List<String>?

    // Minutes from event (before or after).
    val offset: UnsignedInteger?
}

/**
 * ClassName: TimingRepeat
 *
 * SourceFileName: Timing.kt
 *
 * A set of rules that describe when the event is scheduled.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">TimingRepeat</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Timing)
 */
@Serializable
@SerialName("TimingRepeat")
data class TimingRepeat(

    // Length/Range of lengths, or (Start and/or end) limits.
    @SerialName("boundsDuration")
    override val boundsDuration: Duration? = null,

    // Length/Range of lengths, or (Start and/or end) limits.
    @SerialName("boundsRange")
    override val boundsRange: Range? = null,

    // Length/Range of lengths, or (Start and/or end) limits.
    @SerialName("boundsPeriod")
    override val boundsPeriod: Period? = null,

    // Number of times to repeat.
    @SerialName("count")
    override val count: PositiveInteger? = null,

    // Maximum number of times to repeat.
    @SerialName("countMax")
    override val countMax: PositiveInteger? = null,

    // How long when it happens.
    @SerialName("duration")
    override val duration: Decimal? = null,

    // How long when it happens (Max).
    @SerialName("durationMax")
    override val durationMax: Decimal? = null,

    // s | min | h | d | wk | mo | a - unit of time (UCUM).
    @SerialName("durationUnit")
    override val durationUnit: String? = null,

    // Event occurs frequency times per period.
    @SerialName("frequency")
    override val frequency: PositiveInteger? = null,

    // Event occurs up to frequencyMax times per period.
    @SerialName("frequencyMax")
    override val frequencyMax: PositiveInteger? = null,

    // Event occurs frequency times per period.
    @SerialName("period")
    override val period: Decimal? = null,

    // Upper limit of period (3-4 hours).
    @SerialName("periodMax")
    override val periodMax: Decimal? = null,

    // s | min | h | d | wk | mo | a - unit of time (UCUM).
    @SerialName("periodUnit")
    override val periodUnit: String? = null,

    // If one or more days of week is provided, then the action happens only on the specified day(s).
    @SerialName("dayOfWeek")
    override val dayOfWeek: List<DaysOfWeek>? = null,

    // Time of day for action.
    @SerialName("timeOfDay")
    override val timeOfDay: List<Time>? = null,

    // Code for time period of occurrence.
    @SerialName("when")
    override val `when`: List<String>? = null,

    // Minutes from event (before or after).
    @SerialName("offset")
    override val offset: UnsignedInteger? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirTimingRepeat {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TimingRepeat"
    }
}
