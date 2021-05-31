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

import care.data4life.hl7.fhir.r4.codesystem.ActionParticipantType
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.RequestIntent
import care.data4life.hl7.fhir.r4.codesystem.RequestPriority
import care.data4life.hl7.fhir.r4.codesystem.RequestResourceType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirActivityDefinition
 *
 * This resource allows for the definition of some activity to be performed, independent of a
 * particular patient, practitioner, or other performance context.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
interface FhirActivityDefinition : FhirDomainResource {

    /**
     * Canonical identifier for this activity definition, represented as a URI
     * (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the activity definition.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the activity definition.
     */
    val version: String?

    /**
     * Name for this activity definition (computer friendly).
     */
    val name: String?

    /**
     * Name for this activity definition (human friendly).
     */
    val title: String?

    /**
     * Subordinate title of the activity definition.
     */
    val subtitle: String?

    /**
     * The status of this activity definition. Enables tracking the life-cycle of the
     * content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * Type of individual the activity definition is intended for.
     */
    val subjectCodeableConcept: CodeableConcept?

    /**
     * Type of individual the activity definition is intended for.
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
     * Natural language description of the activity definition.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for activity definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this activity definition is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the activity definition.
     */
    val usage: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the activity definition was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the activity definition was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the activity definition is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * E.g. Education, Treatment, Assessment, etc..
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
     * Additional documentation, citations, etc..
     */
    val relatedArtifact: kotlin.collections.List<RelatedArtifact>?

    /**
     * Logic used by the activity definition.
     */
    val library: kotlin.collections.List<String>?

    /**
     * A description of the kind of resource the activity definition is representing.
     * For example, a MedicationRequest, a ServiceRequest, or a CommunicationRequest.
     * Typically, but not always, this is a Request resource.
     */
    val kind: RequestResourceType?

    /**
     * What profile the resource needs to conform to.
     */
    val profile: String?

    /**
     * Detail type of activity.
     */
    val code: CodeableConcept?

    /**
     * Indicates the level of authority/intentionality associated with the activity and
     * where the request should fit into the workflow chain.
     */
    val intent: RequestIntent?

    /**
     * Indicates how quickly the activity should be addressed with respect to other
     * requests.
     */
    val priority: RequestPriority?

    /**
     * True if the activity should not be performed.
     */
    val doNotPerform: Bool?

    /**
     * When activity is to occur.
     */
    val timingTiming: Timing?

    /**
     * When activity is to occur.
     */
    val timingDateTime: DateTime?

    /**
     * When activity is to occur.
     */
    val timingAge: Age?

    /**
     * When activity is to occur.
     */
    val timingPeriod: Period?

    /**
     * When activity is to occur.
     */
    val timingRange: Range?

    /**
     * When activity is to occur.
     */
    val timingDuration: Duration?

    /**
     * Where it should happen.
     */
    val location: Reference?

    /**
     * Who should participate in the action.
     */
    val participant: kotlin.collections.List<ActivityDefinitionParticipant>?

    /**
     * What's administered/supplied.
     */
    val productReference: Reference?

    /**
     * What's administered/supplied.
     */
    val productCodeableConcept: CodeableConcept?

    /**
     * How much is administered/consumed/supplied.
     */
    val quantity: Quantity?

    /**
     * Detailed dosage instructions.
     */
    val dosage: kotlin.collections.List<Dosage>?

    /**
     * What part of body to perform on.
     */
    val bodySite: kotlin.collections.List<CodeableConcept>?

    /**
     * What specimens are required to perform this action.
     */
    val specimenRequirement: kotlin.collections.List<Reference>?

    /**
     * What observations are required to perform this action.
     */
    val observationRequirement: kotlin.collections.List<Reference>?

    /**
     * What observations must be produced by this action.
     */
    val observationResultRequirement: kotlin.collections.List<Reference>?

    /**
     * Transform to apply the template.
     */
    val transform: String?

