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

import care.data4life.hl7.fhir.stu3.codesystem.PublicationStatus
import care.data4life.hl7.fhir.stu3.primitive.Bool
import care.data4life.hl7.fhir.stu3.primitive.Date
import care.data4life.hl7.fhir.stu3.primitive.DateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

/**
 * FhirServiceDefinition
 *
 * The ServiceDefinition describes a unit of decision support functionality that is made available as a
 * service, such as immunization modules or drug-drug interaction checking.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ServiceDefinition">ServiceDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ServiceDefinition)
 */
interface FhirServiceDefinition : FhirDomainResource {

    /**
     * Logical URI to reference this service definition (globally unique).
     */
    val url: String?

    /**
     * Additional identifier for the service definition.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Business version of the service definition.
     */
    val version: String?

    /**
     * Name for this service definition (computer friendly).
     */
    val name: String?

    /**
     * Name for this service definition (human friendly).
     */
    val title: String?

    /**
     * The status of this service definition. Enables tracking the life-cycle of the
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
     * Natural language description of the service definition.
     */
    val description: String?

    /**
     * Why this service definition is defined.
     */
    val purpose: String?

    /**
     * Describes the clinical usage of the module.
     */
    val usage: String?

    /**
     * When the service definition was approved by publisher.
     */
    val approvalDate: Date?

    /**
     * When the service definition was last reviewed.
     */
    val lastReviewDate: Date?

    /**
     * When the service definition is expected to be used.
     */
    val effectivePeriod: Period?

    /**
     * Context the content is intended to support.
     */
    val useContext: kotlin.collections.List<UsageContext>?

    /**
     * Intended jurisdiction for service definition (if applicable).
     */
    val jurisdiction: kotlin.collections.List<CodeableConcept>?

    /**
     * E.g. Education, Treatment, Assessment, etc.
     */
    val topic: kotlin.collections.List<CodeableConcept>?

    /**
     * A content contributor.
     */
    val contributor: kotlin.collections.List<Contributor>?

    /**
     * Contact details for the publisher.
     */
    val contact: kotlin.collections.List<ContactDetail>?

    /**
     * Use and/or publishing restrictions.
     */
    val copyright: String?

    /**
     * Additional documentation, citations, etc.
     */
    val relatedArtifact: kotlin.collections.List<RelatedArtifact>?

    /**
     * "when" the module should be invoked.
     */
    val trigger: kotlin.collections.List<TriggerDefinition>?

    /**
     * What data is used by the module.
     */
    val dataRequirement: kotlin.collections.List<DataRequirement>?

    /**
     * Operation to invoke.
     */
    val operationDefinition: Reference?
}

/**
 * ServiceDefinition
 *
 * The ServiceDefinition describes a unit of decision support functionality that is made available as a
 * service, such as immunization modules or drug-drug interaction checking.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/ServiceDefinition">ServiceDefinition</a>
 *
 * Generated from FHIR 3.0.1.11917 (http://hl7.org/fhir/StructureDefinition/ServiceDefinition)
 */
@Serializable
@SerialName("ServiceDefinition")
data class ServiceDefinition(

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
    override val useContext: kotlin.collections.List<UsageContext>? = null,

    @SerialName("jurisdiction")
    override val jurisdiction: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("topic")
    override val topic: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("contributor")
    override val contributor: kotlin.collections.List<Contributor>? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<ContactDetail>? = null,

    @SerialName("copyright")
    override val copyright: String? = null,

    @SerialName("relatedArtifact")
    override val relatedArtifact: kotlin.collections.List<RelatedArtifact>? = null,

    @SerialName("trigger")
    override val trigger: kotlin.collections.List<TriggerDefinition>? = null,

    @SerialName("dataRequirement")
    override val dataRequirement: kotlin.collections.List<DataRequirement>? = null,

    @SerialName("operationDefinition")
    override val operationDefinition: Reference? = null,

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
) : FhirServiceDefinition {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "ServiceDefinition"
    }
}
