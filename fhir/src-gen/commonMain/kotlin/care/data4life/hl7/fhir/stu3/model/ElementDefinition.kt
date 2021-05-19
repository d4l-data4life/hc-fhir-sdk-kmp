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

import care.data4life.hl7.fhir.stu3.codesystem.AggregationMode
import care.data4life.hl7.fhir.stu3.codesystem.BindingStrength
import care.data4life.hl7.fhir.stu3.codesystem.ConstraintSeverity
import care.data4life.hl7.fhir.stu3.codesystem.DiscriminatorType
import care.data4life.hl7.fhir.stu3.codesystem.PropertyRepresentation
import care.data4life.hl7.fhir.stu3.codesystem.ReferenceVersionRules
import care.data4life.hl7.fhir.stu3.codesystem.SlicingRules
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import care.data4life.hl7.fhir.stu3.primitive.Decimal
import care.data4life.hl7.fhir.stu3.primitive.Instant
import care.data4life.hl7.fhir.stu3.primitive.Integer
import care.data4life.hl7.fhir.stu3.primitive.PositiveInteger
import care.data4life.hl7.fhir.stu3.primitive.Time
import care.data4life.hl7.fhir.stu3.primitive.UnsignedInteger
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirElementDefinition
 *
 * Captures constraints on each element within the resource, profile, or extension.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinition : FhirElement {

    /**
     * Path of the element in the hierarchy of elements.
     */
    val path: String

    /**
     * Codes that define how this element is represented in instances, when the
     * deviation varies from the normal case.
     */
    val representation: List<PropertyRepresentation>?

    /**
     * Name for this particular element (in a set of slices).
     */
    val sliceName: String?

    /**
     * Name for element to display with or prompt for element.
     */
    val label: String?

    /**
     * Corresponding codes in terminologies.
     */
    val code: List<Coding>?

    /**
     * This element is sliced - slices follow.
     */
    val slicing: ElementDefinitionSlicing?

    /**
     * Concise definition for space-constrained presentation.
     */
    val short: String?

    /**
     * Full formal definition as narrative text.
     */
    val definition: String?

    /**
     * Comments about the use of this element.
     */
    val comment: String?

    /**
     * Why this resource has been created.
     */
    val requirements: String?

    /**
     * Other names.
     */
    val alias: List<String>?

    /**
     * Minimum Cardinality.
     */
    val min: UnsignedInteger?

    /**
     * Maximum Cardinality (a number or *).
     */
    val max: String?

    /**
     * Base definition information for tools.
     */
    val base: ElementDefinitionBase?

    /**
     * Reference to definition of content for the element.
     */
    val contentReference: String?

    /**
     * Data type and Profile for this element.
     */
    val type: List<ElementDefinitionType>?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueBase64Binary: String?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueBoolean: Bool?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueCode: String?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueDate: Date?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueDateTime: DateTime?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueDecimal: Decimal?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueId: String?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueInstant: Instant?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueInteger: Integer?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueMarkdown: String?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueOid: String?

    /**
     * Specified value if missing from instance.
     */
    val defaultValuePositiveInt: PositiveInteger?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueString: String?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueTime: Time?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueUnsignedInt: UnsignedInteger?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueUri: String?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueAddress: Address?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueAge: Age?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueAnnotation: Annotation?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueAttachment: Attachment?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueCodeableConcept: CodeableConcept?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueCoding: Coding?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueContactPoint: ContactPoint?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueCount: Count?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueDistance: Distance?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueDuration: Duration?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueHumanName: HumanName?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueIdentifier: Identifier?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueMoney: Money?

    /**
     * Specified value if missing from instance.
     */
    val defaultValuePeriod: Period?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueQuantity: Quantity?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueRange: Range?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueRatio: Ratio?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueReference: Reference?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueSampledData: SampledData?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueSignature: Signature?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueTiming: Timing?

    /**
     * Specified value if missing from instance.
     */
    val defaultValueMeta: Meta?

    /**
     * Implicit meaning when this element is missing.
     */
    val meaningWhenMissing: String?

    /**
     * What the order of the elements means.
     */
    val orderMeaning: String?

    /**
     * Value must be exactly this.
     */
    val fixedBase64Binary: String?

    /**
     * Value must be exactly this.
     */
    val fixedBoolean: Bool?

    /**
     * Value must be exactly this.
     */
    val fixedCode: String?

    /**
     * Value must be exactly this.
     */
    val fixedDate: Date?

    /**
     * Value must be exactly this.
     */
    val fixedDateTime: DateTime?

    /**
     * Value must be exactly this.
     */
    val fixedDecimal: Decimal?

    /**
     * Value must be exactly this.
     */
    val fixedId: String?

    /**
     * Value must be exactly this.
     */
    val fixedInstant: Instant?

    /**
     * Value must be exactly this.
     */
    val fixedInteger: Integer?

    /**
     * Value must be exactly this.
     */
    val fixedMarkdown: String?

    /**
     * Value must be exactly this.
     */
    val fixedOid: String?

    /**
     * Value must be exactly this.
     */
    val fixedPositiveInt: PositiveInteger?

    /**
     * Value must be exactly this.
     */
    val fixedString: String?

    /**
     * Value must be exactly this.
     */
    val fixedTime: Time?

    /**
     * Value must be exactly this.
     */
    val fixedUnsignedInt: UnsignedInteger?

    /**
     * Value must be exactly this.
     */
    val fixedUri: String?

    /**
     * Value must be exactly this.
     */
    val fixedAddress: Address?

    /**
     * Value must be exactly this.
     */
    val fixedAge: Age?

    /**
     * Value must be exactly this.
     */
    val fixedAnnotation: Annotation?

    /**
     * Value must be exactly this.
     */
    val fixedAttachment: Attachment?

    /**
     * Value must be exactly this.
     */
    val fixedCodeableConcept: CodeableConcept?

    /**
     * Value must be exactly this.
     */
    val fixedCoding: Coding?

    /**
     * Value must be exactly this.
     */
    val fixedContactPoint: ContactPoint?

    /**
     * Value must be exactly this.
     */
    val fixedCount: Count?

    /**
     * Value must be exactly this.
     */
    val fixedDistance: Distance?

    /**
     * Value must be exactly this.
     */
    val fixedDuration: Duration?

    /**
     * Value must be exactly this.
     */
    val fixedHumanName: HumanName?

    /**
     * Value must be exactly this.
     */
    val fixedIdentifier: Identifier?

    /**
     * Value must be exactly this.
     */
    val fixedMoney: Money?

    /**
     * Value must be exactly this.
     */
    val fixedPeriod: Period?

    /**
     * Value must be exactly this.
     */
    val fixedQuantity: Quantity?

    /**
     * Value must be exactly this.
     */
    val fixedRange: Range?

    /**
     * Value must be exactly this.
     */
    val fixedRatio: Ratio?

    /**
     * Value must be exactly this.
     */
    val fixedReference: Reference?

    /**
     * Value must be exactly this.
     */
    val fixedSampledData: SampledData?

    /**
     * Value must be exactly this.
     */
    val fixedSignature: Signature?

    /**
     * Value must be exactly this.
     */
    val fixedTiming: Timing?

    /**
     * Value must be exactly this.
     */
    val fixedMeta: Meta?

    /**
     * Value must have at least these property values.
     */
    val patternBase64Binary: String?

    /**
     * Value must have at least these property values.
     */
    val patternBoolean: Bool?

    /**
     * Value must have at least these property values.
     */
    val patternCode: String?

    /**
     * Value must have at least these property values.
     */
    val patternDate: Date?

    /**
     * Value must have at least these property values.
     */
    val patternDateTime: DateTime?

    /**
     * Value must have at least these property values.
     */
    val patternDecimal: Decimal?

    /**
     * Value must have at least these property values.
     */
    val patternId: String?

    /**
     * Value must have at least these property values.
     */
    val patternInstant: Instant?

    /**
     * Value must have at least these property values.
     */
    val patternInteger: Integer?

    /**
     * Value must have at least these property values.
     */
    val patternMarkdown: String?

    /**
     * Value must have at least these property values.
     */
    val patternOid: String?

    /**
     * Value must have at least these property values.
     */
    val patternPositiveInt: PositiveInteger?

    /**
     * Value must have at least these property values.
     */
    val patternString: String?

    /**
     * Value must have at least these property values.
     */
    val patternTime: Time?

    /**
     * Value must have at least these property values.
     */
    val patternUnsignedInt: UnsignedInteger?

    /**
     * Value must have at least these property values.
     */
    val patternUri: String?

    /**
     * Value must have at least these property values.
     */
    val patternAddress: Address?

    /**
     * Value must have at least these property values.
     */
    val patternAge: Age?

    /**
     * Value must have at least these property values.
     */
    val patternAnnotation: Annotation?

    /**
     * Value must have at least these property values.
     */
    val patternAttachment: Attachment?

    /**
     * Value must have at least these property values.
     */
    val patternCodeableConcept: CodeableConcept?

    /**
     * Value must have at least these property values.
     */
    val patternCoding: Coding?

    /**
     * Value must have at least these property values.
     */
    val patternContactPoint: ContactPoint?

    /**
     * Value must have at least these property values.
     */
    val patternCount: Count?

    /**
     * Value must have at least these property values.
     */
    val patternDistance: Distance?

    /**
     * Value must have at least these property values.
     */
    val patternDuration: Duration?

    /**
     * Value must have at least these property values.
     */
    val patternHumanName: HumanName?

    /**
     * Value must have at least these property values.
     */
    val patternIdentifier: Identifier?

    /**
     * Value must have at least these property values.
     */
    val patternMoney: Money?

    /**
     * Value must have at least these property values.
     */
    val patternPeriod: Period?

    /**
     * Value must have at least these property values.
     */
    val patternQuantity: Quantity?

    /**
     * Value must have at least these property values.
     */
    val patternRange: Range?

    /**
     * Value must have at least these property values.
     */
    val patternRatio: Ratio?

    /**
     * Value must have at least these property values.
     */
    val patternReference: Reference?

    /**
     * Value must have at least these property values.
     */
    val patternSampledData: SampledData?

    /**
     * Value must have at least these property values.
     */
    val patternSignature: Signature?

    /**
     * Value must have at least these property values.
     */
    val patternTiming: Timing?

    /**
     * Value must have at least these property values.
     */
    val patternMeta: Meta?

    /**
     * Example value (as defined for type).
     */
    val example: List<ElementDefinitionExample>?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueDate: Date?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueDateTime: DateTime?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueInstant: Instant?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueTime: Time?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueDecimal: Decimal?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueInteger: Integer?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValuePositiveInt: PositiveInteger?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueUnsignedInt: UnsignedInteger?

    /**
     * Minimum Allowed Value (for some types).
     */
    val minValueQuantity: Quantity?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueDate: Date?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueDateTime: DateTime?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueInstant: Instant?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueTime: Time?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueDecimal: Decimal?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueInteger: Integer?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValuePositiveInt: PositiveInteger?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueUnsignedInt: UnsignedInteger?

    /**
     * Maximum Allowed Value (for some types).
     */
    val maxValueQuantity: Quantity?

    /**
     * Max length for strings.
     */
    val maxLength: Integer?

    /**
     * Reference to invariant about presence.
     */
    val condition: List<String>?

    /**
     * Condition that must evaluate to true.
     */
    val constraint: List<ElementDefinitionConstraint>?

    /**
     * If the element must supported.
     */
    val mustSupport: Bool?

    /**
     * If this modifies the meaning of other elements.
     */
    val isModifier: Bool?

    /**
     * Include when _summary = true?.
     */
    val isSummary: Bool?

    /**
     * ValueSet details if this is coded.
     */
    val binding: ElementDefinitionBinding?

    /**
     * Map element to another set of definitions.
     */
    val mapping: List<ElementDefinitionMapping>?
}

