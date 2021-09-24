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

import care.data4life.hl7.fhir.r4.codesystem.ActionCardinalityBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionConditionKind
import care.data4life.hl7.fhir.r4.codesystem.ActionGroupingBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionParticipantType
import care.data4life.hl7.fhir.r4.codesystem.ActionPrecheckBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionRelationshipType
import care.data4life.hl7.fhir.r4.codesystem.ActionRequiredBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionSelectionBehavior
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinition : FhirDomainResource {

    /**
     * Canonical identifier for this plan definition, represented as a URI (globally
     * unique).
     */
    val url: String?

    /**
     * Additional identifier for the plan definition.
     */
    val identifier: kotlin.collections.List<Identifier>?

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
     * Subordinate title of the plan definition.
     */
    val subtitle: String?

    /**
     * order-set | clinical-protocol | eca-rule | workflow-definition.
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
     * Type of individual the plan definition is focused on.
     */
    val subjectCodeableConcept: CodeableConcept?

    /**
     * Type of individual the plan definition is focused on.
     */
    val subjectReference: Reference?

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
     * Natural language description of the plan definition.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for plan definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this plan definition is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the plan.
     */
    val usage: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

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
     * E.g. Education, Treatment, Assessment.
     */
    val topic: kotlin.collections.List<CodeableConcept>?

    /**
     * Who authored the content.
     */
    val author: kotlin.collections.List<ContactDetail>?

    /**
     * Who edited the content.
     */
    val editor: kotlin.collections.List<ContactDetail>?

    /**
     * Who reviewed the content.
     */
    val reviewer: kotlin.collections.List<ContactDetail>?

    /**
     * Who endorsed the content.
     */
    val endorser: kotlin.collections.List<ContactDetail>?

    /**
     * Additional documentation, citations.
     */
    val relatedArtifact: kotlin.collections.List<RelatedArtifact>?

    /**
     * Logic used by the plan definition.
     */
    val library: kotlin.collections.List<String>?

    /**
     * What the plan is trying to accomplish.
     */
    val goal: kotlin.collections.List<PlanDefinitionGoal>?

    /**
     * Action defined by the plan.
     */
    val action: kotlin.collections.List<PlanDefinitionAction>?
}

