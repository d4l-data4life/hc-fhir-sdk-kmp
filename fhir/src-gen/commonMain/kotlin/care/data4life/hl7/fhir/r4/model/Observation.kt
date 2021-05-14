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

import care.data4life.hl7.fhir.r4.codesystem.ObservationStatus
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Instant
import care.data4life.hl7.fhir.r4.primitive.Integer
import care.data4life.hl7.fhir.r4.primitive.Time
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirObservation
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">Observation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
interface FhirObservation : FhirDomainResource {

    /**
     * Business Identifier for observation.
     */
    val identifier: List<Identifier>?

    /**
     * Fulfills plan, proposal or order.
     */
    val basedOn: List<Reference>?

    /**
     * Part of referenced event.
     */
    val partOf: List<Reference>?

    /**
     * The status of the result value.
     */
    val status: ObservationStatus

    /**
     * Classification of type of observation.
     */
    val category: List<CodeableConcept>?

    /**
     * Type of observation (code / type).
     */
    val code: CodeableConcept

    /**
     * Who and/or what the observation is about.
     */
    val subject: Reference?

    /**
     * What the observation is about, when it is not about the subject of record.
     */
    val focus: List<Reference>?

    /**
     * Healthcare event during which this observation is made.
     */
    val encounter: Reference?

    /**
     * Clinically relevant time/time-period for observation.
     */
    val effectiveDateTime: DateTime?

    /**
     * Clinically relevant time/time-period for observation.
     */
    val effectivePeriod: Period?

    /**
     * Clinically relevant time/time-period for observation.
     */
    val effectiveTiming: Timing?

    /**
     * Clinically relevant time/time-period for observation.
     */
    val effectiveInstant: Instant?

    /**
     * Date/Time this version was made available.
     */
    val issued: Instant?

    /**
     * Who is responsible for the observation.
     */
    val performer: List<Reference>?

    /**
     * Actual result.
     */
    val valueQuantity: Quantity?

    /**
     * Actual result.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Actual result.
     */
    val valueString: String?

    /**
     * Actual result.
     */
    val valueBoolean: Bool?

    /**
     * Actual result.
     */
    val valueInteger: Integer?

    /**
     * Actual result.
     */
    val valueRange: Range?

    /**
     * Actual result.
     */
    val valueRatio: Ratio?

    /**
     * Actual result.
     */
    val valueSampledData: SampledData?

    /**
     * Actual result.
     */
    val valueTime: Time?

    /**
     * Actual result.
     */
    val valueDateTime: DateTime?

    /**
     * Actual result.
     */
    val valuePeriod: Period?

    /**
     * Why the result is missing.
     */
    val dataAbsentReason: CodeableConcept?

    /**
     * High, low, normal, etc..
     */
    val interpretation: List<CodeableConcept>?

    /**
     * Comments about the observation.
     */
    val note: List<Annotation>?

    /**
     * Observed body part.
     */
    val bodySite: CodeableConcept?

    /**
     * How it was done.
     */
    val method: CodeableConcept?

    /**
     * Specimen used for this observation.
     */
    val specimen: Reference?

    /**
     * (Measurement) Device.
     */
    val device: Reference?

    /**
     * Provides guide for interpretation.
     */
    val referenceRange: List<ObservationReferenceRange>?

    /**
     * Related resource that belongs to the Observation group.
     */
    val hasMember: List<Reference>?

    /**
     * Related measurements the observation is made from.
     */
    val derivedFrom: List<Reference>?

    /**
     * Component results.
     */
    val component: List<ObservationComponent>?
}