/**
 * ElementDefinition
 *
 * SourceFileName: ElementDefinition.kt
 *
 * Captures constraints on each element within the resource, profile, or extension.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinition")
data class ElementDefinition(

    @SerialName("path")
    override val path: String,

    @SerialName("representation")
    override val representation: List<PropertyRepresentation>? = null,

    @SerialName("sliceName")
    override val sliceName: String? = null,

    @SerialName("label")
    override val label: String? = null,

    @SerialName("code")
    override val code: List<Coding>? = null,

    @SerialName("slicing")
    override val slicing: ElementDefinitionSlicing? = null,

    @SerialName("short")
    override val short: String? = null,

    @SerialName("definition")
    override val definition: String? = null,

    @SerialName("comment")
    override val comment: String? = null,

    @SerialName("requirements")
    override val requirements: String? = null,

    @SerialName("alias")
    override val alias: List<String>? = null,

    @SerialName("min")
    override val min: UnsignedInteger? = null,

    @SerialName("max")
    override val max: String? = null,

    @SerialName("base")
    override val base: ElementDefinitionBase? = null,

    @SerialName("contentReference")
    override val contentReference: String? = null,

    @SerialName("type")
    override val type: List<ElementDefinitionType>? = null,

    @SerialName("defaultValueBase64Binary")
    override val defaultValueBase64Binary: String? = null,

    @SerialName("defaultValueBoolean")
    override val defaultValueBoolean: Bool? = null,

    @SerialName("defaultValueCode")
    override val defaultValueCode: String? = null,

    @SerialName("defaultValueDate")
    override val defaultValueDate: Date? = null,

    @SerialName("defaultValueDateTime")
    override val defaultValueDateTime: DateTime? = null,

    @SerialName("defaultValueDecimal")
    override val defaultValueDecimal: Decimal? = null,

    @SerialName("defaultValueId")
    override val defaultValueId: String? = null,

    @SerialName("defaultValueInstant")
    override val defaultValueInstant: Instant? = null,

    @SerialName("defaultValueInteger")
    override val defaultValueInteger: Integer? = null,

    @SerialName("defaultValueMarkdown")
    override val defaultValueMarkdown: String? = null,

    @SerialName("defaultValueOid")
    override val defaultValueOid: String? = null,

    @SerialName("defaultValuePositiveInt")
    override val defaultValuePositiveInt: PositiveInteger? = null,

    @SerialName("defaultValueString")
    override val defaultValueString: String? = null,

    @SerialName("defaultValueTime")
    override val defaultValueTime: Time? = null,

    @SerialName("defaultValueUnsignedInt")
    override val defaultValueUnsignedInt: UnsignedInteger? = null,

    @SerialName("defaultValueUri")
    override val defaultValueUri: String? = null,

    @SerialName("defaultValueAddress")
    override val defaultValueAddress: Address? = null,

    @SerialName("defaultValueAge")
    override val defaultValueAge: Age? = null,

    @SerialName("defaultValueAnnotation")
    override val defaultValueAnnotation: Annotation? = null,

    @SerialName("defaultValueAttachment")
    override val defaultValueAttachment: Attachment? = null,

    @SerialName("defaultValueCodeableConcept")
    override val defaultValueCodeableConcept: CodeableConcept? = null,

    @SerialName("defaultValueCoding")
    override val defaultValueCoding: Coding? = null,

    @SerialName("defaultValueContactPoint")
    override val defaultValueContactPoint: ContactPoint? = null,

    @SerialName("defaultValueCount")
    override val defaultValueCount: Count? = null,

    @SerialName("defaultValueDistance")
    override val defaultValueDistance: Distance? = null,

    @SerialName("defaultValueDuration")
    override val defaultValueDuration: Duration? = null,

    @SerialName("defaultValueHumanName")
    override val defaultValueHumanName: HumanName? = null,

    @SerialName("defaultValueIdentifier")
    override val defaultValueIdentifier: Identifier? = null,

    @SerialName("defaultValueMoney")
    override val defaultValueMoney: Money? = null,

    @SerialName("defaultValuePeriod")
    override val defaultValuePeriod: Period? = null,

    @SerialName("defaultValueQuantity")
    override val defaultValueQuantity: Quantity? = null,

    @SerialName("defaultValueRange")
    override val defaultValueRange: Range? = null,

    @SerialName("defaultValueRatio")
    override val defaultValueRatio: Ratio? = null,

    @SerialName("defaultValueReference")
    override val defaultValueReference: Reference? = null,

    @SerialName("defaultValueSampledData")
    override val defaultValueSampledData: SampledData? = null,

    @SerialName("defaultValueSignature")
    override val defaultValueSignature: Signature? = null,

    @SerialName("defaultValueTiming")
    override val defaultValueTiming: Timing? = null,

    @SerialName("defaultValueMeta")
    override val defaultValueMeta: Meta? = null,

    @SerialName("meaningWhenMissing")
    override val meaningWhenMissing: String? = null,

    @SerialName("orderMeaning")
    override val orderMeaning: String? = null,

    @SerialName("fixedBase64Binary")
    override val fixedBase64Binary: String? = null,

    @SerialName("fixedBoolean")
    override val fixedBoolean: Bool? = null,

    @SerialName("fixedCode")
    override val fixedCode: String? = null,

    @SerialName("fixedDate")
    override val fixedDate: Date? = null,

    @SerialName("fixedDateTime")
    override val fixedDateTime: DateTime? = null,

    @SerialName("fixedDecimal")
    override val fixedDecimal: Decimal? = null,

    @SerialName("fixedId")
    override val fixedId: String? = null,

    @SerialName("fixedInstant")
    override val fixedInstant: Instant? = null,

    @SerialName("fixedInteger")
    override val fixedInteger: Integer? = null,

    @SerialName("fixedMarkdown")
    override val fixedMarkdown: String? = null,

    @SerialName("fixedOid")
    override val fixedOid: String? = null,

    @SerialName("fixedPositiveInt")
    override val fixedPositiveInt: PositiveInteger? = null,

    @SerialName("fixedString")
    override val fixedString: String? = null,

    @SerialName("fixedTime")
    override val fixedTime: Time? = null,

    @SerialName("fixedUnsignedInt")
    override val fixedUnsignedInt: UnsignedInteger? = null,

    @SerialName("fixedUri")
    override val fixedUri: String? = null,

    @SerialName("fixedAddress")
    override val fixedAddress: Address? = null,

    @SerialName("fixedAge")
    override val fixedAge: Age? = null,

    @SerialName("fixedAnnotation")
    override val fixedAnnotation: Annotation? = null,

    @SerialName("fixedAttachment")
    override val fixedAttachment: Attachment? = null,

    @SerialName("fixedCodeableConcept")
    override val fixedCodeableConcept: CodeableConcept? = null,

    @SerialName("fixedCoding")
    override val fixedCoding: Coding? = null,

    @SerialName("fixedContactPoint")
    override val fixedContactPoint: ContactPoint? = null,

    @SerialName("fixedCount")
    override val fixedCount: Count? = null,

    @SerialName("fixedDistance")
    override val fixedDistance: Distance? = null,

    @SerialName("fixedDuration")
    override val fixedDuration: Duration? = null,

    @SerialName("fixedHumanName")
    override val fixedHumanName: HumanName? = null,

    @SerialName("fixedIdentifier")
    override val fixedIdentifier: Identifier? = null,

    @SerialName("fixedMoney")
    override val fixedMoney: Money? = null,

    @SerialName("fixedPeriod")
    override val fixedPeriod: Period? = null,

    @SerialName("fixedQuantity")
    override val fixedQuantity: Quantity? = null,

    @SerialName("fixedRange")
    override val fixedRange: Range? = null,

    @SerialName("fixedRatio")
    override val fixedRatio: Ratio? = null,

    @SerialName("fixedReference")
    override val fixedReference: Reference? = null,

    @SerialName("fixedSampledData")
    override val fixedSampledData: SampledData? = null,

    @SerialName("fixedSignature")
    override val fixedSignature: Signature? = null,

    @SerialName("fixedTiming")
    override val fixedTiming: Timing? = null,

    @SerialName("fixedMeta")
    override val fixedMeta: Meta? = null,

    @SerialName("patternBase64Binary")
    override val patternBase64Binary: String? = null,

    @SerialName("patternBoolean")
    override val patternBoolean: Bool? = null,

    @SerialName("patternCode")
    override val patternCode: String? = null,

    @SerialName("patternDate")
    override val patternDate: Date? = null,

    @SerialName("patternDateTime")
    override val patternDateTime: DateTime? = null,

    @SerialName("patternDecimal")
    override val patternDecimal: Decimal? = null,

    @SerialName("patternId")
    override val patternId: String? = null,

    @SerialName("patternInstant")
    override val patternInstant: Instant? = null,

    @SerialName("patternInteger")
    override val patternInteger: Integer? = null,

    @SerialName("patternMarkdown")
    override val patternMarkdown: String? = null,

    @SerialName("patternOid")
    override val patternOid: String? = null,

    @SerialName("patternPositiveInt")
    override val patternPositiveInt: PositiveInteger? = null,

    @SerialName("patternString")
    override val patternString: String? = null,

    @SerialName("patternTime")
    override val patternTime: Time? = null,

    @SerialName("patternUnsignedInt")
    override val patternUnsignedInt: UnsignedInteger? = null,

    @SerialName("patternUri")
    override val patternUri: String? = null,

    @SerialName("patternAddress")
    override val patternAddress: Address? = null,

    @SerialName("patternAge")
    override val patternAge: Age? = null,

    @SerialName("patternAnnotation")
    override val patternAnnotation: Annotation? = null,

    @SerialName("patternAttachment")
    override val patternAttachment: Attachment? = null,

    @SerialName("patternCodeableConcept")
    override val patternCodeableConcept: CodeableConcept? = null,

    @SerialName("patternCoding")
    override val patternCoding: Coding? = null,

    @SerialName("patternContactPoint")
    override val patternContactPoint: ContactPoint? = null,

    @SerialName("patternCount")
    override val patternCount: Count? = null,

    @SerialName("patternDistance")
    override val patternDistance: Distance? = null,

    @SerialName("patternDuration")
    override val patternDuration: Duration? = null,

    @SerialName("patternHumanName")
    override val patternHumanName: HumanName? = null,

    @SerialName("patternIdentifier")
    override val patternIdentifier: Identifier? = null,

    @SerialName("patternMoney")
    override val patternMoney: Money? = null,

    @SerialName("patternPeriod")
    override val patternPeriod: Period? = null,

    @SerialName("patternQuantity")
    override val patternQuantity: Quantity? = null,

    @SerialName("patternRange")
    override val patternRange: Range? = null,

    @SerialName("patternRatio")
    override val patternRatio: Ratio? = null,

    @SerialName("patternReference")
    override val patternReference: Reference? = null,

    @SerialName("patternSampledData")
    override val patternSampledData: SampledData? = null,

    @SerialName("patternSignature")
    override val patternSignature: Signature? = null,

    @SerialName("patternTiming")
    override val patternTiming: Timing? = null,

    @SerialName("patternMeta")
    override val patternMeta: Meta? = null,

    @SerialName("example")
    override val example: List<ElementDefinitionExample>? = null,

    @SerialName("minValueDate")
    override val minValueDate: Date? = null,

    @SerialName("minValueDateTime")
    override val minValueDateTime: DateTime? = null,

    @SerialName("minValueInstant")
    override val minValueInstant: Instant? = null,

    @SerialName("minValueTime")
    override val minValueTime: Time? = null,

    @SerialName("minValueDecimal")
    override val minValueDecimal: Decimal? = null,

    @SerialName("minValueInteger")
    override val minValueInteger: Integer? = null,

    @SerialName("minValuePositiveInt")
    override val minValuePositiveInt: PositiveInteger? = null,

    @SerialName("minValueUnsignedInt")
    override val minValueUnsignedInt: UnsignedInteger? = null,

    @SerialName("minValueQuantity")
    override val minValueQuantity: Quantity? = null,

    @SerialName("maxValueDate")
    override val maxValueDate: Date? = null,

    @SerialName("maxValueDateTime")
    override val maxValueDateTime: DateTime? = null,

    @SerialName("maxValueInstant")
    override val maxValueInstant: Instant? = null,

    @SerialName("maxValueTime")
    override val maxValueTime: Time? = null,

    @SerialName("maxValueDecimal")
    override val maxValueDecimal: Decimal? = null,

    @SerialName("maxValueInteger")
    override val maxValueInteger: Integer? = null,

    @SerialName("maxValuePositiveInt")
    override val maxValuePositiveInt: PositiveInteger? = null,

    @SerialName("maxValueUnsignedInt")
    override val maxValueUnsignedInt: UnsignedInteger? = null,

    @SerialName("maxValueQuantity")
    override val maxValueQuantity: Quantity? = null,

    @SerialName("maxLength")
    override val maxLength: Integer? = null,

    @SerialName("condition")
    override val condition: List<String>? = null,

    @SerialName("constraint")
    override val constraint: List<ElementDefinitionConstraint>? = null,

    @SerialName("mustSupport")
    override val mustSupport: Bool? = null,

    @SerialName("isModifier")
    override val isModifier: Bool? = null,

    @SerialName("isSummary")
    override val isSummary: Bool? = null,

    @SerialName("binding")
    override val binding: ElementDefinitionBinding? = null,

    @SerialName("mapping")
    override val mapping: List<ElementDefinitionMapping>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinition"
    }
}

/**
 * FhirElementDefinitionBase
 *
 * Information about the base definition of the element, provided to make it unnecessary for tools to
 * trace the deviation of the element through the derived and related profiles. This information is
 * provided when the element definition is not the original definition of an element - i.g. either in a
 * constraint on another type, or for elements from a super type in a snap shot.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionBase</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionBase : FhirElement {

    /**
     * Path that identifies the base element.
     */
    val path: String

    /**
     * Min cardinality of the base element.
     */
    val min: UnsignedInteger

    /**
     * Max cardinality of the base element.
     */
    val max: String
}

