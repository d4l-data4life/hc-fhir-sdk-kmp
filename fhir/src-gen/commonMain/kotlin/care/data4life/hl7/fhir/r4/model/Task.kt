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

import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.TaskStatus
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
 * FhirTask
 *
 * A task to be performed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">Task</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
interface FhirTask : FhirDomainResource {

    /**
     * Task Instance Identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Formal definition of task.
     */
    val instantiatesCanonical: String?

    /**
     * Formal definition of task.
     */
    val instantiatesUri: String?

    /**
     * Request fulfilled by this task.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Requisition or grouper id.
     */
    val groupIdentifier: Identifier?

    /**
     * Composite task.
     */
    val partOf: kotlin.collections.List<Reference>?

    /**
     * The current status of the task.
     */
    val status: TaskStatus

    /**
     * Reason for current status.
     */
    val statusReason: CodeableConcept?

    /**
     * E.g. "Specimen collected", "IV prepped".
     */
    val businessStatus: CodeableConcept?

    /**
     * unknown | proposal | plan | order | original-order | reflex-order | filler-order
     * | instance-order | option.
     */
    val intent: String

    /**
     * Indicates how quickly the Task should be addressed with respect to other
     * requests.
     */
    val priority: RequestPriority?

    /**
     * Task Type.
     */
    val code: CodeableConcept?

    /**
     * Human-readable explanation of task.
     */
    val description: String?

    /**
     * What task is acting on.
     */
    val focus: Reference?

    /**
     * Beneficiary of the Task.
     */
    val forr: Reference?

    /**
     * Healthcare event during which this task originated.
     */
    val encounter: Reference?

    /**
     * Start and end time of execution.
     */
    val executionPeriod: Period?

    /**
     * Task Creation Date.
     */
    val authoredOn: DateTime?

    /**
     * Task Last Modified Date.
     */
    val lastModified: DateTime?

    /**
     * Who is asking for task to be done.
     */
    val requester: Reference?

    /**
     * Requested performer.
     */
    val performerType: kotlin.collections.List<CodeableConcept>?

    /**
     * Responsible individual.
     */
    val owner: Reference?

    /**
     * Where task occurs.
     */
    val location: Reference?

    /**
     * Why task is needed.
     */
    val reasonCode: CodeableConcept?

    /**
     * Why task is needed.
     */
    val reasonReference: Reference?

    /**
     * Associated insurance coverage.
     */
    val insurance: kotlin.collections.List<Reference>?

    /**
     * Comments made about the task.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Key events in history of the Task.
     */
    val relevantHistory: kotlin.collections.List<Reference>?

    /**
     * Constraints on fulfillment tasks.
     */
    val restriction: TaskRestriction?

    /**
     * Information used to perform task.
     */
    val input: kotlin.collections.List<TaskInput>?

    /**
     * Information produced as part of task.
     */
    val output: kotlin.collections.List<TaskOutput>?
}