/**
 * PlanDefinition
 *
 * This resource allows for the definition of various types of plans as a sharable, consumable, and
 * executable artifact. The resource is general enough to support the description of a broad range of
 * clinical artifacts such as clinical decision support rules, order sets and protocols.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinition")
data class PlanDefinition(

    @SerialName("url")
    override val url: String? = null,

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("version")
    override val version: String? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("subtitle")
    override val subtitle: String? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

    @SerialName("status")
    override val status: PublicationStatus,

    @SerialName("experimental")
    override val experimental: Bool? = null,

    @SerialName("subjectCodeableConcept")
    override val subjectCodeableConcept: CodeableConcept? = null,

    @SerialName("subjectReference")
    override val subjectReference: Reference? = null,

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

    @SerialName("usage")
    override val usage: String? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("approvalDate")
    override val approvalDate: Date? = null,

    @SerialName("lastReviewDate")
    override val lastReviewDate: Date? = null,

    @SerialName("effectivePeriod")
    override val effectivePeriod: Period? = null,

    @SerialName("topic")
    override val topic: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("author")
    override val author: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("editor")
    override val editor: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("reviewer")
    override val reviewer: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("endorser")
    override val endorser: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("relatedArtifact")
    override val relatedArtifact: kotlin.collections.List<RelatedArtifact>? = null,

    @SerialName("library")
    override val library: kotlin.collections.List<String>? = null,

    @SerialName("goal")
    override val goal: kotlin.collections.List<PlanDefinitionGoal>? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<PlanDefinitionAction>? = null,

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
) : FhirPlanDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinition"
    }
}

/**
 * FhirPlanDefinitionAction
 *
 * An action or group of actions to be taken as part of the plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionAction : FhirBackboneElement {

    /**
     * User-visible prefix for the action (e.g. 1. or A.).
     */
    val prefix: String?

    /**
     * User-visible title.
     */
    val title: String?

    /**
     * Brief description of the action.
     */
    val description: String?

    /**
     * Static text equivalent of the action, used if the dynamic aspects cannot be
     * interpreted by the receiving system.
     */
    val textEquivalent: String?

    /**
     * Indicates how quickly the action should be addressed with respect to other
     * actions.
     */
    val priority: RequestPriority?

    /**
     * Code representing the meaning of the action or sub-actions.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Why the action should be performed.
     */
    val reason: kotlin.collections.List<CodeableConcept>?

    /**
     * Supporting documentation for the intended performer of the action.
     */
    val documentation: kotlin.collections.List<RelatedArtifact>?

    /**
     * What goals this action supports.
     */
    val goalId: kotlin.collections.List<String>?

    /**
     * Type of individual the action is focused on.
     */
    val subjectCodeableConcept: CodeableConcept?

    /**
     * Type of individual the action is focused on.
     */
    val subjectReference: Reference?

    /**
     * When the action should be triggered.
     */
    val trigger: kotlin.collections.List<TriggerDefinition>?

    /**
     * Whether or not the action is applicable.
     */
    val condition: kotlin.collections.List<PlanDefinitionActionCondition>?

    /**
     * Input data requirements.
     */
    val input: kotlin.collections.List<DataRequirement>?

    /**
     * Output data definition.
     */
    val output: kotlin.collections.List<DataRequirement>?

    /**
     * Relationship to another action.
     */
    val relatedAction: kotlin.collections.List<PlanDefinitionActionRelatedAction>?

    /**
     * When the action should take place.
     */
    val timingDateTime: DateTime?

    /**
     * When the action should take place.
     */
    val timingAge: Age?

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
    val participant: kotlin.collections.List<PlanDefinitionActionParticipant>?

    /**
     * create | update | remove | fire-event.
     */
    val type: CodeableConcept?

    /**
     * Defines the grouping behavior for the action and its children.
     */
    val groupingBehavior: ActionGroupingBehavior?

    /**
     * Defines the selection behavior for the action and its children.
     */
    val selectionBehavior: ActionSelectionBehavior?

    /**
     * Defines the required behavior for the action.
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
    val definitionCanonical: String?

    /**
     * Description of the activity to be performed.
     */
    val definitionUri: String?

    /**
     * Transform to apply the template.
     */
    val transform: String?

    /**
     * Dynamic aspects of the definition.
     */
    val dynamicValue: kotlin.collections.List<PlanDefinitionActionDynamicValue>?

    /**
     * A sub-action.
     */
    val action: kotlin.collections.List<PlanDefinitionAction>?
}

/**
 * PlanDefinitionAction
 *
 * An action or group of actions to be taken as part of the plan.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionAction")
data class PlanDefinitionAction(

    @SerialName("prefix")
    override val prefix: String? = null,

    @SerialName("title")
    override val title: String? = null,

    @SerialName("description")
    override val description: String? = null,

    @SerialName("textEquivalent")
    override val textEquivalent: String? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("code")
    override val code: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reason")
    override val reason: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("documentation")
    override val documentation: kotlin.collections.List<RelatedArtifact>? = null,

    @SerialName("goalId")
    override val goalId: kotlin.collections.List<String>? = null,

    @SerialName("subjectCodeableConcept")
    override val subjectCodeableConcept: CodeableConcept? = null,

    @SerialName("subjectReference")
    override val subjectReference: Reference? = null,

    @SerialName("trigger")
    override val trigger: kotlin.collections.List<TriggerDefinition>? = null,

    @SerialName("condition")
    override val condition: kotlin.collections.List<PlanDefinitionActionCondition>? = null,

    @SerialName("input")
    override val input: kotlin.collections.List<DataRequirement>? = null,

    @SerialName("output")
    override val output: kotlin.collections.List<DataRequirement>? = null,

    @SerialName("relatedAction")
    override val relatedAction: kotlin.collections.List<PlanDefinitionActionRelatedAction>? = null,

    @SerialName("timingDateTime")
    override val timingDateTime: DateTime? = null,

    @SerialName("timingAge")
    override val timingAge: Age? = null,

    @SerialName("timingPeriod")
    override val timingPeriod: Period? = null,

    @SerialName("timingDuration")
    override val timingDuration: Duration? = null,

    @SerialName("timingRange")
    override val timingRange: Range? = null,

    @SerialName("timingTiming")
    override val timingTiming: Timing? = null,

    @SerialName("participant")
    override val participant: kotlin.collections.List<PlanDefinitionActionParticipant>? = null,

    @SerialName("type")
    override val type: CodeableConcept? = null,

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

    @SerialName("definitionCanonical")
    override val definitionCanonical: String? = null,

    @SerialName("definitionUri")
    override val definitionUri: String? = null,

    @SerialName("transform")
    override val transform: String? = null,

    @SerialName("dynamicValue")
    override val dynamicValue: kotlin.collections.List<PlanDefinitionActionDynamicValue>? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<PlanDefinitionAction>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPlanDefinitionAction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinitionAction"
    }
}

/**
 * FhirPlanDefinitionActionCondition
 *
 * An expression that describes applicability criteria or start/stop conditions for the action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionCondition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionActionCondition : FhirBackboneElement {

    /**
     * The kind of condition.
     */
    val kind: ActionConditionKind

    /**
     * Boolean-valued expression.
     */
    val expression: Expression?
}

