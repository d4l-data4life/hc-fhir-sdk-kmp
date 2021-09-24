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

/**
 * FhirOrganization
 *
 * A formally or informally recognized grouping of people or organizations formed for the purpose of
 * achieving some form of collective action. Includes companies, institutions, corporations,
 * departments, community groups, healthcare practice groups, payer/insurer, etc.
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Organization">Organization</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Organization)
 */
interface FhirOrganization : FhirDomainResource {

    /**
     * Identifies this organization across multiple systems.
     */
    val identifier: kotlin.collections.List<Identifier>?

    /**
     * Whether the organization's record is still in active use.
     */
    val active: Bool?

    /**
     * Kind of organization.
     */
    val type: kotlin.collections.List<CodeableConcept>?

    /**
     * Name used for the organization.
     */
    val name: String?

    /**
     * A list of alternate names that the organization is known as, or was known as in
     * the past.
     */
    val alias: kotlin.collections.List<String>?

    /**
     * A contact detail for the organization.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * An address for the organization.
     */
    val address: kotlin.collections.List<Address>?

    /**
     * The organization of which this organization forms a part.
     */
    val partOf: Reference?

    /**
     * Contact for the organization for a certain purpose.
     */
    val contact: kotlin.collections.List<OrganizationContact>?

    /**
     * Technical endpoints providing access to services operated for the organization.
     */
    val endpoint: kotlin.collections.List<Reference>?
}

/**
 * Organization
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

    @SerialName("identifier")
    override val identifier: kotlin.collections.List<Identifier>? = null,

    @SerialName("active")
    override val active: Bool? = null,

    @SerialName("type")
    override val type: kotlin.collections.List<CodeableConcept>? = null,

    @SerialName("name")
    override val name: String? = null,

    @SerialName("alias")
    override val alias: kotlin.collections.List<String>? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("address")
    override val address: kotlin.collections.List<Address>? = null,

    @SerialName("partOf")
    override val partOf: Reference? = null,

    @SerialName("contact")
    override val contact: kotlin.collections.List<OrganizationContact>? = null,

    @SerialName("endpoint")
    override val endpoint: kotlin.collections.List<Reference>? = null,

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
) : FhirOrganization {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "Organization"
    }
}

/**
 * FhirOrganizationContact
 *
 * Contact for the organization for a certain purpose
 *
 * @see <a href="http://hl7.org/fhir/StructureDefinition/Organization">OrganizationContact</a>
 *
 * Generated from FHIR 4.0.1-9346c8cc45 (http://hl7.org/fhir/StructureDefinition/Organization)
 */
interface FhirOrganizationContact : FhirBackboneElement {

    /**
     * The type of contact.
     */
    val purpose: CodeableConcept?

    /**
     * A name associated with the contact.
     */
    val name: HumanName?

    /**
     * Contact details (telephone, email, etc.) for a contact.
     */
    val telecom: kotlin.collections.List<ContactPoint>?

    /**
     * Visiting or postal addresses for the contact.
     */
    val address: Address?
}

/**
 * OrganizationContact
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

    @SerialName("purpose")
    override val purpose: CodeableConcept? = null,

    @SerialName("name")
    override val name: HumanName? = null,

    @SerialName("telecom")
    override val telecom: kotlin.collections.List<ContactPoint>? = null,

    @SerialName("address")
    override val address: Address? = null,

    // # BackboneElement

    @SerialName("modifierExtension")
    override val modifierExtension: kotlin.collections.List<Extension>? = null,

    // # Element

    @SerialName("id")
    override val id: String? = null,

    @SerialName("extension")
    override val extension: kotlin.collections.List<Extension>? = null
) : FhirOrganizationContact {

    override val resourceType: String
        get() = resourceType()

    companion object {
        @JvmStatic
        fun resourceType(): String = "OrganizationContact"
    }
}