/**
 * ElementDefinitionBase
 *
 * SourceFileName: ElementDefinition.kt
 *
 * Information about the base definition of the element, provided to make it unnecessary for tools to
 * trace the deviation of the element through the derived and related profiles. This information is
 * provided when the element definition is not the original definition of an element - i.g. either in a
 * constraint on another type, or for elements from a super type in a snap shot.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionBase</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionBase")
data class ElementDefinitionBase(

    @SerialName("path")
    override val path: String,

    @SerialName("min")
    override val min: UnsignedInteger,

    @SerialName("max")
    override val max: String,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionBase {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionBase"
    }
}

/**
 * FhirElementDefinitionBinding
 *
 * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data
 * types (string, uri).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionBinding</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionBinding : FhirElement {

    /**
     * Indicates the degree of conformance expectations associated with this binding -
     * that is, the degree to which the provided value set must be adhered to in the
     * instances.
     */
    val strength: BindingStrength

    /**
     * Human explanation of the value set.
     */
    val description: String?

    /**
     * Source of value set.
     */
    val valueSetUri: String?

    /**
     * Source of value set.
     */
    val valueSetReference: Reference?
}

/**
 * ElementDefinitionBinding
 *
 * SourceFileName: ElementDefinition.kt
 *
 * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data
 * types (string, uri).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionBinding</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionBinding")
data class ElementDefinitionBinding(

    @SerialName("strength")
    override val strength: BindingStrength,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("valueSetUri")
    override val valueSetUri: String? = null,

    @SerialName("valueSetReference")
    override val valueSetReference: Reference? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionBinding {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionBinding"
    }
}

/**
 * FhirElementDefinitionConstraint
 *
 * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated
 * within the context of the instance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionConstraint</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionConstraint : FhirElement {

    /**
     * Target of 'condition' reference above.
     */
    val key: String

    /**
     * Why this constraint is necessary or appropriate.
     */
    val requirements: String?

    /**
     * Identifies the impact constraint violation has on the conformance of the
     * instance.
     */
    val severity: ConstraintSeverity

    /**
     * Human description of constraint.
     */
    val human: String

    /**
     * FHIRPath expression of constraint.
     */
    val expression: String

    /**
     * XPath expression of constraint.
     */
    val xpath: String?

    /**
     * Reference to original source of constraint.
     */
    val source: String?
}

