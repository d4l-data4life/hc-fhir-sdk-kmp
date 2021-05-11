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

interface FhirObservation : FhirDomainResource {

    // Business Identifier for observation.
    val identifier: List<Identifier>?

    // Fulfills plan, proposal or order.
    val basedOn: List<Reference>?

    // Part of referenced event.
    val partOf: List<Reference>?

    // The status of the result value.
    val status: ObservationStatus

    // Classification of  type of observation.
    val category: List<CodeableConcept>?

    // Type of observation (code / type).
    val code: CodeableConcept

    // Who and/or what the observation is about.
    val subject: Reference?

    // What the observation is about, when it is not about the subject of record.
    val focus: List<Reference>?

    // Healthcare event during which this observation is made.
    val encounter: Reference?

    // Clinically relevant time/time-period for observation.
    val effectiveDateTime: DateTime?

    // Clinically relevant time/time-period for observation.
    val effectivePeriod: Period?

    // Clinically relevant time/time-period for observation.
    val effectiveTiming: Timing?

    // Clinically relevant time/time-period for observation.
    val effectiveInstant: Instant?

    // Date/Time this version was made available.
    val issued: Instant?

    // Who is responsible for the observation.
    val performer: List<Reference>?

    // Actual result.
    val valueQuantity: Quantity?

    // Actual result.
    val valueCodeableConcept: CodeableConcept?

    // Actual result.
    val valueString: String?

    // Actual result.
    val valueBoolean: Bool?

    // Actual result.
    val valueInteger: Integer?

    // Actual result.
    val valueRange: Range?

    // Actual result.
    val valueRatio: Ratio?

    // Actual result.
    val valueSampledData: SampledData?

    // Actual result.
    val valueTime: Time?

    // Actual result.
    val valueDateTime: DateTime?

    // Actual result.
    val valuePeriod: Period?

    // Why the result is missing.
    val dataAbsentReason: CodeableConcept?

    // High, low, normal, etc..
    val interpretation: List<CodeableConcept>?

    // Comments about the observation.
    val note: List<Annotation>?

    // Observed body part.
    val bodySite: CodeableConcept?

    // How it was done.
    val method: CodeableConcept?

    // Specimen used for this observation.
    val specimen: Reference?

    // (Measurement) Device.
    val device: Reference?

    // Provides guide for interpretation.
    val referenceRange: List<ObservationReferenceRange>?

    // Related resource that belongs to the Observation group.
    val hasMember: List<Reference>?

    // Related measurements the observation is made from.
    val derivedFrom: List<Reference>?

    // Component results.
    val component: List<ObservationComponent>?
}

