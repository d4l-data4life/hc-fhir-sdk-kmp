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

import care.data4life.hl7.fhir.stu3.codesystem.ActionCardinalityBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionConditionKind
import care.data4life.hl7.fhir.stu3.codesystem.ActionGroupingBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionParticipantType
import care.data4life.hl7.fhir.stu3.codesystem.ActionPrecheckBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionRelationshipType
import care.data4life.hl7.fhir.stu3.codesystem.ActionRequiredBehavior
import care.data4life.hl7.fhir.stu3.codesystem.ActionSelectionBehavior
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirPlanDefinition
 *
 * This resource allows for the definition of various types of plans as a sharable, consumable, and
 * executable artifact. The resource is general enough to support the description of a broad range of
 * clinical artifacts such as clinical decision support rules, order sets and protocols.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinition : FhirDomainResource {

    /**
     * Logical URI to reference this plan definition (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the plan definition.
     */
    val identifier: List<Identifier>?

    /**
     * Business version of the plan definition.
     */
    val version: String?

    /**
     * Name for this plan definition (computer friendly).
     */
    val name: String?

    /**
     * Name for this plan definition (human friendly).
     */
    val title: String?

    /**
     * order-set | protocol | eca-rule.
     */
    val type: CodeableConcept?

    /**
     * The status of this plan definition. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Date this was last changed.
     */
    val date: DateTime?

    /**
     * Name of the publisher (organization or individual).
     */
    val publisher: String?

    /**
     * Natural language description of the plan definition.
     */
    val description: String?

    /**
     * Why this plan definition is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the asset.
     */
    val usage: String?

    /**
     * When the plan definition was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the plan definition was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the plan definition is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * Context the content is intended to support.
     */
    val useContext: List<UsageContext>?

    /**
     * Intended jurisdiction for plan definition (if applicable).
     */
    val jurisdiction: List<CodeableConcept>?

    /**
     * E.g. Education, Treatment, Assessment, etc.
     */
    val topic: List<CodeableConcept>?

    /**
     * A content contributor.
     */
    val contributor: List<Contributor>?

    /**
     * Contact details for the publisher.
     */
    val contact: List<ContactDetail>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Related artifacts for the asset.
     */
    val relatedArtifact: List<RelatedArtifact>?

    /**
     * Logic used by the plan definition.
     */
    val library: List<Reference>?

    /**
     * What the plan is trying to accomplish.
     */
    val goal: List<PlanDefinitionGoal>?

    /**
     * Action defined by the plan.
     */
    val action: List<PlanDefinitionAction>?
}