/**
 * ElementDefinitionConstraint
 *
 * SourceFileName: ElementDefinition.kt
 *
 * Formal constraints such as co-occurrence and other constraints that can be computationally evaluated
 * within the context of the instance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionConstraint</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionConstraint")
data class ElementDefinitionConstraint(

    @SerialName("key")
    override val key: String,

    @SerialName("requirements")
    override val requirements: String? = null,

    @SerialName("severity")
    override val severity: ConstraintSeverity,

    @SerialName("human")
    override val human: String,

    @SerialName("expression")
    override val expression: String,

    @SerialName("xpath")
    override val xpath: String? = null,

    @SerialName("source")
    override val source: String? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionConstraint {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionConstraint"
    }
}

/**
 * FhirElementDefinitionExample
 *
 * A sample value for this element demonstrating the type of information that would typically be found
 * in the element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionExample</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionExample : FhirElement {

    /**
     * Describes the purpose of this example.
     */
    val label: String

    /**
     * Value of Example (one of allowed types).
     */
    val valueBase64Binary: String?

    /**
     * Value of Example (one of allowed types).
     */
    val valueBoolean: Bool?

    /**
     * Value of Example (one of allowed types).
     */
    val valueCode: String?

    /**
     * Value of Example (one of allowed types).
     */
    val valueDate: Date?

    /**
     * Value of Example (one of allowed types).
     */
    val valueDateTime: DateTime?

    /**
     * Value of Example (one of allowed types).
     */
    val valueDecimal: Decimal?

    /**
     * Value of Example (one of allowed types).
     */
    val valueId: String?

    /**
     * Value of Example (one of allowed types).
     */
    val valueInstant: Instant?

    /**
     * Value of Example (one of allowed types).
     */
    val valueInteger: Integer?

    /**
     * Value of Example (one of allowed types).
     */
    val valueMarkdown: String?

    /**
     * Value of Example (one of allowed types).
     */
    val valueOid: String?

    /**
     * Value of Example (one of allowed types).
     */
    val valuePositiveInt: PositiveInteger?

    /**
     * Value of Example (one of allowed types).
     */
    val valueString: String?

    /**
     * Value of Example (one of allowed types).
     */
    val valueTime: Time?

    /**
     * Value of Example (one of allowed types).
     */
    val valueUnsignedInt: UnsignedInteger?

    /**
     * Value of Example (one of allowed types).
     */
    val valueUri: String?

    /**
     * Value of Example (one of allowed types).
     */
    val valueAddress: Address?

    /**
     * Value of Example (one of allowed types).
     */
    val valueAge: Age?

    /**
     * Value of Example (one of allowed types).
     */
    val valueAnnotation: Annotation?

    /**
     * Value of Example (one of allowed types).
     */
    val valueAttachment: Attachment?

    /**
     * Value of Example (one of allowed types).
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Value of Example (one of allowed types).
     */
    val valueCoding: Coding?

    /**
     * Value of Example (one of allowed types).
     */
    val valueContactPoint: ContactPoint?

    /**
     * Value of Example (one of allowed types).
     */
    val valueCount: Count?

    /**
     * Value of Example (one of allowed types).
     */
    val valueDistance: Distance?

    /**
     * Value of Example (one of allowed types).
     */
    val valueDuration: Duration?

    /**
     * Value of Example (one of allowed types).
     */
    val valueHumanName: HumanName?

    /**
     * Value of Example (one of allowed types).
     */
    val valueIdentifier: Identifier?

    /**
     * Value of Example (one of allowed types).
     */
    val valueMoney: Money?

    /**
     * Value of Example (one of allowed types).
     */
    val valuePeriod: Period?

    /**
     * Value of Example (one of allowed types).
     */
    val valueQuantity: Quantity?

    /**
     * Value of Example (one of allowed types).
     */
    val valueRange: Range?

    /**
     * Value of Example (one of allowed types).
     */
    val valueRatio: Ratio?

    /**
     * Value of Example (one of allowed types).
     */
    val valueReference: Reference?

    /**
     * Value of Example (one of allowed types).
     */
    val valueSampledData: SampledData?

    /**
     * Value of Example (one of allowed types).
     */
    val valueSignature: Signature?

    /**
     * Value of Example (one of allowed types).
     */
    val valueTiming: Timing?

    /**
     * Value of Example (one of allowed types).
     */
    val valueMeta: Meta?
}