/**
 * ClassName: Observation
 *
 * SourceFileName: Observation.kt
 *
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

    // Business Identifier for observation.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,
    // Fulfills plan, proposal or order.
    @SerialName("basedOn")
    override val basedOn: List<Reference>? = null,
    // Part of referenced event.
    @SerialName("partOf")
    override val partOf: List<Reference>? = null,
    // The status of the result value.
    @SerialName("status")
    override val status: ObservationStatus,
    // Classification of  type of observation.
    @SerialName("category")
    override val category: List<CodeableConcept>? = null,
    // Type of observation (code / type).
    @SerialName("code")
    override val code: CodeableConcept,
    // Who and/or what the observation is about.
    @SerialName("subject")
    override val subject: Reference? = null,
    // What the observation is about, when it is not about the subject of record.
    @SerialName("focus")
    override val focus: List<Reference>? = null,
    // Healthcare event during which this observation is made.
    @SerialName("encounter")
    override val encounter: Reference? = null,
    // Clinically relevant time/time-period for observation.
    @SerialName("effectiveDateTime")
    override val effectiveDateTime: DateTime? = null,
    // Clinically relevant time/time-period for observation.
    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,
    // Clinically relevant time/time-period for observation.
    @SerialName("effectiveTiming")
    override val effectiveTiming: Timing? = null,
    // Clinically relevant time/time-period for observation.
    @SerialName("effectiveInstant")
    override val effectiveInstant: Instant? = null,
    // Date/Time this version was made available.
    @SerialName("issued")
    override val issued: Instant? = null,
    // Who is responsible for the observation.
    @SerialName("performer")
    override val performer: List<Reference>? = null,
    // Actual result.
    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,
    // Actual result.
    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,
    // Actual result.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Actual result.
    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,
    // Actual result.
    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,
    // Actual result.
    @SerialName("valueRange")
    override val valueRange: Range? = null,
    // Actual result.
    @SerialName("valueRatio")
    override val valueRatio: Ratio? = null,
    // Actual result.
    @SerialName("valueSampledData")
    override val valueSampledData: SampledData? = null,
    // Actual result.
    @SerialName("valueTime")
    override val valueTime: Time? = null,
    // Actual result.
    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,
    // Actual result.
    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,
    // Why the result is missing.
    @SerialName("dataAbsentReason")
    override val dataAbsentReason: CodeableConcept? = null,
    // High, low, normal, etc..
    @SerialName("interpretation")
    override val interpretation: List<CodeableConcept>? = null,
    // Comments about the observation.
    @SerialName("note")
    override val note: List<Annotation>? = null,
    // Observed body part.
    @SerialName("bodySite")
    override val bodySite: CodeableConcept? = null,
    // How it was done.
    @SerialName("method")
    override val method: CodeableConcept? = null,
    // Specimen used for this observation.
    @SerialName("specimen")
    override val specimen: Reference? = null,
    // (Measurement) Device.
    @SerialName("device")
    override val device: Reference? = null,
    // Provides guide for interpretation.
    @SerialName("referenceRange")
    override val referenceRange: List<ObservationReferenceRange>? = null,
    // Related resource that belongs to the Observation group.
    @SerialName("hasMember")
    override val hasMember: List<Reference>? = null,
    // Related measurements the observation is made from.
    @SerialName("derivedFrom")
    override val derivedFrom: List<Reference>? = null,
    // Component results.
    @SerialName("component")
    override val component: List<ObservationComponent>? = null,

    // # DomainResource
    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,
    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,
    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,
    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource
    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,
    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,
    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,
    // Language of the resource content.
    @SerialName("language")
    override val language: String? = null
) : FhirObservation {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Observation"
    }
}

interface FhirObservationComponent : FhirBackboneElement {

    // Type of component observation (code / type).
    val code: CodeableConcept

    // Actual component result.
    val valueQuantity: Quantity?

    // Actual component result.
    val valueCodeableConcept: CodeableConcept?

    // Actual component result.
    val valueString: String?

    // Actual component result.
    val valueBoolean: Bool?

    // Actual component result.
    val valueInteger: Integer?

    // Actual component result.
    val valueRange: Range?

    // Actual component result.
    val valueRatio: Ratio?

    // Actual component result.
    val valueSampledData: SampledData?

    // Actual component result.
    val valueTime: Time?

    // Actual component result.
    val valueDateTime: DateTime?

    // Actual component result.
    val valuePeriod: Period?

    // Why the component result is missing.
    val dataAbsentReason: CodeableConcept?

    // High, low, normal, etc..
    val interpretation: List<CodeableConcept>?

    // Provides guide for interpretation of component result.
    val referenceRange: List<ObservationReferenceRange>?
}

/**
 * ClassName: ObservationComponent
 *
 * SourceFileName: Observation.kt
 *
 *
 * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">ObservationComponent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
@Serializable
@SerialName("ObservationComponent")
data class ObservationComponent(

    // Type of component observation (code / type).
    @SerialName("code")
    override val code: CodeableConcept,
    // Actual component result.
    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,
    // Actual component result.
    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,
    // Actual component result.
    @SerialName("valueString")
    override val valueString: String? = null,
    // Actual component result.
    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,
    // Actual component result.
    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,
    // Actual component result.
    @SerialName("valueRange")
    override val valueRange: Range? = null,
    // Actual component result.
    @SerialName("valueRatio")
    override val valueRatio: Ratio? = null,
    // Actual component result.
    @SerialName("valueSampledData")
    override val valueSampledData: SampledData? = null,
    // Actual component result.
    @SerialName("valueTime")
    override val valueTime: Time? = null,
    // Actual component result.
    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,
    // Actual component result.
    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,
    // Why the component result is missing.
    @SerialName("dataAbsentReason")
    override val dataAbsentReason: CodeableConcept? = null,
    // High, low, normal, etc..
    @SerialName("interpretation")
    override val interpretation: List<CodeableConcept>? = null,
    // Provides guide for interpretation of component result.
    @SerialName("referenceRange")
    override val referenceRange: List<ObservationReferenceRange>? = null,

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
) : FhirObservationComponent {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ObservationComponent"
    }
}

interface FhirObservationReferenceRange : FhirBackboneElement {

    // Low Range, if relevant.
    val low: Quantity?

    // High Range, if relevant.
    val high: Quantity?

    // Reference range qualifier.
    val type: CodeableConcept?

    // Reference range population.
    val appliesTo: List<CodeableConcept>?

    // Applicable age range, if relevant.
    val age: Range?

    // Text based reference range in an observation.
    val text: String?
}

/**
 * ClassName: ObservationReferenceRange
 *
 * SourceFileName: Observation.kt
 *
 *
 * Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an "OR".   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Observation">ObservationReferenceRange</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Observation)
 */
@Serializable
@SerialName("ObservationReferenceRange")
data class ObservationReferenceRange(

    // Low Range, if relevant.
    @SerialName("low")
    override val low: Quantity? = null,
    // High Range, if relevant.
    @SerialName("high")
    override val high: Quantity? = null,
    // Reference range qualifier.
    @SerialName("type")
    override val type: CodeableConcept? = null,
    // Reference range population.
    @SerialName("appliesTo")
    override val appliesTo: List<CodeableConcept>? = null,
    // Applicable age range, if relevant.
    @SerialName("age")
    override val age: Range? = null,
    // Text based reference range in an observation.
    @SerialName("text")
    override val text: String? = null,

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
) : FhirObservationReferenceRange {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ObservationReferenceRange"
    }
}