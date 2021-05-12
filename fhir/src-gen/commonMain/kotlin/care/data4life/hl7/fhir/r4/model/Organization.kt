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

import care.data4life.hl7.fhir.r4.primitive.Bool
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmStatic

interface FhirOrganization : FhirDomainResource {

    // Identifies this organization  across multiple systems.
    val identifier: List<Identifier>?

    // Whether the organization's record is still in active use.
    val active: Bool?

    // Kind of organization.
    val type: List<CodeableConcept>?

    // Name used for the organization.
    val name: String?

    // A list of alternate names that the organization is known as, or was known as in the past.
    val alias: List<String>?

    // A contact detail for the organization.
    val telecom: List<ContactPoint>?

    // An address for the organization.
    val address: List<Address>?

    // The organization of which this organization forms a part.
    val partOf: Reference?

    // Contact for the organization for a certain purpose.
    val contact: List<OrganizationContact>?

    // Technical endpoints providing access to services operated for the organization.
    val endpoint: List<Reference>?
}

/**
 * ClassName: Organization
 *
 * SourceFileName: Organization.kt
 *
 * A formally or informally recognized grouping of people or organizations formed for the purpose of
 * achieving some form of collective action. Includes companies, institutions, corporations,
 * departments, community groups, healthcare practice groups, payer/insurer, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Organization">Organization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Organization)
 */
@Serializable
@SerialName("Organization")
data class Organization(

    // Identifies this organization  across multiple systems.
    @SerialName("identifier")
    override val identifier: List<Identifier>? = null,

    // Whether the organization's record is still in active use.
    @SerialName("active")
    override val active: Bool? = null,

    // Kind of organization.
    @SerialName("type")
    override val type: List<CodeableConcept>? = null,

    // Name used for the organization.
    @SerialName("name")
    override val name: String? = null,

    // A list of alternate names that the organization is known as, or was known as in the past.
    @SerialName("alias")
    override val alias: List<String>? = null,

    // A contact detail for the organization.
    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    // An address for the organization.
    @SerialName("address")
    override val address: List<Address>? = null,

    // The organization of which this organization forms a part.
    @SerialName("partOf")
    override val partOf: Reference? = null,

    // Contact for the organization for a certain purpose.
    @SerialName("contact")
    override val contact: List<OrganizationContact>? = null,

    // Technical endpoints providing access to services operated for the organization.
    @SerialName("endpoint")
    override val endpoint: List<Reference>? = null,

    // # DomainResource

    // Text summary of the resource, for human interpretation.
    @SerialName("text")
    override val text: Narrative? = null,

    // Contained, inline Resources.
    @SerialName("contained")
    override val contained: List<FhirResource>? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null,

    // Extensions that cannot be ignored.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Resource

    // Logical id of this artifact.
    @SerialName("id")
    override val id: String? = null,

    // Metadata about the resource.
    @SerialName("meta")
    override val meta: Meta? = null,

    // A set of rules under which this content was created.
    @SerialName("implicitRules")
    override val implicitRules: String? = null,

    // Language of the resource content.
    @SerialName("language")
    override val language: String? = null
) : FhirOrganization {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "Organization"
    }
}

interface FhirOrganizationContact : FhirBackboneElement {

    // The type of contact.
    val purpose: CodeableConcept?

    // A name associated with the contact.
    val name: HumanName?

    // Contact details (telephone, email, etc.)  for a contact.
    val telecom: List<ContactPoint>?

    // Visiting or postal addresses for the contact.
    val address: Address?
}

/**
 * ClassName: OrganizationContact
 *
 * SourceFileName: Organization.kt
 *
 * Contact for the organization for a certain purpose
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Organization">OrganizationContact</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Organization)
 */
@Serializable
@SerialName("OrganizationContact")
data class OrganizationContact(

    // The type of contact.
    @SerialName("purpose")
    override val purpose: CodeableConcept? = null,

    // A name associated with the contact.
    @SerialName("name")
    override val name: HumanName? = null,

    // Contact details (telephone, email, etc.)  for a contact.
    @SerialName("telecom")
    override val telecom: List<ContactPoint>? = null,

    // Visiting or postal addresses for the contact.
    @SerialName("address")
    override val address: Address? = null,

    // # BackboneElement

    // Extensions that cannot be ignored even if unrecognized.
    @SerialName("modifierExtension")
    override val modifierExtension: List<Extension>? = null,

    // # Element

    // Unique id for inter-element referencing.
    @SerialName("id")
    override val id: String? = null,

    // Additional content defined by implementations.
    @SerialName("extension")
    override val extension: List<Extension>? = null
) : FhirOrganizationContact {

    override val resourceType: kotlin.String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): kotlin.String = "OrganizationContact"
    }
}
