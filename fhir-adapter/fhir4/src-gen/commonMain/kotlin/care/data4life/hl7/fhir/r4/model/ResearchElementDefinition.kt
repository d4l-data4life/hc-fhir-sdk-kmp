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

import care.data4life.hl7.fhir.r4.codesystem.EvidenceVariableType
import care.data4life.hl7.fhir.r4.codesystem.GroupMeasure
import care.data4life.hl7.fhir.r4.codesystem.PublicationStatus
import care.data4life.hl7.fhir.r4.codesystem.ResearchElementType
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirResearchElementDefinition
 *
 * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence,
 * assertion, recommendation) is about.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition">ResearchElementDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition)
 */
interface FhirResearchElementDefinition : FhirDomainResource {

    /**
     * Canonical identifier for this research element definition, represented as a URI
     * (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the research element definition.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the research element definition.
     */
    val version: String?

    /**
     * Name for this research element definition (computer friendly).
     */
    val name: String?

    /**
     * Name for this research element definition (human friendly).
     */
    val title: String?

    /**
     * Title for use in informal contexts.
     */
    val shortTitle: String?

    /**
     * Subordinate title of the ResearchElementDefinition.
     */
    val subtitle: String?

    /**
     * The status of this research element definition. Enables tracking the life-cycle
     * of the content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
     */
    val subjectCodeableConcept: CodeableConcept?

    /**
     * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device.
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
     * Natural language description of the research element definition.
     */
    val description: String?

    /**
     * Used for footnotes or explanatory notes.
     */
    val comment: kotlin.collections.List<String>?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for research element definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this research element definition is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the ResearchElementDefinition.
     */
    val usage: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the research element definition was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the research element definition was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the research element definition is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * The category of the ResearchElementDefinition, such as Education, Treatment,
     * Assessment, etc..
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
     * Logic used by the ResearchElementDefinition.
     */
    val library: kotlin.collections.List<String>?

    /**
     * The type of research element, a population, an exposure, or an outcome.
     */
    val type: ResearchElementType

    /**
     * The type of the outcome (e.g. Dichotomous, Continuous, or Descriptive).
     */
    val variableType: EvidenceVariableType?

    /**
     * What defines the members of the research element.
     */
    val characteristic: kotlin.collections.List<ResearchElementDefinitionCharacteristic>
}

/**
 * ResearchElementDefinition
 *
 * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence,
 * assertion, recommendation) is about.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition">ResearchElementDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition)
 */
@Serializable
@SerialName("ResearchElementDefinition")
data class ResearchElementDefinition(

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

    @SerialName("shortTitle")
    override val shortTitle: String? = null,

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

    @SerialName("comment")
    override val comment: kotlin.collections.List<String>? = null,

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

    @SerialName("type")
    override val type: ResearchElementType,

    @SerialName("variableType")
    override val variableType: EvidenceVariableType? = null,

    @SerialName("characteristic")
    override val characteristic: kotlin.collections.List<ResearchElementDefinitionCharacteristic>,

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
) : FhirResearchElementDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ResearchElementDefinition"
    }
}

/**
 * FhirResearchElementDefinitionCharacteristic
 *
 * A characteristic that defines the members of the research element. Multiple characteristics are
 * applied with "and" semantics.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition">ResearchElementDefinitionCharacteristic</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition)
 */
interface FhirResearchElementDefinitionCharacteristic : FhirBackboneElement {

    /**
     * What code or expression defines members?.
     */
    val definitionCodeableConcept: CodeableConcept?

    /**
     * What code or expression defines members?.
     */
    val definitionCanonical: String?

    /**
     * What code or expression defines members?.
     */
    val definitionExpression: Expression?

    /**
     * What code or expression defines members?.
     */
    val definitionDataRequirement: DataRequirement?

    /**
     * What code/value pairs define members?.
     */
    val usageContext: kotlin.collections.List<UsageContext>?

    /**
     * Whether the characteristic includes or excludes members.
     */
    val exclude: Bool?

    /**
     * What unit is the outcome described in?.
     */
    val unitOfMeasure: CodeableConcept?

