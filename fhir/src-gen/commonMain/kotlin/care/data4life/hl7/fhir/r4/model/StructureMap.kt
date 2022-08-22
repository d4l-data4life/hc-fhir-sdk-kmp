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

import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.StructureMapContextType
import care.data4life.hl7.fhir.r4.codesystem.StructureMapGroupTypeMode
import care.data4life.hl7.fhir.r4.codesystem.StructureMapInputMode
import care.data4life.hl7.fhir.r4.codesystem.StructureMapModelMode
import care.data4life.hl7.fhir.r4.codesystem.StructureMapSourceListMode
import care.data4life.hl7.fhir.r4.codesystem.StructureMapTargetListMode
import care.data4life.hl7.fhir.r4.codesystem.StructureMapTransform
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import care.data4life.hl7.fhir.r4.primitive.Decimal
import care.data4life.hl7.fhir.r4.primitive.Instant
import care.data4life.hl7.fhir.r4.primitive.Integer
import care.data4life.hl7.fhir.r4.primitive.PositiveInteger
import care.data4life.hl7.fhir.r4.primitive.Time
import care.data4life.hl7.fhir.r4.primitive.UnsignedInteger
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirStructureMap
 *
 * A Map of relationships between 2 structures that can be used to transform data
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMap</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMap : FhirDomainResource {

    /**
     * Canonical identifier for this structure map, represented as a URI (globally
     * unique).
     */
    val url: String

    /**
     * Additional identifier for the structure map.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the structure map.
     */
    val version: String?

    /**
     * Name for this structure map (computer friendly).
     */
    val name: String

    /**
     * Name for this structure map (human friendly).
     */
    val title: String?

    /**
     * The status of this structure map. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Natural language description of the structure map.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for structure map (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this structure map is defined.
     */
    val purpose: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Structure Definition used by this map.
     */
    val structure: kotlin.collections.List<StructureMapStructure>?

    /**
     * Other maps used by this map (canonical URLs).
     */
    val import: kotlin.collections.List<String>?

    /**
     * Named sections for reader convenience.
     */
    val group: kotlin.collections.List<StructureMapGroup>
}

/**
 * StructureMap
 *
 * A Map of relationships between 2 structures that can be used to transform data
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMap</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMap")
data class StructureMap(

    @SerialName("url")
    override val url: String,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("useContext")
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("structure")
    override val structure: kotlin.collections.List<StructureMapStructure>? = null,

    @SerialName("import")
    override val import: kotlin.collections.List<String>? = null,

    @SerialName("group")
    override val group: kotlin.collections.List<StructureMapGroup>,

    // # DomainResource

    @SerialName("text")
    override val text: Narrative? = null,

    @SerialName("contained")
    override val contained: kotlin.collections.List<FhirResource>? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null,

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Resource

    @SerialName("id")
    override val id: String? = null,

    @SerialName("meta")
    override val meta: Meta? = null,

    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    @SerialName("language")
    override val language: String? = null
) : FhirStructureMap {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMap"
    }
}

/**
 * FhirStructureMapGroup
 *
 * Organizes the mapping into manageable chunks for human review/ease of maintenance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapGroup : FhirBackboneElement {

    /**
     * Human-readable label.
     */
    val name: String

    /**
     * Another group that this group adds rules to.
     */
    val extends: String?

    /**
     * If this is the default rule set to apply for the source type or this combination
     * of types.
     */
    val typeMode: StructureMapGroupTypeMode

    /**
     * Additional description/explanation for group.
     */
    val documentation: String?

    /**
     * Named instance provided when invoking the map.
     */
    val input: kotlin.collections.List<StructureMapGroupInput>

    /**
     * Transform Rule from source to target.
     */
    val rule: kotlin.collections.List<StructureMapGroupRule>
}

/**
 * StructureMapGroup
 *
 * Organizes the mapping into manageable chunks for human review/ease of maintenance.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapGroup")
data class StructureMapGroup(

    @SerialName("name")
    override val name: String,

    @SerialName("extends")
    override val extends: String? = null,

    @SerialName("typeMode")
    override val typeMode: StructureMapGroupTypeMode,

    @SerialName("documentation")
    override val documentation: String? = null,

    @SerialName("input")
    override val input: kotlin.collections.List<StructureMapGroupInput>,

    @SerialName("rule")
    override val rule: kotlin.collections.List<StructureMapGroupRule>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapGroup {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapGroup"
    }
}

/**
 * FhirStructureMapGroupInput
 *
 * A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupInput</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapGroupInput : FhirBackboneElement {

    /**
     * Name for this instance of data.
     */
    val name: String

    /**
     * Type for this instance of data.
     */
    val type: String?

    /**
     * Mode for this instance of data.
     */
    val mode: StructureMapInputMode

    /**
     * Documentation for this instance of data.
     */
    val documentation: String?
}