/**
 * PlanDefinition
 *
 * SourceFileName: PlanDefinition.kt
 *
 * This resource allows for the definition of various types of plans as a sharable, consumable, and
 * executable artifact. The resource is general enough to support the description of a broad range of
 * clinical artifacts such as clinical decision support rules, order sets and protocols.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinition")
data class PlanDefinition(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("date")
    override val date: DateTime? = null,

    @SerialName("publisher")
    override val publisher: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("purpose")
    override val purpose: String? = null,

    @SerialName("usage")
    override val usage: String? = null,

    @SerialName("approvalDate")
    override val approvalDate: Date? = null,

    @SerialName("lastReviewDate")
    override val lastReviewDate: Date? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("useContext")
    override val useContext: List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: List<CodeableConcept>? = null,

    @SerialName("topic")
    override val topic: List<CodeableConcept>? = null,

    @SerialName("contributor")
    override val contributor: List<Contributor>? = null,

    @SerialName("contact")
    override val contact: List<ContactDetail>? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("relatedArtifact")
    override val relatedArtifact: List<RelatedArtifact>? = null,

    @SerialName("library")
    override val library: List<Reference>? = null,

    @SerialName("goal")
    override val goal: List<PlanDefinitionGoal>? = null,

    @SerialName("action")
    override val action: List<PlanDefinitionAction>? = null,

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
) : FhirPlanDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinition"
    }
}

/**
 * FhirPlanDefinitionAction
 *
 * An action to be taken as part of the plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionAction : FhirBackboneElement {

    /**
     * User-visible label for the action (e.g. 1. or A.).
     */
    val label: String?

    /**
     * User-visible title.
     */
    val title: String?

    /**
     * Short description of the action.
     */
    val description: String?

    /**
     * Static text equivalent of the action, used if the dynamic aspects cannot be
     * interpreted by the receiving system.
     */
    val textEquivalent: String?

    /**
     * Code representing the meaning of the action or sub-actions.
     */
    val code: List<CodeableConcept>?

    /**
     * Why the action should be performed.
     */
    val reason: List<CodeableConcept>?

    /**
     * Supporting documentation for the intended performer of the action.
     */
    val documentation: List<RelatedArtifact>?

    /**
     * What goals this action supports.
     */
    val goalId: List<String>?

    /**
     * When the action should be triggered.
     */
    val triggerDefinition: List<TriggerDefinition>?

    /**
     * Whether or not the action is applicable.
     */
    val condition: List<PlanDefinitionActionCondition>?

    /**
     * Input data requirements.
     */
    val input: List<DataRequirement>?

    /**
     * Output data definition.
     */
    val output: List<DataRequirement>?

    /**
     * Relationship to another action.
     */
    val relatedAction: List<PlanDefinitionActionRelatedAction>?

    /**
     * When the action should take place.
     */
    val timingDateTime: DateTime?

    /**
     * When the action should take place.
     */
    val timingPeriod: Period?

    /**
     * When the action should take place.
     */
    val timingDuration: Duration?

    /**
     * When the action should take place.
     */
    val timingRange: Range?

    /**
     * When the action should take place.
     */
    val timingTiming: Timing?

    /**
     * Who should participate in the action.
     */
    val participant: List<PlanDefinitionActionParticipant>?

    /**
     * create | update | remove | fire-event.
     */
    val type: Coding?

    /**
     * Defines the grouping behavior for the action and its children.
     */
    val groupingBehavior: ActionGroupingBehavior?

    /**
     * Defines the selection behavior for the action and its children.
     */
    val selectionBehavior: ActionSelectionBehavior?

    /**
     * Defines the requiredness behavior for the action.
     */
    val requiredBehavior: ActionRequiredBehavior?

    /**
     * Defines whether the action should usually be preselected.
     */
    val precheckBehavior: ActionPrecheckBehavior?

    /**
     * Defines whether the action can be selected multiple times.
     */
    val cardinalityBehavior: ActionCardinalityBehavior?

    /**
     * Description of the activity to be performed.
     */
    val definition: Reference?

    /**
     * Transform to apply the template.
     */
    val transform: Reference?

    /**
     * Dynamic aspects of the definition.
     */
    val dynamicValue: List<PlanDefinitionActionDynamicValue>?

    /**
     * A sub-action.
     */
    val action: List<PlanDefinitionAction>?
}

