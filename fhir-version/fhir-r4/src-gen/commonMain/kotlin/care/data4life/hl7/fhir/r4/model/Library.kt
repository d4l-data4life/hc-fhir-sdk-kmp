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
import kotlin.jvm.JvmStatic
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * FhirLibrary
 *
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used
 * to describe and expose existing knowledge assets such as logic libraries and information model
 * descriptions, as well as to describe a collection of knowledge assets.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Library">Library</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Library)
 */
interface FhirLibrary : FhirDomainResource {

    /**
     * Canonical identifier for this library, represented as a URI (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the library.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the library.
     */
    val version: String?

    /**
     * Name for this library (computer friendly).
     */
    val name: String?

    /**
     * Name for this library (human friendly).
     */
    val title: String?

    /**
     * Subordinate title of the library.
     */
    val subtitle: String?

    /**
     * The status of this library. Enables tracking the life-cycle of the content.
     */
    val status: PublicationStatus

    /**
     * For testing purposes, not real usage.
     */
    val experimental: Bool?

    /**
     * logic-library | model-definition | asset-collection | module-definition.
     */
    val type: CodeableConcept

    /**
     * Type of individual the library content is focused on.
     */
    val subjectCodeableConcept: CodeableConcept?

    /**
     * Type of individual the library content is focused on.
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
     * Natural language description of the library.
     */
    val description: String?

    /**
     * The context that the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for library (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * Why this library is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the library.
     */
    val usage: String?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * When the library was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the library was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the library is expected to be used.
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
     * Parameters defined by the library.
     */
    val parameter: kotlin.collections.List<ParameterDefinition>?

    /**
     * What data is referenced by this library.
     */
    val dataRequirement: kotlin.collections.List<DataRequirement>?

    /**
     * Contents of the library, either embedded or referenced.
     */
    val content: kotlin.collections.List<Attachment>?
}

/**
 * Library
 *
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be used
 * to describe and expose existing knowledge assets such as logic libraries and information model
 * descriptions, as well as to describe a collection of knowledge assets.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Library">Library</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Library)
 */
@Serializable
@SerialName("Library")
data class Library(

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

    @SerialName("type")
    override val type: CodeableConcept,

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

    @SerialName("parameter")
    override val parameter: kotlin.collections.List<ParameterDefinition>? = null,

    @SerialName("dataRequirement")
    override val dataRequirement: kotlin.collections.List<DataRequirement>? = null,

    @SerialName("content")
    override val content: kotlin.collections.List<Attachment>? = null,

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
) : FhirLibrary {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Library"
    }
}