/**
 * StructureMapGroupInput
 *
 * A name assigned to an instance of data. The instance must be provided when the mapping is invoked.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupInput</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapGroupInput")
data class StructureMapGroupInput(

    @SerialName("name")
    override val name: String,

    @SerialName("type")
    override val type: String? = null,

    @SerialName("mode")
    override val mode: StructureMapInputMode,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapGroupInput {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapGroupInput"
    }
}

/**
 * FhirStructureMapGroupRule
 *
 * Transform Rule from source to target
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRule</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapGroupRule : FhirBackboneElement {

    /**
     * Name of the rule for internal references.
     */
    val name: String

    /**
     * Source inputs to the mapping.
     */
    val source: kotlin.collections.List<StructureMapGroupRuleSource>

    /**
     * Content to create because of this mapping rule.
     */
    val target: kotlin.collections.List<StructureMapGroupRuleTarget>?

    /**
     * Rules contained in this rule.
     */
    val rule: kotlin.collections.List<StructureMapGroupRule>?

    /**
     * Which other rules to apply in the context of this rule.
     */
    val dependent: kotlin.collections.List<StructureMapGroupRuleDependent>?

    /**
     * Documentation for this instance of data.
     */
    val documentation: String?
}

/**
 * StructureMapGroupRule
 *
 * Transform Rule from source to target
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRule</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapGroupRule")
data class StructureMapGroupRule(

    @SerialName("name")
    override val name: String,

    @SerialName("source")
    override val source: kotlin.collections.List<StructureMapGroupRuleSource>,

    @SerialName("target")
    override val target: kotlin.collections.List<StructureMapGroupRuleTarget>? = null,

    @SerialName("rule")
    override val rule: kotlin.collections.List<StructureMapGroupRule>? = null,

    @SerialName("dependent")
    override val dependent: kotlin.collections.List<StructureMapGroupRuleDependent>? = null,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapGroupRule {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapGroupRule"
    }
}

/**
 * FhirStructureMapGroupRuleDependent
 *
 * Which other rules to apply in the context of this rule
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleDependent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapGroupRuleDependent : FhirBackboneElement {

    /**
     * Name of a rule or group to apply.
     */
    val name: String

    /**
     * Variable to pass to the rule or group.
     */
    val variable: kotlin.collections.List<String>
}