/**
 * PlanDefinitionAction
 *
 * SourceFileName: PlanDefinition.kt
 *
 * An action to be taken as part of the plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionAction")
data class PlanDefinitionAction(

    @SerialName("label")
    override val label: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("textEquivalent")
    override val textEquivalent: String? = null,

    @SerialName("code")
    override val code: List<CodeableConcept>? = null,

    @SerialName("reason")
    override val reason: List<CodeableConcept>? = null,

    @SerialName("documentation")
    override val documentation: List<RelatedArtifact>? = null,

    @SerialName("goalId")
    override val goalId: List<String>? = null,

    @SerialName("triggerDefinition")
    override val triggerDefinition: List<TriggerDefinition>? = null,

    @SerialName("condition")
    override val condition: List<PlanDefinitionActionCondition>? = null,

    @SerialName("input")
    override val input: List<DataRequirement>? = null,

    @SerialName("output")
    override val output: List<DataRequirement>? = null,

    @SerialName("relatedAction")
    override val relatedAction: List<PlanDefinitionActionRelatedAction>? = null,

    @SerialName("timingDateTime")
    override val timingDateTime: DateTime? = null,

    @SerialName("timingPeriod")
    override val timingPeriod: Period? = null,

    @SerialName("timingDuration")
    override val timingDuration: Duration? = null,

    @SerialName("timingRange")
    override val timingRange: Range? = null,

    @SerialName("timingTiming")
    override val timingTiming: Timing? = null,

    @SerialName("participant")
    override val participant: List<PlanDefinitionActionParticipant>? = null,

    @SerialName("type")
    override val type: Coding? = null,

    @SerialName("groupingBehavior")
    override val groupingBehavior: ActionGroupingBehavior? = null,

    @SerialName("selectionBehavior")
    override val selectionBehavior: ActionSelectionBehavior? = null,

    @SerialName("requiredBehavior")
    override val requiredBehavior: ActionRequiredBehavior? = null,

    @SerialName("precheckBehavior")
    override val precheckBehavior: ActionPrecheckBehavior? = null,

    @SerialName("cardinalityBehavior")
    override val cardinalityBehavior: ActionCardinalityBehavior? = null,

    @SerialName("definition")
    override val definition: Reference? = null,

    @SerialName("transform")
    override val transform: Reference? = null,

    @SerialName("dynamicValue")
    override val dynamicValue: List<PlanDefinitionActionDynamicValue>? = null,

    @SerialName("action")
    override val action: List<PlanDefinitionAction>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPlanDefinitionAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinitionAction"
    }
}

/**
 * FhirPlanDefinitionActionCondition
 *
 * An expression that describes applicability criteria, or start/stop conditions for the action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionCondition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionActionCondition : FhirBackboneElement {

    /**
     * The kind of condition.
     */
    val kind: ActionConditionKind

    /**
     * Natural language description of the condition.
     */
    val description: String?

    /**
     * Language of the expression.
     */
    val language: String?

    /**
     * Boolean-valued expression.
     */
    val expression: String?
}

/**
 * PlanDefinitionActionCondition
 *
 * SourceFileName: PlanDefinition.kt
 *
 * An expression that describes applicability criteria, or start/stop conditions for the action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionCondition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionActionCondition")
data class PlanDefinitionActionCondition(

    @SerialName("kind")
    override val kind: ActionConditionKind,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("language")
    override val language: String? = null,

    @SerialName("expression")
    override val expression: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPlanDefinitionActionCondition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinitionActionCondition"
    }
}

/**
 * FhirPlanDefinitionActionDynamicValue
 *
 * Customizations that should be applied to the statically defined resource. For example, if the dosage
 * of a medication must be computed based on the patient's weight, a customization would be used to
 * specify an expression that calculated the weight, and the path on the resource that would contain
 * the result.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionDynamicValue</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionActionDynamicValue : FhirBackboneElement {

    /**
     * Natural language description of the dynamic value.
     */
    val description: String?

    /**
     * The path to the element to be set dynamically.
     */
    val path: String?

    /**
     * Language of the expression.
     */
    val language: String?

    /**
     * An expression that provides the dynamic value for the customization.
     */
    val expression: String?
}

/**
 * PlanDefinitionActionDynamicValue
 *
 * SourceFileName: PlanDefinition.kt
 *
 * Customizations that should be applied to the statically defined resource. For example, if the dosage
 * of a medication must be computed based on the patient's weight, a customization would be used to
 * specify an expression that calculated the weight, and the path on the resource that would contain
 * the result.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionDynamicValue</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionActionDynamicValue")
data class PlanDefinitionActionDynamicValue(

    @SerialName("description")
    override val description: String? = null,

    @SerialName("path")
    override val path: String? = null,

    @SerialName("language")
    override val language: String? = null,

    @SerialName("expression")
    override val expression: String? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPlanDefinitionActionDynamicValue {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinitionActionDynamicValue"
    }
}

/**
 * FhirPlanDefinitionActionParticipant
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionActionParticipant : FhirBackboneElement {

    /**
     * The type of participant in the action.
     */
    val type: ActionParticipantType

    /**
     * E.g. Nurse, Surgeon, Parent, etc.
     */
    val role: CodeableConcept?
}