/**
 * Task
 *
 * A task to be performed
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">Task</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
@Serializable
@SerialName("Task")
data class Task(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: String? = null,

    @SerialName("instantiatesUri")
    override val instantiatesUri: String? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("partOf")
    override val partOf: kotlin.collections.List<Reference>? = null,

    @SerialName("status")
    override val status: TaskStatus,

    @SerialName("statusReason")
    override val statusReason: CodeableConcept? = null,

    @SerialName("businessStatus")
    override val businessStatus: CodeableConcept? = null,

    @SerialName("intent")
    override val intent: String,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("focus")
    override val focus: Reference? = null,

    @SerialName("for")
    override val forr: Reference? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("executionPeriod")
    override val executionPeriod: Period? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("lastModified")
    override val lastModified: DateTime? = null,

    @SerialName("requester")
    override val requester: Reference? = null,

    @SerialName("performerType")
    override val performerType: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("owner")
    override val owner: Reference? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: CodeableConcept? = null,

    @SerialName("reasonReference")
    override val reasonReference: Reference? = null,

    @SerialName("insurance")
    override val insurance: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("relevantHistory")
    override val relevantHistory: kotlin.collections.List<Reference>? = null,

    @SerialName("restriction")
    override val restriction: TaskRestriction? = null,

    @SerialName("input")
    override val input: kotlin.collections.List<TaskInput>? = null,

    @SerialName("output")
    override val output: kotlin.collections.List<TaskOutput>? = null,

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
) : FhirTask {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Task"
    }
}

/**
 * FhirTaskInput
 *
 * Additional information that may be needed in the execution of the task.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">TaskInput</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
interface FhirTaskInput : FhirBackboneElement {

    /**
     * Label for the input.
     */
    val type: CodeableConcept

    /**
     * Content to use in performing the task.
     */
    val valueBase64Binary: String?

    /**
     * Content to use in performing the task.
     */
    val valueBoolean: Bool?

    /**
     * Content to use in performing the task.
     */
    val valueCanonical: String?

    /**
     * Content to use in performing the task.
     */
    val valueCode: String?

    /**
     * Content to use in performing the task.
     */
    val valueDate: Date?

    /**
     * Content to use in performing the task.
     */
    val valueDateTime: DateTime?

    /**
     * Content to use in performing the task.
     */
    val valueDecimal: Decimal?

    /**
     * Content to use in performing the task.
     */
    val valueId: String?

    /**
     * Content to use in performing the task.
     */
    val valueInstant: Instant?

    /**
     * Content to use in performing the task.
     */
    val valueInteger: Integer?

    /**
     * Content to use in performing the task.
     */
    val valueMarkdown: String?

    /**
     * Content to use in performing the task.
     */
    val valueOid: String?

    /**
     * Content to use in performing the task.
     */
    val valuePositiveInt: PositiveInteger?

    /**
     * Content to use in performing the task.
     */
    val valueString: String?

    /**
     * Content to use in performing the task.
     */
    val valueTime: Time?

    /**
     * Content to use in performing the task.
     */
    val valueUnsignedInt: UnsignedInteger?

    /**
     * Content to use in performing the task.
     */
    val valueUri: String?

    /**
     * Content to use in performing the task.
     */
    val valueUrl: String?

    /**
     * Content to use in performing the task.
     */
    val valueUuid: String?

    /**
     * Content to use in performing the task.
     */
    val valueAddress: Address?

    /**
     * Content to use in performing the task.
     */
    val valueAge: Age?

    /**
     * Content to use in performing the task.
     */
    val valueAnnotation: Annotation?

    /**
     * Content to use in performing the task.
     */
    val valueAttachment: Attachment?

    /**
     * Content to use in performing the task.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Content to use in performing the task.
     */
    val valueCoding: Coding?

    /**
     * Content to use in performing the task.
     */
    val valueContactPoint: ContactPoint?

    /**
     * Content to use in performing the task.
     */
    val valueCount: Count?

    /**
     * Content to use in performing the task.
     */
    val valueDistance: Distance?

    /**
     * Content to use in performing the task.
     */
    val valueDuration: Duration?

    /**
     * Content to use in performing the task.
     */
    val valueHumanName: HumanName?

    /**
     * Content to use in performing the task.
     */
    val valueIdentifier: Identifier?

    /**
     * Content to use in performing the task.
     */
    val valueMoney: Money?

    /**
     * Content to use in performing the task.
     */
    val valuePeriod: Period?

    /**
     * Content to use in performing the task.
     */
    val valueQuantity: Quantity?

    /**
     * Content to use in performing the task.
     */
    val valueRange: Range?

    /**
     * Content to use in performing the task.
     */
    val valueRatio: Ratio?

    /**
     * Content to use in performing the task.
     */
    val valueReference: Reference?

    /**
     * Content to use in performing the task.
     */
    val valueSampledData: SampledData?

    /**
     * Content to use in performing the task.
     */
    val valueSignature: Signature?

    /**
     * Content to use in performing the task.
     */
    val valueTiming: Timing?

    /**
     * Content to use in performing the task.
     */
    val valueContactDetail: ContactDetail?

    /**
     * Content to use in performing the task.
     */
    val valueContributor: Contributor?

    /**
     * Content to use in performing the task.
     */
    val valueDataRequirement: DataRequirement?

    /**
     * Content to use in performing the task.
     */
    val valueExpression: Expression?

    /**
     * Content to use in performing the task.
     */
    val valueParameterDefinition: ParameterDefinition?

    /**
     * Content to use in performing the task.
     */
    val valueRelatedArtifact: RelatedArtifact?

    /**
     * Content to use in performing the task.
     */
    val valueTriggerDefinition: TriggerDefinition?

    /**
     * Content to use in performing the task.
     */
    val valueUsageContext: UsageContext?

    /**
     * Content to use in performing the task.
     */
    val valueDosage: Dosage?

    /**
     * Content to use in performing the task.
     */
    val valueMeta: Meta?
}