/**
 * ElementDefinitionExample
 *
 * SourceFileName: ElementDefinition.kt
 *
 * A sample value for this element demonstrating the type of information that would typically be found
 * in the element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionExample</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionExample")
data class ElementDefinitionExample(

    @SerialName("label")
    override val label: String,

    @SerialName("valueBase64Binary")
    override val valueBase64Binary: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueCode")
    override val valueCode: String? = null,

    @SerialName("valueDate")
    override val valueDate: Date? = null,

    @SerialName("valueDateTime")
    override val valueDateTime: DateTime? = null,

    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    @SerialName("valueId")
    override val valueId: String? = null,

    @SerialName("valueInstant")
    override val valueInstant: Instant? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueMarkdown")
    override val valueMarkdown: String? = null,

    @SerialName("valueOid")
    override val valueOid: String? = null,

    @SerialName("valuePositiveInt")
    override val valuePositiveInt: PositiveInteger? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueTime")
    override val valueTime: Time? = null,

    @SerialName("valueUnsignedInt")
    override val valueUnsignedInt: UnsignedInteger? = null,

    @SerialName("valueUri")
    override val valueUri: String? = null,

    @SerialName("valueAddress")
    override val valueAddress: Address? = null,

    @SerialName("valueAge")
    override val valueAge: Age? = null,

    @SerialName("valueAnnotation")
    override val valueAnnotation: Annotation? = null,

    @SerialName("valueAttachment")
    override val valueAttachment: Attachment? = null,

    @SerialName("valueCodeableConcept")
    override val valueCodeableConcept: CodeableConcept? = null,

    @SerialName("valueCoding")
    override val valueCoding: Coding? = null,

    @SerialName("valueContactPoint")
    override val valueContactPoint: ContactPoint? = null,

    @SerialName("valueCount")
    override val valueCount: Count? = null,

    @SerialName("valueDistance")
    override val valueDistance: Distance? = null,

    @SerialName("valueDuration")
    override val valueDuration: Duration? = null,

    @SerialName("valueHumanName")
    override val valueHumanName: HumanName? = null,

    @SerialName("valueIdentifier")
    override val valueIdentifier: Identifier? = null,

    @SerialName("valueMoney")
    override val valueMoney: Money? = null,

    @SerialName("valuePeriod")
    override val valuePeriod: Period? = null,

    @SerialName("valueQuantity")
    override val valueQuantity: Quantity? = null,

    @SerialName("valueRange")
    override val valueRange: Range? = null,

    @SerialName("valueRatio")
    override val valueRatio: Ratio? = null,

    @SerialName("valueReference")
    override val valueReference: Reference? = null,

    @SerialName("valueSampledData")
    override val valueSampledData: SampledData? = null,

    @SerialName("valueSignature")
    override val valueSignature: Signature? = null,

    @SerialName("valueTiming")
    override val valueTiming: Timing? = null,

    @SerialName("valueMeta")
    override val valueMeta: Meta? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionExample {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionExample"
    }
}

/**
 * FhirElementDefinitionMapping
 *
 * Identifies a concept from an external specification that roughly corresponds to this element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionMapping</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionMapping : FhirElement {

    /**
     * Reference to mapping declaration.
     */
    val identity: String

    /**
     * Computable language of mapping.
     */
    val language: String?

    /**
     * Details of the mapping.
     */
    val map: String

    /**
     * Comments about the mapping or its use.
     */
    val comment: String?
}

