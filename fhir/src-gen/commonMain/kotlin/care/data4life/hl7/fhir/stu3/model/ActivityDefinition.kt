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

import care.data4life.hl7.fhir.stu3.codesystem.ActionParticipantType
import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.codesystem.ResourceType
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
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
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
interface FhirActivityDefinition : FhirDomainResource {

    /**
     * Logical URI to reference this activity definition (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the activity definition.
     */
    val identifier: List<Identifier>?

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
     * The status of this activity definition. Enables tracking the life-cycle of the
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
     * Natural language description of the activity definition.
     */
    val description: String?

    /**
     * Why this activity definition is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the asset.
     */
    val usage: String?

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
     * Context the content is intended to support.
     */
    val useContext: List<UsageContext>?

    /**
     * Intended jurisdiction for activity definition (if applicable).
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
     * Additional documentation, citations, etc.
     */
    val relatedArtifact: List<RelatedArtifact>?

    /**
     * Logic used by the asset.
     */
    val library: List<Reference>?

    /**
     * A description of the kind of resource the activity definition is representing.
     * For example, a MedicationRequest, a ProcedureRequest, or a CommunicationRequest.
     * Typically, but not always, this is a Request resource.
     */
    val kind: ResourceType?

    /**
     * Detail type of activity.
     */
    val code: CodeableConcept?

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
    val timingPeriod: Period?

    /**
     * When activity is to occur.
     */
    val timingRange: Range?

    /**
     * Where it should happen.
     */
    val location: Reference?

    /**
     * Who should participate in the action.
     */
    val participant: List<ActivityDefinitionParticipant>?

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
    val dosage: List<Dosage>?

    /**
     * What part of body to perform on.
     */
    val bodySite: List<CodeableConcept>?

    /**
     * Transform to apply the template.
     */
    val transform: Reference?

    /**
     * Dynamic aspects of the definition.
     */
    val dynamicValue: List<ActivityDefinitionDynamicValue>?
}

/**
 * ActivityDefinition
 *
 * SourceFileName: ActivityDefinition.kt
 *
 * This resource allows for the definition of some activity to be performed, independent of a
 * particular patient, practitioner, or other performance context.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
@Serializable
@SerialName("ActivityDefinition")
data class ActivityDefinition(

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

    @SerialName("kind")
    override val kind: ResourceType? = null,

    @SerialName("code")
    override val code: CodeableConcept? = null,

    @SerialName("timingTiming")
    override val timingTiming: Timing? = null,

    @SerialName("timingDateTime")
    override val timingDateTime: DateTime? = null,

    @SerialName("timingPeriod")
    override val timingPeriod: Period? = null,

    @SerialName("timingRange")
    override val timingRange: Range? = null,

    @SerialName("location")
    override val location: Reference? = null,

    @SerialName("participant")
    override val participant: List<ActivityDefinitionParticipant>? = null,

    @SerialName("productReference")
    override val productReference: Reference? = null,

    @SerialName("productCodeableConcept")
    override val productCodeableConcept: CodeableConcept? = null,

    @SerialName("quantity")
    override val quantity: Quantity? = null,

    @SerialName("dosage")
    override val dosage: List<Dosage>? = null,

    @SerialName("bodySite")
    override val bodySite: List<CodeableConcept>? = null,

    @SerialName("transform")
    override val transform: Reference? = null,

    @SerialName("dynamicValue")
    override val dynamicValue: List<ActivityDefinitionDynamicValue>? = null,

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
) : FhirActivityDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ActivityDefinition"
    }
}

/**
 * FhirActivityDefinitionDynamicValue
 *
 * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For
 * example, if the dosage of a medication must be computed based on the patient's weight, a dynamic
 * value would be used to specify an expression that calculated the weight, and the path on the intent
 * resource that would contain the result.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionDynamicValue</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
interface FhirActivityDefinitionDynamicValue : FhirBackboneElement {

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
 * ActivityDefinitionDynamicValue
 *
 * SourceFileName: ActivityDefinition.kt
 *
 * Dynamic values that will be evaluated to produce values for elements of the resulting resource. For
 * example, if the dosage of a medication must be computed based on the patient's weight, a dynamic
 * value would be used to specify an expression that calculated the weight, and the path on the intent
 * resource that would contain the result.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionDynamicValue</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
@Serializable
@SerialName("ActivityDefinitionDynamicValue")
data class ActivityDefinitionDynamicValue(

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
) : FhirActivityDefinitionDynamicValue {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ActivityDefinitionDynamicValue"
    }
}

/**
 * FhirActivityDefinitionParticipant
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
 */
interface FhirActivityDefinitionParticipant : FhirBackboneElement {

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
 * ActivityDefinitionParticipant
 *
 * SourceFileName: ActivityDefinition.kt
 *
 * Indicates who should participate in performing the action described.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ActivityDefinition">ActivityDefinitionParticipant</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ActivityDefinition)
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
    override val modifierExtension: List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirActivityDefinitionParticipant {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ActivityDefinitionParticipant"
    }
}
