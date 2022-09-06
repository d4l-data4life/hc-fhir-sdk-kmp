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

import care.data4life.hl7.fhir.stu3.codesystem.DaysOfWeek
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Integer
import care.data4life.hl7.fhir.stu3.primitive.Time
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirTiming
 *
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things
 * are planned, expected or requested to occur. The most common usage is in dosage instructions for
 * medications. They are also used when planning care of various kinds, and may be used for reporting
 * the schedule to which past regular activities were carried out.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">Timing</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Timing)
 */
interface FhirTiming : FhirElement {

    /**
     * When the event occurs.
     */
    val event: kotlin.collections.List<DateTime>?

    /**
     * When the event is to occur.
     */
    val repeat: TimingRepeat?

    /**
     * BID | TID | QID | AM | PM | QD | QOD | Q4H | Q6H +.
     */
    val code: CodeableConcept?
}

/**
 * Timing
 *
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things
 * are planned, expected or requested to occur. The most common usage is in dosage instructions for
 * medications. They are also used when planning care of various kinds, and may be used for reporting
 * the schedule to which past regular activities were carried out.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">Timing</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Timing)
 */
@Serializable
@SerialName("Timing")
data class Timing(

    @SerialName("event")
    override val event: kotlin.collections.List<DateTime>? = null,

    @SerialName("repeat")
    override val repeat: TimingRepeat? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTiming {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Timing"
    }
}

/**
 * FhirTimingRepeat
 *
 * A set of rules that describe when the event is scheduled.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">TimingRepeat</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Timing)
 */
interface FhirTimingRepeat : FhirElement {

    /**
     * Length/Range of lengths, or (Start and/or end) limits.
     */
    val boundsDuration: Duration?

    /**
     * Length/Range of lengths, or (Start and/or end) limits.
     */
    val boundsRange: Range?

    /**
     * Length/Range of lengths, or (Start and/or end) limits.
     */
    val boundsPeriod: Period?

    /**
     * Number of times to repeat.
     */
    val count: Integer?

    /**
     * Maximum number of times to repeat.
     */
    val countMax: Integer?

    /**
     * How long when it happens.
     */
    val duration: Decimal?

    /**
     * How long when it happens (Max).
     */
    val durationMax: Decimal?

    /**
     * s | min | h | d | wk | mo | a - unit of time (UCUM).
     */
    val durationUnit: String?

    /**
     * Event occurs frequency times per period.
     */
    val frequency: Integer?

    /**
     * Event occurs up to frequencyMax times per period.
     */
    val frequencyMax: Integer?

    /**
     * Event occurs frequency times per period.
     */
    val period: Decimal?

    /**
     * Upper limit of period (3-4 hours).
     */
    val periodMax: Decimal?

    /**
     * s | min | h | d | wk | mo | a - unit of time (UCUM).
     */
    val periodUnit: String?

    /**
     * If one or more days of week is provided, then the action happens only on the
     * specified day(s).
     */
    val dayOfWeek: kotlin.collections.List<DaysOfWeek>?

    /**
     * Time of day for action.
     */
    val timeOfDay: kotlin.collections.List<Time>?

    /**
     * Regular life events the event is tied to.
     */
    val whenn: kotlin.collections.List<String>?

    /**
     * Minutes from event (before or after).
     */
    val offset: UnsignedInteger?
}

/**
 * TimingRepeat
 *
 * A set of rules that describe when the event is scheduled.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Timing">TimingRepeat</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/Timing)
 */
@Serializable
@SerialName("TimingRepeat")
data class TimingRepeat(

    @SerialName("boundsDuration")
    override val boundsDuration: Duration? = null,

    @SerialName("boundsRange")
    override val boundsRange: Range? = null,

    @SerialName("boundsPeriod")
    override val boundsPeriod: Period? = null,

    @SerialName("count")
    override val count: Integer? = null,

    @SerialName("countMax")
    override val countMax: Integer? = null,

    @SerialName("duration")
    override val duration: Decimal? = null,

    @SerialName("durationMax")
    override val durationMax: Decimal? = null,

    @SerialName("durationUnit")
    override val durationUnit: String? = null,

    @SerialName("frequency")
    override val frequency: Integer? = null,

    @SerialName("frequencyMax")
    override val frequencyMax: Integer? = null,

    @SerialName("period")
    override val period: Decimal? = null,

    @SerialName("periodMax")
    override val periodMax: Decimal? = null,

    @SerialName("periodUnit")
    override val periodUnit: String? = null,

    @SerialName("dayOfWeek")
    override val dayOfWeek: kotlin.collections.List<DaysOfWeek>? = null,

    @SerialName("timeOfDay")
    override val timeOfDay: kotlin.collections.List<Time>? = null,

    @SerialName("when")
    override val whenn: kotlin.collections.List<String>? = null,

    @SerialName("offset")
    override val offset: UnsignedInteger? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTimingRepeat {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "TimingRepeat"
    }
}