/**
 * PlanDefinitionActionParticipant
 *
 * SourceFileName: PlanDefinition.kt
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionActionParticipant")
data class PlanDefinitionActionParticipant(

    @SerialName("type")
    override val type: ActionParticipantType,

    @SerialName("role")
    override val role: CodeableConcept? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPlanDefinitionActionParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinitionActionParticipant"
    }
}

/**
 * FhirPlanDefinitionActionRelatedAction
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionRelatedAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionActionRelatedAction : FhirBackboneElement {

    /**
     * What action is this related to.
     */
    val actionId: String

    /**
     * The relationship of this action to the related action.
     */
    val relationship: ActionRelationshipType

    /**
     * Time offset for the relationship.
     */
    val offsetDuration: Duration?

    /**
     * Time offset for the relationship.
     */
    val offsetRange: Range?
}

/**
 * PlanDefinitionActionRelatedAction
 *
 * SourceFileName: PlanDefinition.kt
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionRelatedAction</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionActionRelatedAction")
data class PlanDefinitionActionRelatedAction(

    @SerialName("actionId")
    override val actionId: String,

    @SerialName("relationship")
    override val relationship: ActionRelationshipType,

    @SerialName("offsetDuration")
    override val offsetDuration: Duration? = null,

    @SerialName("offsetRange")
    override val offsetRange: Range? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPlanDefinitionActionRelatedAction {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinitionActionRelatedAction"
    }
}

/**
 * FhirPlanDefinitionGoal
 *
 * Goals that describe what the activities within the plan are intended to achieve. For example, weight
 * loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a
 * process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionGoal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionGoal : FhirBackboneElement {

    /**
     * E.g. Treatment, dietary, behavioral, etc.
     */
    val category: CodeableConcept?

    /**
     * Code or text describing the goal.
     */
    val description: CodeableConcept

    /**
     * high-priority | medium-priority | low-priority.
     */
    val priority: CodeableConcept?

    /**
     * When goal pursuit begins.
     */
    val start: CodeableConcept?

    /**
     * What does the goal address.
     */
    val addresses: List<CodeableConcept>?

    /**
     * Supporting documentation for the goal.
     */
    val documentation: List<RelatedArtifact>?

    /**
     * Target outcome for the goal.
     */
    val target: List<PlanDefinitionGoalTarget>?
}

/**
 * PlanDefinitionGoal
 *
 * SourceFileName: PlanDefinition.kt
 *
 * Goals that describe what the activities within the plan are intended to achieve. For example, weight
 * loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a
 * process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionGoal</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionGoal")
data class PlanDefinitionGoal(

    @SerialName("category")
    override val category: CodeableConcept? = null,

    @SerialName("description")
    override val description: CodeableConcept,

    @SerialName("priority")
    override val priority: CodeableConcept? = null,

    @SerialName("start")
    override val start: CodeableConcept? = null,

    @SerialName("addresses")
    override val addresses: List<CodeableConcept>? = null,

    @SerialName("documentation")
    override val documentation: List<RelatedArtifact>? = null,

    @SerialName("target")
    override val target: List<PlanDefinitionGoalTarget>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPlanDefinitionGoal {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinitionGoal"
    }
}

/**
 * FhirPlanDefinitionGoalTarget
 *
 * Indicates what should be done and within what timeframe.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionGoalTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionGoalTarget : FhirBackboneElement {

    /**
     * The parameter whose value is to be tracked.
     */
    val measure: CodeableConcept?

    /**
     * The target value to be achieved.
     */
    val detailQuantity: Quantity?

    /**
     * The target value to be achieved.
     */
    val detailRange: Range?

    /**
     * The target value to be achieved.
     */
    val detailCodeableConcept: CodeableConcept?

    /**
     * Reach goal within.
     */
    val due: Duration?
}

/**
 * PlanDefinitionGoalTarget
 *
 * SourceFileName: PlanDefinition.kt
 *
 * Indicates what should be done and within what timeframe.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionGoalTarget</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionGoalTarget")
data class PlanDefinitionGoalTarget(

    @SerialName("measure")
    override val measure: CodeableConcept? = null,

    @SerialName("detailQuantity")
    override val detailQuantity: Quantity? = null,

    @SerialName("detailRange")
    override val detailRange: Range? = null,

    @SerialName("detailCodeableConcept")
    override val detailCodeableConcept: CodeableConcept? = null,

    @SerialName("due")
    override val due: Duration? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirPlanDefinitionGoalTarget {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "PlanDefinitionGoalTarget"
    }
}