/**
 * ElementDefinitionMapping
 *
 * SourceFileName: ElementDefinition.kt
 *
 * Identifies a concept from an external specification that roughly corresponds to this element.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionMapping</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionMapping")
data class ElementDefinitionMapping(

    @SerialName("identity")
    override val identity: String,

    @SerialName("language")
    override val language: String? = null,

    @SerialName("map")
    override val map: String,

    @SerialName("comment")
    override val comment: String? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionMapping {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionMapping"
    }
}

/**
 * FhirElementDefinitionSlicing
 *
 * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure
 * definition, there are multiple different constraints on a single element in the base resource).
 * Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource
 * with a choice of types. The set of slices is any elements that come after this in the element
 * sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionSlicing</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionSlicing : FhirElement {

    /**
     * Element values that are used to distinguish the slices.
     */
    val discriminator: List<ElementDefinitionSlicingDiscriminator>?

    /**
     * Text description of how slicing works (or not).
     */
    val description: String?

    /**
     * If elements must be in same order as slices.
     */
    val ordered: Bool?

    /**
     * Whether additional slices are allowed or not. When the slices are ordered,
     * profile authors can also say that additional slices are only allowed at the end.
     */
    val rules: SlicingRules
}

/**
 * ElementDefinitionSlicing
 *
 * SourceFileName: ElementDefinition.kt
 *
 * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure
 * definition, there are multiple different constraints on a single element in the base resource).
 * Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource
 * with a choice of types. The set of slices is any elements that come after this in the element
 * sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionSlicing</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionSlicing")
data class ElementDefinitionSlicing(

    @SerialName("discriminator")
    override val discriminator: List<ElementDefinitionSlicingDiscriminator>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("ordered")
    override val ordered: Bool? = null,

    @SerialName("rules")
    override val rules: SlicingRules,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionSlicing {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionSlicing"
    }
}

/**
 * FhirElementDefinitionSlicingDiscriminator
 *
 * Designates which child elements are used to discriminate between the slices when processing an
 * instance. If one or more discriminators are provided, the value of the child elements in the
 * instance data SHALL completely distinguish which slice the element in the resource matches based on
 * the allowed values for those elements in each of the slices.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionSlicingDiscriminator</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionSlicingDiscriminator : FhirElement {

    /**
     * How the element value is interpreted when discrimination is evaluated.
     */
    val type: DiscriminatorType

    /**
     * Path to element value.
     */
    val path: String
}

