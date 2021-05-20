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
import care.data4life.hl7.fhir.r4.codesystem.ActionPrecheckBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionRelationshipType
import care.data4life.hl7.fhir.r4.codesystem.ActionRequiredBehavior
import care.data4life.hl7.fhir.r4.codesystem.ActionSelectionBehavior
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestStatus
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirRequestGroup
 *
 * A group of related requests that can be used to capture intended activities that have inter-
 * dependencies such as "give this medication after that one".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
interface FhirRequestGroup : FhirDomainResource {

    /**
     * Business identifier.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Instantiates FHIR protocol or definition.
     */
    val instantiatesCanonical: kotlin.collections.List<String>?

    /**
     * Instantiates external protocol or definition.
     */
    val instantiatesUri: kotlin.collections.List<String>?

    /**
     * Fulfills plan, proposal, or order.
     */
    val basedOn: kotlin.collections.List<Reference>?

    /**
     * Request(s) replaced by this request.
     */
    val replaces: kotlin.collections.List<Reference>?

    /**
     * Composite request this is part of.
     */
    val groupIdentifier: Identifier?

    /**
     * The current state of the request. For request groups, the status reflects the
     * status of all the requests in the group.
     */
    val status: RequestStatus

    /**
     * Indicates the level of authority/intentionality associated with the request and
     * where the request fits into the workflow chain.
     */
    val intent: RequestIntent

    /**
     * Indicates how quickly the request should be addressed with respect to other
     * requests.
     */
    val priority: RequestPriority?

    /**
     * What's being requested/ordered.
     */
    val code: CodeableConcept?

    /**
     * Who the request group is about.
     */
    val subject: Reference?

    /**
     * Created as part of.
     */
    val encounter: Reference?

    /**
     * When the request group was authored.
     */
    val authoredOn: DateTime?

    /**
     * Device or practitioner that authored the request group.
     */
    val author: Reference?

    /**
     * Why the request group is needed.
     */
    val reasonCode: kotlin.collections.List<CodeableConcept>?

    /**
     * Why the request group is needed.
     */
    val reasonReference: kotlin.collections.List<Reference>?

    /**
     * Additional notes about the response.
     */
    val note: kotlin.collections.List<Annotation>?

    /**
     * Proposed actions, if any.
     */
    val action: kotlin.collections.List<RequestGroupAction>?
}

/**
 * RequestGroup
 *
 * A group of related requests that can be used to capture intended activities that have inter-
 * dependencies such as "give this medication after that one".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroup</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
@Serializable
@SerialName("RequestGroup")
data class RequestGroup(

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("instantiatesCanonical")
    override val instantiatesCanonical: kotlin.collections.List<String>? = null,

    @SerialName("instantiatesUri")
    override val instantiatesUri: kotlin.collections.List<String>? = null,

    @SerialName("basedOn")
    override val basedOn: kotlin.collections.List<Reference>? = null,

    @SerialName("replaces")
    override val replaces: kotlin.collections.List<Reference>? = null,

    @SerialName("groupIdentifier")
    override val groupIdentifier: Identifier? = null,

    @SerialName("status")
    override val status: RequestStatus,

    @SerialName("intent")
    override val intent: RequestIntent,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("subject")
    override val subject: Reference? = null,

    @SerialName("encounter")
    override val encounter: Reference? = null,

    @SerialName("authoredOn")
    override val authoredOn: DateTime? = null,

    @SerialName("author")
    override val author: Reference? = null,

    @SerialName("reasonCode")
    override val reasonCode: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("reasonReference")
    override val reasonReference: kotlin.collections.List<Reference>? = null,

    @SerialName("note")
    override val note: kotlin.collections.List<Annotation>? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<RequestGroupAction>? = null,

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
) : FhirRequestGroup {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RequestGroup"
    }
}

/**
 * FhirRequestGroupAction
 *
 * The actions, if any, produced by the evaluation of the artifact.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroupAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
interface FhirRequestGroupAction : FhirBackboneElement {

    /**
     * User-visible prefix for the action (e.g. 1. or A.).
     */
    val prefix: String?

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
     * Indicates how quickly the action should be addressed with respect to other
     * actions.
     */
    val priority: RequestPriority?

    /**
     * Code representing the meaning of the action or sub-actions.
     */
    val code: kotlin.collections.List<CodeableConcept>?

    /**
     * Supporting documentation for the intended performer of the action.
     */
    val documentation: kotlin.collections.List<RelatedArtifact>?

    /**
     * Whether or not the action is applicable.
     */
    val condition: kotlin.collections.List<RequestGroupActionCondition>?

    /**
     * Relationship to another action.
     */
    val relatedAction: kotlin.collections.List<RequestGroupActionRelatedAction>?

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
     * Who should perform the action.
     */
    val participant: kotlin.collections.List<Reference>?

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
     * Defines expectations around whether an action is required.
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
     * The target of the action.
     */
    val resource: Reference?

    /**
     * Sub action.
     */
    val action: kotlin.collections.List<RequestGroupAction>?
}

/**
 * RequestGroupAction
 *
 * The actions, if any, produced by the evaluation of the artifact.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroupAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
@Serializable
@SerialName("RequestGroupAction")
data class RequestGroupAction(

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

    @SerialName("documentation")
    override val documentation: kotlin.collections.List<RelatedArtifact>? = null,

    @SerialName("condition")
    override val condition: kotlin.collections.List<RequestGroupActionCondition>? = null,

    @SerialName("relatedAction")
    override val relatedAction: kotlin.collections.List<RequestGroupActionRelatedAction>? = null,

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
    override val participant: kotlin.collections.List<Reference>? = null,

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

    @SerialName("resource")
    override val resource: Reference? = null,

    @SerialName("action")
    override val action: kotlin.collections.List<RequestGroupAction>? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirRequestGroupAction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RequestGroupAction"
    }
}

/**
 * FhirRequestGroupActionCondition
 *
 * An expression that describes applicability criteria, or start/stop conditions for the action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroupActionCondition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
interface FhirRequestGroupActionCondition : FhirBackboneElement {

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
 * RequestGroupActionCondition
 *
 * An expression that describes applicability criteria, or start/stop conditions for the action.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroupActionCondition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
@Serializable
@SerialName("RequestGroupActionCondition")
data class RequestGroupActionCondition(

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
) : FhirRequestGroupActionCondition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RequestGroupActionCondition"
    }
}

/**
 * FhirRequestGroupActionRelatedAction
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroupActionRelatedAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
interface FhirRequestGroupActionRelatedAction : FhirBackboneElement {

    /**
     * What action this is related to.
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
 * RequestGroupActionRelatedAction
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/RequestGroup">RequestGroupActionRelatedAction</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/RequestGroup)
 */
@Serializable
@SerialName("RequestGroupActionRelatedAction")
data class RequestGroupActionRelatedAction(

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
) : FhirRequestGroupActionRelatedAction {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "RequestGroupActionRelatedAction"
    }
}