/**
 * PlanDefinitionActionCondition
 *
 * An expression that describes applicability criteria or start/stop conditions for the action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionCondition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionActionCondition")
data class PlanDefinitionActionCondition(

    @SerialName("kind")
    override val kind: ActionConditionKind,

    @SerialName("expression")
    override val expression: Expression? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPlanDefinitionActionCondition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinitionActionCondition"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionActionDynamicValue : FhirBackboneElement {

    /**
     * The path to the element to be set dynamically.
     */
    val path: String?

    /**
     * An expression that provides the dynamic value for the customization.
     */
    val expression: Expression?
}

/**
 * PlanDefinitionActionDynamicValue
 *
 * Customizations that should be applied to the statically defined resource. For example, if the dosage
 * of a medication must be computed based on the patient's weight, a customization would be used to
 * specify an expression that calculated the weight, and the path on the resource that would contain
 * the result.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionDynamicValue</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
@Serializable
@SerialName("PlanDefinitionActionDynamicValue")
data class PlanDefinitionActionDynamicValue(

    @SerialName("path")
    override val path: String? = null,

    @SerialName("expression")
    override val expression: Expression? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPlanDefinitionActionDynamicValue {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinitionActionDynamicValue"
    }
}

/**
 * FhirPlanDefinitionActionParticipant
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionActionParticipant : FhirBackboneElement {

    /**
     * The type of participant in the action.
     */
    val type: ActionParticipantType

    /**
     * E.g. Nurse, Surgeon, Parent.
     */
    val role: CodeableConcept?
}

/**
 * PlanDefinitionActionParticipant
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPlanDefinitionActionParticipant {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinitionActionParticipant"
    }
}

/**
 * FhirPlanDefinitionActionRelatedAction
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionRelatedAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
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
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionActionRelatedAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPlanDefinitionActionRelatedAction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinitionActionRelatedAction"
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
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
 */
interface FhirPlanDefinitionGoal : FhirBackboneElement {

    /**
     * E.g. Treatment, dietary, behavioral.
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
    val addresses: kotlin.collections.List<CodeableConcept>?

    /**
     * Supporting documentation for the goal.
     */
    val documentation: kotlin.collections.List<RelatedArtifact>?

    /**
     * Target outcome for the goal.
     */
    val target: kotlin.collections.List<PlanDefinitionGoalTarget>?
}

/**
 * PlanDefinitionGoal
 *
 * Goals that describe what the activities within the plan are intended to achieve. For example, weight
 * loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a
 * process improvement objective, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionGoal</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
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
    override val addresses: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("documentation")
    override val documentation: kotlin.collections.List<RelatedArtifact>? = null,

    @SerialName("target")
    override val target: kotlin.collections.List<PlanDefinitionGoalTarget>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPlanDefinitionGoal {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinitionGoal"
    }
}

/**
 * FhirPlanDefinitionGoalTarget
 *
 * Indicates what should be done and within what timeframe.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionGoalTarget</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
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
 * Indicates what should be done and within what timeframe.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/PlanDefinition">PlanDefinitionGoalTarget</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/PlanDefinition)
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
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirPlanDefinitionGoalTarget {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "PlanDefinitionGoalTarget"
    }
}