/**
 * Observation
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">Observation</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
@Serializable
@SerialName("Observation")
data class Observation(

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,

    @SerialName("partOf")
    override val partOf: List<Reference>? = null,

    @SerialName("status")
    override val status: ObservationStatus,

    @SerialName("category")
    override val category: List<CodeableConcept>? = null,

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("focus")
    override val focus: List<Reference>? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("effectiveTiming")
    override val effectiveTiming: Timing? = null,

    @SerialName("effectiveInstant")
    override val effectiveInstant: Instant? = null,

    @SerialName("issued")
    override val issued: Instant? = null,

    @SerialName("performer")
    override val performer: List<Reference>? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueRange")
    override val valueRange: Range? = null,

    @SerialName("valueRatio")
    override val valueRatio: Ratio? = null,

    @SerialName("valueSampledData")
    override val valueSampledData: SampledData? = null,

    @SerialName("valueTime")
    override val valueTime: Time? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,

    @SerialName("dataAbsentReason")
    override val dataAbsentReason: CodeableConcept? = null,

    @SerialName("interpretation")
    override val interpretation: List<CodeableConcept>? = null,

    @SerialName("note")
    override val note: List<Annotation>? = null,

    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,

    @SerialName("method")
    override val method: CodeableConcept? = null,

    @SerialName("specimen")
    override val specimen: Reference? = null,

    @SerialName("device")
    override val device: Reference? = null,

    @SerialName("referenceRange")
    override val referenceRange: List<ObservationReferenceRange>? = null,

    @SerialName("hasMember")
    override val hasMember: List<Reference>? = null,

    @SerialName("derivedFrom")
    override val derivedFrom: List<Reference>? = null,

    @SerialName("component")
    override val component: List<ObservationComponent>? = null,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirObservation {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Observation"
    }
}

/**
 * FhirObservationComponent
 *
 * Some observations have multiple component observations. These component observations are expressed
 * as separate code value pairs that share the same attributes. Examples include systolic and diastolic
 * component observations for blood pressure measurement and multiple component observations for
 * genetics observations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">ObservationComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
interface FhirObservationComponent : FhirBackboneElement {

    /**
     * Type of component observation (code / type).
     */
    val code: CodeableConcept

    /**
     * Actual component result.
     */
    val valueQuantity: Quantity?

    /**
     * Actual component result.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Actual component result.
     */
    val valueString: String?

    /**
     * Actual component result.
     */
    val valueBoolean: Bool?

    /**
     * Actual component result.
     */
    val valueInteger: Integer?

    /**
     * Actual component result.
     */
    val valueRange: Range?

    /**
     * Actual component result.
     */
    val valueRatio: Ratio?

    /**
     * Actual component result.
     */
    val valueSampledData: SampledData?

    /**
     * Actual component result.
     */
    val valueTime: Time?

    /**
     * Actual component result.
     */
    val valueDateTime: DateTime?

    /**
     * Actual component result.
     */
    val valuePeriod: Period?

    /**
     * Why the component result is missing.
     */
    val dataAbsentReason: CodeableConcept?

    /**
     * High, low, normal, etc..
     */
    val interpretation: List<CodeableConcept>?

    /**
     * Provides guide for interpretation of component result.
     */
    val referenceRange: List<ObservationReferenceRange>?
}

/**
 * ObservationComponent
 *
 * Some observations have multiple component observations. These component observations are expressed
 * as separate code value pairs that share the same attributes. Examples include systolic and diastolic
 * component observations for blood pressure measurement and multiple component observations for
 * genetics observations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">ObservationComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
@Serializable
@SerialName("ObservationComponent")
data class ObservationComponent(

    @SerialName("code")
    override val code: CodeableConcept,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueRange")
    override val valueRange: Range? = null,

    @SerialName("valueRatio")
    override val valueRatio: Ratio? = null,

    @SerialName("valueSampledData")
    override val valueSampledData: SampledData? = null,

    @SerialName("valueTime")
    override val valueTime: Time? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,

    @SerialName("dataAbsentReason")
    override val dataAbsentReason: CodeableConcept? = null,

    @SerialName("interpretation")
    override val interpretation: List<CodeableConcept>? = null,

    @SerialName("referenceRange")
    override val referenceRange: List<ObservationReferenceRange>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirObservationComponent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ObservationComponent"
    }
}

/**
 * FhirObservationReferenceRange
 *
 * Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple
 * reference ranges are interpreted as an "OR". In other words, to represent two distinct target
 * populations, two `referenceRange` elements would be used.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">ObservationReferenceRange</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
interface FhirObservationReferenceRange : FhirBackboneElement {

    /**
     * Low Range, if relevant.
     */
    val low: Quantity?

    /**
     * High Range, if relevant.
     */
    val high: Quantity?

    /**
     * Reference range qualifier.
     */
    val type: CodeableConcept?

    /**
     * Reference range population.
     */
    val appliesTo: List<CodeableConcept>?

    /**
     * Applicable age range, if relevant.
     */
    val age: Range?

    /**
     * Text based reference range in an observation.
     */
    val text: String?
}

/**
 * ObservationReferenceRange
 *
 * Guidance on how to interpret the value by comparison to a normal or recommended range. Multiple
 * reference ranges are interpreted as an "OR". In other words, to represent two distinct target
 * populations, two `referenceRange` elements would be used.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">ObservationReferenceRange</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
@Serializable
@SerialName("ObservationReferenceRange")
data class ObservationReferenceRange(

    @SerialName("low")
    override val low: Quantity? = null,

    @SerialName("high")
    override val high: Quantity? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("appliesTo")
    override val appliesTo: List<CodeableConcept>? = null,

    @SerialName("age")
    override val age: Range? = null,

    @SerialName("text")
    override val text: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirObservationReferenceRange {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ObservationReferenceRange"
    }
}