/**
 * TaskInput
 *
 * Additional information that may be needed in the execution of the task.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">TaskInput</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
@Serializable
@SerialName("TaskInput")
data class TaskInput(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("valueBase64Binary")
    override val valueBase64Binary: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueCanonical")
    override val valueCanonical: String? = null,

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

    @SerialName("valueUrl")
    override val valueUrl: String? = null,

    @SerialName("valueUuid")
    override val valueUuid: String? = null,

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

    @SerialName("valueContactDetail")
    override val valueContactDetail: ContactDetail? = null,

    @SerialName("valueContributor")
    override val valueContributor: Contributor? = null,

    @SerialName("valueDataRequirement")
    override val valueDataRequirement: DataRequirement? = null,

    @SerialName("valueExpression")
    override val valueExpression: Expression? = null,

    @SerialName("valueParameterDefinition")
    override val valueParameterDefinition: ParameterDefinition? = null,

    @SerialName("valueRelatedArtifact")
    override val valueRelatedArtifact: RelatedArtifact? = null,

    @SerialName("valueTriggerDefinition")
    override val valueTriggerDefinition: TriggerDefinition? = null,

    @SerialName("valueUsageContext")
    override val valueUsageContext: UsageContext? = null,

    @SerialName("valueDosage")
    override val valueDosage: Dosage? = null,

    @SerialName("valueMeta")
    override val valueMeta: Meta? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTaskInput {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TaskInput"
    }
}

/**
 * FhirTaskOutput
 *
 * Outputs produced by the Task.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">TaskOutput</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
interface FhirTaskOutput : FhirBackboneElement {

    /**
     * Label for output.
     */
    val type: CodeableConcept

    /**
     * Result of output.
     */
    val valueBase64Binary: String?

    /**
     * Result of output.
     */
    val valueBoolean: Bool?

    /**
     * Result of output.
     */
    val valueCanonical: String?

    /**
     * Result of output.
     */
    val valueCode: String?

    /**
     * Result of output.
     */
    val valueDate: Date?

    /**
     * Result of output.
     */
    val valueDateTime: DateTime?

    /**
     * Result of output.
     */
    val valueDecimal: Decimal?

    /**
     * Result of output.
     */
    val valueId: String?

    /**
     * Result of output.
     */
    val valueInstant: Instant?

    /**
     * Result of output.
     */
    val valueInteger: Integer?

    /**
     * Result of output.
     */
    val valueMarkdown: String?

    /**
     * Result of output.
     */
    val valueOid: String?

    /**
     * Result of output.
     */
    val valuePositiveInt: PositiveInteger?

    /**
     * Result of output.
     */
    val valueString: String?

    /**
     * Result of output.
     */
    val valueTime: Time?

    /**
     * Result of output.
     */
    val valueUnsignedInt: UnsignedInteger?

    /**
     * Result of output.
     */
    val valueUri: String?

    /**
     * Result of output.
     */
    val valueUrl: String?

    /**
     * Result of output.
     */
    val valueUuid: String?

    /**
     * Result of output.
     */
    val valueAddress: Address?

    /**
     * Result of output.
     */
    val valueAge: Age?

    /**
     * Result of output.
     */
    val valueAnnotation: Annotation?

    /**
     * Result of output.
     */
    val valueAttachment: Attachment?

    /**
     * Result of output.
     */
    val valueCodeableConcept: CodeableConcept?

    /**
     * Result of output.
     */
    val valueCoding: Coding?

    /**
     * Result of output.
     */
    val valueContactPoint: ContactPoint?

    /**
     * Result of output.
     */
    val valueCount: Count?

    /**
     * Result of output.
     */
    val valueDistance: Distance?

    /**
     * Result of output.
     */
    val valueDuration: Duration?

    /**
     * Result of output.
     */
    val valueHumanName: HumanName?

    /**
     * Result of output.
     */
    val valueIdentifier: Identifier?

    /**
     * Result of output.
     */
    val valueMoney: Money?

    /**
     * Result of output.
     */
    val valuePeriod: Period?

    /**
     * Result of output.
     */
    val valueQuantity: Quantity?

    /**
     * Result of output.
     */
    val valueRange: Range?

    /**
     * Result of output.
     */
    val valueRatio: Ratio?

    /**
     * Result of output.
     */
    val valueReference: Reference?

    /**
     * Result of output.
     */
    val valueSampledData: SampledData?

    /**
     * Result of output.
     */
    val valueSignature: Signature?

    /**
     * Result of output.
     */
    val valueTiming: Timing?

    /**
     * Result of output.
     */
    val valueContactDetail: ContactDetail?

    /**
     * Result of output.
     */
    val valueContributor: Contributor?

    /**
     * Result of output.
     */
    val valueDataRequirement: DataRequirement?

    /**
     * Result of output.
     */
    val valueExpression: Expression?

    /**
     * Result of output.
     */
    val valueParameterDefinition: ParameterDefinition?

    /**
     * Result of output.
     */
    val valueRelatedArtifact: RelatedArtifact?

    /**
     * Result of output.
     */
    val valueTriggerDefinition: TriggerDefinition?

    /**
     * Result of output.
     */
    val valueUsageContext: UsageContext?

    /**
     * Result of output.
     */
    val valueDosage: Dosage?

    /**
     * Result of output.
     */
    val valueMeta: Meta?
}