/**
 * StructureMapGroupRuleDependent
 *
 * Which other rules to apply in the context of this rule
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleDependent</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapGroupRuleDependent")
data class StructureMapGroupRuleDependent(

    @SerialName("name")
    override val name: String,

    @SerialName("variable")
    override val variable: kotlin.collections.List<String>,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapGroupRuleDependent {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapGroupRuleDependent"
    }
}

/**
 * FhirStructureMapGroupRuleSource
 *
 * Source inputs to the mapping
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleSource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapGroupRuleSource : FhirBackboneElement {

    /**
     * Type or variable this rule applies to.
     */
    val context: String

    /**
     * Specified minimum cardinality.
     */
    val min: Integer?

    /**
     * Specified maximum cardinality (number or *).
     */
    val max: String?

    /**
     * Rule only applies if source has this type.
     */
    val type: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueBase64Binary: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueBoolean: Bool?

    /**
     * Default value if no value exists.
     */
    val defaultValueCanonical: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueCode: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueDate: Date?

    /**
     * Default value if no value exists.
     */
    val defaultValueDateTime: DateTime?

    /**
     * Default value if no value exists.
     */
    val defaultValueDecimal: Decimal?

    /**
     * Default value if no value exists.
     */
    val defaultValueId: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueInstant: Instant?

    /**
     * Default value if no value exists.
     */
    val defaultValueInteger: Integer?

    /**
     * Default value if no value exists.
     */
    val defaultValueMarkdown: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueOid: String?

    /**
     * Default value if no value exists.
     */
    val defaultValuePositiveInt: PositiveInteger?

    /**
     * Default value if no value exists.
     */
    val defaultValueString: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueTime: Time?

    /**
     * Default value if no value exists.
     */
    val defaultValueUnsignedInt: UnsignedInteger?

    /**
     * Default value if no value exists.
     */
    val defaultValueUri: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueUrl: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueUuid: String?

    /**
     * Default value if no value exists.
     */
    val defaultValueAddress: Address?

    /**
     * Default value if no value exists.
     */
    val defaultValueAge: Age?

    /**
     * Default value if no value exists.
     */
    val defaultValueAnnotation: Annotation?

    /**
     * Default value if no value exists.
     */
    val defaultValueAttachment: Attachment?

    /**
     * Default value if no value exists.
     */
    val defaultValueCodeableConcept: CodeableConcept?

    /**
     * Default value if no value exists.
     */
    val defaultValueCoding: Coding?

    /**
     * Default value if no value exists.
     */
    val defaultValueContactPoint: ContactPoint?

    /**
     * Default value if no value exists.
     */
    val defaultValueCount: Count?

    /**
     * Default value if no value exists.
     */
    val defaultValueDistance: Distance?

    /**
     * Default value if no value exists.
     */
    val defaultValueDuration: Duration?

    /**
     * Default value if no value exists.
     */
    val defaultValueHumanName: HumanName?

    /**
     * Default value if no value exists.
     */
    val defaultValueIdentifier: Identifier?

    /**
     * Default value if no value exists.
     */
    val defaultValueMoney: Money?

    /**
     * Default value if no value exists.
     */
    val defaultValuePeriod: Period?

    /**
     * Default value if no value exists.
     */
    val defaultValueQuantity: Quantity?

    /**
     * Default value if no value exists.
     */
    val defaultValueRange: Range?

    /**
     * Default value if no value exists.
     */
    val defaultValueRatio: Ratio?

    /**
     * Default value if no value exists.
     */
    val defaultValueReference: Reference?

    /**
     * Default value if no value exists.
     */
    val defaultValueSampledData: SampledData?

    /**
     * Default value if no value exists.
     */
    val defaultValueSignature: Signature?

    /**
     * Default value if no value exists.
     */
    val defaultValueTiming: Timing?

    /**
     * Default value if no value exists.
     */
    val defaultValueContactDetail: ContactDetail?

    /**
     * Default value if no value exists.
     */
    val defaultValueContributor: Contributor?

    /**
     * Default value if no value exists.
     */
    val defaultValueDataRequirement: DataRequirement?

    /**
     * Default value if no value exists.
     */
    val defaultValueExpression: Expression?

    /**
     * Default value if no value exists.
     */
    val defaultValueParameterDefinition: ParameterDefinition?

    /**
     * Default value if no value exists.
     */
    val defaultValueRelatedArtifact: RelatedArtifact?

    /**
     * Default value if no value exists.
     */
    val defaultValueTriggerDefinition: TriggerDefinition?

    /**
     * Default value if no value exists.
     */
    val defaultValueUsageContext: UsageContext?

    /**
     * Default value if no value exists.
     */
    val defaultValueDosage: Dosage?

    /**
     * Default value if no value exists.
     */
    val defaultValueMeta: Meta?

    /**
     * Optional field for this source.
     */
    val element: String?

    /**
     * How to handle the list mode for this element.
     */
    val listMode: StructureMapSourceListMode?

    /**
     * Named context for field, if a field is specified.
     */
    val variable: String?

    /**
     * FHIRPath expression - must be true or the rule does not apply.
     */
    val condition: String?

    /**
     * FHIRPath expression - must be true or the mapping engine throws an error instead
     * of completing.
     */
    val check: String?

    /**
     * Message to put in log if source exists (FHIRPath).
     */
    val logMessage: String?
}

/**
 * StructureMapGroupRuleSource
 *
 * Source inputs to the mapping
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleSource</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapGroupRuleSource")
data class StructureMapGroupRuleSource(

    @SerialName("context")
    override val context: String,

    @SerialName("min")
    override val min: Integer? = null,

    @SerialName("max")
    override val max: String? = null,

    @SerialName("type")
    override val type: String? = null,

    @SerialName("defaultValueBase64Binary")
    override val defaultValueBase64Binary: String? = null,

    @SerialName("defaultValueBoolean")
    override val defaultValueBoolean: Bool? = null,

    @SerialName("defaultValueCanonical")
    override val defaultValueCanonical: String? = null,

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

    @SerialName("defaultValueUrl")
    override val defaultValueUrl: String? = null,

    @SerialName("defaultValueUuid")
    override val defaultValueUuid: String? = null,

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

    @SerialName("defaultValueContactDetail")
    override val defaultValueContactDetail: ContactDetail? = null,

    @SerialName("defaultValueContributor")
    override val defaultValueContributor: Contributor? = null,

    @SerialName("defaultValueDataRequirement")
    override val defaultValueDataRequirement: DataRequirement? = null,

    @SerialName("defaultValueExpression")
    override val defaultValueExpression: Expression? = null,

    @SerialName("defaultValueParameterDefinition")
    override val defaultValueParameterDefinition: ParameterDefinition? = null,

    @SerialName("defaultValueRelatedArtifact")
    override val defaultValueRelatedArtifact: RelatedArtifact? = null,

    @SerialName("defaultValueTriggerDefinition")
    override val defaultValueTriggerDefinition: TriggerDefinition? = null,

    @SerialName("defaultValueUsageContext")
    override val defaultValueUsageContext: UsageContext? = null,

    @SerialName("defaultValueDosage")
    override val defaultValueDosage: Dosage? = null,

    @SerialName("defaultValueMeta")
    override val defaultValueMeta: Meta? = null,

    @SerialName("element")
    override val element: String? = null,

    @SerialName("listMode")
    override val listMode: StructureMapSourceListMode? = null,

    @SerialName("variable")
    override val variable: String? = null,

    @SerialName("condition")
    override val condition: String? = null,

    @SerialName("check")
    override val check: String? = null,

    @SerialName("logMessage")
    override val logMessage: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapGroupRuleSource {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapGroupRuleSource"
    }
}

/**
 * FhirStructureMapGroupRuleTarget
 *
 * Content to create because of this mapping rule
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleTarget</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapGroupRuleTarget : FhirBackboneElement {

    /**
     * Type or variable this rule applies to.
     */
    val context: String?

    /**
     * How to interpret the context.
     */
    val contextType: StructureMapContextType?

    /**
     * Field to create in the context.
     */
    val element: String?

    /**
     * Named context for field, if desired, and a field is specified.
     */
    val variable: String?

    /**
     * If field is a list, how to manage the list.
     */
    val listMode: kotlin.collections.List<StructureMapTargetListMode>?

    /**
     * Internal rule reference for shared list items.
     */
    val listRuleId: String?

    /**
     * How the data is copied / created.
     */
    val transform: StructureMapTransform?

    /**
     * Parameters to the transform.
     */
    val parameter: kotlin.collections.List<StructureMapGroupRuleTargetParameter>?
}