    /**
     * What time period does the study cover.
     */
    val studyEffectiveDescription: String?

    /**
     * What time period does the study cover.
     */
    val studyEffectiveDateTime: DateTime?

    /**
     * What time period does the study cover.
     */
    val studyEffectivePeriod: Period?

    /**
     * What time period does the study cover.
     */
    val studyEffectiveDuration: Duration?

    /**
     * What time period does the study cover.
     */
    val studyEffectiveTiming: Timing?

    /**
     * Observation time from study start.
     */
    val studyEffectiveTimeFromStart: Duration?

    /**
     * Indicates how elements are aggregated within the study effective period.
     */
    val studyEffectiveGroupMeasure: GroupMeasure?

    /**
     * What time period do participants cover.
     */
    val participantEffectiveDescription: String?

    /**
     * What time period do participants cover.
     */
    val participantEffectiveDateTime: DateTime?

    /**
     * What time period do participants cover.
     */
    val participantEffectivePeriod: Period?

    /**
     * What time period do participants cover.
     */
    val participantEffectiveDuration: Duration?

    /**
     * What time period do participants cover.
     */
    val participantEffectiveTiming: Timing?

    /**
     * Observation time from study start.
     */
    val participantEffectiveTimeFromStart: Duration?

    /**
     * Indicates how elements are aggregated within the study effective period.
     */
    val participantEffectiveGroupMeasure: GroupMeasure?
}

/**
 * ResearchElementDefinitionCharacteristic
 *
 * A characteristic that defines the members of the research element. Multiple characteristics are
 * applied with "and" semantics.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition">ResearchElementDefinitionCharacteristic</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchElementDefinition)
 */
@Serializable
@SerialName("ResearchElementDefinitionCharacteristic")
data class ResearchElementDefinitionCharacteristic(

    @SerialName("definitionCodeableConcept")
    override val definitionCodeableConcept: CodeableConcept? = null,

    @SerialName("definitionCanonical")
    override val definitionCanonical: String? = null,

    @SerialName("definitionExpression")
    override val definitionExpression: Expression? = null,

    @SerialName("definitionDataRequirement")
    override val definitionDataRequirement: DataRequirement? = null,

    @SerialName("usageContext")
    override val usageContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("exclude")
    override val exclude: Bool? = null,

    @SerialName("unitOfMeasure")
    override val unitOfMeasure: CodeableConcept? = null,

    @SerialName("studyEffectiveDescription")
    override val studyEffectiveDescription: String? = null,

    @SerialName("studyEffectiveDateTime")
    override val studyEffectiveDateTime: DateTime? = null,

    @SerialName("studyEffectivePeriod")
    override val studyEffectivePeriod: Period? = null,

    @SerialName("studyEffectiveDuration")
    override val studyEffectiveDuration: Duration? = null,

    @SerialName("studyEffectiveTiming")
    override val studyEffectiveTiming: Timing? = null,

    @SerialName("studyEffectiveTimeFromStart")
    override val studyEffectiveTimeFromStart: Duration? = null,

    @SerialName("studyEffectiveGroupMeasure")
    override val studyEffectiveGroupMeasure: GroupMeasure? = null,

    @SerialName("participantEffectiveDescription")
    override val participantEffectiveDescription: String? = null,

    @SerialName("participantEffectiveDateTime")
    override val participantEffectiveDateTime: DateTime? = null,

    @SerialName("participantEffectivePeriod")
    override val participantEffectivePeriod: Period? = null,

    @SerialName("participantEffectiveDuration")
    override val participantEffectiveDuration: Duration? = null,

    @SerialName("participantEffectiveTiming")
    override val participantEffectiveTiming: Timing? = null,

    @SerialName("participantEffectiveTimeFromStart")
    override val participantEffectiveTimeFromStart: Duration? = null,

    @SerialName("participantEffectiveGroupMeasure")
    override val participantEffectiveGroupMeasure: GroupMeasure? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirResearchElementDefinitionCharacteristic {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ResearchElementDefinitionCharacteristic"
    }
}