/**
 * ElementDefinitionSlicingDiscriminator
 *
 * SourceFileName: ElementDefinition.kt
 *
 * Designates which child elements are used to discriminate between the slices when processing an
 * instance. If one or more discriminators are provided, the value of the child elements in the
 * instance data SHALL completely distinguish which slice the element in the resource matches based on
 * the allowed values for those elements in each of the slices.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionSlicingDiscriminator</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionSlicingDiscriminator")
data class ElementDefinitionSlicingDiscriminator(

    @SerialName("type")
    override val type: DiscriminatorType,

    @SerialName("path")
    override val path: String,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionSlicingDiscriminator {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionSlicingDiscriminator"
    }
}

/**
 * FhirElementDefinitionType
 *
 * The data type or resource that the value of this element is permitted to be.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionType</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
interface FhirElementDefinitionType : FhirElement {

    /**
     * Data type or Resource (reference to definition).
     */
    val code: String

    /**
     * Profile (StructureDefinition) to apply (or IG).
     */
    val profile: String?

    /**
     * Profile (StructureDefinition) to apply to reference target (or IG).
     */
    val targetProfile: String?

    /**
     * If the type is a reference to another resource, how the resource is or can be
     * aggregated - is it a contained resource, or a reference, and if the context is a
     * bundle, is it included in the bundle.
     */
    val aggregation: List<AggregationMode>?

    /**
     * Whether this reference needs to be version specific or version independent, or
     * whether either can be used.
     */
    val versioning: ReferenceVersionRules?
}

/**
 * ElementDefinitionType
 *
 * SourceFileName: ElementDefinition.kt
 *
 * The data type or resource that the value of this element is permitted to be.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ElementDefinition">ElementDefinitionType</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ElementDefinition)
 */
@Serializable
@SerialName("ElementDefinitionType")
data class ElementDefinitionType(

    @SerialName("code")
    override val code: String,

    @SerialName("profile")
    override val profile: String? = null,

    @SerialName("targetProfile")
    override val targetProfile: String? = null,

    @SerialName("aggregation")
    override val aggregation: List<AggregationMode>? = null,

    @SerialName("versioning")
    override val versioning: ReferenceVersionRules? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirElementDefinitionType {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ElementDefinitionType"
    }
}