    /**
     * Dynamic aspects of the definition.
     */
    val dynamicValue: kotlin.collections.List<ActivityDefinitionDynamicValue>?
}

/**
 * ActivityDefinition
 *
 * This resource allows for the definition of some activity to be performed, independent of a
 * particular patient, practitioner, or other performance context.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
@Serializable
@SerialName("ActivityDefinition")
data class ActivityDefinition(

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

    @SerialName("kind")
    override val kind: RequestResourceType? = null,

    @SerialName("profile")
    override val profile: String? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("intent")
    override val intent: RequestIntent? = null,

    @SerialName("priority")
    override val priority: RequestPriority? = null,

    @SerialName("doNotPerform")
    override val doNotPerform: Bool? = null,

    @SerialName("timingTiming")
    override val timingTiming: Timing? = null,

    @SerialName("timingDateTime")
    override val timingDateTime: DateTime? = null,

    @SerialName("timingAge")
    override val timingAge: Age? = null,

    @SerialName("timingPeriod")
    override val timingPeriod: Period? = null,

    @SerialName("timingRange")
    override val timingRange: Range? = null,

    @SerialName("timingDuration")
    override val timingDuration: Duration? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("participant")
    override val participant: kotlin.collections.List<ActivityDefinitionParticipant>? = null,

    @SerialName("productReference")
    override val productReference: Reference? = null,

    @SerialName("productCodeableConcept")
    override val productCodeableConcept: CodeableConcept? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("dosage")
    override val dosage: kotlin.collections.List<Dosage>? = null,

    @SerialName("bodySite")
    override val bodySite: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("specimenRequirement")
    override val specimenRequirement: kotlin.collections.List<Reference>? = null,

    @SerialName("observationRequirement")
    override val observationRequirement: kotlin.collections.List<Reference>? = null,

    @SerialName("observationResultRequirement")
    override val observationResultRequirement: kotlin.collections.List<Reference>? = null,

    @SerialName("transform")
    override val transform: String? = null,

    @SerialName("dynamicValue")
    override val dynamicValue: kotlin.collections.List<ActivityDefinitionDynamicValue>? = null,

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
) : FhirActivityDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ActivityDefinition"
    }
}

/**
 * FhirActivityDefinitionDynamicValue
 *
 * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For
 * example, if the dosage of a medication must be computed based on the patient's weight, a dynamic
 * value would be used to specify an expression that calculated the weight, and the path on the request
 * resource that would contain the result.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionDynamicValue</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
interface FhirActivityDefinitionDynamicValue : FhirBackboneElement {

    /**
     * The path to the element to be set dynamically.
     */
    val path: String

    /**
     * An expression that provides the dynamic value for the customization.
     */
    val expression: Expression
}

/**
 * ActivityDefinitionDynamicValue
 *
 * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For
 * example, if the dosage of a medication must be computed based on the patient's weight, a dynamic
 * value would be used to specify an expression that calculated the weight, and the path on the request
 * resource that would contain the result.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionDynamicValue</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
@Serializable
@SerialName("ActivityDefinitionDynamicValue")
data class ActivityDefinitionDynamicValue(

    @SerialName("path")
    override val path: String,

    @SerialName("expression")
    override val expression: Expression,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirActivityDefinitionDynamicValue {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ActivityDefinitionDynamicValue"
    }
}

/**
 * FhirActivityDefinitionParticipant
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
interface FhirActivityDefinitionParticipant : FhirBackboneElement {

    /**
     * The type of participant in the action.
     */
    val type: ActionParticipantType

    /**
     * E.g. Nurse, Surgeon, Parent, etc..
     */
    val role: CodeableConcept?
}

/**
 * ActivityDefinitionParticipant
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionParticipant</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
@Serializable
@SerialName("ActivityDefinitionParticipant")
data class ActivityDefinitionParticipant(

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
) : FhirActivityDefinitionParticipant {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ActivityDefinitionParticipant"
    }
}