/**
 * StructureMapGroupRuleTarget
 *
 * Content to create because of this mapping rule
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleTarget</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapGroupRuleTarget")
data class StructureMapGroupRuleTarget(

    @SerialName("context")
    override val context: String? = null,

    @SerialName("contextType")
    override val contextType: StructureMapContextType? = null,

    @SerialName("element")
    override val element: String? = null,

    @SerialName("variable")
    override val variable: String? = null,

    @SerialName("listMode")
    override val listMode: kotlin.collections.List<StructureMapTargetListMode>? = null,

    @SerialName("listRuleId")
    override val listRuleId: String? = null,

    @SerialName("transform")
    override val transform: StructureMapTransform? = null,

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<StructureMapGroupRuleTargetParameter>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapGroupRuleTarget {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapGroupRuleTarget"
    }
}

/**
 * FhirStructureMapGroupRuleTargetParameter
 *
 * Parameters to the transform
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleTargetParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapGroupRuleTargetParameter : FhirBackboneElement {

    /**
     * Parameter value - variable or literal.
     */
    val valueId: String?

    /**
     * Parameter value - variable or literal.
     */
    val valueString: String?

    /**
     * Parameter value - variable or literal.
     */
    val valueBoolean: Bool?

    /**
     * Parameter value - variable or literal.
     */
    val valueInteger: Integer?

    /**
     * Parameter value - variable or literal.
     */
    val valueDecimal: Decimal?
}

/**
 * StructureMapGroupRuleTargetParameter
 *
 * Parameters to the transform
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapGroupRuleTargetParameter</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapGroupRuleTargetParameter")
data class StructureMapGroupRuleTargetParameter(

    @SerialName("valueId")
    override val valueId: String? = null,

    @SerialName("valueString")
    override val valueString: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueInteger")
    override val valueInteger: Integer? = null,

    @SerialName("valueDecimal")
    override val valueDecimal: Decimal? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapGroupRuleTargetParameter {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapGroupRuleTargetParameter"
    }
}

/**
 * FhirStructureMapStructure
 *
 * A structure definition used by this map. The structure definition may describe instances that are
 * converted, or the instances that are produced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapStructure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
interface FhirStructureMapStructure : FhirBackboneElement {

    /**
     * Canonical reference to structure definition.
     */
    val url: String

    /**
     * How the referenced structure is used in this mapping.
     */
    val mode: StructureMapModelMode

    /**
     * Name for type in this map.
     */
    val alias: String?

    /**
     * Documentation on use of structure.
     */
    val documentation: String?
}

/**
 * StructureMapStructure
 *
 * A structure definition used by this map. The structure definition may describe instances that are
 * converted, or the instances that are produced.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/StructureMap">StructureMapStructure</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/StructureMap)
 */
@Serializable
@SerialName("StructureMapStructure")
data class StructureMapStructure(

    @SerialName("url")
    override val url: String,

    @SerialName("mode")
    override val mode: StructureMapModelMode,

    @SerialName("alias")
    override val alias: String? = null,

    @SerialName("documentation")
    override val documentation: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirStructureMapStructure {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "StructureMapStructure"
    }
}