/**
 * TaskOutput
 *
 * Outputs produced by the Task.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">TaskOutput</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
@Serializable
@SerialName("TaskOutput")
data class TaskOutput(

    @SerialName("type")
    override val type: CodeableConcept,

    @SerialName("valueBase64Binary")
    override val valueBase64Binary: String? = null,

    @SerialName("valueBoolean")
    override val valueBoolean: Bool? = null,

    @SerialName("valueCanonical")
    override val valueCanonical: String? = null,

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

    @SerialName("valueUrl")
    override val valueUrl: String? = null,

    @SerialName("valueUuid")
    override val valueUuid: String? = null,

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

    @SerialName("valueContactDetail")
    override val valueContactDetail: ContactDetail? = null,

    @SerialName("valueContributor")
    override val valueContributor: Contributor? = null,

    @SerialName("valueDataRequirement")
    override val valueDataRequirement: DataRequirement? = null,

    @SerialName("valueExpression")
    override val valueExpression: Expression? = null,

    @SerialName("valueParameterDefinition")
    override val valueParameterDefinition: ParameterDefinition? = null,

    @SerialName("valueRelatedArtifact")
    override val valueRelatedArtifact: RelatedArtifact? = null,

    @SerialName("valueTriggerDefinition")
    override val valueTriggerDefinition: TriggerDefinition? = null,

    @SerialName("valueUsageContext")
    override val valueUsageContext: UsageContext? = null,

    @SerialName("valueDosage")
    override val valueDosage: Dosage? = null,

    @SerialName("valueMeta")
    override val valueMeta: Meta? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTaskOutput {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TaskOutput"
    }
}

/**
 * FhirTaskRestriction
 *
 * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the
 * request to be actioned), this element identifies any limitations on what parts of the referenced
 * request should be actioned.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">TaskRestriction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
interface FhirTaskRestriction : FhirBackboneElement {

    /**
     * How many times to repeat.
     */
    val repetitions: PositiveInteger?

    /**
     * When fulfillment sought.
     */
    val period: Period?

    /**
     * For whom is fulfillment sought?.
     */
    val recipient: kotlin.collections.List<Reference>?
}

/**
 * TaskRestriction
 *
 * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for the
 * request to be actioned), this element identifies any limitations on what parts of the referenced
 * request should be actioned.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Task">TaskRestriction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Task)
 */
@Serializable
@SerialName("TaskRestriction")
data class TaskRestriction(

    @SerialName("repetitions")
    override val repetitions: PositiveInteger? = null,

    @SerialName("period")
    override val period: Period? = null,

    @SerialName("recipient")
    override val recipient: kotlin.collections.List<Reference>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirTaskRestriction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "TaskRestriction"
    }
}
