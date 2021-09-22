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
import care.data4life.hl7.fhir.r4.primitive.Bool
import care.data4life.hl7.fhir.r4.primitive.Date
import care.data4life.hl7.fhir.r4.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirResearchDefinition
 *
 * The ResearchDefinition resource describes the conditional state (population and any exposures being
 * compared within the population) and outcome (if specified) that the knowledge (evidence, assertion,
 * recommendation) is about.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchDefinition">ResearchDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchDefinition)
 */
interface FhirResearchDefinition : FhirDomainResource {

    /**
     * Canonical identifier for this research definition, represented as a URI
     * (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the research definition.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the research definition.
     */
    val version: String?

    /**
     * Name for this research definition (computer friendly).
     */
    val name: String?

    /**
     * Name for this research definition (human friendly).
     */
    val title: String?

    /**
     * Title for use in informal contexts.
     */
    val shortTitle: String?

    /**
     * Subordinate title of the ResearchDefinition.
     */
    val subtitle: String?

    /**
     * The status of this research definition. Enables tracking the life-cycle of the
     * content.
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
     * Natural language description of the research definition.
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
     * Intended jurisdiction for research definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this research definition is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the ResearchDefinition.
     */
    val usage: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the research definition was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the research definition was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the research definition is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * The category of the ResearchDefinition, such as Education, Treatment,
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
     * Logic used by the ResearchDefinition.
     */
    val library: kotlin.collections.List<String>?

    /**
     * What population?.
     */
    val population: Reference

    /**
     * What exposure?.
     */
    val exposure: Reference?

    /**
     * What alternative exposure state?.
     */
    val exposureAlternative: Reference?

    /**
     * What outcome?.
     */
    val outcome: Reference?
}

/**
 * ResearchDefinition
 *
 * The ResearchDefinition resource describes the conditional state (population and any exposures being
 * compared within the population) and outcome (if specified) that the knowledge (evidence, assertion,
 * recommendation) is about.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ResearchDefinition">ResearchDefinition</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/ResearchDefinition)
 */
@Serializable
@SerialName("ResearchDefinition")
data class ResearchDefinition(

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

    @SerialName("population")
    override val population: Reference,

    @SerialName("exposure")
    override val exposure: Reference? = null,

    @SerialName("exposureAlternative")
    override val exposureAlternative: Reference? = null,

    @SerialName("outcome")
    override val outcome: Reference? = null,

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
) : FhirResearchDefinition {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "ResearchDefinition"
    }
}
